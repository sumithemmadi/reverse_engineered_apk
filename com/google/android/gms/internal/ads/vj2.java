package com.google.android.gms.internal.ads;

import android.os.SystemClock;

public final class vj2 implements nj2 {
  private boolean a;
  
  private long b;
  
  private long c;
  
  private qc2 d = qc2.a;
  
  public final void a() {
    if (!this.a) {
      this.c = SystemClock.elapsedRealtime();
      this.a = true;
    } 
  }
  
  public final void b() {
    if (this.a) {
      d(s());
      this.a = false;
    } 
  }
  
  public final void c(nj2 paramnj2) {
    d(paramnj2.s());
    this.d = paramnj2.l();
  }
  
  public final void d(long paramLong) {
    this.b = paramLong;
    if (this.a)
      this.c = SystemClock.elapsedRealtime(); 
  }
  
  public final qc2 k(qc2 paramqc2) {
    if (this.a)
      d(s()); 
    this.d = paramqc2;
    return paramqc2;
  }
  
  public final qc2 l() {
    return this.d;
  }
  
  public final long s() {
    long l1 = this.b;
    long l2 = l1;
    if (this.a) {
      l2 = SystemClock.elapsedRealtime() - this.c;
      qc2 qc21 = this.d;
      if (qc21.b == 1.0F) {
        l2 = zb2.b(l2);
      } else {
        l2 = qc21.a(l2);
      } 
      l2 = l1 + l2;
    } 
    return l2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */