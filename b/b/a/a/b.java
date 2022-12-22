package b.b.a.a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class b extends c {
  private final Object a = new Object();
  
  private final ExecutorService b = Executors.newFixedThreadPool(4, new a(this));
  
  private volatile Handler c;
  
  private static Handler d(Looper paramLooper) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 28)
      return Handler.createAsync(paramLooper); 
    if (i >= 16)
      try {
        return Handler.class.getDeclaredConstructor(new Class[] { Looper.class, Handler.Callback.class, boolean.class }).newInstance(new Object[] { paramLooper, null, Boolean.TRUE });
      } catch (IllegalAccessException|InstantiationException|NoSuchMethodException illegalAccessException) {
      
      } catch (InvocationTargetException invocationTargetException) {
        return new Handler(paramLooper);
      }  
    return new Handler(paramLooper);
  }
  
  public void a(Runnable paramRunnable) {
    this.b.execute(paramRunnable);
  }
  
  public boolean b() {
    boolean bool;
    if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void c(Runnable paramRunnable) {
    if (this.c == null)
      synchronized (this.a) {
        if (this.c == null)
          this.c = d(Looper.getMainLooper()); 
      }  
    this.c.post(paramRunnable);
  }
  
  class a implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(0);
    
    a(b this$0) {}
    
    public Thread newThread(Runnable param1Runnable) {
      param1Runnable = new Thread(param1Runnable);
      param1Runnable.setName(String.format("arch_disk_io_%d", new Object[] { Integer.valueOf(this.a.getAndIncrement()) }));
      return (Thread)param1Runnable;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/b/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */