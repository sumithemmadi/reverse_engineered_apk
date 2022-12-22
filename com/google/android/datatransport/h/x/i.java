package com.google.android.datatransport.h.x;

import android.content.Context;
import com.google.android.datatransport.h.u.a.b;
import com.google.android.datatransport.h.u.a.d;
import com.google.android.datatransport.h.x.j.c;
import com.google.android.datatransport.h.y.a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.r;
import e.a.a;

public final class i implements b<r> {
  private final a<Context> a;
  
  private final a<c> b;
  
  private final a<SchedulerConfig> c;
  
  private final a<a> d;
  
  public i(a<Context> parama, a<c> parama1, a<SchedulerConfig> parama2, a<a> parama3) {
    this.a = parama;
    this.b = parama1;
    this.c = parama2;
    this.d = parama3;
  }
  
  public static i a(a<Context> parama, a<c> parama1, a<SchedulerConfig> parama2, a<a> parama3) {
    return new i(parama, parama1, parama2, parama3);
  }
  
  public static r c(Context paramContext, c paramc, SchedulerConfig paramSchedulerConfig, a parama) {
    return (r)d.c(h.a(paramContext, paramc, paramSchedulerConfig, parama), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public r b() {
    return c((Context)this.a.get(), (c)this.b.get(), (SchedulerConfig)this.c.get(), (a)this.d.get());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/x/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */