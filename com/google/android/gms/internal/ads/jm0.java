package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class jm0 {
  private final Map<String, Map<String, JSONObject>> a = new ConcurrentHashMap<String, Map<String, JSONObject>>();
  
  private JSONObject b;
  
  private final Executor c;
  
  private boolean d;
  
  private JSONObject e;
  
  public jm0(Executor paramExecutor) {
    this.c = paramExecutor;
  }
  
  private final void c() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_1
    //   4: putfield d : Z
    //   7: invokestatic g : ()Lcom/google/android/gms/internal/ads/fl;
    //   10: invokevirtual r : ()Lcom/google/android/gms/ads/internal/util/d1;
    //   13: invokeinterface f : ()Lcom/google/android/gms/internal/ads/gl;
    //   18: astore_1
    //   19: aload_1
    //   20: ifnonnull -> 26
    //   23: aload_0
    //   24: monitorexit
    //   25: return
    //   26: aload_1
    //   27: invokevirtual f : ()Lorg/json/JSONObject;
    //   30: astore_2
    //   31: aload_2
    //   32: ifnonnull -> 38
    //   35: aload_0
    //   36: monitorexit
    //   37: return
    //   38: getstatic com/google/android/gms/internal/ads/m0.L2 : Lcom/google/android/gms/internal/ads/x;
    //   41: astore_1
    //   42: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   45: aload_1
    //   46: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   49: checkcast java/lang/Boolean
    //   52: invokevirtual booleanValue : ()Z
    //   55: ifeq -> 68
    //   58: aload_2
    //   59: ldc 'common_settings'
    //   61: invokevirtual optJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   64: astore_1
    //   65: goto -> 70
    //   68: aconst_null
    //   69: astore_1
    //   70: aload_0
    //   71: aload_1
    //   72: putfield b : Lorg/json/JSONObject;
    //   75: aload_0
    //   76: aload_2
    //   77: ldc 'ad_unit_patterns'
    //   79: invokevirtual optJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   82: putfield e : Lorg/json/JSONObject;
    //   85: aload_2
    //   86: ldc 'ad_unit_id_settings'
    //   88: invokevirtual optJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   91: astore_3
    //   92: aload_3
    //   93: ifnonnull -> 99
    //   96: aload_0
    //   97: monitorexit
    //   98: return
    //   99: iconst_0
    //   100: istore #4
    //   102: iload #4
    //   104: aload_3
    //   105: invokevirtual length : ()I
    //   108: if_icmpge -> 228
    //   111: aload_3
    //   112: iload #4
    //   114: invokevirtual optJSONObject : (I)Lorg/json/JSONObject;
    //   117: astore_1
    //   118: aload_1
    //   119: ifnull -> 222
    //   122: aload_1
    //   123: ldc 'ad_unit_id'
    //   125: invokevirtual optString : (Ljava/lang/String;)Ljava/lang/String;
    //   128: astore_2
    //   129: aload_1
    //   130: ldc 'format'
    //   132: invokevirtual optString : (Ljava/lang/String;)Ljava/lang/String;
    //   135: astore #5
    //   137: aload_1
    //   138: ldc 'request_signals'
    //   140: invokevirtual optJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   143: astore #6
    //   145: aload_2
    //   146: ifnull -> 222
    //   149: aload #6
    //   151: ifnull -> 222
    //   154: aload #5
    //   156: ifnull -> 222
    //   159: aload_0
    //   160: getfield a : Ljava/util/Map;
    //   163: aload #5
    //   165: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   170: ifeq -> 191
    //   173: aload_0
    //   174: getfield a : Ljava/util/Map;
    //   177: aload #5
    //   179: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   184: checkcast java/util/Map
    //   187: astore_1
    //   188: goto -> 212
    //   191: new java/util/concurrent/ConcurrentHashMap
    //   194: astore_1
    //   195: aload_1
    //   196: invokespecial <init> : ()V
    //   199: aload_0
    //   200: getfield a : Ljava/util/Map;
    //   203: aload #5
    //   205: aload_1
    //   206: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   211: pop
    //   212: aload_1
    //   213: aload_2
    //   214: aload #6
    //   216: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   221: pop
    //   222: iinc #4, 1
    //   225: goto -> 102
    //   228: aload_0
    //   229: monitorexit
    //   230: return
    //   231: astore_1
    //   232: aload_0
    //   233: monitorexit
    //   234: goto -> 239
    //   237: aload_1
    //   238: athrow
    //   239: goto -> 237
    // Exception table:
    //   from	to	target	type
    //   2	19	231	finally
    //   26	31	231	finally
    //   38	65	231	finally
    //   70	92	231	finally
    //   102	118	231	finally
    //   122	145	231	finally
    //   159	188	231	finally
    //   191	212	231	finally
    //   212	222	231	finally
  }
  
  public final void a() {
    q.g().r().y(new mm0(this));
    this.c.execute(new lm0(this));
  }
  
  public final JSONObject b() {
    x<Boolean> x = m0.L2;
    return !((Boolean)er2.e().<Boolean>c(x)).booleanValue() ? null : this.b;
  }
  
  public final JSONObject g(String paramString1, String paramString2) {
    x<Boolean> x = m0.K2;
    if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      return null; 
    if (paramString1 == null || paramString2 == null)
      return null; 
    if (!this.d)
      c(); 
    Map map = this.a.get(paramString2);
    if (map == null)
      return null; 
    JSONObject jSONObject = (JSONObject)map.get(paramString1);
    if (jSONObject != null)
      return jSONObject; 
    paramString1 = qm0.a(this.e, paramString1, paramString2);
    return (paramString1 == null) ? null : (JSONObject)map.get(paramString1);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jm0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */