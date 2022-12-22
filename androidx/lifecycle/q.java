package androidx.lifecycle;

import android.os.Handler;

public class q {
  private final i a;
  
  private final Handler b;
  
  private a c;
  
  public q(h paramh) {
    this.a = new i(paramh);
    this.b = new Handler();
  }
  
  private void f(Lifecycle.Event paramEvent) {
    a a2 = this.c;
    if (a2 != null)
      a2.run(); 
    a a1 = new a(this.a, paramEvent);
    this.c = a1;
    this.b.postAtFrontOfQueue(a1);
  }
  
  public Lifecycle a() {
    return this.a;
  }
  
  public void b() {
    f(Lifecycle.Event.ON_START);
  }
  
  public void c() {
    f(Lifecycle.Event.ON_CREATE);
  }
  
  public void d() {
    f(Lifecycle.Event.ON_STOP);
    f(Lifecycle.Event.ON_DESTROY);
  }
  
  public void e() {
    f(Lifecycle.Event.ON_START);
  }
  
  static class a implements Runnable {
    private final i b;
    
    final Lifecycle.Event c;
    
    private boolean d = false;
    
    a(i param1i, Lifecycle.Event param1Event) {
      this.b = param1i;
      this.c = param1Event;
    }
    
    public void run() {
      if (!this.d) {
        this.b.h(this.c);
        this.d = true;
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/lifecycle/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */