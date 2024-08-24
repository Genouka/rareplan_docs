# 浏览网页和搜索功能
记得先引导用户安装Rare浏览器。
## 注意
必须先引导用户同意[Rare浏览器隐私政策](https://rare.genouka.rr.nu/privacy/)才可调用以下api。
## 1.访问网址
Rare浏览器和RarePro浏览器的调用方式均符合Android规范，因此只需使用Android常规方式打开即可。


以下代码支持调起所有Rare浏览器、RarePro浏览器版本。

唤起Rare浏览器访问网页。

示例代码(java)：
```java
Intent intent = new Intent(Intent.ACTION_VIEW);  //调用系统内置动作
intent.setData(Uri.parse("https://rare.genouka.rr.nu/"));//传递网址
startActivity(intent);//启动页面
```

示例代码(androlua/fusionapp)：
```lua
function openurl(网页链接)
  local viewIntent = Intent("android.intent.action.VIEW",Uri.parse(网页链接))
  activity.startActivity(viewIntent)
end
```
## 2.搜索
Rare浏览器和RarePro浏览器的调用方式均符合Android规范，因此只需使用Android常规方式打开即可。

以下代码支持调起所有Rare浏览器、RarePro浏览器版本。

唤起Rare浏览器搜索关键词。

示例代码(java)：
```java
String value="要搜索的内容";
Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);  //调用系统内置动作
search.putExtra(SearchManager.QUERY, value);
final Bundle appData = getIntent().getBundleExtra(SearchManager.APP_DATA);
if (appData != null) {
    search.putExtra(SearchManager.APP_DATA, appData);
}
startActivity(intent);//启动页面
```