package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class b10 {
  private final Executor a;
  
  private final ScheduledExecutorService b;
  
  private final ot1<v00> c;
  
  private volatile boolean d = true;
  
  public b10(Executor paramExecutor, ScheduledExecutorService paramScheduledExecutorService, ot1<v00> paramot1) {
    this.a = paramExecutor;
    this.b = paramScheduledExecutorService;
    this.c = paramot1;
  }
  
  private final void f(List<? extends ot1<? extends p00>> paramList, et1<p00> paramet1) {
    if (paramList == null || paramList.isEmpty()) {
      this.a.execute(new a10(paramet1));
      return;
    } 
    ot1<?> ot12 = dt1.h(null);
    Iterator<? extends ot1<? extends p00>> iterator = paramList.iterator();
    ot1<?> ot11;
    for (ot11 = ot12; iterator.hasNext(); ot11 = dt1.k(dt1.l(ot11, Throwable.class, new d10(paramet1), this.a), new c10(this, paramet1, ot12), this.a))
      ot12 = iterator.next(); 
    dt1.g(ot11, new h10(this, paramet1), this.a);
  }
  
  private final void g() {
    fm.e.execute(new f10(this));
  }
  
  public final boolean a() {
    return this.d;
  }
  
  public final void e(et1<p00> paramet1) {
    dt1.g(this.c, new e10(this, paramet1), this.a);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/b10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */