package com.allinone.callerid.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.controller.permission.AutoStartGuideActivity;
import com.allinone.callerid.util.k1.a;

public class h0 {
  k0 a;
  
  public static String a() {
    return Build.MANUFACTURER;
  }
  
  private void c(Context paramContext) {
    try {
      Handler handler = new Handler();
      this();
      a a = new a();
      this(this, paramContext);
      handler.postDelayed(a, 500L);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void b(Context paramContext) {
    Intent intent = new Intent();
    try {
      ComponentName componentName;
      intent.addFlags(268435456);
      if (d0.a) {
        StringBuilder stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append("******************当前手机型号为：");
        stringBuilder1.append(a());
        d0.a("selfstarting", stringBuilder1.toString());
      } 
      boolean bool = a().equalsIgnoreCase("Xiaomi");
      StringBuilder stringBuilder = null;
      if (bool) {
        if (d0.a) {
          stringBuilder = new StringBuilder();
          this();
          stringBuilder.append(Build.VERSION.SDK_INT);
          stringBuilder.append("");
          d0.a("selfstarting", stringBuilder.toString());
        } 
        componentName = new ComponentName();
        this("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity");
      } else if (a().equalsIgnoreCase("samsung")) {
        componentName = ComponentName.unflattenFromString("com.samsung.android.sm/.app.dashboard.SmartManagerDashBoardActivity");
      } else if (a().equalsIgnoreCase("HUAWEI")) {
        componentName = ComponentName.unflattenFromString("com.huawei.systemmanager/.startupmgr.ui.StartupNormalAppListActivity");
      } else {
        if (d0.a)
          d0.a("selfstarting", "APPLICATION_DETAILS_SETTINGS"); 
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", paramContext.getPackageName(), null));
      } 
      intent.setComponent(componentName);
      paramContext.startActivity(intent);
      if (a().equalsIgnoreCase("Xiaomi") || a().equalsIgnoreCase("HUAWEI")) {
        c(paramContext);
        q.b().c("selfactivity_xiaomi_show");
      } 
      if (a().equalsIgnoreCase("samsung")) {
        q.b().c("selfactivity_samsung_show");
        if (a.f()) {
          k0 k01 = k0.b();
          this.a = k01;
          k01.a((Context)EZCallApplication.c());
        } 
      } 
    } catch (Exception exception) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("出错啦");
        stringBuilder.append(exception.getLocalizedMessage());
        d0.a("selfstarting", stringBuilder.toString());
      } 
      paramContext.startActivity(new Intent("android.settings.SETTINGS"));
    } 
  }
  
  class a implements Runnable {
    a(h0 this$0, Context param1Context) {}
    
    public void run() {
      Intent intent = new Intent(this.b, AutoStartGuideActivity.class);
      intent.addFlags(268435456);
      this.b.startActivity(intent);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */