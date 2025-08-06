-- 兼容Androlua和FusionApp环境
-- 使用RareBox安装应用
-- @param filepath (string) 文件路径
function InstallByRareBox(filepath)
  local function InstallByRareBox3_3(filepath)
    local i = Intent();
    local cn = ComponentName("com.yuanwow.adb",
    "com.yuanwow.adb.InstallerActivity");
    i.setComponent(cn);
    i.setAction("android.intent.action.VIEW");
    i.setData(Uri.parse(filepath))
    activity.startActivity(i)
  end
  xpcall(function() InstallByRareBox3_3(filepath) end,
  function(e)
    local AlertDialog=luajava.bindClass("android.app.AlertDialog")
    local ClipData=luajava.bindClass( "android.content.ClipData")
    local Context=luajava.bindClass( "android.content.Context")
    local Toast=luajava.bindClass( "android.widget.Toast")
    local cm = activity.getSystemService(Context.CLIPBOARD_SERVICE)
    local mClipData = ClipData.newPlainText("Label", filepath)
    cm.setPrimaryClip(mClipData)
    Toast.makeText(activity, "已将文件路径复制到剪贴板，请在RareBox中安装！", Toast.LENGTH_LONG).show()
    xpcall(function()
      local packageManager = activity.getPackageManager()
      local it = packageManager.getLaunchIntentForPackage("com.yuanwow.adb")
      activity.startActivity(it)
    end,
    function()
      local t=AlertDialog.Builder(activity)
      t.setTitle("警告")
      t.setMessage("您的手表未安装RareBox，请前往Rare计划官网获得软件：rare.genouka.rr.nu")
      t.setPositiveButton("确定",nil)
      t.create().show()
    end)
  end)
end
