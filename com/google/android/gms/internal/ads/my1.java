package com.google.android.gms.internal.ads;

public final class my1 extends k42<my1, my1.a> implements w52 {
  private static volatile c62<my1> zzek;
  
  private static final my1 zziew;
  
  private int zzidz;
  
  private zzejr zziea = zzejr.b;
  
  static {
    my1 my11 = new my1();
    zziew = my11;
    k42.A(my1.class, my11);
  }
  
  private final void K(int paramInt) {
    this.zzidz = paramInt;
  }
  
  public static a O() {
    return (a)zziew.D();
  }
  
  public static my1 Q(zzejr paramzzejr, y32 paramy32) {
    return k42.<my1>q(zziew, paramzzejr, paramy32);
  }
  
  private final void R(zzejr paramzzejr) {
    paramzzejr.getClass();
    this.zziea = paramzzejr;
  }
  
  public final int J() {
    return this.zzidz;
  }
  
  public final zzejr N() {
    return this.zziea;
  }
  
  protected final Object x(int paramInt, Object<my1> paramObject1, Object<my1> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/ny1.a : [I
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
    //   63: getstatic com/google/android/gms/internal/ads/my1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/my1
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/my1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/my1.zziew : Lcom/google/android/gms/internal/ads/my1;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/my1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/my1
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/my1
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/my1.zziew : Lcom/google/android/gms/internal/ads/my1;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/my1.zziew : Lcom/google/android/gms/internal/ads/my1;
    //   122: ldc '      \\n'
    //   124: iconst_2
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc 'zzidz'
    //   132: aastore
    //   133: dup
    //   134: iconst_1
    //   135: ldc 'zziea'
    //   137: aastore
    //   138: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   141: areturn
    //   142: new com/google/android/gms/internal/ads/my1$a
    //   145: dup
    //   146: aconst_null
    //   147: invokespecial <init> : (Lcom/google/android/gms/internal/ads/ny1;)V
    //   150: areturn
    //   151: new com/google/android/gms/internal/ads/my1
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
  
  public static final class a extends k42.b<my1, a> implements w52 {
    private a() {
      super(my1.P());
    }
    
    public final a x(int param1Int) {
      if (this.d) {
        t();
        this.d = false;
      } 
      my1.L((my1)this.c, 0);
      return this;
    }
    
    public final a y(zzejr param1zzejr) {
      if (this.d) {
        t();
        this.d = false;
      } 
      my1.M((my1)this.c, param1zzejr);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/my1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */