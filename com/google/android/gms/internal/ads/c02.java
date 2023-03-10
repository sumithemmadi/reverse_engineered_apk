package com.google.android.gms.internal.ads;

import java.util.List;

public final class c02 extends k42<c02, c02.a> implements w52 {
  private static volatile c62<c02> zzek;
  
  private static final c02 zzihs;
  
  private int zzihq;
  
  private u42<b> zzihr = k42.H();
  
  static {
    c02 c021 = new c02();
    zzihs = c021;
    k42.A(c02.class, c021);
  }
  
  public static c02 N(byte[] paramArrayOfbyte, y32 paramy32) {
    return k42.<c02>u(zzihs, paramArrayOfbyte, paramy32);
  }
  
  public final int J() {
    return this.zzihq;
  }
  
  public final List<b> K() {
    return this.zzihr;
  }
  
  public final int L() {
    return this.zzihr.size();
  }
  
  protected final Object x(int paramInt, Object<c02> paramObject1, Object<c02> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/d02.a : [I
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
    //   63: getstatic com/google/android/gms/internal/ads/c02.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/c02
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/c02.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/c02.zzihs : Lcom/google/android/gms/internal/ads/c02;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/c02.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/c02
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/c02
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/c02.zzihs : Lcom/google/android/gms/internal/ads/c02;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/c02.zzihs : Lcom/google/android/gms/internal/ads/c02;
    //   122: ldc '     '
    //   124: iconst_3
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc 'zzihq'
    //   132: aastore
    //   133: dup
    //   134: iconst_1
    //   135: ldc 'zzihr'
    //   137: aastore
    //   138: dup
    //   139: iconst_2
    //   140: ldc com/google/android/gms/internal/ads/c02$b
    //   142: aastore
    //   143: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   146: areturn
    //   147: new com/google/android/gms/internal/ads/c02$a
    //   150: dup
    //   151: aconst_null
    //   152: invokespecial <init> : (Lcom/google/android/gms/internal/ads/d02;)V
    //   155: areturn
    //   156: new com/google/android/gms/internal/ads/c02
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
  
  public static final class a extends k42.b<c02, a> implements w52 {
    private a() {
      super(c02.M());
    }
  }
  
  public static final class b extends k42<b, b.a> implements w52 {
    private static volatile c62<b> zzek;
    
    private static final b zzihw;
    
    private int zzihj;
    
    private zzegd zziht;
    
    private int zzihu;
    
    private int zzihv;
    
    static {
      b b1 = new b();
      zzihw = b1;
      k42.A(b.class, b1);
    }
    
    public final zzege J() {
      zzege zzege1 = zzege.zzfk(this.zzihu);
      zzege zzege2 = zzege1;
      if (zzege1 == null)
        zzege2 = zzege.f; 
      return zzege2;
    }
    
    public final zzegx K() {
      zzegx zzegx1 = zzegx.zzfr(this.zzihj);
      zzegx zzegx2 = zzegx1;
      if (zzegx1 == null)
        zzegx2 = zzegx.g; 
      return zzegx2;
    }
    
    public final boolean L() {
      return (this.zziht != null);
    }
    
    public final zzegd M() {
      zzegd zzegd1 = this.zziht;
      zzegd zzegd2 = zzegd1;
      if (zzegd1 == null)
        zzegd2 = zzegd.S(); 
      return zzegd2;
    }
    
    public final int N() {
      return this.zzihv;
    }
    
    protected final Object x(int param1Int, Object<b> param1Object1, Object<b> param1Object2) {
      // Byte code:
      //   0: getstatic com/google/android/gms/internal/ads/d02.a : [I
      //   3: iload_1
      //   4: iconst_1
      //   5: isub
      //   6: iaload
      //   7: tableswitch default -> 48, 1 -> 161, 2 -> 152, 3 -> 119, 4 -> 115, 5 -> 63, 6 -> 58, 7 -> 56
      //   48: new java/lang/UnsupportedOperationException
      //   51: dup
      //   52: invokespecial <init> : ()V
      //   55: athrow
      //   56: aconst_null
      //   57: areturn
      //   58: iconst_1
      //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   62: areturn
      //   63: getstatic com/google/android/gms/internal/ads/c02$b.zzek : Lcom/google/android/gms/internal/ads/c62;
      //   66: astore_3
      //   67: aload_3
      //   68: astore_2
      //   69: aload_3
      //   70: ifnonnull -> 113
      //   73: ldc com/google/android/gms/internal/ads/c02$b
      //   75: monitorenter
      //   76: getstatic com/google/android/gms/internal/ads/c02$b.zzek : Lcom/google/android/gms/internal/ads/c62;
      //   79: astore_3
      //   80: aload_3
      //   81: astore_2
      //   82: aload_3
      //   83: ifnonnull -> 101
      //   86: new com/google/android/gms/internal/ads/k42$a
      //   89: astore_2
      //   90: aload_2
      //   91: getstatic com/google/android/gms/internal/ads/c02$b.zzihw : Lcom/google/android/gms/internal/ads/c02$b;
      //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
      //   97: aload_2
      //   98: putstatic com/google/android/gms/internal/ads/c02$b.zzek : Lcom/google/android/gms/internal/ads/c62;
      //   101: ldc com/google/android/gms/internal/ads/c02$b
      //   103: monitorexit
      //   104: goto -> 113
      //   107: astore_2
      //   108: ldc com/google/android/gms/internal/ads/c02$b
      //   110: monitorexit
      //   111: aload_2
      //   112: athrow
      //   113: aload_2
      //   114: areturn
      //   115: getstatic com/google/android/gms/internal/ads/c02$b.zzihw : Lcom/google/android/gms/internal/ads/c02$b;
      //   118: areturn
      //   119: getstatic com/google/android/gms/internal/ads/c02$b.zzihw : Lcom/google/android/gms/internal/ads/c02$b;
      //   122: ldc '      \\t\\f\\f'
      //   124: iconst_4
      //   125: anewarray java/lang/Object
      //   128: dup
      //   129: iconst_0
      //   130: ldc 'zziht'
      //   132: aastore
      //   133: dup
      //   134: iconst_1
      //   135: ldc 'zzihu'
      //   137: aastore
      //   138: dup
      //   139: iconst_2
      //   140: ldc 'zzihv'
      //   142: aastore
      //   143: dup
      //   144: iconst_3
      //   145: ldc 'zzihj'
      //   147: aastore
      //   148: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      //   151: areturn
      //   152: new com/google/android/gms/internal/ads/c02$b$a
      //   155: dup
      //   156: aconst_null
      //   157: invokespecial <init> : (Lcom/google/android/gms/internal/ads/d02;)V
      //   160: areturn
      //   161: new com/google/android/gms/internal/ads/c02$b
      //   164: dup
      //   165: invokespecial <init> : ()V
      //   168: areturn
      // Exception table:
      //   from	to	target	type
      //   76	80	107	finally
      //   86	101	107	finally
      //   101	104	107	finally
      //   108	111	107	finally
    }
    
    public static final class a extends k42.b<b, a> implements w52 {
      private a() {
        super(c02.b.O());
      }
    }
  }
  
  public static final class a extends k42.b<b, b.a> implements w52 {
    private a() {
      super(c02.b.O());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/c02.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */