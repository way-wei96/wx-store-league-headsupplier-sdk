package com.wxstore.league.headsupplier.model.headsupplier;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetShopLockTimeRequest {

    @JsonProperty("shop_appid")
    private String shopAppid;

    public static GetShopLockTimeRequest of(String shopAppid) {
        GetShopLockTimeRequest request = new GetShopLockTimeRequest();
        request.shopAppid = shopAppid;
        return request;
    }

    public String getShopAppid() {
        return shopAppid;
    }

    public void setShopAppid(String shopAppid) {
        this.shopAppid = shopAppid;
    }
}
