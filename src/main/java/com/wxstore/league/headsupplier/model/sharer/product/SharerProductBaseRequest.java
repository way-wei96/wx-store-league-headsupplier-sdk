package com.wxstore.league.headsupplier.model.sharer.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageRequest;

public class SharerProductBaseRequest extends SharerPageRequest {

    @JsonProperty("sharer_appid")
    private String sharerAppid;

    @JsonProperty("shop_appid")
    private String shopAppid;

    @JsonProperty("product_id")
    private Long productId;

    @JsonProperty("head_supplier_appid")
    private String headSupplierAppid;

    public String getSharerAppid() {
        return sharerAppid;
    }

    public void setSharerAppid(String sharerAppid) {
        this.sharerAppid = sharerAppid;
    }

    public String getShopAppid() {
        return shopAppid;
    }

    public void setShopAppid(String shopAppid) {
        this.shopAppid = shopAppid;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getHeadSupplierAppid() {
        return headSupplierAppid;
    }

    public void setHeadSupplierAppid(String headSupplierAppid) {
        this.headSupplierAppid = headSupplierAppid;
    }
}
