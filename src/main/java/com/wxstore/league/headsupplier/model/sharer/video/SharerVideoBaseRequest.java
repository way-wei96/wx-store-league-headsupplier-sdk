package com.wxstore.league.headsupplier.model.sharer.video;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageRequest;

import java.util.Collections;
import java.util.List;

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

    @JsonProperty("mini_program_appid")
    private String miniProgramAppid;

    @JsonProperty("feed_list")
    private List<FeedExportRef> feedList;

    public static SharerVideoBaseRequest forFeedList(String talentAppid, int pageSize) {
        SharerVideoBaseRequest request = new SharerVideoBaseRequest();
        request.setTalentAppid(talentAppid);
        request.setPageSize(pageSize);
        request.setNextKey("");
        return request;
    }

    public static SharerVideoBaseRequest forFeedPromotion(
            String talentAppid, String miniProgramAppid, String exportId) {
        SharerVideoBaseRequest request = new SharerVideoBaseRequest();
        request.setTalentAppid(talentAppid);
        request.setMiniProgramAppid(miniProgramAppid);
        FeedExportRef ref = new FeedExportRef();
        ref.setExportId(exportId);
        request.setFeedList(Collections.singletonList(ref));
        return request;
    }

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

    public String getMiniProgramAppid() {
        return miniProgramAppid;
    }

    public void setMiniProgramAppid(String miniProgramAppid) {
        this.miniProgramAppid = miniProgramAppid;
    }

    public List<FeedExportRef> getFeedList() {
        return feedList;
    }

    public void setFeedList(List<FeedExportRef> feedList) {
        this.feedList = feedList;
    }

    public static class FeedExportRef {

        @JsonProperty("export_id")
        private String exportId;

        public String getExportId() {
            return exportId;
        }

        public void setExportId(String exportId) {
            this.exportId = exportId;
        }
    }
}
