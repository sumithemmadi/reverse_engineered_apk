package com.google.android.gms.internal.ads;

public final class k02 extends k42<k02, k02.a> implements w52 {
  private static volatile c62<k02> zzek;
  
  private static final k02 zziif;
  
  private int zzidz;
  
  private n02 zziie;
  
  static {
    k02 k021 = new k02();
    zziif = k021;
    k42.A(k02.class, k021);
  }
  
  private final void K(int paramInt) {
    this.zzidz = paramInt;
  }
  
  private final void N(n02 paramn02) {
    paramn02.getClass();
    this.zziie = paramn02;
  }
  
  public static a P() {
    return (a)zziif.D();
  }
  
  public static k02 R(zzejr paramzzejr, y32 paramy32) {
    return k42.<k02>q(zziif, paramzzejr, paramy32);
  }
  
  public final int J() {
    return this.zzidz;
  }
  
  public final n02 O() {
    n02 n021 = this.zziie;
    n02 n022 = n021;
    if (n021 == null)
      n022 = n02.L(); 
    return n022;
  }
  
  protected final Object x(int paramInt, Object<k02> paramObject1, Object<k02> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/l02.a : [I
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
    //   63: getstatic com/google/android/gms/internal/ads/k02.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/k02
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/k02.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/k02.zziif : Lcom/google/android/gms/internal/ads/k02;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/k02.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/k02
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/k02
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/k02.zziif : Lcom/google/android/gms/internal/ads/k02;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/k02.zziif : Lcom/google/android/gms/internal/ads/k02;
    //   122: ldc '      \\t'
    //   124: iconst_2
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc 'zzidz'
    //   132: aastore
    //   133: dup
    //   134: iconst_1
    //   135: ldc 'zziie'
    //   137: aastore
    //   138: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   141: areturn
    //   142: new com/google/android/gms/internal/ads/k02$a
    //   145: dup
    //   146: aconst_null
    //   147: invokespecial <init> : (Lcom/google/android/gms/internal/ads/l02;)V
    //   150: areturn
    //   151: new com/google/android/gms/internal/ads/k02
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
  
  public static final class a extends k42.b<k02, a> implements w52 {
    private a() {
      super(k02.Q());
    }
    
    public final a x(n02 param1n02) {
      if (this.d) {
        t();
        this.d = false;
      } 
      k02.M((k02)this.c, param1n02);
      return this;
    }
    
    public final a y(int param1Int) {
      if (this.d) {
        t();
        this.d = false;
      } 
      k02.L((k02)this.c, 0);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/k02.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */