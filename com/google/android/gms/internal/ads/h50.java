package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

public final class h50 extends j90<i50> {
  public h50(Set<gb0<i50>> paramSet) {
    super(paramSet);
  }
  
  public final void b1(wb0 paramwb0, Executor paramExecutor) {
    Y0(gb0.a((ListenerT)new l50(this, paramwb0), paramExecutor));
  }
  
  public final void c1(Context paramContext) {
    X0(new k50(paramContext));
  }
  
  public final void d1(Context paramContext) {
    X0(new j50(paramContext));
  }
  
  public final void e1(Context paramContext) {
    X0(new m50(paramContext));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/h50.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */