package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class sl1<O> {
  private final E a;
  
  private final String b;
  
  private final ot1<?> c;
  
  private final List<ot1<?>> d;
  
  private final ot1<O> e;
  
  private sl1(ll1 paramll1, E paramE, String paramString, ot1<?> paramot1, List<ot1<?>> paramList, ot1<O> paramot11) {
    this.a = paramE;
    this.b = paramString;
    this.c = paramot1;
    this.d = paramList;
    this.e = paramot11;
  }
  
  private final <O2> sl1<O2> c(qs1<O, O2> paramqs1, Executor paramExecutor) {
    return new sl1(this.f, this.a, this.b, this.c, this.d, dt1.k(this.e, paramqs1, paramExecutor));
  }
  
  public final sl1<O> a(long paramLong, TimeUnit paramTimeUnit) {
    ll1 ll11 = this.f;
    return new sl1(ll11, this.a, this.b, this.c, this.d, dt1.d(this.e, paramLong, paramTimeUnit, ll1.e(ll11)));
  }
  
  public final <O2> sl1<O2> b(qs1<O, O2> paramqs1) {
    return c(paramqs1, ll1.c(this.f));
  }
  
  public final <T extends Throwable> sl1<O> d(Class<T> paramClass, kl1<T, O> paramkl1) {
    return e(paramClass, new xl1(paramkl1));
  }
  
  public final <T extends Throwable> sl1<O> e(Class<T> paramClass, qs1<T, O> paramqs1) {
    ll1 ll11 = this.f;
    return new sl1(ll11, this.a, this.b, this.c, this.d, dt1.l(this.e, paramClass, paramqs1, ll1.c(ll11)));
  }
  
  public final ml1<E, O> f() {
    E e = this.a;
    String str1 = this.b;
    String str2 = str1;
    if (str1 == null)
      str2 = this.f.h(e); 
    ml1<E, O> ml1 = new ml1<E, O>(e, str2, this.e);
    ll1.f(this.f).r0(ml1);
    ot1<?> ot11 = this.c;
    wl1 wl1 = new wl1(this, ml1);
    nt1 nt1 = fm.f;
    ot11.a(wl1, nt1);
    dt1.g(ml1, new zl1(this, ml1), nt1);
    return ml1;
  }
  
  public final <O2> sl1<O2> g(kl1<O, O2> paramkl1) {
    return b(new vl1(paramkl1));
  }
  
  public final <O2> sl1<O2> h(ot1<O2> paramot1) {
    return c(new ul1(paramot1), fm.f);
  }
  
  public final sl1<O> i(String paramString) {
    return new sl1(this.f, this.a, paramString, this.c, this.d, this.e);
  }
  
  public final sl1<O> j(E paramE) {
    ml1<E, O> ml1 = f();
    return this.f.b(paramE, ml1);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sl1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */