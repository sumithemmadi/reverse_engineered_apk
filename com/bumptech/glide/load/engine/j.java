package com.bumptech.glide.load.engine;

import b.h.j.f;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.z.a;
import com.bumptech.glide.p.l.a;
import com.bumptech.glide.request.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

class j<R> implements DecodeJob.b<R>, a.f {
  private static final c b = new c();
  
  private boolean A;
  
  final e c = new e();
  
  private final com.bumptech.glide.p.l.c d = com.bumptech.glide.p.l.c.a();
  
  private final n.a e;
  
  private final f<j<?>> f;
  
  private final c g;
  
  private final k h;
  
  private final a i;
  
  private final a j;
  
  private final a k;
  
  private final a l;
  
  private final AtomicInteger m = new AtomicInteger();
  
  private com.bumptech.glide.load.c n;
  
  private boolean o;
  
  private boolean p;
  
  private boolean q;
  
  private boolean r;
  
  private s<?> s;
  
  DataSource t;
  
  private boolean u;
  
  GlideException v;
  
  private boolean w;
  
  n<?> x;
  
  private DecodeJob<R> y;
  
  private volatile boolean z;
  
  j(a parama1, a parama2, a parama3, a parama4, k paramk, n.a parama, f<j<?>> paramf) {
    this(parama1, parama2, parama3, parama4, paramk, parama, paramf, b);
  }
  
  j(a parama1, a parama2, a parama3, a parama4, k paramk, n.a parama, f<j<?>> paramf, c paramc) {
    this.i = parama1;
    this.j = parama2;
    this.k = parama3;
    this.l = parama4;
    this.h = paramk;
    this.e = parama;
    this.f = paramf;
    this.g = paramc;
  }
  
  private a j() {
    a a1;
    if (this.p) {
      a1 = this.k;
    } else if (this.q) {
      a1 = this.l;
    } else {
      a1 = this.j;
    } 
    return a1;
  }
  
  private boolean m() {
    return (this.w || this.u || this.z);
  }
  
  private void q() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield n : Lcom/bumptech/glide/load/c;
    //   6: ifnull -> 88
    //   9: aload_0
    //   10: getfield c : Lcom/bumptech/glide/load/engine/j$e;
    //   13: invokevirtual clear : ()V
    //   16: aload_0
    //   17: aconst_null
    //   18: putfield n : Lcom/bumptech/glide/load/c;
    //   21: aload_0
    //   22: aconst_null
    //   23: putfield x : Lcom/bumptech/glide/load/engine/n;
    //   26: aload_0
    //   27: aconst_null
    //   28: putfield s : Lcom/bumptech/glide/load/engine/s;
    //   31: aload_0
    //   32: iconst_0
    //   33: putfield w : Z
    //   36: aload_0
    //   37: iconst_0
    //   38: putfield z : Z
    //   41: aload_0
    //   42: iconst_0
    //   43: putfield u : Z
    //   46: aload_0
    //   47: iconst_0
    //   48: putfield A : Z
    //   51: aload_0
    //   52: getfield y : Lcom/bumptech/glide/load/engine/DecodeJob;
    //   55: iconst_0
    //   56: invokevirtual E : (Z)V
    //   59: aload_0
    //   60: aconst_null
    //   61: putfield y : Lcom/bumptech/glide/load/engine/DecodeJob;
    //   64: aload_0
    //   65: aconst_null
    //   66: putfield v : Lcom/bumptech/glide/load/engine/GlideException;
    //   69: aload_0
    //   70: aconst_null
    //   71: putfield t : Lcom/bumptech/glide/load/DataSource;
    //   74: aload_0
    //   75: getfield f : Lb/h/j/f;
    //   78: aload_0
    //   79: invokeinterface c : (Ljava/lang/Object;)Z
    //   84: pop
    //   85: aload_0
    //   86: monitorexit
    //   87: return
    //   88: new java/lang/IllegalArgumentException
    //   91: astore_1
    //   92: aload_1
    //   93: invokespecial <init> : ()V
    //   96: aload_1
    //   97: athrow
    //   98: astore_1
    //   99: aload_0
    //   100: monitorexit
    //   101: aload_1
    //   102: athrow
    // Exception table:
    //   from	to	target	type
    //   2	85	98	finally
    //   88	98	98	finally
  }
  
  public void a(GlideException paramGlideException) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield v : Lcom/bumptech/glide/load/engine/GlideException;
    //   7: aload_0
    //   8: monitorexit
    //   9: aload_0
    //   10: invokevirtual n : ()V
    //   13: return
    //   14: astore_1
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_1
    //   18: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	14	finally
    //   15	17	14	finally
  }
  
  void b(f paramf, Executor paramExecutor) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Lcom/bumptech/glide/p/l/c;
    //   6: invokevirtual c : ()V
    //   9: aload_0
    //   10: getfield c : Lcom/bumptech/glide/load/engine/j$e;
    //   13: aload_1
    //   14: aload_2
    //   15: invokevirtual a : (Lcom/bumptech/glide/request/f;Ljava/util/concurrent/Executor;)V
    //   18: aload_0
    //   19: getfield u : Z
    //   22: istore_3
    //   23: iconst_1
    //   24: istore #4
    //   26: iload_3
    //   27: ifeq -> 58
    //   30: aload_0
    //   31: iconst_1
    //   32: invokevirtual k : (I)V
    //   35: new com/bumptech/glide/load/engine/j$b
    //   38: astore #5
    //   40: aload #5
    //   42: aload_0
    //   43: aload_1
    //   44: invokespecial <init> : (Lcom/bumptech/glide/load/engine/j;Lcom/bumptech/glide/request/f;)V
    //   47: aload_2
    //   48: aload #5
    //   50: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   55: goto -> 113
    //   58: aload_0
    //   59: getfield w : Z
    //   62: ifeq -> 93
    //   65: aload_0
    //   66: iconst_1
    //   67: invokevirtual k : (I)V
    //   70: new com/bumptech/glide/load/engine/j$a
    //   73: astore #5
    //   75: aload #5
    //   77: aload_0
    //   78: aload_1
    //   79: invokespecial <init> : (Lcom/bumptech/glide/load/engine/j;Lcom/bumptech/glide/request/f;)V
    //   82: aload_2
    //   83: aload #5
    //   85: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   90: goto -> 113
    //   93: aload_0
    //   94: getfield z : Z
    //   97: ifne -> 103
    //   100: goto -> 106
    //   103: iconst_0
    //   104: istore #4
    //   106: iload #4
    //   108: ldc 'Cannot add callbacks to a cancelled EngineJob'
    //   110: invokestatic a : (ZLjava/lang/String;)V
    //   113: aload_0
    //   114: monitorexit
    //   115: return
    //   116: astore_1
    //   117: aload_0
    //   118: monitorexit
    //   119: aload_1
    //   120: athrow
    // Exception table:
    //   from	to	target	type
    //   2	23	116	finally
    //   30	55	116	finally
    //   58	90	116	finally
    //   93	100	116	finally
    //   106	113	116	finally
  }
  
  public void c(s<R> params, DataSource paramDataSource, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield s : Lcom/bumptech/glide/load/engine/s;
    //   7: aload_0
    //   8: aload_2
    //   9: putfield t : Lcom/bumptech/glide/load/DataSource;
    //   12: aload_0
    //   13: iload_3
    //   14: putfield A : Z
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_0
    //   20: invokevirtual o : ()V
    //   23: return
    //   24: astore_1
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_1
    //   28: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	24	finally
    //   25	27	24	finally
  }
  
  public void d(DecodeJob<?> paramDecodeJob) {
    j().execute(paramDecodeJob);
  }
  
  void e(f paramf) {
    try {
      return;
    } finally {
      paramf = null;
    } 
  }
  
  void f(f paramf) {
    try {
      return;
    } finally {
      paramf = null;
    } 
  }
  
  void g() {
    if (m())
      return; 
    this.z = true;
    this.y.k();
    this.h.c(this, this.n);
  }
  
  void h() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Lcom/bumptech/glide/p/l/c;
    //   6: invokevirtual c : ()V
    //   9: aload_0
    //   10: invokespecial m : ()Z
    //   13: ldc 'Not yet complete!'
    //   15: invokestatic a : (ZLjava/lang/String;)V
    //   18: aload_0
    //   19: getfield m : Ljava/util/concurrent/atomic/AtomicInteger;
    //   22: invokevirtual decrementAndGet : ()I
    //   25: istore_1
    //   26: iload_1
    //   27: iflt -> 35
    //   30: iconst_1
    //   31: istore_2
    //   32: goto -> 37
    //   35: iconst_0
    //   36: istore_2
    //   37: iload_2
    //   38: ldc 'Can't decrement below 0'
    //   40: invokestatic a : (ZLjava/lang/String;)V
    //   43: iload_1
    //   44: ifne -> 59
    //   47: aload_0
    //   48: getfield x : Lcom/bumptech/glide/load/engine/n;
    //   51: astore_3
    //   52: aload_0
    //   53: invokespecial q : ()V
    //   56: goto -> 61
    //   59: aconst_null
    //   60: astore_3
    //   61: aload_0
    //   62: monitorexit
    //   63: aload_3
    //   64: ifnull -> 71
    //   67: aload_3
    //   68: invokevirtual g : ()V
    //   71: return
    //   72: astore_3
    //   73: aload_0
    //   74: monitorexit
    //   75: aload_3
    //   76: athrow
    // Exception table:
    //   from	to	target	type
    //   2	26	72	finally
    //   37	43	72	finally
    //   47	56	72	finally
    //   61	63	72	finally
    //   73	75	72	finally
  }
  
  public com.bumptech.glide.p.l.c i() {
    return this.d;
  }
  
  void k(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial m : ()Z
    //   6: ldc 'Not yet complete!'
    //   8: invokestatic a : (ZLjava/lang/String;)V
    //   11: aload_0
    //   12: getfield m : Ljava/util/concurrent/atomic/AtomicInteger;
    //   15: iload_1
    //   16: invokevirtual getAndAdd : (I)I
    //   19: ifne -> 35
    //   22: aload_0
    //   23: getfield x : Lcom/bumptech/glide/load/engine/n;
    //   26: astore_2
    //   27: aload_2
    //   28: ifnull -> 35
    //   31: aload_2
    //   32: invokevirtual d : ()V
    //   35: aload_0
    //   36: monitorexit
    //   37: return
    //   38: astore_2
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_2
    //   42: athrow
    // Exception table:
    //   from	to	target	type
    //   2	27	38	finally
    //   31	35	38	finally
  }
  
  j<R> l(com.bumptech.glide.load.c paramc, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield n : Lcom/bumptech/glide/load/c;
    //   7: aload_0
    //   8: iload_2
    //   9: putfield o : Z
    //   12: aload_0
    //   13: iload_3
    //   14: putfield p : Z
    //   17: aload_0
    //   18: iload #4
    //   20: putfield q : Z
    //   23: aload_0
    //   24: iload #5
    //   26: putfield r : Z
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_0
    //   32: areturn
    //   33: astore_1
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: athrow
    // Exception table:
    //   from	to	target	type
    //   2	29	33	finally
  }
  
  void n() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Lcom/bumptech/glide/p/l/c;
    //   6: invokevirtual c : ()V
    //   9: aload_0
    //   10: getfield z : Z
    //   13: ifeq -> 23
    //   16: aload_0
    //   17: invokespecial q : ()V
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: aload_0
    //   24: getfield c : Lcom/bumptech/glide/load/engine/j$e;
    //   27: invokevirtual isEmpty : ()Z
    //   30: ifne -> 148
    //   33: aload_0
    //   34: getfield w : Z
    //   37: ifne -> 135
    //   40: aload_0
    //   41: iconst_1
    //   42: putfield w : Z
    //   45: aload_0
    //   46: getfield n : Lcom/bumptech/glide/load/c;
    //   49: astore_1
    //   50: aload_0
    //   51: getfield c : Lcom/bumptech/glide/load/engine/j$e;
    //   54: invokevirtual f : ()Lcom/bumptech/glide/load/engine/j$e;
    //   57: astore_2
    //   58: aload_0
    //   59: aload_2
    //   60: invokevirtual size : ()I
    //   63: iconst_1
    //   64: iadd
    //   65: invokevirtual k : (I)V
    //   68: aload_0
    //   69: monitorexit
    //   70: aload_0
    //   71: getfield h : Lcom/bumptech/glide/load/engine/k;
    //   74: aload_0
    //   75: aload_1
    //   76: aconst_null
    //   77: invokeinterface b : (Lcom/bumptech/glide/load/engine/j;Lcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/engine/n;)V
    //   82: aload_2
    //   83: invokevirtual iterator : ()Ljava/util/Iterator;
    //   86: astore_1
    //   87: aload_1
    //   88: invokeinterface hasNext : ()Z
    //   93: ifeq -> 130
    //   96: aload_1
    //   97: invokeinterface next : ()Ljava/lang/Object;
    //   102: checkcast com/bumptech/glide/load/engine/j$d
    //   105: astore_2
    //   106: aload_2
    //   107: getfield b : Ljava/util/concurrent/Executor;
    //   110: new com/bumptech/glide/load/engine/j$a
    //   113: dup
    //   114: aload_0
    //   115: aload_2
    //   116: getfield a : Lcom/bumptech/glide/request/f;
    //   119: invokespecial <init> : (Lcom/bumptech/glide/load/engine/j;Lcom/bumptech/glide/request/f;)V
    //   122: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   127: goto -> 87
    //   130: aload_0
    //   131: invokevirtual h : ()V
    //   134: return
    //   135: new java/lang/IllegalStateException
    //   138: astore_2
    //   139: aload_2
    //   140: ldc_w 'Already failed once'
    //   143: invokespecial <init> : (Ljava/lang/String;)V
    //   146: aload_2
    //   147: athrow
    //   148: new java/lang/IllegalStateException
    //   151: astore_2
    //   152: aload_2
    //   153: ldc_w 'Received an exception without any callbacks to notify'
    //   156: invokespecial <init> : (Ljava/lang/String;)V
    //   159: aload_2
    //   160: athrow
    //   161: astore_2
    //   162: aload_0
    //   163: monitorexit
    //   164: goto -> 169
    //   167: aload_2
    //   168: athrow
    //   169: goto -> 167
    // Exception table:
    //   from	to	target	type
    //   2	22	161	finally
    //   23	70	161	finally
    //   135	148	161	finally
    //   148	161	161	finally
    //   162	164	161	finally
  }
  
  void o() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Lcom/bumptech/glide/p/l/c;
    //   6: invokevirtual c : ()V
    //   9: aload_0
    //   10: getfield z : Z
    //   13: ifeq -> 32
    //   16: aload_0
    //   17: getfield s : Lcom/bumptech/glide/load/engine/s;
    //   20: invokeinterface a : ()V
    //   25: aload_0
    //   26: invokespecial q : ()V
    //   29: aload_0
    //   30: monitorexit
    //   31: return
    //   32: aload_0
    //   33: getfield c : Lcom/bumptech/glide/load/engine/j$e;
    //   36: invokevirtual isEmpty : ()Z
    //   39: ifne -> 189
    //   42: aload_0
    //   43: getfield u : Z
    //   46: ifne -> 176
    //   49: aload_0
    //   50: aload_0
    //   51: getfield g : Lcom/bumptech/glide/load/engine/j$c;
    //   54: aload_0
    //   55: getfield s : Lcom/bumptech/glide/load/engine/s;
    //   58: aload_0
    //   59: getfield o : Z
    //   62: aload_0
    //   63: getfield n : Lcom/bumptech/glide/load/c;
    //   66: aload_0
    //   67: getfield e : Lcom/bumptech/glide/load/engine/n$a;
    //   70: invokevirtual a : (Lcom/bumptech/glide/load/engine/s;ZLcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/engine/n$a;)Lcom/bumptech/glide/load/engine/n;
    //   73: putfield x : Lcom/bumptech/glide/load/engine/n;
    //   76: aload_0
    //   77: iconst_1
    //   78: putfield u : Z
    //   81: aload_0
    //   82: getfield c : Lcom/bumptech/glide/load/engine/j$e;
    //   85: invokevirtual f : ()Lcom/bumptech/glide/load/engine/j$e;
    //   88: astore_1
    //   89: aload_0
    //   90: aload_1
    //   91: invokevirtual size : ()I
    //   94: iconst_1
    //   95: iadd
    //   96: invokevirtual k : (I)V
    //   99: aload_0
    //   100: getfield n : Lcom/bumptech/glide/load/c;
    //   103: astore_2
    //   104: aload_0
    //   105: getfield x : Lcom/bumptech/glide/load/engine/n;
    //   108: astore_3
    //   109: aload_0
    //   110: monitorexit
    //   111: aload_0
    //   112: getfield h : Lcom/bumptech/glide/load/engine/k;
    //   115: aload_0
    //   116: aload_2
    //   117: aload_3
    //   118: invokeinterface b : (Lcom/bumptech/glide/load/engine/j;Lcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/engine/n;)V
    //   123: aload_1
    //   124: invokevirtual iterator : ()Ljava/util/Iterator;
    //   127: astore_1
    //   128: aload_1
    //   129: invokeinterface hasNext : ()Z
    //   134: ifeq -> 171
    //   137: aload_1
    //   138: invokeinterface next : ()Ljava/lang/Object;
    //   143: checkcast com/bumptech/glide/load/engine/j$d
    //   146: astore_2
    //   147: aload_2
    //   148: getfield b : Ljava/util/concurrent/Executor;
    //   151: new com/bumptech/glide/load/engine/j$b
    //   154: dup
    //   155: aload_0
    //   156: aload_2
    //   157: getfield a : Lcom/bumptech/glide/request/f;
    //   160: invokespecial <init> : (Lcom/bumptech/glide/load/engine/j;Lcom/bumptech/glide/request/f;)V
    //   163: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   168: goto -> 128
    //   171: aload_0
    //   172: invokevirtual h : ()V
    //   175: return
    //   176: new java/lang/IllegalStateException
    //   179: astore_1
    //   180: aload_1
    //   181: ldc_w 'Already have resource'
    //   184: invokespecial <init> : (Ljava/lang/String;)V
    //   187: aload_1
    //   188: athrow
    //   189: new java/lang/IllegalStateException
    //   192: astore_1
    //   193: aload_1
    //   194: ldc_w 'Received a resource without any callbacks to notify'
    //   197: invokespecial <init> : (Ljava/lang/String;)V
    //   200: aload_1
    //   201: athrow
    //   202: astore_1
    //   203: aload_0
    //   204: monitorexit
    //   205: goto -> 210
    //   208: aload_1
    //   209: athrow
    //   210: goto -> 208
    // Exception table:
    //   from	to	target	type
    //   2	31	202	finally
    //   32	111	202	finally
    //   176	189	202	finally
    //   189	202	202	finally
    //   203	205	202	finally
  }
  
  boolean p() {
    return this.r;
  }
  
  void r(f paramf) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Lcom/bumptech/glide/p/l/c;
    //   6: invokevirtual c : ()V
    //   9: aload_0
    //   10: getfield c : Lcom/bumptech/glide/load/engine/j$e;
    //   13: aload_1
    //   14: invokevirtual j : (Lcom/bumptech/glide/request/f;)V
    //   17: aload_0
    //   18: getfield c : Lcom/bumptech/glide/load/engine/j$e;
    //   21: invokevirtual isEmpty : ()Z
    //   24: ifeq -> 73
    //   27: aload_0
    //   28: invokevirtual g : ()V
    //   31: aload_0
    //   32: getfield u : Z
    //   35: ifne -> 53
    //   38: aload_0
    //   39: getfield w : Z
    //   42: ifeq -> 48
    //   45: goto -> 53
    //   48: iconst_0
    //   49: istore_2
    //   50: goto -> 55
    //   53: iconst_1
    //   54: istore_2
    //   55: iload_2
    //   56: ifeq -> 73
    //   59: aload_0
    //   60: getfield m : Ljava/util/concurrent/atomic/AtomicInteger;
    //   63: invokevirtual get : ()I
    //   66: ifne -> 73
    //   69: aload_0
    //   70: invokespecial q : ()V
    //   73: aload_0
    //   74: monitorexit
    //   75: return
    //   76: astore_1
    //   77: aload_0
    //   78: monitorexit
    //   79: aload_1
    //   80: athrow
    // Exception table:
    //   from	to	target	type
    //   2	45	76	finally
    //   59	73	76	finally
  }
  
  public void s(DecodeJob<R> paramDecodeJob) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield y : Lcom/bumptech/glide/load/engine/DecodeJob;
    //   7: aload_1
    //   8: invokevirtual K : ()Z
    //   11: ifeq -> 22
    //   14: aload_0
    //   15: getfield i : Lcom/bumptech/glide/load/engine/z/a;
    //   18: astore_2
    //   19: goto -> 27
    //   22: aload_0
    //   23: invokespecial j : ()Lcom/bumptech/glide/load/engine/z/a;
    //   26: astore_2
    //   27: aload_2
    //   28: aload_1
    //   29: invokevirtual execute : (Ljava/lang/Runnable;)V
    //   32: aload_0
    //   33: monitorexit
    //   34: return
    //   35: astore_1
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_1
    //   39: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	35	finally
    //   22	27	35	finally
    //   27	32	35	finally
  }
  
  private class a implements Runnable {
    private final f b;
    
    a(j this$0, f param1f) {
      this.b = param1f;
    }
    
    public void run() {
      synchronized (this.b.g()) {
        synchronized (this.c) {
          if (this.c.c.c(this.b))
            this.c.e(this.b); 
          this.c.h();
          return;
        } 
      } 
    }
  }
  
  private class b implements Runnable {
    private final f b;
    
    b(j this$0, f param1f) {
      this.b = param1f;
    }
    
    public void run() {
      synchronized (this.b.g()) {
        synchronized (this.c) {
          if (this.c.c.c(this.b)) {
            this.c.x.d();
            this.c.f(this.b);
            this.c.r(this.b);
          } 
          this.c.h();
          return;
        } 
      } 
    }
  }
  
  static class c {
    public <R> n<R> a(s<R> param1s, boolean param1Boolean, com.bumptech.glide.load.c param1c, n.a param1a) {
      return new n<R>(param1s, param1Boolean, true, param1c, param1a);
    }
  }
  
  static final class d {
    final f a;
    
    final Executor b;
    
    d(f param1f, Executor param1Executor) {
      this.a = param1f;
      this.b = param1Executor;
    }
    
    public boolean equals(Object param1Object) {
      if (param1Object instanceof d) {
        param1Object = param1Object;
        return this.a.equals(((d)param1Object).a);
      } 
      return false;
    }
    
    public int hashCode() {
      return this.a.hashCode();
    }
  }
  
  static final class e implements Iterable<d> {
    private final List<j.d> b;
    
    e() {
      this(new ArrayList<j.d>(2));
    }
    
    e(List<j.d> param1List) {
      this.b = param1List;
    }
    
    private static j.d i(f param1f) {
      return new j.d(param1f, com.bumptech.glide.p.e.a());
    }
    
    void a(f param1f, Executor param1Executor) {
      this.b.add(new j.d(param1f, param1Executor));
    }
    
    boolean c(f param1f) {
      return this.b.contains(i(param1f));
    }
    
    void clear() {
      this.b.clear();
    }
    
    e f() {
      return new e(new ArrayList<j.d>(this.b));
    }
    
    boolean isEmpty() {
      return this.b.isEmpty();
    }
    
    public Iterator<j.d> iterator() {
      return this.b.iterator();
    }
    
    void j(f param1f) {
      this.b.remove(i(param1f));
    }
    
    int size() {
      return this.b.size();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */