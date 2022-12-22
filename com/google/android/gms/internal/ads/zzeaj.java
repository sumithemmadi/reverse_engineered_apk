package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final class zzeaj extends zzdzs<V> {
  private final Callable<V> zziai;
  
  zzeaj(bu1 parambu1, Callable<V> paramCallable) {
    this.zziai = xq1.<Callable<V>>b(paramCallable);
  }
  
  final boolean isDone() {
    return this.zzibd.isDone();
  }
  
  final void zzb(V paramV, Throwable paramThrowable) {
    if (paramThrowable == null) {
      this.zzibd.i(paramV);
      return;
    } 
    this.zzibd.j(paramThrowable);
  }
  
  final V zzbab() {
    return this.zziai.call();
  }
  
  final String zzbac() {
    return this.zziai.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzeaj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */