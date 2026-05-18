package com.wxstore.league.headsupplier.model.balance;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetFundsFlowListResponse extends WxApiResponse {

    @JsonProperty("flow_ids")
    private List<String> flowIds;

    @JsonProperty("has_more")
    private Boolean hasMore;

    @JsonProperty("next_key")
    private String nextKey;

    public List<String> getFlowIds() {
        return flowIds;
    }

    public void setFlowIds(List<String> flowIds) {
        this.flowIds = flowIds;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public String getNextKey() {
        return nextKey;
    }

    public void setNextKey(String nextKey) {
        this.nextKey = nextKey;
    }
}
