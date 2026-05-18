package com.wxstore.league.headsupplier.model.category;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryInfo {

    @JsonProperty("cat_id")
    private Long catId;

    private String name;

    @JsonProperty("f_cat_id")
    private Long fCatId;

    private Integer level;

    private Boolean leaf;

    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getFCatId() {
        return fCatId;
    }

    public void setFCatId(Long fCatId) {
        this.fCatId = fCatId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }
}
