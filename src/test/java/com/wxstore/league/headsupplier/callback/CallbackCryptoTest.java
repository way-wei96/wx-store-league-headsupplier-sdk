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

    @Test
    void encryptAndDecryptRoundTrip() {
        String appId = "wxba5fad812f8e6fb9";
        CallbackCrypto crypto = new CallbackCrypto("AAAAA", paddingKey(), appId);
        String plain = "{\"MsgType\":\"event\",\"Event\":\"debug_demo\",\"debug_str\":\"hello\"}";
        CallbackCrypto.EncryptedReply reply = crypto.encryptReply(plain);
        assertTrue(crypto.verifyMsgSignature(reply.getMsgSignature(), reply.getTimeStamp(), reply.getNonce(), reply.getEncrypt()));
        assertEquals(plain, crypto.decrypt(reply.getEncrypt()));
    }

    private static String paddingKey() {
        return "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    }
}
