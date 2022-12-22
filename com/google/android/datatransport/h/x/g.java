package com.google.android.datatransport.h.x;

import com.google.android.datatransport.h.u.a.b;
import com.google.android.datatransport.h.u.a.d;
import com.google.android.datatransport.h.y.a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import e.a.a;

public final class g implements b<SchedulerConfig> {
  private final a<a> a;
  
  public g(a<a> parama) {
    this.a = parama;
  }
  
  public static SchedulerConfig a(a parama) {
    return (SchedulerConfig)d.c(f.a(parama), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public static g b(a<a> parama) {
    return new g(parama);
  }
  
  public SchedulerConfig c() {
    return a((a)this.a.get());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/x/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */