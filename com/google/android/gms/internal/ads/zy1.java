package com.google.android.gms.internal.ads;

public final class zy1 extends k42<zy1, zy1.a> implements w52 {
  private static volatile c62<zy1> zzek;
  
  private static final zy1 zzifj;
  
  private xz1 zzifi;
  
  static {
    zy1 zy11 = new zy1();
    zzifj = zy11;
    k42.A(zy1.class, zy11);
  }
  
  public static zy1 K() {
    return zzifj;
  }
  
  public final xz1 J() {
    xz1 xz11 = this.zzifi;
    xz1 xz12 = xz11;
    if (xz11 == null)
      xz12 = xz1.L(); 
    return xz12;
  }
  
  protected final Object x(int paramInt, Object<zy1> paramObject1, Object<zy1> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/bz1.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 146, 2 -> 137, 3 -> 119, 4 -> 115, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic com/google/android/gms/internal/ads/zy1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/zy1
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/zy1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/zy1.zzifj : Lcom/google/android/gms/internal/ads/zy1;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/zy1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/zy1
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/zy1
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/zy1.zzifj : Lcom/google/android/gms/internal/ads/zy1;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/zy1.zzifj : Lcom/google/android/gms/internal/ads/zy1;
    //   122: ldc '      \\t'
    //   124: iconst_1
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc 'zzifi'
    //   132: aastore
    //   133: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   136: areturn
    //   137: new com/google/android/gms/internal/ads/zy1$a
    //   140: dup
    //   141: aconst_null
    //   142: invokespecial <init> : (Lcom/google/android/gms/internal/ads/bz1;)V
    //   145: areturn
    //   146: new com/google/android/gms/internal/ads/zy1
    //   149: dup
    //   150: invokespecial <init> : ()V
    //   153: areturn
    // Exception table:
    //   from	to	target	type
    //   76	80	107	finally
    //   86	101	107	finally
    //   101	104	107	finally
    //   108	111	107	finally
  }
  
  public static final class a extends k42.b<zy1, a> implements w52 {
    private a() {
      super(zy1.L());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zy1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */