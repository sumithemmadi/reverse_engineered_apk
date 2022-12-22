package com.bumptech.glide.load.i;

import b.h.j.f;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.p.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class q<Model, Data> implements n<Model, Data> {
  private final List<n<Model, Data>> a;
  
  private final f<List<Throwable>> b;
  
  q(List<n<Model, Data>> paramList, f<List<Throwable>> paramf) {
    this.a = paramList;
    this.b = paramf;
  }
  
  public boolean a(Model paramModel) {
    Iterator<n<Model, Data>> iterator = this.a.iterator();
    while (iterator.hasNext()) {
      if (((n)iterator.next()).a(paramModel))
        return true; 
    } 
    return false;
  }
  
  public n.a<Data> b(Model paramModel, int paramInt1, int paramInt2, e parame) {
    n.a<Data> a;
    int i = this.a.size();
    ArrayList<d> arrayList = new ArrayList(i);
    Model model = null;
    byte b = 0;
    c c;
    for (c = null; b < i; c = c1) {
      n n1 = this.a.get(b);
      c c1 = c;
      if (n1.a(paramModel)) {
        n.a a1 = n1.b(paramModel, paramInt1, paramInt2, parame);
        c1 = c;
        if (a1 != null) {
          c1 = a1.a;
          arrayList.add(a1.c);
        } 
      } 
      b++;
    } 
    paramModel = model;
    if (!arrayList.isEmpty()) {
      paramModel = model;
      if (c != null)
        a = new n.a(c, new a((List)arrayList, this.b)); 
    } 
    return a;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("MultiModelLoader{modelLoaders=");
    stringBuilder.append(Arrays.toString(this.a.toArray()));
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  static class a<Data> implements d<Data>, d.a<Data> {
    private final List<d<Data>> b;
    
    private final f<List<Throwable>> c;
    
    private int d;
    
    private Priority e;
    
    private d.a<? super Data> f;
    
    private List<Throwable> g;
    
    private boolean h;
    
    a(List<d<Data>> param1List, f<List<Throwable>> param1f) {
      this.c = param1f;
      j.c(param1List);
      this.b = param1List;
      this.d = 0;
    }
    
    private void g() {
      if (this.h)
        return; 
      if (this.d < this.b.size() - 1) {
        this.d++;
        e(this.e, this.f);
      } else {
        j.d(this.g);
        this.f.c((Exception)new GlideException("Fetch failed", new ArrayList<Throwable>(this.g)));
      } 
    }
    
    public Class<Data> a() {
      return ((d)this.b.get(0)).a();
    }
    
    public void b() {
      List<Throwable> list = this.g;
      if (list != null)
        this.c.c(list); 
      this.g = null;
      Iterator<d<Data>> iterator = this.b.iterator();
      while (iterator.hasNext())
        ((d)iterator.next()).b(); 
    }
    
    public void c(Exception param1Exception) {
      ((List<Exception>)j.d(this.g)).add(param1Exception);
      g();
    }
    
    public void cancel() {
      this.h = true;
      Iterator<d<Data>> iterator = this.b.iterator();
      while (iterator.hasNext())
        ((d)iterator.next()).cancel(); 
    }
    
    public DataSource d() {
      return ((d)this.b.get(0)).d();
    }
    
    public void e(Priority param1Priority, d.a<? super Data> param1a) {
      this.e = param1Priority;
      this.f = param1a;
      this.g = (List<Throwable>)this.c.b();
      ((d)this.b.get(this.d)).e(param1Priority, this);
      if (this.h)
        cancel(); 
    }
    
    public void f(Data param1Data) {
      if (param1Data != null) {
        this.f.f(param1Data);
      } else {
        g();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */