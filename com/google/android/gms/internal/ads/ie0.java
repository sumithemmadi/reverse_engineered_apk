package com.google.android.gms.internal.ads;

public final class ie0 extends k42<ie0, ie0.a> implements w52 {
  private static volatile c62<ie0> zzek;
  
  private static final ie0 zzex;
  
  private int zzdv;
  
  private je0 zzev;
  
  private ke0 zzew;
  
  static {
    ie0 ie01 = new ie0();
    zzex = ie01;
    k42.A(ie0.class, ie01);
  }
  
  public final ke0 J() {
    ke0 ke01 = this.zzew;
    ke0 ke02 = ke01;
    if (ke01 == null)
      ke02 = ke0.K(); 
    return ke02;
  }
  
  public final boolean L() {
    return ((this.zzdv & 0x1) != 0);
  }
  
  public final je0 M() {
    je0 je01 = this.zzev;
    je0 je02 = je01;
    if (je01 == null)
      je02 = je0.K(); 
    return je02;
  }
  
  public final boolean N() {
    return ((this.zzdv & 0x2) != 0);
  }
  
  protected final Object x(int paramInt, Object<ie0> paramObject1, Object<ie0> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/id0.a : [I
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
    //   63: getstatic com/google/android/gms/internal/ads/ie0.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/ie0
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/ie0.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/ie0.zzex : Lcom/google/android/gms/internal/ads/ie0;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/ie0.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/ie0
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/ie0
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/ie0.zzex : Lcom/google/android/gms/internal/ads/ie0;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/ie0.zzex : Lcom/google/android/gms/internal/ads/ie0;
    //   122: ldc '    ??? ???'
    //   124: iconst_3
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc 'zzdv'
    //   132: aastore
    //   133: dup
    //   134: iconst_1
    //   135: ldc 'zzev'
    //   137: aastore
    //   138: dup
    //   139: iconst_2
    //   140: ldc 'zzew'
    //   142: aastore
    //   143: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   146: areturn
    //   147: new com/google/android/gms/internal/ads/ie0$a
    //   150: dup
    //   151: aconst_null
    //   152: invokespecial <init> : (Lcom/google/android/gms/internal/ads/id0;)V
    //   155: areturn
    //   156: new com/google/android/gms/internal/ads/ie0
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
  
  public static final class a extends k42.b<ie0, a> implements w52 {
    private a() {
      super(ie0.K());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ie0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */