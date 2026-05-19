package com.wxstore.league.headsupplier.model.callback;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/** 机构商品变更通知（head_supplier_item_update）。 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeadSupplierItemUpdateEvent extends CallbackEventMessage {

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

        @JsonProperty("version")
        private String version;

        @JsonProperty("update_fields")
        private List<String> updateFields;

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

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public List<String> getUpdateFields() {
            return updateFields;
        }

        public void setUpdateFields(List<String> updateFields) {
            this.updateFields = updateFields;
        }
    }
}
