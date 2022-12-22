package com.google.android.gms.internal.ads;

import android.content.Context;

public final class qq0 implements a92<String> {
  private final m92<Context> a;
  
  private qq0(m92<Context> paramm92) {
    this.a = paramm92;
  }
  
  public static qq0 a(m92<Context> paramm92) {
    return new qq0(paramm92);
  }
  
  public static String b(Context paramContext) {
    return g92.<String>b(paramContext.getPackageName(), "Cannot return null from a non-@Nullable @Provides method");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qq0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */