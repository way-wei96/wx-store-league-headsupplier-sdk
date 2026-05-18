package com.wxstore.league.headsupplier.model.basic;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClearApiQuotaRequest {

    @JsonProperty("cgi_path")
    private String cgiPath;

    public static ClearApiQuotaRequest of(String cgiPath) {
        ClearApiQuotaRequest request = new ClearApiQuotaRequest();
        request.cgiPath = cgiPath;
        return request;
    }

    public String getCgiPath() {
        return cgiPath;
    }

    public void setCgiPath(String cgiPath) {
        this.cgiPath = cgiPath;
    }
}
