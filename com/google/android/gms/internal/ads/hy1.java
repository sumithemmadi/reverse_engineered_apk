package com.google.android.gms.internal.ads;

public final class hy1 extends k42<hy1, hy1.a> implements w52 {
  private static volatile c62<hy1> zzek;
  
  private static final hy1 zziet;
  
  private int zzidz;
  
  private zzejr zziea = zzejr.b;
  
  private ly1 zzies;
  
  static {
    hy1 hy11 = new hy1();
    zziet = hy11;
    k42.A(hy1.class, hy11);
  }
  
  private final void K(int paramInt) {
    this.zzidz = paramInt;
  }
  
  private final void O(ly1 paramly1) {
    paramly1.getClass();
    this.zzies = paramly1;
  }
  
  public static a R() {
    return (a)zziet.D();
  }
  
  public static hy1 T(zzejr paramzzejr, y32 paramy32) {
    return k42.<hy1>q(zziet, paramzzejr, paramy32);
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
  
  public final ly1 Q() {
    ly1 ly11 = this.zzies;
    ly1 ly12 = ly11;
    if (ly11 == null)
      ly12 = ly1.K(); 
    return ly12;
  }
  
  protected final Object x(int paramInt, Object<hy1> paramObject1, Object<hy1> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/gy1.a : [I
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
    //   63: getstatic com/google/android/gms/internal/ads/hy1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/hy1
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/hy1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/hy1.zziet : Lcom/google/android/gms/internal/ads/hy1;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/hy1.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/hy1
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/hy1
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/hy1.zziet : Lcom/google/android/gms/internal/ads/hy1;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/hy1.zziet : Lcom/google/android/gms/internal/ads/hy1;
    //   122: ldc '      \\t\\n'
    //   124: iconst_3
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc 'zzidz'
    //   132: aastore
    //   133: dup
    //   134: iconst_1
    //   135: ldc 'zzies'
    //   137: aastore
    //   138: dup
    //   139: iconst_2
    //   140: ldc 'zziea'
    //   142: aastore
    //   143: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   146: areturn
    //   147: new com/google/android/gms/internal/ads/hy1$a
    //   150: dup
    //   151: aconst_null
    //   152: invokespecial <init> : (Lcom/google/android/gms/internal/ads/gy1;)V
    //   155: areturn
    //   156: new com/google/android/gms/internal/ads/hy1
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
  
  public static final class a extends k42.b<hy1, a> implements w52 {
    private a() {
      super(hy1.S());
    }
    
    public final a x(ly1 param1ly1) {
      if (this.d) {
        t();
        this.d = false;
      } 
      hy1.M((hy1)this.c, param1ly1);
      return this;
    }
    
    public final a y(int param1Int) {
      if (this.d) {
        t();
        this.d = false;
      } 
      hy1.L((hy1)this.c, 0);
      return this;
    }
    
    public final a z(zzejr param1zzejr) {
      if (this.d) {
        t();
        this.d = false;
      } 
      hy1.N((hy1)this.c, param1zzejr);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hy1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */