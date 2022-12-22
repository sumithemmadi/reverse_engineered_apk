package com.google.android.gms.internal.ads;

import java.util.Map;

public final class fn1 implements pm1 {
  private final an1 a;
  
  private final ym1 b;
  
  public fn1(an1 paraman1, ym1 paramym1) {
    this.a = paraman1;
    this.b = paramym1;
  }
  
  public final String a(rm1 paramrm1) {
    an1 an11 = this.a;
    Map<String, String> map = paramrm1.g();
    this.b.a(map);
    return an11.a(map);
  }
  
  public final void b(rm1 paramrm1) {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */