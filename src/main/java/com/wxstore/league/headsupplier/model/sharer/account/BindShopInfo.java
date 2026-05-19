package com.wxstore.league.headsupplier.model.sharer.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BindShopInfo {

    @JsonProperty("shop_appid")
    private String shopAppid;

    @JsonProperty("shop_nickname")
    private String shopNickname;

    @JsonProperty("shop_head_img")
    private String shopHeadImg;

    public String getShopAppid() {
        return shopAppid;
    }

    public void setShopAppid(String shopAppid) {
        this.shopAppid = shopAppid;
    }

    public String getShopNickname() {
        return shopNickname;
    }

    public void setShopNickname(String shopNickname) {
        this.shopNickname = shopNickname;
    }

    public String getShopHeadImg() {
        return shopHeadImg;
    }

    public void setShopHeadImg(String shopHeadImg) {
        this.shopHeadImg = shopHeadImg;
    }
}
