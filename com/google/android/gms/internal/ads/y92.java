package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class y92 implements ThreadFactory {
  private final ThreadFactory a = Executors.defaultThreadFactory();
  
  private final AtomicInteger b = new AtomicInteger(1);
  
  public final Thread newThread(Runnable paramRunnable) {
    Thread thread = this.a.newThread(paramRunnable);
    int i = this.b.getAndIncrement();
    StringBuilder stringBuilder = new StringBuilder(16);
    stringBuilder.append("gads-");
    stringBuilder.append(i);
    thread.setName(stringBuilder.toString());
    return thread;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/y92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */