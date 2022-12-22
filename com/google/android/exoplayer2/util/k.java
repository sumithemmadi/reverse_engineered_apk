package com.google.android.exoplayer2.util;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class k<T> {
  private final CopyOnWriteArrayList<b<T>> a = new CopyOnWriteArrayList<b<T>>();
  
  public void a(Handler paramHandler, T paramT) {
    boolean bool;
    if (paramHandler != null && paramT != null) {
      bool = true;
    } else {
      bool = false;
    } 
    e.a(bool);
    c(paramT);
    this.a.add(new b<T>(paramHandler, paramT));
  }
  
  public void b(a<T> parama) {
    Iterator<b<T>> iterator = this.a.iterator();
    while (iterator.hasNext())
      ((b<T>)iterator.next()).b(parama); 
  }
  
  public void c(T paramT) {
    for (b<T> b : this.a) {
      if (b.a(b) == paramT) {
        b.e();
        this.a.remove(b);
      } 
    } 
  }
  
  public static interface a<T> {
    void a(T param1T);
  }
  
  private static final class b<T> {
    private final Handler a;
    
    private final T b;
    
    private boolean c;
    
    public b(Handler param1Handler, T param1T) {
      this.a = param1Handler;
      this.b = param1T;
    }
    
    public void b(k.a<T> param1a) {
      this.a.post(new a(this, param1a));
    }
    
    public void e() {
      this.c = true;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */