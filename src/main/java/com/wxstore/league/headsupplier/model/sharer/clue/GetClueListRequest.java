package com.wxstore.league.headsupplier.model.sharer.clue;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageRequest;

public class GetClueListRequest extends SharerPageRequest {

    @JsonProperty("appid")
    private String appid;

    @JsonProperty("sharer_appid")
    private String sharerAppid;

    @JsonProperty("create_time_range")
    private TimeRange createTimeRange;

    public static GetClueListRequest of(String nextKey, int pageSize) {
        GetClueListRequest request = new GetClueListRequest();
        request.setNextKey(nextKey);
        request.setPageSize(pageSize);
        return request;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSharerAppid() {
        return sharerAppid;
    }

    public void setSharerAppid(String sharerAppid) {
        this.sharerAppid = sharerAppid;
    }

    public TimeRange getCreateTimeRange() {
        return createTimeRange;
    }

    public void setCreateTimeRange(TimeRange createTimeRange) {
        this.createTimeRange = createTimeRange;
    }

    public static class TimeRange {

        @JsonProperty("start_time")
        private Long startTime;

        @JsonProperty("end_time")
        private Long endTime;

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
}
