package com.google.android.gms.internal.ads;

final class of2 implements mf2 {
  private final int a;
  
  private final int b;
  
  private final qj2 c;
  
  public of2(lf2 paramlf2) {
    qj2 qj21 = paramlf2.Q0;
    this.c = qj21;
    qj21.l(12);
    this.a = qj21.v();
    this.b = qj21.v();
  }
  
  public final boolean a() {
    return (this.a != 0);
  }
  
  public final int b() {
    return this.b;
  }
  
  public final int c() {
    int i = this.a;
    int j = i;
    if (i == 0)
      j = this.c.v(); 
    return j;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/of2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */