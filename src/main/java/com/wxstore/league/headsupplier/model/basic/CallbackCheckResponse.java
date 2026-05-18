package com.wxstore.league.headsupplier.model.basic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CallbackCheckResponse extends WxApiResponse {

    private List<DnsResult> dns;
    private List<PingResult> ping;

    public List<DnsResult> getDns() {
        return dns;
    }

    public void setDns(List<DnsResult> dns) {
        this.dns = dns;
    }

    public List<PingResult> getPing() {
        return ping;
    }

    public void setPing(List<PingResult> ping) {
        this.ping = ping;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DnsResult {

        private String ip;

        @JsonProperty("real_operator")
        private String realOperator;

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getRealOperator() {
            return realOperator;
        }

        public void setRealOperator(String realOperator) {
            this.realOperator = realOperator;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PingResult {

        private String ip;

        @JsonProperty("from_operator")
        private String fromOperator;

        @JsonProperty("package_loss")
        private String packageLoss;

        private String time;

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getFromOperator() {
            return fromOperator;
        }

        public void setFromOperator(String fromOperator) {
            this.fromOperator = fromOperator;
        }

        public String getPackageLoss() {
            return packageLoss;
        }

        public void setPackageLoss(String packageLoss) {
            this.packageLoss = packageLoss;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
