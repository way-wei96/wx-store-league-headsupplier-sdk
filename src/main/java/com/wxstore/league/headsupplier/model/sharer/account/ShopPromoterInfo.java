package com.wxstore.league.headsupplier.model.sharer.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopPromoterInfo {

    @JsonProperty("promoter_id")
    private String promoterId;

    @JsonProperty("promoter_type")
    private Integer promoterType;

    @JsonProperty("promoter_name")
    private String promoterName;

    @JsonProperty("avatar_image_url")
    private String avatarImageUrl;

    public String getPromoterId() {
        return promoterId;
    }

    public void setPromoterId(String promoterId) {
        this.promoterId = promoterId;
    }

    public Integer getPromoterType() {
        return promoterType;
    }

    public void setPromoterType(Integer promoterType) {
        this.promoterType = promoterType;
    }

    public String getPromoterName() {
        return promoterName;
    }

    public void setPromoterName(String promoterName) {
        this.promoterName = promoterName;
    }

    public String getAvatarImageUrl() {
        return avatarImageUrl;
    }

    public void setAvatarImageUrl(String avatarImageUrl) {
        this.avatarImageUrl = avatarImageUrl;
    }
}
