package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.h.m;
import com.google.android.datatransport.h.x.j.c;
import com.google.android.datatransport.runtime.synchronization.a;
import java.util.concurrent.Executor;

public class p {
  private final Executor a;
  
  private final c b;
  
  private final r c;
  
  private final a d;
  
  p(Executor paramExecutor, c paramc, r paramr, a parama) {
    this.a = paramExecutor;
    this.b = paramc;
    this.c = paramr;
    this.d = parama;
  }
  
  public void a() {
    this.a.execute(n.a(this));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/runtime/scheduling/jobscheduling/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */