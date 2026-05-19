package com.wxstore.league.headsupplier.model.sharer.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageResponse;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetBindShopPromoterListResponse extends SharerPageResponse {

    @JsonProperty("promoter_list")
    private List<ShopPromoterInfo> promoterList;

    public List<ShopPromoterInfo> getPromoterList() {
        return promoterList;
    }

    public void setPromoterList(List<ShopPromoterInfo> promoterList) {
        this.promoterList = promoterList;
    }
}
