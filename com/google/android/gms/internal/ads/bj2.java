package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

public final class bj2 {
  private final Map<String, String> a = new HashMap<String, String>();
  
  private Map<String, String> b;
  
  public final Map<String, String> a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Ljava/util/Map;
    //   6: ifnonnull -> 29
    //   9: new java/util/HashMap
    //   12: astore_1
    //   13: aload_1
    //   14: aload_0
    //   15: getfield a : Ljava/util/Map;
    //   18: invokespecial <init> : (Ljava/util/Map;)V
    //   21: aload_0
    //   22: aload_1
    //   23: invokestatic unmodifiableMap : (Ljava/util/Map;)Ljava/util/Map;
    //   26: putfield b : Ljava/util/Map;
    //   29: aload_0
    //   30: getfield b : Ljava/util/Map;
    //   33: astore_1
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: areturn
    //   38: astore_1
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_1
    //   42: athrow
    // Exception table:
    //   from	to	target	type
    //   2	29	38	finally
    //   29	34	38	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */