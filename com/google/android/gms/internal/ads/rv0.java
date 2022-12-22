package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class rv0 implements hv0<ly> {
  private final fy a;
  
  private final Context b;
  
  private final kl0 c;
  
  private final gi1 d;
  
  private final Executor e;
  
  private final zzazn f;
  
  public rv0(fy paramfy, Context paramContext, Executor paramExecutor, kl0 paramkl0, gi1 paramgi1, zzazn paramzzazn) {
    this.b = paramContext;
    this.a = paramfy;
    this.e = paramExecutor;
    this.c = paramkl0;
    this.d = paramgi1;
    this.f = paramzzazn;
  }
  
  public final boolean a(ci1 paramci1, nh1 paramnh1) {
    uh1 uh1 = paramnh1.r;
    return (uh1 != null && uh1.a != null);
  }
  
  public final ot1<ly> b(ci1 paramci1, nh1 paramnh1) {
    am0 am0 = new am0();
    ot1<?> ot1 = dt1.k(dt1.h(null), new qv0(this, paramnh1, paramci1, am0), this.e);
    ot1.a(tv0.a(am0), this.e);
    return (ot1)ot1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rv0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */