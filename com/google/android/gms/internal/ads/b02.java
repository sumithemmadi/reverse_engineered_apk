package com.google.android.gms.internal.ads;

@Deprecated
public final class b02 extends k42<b02, b02.a> implements w52 {
  private static volatile c62<b02> zzek;
  
  private static final b02 zzihp;
  
  private String zzigs = "";
  
  private String zzihl = "";
  
  private int zzihm;
  
  private boolean zzihn;
  
  private String zziho = "";
  
  static {
    b02 b021 = new b02();
    zzihp = b021;
    k42.A(b02.class, b021);
  }
  
  public final String J() {
    return this.zzigs;
  }
  
  public final String K() {
    return this.zzihl;
  }
  
  public final int L() {
    return this.zzihm;
  }
  
  public final boolean M() {
    return this.zzihn;
  }
  
  public final String N() {
    return this.zziho;
  }
  
  protected final Object x(int paramInt, Object<b02> paramObject1, Object<b02> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/a02.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 166, 2 -> 157, 3 -> 119, 4 -> 115, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic com/google/android/gms/internal/ads/b02.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/b02
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/b02.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/b02.zzihp : Lcom/google/android/gms/internal/ads/b02;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/b02.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/b02
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/b02
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/b02.zzihp : Lcom/google/android/gms/internal/ads/b02;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/b02.zzihp : Lcom/google/android/gms/internal/ads/b02;
    //   122: ldc '      ??????'
    //   124: iconst_5
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc 'zzihl'
    //   132: aastore
    //   133: dup
    //   134: iconst_1
    //   135: ldc 'zzigs'
    //   137: aastore
    //   138: dup
    //   139: iconst_2
    //   140: ldc 'zzihm'
    //   142: aastore
    //   143: dup
    //   144: iconst_3
    //   145: ldc 'zzihn'
    //   147: aastore
    //   148: dup
    //   149: iconst_4
    //   150: ldc 'zziho'
    //   152: aastore
    //   153: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   156: areturn
    //   157: new com/google/android/gms/internal/ads/b02$a
    //   160: dup
    //   161: aconst_null
    //   162: invokespecial <init> : (Lcom/google/android/gms/internal/ads/a02;)V
    //   165: areturn
    //   166: new com/google/android/gms/internal/ads/b02
    //   169: dup
    //   170: invokespecial <init> : ()V
    //   173: areturn
    // Exception table:
    //   from	to	target	type
    //   76	80	107	finally
    //   86	101	107	finally
    //   101	104	107	finally
    //   108	111	107	finally
  }
  
  public static final class a extends k42.b<b02, a> implements w52 {
    private a() {
      super(b02.O());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/b02.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */