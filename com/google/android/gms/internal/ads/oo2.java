package com.google.android.gms.internal.ads;

public final class oo2 extends k42<oo2, oo2.a> implements w52 {
  private static final oo2 zzcaz;
  
  private static volatile c62<oo2> zzek;
  
  private String zzcau = "";
  
  private u42<zzug$zzc> zzcav = k42.H();
  
  private int zzcaw = 1000;
  
  private int zzcax = 1000;
  
  private int zzcay = 1000;
  
  private int zzdv;
  
  static {
    oo2 oo21 = new oo2();
    zzcaz = oo21;
    k42.A(oo2.class, oo21);
  }
  
  private final void K(String paramString) {
    paramString.getClass();
    this.zzdv |= 0x1;
    this.zzcau = paramString;
  }
  
  public static oo2 L() {
    return zzcaz;
  }
  
  protected final Object x(int paramInt, Object<oo2> paramObject1, Object<oo2> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/ho2.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 207, 2 -> 198, 3 -> 119, 4 -> 115, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic com/google/android/gms/internal/ads/oo2.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/oo2
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/oo2.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/oo2.zzcaz : Lcom/google/android/gms/internal/ads/oo2;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/oo2.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/oo2
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/oo2
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/oo2.zzcaz : Lcom/google/android/gms/internal/ads/oo2;
    //   118: areturn
    //   119: invokestatic zzw : ()Lcom/google/android/gms/internal/ads/r42;
    //   122: astore_2
    //   123: invokestatic zzw : ()Lcom/google/android/gms/internal/ads/r42;
    //   126: astore_3
    //   127: invokestatic zzw : ()Lcom/google/android/gms/internal/ads/r42;
    //   130: astore #4
    //   132: getstatic com/google/android/gms/internal/ads/oo2.zzcaz : Lcom/google/android/gms/internal/ads/oo2;
    //   135: ldc '   ??? ?????????'
    //   137: bipush #10
    //   139: anewarray java/lang/Object
    //   142: dup
    //   143: iconst_0
    //   144: ldc 'zzdv'
    //   146: aastore
    //   147: dup
    //   148: iconst_1
    //   149: ldc 'zzcau'
    //   151: aastore
    //   152: dup
    //   153: iconst_2
    //   154: ldc 'zzcav'
    //   156: aastore
    //   157: dup
    //   158: iconst_3
    //   159: ldc com/google/android/gms/internal/ads/zzug$zzc
    //   161: aastore
    //   162: dup
    //   163: iconst_4
    //   164: ldc 'zzcaw'
    //   166: aastore
    //   167: dup
    //   168: iconst_5
    //   169: aload_2
    //   170: aastore
    //   171: dup
    //   172: bipush #6
    //   174: ldc 'zzcax'
    //   176: aastore
    //   177: dup
    //   178: bipush #7
    //   180: aload_3
    //   181: aastore
    //   182: dup
    //   183: bipush #8
    //   185: ldc 'zzcay'
    //   187: aastore
    //   188: dup
    //   189: bipush #9
    //   191: aload #4
    //   193: aastore
    //   194: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   197: areturn
    //   198: new com/google/android/gms/internal/ads/oo2$a
    //   201: dup
    //   202: aconst_null
    //   203: invokespecial <init> : (Lcom/google/android/gms/internal/ads/ho2;)V
    //   206: areturn
    //   207: new com/google/android/gms/internal/ads/oo2
    //   210: dup
    //   211: invokespecial <init> : ()V
    //   214: areturn
    // Exception table:
    //   from	to	target	type
    //   76	80	107	finally
    //   86	101	107	finally
    //   101	104	107	finally
    //   108	111	107	finally
  }
  
  public static final class a extends k42.b<oo2, a> implements w52 {
    private a() {
      super(oo2.M());
    }
    
    public final a x(String param1String) {
      if (this.d) {
        t();
        this.d = false;
      } 
      oo2.J((oo2)this.c, param1String);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/oo2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */