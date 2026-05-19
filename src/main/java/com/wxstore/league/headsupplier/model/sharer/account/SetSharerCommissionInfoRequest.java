package com.wxstore.league.headsupplier.model.sharer.account;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SetSharerCommissionInfoRequest {

    @JsonProperty("sharer_appid")
    private String sharerAppid;

    @JsonProperty("commission_type")
    private Integer commissionType;

    @JsonProperty("commission_ratio")
    private Long commissionRatio;

    public String getSharerAppid() {
        return sharerAppid;
    }

    public void setSharerAppid(String sharerAppid) {
        this.sharerAppid = sharerAppid;
    }

    public Integer getCommissionType() {
        return commissionType;
    }

    public void setCommissionType(Integer commissionType) {
        this.commissionType = commissionType;
    }

    public Long getCommissionRatio() {
        return commissionRatio;
    }

    public void setCommissionRatio(Long commissionRatio) {
        this.commissionRatio = commissionRatio;
    }
}
