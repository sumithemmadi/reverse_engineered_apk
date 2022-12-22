package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class uk1 implements ThreadFactory {
  private final AtomicInteger a = new AtomicInteger(1);
  
  public final Thread newThread(Runnable paramRunnable) {
    int i = this.a.getAndIncrement();
    StringBuilder stringBuilder = new StringBuilder(25);
    stringBuilder.append("AdWorker(NG) #");
    stringBuilder.append(i);
    return new Thread(paramRunnable, stringBuilder.toString());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/uk1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */