# Changelog

本文件遵循 [Keep a Changelog](https://keepachangelog.com/zh-CN/1.1.0/)，版本号遵循 [语义化版本](https://semver.org/lang/zh-CN/)。

## [Unreleased]

## [0.1.0] - 2026-05-19

首个公开发布版本：封装微信小店联盟带货机构官方 HTTPS API、Access Token、回调加解密与事件解析。

### Added

- SDK 入口 `WxLeagueHeadSupplierClient`：基础、合作小店、商品、类目、佣金单、资金、推客带货、达人带货
- 官方路径索引：`WxApiPaths`、`WxSharerApiPaths`、`WxOpenTalentApiPaths`
- 回调 `CallbackCrypto`（验签 / 安全模式加解密）与 `CallbackMessageParser`（7 类事件强类型）
- 推客子模块专用模型：product / live / video / article / coupon / clue / account
- 达人带货橱窗与商品推广详情模型
- `createCallbackCrypto`、`createCallbackMessageParser` 及常用 `forXxx()` 请求构造

### Changed

- `SharerVideoApi#getFeedPromotionInfo` 返回 `GetFeedPromotionInfoResponse`
- 达人橱窗 `getAllWindow` / `getWindowDetail`、商品 `getItemPromotionDetail` 使用专用响应类型
- `GetClueListResponse` 列表字段对齐官方 `list`

### Deprecated

- `OpenTalentDetailResponse` → `GetWindowDetailResponse` / `GetItemPromotionDetailResponse`
- `SharerVideoPromotionResponse` → `GetFeedPromotionInfoResponse`
- `GetClueListResponse#getClueList()` → `getList()`

[Unreleased]: https://github.com/way-wei96/wx-store-league-headsupplier-sdk/compare/v0.1.0...HEAD
[0.1.0]: https://github.com/way-wei96/wx-store-league-headsupplier-sdk/releases/tag/v0.1.0
