package com.google.android.gms.internal.ads;

public final class qx1 extends k42<qx1, qx1.a> implements w52 {
  private static volatile c62<qx1> zzek;
  
  private static final qx1 zziec;
  
  private int zzidz;
  
  private zzejr zziea = zzejr.b;
  
  private vx1 zzieb;
  
  static {
    qx1 qx11 = new qx1();
    zziec = qx11;
    k42.A(qx1.class, qx11);
  }
  
  private final void K(int paramInt) {
    this.zzidz = 0;
  }
  
  public static a Q() {
    return (a)zziec.D();
  }
  
  public static qx1 S(zzejr paramzzejr, y32 paramy32) {
    return k42.<qx1>q(zziec, paramzzejr, paramy32);
  }
  
  private final void T(vx1 paramvx1) {
    paramvx1.getClass();
    this.zzieb = paramvx1;
  }
  
  private final void U(zzejr paramzzejr) {
    paramzzejr.getClass();
    this.zziea = paramzzejr;
  }
  
  public final int J() {
    return this.zzidz;
  }
  
  public final zzejr O() {
    return this.zziea;
  }
  
  public final vx1 P() {
    vx1 vx11 = this.zzieb;
    vx1 vx12 = vx11;
    if (vx11 == null)
      vx12 = vx1.K(); 
    return vx12;
  }
  
  protected final Object x(int paramInt, Object<qx1> paramObject1, Object<qx1> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/px1.a : [I
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
    //   63: getstatic com/google/android/gms/internal/ads/qx1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/qx1
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/qx1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/qx1.zziec : Lcom/google/android/gms/internal/ads/qx1;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/qx1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/qx1
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/qx1
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/qx1.zziec : Lcom/google/android/gms/internal/ads/qx1;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/qx1.zziec : Lcom/google/android/gms/internal/ads/qx1;
    //   122: ldc '      \\n\\t'
    //   124: iconst_3
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc 'zzidz'
    //   132: aastore
    //   133: dup
    //   134: iconst_1
    //   135: ldc 'zziea'
    //   137: aastore
    //   138: dup
    //   139: iconst_2
    //   140: ldc 'zzieb'
    //   142: aastore
    //   143: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   146: areturn
    //   147: new com/google/android/gms/internal/ads/qx1$a
    //   150: dup
    //   151: aconst_null
    //   152: invokespecial <init> : (Lcom/google/android/gms/internal/ads/px1;)V
    //   155: areturn
    //   156: new com/google/android/gms/internal/ads/qx1
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
  
  public static final class a extends k42.b<qx1, a> implements w52 {
    private a() {
      super(qx1.R());
    }
    
    public final a x(vx1 param1vx1) {
      if (this.d) {
        t();
        this.d = false;
      } 
      qx1.M((qx1)this.c, param1vx1);
      return this;
    }
    
    public final a y(int param1Int) {
      if (this.d) {
        t();
        this.d = false;
      } 
      qx1.L((qx1)this.c, 0);
      return this;
    }
    
    public final a z(zzejr param1zzejr) {
      if (this.d) {
        t();
        this.d = false;
      } 
      qx1.N((qx1)this.c, param1zzejr);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qx1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */