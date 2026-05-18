package com.wxstore.league.headsupplier.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetOrderListResponse extends WxApiResponse {

    private List<CommissionOrderListItem> list;

    @JsonProperty("next_key")
    private String nextKey;

    @JsonProperty("has_more")
    private Boolean hasMore;

    public List<CommissionOrderListItem> getList() {
        return list;
    }

    public void setList(List<CommissionOrderListItem> list) {
        this.list = list;
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
}
