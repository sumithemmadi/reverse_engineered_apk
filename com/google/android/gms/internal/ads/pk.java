package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class pk implements ThreadFactory {
  private final AtomicInteger a = new AtomicInteger(1);
  
  pk(yj paramyj) {}
  
  public final Thread newThread(Runnable paramRunnable) {
    int i = this.a.getAndIncrement();
    StringBuilder stringBuilder = new StringBuilder(42);
    stringBuilder.append("AdWorker(SCION_TASK_EXECUTOR) #");
    stringBuilder.append(i);
    return new Thread(paramRunnable, stringBuilder.toString());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */