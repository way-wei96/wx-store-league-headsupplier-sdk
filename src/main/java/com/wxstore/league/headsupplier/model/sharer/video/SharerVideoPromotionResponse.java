package com.wxstore.league.headsupplier.model.sharer.video;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SharerVideoPromotionResponse extends WxApiResponse {

    @JsonProperty("feed_token")
    private String feedToken;

    public String getFeedToken() {
        return feedToken;
    }

    public void setFeedToken(String feedToken) {
        this.feedToken = feedToken;
    }
}
