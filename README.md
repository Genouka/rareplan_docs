# Rare计划开放平台
网站的部分页面还在施工中。

这是一个开放的手表知识库平台，目前计划托管Rare计划系列软件的api接口文档，手表adb/root/...相关教程。

> 作为手表开发者，你现在可以使用Rare计划系列应用、莘应用等对外提供的各种开放功能和接口，用更简单的方式为用户提供更优的体验。

你可以通过查看[目录](#目录)检索你关心的api或者功能，如果需要参与贡献请查看[贡献](#贡献)

更多api正在持续开放，欢迎接入，在手表开发上互利共赢！

## 目录
* Rare计划官方
  * Rare浏览器（开发者指南）
    * [简介](rare/rarebrowser/README.md)
    * [浏览网页和搜索](rare/rarebrowser/explore.md)
  * RareBox（开发者指南）
    * [简介](rare/rarebox/README.md)
    * [安装应用](rare/rarebox/install.md)
    * [执行终端命令](rare/rarebox/cmd.md)
  * 莘应用（开发者指南）
    * [简介](rare/xin/README.md)
    * [自定义数据源](rare/xin/source.md)
    * [应用内升级](rare/xin/update.md)
* [手表常见问题概览（用户指南）](problem/common.md)
* [RareBox用户手册及常见问题](problem/rarebox.md)

## 贡献
我计划将这个网站作为手表知识库平台，任何手表相关的文档（任何都可以，欢迎你署名！）欢迎贡献到这个开放平台网站（直接向储存库提交你撰写好的markdown文档的pr就行）

储存库在这里：[Github](https://github.com/Genouka/rareplan_docs)

以下是贡献规范：
```
目录结构规范：
/
|- website  (网站相关)
|  |- README.md
|  |- about.md
|- rare     (官方文档，包括rare计划和莘应用的等等)
|  |- 官方的文档文件夹1
|  |  |- README.md
|  |  |- ...
|  |- 官方的文档文件夹2
|  |  |- README.md
|  |  |- ...
|  |- 官方的文档...
|  |  |- README.md
|  |  |- ...
|- adb    (与adb有关的)
|  |- 文档文件夹1
|  |  |- README.md
|  |  |- ...
|  |- 文档文件夹2
|  |  |- README.md
|  |  |- ...
|  |- 文档...
|  |  |- README.md
|  |  |- ...
|  |- README.md   (可以在这里介绍相关内容的)
|- root   (与root有关的)
|  |- 文档文件夹1
|  |  |- README.md
|  |  |- ...
|  |- 文档文件夹2
|  |  |- README.md
|  |  |- ...
|  |- 文档...
|  |  |- README.md
|  |  |- ...
|  |- README.md   (可以在这里介绍相关内容的)
|- ...    （领域的简称）
|  |- ...  ，（邻域下一个方面的简称）
|- README.md   (主页文件)
|- SUMMARY.md  (目录文件，不要变动)


以上仅供参考，根据实际需要变动吧。
修改目录时修改README.md文件二部不要变动SUMMARY.md文件，这玩意就是个残废！
```
