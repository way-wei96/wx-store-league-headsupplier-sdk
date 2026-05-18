package com.wxstore.league.headsupplier.model.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CommissionTimeRange {

    @JsonProperty("start_time")
    private Long startTime;

    @JsonProperty("end_time")
    private Long endTime;

    public static CommissionTimeRange of(long startTime, long endTime) {
        CommissionTimeRange range = new CommissionTimeRange();
        range.startTime = startTime;
        range.endTime = endTime;
        return range;
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
}
