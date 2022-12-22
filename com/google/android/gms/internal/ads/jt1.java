package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

class jt1<V> implements ot1<V> {
  static final ot1<?> b = new jt1(null);
  
  private static final Logger c = Logger.getLogger(jt1.class.getName());
  
  private final V d;
  
  jt1(V paramV) {
    this.d = paramV;
  }
  
  public void a(Runnable paramRunnable, Executor paramExecutor) {
    xq1.c(paramRunnable, "Runnable was null.");
    xq1.c(paramExecutor, "Executor was null.");
    try {
      paramExecutor.execute(paramRunnable);
      return;
    } catch (RuntimeException runtimeException) {
      Logger logger = c;
      Level level = Level.SEVERE;
      String str1 = String.valueOf(paramRunnable);
      String str2 = String.valueOf(paramExecutor);
      StringBuilder stringBuilder = new StringBuilder(str1.length() + 57 + str2.length());
      stringBuilder.append("RuntimeException while executing runnable ");
      stringBuilder.append(str1);
      stringBuilder.append(" with executor ");
      stringBuilder.append(str2);
      logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", stringBuilder.toString(), runtimeException);
      return;
    } 
  }
  
  public boolean cancel(boolean paramBoolean) {
    return false;
  }
  
  public V get() {
    return this.d;
  }
  
  public V get(long paramLong, TimeUnit paramTimeUnit) {
    xq1.b(paramTimeUnit);
    return get();
  }
  
  public boolean isCancelled() {
    return false;
  }
  
  public boolean isDone() {
    return true;
  }
  
  public String toString() {
    String str1 = super.toString();
    String str2 = String.valueOf(this.d);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 27 + str2.length());
    stringBuilder.append(str1);
    stringBuilder.append("[status=SUCCESS, result=[");
    stringBuilder.append(str2);
    stringBuilder.append("]]");
    return stringBuilder.toString();
  }
  
  static final class a<V> extends zzdyk.h<V> {
    a(Throwable param1Throwable) {
      j(param1Throwable);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jt1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */