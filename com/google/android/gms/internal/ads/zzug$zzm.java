package com.google.android.gms.internal.ads;

public final class zzug$zzm extends k42<zzug$zzm, zzug$zzm.a> implements w52 {
  private static final zzug$zzm zzcdc;
  
  private static volatile c62<zzug$zzm> zzek;
  
  private int zzcan;
  
  private int zzcdb;
  
  private int zzdv;
  
  static {
    zzug$zzm zzug$zzm1 = new zzug$zzm();
    zzcdc = zzug$zzm1;
    k42.A(zzug$zzm.class, zzug$zzm1);
  }
  
  private final void J(zza paramzza) {
    this.zzcdb = paramzza.zzv();
    this.zzdv |= 0x2;
  }
  
  private final void K(zzc paramzzc) {
    this.zzcan = paramzzc.zzv();
    this.zzdv |= 0x1;
  }
  
  public static a R() {
    return (a)zzcdc.D();
  }
  
  public static zzug$zzm S() {
    return zzcdc;
  }
  
  public final boolean N() {
    return ((this.zzdv & 0x1) != 0);
  }
  
  public final zzc O() {
    zzc zzc1 = zzc.zzcf(this.zzcan);
    zzc zzc2 = zzc1;
    if (zzc1 == null)
      zzc2 = zzc.b; 
    return zzc2;
  }
  
  public final boolean P() {
    return ((this.zzdv & 0x2) != 0);
  }
  
  public final zza Q() {
    zza zza1 = zza.zzce(this.zzcdb);
    zza zza2 = zza1;
    if (zza1 == null)
      zza2 = zza.b; 
    return zza2;
  }
  
  protected final Object x(int paramInt, Object<zzug$zzm> paramObject1, Object<zzug$zzm> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/ho2.a : [I
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
    //   63: getstatic com/google/android/gms/internal/ads/zzug$zzm.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/zzug$zzm
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/zzug$zzm.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/zzug$zzm.zzcdc : Lcom/google/android/gms/internal/ads/zzug$zzm;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/zzug$zzm.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/zzug$zzm
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/zzug$zzm
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/zzug$zzm.zzcdc : Lcom/google/android/gms/internal/ads/zzug$zzm;
    //   118: areturn
    //   119: invokestatic zzw : ()Lcom/google/android/gms/internal/ads/r42;
    //   122: astore_2
    //   123: invokestatic zzw : ()Lcom/google/android/gms/internal/ads/r42;
    //   126: astore_3
    //   127: getstatic com/google/android/gms/internal/ads/zzug$zzm.zzcdc : Lcom/google/android/gms/internal/ads/zzug$zzm;
    //   130: ldc '    ??? ???'
    //   132: iconst_5
    //   133: anewarray java/lang/Object
    //   136: dup
    //   137: iconst_0
    //   138: ldc 'zzdv'
    //   140: aastore
    //   141: dup
    //   142: iconst_1
    //   143: ldc 'zzcan'
    //   145: aastore
    //   146: dup
    //   147: iconst_2
    //   148: aload_2
    //   149: aastore
    //   150: dup
    //   151: iconst_3
    //   152: ldc 'zzcdb'
    //   154: aastore
    //   155: dup
    //   156: iconst_4
    //   157: aload_3
    //   158: aastore
    //   159: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   162: areturn
    //   163: new com/google/android/gms/internal/ads/zzug$zzm$a
    //   166: dup
    //   167: aconst_null
    //   168: invokespecial <init> : (Lcom/google/android/gms/internal/ads/ho2;)V
    //   171: areturn
    //   172: new com/google/android/gms/internal/ads/zzug$zzm
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
  
  public static final class a extends k42.b<zzug$zzm, a> implements w52 {
    private a() {
      super(zzug$zzm.T());
    }
    
    public final a x(zzug$zzm.zza param1zza) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zzm.L((zzug$zzm)this.c, param1zza);
      return this;
    }
    
    public final a y(zzug$zzm.zzc param1zzc) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzug$zzm.M((zzug$zzm)this.c, param1zzc);
      return this;
    }
  }
  
  public enum zza implements p42 {
    b, c, d, e;
    
    private static final o42<zza> f;
    
    private final int value;
    
    static {
      zza zza1 = new zza("CELLULAR_NETWORK_TYPE_UNSPECIFIED", 0, 0);
      b = zza1;
      zza zza2 = new zza("TWO_G", 1, 1);
      c = zza2;
      zza zza3 = new zza("THREE_G", 2, 2);
      d = zza3;
      zza zza4 = new zza("LTE", 3, 4);
      e = zza4;
      g = new zza[] { zza1, zza2, zza3, zza4 };
      f = new rp2();
    }
    
    zza(int param1Int1) {
      this.value = param1Int1;
    }
    
    public static zza zzce(int param1Int) {
      return (param1Int != 0) ? ((param1Int != 1) ? ((param1Int != 2) ? ((param1Int != 4) ? null : e) : d) : c) : b;
    }
    
    public static r42 zzw() {
      return qp2.a;
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
  
  public enum zzc implements p42 {
    b, c, d;
    
    private static final o42<zzc> e;
    
    private final int value;
    
    static {
      zzc zzc1 = new zzc("NETWORKTYPE_UNSPECIFIED", 0, 0);
      b = zzc1;
      zzc zzc2 = new zzc("CELL", 1, 1);
      c = zzc2;
      zzc zzc3 = new zzc("WIFI", 2, 2);
      d = zzc3;
      f = new zzc[] { zzc1, zzc2, zzc3 };
      e = new sp2();
    }
    
    zzc(int param1Int1) {
      this.value = param1Int1;
    }
    
    public static zzc zzcf(int param1Int) {
      return (param1Int != 0) ? ((param1Int != 1) ? ((param1Int != 2) ? null : d) : c) : b;
    }
    
    public static r42 zzw() {
      return tp2.a;
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzug$zzm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */