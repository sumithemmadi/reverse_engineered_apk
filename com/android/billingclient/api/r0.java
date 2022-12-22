package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class r0 implements ThreadFactory {
  private final ThreadFactory a = Executors.defaultThreadFactory();
  
  private final AtomicInteger b = new AtomicInteger(1);
  
  r0(d paramd) {}
  
  public final Thread newThread(Runnable paramRunnable) {
    paramRunnable = this.a.newThread(paramRunnable);
    int i = this.b.getAndIncrement();
    StringBuilder stringBuilder = new StringBuilder(30);
    stringBuilder.append("PlayBillingLibrary-");
    stringBuilder.append(i);
    paramRunnable.setName(stringBuilder.toString());
    return (Thread)paramRunnable;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/android/billingclient/api/r0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */