package com.google.android.gms.internal.ads;

public final class xz1 extends k42<xz1, xz1.a> implements w52 {
  private static volatile c62<xz1> zzek;
  
  private static final xz1 zzihk;
  
  private String zzigs = "";
  
  private zzejr zzigt = zzejr.b;
  
  private int zzihj;
  
  static {
    xz1 xz11 = new xz1();
    zzihk = xz11;
    k42.A(xz1.class, xz11);
  }
  
  public static xz1 L() {
    return zzihk;
  }
  
  public final String J() {
    return this.zzigs;
  }
  
  public final zzejr K() {
    return this.zzigt;
  }
  
  protected final Object x(int paramInt, Object<xz1> paramObject1, Object<xz1> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/zz1.a : [I
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
    //   63: getstatic com/google/android/gms/internal/ads/xz1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/xz1
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/xz1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/xz1.zzihk : Lcom/google/android/gms/internal/ads/xz1;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/xz1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/xz1
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/xz1
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/xz1.zzihk : Lcom/google/android/gms/internal/ads/xz1;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/xz1.zzihk : Lcom/google/android/gms/internal/ads/xz1;
    //   122: ldc '      Ȉ\\n\\f'
    //   124: iconst_3
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc 'zzigs'
    //   132: aastore
    //   133: dup
    //   134: iconst_1
    //   135: ldc 'zzigt'
    //   137: aastore
    //   138: dup
    //   139: iconst_2
    //   140: ldc 'zzihj'
    //   142: aastore
    //   143: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   146: areturn
    //   147: new com/google/android/gms/internal/ads/xz1$a
    //   150: dup
    //   151: aconst_null
    //   152: invokespecial <init> : (Lcom/google/android/gms/internal/ads/zz1;)V
    //   155: areturn
    //   156: new com/google/android/gms/internal/ads/xz1
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
  
  public static final class a extends k42.b<xz1, a> implements w52 {
    private a() {
      super(xz1.M());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */