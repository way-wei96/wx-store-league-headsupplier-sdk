package com.wxstore.league.headsupplier.model.sharer.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetPromoteProductDetailResponse extends WxApiResponse {

    @JsonProperty("product")
    private PromoteProductDetail product;

    @JsonProperty("publish_coupons")
    private List<CouponIdRef> publishCoupons;

    @JsonProperty("cooperative_coupons")
    private List<CouponIdRef> cooperativeCoupons;

    public PromoteProductDetail getProduct() {
        return product;
    }

    public void setProduct(PromoteProductDetail product) {
        this.product = product;
    }

    public List<CouponIdRef> getPublishCoupons() {
        return publishCoupons;
    }

    public void setPublishCoupons(List<CouponIdRef> publishCoupons) {
        this.publishCoupons = publishCoupons;
    }

    public List<CouponIdRef> getCooperativeCoupons() {
        return cooperativeCoupons;
    }

    public void setCooperativeCoupons(List<CouponIdRef> cooperativeCoupons) {
        this.cooperativeCoupons = cooperativeCoupons;
    }
}
