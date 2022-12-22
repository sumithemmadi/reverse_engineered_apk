package com.google.android.gms.ads.nativead;

import com.google.android.gms.ads.u;

public final class b {
  private final boolean a;
  
  private final int b;
  
  private final boolean c;
  
  private final int d;
  
  private final u e;
  
  private final boolean f;
  
  private b(a parama) {
    this.a = a.h(parama);
    this.b = a.i(parama);
    this.c = a.j(parama);
    this.d = a.k(parama);
    this.e = a.l(parama);
    this.f = a.m(parama);
  }
  
  public final int a() {
    return this.d;
  }
  
  public final int b() {
    return this.b;
  }
  
  public final u c() {
    return this.e;
  }
  
  public final boolean d() {
    return this.c;
  }
  
  public final boolean e() {
    return this.a;
  }
  
  public final boolean f() {
    return this.f;
  }
  
  public static final class a {
    private boolean a = false;
    
    private int b = 0;
    
    private boolean c = false;
    
    private u d;
    
    private int e = 1;
    
    private boolean f = false;
    
    public final b a() {
      return new b(this, null);
    }
    
    public final a b(int param1Int) {
      this.e = param1Int;
      return this;
    }
    
    public final a c(int param1Int) {
      this.b = param1Int;
      return this;
    }
    
    public final a d(boolean param1Boolean) {
      this.f = param1Boolean;
      return this;
    }
    
    public final a e(boolean param1Boolean) {
      this.c = param1Boolean;
      return this;
    }
    
    public final a f(boolean param1Boolean) {
      this.a = param1Boolean;
      return this;
    }
    
    public final a g(u param1u) {
      this.d = param1u;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/nativead/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */