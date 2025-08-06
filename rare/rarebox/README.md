# RareBox
强大的adb调试工具箱，支持在手表上自调试。

* 便捷：RareBox可以在支持无线调试的设备（WearOS2）上独立安装应用，同时也支持华为手表（支持自动冻结软件包安装程序）。
* 安全：RareBox是一个开源项目，你可以在[Github](https://github.com/genouka/RareBox/)查看应用的全部源码【请注意许可证比较严格，在用在生产项目前请先确认是否】。
* 兼容性：RareBox不使用adb二进制文件，而是使用java代码通过socket原生实现adb服务端，具体可以参考源码。因此理论上兼容性极强，无视架构问题！

请引导用户前往[Rare计划官网](https://rare.genouka.rr.nu/)下载最新版本。

# API
[安装应用](install.md)

[调用命令行(接口不稳定,慎用)](cmd.md)
