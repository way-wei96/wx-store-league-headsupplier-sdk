# wx-store-league-headsupplier-sdk

微信小店联盟带货机构（源头供应商 / 团长）Java SDK：封装[官方 API](https://developers.weixin.qq.com/doc/store/leagueheadsupplier/api/)，统一 Access Token、HTTP 调用与回调验签加解密，Maven 一键引入。

## 作者

**Wayne Wei** · [@way-wei96](https://github.com/way-wei96)

## 开发说明

本项目由作者发起并维护。初始 Maven 工程、SDK 骨架及部分核心实现，在作者指导下由 [Cursor](https://cursor.com) AI 辅助编码完成；后续 API 封装与功能迭代由作者主导。

## 要求

- JDK 11+
- Maven 3.6+

## 引入

```xml
<dependency>
    <groupId>com.wxstore.league</groupId>
    <artifactId>wx-store-league-headsupplier-sdk</artifactId>
    <version>0.1.0-SNAPSHOT</version>
</dependency>
```

> 发布到 Maven Central 前，需先 `mvn install` 到本地，或配置 GitHub Packages 等私服地址。

## 快速开始

```java
import com.wxstore.league.headsupplier.WxLeagueHeadSupplierClient;
import com.wxstore.league.headsupplier.model.headsupplier.GetShopListRequest;

WxLeagueHeadSupplierClient client = WxLeagueHeadSupplierClient.builder()
        .appId("your-app-id")
        .appSecret("your-app-secret")
        .build();

var response = client.headSupplier().getShopList(GetShopListRequest.of(10));
response.getShopList().forEach(shop ->
        System.out.println(shop.getBaseInfo().getNickname()));
```

## 回调处理

```java
import com.wxstore.league.headsupplier.callback.CallbackCrypto;

CallbackCrypto crypto = new CallbackCrypto(token, encodingAesKey, appId);

// GET 校验（明文模式）
boolean ok = crypto.verifySignature(signature, timestamp, nonce);

// POST 解密（安全模式）
String plainJson = crypto.parseAndDecrypt(body, msgSignature, timestamp, nonce);

// 加密回复
var reply = crypto.encryptReply("{\"demo_resp\":\"good luck\"}");
return reply.toJson();
```

## 项目结构（单模块）

```
src/main/java/com/wxstore/league/headsupplier/
├── WxLeagueHeadSupplierClient.java   # 入口
├── WxApiPaths.java                   # 官方路径索引
├── api/                              # 按业务分组的 API 客户端
├── callback/                         # 回调验签与加解密
├── config/                           # 配置
├── http/                             # HTTP 与 JSON
├── model/                            # 请求/响应模型
└── token/                            # Access Token 缓存
```

各 `*Api` 类按[官方文档目录](https://developers.weixin.qq.com/doc/store/leagueheadsupplier/api/)逐步补全；尚未封装的方法可通过 `client.getApiExecutor().post(path, body, XxxResponse.class)` 直接调用。

## 构建

```bash
mvn -q test package
```

## 文档

- [联盟带货机构 API](https://developers.weixin.qq.com/doc/store/leagueheadsupplier/api/)
- [回调加解密](https://developers.weixin.qq.com/doc/store/leagueheadsupplier/callback/allback_encoding.html)

## License

[MIT](LICENSE) © Wayne Wei
