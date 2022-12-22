package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class g81<S extends t91<?>> implements s91<S> {
  private final s91<S> a;
  
  private final long b;
  
  private final ScheduledExecutorService c;
  
  public g81(s91<S> params91, long paramLong, ScheduledExecutorService paramScheduledExecutorService) {
    this.a = params91;
    this.b = paramLong;
    this.c = paramScheduledExecutorService;
  }
  
  public final ot1<S> a() {
    ot1<S> ot11 = this.a.a();
    long l = this.b;
    ot1<S> ot12 = ot11;
    if (l > 0L)
      ot12 = dt1.d(ot11, l, TimeUnit.MILLISECONDS, this.c); 
    return dt1.l(ot12, Throwable.class, k81.a, fm.f);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/g81.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */