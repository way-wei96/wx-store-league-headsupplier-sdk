package com.wxstore.league.headsupplier.model.category;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryTreeGroup {

    @JsonProperty("cat_and_qua")
    private List<CategoryAndQua> catAndQua;

    public List<CategoryAndQua> getCatAndQua() {
        return catAndQua;
    }

    public void setCatAndQua(List<CategoryAndQua> catAndQua) {
        this.catAndQua = catAndQua;
    }
}
