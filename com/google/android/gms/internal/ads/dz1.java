package com.google.android.gms.internal.ads;

public final class dz1 extends k42<dz1, dz1.a> implements w52 {
  private static volatile c62<dz1> zzek;
  
  private static final dz1 zzifl;
  
  private ez1 zzifk;
  
  static {
    dz1 dz11 = new dz1();
    zzifl = dz11;
    k42.A(dz1.class, dz11);
  }
  
  public static dz1 L(zzejr paramzzejr, y32 paramy32) {
    return k42.<dz1>q(zzifl, paramzzejr, paramy32);
  }
  
  public final ez1 J() {
    ez1 ez11 = this.zzifk;
    ez1 ez12 = ez11;
    if (ez11 == null)
      ez12 = ez1.M(); 
    return ez12;
  }
  
  protected final Object x(int paramInt, Object<dz1> paramObject1, Object<dz1> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/cz1.a : [I
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
    //   63: getstatic com/google/android/gms/internal/ads/dz1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/dz1
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/dz1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/dz1.zzifl : Lcom/google/android/gms/internal/ads/dz1;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/dz1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/dz1
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/dz1
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/dz1.zzifl : Lcom/google/android/gms/internal/ads/dz1;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/dz1.zzifl : Lcom/google/android/gms/internal/ads/dz1;
    //   122: ldc '      \\t'
    //   124: iconst_1
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc 'zzifk'
    //   132: aastore
    //   133: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   136: areturn
    //   137: new com/google/android/gms/internal/ads/dz1$a
    //   140: dup
    //   141: aconst_null
    //   142: invokespecial <init> : (Lcom/google/android/gms/internal/ads/cz1;)V
    //   145: areturn
    //   146: new com/google/android/gms/internal/ads/dz1
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
  
  public static final class a extends k42.b<dz1, a> implements w52 {
    private a() {
      super(dz1.K());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */