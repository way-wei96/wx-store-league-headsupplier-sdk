package com.wxstore.league.headsupplier.model.sharer.live;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageRequest;

public class SharerLiveBaseRequest extends SharerPageRequest {

    @JsonProperty("sharer_appid")
    private String sharerAppid;

    @JsonProperty("talent_appid")
    private String talentAppid;

    @JsonProperty("shop_appid")
    private String shopAppid;

    @JsonProperty("promoter_id")
    private String promoterId;

    @JsonProperty("live_notice_id")
    private String liveNoticeId;

    @JsonProperty("live_id")
    private String liveId;

    @JsonProperty("mini_program_appid")
    private String miniProgramAppid;

    public String getSharerAppid() {
        return sharerAppid;
    }

    public void setSharerAppid(String sharerAppid) {
        this.sharerAppid = sharerAppid;
    }

    public String getTalentAppid() {
        return talentAppid;
    }

    public void setTalentAppid(String talentAppid) {
        this.talentAppid = talentAppid;
    }

    public String getShopAppid() {
        return shopAppid;
    }

    public void setShopAppid(String shopAppid) {
        this.shopAppid = shopAppid;
    }

    public String getPromoterId() {
        return promoterId;
    }

    public void setPromoterId(String promoterId) {
        this.promoterId = promoterId;
    }

    public String getLiveNoticeId() {
        return liveNoticeId;
    }

    public void setLiveNoticeId(String liveNoticeId) {
        this.liveNoticeId = liveNoticeId;
    }

    public String getLiveId() {
        return liveId;
    }

    public void setLiveId(String liveId) {
        this.liveId = liveId;
    }

    public String getMiniProgramAppid() {
        return miniProgramAppid;
    }

    public void setMiniProgramAppid(String miniProgramAppid) {
        this.miniProgramAppid = miniProgramAppid;
    }
}
