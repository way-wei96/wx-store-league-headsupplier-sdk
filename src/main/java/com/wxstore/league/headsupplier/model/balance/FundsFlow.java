package com.wxstore.league.headsupplier.model.balance;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FundsFlow {

    @JsonProperty("flow_id")
    private String flowId;

    @JsonProperty("funds_type")
    private Integer fundsType;

    private Long amount;
    private Long balance;

    @JsonProperty("bookkeeping_time")
    private String bookkeepingTime;

    private String remark;

    @JsonProperty("order_id")
    private String orderId;

    @JsonProperty("withdraw_id")
    private String withdrawId;

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public Integer getFundsType() {
        return fundsType;
    }

    public void setFundsType(Integer fundsType) {
        this.fundsType = fundsType;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public String getBookkeepingTime() {
        return bookkeepingTime;
    }

    public void setBookkeepingTime(String bookkeepingTime) {
        this.bookkeepingTime = bookkeepingTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getWithdrawId() {
        return withdrawId;
    }

    public void setWithdrawId(String withdrawId) {
        this.withdrawId = withdrawId;
    }
}
