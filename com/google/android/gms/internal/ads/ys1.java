package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ys1<V> extends ht1<V> {
  public static <V> ys1<V> H(ot1<V> paramot1) {
    return (paramot1 instanceof ys1) ? (ys1<V>)paramot1 : new at1<V>(paramot1);
  }
  
  public final ys1<V> C(long paramLong, TimeUnit paramTimeUnit, ScheduledExecutorService paramScheduledExecutorService) {
    return (ys1<V>)dt1.d(this, paramLong, paramTimeUnit, paramScheduledExecutorService);
  }
  
  public final <T> ys1<T> D(kq1<? super V, T> paramkq1, Executor paramExecutor) {
    xq1.b(paramkq1);
    ls1<V, T> ls1 = new ls1<V, T>(this, paramkq1);
    a(ls1, qt1.b(paramExecutor, ls1));
    return ls1;
  }
  
  public final <X extends Throwable> ys1<V> E(Class<X> paramClass, kq1<? super X, ? extends V> paramkq1, Executor paramExecutor) {
    gs1<V, X> gs1 = new gs1<V, X>(this, paramClass, paramkq1);
    a(gs1, qt1.b(paramExecutor, gs1));
    return gs1;
  }
  
  public final <X extends Throwable> ys1<V> F(Class<X> paramClass, qs1<? super X, ? extends V> paramqs1, Executor paramExecutor) {
    hs1<V, X> hs1 = new hs1<V, X>(this, paramClass, paramqs1);
    a(hs1, qt1.b(paramExecutor, hs1));
    return hs1;
  }
  
  public final <T> ys1<T> G(qs1<? super V, T> paramqs1, Executor paramExecutor) {
    xq1.b(paramExecutor);
    js1<V, T> js1 = new js1<V, T>(this, paramqs1);
    a(js1, qt1.b(paramExecutor, js1));
    return js1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ys1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */