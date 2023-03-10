package com.google.android.gms.internal.ads;

public final class zzug$zzc extends k42<zzug$zzc, zzug$zzc.a> implements w52 {
  private static final zzug$zzc zzcap;
  
  private static volatile c62<zzug$zzc> zzek;
  
  private int zzcan;
  
  private yo2 zzcao;
  
  private int zzdv;
  
  static {
    zzug$zzc zzug$zzc1 = new zzug$zzc();
    zzcap = zzug$zzc1;
    k42.A(zzug$zzc.class, zzug$zzc1);
  }
  
  protected final Object x(int paramInt, Object<zzug$zzc> paramObject1, Object<zzug$zzc> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/ho2.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 164, 2 -> 155, 3 -> 119, 4 -> 115, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic com/google/android/gms/internal/ads/zzug$zzc.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/zzug$zzc
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/zzug$zzc.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/zzug$zzc.zzcap : Lcom/google/android/gms/internal/ads/zzug$zzc;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/zzug$zzc.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/zzug$zzc
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/zzug$zzc
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/zzug$zzc.zzcap : Lcom/google/android/gms/internal/ads/zzug$zzc;
    //   118: areturn
    //   119: invokestatic zzw : ()Lcom/google/android/gms/internal/ads/r42;
    //   122: astore_2
    //   123: getstatic com/google/android/gms/internal/ads/zzug$zzc.zzcap : Lcom/google/android/gms/internal/ads/zzug$zzc;
    //   126: ldc '    ??? ???'
    //   128: iconst_4
    //   129: anewarray java/lang/Object
    //   132: dup
    //   133: iconst_0
    //   134: ldc 'zzdv'
    //   136: aastore
    //   137: dup
    //   138: iconst_1
    //   139: ldc 'zzcan'
    //   141: aastore
    //   142: dup
    //   143: iconst_2
    //   144: aload_2
    //   145: aastore
    //   146: dup
    //   147: iconst_3
    //   148: ldc 'zzcao'
    //   150: aastore
    //   151: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   154: areturn
    //   155: new com/google/android/gms/internal/ads/zzug$zzc$a
    //   158: dup
    //   159: aconst_null
    //   160: invokespecial <init> : (Lcom/google/android/gms/internal/ads/ho2;)V
    //   163: areturn
    //   164: new com/google/android/gms/internal/ads/zzug$zzc
    //   167: dup
    //   168: invokespecial <init> : ()V
    //   171: areturn
    // Exception table:
    //   from	to	target	type
    //   76	80	107	finally
    //   86	101	107	finally
    //   101	104	107	finally
    //   108	111	107	finally
  }
  
  public static final class a extends k42.b<zzug$zzc, a> implements w52 {
    private a() {
      super(zzug$zzc.J());
    }
  }
  
  public enum zza implements p42 {
    b, c, d, e, f, g, h, i, j, k, l;
    
    private static final o42<zza> m;
    
    private final int value;
    
    static {
      zza zza1 = new zza("AD_FORMAT_TYPE_UNSPECIFIED", 0, 0);
      b = zza1;
      zza zza2 = new zza("BANNER", 1, 1);
      c = zza2;
      zza zza3 = new zza("INTERSTITIAL", 2, 2);
      d = zza3;
      zza zza4 = new zza("NATIVE_EXPRESS", 3, 3);
      e = zza4;
      zza zza5 = new zza("NATIVE_CONTENT", 4, 4);
      f = zza5;
      zza zza6 = new zza("NATIVE_APP_INSTALL", 5, 5);
      g = zza6;
      zza zza7 = new zza("NATIVE_CUSTOM_TEMPLATE", 6, 6);
      h = zza7;
      zza zza8 = new zza("DFP_BANNER", 7, 7);
      i = zza8;
      zza zza9 = new zza("DFP_INTERSTITIAL", 8, 8);
      j = zza9;
      zza zza10 = new zza("REWARD_BASED_VIDEO_AD", 9, 9);
      k = zza10;
      zza zza11 = new zza("BANNER_SEARCH_ADS", 10, 10);
      l = zza11;
      n = new zza[] { 
          zza1, zza2, zza3, zza4, zza5, zza6, zza7, zza8, zza9, zza10, 
          zza11 };
      m = new lp2();
    }
    
    zza(int param1Int1) {
      this.value = param1Int1;
    }
    
    public static zza zzcb(int param1Int) {
      switch (param1Int) {
        default:
          return null;
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
      return kp2.a;
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzug$zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */