package com.wxstore.league.headsupplier.http;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wxstore.league.headsupplier.config.WxLeagueHeadSupplierConfig;
import com.wxstore.league.headsupplier.exception.WxLeagueApiException;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;
import com.wxstore.league.headsupplier.token.AccessTokenService;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * 统一 HTTP 调用：自动附加 access_token、JSON 序列化与错误码校验。
 */
public final class ApiExecutor {

    private final WxLeagueHeadSupplierConfig config;
    private final ObjectMapper objectMapper;
    private final AccessTokenService accessTokenService;

    public ApiExecutor(
            WxLeagueHeadSupplierConfig config,
            ObjectMapper objectMapper,
            AccessTokenService accessTokenService) {
        this.config = config;
        this.objectMapper = objectMapper;
        this.accessTokenService = accessTokenService;
    }

    public <T> T get(String path, Map<String, String> query, Class<T> responseType) {
        return exchange("GET", path, query, null, responseType, false);
    }

    public <T> T post(String path, Object body, Class<T> responseType) {
        return exchange("POST", path, Map.of(), body, responseType, true);
    }

    public <T> T postWithoutToken(String path, Object body, Class<T> responseType) {
        return exchange("POST", path, Map.of(), body, responseType, false);
    }

    private <T> T exchange(
            String method,
            String path,
            Map<String, String> query,
            Object body,
            Class<T> responseType,
            boolean withToken) {
        try {
            Map<String, String> params = new LinkedHashMap<>(query);
            if (withToken) {
                params.put("access_token", accessTokenService.getAccessToken());
            }
            String url = buildUrl(path, params);
            HttpRequest.Builder builder = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .timeout(config.getReadTimeout());

            if ("POST".equals(method)) {
                String json = body == null ? "{}" : objectMapper.writeValueAsString(body);
                builder.header("Content-Type", "application/json; charset=utf-8")
                        .POST(HttpRequest.BodyPublishers.ofString(json));
            } else {
                builder.GET();
            }

            HttpResponse<String> response = config.getHttpClient()
                    .send(builder.build(), HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));

            if (response.statusCode() < 200 || response.statusCode() >= 300) {
                throw new WxLeagueApiException(
                        "HTTP " + response.statusCode() + ": " + response.body(), null);
            }

            T result = objectMapper.readValue(response.body(), responseType);
            if (result instanceof WxApiResponse) {
                WxApiResponse wxResponse = (WxApiResponse) result;
                if (!wxResponse.isSuccess()) {
                    Integer errcode = wxResponse.getErrcode();
                    throw new WxLeagueApiException(errcode != null ? errcode : -1, wxResponse.getErrmsg());
                }
            }
            return result;
        } catch (WxLeagueApiException e) {
            throw e;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new WxLeagueApiException("Request failed: " + path, e);
        } catch (IOException e) {
            throw new WxLeagueApiException("Request failed: " + path, e);
        }
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    private String buildUrl(String path, Map<String, String> query) {
        String base = config.getBaseUrl();
        if (!base.endsWith("/") && !path.startsWith("/")) {
            base = base + "/";
        } else if (base.endsWith("/") && path.startsWith("/")) {
            path = path.substring(1);
        }
        String fullPath = base + path;
        if (query.isEmpty()) {
            return fullPath;
        }
        StringJoiner joiner = new StringJoiner("&", fullPath + "?", "");
        query.forEach((k, v) -> {
            if (v != null) {
                joiner.add(encode(k) + "=" + encode(v));
            }
        });
        return joiner.toString();
    }

    private static String encode(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8);
    }

    public static JavaType type(ObjectMapper mapper, Class<?> raw, Class<?>... params) {
        return mapper.getTypeFactory().constructParametricType(raw, params);
    }

    public static <T> TypeReference<T> ref() {
        return new TypeReference<>() {};
    }
}
