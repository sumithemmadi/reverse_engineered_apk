package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
public class vm<T> {
  private final sm<T> a;
  
  private final AtomicInteger b;
  
  public vm() {
    sm<T> sm1 = new sm();
    this.a = sm1;
    this.b = new AtomicInteger(0);
    dt1.g(sm1, new ym(this), fm.f);
  }
  
  @Deprecated
  public final int a() {
    return this.b.get();
  }
  
  @Deprecated
  public final void b() {
    this.a.d(new Exception());
  }
  
  @Deprecated
  public final void d(wm<T> paramwm, um paramum) {
    dt1.g(this.a, new xm(this, paramwm, paramum), fm.f);
  }
  
  @Deprecated
  public final void e(T paramT) {
    this.a.c(paramT);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */