package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class v3 {
  private final AtomicInteger a = new AtomicInteger();
  
  private final Set<w<?>> b = new HashSet<w<?>>();
  
  private final PriorityBlockingQueue<w<?>> c = new PriorityBlockingQueue<w<?>>();
  
  private final PriorityBlockingQueue<w<?>> d = new PriorityBlockingQueue<w<?>>();
  
  private final me2 e;
  
  private final bo2 f;
  
  private final i9 g;
  
  private final mr2[] h;
  
  private mg2 i;
  
  private final List<v5> j = new ArrayList<v5>();
  
  private final List<x2> k = new ArrayList<x2>();
  
  public v3(me2 paramme2, bo2 parambo2) {
    this(paramme2, parambo2, 4);
  }
  
  private v3(me2 paramme2, bo2 parambo2, int paramInt) {
    this(paramme2, parambo2, 4, new ck2(new Handler(Looper.getMainLooper())));
  }
  
  private v3(me2 paramme2, bo2 parambo2, int paramInt, i9 parami9) {
    this.e = paramme2;
    this.f = parambo2;
    this.h = new mr2[4];
    this.g = parami9;
  }
  
  public final void a() {
    mg2 mg21 = this.i;
    if (mg21 != null)
      mg21.b(); 
    mr2[] arrayOfMr2 = this.h;
    int i = arrayOfMr2.length;
    boolean bool = false;
    byte b;
    for (b = 0; b < i; b++) {
      mr2 mr21 = arrayOfMr2[b];
      if (mr21 != null)
        mr21.b(); 
    } 
    mg21 = new mg2(this.c, this.d, this.e, this.g);
    this.i = mg21;
    mg21.start();
    for (b = bool; b < this.h.length; b++) {
      mr2 mr21 = new mr2(this.d, this.f, this.e, this.g);
      this.h[b] = mr21;
      mr21.start();
    } 
  }
  
  final void b(w<?> paramw, int paramInt) {
    synchronized (this.k) {
      Iterator<x2> iterator = this.k.iterator();
      while (iterator.hasNext())
        ((x2)iterator.next()).a(paramw, paramInt); 
      return;
    } 
  }
  
  public final <T> w<T> c(w<T> paramw) {
    paramw.k(this);
    synchronized (this.b) {
      this.b.add(paramw);
      paramw.y(this.a.incrementAndGet());
      paramw.u("add-to-queue");
      b(paramw, 0);
      if (!paramw.C()) {
        this.d.add(paramw);
      } else {
        this.c.add(paramw);
      } 
      return paramw;
    } 
  }
  
  final <T> void d(w<T> paramw) {
    synchronized (this.b) {
      this.b.remove(paramw);
      synchronized (this.j) {
        Iterator<v5> iterator = this.j.iterator();
        while (iterator.hasNext())
          ((v5<T>)iterator.next()).a(paramw); 
        b(paramw, 5);
        return;
      } 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/v3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */