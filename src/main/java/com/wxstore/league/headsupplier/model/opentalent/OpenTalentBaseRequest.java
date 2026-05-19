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

    @JsonProperty("commission_type")
    private Integer commissionType;

    @JsonProperty("listing_time_range")
    private ListingTimeRange listingTimeRange;

    @JsonProperty("offset")
    private Integer offset;

    @JsonProperty("need_total_num")
    private Boolean needTotalNum;

    @JsonProperty("is_get_all")
    private Boolean isGetAll;

    @JsonProperty("product_window_id")
    private Long productWindowId;

    @JsonProperty("appid")
    private String appid;

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

    public Integer getCommissionType() {
        return commissionType;
    }

    public void setCommissionType(Integer commissionType) {
        this.commissionType = commissionType;
    }

    public ListingTimeRange getListingTimeRange() {
        return listingTimeRange;
    }

    public void setListingTimeRange(ListingTimeRange listingTimeRange) {
        this.listingTimeRange = listingTimeRange;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Boolean getNeedTotalNum() {
        return needTotalNum;
    }

    public void setNeedTotalNum(Boolean needTotalNum) {
        this.needTotalNum = needTotalNum;
    }

    public Boolean getIsGetAll() {
        return isGetAll;
    }

    public void setIsGetAll(Boolean isGetAll) {
        this.isGetAll = isGetAll;
    }

    public Long getProductWindowId() {
        return productWindowId;
    }

    public void setProductWindowId(Long productWindowId) {
        this.productWindowId = productWindowId;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public static class ListingTimeRange {

        @JsonProperty("min")
        private Long min;

        @JsonProperty("max")
        private Long max;

        public Long getMin() {
            return min;
        }

        public void setMin(Long min) {
            this.min = min;
        }

        public Long getMax() {
            return max;
        }

        public void setMax(Long max) {
            this.max = max;
        }
    }
}
