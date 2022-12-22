package com.allinone.callerid.util.k1;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import android.view.KeyEvent;
import com.allinone.callerid.mvc.controller.GuideNotifiPerActivity;
import com.allinone.callerid.util.b1;

public class b {
  public static boolean a;
  
  public static boolean a(Context paramContext) {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 21) {
      bool = d(paramContext);
    } else {
      bool = true;
    } 
    return bool;
  }
  
  public static boolean b(Context paramContext) {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 26 && d(paramContext)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static boolean c(Context paramContext) {
    try {
      Handler handler = new Handler();
      this();
      a a = new a();
      this(paramContext);
      handler.postDelayed(a, 500L);
      Intent intent = new Intent();
      this("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
      intent.addFlags(268435456);
      paramContext.startActivity(intent);
      return true;
    } catch (ActivityNotFoundException activityNotFoundException) {
      try {
        Handler handler = new Handler();
        this();
        b b1 = new b();
        this(paramContext);
        handler.postDelayed(b1, 500L);
        Intent intent = new Intent();
        this();
        intent.addFlags(268435456);
        ComponentName componentName = new ComponentName();
        this("com.android.settings", "com.android.settings.Settings$NotificationAccessSettingsActivity");
        intent.setComponent(componentName);
        intent.putExtra(":settings:show_fragment", "NotificationAccessSettings");
        paramContext.startActivity(intent);
        return true;
      } catch (Exception exception) {
        exception.printStackTrace();
        return false;
      } 
    } 
  }
  
  public static boolean d(Context paramContext) {
    boolean bool;
    String str2 = paramContext.getPackageName();
    String str1 = Settings.Secure.getString(paramContext.getContentResolver(), "enabled_notification_listeners");
    if (str1 != null) {
      bool = str1.contains(str2);
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static void e(KeyEvent paramKeyEvent, MediaController paramMediaController) {
    paramMediaController.dispatchMediaButtonEvent(paramKeyEvent);
  }
  
  public static void f(int paramInt, MediaController paramMediaController) {
    byte b1 = 0;
    KeyEvent keyEvent = new KeyEvent(0, paramInt);
    e(keyEvent, paramMediaController);
    g(500);
    while (b1 < 50) {
      e(KeyEvent.changeTimeRepeat(keyEvent, SystemClock.uptimeMillis(), b1, keyEvent.getFlags() | 0x80), paramMediaController);
      g(5);
      b1++;
    } 
    e(new KeyEvent(1, paramInt), paramMediaController);
    (new Handler(Looper.getMainLooper())).postDelayed(new c(), 2000L);
  }
  
  private static void g(int paramInt) {
    long l = paramInt;
    try {
      Thread.sleep(l);
      return;
    } catch (InterruptedException interruptedException) {
      Log.e("wjjj", "Could not sleep. Mosquito alert!", interruptedException);
      return;
    } 
  }
  
  static final class a implements Runnable {
    a(Context param1Context) {}
    
    public void run() {
      Intent intent = new Intent(this.b, GuideNotifiPerActivity.class);
      intent.addFlags(268435456);
      this.b.startActivity(intent);
    }
  }
  
  static final class b implements Runnable {
    b(Context param1Context) {}
    
    public void run() {
      Intent intent = new Intent(this.b, GuideNotifiPerActivity.class);
      intent.addFlags(268435456);
      this.b.startActivity(intent);
    }
  }
  
  static final class c implements Runnable {
    public void run() {
      b1.U2(Boolean.FALSE);
      b1.O2(Boolean.TRUE);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/k1/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */