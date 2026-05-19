package com.wxstore.league.headsupplier.model.callback;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 达人橱窗解除授权（talent_window_cancel_auth）。 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TalentWindowCancelAuthEvent extends CallbackEventMessage {

    @JsonProperty("item_info")
    private ItemInfo itemInfo;

    public ItemInfo getItemInfo() {
        return itemInfo;
    }

    public void setItemInfo(ItemInfo itemInfo) {
        this.itemInfo = itemInfo;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ItemInfo {

        @JsonProperty("talent_info")
        private TalentInfo talentInfo;

        public TalentInfo getTalentInfo() {
            return talentInfo;
        }

        public void setTalentInfo(TalentInfo talentInfo) {
            this.talentInfo = talentInfo;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TalentInfo {

        @JsonProperty("talent_appid")
        private String talentAppid;

        @JsonProperty("openfinderid")
        private String openfinderid;

        @JsonProperty("opentalentid")
        private String opentalentid;

        @JsonProperty("nickname")
        private String nickname;

        @JsonProperty("head_img_url")
        private String headImgUrl;

        public String getTalentAppid() {
            return talentAppid;
        }

        public void setTalentAppid(String talentAppid) {
            this.talentAppid = talentAppid;
        }

        public String getOpenfinderid() {
            return openfinderid;
        }

        public void setOpenfinderid(String openfinderid) {
            this.openfinderid = openfinderid;
        }

        public String getOpentalentid() {
            return opentalentid;
        }

        public void setOpentalentid(String opentalentid) {
            this.opentalentid = opentalentid;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getHeadImgUrl() {
            return headImgUrl;
        }

        public void setHeadImgUrl(String headImgUrl) {
            this.headImgUrl = headImgUrl;
        }
    }
}
