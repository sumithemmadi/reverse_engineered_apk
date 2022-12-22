package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.c;
import java.util.HashMap;
import java.util.Map;

final class p {
  private final Map<c, j<?>> a = new HashMap<c, j<?>>();
  
  private final Map<c, j<?>> b = new HashMap<c, j<?>>();
  
  private Map<c, j<?>> b(boolean paramBoolean) {
    Map<c, j<?>> map;
    if (paramBoolean) {
      map = this.b;
    } else {
      map = this.a;
    } 
    return map;
  }
  
  j<?> a(c paramc, boolean paramBoolean) {
    return b(paramBoolean).get(paramc);
  }
  
  void c(c paramc, j<?> paramj) {
    b(paramj.p()).put(paramc, paramj);
  }
  
  void d(c paramc, j<?> paramj) {
    Map<c, j<?>> map = b(paramj.p());
    if (paramj.equals(map.get(paramc)))
      map.remove(paramc); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */