package com.wxstore.league.headsupplier.model.callback;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 订阅商品计划信息变更（head_supplier_subscribe_product_planinfo_update）。 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeadSupplierSubscribeProductPlanInfoUpdateEvent extends CallbackEventMessage {

    @JsonProperty("item_info")
    private ItemInfo itemInfo;

    public ItemInfo getItemInfo() {
        return itemInfo;
    }

    public void setItemInfo(ItemInfo itemInfo) {
        this.itemInfo = itemInfo;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ItemInfo {

        @JsonProperty("event_type")
        private Integer eventType;

        @JsonProperty("appid")
        private String appid;

        @JsonProperty("product_id")
        private String productId;

        @JsonProperty("plan_type")
        private Integer planType;

        @JsonProperty("plan_id")
        private String planId;

        @JsonProperty("plan_status")
        private Integer planStatus;

        @JsonProperty("head_supplier_item_link")
        private String headSupplierItemLink;

        @JsonProperty("version")
        private String version;

        @JsonProperty("service_ratio")
        private Integer serviceRatio;

        @JsonProperty("commission_ratio")
        private Integer commissionRatio;

        @JsonProperty("start_time")
        private Long startTime;

        @JsonProperty("end_time")
        private Long endTime;

        public Integer getEventType() {
            return eventType;
        }

        public void setEventType(Integer eventType) {
            this.eventType = eventType;
        }

        public String getAppid() {
            return appid;
        }

        public void setAppid(String appid) {
            this.appid = appid;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public Integer getPlanType() {
            return planType;
        }

        public void setPlanType(Integer planType) {
            this.planType = planType;
        }

        public String getPlanId() {
            return planId;
        }

        public void setPlanId(String planId) {
            this.planId = planId;
        }

        public Integer getPlanStatus() {
            return planStatus;
        }

        public void setPlanStatus(Integer planStatus) {
            this.planStatus = planStatus;
        }

        public String getHeadSupplierItemLink() {
            return headSupplierItemLink;
        }

        public void setHeadSupplierItemLink(String headSupplierItemLink) {
            this.headSupplierItemLink = headSupplierItemLink;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public Integer getServiceRatio() {
            return serviceRatio;
        }

        public void setServiceRatio(Integer serviceRatio) {
            this.serviceRatio = serviceRatio;
        }

        public Integer getCommissionRatio() {
            return commissionRatio;
        }

        public void setCommissionRatio(Integer commissionRatio) {
            this.commissionRatio = commissionRatio;
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
}
