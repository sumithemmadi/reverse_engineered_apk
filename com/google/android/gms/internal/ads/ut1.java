package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

class ut1 extends is1 {
  private final ExecutorService b;
  
  ut1(ExecutorService paramExecutorService) {
    this.b = xq1.<ExecutorService>b(paramExecutorService);
  }
  
  public final boolean awaitTermination(long paramLong, TimeUnit paramTimeUnit) {
    return this.b.awaitTermination(paramLong, paramTimeUnit);
  }
  
  public final void execute(Runnable paramRunnable) {
    this.b.execute(paramRunnable);
  }
  
  public final boolean isShutdown() {
    return this.b.isShutdown();
  }
  
  public final boolean isTerminated() {
    return this.b.isTerminated();
  }
  
  public final void shutdown() {
    this.b.shutdown();
  }
  
  public final List<Runnable> shutdownNow() {
    return this.b.shutdownNow();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ut1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */