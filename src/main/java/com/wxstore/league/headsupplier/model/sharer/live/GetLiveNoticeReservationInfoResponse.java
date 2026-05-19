package com.wxstore.league.headsupplier.model.sharer.live;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetLiveNoticeReservationInfoResponse extends WxApiResponse {

    @JsonProperty("reservation_count")
    private Long reservationCount;

    public Long getReservationCount() {
        return reservationCount;
    }

    public void setReservationCount(Long reservationCount) {
        this.reservationCount = reservationCount;
    }
}
