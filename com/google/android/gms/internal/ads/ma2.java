package com.google.android.gms.internal.ads;

import android.content.Context;

public final class ma2 extends kb2 {
  private static final mb2<a11> i = new mb2<a11>();
  
  private final Context j;
  
  private ie0 k = null;
  
  public ma2(z92 paramz92, String paramString1, String paramString2, zzcf$zza.a parama, int paramInt1, int paramInt2, Context paramContext, ie0 paramie0) {
    super(paramz92, paramString1, paramString2, parama, paramInt1, 27);
    this.j = paramContext;
    this.k = paramie0;
  }
  
  private static String c(ie0 paramie0) {
    return (paramie0 != null && paramie0.N() && !ea2.f(paramie0.J().J())) ? paramie0.J().J() : null;
  }
  
  private final String d() {
    try {
      if (this.b.A() != null)
        this.b.A().get(); 
      zzcf$zza zzcf$zza = this.b.z();
      if (zzcf$zza != null && zzcf$zza.q0())
        return zzcf$zza.j0(); 
    } catch (InterruptedException|java.util.concurrent.ExecutionException interruptedException) {}
    return null;
  }
  
  protected final void a() {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/ma2.i : Lcom/google/android/gms/internal/ads/mb2;
    //   3: aload_0
    //   4: getfield j : Landroid/content/Context;
    //   7: invokevirtual getPackageName : ()Ljava/lang/String;
    //   10: invokevirtual a : (Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReference;
    //   13: astore_1
    //   14: aload_1
    //   15: monitorenter
    //   16: aload_1
    //   17: invokevirtual get : ()Ljava/lang/Object;
    //   20: checkcast com/google/android/gms/internal/ads/a11
    //   23: astore_2
    //   24: aload_2
    //   25: ifnull -> 70
    //   28: aload_2
    //   29: getfield b : Ljava/lang/String;
    //   32: invokestatic f : (Ljava/lang/String;)Z
    //   35: ifne -> 70
    //   38: aload_2
    //   39: getfield b : Ljava/lang/String;
    //   42: ldc 'E'
    //   44: invokevirtual equals : (Ljava/lang/Object;)Z
    //   47: ifne -> 70
    //   50: aload_2
    //   51: getfield b : Ljava/lang/String;
    //   54: ldc '0000000000000000000000000000000000000000000000000000000000000000'
    //   56: invokevirtual equals : (Ljava/lang/Object;)Z
    //   59: ifeq -> 65
    //   62: goto -> 70
    //   65: iconst_0
    //   66: istore_3
    //   67: goto -> 72
    //   70: iconst_1
    //   71: istore_3
    //   72: iload_3
    //   73: ifeq -> 324
    //   76: aload_0
    //   77: getfield k : Lcom/google/android/gms/internal/ads/ie0;
    //   80: invokestatic c : (Lcom/google/android/gms/internal/ads/ie0;)Ljava/lang/String;
    //   83: invokestatic f : (Ljava/lang/String;)Z
    //   86: ifne -> 96
    //   89: getstatic com/google/android/gms/internal/ads/zzcd.f : Lcom/google/android/gms/internal/ads/zzcd;
    //   92: astore_2
    //   93: goto -> 176
    //   96: aload_0
    //   97: getfield k : Lcom/google/android/gms/internal/ads/ie0;
    //   100: astore_2
    //   101: aload_2
    //   102: invokestatic c : (Lcom/google/android/gms/internal/ads/ie0;)Ljava/lang/String;
    //   105: invokestatic f : (Ljava/lang/String;)Z
    //   108: ifeq -> 141
    //   111: aload_2
    //   112: ifnull -> 141
    //   115: aload_2
    //   116: invokevirtual L : ()Z
    //   119: ifeq -> 141
    //   122: aload_2
    //   123: invokevirtual M : ()Lcom/google/android/gms/internal/ads/je0;
    //   126: invokevirtual J : ()Lcom/google/android/gms/internal/ads/zzcd;
    //   129: getstatic com/google/android/gms/internal/ads/zzcd.e : Lcom/google/android/gms/internal/ads/zzcd;
    //   132: if_acmpne -> 141
    //   135: iconst_1
    //   136: istore #4
    //   138: goto -> 144
    //   141: iconst_0
    //   142: istore #4
    //   144: iload #4
    //   146: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   149: invokevirtual booleanValue : ()Z
    //   152: ifeq -> 172
    //   155: aload_0
    //   156: getfield b : Lcom/google/android/gms/internal/ads/z92;
    //   159: invokevirtual x : ()Z
    //   162: ifeq -> 172
    //   165: getstatic com/google/android/gms/internal/ads/zzcd.e : Lcom/google/android/gms/internal/ads/zzcd;
    //   168: astore_2
    //   169: goto -> 176
    //   172: getstatic com/google/android/gms/internal/ads/zzcd.d : Lcom/google/android/gms/internal/ads/zzcd;
    //   175: astore_2
    //   176: aload_2
    //   177: getstatic com/google/android/gms/internal/ads/zzcd.d : Lcom/google/android/gms/internal/ads/zzcd;
    //   180: if_acmpne -> 189
    //   183: iconst_1
    //   184: istore #4
    //   186: goto -> 192
    //   189: iconst_0
    //   190: istore #4
    //   192: aload_0
    //   193: getfield f : Ljava/lang/reflect/Method;
    //   196: aconst_null
    //   197: iconst_2
    //   198: anewarray java/lang/Object
    //   201: dup
    //   202: iconst_0
    //   203: aload_0
    //   204: getfield j : Landroid/content/Context;
    //   207: aastore
    //   208: dup
    //   209: iconst_1
    //   210: iload #4
    //   212: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   215: aastore
    //   216: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   219: checkcast java/lang/String
    //   222: astore #5
    //   224: new com/google/android/gms/internal/ads/a11
    //   227: astore #6
    //   229: aload #6
    //   231: aload #5
    //   233: invokespecial <init> : (Ljava/lang/String;)V
    //   236: aload #6
    //   238: getfield b : Ljava/lang/String;
    //   241: invokestatic f : (Ljava/lang/String;)Z
    //   244: ifne -> 260
    //   247: aload #6
    //   249: getfield b : Ljava/lang/String;
    //   252: ldc 'E'
    //   254: invokevirtual equals : (Ljava/lang/Object;)Z
    //   257: ifeq -> 318
    //   260: getstatic com/google/android/gms/internal/ads/pa2.a : [I
    //   263: aload_2
    //   264: invokevirtual ordinal : ()I
    //   267: iaload
    //   268: istore_3
    //   269: iload_3
    //   270: iconst_1
    //   271: if_icmpeq -> 303
    //   274: iload_3
    //   275: iconst_2
    //   276: if_icmpeq -> 282
    //   279: goto -> 318
    //   282: aload_0
    //   283: invokespecial d : ()Ljava/lang/String;
    //   286: astore_2
    //   287: aload_2
    //   288: invokestatic f : (Ljava/lang/String;)Z
    //   291: ifne -> 318
    //   294: aload #6
    //   296: aload_2
    //   297: putfield b : Ljava/lang/String;
    //   300: goto -> 318
    //   303: aload #6
    //   305: aload_0
    //   306: getfield k : Lcom/google/android/gms/internal/ads/ie0;
    //   309: invokevirtual J : ()Lcom/google/android/gms/internal/ads/ke0;
    //   312: invokevirtual J : ()Ljava/lang/String;
    //   315: putfield b : Ljava/lang/String;
    //   318: aload_1
    //   319: aload #6
    //   321: invokevirtual set : (Ljava/lang/Object;)V
    //   324: aload_1
    //   325: invokevirtual get : ()Ljava/lang/Object;
    //   328: checkcast com/google/android/gms/internal/ads/a11
    //   331: astore #6
    //   333: aload_1
    //   334: monitorexit
    //   335: aload_0
    //   336: getfield e : Lcom/google/android/gms/internal/ads/zzcf$zza$a;
    //   339: astore_2
    //   340: aload_2
    //   341: monitorenter
    //   342: aload #6
    //   344: ifnull -> 412
    //   347: aload_0
    //   348: getfield e : Lcom/google/android/gms/internal/ads/zzcf$zza$a;
    //   351: aload #6
    //   353: getfield b : Ljava/lang/String;
    //   356: invokevirtual z : (Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzcf$zza$a;
    //   359: pop
    //   360: aload_0
    //   361: getfield e : Lcom/google/android/gms/internal/ads/zzcf$zza$a;
    //   364: aload #6
    //   366: getfield c : J
    //   369: invokevirtual Z : (J)Lcom/google/android/gms/internal/ads/zzcf$zza$a;
    //   372: pop
    //   373: aload_0
    //   374: getfield e : Lcom/google/android/gms/internal/ads/zzcf$zza$a;
    //   377: aload #6
    //   379: getfield d : Ljava/lang/String;
    //   382: invokevirtual B : (Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzcf$zza$a;
    //   385: pop
    //   386: aload_0
    //   387: getfield e : Lcom/google/android/gms/internal/ads/zzcf$zza$a;
    //   390: aload #6
    //   392: getfield e : Ljava/lang/String;
    //   395: invokevirtual C : (Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzcf$zza$a;
    //   398: pop
    //   399: aload_0
    //   400: getfield e : Lcom/google/android/gms/internal/ads/zzcf$zza$a;
    //   403: aload #6
    //   405: getfield f : Ljava/lang/String;
    //   408: invokevirtual D : (Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzcf$zza$a;
    //   411: pop
    //   412: aload_2
    //   413: monitorexit
    //   414: return
    //   415: astore_1
    //   416: aload_2
    //   417: monitorexit
    //   418: aload_1
    //   419: athrow
    //   420: astore_2
    //   421: aload_1
    //   422: monitorexit
    //   423: aload_2
    //   424: athrow
    // Exception table:
    //   from	to	target	type
    //   16	24	420	finally
    //   28	62	420	finally
    //   76	93	420	finally
    //   96	111	420	finally
    //   115	135	420	finally
    //   144	169	420	finally
    //   172	176	420	finally
    //   176	183	420	finally
    //   192	260	420	finally
    //   260	269	420	finally
    //   282	300	420	finally
    //   303	318	420	finally
    //   318	324	420	finally
    //   324	335	420	finally
    //   347	412	415	finally
    //   412	414	415	finally
    //   416	418	415	finally
    //   421	423	420	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ma2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */