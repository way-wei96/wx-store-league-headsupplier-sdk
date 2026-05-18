package com.wxstore.league.headsupplier.model.headsupplier;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetShopListRequest {

    @JsonProperty("page_size")
    private int pageSize;

    @JsonProperty("next_key")
    private String nextKey;

    public static GetShopListRequest of(int pageSize) {
        GetShopListRequest req = new GetShopListRequest();
        req.pageSize = pageSize;
        return req;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getNextKey() {
        return nextKey;
    }

    public void setNextKey(String nextKey) {
        this.nextKey = nextKey;
    }
}
