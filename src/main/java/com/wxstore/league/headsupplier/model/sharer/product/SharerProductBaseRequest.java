package com.wxstore.league.headsupplier.model.sharer.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageRequest;

public class SharerProductBaseRequest extends SharerPageRequest {

    @JsonProperty("sharer_appid")
    private String sharerAppid;

    @JsonProperty("shop_appid")
    private String shopAppid;

    @JsonProperty("product_id")
    private Long productId;

    @JsonProperty("head_supplier_appid")
    private String headSupplierAppid;

    @JsonProperty("plan_type")
    private Integer planType;

    @JsonProperty("get_available_coupon")
    private Boolean getAvailableCoupon;

    @JsonProperty("custom_token")
    private String customToken;

    @JsonProperty("keyword")
    private String keyword;

    @JsonProperty("from_head_supplier_appid")
    private String fromHeadSupplierAppid;

    public String getSharerAppid() {
        return sharerAppid;
    }

    public void setSharerAppid(String sharerAppid) {
        this.sharerAppid = sharerAppid;
    }

    public String getShopAppid() {
        return shopAppid;
    }

    public void setShopAppid(String shopAppid) {
        this.shopAppid = shopAppid;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getHeadSupplierAppid() {
        return headSupplierAppid;
    }

    public void setHeadSupplierAppid(String headSupplierAppid) {
        this.headSupplierAppid = headSupplierAppid;
    }

    public Integer getPlanType() {
        return planType;
    }

    public void setPlanType(Integer planType) {
        this.planType = planType;
    }

    public Boolean getGetAvailableCoupon() {
        return getAvailableCoupon;
    }

    public void setGetAvailableCoupon(Boolean getAvailableCoupon) {
        this.getAvailableCoupon = getAvailableCoupon;
    }

    public String getCustomToken() {
        return customToken;
    }

    public void setCustomToken(String customToken) {
        this.customToken = customToken;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getFromHeadSupplierAppid() {
        return fromHeadSupplierAppid;
    }

    public void setFromHeadSupplierAppid(String fromHeadSupplierAppid) {
        this.fromHeadSupplierAppid = fromHeadSupplierAppid;
    }
}
