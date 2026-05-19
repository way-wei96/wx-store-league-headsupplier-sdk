package com.wxstore.league.headsupplier.model.opentalent;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetWindowDetailResponse extends WxApiResponse {

    @JsonProperty("product_detail")
    private WindowProductDetail productDetail;

    public WindowProductDetail getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(WindowProductDetail productDetail) {
        this.productDetail = productDetail;
    }
}
