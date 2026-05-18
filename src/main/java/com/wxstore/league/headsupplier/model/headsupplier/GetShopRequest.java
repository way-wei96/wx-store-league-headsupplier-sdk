package com.wxstore.league.headsupplier.model.headsupplier;

public class GetShopRequest {

    private String appid;

    public static GetShopRequest of(String appid) {
        GetShopRequest request = new GetShopRequest();
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
