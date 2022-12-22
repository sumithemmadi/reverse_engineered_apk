package com.bumptech.glide.manager;

import android.util.Log;
import com.bumptech.glide.p.k;
import com.bumptech.glide.request.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public class q {
  private final Set<c> a = Collections.newSetFromMap(new WeakHashMap<c, Boolean>());
  
  private final List<c> b = new ArrayList<c>();
  
  private boolean c;
  
  public boolean a(c paramc) {
    boolean bool1 = true;
    if (paramc == null)
      return true; 
    boolean bool = this.a.remove(paramc);
    boolean bool2 = bool1;
    if (!this.b.remove(paramc))
      if (bool) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }  
    if (bool2)
      paramc.clear(); 
    return bool2;
  }
  
  public void b() {
    Iterator<c> iterator = k.i(this.a).iterator();
    while (iterator.hasNext())
      a(iterator.next()); 
    this.b.clear();
  }
  
  public void c() {
    this.c = true;
    for (c c : k.i(this.a)) {
      if (c.isRunning() || c.j()) {
        c.clear();
        this.b.add(c);
      } 
    } 
  }
  
  public void d() {
    this.c = true;
    for (c c : k.i(this.a)) {
      if (c.isRunning()) {
        c.pause();
        this.b.add(c);
      } 
    } 
  }
  
  public void e() {
    for (c c : k.i(this.a)) {
      if (!c.j() && !c.f()) {
        c.clear();
        if (!this.c) {
          c.h();
          continue;
        } 
        this.b.add(c);
      } 
    } 
  }
  
  public void f() {
    this.c = false;
    for (c c : k.i(this.a)) {
      if (!c.j() && !c.isRunning())
        c.h(); 
    } 
    this.b.clear();
  }
  
  public void g(c paramc) {
    this.a.add(paramc);
    if (!this.c) {
      paramc.h();
    } else {
      paramc.clear();
      if (Log.isLoggable("RequestTracker", 2))
        Log.v("RequestTracker", "Paused, delaying request"); 
      this.b.add(paramc);
    } 
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(super.toString());
    stringBuilder.append("{numRequests=");
    stringBuilder.append(this.a.size());
    stringBuilder.append(", isPaused=");
    stringBuilder.append(this.c);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/manager/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */