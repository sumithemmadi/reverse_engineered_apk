package com.bumptech.glide.manager;

import com.bumptech.glide.p.k;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

class a implements l {
  private final Set<m> a = Collections.newSetFromMap(new WeakHashMap<m, Boolean>());
  
  private boolean b;
  
  private boolean c;
  
  public void a(m paramm) {
    this.a.add(paramm);
    if (this.c) {
      paramm.onDestroy();
    } else if (this.b) {
      paramm.onStart();
    } else {
      paramm.X();
    } 
  }
  
  public void b(m paramm) {
    this.a.remove(paramm);
  }
  
  void c() {
    this.c = true;
    Iterator<m> iterator = k.i(this.a).iterator();
    while (iterator.hasNext())
      ((m)iterator.next()).onDestroy(); 
  }
  
  void d() {
    this.b = true;
    Iterator<m> iterator = k.i(this.a).iterator();
    while (iterator.hasNext())
      ((m)iterator.next()).onStart(); 
  }
  
  void e() {
    this.b = false;
    Iterator<m> iterator = k.i(this.a).iterator();
    while (iterator.hasNext())
      ((m)iterator.next()).X(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/manager/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */