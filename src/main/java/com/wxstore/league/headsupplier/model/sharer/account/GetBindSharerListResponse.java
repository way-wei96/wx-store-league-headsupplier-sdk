package com.wxstore.league.headsupplier.model.sharer.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageResponse;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetBindSharerListResponse extends SharerPageResponse {

    @JsonProperty("sharer_info_list")
    private List<SharerInfo> sharerInfoList;

    public List<SharerInfo> getSharerInfoList() {
        return sharerInfoList;
    }

    public void setSharerInfoList(List<SharerInfo> sharerInfoList) {
        this.sharerInfoList = sharerInfoList;
    }
}
