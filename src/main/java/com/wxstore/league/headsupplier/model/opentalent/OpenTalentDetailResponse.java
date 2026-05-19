package com.wxstore.league.headsupplier.model.opentalent;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

/**
 * @deprecated 请改用 {@link GetWindowDetailResponse} 或 {@link GetItemPromotionDetailResponse}
 */
@Deprecated
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenTalentDetailResponse extends WxApiResponse {

    @JsonProperty("product_detail")
    private WindowProductDetail productDetail;

    @JsonProperty("item")
    private ItemPromotionDetail item;

    @JsonProperty("window_item")
    private OpenTalentWindowItem windowItem;

    public WindowProductDetail getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(WindowProductDetail productDetail) {
        this.productDetail = productDetail;
    }

    public ItemPromotionDetail getItem() {
        return item;
    }

    public void setItem(ItemPromotionDetail item) {
        this.item = item;
    }

    public OpenTalentWindowItem getWindowItem() {
        return windowItem;
    }

    public void setWindowItem(OpenTalentWindowItem windowItem) {
        this.windowItem = windowItem;
    }
}
