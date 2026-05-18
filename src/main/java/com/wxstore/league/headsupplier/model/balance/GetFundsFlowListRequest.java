package com.wxstore.league.headsupplier.model.balance;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetFundsFlowListRequest {

    private Integer page;

    @JsonProperty("page_size")
    private Integer pageSize;

    @JsonProperty("next_key")
    private String nextKey;

    @JsonProperty("start_time")
    private Long startTime;

    @JsonProperty("end_time")
    private Long endTime;

    @JsonProperty("funds_type")
    private Integer fundsType;

    public static GetFundsFlowListRequest of(int pageSize) {
        GetFundsFlowListRequest request = new GetFundsFlowListRequest();
        request.pageSize = pageSize;
        return request;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getNextKey() {
        return nextKey;
    }

    public void setNextKey(String nextKey) {
        this.nextKey = nextKey;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Integer getFundsType() {
        return fundsType;
    }

    public void setFundsType(Integer fundsType) {
        this.fundsType = fundsType;
    }
}
