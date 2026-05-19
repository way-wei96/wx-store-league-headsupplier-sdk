package com.wxstore.league.headsupplier.model.sharer;

import com.fasterxml.jackson.annotation.JsonProperty;

/** 推客接口通用分页请求字段。 */
public class SharerPageRequest {

    @JsonProperty("next_key")
    private String nextKey;

    @JsonProperty("page_size")
    private Integer pageSize;

    public String getNextKey() {
        return nextKey;
    }

    public void setNextKey(String nextKey) {
        this.nextKey = nextKey;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
