package com.wxstore.league.headsupplier.model.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetOrderRequest {

    @JsonProperty("order_id")
    private Long orderId;

    @JsonProperty("sku_id")
    private Long skuId;

    public static GetOrderRequest of(long orderId, long skuId) {
        GetOrderRequest request = new GetOrderRequest();
        request.orderId = orderId;
        request.skuId = skuId;
        return request;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }
}
