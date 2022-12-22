package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

public final class mq0 implements a92<ApplicationInfo> {
  private final m92<Context> a;
  
  private mq0(m92<Context> paramm92) {
    this.a = paramm92;
  }
  
  public static mq0 a(m92<Context> paramm92) {
    return new mq0(paramm92);
  }
  
  public static ApplicationInfo b(Context paramContext) {
    return g92.<ApplicationInfo>b(paramContext.getApplicationInfo(), "Cannot return null from a non-@Nullable @Provides method");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mq0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */