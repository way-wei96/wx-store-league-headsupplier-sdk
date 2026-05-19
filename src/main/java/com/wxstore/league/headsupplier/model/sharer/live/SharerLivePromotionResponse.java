package com.wxstore.league.headsupplier.model.sharer.live;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SharerLivePromotionResponse extends WxApiResponse {

    @JsonProperty("qrcode_url")
    private String qrcodeUrl;

    @JsonProperty("promoter_share_link")
    private String promoterShareLink;

    public String getQrcodeUrl() {
        return qrcodeUrl;
    }

    public void setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl;
    }

    public String getPromoterShareLink() {
        return promoterShareLink;
    }

    public void setPromoterShareLink(String promoterShareLink) {
        this.promoterShareLink = promoterShareLink;
    }
}
