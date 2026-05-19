package com.wxstore.league.headsupplier.model.opentalent;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageResponse;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenTalentListResponse extends SharerPageResponse {

    @JsonProperty("list")
    private List<OpenTalentItemEntry> list;

    public List<OpenTalentItemEntry> getList() {
        return list;
    }

    public void setList(List<OpenTalentItemEntry> list) {
        this.list = list;
    }
}
