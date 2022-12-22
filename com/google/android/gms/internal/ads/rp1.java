package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class rp1 implements qp1 {
  private rp1() {}
  
  public final ExecutorService a(int paramInt1, ThreadFactory paramThreadFactory, int paramInt2) {
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(paramInt1, paramInt1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), paramThreadFactory);
    threadPoolExecutor.allowCoreThreadTimeOut(true);
    return Executors.unconfigurableExecutorService(threadPoolExecutor);
  }
  
  public final ExecutorService b(ThreadFactory paramThreadFactory, int paramInt) {
    return a(1, paramThreadFactory, paramInt);
  }
  
  public final ExecutorService c(ThreadFactory paramThreadFactory, int paramInt) {
    return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(paramThreadFactory));
  }
  
  public final ScheduledExecutorService d(int paramInt1, ThreadFactory paramThreadFactory, int paramInt2) {
    return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, paramThreadFactory));
  }
  
  public final ExecutorService e(int paramInt) {
    return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
  }
  
  public final ExecutorService f(int paramInt) {
    return a(1, Executors.defaultThreadFactory(), paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rp1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */