package com.google.android.gms.internal.ads;

public final class oi0 extends k42<oi0, oi0.a> implements w52 {
  private static volatile c62<oi0> zzek;
  
  private static final oi0 zzlk;
  
  private int zzdv;
  
  private zzejr zzlg;
  
  private zzejr zzlh;
  
  private zzejr zzli;
  
  private zzejr zzlj;
  
  static {
    oi0 oi01 = new oi0();
    zzlk = oi01;
    k42.A(oi0.class, oi01);
  }
  
  private oi0() {
    zzejr zzejr1 = zzejr.b;
    this.zzlg = zzejr1;
    this.zzlh = zzejr1;
    this.zzli = zzejr1;
    this.zzlj = zzejr1;
  }
  
  private final void K(zzejr paramzzejr) {
    paramzzejr.getClass();
    this.zzdv |= 0x1;
    this.zzlg = paramzzejr;
  }
  
  public static oi0 L(byte[] paramArrayOfbyte, y32 paramy32) {
    return k42.<oi0>u(zzlk, paramArrayOfbyte, paramy32);
  }
  
  private final void N(zzejr paramzzejr) {
    paramzzejr.getClass();
    this.zzdv |= 0x2;
    this.zzlh = paramzzejr;
  }
  
  public static a S() {
    return (a)zzlk.D();
  }
  
  private final void V(zzejr paramzzejr) {
    paramzzejr.getClass();
    this.zzdv |= 0x4;
    this.zzli = paramzzejr;
  }
  
  private final void X(zzejr paramzzejr) {
    paramzzejr.getClass();
    this.zzdv |= 0x8;
    this.zzlj = paramzzejr;
  }
  
  public final zzejr O() {
    return this.zzlg;
  }
  
  public final zzejr P() {
    return this.zzlh;
  }
  
  public final zzejr Q() {
    return this.zzli;
  }
  
  public final zzejr R() {
    return this.zzlj;
  }
  
  protected final Object x(int paramInt, Object<oi0> paramObject1, Object<oi0> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/sj0.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 166, 2 -> 157, 3 -> 119, 4 -> 115, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic com/google/android/gms/internal/ads/oi0.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/oi0
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/oi0.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/oi0.zzlk : Lcom/google/android/gms/internal/ads/oi0;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/oi0.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/oi0
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/oi0
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/oi0.zzlk : Lcom/google/android/gms/internal/ads/oi0;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/oi0.zzlk : Lcom/google/android/gms/internal/ads/oi0;
    //   122: ldc '    ??? ?????????'
    //   124: iconst_5
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc 'zzdv'
    //   132: aastore
    //   133: dup
    //   134: iconst_1
    //   135: ldc 'zzlg'
    //   137: aastore
    //   138: dup
    //   139: iconst_2
    //   140: ldc 'zzlh'
    //   142: aastore
    //   143: dup
    //   144: iconst_3
    //   145: ldc 'zzli'
    //   147: aastore
    //   148: dup
    //   149: iconst_4
    //   150: ldc 'zzlj'
    //   152: aastore
    //   153: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   156: areturn
    //   157: new com/google/android/gms/internal/ads/oi0$a
    //   160: dup
    //   161: aconst_null
    //   162: invokespecial <init> : (Lcom/google/android/gms/internal/ads/sj0;)V
    //   165: areturn
    //   166: new com/google/android/gms/internal/ads/oi0
    //   169: dup
    //   170: invokespecial <init> : ()V
    //   173: areturn
    // Exception table:
    //   from	to	target	type
    //   76	80	107	finally
    //   86	101	107	finally
    //   101	104	107	finally
    //   108	111	107	finally
  }
  
  public static final class a extends k42.b<oi0, a> implements w52 {
    private a() {
      super(oi0.T());
    }
    
    public final a A(zzejr param1zzejr) {
      if (this.d) {
        t();
        this.d = false;
      } 
      oi0.W((oi0)this.c, param1zzejr);
      return this;
    }
    
    public final a x(zzejr param1zzejr) {
      if (this.d) {
        t();
        this.d = false;
      } 
      oi0.J((oi0)this.c, param1zzejr);
      return this;
    }
    
    public final a y(zzejr param1zzejr) {
      if (this.d) {
        t();
        this.d = false;
      } 
      oi0.M((oi0)this.c, param1zzejr);
      return this;
    }
    
    public final a z(zzejr param1zzejr) {
      if (this.d) {
        t();
        this.d = false;
      } 
      oi0.U((oi0)this.c, param1zzejr);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/oi0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */