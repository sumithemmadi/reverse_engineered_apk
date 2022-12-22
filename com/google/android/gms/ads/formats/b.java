package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.u;

@Deprecated
public final class b {
  private final boolean a;
  
  private final int b;
  
  private final int c;
  
  private final boolean d;
  
  private final int e;
  
  private final u f;
  
  private final boolean g;
  
  private b(a parama) {
    this.a = a.i(parama);
    this.b = a.j(parama);
    this.c = a.k(parama);
    this.d = a.l(parama);
    this.e = a.m(parama);
    this.f = a.n(parama);
    this.g = a.o(parama);
  }
  
  public final int a() {
    return this.e;
  }
  
  @Deprecated
  public final int b() {
    return this.b;
  }
  
  public final int c() {
    return this.c;
  }
  
  public final u d() {
    return this.f;
  }
  
  public final boolean e() {
    return this.d;
  }
  
  public final boolean f() {
    return this.a;
  }
  
  public final boolean g() {
    return this.g;
  }
  
  public static final class a {
    private boolean a = false;
    
    private int b = -1;
    
    private int c = 0;
    
    private boolean d = false;
    
    private u e;
    
    private int f = 1;
    
    private boolean g = false;
    
    public final b a() {
      return new b(this, null);
    }
    
    public final a b(int param1Int) {
      this.f = param1Int;
      return this;
    }
    
    @Deprecated
    public final a c(int param1Int) {
      this.b = param1Int;
      return this;
    }
    
    public final a d(int param1Int) {
      this.c = param1Int;
      return this;
    }
    
    public final a e(boolean param1Boolean) {
      this.g = param1Boolean;
      return this;
    }
    
    public final a f(boolean param1Boolean) {
      this.d = param1Boolean;
      return this;
    }
    
    public final a g(boolean param1Boolean) {
      this.a = param1Boolean;
      return this;
    }
    
    public final a h(u param1u) {
      this.e = param1u;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/formats/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */