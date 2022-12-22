package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class rt1 extends ut1 implements nt1, ScheduledExecutorService {
  private final ScheduledExecutorService c;
  
  rt1(ScheduledExecutorService paramScheduledExecutorService) {
    super(paramScheduledExecutorService);
    this.c = xq1.<ScheduledExecutorService>b(paramScheduledExecutorService);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rt1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */