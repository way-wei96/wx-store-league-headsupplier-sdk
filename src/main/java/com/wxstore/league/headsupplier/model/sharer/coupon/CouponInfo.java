package com.wxstore.league.headsupplier.model.sharer.coupon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 机构推广券详情（get_coupon_detail 返回的 coupon 对象核心字段）。 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CouponInfo {

    @JsonProperty("coupon_id")
    private String couponId;

    @JsonProperty("coupon_name")
    private String couponName;

    @JsonProperty("type")
    private Integer type;

    @JsonProperty("status")
    private Integer status;

    @JsonProperty("shop_appid")
    private String shopAppid;

    @JsonProperty("discount_num")
    private Long discountNum;

    @JsonProperty("discount_fee")
    private Long discountFee;

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getShopAppid() {
        return shopAppid;
    }

    public void setShopAppid(String shopAppid) {
        this.shopAppid = shopAppid;
    }

    public Long getDiscountNum() {
        return discountNum;
    }

    public void setDiscountNum(Long discountNum) {
        this.discountNum = discountNum;
    }

    public Long getDiscountFee() {
        return discountFee;
    }

    public void setDiscountFee(Long discountFee) {
        this.discountFee = discountFee;
    }
}
