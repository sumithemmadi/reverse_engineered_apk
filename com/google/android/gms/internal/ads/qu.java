package com.google.android.gms.internal.ads;

import android.content.Context;

final class qu implements vf1 {
  private m92<Context> a;
  
  private m92<zzvs> b;
  
  private m92<String> c;
  
  private m92<z11> d;
  
  private m92<xf1> e;
  
  private m92<mf1> f;
  
  private m92<v21> g;
  
  private qu(pt parampt, Context paramContext, String paramString, zzvs paramzzvs) {
    this.a = d92.a(paramContext);
    this.b = d92.a(paramzzvs);
    this.c = d92.a(paramString);
    this.d = b92.a(p21.a(pt.k0(parampt)));
    this.e = b92.a(rg1.a(pt.P(parampt)));
    m92<?> m921 = b92.a(new sf1(this.a, pt.D(parampt), pt.m0(parampt), this.d, this.e, hi1.a()));
    this.f = (m92)m921;
    this.g = b92.a(new x21(this.a, this.b, this.c, (m92)m921, this.d, this.e));
  }
  
  public final v21 a() {
    return this.g.get();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */