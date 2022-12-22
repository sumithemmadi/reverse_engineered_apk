package com.google.android.gms.internal.ads;

public abstract class yb2 implements pc2, tc2 {
  private final int a;
  
  private sc2 b;
  
  private int c;
  
  private int d;
  
  private uh2 e;
  
  private long f;
  
  private boolean g;
  
  private boolean h;
  
  public yb2(int paramInt) {
    this.a = paramInt;
    this.g = true;
  }
  
  protected abstract void A(long paramLong, boolean paramBoolean);
  
  protected void B(zzht[] paramArrayOfzzht, long paramLong) {}
  
  protected final void C(long paramLong) {
    this.e.a(paramLong - this.f);
  }
  
  protected abstract void D(boolean paramBoolean);
  
  protected abstract void E();
  
  protected final sc2 F() {
    return this.b;
  }
  
  protected final boolean G() {
    return this.g ? this.h : this.e.m();
  }
  
  public void a(int paramInt, Object paramObject) {}
  
  public final boolean c() {
    return this.g;
  }
  
  public final void d(long paramLong) {
    this.h = false;
    this.g = false;
    A(paramLong, false);
  }
  
  public final void e() {
    this.h = true;
  }
  
  public final void f(zzht[] paramArrayOfzzht, uh2 paramuh2, long paramLong) {
    jj2.e(this.h ^ true);
    this.e = paramuh2;
    this.g = false;
    this.f = paramLong;
    B(paramArrayOfzzht, paramLong);
  }
  
  public final tc2 g() {
    return this;
  }
  
  public final int getState() {
    return this.d;
  }
  
  public nj2 i() {
    return null;
  }
  
  public final uh2 j() {
    return this.e;
  }
  
  public final int n() {
    return this.a;
  }
  
  public final void p() {
    int i = this.d;
    boolean bool = true;
    if (i != 1)
      bool = false; 
    jj2.e(bool);
    this.d = 0;
    this.e = null;
    this.h = false;
    E();
  }
  
  public final void q(int paramInt) {
    this.c = paramInt;
  }
  
  public final void start() {
    int i = this.d;
    boolean bool = true;
    if (i != 1)
      bool = false; 
    jj2.e(bool);
    this.d = 2;
    x();
  }
  
  public final void stop() {
    boolean bool;
    if (this.d == 2) {
      bool = true;
    } else {
      bool = false;
    } 
    jj2.e(bool);
    this.d = 1;
    y();
  }
  
  public final void t(sc2 paramsc2, zzht[] paramArrayOfzzht, uh2 paramuh2, long paramLong1, boolean paramBoolean, long paramLong2) {
    boolean bool;
    if (this.d == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    jj2.e(bool);
    this.b = paramsc2;
    this.d = 1;
    D(paramBoolean);
    f(paramArrayOfzzht, paramuh2, paramLong2);
    A(paramLong1, paramBoolean);
  }
  
  public final boolean u() {
    return this.h;
  }
  
  public final void v() {
    this.e.b();
  }
  
  protected final int w() {
    return this.c;
  }
  
  protected abstract void x();
  
  protected abstract void y();
  
  protected final int z(nc2 paramnc2, ce2 paramce2, boolean paramBoolean) {
    int i = this.e.c(paramnc2, paramce2, paramBoolean);
    if (i == -4) {
      if (paramce2.f()) {
        this.g = true;
        return this.h ? -4 : -3;
      } 
      paramce2.d += this.f;
    } else if (i == -5) {
      zzht zzht = paramnc2.a;
      long l = zzht.x;
      if (l != Long.MAX_VALUE)
        paramnc2.a = zzht.n(l + this.f); 
    } 
    return i;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */