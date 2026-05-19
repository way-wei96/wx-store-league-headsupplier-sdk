package com.wxstore.league.headsupplier.model.sharer.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageResponse;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetBindTalentListResponse extends SharerPageResponse {

    @JsonProperty("talent_list")
    private List<TalentInfo> talentList;

    public List<TalentInfo> getTalentList() {
        return talentList;
    }

    public void setTalentList(List<TalentInfo> talentList) {
        this.talentList = talentList;
    }
}
