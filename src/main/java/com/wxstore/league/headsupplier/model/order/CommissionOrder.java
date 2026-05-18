package com.wxstore.league.headsupplier.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommissionOrder {

    @JsonProperty("order_id")
    private String orderId;

    @JsonProperty("sku_id")
    private Long skuId;

    @JsonProperty("create_time")
    private Long createTime;

    @JsonProperty("update_time")
    private Long updateTime;

    private Integer status;

    @JsonProperty("order_detail")
    private CommissionOrderDetail orderDetail;

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

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public CommissionOrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(CommissionOrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }
}
