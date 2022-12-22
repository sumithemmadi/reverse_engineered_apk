package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

public final class u60 extends j90<y60> {
  private final ScheduledExecutorService c;
  
  private final e d;
  
  private long e = -1L;
  
  private long f = -1L;
  
  private boolean g = false;
  
  private ScheduledFuture<?> h;
  
  public u60(ScheduledExecutorService paramScheduledExecutorService, e parame) {
    super(Collections.emptySet());
    this.c = paramScheduledExecutorService;
    this.d = parame;
  }
  
  private final void d1() {
    X0(x60.a);
  }
  
  private final void f1(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield h : Ljava/util/concurrent/ScheduledFuture;
    //   6: astore_3
    //   7: aload_3
    //   8: ifnull -> 31
    //   11: aload_3
    //   12: invokeinterface isDone : ()Z
    //   17: ifne -> 31
    //   20: aload_0
    //   21: getfield h : Ljava/util/concurrent/ScheduledFuture;
    //   24: iconst_1
    //   25: invokeinterface cancel : (Z)Z
    //   30: pop
    //   31: aload_0
    //   32: aload_0
    //   33: getfield d : Lcom/google/android/gms/common/util/e;
    //   36: invokeinterface b : ()J
    //   41: lload_1
    //   42: ladd
    //   43: putfield e : J
    //   46: aload_0
    //   47: getfield c : Ljava/util/concurrent/ScheduledExecutorService;
    //   50: astore_3
    //   51: new com/google/android/gms/internal/ads/z60
    //   54: astore #4
    //   56: aload #4
    //   58: aload_0
    //   59: aconst_null
    //   60: invokespecial <init> : (Lcom/google/android/gms/internal/ads/u60;Lcom/google/android/gms/internal/ads/w60;)V
    //   63: aload_0
    //   64: aload_3
    //   65: aload #4
    //   67: lload_1
    //   68: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   71: invokeinterface schedule : (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   76: putfield h : Ljava/util/concurrent/ScheduledFuture;
    //   79: aload_0
    //   80: monitorexit
    //   81: return
    //   82: astore_3
    //   83: aload_0
    //   84: monitorexit
    //   85: aload_3
    //   86: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	82	finally
    //   11	31	82	finally
    //   31	79	82	finally
  }
  
  public final void c1() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_0
    //   4: putfield g : Z
    //   7: aload_0
    //   8: lconst_0
    //   9: invokespecial f1 : (J)V
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	15	finally
  }
  
  public final void e1(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: ifgt -> 9
    //   6: aload_0
    //   7: monitorexit
    //   8: return
    //   9: getstatic java/util/concurrent/TimeUnit.SECONDS : Ljava/util/concurrent/TimeUnit;
    //   12: iload_1
    //   13: i2l
    //   14: invokevirtual toMillis : (J)J
    //   17: lstore_2
    //   18: aload_0
    //   19: getfield g : Z
    //   22: ifeq -> 59
    //   25: aload_0
    //   26: getfield f : J
    //   29: lstore #4
    //   31: lload #4
    //   33: lconst_0
    //   34: lcmp
    //   35: ifle -> 48
    //   38: lload_2
    //   39: lload #4
    //   41: lcmp
    //   42: ifge -> 48
    //   45: goto -> 51
    //   48: lload #4
    //   50: lstore_2
    //   51: aload_0
    //   52: lload_2
    //   53: putfield f : J
    //   56: aload_0
    //   57: monitorexit
    //   58: return
    //   59: aload_0
    //   60: getfield d : Lcom/google/android/gms/common/util/e;
    //   63: invokeinterface b : ()J
    //   68: lstore #6
    //   70: aload_0
    //   71: getfield e : J
    //   74: lstore #4
    //   76: lload #6
    //   78: lload #4
    //   80: lcmp
    //   81: ifgt -> 101
    //   84: lload #4
    //   86: aload_0
    //   87: getfield d : Lcom/google/android/gms/common/util/e;
    //   90: invokeinterface b : ()J
    //   95: lsub
    //   96: lload_2
    //   97: lcmp
    //   98: ifle -> 106
    //   101: aload_0
    //   102: lload_2
    //   103: invokespecial f1 : (J)V
    //   106: aload_0
    //   107: monitorexit
    //   108: return
    //   109: astore #8
    //   111: aload_0
    //   112: monitorexit
    //   113: aload #8
    //   115: athrow
    // Exception table:
    //   from	to	target	type
    //   9	31	109	finally
    //   51	56	109	finally
    //   59	76	109	finally
    //   84	101	109	finally
    //   101	106	109	finally
  }
  
  public final void onPause() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : Z
    //   6: ifne -> 71
    //   9: aload_0
    //   10: getfield h : Ljava/util/concurrent/ScheduledFuture;
    //   13: astore_1
    //   14: aload_1
    //   15: ifnull -> 59
    //   18: aload_1
    //   19: invokeinterface isCancelled : ()Z
    //   24: ifne -> 59
    //   27: aload_0
    //   28: getfield h : Ljava/util/concurrent/ScheduledFuture;
    //   31: iconst_1
    //   32: invokeinterface cancel : (Z)Z
    //   37: pop
    //   38: aload_0
    //   39: aload_0
    //   40: getfield e : J
    //   43: aload_0
    //   44: getfield d : Lcom/google/android/gms/common/util/e;
    //   47: invokeinterface b : ()J
    //   52: lsub
    //   53: putfield f : J
    //   56: goto -> 66
    //   59: aload_0
    //   60: ldc2_w -1
    //   63: putfield f : J
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
  
  public final void onResume() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : Z
    //   6: ifeq -> 43
    //   9: aload_0
    //   10: getfield f : J
    //   13: lconst_0
    //   14: lcmp
    //   15: ifle -> 38
    //   18: aload_0
    //   19: getfield h : Ljava/util/concurrent/ScheduledFuture;
    //   22: invokeinterface isCancelled : ()Z
    //   27: ifeq -> 38
    //   30: aload_0
    //   31: aload_0
    //   32: getfield f : J
    //   35: invokespecial f1 : (J)V
    //   38: aload_0
    //   39: iconst_0
    //   40: putfield g : Z
    //   43: aload_0
    //   44: monitorexit
    //   45: return
    //   46: astore_1
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_1
    //   50: athrow
    // Exception table:
    //   from	to	target	type
    //   2	38	46	finally
    //   38	43	46	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/u60.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */