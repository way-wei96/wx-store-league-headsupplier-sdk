package com.wxstore.league.headsupplier.model.sharer.video;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageResponse;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SharerVideoListResponse extends SharerPageResponse {

    @JsonProperty("feed_list")
    private List<FeedInfo> feedList;

    public List<FeedInfo> getFeedList() {
        return feedList;
    }

    public void setFeedList(List<FeedInfo> feedList) {
        this.feedList = feedList;
    }
}
