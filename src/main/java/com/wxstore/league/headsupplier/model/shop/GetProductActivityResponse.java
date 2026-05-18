package com.wxstore.league.headsupplier.model.shop;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetProductActivityResponse extends WxApiResponse {

    @JsonProperty("has_activity")
    private Boolean hasActivity;

    @JsonProperty("product_activity_list")
    private List<ProductActivity> productActivityList;

    public Boolean getHasActivity() {
        return hasActivity;
    }

    public void setHasActivity(Boolean hasActivity) {
        this.hasActivity = hasActivity;
    }

    public List<ProductActivity> getProductActivityList() {
        return productActivityList;
    }

    public void setProductActivityList(List<ProductActivity> productActivityList) {
        this.productActivityList = productActivityList;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ProductActivity {

        @JsonProperty("product_id")
        private Long productId;

        @JsonProperty("sku_id")
        private Long skuId;

        @JsonProperty("activity_price")
        private Long activityPrice;

        @JsonProperty("platform_subsidy")
        private Long platformSubsidy;

        @JsonProperty("platform_subsidy_cnt")
        private Long platformSubsidyCnt;

        @JsonProperty("activity_sub_type")
        private Integer activitySubType;

        @JsonProperty("activity_end_time")
        private Long activityEndTime;

        @JsonProperty("activity_name")
        private String activityName;

        @JsonProperty("stock_mode")
        private Integer stockMode;

        @JsonProperty("stock_number")
        private Long stockNumber;

        public Long getProductId() {
            return productId;
        }

        public void setProductId(Long productId) {
            this.productId = productId;
        }

        public Long getSkuId() {
            return skuId;
        }

        public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Long getActivityPrice() {
            return activityPrice;
        }

        public void setActivityPrice(Long activityPrice) {
            this.activityPrice = activityPrice;
        }

        public Long getPlatformSubsidy() {
            return platformSubsidy;
        }

        public void setPlatformSubsidy(Long platformSubsidy) {
            this.platformSubsidy = platformSubsidy;
        }

        public Long getPlatformSubsidyCnt() {
            return platformSubsidyCnt;
        }

        public void setPlatformSubsidyCnt(Long platformSubsidyCnt) {
            this.platformSubsidyCnt = platformSubsidyCnt;
        }

        public Integer getActivitySubType() {
            return activitySubType;
        }

        public void setActivitySubType(Integer activitySubType) {
            this.activitySubType = activitySubType;
        }

        public Long getActivityEndTime() {
            return activityEndTime;
        }

        public void setActivityEndTime(Long activityEndTime) {
            this.activityEndTime = activityEndTime;
        }

        public String getActivityName() {
            return activityName;
        }

        public void setActivityName(String activityName) {
            this.activityName = activityName;
        }

        public Integer getStockMode() {
            return stockMode;
        }

        public void setStockMode(Integer stockMode) {
            this.stockMode = stockMode;
        }

        public Long getStockNumber() {
            return stockNumber;
        }

        public void setStockNumber(Long stockNumber) {
            this.stockNumber = stockNumber;
        }
    }
}
