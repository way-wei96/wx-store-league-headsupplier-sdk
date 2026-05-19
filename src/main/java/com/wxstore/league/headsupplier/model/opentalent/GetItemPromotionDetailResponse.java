package com.wxstore.league.headsupplier.model.opentalent;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetItemPromotionDetailResponse extends WxApiResponse {

    @JsonProperty("item")
    private ItemPromotionDetail item;

    public ItemPromotionDetail getItem() {
        return item;
    }

    public void setItem(ItemPromotionDetail item) {
        this.item = item;
    }
}
