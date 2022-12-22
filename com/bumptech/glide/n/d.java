package com.bumptech.glide.n;

import b.e.a;
import com.bumptech.glide.p.i;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class d {
  private final AtomicReference<i> a = new AtomicReference<i>();
  
  private final a<i, List<Class<?>>> b = new a();
  
  public List<Class<?>> a(Class<?> paramClass1, Class<?> paramClass2, Class<?> paramClass3) {
    i i = this.a.getAndSet(null);
    if (i == null) {
      null = new i(paramClass1, paramClass2, paramClass3);
    } else {
      i.a((Class)null, paramClass2, paramClass3);
      null = i;
    } 
    synchronized (this.b) {
      List<Class<?>> list = (List)this.b.get(null);
      this.a.set(null);
      return list;
    } 
  }
  
  public void b(Class<?> paramClass1, Class<?> paramClass2, Class<?> paramClass3, List<Class<?>> paramList) {
    synchronized (this.b) {
      a<i, List<Class<?>>> a1 = this.b;
      i i = new i();
      this(paramClass1, paramClass2, paramClass3);
      a1.put(i, paramList);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/n/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */