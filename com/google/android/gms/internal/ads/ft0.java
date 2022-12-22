package com.google.android.gms.internal.ads;

public final class ft0 implements r40, d60, d70 {
  private final rm1 b;
  
  private final pm1 c;
  
  private final pl d;
  
  public ft0(rm1 paramrm1, pm1 parampm1, pl parampl) {
    this.b = paramrm1;
    this.c = parampm1;
    this.d = parampl;
  }
  
  public final void E(zzvg paramzzvg) {
    this.b.i("action", "ftl").i("ftl", String.valueOf(paramzzvg.b)).i("ed", paramzzvg.d);
    this.c.b(this.b);
  }
  
  public final void J(zzatq paramzzatq) {
    this.b.h(paramzzatq.b);
  }
  
  public final void i() {
    this.c.b(this.b.i("action", "loaded"));
  }
  
  public final void i0(ci1 paramci1) {
    this.b.a(paramci1, this.d);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ft0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */