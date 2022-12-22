package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class q11 extends od {
  private final String b;
  
  private final kd c;
  
  private sm<JSONObject> d;
  
  private final JSONObject e;
  
  private boolean f;
  
  public q11(String paramString, kd paramkd, sm<JSONObject> paramsm) {
    JSONObject jSONObject = new JSONObject();
    this.e = jSONObject;
    this.f = false;
    this.d = paramsm;
    this.b = paramString;
    this.c = paramkd;
    try {
      jSONObject.put("adapter_version", paramkd.F0().toString());
      jSONObject.put("sdk_version", paramkd.v0().toString());
      jSONObject.put("name", paramString);
    } catch (JSONException|NullPointerException|android.os.RemoteException jSONException) {}
  }
  
  public final void I2(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield f : Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_1
    //   15: ifnonnull -> 27
    //   18: aload_0
    //   19: ldc 'Adapter returned null signals'
    //   21: invokevirtual Q : (Ljava/lang/String;)V
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: aload_0
    //   28: getfield e : Lorg/json/JSONObject;
    //   31: ldc 'signals'
    //   33: aload_1
    //   34: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   37: pop
    //   38: aload_0
    //   39: getfield d : Lcom/google/android/gms/internal/ads/sm;
    //   42: aload_0
    //   43: getfield e : Lorg/json/JSONObject;
    //   46: invokevirtual c : (Ljava/lang/Object;)Z
    //   49: pop
    //   50: aload_0
    //   51: iconst_1
    //   52: putfield f : Z
    //   55: aload_0
    //   56: monitorexit
    //   57: return
    //   58: astore_1
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_1
    //   62: athrow
    //   63: astore_1
    //   64: goto -> 38
    // Exception table:
    //   from	to	target	type
    //   2	7	58	finally
    //   18	24	58	finally
    //   27	38	63	org/json/JSONException
    //   27	38	58	finally
    //   38	55	58	finally
  }
  
  public final void Q(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield f : Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield e : Lorg/json/JSONObject;
    //   18: ldc 'signal_error'
    //   20: aload_1
    //   21: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   24: pop
    //   25: aload_0
    //   26: getfield d : Lcom/google/android/gms/internal/ads/sm;
    //   29: aload_0
    //   30: getfield e : Lorg/json/JSONObject;
    //   33: invokevirtual c : (Ljava/lang/Object;)Z
    //   36: pop
    //   37: aload_0
    //   38: iconst_1
    //   39: putfield f : Z
    //   42: aload_0
    //   43: monitorexit
    //   44: return
    //   45: astore_1
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: goto -> 25
    // Exception table:
    //   from	to	target	type
    //   2	7	45	finally
    //   14	25	50	org/json/JSONException
    //   14	25	45	finally
    //   25	42	45	finally
  }
  
  public final void i6(zzvg paramzzvg) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield f : Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield e : Lorg/json/JSONObject;
    //   18: ldc 'signal_error'
    //   20: aload_1
    //   21: getfield c : Ljava/lang/String;
    //   24: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   27: pop
    //   28: aload_0
    //   29: getfield d : Lcom/google/android/gms/internal/ads/sm;
    //   32: aload_0
    //   33: getfield e : Lorg/json/JSONObject;
    //   36: invokevirtual c : (Ljava/lang/Object;)Z
    //   39: pop
    //   40: aload_0
    //   41: iconst_1
    //   42: putfield f : Z
    //   45: aload_0
    //   46: monitorexit
    //   47: return
    //   48: astore_1
    //   49: aload_0
    //   50: monitorexit
    //   51: aload_1
    //   52: athrow
    //   53: astore_1
    //   54: goto -> 28
    // Exception table:
    //   from	to	target	type
    //   2	7	48	finally
    //   14	28	53	org/json/JSONException
    //   14	28	48	finally
    //   28	45	48	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/q11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */