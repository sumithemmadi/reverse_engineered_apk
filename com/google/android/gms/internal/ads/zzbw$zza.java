package com.google.android.gms.internal.ads;

public final class zzbw$zza extends k42<zzbw$zza, zzbw$zza.b> implements w52 {
  private static final zzbw$zza zzej;
  
  private static volatile c62<zzbw$zza> zzek;
  
  private int zzdv;
  
  private String zzdw = "";
  
  private long zzdx;
  
  private String zzdy = "";
  
  private String zzdz = "";
  
  private String zzea = "";
  
  private long zzeb;
  
  private long zzec;
  
  private String zzed = "";
  
  private long zzee;
  
  private String zzef = "";
  
  private String zzeg = "";
  
  private u42<a> zzeh = k42.H();
  
  private int zzei;
  
  static {
    zzbw$zza zzbw$zza1 = new zzbw$zza();
    zzej = zzbw$zza1;
    k42.A(zzbw$zza.class, zzbw$zza1);
  }
  
  private final void J(zzc paramzzc) {
    this.zzei = paramzzc.zzv();
    this.zzdv |= 0x800;
  }
  
  private final void O(long paramLong) {
    this.zzdv |= 0x2;
    this.zzdx = paramLong;
  }
  
  private final void S(String paramString) {
    paramString.getClass();
    this.zzdv |= 0x1;
    this.zzdw = paramString;
  }
  
  private final void T(String paramString) {
    paramString.getClass();
    this.zzdv |= 0x4;
    this.zzdy = paramString;
  }
  
  private final void U(String paramString) {
    paramString.getClass();
    this.zzdv |= 0x8;
    this.zzdz = paramString;
  }
  
  private final void V(String paramString) {
    paramString.getClass();
    this.zzdv |= 0x10;
    this.zzea = paramString;
  }
  
  private final void W(String paramString) {
    paramString.getClass();
    this.zzdv |= 0x400;
    this.zzeg = paramString;
  }
  
  public static b X() {
    return (b)zzej.D();
  }
  
  protected final Object x(int paramInt, Object<zzbw$zza> paramObject1, Object<zzbw$zza> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/ea0.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 235, 2 -> 226, 3 -> 119, 4 -> 115, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic com/google/android/gms/internal/ads/zzbw$zza.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/zzbw$zza
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/zzbw$zza.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/zzbw$zza.zzej : Lcom/google/android/gms/internal/ads/zzbw$zza;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/zzbw$zza.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/zzbw$zza
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/zzbw$zza
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/zzbw$zza.zzej : Lcom/google/android/gms/internal/ads/zzbw$zza;
    //   118: areturn
    //   119: invokestatic zzw : ()Lcom/google/android/gms/internal/ads/r42;
    //   122: astore_2
    //   123: getstatic com/google/android/gms/internal/ads/zzbw$zza.zzej : Lcom/google/android/gms/internal/ads/zzbw$zza;
    //   126: ldc '\\r \\r\\r  ??? ??????????????????\\b???\\t???\\b\\n???\\t???\\n\\f\\r???'
    //   128: bipush #16
    //   130: anewarray java/lang/Object
    //   133: dup
    //   134: iconst_0
    //   135: ldc 'zzdv'
    //   137: aastore
    //   138: dup
    //   139: iconst_1
    //   140: ldc 'zzdw'
    //   142: aastore
    //   143: dup
    //   144: iconst_2
    //   145: ldc 'zzdx'
    //   147: aastore
    //   148: dup
    //   149: iconst_3
    //   150: ldc 'zzdy'
    //   152: aastore
    //   153: dup
    //   154: iconst_4
    //   155: ldc 'zzdz'
    //   157: aastore
    //   158: dup
    //   159: iconst_5
    //   160: ldc 'zzea'
    //   162: aastore
    //   163: dup
    //   164: bipush #6
    //   166: ldc 'zzeb'
    //   168: aastore
    //   169: dup
    //   170: bipush #7
    //   172: ldc 'zzec'
    //   174: aastore
    //   175: dup
    //   176: bipush #8
    //   178: ldc 'zzed'
    //   180: aastore
    //   181: dup
    //   182: bipush #9
    //   184: ldc 'zzee'
    //   186: aastore
    //   187: dup
    //   188: bipush #10
    //   190: ldc 'zzef'
    //   192: aastore
    //   193: dup
    //   194: bipush #11
    //   196: ldc 'zzeg'
    //   198: aastore
    //   199: dup
    //   200: bipush #12
    //   202: ldc 'zzeh'
    //   204: aastore
    //   205: dup
    //   206: bipush #13
    //   208: ldc com/google/android/gms/internal/ads/zzbw$zza$a
    //   210: aastore
    //   211: dup
    //   212: bipush #14
    //   214: ldc 'zzei'
    //   216: aastore
    //   217: dup
    //   218: bipush #15
    //   220: aload_2
    //   221: aastore
    //   222: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   225: areturn
    //   226: new com/google/android/gms/internal/ads/zzbw$zza$b
    //   229: dup
    //   230: aconst_null
    //   231: invokespecial <init> : (Lcom/google/android/gms/internal/ads/ea0;)V
    //   234: areturn
    //   235: new com/google/android/gms/internal/ads/zzbw$zza
    //   238: dup
    //   239: invokespecial <init> : ()V
    //   242: areturn
    // Exception table:
    //   from	to	target	type
    //   76	80	107	finally
    //   86	101	107	finally
    //   101	104	107	finally
    //   108	111	107	finally
  }
  
  public static final class a extends k42<a, a.a> implements w52 {
    private static volatile c62<a> zzek;
    
    private static final a zzeo;
    
    private int zzdv;
    
    private String zzem = "";
    
    private String zzen = "";
    
    static {
      a a1 = new a();
      zzeo = a1;
      k42.A(a.class, a1);
    }
    
    protected final Object x(int param1Int, Object<a> param1Object1, Object<a> param1Object2) {
      // Byte code:
      //   0: getstatic com/google/android/gms/internal/ads/ea0.a : [I
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
      //   63: getstatic com/google/android/gms/internal/ads/zzbw$zza$a.zzek : Lcom/google/android/gms/internal/ads/c62;
      //   66: astore_3
      //   67: aload_3
      //   68: astore_2
      //   69: aload_3
      //   70: ifnonnull -> 113
      //   73: ldc com/google/android/gms/internal/ads/zzbw$zza$a
      //   75: monitorenter
      //   76: getstatic com/google/android/gms/internal/ads/zzbw$zza$a.zzek : Lcom/google/android/gms/internal/ads/c62;
      //   79: astore_3
      //   80: aload_3
      //   81: astore_2
      //   82: aload_3
      //   83: ifnonnull -> 101
      //   86: new com/google/android/gms/internal/ads/k42$a
      //   89: astore_2
      //   90: aload_2
      //   91: getstatic com/google/android/gms/internal/ads/zzbw$zza$a.zzeo : Lcom/google/android/gms/internal/ads/zzbw$zza$a;
      //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
      //   97: aload_2
      //   98: putstatic com/google/android/gms/internal/ads/zzbw$zza$a.zzek : Lcom/google/android/gms/internal/ads/c62;
      //   101: ldc com/google/android/gms/internal/ads/zzbw$zza$a
      //   103: monitorexit
      //   104: goto -> 113
      //   107: astore_2
      //   108: ldc com/google/android/gms/internal/ads/zzbw$zza$a
      //   110: monitorexit
      //   111: aload_2
      //   112: athrow
      //   113: aload_2
      //   114: areturn
      //   115: getstatic com/google/android/gms/internal/ads/zzbw$zza$a.zzeo : Lcom/google/android/gms/internal/ads/zzbw$zza$a;
      //   118: areturn
      //   119: getstatic com/google/android/gms/internal/ads/zzbw$zza$a.zzeo : Lcom/google/android/gms/internal/ads/zzbw$zza$a;
      //   122: ldc '    ??? ???'
      //   124: iconst_3
      //   125: anewarray java/lang/Object
      //   128: dup
      //   129: iconst_0
      //   130: ldc 'zzdv'
      //   132: aastore
      //   133: dup
      //   134: iconst_1
      //   135: ldc 'zzem'
      //   137: aastore
      //   138: dup
      //   139: iconst_2
      //   140: ldc 'zzen'
      //   142: aastore
      //   143: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      //   146: areturn
      //   147: new com/google/android/gms/internal/ads/zzbw$zza$a$a
      //   150: dup
      //   151: aconst_null
      //   152: invokespecial <init> : (Lcom/google/android/gms/internal/ads/ea0;)V
      //   155: areturn
      //   156: new com/google/android/gms/internal/ads/zzbw$zza$a
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
    
    public static final class a extends k42.b<a, a> implements w52 {
      private a() {
        super(zzbw$zza.a.J());
      }
    }
  }
  
  public static final class a extends k42.b<a, a.a> implements w52 {
    private a() {
      super(zzbw$zza.a.J());
    }
  }
  
  public static final class b extends k42.b<zzbw$zza, b> implements w52 {
    private b() {
      super(zzbw$zza.Y());
    }
    
    public final b A(String param1String) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzbw$zza.N((zzbw$zza)this.c, param1String);
      return this;
    }
    
    public final b B(String param1String) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzbw$zza.P((zzbw$zza)this.c, param1String);
      return this;
    }
    
    public final b C(String param1String) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzbw$zza.Q((zzbw$zza)this.c, param1String);
      return this;
    }
    
    public final b D(String param1String) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzbw$zza.R((zzbw$zza)this.c, param1String);
      return this;
    }
    
    public final b x(zzbw$zza.zzc param1zzc) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzbw$zza.L((zzbw$zza)this.c, param1zzc);
      return this;
    }
    
    public final b y(long param1Long) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzbw$zza.K((zzbw$zza)this.c, param1Long);
      return this;
    }
    
    public final b z(String param1String) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzbw$zza.M((zzbw$zza)this.c, param1String);
      return this;
    }
  }
  
  public enum zzc implements p42 {
    b, c, d;
    
    private static final o42<zzc> e;
    
    private final int value;
    
    static {
      zzc zzc1 = new zzc("UNKNOWN", 0, 0);
      b = zzc1;
      zzc zzc2 = new zzc("ENABLED", 1, 1);
      c = zzc2;
      zzc zzc3 = new zzc("DISABLED", 2, 2);
      d = zzc3;
      f = new zzc[] { zzc1, zzc2, zzc3 };
      e = new gc0();
    }
    
    zzc(int param1Int1) {
      this.value = param1Int1;
    }
    
    public static zzc zzh(int param1Int) {
      return (param1Int != 0) ? ((param1Int != 1) ? ((param1Int != 2) ? null : d) : c) : b;
    }
    
    public static r42 zzw() {
      return fb0.a;
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzbw$zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */