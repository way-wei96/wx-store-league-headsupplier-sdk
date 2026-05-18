package com.wxstore.league.headsupplier.model.shop;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetProductDetailRequest {

    @JsonProperty("shop_appid")
    private String shopAppid;

    @JsonProperty("product_id")
    private Long productId;

    public static GetProductDetailRequest of(String shopAppid, long productId) {
        GetProductDetailRequest request = new GetProductDetailRequest();
        request.shopAppid = shopAppid;
        request.productId = productId;
        return request;
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
}
