package com.wxstore.league.headsupplier.model.sharer.clue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommissionClue {

    @JsonProperty("order_id")
    private String orderId;

    @JsonProperty("sku_id")
    private Long skuId;

    @JsonProperty("create_time")
    private Long createTime;

    @JsonProperty("update_time")
    private Long updateTime;

    @JsonProperty("status")
    private Integer status;

    @JsonProperty("clue_detail")
    private ClueDetail clueDetail;

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

    public ClueDetail getClueDetail() {
        return clueDetail;
    }

    public void setClueDetail(ClueDetail clueDetail) {
        this.clueDetail = clueDetail;
    }
}
