package com.wxstore.league.headsupplier.model.callback;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 机构佣金单变更回调（head_supplier_commission_order_update）。 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeadSupplierCommissionOrderUpdateEvent extends CallbackEventMessage {

    @JsonProperty("order_info")
    private OrderInfo orderInfo;

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class OrderInfo {

        @JsonProperty("order_id")
        private String orderId;

        @JsonProperty("sku_id")
        private String skuId;

        @JsonProperty("commission_order_status")
        private Integer commissionOrderStatus;

        @JsonProperty("order_status")
        private Integer orderStatus;

        @JsonProperty("version")
        private String version;

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getSkuId() {
            return skuId;
        }

        public void setSkuId(String skuId) {
            this.skuId = skuId;
        }

        public Integer getCommissionOrderStatus() {
            return commissionOrderStatus;
        }

        public void setCommissionOrderStatus(Integer commissionOrderStatus) {
            this.commissionOrderStatus = commissionOrderStatus;
        }

        public Integer getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }
    }
}
