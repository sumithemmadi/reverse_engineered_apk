package com.google.android.gms.internal.ads;

public final class ay1 extends k42<ay1, ay1.a> implements w52 {
  private static volatile c62<ay1> zzek;
  
  private static final ay1 zzieo;
  
  private int zzidz;
  
  private zzejr zziea = zzejr.b;
  
  private ey1 zzien;
  
  static {
    ay1 ay11 = new ay1();
    zzieo = ay11;
    k42.A(ay1.class, ay11);
  }
  
  private final void K(int paramInt) {
    this.zzidz = paramInt;
  }
  
  private final void O(ey1 paramey1) {
    paramey1.getClass();
    this.zzien = paramey1;
  }
  
  public static a R() {
    return (a)zzieo.D();
  }
  
  public static ay1 S() {
    return zzieo;
  }
  
  public static ay1 U(zzejr paramzzejr, y32 paramy32) {
    return k42.<ay1>q(zzieo, paramzzejr, paramy32);
  }
  
  private final void V(zzejr paramzzejr) {
    paramzzejr.getClass();
    this.zziea = paramzzejr;
  }
  
  public final int J() {
    return this.zzidz;
  }
  
  public final zzejr P() {
    return this.zziea;
  }
  
  public final ey1 Q() {
    ey1 ey11 = this.zzien;
    ey1 ey12 = ey11;
    if (ey11 == null)
      ey12 = ey1.K(); 
    return ey12;
  }
  
  protected final Object x(int paramInt, Object<ay1> paramObject1, Object<ay1> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/by1.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 156, 2 -> 147, 3 -> 119, 4 -> 115, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic com/google/android/gms/internal/ads/ay1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/ay1
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/ay1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/ay1.zzieo : Lcom/google/android/gms/internal/ads/ay1;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/ay1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/ay1
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/ay1
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/ay1.zzieo : Lcom/google/android/gms/internal/ads/ay1;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/ay1.zzieo : Lcom/google/android/gms/internal/ads/ay1;
    //   122: ldc '      \\t\\n'
    //   124: iconst_3
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc 'zzidz'
    //   132: aastore
    //   133: dup
    //   134: iconst_1
    //   135: ldc 'zzien'
    //   137: aastore
    //   138: dup
    //   139: iconst_2
    //   140: ldc 'zziea'
    //   142: aastore
    //   143: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   146: areturn
    //   147: new com/google/android/gms/internal/ads/ay1$a
    //   150: dup
    //   151: aconst_null
    //   152: invokespecial <init> : (Lcom/google/android/gms/internal/ads/by1;)V
    //   155: areturn
    //   156: new com/google/android/gms/internal/ads/ay1
    //   159: dup
    //   160: invokespecial <init> : ()V
    //   163: areturn
    // Exception table:
    //   from	to	target	type
    //   76	80	107	finally
    //   86	101	107	finally
    //   101	104	107	finally
    //   108	111	107	finally
  }
  
  public static final class a extends k42.b<ay1, a> implements w52 {
    private a() {
      super(ay1.T());
    }
    
    public final a x(ey1 param1ey1) {
      if (this.d) {
        t();
        this.d = false;
      } 
      ay1.M((ay1)this.c, param1ey1);
      return this;
    }
    
    public final a y(int param1Int) {
      if (this.d) {
        t();
        this.d = false;
      } 
      ay1.L((ay1)this.c, 0);
      return this;
    }
    
    public final a z(zzejr param1zzejr) {
      if (this.d) {
        t();
        this.d = false;
      } 
      ay1.N((ay1)this.c, param1zzejr);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ay1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */