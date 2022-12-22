package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class mb2<T> {
  private final Map<String, AtomicReference<T>> a = new HashMap<String, AtomicReference<T>>();
  
  public final AtomicReference<T> a(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   12: ifne -> 35
    //   15: new java/util/concurrent/atomic/AtomicReference
    //   18: astore_2
    //   19: aload_2
    //   20: invokespecial <init> : ()V
    //   23: aload_0
    //   24: getfield a : Ljava/util/Map;
    //   27: aload_1
    //   28: aload_2
    //   29: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   34: pop
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_0
    //   38: getfield a : Ljava/util/Map;
    //   41: aload_1
    //   42: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   47: checkcast java/util/concurrent/atomic/AtomicReference
    //   50: areturn
    //   51: astore_1
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_1
    //   55: athrow
    // Exception table:
    //   from	to	target	type
    //   2	35	51	finally
    //   35	37	51	finally
    //   52	54	51	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */