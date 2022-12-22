package androidx.work.impl.utils;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class f implements Executor {
  private final ArrayDeque<a> b;
  
  private final Executor c;
  
  private final Object d;
  
  private volatile Runnable e;
  
  public f(Executor paramExecutor) {
    this.c = paramExecutor;
    this.b = new ArrayDeque<a>();
    this.d = new Object();
  }
  
  void b() {
    synchronized (this.d) {
      Runnable runnable = this.b.poll();
      this.e = runnable;
      if (runnable != null)
        this.c.execute(this.e); 
      return;
    } 
  }
  
  public void execute(Runnable paramRunnable) {
    synchronized (this.d) {
      ArrayDeque<a> arrayDeque = this.b;
      a a = new a();
      this(this, paramRunnable);
      arrayDeque.add(a);
      if (this.e == null)
        b(); 
      return;
    } 
  }
  
  static class a implements Runnable {
    final f b;
    
    final Runnable c;
    
    a(f param1f, Runnable param1Runnable) {
      this.b = param1f;
      this.c = param1Runnable;
    }
    
    public void run() {
      try {
        this.c.run();
        return;
      } finally {
        this.b.b();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/utils/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */