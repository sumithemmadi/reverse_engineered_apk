package com.google.android.gms.internal.ads;

public final class lz1 extends k42<lz1, lz1.a> implements w52 {
  private static volatile c62<lz1> zzek;
  
  private static final lz1 zzify;
  
  private int zzifv;
  
  private int zzifw;
  
  private zzejr zzifx = zzejr.b;
  
  static {
    lz1 lz11 = new lz1();
    zzify = lz11;
    k42.A(lz1.class, lz11);
  }
  
  public static lz1 M() {
    return zzify;
  }
  
  public final zzefs J() {
    zzefs zzefs1 = zzefs.zzfg(this.zzifv);
    zzefs zzefs2 = zzefs1;
    if (zzefs1 == null)
      zzefs2 = zzefs.g; 
    return zzefs2;
  }
  
  public final zzeft K() {
    zzeft zzeft1 = zzeft.zzfh(this.zzifw);
    zzeft zzeft2 = zzeft1;
    if (zzeft1 == null)
      zzeft2 = zzeft.g; 
    return zzeft2;
  }
  
  public final zzejr L() {
    return this.zzifx;
  }
  
  protected final Object x(int paramInt, Object<lz1> paramObject1, Object<lz1> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/kz1.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 156, 2 -> 147, 3 -> 119, 4 -> 115, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic com/google/android/gms/internal/ads/lz1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/lz1
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/lz1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/lz1.zzify : Lcom/google/android/gms/internal/ads/lz1;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/lz1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/lz1
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/lz1
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/lz1.zzify : Lcom/google/android/gms/internal/ads/lz1;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/lz1.zzify : Lcom/google/android/gms/internal/ads/lz1;
    //   122: ldc '      \\f\\f\\n'
    //   124: iconst_3
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc 'zzifv'
    //   132: aastore
    //   133: dup
    //   134: iconst_1
    //   135: ldc 'zzifw'
    //   137: aastore
    //   138: dup
    //   139: iconst_2
    //   140: ldc 'zzifx'
    //   142: aastore
    //   143: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   146: areturn
    //   147: new com/google/android/gms/internal/ads/lz1$a
    //   150: dup
    //   151: aconst_null
    //   152: invokespecial <init> : (Lcom/google/android/gms/internal/ads/kz1;)V
    //   155: areturn
    //   156: new com/google/android/gms/internal/ads/lz1
    //   159: dup
    //   160: invokespecial <init> : ()V
    //   163: areturn
    // Exception table:
    //   from	to	target	type
    //   76	80	107	finally
    //   86	101	107	finally
    //   101	104	107	finally
    //   108	111	107	finally
  }
  
  public static final class a extends k42.b<lz1, a> implements w52 {
    private a() {
      super(lz1.N());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */