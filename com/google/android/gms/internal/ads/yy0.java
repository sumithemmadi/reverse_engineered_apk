package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class yy0<AdT> implements qs1<ci1, AdT> {
  private final am1 a;
  
  private final p40 b;
  
  private final hn1 c;
  
  private final jn1 d;
  
  private final Executor e;
  
  private final ScheduledExecutorService f;
  
  private final u00<AdT> g;
  
  private final vy0 h;
  
  private final nv0 i;
  
  public yy0(am1 paramam1, vy0 paramvy0, p40 paramp40, hn1 paramhn1, jn1 paramjn1, u00<AdT> paramu00, Executor paramExecutor, ScheduledExecutorService paramScheduledExecutorService, nv0 paramnv0) {
    this.a = paramam1;
    this.h = paramvy0;
    this.b = paramp40;
    this.c = paramhn1;
    this.d = paramjn1;
    this.g = paramu00;
    this.e = paramExecutor;
    this.f = paramScheduledExecutorService;
    this.i = paramnv0;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yy0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */