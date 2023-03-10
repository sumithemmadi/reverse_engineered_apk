package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzug$zzo extends k42<zzug$zzo, zzug$zzo.b> implements w52 {
  private static final zzug$zzo zzcdu;
  
  private static volatile c62<zzug$zzo> zzek;
  
  private u42<a> zzbzm = k42.H();
  
  private int zzcdp;
  
  private int zzcdq;
  
  private long zzcdr;
  
  private String zzcds = "";
  
  private long zzcdt;
  
  private int zzdv;
  
  private String zzdw = "";
  
  static {
    zzug$zzo zzug$zzo1 = new zzug$zzo();
    zzcdu = zzug$zzo1;
    k42.A(zzug$zzo.class, zzug$zzo1);
  }
  
  private final void Q(String paramString) {
    paramString.getClass();
    this.zzdv |= 0x10;
    this.zzcds = paramString;
  }
  
  private final void R(Iterable<? extends a> paramIterable) {
    u42<a> u421 = this.zzbzm;
    if (!u421.x())
      this.zzbzm = k42.w(u421); 
    w22.c(paramIterable, this.zzbzm);
  }
  
  private final void S(int paramInt) {
    this.zzdv |= 0x1;
    this.zzcdp = paramInt;
  }
  
  private final void T(int paramInt) {
    this.zzdv |= 0x2;
    this.zzcdq = paramInt;
  }
  
  private final void U(long paramLong) {
    this.zzdv |= 0x4;
    this.zzcdr = paramLong;
  }
  
  private final void V(long paramLong) {
    this.zzdv |= 0x20;
    this.zzcdt = paramLong;
  }
  
  private final void W(String paramString) {
    paramString.getClass();
    this.zzdv |= 0x8;
    this.zzdw = paramString;
  }
  
  public static b X() {
    return (b)zzcdu.D();
  }
  
  protected final Object x(int paramInt, Object<zzug$zzo> paramObject1, Object<zzug$zzo> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/ho2.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 190, 2 -> 181, 3 -> 119, 4 -> 115, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic com/google/android/gms/internal/ads/zzug$zzo.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/zzug$zzo
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/zzug$zzo.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/zzug$zzo.zzcdu : Lcom/google/android/gms/internal/ads/zzug$zzo;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/zzug$zzo.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/zzug$zzo
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/zzug$zzo
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/zzug$zzo.zzcdu : Lcom/google/android/gms/internal/ads/zzug$zzo;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/zzug$zzo.zzcdu : Lcom/google/android/gms/internal/ads/zzug$zzo;
    //   122: ldc '   ??? ???????????????'
    //   124: bipush #9
    //   126: anewarray java/lang/Object
    //   129: dup
    //   130: iconst_0
    //   131: ldc 'zzdv'
    //   133: aastore
    //   134: dup
    //   135: iconst_1
    //   136: ldc 'zzbzm'
    //   138: aastore
    //   139: dup
    //   140: iconst_2
    //   141: ldc com/google/android/gms/internal/ads/zzug$zzo$a
    //   143: aastore
    //   144: dup
    //   145: iconst_3
    //   146: ldc 'zzcdp'
    //   148: aastore
    //   149: dup
    //   150: iconst_4
    //   151: ldc 'zzcdq'
    //   153: aastore
    //   154: dup
    //   155: iconst_5
    //   156: ldc 'zzcdr'
    //   158: aastore
    //   159: dup
    //   160: bipush #6
    //   162: ldc 'zzdw'
    //   164: aastore
    //   165: dup
    //   166: bipush #7
    //   168: ldc 'zzcds'
    //   170: aastore
    //   171: dup
    //   172: bipush #8
    //   174: ldc 'zzcdt'
    //   176: aastore
    //   177: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   180: areturn
    //   181: new com/google/android/gms/internal/ads/zzug$zzo$b
    //   184: dup
    //   185: aconst_null
    //   186: invokespecial <init> : (Lcom/google/android/gms/internal/ads/ho2;)V
    //   189: areturn
    //   190: new com/google/android/gms/internal/ads/zzug$zzo
    //   193: dup
    //   194: invokespecial <init> : ()V
    //   197: areturn
    // Exception table:
    //   from	to	target	type
    //   76	80	107	finally
    //   86	101	107	finally
    //   101	104	107	finally
    //   108	111	107	finally
  }
  
  public static final class a extends k42<a, a.a> implements w52 {
    private static final s42<Integer, zzug$zzc.zza> zzcea = new up2();
    
    private static final a zzcei;
    
    private static volatile c62<a> zzek;
    
    private long zzcdv;
    
    private int zzcdw;
    
    private long zzcdx;
    
    private long zzcdy;
    
    private q42 zzcdz = k42.F();
    
    private zzug$zzm zzceb;
    
    private int zzcec;
    
    private int zzced;
    
    private int zzcee;
    
    private int zzcef;
    
    private int zzceg;
    
    private int zzceh;
    
    private int zzdv;
    
    static {
      a a1 = new a();
      zzcei = a1;
      k42.A(a.class, a1);
    }
    
    private final void K(long param1Long) {
      this.zzdv |= 0x1;
      this.zzcdv = param1Long;
    }
    
    private final void L(zzug$zzm param1zzug$zzm) {
      param1zzug$zzm.getClass();
      this.zzceb = param1zzug$zzm;
      this.zzdv |= 0x10;
    }
    
    private final void S(zzug$zzo.zzc param1zzc) {
      this.zzceh = param1zzc.zzv();
      this.zzdv |= 0x400;
    }
    
    private final void T(zzuq param1zzuq) {
      this.zzcdw = param1zzuq.zzv();
      this.zzdv |= 0x2;
    }
    
    private final void W(zzuq param1zzuq) {
      this.zzcec = param1zzuq.zzv();
      this.zzdv |= 0x20;
    }
    
    private final void Z(zzuq param1zzuq) {
      this.zzced = param1zzuq.zzv();
      this.zzdv |= 0x40;
    }
    
    private final void a0(int param1Int) {
      this.zzdv |= 0x100;
      this.zzcef = param1Int;
    }
    
    private final void c0(zzuq param1zzuq) {
      this.zzcee = param1zzuq.zzv();
      this.zzdv |= 0x80;
    }
    
    private final void d0(Iterable<? extends zzug$zzc.zza> param1Iterable) {
      q42 q421 = this.zzcdz;
      if (!q421.x())
        this.zzcdz = k42.v(q421); 
      for (zzug$zzc.zza zza : param1Iterable)
        this.zzcdz.M(zza.zzv()); 
    }
    
    private final void f0(zzuq param1zzuq) {
      this.zzceg = param1zzuq.zzv();
      this.zzdv |= 0x200;
    }
    
    private final void g0(long param1Long) {
      this.zzdv |= 0x4;
      this.zzcdx = param1Long;
    }
    
    private final void h0(long param1Long) {
      this.zzdv |= 0x8;
      this.zzcdy = param1Long;
    }
    
    public static a i0(byte[] param1ArrayOfbyte) {
      return k42.<a>s(zzcei, param1ArrayOfbyte);
    }
    
    public static a u0() {
      return (a)zzcei.D();
    }
    
    public final long J() {
      return this.zzcdv;
    }
    
    public final zzuq j0() {
      zzuq zzuq1 = zzuq.zzcd(this.zzcdw);
      zzuq zzuq2 = zzuq1;
      if (zzuq1 == null)
        zzuq2 = zzuq.b; 
      return zzuq2;
    }
    
    public final long k0() {
      return this.zzcdx;
    }
    
    public final long l0() {
      return this.zzcdy;
    }
    
    public final List<zzug$zzc.zza> m0() {
      return new t42<Integer, zzug$zzc.zza>(this.zzcdz, zzcea);
    }
    
    public final zzug$zzm n0() {
      zzug$zzm zzug$zzm1 = this.zzceb;
      zzug$zzm zzug$zzm2 = zzug$zzm1;
      if (zzug$zzm1 == null)
        zzug$zzm2 = zzug$zzm.S(); 
      return zzug$zzm2;
    }
    
    public final zzuq o0() {
      zzuq zzuq1 = zzuq.zzcd(this.zzcec);
      zzuq zzuq2 = zzuq1;
      if (zzuq1 == null)
        zzuq2 = zzuq.b; 
      return zzuq2;
    }
    
    public final zzuq p0() {
      zzuq zzuq1 = zzuq.zzcd(this.zzced);
      zzuq zzuq2 = zzuq1;
      if (zzuq1 == null)
        zzuq2 = zzuq.b; 
      return zzuq2;
    }
    
    public final zzuq q0() {
      zzuq zzuq1 = zzuq.zzcd(this.zzcee);
      zzuq zzuq2 = zzuq1;
      if (zzuq1 == null)
        zzuq2 = zzuq.b; 
      return zzuq2;
    }
    
    public final int r0() {
      return this.zzcef;
    }
    
    public final zzuq s0() {
      zzuq zzuq1 = zzuq.zzcd(this.zzceg);
      zzuq zzuq2 = zzuq1;
      if (zzuq1 == null)
        zzuq2 = zzuq.b; 
      return zzuq2;
    }
    
    public final zzug$zzo.zzc t0() {
      zzug$zzo.zzc zzc1 = zzug$zzo.zzc.zzcm(this.zzceh);
      zzug$zzo.zzc zzc2 = zzc1;
      if (zzc1 == null)
        zzc2 = zzug$zzo.zzc.b; 
      return zzc2;
    }
    
    protected final Object x(int param1Int, Object<a> param1Object1, Object<a> param1Object2) {
      // Byte code:
      //   0: getstatic com/google/android/gms/internal/ads/ho2.a : [I
      //   3: iload_1
      //   4: iconst_1
      //   5: isub
      //   6: iaload
      //   7: tableswitch default -> 48, 1 -> 301, 2 -> 292, 3 -> 119, 4 -> 115, 5 -> 63, 6 -> 58, 7 -> 56
      //   48: new java/lang/UnsupportedOperationException
      //   51: dup
      //   52: invokespecial <init> : ()V
      //   55: athrow
      //   56: aconst_null
      //   57: areturn
      //   58: iconst_1
      //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   62: areturn
      //   63: getstatic com/google/android/gms/internal/ads/zzug$zzo$a.zzek : Lcom/google/android/gms/internal/ads/c62;
      //   66: astore_3
      //   67: aload_3
      //   68: astore_2
      //   69: aload_3
      //   70: ifnonnull -> 113
      //   73: ldc com/google/android/gms/internal/ads/zzug$zzo$a
      //   75: monitorenter
      //   76: getstatic com/google/android/gms/internal/ads/zzug$zzo$a.zzek : Lcom/google/android/gms/internal/ads/c62;
      //   79: astore_3
      //   80: aload_3
      //   81: astore_2
      //   82: aload_3
      //   83: ifnonnull -> 101
      //   86: new com/google/android/gms/internal/ads/k42$a
      //   89: astore_2
      //   90: aload_2
      //   91: getstatic com/google/android/gms/internal/ads/zzug$zzo$a.zzcei : Lcom/google/android/gms/internal/ads/zzug$zzo$a;
      //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
      //   97: aload_2
      //   98: putstatic com/google/android/gms/internal/ads/zzug$zzo$a.zzek : Lcom/google/android/gms/internal/ads/c62;
      //   101: ldc com/google/android/gms/internal/ads/zzug$zzo$a
      //   103: monitorexit
      //   104: goto -> 113
      //   107: astore_2
      //   108: ldc com/google/android/gms/internal/ads/zzug$zzo$a
      //   110: monitorexit
      //   111: aload_2
      //   112: athrow
      //   113: aload_2
      //   114: areturn
      //   115: getstatic com/google/android/gms/internal/ads/zzug$zzo$a.zzcei : Lcom/google/android/gms/internal/ads/zzug$zzo$a;
      //   118: areturn
      //   119: invokestatic zzw : ()Lcom/google/android/gms/internal/ads/r42;
      //   122: astore #4
      //   124: invokestatic zzw : ()Lcom/google/android/gms/internal/ads/r42;
      //   127: astore #5
      //   129: invokestatic zzw : ()Lcom/google/android/gms/internal/ads/r42;
      //   132: astore #6
      //   134: invokestatic zzw : ()Lcom/google/android/gms/internal/ads/r42;
      //   137: astore #7
      //   139: invokestatic zzw : ()Lcom/google/android/gms/internal/ads/r42;
      //   142: astore #8
      //   144: invokestatic zzw : ()Lcom/google/android/gms/internal/ads/r42;
      //   147: astore_3
      //   148: invokestatic zzw : ()Lcom/google/android/gms/internal/ads/r42;
      //   151: astore_2
      //   152: getstatic com/google/android/gms/internal/ads/zzug$zzo$a.zzcei : Lcom/google/android/gms/internal/ads/zzug$zzo$a;
      //   155: ldc_w '\\f \\f\\f  ??? ???????????????\\b???\\t???\\n???\\b???\\t\\f???\\n'
      //   158: bipush #20
      //   160: anewarray java/lang/Object
      //   163: dup
      //   164: iconst_0
      //   165: ldc_w 'zzdv'
      //   168: aastore
      //   169: dup
      //   170: iconst_1
      //   171: ldc_w 'zzcdv'
      //   174: aastore
      //   175: dup
      //   176: iconst_2
      //   177: ldc_w 'zzcdw'
      //   180: aastore
      //   181: dup
      //   182: iconst_3
      //   183: aload #4
      //   185: aastore
      //   186: dup
      //   187: iconst_4
      //   188: ldc_w 'zzcdx'
      //   191: aastore
      //   192: dup
      //   193: iconst_5
      //   194: ldc_w 'zzcdy'
      //   197: aastore
      //   198: dup
      //   199: bipush #6
      //   201: ldc_w 'zzcdz'
      //   204: aastore
      //   205: dup
      //   206: bipush #7
      //   208: aload #5
      //   210: aastore
      //   211: dup
      //   212: bipush #8
      //   214: ldc_w 'zzceb'
      //   217: aastore
      //   218: dup
      //   219: bipush #9
      //   221: ldc_w 'zzcec'
      //   224: aastore
      //   225: dup
      //   226: bipush #10
      //   228: aload #6
      //   230: aastore
      //   231: dup
      //   232: bipush #11
      //   234: ldc_w 'zzced'
      //   237: aastore
      //   238: dup
      //   239: bipush #12
      //   241: aload #7
      //   243: aastore
      //   244: dup
      //   245: bipush #13
      //   247: ldc_w 'zzcee'
      //   250: aastore
      //   251: dup
      //   252: bipush #14
      //   254: aload #8
      //   256: aastore
      //   257: dup
      //   258: bipush #15
      //   260: ldc_w 'zzcef'
      //   263: aastore
      //   264: dup
      //   265: bipush #16
      //   267: ldc_w 'zzceg'
      //   270: aastore
      //   271: dup
      //   272: bipush #17
      //   274: aload_3
      //   275: aastore
      //   276: dup
      //   277: bipush #18
      //   279: ldc_w 'zzceh'
      //   282: aastore
      //   283: dup
      //   284: bipush #19
      //   286: aload_2
      //   287: aastore
      //   288: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      //   291: areturn
      //   292: new com/google/android/gms/internal/ads/zzug$zzo$a$a
      //   295: dup
      //   296: aconst_null
      //   297: invokespecial <init> : (Lcom/google/android/gms/internal/ads/ho2;)V
      //   300: areturn
      //   301: new com/google/android/gms/internal/ads/zzug$zzo$a
      //   304: dup
      //   305: invokespecial <init> : ()V
      //   308: areturn
      // Exception table:
      //   from	to	target	type
      //   76	80	107	finally
      //   86	101	107	finally
      //   101	104	107	finally
      //   108	111	107	finally
    }
    
    public static final class a extends k42.b<a, a> implements w52 {
      private a() {
        super(zzug$zzo.a.v0());
      }
      
      public final a A(long param2Long) {
        if (this.d) {
          t();
          this.d = false;
        } 
        zzug$zzo.a.N((zzug$zzo.a)this.c, param2Long);
        return this;
      }
      
      public final a B(long param2Long) {
        if (this.d) {
          t();
          this.d = false;
        } 
        zzug$zzo.a.U((zzug$zzo.a)this.c, param2Long);
        return this;
      }
      
      public final a C(long param2Long) {
        if (this.d) {
          t();
          this.d = false;
        } 
        zzug$zzo.a.X((zzug$zzo.a)this.c, param2Long);
        return this;
      }
      
      public final a D(zzuq param2zzuq) {
        if (this.d) {
          t();
          this.d = false;
        } 
        zzug$zzo.a.Q((zzug$zzo.a)this.c, param2zzuq);
        return this;
      }
      
      public final a E(Iterable<? extends zzug$zzc.zza> param2Iterable) {
        if (this.d) {
          t();
          this.d = false;
        } 
        zzug$zzo.a.R((zzug$zzo.a)this.c, param2Iterable);
        return this;
      }
      
      public final a F(zzuq param2zzuq) {
        if (this.d) {
          t();
          this.d = false;
        } 
        zzug$zzo.a.V((zzug$zzo.a)this.c, param2zzuq);
        return this;
      }
      
      public final a G(zzuq param2zzuq) {
        if (this.d) {
          t();
          this.d = false;
        } 
        zzug$zzo.a.Y((zzug$zzo.a)this.c, param2zzuq);
        return this;
      }
      
      public final a H(zzuq param2zzuq) {
        if (this.d) {
          t();
          this.d = false;
        } 
        zzug$zzo.a.b0((zzug$zzo.a)this.c, param2zzuq);
        return this;
      }
      
      public final a I(zzuq param2zzuq) {
        if (this.d) {
          t();
          this.d = false;
        } 
        zzug$zzo.a.e0((zzug$zzo.a)this.c, param2zzuq);
        return this;
      }
      
      public final a x(zzug$zzm param2zzug$zzm) {
        if (this.d) {
          t();
          this.d = false;
        } 
        zzug$zzo.a.O((zzug$zzo.a)this.c, param2zzug$zzm);
        return this;
      }
      
      public final a y(zzug$zzo.zzc param2zzc) {
        if (this.d) {
          t();
          this.d = false;
        } 
        zzug$zzo.a.P((zzug$zzo.a)this.c, param2zzc);
        return this;
      }
      
      public final a z(int param2Int) {
        if (this.d) {
          t();
          this.d = false;
        } 
        zzug$zzo.a.M((zzug$zzo.a)this.c, param2Int);
        return this;
      }
    }
  }
  
  public static final class a extends k42.b<a, a.a> implements w52 {
    private a() {
      super(zzug$zzo.a.v0());
    }
    
    public final a A(long param1Long) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zzo.a.N((zzug$zzo.a)this.c, param1Long);
      return this;
    }
    
    public final a B(long param1Long) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zzo.a.U((zzug$zzo.a)this.c, param1Long);
      return this;
    }
    
    public final a C(long param1Long) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zzo.a.X((zzug$zzo.a)this.c, param1Long);
      return this;
    }
    
    public final a D(zzuq param1zzuq) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zzo.a.Q((zzug$zzo.a)this.c, param1zzuq);
      return this;
    }
    
    public final a E(Iterable<? extends zzug$zzc.zza> param1Iterable) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zzo.a.R((zzug$zzo.a)this.c, param1Iterable);
      return this;
    }
    
    public final a F(zzuq param1zzuq) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zzo.a.V((zzug$zzo.a)this.c, param1zzuq);
      return this;
    }
    
    public final a G(zzuq param1zzuq) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zzo.a.Y((zzug$zzo.a)this.c, param1zzuq);
      return this;
    }
    
    public final a H(zzuq param1zzuq) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zzo.a.b0((zzug$zzo.a)this.c, param1zzuq);
      return this;
    }
    
    public final a I(zzuq param1zzuq) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zzo.a.e0((zzug$zzo.a)this.c, param1zzuq);
      return this;
    }
    
    public final a x(zzug$zzm param1zzug$zzm) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zzo.a.O((zzug$zzo.a)this.c, param1zzug$zzm);
      return this;
    }
    
    public final a y(zzug$zzo.zzc param1zzc) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zzo.a.P((zzug$zzo.a)this.c, param1zzc);
      return this;
    }
    
    public final a z(int param1Int) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zzo.a.M((zzug$zzo.a)this.c, param1Int);
      return this;
    }
  }
  
  public static final class b extends k42.b<zzug$zzo, b> implements w52 {
    private b() {
      super(zzug$zzo.Y());
    }
    
    public final b A(int param1Int) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zzo.N((zzug$zzo)this.c, param1Int);
      return this;
    }
    
    public final b B(Iterable<? extends zzug$zzo.a> param1Iterable) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zzo.L((zzug$zzo)this.c, param1Iterable);
      return this;
    }
    
    public final b C(long param1Long) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zzo.K((zzug$zzo)this.c, param1Long);
      return this;
    }
    
    public final b D(long param1Long) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zzo.O((zzug$zzo)this.c, param1Long);
      return this;
    }
    
    public final b x(String param1String) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zzo.M((zzug$zzo)this.c, param1String);
      return this;
    }
    
    public final b y(String param1String) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zzo.P((zzug$zzo)this.c, param1String);
      return this;
    }
    
    public final b z(int param1Int) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zzo.J((zzug$zzo)this.c, param1Int);
      return this;
    }
  }
  
  public enum zzc implements p42 {
    b, c, d, e, f, g;
    
    private static final o42<zzc> h;
    
    private final int value;
    
    static {
      zzc zzc1 = new zzc("UNSPECIFIED", 0, 0);
      b = zzc1;
      zzc zzc2 = new zzc("CONNECTING", 1, 1);
      c = zzc2;
      zzc zzc3 = new zzc("CONNECTED", 2, 2);
      d = zzc3;
      zzc zzc4 = new zzc("DISCONNECTING", 3, 3);
      e = zzc4;
      zzc zzc5 = new zzc("DISCONNECTED", 4, 4);
      f = zzc5;
      zzc zzc6 = new zzc("SUSPENDED", 5, 5);
      g = zzc6;
      i = new zzc[] { zzc1, zzc2, zzc3, zzc4, zzc5, zzc6 };
      h = new vp2();
    }
    
    zzc(int param1Int1) {
      this.value = param1Int1;
    }
    
    public static zzc zzcm(int param1Int) {
      return (param1Int != 0) ? ((param1Int != 1) ? ((param1Int != 2) ? ((param1Int != 3) ? ((param1Int != 4) ? ((param1Int != 5) ? null : g) : f) : e) : d) : c) : b;
    }
    
    public static r42 zzw() {
      return wp2.a;
    }
    
    public final String toString() {
      StringBuilder stringBuilder = new StringBuilder("<");
      stringBuilder.append(zzc.class.getName());
      stringBuilder.append('@');
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append(" number=");
      stringBuilder.append(this.value);
      stringBuilder.append(" name=");
      stringBuilder.append(name());
      stringBuilder.append('>');
      return stringBuilder.toString();
    }
    
    public final int zzv() {
      return this.value;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzug$zzo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */