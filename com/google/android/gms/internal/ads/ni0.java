package com.google.android.gms.internal.ads;

public final class ni0 extends k42<ni0, ni0.a> implements w52 {
  private static volatile c62<ni0> zzek;
  
  private static final ni0 zzlf;
  
  private int zzdv;
  
  private long zzla;
  
  private int zzlb;
  
  private boolean zzlc;
  
  private q42 zzld = k42.F();
  
  private long zzle;
  
  static {
    ni0 ni01 = new ni0();
    zzlf = ni01;
    k42.A(ni0.class, ni01);
  }
  
  protected final Object x(int paramInt, Object<ni0> paramObject1, Object<ni0> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/sj0.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 172, 2 -> 163, 3 -> 119, 4 -> 115, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic com/google/android/gms/internal/ads/ni0.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/ni0
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/ni0.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/ni0.zzlf : Lcom/google/android/gms/internal/ads/ni0;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/ni0.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/ni0
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/ni0
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/ni0.zzlf : Lcom/google/android/gms/internal/ads/ni0;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/ni0.zzlf : Lcom/google/android/gms/internal/ads/ni0;
    //   122: ldc '   ??? ?????????'
    //   124: bipush #6
    //   126: anewarray java/lang/Object
    //   129: dup
    //   130: iconst_0
    //   131: ldc 'zzdv'
    //   133: aastore
    //   134: dup
    //   135: iconst_1
    //   136: ldc 'zzla'
    //   138: aastore
    //   139: dup
    //   140: iconst_2
    //   141: ldc 'zzlb'
    //   143: aastore
    //   144: dup
    //   145: iconst_3
    //   146: ldc 'zzlc'
    //   148: aastore
    //   149: dup
    //   150: iconst_4
    //   151: ldc 'zzld'
    //   153: aastore
    //   154: dup
    //   155: iconst_5
    //   156: ldc 'zzle'
    //   158: aastore
    //   159: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   162: areturn
    //   163: new com/google/android/gms/internal/ads/ni0$a
    //   166: dup
    //   167: aconst_null
    //   168: invokespecial <init> : (Lcom/google/android/gms/internal/ads/sj0;)V
    //   171: areturn
    //   172: new com/google/android/gms/internal/ads/ni0
    //   175: dup
    //   176: invokespecial <init> : ()V
    //   179: areturn
    // Exception table:
    //   from	to	target	type
    //   76	80	107	finally
    //   86	101	107	finally
    //   101	104	107	finally
    //   108	111	107	finally
  }
  
  public static final class a extends k42.b<ni0, a> implements w52 {
    private a() {
      super(ni0.J());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ni0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */