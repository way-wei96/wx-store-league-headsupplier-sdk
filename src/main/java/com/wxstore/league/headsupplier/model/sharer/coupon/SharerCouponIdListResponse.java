package com.wxstore.league.headsupplier.model.sharer.coupon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageResponse;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SharerCouponIdListResponse extends SharerPageResponse {

    @JsonProperty("coupon_ids")
    private List<String> couponIds;

    public List<String> getCouponIds() {
        return couponIds;
    }

    public void setCouponIds(List<String> couponIds) {
        this.couponIds = couponIds;
    }
}
