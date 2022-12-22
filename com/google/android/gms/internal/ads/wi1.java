package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

public final class wi1<T> {
  private final Deque<ot1<T>> a = new LinkedBlockingDeque<ot1<T>>();
  
  private final Callable<T> b;
  
  private final nt1 c;
  
  public wi1(Callable<T> paramCallable, nt1 paramnt1) {
    this.b = paramCallable;
    this.c = paramnt1;
  }
  
  public final void a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/Deque;
    //   6: invokeinterface size : ()I
    //   11: istore_2
    //   12: iconst_0
    //   13: istore_3
    //   14: iload_3
    //   15: iload_1
    //   16: iload_2
    //   17: isub
    //   18: if_icmpge -> 50
    //   21: aload_0
    //   22: getfield a : Ljava/util/Deque;
    //   25: aload_0
    //   26: getfield c : Lcom/google/android/gms/internal/ads/nt1;
    //   29: aload_0
    //   30: getfield b : Ljava/util/concurrent/Callable;
    //   33: invokeinterface a : (Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/ot1;
    //   38: invokeinterface add : (Ljava/lang/Object;)Z
    //   43: pop
    //   44: iinc #3, 1
    //   47: goto -> 14
    //   50: aload_0
    //   51: monitorexit
    //   52: return
    //   53: astore #4
    //   55: aload_0
    //   56: monitorexit
    //   57: goto -> 63
    //   60: aload #4
    //   62: athrow
    //   63: goto -> 60
    // Exception table:
    //   from	to	target	type
    //   2	12	53	finally
    //   21	44	53	finally
  }
  
  public final ot1<T> b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_1
    //   4: invokevirtual a : (I)V
    //   7: aload_0
    //   8: getfield a : Ljava/util/Deque;
    //   11: invokeinterface poll : ()Ljava/lang/Object;
    //   16: checkcast com/google/android/gms/internal/ads/ot1
    //   19: astore_1
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_1
    //   23: areturn
    //   24: astore_1
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_1
    //   28: athrow
    // Exception table:
    //   from	to	target	type
    //   2	20	24	finally
  }
  
  public final void c(ot1<T> paramot1) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/Deque;
    //   6: aload_1
    //   7: invokeinterface addFirst : (Ljava/lang/Object;)V
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
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wi1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */