package com.wxstore.league.headsupplier.model.sharer.article;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageRequest;

public class SharerArticleBaseRequest extends SharerPageRequest {

    @JsonProperty("shop_appid")
    private String shopAppid;

    @JsonProperty("promoter_id")
    private String promoterId;

    @JsonProperty("talent_appid")
    private String talentAppid;

    @JsonProperty("sharer_appid")
    private String sharerAppid;

    @JsonProperty("promoter_type")
    private Integer promoterType;

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

    public String getTalentAppid() {
        return talentAppid;
    }

    public void setTalentAppid(String talentAppid) {
        this.talentAppid = talentAppid;
    }

    public String getSharerAppid() {
        return sharerAppid;
    }

    public void setSharerAppid(String sharerAppid) {
        this.sharerAppid = sharerAppid;
    }

    public Integer getPromoterType() {
        return promoterType;
    }

    public void setPromoterType(Integer promoterType) {
        this.promoterType = promoterType;
    }
}
