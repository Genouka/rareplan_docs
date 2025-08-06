import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class RareBoxInstaller {

    public static void installByRareBox(Activity activity, String filepath) {
        try {
            // 尝试使用 RareBox 3.3 安装方式
            Intent installerIntent = new Intent();
            installerIntent.setComponent(new ComponentName(
                "com.yuanwow.adb", 
                "com.yuanwow.adb.InstallerActivity"
            ));
            installerIntent.setAction(Intent.ACTION_VIEW);
            installerIntent.setData(Uri.parse(filepath));
            activity.startActivity(installerIntent);
        } catch (Exception e) {
            // 复制文件路径到剪贴板
            ClipboardManager clipboard = (ClipboardManager) 
                activity.getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("APK Path", filepath);
            clipboard.setPrimaryClip(clip);
            
            // 显示Toast提示
            Toast.makeText(activity, 
                "已将文件路径复制到剪贴板，请在RareBox中安装！", 
                Toast.LENGTH_LONG
            ).show();

            try {
                // 尝试启动RareBox主应用
                Intent launchIntent = activity.getPackageManager()
                    .getLaunchIntentForPackage("com.yuanwow.adb");
                activity.startActivity(launchIntent);
            } catch (Exception ex) {
                // 显示未安装RareBox的警告对话框
                new AlertDialog.Builder(activity)
                    .setTitle("警告")
                    .setMessage("您的手表未安装RareBox，请前往Rare计划官网获得软件：rare.genouka.top")
                    .setPositiveButton("确定", null)
                    .create()
                    .show();
            }
        }
    }
}
