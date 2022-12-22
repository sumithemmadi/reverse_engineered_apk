package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

public final class k00 implements d60, yk2 {
  private final nh1 b;
  
  private final e50 c;
  
  private final h60 d;
  
  private final AtomicBoolean e = new AtomicBoolean();
  
  private final AtomicBoolean f = new AtomicBoolean();
  
  public k00(nh1 paramnh1, e50 parame50, h60 paramh60) {
    this.b = paramnh1;
    this.c = parame50;
    this.d = paramh60;
  }
  
  private final void l() {
    if (this.e.compareAndSet(false, true))
      this.c.S(); 
  }
  
  public final void i() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Lcom/google/android/gms/internal/ads/nh1;
    //   6: getfield e : I
    //   9: iconst_1
    //   10: if_icmpeq -> 17
    //   13: aload_0
    //   14: invokespecial l : ()V
    //   17: aload_0
    //   18: monitorexit
    //   19: return
    //   20: astore_1
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_1
    //   24: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	20	finally
  }
  
  public final void k0(zk2 paramzk2) {
    if (this.b.e == 1 && paramzk2.m)
      l(); 
    if (paramzk2.m && this.f.compareAndSet(false, true))
      this.d.o1(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/k00.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */