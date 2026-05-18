package com.wxstore.league.headsupplier.model.headsupplier;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetShopResponse extends WxApiResponse {

    @JsonProperty("shop_detail")
    private ShopDetail shopDetail;

    public ShopDetail getShopDetail() {
        return shopDetail;
    }

    public void setShopDetail(ShopDetail shopDetail) {
        this.shopDetail = shopDetail;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ShopDetail {

        @JsonProperty("base_info")
        private ShopBaseInfo baseInfo;

        @JsonProperty("data_info")
        private ShopDataInfo dataInfo;

        @JsonProperty("status")
        private Integer status;

        @JsonProperty("approved_time")
        private Long approvedTime;

        public ShopBaseInfo getBaseInfo() {
            return baseInfo;
        }

        public void setBaseInfo(ShopBaseInfo baseInfo) {
            this.baseInfo = baseInfo;
        }

        public ShopDataInfo getDataInfo() {
            return dataInfo;
        }

        public void setDataInfo(ShopDataInfo dataInfo) {
            this.dataInfo = dataInfo;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Long getApprovedTime() {
            return approvedTime;
        }

        public void setApprovedTime(Long approvedTime) {
            this.approvedTime = approvedTime;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ShopDataInfo {

        @JsonProperty("gmv")
        private Long gmv;

        @JsonProperty("product_number")
        private Long productNumber;

        @JsonProperty("settle_amount")
        private Long settleAmount;

        @JsonProperty("unsettle_amount")
        private Long unsettleAmount;

        @JsonProperty("product_number_today")
        private Long productNumberToday;

        @JsonProperty("product_number_sold_today")
        private Long productNumberSoldToday;

        public Long getGmv() {
            return gmv;
        }

        public void setGmv(Long gmv) {
            this.gmv = gmv;
        }

        public Long getProductNumber() {
            return productNumber;
        }

        public void setProductNumber(Long productNumber) {
            this.productNumber = productNumber;
        }

        public Long getSettleAmount() {
            return settleAmount;
        }

        public void setSettleAmount(Long settleAmount) {
            this.settleAmount = settleAmount;
        }

        public Long getUnsettleAmount() {
            return unsettleAmount;
        }

        public void setUnsettleAmount(Long unsettleAmount) {
            this.unsettleAmount = unsettleAmount;
        }

        public Long getProductNumberToday() {
            return productNumberToday;
        }

        public void setProductNumberToday(Long productNumberToday) {
            this.productNumberToday = productNumberToday;
        }

        public Long getProductNumberSoldToday() {
            return productNumberSoldToday;
        }

        public void setProductNumberSoldToday(Long productNumberSoldToday) {
            this.productNumberSoldToday = productNumberSoldToday;
        }
    }
}
