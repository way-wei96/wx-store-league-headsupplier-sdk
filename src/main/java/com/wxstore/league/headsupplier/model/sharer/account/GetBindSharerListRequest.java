package com.wxstore.league.headsupplier.model.sharer.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageRequest;

public class GetBindSharerListRequest extends SharerPageRequest {

    @JsonProperty("sharer_appid")
    private String sharerAppid;

    @JsonProperty("sharer_openid")
    private String sharerOpenid;

    public static GetBindSharerListRequest of(String nextKey, int pageSize) {
        GetBindSharerListRequest request = new GetBindSharerListRequest();
        request.setNextKey(nextKey);
        request.setPageSize(pageSize);
        return request;
    }

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
}
