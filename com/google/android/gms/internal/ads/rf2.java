package com.google.android.gms.internal.ads;

final class rf2 implements mf2 {
  private final qj2 a;
  
  private final int b;
  
  private final int c;
  
  private int d;
  
  private int e;
  
  public rf2(lf2 paramlf2) {
    qj2 qj21 = paramlf2.Q0;
    this.a = qj21;
    qj21.l(12);
    this.c = qj21.v() & 0xFF;
    this.b = qj21.v();
  }
  
  public final boolean a() {
    return false;
  }
  
  public final int b() {
    return this.b;
  }
  
  public final int c() {
    int i = this.c;
    if (i == 8)
      return this.a.g(); 
    if (i == 16)
      return this.a.h(); 
    i = this.d;
    this.d = i + 1;
    if (i % 2 == 0) {
      i = this.a.g();
      this.e = i;
      return (i & 0xF0) >> 4;
    } 
    return this.e & 0xF;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rf2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */