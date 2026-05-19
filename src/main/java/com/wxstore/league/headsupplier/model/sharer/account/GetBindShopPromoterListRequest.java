package com.wxstore.league.headsupplier.model.sharer.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageRequest;

public class GetBindShopPromoterListRequest extends SharerPageRequest {

    @JsonProperty("shop_appid")
    private String shopAppid;

    public static GetBindShopPromoterListRequest of(String shopAppid, String nextKey, int pageSize) {
        GetBindShopPromoterListRequest request = new GetBindShopPromoterListRequest();
        request.shopAppid = shopAppid;
        request.setNextKey(nextKey);
        request.setPageSize(pageSize);
        return request;
    }

    public String getShopAppid() {
        return shopAppid;
    }

    public void setShopAppid(String shopAppid) {
        this.shopAppid = shopAppid;
    }
}
