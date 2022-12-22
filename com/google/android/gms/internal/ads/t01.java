package com.google.android.gms.internal.ads;

public final class t01<AdT> implements hv0<AdT> {
  private final i1 a;
  
  private final nt1 b;
  
  private final am1 c;
  
  private final y01<AdT> d;
  
  public t01(am1 paramam1, nt1 paramnt1, i1 parami1, y01<AdT> paramy01) {
    this.c = paramam1;
    this.b = paramnt1;
    this.a = parami1;
    this.d = paramy01;
  }
  
  public final boolean a(ci1 paramci1, nh1 paramnh1) {
    if (this.a != null) {
      uh1 uh1 = paramnh1.r;
      if (uh1 != null && uh1.a != null)
        return true; 
    } 
    return false;
  }
  
  public final ot1<AdT> b(ci1 paramci1, nh1 paramnh1) {
    sm sm = new sm();
    c11 c11 = new c11();
    c11.d(new v01(this, sm, paramci1, paramnh1, c11));
    uh1 uh1 = paramnh1.r;
    b1 b1 = new b1(c11, uh1.b, uh1.a);
    return this.c.g(zzdrk.r).a(new w01(this, b1), this.b).j(zzdrk.s).h(sm).f();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/t01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */