package com.wxstore.league.headsupplier.model.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetOrderListRequest {

    private String appid;

    @JsonProperty("finder_id")
    private String finderId;

    @JsonProperty("page_size")
    private int pageSize;

    @JsonProperty("next_key")
    private String nextKey;

    @JsonProperty("create_time_range")
    private CommissionTimeRange createTimeRange;

    @JsonProperty("update_time_range")
    private CommissionTimeRange updateTimeRange;

    @JsonProperty("order_id")
    private String orderId;

    private String openfinderid;

    @JsonProperty("sharer_appid")
    private String sharerAppid;

    public static GetOrderListRequest of(int pageSize) {
        GetOrderListRequest request = new GetOrderListRequest();
        request.pageSize = pageSize;
        return request;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getFinderId() {
        return finderId;
    }

    public void setFinderId(String finderId) {
        this.finderId = finderId;
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

    public CommissionTimeRange getCreateTimeRange() {
        return createTimeRange;
    }

    public void setCreateTimeRange(CommissionTimeRange createTimeRange) {
        this.createTimeRange = createTimeRange;
    }

    public CommissionTimeRange getUpdateTimeRange() {
        return updateTimeRange;
    }

    public void setUpdateTimeRange(CommissionTimeRange updateTimeRange) {
        this.updateTimeRange = updateTimeRange;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOpenfinderid() {
        return openfinderid;
    }

    public void setOpenfinderid(String openfinderid) {
        this.openfinderid = openfinderid;
    }

    public String getSharerAppid() {
        return sharerAppid;
    }

    public void setSharerAppid(String sharerAppid) {
        this.sharerAppid = sharerAppid;
    }
}
