package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.i.n;
import java.io.File;
import java.util.List;

class t implements e, d.a<Object> {
  private final e.a b;
  
  private final f<?> c;
  
  private int d;
  
  private int e = -1;
  
  private c f;
  
  private List<n<File, ?>> g;
  
  private int h;
  
  private volatile n.a<?> i;
  
  private File j;
  
  private u k;
  
  t(f<?> paramf, e.a parama) {
    this.c = paramf;
    this.b = parama;
  }
  
  private boolean a() {
    boolean bool;
    if (this.h < this.g.size()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean b() {
    List<c> list = this.c.c();
    boolean bool = list.isEmpty();
    boolean bool1 = false;
    if (bool)
      return false; 
    List<Class<?>> list1 = this.c.m();
    if (list1.isEmpty()) {
      if (File.class.equals(this.c.q()))
        return false; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failed to find any load path from ");
      stringBuilder.append(this.c.i());
      stringBuilder.append(" to ");
      stringBuilder.append(this.c.q());
      throw new IllegalStateException(stringBuilder.toString());
    } 
    while (true) {
      if (this.g == null || !a()) {
        int i = this.e + 1;
        this.e = i;
        if (i >= list1.size()) {
          i = this.d + 1;
          this.d = i;
          if (i >= list.size())
            return false; 
          this.e = 0;
        } 
        c c1 = list.get(this.d);
        Class<?> clazz = list1.get(this.e);
        h<?> h = this.c.r(clazz);
        this.k = new u(this.c.b(), c1, this.c.o(), this.c.s(), this.c.f(), h, clazz, this.c.k());
        File file = this.c.d().b(this.k);
        this.j = file;
        if (file != null) {
          this.f = c1;
          this.g = this.c.j(file);
          this.h = 0;
        } 
        continue;
      } 
      this.i = null;
      while (!bool1 && a()) {
        List<n<File, ?>> list2 = this.g;
        int i = this.h;
        this.h = i + 1;
        this.i = ((n)list2.get(i)).b(this.j, this.c.s(), this.c.f(), this.c.k());
        if (this.i != null && this.c.t(this.i.c.a())) {
          this.i.c.e(this.c.l(), this);
          bool1 = true;
        } 
      } 
      return bool1;
    } 
  }
  
  public void c(Exception paramException) {
    this.b.a(this.k, paramException, this.i.c, DataSource.e);
  }
  
  public void cancel() {
    n.a<?> a1 = this.i;
    if (a1 != null)
      a1.c.cancel(); 
  }
  
  public void f(Object paramObject) {
    this.b.f(this.f, paramObject, this.i.c, DataSource.e, this.k);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */