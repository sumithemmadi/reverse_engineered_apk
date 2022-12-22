package com.google.android.gms.internal.ads;

public final class kb1 implements s91<hb1> {
  private xk a;
  
  private nt1 b;
  
  private String c;
  
  public kb1(xk paramxk, nt1 paramnt1, String paramString) {
    this.a = paramxk;
    this.b = paramnt1;
    this.c = paramString;
  }
  
  public final ot1<hb1> a() {
    new sm();
    ot1<?> ot1 = dt1.h(null);
    x<Boolean> x = m0.t4;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      ot1 = this.a.a(this.c); 
    ot1<String> ot11 = this.a.b(this.c);
    return dt1.i((ot1<?>[])new ot1[] { ot1, ot11 }).a(new jb1(ot1, ot11), fm.a);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kb1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */