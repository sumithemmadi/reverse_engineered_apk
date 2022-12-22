package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.i.n;
import com.bumptech.glide.p.f;

class w implements e, e.a {
  private final f<?> b;
  
  private final e.a c;
  
  private int d;
  
  private b e;
  
  private Object f;
  
  private volatile n.a<?> g;
  
  private c h;
  
  w(f<?> paramf, e.a parama) {
    this.b = paramf;
    this.c = parama;
  }
  
  private void c(Object paramObject) {
    long l = f.b();
    try {
      com.bumptech.glide.load.a<DataType> a1 = this.b.p(paramObject);
      d d = new d();
      this(a1, (DataType)paramObject, this.b.k());
      c c1 = new c();
      this(this.g.a, this.b.o());
      this.h = c1;
      this.b.d().a(this.h, d);
      if (Log.isLoggable("SourceGenerator", 2)) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("Finished encoding source to cache, key: ");
        stringBuilder.append(this.h);
        stringBuilder.append(", data: ");
        stringBuilder.append(paramObject);
        stringBuilder.append(", encoder: ");
        stringBuilder.append(a1);
        stringBuilder.append(", duration: ");
        stringBuilder.append(f.a(l));
        Log.v("SourceGenerator", stringBuilder.toString());
      } 
      this.g.c.b();
      return;
    } finally {
      this.g.c.b();
    } 
  }
  
  private boolean d() {
    boolean bool;
    if (this.d < this.b.g().size()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void j(n.a<?> parama) {
    this.g.c.e(this.b.l(), new a(this, parama));
  }
  
  public void a(c paramc, Exception paramException, d<?> paramd, DataSource paramDataSource) {
    this.c.a(paramc, paramException, paramd, this.g.c.d());
  }
  
  public boolean b() {
    Object<n.a<?>> object = (Object<n.a<?>>)this.f;
    if (object != null) {
      this.f = null;
      c(object);
    } 
    object = (Object<n.a<?>>)this.e;
    if (object != null && object.b())
      return true; 
    this.e = null;
    this.g = null;
    boolean bool = false;
    while (!bool && d()) {
      object = (Object<n.a<?>>)this.b.g();
      int i = this.d;
      this.d = i + 1;
      this.g = object.get(i);
      if (this.g != null && (this.b.e().c(this.g.c.d()) || this.b.t(this.g.c.a()))) {
        j(this.g);
        bool = true;
      } 
    } 
    return bool;
  }
  
  public void cancel() {
    n.a<?> a1 = this.g;
    if (a1 != null)
      a1.c.cancel(); 
  }
  
  public void e() {
    throw new UnsupportedOperationException();
  }
  
  public void f(c paramc1, Object paramObject, d<?> paramd, DataSource paramDataSource, c paramc2) {
    this.c.f(paramc1, paramObject, paramd, this.g.c.d(), paramc1);
  }
  
  boolean g(n.a<?> parama) {
    boolean bool;
    n.a<?> a1 = this.g;
    if (a1 != null && a1 == parama) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  void h(n.a<?> parama, Object paramObject) {
    h h = this.b.e();
    if (paramObject != null && h.c(parama.c.d())) {
      this.f = paramObject;
      this.c.e();
    } else {
      e.a a1 = this.c;
      c c1 = parama.a;
      d<?> d = parama.c;
      a1.f(c1, paramObject, d, d.d(), this.h);
    } 
  }
  
  void i(n.a<?> parama, Exception paramException) {
    e.a a1 = this.c;
    c c1 = this.h;
    d<?> d = parama.c;
    a1.a(c1, paramException, d, d.d());
  }
  
  class a implements d.a<Object> {
    a(w this$0, n.a param1a) {}
    
    public void c(Exception param1Exception) {
      if (this.c.g(this.b))
        this.c.i(this.b, param1Exception); 
    }
    
    public void f(Object param1Object) {
      if (this.c.g(this.b))
        this.c.h(this.b, param1Object); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */