package com.google.android.gms.internal.ads;

public final class f02 extends k42<f02, f02.b> implements w52 {
  private static volatile c62<f02> zzek;
  
  private static final f02 zzihy;
  
  private int zzihq;
  
  private u42<a> zzihx = k42.H();
  
  static {
    f02 f021 = new f02();
    zzihy = f021;
    k42.A(f02.class, f021);
  }
  
  private final void J(a parama) {
    parama.getClass();
    u42<a> u421 = this.zzihx;
    if (!u421.x())
      this.zzihx = k42.w(u421); 
    this.zzihx.add(parama);
  }
  
  public static b M() {
    return (b)zzihy.D();
  }
  
  private final void O(int paramInt) {
    this.zzihq = paramInt;
  }
  
  protected final Object x(int paramInt, Object<f02> paramObject1, Object<f02> paramObject2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/e02.a : [I
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
    //   63: getstatic com/google/android/gms/internal/ads/f02.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   66: astore_3
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: ifnonnull -> 113
    //   73: ldc com/google/android/gms/internal/ads/f02
    //   75: monitorenter
    //   76: getstatic com/google/android/gms/internal/ads/f02.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: ifnonnull -> 101
    //   86: new com/google/android/gms/internal/ads/k42$a
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic com/google/android/gms/internal/ads/f02.zzihy : Lcom/google/android/gms/internal/ads/f02;
    //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
    //   97: aload_2
    //   98: putstatic com/google/android/gms/internal/ads/f02.zzek : Lcom/google/android/gms/internal/ads/c62;
    //   101: ldc com/google/android/gms/internal/ads/f02
    //   103: monitorexit
    //   104: goto -> 113
    //   107: astore_2
    //   108: ldc com/google/android/gms/internal/ads/f02
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: aload_2
    //   114: areturn
    //   115: getstatic com/google/android/gms/internal/ads/f02.zzihy : Lcom/google/android/gms/internal/ads/f02;
    //   118: areturn
    //   119: getstatic com/google/android/gms/internal/ads/f02.zzihy : Lcom/google/android/gms/internal/ads/f02;
    //   122: ldc '     '
    //   124: iconst_3
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc 'zzihq'
    //   132: aastore
    //   133: dup
    //   134: iconst_1
    //   135: ldc 'zzihx'
    //   137: aastore
    //   138: dup
    //   139: iconst_2
    //   140: ldc com/google/android/gms/internal/ads/f02$a
    //   142: aastore
    //   143: invokestatic y : (Lcom/google/android/gms/internal/ads/u52;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   146: areturn
    //   147: new com/google/android/gms/internal/ads/f02$b
    //   150: dup
    //   151: aconst_null
    //   152: invokespecial <init> : (Lcom/google/android/gms/internal/ads/e02;)V
    //   155: areturn
    //   156: new com/google/android/gms/internal/ads/f02
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
  
  public static final class a extends k42<a, a.a> implements w52 {
    private static volatile c62<a> zzek;
    
    private static final a zzihz;
    
    private String zzigs = "";
    
    private int zzihj;
    
    private int zzihu;
    
    private int zzihv;
    
    static {
      a a1 = new a();
      zzihz = a1;
      k42.A(a.class, a1);
    }
    
    private final void J(zzege param1zzege) {
      this.zzihu = param1zzege.zzv();
    }
    
    private final void O(zzegx param1zzegx) {
      this.zzihj = param1zzegx.zzv();
    }
    
    public static a P() {
      return (a)zzihz.D();
    }
    
    private final void R(int param1Int) {
      this.zzihv = param1Int;
    }
    
    private final void S(String param1String) {
      param1String.getClass();
      this.zzigs = param1String;
    }
    
    protected final Object x(int param1Int, Object<a> param1Object1, Object<a> param1Object2) {
      // Byte code:
      //   0: getstatic com/google/android/gms/internal/ads/e02.a : [I
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
      //   63: getstatic com/google/android/gms/internal/ads/f02$a.zzek : Lcom/google/android/gms/internal/ads/c62;
      //   66: astore_3
      //   67: aload_3
      //   68: astore_2
      //   69: aload_3
      //   70: ifnonnull -> 113
      //   73: ldc com/google/android/gms/internal/ads/f02$a
      //   75: monitorenter
      //   76: getstatic com/google/android/gms/internal/ads/f02$a.zzek : Lcom/google/android/gms/internal/ads/c62;
      //   79: astore_3
      //   80: aload_3
      //   81: astore_2
      //   82: aload_3
      //   83: ifnonnull -> 101
      //   86: new com/google/android/gms/internal/ads/k42$a
      //   89: astore_2
      //   90: aload_2
      //   91: getstatic com/google/android/gms/internal/ads/f02$a.zzihz : Lcom/google/android/gms/internal/ads/f02$a;
      //   94: invokespecial <init> : (Lcom/google/android/gms/internal/ads/k42;)V
      //   97: aload_2
      //   98: putstatic com/google/android/gms/internal/ads/f02$a.zzek : Lcom/google/android/gms/internal/ads/c62;
      //   101: ldc com/google/android/gms/internal/ads/f02$a
      //   103: monitorexit
      //   104: goto -> 113
      //   107: astore_2
      //   108: ldc com/google/android/gms/internal/ads/f02$a
      //   110: monitorexit
      //   111: aload_2
      //   112: athrow
      //   113: aload_2
      //   114: areturn
      //   115: getstatic com/google/android/gms/internal/ads/f02$a.zzihz : Lcom/google/android/gms/internal/ads/f02$a;
      //   118: areturn
      //   119: getstatic com/google/android/gms/internal/ads/f02$a.zzihz : Lcom/google/android/gms/internal/ads/f02$a;
      //   122: ldc '      ??\\f\\f'
      //   124: iconst_4
      //   125: anewarray java/lang/Object
      //   128: dup
      //   129: iconst_0
      //   130: ldc 'zzigs'
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
      //   152: new com/google/android/gms/internal/ads/f02$a$a
      //   155: dup
      //   156: aconst_null
      //   157: invokespecial <init> : (Lcom/google/android/gms/internal/ads/e02;)V
      //   160: areturn
      //   161: new com/google/android/gms/internal/ads/f02$a
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
    
    public static final class a extends k42.b<a, a> implements w52 {
      private a() {
        super(f02.a.Q());
      }
      
      public final a A(String param2String) {
        if (this.d) {
          t();
          this.d = false;
        } 
        f02.a.N((f02.a)this.c, param2String);
        return this;
      }
      
      public final a x(zzege param2zzege) {
        if (this.d) {
          t();
          this.d = false;
        } 
        f02.a.L((f02.a)this.c, param2zzege);
        return this;
      }
      
      public final a y(zzegx param2zzegx) {
        if (this.d) {
          t();
          this.d = false;
        } 
        f02.a.M((f02.a)this.c, param2zzegx);
        return this;
      }
      
      public final a z(int param2Int) {
        if (this.d) {
          t();
          this.d = false;
        } 
        f02.a.K((f02.a)this.c, param2Int);
        return this;
      }
    }
  }
  
  public static final class a extends k42.b<a, a.a> implements w52 {
    private a() {
      super(f02.a.Q());
    }
    
    public final a A(String param1String) {
      if (this.d) {
        t();
        this.d = false;
      } 
      f02.a.N((f02.a)this.c, param1String);
      return this;
    }
    
    public final a x(zzege param1zzege) {
      if (this.d) {
        t();
        this.d = false;
      } 
      f02.a.L((f02.a)this.c, param1zzege);
      return this;
    }
    
    public final a y(zzegx param1zzegx) {
      if (this.d) {
        t();
        this.d = false;
      } 
      f02.a.M((f02.a)this.c, param1zzegx);
      return this;
    }
    
    public final a z(int param1Int) {
      if (this.d) {
        t();
        this.d = false;
      } 
      f02.a.K((f02.a)this.c, param1Int);
      return this;
    }
  }
  
  public static final class b extends k42.b<f02, b> implements w52 {
    private b() {
      super(f02.N());
    }
    
    public final b x(f02.a param1a) {
      if (this.d) {
        t();
        this.d = false;
      } 
      f02.L((f02)this.c, param1a);
      return this;
    }
    
    public final b y(int param1Int) {
      if (this.d) {
        t();
        this.d = false;
      } 
      f02.K((f02)this.c, param1Int);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/f02.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */