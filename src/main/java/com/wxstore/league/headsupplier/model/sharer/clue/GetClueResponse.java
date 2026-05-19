package com.wxstore.league.headsupplier.model.sharer.clue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetClueResponse extends WxApiResponse {

    @JsonProperty("clue_detail")
    private Object clueDetail;

    public Object getClueDetail() {
        return clueDetail;
    }

    public void setClueDetail(Object clueDetail) {
        this.clueDetail = clueDetail;
    }
}
