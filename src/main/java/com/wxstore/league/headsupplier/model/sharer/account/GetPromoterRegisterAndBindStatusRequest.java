package com.wxstore.league.headsupplier.model.sharer.account;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPromoterRegisterAndBindStatusRequest {

    @JsonProperty("sharer_openid")
    private String sharerOpenid;

    @JsonProperty("sharer_appid")
    private String sharerAppid;

    @JsonProperty("is_simple_register")
    private Boolean isSimpleRegister;

    public String getSharerOpenid() {
        return sharerOpenid;
    }

    public void setSharerOpenid(String sharerOpenid) {
        this.sharerOpenid = sharerOpenid;
    }

    public String getSharerAppid() {
        return sharerAppid;
    }

    public void setSharerAppid(String sharerAppid) {
        this.sharerAppid = sharerAppid;
    }

    public Boolean getIsSimpleRegister() {
        return isSimpleRegister;
    }

    public void setIsSimpleRegister(Boolean isSimpleRegister) {
        this.isSimpleRegister = isSimpleRegister;
    }
}
