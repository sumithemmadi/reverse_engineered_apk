package com.google.android.gms.internal.common;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

final class f implements e {
  private f() {}
  
  public final ScheduledExecutorService a(int paramInt1, int paramInt2) {
    return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/common/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */