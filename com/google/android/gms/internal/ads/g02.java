package com.google.android.gms.internal.ads;

public final class g02 extends k42<g02, g02.a> implements w52 {
  private static volatile c62<g02> zzek;
  
  private static final g02 zziib;
  
  private int zzidz;
  
  private j02 zziia;
  
  static {
    g02 g021 = new g02();
    zziib = g021;
    k42.A(g02.class, g021);
  }
  
  private final void K(int paramInt) {
    this.zzidz = paramInt;
  }
  
  private final void N(j02 paramj02) {
    paramj02.getClass();
    this.zziia = paramj02;
  }
  
  public static a P() {
    return (a)zziib.D();
  }
  
  public static g02 R(zzejr paramzzejr, y32 paramy32) {
    return k42.<g02>q(zziib, paramzzejr, paramy32);
  }
  
  public final int J() {
    return this.zzidz;
  }
  
  public final j02 O() {
    j02 j021 = this.zziia;
    j02 j022 = j021;
    if (j021 == null)
      j022 = j02.K(); 
    return j022;
  }
  
  protected final Object x(int paramInt, Object<g02> paramObject1, Object<g02> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/h02.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 151, 2 -> 142, 3 -> 119, 4 -> 115, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic com/google/android/gms/internal/ads/g02.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/g02
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/g02.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/g02.zziib : Lcom/google/android/gms/internal/ads/g02;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/g02.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/g02
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/g02
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/g02.zziib : Lcom/google/android/gms/internal/ads/g02;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/g02.zziib : Lcom/google/android/gms/internal/ads/g02;
    //   122: ldc '      \\t'
    //   124: iconst_2
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc 'zzidz'
    //   132: aastore
    //   133: dup
    //   134: iconst_1
    //   135: ldc 'zziia'
    //   137: aastore
    //   138: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   141: areturn
    //   142: new com/google/android/gms/internal/ads/g02$a
    //   145: dup
    //   146: aconst_null
    //   147: invokespecial <init> : (Lcom/google/android/gms/internal/ads/h02;)V
    //   150: areturn
    //   151: new com/google/android/gms/internal/ads/g02
    //   154: dup
    //   155: invokespecial <init> : ()V
    //   158: areturn
    // Exception table:
    //   from	to	target	type
    //   76	80	107	finally
    //   86	101	107	finally
    //   101	104	107	finally
    //   108	111	107	finally
  }
  
  public static final class a extends k42.b<g02, a> implements w52 {
    private a() {
      super(g02.Q());
    }
    
    public final a x(j02 param1j02) {
      if (this.d) {
        t();
        this.d = false;
      } 
      g02.M((g02)this.c, param1j02);
      return this;
    }
    
    public final a y(int param1Int) {
      if (this.d) {
        t();
        this.d = false;
      } 
      g02.L((g02)this.c, 0);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/g02.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */