package com.bumptech.glide.request;

public class g implements RequestCoordinator, c {
  private final RequestCoordinator a;
  
  private final Object b;
  
  private volatile c c;
  
  private volatile c d;
  
  private RequestCoordinator.RequestState e;
  
  private RequestCoordinator.RequestState f;
  
  private boolean g;
  
  public g(Object paramObject, RequestCoordinator paramRequestCoordinator) {
    RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.d;
    this.e = requestState;
    this.f = requestState;
    this.b = paramObject;
    this.a = paramRequestCoordinator;
  }
  
  private boolean l() {
    RequestCoordinator requestCoordinator = this.a;
    return (requestCoordinator == null || requestCoordinator.k(this));
  }
  
  private boolean m() {
    RequestCoordinator requestCoordinator = this.a;
    return (requestCoordinator == null || requestCoordinator.e(this));
  }
  
  private boolean n() {
    RequestCoordinator requestCoordinator = this.a;
    return (requestCoordinator == null || requestCoordinator.g(this));
  }
  
  public void a(c paramc) {
    synchronized (this.b) {
      if (!paramc.equals(this.c)) {
        this.f = RequestCoordinator.RequestState.f;
        return;
      } 
      this.e = RequestCoordinator.RequestState.f;
      RequestCoordinator requestCoordinator = this.a;
      if (requestCoordinator != null)
        requestCoordinator.a(this); 
      return;
    } 
  }
  
  public boolean b() {
    synchronized (this.b) {
      if (this.d.b() || this.c.b())
        return true; 
      return false;
    } 
  }
  
  public RequestCoordinator c() {
    synchronized (this.b) {
      RequestCoordinator requestCoordinator = this.a;
      if (requestCoordinator != null) {
        requestCoordinator = requestCoordinator.c();
      } else {
        requestCoordinator = this;
      } 
      return requestCoordinator;
    } 
  }
  
  public void clear() {
    synchronized (this.b) {
      this.g = false;
      RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.d;
      this.e = requestState;
      this.f = requestState;
      this.d.clear();
      this.c.clear();
      return;
    } 
  }
  
  public boolean d(c paramc) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof com/bumptech/glide/request/g
    //   4: istore_2
    //   5: iconst_0
    //   6: istore_3
    //   7: iload_3
    //   8: istore #4
    //   10: iload_2
    //   11: ifeq -> 100
    //   14: aload_1
    //   15: checkcast com/bumptech/glide/request/g
    //   18: astore_1
    //   19: aload_0
    //   20: getfield c : Lcom/bumptech/glide/request/c;
    //   23: ifnonnull -> 39
    //   26: iload_3
    //   27: istore #4
    //   29: aload_1
    //   30: getfield c : Lcom/bumptech/glide/request/c;
    //   33: ifnonnull -> 100
    //   36: goto -> 58
    //   39: iload_3
    //   40: istore #4
    //   42: aload_0
    //   43: getfield c : Lcom/bumptech/glide/request/c;
    //   46: aload_1
    //   47: getfield c : Lcom/bumptech/glide/request/c;
    //   50: invokeinterface d : (Lcom/bumptech/glide/request/c;)Z
    //   55: ifeq -> 100
    //   58: aload_0
    //   59: getfield d : Lcom/bumptech/glide/request/c;
    //   62: ifnonnull -> 78
    //   65: iload_3
    //   66: istore #4
    //   68: aload_1
    //   69: getfield d : Lcom/bumptech/glide/request/c;
    //   72: ifnonnull -> 100
    //   75: goto -> 97
    //   78: iload_3
    //   79: istore #4
    //   81: aload_0
    //   82: getfield d : Lcom/bumptech/glide/request/c;
    //   85: aload_1
    //   86: getfield d : Lcom/bumptech/glide/request/c;
    //   89: invokeinterface d : (Lcom/bumptech/glide/request/c;)Z
    //   94: ifeq -> 100
    //   97: iconst_1
    //   98: istore #4
    //   100: iload #4
    //   102: ireturn
  }
  
  public boolean e(c paramc) {
    synchronized (this.b) {
      boolean bool;
      if (m() && paramc.equals(this.c) && !b()) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  public boolean f() {
    synchronized (this.b) {
      boolean bool;
      if (this.e == RequestCoordinator.RequestState.d) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  public boolean g(c paramc) {
    synchronized (this.b) {
      boolean bool;
      if (n() && (paramc.equals(this.c) || this.e != RequestCoordinator.RequestState.e)) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  public void h() {
    synchronized (this.b) {
      this.g = true;
      try {
        if (this.e != RequestCoordinator.RequestState.e) {
          RequestCoordinator.RequestState requestState1 = this.f;
          RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.b;
          if (requestState1 != requestState2) {
            this.f = requestState2;
            this.d.h();
          } 
        } 
        if (this.g) {
          RequestCoordinator.RequestState requestState2 = this.e;
          RequestCoordinator.RequestState requestState1 = RequestCoordinator.RequestState.b;
          if (requestState2 != requestState1) {
            this.e = requestState1;
            this.c.h();
          } 
        } 
        return;
      } finally {
        this.g = false;
      } 
    } 
  }
  
  public void i(c paramc) {
    synchronized (this.b) {
      if (paramc.equals(this.d)) {
        this.f = RequestCoordinator.RequestState.e;
        return;
      } 
      this.e = RequestCoordinator.RequestState.e;
      RequestCoordinator requestCoordinator = this.a;
      if (requestCoordinator != null)
        requestCoordinator.i(this); 
      if (!this.f.isComplete())
        this.d.clear(); 
      return;
    } 
  }
  
  public boolean isRunning() {
    synchronized (this.b) {
      boolean bool;
      if (this.e == RequestCoordinator.RequestState.b) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  public boolean j() {
    synchronized (this.b) {
      boolean bool;
      if (this.e == RequestCoordinator.RequestState.e) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  public boolean k(c paramc) {
    synchronized (this.b) {
      boolean bool;
      if (l() && paramc.equals(this.c) && this.e != RequestCoordinator.RequestState.c) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  public void o(c paramc1, c paramc2) {
    this.c = paramc1;
    this.d = paramc2;
  }
  
  public void pause() {
    synchronized (this.b) {
      if (!this.f.isComplete()) {
        this.f = RequestCoordinator.RequestState.c;
        this.d.pause();
      } 
      if (!this.e.isComplete()) {
        this.e = RequestCoordinator.RequestState.c;
        this.c.pause();
      } 
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/request/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */