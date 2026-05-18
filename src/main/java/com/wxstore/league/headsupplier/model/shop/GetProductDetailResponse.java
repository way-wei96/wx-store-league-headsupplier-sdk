package com.wxstore.league.headsupplier.model.shop;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetProductDetailResponse extends WxApiResponse {

    /**
     * 文档字段为 item，部分示例为 product，均做兼容。
     */
    @JsonProperty("item")
    @JsonAlias("product")
    private ProductItem item;

    public ProductItem getItem() {
        return item;
    }

    public void setItem(ProductItem item) {
        this.item = item;
    }
}
