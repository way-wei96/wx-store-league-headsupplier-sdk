package com.wxstore.league.headsupplier.model.sharer.coupon;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageRequest;

public class SharerCouponBaseRequest extends SharerPageRequest {

    @JsonProperty("sharer_appid")
    private String sharerAppid;

    @JsonProperty("coupon_id")
    private String couponId;

    @JsonProperty("shop_appid")
    private String shopAppid;

    @JsonProperty("to_head_supplier_appid")
    private String toHeadSupplierAppid;

    public String getSharerAppid() {
        return sharerAppid;
    }

    public void setSharerAppid(String sharerAppid) {
        this.sharerAppid = sharerAppid;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getShopAppid() {
        return shopAppid;
    }

    public void setShopAppid(String shopAppid) {
        this.shopAppid = shopAppid;
    }

    public String getToHeadSupplierAppid() {
        return toHeadSupplierAppid;
    }

    public void setToHeadSupplierAppid(String toHeadSupplierAppid) {
        this.toHeadSupplierAppid = toHeadSupplierAppid;
    }
}
