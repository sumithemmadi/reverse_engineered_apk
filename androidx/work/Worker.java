package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.impl.utils.futures.a;

public abstract class Worker extends ListenableWorker {
  a<ListenableWorker.a> f;
  
  @SuppressLint({"BanKeepAnnotation"})
  @Keep
  public Worker(Context paramContext, WorkerParameters paramWorkerParameters) {
    super(paramContext, paramWorkerParameters);
  }
  
  public abstract ListenableWorker.a doWork();
  
  public final com.google.common.util.concurrent.a<ListenableWorker.a> startWork() {
    this.f = a.t();
    getBackgroundExecutor().execute(new a(this));
    return (com.google.common.util.concurrent.a<ListenableWorker.a>)this.f;
  }
  
  class a implements Runnable {
    a(Worker this$0) {}
    
    public void run() {
      try {
        ListenableWorker.a a1 = this.b.doWork();
        this.b.f.p(a1);
      } finally {
        Exception exception = null;
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/Worker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */