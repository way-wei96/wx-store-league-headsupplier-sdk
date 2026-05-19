package com.wxstore.league.headsupplier.model.opentalent;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemPromotionDetail {

    @JsonProperty("product_id")
    private Long productId;

    @JsonProperty("shop_appid")
    private String shopAppid;

    @JsonProperty("spu_source")
    private Integer spuSource;

    @JsonProperty("commission_info")
    private CommissionInfo commissionInfo;

    @JsonProperty("head_supplier_info")
    private HeadSupplierInfo headSupplierInfo;

    @JsonProperty("cooperative_info")
    private CooperativeInfo cooperativeInfo;

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

    public Integer getSpuSource() {
        return spuSource;
    }

    public void setSpuSource(Integer spuSource) {
        this.spuSource = spuSource;
    }

    public CommissionInfo getCommissionInfo() {
        return commissionInfo;
    }

    public void setCommissionInfo(CommissionInfo commissionInfo) {
        this.commissionInfo = commissionInfo;
    }

    public HeadSupplierInfo getHeadSupplierInfo() {
        return headSupplierInfo;
    }

    public void setHeadSupplierInfo(HeadSupplierInfo headSupplierInfo) {
        this.headSupplierInfo = headSupplierInfo;
    }

    public CooperativeInfo getCooperativeInfo() {
        return cooperativeInfo;
    }

    public void setCooperativeInfo(CooperativeInfo cooperativeInfo) {
        this.cooperativeInfo = cooperativeInfo;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CommissionInfo {

        @JsonProperty("plan_type")
        private Integer planType;

        @JsonProperty("commission_type")
        private Integer commissionType;

        @JsonProperty("ratio")
        private Long ratio;

        @JsonProperty("service_ratio")
        private Long serviceRatio;

        @JsonProperty("start_time")
        private Long startTime;

        @JsonProperty("end_time")
        private Long endTime;

        public Integer getPlanType() {
            return planType;
        }

        public void setPlanType(Integer planType) {
            this.planType = planType;
        }

        public Integer getCommissionType() {
            return commissionType;
        }

        public void setCommissionType(Integer commissionType) {
            this.commissionType = commissionType;
        }

        public Long getRatio() {
            return ratio;
        }

        public void setRatio(Long ratio) {
            this.ratio = ratio;
        }

        public Long getServiceRatio() {
            return serviceRatio;
        }

        public void setServiceRatio(Long serviceRatio) {
            this.serviceRatio = serviceRatio;
        }

        public Long getStartTime() {
            return startTime;
        }

        public void setStartTime(Long startTime) {
            this.startTime = startTime;
        }

        public Long getEndTime() {
            return endTime;
        }

        public void setEndTime(Long endTime) {
            this.endTime = endTime;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class HeadSupplierInfo {

        @JsonProperty("name")
        private String name;

        @JsonProperty("head_img")
        private String headImg;

        @JsonProperty("appid")
        private String appid;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHeadImg() {
            return headImg;
        }

        public void setHeadImg(String headImg) {
            this.headImg = headImg;
        }

        public String getAppid() {
            return appid;
        }

        public void setAppid(String appid) {
            this.appid = appid;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CooperativeInfo {

        @JsonProperty("cooperative_status")
        private Integer cooperativeStatus;

        @JsonProperty("is_hidden")
        private Boolean isHidden;

        @JsonProperty("link")
        private String link;

        public Integer getCooperativeStatus() {
            return cooperativeStatus;
        }

        public void setCooperativeStatus(Integer cooperativeStatus) {
            this.cooperativeStatus = cooperativeStatus;
        }

        public Boolean getIsHidden() {
            return isHidden;
        }

        public void setIsHidden(Boolean isHidden) {
            this.isHidden = isHidden;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }
    }
}
