package com.wxstore.league.headsupplier.model.sharer.live;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LiveRecordInfo {

    @JsonProperty("export_id")
    private String exportId;

    @JsonProperty("description")
    private String description;

    @JsonProperty("promoter_share_link")
    private String promoterShareLink;

    public String getExportId() {
        return exportId;
    }

    public void setExportId(String exportId) {
        this.exportId = exportId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPromoterShareLink() {
        return promoterShareLink;
    }

    public void setPromoterShareLink(String promoterShareLink) {
        this.promoterShareLink = promoterShareLink;
    }
}
