package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

public final class fj0 {
  private final Executor a;
  
  private final gx b;
  
  private final eb0 c;
  
  fj0(Executor paramExecutor, gx paramgx, eb0 parameb0) {
    this.a = paramExecutor;
    this.c = parameb0;
    this.b = paramgx;
  }
  
  public final void c(tq paramtq) {
    if (paramtq == null)
      return; 
    this.c.b1(paramtq.getView());
    this.c.Z0(new ij0(paramtq), this.a);
    this.c.Z0(new hj0(paramtq), this.a);
    this.c.Z0(this.b, this.a);
    this.b.s(paramtq);
    paramtq.d("/trackActiveViewUnit", new kj0(this));
    paramtq.d("/untrackActiveViewUnit", new jj0(this));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */