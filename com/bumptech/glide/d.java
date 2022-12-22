package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.x.b;
import com.bumptech.glide.load.engine.x.e;
import com.bumptech.glide.load.engine.x.f;
import com.bumptech.glide.load.engine.x.j;
import com.bumptech.glide.load.engine.x.k;
import com.bumptech.glide.load.engine.y.a;
import com.bumptech.glide.load.engine.y.f;
import com.bumptech.glide.load.engine.y.g;
import com.bumptech.glide.load.engine.y.h;
import com.bumptech.glide.load.engine.y.i;
import com.bumptech.glide.load.engine.z.a;
import com.bumptech.glide.manager.d;
import com.bumptech.glide.manager.f;
import com.bumptech.glide.manager.o;
import com.bumptech.glide.request.d;
import com.bumptech.glide.request.e;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class d {
  private final Map<Class<?>, j<?, ?>> a = (Map<Class<?>, j<?, ?>>)new b.e.a();
  
  private final f.a b = new f.a();
  
  private i c;
  
  private e d;
  
  private b e;
  
  private h f;
  
  private a g;
  
  private a h;
  
  private a.a i;
  
  private i j;
  
  private d k;
  
  private int l = 4;
  
  private c.a m = new a(this);
  
  private o.b n;
  
  private a o;
  
  private boolean p;
  
  private List<d<Object>> q;
  
  c a(Context paramContext) {
    if (this.g == null)
      this.g = a.i(); 
    if (this.h == null)
      this.h = a.g(); 
    if (this.o == null)
      this.o = a.d(); 
    if (this.j == null)
      this.j = (new i.a(paramContext)).a(); 
    if (this.k == null)
      this.k = (d)new f(); 
    if (this.d == null) {
      int j = this.j.b();
      if (j > 0) {
        this.d = (e)new k(j);
      } else {
        this.d = (e)new f();
      } 
    } 
    if (this.e == null)
      this.e = (b)new j(this.j.a()); 
    if (this.f == null)
      this.f = (h)new g(this.j.d()); 
    if (this.i == null)
      this.i = (a.a)new f(paramContext); 
    if (this.c == null)
      this.c = new i(this.f, this.i, this.h, this.g, a.j(), this.o, this.p); 
    List<d<Object>> list = this.q;
    if (list == null) {
      this.q = Collections.emptyList();
    } else {
      this.q = Collections.unmodifiableList(list);
    } 
    f f = this.b.b();
    o o = new o(this.n, f);
    return new c(paramContext, this.c, this.f, this.d, this.e, o, this.k, this.l, this.m, this.a, this.q, f);
  }
  
  void b(o.b paramb) {
    this.n = paramb;
  }
  
  class a implements c.a {
    a(d this$0) {}
    
    public e a() {
      return new e();
    }
  }
  
  static final class b {}
  
  public static final class c {}
  
  public static final class d {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */