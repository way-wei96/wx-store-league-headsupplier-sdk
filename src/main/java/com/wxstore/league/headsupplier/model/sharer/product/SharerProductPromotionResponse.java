package com.wxstore.league.headsupplier.model.sharer.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SharerProductPromotionResponse extends WxApiResponse {

    @JsonProperty("short_link")
    private String shortLink;

    @JsonProperty("qrcode_url")
    private String qrcodeUrl;

    @JsonProperty("product_promotion_link")
    private String productPromotionLink;

    public String getShortLink() {
        return shortLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    public String getQrcodeUrl() {
        return qrcodeUrl;
    }

    public void setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl;
    }

    public String getProductPromotionLink() {
        return productPromotionLink;
    }

    public void setProductPromotionLink(String productPromotionLink) {
        this.productPromotionLink = productPromotionLink;
    }
}
