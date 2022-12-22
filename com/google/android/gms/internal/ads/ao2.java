package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.b;

public final class ao2 {
  wb2 a;
  
  boolean b;
  
  public ao2() {}
  
  public ao2(Context paramContext) {
    m0.a(paramContext);
    x<Boolean> x = m0.x3;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      try {
        this.a = bm.<wb2>a(paramContext, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", do2.a);
        b.a2(paramContext);
        this.a.v2(b.a2(paramContext), "GMA_SDK");
        this.b = true;
        return;
      } catch (zzazl|android.os.RemoteException|NullPointerException zzazl) {
        cm.e("Cannot dynamite load clearcut");
      }  
  }
  
  public ao2(Context paramContext, String paramString1, String paramString2) {
    m0.a(paramContext);
    try {
      this.a = bm.<wb2>a(paramContext, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", eo2.a);
      b.a2(paramContext);
      this.a.r5(b.a2(paramContext), paramString1, null);
      this.b = true;
      return;
    } catch (zzazl|android.os.RemoteException|NullPointerException zzazl) {
      cm.e("Cannot dynamite load clearcut");
      return;
    } 
  }
  
  public final fo2 a(byte[] paramArrayOfbyte) {
    return new fo2(this, paramArrayOfbyte, null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ao2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */