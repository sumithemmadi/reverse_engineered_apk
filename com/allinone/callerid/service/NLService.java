package com.allinone.callerid.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.i1;

public class NLService extends NotificationListenerService {
  public static boolean b;
  
  long c = 5000L;
  
  private a d;
  
  private void b() {
    try {
      if (Build.VERSION.SDK_INT >= 26) {
        StatusBarNotification[] arrayOfStatusBarNotification = getActiveNotifications();
        if (arrayOfStatusBarNotification != null && arrayOfStatusBarNotification.length > 0) {
          int i = arrayOfStatusBarNotification.length;
          for (byte b = 0; b < i; b++) {
            StatusBarNotification statusBarNotification = arrayOfStatusBarNotification[b];
            int j = statusBarNotification.getId();
            String str = statusBarNotification.getPackageName();
            if (j == 977 && getPackageName().equals(str)) {
              snoozeNotification(statusBarNotification.getKey(), this.c);
              return;
            } 
          } 
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void c(StatusBarNotification paramStatusBarNotification) {
    try {
      Log.e("wbb", "in snoozeNotification");
      if (paramStatusBarNotification.getPackageName().equals("android") && (paramStatusBarNotification.getNotification()).extras.containsKey("android.foregroundApps")) {
        Log.e("wbb", "found the notification");
        String str = (paramStatusBarNotification.getNotification()).extras.getString("android.title");
        if (str == null)
          return; 
        snoozeNotification(paramStatusBarNotification.getKey(), this.c);
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append(paramStatusBarNotification.getPackageName());
        stringBuilder.append(": ");
        stringBuilder.append(str);
        stringBuilder.append(", snoozed for ");
        stringBuilder.append(this.c);
        Log.e("wbb", stringBuilder.toString());
      } 
      if (!(EZCallApplication.c()).g) {
        Log.e("wbb", "close the caller");
        b();
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void onCreate() {
    super.onCreate();
    Log.e("wbb", "onCreate");
    this.d = new a(this);
    IntentFilter intentFilter = new IntentFilter();
    intentFilter.addAction("com.allinone.callerid.CHANGE_NOTIFI");
    b.p.a.a.b(getApplicationContext()).c(this.d, intentFilter);
  }
  
  public void onDestroy() {
    super.onDestroy();
    if (this.d != null)
      b.p.a.a.b(getApplicationContext()).e(this.d); 
  }
  
  public void onNotificationPosted(StatusBarNotification paramStatusBarNotification) {
    Log.e("wbb", "NLService");
    try {
      if (b) {
        i1.n(getApplicationContext());
        b = false;
      } 
      if (Build.VERSION.SDK_INT >= 26)
        c(paramStatusBarNotification); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void onNotificationRemoved(StatusBarNotification paramStatusBarNotification) {}
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2) {
    Log.e("wbb", "onStartCommand");
    return super.onStartCommand(paramIntent, paramInt1, paramInt2);
  }
  
  class a extends BroadcastReceiver {
    a(NLService this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      Log.e("wbb", "Received Broadcast");
      try {
        for (StatusBarNotification statusBarNotification : this.a.getActiveNotifications()) {
          if (Build.VERSION.SDK_INT >= 26)
            NLService.a(this.a, statusBarNotification); 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/service/NLService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */