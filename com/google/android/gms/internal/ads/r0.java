package com.google.android.gms.internal.ads;

import android.text.TextUtils;

@Deprecated
public final class r0 {
  public static void a(p0 paramp0, q0 paramq0) {
    if (paramq0.a() != null) {
      if (!TextUtils.isEmpty(paramq0.b())) {
        paramp0.b(paramq0.a(), paramq0.b(), paramq0.c(), paramq0.d());
        return;
      } 
      throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
    } 
    throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/r0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */