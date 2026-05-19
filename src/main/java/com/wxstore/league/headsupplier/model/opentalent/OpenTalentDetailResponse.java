package com.wxstore.league.headsupplier.model.opentalent;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenTalentDetailResponse extends WxApiResponse {

    @JsonProperty("window_item")
    private Object windowItem;

    @JsonProperty("item")
    private Object item;

    @JsonProperty("promotion_detail")
    private Object promotionDetail;

    public Object getWindowItem() {
        return windowItem;
    }

    public void setWindowItem(Object windowItem) {
        this.windowItem = windowItem;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public Object getPromotionDetail() {
        return promotionDetail;
    }

    public void setPromotionDetail(Object promotionDetail) {
        this.promotionDetail = promotionDetail;
    }
}
