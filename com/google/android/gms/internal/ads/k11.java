package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class k11 {
  private final Map<String, r11> a = new ConcurrentHashMap<String, r11>();
  
  private final Map<String, Map<String, List<r11>>> b = new ConcurrentHashMap<String, Map<String, List<r11>>>();
  
  private final Executor c;
  
  private JSONObject d;
  
  public k11(Executor paramExecutor) {
    this.c = paramExecutor;
  }
  
  private final void b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic g : ()Lcom/google/android/gms/internal/ads/fl;
    //   5: invokevirtual r : ()Lcom/google/android/gms/ads/internal/util/d1;
    //   8: invokeinterface f : ()Lcom/google/android/gms/internal/ads/gl;
    //   13: invokevirtual f : ()Lorg/json/JSONObject;
    //   16: astore_1
    //   17: aload_1
    //   18: ifnull -> 537
    //   21: aload_1
    //   22: ldc 'ad_unit_id_settings'
    //   24: invokevirtual optJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   27: astore_2
    //   28: aload_0
    //   29: aload_1
    //   30: ldc 'ad_unit_patterns'
    //   32: invokevirtual optJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   35: putfield d : Lorg/json/JSONObject;
    //   38: aload_2
    //   39: ifnull -> 537
    //   42: iconst_0
    //   43: istore_3
    //   44: iload_3
    //   45: aload_2
    //   46: invokevirtual length : ()I
    //   49: if_icmpge -> 537
    //   52: aload_2
    //   53: iload_3
    //   54: invokevirtual getJSONObject : (I)Lorg/json/JSONObject;
    //   57: astore_1
    //   58: aload_1
    //   59: ldc 'ad_unit_id'
    //   61: ldc ''
    //   63: invokevirtual optString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   66: astore #4
    //   68: aload_1
    //   69: ldc 'format'
    //   71: ldc ''
    //   73: invokevirtual optString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   76: astore #5
    //   78: new java/util/ArrayList
    //   81: astore #6
    //   83: aload #6
    //   85: invokespecial <init> : ()V
    //   88: aload_1
    //   89: ldc 'mediation_config'
    //   91: invokevirtual optJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   94: astore_1
    //   95: aload_1
    //   96: ifnull -> 404
    //   99: aload_1
    //   100: ldc 'ad_networks'
    //   102: invokevirtual optJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   105: astore #7
    //   107: aload #7
    //   109: ifnull -> 404
    //   112: iconst_0
    //   113: istore #8
    //   115: iload #8
    //   117: aload #7
    //   119: invokevirtual length : ()I
    //   122: if_icmpge -> 404
    //   125: aload #7
    //   127: iload #8
    //   129: invokevirtual getJSONObject : (I)Lorg/json/JSONObject;
    //   132: astore #9
    //   134: new java/util/ArrayList
    //   137: astore_1
    //   138: aload_1
    //   139: invokespecial <init> : ()V
    //   142: aload #9
    //   144: ifnull -> 389
    //   147: aload #9
    //   149: ldc 'data'
    //   151: invokevirtual optJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   154: astore #10
    //   156: new android/os/Bundle
    //   159: astore #11
    //   161: aload #11
    //   163: invokespecial <init> : ()V
    //   166: aload #10
    //   168: ifnull -> 219
    //   171: aload #10
    //   173: invokevirtual keys : ()Ljava/util/Iterator;
    //   176: astore #12
    //   178: aload #12
    //   180: invokeinterface hasNext : ()Z
    //   185: ifeq -> 219
    //   188: aload #12
    //   190: invokeinterface next : ()Ljava/lang/Object;
    //   195: checkcast java/lang/String
    //   198: astore #13
    //   200: aload #11
    //   202: aload #13
    //   204: aload #10
    //   206: aload #13
    //   208: ldc ''
    //   210: invokevirtual optString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   213: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   216: goto -> 178
    //   219: aload #9
    //   221: ldc 'rtb_adapters'
    //   223: invokevirtual optJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   226: astore #13
    //   228: aload #13
    //   230: ifnull -> 389
    //   233: new java/util/ArrayList
    //   236: astore #12
    //   238: aload #12
    //   240: invokespecial <init> : ()V
    //   243: iconst_0
    //   244: istore #14
    //   246: iload #14
    //   248: aload #13
    //   250: invokevirtual length : ()I
    //   253: if_icmpge -> 291
    //   256: aload #13
    //   258: iload #14
    //   260: ldc ''
    //   262: invokevirtual optString : (ILjava/lang/String;)Ljava/lang/String;
    //   265: astore #9
    //   267: aload #9
    //   269: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   272: ifne -> 285
    //   275: aload #12
    //   277: aload #9
    //   279: invokeinterface add : (Ljava/lang/Object;)Z
    //   284: pop
    //   285: iinc #14, 1
    //   288: goto -> 246
    //   291: aload #12
    //   293: invokevirtual size : ()I
    //   296: istore #15
    //   298: iconst_0
    //   299: istore #14
    //   301: iload #14
    //   303: iload #15
    //   305: if_icmpge -> 389
    //   308: aload #12
    //   310: iload #14
    //   312: invokevirtual get : (I)Ljava/lang/Object;
    //   315: astore #13
    //   317: iload #14
    //   319: iconst_1
    //   320: iadd
    //   321: istore #16
    //   323: aload #13
    //   325: checkcast java/lang/String
    //   328: astore #9
    //   330: aload_0
    //   331: aload #9
    //   333: invokevirtual f : (Ljava/lang/String;)V
    //   336: iload #16
    //   338: istore #14
    //   340: aload_0
    //   341: getfield a : Ljava/util/Map;
    //   344: aload #9
    //   346: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   351: checkcast com/google/android/gms/internal/ads/r11
    //   354: ifnull -> 301
    //   357: new com/google/android/gms/internal/ads/r11
    //   360: astore #13
    //   362: aload #13
    //   364: aload #9
    //   366: aload #5
    //   368: aload #11
    //   370: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    //   373: aload_1
    //   374: aload #13
    //   376: invokeinterface add : (Ljava/lang/Object;)Z
    //   381: pop
    //   382: iload #16
    //   384: istore #14
    //   386: goto -> 301
    //   389: aload #6
    //   391: aload_1
    //   392: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   397: pop
    //   398: iinc #8, 1
    //   401: goto -> 115
    //   404: aload #5
    //   406: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   409: ifne -> 521
    //   412: aload #4
    //   414: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   417: ifeq -> 423
    //   420: goto -> 521
    //   423: aload_0
    //   424: getfield b : Ljava/util/Map;
    //   427: aload #5
    //   429: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   434: checkcast java/util/Map
    //   437: astore #11
    //   439: aload #11
    //   441: astore_1
    //   442: aload #11
    //   444: ifnonnull -> 455
    //   447: new java/util/concurrent/ConcurrentHashMap
    //   450: astore_1
    //   451: aload_1
    //   452: invokespecial <init> : ()V
    //   455: aload_0
    //   456: getfield b : Ljava/util/Map;
    //   459: aload #5
    //   461: aload_1
    //   462: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   467: pop
    //   468: aload_1
    //   469: aload #4
    //   471: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   476: checkcast java/util/List
    //   479: astore #5
    //   481: aload #5
    //   483: astore #11
    //   485: aload #5
    //   487: ifnonnull -> 500
    //   490: new java/util/ArrayList
    //   493: astore #11
    //   495: aload #11
    //   497: invokespecial <init> : ()V
    //   500: aload #11
    //   502: aload #6
    //   504: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   509: pop
    //   510: aload_1
    //   511: aload #4
    //   513: aload #11
    //   515: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   520: pop
    //   521: iinc #3, 1
    //   524: goto -> 44
    //   527: astore_1
    //   528: ldc 'Malformed config loading JSON.'
    //   530: aload_1
    //   531: invokestatic l : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   534: aload_0
    //   535: monitorexit
    //   536: return
    //   537: aload_0
    //   538: monitorexit
    //   539: return
    //   540: astore_1
    //   541: aload_0
    //   542: monitorexit
    //   543: goto -> 548
    //   546: aload_1
    //   547: athrow
    //   548: goto -> 546
    // Exception table:
    //   from	to	target	type
    //   2	17	540	finally
    //   21	38	527	org/json/JSONException
    //   21	38	540	finally
    //   44	95	527	org/json/JSONException
    //   44	95	540	finally
    //   99	107	527	org/json/JSONException
    //   99	107	540	finally
    //   115	142	527	org/json/JSONException
    //   115	142	540	finally
    //   147	166	527	org/json/JSONException
    //   147	166	540	finally
    //   171	178	527	org/json/JSONException
    //   171	178	540	finally
    //   178	216	527	org/json/JSONException
    //   178	216	540	finally
    //   219	228	527	org/json/JSONException
    //   219	228	540	finally
    //   233	243	527	org/json/JSONException
    //   233	243	540	finally
    //   246	285	527	org/json/JSONException
    //   246	285	540	finally
    //   291	298	527	org/json/JSONException
    //   291	298	540	finally
    //   308	317	527	org/json/JSONException
    //   308	317	540	finally
    //   323	336	527	org/json/JSONException
    //   323	336	540	finally
    //   340	382	527	org/json/JSONException
    //   340	382	540	finally
    //   389	398	527	org/json/JSONException
    //   389	398	540	finally
    //   404	420	527	org/json/JSONException
    //   404	420	540	finally
    //   423	439	527	org/json/JSONException
    //   423	439	540	finally
    //   447	455	527	org/json/JSONException
    //   447	455	540	finally
    //   455	481	527	org/json/JSONException
    //   455	481	540	finally
    //   490	500	527	org/json/JSONException
    //   490	500	540	finally
    //   500	521	527	org/json/JSONException
    //   500	521	540	finally
    //   528	534	540	finally
  }
  
  public final void a() {
    q.g().r().y(new n11(this));
    this.c.execute(new m11(this));
  }
  
  public final void f(String paramString) {
    if (TextUtils.isEmpty(paramString))
      return; 
    if (this.a.containsKey(paramString))
      return; 
    this.a.put(paramString, new r11(paramString, "", new Bundle()));
  }
  
  public final Map<String, List<Bundle>> g(String paramString1, String paramString2) {
    if (TextUtils.isEmpty(paramString1) || TextUtils.isEmpty(paramString2))
      return Collections.emptyMap(); 
    Map map = this.b.get(paramString1);
    if (map == null)
      return Collections.emptyMap(); 
    List list1 = (List)map.get(paramString2);
    List list2 = list1;
    if (list1 == null)
      list2 = (List)map.get(qm0.a(this.d, paramString2, paramString1)); 
    if (list2 == null)
      return Collections.emptyMap(); 
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    for (r11 r11 : list2) {
      String str = r11.a;
      if (!hashMap.containsKey(str))
        hashMap.put(str, new ArrayList()); 
      ((List<Bundle>)hashMap.get(str)).add(r11.c);
    } 
    return (Map)hashMap;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/k11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */