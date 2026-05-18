package com.wxstore.league.headsupplier.model.basic;

public class ClearQuotaRequest {

    private String appid;

    public static ClearQuotaRequest of(String appid) {
        ClearQuotaRequest request = new ClearQuotaRequest();
        request.appid = appid;
        return request;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }
}
