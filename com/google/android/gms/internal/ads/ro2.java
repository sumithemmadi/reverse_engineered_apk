package com.google.android.gms.internal.ads;

public final class ro2 extends k42<ro2, ro2.a> implements w52 {
  private static final ro2 zzccq;
  
  private static volatile c62<ro2> zzek;
  
  private int zzccd;
  
  private String zzcce = "";
  
  private int zzccf;
  
  private int zzccg = 1000;
  
  private bp2 zzcch;
  
  private v42 zzcci = k42.G();
  
  private qo2 zzccj;
  
  private zzug$zzh zzcck;
  
  private zzug$zzm zzccl;
  
  private zzug$zza zzccm;
  
  private zzug$zzo zzccn;
  
  private mo2 zzcco;
  
  private zzug$zzb zzccp;
  
  private int zzdv;
  
  static {
    ro2 ro21 = new ro2();
    zzccq = ro21;
    k42.A(ro2.class, ro21);
  }
  
  private final void J(zzug$zza paramzzug$zza) {
    paramzzug$zza.getClass();
    this.zzccm = paramzzug$zza;
    this.zzdv |= 0x100;
  }
  
  private final void K(mo2 parammo2) {
    parammo2.getClass();
    this.zzcco = parammo2;
    this.zzdv |= 0x400;
  }
  
  private final void L(zzug$zzb paramzzug$zzb) {
    paramzzug$zzb.getClass();
    this.zzccp = paramzzug$zzb;
    this.zzdv |= 0x800;
  }
  
  private final void M(qo2 paramqo2) {
    paramqo2.getClass();
    this.zzccj = paramqo2;
    this.zzdv |= 0x20;
  }
  
  private final void V(zzug$zzo paramzzug$zzo) {
    paramzzug$zzo.getClass();
    this.zzccn = paramzzug$zzo;
    this.zzdv |= 0x200;
  }
  
  private final void W(Iterable<? extends Long> paramIterable) {
    v42 v421 = this.zzcci;
    if (!v421.x()) {
      int i = v421.size();
      if (i == 0) {
        i = 10;
      } else {
        i <<= 1;
      } 
      this.zzcci = v421.g(i);
    } 
    w22.c(paramIterable, this.zzcci);
  }
  
  private final void X(String paramString) {
    paramString.getClass();
    this.zzdv |= 0x2;
    this.zzcce = paramString;
  }
  
  private final void Z() {
    this.zzcci = k42.G();
  }
  
  public static a c0() {
    return (a)zzccq.D();
  }
  
  public final String Y() {
    return this.zzcce;
  }
  
  public final qo2 a0() {
    qo2 qo21 = this.zzccj;
    qo2 qo22 = qo21;
    if (qo21 == null)
      qo22 = qo2.N(); 
    return qo22;
  }
  
  public final zzug$zza b0() {
    zzug$zza zzug$zza1 = this.zzccm;
    zzug$zza zzug$zza2 = zzug$zza1;
    if (zzug$zza1 == null)
      zzug$zza2 = zzug$zza.O(); 
    return zzug$zza2;
  }
  
  protected final Object x(int paramInt, Object<ro2> paramObject1, Object<ro2> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/ho2.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 229, 2 -> 220, 3 -> 119, 4 -> 115, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic com/google/android/gms/internal/ads/ro2.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/ro2
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/ro2.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/ro2.zzccq : Lcom/google/android/gms/internal/ads/ro2;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/ro2.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/ro2
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/ro2
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/ro2.zzccq : Lcom/google/android/gms/internal/ads/ro2;
    //   118: areturn
    //   119: invokestatic zzw : ()Lcom/google/android/gms/internal/ads/r42;
    //   122: astore_2
    //   123: getstatic com/google/android/gms/internal/ads/ro2.zzccq : Lcom/google/android/gms/internal/ads/ro2;
    //   126: ldc '\\r \\t\\r  \\t??? \\n??????\\f???\\r???????????????\\b???\\t???\\n???'
    //   128: bipush #15
    //   130: anewarray java/lang/Object
    //   133: dup
    //   134: iconst_0
    //   135: ldc 'zzdv'
    //   137: aastore
    //   138: dup
    //   139: iconst_1
    //   140: ldc 'zzccd'
    //   142: aastore
    //   143: dup
    //   144: iconst_2
    //   145: ldc 'zzcce'
    //   147: aastore
    //   148: dup
    //   149: iconst_3
    //   150: ldc 'zzccf'
    //   152: aastore
    //   153: dup
    //   154: iconst_4
    //   155: ldc 'zzccg'
    //   157: aastore
    //   158: dup
    //   159: iconst_5
    //   160: aload_2
    //   161: aastore
    //   162: dup
    //   163: bipush #6
    //   165: ldc 'zzcch'
    //   167: aastore
    //   168: dup
    //   169: bipush #7
    //   171: ldc 'zzcci'
    //   173: aastore
    //   174: dup
    //   175: bipush #8
    //   177: ldc 'zzccj'
    //   179: aastore
    //   180: dup
    //   181: bipush #9
    //   183: ldc 'zzcck'
    //   185: aastore
    //   186: dup
    //   187: bipush #10
    //   189: ldc 'zzccl'
    //   191: aastore
    //   192: dup
    //   193: bipush #11
    //   195: ldc 'zzccm'
    //   197: aastore
    //   198: dup
    //   199: bipush #12
    //   201: ldc 'zzccn'
    //   203: aastore
    //   204: dup
    //   205: bipush #13
    //   207: ldc 'zzcco'
    //   209: aastore
    //   210: dup
    //   211: bipush #14
    //   213: ldc 'zzccp'
    //   215: aastore
    //   216: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   219: areturn
    //   220: new com/google/android/gms/internal/ads/ro2$a
    //   223: dup
    //   224: aconst_null
    //   225: invokespecial <init> : (Lcom/google/android/gms/internal/ads/ho2;)V
    //   228: areturn
    //   229: new com/google/android/gms/internal/ads/ro2
    //   232: dup
    //   233: invokespecial <init> : ()V
    //   236: areturn
    // Exception table:
    //   from	to	target	type
    //   76	80	107	finally
    //   86	101	107	finally
    //   101	104	107	finally
    //   108	111	107	finally
  }
  
  public static final class a extends k42.b<ro2, a> implements w52 {
    private a() {
      super(ro2.d0());
    }
    
    public final a A(zzug$zzb param1zzug$zzb) {
      if (this.d) {
        t();
        this.d = false;
      } 
      ro2.Q((ro2)this.c, param1zzug$zzb);
      return this;
    }
    
    public final a B(zzug$zzo param1zzug$zzo) {
      if (this.d) {
        t();
        this.d = false;
      } 
      ro2.S((ro2)this.c, param1zzug$zzo);
      return this;
    }
    
    public final a C(Iterable<? extends Long> param1Iterable) {
      if (this.d) {
        t();
        this.d = false;
      } 
      ro2.T((ro2)this.c, param1Iterable);
      return this;
    }
    
    public final a D(String param1String) {
      if (this.d) {
        t();
        this.d = false;
      } 
      ro2.U((ro2)this.c, param1String);
      return this;
    }
    
    public final String E() {
      return ((ro2)this.c).Y();
    }
    
    public final qo2 F() {
      return ((ro2)this.c).a0();
    }
    
    public final zzug$zza G() {
      return ((ro2)this.c).b0();
    }
    
    public final a H() {
      if (this.d) {
        t();
        this.d = false;
      } 
      ro2.N((ro2)this.c);
      return this;
    }
    
    public final a x(zzug$zza.a param1a) {
      if (this.d) {
        t();
        this.d = false;
      } 
      ro2.O((ro2)this.c, (zzug$zza)param1a.h());
      return this;
    }
    
    public final a y(qo2.a param1a) {
      if (this.d) {
        t();
        this.d = false;
      } 
      ro2.R((ro2)this.c, (qo2)param1a.h());
      return this;
    }
    
    public final a z(mo2 param1mo2) {
      if (this.d) {
        t();
        this.d = false;
      } 
      ro2.P((ro2)this.c, param1mo2);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ro2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */