package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

public final class zq0 implements wr0 {
  private static final Pattern a = Pattern.compile("Received error HTTP response code: (.*)");
  
  private final aq0 b;
  
  private final nt1 c;
  
  private final gi1 d;
  
  private final ScheduledExecutorService e;
  
  private final zt0 f;
  
  zq0(gi1 paramgi1, aq0 paramaq0, nt1 paramnt1, ScheduledExecutorService paramScheduledExecutorService, zt0 paramzt0) {
    this.d = paramgi1;
    this.b = paramaq0;
    this.c = paramnt1;
    this.e = paramScheduledExecutorService;
    this.f = paramzt0;
  }
  
  public final ot1<ci1> a(zzatq paramzzatq) {
    ot1<?> ot12 = dt1.k(this.b.b(paramzzatq), new yq0(this), this.c);
    x<Boolean> x = m0.d4;
    ot1<?> ot11 = ot12;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
      x<Integer> x1 = m0.e4;
      ot11 = dt1.l(dt1.d(ot12, ((Integer)er2.e().<Integer>c(x1)).intValue(), TimeUnit.SECONDS, this.e), TimeoutException.class, br0.a, fm.f);
    } 
    dt1.g(ot11, new ar0(this), fm.f);
    return (ot1)ot11;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zq0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */