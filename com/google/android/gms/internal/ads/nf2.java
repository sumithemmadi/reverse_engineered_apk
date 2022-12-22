package com.google.android.gms.internal.ads;

final class nf2 {
  public final int a;
  
  public int b;
  
  public int c;
  
  public long d;
  
  private final boolean e;
  
  private final qj2 f;
  
  private final qj2 g;
  
  private int h;
  
  private int i;
  
  public nf2(qj2 paramqj21, qj2 paramqj22, boolean paramBoolean) {
    this.g = paramqj21;
    this.f = paramqj22;
    this.e = paramBoolean;
    paramqj22.l(12);
    this.a = paramqj22.v();
    paramqj21.l(12);
    this.i = paramqj21.v();
    int i = paramqj21.d();
    paramBoolean = true;
    if (i != 1)
      paramBoolean = false; 
    jj2.f(paramBoolean, "first_chunk must be 1");
    this.b = -1;
  }
  
  public final boolean a() {
    long l;
    int i = this.b + 1;
    this.b = i;
    if (i == this.a)
      return false; 
    if (this.e) {
      l = this.f.w();
    } else {
      l = this.f.s();
    } 
    this.d = l;
    if (this.b == this.h) {
      this.c = this.g.v();
      this.g.m(4);
      i = this.i - 1;
      this.i = i;
      if (i > 0) {
        i = this.g.v() - 1;
      } else {
        i = -1;
      } 
      this.h = i;
    } 
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nf2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */