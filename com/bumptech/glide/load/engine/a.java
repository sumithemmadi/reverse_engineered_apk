package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.p.j;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class a {
  private final boolean a;
  
  private final Executor b;
  
  final Map<com.bumptech.glide.load.c, d> c = new HashMap<com.bumptech.glide.load.c, d>();
  
  private final ReferenceQueue<n<?>> d = new ReferenceQueue<n<?>>();
  
  private n.a e;
  
  private volatile boolean f;
  
  private volatile c g;
  
  a(boolean paramBoolean) {
    this(paramBoolean, Executors.newSingleThreadExecutor(new a()));
  }
  
  a(boolean paramBoolean, Executor paramExecutor) {
    this.a = paramBoolean;
    this.b = paramExecutor;
    paramExecutor.execute(new b(this));
  }
  
  void a(com.bumptech.glide.load.c paramc, n<?> paramn) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new com/bumptech/glide/load/engine/a$d
    //   5: astore_3
    //   6: aload_3
    //   7: aload_1
    //   8: aload_2
    //   9: aload_0
    //   10: getfield d : Ljava/lang/ref/ReferenceQueue;
    //   13: aload_0
    //   14: getfield a : Z
    //   17: invokespecial <init> : (Lcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/engine/n;Ljava/lang/ref/ReferenceQueue;Z)V
    //   20: aload_0
    //   21: getfield c : Ljava/util/Map;
    //   24: aload_1
    //   25: aload_3
    //   26: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   31: checkcast com/bumptech/glide/load/engine/a$d
    //   34: astore_1
    //   35: aload_1
    //   36: ifnull -> 43
    //   39: aload_1
    //   40: invokevirtual a : ()V
    //   43: aload_0
    //   44: monitorexit
    //   45: return
    //   46: astore_1
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_1
    //   50: athrow
    // Exception table:
    //   from	to	target	type
    //   2	35	46	finally
    //   39	43	46	finally
  }
  
  void b() {
    while (!this.f) {
      try {
        c((d)this.d.remove());
        c c1 = this.g;
        if (c1 != null)
          c1.a(); 
      } catch (InterruptedException interruptedException) {
        Thread.currentThread().interrupt();
      } 
    } 
  }
  
  void c(d paramd) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/util/Map;
    //   6: aload_1
    //   7: getfield a : Lcom/bumptech/glide/load/c;
    //   10: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   15: pop
    //   16: aload_1
    //   17: getfield b : Z
    //   20: ifeq -> 71
    //   23: aload_1
    //   24: getfield c : Lcom/bumptech/glide/load/engine/s;
    //   27: astore_2
    //   28: aload_2
    //   29: ifnonnull -> 35
    //   32: goto -> 71
    //   35: aload_0
    //   36: monitorexit
    //   37: new com/bumptech/glide/load/engine/n
    //   40: dup
    //   41: aload_2
    //   42: iconst_1
    //   43: iconst_0
    //   44: aload_1
    //   45: getfield a : Lcom/bumptech/glide/load/c;
    //   48: aload_0
    //   49: getfield e : Lcom/bumptech/glide/load/engine/n$a;
    //   52: invokespecial <init> : (Lcom/bumptech/glide/load/engine/s;ZZLcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/engine/n$a;)V
    //   55: astore_2
    //   56: aload_0
    //   57: getfield e : Lcom/bumptech/glide/load/engine/n$a;
    //   60: aload_1
    //   61: getfield a : Lcom/bumptech/glide/load/c;
    //   64: aload_2
    //   65: invokeinterface d : (Lcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/engine/n;)V
    //   70: return
    //   71: aload_0
    //   72: monitorexit
    //   73: return
    //   74: astore_1
    //   75: aload_0
    //   76: monitorexit
    //   77: aload_1
    //   78: athrow
    // Exception table:
    //   from	to	target	type
    //   2	28	74	finally
    //   35	37	74	finally
    //   71	73	74	finally
    //   75	77	74	finally
  }
  
  void d(com.bumptech.glide.load.c paramc) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast com/bumptech/glide/load/engine/a$d
    //   15: astore_1
    //   16: aload_1
    //   17: ifnull -> 24
    //   20: aload_1
    //   21: invokevirtual a : ()V
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: astore_1
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_1
    //   31: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	27	finally
    //   20	24	27	finally
  }
  
  n<?> e(com.bumptech.glide.load.c paramc) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast com/bumptech/glide/load/engine/a$d
    //   15: astore_2
    //   16: aload_2
    //   17: ifnonnull -> 24
    //   20: aload_0
    //   21: monitorexit
    //   22: aconst_null
    //   23: areturn
    //   24: aload_2
    //   25: invokevirtual get : ()Ljava/lang/Object;
    //   28: checkcast com/bumptech/glide/load/engine/n
    //   31: astore_1
    //   32: aload_1
    //   33: ifnonnull -> 41
    //   36: aload_0
    //   37: aload_2
    //   38: invokevirtual c : (Lcom/bumptech/glide/load/engine/a$d;)V
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: areturn
    //   45: astore_1
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_1
    //   49: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	45	finally
    //   24	32	45	finally
    //   36	41	45	finally
  }
  
  void f(n.a parama) {
    // Byte code:
    //   0: aload_1
    //   1: monitorenter
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: aload_1
    //   6: putfield e : Lcom/bumptech/glide/load/engine/n$a;
    //   9: aload_0
    //   10: monitorexit
    //   11: aload_1
    //   12: monitorexit
    //   13: return
    //   14: astore_2
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_2
    //   18: athrow
    //   19: astore_2
    //   20: aload_1
    //   21: monitorexit
    //   22: aload_2
    //   23: athrow
    // Exception table:
    //   from	to	target	type
    //   2	4	19	finally
    //   4	11	14	finally
    //   11	13	19	finally
    //   15	17	14	finally
    //   17	19	19	finally
    //   20	22	19	finally
  }
  
  class a implements ThreadFactory {
    public Thread newThread(Runnable param1Runnable) {
      return new Thread(new a(this, param1Runnable), "glide-active-resources");
    }
    
    class a implements Runnable {
      a(a.a this$0, Runnable param2Runnable) {}
      
      public void run() {
        Process.setThreadPriority(10);
        this.b.run();
      }
    }
  }
  
  class a implements Runnable {
    a(a this$0, Runnable param1Runnable) {}
    
    public void run() {
      Process.setThreadPriority(10);
      this.b.run();
    }
  }
  
  class b implements Runnable {
    b(a this$0) {}
    
    public void run() {
      this.b.b();
    }
  }
  
  static interface c {
    void a();
  }
  
  static final class d extends WeakReference<n<?>> {
    final com.bumptech.glide.load.c a;
    
    final boolean b;
    
    s<?> c;
    
    d(com.bumptech.glide.load.c param1c, n<?> param1n, ReferenceQueue<? super n<?>> param1ReferenceQueue, boolean param1Boolean) {
      super(param1n, param1ReferenceQueue);
      this.a = (com.bumptech.glide.load.c)j.d(param1c);
      if (param1n.f() && param1Boolean) {
        s s1 = (s)j.d(param1n.e());
      } else {
        param1c = null;
      } 
      this.c = (s<?>)param1c;
      this.b = param1n.f();
    }
    
    void a() {
      this.c = null;
      clear();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */