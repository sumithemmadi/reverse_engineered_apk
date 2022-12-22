package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;

public final class lh1 {
  private final e a;
  
  private final Object b = new Object();
  
  private volatile int c = oh1.a;
  
  private volatile long d = 0L;
  
  public lh1(e parame) {
    this.a = parame;
  }
  
  private final void a() {
    long l = this.a.a();
    synchronized (this.b) {
      if (this.c == oh1.c) {
        long l1 = this.d;
        x<Long> x = m0.C4;
        if (l1 + ((Long)er2.e().<Long>c(x)).longValue() <= l)
          this.c = oh1.a; 
      } 
      return;
    } 
  }
  
  private final void e(int paramInt1, int paramInt2) {
    a();
    long l = this.a.a();
    synchronized (this.b) {
      if (this.c != paramInt1)
        return; 
      this.c = paramInt2;
      if (this.c == oh1.c)
        this.d = l; 
      return;
    } 
  }
  
  public final boolean b() {
    synchronized (this.b) {
      boolean bool;
      a();
      if (this.c == oh1.b) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  public final boolean c() {
    synchronized (this.b) {
      boolean bool;
      a();
      if (this.c == oh1.c) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  public final void d(boolean paramBoolean) {
    if (paramBoolean) {
      e(oh1.a, oh1.b);
      return;
    } 
    e(oh1.b, oh1.a);
  }
  
  public final void f() {
    e(oh1.b, oh1.c);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lh1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */