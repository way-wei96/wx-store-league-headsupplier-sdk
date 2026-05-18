package com.wxstore.league.headsupplier.model.category;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetAllCategoryResponse extends WxApiResponse {

    /** 旧版三级类目树 */
    private List<CategoryTreeGroup> cats;

    /** 新版多级类目树（推荐使用） */
    @JsonProperty("cats_v2")
    private List<CategoryTreeGroup> catsV2;

    public List<CategoryTreeGroup> getCats() {
        return cats;
    }

    public void setCats(List<CategoryTreeGroup> cats) {
        this.cats = cats;
    }

    public List<CategoryTreeGroup> getCatsV2() {
        return catsV2;
    }

    public void setCatsV2(List<CategoryTreeGroup> catsV2) {
        this.catsV2 = catsV2;
    }
}
