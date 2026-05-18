package com.wxstore.league.headsupplier.model.basic;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CallbackCheckRequest {

    private String action;

    @JsonProperty("check_operator")
    private String checkOperator;

    public static CallbackCheckRequest of(String action, String checkOperator) {
        CallbackCheckRequest request = new CallbackCheckRequest();
        request.action = action;
        request.checkOperator = checkOperator;
        return request;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getCheckOperator() {
        return checkOperator;
    }

    public void setCheckOperator(String checkOperator) {
        this.checkOperator = checkOperator;
    }
}
