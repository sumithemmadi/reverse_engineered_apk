package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

final class jm extends is1 {
  private final Executor b;
  
  private jm(Executor paramExecutor) {
    this.b = paramExecutor;
  }
  
  public final boolean awaitTermination(long paramLong, TimeUnit paramTimeUnit) {
    throw new UnsupportedOperationException();
  }
  
  public final void execute(Runnable paramRunnable) {
    this.b.execute(paramRunnable);
  }
  
  public final boolean isShutdown() {
    return false;
  }
  
  public final boolean isTerminated() {
    return false;
  }
  
  public final void shutdown() {
    throw new UnsupportedOperationException();
  }
  
  public final List<Runnable> shutdownNow() {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */