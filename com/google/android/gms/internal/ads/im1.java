package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class im1 implements a92<am1> {
  private final m92<nt1> a;
  
  private final m92<ScheduledExecutorService> b;
  
  private final m92<cm1> c;
  
  private im1(m92<nt1> paramm92, m92<ScheduledExecutorService> paramm921, m92<cm1> paramm922) {
    this.a = paramm92;
    this.b = paramm921;
    this.c = paramm922;
  }
  
  public static im1 a(m92<nt1> paramm92, m92<ScheduledExecutorService> paramm921, m92<cm1> paramm922) {
    return new im1(paramm92, paramm921, paramm922);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/im1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */