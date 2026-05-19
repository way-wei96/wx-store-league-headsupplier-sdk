package com.wxstore.league.headsupplier.model.callback;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * API 变更日志回调（api_diff）。
 *
 * <p>文档字段可能随版本扩展，未列出的字段由 {@code @JsonIgnoreProperties(ignoreUnknown = true)} 忽略。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiDiffEvent extends CallbackEventMessage {

    @JsonProperty("api_diff_list")
    private List<ApiDiffEntry> apiDiffList;

    public List<ApiDiffEntry> getApiDiffList() {
        return apiDiffList;
    }

    public void setApiDiffList(List<ApiDiffEntry> apiDiffList) {
        this.apiDiffList = apiDiffList;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ApiDiffEntry {

        @JsonProperty("api_name")
        private String apiName;

        @JsonProperty("change_type")
        private Integer changeType;

        @JsonProperty("change_desc")
        private String changeDesc;

        public String getApiName() {
            return apiName;
        }

        public void setApiName(String apiName) {
            this.apiName = apiName;
        }

        public Integer getChangeType() {
            return changeType;
        }

        public void setChangeType(Integer changeType) {
            this.changeType = changeType;
        }

        public String getChangeDesc() {
            return changeDesc;
        }

        public void setChangeDesc(String changeDesc) {
            this.changeDesc = changeDesc;
        }
    }
}
