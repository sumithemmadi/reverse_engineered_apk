package b.k.a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import b.e.g;
import java.util.ArrayList;

class a {
  public static final ThreadLocal<a> a = new ThreadLocal<a>();
  
  private final g<b, Long> b = new g();
  
  final ArrayList<b> c = new ArrayList<b>();
  
  private final a d = new a(this);
  
  private c e;
  
  long f = 0L;
  
  private boolean g = false;
  
  private void b() {
    if (this.g) {
      for (int i = this.c.size() - 1; i >= 0; i--) {
        if (this.c.get(i) == null)
          this.c.remove(i); 
      } 
      this.g = false;
    } 
  }
  
  public static a d() {
    ThreadLocal<a> threadLocal = a;
    if (threadLocal.get() == null)
      threadLocal.set(new a()); 
    return threadLocal.get();
  }
  
  private boolean f(b paramb, long paramLong) {
    Long long_ = (Long)this.b.get(paramb);
    if (long_ == null)
      return true; 
    if (long_.longValue() < paramLong) {
      this.b.remove(paramb);
      return true;
    } 
    return false;
  }
  
  public void a(b paramb, long paramLong) {
    if (this.c.size() == 0)
      e().a(); 
    if (!this.c.contains(paramb))
      this.c.add(paramb); 
    if (paramLong > 0L)
      this.b.put(paramb, Long.valueOf(SystemClock.uptimeMillis() + paramLong)); 
  }
  
  void c(long paramLong) {
    long l = SystemClock.uptimeMillis();
    for (byte b = 0; b < this.c.size(); b++) {
      b b1 = this.c.get(b);
      if (b1 != null && f(b1, l))
        b1.a(paramLong); 
    } 
    b();
  }
  
  c e() {
    if (this.e == null)
      if (Build.VERSION.SDK_INT >= 16) {
        this.e = new e(this.d);
      } else {
        this.e = new d(this.d);
      }  
    return this.e;
  }
  
  public void g(b paramb) {
    this.b.remove(paramb);
    int i = this.c.indexOf(paramb);
    if (i >= 0) {
      this.c.set(i, null);
      this.g = true;
    } 
  }
  
  class a {
    a(a this$0) {}
    
    void a() {
      this.a.f = SystemClock.uptimeMillis();
      a a1 = this.a;
      a1.c(a1.f);
      if (this.a.c.size() > 0)
        this.a.e().a(); 
    }
  }
  
  static interface b {
    boolean a(long param1Long);
  }
  
  static abstract class c {
    final a.a a;
    
    c(a.a param1a) {
      this.a = param1a;
    }
    
    abstract void a();
  }
  
  private static class d extends c {
    private final Runnable b = new a(this);
    
    private final Handler c = new Handler(Looper.myLooper());
    
    long d = -1L;
    
    d(a.a param1a) {
      super(param1a);
    }
    
    void a() {
      long l = Math.max(10L - SystemClock.uptimeMillis() - this.d, 0L);
      this.c.postDelayed(this.b, l);
    }
    
    class a implements Runnable {
      a(a.d this$0) {}
      
      public void run() {
        this.b.d = SystemClock.uptimeMillis();
        this.b.a.a();
      }
    }
  }
  
  class a implements Runnable {
    a(a this$0) {}
    
    public void run() {
      this.b.d = SystemClock.uptimeMillis();
      this.b.a.a();
    }
  }
  
  private static class e extends c {
    private final Choreographer b = Choreographer.getInstance();
    
    private final Choreographer.FrameCallback c = new a(this);
    
    e(a.a param1a) {
      super(param1a);
    }
    
    void a() {
      this.b.postFrameCallback(this.c);
    }
    
    class a implements Choreographer.FrameCallback {
      a(a.e this$0) {}
      
      public void doFrame(long param2Long) {
        this.b.a.a();
      }
    }
  }
  
  class a implements Choreographer.FrameCallback {
    a(a this$0) {}
    
    public void doFrame(long param1Long) {
      this.b.a.a();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/k/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */