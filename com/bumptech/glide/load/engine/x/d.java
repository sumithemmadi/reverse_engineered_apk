package com.bumptech.glide.load.engine.x;

import com.bumptech.glide.p.k;
import java.util.Queue;

abstract class d<T extends m> {
  private final Queue<T> a = k.e(20);
  
  abstract T a();
  
  T b() {
    m m1 = (m)this.a.poll();
    m m2 = m1;
    if (m1 == null)
      m2 = (m)a(); 
    return (T)m2;
  }
  
  public void c(T paramT) {
    if (this.a.size() < 20)
      this.a.offer(paramT); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/x/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */