package com.wxstore.league.headsupplier.model.opentalent;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageRequest;

public class OpenTalentBaseRequest extends SharerPageRequest {

    @JsonProperty("finder_id")
    private String finderId;

    @JsonProperty("openfinderid")
    private String openfinderid;

    @JsonProperty("opentalentid")
    private String opentalentid;

    @JsonProperty("product_id")
    private Long productId;

    @JsonProperty("shop_appid")
    private String shopAppid;

    @JsonProperty("product_link")
    private String productLink;

    @JsonProperty("head_supplier_item_link")
    private String headSupplierItemLink;

    @JsonProperty("is_hide_for_window")
    private Boolean isHideForWindow;

    public String getFinderId() {
        return finderId;
    }

    public void setFinderId(String finderId) {
        this.finderId = finderId;
    }

    public String getOpenfinderid() {
        return openfinderid;
    }

    public void setOpenfinderid(String openfinderid) {
        this.openfinderid = openfinderid;
    }

    public String getOpentalentid() {
        return opentalentid;
    }

    public void setOpentalentid(String opentalentid) {
        this.opentalentid = opentalentid;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getShopAppid() {
        return shopAppid;
    }

    public void setShopAppid(String shopAppid) {
        this.shopAppid = shopAppid;
    }

    public String getProductLink() {
        return productLink;
    }

    public void setProductLink(String productLink) {
        this.productLink = productLink;
    }

    public String getHeadSupplierItemLink() {
        return headSupplierItemLink;
    }

    public void setHeadSupplierItemLink(String headSupplierItemLink) {
        this.headSupplierItemLink = headSupplierItemLink;
    }

    public Boolean getIsHideForWindow() {
        return isHideForWindow;
    }

    public void setIsHideForWindow(Boolean isHideForWindow) {
        this.isHideForWindow = isHideForWindow;
    }
}
