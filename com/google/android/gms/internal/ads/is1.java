package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

public abstract class is1 extends AbstractExecutorService implements nt1 {
  public final <T> ot1<T> a(Callable<T> paramCallable) {
    return (ot1<T>)super.<T>submit(paramCallable);
  }
  
  public final ot1<?> e(Runnable paramRunnable) {
    return (ot1)super.submit(paramRunnable);
  }
  
  protected final <T> RunnableFuture<T> newTaskFor(Runnable paramRunnable, T paramT) {
    return bu1.I(paramRunnable, paramT);
  }
  
  protected final <T> RunnableFuture<T> newTaskFor(Callable<T> paramCallable) {
    return bu1.J(paramCallable);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/is1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */