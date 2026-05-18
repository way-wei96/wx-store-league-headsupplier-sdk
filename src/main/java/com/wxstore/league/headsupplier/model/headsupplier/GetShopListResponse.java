package com.wxstore.league.headsupplier.model.headsupplier;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetShopListResponse extends WxApiResponse {

    @JsonProperty("shop_list")
    private List<ShopInfo> shopList;

    @JsonProperty("next_key")
    private String nextKey;

    @JsonProperty("has_more")
    private Boolean hasMore;

    public List<ShopInfo> getShopList() {
        return shopList;
    }

    public void setShopList(List<ShopInfo> shopList) {
        this.shopList = shopList;
    }

    public String getNextKey() {
        return nextKey;
    }

    public void setNextKey(String nextKey) {
        this.nextKey = nextKey;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ShopInfo {

        @JsonProperty("base_info")
        private ShopBaseInfo baseInfo;

        @JsonProperty("status")
        private Integer status;

        public ShopBaseInfo getBaseInfo() {
            return baseInfo;
        }

        public void setBaseInfo(ShopBaseInfo baseInfo) {
            this.baseInfo = baseInfo;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }
    }
}
