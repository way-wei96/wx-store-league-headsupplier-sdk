package com.wxstore.league.headsupplier.model.sharer.live;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SharerLiveStatsResponse extends WxApiResponse {
    // 统计字段较多且会变更，使用 ignoreUnknown 接收完整 JSON
}
