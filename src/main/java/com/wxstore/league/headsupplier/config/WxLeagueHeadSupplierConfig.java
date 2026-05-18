package com.wxstore.league.headsupplier.config;

import java.net.http.HttpClient;
import java.time.Duration;
import java.util.Objects;

/**
 * SDK 配置。
 */
public final class WxLeagueHeadSupplierConfig {

    public static final String DEFAULT_BASE_URL = "https://api.weixin.qq.com";

    private final String appId;
    private final String appSecret;
    private final String baseUrl;
    private final Duration connectTimeout;
    private final Duration readTimeout;
    private final HttpClient httpClient;

    private WxLeagueHeadSupplierConfig(Builder builder) {
        this.appId = Objects.requireNonNull(builder.appId, "appId");
        this.appSecret = Objects.requireNonNull(builder.appSecret, "appSecret");
        this.baseUrl = builder.baseUrl;
        this.connectTimeout = builder.connectTimeout;
        this.readTimeout = builder.readTimeout;
        this.httpClient = builder.httpClient != null
                ? builder.httpClient
                : HttpClient.newBuilder()
                        .connectTimeout(builder.connectTimeout)
                        .build();
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAppId() {
        return appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public Duration getConnectTimeout() {
        return connectTimeout;
    }

    public Duration getReadTimeout() {
        return readTimeout;
    }

    public HttpClient getHttpClient() {
        return httpClient;
    }

    public static final class Builder {
        private String appId;
        private String appSecret;
        private String baseUrl = DEFAULT_BASE_URL;
        private Duration connectTimeout = Duration.ofSeconds(10);
        private Duration readTimeout = Duration.ofSeconds(30);
        private HttpClient httpClient;

        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        public Builder appSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }

        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Builder connectTimeout(Duration connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }

        public Builder readTimeout(Duration readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        public Builder httpClient(HttpClient httpClient) {
            this.httpClient = httpClient;
            return this;
        }

        public WxLeagueHeadSupplierConfig build() {
            return new WxLeagueHeadSupplierConfig(this);
        }
    }
}
