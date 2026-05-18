package com.wxstore.league.headsupplier.model.shop;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetSubscribeProductListRequest {

    private SubscribeProductFilter filter;

    @JsonProperty("page_size")
    private int pageSize;

    @JsonProperty("next_key")
    private String nextKey;

    @JsonProperty("need_total_num")
    private Boolean needTotalNum;

    public static GetSubscribeProductListRequest of(int pageSize) {
        GetSubscribeProductListRequest request = new GetSubscribeProductListRequest();
        request.pageSize = pageSize;
        return request;
    }

    public SubscribeProductFilter getFilter() {
        return filter;
    }

    public void setFilter(SubscribeProductFilter filter) {
        this.filter = filter;
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

    public Boolean getNeedTotalNum() {
        return needTotalNum;
    }

    public void setNeedTotalNum(Boolean needTotalNum) {
        this.needTotalNum = needTotalNum;
    }
}
