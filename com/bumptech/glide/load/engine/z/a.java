package com.bumptech.glide.load.engine.z;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a implements ExecutorService {
  private static final long b = TimeUnit.SECONDS.toMillis(10L);
  
  private static volatile int c;
  
  private final ExecutorService d;
  
  a(ExecutorService paramExecutorService) {
    this.d = paramExecutorService;
  }
  
  public static int b() {
    if (c == 0)
      c = Math.min(4, b.a()); 
    return c;
  }
  
  public static a c() {
    boolean bool;
    if (b() >= 4) {
      bool = true;
    } else {
      bool = true;
    } 
    return (new a(true)).c(bool).b("animation");
  }
  
  public static a d() {
    return c().a();
  }
  
  public static a f() {
    return (new a(true)).c(1).b("disk-cache");
  }
  
  public static a g() {
    return f().a();
  }
  
  public static a h() {
    return (new a(false)).c(b()).b("source");
  }
  
  public static a i() {
    return h().a();
  }
  
  public static a j() {
    return new a(new ThreadPoolExecutor(0, 2147483647, b, TimeUnit.MILLISECONDS, new SynchronousQueue<Runnable>(), new b("source-unlimited", c.d, false)));
  }
  
  public boolean awaitTermination(long paramLong, TimeUnit paramTimeUnit) {
    return this.d.awaitTermination(paramLong, paramTimeUnit);
  }
  
  public void execute(Runnable paramRunnable) {
    this.d.execute(paramRunnable);
  }
  
  public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> paramCollection) {
    return this.d.invokeAll(paramCollection);
  }
  
  public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> paramCollection, long paramLong, TimeUnit paramTimeUnit) {
    return this.d.invokeAll(paramCollection, paramLong, paramTimeUnit);
  }
  
  public <T> T invokeAny(Collection<? extends Callable<T>> paramCollection) {
    return this.d.invokeAny(paramCollection);
  }
  
  public <T> T invokeAny(Collection<? extends Callable<T>> paramCollection, long paramLong, TimeUnit paramTimeUnit) {
    return this.d.invokeAny(paramCollection, paramLong, paramTimeUnit);
  }
  
  public boolean isShutdown() {
    return this.d.isShutdown();
  }
  
  public boolean isTerminated() {
    return this.d.isTerminated();
  }
  
  public void shutdown() {
    this.d.shutdown();
  }
  
  public List<Runnable> shutdownNow() {
    return this.d.shutdownNow();
  }
  
  public Future<?> submit(Runnable paramRunnable) {
    return this.d.submit(paramRunnable);
  }
  
  public <T> Future<T> submit(Runnable paramRunnable, T paramT) {
    return this.d.submit(paramRunnable, paramT);
  }
  
  public <T> Future<T> submit(Callable<T> paramCallable) {
    return this.d.submit(paramCallable);
  }
  
  public String toString() {
    return this.d.toString();
  }
  
  public static final class a {
    private final boolean a;
    
    private int b;
    
    private int c;
    
    private a.c d = a.c.d;
    
    private String e;
    
    private long f;
    
    a(boolean param1Boolean) {
      this.a = param1Boolean;
    }
    
    public a a() {
      if (!TextUtils.isEmpty(this.e)) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.b, this.c, this.f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue<Runnable>(), new a.b(this.e, this.d, this.a));
        if (this.f != 0L)
          threadPoolExecutor.allowCoreThreadTimeOut(true); 
        return new a(threadPoolExecutor);
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Name must be non-null and non-empty, but given: ");
      stringBuilder.append(this.e);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    public a b(String param1String) {
      this.e = param1String;
      return this;
    }
    
    public a c(int param1Int) {
      this.b = param1Int;
      this.c = param1Int;
      return this;
    }
  }
  
  private static final class b implements ThreadFactory {
    private final String a;
    
    final a.c b;
    
    final boolean c;
    
    private int d;
    
    b(String param1String, a.c param1c, boolean param1Boolean) {
      this.a = param1String;
      this.b = param1c;
      this.c = param1Boolean;
    }
    
    public Thread newThread(Runnable param1Runnable) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: new com/bumptech/glide/load/engine/z/a$b$a
      //   5: astore_2
      //   6: new java/lang/StringBuilder
      //   9: astore_3
      //   10: aload_3
      //   11: invokespecial <init> : ()V
      //   14: aload_3
      //   15: ldc 'glide-'
      //   17: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   20: pop
      //   21: aload_3
      //   22: aload_0
      //   23: getfield a : Ljava/lang/String;
      //   26: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   29: pop
      //   30: aload_3
      //   31: ldc '-thread-'
      //   33: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   36: pop
      //   37: aload_3
      //   38: aload_0
      //   39: getfield d : I
      //   42: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   45: pop
      //   46: aload_2
      //   47: aload_0
      //   48: aload_1
      //   49: aload_3
      //   50: invokevirtual toString : ()Ljava/lang/String;
      //   53: invokespecial <init> : (Lcom/bumptech/glide/load/engine/z/a$b;Ljava/lang/Runnable;Ljava/lang/String;)V
      //   56: aload_0
      //   57: aload_0
      //   58: getfield d : I
      //   61: iconst_1
      //   62: iadd
      //   63: putfield d : I
      //   66: aload_0
      //   67: monitorexit
      //   68: aload_2
      //   69: areturn
      //   70: astore_1
      //   71: aload_0
      //   72: monitorexit
      //   73: aload_1
      //   74: athrow
      // Exception table:
      //   from	to	target	type
      //   2	66	70	finally
    }
    
    class a extends Thread {
      a(a.b this$0, Runnable param2Runnable, String param2String) {
        super(param2Runnable, param2String);
      }
      
      public void run() {
        Process.setThreadPriority(9);
        if (this.b.c)
          StrictMode.setThreadPolicy((new StrictMode.ThreadPolicy.Builder()).detectNetwork().penaltyDeath().build()); 
        try {
          super.run();
        } finally {
          Exception exception = null;
        } 
      }
    }
  }
  
  class a extends Thread {
    a(a this$0, Runnable param1Runnable, String param1String) {
      super(param1Runnable, param1String);
    }
    
    public void run() {
      Process.setThreadPriority(9);
      if (this.b.c)
        StrictMode.setThreadPolicy((new StrictMode.ThreadPolicy.Builder()).detectNetwork().penaltyDeath().build()); 
      try {
        super.run();
      } finally {
        Exception exception = null;
      } 
    }
  }
  
  public static interface c {
    public static final c a = new a();
    
    public static final c b;
    
    public static final c c = new c();
    
    public static final c d;
    
    static {
      d = b;
    }
    
    void a(Throwable param1Throwable);
    
    static {
      b b = new b();
      b = b;
    }
    
    class a implements c {
      public void a(Throwable param2Throwable) {}
    }
    
    class b implements c {
      public void a(Throwable param2Throwable) {
        if (param2Throwable != null && Log.isLoggable("GlideExecutor", 6))
          Log.e("GlideExecutor", "Request threw uncaught throwable", param2Throwable); 
      }
    }
    
    class c implements c {
      public void a(Throwable param2Throwable) {
        if (param2Throwable == null)
          return; 
        throw new RuntimeException("Request threw uncaught throwable", param2Throwable);
      }
    }
  }
  
  class a implements c {
    public void a(Throwable param1Throwable) {}
  }
  
  class b implements c {
    public void a(Throwable param1Throwable) {
      if (param1Throwable != null && Log.isLoggable("GlideExecutor", 6))
        Log.e("GlideExecutor", "Request threw uncaught throwable", param1Throwable); 
    }
  }
  
  class c implements c {
    public void a(Throwable param1Throwable) {
      if (param1Throwable == null)
        return; 
      throw new RuntimeException("Request threw uncaught throwable", param1Throwable);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/z/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */