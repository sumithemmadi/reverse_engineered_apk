package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.b;

public class yu {
  private a a;
  
  public yu(a parama) {
    this.a = parama;
  }
  
  public final xj a() {
    return this.a.d();
  }
  
  public final lf b() {
    return this.a.e();
  }
  
  public final r1 c() {
    return this.a.f();
  }
  
  public final b d() {
    a a1 = this.a;
    return new b(a1.a(), a1.b(), (tj)new oj(a1.d()), a1.c(), a1.e(), a1.f());
  }
  
  public static abstract class a {
    public abstract cq a();
    
    public abstract nn b();
    
    public abstract ao2 c();
    
    public abstract xj d();
    
    public abstract lf e();
    
    public abstract r1 f();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */