package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zw0 implements hv0<qy> {
  private final nz a;
  
  private final ew0 b;
  
  private final nt1 c;
  
  private final p40 d;
  
  private final ScheduledExecutorService e;
  
  public zw0(nz paramnz, ew0 paramew0, p40 paramp40, ScheduledExecutorService paramScheduledExecutorService, nt1 paramnt1) {
    this.a = paramnz;
    this.b = paramew0;
    this.d = paramp40;
    this.e = paramScheduledExecutorService;
    this.c = paramnt1;
  }
  
  public final boolean a(ci1 paramci1, nh1 paramnh1) {
    return (paramci1.a.a.a() != null && this.b.a(paramci1, paramnh1));
  }
  
  public final ot1<qy> b(ci1 paramci1, nh1 paramnh1) {
    return this.c.a(new xw0(this, paramci1, paramnh1));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zw0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */