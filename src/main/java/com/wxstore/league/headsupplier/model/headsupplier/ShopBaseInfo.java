package com.wxstore.league.headsupplier.model.headsupplier;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopBaseInfo {

    @JsonProperty("appid")
    private String appid;

    @JsonProperty("headimg_url")
    private String headimgUrl;

    @JsonProperty("nickname")
    private String nickname;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getHeadimgUrl() {
        return headimgUrl;
    }

    public void setHeadimgUrl(String headimgUrl) {
        this.headimgUrl = headimgUrl;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
