package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import java.io.InputStream;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class tq0 {
  private final ScheduledExecutorService a;
  
  private final nt1 b;
  
  private final kr0 c;
  
  private final t82<is0> d;
  
  public tq0(ScheduledExecutorService paramScheduledExecutorService, nt1 paramnt1, kr0 paramkr0, t82<is0> paramt82) {
    this.a = paramScheduledExecutorService;
    this.b = paramnt1;
    this.c = paramkr0;
    this.d = paramt82;
  }
  
  public final ot1<InputStream> b(zzatq paramzzatq) {
    String str = paramzzatq.e;
    q.c();
    if (h1.e0(str)) {
      ot1 = dt1.a(new zzcoc(zzdom.b));
    } else {
      ot1 = this.c.b(paramzzatq);
    } 
    int i = Binder.getCallingUid();
    ot1<InputStream> ot1 = ys1.H(ot1);
    x<Integer> x = m0.e4;
    return ot1.C(((Integer)er2.e().<Integer>c(x)).intValue(), TimeUnit.SECONDS, this.a).F(Throwable.class, new xq0(this, paramzzatq, i), this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tq0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */