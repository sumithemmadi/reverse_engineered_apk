package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.w;
import java.util.List;

public class d {
  private static d a = new d();
  
  private static Boolean b;
  
  private static boolean c = false;
  
  public static d a() {
    return a;
  }
  
  private static void d(Context paramContext, WakeLockEvent paramWakeLockEvent) {
    try {
      Intent intent = new Intent();
      this();
      paramContext.startService(intent.setComponent(b.a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", (Parcelable)paramWakeLockEvent));
      return;
    } catch (Exception exception) {
      Log.wtf("WakeLockTracker", exception);
      return;
    } 
  }
  
  private static boolean e() {
    if (b == null)
      b = Boolean.FALSE; 
    return b.booleanValue();
  }
  
  public void b(Context paramContext, String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, int paramInt2, List<String> paramList) {
    c(paramContext, paramString1, paramInt1, paramString2, paramString3, paramString4, paramInt2, paramList, 0L);
  }
  
  public void c(Context paramContext, String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, int paramInt2, List<String> paramList, long paramLong) {
    String str;
    if (!e())
      return; 
    if (TextUtils.isEmpty(paramString1)) {
      str = String.valueOf(paramString1);
      if (str.length() != 0) {
        str = "missing wakeLock key. ".concat(str);
      } else {
        str = new String("missing wakeLock key. ");
      } 
      Log.e("WakeLockTracker", str);
      return;
    } 
    if (7 == paramInt1 || 8 == paramInt1 || 10 == paramInt1 || 11 == paramInt1)
      d((Context)str, new WakeLockEvent(System.currentTimeMillis(), paramInt1, paramString2, paramInt2, c.c(paramList), paramString1, SystemClock.elapsedRealtime(), w.a((Context)str), paramString3, c.b(str.getPackageName()), w.b((Context)str), paramLong, paramString4, false)); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/stats/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */