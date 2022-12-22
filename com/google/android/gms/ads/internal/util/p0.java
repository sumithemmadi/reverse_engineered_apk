package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.q;

public final class p0 {
  private long a;
  
  private long b = Long.MIN_VALUE;
  
  private final Object c = new Object();
  
  public p0(long paramLong) {
    this.a = paramLong;
  }
  
  public final boolean a() {
    synchronized (this.c) {
      long l = q.j().b();
      if (this.b + this.a > l)
        return false; 
      this.b = l;
      return true;
    } 
  }
  
  public final void b(long paramLong) {
    synchronized (this.c) {
      this.a = paramLong;
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/p0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */