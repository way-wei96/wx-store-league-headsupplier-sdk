package com.wxstore.league.headsupplier.model.sharer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

/** 推客接口通用分页响应字段。 */
public class SharerPageResponse extends WxApiResponse {

    @JsonProperty("next_key")
    private String nextKey;

    @JsonProperty("has_more")
    private Boolean hasMore;

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
