package com.wxstore.league.headsupplier.model.sharer.video;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

/**
 * @deprecated 请使用 {@link GetFeedPromotionInfoResponse}，官方返回 feed_list 数组而非顶层 feed_token。
 */
@Deprecated
@JsonIgnoreProperties(ignoreUnknown = true)
public class SharerVideoPromotionResponse extends WxApiResponse {

    @JsonProperty("feed_token")
    private String feedToken;

    @JsonProperty("feed_list")
    private java.util.List<GetFeedPromotionInfoResponse.FeedPromotionItem> feedList;

    public String getFeedToken() {
        return feedToken;
    }

    public void setFeedToken(String feedToken) {
        this.feedToken = feedToken;
    }

    public java.util.List<GetFeedPromotionInfoResponse.FeedPromotionItem> getFeedList() {
        return feedList;
    }

    public void setFeedList(java.util.List<GetFeedPromotionInfoResponse.FeedPromotionItem> feedList) {
        this.feedList = feedList;
    }
}
