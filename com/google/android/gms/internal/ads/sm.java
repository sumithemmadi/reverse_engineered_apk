package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class sm<T> implements ot1<T> {
  private final yt1<T> b = yt1.C();
  
  private static boolean e(boolean paramBoolean) {
    if (!paramBoolean)
      q.g().h(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture"); 
    return paramBoolean;
  }
  
  public void a(Runnable paramRunnable, Executor paramExecutor) {
    this.b.a(paramRunnable, paramExecutor);
  }
  
  public final boolean c(T paramT) {
    return e(this.b.i(paramT));
  }
  
  public boolean cancel(boolean paramBoolean) {
    return this.b.cancel(paramBoolean);
  }
  
  public final boolean d(Throwable paramThrowable) {
    return e(this.b.j(paramThrowable));
  }
  
  public T get() {
    return this.b.get();
  }
  
  public T get(long paramLong, TimeUnit paramTimeUnit) {
    return this.b.get(paramLong, paramTimeUnit);
  }
  
  public boolean isCancelled() {
    return this.b.isCancelled();
  }
  
  public boolean isDone() {
    return this.b.isDone();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */