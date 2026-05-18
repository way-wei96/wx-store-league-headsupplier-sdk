package com.wxstore.league.headsupplier.model.balance;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetFundsFlowDetailResponse extends WxApiResponse {

    @JsonProperty("funds_flow")
    private FundsFlow fundsFlow;

    public FundsFlow getFundsFlow() {
        return fundsFlow;
    }

    public void setFundsFlow(FundsFlow fundsFlow) {
        this.fundsFlow = fundsFlow;
    }
}
