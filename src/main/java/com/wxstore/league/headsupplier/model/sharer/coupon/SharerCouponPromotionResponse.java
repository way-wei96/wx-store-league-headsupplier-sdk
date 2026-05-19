package com.wxstore.league.headsupplier.model.sharer.coupon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SharerCouponPromotionResponse extends WxApiResponse {

    @JsonProperty("promoter_share_link")
    private String promoterShareLink;

    @JsonProperty("qrcode_url")
    private String qrcodeUrl;

    @JsonProperty("short_link")
    private String shortLink;

    public String getPromoterShareLink() {
        return promoterShareLink;
    }

    public void setPromoterShareLink(String promoterShareLink) {
        this.promoterShareLink = promoterShareLink;
    }

    public String getQrcodeUrl() {
        return qrcodeUrl;
    }

    public void setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl;
    }

    public String getShortLink() {
        return shortLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }
}
