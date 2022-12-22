package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class ck2 implements i9 {
  private final Executor a;
  
  public ck2(Handler paramHandler) {
    this.a = new en2(this, paramHandler);
  }
  
  public final void a(w<?> paramw, zzap paramzzap) {
    paramw.u("post-error");
    v4<?> v4 = v4.c(paramzzap);
    this.a.execute(new dm2(paramw, v4, null));
  }
  
  public final void b(w<?> paramw, v4<?> paramv4) {
    c(paramw, paramv4, null);
  }
  
  public final void c(w<?> paramw, v4<?> paramv4, Runnable paramRunnable) {
    paramw.F();
    paramw.u("post-response");
    this.a.execute(new dm2(paramw, paramv4, paramRunnable));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ck2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */