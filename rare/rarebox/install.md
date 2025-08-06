# 安装应用api
优势：RareBox可以在支持无线调试的设备（WearOS2）上独立安装应用，同时也支持华为手表（自动冻结软件包安装程序）。

## 1.安装apk文件
以下代码支持调起所有RareBox版本。

SDK(Androlua/FusionApp开发环境)：[installer.lua](installer.lua)

示例调用：
```lua
InstallByRareBox("/sdcard/base.apk")
```

SDK(java/kotlin开发环境)：[installer.java](installer.java)

示例调用：
```java
RareBoxInstaller.installByRareBox("/sdcard/base.apk")
```
