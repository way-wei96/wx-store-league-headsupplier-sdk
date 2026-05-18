package com.wxstore.league.headsupplier.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommissionInfo {

    @JsonProperty("finder_info")
    private ParticipantInfo finderInfo;

    @JsonProperty("service_ratio")
    private Long serviceRatio;

    @JsonProperty("service_amount")
    private Long serviceAmount;

    @JsonProperty("profit_sharding_suc_time")
    private Long profitShardingSucTime;

    @JsonProperty("promotion_channel")
    private Integer promotionChannel;

    @JsonProperty("sharer_info")
    private ParticipantInfo sharerInfo;

    @JsonProperty("talent_info")
    private ParticipantInfo talentInfo;

    @JsonProperty("promotion_info")
    private PromotionInfo promotionInfo;

    @JsonProperty("sub_agency_info")
    private AgencyInfo subAgencyInfo;

    @JsonProperty("promoter_agency_info")
    private AgencyInfo promoterAgencyInfo;

    @JsonProperty("head_agency_info")
    private AgencyInfo headAgencyInfo;

    @JsonProperty("platform_amount")
    private Long platformAmount;

    @JsonProperty("platform_commission_status")
    private Integer platformCommissionStatus;

    @JsonProperty("service_total_amount")
    private Long serviceTotalAmount;

    public ParticipantInfo getFinderInfo() {
        return finderInfo;
    }

    public void setFinderInfo(ParticipantInfo finderInfo) {
        this.finderInfo = finderInfo;
    }

    public Long getServiceRatio() {
        return serviceRatio;
    }

    public void setServiceRatio(Long serviceRatio) {
        this.serviceRatio = serviceRatio;
    }

    public Long getServiceAmount() {
        return serviceAmount;
    }

    public void setServiceAmount(Long serviceAmount) {
        this.serviceAmount = serviceAmount;
    }

    public Long getProfitShardingSucTime() {
        return profitShardingSucTime;
    }

    public void setProfitShardingSucTime(Long profitShardingSucTime) {
        this.profitShardingSucTime = profitShardingSucTime;
    }

    public Integer getPromotionChannel() {
        return promotionChannel;
    }

    public void setPromotionChannel(Integer promotionChannel) {
        this.promotionChannel = promotionChannel;
    }

    public ParticipantInfo getSharerInfo() {
        return sharerInfo;
    }

    public void setSharerInfo(ParticipantInfo sharerInfo) {
        this.sharerInfo = sharerInfo;
    }

    public ParticipantInfo getTalentInfo() {
        return talentInfo;
    }

    public void setTalentInfo(ParticipantInfo talentInfo) {
        this.talentInfo = talentInfo;
    }

    public PromotionInfo getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(PromotionInfo promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public AgencyInfo getSubAgencyInfo() {
        return subAgencyInfo;
    }

    public void setSubAgencyInfo(AgencyInfo subAgencyInfo) {
        this.subAgencyInfo = subAgencyInfo;
    }

    public AgencyInfo getPromoterAgencyInfo() {
        return promoterAgencyInfo;
    }

    public void setPromoterAgencyInfo(AgencyInfo promoterAgencyInfo) {
        this.promoterAgencyInfo = promoterAgencyInfo;
    }

    public AgencyInfo getHeadAgencyInfo() {
        return headAgencyInfo;
    }

    public void setHeadAgencyInfo(AgencyInfo headAgencyInfo) {
        this.headAgencyInfo = headAgencyInfo;
    }

    public Long getPlatformAmount() {
        return platformAmount;
    }

    public void setPlatformAmount(Long platformAmount) {
        this.platformAmount = platformAmount;
    }

    public Integer getPlatformCommissionStatus() {
        return platformCommissionStatus;
    }

    public void setPlatformCommissionStatus(Integer platformCommissionStatus) {
        this.platformCommissionStatus = platformCommissionStatus;
    }

    public Long getServiceTotalAmount() {
        return serviceTotalAmount;
    }

    public void setServiceTotalAmount(Long serviceTotalAmount) {
        this.serviceTotalAmount = serviceTotalAmount;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ParticipantInfo {

        private String nickname;
        private Long ratio;
        private Long amount;

        @JsonProperty("openfinderid")
        private String openfinderid;

        @JsonProperty("sharer_appid")
        private String sharerAppid;

        @JsonProperty("opensharerid")
        private String opensharerid;

        @JsonProperty("talent_appid")
        private String talentAppid;

        @JsonProperty("opentalentid")
        private String opentalentid;

        @JsonProperty("head_img_url")
        private String headImgUrl;

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public Long getRatio() {
            return ratio;
        }

        public void setRatio(Long ratio) {
            this.ratio = ratio;
        }

        public Long getAmount() {
            return amount;
        }

        public void setAmount(Long amount) {
            this.amount = amount;
        }

        public String getOpenfinderid() {
            return openfinderid;
        }

        public void setOpenfinderid(String openfinderid) {
            this.openfinderid = openfinderid;
        }

        public String getSharerAppid() {
            return sharerAppid;
        }

        public void setSharerAppid(String sharerAppid) {
            this.sharerAppid = sharerAppid;
        }

        public String getOpensharerid() {
            return opensharerid;
        }

        public void setOpensharerid(String opensharerid) {
            this.opensharerid = opensharerid;
        }

        public String getTalentAppid() {
            return talentAppid;
        }

        public void setTalentAppid(String talentAppid) {
            this.talentAppid = talentAppid;
        }

        public String getOpentalentid() {
            return opentalentid;
        }

        public void setOpentalentid(String opentalentid) {
            this.opentalentid = opentalentid;
        }

        public String getHeadImgUrl() {
            return headImgUrl;
        }

        public void setHeadImgUrl(String headImgUrl) {
            this.headImgUrl = headImgUrl;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AgencyInfo {

        private String appid;
        private String nickname;
        private Long ratio;
        private Long amount;

        @JsonProperty("profit_sharding_suc_time")
        private Long profitShardingSucTime;

        @JsonProperty("head_img_url")
        private String headImgUrl;

        public String getAppid() {
            return appid;
        }

        public void setAppid(String appid) {
            this.appid = appid;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public Long getRatio() {
            return ratio;
        }

        public void setRatio(Long ratio) {
            this.ratio = ratio;
        }

        public Long getAmount() {
            return amount;
        }

        public void setAmount(Long amount) {
            this.amount = amount;
        }

        public Long getProfitShardingSucTime() {
            return profitShardingSucTime;
        }

        public void setProfitShardingSucTime(Long profitShardingSucTime) {
            this.profitShardingSucTime = profitShardingSucTime;
        }

        public String getHeadImgUrl() {
            return headImgUrl;
        }

        public void setHeadImgUrl(String headImgUrl) {
            this.headImgUrl = headImgUrl;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PromotionInfo {

        @JsonProperty("channel_type")
        private Integer channelType;

        @JsonProperty("finder_info")
        private PromotionChannelFinderInfo finderInfo;

        @JsonProperty("mp_info")
        private PromotionChannelMpInfo mpInfo;

        @JsonProperty("talent_info")
        private PromotionChannelTalentInfo talentInfo;

        @JsonProperty("custom_token")
        private String customToken;

        public Integer getChannelType() {
            return channelType;
        }

        public void setChannelType(Integer channelType) {
            this.channelType = channelType;
        }

        public PromotionChannelFinderInfo getFinderInfo() {
            return finderInfo;
        }

        public void setFinderInfo(PromotionChannelFinderInfo finderInfo) {
            this.finderInfo = finderInfo;
        }

        public PromotionChannelMpInfo getMpInfo() {
            return mpInfo;
        }

        public void setMpInfo(PromotionChannelMpInfo mpInfo) {
            this.mpInfo = mpInfo;
        }

        public PromotionChannelTalentInfo getTalentInfo() {
            return talentInfo;
        }

        public void setTalentInfo(PromotionChannelTalentInfo talentInfo) {
            this.talentInfo = talentInfo;
        }

        public String getCustomToken() {
            return customToken;
        }

        public void setCustomToken(String customToken) {
            this.customToken = customToken;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PromotionChannelFinderInfo {

        @JsonProperty("finder_id")
        private String finderId;

        private String nickname;

        private String openfinderid;

        public String getFinderId() {
            return finderId;
        }

        public void setFinderId(String finderId) {
            this.finderId = finderId;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getOpenfinderid() {
            return openfinderid;
        }

        public void setOpenfinderid(String openfinderid) {
            this.openfinderid = openfinderid;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PromotionChannelMpInfo {

        private String appid;
        private String nickname;

        public String getAppid() {
            return appid;
        }

        public void setAppid(String appid) {
            this.appid = appid;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PromotionChannelTalentInfo {

        @JsonProperty("talent_appid")
        private String talentAppid;

        private String nickname;

        private String opentalentid;

        public String getTalentAppid() {
            return talentAppid;
        }

        public void setTalentAppid(String talentAppid) {
            this.talentAppid = talentAppid;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getOpentalentid() {
            return opentalentid;
        }

        public void setOpentalentid(String opentalentid) {
            this.opentalentid = opentalentid;
        }
    }
}
