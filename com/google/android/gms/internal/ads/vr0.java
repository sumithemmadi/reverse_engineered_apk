package com.google.android.gms.internal.ads;

import java.util.Map;

public final class vr0 implements wr0 {
  private final Map<String, m92<wr0>> a;
  
  private final nt1 b;
  
  private final b70 c;
  
  public vr0(Map<String, m92<wr0>> paramMap, nt1 paramnt1, b70 paramb70) {
    this.a = paramMap;
    this.b = paramnt1;
    this.c = paramb70;
  }
  
  public final ot1<ci1> a(zzatq paramzzatq) {
    this.c.J(paramzzatq);
    ot1<?> ot1 = dt1.a(new zzcmb(zzdom.d));
    x<String> x = m0.M5;
    String[] arrayOfString = ((String)er2.e().<String>c(x)).split(",");
    int i = arrayOfString.length;
    byte b = 0;
    while (b < i) {
      String str = arrayOfString[b];
      m92 m92 = this.a.get(str.trim());
      ot1<?> ot11 = ot1;
      if (m92 != null)
        ot11 = dt1.l(ot1, zzcmb.class, new ur0(m92, paramzzatq), this.b); 
      b++;
      ot1 = ot11;
    } 
    dt1.g(ot1, new yr0(this), fm.f);
    return (ot1)ot1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vr0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */