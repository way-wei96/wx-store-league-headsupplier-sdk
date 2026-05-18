package com.wxstore.league.headsupplier.model.headsupplier;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetShopLockTimeResponse extends WxApiResponse {

    @JsonProperty("shopsetting_product_click_lock_day")
    private Integer shopsettingProductClickLockDay;

    @JsonProperty("shopsetting_product_order_lock_day")
    private Integer shopsettingProductOrderLockDay;

    @JsonProperty("shopsetting_content_click_lock_day")
    private Integer shopsettingContentClickLockDay;

    @JsonProperty("shopsetting_content_order_lock_day")
    private Integer shopsettingContentOrderLockDay;

    @JsonProperty("default_product_click_lock_day")
    private Integer defaultProductClickLockDay;

    @JsonProperty("default_product_order_lock_day")
    private Integer defaultProductOrderLockDay;

    @JsonProperty("default_content_click_lock_day")
    private Integer defaultContentClickLockDay;

    @JsonProperty("default_content_order_lock_day")
    private Integer defaultContentOrderLockDay;

    public Integer getShopsettingProductClickLockDay() {
        return shopsettingProductClickLockDay;
    }

    public void setShopsettingProductClickLockDay(Integer shopsettingProductClickLockDay) {
        this.shopsettingProductClickLockDay = shopsettingProductClickLockDay;
    }

    public Integer getShopsettingProductOrderLockDay() {
        return shopsettingProductOrderLockDay;
    }

    public void setShopsettingProductOrderLockDay(Integer shopsettingProductOrderLockDay) {
        this.shopsettingProductOrderLockDay = shopsettingProductOrderLockDay;
    }

    public Integer getShopsettingContentClickLockDay() {
        return shopsettingContentClickLockDay;
    }

    public void setShopsettingContentClickLockDay(Integer shopsettingContentClickLockDay) {
        this.shopsettingContentClickLockDay = shopsettingContentClickLockDay;
    }

    public Integer getShopsettingContentOrderLockDay() {
        return shopsettingContentOrderLockDay;
    }

    public void setShopsettingContentOrderLockDay(Integer shopsettingContentOrderLockDay) {
        this.shopsettingContentOrderLockDay = shopsettingContentOrderLockDay;
    }

    public Integer getDefaultProductClickLockDay() {
        return defaultProductClickLockDay;
    }

    public void setDefaultProductClickLockDay(Integer defaultProductClickLockDay) {
        this.defaultProductClickLockDay = defaultProductClickLockDay;
    }

    public Integer getDefaultProductOrderLockDay() {
        return defaultProductOrderLockDay;
    }

    public void setDefaultProductOrderLockDay(Integer defaultProductOrderLockDay) {
        this.defaultProductOrderLockDay = defaultProductOrderLockDay;
    }

    public Integer getDefaultContentClickLockDay() {
        return defaultContentClickLockDay;
    }

    public void setDefaultContentClickLockDay(Integer defaultContentClickLockDay) {
        this.defaultContentClickLockDay = defaultContentClickLockDay;
    }

    public Integer getDefaultContentOrderLockDay() {
        return defaultContentOrderLockDay;
    }

    public void setDefaultContentOrderLockDay(Integer defaultContentOrderLockDay) {
        this.defaultContentOrderLockDay = defaultContentOrderLockDay;
    }
}
