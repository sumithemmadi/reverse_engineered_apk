package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.b1;

public final class ui1 {
  public static void a(int paramInt, Throwable paramThrowable, String paramString) {
    StringBuilder stringBuilder = new StringBuilder(31);
    stringBuilder.append("Ad failed to load : ");
    stringBuilder.append(paramInt);
    cm.h(stringBuilder.toString());
    b1.l(paramString, paramThrowable);
    if (paramInt == 3)
      return; 
    q.g().h(paramThrowable, paramString);
  }
  
  public static void b(Context paramContext, boolean paramBoolean) {
    if (paramBoolean) {
      cm.h("This request is sent from a test device.");
      return;
    } 
    er2.a();
    String str = sl.j(paramContext);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 101);
    stringBuilder.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
    stringBuilder.append(str);
    stringBuilder.append("\") to get test ads on this device.");
    cm.h(stringBuilder.toString());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ui1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */