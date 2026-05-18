package com.wxstore.league.headsupplier.callback;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;

/**
 * 回调验签与 AES 加解密（明文 / 安全模式）。
 *
 * @see <a href="https://developers.weixin.qq.com/doc/store/leagueheadsupplier/callback/allback_encoding.html">官方文档</a>
 */
public final class CallbackCrypto {

    private static final String AES_ALGORITHM = "AES/CBC/PKCS5Padding";
    private static final SecureRandom RANDOM = new SecureRandom();

    private final String token;
    private final byte[] aesKey;
    private final String appId;
    private final ObjectMapper objectMapper;

    public CallbackCrypto(String token, String encodingAesKey, String appId) {
        this(token, encodingAesKey, appId, new ObjectMapper());
    }

    public CallbackCrypto(String token, String encodingAesKey, String appId, ObjectMapper objectMapper) {
        this.token = token;
        this.appId = appId;
        this.objectMapper = objectMapper;
        this.aesKey = Base64.getDecoder().decode(encodingAesKey + "=");
    }

    /**
     * 明文模式：校验 URL signature。
     */
    public boolean verifySignature(String signature, String timestamp, String nonce) {
        return signature != null && signature.equals(sign(token, timestamp, nonce));
    }

    /**
     * 安全模式：校验 msg_signature。
     */
    public boolean verifyMsgSignature(String msgSignature, String timestamp, String nonce, String encrypt) {
        return msgSignature != null
                && msgSignature.equals(sign(token, timestamp, nonce, encrypt));
    }

    /**
     * 解密 Encrypt 字段，返回明文 JSON。
     */
    public String decrypt(String encryptBase64) {
        try {
            byte[] original = Base64.getDecoder().decode(encryptBase64);
            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            SecretKeySpec keySpec = new SecretKeySpec(aesKey, "AES");
            IvParameterSpec iv = new IvParameterSpec(aesKey, 0, 16);
            cipher.init(Cipher.DECRYPT_MODE, keySpec, iv);
            byte[] decrypted = cipher.doFinal(original);
            int contentLength = ByteBuffer.wrap(decrypted, 16, 4).order(ByteOrder.BIG_ENDIAN).getInt();
            int xmlLength = contentLength;
            if (xmlLength < 0 || 20 + xmlLength > decrypted.length) {
                throw new IllegalArgumentException("Invalid decrypted payload length");
            }
            String message = new String(decrypted, 20, xmlLength, StandardCharsets.UTF_8);
            String fromAppId = new String(decrypted, 20 + xmlLength, decrypted.length - 20 - xmlLength, StandardCharsets.UTF_8);
            if (!appId.equals(fromAppId)) {
                throw new IllegalArgumentException("AppId mismatch in decrypted message");
            }
            return message;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new IllegalStateException("Failed to decrypt callback message", e);
        }
    }

    /**
     * 加密回复消息，返回可回写给微信的 JSON 字段。
     */
    public EncryptedReply encryptReply(String plainJson) {
        try {
            byte[] randomBytes = new byte[16];
            RANDOM.nextBytes(randomBytes);
            byte[] plainBytes = plainJson.getBytes(StandardCharsets.UTF_8);
            byte[] appIdBytes = appId.getBytes(StandardCharsets.UTF_8);
            ByteBuffer buffer = ByteBuffer.allocate(16 + 4 + plainBytes.length + appIdBytes.length);
            buffer.put(randomBytes);
            buffer.putInt(plainBytes.length);
            buffer.put(plainBytes);
            buffer.put(appIdBytes);
            byte[] unencrypted = buffer.array();

            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            SecretKeySpec keySpec = new SecretKeySpec(aesKey, "AES");
            IvParameterSpec iv = new IvParameterSpec(aesKey, 0, 16);
            cipher.init(Cipher.ENCRYPT_MODE, keySpec, iv);
            String encrypt = Base64.getEncoder().encodeToString(cipher.doFinal(unencrypted));

            String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
            String nonce = randomNonce();
            String msgSignature = sign(token, timestamp, nonce, encrypt);
            return new EncryptedReply(encrypt, msgSignature, timestamp, nonce);
        } catch (Exception e) {
            throw new IllegalStateException("Failed to encrypt callback reply", e);
        }
    }

    /**
     * 从 POST 包体解析并解密（安全模式）。
     */
    public String parseAndDecrypt(String body, String msgSignature, String timestamp, String nonce)
            throws Exception {
        JsonNode root = objectMapper.readTree(body);
        String encrypt = root.path("Encrypt").asText(null);
        if (encrypt == null) {
            return body;
        }
        if (!verifyMsgSignature(msgSignature, timestamp, nonce, encrypt)) {
            throw new IllegalArgumentException("Invalid msg_signature");
        }
        return decrypt(encrypt);
    }

    private static String sign(String... parts) {
        String[] sorted = Arrays.stream(parts).sorted(Comparator.naturalOrder()).toArray(String[]::new);
        String joined = String.join("", sorted);
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            byte[] hash = digest.digest(joined.getBytes(StandardCharsets.UTF_8));
            return toHex(hash);
        } catch (Exception e) {
            throw new IllegalStateException("SHA-1 failed", e);
        }
    }

    private static String randomNonce() {
        byte[] bytes = new byte[8];
        RANDOM.nextBytes(bytes);
        return toHex(bytes);
    }

    private static String toHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    public static final class EncryptedReply {
        private final String encrypt;
        private final String msgSignature;
        private final String timeStamp;
        private final String nonce;

        public EncryptedReply(String encrypt, String msgSignature, String timeStamp, String nonce) {
            this.encrypt = encrypt;
            this.msgSignature = msgSignature;
            this.timeStamp = timeStamp;
            this.nonce = nonce;
        }

        public String toJson() {
            return String.format(
                    "{\"Encrypt\":\"%s\",\"MsgSignature\":\"%s\",\"TimeStamp\":%s,\"Nonce\":\"%s\"}",
                    encrypt, msgSignature, timeStamp, nonce);
        }
    }
}
