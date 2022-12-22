package com.google.android.gms.internal.ads;

import android.content.Context;

public final class jj1 implements a92<Context> {
  private final hj1 a;
  
  private final m92<Context> b;
  
  private jj1(hj1 paramhj1, m92<Context> paramm92) {
    this.a = paramhj1;
    this.b = paramm92;
  }
  
  public static Context a(hj1 paramhj1, Context paramContext) {
    return g92.<Context>b(paramContext, "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public static jj1 b(hj1 paramhj1, m92<Context> paramm92) {
    return new jj1(paramhj1, paramm92);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jj1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */