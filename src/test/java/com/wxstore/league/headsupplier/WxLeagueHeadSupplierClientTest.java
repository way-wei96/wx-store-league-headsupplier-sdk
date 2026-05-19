package com.wxstore.league.headsupplier;

import com.wxstore.league.headsupplier.callback.CallbackCrypto;
import com.wxstore.league.headsupplier.callback.CallbackMessageParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class WxLeagueHeadSupplierClientTest {

    @Test
    void createCallbackHelpers() {
        WxLeagueHeadSupplierClient client = WxLeagueHeadSupplierClient.builder()
                .appId("wx_test_app")
                .appSecret("secret")
                .build();
        CallbackCrypto crypto = client.createCallbackCrypto("token", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        CallbackMessageParser parser = client.createCallbackMessageParser();
        assertNotNull(crypto);
        assertNotNull(parser);
        assertEquals("wx_test_app", client.getConfig().getAppId());
    }
}
