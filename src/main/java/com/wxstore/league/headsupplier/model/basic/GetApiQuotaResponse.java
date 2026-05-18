package com.wxstore.league.headsupplier.model.basic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetApiQuotaResponse extends WxApiResponse {

    private QuotaDetail quota;

    @JsonProperty("rate_limit")
    private RateLimit rateLimit;

    @JsonProperty("component_rate_limit")
    private RateLimit componentRateLimit;

    public QuotaDetail getQuota() {
        return quota;
    }

    public void setQuota(QuotaDetail quota) {
        this.quota = quota;
    }

    public RateLimit getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(RateLimit rateLimit) {
        this.rateLimit = rateLimit;
    }

    public RateLimit getComponentRateLimit() {
        return componentRateLimit;
    }

    public void setComponentRateLimit(RateLimit componentRateLimit) {
        this.componentRateLimit = componentRateLimit;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class QuotaDetail {

        @JsonProperty("daily_limit")
        private Long dailyLimit;

        private Long used;
        private Long remain;

        public Long getDailyLimit() {
            return dailyLimit;
        }

        public void setDailyLimit(Long dailyLimit) {
            this.dailyLimit = dailyLimit;
        }

        public Long getUsed() {
            return used;
        }

        public void setUsed(Long used) {
            this.used = used;
        }

        public Long getRemain() {
            return remain;
        }

        public void setRemain(Long remain) {
            this.remain = remain;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RateLimit {

        @JsonProperty("call_count")
        private Long callCount;

        @JsonProperty("refresh_second")
        private Long refreshSecond;

        public Long getCallCount() {
            return callCount;
        }

        public void setCallCount(Long callCount) {
            this.callCount = callCount;
        }

        public Long getRefreshSecond() {
            return refreshSecond;
        }

        public void setRefreshSecond(Long refreshSecond) {
            this.refreshSecond = refreshSecond;
        }
    }
}
