package com.google.android.gms.internal.ads;

public final class iz1 extends k42<iz1, iz1.a> implements w52 {
  private static volatile c62<iz1> zzek;
  
  private static final iz1 zzifu;
  
  private int zzidz;
  
  private ez1 zzifk;
  
  private zzejr zzifs;
  
  private zzejr zzift;
  
  static {
    iz1 iz11 = new iz1();
    zzifu = iz11;
    k42.A(iz1.class, iz11);
  }
  
  private iz1() {
    zzejr zzejr1 = zzejr.b;
    this.zzifs = zzejr1;
    this.zzift = zzejr1;
  }
  
  private final void K(int paramInt) {
    this.zzidz = paramInt;
  }
  
  private final void O(zzejr paramzzejr) {
    paramzzejr.getClass();
    this.zzift = paramzzejr;
  }
  
  private final void P(ez1 paramez1) {
    paramez1.getClass();
    this.zzifk = paramez1;
  }
  
  public static a U() {
    return (a)zzifu.D();
  }
  
  public static iz1 V() {
    return zzifu;
  }
  
  public static iz1 X(zzejr paramzzejr, y32 paramy32) {
    return k42.<iz1>q(zzifu, paramzzejr, paramy32);
  }
  
  private final void Y(zzejr paramzzejr) {
    paramzzejr.getClass();
    this.zzifs = paramzzejr;
  }
  
  public final int J() {
    return this.zzidz;
  }
  
  public final ez1 R() {
    ez1 ez11 = this.zzifk;
    ez1 ez12 = ez11;
    if (ez11 == null)
      ez12 = ez1.M(); 
    return ez12;
  }
  
  public final zzejr S() {
    return this.zzifs;
  }
  
  public final zzejr T() {
    return this.zzift;
  }
  
  protected final Object x(int paramInt, Object<iz1> paramObject1, Object<iz1> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/jz1.a : [I
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
    //   63: getstatic com/google/android/gms/internal/ads/iz1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/iz1
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/iz1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/iz1.zzifu : Lcom/google/android/gms/internal/ads/iz1;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/iz1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/iz1
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/iz1
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/iz1.zzifu : Lcom/google/android/gms/internal/ads/iz1;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/iz1.zzifu : Lcom/google/android/gms/internal/ads/iz1;
    //   122: ldc '      \\t\\n\\n'
    //   124: iconst_4
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc 'zzidz'
    //   132: aastore
    //   133: dup
    //   134: iconst_1
    //   135: ldc 'zzifk'
    //   137: aastore
    //   138: dup
    //   139: iconst_2
    //   140: ldc 'zzifs'
    //   142: aastore
    //   143: dup
    //   144: iconst_3
    //   145: ldc 'zzift'
    //   147: aastore
    //   148: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   151: areturn
    //   152: new com/google/android/gms/internal/ads/iz1$a
    //   155: dup
    //   156: aconst_null
    //   157: invokespecial <init> : (Lcom/google/android/gms/internal/ads/jz1;)V
    //   160: areturn
    //   161: new com/google/android/gms/internal/ads/iz1
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
  
  public static final class a extends k42.b<iz1, a> implements w52 {
    private a() {
      super(iz1.W());
    }
    
    public final a A(int param1Int) {
      if (this.d) {
        t();
        this.d = false;
      } 
      iz1.L((iz1)this.c, 0);
      return this;
    }
    
    public final a x(zzejr param1zzejr) {
      if (this.d) {
        t();
        this.d = false;
      } 
      iz1.N((iz1)this.c, param1zzejr);
      return this;
    }
    
    public final a y(zzejr param1zzejr) {
      if (this.d) {
        t();
        this.d = false;
      } 
      iz1.Q((iz1)this.c, param1zzejr);
      return this;
    }
    
    public final a z(ez1 param1ez1) {
      if (this.d) {
        t();
        this.d = false;
      } 
      iz1.M((iz1)this.c, param1ez1);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/iz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */