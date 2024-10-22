# yuetingmusic 悦听音乐

## 一款优美的Android音乐播放App, 使用 Material you (Material 3) 设计
## 原仓库地址 [https://github.com/wilinz/yuetingmusic](https://github.com/wilinz/yuetingmusic)
## 下载地址：[https://github.com/wilinz/yuetingmusic/releases](https://github.com/wilinz/yuetingmusic/releases)

### 特点

Material you UI，支持耳机线控，通知栏播放效果炫酷（使用官方MediaSessionCompat 框架），耳机断开自动暂停（防止噪音），打开别的音乐或者视频会自动暂停（防止混音，实现方式：android.media.AudioManager）

- 说明：由于一些原因，main分支使用java编写，kotlin 分支使用 kotlin（只是简单转换，未使用Kotlin特性优化代码），可能存在Bug
- 架构：mvvm
- 播放框架：android.support.v4.media.session.MediaSessionCompat
- 媒体播放器框架：Exoplayer

- 网络请求：retrofit+rxjava , kotlin推荐使用retrofit+kotlin协程suspand函数

- 数据库：Litepal 库操作sqlite
- UI架构：单Activity+jetpack navigation+xml+Material 3 MDC组件+fragment，优化可使用单Activity+jetpack navigation+jetpack compose (Material 3)
- 图片加载：Glide+glide-transformations，compose可使用coil
- 权限请求：permissionx，compose使用 jetpack compose permission 库
- 主页导航：viewpager2
- 事件：eventbus
- cookie管理：com.github.thomas-bouvier:persistent-cookie-jar-okhttp:1.0.2
- 音乐Api：https://github.com/Binaryify/NeteaseCloudMusicApi （声明：音乐api仅用于学习）
- 登录功能：由于一些原因，登录功能仅为本地登录，新版本已经改为验证码登录（未完善存在Bug），本地登录暂时关闭，仅支持访客登录，账号：手机号，密码：短信验证码
- 收藏，播放记录：这些目前都基于本地账户
- 已优化：~~首页榜单：未做优化，有bug，可能会请求大量数据~~
- 已完成：~~播放器界面：未做深浅背景优化，后续可能会用 androidx.palette:palette:1.0.0 这个库优化~~
- 下载体验：https://github.com/wilinz/yuetingmusic/releases
- UI效果图如下：

<img src="image/3.jpg" width="325px" /><img src="image/1.jpg" width="325px" /><img src="image/4.jpg" width="325px" /><img src="image/5.jpg" width="325px" /><img src="image/2.jpg" width="325px" /><img src="image/7.jpg" width="325px" /><img src="image/8.jpg" width="325px" /><img src="image/9.jpg" width="325px" /><img src="image/6.jpg" width="325px" /><img src="image/11.jpg" width="325px" />

# 许可证
使用此仓库您需要遵守 MIT 许可证
