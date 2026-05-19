package com.wxstore.league.headsupplier.model.opentalent;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

import java.util.List;

/** 橱窗商品列表（window/getall），使用 offset 分页。 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenTalentWindowListResponse extends WxApiResponse {

    @JsonProperty("list")
    private List<OpenTalentWindowItem> list;

    @JsonProperty("next_offset")
    private Integer nextOffset;

    @JsonProperty("has_more")
    @JsonAlias("have_more")
    private Boolean hasMore;

    @JsonProperty("total_num")
    private Integer totalNum;

    public List<OpenTalentWindowItem> getList() {
        return list;
    }

    public void setList(List<OpenTalentWindowItem> list) {
        this.list = list;
    }

    public Integer getNextOffset() {
        return nextOffset;
    }

    public void setNextOffset(Integer nextOffset) {
        this.nextOffset = nextOffset;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }
}
