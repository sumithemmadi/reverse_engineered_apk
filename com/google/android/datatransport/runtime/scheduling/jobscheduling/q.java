package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.h.u.a.b;
import com.google.android.datatransport.h.x.j.c;
import com.google.android.datatransport.runtime.synchronization.a;
import e.a.a;
import java.util.concurrent.Executor;

public final class q implements b<p> {
  private final a<Executor> a;
  
  private final a<c> b;
  
  private final a<r> c;
  
  private final a<a> d;
  
  public q(a<Executor> parama, a<c> parama1, a<r> parama2, a<a> parama3) {
    this.a = parama;
    this.b = parama1;
    this.c = parama2;
    this.d = parama3;
  }
  
  public static q a(a<Executor> parama, a<c> parama1, a<r> parama2, a<a> parama3) {
    return new q(parama, parama1, parama2, parama3);
  }
  
  public static p c(Executor paramExecutor, c paramc, r paramr, a parama) {
    return new p(paramExecutor, paramc, paramr, parama);
  }
  
  public p b() {
    return c((Executor)this.a.get(), (c)this.b.get(), (r)this.c.get(), (a)this.d.get());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/runtime/scheduling/jobscheduling/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */