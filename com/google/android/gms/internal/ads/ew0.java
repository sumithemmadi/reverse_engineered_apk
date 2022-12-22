package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.e;
import java.util.concurrent.Executor;

public final class ew0 implements hv0<qy> {
  private final nz a;
  
  private final Context b;
  
  private final kl0 c;
  
  private final gi1 d;
  
  private final Executor e;
  
  private final kq1<nh1, e> f;
  
  public ew0(nz paramnz, Context paramContext, Executor paramExecutor, kl0 paramkl0, gi1 paramgi1, kq1<nh1, e> paramkq1) {
    this.b = paramContext;
    this.a = paramnz;
    this.e = paramExecutor;
    this.c = paramkl0;
    this.d = paramgi1;
    this.f = paramkq1;
  }
  
  public final boolean a(ci1 paramci1, nh1 paramnh1) {
    uh1 uh1 = paramnh1.r;
    return (uh1 != null && uh1.a != null);
  }
  
  public final ot1<qy> b(ci1 paramci1, nh1 paramnh1) {
    return dt1.k(dt1.h(null), new dw0(this, paramci1, paramnh1), this.e);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ew0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */