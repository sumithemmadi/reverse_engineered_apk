package com.allinone.callerid.service;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.i;
import com.allinone.callerid.mvc.controller.MainActivity;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.i1;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
  private void t(String paramString1, String paramString2, String paramString3) {
    try {
      if (!i1.q0()) {
        Intent intent1;
        StringBuilder stringBuilder;
        NotificationManager notificationManager = (NotificationManager)getSystemService("notification");
        Intent intent2 = new Intent();
        this();
        intent2.addFlags(268435456);
        if ("offline_notifi".equals(paramString3)) {
          intent2.setClass((Context)this, MainActivity.class);
          intent2.putExtra("offline_notifi", "open_offline");
          intent1 = intent2;
        } else if ("callscreen".equals(intent1)) {
          intent2.setClass((Context)this, MainActivity.class);
          intent2.putExtra("is_callscreen", true);
          intent1 = intent2;
        } else {
          StringBuilder stringBuilder1;
          boolean bool = "open_version_update".equals(intent1);
          if (bool) {
            try {
              intent2 = getApplicationContext().getPackageManager().getLaunchIntentForPackage("com.android.vending");
              ComponentName componentName = new ComponentName();
              this("com.android.vending", "com.google.android.finsky.activities.LaunchUrlHandlerActivity");
              intent1 = intent2;
              if (intent2 != null) {
                intent2.setComponent(componentName);
                StringBuilder stringBuilder2 = new StringBuilder();
                this();
                stringBuilder2.append("market://details?id=");
                stringBuilder2.append(getApplicationContext().getPackageName());
                intent2.setData(Uri.parse(stringBuilder2.toString()));
                intent2.setFlags(268435456);
                Intent intent = intent2;
              } 
            } catch (Exception exception) {
              Intent intent = new Intent();
              stringBuilder1 = new StringBuilder();
              this();
              stringBuilder1.append("https://play.google.com/store/apps/details?id=");
              stringBuilder1.append(getApplicationContext().getPackageName());
              this("android.intent.action.VIEW", Uri.parse(stringBuilder1.toString()));
              intent.setFlags(268435456);
            } 
          } else {
            stringBuilder1.setClass((Context)this, MainActivity.class);
            stringBuilder = stringBuilder1;
          } 
        } 
        PendingIntent pendingIntent = PendingIntent.getActivity((Context)this, 1, (Intent)stringBuilder, 134217728);
        i.e e = new i.e();
        this((Context)this, "Showcaller");
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
          NotificationChannel notificationChannel = new NotificationChannel();
          this("com.allinone.callerid_notfication_N", "Showcaller", 3);
          if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
            e.g("com.allinone.callerid_notfication_N");
          } 
        } 
        e.k(paramString1).j(paramString2).i(pendingIntent).y("Showcaller").B(System.currentTimeMillis()).t(0).s(false).f(true);
        if (i >= 21) {
          try {
            getDrawable(2131231332);
            e.v(2131231332);
          } catch (Exception exception) {
            return;
          } finally {
            paramString1 = null;
          } 
        } else {
          e.v(2131231118);
          e.o(BitmapFactory.decodeResource(getResources(), 2131558400));
        } 
        if (notificationManager != null)
          notificationManager.notify(6688, e.b()); 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void o(RemoteMessage paramRemoteMessage) {
    String str;
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("From: ");
    stringBuilder1.append(paramRemoteMessage.p0());
    d0.a("fcm", stringBuilder1.toString());
    int i = paramRemoteMessage.o0().size();
    stringBuilder1 = null;
    StringBuilder stringBuilder2 = null;
    if (i > 0) {
      stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Message data payload: ");
      stringBuilder1.append(paramRemoteMessage.o0());
      d0.a("fcm", stringBuilder1.toString());
      Map map = paramRemoteMessage.o0();
      stringBuilder1 = stringBuilder2;
      if (map.containsKey("callscreen"))
        str = (String)map.get("callscreen"); 
      if (map.containsKey("offline_notifi"))
        str = (String)map.get("offline_notifi"); 
      if (map.containsKey("version_update_notifi"))
        str = (String)map.get("version_update_notifi"); 
    } 
    if (paramRemoteMessage.q0() != null) {
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append("Message Notification Title: ");
      stringBuilder2.append(paramRemoteMessage.q0().c());
      d0.a("fcm", stringBuilder2.toString());
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append("Message Notification Body: ");
      stringBuilder2.append(paramRemoteMessage.q0().a());
      d0.a("fcm", stringBuilder2.toString());
      t(paramRemoteMessage.q0().c(), paramRemoteMessage.q0().a(), str);
    } 
  }
  
  public void q(String paramString) {
    super.q(paramString);
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Refreshed token: ");
      stringBuilder.append(paramString);
      d0.a("fcm", stringBuilder.toString());
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/service/MyFirebaseMessagingService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */