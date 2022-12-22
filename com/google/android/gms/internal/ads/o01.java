package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

public final class o01 implements hv0<qy> {
  private final Context a;
  
  private final nz b;
  
  private final i1 c;
  
  private final nt1 d;
  
  private final am1 e;
  
  public o01(Context paramContext, nz paramnz, am1 paramam1, nt1 paramnt1, i1 parami1) {
    this.a = paramContext;
    this.b = paramnz;
    this.e = paramam1;
    this.d = paramnt1;
    this.c = parami1;
  }
  
  public final boolean a(ci1 paramci1, nh1 paramnh1) {
    if (this.c != null) {
      uh1 uh1 = paramnh1.r;
      if (uh1 != null && uh1.a != null)
        return true; 
    } 
    return false;
  }
  
  public final ot1<qy> b(ci1 paramci1, nh1 paramnh1) {
    p01 p01 = new p01(this, new View(this.a), null, n01.a, paramnh1.t.get(0));
    ty ty = this.b.a(new g10(paramci1, paramnh1, null), p01);
    s01 s01 = ty.k();
    uh1 uh1 = paramnh1.r;
    b1 b1 = new b1(s01, uh1.b, uh1.a);
    return this.e.g(zzdrk.r).a(new q01(this, b1), this.d).j(zzdrk.s).h(dt1.h(ty.i())).f();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/o01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */