package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.i.n;
import java.io.File;
import java.util.List;

class b implements e, d.a<Object> {
  private final List<c> b;
  
  private final f<?> c;
  
  private final e.a d;
  
  private int e = -1;
  
  private c f;
  
  private List<n<File, ?>> g;
  
  private int h;
  
  private volatile n.a<?> i;
  
  private File j;
  
  b(f<?> paramf, e.a parama) {
    this(paramf.c(), paramf, parama);
  }
  
  b(List<c> paramList, f<?> paramf, e.a parama) {
    this.b = paramList;
    this.c = paramf;
    this.d = parama;
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
    while (true) {
      List<n<File, ?>> list = this.g;
      boolean bool = false;
      if (list == null || !a()) {
        int i = this.e + 1;
        this.e = i;
        if (i >= this.b.size())
          return false; 
        c c1 = this.b.get(this.e);
        c c2 = new c(c1, this.c.o());
        File file = this.c.d().b(c2);
        this.j = file;
        if (file != null) {
          this.f = c1;
          this.g = this.c.j(file);
          this.h = 0;
        } 
        continue;
      } 
      this.i = null;
      while (!bool && a()) {
        list = this.g;
        int i = this.h;
        this.h = i + 1;
        this.i = ((n)list.get(i)).b(this.j, this.c.s(), this.c.f(), this.c.k());
        if (this.i != null && this.c.t(this.i.c.a())) {
          this.i.c.e(this.c.l(), this);
          bool = true;
        } 
      } 
      return bool;
    } 
  }
  
  public void c(Exception paramException) {
    this.d.a(this.f, paramException, this.i.c, DataSource.d);
  }
  
  public void cancel() {
    n.a<?> a1 = this.i;
    if (a1 != null)
      a1.c.cancel(); 
  }
  
  public void f(Object paramObject) {
    this.d.f(this.f, paramObject, this.i.c, DataSource.d, this.f);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */