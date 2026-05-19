package com.wxstore.league.headsupplier.model.sharer.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SetSharerProductCommissionInfoRequest {

    @JsonProperty("sharer_appid")
    private String sharerAppid;

    @JsonProperty("product_id")
    private Long productId;

    @JsonProperty("commission_ratio")
    private Long commissionRatio;

    public String getSharerAppid() {
        return sharerAppid;
    }

    public void setSharerAppid(String sharerAppid) {
        this.sharerAppid = sharerAppid;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getCommissionRatio() {
        return commissionRatio;
    }

    public void setCommissionRatio(Long commissionRatio) {
        this.commissionRatio = commissionRatio;
    }
}
