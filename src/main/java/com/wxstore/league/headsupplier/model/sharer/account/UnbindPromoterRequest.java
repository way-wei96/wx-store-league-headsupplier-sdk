package com.wxstore.league.headsupplier.model.sharer.account;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UnbindPromoterRequest {

    @JsonProperty("sharer_appid")
    private String sharerAppid;

    public static UnbindPromoterRequest of(String sharerAppid) {
        UnbindPromoterRequest request = new UnbindPromoterRequest();
        request.sharerAppid = sharerAppid;
        return request;
    }

    public String getSharerAppid() {
        return sharerAppid;
    }

    public void setSharerAppid(String sharerAppid) {
        this.sharerAppid = sharerAppid;
    }
}
