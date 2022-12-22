package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class f {
  private final Map<Class<?>, ?> a;
  
  f(a parama) {
    this.a = Collections.unmodifiableMap(new HashMap<Class<?>, Object>(a.a(parama)));
  }
  
  public boolean a(Class<?> paramClass) {
    return this.a.containsKey(paramClass);
  }
  
  static final class a {
    private final Map<Class<?>, ?> a = new HashMap<Class<?>, Object>();
    
    f b() {
      return new f(this);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */