package com.wxstore.league.headsupplier.api;

import com.wxstore.league.headsupplier.WxApiPaths;
import com.wxstore.league.headsupplier.config.WxLeagueHeadSupplierConfig;
import com.wxstore.league.headsupplier.http.ApiExecutor;
import com.wxstore.league.headsupplier.model.basic.AccessTokenResponse;
import com.wxstore.league.headsupplier.model.basic.CallbackCheckRequest;
import com.wxstore.league.headsupplier.model.basic.CallbackCheckResponse;
import com.wxstore.league.headsupplier.model.basic.ClearApiQuotaRequest;
import com.wxstore.league.headsupplier.model.basic.ClearQuotaByAppSecretRequest;
import com.wxstore.league.headsupplier.model.basic.ClearQuotaRequest;
import com.wxstore.league.headsupplier.model.basic.GetApiQuotaRequest;
import com.wxstore.league.headsupplier.model.basic.GetApiQuotaResponse;
import com.wxstore.league.headsupplier.model.basic.GetIpListResponse;
import com.wxstore.league.headsupplier.model.basic.StableAccessTokenRequest;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;

import java.util.Collections;
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
                WxApiPaths.GET_ACCESS_TOKEN,
                Map.of(
                        "grant_type", "client_credential",
                        "appid", config.getAppId(),
                        "secret", config.getAppSecret()),
                AccessTokenResponse.class);
    }

    /**
     * 获取稳定版接口调用凭据（推荐，与 getAccessToken 隔离）。
     */
    public AccessTokenResponse getStableAccessToken(boolean forceRefresh) {
        StableAccessTokenRequest request =
                StableAccessTokenRequest.of(config.getAppId(), config.getAppSecret());
        request.setForceRefresh(forceRefresh);
        return executor.postWithoutToken(WxApiPaths.GET_STABLE_ACCESS_TOKEN, request, AccessTokenResponse.class);
    }

    /**
     * 查询指定 API 的每日额度与频率限制。
     */
    public GetApiQuotaResponse getApiQuota(GetApiQuotaRequest request) {
        return executor.post(WxApiPaths.GET_API_QUOTA, request, GetApiQuotaResponse.class);
    }

    /**
     * 清空当前账号当日 API 调用次数（每月限 10 次）。
     */
    public WxApiResponse clearQuota() {
        return clearQuota(config.getAppId());
    }

    /**
     * 清空指定 appid 当日 API 调用次数。
     */
    public WxApiResponse clearQuota(String appid) {
        return executor.post(WxApiPaths.CLEAR_QUOTA, ClearQuotaRequest.of(appid), WxApiResponse.class);
    }

    /**
     * 使用 AppSecret 清空 API 调用次数（无需 access_token）。
     */
    public WxApiResponse clearQuotaByAppSecret() {
        return executor.postWithoutToken(
                WxApiPaths.CLEAR_QUOTA_V2,
                ClearQuotaByAppSecretRequest.of(config.getAppId(), config.getAppSecret()),
                WxApiResponse.class);
    }

    /**
     * 重置指定接口的每日调用次数（每月限 50 次）。
     */
    public WxApiResponse clearApiQuota(ClearApiQuotaRequest request) {
        return executor.post(WxApiPaths.CLEAR_API_QUOTA, request, WxApiResponse.class);
    }

    /**
     * 获取微信 API 服务器 IP 列表。
     */
    public GetIpListResponse getApiDomainIp() {
        return executor.get(WxApiPaths.GET_API_DOMAIN_IP, Collections.emptyMap(), GetIpListResponse.class);
    }

    /**
     * 获取微信推送服务器 IP 列表。
     */
    public GetIpListResponse getCallbackIp() {
        return executor.get(WxApiPaths.GET_CALLBACK_IP, Collections.emptyMap(), GetIpListResponse.class);
    }

    /**
     * 回调 URL 网络通信检测（DNS / Ping）。
     */
    public CallbackCheckResponse callbackCheck(CallbackCheckRequest request) {
        return executor.post(WxApiPaths.CALLBACK_CHECK, request, CallbackCheckResponse.class);
    }
}
