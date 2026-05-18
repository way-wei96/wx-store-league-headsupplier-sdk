package com.wxstore.league.headsupplier.callback;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CallbackCryptoTest {

    @Test
    void verifyPlainSignature() {
        CallbackCrypto crypto = new CallbackCrypto("AAAAA", paddingKey(), "wxba5fad812f8e6fb9");
        assertTrue(crypto.verifySignature(
                "899cf89e464efb63f54ddac96b0a0a235f53aa78", "1714037059", "486452656"));
    }

    private static String paddingKey() {
        return "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    }
}
