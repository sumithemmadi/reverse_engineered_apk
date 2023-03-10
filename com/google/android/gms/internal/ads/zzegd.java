package com.google.android.gms.internal.ads;

public final class zzegd extends k42<zzegd, zzegd.a> implements w52 {
  private static volatile c62<zzegd> zzek;
  
  private static final zzegd zzigv;
  
  private String zzigs = "";
  
  private zzejr zzigt = zzejr.b;
  
  private int zzigu;
  
  static {
    zzegd zzegd1 = new zzegd();
    zzigv = zzegd1;
    k42.A(zzegd.class, zzegd1);
  }
  
  private final void J(zza paramzza) {
    this.zzigu = paramzza.zzv();
  }
  
  private final void N(zzejr paramzzejr) {
    paramzzejr.getClass();
    this.zzigt = paramzzejr;
  }
  
  public static a R() {
    return (a)zzigv.D();
  }
  
  public static zzegd S() {
    return zzigv;
  }
  
  private final void U(String paramString) {
    paramString.getClass();
    this.zzigs = paramString;
  }
  
  public final String O() {
    return this.zzigs;
  }
  
  public final zzejr P() {
    return this.zzigt;
  }
  
  public final zza Q() {
    zza zza1 = zza.zzfj(this.zzigu);
    zza zza2 = zza1;
    if (zza1 == null)
      zza2 = zza.g; 
    return zza2;
  }
  
  protected final Object x(int paramInt, Object<zzegd> paramObject1, Object<zzegd> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/vz1.a : [I
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
    //   63: getstatic com/google/android/gms/internal/ads/zzegd.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/zzegd
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/zzegd.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/zzegd.zzigv : Lcom/google/android/gms/internal/ads/zzegd;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/zzegd.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/zzegd
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/zzegd
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/zzegd.zzigv : Lcom/google/android/gms/internal/ads/zzegd;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/zzegd.zzigv : Lcom/google/android/gms/internal/ads/zzegd;
    //   122: ldc '      ??\\n\\f'
    //   124: iconst_3
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc 'zzigs'
    //   132: aastore
    //   133: dup
    //   134: iconst_1
    //   135: ldc 'zzigt'
    //   137: aastore
    //   138: dup
    //   139: iconst_2
    //   140: ldc 'zzigu'
    //   142: aastore
    //   143: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   146: areturn
    //   147: new com/google/android/gms/internal/ads/zzegd$a
    //   150: dup
    //   151: aconst_null
    //   152: invokespecial <init> : (Lcom/google/android/gms/internal/ads/vz1;)V
    //   155: areturn
    //   156: new com/google/android/gms/internal/ads/zzegd
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
  
  public static final class a extends k42.b<zzegd, a> implements w52 {
    private a() {
      super(zzegd.T());
    }
    
    public final a x(zzejr param1zzejr) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzegd.L((zzegd)this.c, param1zzejr);
      return this;
    }
    
    public final a y(zzegd.zza param1zza) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzegd.K((zzegd)this.c, param1zza);
      return this;
    }
    
    public final a z(String param1String) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzegd.M((zzegd)this.c, param1String);
      return this;
    }
  }
  
  public enum zza implements p42 {
    b, c, d, e, f, g;
    
    private static final o42<zza> h;
    
    private final int value;
    
    static {
      zza zza1 = new zza("UNKNOWN_KEYMATERIAL", 0, 0);
      b = zza1;
      zza zza2 = new zza("SYMMETRIC", 1, 1);
      c = zza2;
      zza zza3 = new zza("ASYMMETRIC_PRIVATE", 2, 2);
      d = zza3;
      zza zza4 = new zza("ASYMMETRIC_PUBLIC", 3, 3);
      e = zza4;
      zza zza5 = new zza("REMOTE", 4, 4);
      f = zza5;
      zza zza6 = new zza("UNRECOGNIZED", 5, -1);
      g = zza6;
      i = new zza[] { zza1, zza2, zza3, zza4, zza5, zza6 };
      h = new wz1();
    }
    
    zza(int param1Int1) {
      this.value = param1Int1;
    }
    
    public static zza zzfj(int param1Int) {
      return (param1Int != 0) ? ((param1Int != 1) ? ((param1Int != 2) ? ((param1Int != 3) ? ((param1Int != 4) ? null : f) : e) : d) : c) : b;
    }
    
    public final String toString() {
      StringBuilder stringBuilder = new StringBuilder("<");
      stringBuilder.append(zza.class.getName());
      stringBuilder.append('@');
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      if (this != g) {
        stringBuilder.append(" number=");
        stringBuilder.append(zzv());
      } 
      stringBuilder.append(" name=");
      stringBuilder.append(name());
      stringBuilder.append('>');
      return stringBuilder.toString();
    }
    
    public final int zzv() {
      if (this != g)
        return this.value; 
      throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzegd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */