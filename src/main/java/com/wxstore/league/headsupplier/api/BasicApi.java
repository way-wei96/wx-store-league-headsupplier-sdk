package com.wxstore.league.headsupplier.api;

import com.wxstore.league.headsupplier.config.WxLeagueHeadSupplierConfig;
import com.wxstore.league.headsupplier.http.ApiExecutor;
import com.wxstore.league.headsupplier.model.basic.AccessTokenResponse;
import com.wxstore.league.headsupplier.model.basic.StableAccessTokenRequest;

import java.util.Map;

/**
 * 基础接口。
 *
 * @see <a href="https://developers.weixin.qq.com/doc/store/leagueheadsupplier/api/basic/">官方文档</a>
 */
public final class BasicApi {

    private final ApiExecutor executor;
    private final WxLeagueHeadSupplierConfig config;

    public BasicApi(ApiExecutor executor, WxLeagueHeadSupplierConfig config) {
        this.executor = executor;
        this.config = config;
    }

    /**
     * 获取接口调用凭据（与 {@link com.wxstore.league.headsupplier.token.AccessTokenService} 使用同一接口）。
     */
    public AccessTokenResponse getAccessToken() {
        return executor.get(
                "/cgi-bin/token",
                Map.of(
                        "grant_type", "client_credential",
                        "appid", config.getAppId(),
                        "secret", config.getAppSecret()),
                AccessTokenResponse.class);
    }

    /**
     * 获取稳定版接口调用凭据。
     */
    public AccessTokenResponse getStableAccessToken(boolean forceRefresh) {
        StableAccessTokenRequest request =
                StableAccessTokenRequest.of(config.getAppId(), config.getAppSecret());
        request.setForceRefresh(forceRefresh);
        return executor.postWithoutToken("/cgi-bin/stable_token", request, AccessTokenResponse.class);
    }
}
