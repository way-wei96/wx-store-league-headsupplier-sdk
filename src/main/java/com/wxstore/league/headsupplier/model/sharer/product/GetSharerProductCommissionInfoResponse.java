package com.wxstore.league.headsupplier.model.sharer.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetSharerProductCommissionInfoResponse extends WxApiResponse {

    @JsonProperty("commission_ratio")
    private Long commissionRatio;

    public Long getCommissionRatio() {
        return commissionRatio;
    }

    public void setCommissionRatio(Long commissionRatio) {
        this.commissionRatio = commissionRatio;
    }
}
