package com.google.android.gms.internal.ads;

public final class rb2 extends k42<rb2, rb2.a> implements w52 {
  private static final rb2 zzaci;
  
  private static volatile c62<rb2> zzek;
  
  private String zzacd = "";
  
  private String zzace = "";
  
  private long zzacf;
  
  private long zzacg;
  
  private long zzach;
  
  private int zzdv;
  
  static {
    rb2 rb21 = new rb2();
    zzaci = rb21;
    k42.A(rb2.class, rb21);
  }
  
  private final void L(String paramString) {
    paramString.getClass();
    this.zzdv |= 0x1;
    this.zzacd = paramString;
  }
  
  private final void M(String paramString) {
    paramString.getClass();
    this.zzdv |= 0x2;
    this.zzace = paramString;
  }
  
  public static rb2 N(zzejr paramzzejr, y32 paramy32) {
    return k42.<rb2>q(zzaci, paramzzejr, paramy32);
  }
  
  private final void S(long paramLong) {
    this.zzdv |= 0x4;
    this.zzacf = paramLong;
  }
  
  private final void U(long paramLong) {
    this.zzdv |= 0x8;
    this.zzacg = paramLong;
  }
  
  private final void W(long paramLong) {
    this.zzdv |= 0x10;
    this.zzach = paramLong;
  }
  
  public static a Z() {
    return (a)zzaci.D();
  }
  
  public static rb2 a0() {
    return zzaci;
  }
  
  public static rb2 c0(zzejr paramzzejr) {
    return k42.<rb2>p(zzaci, paramzzejr);
  }
  
  public final String R() {
    return this.zzacd;
  }
  
  public final String T() {
    return this.zzace;
  }
  
  public final long V() {
    return this.zzacf;
  }
  
  public final long X() {
    return this.zzacg;
  }
  
  public final long Y() {
    return this.zzach;
  }
  
  protected final Object x(int paramInt, Object<rb2> paramObject1, Object<rb2> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/qb2.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 172, 2 -> 163, 3 -> 119, 4 -> 115, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic com/google/android/gms/internal/ads/rb2.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/rb2
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/rb2.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/rb2.zzaci : Lcom/google/android/gms/internal/ads/rb2;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/rb2.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/rb2
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/rb2
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/rb2.zzaci : Lcom/google/android/gms/internal/ads/rb2;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/rb2.zzaci : Lcom/google/android/gms/internal/ads/rb2;
    //   122: ldc '    ??? ????????????'
    //   124: bipush #6
    //   126: anewarray java/lang/Object
    //   129: dup
    //   130: iconst_0
    //   131: ldc 'zzdv'
    //   133: aastore
    //   134: dup
    //   135: iconst_1
    //   136: ldc 'zzacd'
    //   138: aastore
    //   139: dup
    //   140: iconst_2
    //   141: ldc 'zzace'
    //   143: aastore
    //   144: dup
    //   145: iconst_3
    //   146: ldc 'zzacf'
    //   148: aastore
    //   149: dup
    //   150: iconst_4
    //   151: ldc 'zzacg'
    //   153: aastore
    //   154: dup
    //   155: iconst_5
    //   156: ldc 'zzach'
    //   158: aastore
    //   159: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   162: areturn
    //   163: new com/google/android/gms/internal/ads/rb2$a
    //   166: dup
    //   167: aconst_null
    //   168: invokespecial <init> : (Lcom/google/android/gms/internal/ads/qb2;)V
    //   171: areturn
    //   172: new com/google/android/gms/internal/ads/rb2
    //   175: dup
    //   176: invokespecial <init> : ()V
    //   179: areturn
    // Exception table:
    //   from	to	target	type
    //   76	80	107	finally
    //   86	101	107	finally
    //   101	104	107	finally
    //   108	111	107	finally
  }
  
  public static final class a extends k42.b<rb2, a> implements w52 {
    private a() {
      super(rb2.b0());
    }
    
    public final a A(long param1Long) {
      if (this.d) {
        t();
        this.d = false;
      } 
      rb2.O((rb2)this.c, param1Long);
      return this;
    }
    
    public final a B(long param1Long) {
      if (this.d) {
        t();
        this.d = false;
      } 
      rb2.Q((rb2)this.c, param1Long);
      return this;
    }
    
    public final a x(String param1String) {
      if (this.d) {
        t();
        this.d = false;
      } 
      rb2.K((rb2)this.c, param1String);
      return this;
    }
    
    public final a y(String param1String) {
      if (this.d) {
        t();
        this.d = false;
      } 
      rb2.P((rb2)this.c, param1String);
      return this;
    }
    
    public final a z(long param1Long) {
      if (this.d) {
        t();
        this.d = false;
      } 
      rb2.J((rb2)this.c, param1Long);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */