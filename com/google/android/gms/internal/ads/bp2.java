package com.google.android.gms.internal.ads;

public final class bp2 extends k42<bp2, bp2.a> implements w52 {
  private static final bp2 zzcfp;
  
  private static volatile c62<bp2> zzek;
  
  private int zzcfm;
  
  private int zzcfn;
  
  private int zzcfo;
  
  private int zzdv;
  
  static {
    bp2 bp21 = new bp2();
    zzcfp = bp21;
    k42.A(bp2.class, bp21);
  }
  
  private final void M(int paramInt) {
    this.zzdv |= 0x1;
    this.zzcfm = paramInt;
  }
  
  private final void N(int paramInt) {
    this.zzdv |= 0x2;
    this.zzcfn = paramInt;
  }
  
  private final void O(int paramInt) {
    this.zzdv |= 0x4;
    this.zzcfo = paramInt;
  }
  
  public static a P() {
    return (a)zzcfp.D();
  }
  
  protected final Object x(int paramInt, Object<bp2> paramObject1, Object<bp2> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/ho2.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 161, 2 -> 152, 3 -> 119, 4 -> 115, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic com/google/android/gms/internal/ads/bp2.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/bp2
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/bp2.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/bp2.zzcfp : Lcom/google/android/gms/internal/ads/bp2;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/bp2.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/bp2
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/bp2
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/bp2.zzcfp : Lcom/google/android/gms/internal/ads/bp2;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/bp2.zzcfp : Lcom/google/android/gms/internal/ads/bp2;
    //   122: ldc '    ??? ??????'
    //   124: iconst_4
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc 'zzdv'
    //   132: aastore
    //   133: dup
    //   134: iconst_1
    //   135: ldc 'zzcfm'
    //   137: aastore
    //   138: dup
    //   139: iconst_2
    //   140: ldc 'zzcfn'
    //   142: aastore
    //   143: dup
    //   144: iconst_3
    //   145: ldc 'zzcfo'
    //   147: aastore
    //   148: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   151: areturn
    //   152: new com/google/android/gms/internal/ads/bp2$a
    //   155: dup
    //   156: aconst_null
    //   157: invokespecial <init> : (Lcom/google/android/gms/internal/ads/ho2;)V
    //   160: areturn
    //   161: new com/google/android/gms/internal/ads/bp2
    //   164: dup
    //   165: invokespecial <init> : ()V
    //   168: areturn
    // Exception table:
    //   from	to	target	type
    //   76	80	107	finally
    //   86	101	107	finally
    //   101	104	107	finally
    //   108	111	107	finally
  }
  
  public static final class a extends k42.b<bp2, a> implements w52 {
    private a() {
      super(bp2.Q());
    }
    
    public final a x(int param1Int) {
      if (this.d) {
        t();
        this.d = false;
      } 
      bp2.J((bp2)this.c, param1Int);
      return this;
    }
    
    public final a y(int param1Int) {
      if (this.d) {
        t();
        this.d = false;
      } 
      bp2.K((bp2)this.c, param1Int);
      return this;
    }
    
    public final a z(int param1Int) {
      if (this.d) {
        t();
        this.d = false;
      } 
      bp2.L((bp2)this.c, param1Int);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bp2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */