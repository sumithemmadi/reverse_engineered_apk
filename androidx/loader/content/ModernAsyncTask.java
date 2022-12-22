package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

abstract class ModernAsyncTask<Params, Progress, Result> {
  private static final ThreadFactory b;
  
  private static final BlockingQueue<Runnable> c;
  
  public static final Executor d;
  
  private static f e;
  
  private static volatile Executor f;
  
  private final g<Params, Result> g;
  
  private final FutureTask<Result> h;
  
  private volatile Status i = Status.b;
  
  final AtomicBoolean j = new AtomicBoolean();
  
  final AtomicBoolean k = new AtomicBoolean();
  
  static {
    a a = new a();
    b = a;
    LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue(10);
    c = linkedBlockingQueue;
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, a);
    d = threadPoolExecutor;
    f = threadPoolExecutor;
  }
  
  ModernAsyncTask() {
    b b = new b(this);
    this.g = b;
    this.h = new c(this, b);
  }
  
  private static Handler e() {
    // Byte code:
    //   0: ldc androidx/loader/content/ModernAsyncTask
    //   2: monitorenter
    //   3: getstatic androidx/loader/content/ModernAsyncTask.e : Landroidx/loader/content/ModernAsyncTask$f;
    //   6: ifnonnull -> 21
    //   9: new androidx/loader/content/ModernAsyncTask$f
    //   12: astore_0
    //   13: aload_0
    //   14: invokespecial <init> : ()V
    //   17: aload_0
    //   18: putstatic androidx/loader/content/ModernAsyncTask.e : Landroidx/loader/content/ModernAsyncTask$f;
    //   21: getstatic androidx/loader/content/ModernAsyncTask.e : Landroidx/loader/content/ModernAsyncTask$f;
    //   24: astore_0
    //   25: ldc androidx/loader/content/ModernAsyncTask
    //   27: monitorexit
    //   28: aload_0
    //   29: areturn
    //   30: astore_0
    //   31: ldc androidx/loader/content/ModernAsyncTask
    //   33: monitorexit
    //   34: aload_0
    //   35: athrow
    // Exception table:
    //   from	to	target	type
    //   3	21	30	finally
    //   21	28	30	finally
    //   31	34	30	finally
  }
  
  public final boolean a(boolean paramBoolean) {
    this.j.set(true);
    return this.h.cancel(paramBoolean);
  }
  
  protected abstract Result b(Params... paramVarArgs);
  
  public final ModernAsyncTask<Params, Progress, Result> c(Executor paramExecutor, Params... paramVarArgs) {
    if (this.i != Status.b) {
      int i = d.a[this.i.ordinal()];
      if (i != 1) {
        if (i != 2)
          throw new IllegalStateException("We should never reach this state"); 
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
      } 
      throw new IllegalStateException("Cannot execute task: the task is already running.");
    } 
    this.i = Status.c;
    j();
    this.g.a = paramVarArgs;
    paramExecutor.execute(this.h);
    return this;
  }
  
  void d(Result paramResult) {
    if (f()) {
      h(paramResult);
    } else {
      i(paramResult);
    } 
    this.i = Status.d;
  }
  
  public final boolean f() {
    return this.j.get();
  }
  
  protected void g() {}
  
  protected void h(Result paramResult) {
    g();
  }
  
  protected void i(Result paramResult) {}
  
  protected void j() {}
  
  protected void k(Progress... paramVarArgs) {}
  
  Result l(Result paramResult) {
    e().obtainMessage(1, new e(this, new Object[] { paramResult })).sendToTarget();
    return paramResult;
  }
  
  void m(Result paramResult) {
    if (!this.k.get())
      l(paramResult); 
  }
  
  public enum Status {
    b, c, d;
    
    static {
      Status status1 = new Status("PENDING", 0);
      b = status1;
      Status status2 = new Status("RUNNING", 1);
      c = status2;
      Status status3 = new Status("FINISHED", 2);
      d = status3;
      e = new Status[] { status1, status2, status3 };
    }
  }
  
  static final class a implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);
    
    public Thread newThread(Runnable param1Runnable) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ModernAsyncTask #");
      stringBuilder.append(this.a.getAndIncrement());
      return new Thread(param1Runnable, stringBuilder.toString());
    }
  }
  
  class b extends g<Params, Result> {
    b(ModernAsyncTask this$0) {}
    
    public Result call() {
      this.b.k.set(true);
      Object object1 = null;
      Object object2 = object1;
      try {
        Process.setThreadPriority(10);
        object2 = object1;
        object1 = this.b.b((Object[])this.a);
        object2 = object1;
        Binder.flushPendingCommands();
        return (Result)object1;
      } finally {
        object1 = null;
      } 
    }
  }
  
  class c extends FutureTask<Result> {
    c(ModernAsyncTask this$0, Callable<Result> param1Callable) {
      super(param1Callable);
    }
    
    protected void done() {
      try {
        V v = get();
        this.b.m(v);
      } catch (InterruptedException interruptedException) {
      
      } catch (ExecutionException executionException) {
        throw new RuntimeException("An error occurred while executing doInBackground()", executionException.getCause());
      } catch (CancellationException cancellationException) {
      
      } finally {
        Exception exception = null;
      } 
    }
  }
  
  private static class e<Data> {
    final ModernAsyncTask a;
    
    final Data[] b;
    
    e(ModernAsyncTask param1ModernAsyncTask, Data... param1VarArgs) {
      this.a = param1ModernAsyncTask;
      this.b = param1VarArgs;
    }
  }
  
  private static class f extends Handler {
    f() {
      super(Looper.getMainLooper());
    }
    
    public void handleMessage(Message param1Message) {
      ModernAsyncTask.e e = (ModernAsyncTask.e)param1Message.obj;
      int i = param1Message.what;
      if (i != 1) {
        if (i == 2)
          e.a.k((Object[])e.b); 
      } else {
        e.a.d(e.b[0]);
      } 
    }
  }
  
  private static abstract class g<Params, Result> implements Callable<Result> {
    Params[] a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/loader/content/ModernAsyncTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */