package com.wxstore.league.headsupplier.model.sharer.clue;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetClueRequest {

    @JsonProperty("order_id")
    private String orderId;

    @JsonProperty("sku_id")
    private Long skuId;

    public static GetClueRequest of(String orderId, long skuId) {
        GetClueRequest request = new GetClueRequest();
        request.orderId = orderId;
        request.skuId = skuId;
        return request;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }
}
