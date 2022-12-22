package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class k30 implements m40, b50, u80, ua0 {
  private final e50 b;
  
  private final nh1 c;
  
  private final ScheduledExecutorService d;
  
  private final Executor e;
  
  private yt1<Boolean> f = yt1.C();
  
  private ScheduledFuture<?> g;
  
  public k30(e50 parame50, nh1 paramnh1, ScheduledExecutorService paramScheduledExecutorService, Executor paramExecutor) {
    this.b = parame50;
    this.c = paramnh1;
    this.d = paramScheduledExecutorService;
    this.e = paramExecutor;
  }
  
  public final void H(kh paramkh, String paramString1, String paramString2) {}
  
  public final void I() {}
  
  public final void K() {}
  
  public final void L() {
    int i = this.c.S;
    if (i == 0 || i == 1)
      this.b.S(); 
  }
  
  public final void O() {}
  
  public final void Y() {}
  
  public final void a() {
    x<Boolean> x = m0.v1;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
      nh1 nh11 = this.c;
      if (nh11.S == 2) {
        if (nh11.p == 0) {
          this.b.S();
          return;
        } 
        dt1.g(this.f, new m30(this), this.e);
        this.g = this.d.schedule(new n30(this), this.c.p, TimeUnit.MILLISECONDS);
      } 
    } 
  }
  
  public final void b() {}
  
  public final void i() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield f : Lcom/google/android/gms/internal/ads/yt1;
    //   6: invokevirtual isDone : ()Z
    //   9: istore_1
    //   10: iload_1
    //   11: ifeq -> 17
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: aload_0
    //   18: getfield g : Ljava/util/concurrent/ScheduledFuture;
    //   21: astore_2
    //   22: aload_2
    //   23: ifnull -> 34
    //   26: aload_2
    //   27: iconst_1
    //   28: invokeinterface cancel : (Z)Z
    //   33: pop
    //   34: aload_0
    //   35: getfield f : Lcom/google/android/gms/internal/ads/yt1;
    //   38: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   41: invokevirtual i : (Ljava/lang/Object;)Z
    //   44: pop
    //   45: aload_0
    //   46: monitorexit
    //   47: return
    //   48: astore_2
    //   49: aload_0
    //   50: monitorexit
    //   51: aload_2
    //   52: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	48	finally
    //   17	22	48	finally
    //   26	34	48	finally
    //   34	45	48	finally
  }
  
  public final void n() {}
  
  public final void r(zzvg paramzzvg) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield f : Lcom/google/android/gms/internal/ads/yt1;
    //   6: invokevirtual isDone : ()Z
    //   9: istore_2
    //   10: iload_2
    //   11: ifeq -> 17
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: aload_0
    //   18: getfield g : Ljava/util/concurrent/ScheduledFuture;
    //   21: astore_1
    //   22: aload_1
    //   23: ifnull -> 34
    //   26: aload_1
    //   27: iconst_1
    //   28: invokeinterface cancel : (Z)Z
    //   33: pop
    //   34: aload_0
    //   35: getfield f : Lcom/google/android/gms/internal/ads/yt1;
    //   38: astore_1
    //   39: new java/lang/Exception
    //   42: astore_3
    //   43: aload_3
    //   44: invokespecial <init> : ()V
    //   47: aload_1
    //   48: aload_3
    //   49: invokevirtual j : (Ljava/lang/Throwable;)Z
    //   52: pop
    //   53: aload_0
    //   54: monitorexit
    //   55: return
    //   56: astore_1
    //   57: aload_0
    //   58: monitorexit
    //   59: aload_1
    //   60: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	56	finally
    //   17	22	56	finally
    //   26	34	56	finally
    //   34	53	56	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/k30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */