package com.bumptech.glide.request;

public final class b implements RequestCoordinator, c {
  private final Object a;
  
  private final RequestCoordinator b;
  
  private volatile c c;
  
  private volatile c d;
  
  private RequestCoordinator.RequestState e;
  
  private RequestCoordinator.RequestState f;
  
  public b(Object paramObject, RequestCoordinator paramRequestCoordinator) {
    RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.d;
    this.e = requestState;
    this.f = requestState;
    this.a = paramObject;
    this.b = paramRequestCoordinator;
  }
  
  private boolean l(c paramc) {
    return (paramc.equals(this.c) || (this.e == RequestCoordinator.RequestState.f && paramc.equals(this.d)));
  }
  
  private boolean m() {
    RequestCoordinator requestCoordinator = this.b;
    return (requestCoordinator == null || requestCoordinator.k(this));
  }
  
  private boolean n() {
    RequestCoordinator requestCoordinator = this.b;
    return (requestCoordinator == null || requestCoordinator.e(this));
  }
  
  private boolean o() {
    RequestCoordinator requestCoordinator = this.b;
    return (requestCoordinator == null || requestCoordinator.g(this));
  }
  
  public void a(c paramc) {
    synchronized (this.a) {
      if (!paramc.equals(this.d)) {
        this.e = RequestCoordinator.RequestState.f;
        RequestCoordinator.RequestState requestState1 = this.f;
        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.b;
        if (requestState1 != requestState2) {
          this.f = requestState2;
          this.d.h();
        } 
        return;
      } 
      this.f = RequestCoordinator.RequestState.f;
      RequestCoordinator requestCoordinator = this.b;
      if (requestCoordinator != null)
        requestCoordinator.a(this); 
      return;
    } 
  }
  
  public boolean b() {
    synchronized (this.a) {
      if (this.c.b() || this.d.b())
        return true; 
      return false;
    } 
  }
  
  public RequestCoordinator c() {
    synchronized (this.a) {
      RequestCoordinator requestCoordinator = this.b;
      if (requestCoordinator != null) {
        requestCoordinator = requestCoordinator.c();
      } else {
        requestCoordinator = this;
      } 
      return requestCoordinator;
    } 
  }
  
  public void clear() {
    synchronized (this.a) {
      RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.d;
      this.e = requestState;
      this.c.clear();
      if (this.f != requestState) {
        this.f = requestState;
        this.d.clear();
      } 
      return;
    } 
  }
  
  public boolean d(c paramc) {
    boolean bool = paramc instanceof b;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (bool) {
      paramc = paramc;
      bool2 = bool1;
      if (this.c.d(((b)paramc).c)) {
        bool2 = bool1;
        if (this.d.d(((b)paramc).d))
          bool2 = true; 
      } 
    } 
    return bool2;
  }
  
  public boolean e(c paramc) {
    synchronized (this.a) {
      boolean bool;
      if (n() && l(paramc)) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  public boolean f() {
    synchronized (this.a) {
      boolean bool;
      RequestCoordinator.RequestState requestState1 = this.e;
      RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.d;
      if (requestState1 == requestState2 && this.f == requestState2) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  public boolean g(c paramc) {
    synchronized (this.a) {
      boolean bool;
      if (o() && l(paramc)) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  public void h() {
    synchronized (this.a) {
      RequestCoordinator.RequestState requestState1 = this.e;
      RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.b;
      if (requestState1 != requestState2) {
        this.e = requestState2;
        this.c.h();
      } 
      return;
    } 
  }
  
  public void i(c paramc) {
    synchronized (this.a) {
      if (paramc.equals(this.c)) {
        this.e = RequestCoordinator.RequestState.e;
      } else if (paramc.equals(this.d)) {
        this.f = RequestCoordinator.RequestState.e;
      } 
      RequestCoordinator requestCoordinator = this.b;
      if (requestCoordinator != null)
        requestCoordinator.i(this); 
      return;
    } 
  }
  
  public boolean isRunning() {
    synchronized (this.a) {
      RequestCoordinator.RequestState requestState1 = this.e;
      RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.b;
      if (requestState1 == requestState2 || this.f == requestState2)
        return true; 
      return false;
    } 
  }
  
  public boolean j() {
    synchronized (this.a) {
      RequestCoordinator.RequestState requestState1 = this.e;
      RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.e;
      if (requestState1 == requestState2 || this.f == requestState2)
        return true; 
      return false;
    } 
  }
  
  public boolean k(c paramc) {
    synchronized (this.a) {
      boolean bool;
      if (m() && l(paramc)) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  public void p(c paramc1, c paramc2) {
    this.c = paramc1;
    this.d = paramc2;
  }
  
  public void pause() {
    synchronized (this.a) {
      RequestCoordinator.RequestState requestState1 = this.e;
      RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.b;
      if (requestState1 == requestState2) {
        this.e = RequestCoordinator.RequestState.c;
        this.c.pause();
      } 
      if (this.f == requestState2) {
        this.f = RequestCoordinator.RequestState.c;
        this.d.pause();
      } 
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/request/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */