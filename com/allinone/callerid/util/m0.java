package com.allinone.callerid.util;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.core.app.i;
import com.allinone.callerid.mvc.controller.nodisturb.NoDisturbActivity;

public class m0 {
  public static void a(Context paramContext) {
    NotificationManager notificationManager = (NotificationManager)paramContext.getSystemService("notification");
    if (notificationManager != null)
      notificationManager.cancel(100103); 
  }
  
  public static void b(Context paramContext) {
    try {
      if (!i1.q0()) {
        i.e e = new i.e();
        this(paramContext, "Showcaller");
        Intent intent1 = new Intent();
        this(paramContext, NoDisturbActivity.class);
        intent1.addFlags(268435456);
        String str1 = paramContext.getResources().getString(2131755014);
        String str2 = paramContext.getResources().getString(2131755037);
        PendingIntent pendingIntent = PendingIntent.getActivity(paramContext, 0, intent1, 134217728);
        Intent intent2 = new Intent();
        this("com.allinone.callerid.DISTURB_NOTIFICATION_TUENOFF");
        e.i(pendingIntent).o(BitmapFactory.decodeResource(paramContext.getResources(), 2131231351)).k(str1).s(true).a(0, str2, PendingIntent.getBroadcast(paramContext, 0, intent2, 134217728));
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
          try {
            paramContext.getDrawable(2131231353);
            e.v(2131231353);
            e.h(paramContext.getResources().getColor(2131099706));
          } catch (Exception exception) {
            return;
          } 
        } else {
          e.v(2131231352);
        } 
        NotificationManager notificationManager = (NotificationManager)exception.getSystemService("notification");
        if (i >= 26) {
          NotificationChannel notificationChannel = new NotificationChannel();
          this("com.allinone.callerid_notfication_N", "Showcaller", 3);
          if (notificationManager != null) {
            notificationChannel.setShowBadge(false);
            notificationChannel.enableVibration(false);
            notificationChannel.setVibrationPattern(new long[] { 0L });
            notificationManager.createNotificationChannel(notificationChannel);
            e.g("com.allinone.callerid_notfication_N");
          } 
        } 
        if (notificationManager != null)
          notificationManager.notify(100103, e.b()); 
      } 
    } finally {
      paramContext = null;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/m0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */