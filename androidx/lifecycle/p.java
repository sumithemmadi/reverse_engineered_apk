package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

public class p implements h {
  private static final p b = new p();
  
  private int c = 0;
  
  private int d = 0;
  
  private boolean e = true;
  
  private boolean f = true;
  
  private Handler g;
  
  private final i h = new i(this);
  
  private Runnable i = new a(this);
  
  ReportFragment.a j = new b(this);
  
  public static h k() {
    return b;
  }
  
  static void l(Context paramContext) {
    b.g(paramContext);
  }
  
  public Lifecycle a() {
    return this.h;
  }
  
  void b() {
    int j = this.d - 1;
    this.d = j;
    if (j == 0)
      this.g.postDelayed(this.i, 700L); 
  }
  
  void d() {
    int j = this.d + 1;
    this.d = j;
    if (j == 1)
      if (this.e) {
        this.h.h(Lifecycle.Event.ON_RESUME);
        this.e = false;
      } else {
        this.g.removeCallbacks(this.i);
      }  
  }
  
  void e() {
    int j = this.c + 1;
    this.c = j;
    if (j == 1 && this.f) {
      this.h.h(Lifecycle.Event.ON_START);
      this.f = false;
    } 
  }
  
  void f() {
    this.c--;
    i();
  }
  
  void g(Context paramContext) {
    this.g = new Handler();
    this.h.h(Lifecycle.Event.ON_CREATE);
    ((Application)paramContext.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
  }
  
  void h() {
    if (this.d == 0) {
      this.e = true;
      this.h.h(Lifecycle.Event.ON_PAUSE);
    } 
  }
  
  void i() {
    if (this.c == 0 && this.e) {
      this.h.h(Lifecycle.Event.ON_STOP);
      this.f = true;
    } 
  }
  
  class a implements Runnable {
    a(p this$0) {}
    
    public void run() {
      this.b.h();
      this.b.i();
    }
  }
  
  class b implements ReportFragment.a {
    b(p this$0) {}
    
    public void a() {}
    
    public void onResume() {
      this.a.d();
    }
    
    public void onStart() {
      this.a.e();
    }
  }
  
  class c extends b {
    public void onActivityCreated(Activity param1Activity, Bundle param1Bundle) {
      if (Build.VERSION.SDK_INT < 29)
        ReportFragment.f(param1Activity).h(p.this.j); 
    }
    
    public void onActivityPaused(Activity param1Activity) {
      p.this.b();
    }
    
    public void onActivityPreCreated(Activity param1Activity, Bundle param1Bundle) {
      param1Activity.registerActivityLifecycleCallbacks(new a());
    }
    
    public void onActivityStopped(Activity param1Activity) {
      p.this.f();
    }
    
    class a extends b {
      public void onActivityPostResumed(Activity param2Activity) {
        p.this.d();
      }
      
      public void onActivityPostStarted(Activity param2Activity) {
        p.this.e();
      }
    }
  }
  
  class a extends b {
    public void onActivityPostResumed(Activity param1Activity) {
      p.this.d();
    }
    
    public void onActivityPostStarted(Activity param1Activity) {
      p.this.e();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/lifecycle/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */