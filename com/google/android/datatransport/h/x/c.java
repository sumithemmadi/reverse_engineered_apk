package com.google.android.datatransport.h.x;

import com.google.android.datatransport.g;
import com.google.android.datatransport.h.h;
import com.google.android.datatransport.h.m;
import com.google.android.datatransport.h.r;
import com.google.android.datatransport.h.x.j.c;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.backends.l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.r;
import com.google.android.datatransport.runtime.synchronization.a;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

public class c implements e {
  private static final Logger a = Logger.getLogger(r.class.getName());
  
  private final r b;
  
  private final Executor c;
  
  private final e d;
  
  private final c e;
  
  private final a f;
  
  public c(Executor paramExecutor, e parame, r paramr, c paramc, a parama) {
    this.c = paramExecutor;
    this.d = parame;
    this.b = paramr;
    this.e = paramc;
    this.f = parama;
  }
  
  public void a(m paramm, h paramh, g paramg) {
    this.c.execute(a.a(this, paramm, paramg, paramh));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/x/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */