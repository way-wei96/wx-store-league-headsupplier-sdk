package com.wxstore.league.headsupplier.model.shop;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetProductActivityRequest {

    @JsonProperty("product_id")
    private Long productId;

    @JsonProperty("shop_appid")
    private String shopAppid;

    public static GetProductActivityRequest of(String shopAppid, long productId) {
        GetProductActivityRequest request = new GetProductActivityRequest();
        request.shopAppid = shopAppid;
        request.productId = productId;
        return request;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getShopAppid() {
        return shopAppid;
    }

    public void setShopAppid(String shopAppid) {
        this.shopAppid = shopAppid;
    }
}
