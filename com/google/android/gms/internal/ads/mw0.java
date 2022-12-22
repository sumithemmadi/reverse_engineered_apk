package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.a0;
import com.google.android.gms.ads.internal.util.h0;
import java.util.concurrent.Executor;

public final class mw0 implements ov0<qy, xi1, cx0> {
  private final Context a;
  
  private final zzazn b;
  
  private final nz c;
  
  private final Executor d;
  
  public mw0(Context paramContext, zzazn paramzzazn, nz paramnz, Executor paramExecutor) {
    this.a = paramContext;
    this.b = paramzzazn;
    this.c = paramnz;
    this.d = paramExecutor;
  }
  
  public final void b(ci1 paramci1, nh1 paramnh1, jv0<xi1, cx0> paramjv0) {
    zzvs zzvs = paramci1.a.a.e;
    if (zzvs.o) {
      zzvs = new zzvs(this.a, a0.a(zzvs.f, zzvs.c));
    } else {
      zzvs = ki1.b(this.a, paramnh1.t);
    } 
    if (this.b.d < 4100000) {
      ((xi1)paramjv0.b).q(this.a, zzvs, paramci1.a.a.d, paramnh1.u.toString(), (sb)paramjv0.c);
      return;
    } 
    ((xi1)paramjv0.b).r(this.a, zzvs, paramci1.a.a.d, paramnh1.u.toString(), h0.a(paramnh1.r), (sb)paramjv0.c);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mw0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */