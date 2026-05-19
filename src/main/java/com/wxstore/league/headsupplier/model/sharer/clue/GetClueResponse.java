package com.wxstore.league.headsupplier.model.sharer.clue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetClueResponse extends WxApiResponse {

    @JsonProperty("commssion_clue")
    private CommissionClue commissionClue;

    public CommissionClue getCommissionClue() {
        return commissionClue;
    }

    public void setCommissionClue(CommissionClue commissionClue) {
        this.commissionClue = commissionClue;
    }
}
