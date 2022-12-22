package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.e;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

public final class kx implements pl2 {
  private final ScheduledExecutorService a;
  
  private final e b;
  
  private ScheduledFuture<?> c;
  
  private long d = -1L;
  
  private long e = -1L;
  
  private Runnable f = null;
  
  private boolean g = false;
  
  public kx(ScheduledExecutorService paramScheduledExecutorService, e parame) {
    this.a = paramScheduledExecutorService;
    this.b = parame;
    q.f().d(this);
  }
  
  private final void c() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : Z
    //   6: ifne -> 71
    //   9: aload_0
    //   10: getfield c : Ljava/util/concurrent/ScheduledFuture;
    //   13: astore_1
    //   14: aload_1
    //   15: ifnull -> 59
    //   18: aload_1
    //   19: invokeinterface isDone : ()Z
    //   24: ifne -> 59
    //   27: aload_0
    //   28: getfield c : Ljava/util/concurrent/ScheduledFuture;
    //   31: iconst_1
    //   32: invokeinterface cancel : (Z)Z
    //   37: pop
    //   38: aload_0
    //   39: aload_0
    //   40: getfield d : J
    //   43: aload_0
    //   44: getfield b : Lcom/google/android/gms/common/util/e;
    //   47: invokeinterface b : ()J
    //   52: lsub
    //   53: putfield e : J
    //   56: goto -> 66
    //   59: aload_0
    //   60: ldc2_w -1
    //   63: putfield e : J
    //   66: aload_0
    //   67: iconst_1
    //   68: putfield g : Z
    //   71: aload_0
    //   72: monitorexit
    //   73: return
    //   74: astore_1
    //   75: aload_0
    //   76: monitorexit
    //   77: aload_1
    //   78: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	74	finally
    //   18	56	74	finally
    //   59	66	74	finally
    //   66	71	74	finally
  }
  
  private final void d() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : Z
    //   6: ifeq -> 65
    //   9: aload_0
    //   10: getfield e : J
    //   13: lconst_0
    //   14: lcmp
    //   15: ifle -> 60
    //   18: aload_0
    //   19: getfield c : Ljava/util/concurrent/ScheduledFuture;
    //   22: astore_1
    //   23: aload_1
    //   24: ifnull -> 60
    //   27: aload_1
    //   28: invokeinterface isCancelled : ()Z
    //   33: ifeq -> 60
    //   36: aload_0
    //   37: aload_0
    //   38: getfield a : Ljava/util/concurrent/ScheduledExecutorService;
    //   41: aload_0
    //   42: getfield f : Ljava/lang/Runnable;
    //   45: aload_0
    //   46: getfield e : J
    //   49: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   52: invokeinterface schedule : (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   57: putfield c : Ljava/util/concurrent/ScheduledFuture;
    //   60: aload_0
    //   61: iconst_0
    //   62: putfield g : Z
    //   65: aload_0
    //   66: monitorexit
    //   67: return
    //   68: astore_1
    //   69: aload_0
    //   70: monitorexit
    //   71: aload_1
    //   72: athrow
    // Exception table:
    //   from	to	target	type
    //   2	23	68	finally
    //   27	60	68	finally
    //   60	65	68	finally
  }
  
  public final void a(boolean paramBoolean) {
    if (paramBoolean) {
      d();
      return;
    } 
    c();
  }
  
  public final void b(int paramInt, Runnable paramRunnable) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_2
    //   4: putfield f : Ljava/lang/Runnable;
    //   7: aload_0
    //   8: getfield b : Lcom/google/android/gms/common/util/e;
    //   11: invokeinterface b : ()J
    //   16: lstore_3
    //   17: iload_1
    //   18: i2l
    //   19: lstore #5
    //   21: aload_0
    //   22: lload_3
    //   23: lload #5
    //   25: ladd
    //   26: putfield d : J
    //   29: aload_0
    //   30: aload_0
    //   31: getfield a : Ljava/util/concurrent/ScheduledExecutorService;
    //   34: aload_2
    //   35: lload #5
    //   37: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   40: invokeinterface schedule : (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   45: putfield c : Ljava/util/concurrent/ScheduledFuture;
    //   48: aload_0
    //   49: monitorexit
    //   50: return
    //   51: astore_2
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_2
    //   55: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	51	finally
    //   21	48	51	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */