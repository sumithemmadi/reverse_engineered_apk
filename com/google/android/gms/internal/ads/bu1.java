package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

final class bu1<V> extends xs1<V> implements RunnableFuture<V> {
  private volatile zzdzs<?> i;
  
  bu1(rs1<V> paramrs1) {
    this.i = new zzeak(this, paramrs1);
  }
  
  private bu1(Callable<V> paramCallable) {
    this.i = new zzeaj(this, paramCallable);
  }
  
  static <V> bu1<V> I(Runnable paramRunnable, V paramV) {
    return new bu1<V>(Executors.callable(paramRunnable, paramV));
  }
  
  static <V> bu1<V> J(Callable<V> paramCallable) {
    return new bu1<V>(paramCallable);
  }
  
  protected final void c() {
    super.c();
    if (l()) {
      zzdzs<?> zzdzs1 = this.i;
      if (zzdzs1 != null)
        zzdzs1.interruptTask(); 
    } 
    this.i = null;
  }
  
  protected final String h() {
    zzdzs<?> zzdzs1 = this.i;
    if (zzdzs1 != null) {
      String str = String.valueOf(zzdzs1);
      StringBuilder stringBuilder = new StringBuilder(str.length() + 7);
      stringBuilder.append("task=[");
      stringBuilder.append(str);
      stringBuilder.append("]");
      return stringBuilder.toString();
    } 
    return super.h();
  }
  
  public final void run() {
    zzdzs<?> zzdzs1 = this.i;
    if (zzdzs1 != null)
      zzdzs1.run(); 
    this.i = null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bu1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */