package com.wxstore.league.headsupplier.model.sharer.video;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

import java.util.List;

/** get_feed_promotion_info / get_shop_feed_promotion_info 响应。 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetFeedPromotionInfoResponse extends WxApiResponse {

    @JsonProperty("feed_list")
    private List<FeedPromotionItem> feedList;

    public List<FeedPromotionItem> getFeedList() {
        return feedList;
    }

    public void setFeedList(List<FeedPromotionItem> feedList) {
        this.feedList = feedList;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class FeedPromotionItem {

        @JsonProperty("export_id")
        private String exportId;

        @JsonProperty("feed_token")
        private String feedToken;

        @JsonProperty("promoter_share_link")
        private String promoterShareLink;

        public String getExportId() {
            return exportId;
        }

        public void setExportId(String exportId) {
            this.exportId = exportId;
        }

        public String getFeedToken() {
            return feedToken;
        }

        public void setFeedToken(String feedToken) {
            this.feedToken = feedToken;
        }

        public String getPromoterShareLink() {
            return promoterShareLink;
        }

        public void setPromoterShareLink(String promoterShareLink) {
            this.promoterShareLink = promoterShareLink;
        }
    }
}
