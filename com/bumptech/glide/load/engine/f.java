package com.bumptech.glide.load.engine;

import com.bumptech.glide.Priority;
import com.bumptech.glide.e;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.x.b;
import com.bumptech.glide.load.engine.y.a;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.i.n;
import com.bumptech.glide.load.j.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class f<Transcode> {
  private final List<n.a<?>> a = new ArrayList<n.a<?>>();
  
  private final List<c> b = new ArrayList<c>();
  
  private e c;
  
  private Object d;
  
  private int e;
  
  private int f;
  
  private Class<?> g;
  
  private DecodeJob.e h;
  
  private e i;
  
  private Map<Class<?>, h<?>> j;
  
  private Class<Transcode> k;
  
  private boolean l;
  
  private boolean m;
  
  private c n;
  
  private Priority o;
  
  private h p;
  
  private boolean q;
  
  private boolean r;
  
  void a() {
    this.c = null;
    this.d = null;
    this.n = null;
    this.g = null;
    this.k = null;
    this.i = null;
    this.o = null;
    this.j = null;
    this.p = null;
    this.a.clear();
    this.l = false;
    this.b.clear();
    this.m = false;
  }
  
  b b() {
    return this.c.b();
  }
  
  List<c> c() {
    if (!this.m) {
      this.m = true;
      this.b.clear();
      List<n.a<?>> list = g();
      int i = list.size();
      for (byte b = 0; b < i; b++) {
        n.a a = list.get(b);
        if (!this.b.contains(a.a))
          this.b.add(a.a); 
        for (byte b1 = 0; b1 < a.b.size(); b1++) {
          if (!this.b.contains(a.b.get(b1)))
            this.b.add(a.b.get(b1)); 
        } 
      } 
    } 
    return this.b;
  }
  
  a d() {
    return this.h.a();
  }
  
  h e() {
    return this.p;
  }
  
  int f() {
    return this.f;
  }
  
  List<n.a<?>> g() {
    if (!this.l) {
      this.l = true;
      this.a.clear();
      List<n> list = this.c.i().i(this.d);
      byte b = 0;
      int i = list.size();
      while (b < i) {
        n.a<?> a = ((n)list.get(b)).b(this.d, this.e, this.f, this.i);
        if (a != null)
          this.a.add(a); 
        b++;
      } 
    } 
    return this.a;
  }
  
  <Data> q<Data, ?, Transcode> h(Class<Data> paramClass) {
    return this.c.i().h(paramClass, this.g, this.k);
  }
  
  Class<?> i() {
    return this.d.getClass();
  }
  
  List<n<File, ?>> j(File paramFile) {
    return this.c.i().i(paramFile);
  }
  
  e k() {
    return this.i;
  }
  
  Priority l() {
    return this.o;
  }
  
  List<Class<?>> m() {
    return this.c.i().j(this.d.getClass(), this.g, this.k);
  }
  
  <Z> g<Z> n(s<Z> params) {
    return this.c.i().k(params);
  }
  
  c o() {
    return this.n;
  }
  
  <X> a<X> p(X paramX) {
    return this.c.i().m(paramX);
  }
  
  Class<?> q() {
    return this.k;
  }
  
  <Z> h<Z> r(Class<Z> paramClass) {
    StringBuilder stringBuilder;
    h h1 = this.j.get(paramClass);
    h h2 = h1;
    if (h1 == null) {
      Iterator<Map.Entry> iterator = this.j.entrySet().iterator();
      while (true) {
        h2 = h1;
        if (iterator.hasNext()) {
          Map.Entry entry = iterator.next();
          if (((Class)entry.getKey()).isAssignableFrom(paramClass)) {
            h2 = (h)entry.getValue();
            break;
          } 
          continue;
        } 
        break;
      } 
    } 
    if (h2 == null) {
      if (!this.j.isEmpty() || !this.q)
        return (h<Z>)c.c(); 
      stringBuilder = new StringBuilder();
      stringBuilder.append("Missing transformation for ");
      stringBuilder.append(paramClass);
      stringBuilder.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    return (h<Z>)stringBuilder;
  }
  
  int s() {
    return this.e;
  }
  
  boolean t(Class<?> paramClass) {
    boolean bool;
    if (h(paramClass) != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  <R> void u(e parame, Object paramObject, c paramc, int paramInt1, int paramInt2, h paramh, Class<?> paramClass, Class<R> paramClass1, Priority paramPriority, e parame1, Map<Class<?>, h<?>> paramMap, boolean paramBoolean1, boolean paramBoolean2, DecodeJob.e parame2) {
    this.c = parame;
    this.d = paramObject;
    this.n = paramc;
    this.e = paramInt1;
    this.f = paramInt2;
    this.p = paramh;
    this.g = paramClass;
    this.h = parame2;
    this.k = paramClass1;
    this.o = paramPriority;
    this.i = parame1;
    this.j = paramMap;
    this.q = paramBoolean1;
    this.r = paramBoolean2;
  }
  
  boolean v(s<?> params) {
    return this.c.i().n(params);
  }
  
  boolean w() {
    return this.r;
  }
  
  boolean x(c paramc) {
    List<n.a<?>> list = g();
    int i = list.size();
    for (byte b = 0; b < i; b++) {
      if (((n.a)list.get(b)).a.equals(paramc))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */