package com.wxstore.league.headsupplier.model.sharer.live;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageResponse;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SharerLiveListResponse extends SharerPageResponse {

    @JsonProperty("live_record_list")
    private List<LiveRecordInfo> liveRecordList;

    @JsonProperty("live_notice_record_list")
    private List<LiveNoticeRecordInfo> liveNoticeRecordList;

    @JsonProperty("product_list")
    private List<LiveCommissionProductInfo> productList;

    public List<LiveRecordInfo> getLiveRecordList() {
        return liveRecordList;
    }

    public void setLiveRecordList(List<LiveRecordInfo> liveRecordList) {
        this.liveRecordList = liveRecordList;
    }

    public List<LiveNoticeRecordInfo> getLiveNoticeRecordList() {
        return liveNoticeRecordList;
    }

    public void setLiveNoticeRecordList(List<LiveNoticeRecordInfo> liveNoticeRecordList) {
        this.liveNoticeRecordList = liveNoticeRecordList;
    }

    public List<LiveCommissionProductInfo> getProductList() {
        return productList;
    }

    public void setProductList(List<LiveCommissionProductInfo> productList) {
        this.productList = productList;
    }
}
