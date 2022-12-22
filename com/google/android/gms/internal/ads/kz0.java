package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class kz0 implements lv0<xi1, fx0> {
  private final Map<String, jv0<xi1, fx0>> a = new HashMap<String, jv0<xi1, fx0>>();
  
  private final hm0 b;
  
  public kz0(hm0 paramhm0) {
    this.b = paramhm0;
  }
  
  public final jv0<xi1, fx0> a(String paramString, JSONObject paramJSONObject) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast com/google/android/gms/internal/ads/jv0
    //   15: astore_3
    //   16: aload_3
    //   17: astore #4
    //   19: aload_3
    //   20: ifnonnull -> 75
    //   23: aload_0
    //   24: getfield b : Lcom/google/android/gms/internal/ads/hm0;
    //   27: aload_1
    //   28: aload_2
    //   29: invokevirtual d : (Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/xi1;
    //   32: astore_3
    //   33: aload_3
    //   34: ifnonnull -> 41
    //   37: aload_0
    //   38: monitorexit
    //   39: aconst_null
    //   40: areturn
    //   41: new com/google/android/gms/internal/ads/jv0
    //   44: astore #4
    //   46: new com/google/android/gms/internal/ads/fx0
    //   49: astore_2
    //   50: aload_2
    //   51: invokespecial <init> : ()V
    //   54: aload #4
    //   56: aload_3
    //   57: aload_2
    //   58: aload_1
    //   59: invokespecial <init> : (Ljava/lang/Object;Lcom/google/android/gms/internal/ads/v50;Ljava/lang/String;)V
    //   62: aload_0
    //   63: getfield a : Ljava/util/Map;
    //   66: aload_1
    //   67: aload #4
    //   69: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   74: pop
    //   75: aload_0
    //   76: monitorexit
    //   77: aload #4
    //   79: areturn
    //   80: astore_1
    //   81: aload_0
    //   82: monitorexit
    //   83: aload_1
    //   84: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	80	finally
    //   23	33	80	finally
    //   37	39	80	finally
    //   41	75	80	finally
    //   75	77	80	finally
    //   81	83	80	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */