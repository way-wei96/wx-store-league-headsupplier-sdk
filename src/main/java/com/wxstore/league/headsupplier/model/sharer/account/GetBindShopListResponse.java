package com.wxstore.league.headsupplier.model.sharer.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageResponse;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetBindShopListResponse extends SharerPageResponse {

    @JsonProperty("shop_list")
    private List<BindShopInfo> shopList;

    public List<BindShopInfo> getShopList() {
        return shopList;
    }

    public void setShopList(List<BindShopInfo> shopList) {
        this.shopList = shopList;
    }
}
