package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class nz0 implements hv0<vk0> {
  private final Context a;
  
  private final kl0 b;
  
  private final cl0 c;
  
  private final gi1 d;
  
  private final Executor e;
  
  private final zzazn f;
  
  public nz0(Context paramContext, zzazn paramzzazn, gi1 paramgi1, Executor paramExecutor, cl0 paramcl0, kl0 paramkl0) {
    this.a = paramContext;
    this.d = paramgi1;
    this.c = paramcl0;
    this.e = paramExecutor;
    this.f = paramzzazn;
    this.b = paramkl0;
  }
  
  public final boolean a(ci1 paramci1, nh1 paramnh1) {
    uh1 uh1 = paramnh1.r;
    return (uh1 != null && uh1.a != null);
  }
  
  public final ot1<vk0> b(ci1 paramci1, nh1 paramnh1) {
    am0 am0 = new am0();
    ot1<?> ot1 = dt1.k(dt1.h(null), new mz0(this, paramnh1, paramci1, am0), this.e);
    ot1.a(pz0.a(am0), this.e);
    return (ot1)ot1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */