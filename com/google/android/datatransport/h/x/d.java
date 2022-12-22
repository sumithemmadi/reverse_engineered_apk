package com.google.android.datatransport.h.x;

import com.google.android.datatransport.h.u.a.b;
import com.google.android.datatransport.h.x.j.c;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.r;
import com.google.android.datatransport.runtime.synchronization.a;
import e.a.a;
import java.util.concurrent.Executor;

public final class d implements b<c> {
  private final a<Executor> a;
  
  private final a<e> b;
  
  private final a<r> c;
  
  private final a<c> d;
  
  private final a<a> e;
  
  public d(a<Executor> parama, a<e> parama1, a<r> parama2, a<c> parama3, a<a> parama4) {
    this.a = parama;
    this.b = parama1;
    this.c = parama2;
    this.d = parama3;
    this.e = parama4;
  }
  
  public static d a(a<Executor> parama, a<e> parama1, a<r> parama2, a<c> parama3, a<a> parama4) {
    return new d(parama, parama1, parama2, parama3, parama4);
  }
  
  public static c c(Executor paramExecutor, e parame, r paramr, c paramc, a parama) {
    return new c(paramExecutor, parame, paramr, paramc, parama);
  }
  
  public c b() {
    return c((Executor)this.a.get(), (e)this.b.get(), (r)this.c.get(), (c)this.d.get(), (a)this.e.get());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/x/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */