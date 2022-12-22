package androidx.work.impl.background.systemalarm;

import androidx.work.f;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

class g {
  private static final String a = f.f("WorkTimer");
  
  private final ThreadFactory b;
  
  private final ScheduledExecutorService c;
  
  final Map<String, c> d;
  
  final Map<String, b> e;
  
  final Object f;
  
  g() {
    a a = new a(this);
    this.b = a;
    this.d = new HashMap<String, c>();
    this.e = new HashMap<String, b>();
    this.f = new Object();
    this.c = Executors.newSingleThreadScheduledExecutor(a);
  }
  
  void a() {
    if (!this.c.isShutdown())
      this.c.shutdownNow(); 
  }
  
  void b(String paramString, long paramLong, b paramb) {
    synchronized (this.f) {
      f.c().a(a, String.format("Starting timer for %s", new Object[] { paramString }), new Throwable[0]);
      c(paramString);
      c c = new c();
      this(this, paramString);
      this.d.put(paramString, c);
      this.e.put(paramString, paramb);
      this.c.schedule(c, paramLong, TimeUnit.MILLISECONDS);
      return;
    } 
  }
  
  void c(String paramString) {
    synchronized (this.f) {
      if ((c)this.d.remove(paramString) != null) {
        f.c().a(a, String.format("Stopping timer for %s", new Object[] { paramString }), new Throwable[0]);
        this.e.remove(paramString);
      } 
      return;
    } 
  }
  
  class a implements ThreadFactory {
    private int a = 0;
    
    a(g this$0) {}
    
    public Thread newThread(Runnable param1Runnable) {
      param1Runnable = Executors.defaultThreadFactory().newThread(param1Runnable);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("WorkManager-WorkTimer-thread-");
      stringBuilder.append(this.a);
      param1Runnable.setName(stringBuilder.toString());
      this.a++;
      return (Thread)param1Runnable;
    }
  }
  
  static interface b {
    void a(String param1String);
  }
  
  static class c implements Runnable {
    private final g b;
    
    private final String c;
    
    c(g param1g, String param1String) {
      this.b = param1g;
      this.c = param1String;
    }
    
    public void run() {
      synchronized (this.b.f) {
        if ((c)this.b.d.remove(this.c) != null) {
          g.b b = this.b.e.remove(this.c);
          if (b != null)
            b.a(this.c); 
        } else {
          f.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[] { this.c }), new Throwable[0]);
        } 
        return;
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/background/systemalarm/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */