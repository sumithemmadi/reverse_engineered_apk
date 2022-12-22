package com.bumptech.glide.manager;

import com.bumptech.glide.p.k;
import com.bumptech.glide.request.h.h;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class s implements m {
  private final Set<h<?>> b = Collections.newSetFromMap(new WeakHashMap<h<?>, Boolean>());
  
  public void X() {
    Iterator<h> iterator = k.i(this.b).iterator();
    while (iterator.hasNext())
      ((h)iterator.next()).X(); 
  }
  
  public void i() {
    this.b.clear();
  }
  
  public List<h<?>> j() {
    return k.i(this.b);
  }
  
  public void k(h<?> paramh) {
    this.b.add(paramh);
  }
  
  public void l(h<?> paramh) {
    this.b.remove(paramh);
  }
  
  public void onDestroy() {
    Iterator<h> iterator = k.i(this.b).iterator();
    while (iterator.hasNext())
      ((h)iterator.next()).onDestroy(); 
  }
  
  public void onStart() {
    Iterator<h> iterator = k.i(this.b).iterator();
    while (iterator.hasNext())
      ((h)iterator.next()).onStart(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/manager/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */