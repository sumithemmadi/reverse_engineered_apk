package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class hm implements ThreadFactory {
  private final AtomicInteger a = new AtomicInteger(1);
  
  hm(String paramString) {}
  
  public final Thread newThread(Runnable paramRunnable) {
    String str = this.b;
    int i = this.a.getAndIncrement();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 23);
    stringBuilder.append("AdWorker(");
    stringBuilder.append(str);
    stringBuilder.append(") #");
    stringBuilder.append(i);
    return new Thread(paramRunnable, stringBuilder.toString());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */