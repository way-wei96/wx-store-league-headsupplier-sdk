package com.wxstore.league.headsupplier.model.shop;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetSubscribeProductListResponse extends WxApiResponse {

    @JsonProperty("subscribe_info_list")
    private List<SubscribeProductInfo> subscribeInfoList;

    @JsonProperty("total_num")
    private Long totalNum;

    @JsonProperty("next_key")
    private String nextKey;

    @JsonProperty("has_more")
    private Boolean hasMore;

    public List<SubscribeProductInfo> getSubscribeInfoList() {
        return subscribeInfoList;
    }

    public void setSubscribeInfoList(List<SubscribeProductInfo> subscribeInfoList) {
        this.subscribeInfoList = subscribeInfoList;
    }

    public Long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }

    public String getNextKey() {
        return nextKey;
    }

    public void setNextKey(String nextKey) {
        this.nextKey = nextKey;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }
}
