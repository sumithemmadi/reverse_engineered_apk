package com.google.android.gms.internal.ads;

public final class sk0 implements j7 {
  private final n50 b;
  
  private final zzavj c;
  
  private final String d;
  
  private final String e;
  
  public sk0(n50 paramn50, nh1 paramnh1) {
    this.b = paramn50;
    this.c = paramnh1.l;
    this.d = paramnh1.j;
    this.e = paramnh1.k;
  }
  
  public final void G0() {
    this.b.e1();
  }
  
  public final void P0() {
    this.b.f1();
  }
  
  public final void t(zzavj paramzzavj) {
    String str;
    boolean bool;
    zzavj zzavj1 = this.c;
    if (zzavj1 != null)
      paramzzavj = zzavj1; 
    if (paramzzavj != null) {
      String str1 = paramzzavj.b;
      bool = paramzzavj.c;
      str = str1;
    } else {
      str = "";
      bool = true;
    } 
    ih ih = new ih(str, bool);
    this.b.g1(ih, this.d, this.e);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sk0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */