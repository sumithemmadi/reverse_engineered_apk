package b.h.h;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class g {
  static ThreadPoolExecutor a(String paramString, int paramInt1, int paramInt2) {
    a a = new a(paramString, paramInt1);
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, paramInt2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<Runnable>(), a);
    threadPoolExecutor.allowCoreThreadTimeOut(true);
    return threadPoolExecutor;
  }
  
  static <T> void b(Executor paramExecutor, Callable<T> paramCallable, b.h.j.a<T> parama) {
    paramExecutor.execute(new b<T>(b.a(), paramCallable, parama));
  }
  
  static <T> T c(ExecutorService paramExecutorService, Callable<T> paramCallable, int paramInt) {
    Future<T> future = paramExecutorService.submit(paramCallable);
    long l = paramInt;
    try {
      return future.get(l, TimeUnit.MILLISECONDS);
    } catch (ExecutionException executionException) {
      throw new RuntimeException(executionException);
    } catch (InterruptedException interruptedException) {
      throw interruptedException;
    } catch (TimeoutException timeoutException) {
      throw new InterruptedException("timeout");
    } 
  }
  
  private static class a implements ThreadFactory {
    private String a;
    
    private int b;
    
    a(String param1String, int param1Int) {
      this.a = param1String;
      this.b = param1Int;
    }
    
    public Thread newThread(Runnable param1Runnable) {
      return new a(param1Runnable, this.a, this.b);
    }
    
    private static class a extends Thread {
      private final int b;
      
      a(Runnable param2Runnable, String param2String, int param2Int) {
        super(param2Runnable, param2String);
        this.b = param2Int;
      }
      
      public void run() {
        Process.setThreadPriority(this.b);
        super.run();
      }
    }
  }
  
  private static class a extends Thread {
    private final int b;
    
    a(Runnable param1Runnable, String param1String, int param1Int) {
      super(param1Runnable, param1String);
      this.b = param1Int;
    }
    
    public void run() {
      Process.setThreadPriority(this.b);
      super.run();
    }
  }
  
  private static class b<T> implements Runnable {
    private Callable<T> b;
    
    private b.h.j.a<T> c;
    
    private Handler d;
    
    b(Handler param1Handler, Callable<T> param1Callable, b.h.j.a<T> param1a) {
      this.b = param1Callable;
      this.c = param1a;
      this.d = param1Handler;
    }
    
    public void run() {
      try {
        T t = this.b.call();
      } catch (Exception exception) {
        exception = null;
      } 
      b.h.j.a<T> a1 = this.c;
      this.d.post(new a(this, a1, exception));
    }
    
    class a implements Runnable {
      a(g.b this$0, b.h.j.a param2a, Object param2Object) {}
      
      public void run() {
        this.b.a(this.c);
      }
    }
  }
  
  class a implements Runnable {
    a(g this$0, b.h.j.a param1a, Object param1Object) {}
    
    public void run() {
      this.b.a(this.c);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/h/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */