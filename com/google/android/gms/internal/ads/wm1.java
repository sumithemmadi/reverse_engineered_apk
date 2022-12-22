package com.google.android.gms.internal.ads;

import java.util.Map;

public final class wm1 implements pm1 {
  private final mm1 a;
  
  private final an1 b;
  
  private final ym1 c;
  
  public wm1(mm1 parammm1, an1 paraman1, ym1 paramym1) {
    this.a = parammm1;
    this.b = paraman1;
    this.c = paramym1;
  }
  
  public final String a(rm1 paramrm1) {
    an1 an11 = this.b;
    Map<String, String> map = paramrm1.g();
    this.c.a(map);
    return an11.a(map);
  }
  
  public final void b(rm1 paramrm1) {
    this.a.a(a(paramrm1));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wm1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */