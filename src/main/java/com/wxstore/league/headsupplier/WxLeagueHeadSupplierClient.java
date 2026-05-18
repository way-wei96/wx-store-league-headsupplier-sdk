package com.wxstore.league.headsupplier;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wxstore.league.headsupplier.api.BalanceApi;
import com.wxstore.league.headsupplier.api.BasicApi;
import com.wxstore.league.headsupplier.api.CategoryApi;
import com.wxstore.league.headsupplier.api.HeadSupplierApi;
import com.wxstore.league.headsupplier.api.OrderApi;
import com.wxstore.league.headsupplier.api.SharerApi;
import com.wxstore.league.headsupplier.api.ShopApi;
import com.wxstore.league.headsupplier.config.WxLeagueHeadSupplierConfig;
import com.wxstore.league.headsupplier.http.ApiExecutor;
import com.wxstore.league.headsupplier.http.JsonMapperFactory;
import com.wxstore.league.headsupplier.token.AccessTokenService;

/**
 * 微信小店联盟带货机构 SDK 入口。
 *
 * <pre>{@code
 * WxLeagueHeadSupplierClient client = WxLeagueHeadSupplierClient.builder()
 *     .appId("your-app-id")
 *     .appSecret("your-app-secret")
 *     .build();
 *
 * GetShopListResponse shops = client.headSupplier()
 *     .getShopList(GetShopListRequest.of(10));
 * }</pre>
 */
public final class WxLeagueHeadSupplierClient {

    private final WxLeagueHeadSupplierConfig config;
    private final ObjectMapper objectMapper;
    private final AccessTokenService accessTokenService;
    private final ApiExecutor apiExecutor;
    private final BasicApi basicApi;
    private final ShopApi shopApi;
    private final OrderApi orderApi;
    private final BalanceApi balanceApi;
    private final HeadSupplierApi headSupplierApi;
    private final CategoryApi categoryApi;
    private final SharerApi sharerApi;

    private WxLeagueHeadSupplierClient(WxLeagueHeadSupplierConfig config) {
        this.config = config;
        this.objectMapper = JsonMapperFactory.create();
        this.accessTokenService = new AccessTokenService(config, objectMapper);
        this.apiExecutor = new ApiExecutor(config, objectMapper, accessTokenService);
        this.basicApi = new BasicApi(apiExecutor, config);
        this.shopApi = new ShopApi(apiExecutor);
        this.orderApi = new OrderApi(apiExecutor);
        this.balanceApi = new BalanceApi(apiExecutor);
        this.headSupplierApi = new HeadSupplierApi(apiExecutor);
        this.categoryApi = new CategoryApi(apiExecutor);
        this.sharerApi = new SharerApi(apiExecutor);
    }

    public static Builder builder() {
        return new Builder();
    }

    public WxLeagueHeadSupplierConfig getConfig() {
        return config;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public AccessTokenService getAccessTokenService() {
        return accessTokenService;
    }

    public ApiExecutor getApiExecutor() {
        return apiExecutor;
    }

    public BasicApi basic() {
        return basicApi;
    }

    public ShopApi shop() {
        return shopApi;
    }

    public OrderApi order() {
        return orderApi;
    }

    public BalanceApi balance() {
        return balanceApi;
    }

    public HeadSupplierApi headSupplier() {
        return headSupplierApi;
    }

    public CategoryApi category() {
        return categoryApi;
    }

    public SharerApi sharer() {
        return sharerApi;
    }

    public static final class Builder {
        private String appId;
        private String appSecret;
        private String baseUrl = WxLeagueHeadSupplierConfig.DEFAULT_BASE_URL;

        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        public Builder appSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }

        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public WxLeagueHeadSupplierClient build() {
            WxLeagueHeadSupplierConfig config = WxLeagueHeadSupplierConfig.builder()
                    .appId(appId)
                    .appSecret(appSecret)
                    .baseUrl(baseUrl)
                    .build();
            return new WxLeagueHeadSupplierClient(config);
        }
    }
}
