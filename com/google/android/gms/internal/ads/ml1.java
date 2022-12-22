package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class ml1<E, V> implements ot1<V> {
  private final E b;
  
  private final String c;
  
  private final ot1<V> d;
  
  public ml1(E paramE, String paramString, ot1<V> paramot1) {
    this.b = paramE;
    this.c = paramString;
    this.d = paramot1;
  }
  
  public final void a(Runnable paramRunnable, Executor paramExecutor) {
    this.d.a(paramRunnable, paramExecutor);
  }
  
  public final E b() {
    return this.b;
  }
  
  public final String c() {
    return this.c;
  }
  
  public final boolean cancel(boolean paramBoolean) {
    return this.d.cancel(paramBoolean);
  }
  
  public final V get() {
    return this.d.get();
  }
  
  public final V get(long paramLong, TimeUnit paramTimeUnit) {
    return this.d.get(paramLong, paramTimeUnit);
  }
  
  public final boolean isCancelled() {
    return this.d.isCancelled();
  }
  
  public final boolean isDone() {
    return this.d.isDone();
  }
  
  public final String toString() {
    String str = this.c;
    int i = System.identityHashCode(this);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 12);
    stringBuilder.append(str);
    stringBuilder.append("@");
    stringBuilder.append(i);
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ml1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */