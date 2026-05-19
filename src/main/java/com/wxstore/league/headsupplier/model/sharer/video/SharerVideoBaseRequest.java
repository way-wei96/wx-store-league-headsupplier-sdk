package com.wxstore.league.headsupplier.model.sharer.video;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageRequest;

public class SharerVideoBaseRequest extends SharerPageRequest {

    @JsonProperty("sharer_appid")
    private String sharerAppid;

    @JsonProperty("talent_appid")
    private String talentAppid;

    @JsonProperty("shop_appid")
    private String shopAppid;

    @JsonProperty("promoter_id")
    private String promoterId;

    @JsonProperty("feed_id")
    private String feedId;

    @JsonProperty("finder_exportusername")
    private String finderExportusername;

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

    public String getFeedId() {
        return feedId;
    }

    public void setFeedId(String feedId) {
        this.feedId = feedId;
    }

    public String getFinderExportusername() {
        return finderExportusername;
    }

    public void setFinderExportusername(String finderExportusername) {
        this.finderExportusername = finderExportusername;
    }
}
