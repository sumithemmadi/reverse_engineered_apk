package com.bumptech.glide.p.l;

import android.util.Log;
import b.h.j.h;
import java.util.ArrayList;
import java.util.List;

public final class a {
  private static final g<Object> a = new a();
  
  private static <T extends f> b.h.j.f<T> a(b.h.j.f<T> paramf, d<T> paramd) {
    return b(paramf, paramd, c());
  }
  
  private static <T> b.h.j.f<T> b(b.h.j.f<T> paramf, d<T> paramd, g<T> paramg) {
    return new e<T>(paramf, paramd, paramg);
  }
  
  private static <T> g<T> c() {
    return (g)a;
  }
  
  public static <T extends f> b.h.j.f<T> d(int paramInt, d<T> paramd) {
    return a((b.h.j.f<T>)new h(paramInt), paramd);
  }
  
  public static <T> b.h.j.f<List<T>> e() {
    return f(20);
  }
  
  public static <T> b.h.j.f<List<T>> f(int paramInt) {
    return b((b.h.j.f<List<T>>)new h(paramInt), new b(), new c());
  }
  
  class a implements g<Object> {
    public void a(Object param1Object) {}
  }
  
  class b implements d<List<T>> {
    public List<T> b() {
      return new ArrayList<T>();
    }
  }
  
  class c implements g<List<T>> {
    public void b(List<T> param1List) {
      param1List.clear();
    }
  }
  
  public static interface d<T> {
    T a();
  }
  
  private static final class e<T> implements b.h.j.f<T> {
    private final a.d<T> a;
    
    private final a.g<T> b;
    
    private final b.h.j.f<T> c;
    
    e(b.h.j.f<T> param1f, a.d<T> param1d, a.g<T> param1g) {
      this.c = param1f;
      this.a = param1d;
      this.b = param1g;
    }
    
    public T b() {
      Object object1 = this.c.b();
      Object object2 = object1;
      if (object1 == null) {
        object1 = this.a.a();
        object2 = object1;
        if (Log.isLoggable("FactoryPools", 2)) {
          object2 = new StringBuilder();
          object2.append("Created new ");
          object2.append(object1.getClass());
          Log.v("FactoryPools", object2.toString());
          object2 = object1;
        } 
      } 
      if (object2 instanceof a.f)
        ((a.f)object2).i().b(false); 
      return (T)object2;
    }
    
    public boolean c(T param1T) {
      if (param1T instanceof a.f)
        ((a.f)param1T).i().b(true); 
      this.b.a(param1T);
      return this.c.c(param1T);
    }
  }
  
  public static interface f {
    c i();
  }
  
  public static interface g<T> {
    void a(T param1T);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/p/l/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */