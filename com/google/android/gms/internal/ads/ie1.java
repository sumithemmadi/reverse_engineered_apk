package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final class ie1<R> implements qk1 {
  public final ef1<R> a;
  
  public final df1 b;
  
  public final zzvl c;
  
  public final String d;
  
  public final Executor e;
  
  public final zzvx f;
  
  private final ak1 g;
  
  public ie1(ef1<R> paramef1, df1 paramdf1, zzvl paramzzvl, String paramString, Executor paramExecutor, zzvx paramzzvx, ak1 paramak1) {
    this.a = paramef1;
    this.b = paramdf1;
    this.c = paramzzvl;
    this.d = paramString;
    this.e = paramExecutor;
    this.f = paramzzvx;
    this.g = paramak1;
  }
  
  public final Executor a() {
    return this.e;
  }
  
  public final ak1 b() {
    return this.g;
  }
  
  public final qk1 c() {
    return new ie1(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ie1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */