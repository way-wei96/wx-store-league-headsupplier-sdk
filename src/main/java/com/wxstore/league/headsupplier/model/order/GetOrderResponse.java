package com.wxstore.league.headsupplier.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetOrderResponse extends WxApiResponse {

    /**
     * 官方字段拼写为 commssion_order（双 s）。
     */
    @JsonProperty("commssion_order")
    private CommissionOrder commissionOrder;

    public CommissionOrder getCommissionOrder() {
        return commissionOrder;
    }

    public void setCommissionOrder(CommissionOrder commissionOrder) {
        this.commissionOrder = commissionOrder;
    }
}
