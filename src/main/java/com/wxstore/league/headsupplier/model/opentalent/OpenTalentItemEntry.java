package com.wxstore.league.headsupplier.model.opentalent;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 达人带货商品列表条目（合作商品、选品等接口共用核心字段）。 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenTalentItemEntry {

    @JsonProperty("product_id")
    private Long productId;

    @JsonProperty("cooperative_item_id")
    @JsonAlias("id")
    private Long cooperativeItemId;

    @JsonProperty("head_supplier_item_link")
    private String headSupplierItemLink;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getCooperativeItemId() {
        return cooperativeItemId;
    }

    public void setCooperativeItemId(Long cooperativeItemId) {
        this.cooperativeItemId = cooperativeItemId;
    }

    public String getHeadSupplierItemLink() {
        return headSupplierItemLink;
    }

    public void setHeadSupplierItemLink(String headSupplierItemLink) {
        this.headSupplierItemLink = headSupplierItemLink;
    }
}
