package com.google.android.gms.internal.ads;

public final class mo2 extends k42<mo2, mo2.a> implements w52 {
  private static final mo2 zzchc;
  
  private static volatile c62<mo2> zzek;
  
  private boolean zzcha;
  
  private int zzchb;
  
  private int zzdv;
  
  static {
    mo2 mo21 = new mo2();
    zzchc = mo21;
    k42.A(mo2.class, mo21);
  }
  
  private final void L(int paramInt) {
    this.zzdv |= 0x2;
    this.zzchb = paramInt;
  }
  
  public static a N() {
    return (a)zzchc.D();
  }
  
  private final void P(boolean paramBoolean) {
    this.zzdv |= 0x1;
    this.zzcha = paramBoolean;
  }
  
  public final boolean M() {
    return this.zzcha;
  }
  
  protected final Object x(int paramInt, Object<mo2> paramObject1, Object<mo2> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/ho2.a : [I
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
    //   63: getstatic com/google/android/gms/internal/ads/mo2.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/mo2
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/mo2.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/mo2.zzchc : Lcom/google/android/gms/internal/ads/mo2;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/mo2.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/mo2
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/mo2
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/mo2.zzchc : Lcom/google/android/gms/internal/ads/mo2;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/mo2.zzchc : Lcom/google/android/gms/internal/ads/mo2;
    //   122: ldc '    ??? ???'
    //   124: iconst_3
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc 'zzdv'
    //   132: aastore
    //   133: dup
    //   134: iconst_1
    //   135: ldc 'zzcha'
    //   137: aastore
    //   138: dup
    //   139: iconst_2
    //   140: ldc 'zzchb'
    //   142: aastore
    //   143: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   146: areturn
    //   147: new com/google/android/gms/internal/ads/mo2$a
    //   150: dup
    //   151: aconst_null
    //   152: invokespecial <init> : (Lcom/google/android/gms/internal/ads/ho2;)V
    //   155: areturn
    //   156: new com/google/android/gms/internal/ads/mo2
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
  
  public static final class a extends k42.b<mo2, a> implements w52 {
    private a() {
      super(mo2.O());
    }
    
    public final a x(int param1Int) {
      if (this.d) {
        t();
        this.d = false;
      } 
      mo2.J((mo2)this.c, param1Int);
      return this;
    }
    
    public final boolean y() {
      return ((mo2)this.c).M();
    }
    
    public final a z(boolean param1Boolean) {
      if (this.d) {
        t();
        this.d = false;
      } 
      mo2.K((mo2)this.c, param1Boolean);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mo2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */