package com.bumptech.glide.load.engine;

import android.util.Log;
import b.h.j.f;
import com.bumptech.glide.Priority;
import com.bumptech.glide.e;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.y.a;
import com.bumptech.glide.load.engine.y.h;
import com.bumptech.glide.load.engine.z.a;
import com.bumptech.glide.load.h;
import com.bumptech.glide.p.f;
import com.bumptech.glide.p.j;
import com.bumptech.glide.request.f;
import java.util.Map;
import java.util.concurrent.Executor;

public class i implements k, h.a, n.a {
  private static final boolean a = Log.isLoggable("Engine", 2);
  
  private final p b;
  
  private final m c;
  
  private final h d;
  
  private final b e;
  
  private final v f;
  
  private final c g;
  
  private final a h;
  
  private final a i;
  
  i(h paramh, a.a parama, a parama1, a parama2, a parama3, a parama4, p paramp, m paramm, a parama5, b paramb, a parama6, v paramv, boolean paramBoolean) {
    p p1;
    b b1;
    a a1;
    this.d = paramh;
    c c1 = new c(parama);
    this.g = c1;
    if (parama5 == null)
      parama5 = new a(paramBoolean); 
    this.i = parama5;
    parama5.f(this);
    if (paramm == null)
      paramm = new m(); 
    this.c = paramm;
    if (paramp == null) {
      p1 = new p();
    } else {
      p1 = paramp;
    } 
    this.b = p1;
    if (paramb == null) {
      b1 = new b(parama1, parama2, parama3, parama4, this, this);
    } else {
      b1 = paramb;
    } 
    this.e = b1;
    if (parama6 == null) {
      a1 = new a(c1);
    } else {
      a1 = parama6;
    } 
    this.h = a1;
    if (paramv == null)
      paramv = new v(); 
    this.f = paramv;
    paramh.e(this);
  }
  
  public i(h paramh, a.a parama, a parama1, a parama2, a parama3, a parama4, boolean paramBoolean) {
    this(paramh, parama, parama1, parama2, parama3, parama4, null, null, null, null, null, null, paramBoolean);
  }
  
  private n<?> e(com.bumptech.glide.load.c paramc) {
    n<?> n;
    s<?> s = this.d.d(paramc);
    if (s == null) {
      paramc = null;
    } else if (s instanceof n) {
      n = (n)s;
    } else {
      n = new n(s, true, true, (com.bumptech.glide.load.c)n, this);
    } 
    return n;
  }
  
  private n<?> g(com.bumptech.glide.load.c paramc) {
    n<?> n = this.i.e(paramc);
    if (n != null)
      n.d(); 
    return n;
  }
  
  private n<?> h(com.bumptech.glide.load.c paramc) {
    n<?> n = e(paramc);
    if (n != null) {
      n.d();
      this.i.a(paramc, n);
    } 
    return n;
  }
  
  private n<?> i(l paraml, boolean paramBoolean, long paramLong) {
    if (!paramBoolean)
      return null; 
    n<?> n = g(paraml);
    if (n != null) {
      if (a)
        j("Loaded resource from active resources", paramLong, paraml); 
      return n;
    } 
    n = h(paraml);
    if (n != null) {
      if (a)
        j("Loaded resource from cache", paramLong, paraml); 
      return n;
    } 
    return null;
  }
  
  private static void j(String paramString, long paramLong, com.bumptech.glide.load.c paramc) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append(" in ");
    stringBuilder.append(f.a(paramLong));
    stringBuilder.append("ms, key: ");
    stringBuilder.append(paramc);
    Log.v("Engine", stringBuilder.toString());
  }
  
  private <R> d l(e parame, Object paramObject, com.bumptech.glide.load.c paramc, int paramInt1, int paramInt2, Class<?> paramClass, Class<R> paramClass1, Priority paramPriority, h paramh, Map<Class<?>, h<?>> paramMap, boolean paramBoolean1, boolean paramBoolean2, e parame1, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, f paramf, Executor paramExecutor, l paraml, long paramLong) {
    j<?> j = this.b.a(paraml, paramBoolean6);
    if (j != null) {
      j.b(paramf, paramExecutor);
      if (a)
        j("Added to existing load", paramLong, paraml); 
      return new d(this, paramf, j);
    } 
    j = this.e.a(paraml, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6);
    DecodeJob<R> decodeJob = this.h.a(parame, paramObject, paraml, paramc, paramInt1, paramInt2, paramClass, paramClass1, paramPriority, paramh, paramMap, paramBoolean1, paramBoolean2, paramBoolean6, parame1, (DecodeJob.b)j);
    this.b.c(paraml, j);
    j.b(paramf, paramExecutor);
    j.s(decodeJob);
    if (a)
      j("Started new load", paramLong, paraml); 
    return new d(this, paramf, j);
  }
  
  public void a(s<?> params) {
    this.f.a(params, true);
  }
  
  public void b(j<?> paramj, com.bumptech.glide.load.c paramc, n<?> paramn) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_3
    //   3: ifnull -> 22
    //   6: aload_3
    //   7: invokevirtual f : ()Z
    //   10: ifeq -> 22
    //   13: aload_0
    //   14: getfield i : Lcom/bumptech/glide/load/engine/a;
    //   17: aload_2
    //   18: aload_3
    //   19: invokevirtual a : (Lcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/engine/n;)V
    //   22: aload_0
    //   23: getfield b : Lcom/bumptech/glide/load/engine/p;
    //   26: aload_2
    //   27: aload_1
    //   28: invokevirtual d : (Lcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/engine/j;)V
    //   31: aload_0
    //   32: monitorexit
    //   33: return
    //   34: astore_1
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_1
    //   38: athrow
    // Exception table:
    //   from	to	target	type
    //   6	22	34	finally
    //   22	31	34	finally
  }
  
  public void c(j<?> paramj, com.bumptech.glide.load.c paramc) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Lcom/bumptech/glide/load/engine/p;
    //   6: aload_2
    //   7: aload_1
    //   8: invokevirtual d : (Lcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/engine/j;)V
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: astore_1
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_1
    //   18: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	14	finally
  }
  
  public void d(com.bumptech.glide.load.c paramc, n<?> paramn) {
    this.i.d(paramc);
    if (paramn.f()) {
      this.d.c(paramc, paramn);
    } else {
      this.f.a(paramn, false);
    } 
  }
  
  public <R> d f(e parame, Object paramObject, com.bumptech.glide.load.c paramc, int paramInt1, int paramInt2, Class<?> paramClass, Class<R> paramClass1, Priority paramPriority, h paramh, Map<Class<?>, h<?>> paramMap, boolean paramBoolean1, boolean paramBoolean2, e parame1, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, f paramf, Executor paramExecutor) {
    // Byte code:
    //   0: getstatic com/bumptech/glide/load/engine/i.a : Z
    //   3: ifeq -> 14
    //   6: invokestatic b : ()J
    //   9: lstore #20
    //   11: goto -> 17
    //   14: lconst_0
    //   15: lstore #20
    //   17: aload_0
    //   18: getfield c : Lcom/bumptech/glide/load/engine/m;
    //   21: aload_2
    //   22: aload_3
    //   23: iload #4
    //   25: iload #5
    //   27: aload #10
    //   29: aload #6
    //   31: aload #7
    //   33: aload #13
    //   35: invokevirtual a : (Ljava/lang/Object;Lcom/bumptech/glide/load/c;IILjava/util/Map;Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/e;)Lcom/bumptech/glide/load/engine/l;
    //   38: astore #22
    //   40: aload_0
    //   41: monitorenter
    //   42: aload_0
    //   43: aload #22
    //   45: iload #14
    //   47: lload #20
    //   49: invokespecial i : (Lcom/bumptech/glide/load/engine/l;ZJ)Lcom/bumptech/glide/load/engine/n;
    //   52: astore #23
    //   54: aload #23
    //   56: ifnonnull -> 107
    //   59: aload_0
    //   60: aload_1
    //   61: aload_2
    //   62: aload_3
    //   63: iload #4
    //   65: iload #5
    //   67: aload #6
    //   69: aload #7
    //   71: aload #8
    //   73: aload #9
    //   75: aload #10
    //   77: iload #11
    //   79: iload #12
    //   81: aload #13
    //   83: iload #14
    //   85: iload #15
    //   87: iload #16
    //   89: iload #17
    //   91: aload #18
    //   93: aload #19
    //   95: aload #22
    //   97: lload #20
    //   99: invokespecial l : (Lcom/bumptech/glide/e;Ljava/lang/Object;Lcom/bumptech/glide/load/c;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/Priority;Lcom/bumptech/glide/load/engine/h;Ljava/util/Map;ZZLcom/bumptech/glide/load/e;ZZZZLcom/bumptech/glide/request/f;Ljava/util/concurrent/Executor;Lcom/bumptech/glide/load/engine/l;J)Lcom/bumptech/glide/load/engine/i$d;
    //   102: astore_1
    //   103: aload_0
    //   104: monitorexit
    //   105: aload_1
    //   106: areturn
    //   107: aload_0
    //   108: monitorexit
    //   109: aload #18
    //   111: aload #23
    //   113: getstatic com/bumptech/glide/load/DataSource.f : Lcom/bumptech/glide/load/DataSource;
    //   116: iconst_0
    //   117: invokeinterface c : (Lcom/bumptech/glide/load/engine/s;Lcom/bumptech/glide/load/DataSource;Z)V
    //   122: aconst_null
    //   123: areturn
    //   124: astore_1
    //   125: aload_0
    //   126: monitorexit
    //   127: aload_1
    //   128: athrow
    // Exception table:
    //   from	to	target	type
    //   42	54	124	finally
    //   59	105	124	finally
    //   107	109	124	finally
    //   125	127	124	finally
  }
  
  public void k(s<?> params) {
    if (params instanceof n) {
      ((n)params).g();
      return;
    } 
    throw new IllegalArgumentException("Cannot release anything but an EngineResource");
  }
  
  static class a {
    final DecodeJob.e a;
    
    final f<DecodeJob<?>> b = com.bumptech.glide.p.l.a.d(150, new a(this));
    
    private int c;
    
    a(DecodeJob.e param1e) {
      this.a = param1e;
    }
    
    <R> DecodeJob<R> a(e param1e, Object param1Object, l param1l, com.bumptech.glide.load.c param1c, int param1Int1, int param1Int2, Class<?> param1Class, Class<R> param1Class1, Priority param1Priority, h param1h, Map<Class<?>, h<?>> param1Map, boolean param1Boolean1, boolean param1Boolean2, boolean param1Boolean3, e param1e1, DecodeJob.b<R> param1b) {
      DecodeJob<R> decodeJob = (DecodeJob)j.d(this.b.b());
      int i = this.c;
      this.c = i + 1;
      return decodeJob.v(param1e, param1Object, param1l, param1c, param1Int1, param1Int2, param1Class, param1Class1, param1Priority, param1h, param1Map, param1Boolean1, param1Boolean2, param1Boolean3, param1e1, param1b, i);
    }
    
    class a implements com.bumptech.glide.p.l.a.d<DecodeJob<?>> {
      a(i.a this$0) {}
      
      public DecodeJob<?> b() {
        i.a a1 = this.a;
        return new DecodeJob(a1.a, a1.b);
      }
    }
  }
  
  class a implements com.bumptech.glide.p.l.a.d<DecodeJob<?>> {
    a(i this$0) {}
    
    public DecodeJob<?> b() {
      i.a a1 = this.a;
      return new DecodeJob(a1.a, a1.b);
    }
  }
  
  static class b {
    final a a;
    
    final a b;
    
    final a c;
    
    final a d;
    
    final k e;
    
    final n.a f;
    
    final f<j<?>> g = com.bumptech.glide.p.l.a.d(150, new a(this));
    
    b(a param1a1, a param1a2, a param1a3, a param1a4, k param1k, n.a param1a) {
      this.a = param1a1;
      this.b = param1a2;
      this.c = param1a3;
      this.d = param1a4;
      this.e = param1k;
      this.f = param1a;
    }
    
    <R> j<R> a(com.bumptech.glide.load.c param1c, boolean param1Boolean1, boolean param1Boolean2, boolean param1Boolean3, boolean param1Boolean4) {
      return ((j<R>)j.d(this.g.b())).l(param1c, param1Boolean1, param1Boolean2, param1Boolean3, param1Boolean4);
    }
    
    class a implements com.bumptech.glide.p.l.a.d<j<?>> {
      a(i.b this$0) {}
      
      public j<?> b() {
        i.b b1 = this.a;
        return new j(b1.a, b1.b, b1.c, b1.d, b1.e, b1.f, b1.g);
      }
    }
  }
  
  class a implements com.bumptech.glide.p.l.a.d<j<?>> {
    a(i this$0) {}
    
    public j<?> b() {
      i.b b1 = this.a;
      return new j(b1.a, b1.b, b1.c, b1.d, b1.e, b1.f, b1.g);
    }
  }
  
  private static class c implements DecodeJob.e {
    private final a.a a;
    
    private volatile a b;
    
    c(a.a param1a) {
      this.a = param1a;
    }
    
    public a a() {
      // Byte code:
      //   0: aload_0
      //   1: getfield b : Lcom/bumptech/glide/load/engine/y/a;
      //   4: ifnonnull -> 59
      //   7: aload_0
      //   8: monitorenter
      //   9: aload_0
      //   10: getfield b : Lcom/bumptech/glide/load/engine/y/a;
      //   13: ifnonnull -> 29
      //   16: aload_0
      //   17: aload_0
      //   18: getfield a : Lcom/bumptech/glide/load/engine/y/a$a;
      //   21: invokeinterface a : ()Lcom/bumptech/glide/load/engine/y/a;
      //   26: putfield b : Lcom/bumptech/glide/load/engine/y/a;
      //   29: aload_0
      //   30: getfield b : Lcom/bumptech/glide/load/engine/y/a;
      //   33: ifnonnull -> 49
      //   36: new com/bumptech/glide/load/engine/y/b
      //   39: astore_1
      //   40: aload_1
      //   41: invokespecial <init> : ()V
      //   44: aload_0
      //   45: aload_1
      //   46: putfield b : Lcom/bumptech/glide/load/engine/y/a;
      //   49: aload_0
      //   50: monitorexit
      //   51: goto -> 59
      //   54: astore_1
      //   55: aload_0
      //   56: monitorexit
      //   57: aload_1
      //   58: athrow
      //   59: aload_0
      //   60: getfield b : Lcom/bumptech/glide/load/engine/y/a;
      //   63: areturn
      // Exception table:
      //   from	to	target	type
      //   9	29	54	finally
      //   29	49	54	finally
      //   49	51	54	finally
      //   55	57	54	finally
    }
  }
  
  public class d {
    private final j<?> a;
    
    private final f b;
    
    d(i this$0, f param1f, j<?> param1j) {
      this.b = param1f;
      this.a = param1j;
    }
    
    public void a() {
      synchronized (this.c) {
        this.a.r(this.b);
        return;
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */