package com.wxstore.league.headsupplier.model.shop;

import com.fasterxml.jackson.annotation.JsonProperty;

/** 商品订阅 / 取消订阅请求。 */
public class ProductIdRequest {

    @JsonProperty("product_id")
    private Long productId;

    public static ProductIdRequest of(long productId) {
        ProductIdRequest request = new ProductIdRequest();
        request.productId = productId;
        return request;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
