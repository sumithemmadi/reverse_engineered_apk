package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

final class ft1<V> implements Runnable {
  private final Future<V> b;
  
  private final et1<? super V> c;
  
  ft1(Future<V> paramFuture, et1<? super V> paramet1) {
    this.b = paramFuture;
    this.c = paramet1;
  }
  
  public final void run() {
    Future<V> future = this.b;
    if (future instanceof eu1) {
      Throwable throwable = du1.a((eu1)future);
      if (throwable != null) {
        this.c.a(throwable);
        return;
      } 
    } 
    try {
      future = dt1.f((Future)this.b);
      this.c.onSuccess((V)future);
      return;
    } catch (ExecutionException executionException) {
      this.c.a(executionException.getCause());
      return;
    } catch (RuntimeException runtimeException) {
      this.c.a(runtimeException);
      return;
    } catch (Error error) {
      this.c.a(error);
      return;
    } 
  }
  
  public final String toString() {
    return nq1.a(this).a(this.c).toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ft1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */