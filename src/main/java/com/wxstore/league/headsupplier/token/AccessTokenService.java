package com.wxstore.league.headsupplier.token;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wxstore.league.headsupplier.config.WxLeagueHeadSupplierConfig;
import com.wxstore.league.headsupplier.exception.WxLeagueApiException;
import com.wxstore.league.headsupplier.model.basic.AccessTokenResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Access Token 获取与内存缓存（提前 5 分钟刷新）。
 */
public final class AccessTokenService {

    private static final long REFRESH_BUFFER_SECONDS = 300;

    private final WxLeagueHeadSupplierConfig config;
    private final ObjectMapper objectMapper;
    private final ReentrantLock lock = new ReentrantLock();

    private volatile String cachedToken;
    private volatile Instant expiresAt = Instant.EPOCH;

    public AccessTokenService(WxLeagueHeadSupplierConfig config, ObjectMapper objectMapper) {
        this.config = config;
        this.objectMapper = objectMapper;
    }

    public String getAccessToken() {
        if (cachedToken != null && Instant.now().isBefore(expiresAt)) {
            return cachedToken;
        }
        lock.lock();
        try {
            if (cachedToken != null && Instant.now().isBefore(expiresAt)) {
                return cachedToken;
            }
            String url = config.getBaseUrl()
                    + "/cgi-bin/token?grant_type=client_credential"
                    + "&appid=" + encode(config.getAppId())
                    + "&secret=" + encode(config.getAppSecret());
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .timeout(config.getReadTimeout())
                    .GET()
                    .build();
            HttpResponse<String> response = config.getHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
            AccessTokenResponse tokenResponse =
                    objectMapper.readValue(response.body(), AccessTokenResponse.class);
            if (!tokenResponse.isSuccess() && tokenResponse.getAccessToken() == null) {
                throw new WxLeagueApiException(
                        tokenResponse.getErrcode() != null ? tokenResponse.getErrcode() : -1,
                        tokenResponse.getErrmsg());
            }
            cachedToken = tokenResponse.getAccessToken();
            long ttl = tokenResponse.getExpiresIn() != null ? tokenResponse.getExpiresIn() : 7200;
            expiresAt = Instant.now().plusSeconds(Math.max(60, ttl - REFRESH_BUFFER_SECONDS));
            return cachedToken;
        } catch (WxLeagueApiException e) {
            throw e;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new WxLeagueApiException("Failed to fetch access_token", e);
        } catch (IOException e) {
            throw new WxLeagueApiException("Failed to fetch access_token", e);
        } finally {
            lock.unlock();
        }
    }

    public void invalidate() {
        lock.lock();
        try {
            cachedToken = null;
            expiresAt = Instant.EPOCH;
        } finally {
            lock.unlock();
        }
    }

    private static String encode(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8);
    }
}
