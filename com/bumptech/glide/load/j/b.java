package com.bumptech.glide.load.j;

import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.p.j;

public class b<T> implements s<T> {
  protected final T b;
  
  public b(T paramT) {
    this.b = (T)j.d(paramT);
  }
  
  public void a() {}
  
  public final int b() {
    return 1;
  }
  
  public Class<T> c() {
    return (Class)this.b.getClass();
  }
  
  public final T get() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/j/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */