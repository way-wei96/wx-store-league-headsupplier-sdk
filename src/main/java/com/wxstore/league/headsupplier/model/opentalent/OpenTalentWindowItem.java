package com.wxstore.league.headsupplier.model.opentalent;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenTalentWindowItem {

    @JsonProperty("appid")
    private String appid;

    @JsonProperty("product_id")
    private Long productId;

    @JsonProperty("product_window_id")
    private Long productWindowId;

    @JsonProperty("is_operation_allowed")
    private Boolean isOperationAllowed;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductWindowId() {
        return productWindowId;
    }

    public void setProductWindowId(Long productWindowId) {
        this.productWindowId = productWindowId;
    }

    public Boolean getIsOperationAllowed() {
        return isOperationAllowed;
    }

    public void setIsOperationAllowed(Boolean isOperationAllowed) {
        this.isOperationAllowed = isOperationAllowed;
    }
}
