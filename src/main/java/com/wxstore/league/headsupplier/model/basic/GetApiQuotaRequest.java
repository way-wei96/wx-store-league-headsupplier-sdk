package com.wxstore.league.headsupplier.model.basic;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetApiQuotaRequest {

    @JsonProperty("cgi_path")
    private String cgiPath;

    public static GetApiQuotaRequest of(String cgiPath) {
        GetApiQuotaRequest request = new GetApiQuotaRequest();
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
