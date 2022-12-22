package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

abstract class ks1<I, O, F, T> extends xs1<O> implements Runnable {
  private ot1<? extends I> i;
  
  private F j;
  
  ks1(ot1<? extends I> paramot1, F paramF) {
    this.i = xq1.<ot1<? extends I>>b(paramot1);
    this.j = xq1.b(paramF);
  }
  
  static <I, O> ot1<O> J(ot1<I> paramot1, kq1<? super I, ? extends O> paramkq1, Executor paramExecutor) {
    xq1.b(paramkq1);
    ls1<I, O> ls1 = new ls1<I, O>(paramot1, paramkq1);
    paramot1.a(ls1, qt1.b(paramExecutor, ls1));
    return ls1;
  }
  
  static <I, O> ot1<O> K(ot1<I> paramot1, qs1<? super I, ? extends O> paramqs1, Executor paramExecutor) {
    xq1.b(paramExecutor);
    js1<I, O> js1 = new js1<I, O>(paramot1, paramqs1);
    paramot1.a(js1, qt1.b(paramExecutor, js1));
    return js1;
  }
  
  abstract void I(T paramT);
  
  abstract T L(F paramF, I paramI);
  
  protected final void c() {
    g(this.i);
    this.i = null;
    this.j = null;
  }
  
  protected final String h() {
    String str1;
    StringBuilder stringBuilder;
    ot1<? extends I> ot11 = this.i;
    F f = this.j;
    String str2 = super.h();
    if (ot11 != null) {
      String str = String.valueOf(ot11);
      StringBuilder stringBuilder1 = new StringBuilder(str.length() + 16);
      stringBuilder1.append("inputFuture=[");
      stringBuilder1.append(str);
      stringBuilder1.append("], ");
      str1 = stringBuilder1.toString();
    } else {
      str1 = "";
    } 
    if (f != null) {
      String str = String.valueOf(f);
      stringBuilder = new StringBuilder(String.valueOf(str1).length() + 11 + str.length());
      stringBuilder.append(str1);
      stringBuilder.append("function=[");
      stringBuilder.append(str);
      stringBuilder.append("]");
      return stringBuilder.toString();
    } 
    if (stringBuilder != null) {
      str1 = String.valueOf(str1);
      return (stringBuilder.length() != 0) ? str1.concat((String)stringBuilder) : new String(str1);
    } 
    return null;
  }
  
  public final void run() {
    boolean bool3;
    ot1<? extends I> ot11 = this.i;
    F f = this.j;
    boolean bool1 = isCancelled();
    boolean bool2 = true;
    if (ot11 == null) {
      bool3 = true;
    } else {
      bool3 = false;
    } 
    if (f != null)
      bool2 = false; 
    if (bool1 | bool3 | bool2)
      return; 
    this.i = null;
    if (ot11.isCancelled()) {
      k(ot11);
      return;
    } 
    try {
      ot11 = dt1.f((Future)ot11);
      try {
        f = (F)L(f, (I)ot11);
        this.j = null;
        return;
      } finally {
        f = null;
      } 
    } catch (CancellationException cancellationException) {
      cancel(false);
      return;
    } catch (ExecutionException executionException) {
      j(executionException.getCause());
      return;
    } catch (RuntimeException runtimeException) {
      j(runtimeException);
      return;
    } catch (Error error) {
      j(error);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ks1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */