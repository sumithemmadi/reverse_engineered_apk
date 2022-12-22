package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

final class at1<V> extends ys1<V> {
  private final ot1<V> i;
  
  at1(ot1<V> paramot1) {
    this.i = xq1.<ot1<V>>b(paramot1);
  }
  
  public final void a(Runnable paramRunnable, Executor paramExecutor) {
    this.i.a(paramRunnable, paramExecutor);
  }
  
  public final boolean cancel(boolean paramBoolean) {
    return this.i.cancel(paramBoolean);
  }
  
  public final V get() {
    return this.i.get();
  }
  
  public final V get(long paramLong, TimeUnit paramTimeUnit) {
    return this.i.get(paramLong, paramTimeUnit);
  }
  
  public final boolean isCancelled() {
    return this.i.isCancelled();
  }
  
  public final boolean isDone() {
    return this.i.isDone();
  }
  
  public final String toString() {
    return this.i.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/at1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */