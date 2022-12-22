package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;

public final class bm {
  public static <T> T a(Context paramContext, String paramString, dm<IBinder, T> paramdm) {
    try {
      return paramdm.a(c(paramContext).d(paramString));
    } catch (Exception exception) {
      throw new zzazl(exception);
    } 
  }
  
  public static Context b(Context paramContext) {
    return c(paramContext).b();
  }
  
  private static DynamiteModule c(Context paramContext) {
    try {
      return DynamiteModule.e(paramContext, DynamiteModule.h, "com.google.android.gms.ads.dynamite");
    } catch (Exception exception) {
      throw new zzazl(exception);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */