package com.google.android.gms.internal.ads;

public final class ri0 extends k42<ri0, ri0.a> implements w52 {
  private static volatile c62<ri0> zzek;
  
  private static final ri0 zzmh;
  
  private int zzdv;
  
  private int zzhv = 1;
  
  private int zzhw = 1;
  
  private zzejr zzlh = zzejr.b;
  
  private u42<zzejr> zzmg = k42.H();
  
  static {
    ri0 ri01 = new ri0();
    zzmh = ri01;
    k42.A(ri0.class, ri01);
  }
  
  private final void M(zzcm paramzzcm) {
    this.zzhv = paramzzcm.zzv();
    this.zzdv |= 0x4;
  }
  
  private final void N(zzejr paramzzejr) {
    paramzzejr.getClass();
    this.zzdv |= 0x1;
    this.zzlh = paramzzejr;
  }
  
  public static a O() {
    return (a)zzmh.D();
  }
  
  private final void Q(zzejr paramzzejr) {
    paramzzejr.getClass();
    u42<zzejr> u421 = this.zzmg;
    if (!u421.x())
      this.zzmg = k42.w(u421); 
    this.zzmg.add(paramzzejr);
  }
  
  protected final Object x(int paramInt, Object<ri0> paramObject1, Object<ri0> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/sj0.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 184, 2 -> 175, 3 -> 119, 4 -> 115, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic com/google/android/gms/internal/ads/ri0.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/ri0
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/ri0.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/ri0.zzmh : Lcom/google/android/gms/internal/ads/ri0;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/ri0.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/ri0
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/ri0
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/ri0.zzmh : Lcom/google/android/gms/internal/ads/ri0;
    //   118: areturn
    //   119: invokestatic zzw : ()Lcom/google/android/gms/internal/ads/r42;
    //   122: astore_3
    //   123: invokestatic zzw : ()Lcom/google/android/gms/internal/ads/r42;
    //   126: astore_2
    //   127: getstatic com/google/android/gms/internal/ads/ri0.zzmh : Lcom/google/android/gms/internal/ads/ri0;
    //   130: ldc '   ??? ??????'
    //   132: bipush #7
    //   134: anewarray java/lang/Object
    //   137: dup
    //   138: iconst_0
    //   139: ldc 'zzdv'
    //   141: aastore
    //   142: dup
    //   143: iconst_1
    //   144: ldc 'zzmg'
    //   146: aastore
    //   147: dup
    //   148: iconst_2
    //   149: ldc 'zzlh'
    //   151: aastore
    //   152: dup
    //   153: iconst_3
    //   154: ldc 'zzhw'
    //   156: aastore
    //   157: dup
    //   158: iconst_4
    //   159: aload_3
    //   160: aastore
    //   161: dup
    //   162: iconst_5
    //   163: ldc 'zzhv'
    //   165: aastore
    //   166: dup
    //   167: bipush #6
    //   169: aload_2
    //   170: aastore
    //   171: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   174: areturn
    //   175: new com/google/android/gms/internal/ads/ri0$a
    //   178: dup
    //   179: aconst_null
    //   180: invokespecial <init> : (Lcom/google/android/gms/internal/ads/sj0;)V
    //   183: areturn
    //   184: new com/google/android/gms/internal/ads/ri0
    //   187: dup
    //   188: invokespecial <init> : ()V
    //   191: areturn
    // Exception table:
    //   from	to	target	type
    //   76	80	107	finally
    //   86	101	107	finally
    //   101	104	107	finally
    //   108	111	107	finally
  }
  
  public static final class a extends k42.b<ri0, a> implements w52 {
    private a() {
      super(ri0.P());
    }
    
    public final a x(zzcm param1zzcm) {
      if (this.d) {
        t();
        this.d = false;
      } 
      ri0.J((ri0)this.c, param1zzcm);
      return this;
    }
    
    public final a y(zzejr param1zzejr) {
      if (this.d) {
        t();
        this.d = false;
      } 
      ri0.K((ri0)this.c, param1zzejr);
      return this;
    }
    
    public final a z(zzejr param1zzejr) {
      if (this.d) {
        t();
        this.d = false;
      } 
      ri0.L((ri0)this.c, param1zzejr);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ri0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */