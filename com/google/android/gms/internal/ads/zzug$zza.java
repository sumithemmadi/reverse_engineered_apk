package com.google.android.gms.internal.ads;

public final class zzug$zza extends k42<zzug$zza, zzug$zza.a> implements w52 {
  private static final zzug$zza zzbzl;
  
  private static volatile c62<zzug$zza> zzek;
  
  private int zzbza;
  
  private int zzbzb = 1000;
  
  private no2 zzbzc;
  
  private oo2 zzbzd;
  
  private u42<zzug$zzc> zzbze = k42.H();
  
  private po2 zzbzf;
  
  private wo2 zzbzg;
  
  private vo2 zzbzh;
  
  private to2 zzbzi;
  
  private uo2 zzbzj;
  
  private u42<cp2> zzbzk = k42.H();
  
  private int zzdv;
  
  static {
    zzug$zza zzug$zza1 = new zzug$zza();
    zzbzl = zzug$zza1;
    k42.A(zzug$zza.class, zzug$zza1);
  }
  
  private final void J(zza paramzza) {
    this.zzbza = paramzza.zzv();
    this.zzdv |= 0x1;
  }
  
  private final void M(oo2 paramoo2) {
    paramoo2.getClass();
    this.zzbzd = paramoo2;
    this.zzdv |= 0x8;
  }
  
  public static zzug$zza O() {
    return zzbzl;
  }
  
  public final oo2 N() {
    oo2 oo21 = this.zzbzd;
    oo2 oo22 = oo21;
    if (oo21 == null)
      oo22 = oo2.L(); 
    return oo22;
  }
  
  protected final Object x(int paramInt, Object<zzug$zza> paramObject1, Object<zzug$zza> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/ho2.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 238, 2 -> 229, 3 -> 119, 4 -> 115, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic com/google/android/gms/internal/ads/zzug$zza.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/zzug$zza
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/zzug$zza.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/zzug$zza.zzbzl : Lcom/google/android/gms/internal/ads/zzug$zza;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/zzug$zza.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/zzug$zza
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/zzug$zza
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/zzug$zza.zzbzl : Lcom/google/android/gms/internal/ads/zzug$zza;
    //   118: areturn
    //   119: invokestatic zzw : ()Lcom/google/android/gms/internal/ads/r42;
    //   122: astore_2
    //   123: invokestatic zzw : ()Lcom/google/android/gms/internal/ads/r42;
    //   126: astore_3
    //   127: getstatic com/google/android/gms/internal/ads/zzug$zza.zzbzl : Lcom/google/android/gms/internal/ads/zzug$zza;
    //   130: ldc '   ??? \\b???\\t???\\n???\\f???\\r????????????\\b'
    //   132: bipush #16
    //   134: anewarray java/lang/Object
    //   137: dup
    //   138: iconst_0
    //   139: ldc 'zzdv'
    //   141: aastore
    //   142: dup
    //   143: iconst_1
    //   144: ldc 'zzbza'
    //   146: aastore
    //   147: dup
    //   148: iconst_2
    //   149: aload_2
    //   150: aastore
    //   151: dup
    //   152: iconst_3
    //   153: ldc 'zzbzb'
    //   155: aastore
    //   156: dup
    //   157: iconst_4
    //   158: aload_3
    //   159: aastore
    //   160: dup
    //   161: iconst_5
    //   162: ldc 'zzbzc'
    //   164: aastore
    //   165: dup
    //   166: bipush #6
    //   168: ldc 'zzbzd'
    //   170: aastore
    //   171: dup
    //   172: bipush #7
    //   174: ldc 'zzbze'
    //   176: aastore
    //   177: dup
    //   178: bipush #8
    //   180: ldc com/google/android/gms/internal/ads/zzug$zzc
    //   182: aastore
    //   183: dup
    //   184: bipush #9
    //   186: ldc 'zzbzf'
    //   188: aastore
    //   189: dup
    //   190: bipush #10
    //   192: ldc 'zzbzg'
    //   194: aastore
    //   195: dup
    //   196: bipush #11
    //   198: ldc 'zzbzh'
    //   200: aastore
    //   201: dup
    //   202: bipush #12
    //   204: ldc 'zzbzi'
    //   206: aastore
    //   207: dup
    //   208: bipush #13
    //   210: ldc 'zzbzj'
    //   212: aastore
    //   213: dup
    //   214: bipush #14
    //   216: ldc 'zzbzk'
    //   218: aastore
    //   219: dup
    //   220: bipush #15
    //   222: ldc com/google/android/gms/internal/ads/cp2
    //   224: aastore
    //   225: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   228: areturn
    //   229: new com/google/android/gms/internal/ads/zzug$zza$a
    //   232: dup
    //   233: aconst_null
    //   234: invokespecial <init> : (Lcom/google/android/gms/internal/ads/ho2;)V
    //   237: areturn
    //   238: new com/google/android/gms/internal/ads/zzug$zza
    //   241: dup
    //   242: invokespecial <init> : ()V
    //   245: areturn
    // Exception table:
    //   from	to	target	type
    //   76	80	107	finally
    //   86	101	107	finally
    //   101	104	107	finally
    //   108	111	107	finally
  }
  
  public static final class a extends k42.b<zzug$zza, a> implements w52 {
    private a() {
      super(zzug$zza.P());
    }
    
    public final a x(oo2.a param1a) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zza.L((zzug$zza)this.c, (oo2)param1a.h());
      return this;
    }
    
    public final a y(zzug$zza.zza param1zza) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zza.K((zzug$zza)this.c, param1zza);
      return this;
    }
  }
  
  public enum zza implements p42 {
    b, c, d, e, f, g, h, i, j, k, l, m;
    
    private static final o42<zza> n;
    
    private final int value;
    
    static {
      zza zza1 = new zza("AD_INITIATER_UNSPECIFIED", 0, 0);
      b = zza1;
      zza zza2 = new zza("BANNER", 1, 1);
      c = zza2;
      zza zza3 = new zza("DFP_BANNER", 2, 2);
      d = zza3;
      zza zza4 = new zza("INTERSTITIAL", 3, 3);
      e = zza4;
      zza zza5 = new zza("DFP_INTERSTITIAL", 4, 4);
      f = zza5;
      zza zza6 = new zza("NATIVE_EXPRESS", 5, 5);
      g = zza6;
      zza zza7 = new zza("AD_LOADER", 6, 6);
      h = zza7;
      zza zza8 = new zza("REWARD_BASED_VIDEO_AD", 7, 7);
      i = zza8;
      zza zza9 = new zza("BANNER_SEARCH_ADS", 8, 8);
      j = zza9;
      zza zza10 = new zza("GOOGLE_MOBILE_ADS_SDK_ADAPTER", 9, 9);
      k = zza10;
      zza zza11 = new zza("APP_OPEN", 10, 10);
      l = zza11;
      zza zza12 = new zza("REWARDED_INTERSTITIAL", 11, 11);
      m = zza12;
      o = new zza[] { 
          zza1, zza2, zza3, zza4, zza5, zza6, zza7, zza8, zza9, zza10, 
          zza11, zza12 };
      n = new hp2();
    }
    
    zza(int param1Int1) {
      this.value = param1Int1;
    }
    
    public static zza zzbw(int param1Int) {
      switch (param1Int) {
        default:
          return null;
        case 11:
          return m;
        case 10:
          return l;
        case 9:
          return k;
        case 8:
          return j;
        case 7:
          return i;
        case 6:
          return h;
        case 5:
          return g;
        case 4:
          return f;
        case 3:
          return e;
        case 2:
          return d;
        case 1:
          return c;
        case 0:
          break;
      } 
      return b;
    }
    
    public static r42 zzw() {
      return gp2.a;
    }
    
    public final String toString() {
      StringBuilder stringBuilder = new StringBuilder("<");
      stringBuilder.append(zza.class.getName());
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzug$zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */