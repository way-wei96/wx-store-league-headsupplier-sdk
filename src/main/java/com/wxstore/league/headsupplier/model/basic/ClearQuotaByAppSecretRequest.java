package com.wxstore.league.headsupplier.model.basic;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClearQuotaByAppSecretRequest {

    private String appid;

    @JsonProperty("appsecret")
    private String appSecret;

    public static ClearQuotaByAppSecretRequest of(String appid, String appSecret) {
        ClearQuotaByAppSecretRequest request = new ClearQuotaByAppSecretRequest();
        request.appid = appid;
        request.appSecret = appSecret;
        return request;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }
}
