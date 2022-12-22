package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;
import java.util.concurrent.ScheduledExecutorService;

public final class ry implements a92<u60> {
  private final m92<ScheduledExecutorService> a;
  
  private final m92<e> b;
  
  public ry(m92<ScheduledExecutorService> paramm92, m92<e> paramm921) {
    this.a = paramm92;
    this.b = paramm921;
  }
  
  public static u60 a(ScheduledExecutorService paramScheduledExecutorService, e parame) {
    return g92.<u60>b(new u60(paramScheduledExecutorService, parame), "Cannot return null from a non-@Nullable @Provides method");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */