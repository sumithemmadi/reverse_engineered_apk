package com.bumptech.glide.n;

import b.e.a;
import com.bumptech.glide.load.engine.g;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.load.j.h.e;
import com.bumptech.glide.load.j.h.g;
import com.bumptech.glide.p.i;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

public class c {
  private static final q<?, ?, ?> a = new q(Object.class, Object.class, Object.class, Collections.singletonList(new g(Object.class, Object.class, Object.class, Collections.emptyList(), (e)new g(), null)), null);
  
  private final a<i, q<?, ?, ?>> b = new a();
  
  private final AtomicReference<i> c = new AtomicReference<i>();
  
  private i b(Class<?> paramClass1, Class<?> paramClass2, Class<?> paramClass3) {
    i i1 = this.c.getAndSet(null);
    i i2 = i1;
    if (i1 == null)
      i2 = new i(); 
    i2.a(paramClass1, paramClass2, paramClass3);
    return i2;
  }
  
  public <Data, TResource, Transcode> q<Data, TResource, Transcode> a(Class<Data> paramClass, Class<TResource> paramClass1, Class<Transcode> paramClass2) {
    null = b(paramClass, paramClass1, paramClass2);
    synchronized (this.b) {
      q<Data, TResource, Transcode> q1 = (q)this.b.get(null);
      this.c.set(null);
      return q1;
    } 
  }
  
  public boolean c(q<?, ?, ?> paramq) {
    return a.equals(paramq);
  }
  
  public void d(Class<?> paramClass1, Class<?> paramClass2, Class<?> paramClass3, q<?, ?, ?> paramq) {
    synchronized (this.b) {
      a<i, q<?, ?, ?>> a1 = this.b;
      i i = new i();
      this(paramClass1, paramClass2, paramClass3);
      if (paramq == null)
        paramq = a; 
      a1.put(i, paramq);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/n/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */