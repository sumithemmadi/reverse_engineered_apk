package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

final class zzdzb extends zzdza<V> {
  private final Callable<V> zziai;
  
  zzdzb(us1 paramus1, Callable<V> paramCallable, Executor paramExecutor) {
    super(paramus1, paramExecutor);
    this.zziai = xq1.<Callable<V>>b(paramCallable);
  }
  
  final void setValue(V paramV) {
    this.zziah.i(paramV);
  }
  
  final V zzbab() {
    return this.zziai.call();
  }
  
  final String zzbac() {
    return this.zziai.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */