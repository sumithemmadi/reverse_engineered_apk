package com.google.android.gms.internal.ads;

public final class yy1 extends k42<yy1, yy1.a> implements w52 {
  private static volatile c62<yy1> zzek;
  
  private static final yy1 zzifb;
  
  static {
    yy1 yy11 = new yy1();
    zzifb = yy11;
    k42.A(yy1.class, yy11);
  }
  
  public static yy1 K(zzejr paramzzejr, y32 paramy32) {
    return k42.<yy1>q(zzifb, paramzzejr, paramy32);
  }
  
  protected final Object x(int paramInt, Object<yy1> paramObject1, Object<yy1> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/xy1.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 138, 2 -> 129, 3 -> 119, 4 -> 115, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic com/google/android/gms/internal/ads/yy1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/yy1
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/yy1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/yy1.zzifb : Lcom/google/android/gms/internal/ads/yy1;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/yy1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/yy1
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/yy1
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/yy1.zzifb : Lcom/google/android/gms/internal/ads/yy1;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/yy1.zzifb : Lcom/google/android/gms/internal/ads/yy1;
    //   122: ldc '  '
    //   124: aconst_null
    //   125: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   128: areturn
    //   129: new com/google/android/gms/internal/ads/yy1$a
    //   132: dup
    //   133: aconst_null
    //   134: invokespecial <init> : (Lcom/google/android/gms/internal/ads/xy1;)V
    //   137: areturn
    //   138: new com/google/android/gms/internal/ads/yy1
    //   141: dup
    //   142: invokespecial <init> : ()V
    //   145: areturn
    // Exception table:
    //   from	to	target	type
    //   76	80	107	finally
    //   86	101	107	finally
    //   101	104	107	finally
    //   108	111	107	finally
  }
  
  public static final class a extends k42.b<yy1, a> implements w52 {
    private a() {
      super(yy1.J());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yy1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */