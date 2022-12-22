package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.h.u.a.b;
import com.google.android.datatransport.h.x.j.c;
import com.google.android.datatransport.h.y.a;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.synchronization.a;
import e.a.a;
import java.util.concurrent.Executor;

public final class m implements b<l> {
  private final a<Context> a;
  
  private final a<e> b;
  
  private final a<c> c;
  
  private final a<r> d;
  
  private final a<Executor> e;
  
  private final a<a> f;
  
  private final a<a> g;
  
  public m(a<Context> parama, a<e> parama1, a<c> parama2, a<r> parama3, a<Executor> parama4, a<a> parama5, a<a> parama6) {
    this.a = parama;
    this.b = parama1;
    this.c = parama2;
    this.d = parama3;
    this.e = parama4;
    this.f = parama5;
    this.g = parama6;
  }
  
  public static m a(a<Context> parama, a<e> parama1, a<c> parama2, a<r> parama3, a<Executor> parama4, a<a> parama5, a<a> parama6) {
    return new m(parama, parama1, parama2, parama3, parama4, parama5, parama6);
  }
  
  public static l c(Context paramContext, e parame, c paramc, r paramr, Executor paramExecutor, a parama, a parama1) {
    return new l(paramContext, parame, paramc, paramr, paramExecutor, parama, parama1);
  }
  
  public l b() {
    return c((Context)this.a.get(), (e)this.b.get(), (c)this.c.get(), (r)this.d.get(), (Executor)this.e.get(), (a)this.f.get(), (a)this.g.get());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/runtime/scheduling/jobscheduling/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */