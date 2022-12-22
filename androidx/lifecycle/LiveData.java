package androidx.lifecycle;

import java.util.Map;

public abstract class LiveData<T> {
  static final Object a = new Object();
  
  final Object b = new Object();
  
  private b.b.a.b.b<n<? super T>, c> c = new b.b.a.b.b();
  
  int d = 0;
  
  private boolean e;
  
  private volatile Object f;
  
  volatile Object g;
  
  private int h;
  
  private boolean i;
  
  private boolean j;
  
  private final Runnable k;
  
  public LiveData() {
    Object object = a;
    this.g = object;
    this.k = new a(this);
    this.f = object;
    this.h = -1;
  }
  
  static void b(String paramString) {
    if (b.b.a.a.a.e().b())
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot invoke ");
    stringBuilder.append(paramString);
    stringBuilder.append(" on a background thread");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  private void d(c paramc) {
    if (!paramc.c)
      return; 
    if (!paramc.k()) {
      paramc.h(false);
      return;
    } 
    int i = paramc.d;
    int j = this.h;
    if (i >= j)
      return; 
    paramc.d = j;
    paramc.b.a((T)this.f);
  }
  
  void c(int paramInt) {
    int i = this.d;
    this.d = paramInt + i;
    if (this.e)
      return; 
    this.e = true;
    try {
      while (true) {
        int j = this.d;
        if (i != j) {
          if (i == 0 && j > 0) {
            paramInt = 1;
          } else {
            paramInt = 0;
          } 
          if (i > 0 && j == 0) {
            i = 1;
          } else {
            i = 0;
          } 
          if (paramInt != 0) {
            j();
          } else if (i != 0) {
            k();
          } 
          i = j;
          continue;
        } 
        return;
      } 
    } finally {
      this.e = false;
    } 
  }
  
  void e(c paramc) {
    if (this.i) {
      this.j = true;
      return;
    } 
    this.i = true;
    while (true) {
      c c1;
      this.j = false;
      if (paramc != null) {
        d(paramc);
        c1 = null;
      } else {
        b.b.a.b.b.d<Map.Entry> d = this.c.i();
        while (true) {
          c1 = paramc;
          if (d.hasNext()) {
            d((c)((Map.Entry)d.next()).getValue());
            if (this.j) {
              c1 = paramc;
              break;
            } 
            continue;
          } 
          break;
        } 
      } 
      paramc = c1;
      if (!this.j) {
        this.i = false;
        return;
      } 
    } 
  }
  
  public T f() {
    Object object = this.f;
    return (T)((object != a) ? object : null);
  }
  
  public boolean g() {
    boolean bool;
    if (this.d > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void h(h paramh, n<? super T> paramn) {
    b("observe");
    if (paramh.a().b() == Lifecycle.State.b)
      return; 
    LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(this, paramh, paramn);
    c c = (c)this.c.l(paramn, lifecycleBoundObserver);
    if (c == null || c.j(paramh)) {
      if (c != null)
        return; 
      paramh.a().a(lifecycleBoundObserver);
      return;
    } 
    throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
  }
  
  public void i(n<? super T> paramn) {
    b("observeForever");
    b b1 = new b(this, paramn);
    c c = (c)this.c.l(paramn, b1);
    if (!(c instanceof LifecycleBoundObserver)) {
      if (c != null)
        return; 
      b1.h(true);
      return;
    } 
    throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
  }
  
  protected void j() {}
  
  protected void k() {}
  
  protected void l(T paramT) {
    synchronized (this.b) {
      boolean bool;
      if (this.g == a) {
        bool = true;
      } else {
        bool = false;
      } 
      this.g = paramT;
      if (!bool)
        return; 
      b.b.a.a.a.e().c(this.k);
      return;
    } 
  }
  
  public void m(n<? super T> paramn) {
    b("removeObserver");
    c c = (c)this.c.m(paramn);
    if (c == null)
      return; 
    c.i();
    c.h(false);
  }
  
  protected void n(T paramT) {
    b("setValue");
    this.h++;
    this.f = paramT;
    e(null);
  }
  
  class LifecycleBoundObserver extends c implements f {
    final h f;
    
    LifecycleBoundObserver(LiveData this$0, h param1h, n<? super T> param1n) {
      super(this$0, param1n);
      this.f = param1h;
    }
    
    public void c(h param1h, Lifecycle.Event param1Event) {
      Lifecycle.State state = this.f.a().b();
      if (state == Lifecycle.State.b) {
        this.g.m(this.b);
        return;
      } 
      param1Event = null;
      while (param1Event != state) {
        h(k());
        Lifecycle.State state2 = this.f.a().b();
        Lifecycle.State state1 = state;
        state = state2;
      } 
    }
    
    void i() {
      this.f.a().c(this);
    }
    
    boolean j(h param1h) {
      boolean bool;
      if (this.f == param1h) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    boolean k() {
      return this.f.a().b().isAtLeast(Lifecycle.State.e);
    }
  }
  
  class a implements Runnable {
    a(LiveData this$0) {}
    
    public void run() {
      synchronized (this.b.b) {
        Object object = this.b.g;
        this.b.g = LiveData.a;
        this.b.n(object);
        return;
      } 
    }
  }
  
  private class b extends c {
    b(LiveData this$0, n<? super T> param1n) {
      super(this$0, param1n);
    }
    
    boolean k() {
      return true;
    }
  }
  
  private abstract class c {
    final n<? super T> b;
    
    boolean c;
    
    int d = -1;
    
    c(LiveData this$0, n<? super T> param1n) {
      this.b = param1n;
    }
    
    void h(boolean param1Boolean) {
      byte b;
      if (param1Boolean == this.c)
        return; 
      this.c = param1Boolean;
      LiveData liveData = this.e;
      if (param1Boolean) {
        b = 1;
      } else {
        b = -1;
      } 
      liveData.c(b);
      if (this.c)
        this.e.e(this); 
    }
    
    void i() {}
    
    boolean j(h param1h) {
      return false;
    }
    
    abstract boolean k();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/lifecycle/LiveData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */