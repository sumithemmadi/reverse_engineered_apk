package com.google.android.exoplayer2.util;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;

@SuppressLint({"InlinedApi"})
public final class t {
  public static void a(Context paramContext, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    if (h0.a >= 26) {
      NotificationManager notificationManager = (NotificationManager)paramContext.getSystemService("notification");
      NotificationChannel notificationChannel = new NotificationChannel(paramString, paramContext.getString(paramInt1), paramInt3);
      if (paramInt2 != 0)
        notificationChannel.setDescription(paramContext.getString(paramInt2)); 
      notificationManager.createNotificationChannel(notificationChannel);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */