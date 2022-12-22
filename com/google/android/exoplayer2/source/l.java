package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.upstream.x;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.y0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public abstract class l implements v {
  private final ArrayList<v.b> a = new ArrayList<v.b>(1);
  
  private final HashSet<v.b> b = new HashSet<v.b>(1);
  
  private final w.a c = new w.a();
  
  private Looper d;
  
  private y0 e;
  
  public final void b(v.b paramb) {
    this.a.remove(paramb);
    if (this.a.isEmpty()) {
      this.d = null;
      this.e = null;
      this.b.clear();
      s();
    } else {
      f(paramb);
    } 
  }
  
  public final void d(Handler paramHandler, w paramw) {
    this.c.a(paramHandler, paramw);
  }
  
  public final void e(w paramw) {
    this.c.K(paramw);
  }
  
  public final void f(v.b paramb) {
    boolean bool = this.b.isEmpty();
    this.b.remove(paramb);
    if ((bool ^ true) != 0 && this.b.isEmpty())
      n(); 
  }
  
  public final void j(v.b paramb, x paramx) {
    boolean bool;
    Looper looper1 = Looper.myLooper();
    Looper looper2 = this.d;
    if (looper2 == null || looper2 == looper1) {
      bool = true;
    } else {
      bool = false;
    } 
    e.a(bool);
    y0 y01 = this.e;
    this.a.add(paramb);
    if (this.d == null) {
      this.d = looper1;
      this.b.add(paramb);
      q(paramx);
    } else if (y01 != null) {
      k(paramb);
      paramb.b(this, y01);
    } 
  }
  
  public final void k(v.b paramb) {
    e.e(this.d);
    boolean bool = this.b.isEmpty();
    this.b.add(paramb);
    if (bool)
      o(); 
  }
  
  protected final w.a l(int paramInt, v.a parama, long paramLong) {
    return this.c.L(paramInt, parama, paramLong);
  }
  
  protected final w.a m(v.a parama) {
    return this.c.L(0, parama, 0L);
  }
  
  protected void n() {}
  
  protected void o() {}
  
  protected final boolean p() {
    return this.b.isEmpty() ^ true;
  }
  
  protected abstract void q(x paramx);
  
  protected final void r(y0 paramy0) {
    this.e = paramy0;
    Iterator<v.b> iterator = this.a.iterator();
    while (iterator.hasNext())
      ((v.b)iterator.next()).b(this, paramy0); 
  }
  
  protected abstract void s();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */