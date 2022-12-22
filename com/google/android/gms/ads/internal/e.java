package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.zzazn;

public final class e {
  private Context a;
  
  private long b = 0L;
  
  private final void c(Context paramContext, zzazn paramzzazn, boolean paramBoolean, gl paramgl, String paramString1, String paramString2, Runnable paramRunnable) {
    // Byte code:
    //   0: invokestatic j : ()Lcom/google/android/gms/common/util/e;
    //   3: invokeinterface b : ()J
    //   8: aload_0
    //   9: getfield b : J
    //   12: lsub
    //   13: ldc2_w 5000
    //   16: lcmp
    //   17: ifge -> 26
    //   20: ldc 'Not retrying to fetch app settings'
    //   22: invokestatic i : (Ljava/lang/String;)V
    //   25: return
    //   26: aload_0
    //   27: invokestatic j : ()Lcom/google/android/gms/common/util/e;
    //   30: invokeinterface b : ()J
    //   35: putfield b : J
    //   38: iconst_0
    //   39: istore #8
    //   41: aload #4
    //   43: ifnonnull -> 52
    //   46: iconst_1
    //   47: istore #9
    //   49: goto -> 126
    //   52: aload #4
    //   54: invokevirtual a : ()J
    //   57: lstore #10
    //   59: invokestatic j : ()Lcom/google/android/gms/common/util/e;
    //   62: invokeinterface a : ()J
    //   67: lstore #12
    //   69: getstatic com/google/android/gms/internal/ads/m0.N2 : Lcom/google/android/gms/internal/ads/x;
    //   72: astore #14
    //   74: lload #12
    //   76: lload #10
    //   78: lsub
    //   79: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   82: aload #14
    //   84: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   87: checkcast java/lang/Long
    //   90: invokevirtual longValue : ()J
    //   93: lcmp
    //   94: ifle -> 103
    //   97: iconst_1
    //   98: istore #9
    //   100: goto -> 106
    //   103: iconst_0
    //   104: istore #9
    //   106: iload #9
    //   108: ifne -> 46
    //   111: iload #8
    //   113: istore #9
    //   115: aload #4
    //   117: invokevirtual b : ()Z
    //   120: ifne -> 126
    //   123: goto -> 46
    //   126: iload #9
    //   128: ifne -> 132
    //   131: return
    //   132: aload_1
    //   133: ifnonnull -> 142
    //   136: ldc 'Context not provided to fetch application settings'
    //   138: invokestatic i : (Ljava/lang/String;)V
    //   141: return
    //   142: aload #5
    //   144: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   147: ifeq -> 164
    //   150: aload #6
    //   152: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   155: ifeq -> 164
    //   158: ldc 'App settings could not be fetched. Required parameters missing'
    //   160: invokestatic i : (Ljava/lang/String;)V
    //   163: return
    //   164: aload_1
    //   165: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   168: astore #4
    //   170: aload #4
    //   172: ifnull -> 178
    //   175: goto -> 181
    //   178: aload_1
    //   179: astore #4
    //   181: aload_0
    //   182: aload #4
    //   184: putfield a : Landroid/content/Context;
    //   187: invokestatic p : ()Lcom/google/android/gms/internal/ads/ia;
    //   190: aload_0
    //   191: getfield a : Landroid/content/Context;
    //   194: aload_2
    //   195: invokevirtual b : (Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzazn;)Lcom/google/android/gms/internal/ads/ra;
    //   198: astore #4
    //   200: getstatic com/google/android/gms/internal/ads/ma.b : Lcom/google/android/gms/internal/ads/na;
    //   203: astore_2
    //   204: aload #4
    //   206: ldc 'google.afma.config.fetchAppSettings'
    //   208: aload_2
    //   209: aload_2
    //   210: invokevirtual a : (Ljava/lang/String;Lcom/google/android/gms/internal/ads/ka;Lcom/google/android/gms/internal/ads/la;)Lcom/google/android/gms/internal/ads/ja;
    //   213: astore #4
    //   215: new org/json/JSONObject
    //   218: astore_2
    //   219: aload_2
    //   220: invokespecial <init> : ()V
    //   223: aload #5
    //   225: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   228: ifne -> 243
    //   231: aload_2
    //   232: ldc 'app_id'
    //   234: aload #5
    //   236: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   239: pop
    //   240: goto -> 260
    //   243: aload #6
    //   245: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   248: ifne -> 260
    //   251: aload_2
    //   252: ldc 'ad_unit_id'
    //   254: aload #6
    //   256: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   259: pop
    //   260: aload_2
    //   261: ldc 'is_init'
    //   263: iload_3
    //   264: invokevirtual put : (Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   267: pop
    //   268: aload_2
    //   269: ldc 'pn'
    //   271: aload_1
    //   272: invokevirtual getPackageName : ()Ljava/lang/String;
    //   275: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   278: pop
    //   279: aload #4
    //   281: aload_2
    //   282: invokeinterface b : (Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ot1;
    //   287: astore_1
    //   288: getstatic com/google/android/gms/ads/internal/d.a : Lcom/google/android/gms/internal/ads/qs1;
    //   291: astore #4
    //   293: getstatic com/google/android/gms/internal/ads/fm.f : Lcom/google/android/gms/internal/ads/nt1;
    //   296: astore_2
    //   297: aload_1
    //   298: aload #4
    //   300: aload_2
    //   301: invokestatic k : (Lcom/google/android/gms/internal/ads/ot1;Lcom/google/android/gms/internal/ads/qs1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/ot1;
    //   304: astore #4
    //   306: aload #7
    //   308: ifnull -> 320
    //   311: aload_1
    //   312: aload #7
    //   314: aload_2
    //   315: invokeinterface a : (Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    //   320: aload #4
    //   322: ldc 'ConfigLoader.maybeFetchNewAppSettings'
    //   324: invokestatic a : (Lcom/google/android/gms/internal/ads/ot1;Ljava/lang/String;)V
    //   327: return
    //   328: astore_1
    //   329: ldc 'Error requesting application settings'
    //   331: aload_1
    //   332: invokestatic c : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   335: return
    // Exception table:
    //   from	to	target	type
    //   215	240	328	java/lang/Exception
    //   243	260	328	java/lang/Exception
    //   260	306	328	java/lang/Exception
    //   311	320	328	java/lang/Exception
    //   320	327	328	java/lang/Exception
  }
  
  public final void a(Context paramContext, zzazn paramzzazn, String paramString, gl paramgl) {
    String str;
    if (paramgl != null) {
      str = paramgl.d();
    } else {
      str = null;
    } 
    c(paramContext, paramzzazn, false, paramgl, str, paramString, null);
  }
  
  public final void b(Context paramContext, zzazn paramzzazn, String paramString, Runnable paramRunnable) {
    c(paramContext, paramzzazn, true, null, paramString, null, paramRunnable);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */