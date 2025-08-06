// Copyright 2025 GenOuka
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
public class RareBoxCmdUtil {

    private static final String PACKAGE_NAME = "com.yuanwow.adb";
    private static final String ACTIVITY_CLASS = "com.genouka.ard.AdbShell";
    //连接到网络adb
    public static Intent initConn(Context context, String ip,int port) {
        Intent intent = new Intent();
        intent.setClassName(PACKAGE_NAME, ACTIVITY_CLASS);
        intent.putExtra("IP", ip);
        intent.putExtra("Port", port);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        return intent;
    }
    //有提示的执行命令
    public static Intent adviseExecString(Context context, String command) {
        Intent intent = new Intent();
        intent.setClassName(PACKAGE_NAME, ACTIVITY_CLASS);
        intent.putExtra("ipe", command);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        return intent;
    }
    //没有提示直接执行命令
    @Deprecated
    public static Intent execString(Context context, String command, boolean finishAfterExec) {
        Intent intent = new Intent();
        intent.setClassName(PACKAGE_NAME, ACTIVITY_CLASS);
        intent.putExtra("cmd", command);
        intent.putExtra("fin", finishAfterExec);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        return intent;
    }
    //没有提示直接发送byte数组到终端
    @Deprecated
    public static Intent execBytes(Context context, byte[] command, boolean finishAfterExec) {
        Intent intent = new Intent();
        intent.setClassName(PACKAGE_NAME, ACTIVITY_CLASS);
        intent.putExtra("cmd",":");
        intent.putExtra("cmdb", command);
        intent.putExtra("fin", finishAfterExec);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        return intent;
    }
    private RareBoxCmdUtil() {
        throw new UnsupportedOperationException("工具类不可实例化");
    }
}
