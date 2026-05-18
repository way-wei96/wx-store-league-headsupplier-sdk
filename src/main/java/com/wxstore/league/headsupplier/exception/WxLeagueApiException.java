package com.wxstore.league.headsupplier.exception;

/**
 * 微信 API 调用异常。
 */
public class WxLeagueApiException extends RuntimeException {

    private final int errcode;
    private final String errmsg;

    public WxLeagueApiException(int errcode, String errmsg) {
        super("WeChat API error: errcode=" + errcode + ", errmsg=" + errmsg);
        this.errcode = errcode;
        this.errmsg = errmsg;
    }

    public WxLeagueApiException(String message, Throwable cause) {
        super(message, cause);
        this.errcode = -1;
        this.errmsg = message;
    }

    public int getErrcode() {
        return errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }
}
