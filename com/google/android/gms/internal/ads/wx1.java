package com.google.android.gms.internal.ads;

public final class wx1 extends k42<wx1, wx1.a> implements w52 {
  private static volatile c62<wx1> zzek;
  
  private static final wx1 zziej;
  
  private int zzidz;
  
  private ay1 zzieh;
  
  private nz1 zziei;
  
  static {
    wx1 wx11 = new wx1();
    zziej = wx11;
    k42.A(wx1.class, wx11);
  }
  
  private final void K(int paramInt) {
    this.zzidz = paramInt;
  }
  
  private final void O(ay1 paramay1) {
    paramay1.getClass();
    this.zzieh = paramay1;
  }
  
  private final void P(nz1 paramnz1) {
    paramnz1.getClass();
    this.zziei = paramnz1;
  }
  
  public static a S() {
    return (a)zziej.D();
  }
  
  public static wx1 U(zzejr paramzzejr, y32 paramy32) {
    return k42.<wx1>q(zziej, paramzzejr, paramy32);
  }
  
  public final int J() {
    return this.zzidz;
  }
  
  public final ay1 Q() {
    ay1 ay11 = this.zzieh;
    ay1 ay12 = ay11;
    if (ay11 == null)
      ay12 = ay1.S(); 
    return ay12;
  }
  
  public final nz1 R() {
    nz1 nz11 = this.zziei;
    nz1 nz12 = nz11;
    if (nz11 == null)
      nz12 = nz1.R(); 
    return nz12;
  }
  
  protected final Object x(int paramInt, Object<wx1> paramObject1, Object<wx1> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/xx1.a : [I
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
    //   63: getstatic com/google/android/gms/internal/ads/wx1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/wx1
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/wx1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/wx1.zziej : Lcom/google/android/gms/internal/ads/wx1;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/wx1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/wx1
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/wx1
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/wx1.zziej : Lcom/google/android/gms/internal/ads/wx1;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/wx1.zziej : Lcom/google/android/gms/internal/ads/wx1;
    //   122: ldc '      \\t\\t'
    //   124: iconst_3
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc 'zzidz'
    //   132: aastore
    //   133: dup
    //   134: iconst_1
    //   135: ldc 'zzieh'
    //   137: aastore
    //   138: dup
    //   139: iconst_2
    //   140: ldc 'zziei'
    //   142: aastore
    //   143: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   146: areturn
    //   147: new com/google/android/gms/internal/ads/wx1$a
    //   150: dup
    //   151: aconst_null
    //   152: invokespecial <init> : (Lcom/google/android/gms/internal/ads/xx1;)V
    //   155: areturn
    //   156: new com/google/android/gms/internal/ads/wx1
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
  
  public static final class a extends k42.b<wx1, a> implements w52 {
    private a() {
      super(wx1.T());
    }
    
    public final a x(ay1 param1ay1) {
      if (this.d) {
        t();
        this.d = false;
      } 
      wx1.M((wx1)this.c, param1ay1);
      return this;
    }
    
    public final a y(nz1 param1nz1) {
      if (this.d) {
        t();
        this.d = false;
      } 
      wx1.N((wx1)this.c, param1nz1);
      return this;
    }
    
    public final a z(int param1Int) {
      if (this.d) {
        t();
        this.d = false;
      } 
      wx1.L((wx1)this.c, param1Int);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wx1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */