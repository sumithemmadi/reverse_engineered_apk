package com.google.android.gms.internal.ads;

import java.util.Map;

public final class sn0 implements fm1 {
  private Map<zzdrk, un0> b;
  
  private xn2 c;
  
  sn0(xn2 paramxn2, Map<zzdrk, un0> paramMap) {
    this.b = paramMap;
    this.c = paramxn2;
  }
  
  public final void B(zzdrk paramzzdrk, String paramString) {
    if (this.b.containsKey(paramzzdrk))
      this.c.a(((un0)this.b.get(paramzzdrk)).b); 
  }
  
  public final void C(zzdrk paramzzdrk, String paramString, Throwable paramThrowable) {
    if (this.b.containsKey(paramzzdrk))
      this.c.a(((un0)this.b.get(paramzzdrk)).c); 
  }
  
  public final void g0(zzdrk paramzzdrk, String paramString) {}
  
  public final void t(zzdrk paramzzdrk, String paramString) {
    if (this.b.containsKey(paramzzdrk))
      this.c.a(((un0)this.b.get(paramzzdrk)).a); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sn0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */