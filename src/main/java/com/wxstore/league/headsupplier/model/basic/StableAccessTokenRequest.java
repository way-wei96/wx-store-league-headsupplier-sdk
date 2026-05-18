package com.wxstore.league.headsupplier.model.basic;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StableAccessTokenRequest {

    @JsonProperty("grant_type")
    private String grantType = "client_credential";

    @JsonProperty("appid")
    private String appid;

    @JsonProperty("secret")
    private String secret;

    @JsonProperty("force_refresh")
    private Boolean forceRefresh;

    public static StableAccessTokenRequest of(String appid, String secret) {
        StableAccessTokenRequest req = new StableAccessTokenRequest();
        req.appid = appid;
        req.secret = secret;
        return req;
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Boolean getForceRefresh() {
        return forceRefresh;
    }

    public void setForceRefresh(Boolean forceRefresh) {
        this.forceRefresh = forceRefresh;
    }
}
