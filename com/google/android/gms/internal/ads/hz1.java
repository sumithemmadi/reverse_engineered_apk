package com.google.android.gms.internal.ads;

public final class hz1 extends k42<hz1, hz1.a> implements w52 {
  private static volatile c62<hz1> zzek;
  
  private static final hz1 zzifr;
  
  private int zzidz;
  
  private zzejr zziea = zzejr.b;
  
  private iz1 zzifq;
  
  static {
    hz1 hz11 = new hz1();
    zzifr = hz11;
    k42.A(hz1.class, hz11);
  }
  
  private final void K(int paramInt) {
    this.zzidz = paramInt;
  }
  
  private final void O(iz1 paramiz1) {
    paramiz1.getClass();
    this.zzifq = paramiz1;
  }
  
  public static a R() {
    return (a)zzifr.D();
  }
  
  public static hz1 T(zzejr paramzzejr, y32 paramy32) {
    return k42.<hz1>q(zzifr, paramzzejr, paramy32);
  }
  
  private final void U(zzejr paramzzejr) {
    paramzzejr.getClass();
    this.zziea = paramzzejr;
  }
  
  public final int J() {
    return this.zzidz;
  }
  
  public final zzejr P() {
    return this.zziea;
  }
  
  public final iz1 Q() {
    iz1 iz11 = this.zzifq;
    iz1 iz12 = iz11;
    if (iz11 == null)
      iz12 = iz1.V(); 
    return iz12;
  }
  
  protected final Object x(int paramInt, Object<hz1> paramObject1, Object<hz1> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/gz1.a : [I
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
    //   63: getstatic com/google/android/gms/internal/ads/hz1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/hz1
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/hz1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/hz1.zzifr : Lcom/google/android/gms/internal/ads/hz1;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/hz1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/hz1
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/hz1
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/hz1.zzifr : Lcom/google/android/gms/internal/ads/hz1;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/hz1.zzifr : Lcom/google/android/gms/internal/ads/hz1;
    //   122: ldc '      \\t\\n'
    //   124: iconst_3
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc 'zzidz'
    //   132: aastore
    //   133: dup
    //   134: iconst_1
    //   135: ldc 'zzifq'
    //   137: aastore
    //   138: dup
    //   139: iconst_2
    //   140: ldc 'zziea'
    //   142: aastore
    //   143: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   146: areturn
    //   147: new com/google/android/gms/internal/ads/hz1$a
    //   150: dup
    //   151: aconst_null
    //   152: invokespecial <init> : (Lcom/google/android/gms/internal/ads/gz1;)V
    //   155: areturn
    //   156: new com/google/android/gms/internal/ads/hz1
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
  
  public static final class a extends k42.b<hz1, a> implements w52 {
    private a() {
      super(hz1.S());
    }
    
    public final a x(zzejr param1zzejr) {
      if (this.d) {
        t();
        this.d = false;
      } 
      hz1.N((hz1)this.c, param1zzejr);
      return this;
    }
    
    public final a y(iz1 param1iz1) {
      if (this.d) {
        t();
        this.d = false;
      } 
      hz1.M((hz1)this.c, param1iz1);
      return this;
    }
    
    public final a z(int param1Int) {
      if (this.d) {
        t();
        this.d = false;
      } 
      hz1.L((hz1)this.c, 0);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */