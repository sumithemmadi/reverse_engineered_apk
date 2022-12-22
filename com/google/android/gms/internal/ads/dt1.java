package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class dt1 extends kt1 {
  public static <V> ot1<V> a(Throwable paramThrowable) {
    xq1.b(paramThrowable);
    return new jt1.a<V>(paramThrowable);
  }
  
  @SafeVarargs
  public static <V> it1<V> b(ot1<? extends V>... paramVarArgs) {
    return new it1<V>(false, zzdxd.zzb(paramVarArgs), null);
  }
  
  public static <O> ot1<O> c(rs1<O> paramrs1, Executor paramExecutor) {
    bu1<O> bu1 = new bu1<O>(paramrs1);
    paramExecutor.execute(bu1);
    return bu1;
  }
  
  public static <V> ot1<V> d(ot1<V> paramot1, long paramLong, TimeUnit paramTimeUnit, ScheduledExecutorService paramScheduledExecutorService) {
    return paramot1.isDone() ? paramot1 : xt1.K(paramot1, paramLong, paramTimeUnit, paramScheduledExecutorService);
  }
  
  public static <O> ot1<O> e(Callable<O> paramCallable, Executor paramExecutor) {
    bu1<O> bu1 = bu1.J(paramCallable);
    paramExecutor.execute(bu1);
    return bu1;
  }
  
  public static <V> V f(Future<V> paramFuture) {
    if (paramFuture.isDone())
      return cu1.a(paramFuture); 
    throw new IllegalStateException(er1.c("Future was expected to be done: %s", new Object[] { paramFuture }));
  }
  
  public static <V> void g(ot1<V> paramot1, et1<? super V> paramet1, Executor paramExecutor) {
    xq1.b(paramet1);
    paramot1.a(new ft1<V>(paramot1, paramet1), paramExecutor);
  }
  
  public static <V> ot1<V> h(V paramV) {
    return (paramV == null) ? jt1.b : new jt1<V>(paramV);
  }
  
  @SafeVarargs
  public static <V> it1<V> i(ot1<? extends V>... paramVarArgs) {
    return new it1<V>(true, zzdxd.zzb(paramVarArgs), null);
  }
  
  public static <I, O> ot1<O> j(ot1<I> paramot1, kq1<? super I, ? extends O> paramkq1, Executor paramExecutor) {
    return ks1.J(paramot1, paramkq1, paramExecutor);
  }
  
  public static <I, O> ot1<O> k(ot1<I> paramot1, qs1<? super I, ? extends O> paramqs1, Executor paramExecutor) {
    return ks1.K(paramot1, paramqs1, paramExecutor);
  }
  
  public static <V, X extends Throwable> ot1<V> l(ot1<? extends V> paramot1, Class<X> paramClass, qs1<? super X, ? extends V> paramqs1, Executor paramExecutor) {
    return es1.J(paramot1, paramClass, paramqs1, paramExecutor);
  }
  
  public static <V> V m(Future<V> paramFuture) {
    xq1.b(paramFuture);
    try {
      return (V)cu1.a((Future)paramFuture);
    } catch (ExecutionException executionException) {
      Throwable throwable = executionException.getCause();
      if (throwable instanceof Error)
        throw new zzdzc((Error)throwable); 
      throw new zzeam(throwable);
    } 
  }
  
  public static <V> ot1<List<V>> n(Iterable<? extends ot1<? extends V>> paramIterable) {
    return new ss1<V>(zzdxd.zzh(paramIterable), true);
  }
  
  public static <V> it1<V> o(Iterable<? extends ot1<? extends V>> paramIterable) {
    return new it1<V>(false, zzdxd.zzh(paramIterable), null);
  }
  
  public static <V> it1<V> p(Iterable<? extends ot1<? extends V>> paramIterable) {
    return new it1<V>(true, zzdxd.zzh(paramIterable), null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dt1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */