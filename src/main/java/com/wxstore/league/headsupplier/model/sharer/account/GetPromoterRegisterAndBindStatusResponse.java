package com.wxstore.league.headsupplier.model.sharer.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetPromoterRegisterAndBindStatusResponse extends WxApiResponse {

    @JsonProperty("bind_status")
    private Integer bindStatus;

    @JsonProperty("register_status")
    private Integer registerStatus;

    @JsonProperty("register_business_type")
    private String registerBusinessType;

    @JsonProperty("register_query_string")
    private String registerQueryString;

    @JsonProperty("bind_business_type")
    private String bindBusinessType;

    @JsonProperty("bind_query_string")
    private String bindQueryString;

    @JsonProperty("sharer_appid")
    private String sharerAppid;

    public Integer getBindStatus() {
        return bindStatus;
    }

    public void setBindStatus(Integer bindStatus) {
        this.bindStatus = bindStatus;
    }

    public Integer getRegisterStatus() {
        return registerStatus;
    }

    public void setRegisterStatus(Integer registerStatus) {
        this.registerStatus = registerStatus;
    }

    public String getRegisterBusinessType() {
        return registerBusinessType;
    }

    public void setRegisterBusinessType(String registerBusinessType) {
        this.registerBusinessType = registerBusinessType;
    }

    public String getRegisterQueryString() {
        return registerQueryString;
    }

    public void setRegisterQueryString(String registerQueryString) {
        this.registerQueryString = registerQueryString;
    }

    public String getBindBusinessType() {
        return bindBusinessType;
    }

    public void setBindBusinessType(String bindBusinessType) {
        this.bindBusinessType = bindBusinessType;
    }

    public String getBindQueryString() {
        return bindQueryString;
    }

    public void setBindQueryString(String bindQueryString) {
        this.bindQueryString = bindQueryString;
    }

    public String getSharerAppid() {
        return sharerAppid;
    }

    public void setSharerAppid(String sharerAppid) {
        this.sharerAppid = sharerAppid;
    }
}
