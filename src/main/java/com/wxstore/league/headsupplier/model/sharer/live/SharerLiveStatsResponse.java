package com.wxstore.league.headsupplier.model.sharer.live;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

/** 直播/直播预告推广统计（getlivenoticestats、getlivestats）。 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SharerLiveStatsResponse extends WxApiResponse {

    @JsonProperty("notice_count")
    private Long noticeCount;

    @JsonProperty("notice_user_count")
    private Long noticeUserCount;

    @JsonProperty("share_count")
    private Long shareCount;

    @JsonProperty("share_user_count")
    private Long shareUserCount;

    @JsonProperty("join_count")
    private Long joinCount;

    @JsonProperty("join_user_count")
    private Long joinUserCount;

    public Long getNoticeCount() {
        return noticeCount;
    }

    public void setNoticeCount(Long noticeCount) {
        this.noticeCount = noticeCount;
    }

    public Long getNoticeUserCount() {
        return noticeUserCount;
    }

    public void setNoticeUserCount(Long noticeUserCount) {
        this.noticeUserCount = noticeUserCount;
    }

    public Long getShareCount() {
        return shareCount;
    }

    public void setShareCount(Long shareCount) {
        this.shareCount = shareCount;
    }

    public Long getShareUserCount() {
        return shareUserCount;
    }

    public void setShareUserCount(Long shareUserCount) {
        this.shareUserCount = shareUserCount;
    }

    public Long getJoinCount() {
        return joinCount;
    }

    public void setJoinCount(Long joinCount) {
        this.joinCount = joinCount;
    }

    public Long getJoinUserCount() {
        return joinUserCount;
    }

    public void setJoinUserCount(Long joinUserCount) {
        this.joinUserCount = joinUserCount;
    }
}
