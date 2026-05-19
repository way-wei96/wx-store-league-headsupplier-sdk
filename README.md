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

**当前最新发布：[v0.1.0](https://github.com/way-wei96/wx-store-league-headsupplier-sdk/releases/tag/v0.1.0)**（SemVer `0.1.0`，API 在 `0.x` 阶段仍可能做小范围不兼容调整，详见 [CHANGELOG.md](CHANGELOG.md)）。

### 从源码安装（推荐，直至上架 Maven Central）

```bash
git clone https://github.com/way-wei96/wx-store-league-headsupplier-sdk.git
cd wx-store-league-headsupplier-sdk
git checkout v0.1.0
mvn -q test install
```

```xml
<dependency>
    <groupId>com.wxstore.league</groupId>
    <artifactId>wx-store-league-headsupplier-sdk</artifactId>
    <version>0.1.0</version>
</dependency>
```

> 后续若发布到 Maven Central / GitHub Packages，可直接用坐标引入，无需本地 `install`。

## 快速开始

```java
import com.wxstore.league.headsupplier.WxLeagueHeadSupplierClient;
import com.wxstore.league.headsupplier.model.headsupplier.GetShopListRequest;
import com.wxstore.league.headsupplier.model.headsupplier.GetShopListResponse;
import com.wxstore.league.headsupplier.model.headsupplier.GetShopRequest;
import com.wxstore.league.headsupplier.model.headsupplier.GetShopResponse;
import com.wxstore.league.headsupplier.model.headsupplier.GetShopLockTimeRequest;
import com.wxstore.league.headsupplier.model.headsupplier.GetShopLockTimeResponse;
import com.wxstore.league.headsupplier.model.order.GetOrderListRequest;
import com.wxstore.league.headsupplier.model.order.GetOrderRequest;
import com.wxstore.league.headsupplier.model.shop.GetProductDetailRequest;
import com.wxstore.league.headsupplier.model.shop.GetSubscribeProductListRequest;
import com.wxstore.league.headsupplier.model.shop.ProductIdRequest;
import com.wxstore.league.headsupplier.model.balance.GetFundsFlowDetailRequest;
import com.wxstore.league.headsupplier.model.balance.GetFundsFlowListRequest;

WxLeagueHeadSupplierClient client = WxLeagueHeadSupplierClient.builder()
        .appId("your-app-id")
        .appSecret("your-app-secret")
        .build();

GetShopListResponse list = client.headSupplier().getShopList(GetShopListRequest.of(10));
list.getShopList().forEach(shop -> System.out.println(shop.getBaseInfo().getNickname()));

// 合作小店详情、锁客时效、更新合作关系
GetShopResponse shop = client.headSupplier().getShop(GetShopRequest.of("wx_shop_appid"));
GetShopLockTimeResponse lockTime =
        client.headSupplier().getShopLockTime(GetShopLockTimeRequest.of("wx_shop_appid"));

// 佣金单列表与详情
var orders = client.order().getOrderList(GetOrderListRequest.of(10));
var detail = client.order().getOrder(GetOrderRequest.of(123L, 12345L));

// 商品详情、订阅列表、订阅/取消订阅
client.shop().getProductDetail(GetProductDetailRequest.of("wx_shop_appid", 1L));
client.shop().getSubscribeProductList(GetSubscribeProductListRequest.of(20));
client.shop().subscribeProduct(ProductIdRequest.of(10000207528319L));

// 账户余额与资金流水
client.balance().getBalance();
client.balance().getFundsFlowList(GetFundsFlowListRequest.of(10));
client.balance().getFundsFlowDetail(GetFundsFlowDetailRequest.of("flow_id"));

// 推客带货
import com.wxstore.league.headsupplier.model.sharer.product.SharerProductBaseRequest;
var productDetail = client.sharer().product().getPromoteProductDetail(
        SharerProductBaseRequest.forPromoteProductDetail("wx_shop_appid", 12345L, 1));

// 达人带货
import com.wxstore.league.headsupplier.model.opentalent.OpenTalentBaseRequest;
var windowList = client.openTalent().window().getAllWindow(
        OpenTalentBaseRequest.forWindowList("openfinder_id", 0, 100));
```

## 回调处理

```java
import com.wxstore.league.headsupplier.callback.CallbackCrypto;
import com.wxstore.league.headsupplier.callback.CallbackMessageParser;
import com.wxstore.league.headsupplier.model.callback.HeadSupplierCommissionOrderUpdateEvent;
import com.wxstore.league.headsupplier.model.callback.PromoterBindEvent;

CallbackCrypto crypto = client.createCallbackCrypto(token, encodingAesKey);
CallbackMessageParser eventParser = client.createCallbackMessageParser();

// GET 校验（明文模式）
boolean ok = crypto.verifySignature(signature, timestamp, nonce);

// POST 解密（安全模式）
String plainJson = crypto.parseAndDecrypt(body, msgSignature, timestamp, nonce);

var event = eventParser.parse(plainJson);
if (event instanceof PromoterBindEvent bind) {
    System.out.println(bind.getSharerAppid() + " status=" + bind.getBindStatus());
} else if (event instanceof HeadSupplierCommissionOrderUpdateEvent orderEvt) {
    System.out.println(orderEvt.getOrderInfo().getOrderId());
}

// 加密回复
var reply = crypto.encryptReply("{\"demo_resp\":\"good luck\"}");
return reply.toJson();
```

## 项目结构（单模块）

```
src/main/java/com/wxstore/league/headsupplier/
├── WxLeagueHeadSupplierClient.java   # 入口
├── WxApiPaths.java                   # 基础/商品/订单/资金/合作小店等路径
├── WxSharerApiPaths.java             # 推客带货路径
├── WxOpenTalentApiPaths.java         # 达人带货路径
├── api/                              # 按业务分组的 API 客户端
├── callback/                         # 回调验签、加解密与事件解析
├── config/                           # 配置
├── http/                             # HTTP 与 JSON
├── model/                            # 请求/响应与回调事件模型
└── token/                            # Access Token 缓存
```

## API 覆盖一览

| 模块 | 入口 | 说明 |
|------|------|------|
| 基础 | `client.basic()` | Token、配额、IP、回调校验 |
| 合作小店 | `client.headSupplier()` | 小店列表/详情、锁客、合作关系 |
| 商品 | `client.shop()` | 详情、订阅、活动 |
| 类目 | `client.category()` | 全量类目 |
| 佣金单 | `client.order()` | 列表、详情 |
| 资金 | `client.balance()` | 余额、流水 |
| 推客带货 | `client.sharer()` | account / product / coupon / live / video / article / clue |
| 达人带货 | `client.openTalent()` | window / shop |

[官方文档](https://developers.weixin.qq.com/doc/store/leagueheadsupplier/api/) 所列 HTTPS 路径均已通过 `*Api` 封装。推客带货 `product` / `live` / `video` / `article` / `coupon` 子模块已提供常用请求字段与列表/详情响应类型；更深嵌套结构仍可通过 `ignoreUnknown` 扩展。未建模接口可用 `client.getApiExecutor().post(path, body, XxxResponse.class)` 调用。

## 构建

```bash
mvn -q test package
```

## 变更记录

见 [CHANGELOG.md](CHANGELOG.md)。

## 文档

- [联盟带货机构 API](https://developers.weixin.qq.com/doc/store/leagueheadsupplier/api/)
- [回调加解密](https://developers.weixin.qq.com/doc/store/leagueheadsupplier/callback/allback_encoding.html)

回调事件（`CallbackMessageParser`）：`head_supplier_item_update`、`head_supplier_commission_order_update`、`head_supplier_subscribe_product_baseinfo_update`、`head_supplier_subscribe_product_planinfo_update`、`promoter_bind_result`、`talent_window_cancel_auth`、`api_diff`。

## License

[MIT](LICENSE) © Wayne Wei
