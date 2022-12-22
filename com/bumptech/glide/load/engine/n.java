package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.c;
import com.bumptech.glide.p.j;

class n<Z> implements s<Z> {
  private final boolean b;
  
  private final boolean c;
  
  private final s<Z> d;
  
  private final a e;
  
  private final c f;
  
  private int g;
  
  private boolean h;
  
  n(s<Z> params, boolean paramBoolean1, boolean paramBoolean2, c paramc, a parama) {
    this.d = (s<Z>)j.d(params);
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    this.f = paramc;
    this.e = (a)j.d(parama);
  }
  
  public void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : I
    //   6: ifgt -> 52
    //   9: aload_0
    //   10: getfield h : Z
    //   13: ifne -> 40
    //   16: aload_0
    //   17: iconst_1
    //   18: putfield h : Z
    //   21: aload_0
    //   22: getfield c : Z
    //   25: ifeq -> 37
    //   28: aload_0
    //   29: getfield d : Lcom/bumptech/glide/load/engine/s;
    //   32: invokeinterface a : ()V
    //   37: aload_0
    //   38: monitorexit
    //   39: return
    //   40: new java/lang/IllegalStateException
    //   43: astore_1
    //   44: aload_1
    //   45: ldc 'Cannot recycle a resource that has already been recycled'
    //   47: invokespecial <init> : (Ljava/lang/String;)V
    //   50: aload_1
    //   51: athrow
    //   52: new java/lang/IllegalStateException
    //   55: astore_1
    //   56: aload_1
    //   57: ldc 'Cannot recycle a resource while it is still acquired'
    //   59: invokespecial <init> : (Ljava/lang/String;)V
    //   62: aload_1
    //   63: athrow
    //   64: astore_1
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_1
    //   68: athrow
    // Exception table:
    //   from	to	target	type
    //   2	37	64	finally
    //   40	52	64	finally
    //   52	64	64	finally
  }
  
  public int b() {
    return this.d.b();
  }
  
  public Class<Z> c() {
    return this.d.c();
  }
  
  void d() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield h : Z
    //   6: ifne -> 22
    //   9: aload_0
    //   10: aload_0
    //   11: getfield g : I
    //   14: iconst_1
    //   15: iadd
    //   16: putfield g : I
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: new java/lang/IllegalStateException
    //   25: astore_1
    //   26: aload_1
    //   27: ldc 'Cannot acquire a recycled resource'
    //   29: invokespecial <init> : (Ljava/lang/String;)V
    //   32: aload_1
    //   33: athrow
    //   34: astore_1
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_1
    //   38: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	34	finally
    //   22	34	34	finally
  }
  
  s<Z> e() {
    return this.d;
  }
  
  boolean f() {
    return this.b;
  }
  
  void g() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : I
    //   6: istore_1
    //   7: iload_1
    //   8: ifle -> 51
    //   11: iconst_1
    //   12: istore_2
    //   13: iinc #1, -1
    //   16: aload_0
    //   17: iload_1
    //   18: putfield g : I
    //   21: iload_1
    //   22: ifne -> 28
    //   25: goto -> 30
    //   28: iconst_0
    //   29: istore_2
    //   30: aload_0
    //   31: monitorexit
    //   32: iload_2
    //   33: ifeq -> 50
    //   36: aload_0
    //   37: getfield e : Lcom/bumptech/glide/load/engine/n$a;
    //   40: aload_0
    //   41: getfield f : Lcom/bumptech/glide/load/c;
    //   44: aload_0
    //   45: invokeinterface d : (Lcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/engine/n;)V
    //   50: return
    //   51: new java/lang/IllegalStateException
    //   54: astore_3
    //   55: aload_3
    //   56: ldc 'Cannot release a recycled or not yet acquired resource'
    //   58: invokespecial <init> : (Ljava/lang/String;)V
    //   61: aload_3
    //   62: athrow
    //   63: astore_3
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_3
    //   67: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	63	finally
    //   16	21	63	finally
    //   30	32	63	finally
    //   51	63	63	finally
    //   64	66	63	finally
  }
  
  public Z get() {
    return this.d.get();
  }
  
  public String toString() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/lang/StringBuilder
    //   5: astore_1
    //   6: aload_1
    //   7: invokespecial <init> : ()V
    //   10: aload_1
    //   11: ldc 'EngineResource{isMemoryCacheable='
    //   13: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16: pop
    //   17: aload_1
    //   18: aload_0
    //   19: getfield b : Z
    //   22: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   25: pop
    //   26: aload_1
    //   27: ldc ', listener='
    //   29: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: pop
    //   33: aload_1
    //   34: aload_0
    //   35: getfield e : Lcom/bumptech/glide/load/engine/n$a;
    //   38: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   41: pop
    //   42: aload_1
    //   43: ldc ', key='
    //   45: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: pop
    //   49: aload_1
    //   50: aload_0
    //   51: getfield f : Lcom/bumptech/glide/load/c;
    //   54: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   57: pop
    //   58: aload_1
    //   59: ldc ', acquired='
    //   61: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: pop
    //   65: aload_1
    //   66: aload_0
    //   67: getfield g : I
    //   70: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   73: pop
    //   74: aload_1
    //   75: ldc ', isRecycled='
    //   77: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: pop
    //   81: aload_1
    //   82: aload_0
    //   83: getfield h : Z
    //   86: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   89: pop
    //   90: aload_1
    //   91: ldc ', resource='
    //   93: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: aload_1
    //   98: aload_0
    //   99: getfield d : Lcom/bumptech/glide/load/engine/s;
    //   102: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: aload_1
    //   107: bipush #125
    //   109: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   112: pop
    //   113: aload_1
    //   114: invokevirtual toString : ()Ljava/lang/String;
    //   117: astore_1
    //   118: aload_0
    //   119: monitorexit
    //   120: aload_1
    //   121: areturn
    //   122: astore_1
    //   123: aload_0
    //   124: monitorexit
    //   125: aload_1
    //   126: athrow
    // Exception table:
    //   from	to	target	type
    //   2	118	122	finally
  }
  
  static interface a {
    void d(c param1c, n<?> param1n);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */