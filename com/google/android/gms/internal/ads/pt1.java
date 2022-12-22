package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

final class pt1 implements Executor {
  pt1(Executor paramExecutor, zzdyk paramzzdyk) {}
  
  public final void execute(Runnable paramRunnable) {
    try {
      this.b.execute(paramRunnable);
      return;
    } catch (RejectedExecutionException rejectedExecutionException) {
      this.c.j(rejectedExecutionException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pt1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */