package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class p30 implements a92<k30> {
  private final m92<e50> a;
  
  private final m92<nh1> b;
  
  private final m92<ScheduledExecutorService> c;
  
  private final m92<Executor> d;
  
  private p30(m92<e50> paramm92, m92<nh1> paramm921, m92<ScheduledExecutorService> paramm922, m92<Executor> paramm923) {
    this.a = paramm92;
    this.b = paramm921;
    this.c = paramm922;
    this.d = paramm923;
  }
  
  public static p30 a(m92<e50> paramm92, m92<nh1> paramm921, m92<ScheduledExecutorService> paramm922, m92<Executor> paramm923) {
    return new p30(paramm92, paramm921, paramm922, paramm923);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/p30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */