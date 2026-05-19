package com.wxstore.league.headsupplier.model.callback;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 推客绑定机构回调（promoter_bind_result）。 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PromoterBindEvent extends CallbackEventMessage {

    @JsonProperty("sharer_appid")
    private String sharerAppid;

    @JsonProperty("sharer_openid")
    private String sharerOpenid;

    @JsonProperty("sharer_unionid")
    private String sharerUnionid;

    /** 1-绑定 2-解绑 */
    @JsonProperty("bind_status")
    private Integer bindStatus;

    public String getSharerAppid() {
        return sharerAppid;
    }

    public void setSharerAppid(String sharerAppid) {
        this.sharerAppid = sharerAppid;
    }

    public String getSharerOpenid() {
        return sharerOpenid;
    }

    public void setSharerOpenid(String sharerOpenid) {
        this.sharerOpenid = sharerOpenid;
    }

    public String getSharerUnionid() {
        return sharerUnionid;
    }

    public void setSharerUnionid(String sharerUnionid) {
        this.sharerUnionid = sharerUnionid;
    }

    public Integer getBindStatus() {
        return bindStatus;
    }

    public void setBindStatus(Integer bindStatus) {
        this.bindStatus = bindStatus;
    }
}
