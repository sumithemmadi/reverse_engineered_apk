package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

final class kl {
  private final Object a = new Object();
  
  private volatile int b = jl.a;
  
  private volatile long c = 0L;
  
  private kl() {}
  
  public final void a() {
    long l = q.j().a();
    synchronized (this.a) {
      int i = this.b;
      int j = jl.b;
      if (i == j) {
        long l1 = this.c;
        x<Long> x = m0.C4;
        if (l1 + ((Long)er2.e().<Long>c(x)).longValue() <= l)
          this.b = jl.a; 
      } 
      l = q.j().a();
      synchronized (this.a) {
        if (this.b != 2)
          return; 
        this.b = 3;
        if (this.b == j)
          this.c = l; 
        return;
      } 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */