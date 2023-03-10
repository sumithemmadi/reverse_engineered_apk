package com.google.android.gms.internal.ads;

public final class zzug$zzx extends k42<zzug$zzx, zzug$zzx.a> implements w52 {
  private static final zzug$zzx zzcgl;
  
  private static volatile c62<zzug$zzx> zzek;
  
  private int zzcgk;
  
  private int zzdv;
  
  static {
    zzug$zzx zzug$zzx1 = new zzug$zzx();
    zzcgl = zzug$zzx1;
    k42.A(zzug$zzx.class, zzug$zzx1);
  }
  
  protected final Object x(int paramInt, Object<zzug$zzx> paramObject1, Object<zzug$zzx> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/ho2.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 159, 2 -> 150, 3 -> 119, 4 -> 115, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic com/google/android/gms/internal/ads/zzug$zzx.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/zzug$zzx
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/zzug$zzx.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/zzug$zzx.zzcgl : Lcom/google/android/gms/internal/ads/zzug$zzx;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/zzug$zzx.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/zzug$zzx
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/zzug$zzx
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/zzug$zzx.zzcgl : Lcom/google/android/gms/internal/ads/zzug$zzx;
    //   118: areturn
    //   119: invokestatic zzw : ()Lcom/google/android/gms/internal/ads/r42;
    //   122: astore_2
    //   123: getstatic com/google/android/gms/internal/ads/zzug$zzx.zzcgl : Lcom/google/android/gms/internal/ads/zzug$zzx;
    //   126: ldc '    ??? '
    //   128: iconst_3
    //   129: anewarray java/lang/Object
    //   132: dup
    //   133: iconst_0
    //   134: ldc 'zzdv'
    //   136: aastore
    //   137: dup
    //   138: iconst_1
    //   139: ldc 'zzcgk'
    //   141: aastore
    //   142: dup
    //   143: iconst_2
    //   144: aload_2
    //   145: aastore
    //   146: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   149: areturn
    //   150: new com/google/android/gms/internal/ads/zzug$zzx$a
    //   153: dup
    //   154: aconst_null
    //   155: invokespecial <init> : (Lcom/google/android/gms/internal/ads/ho2;)V
    //   158: areturn
    //   159: new com/google/android/gms/internal/ads/zzug$zzx
    //   162: dup
    //   163: invokespecial <init> : ()V
    //   166: areturn
    // Exception table:
    //   from	to	target	type
    //   76	80	107	finally
    //   86	101	107	finally
    //   101	104	107	finally
    //   108	111	107	finally
  }
  
  public static final class a extends k42.b<zzug$zzx, a> implements w52 {
    private a() {
      super(zzug$zzx.J());
    }
  }
  
  public enum zza implements p42 {
    b, c, d, e;
    
    private static final o42<zza> f;
    
    private final int value;
    
    static {
      zza zza1 = new zza("VIDEO_ERROR_CODE_UNSPECIFIED", 0, 0);
      b = zza1;
      zza zza2 = new zza("OPENGL_RENDERING_FAILED", 1, 1);
      c = zza2;
      zza zza3 = new zza("CACHE_LOAD_FAILED", 2, 2);
      d = zza3;
      zza zza4 = new zza("ANDROID_TARGET_API_TOO_LOW", 3, 3);
      e = zza4;
      g = new zza[] { zza1, zza2, zza3, zza4 };
      f = new zp2();
    }
    
    zza(int param1Int1) {
      this.value = param1Int1;
    }
    
    public static zza zzct(int param1Int) {
      return (param1Int != 0) ? ((param1Int != 1) ? ((param1Int != 2) ? ((param1Int != 3) ? null : e) : d) : c) : b;
    }
    
    public static r42 zzw() {
      return xp2.a;
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzug$zzx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */