# Changelog

## [Unreleased]

### Added

- 达人带货模块 `client.openTalent()`（橱窗 / 商品）
- 回调事件强类型模型与 `CallbackMessageParser`
- `WxLeagueHeadSupplierClient#createCallbackCrypto`、`createCallbackMessageParser`
- 推客 / 达人 / 线索等子模块专用 request/response 与 `of()` / `forXxx()` 便捷构造

### Changed

- `SharerVideoApi#getFeedPromotionInfo` 返回 `GetFeedPromotionInfoResponse`（原为错误的单字段 `feed_token`）
- `OpenTalentWindowApi#getAllWindow` 返回 `OpenTalentWindowListResponse`（offset 分页）
- `OpenTalentWindowApi#getWindowDetail` 返回 `GetWindowDetailResponse`
- `OpenTalentShopApi#getItemPromotionDetail` 返回 `GetItemPromotionDetailResponse`
- `GetClueListResponse` 列表字段对齐官方 `list`（`getClueList()` 已废弃）

### Deprecated

- `OpenTalentDetailResponse` → 使用 `GetWindowDetailResponse` / `GetItemPromotionDetailResponse`
- `SharerVideoPromotionResponse` → 使用 `GetFeedPromotionInfoResponse`
