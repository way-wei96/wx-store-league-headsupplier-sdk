package com.wxstore.league.headsupplier.model.balance;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetFundsFlowDetailRequest {

    @JsonProperty("flow_id")
    private String flowId;

    public static GetFundsFlowDetailRequest of(String flowId) {
        GetFundsFlowDetailRequest request = new GetFundsFlowDetailRequest();
        request.flowId = flowId;
        return request;
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }
}
