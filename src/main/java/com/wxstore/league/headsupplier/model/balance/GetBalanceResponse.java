package com.wxstore.league.headsupplier.model.balance;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetBalanceResponse extends WxApiResponse {

    @JsonProperty("available_amount")
    private Long availableAmount;

    @JsonProperty("pending_amount")
    private Long pendingAmount;

    public Long getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(Long availableAmount) {
        this.availableAmount = availableAmount;
    }

    public Long getPendingAmount() {
        return pendingAmount;
    }

    public void setPendingAmount(Long pendingAmount) {
        this.pendingAmount = pendingAmount;
    }
}
