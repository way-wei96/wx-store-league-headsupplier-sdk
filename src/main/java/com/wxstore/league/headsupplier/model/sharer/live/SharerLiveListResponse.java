package com.wxstore.league.headsupplier.model.sharer.live;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wxstore.league.headsupplier.model.sharer.SharerPageResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SharerLiveListResponse extends SharerPageResponse {
    // 列表字段因接口而异，由 @JsonIgnoreProperties 保留原始 JSON 扩展字段
}
