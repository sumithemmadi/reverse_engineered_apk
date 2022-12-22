package com.google.android.gms.internal.ads;

public final class zn0 implements r40, d60, d70 {
  private final ho0 b;
  
  private final so0 c;
  
  public zn0(ho0 paramho0, so0 paramso0) {
    this.b = paramho0;
    this.c = paramso0;
  }
  
  public final void E(zzvg paramzzvg) {
    this.b.c().put("action", "ftl");
    this.b.c().put("ftl", String.valueOf(paramzzvg.b));
    this.b.c().put("ed", paramzzvg.d);
    this.c.b(this.b.c());
  }
  
  public final void J(zzatq paramzzatq) {
    this.b.b(paramzzatq.b);
  }
  
  public final void i() {
    this.b.c().put("action", "loaded");
    this.c.b(this.b.c());
  }
  
  public final void i0(ci1 paramci1) {
    this.b.a(paramci1);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zn0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */