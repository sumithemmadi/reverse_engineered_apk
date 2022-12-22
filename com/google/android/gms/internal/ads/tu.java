package com.google.android.gms.internal.ads;

import android.content.Context;

final class tu implements fh1 {
  private m92<Context> a;
  
  private m92<cf1<cl0, vk0>> b;
  
  private m92<xf1> c;
  
  private m92<bi1> d;
  
  private m92<tg1> e;
  
  private m92<hh1> f;
  
  private m92<String> g;
  
  private m92<bh1> h;
  
  private tu(pt parampt, Context paramContext, String paramString) {
    a92<Context> a92 = d92.a(paramContext);
    this.a = a92;
    this.b = new hf1(a92, pt.P(parampt), pt.Q(parampt));
    this.c = b92.a(rg1.a(pt.P(parampt)));
    this.d = b92.a(ei1.a());
    m92<?> m921 = b92.a(new ch1(this.a, pt.D(parampt), pt.m0(parampt), this.b, this.c, hi1.a(), this.d));
    this.e = (m92)m921;
    this.f = b92.a(new mh1((m92)m921, this.c, this.d));
    m921 = d92.b(paramString);
    this.g = (m92)m921;
    this.h = b92.a(new gh1((m92)m921, this.e, this.a, this.c, this.d));
  }
  
  public final hh1 a() {
    return this.f.get();
  }
  
  public final bh1 b() {
    return this.h.get();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */