package com.google.android.gms.internal.ads;

public final class zzdtt extends k42<zzdtt, zzdtt.a> implements w52 {
  private static volatile c62<zzdtt> zzek;
  
  private static final s42<Integer, zza> zzhth = new no1();
  
  private static final zzdtt zzhtl;
  
  private int zzdv;
  
  private q42 zzhtg = k42.F();
  
  private String zzhti = "";
  
  private String zzhtj = "";
  
  private String zzhtk = "";
  
  static {
    zzdtt zzdtt1 = new zzdtt();
    zzhtl = zzdtt1;
    k42.A(zzdtt.class, zzdtt1);
  }
  
  private final void J(zza paramzza) {
    paramzza.getClass();
    q42 q421 = this.zzhtg;
    if (!q421.x())
      this.zzhtg = k42.v(q421); 
    this.zzhtg.M(paramzza.zzv());
  }
  
  public static a M() {
    return (a)zzhtl.D();
  }
  
  private final void O(String paramString) {
    paramString.getClass();
    this.zzdv |= 0x1;
    this.zzhti = paramString;
  }
  
  protected final Object x(int paramInt, Object<zzdtt> paramObject1, Object<zzdtt> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/mo1.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 175, 2 -> 166, 3 -> 119, 4 -> 115, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic com/google/android/gms/internal/ads/zzdtt.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/zzdtt
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/zzdtt.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/zzdtt.zzhtl : Lcom/google/android/gms/internal/ads/zzdtt;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/zzdtt.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/zzdtt
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/zzdtt
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/zzdtt.zzhtl : Lcom/google/android/gms/internal/ads/zzdtt;
    //   118: areturn
    //   119: invokestatic zzw : ()Lcom/google/android/gms/internal/ads/r42;
    //   122: astore_2
    //   123: getstatic com/google/android/gms/internal/ads/zzdtt.zzhtl : Lcom/google/android/gms/internal/ads/zzdtt;
    //   126: ldc '   ??? ??????'
    //   128: bipush #6
    //   130: anewarray java/lang/Object
    //   133: dup
    //   134: iconst_0
    //   135: ldc 'zzdv'
    //   137: aastore
    //   138: dup
    //   139: iconst_1
    //   140: ldc 'zzhtg'
    //   142: aastore
    //   143: dup
    //   144: iconst_2
    //   145: aload_2
    //   146: aastore
    //   147: dup
    //   148: iconst_3
    //   149: ldc 'zzhti'
    //   151: aastore
    //   152: dup
    //   153: iconst_4
    //   154: ldc 'zzhtj'
    //   156: aastore
    //   157: dup
    //   158: iconst_5
    //   159: ldc 'zzhtk'
    //   161: aastore
    //   162: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   165: areturn
    //   166: new com/google/android/gms/internal/ads/zzdtt$a
    //   169: dup
    //   170: aconst_null
    //   171: invokespecial <init> : (Lcom/google/android/gms/internal/ads/no1;)V
    //   174: areturn
    //   175: new com/google/android/gms/internal/ads/zzdtt
    //   178: dup
    //   179: invokespecial <init> : ()V
    //   182: areturn
    // Exception table:
    //   from	to	target	type
    //   76	80	107	finally
    //   86	101	107	finally
    //   101	104	107	finally
    //   108	111	107	finally
  }
  
  public static final class a extends k42.b<zzdtt, a> implements w52 {
    private a() {
      super(zzdtt.N());
    }
    
    public final a x(zzdtt.zza param1zza) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzdtt.K((zzdtt)this.c, param1zza);
      return this;
    }
    
    public final a y(String param1String) {
      if (this.d) {
        t();
        this.d = false;
      } 
      zzdtt.L((zzdtt)this.c, param1String);
      return this;
    }
  }
  
  public enum zza implements p42 {
    b, c;
    
    private static final o42<zza> d;
    
    private final int value;
    
    static {
      zza zza1 = new zza("BLOCKED_REASON_UNKNOWN", 0, 1);
      b = zza1;
      zza zza2 = new zza("BLOCKED_REASON_BACKGROUND", 1, 2);
      c = zza2;
      e = new zza[] { zza1, zza2 };
      d = new oo1();
    }
    
    zza(int param1Int1) {
      this.value = param1Int1;
    }
    
    public static zza zzeh(int param1Int) {
      return (param1Int != 1) ? ((param1Int != 2) ? null : c) : b;
    }
    
    public static r42 zzw() {
      return po1.a;
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdtt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */