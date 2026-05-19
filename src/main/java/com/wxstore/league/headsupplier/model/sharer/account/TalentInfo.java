package com.wxstore.league.headsupplier.model.sharer.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TalentInfo {

    @JsonProperty("talent_appid")
    private String talentAppid;

    @JsonProperty("talent_nickname")
    private String talentNickname;

    @JsonProperty("talent_head_img")
    private String talentHeadImg;

    public String getTalentAppid() {
        return talentAppid;
    }

    public void setTalentAppid(String talentAppid) {
        this.talentAppid = talentAppid;
    }

    public String getTalentNickname() {
        return talentNickname;
    }

    public void setTalentNickname(String talentNickname) {
        this.talentNickname = talentNickname;
    }

    public String getTalentHeadImg() {
        return talentHeadImg;
    }

    public void setTalentHeadImg(String talentHeadImg) {
        this.talentHeadImg = talentHeadImg;
    }
}
