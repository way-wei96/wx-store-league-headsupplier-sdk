package com.wxstore.league.headsupplier.model.sharer.coupon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SharerCouponDetailResponse extends WxApiResponse {

    @JsonProperty("coupon")
    private Object coupon;

    public Object getCoupon() {
        return coupon;
    }

    public void setCoupon(Object coupon) {
        this.coupon = coupon;
    }
}
