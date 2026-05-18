package com.wxstore.league.headsupplier.model.category;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QualificationInfo {

    @JsonProperty("qua_id")
    private String quaId;

    @JsonProperty("need_to_apply")
    private Boolean needToApply;

    private String tips;

    private Boolean mandatory;

    private String name;

    public String getQuaId() {
        return quaId;
    }

    public void setQuaId(String quaId) {
        this.quaId = quaId;
    }

    public Boolean getNeedToApply() {
        return needToApply;
    }

    public void setNeedToApply(Boolean needToApply) {
        this.needToApply = needToApply;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public Boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
