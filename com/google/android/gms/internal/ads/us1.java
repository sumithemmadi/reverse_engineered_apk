package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

final class us1<V> extends zzdyo<Object, V> {
  private zzdza<?> q;
  
  us1(zzdwy<? extends ot1<?>> paramzzdwy, boolean paramBoolean, Executor paramExecutor, Callable<V> paramCallable) {
    super(paramzzdwy, paramBoolean, false);
    this.q = new zzdzb(this, paramCallable, paramExecutor);
    Q();
  }
  
  final void N(zzdyo.zza paramzza) {
    super.N(paramzza);
    if (paramzza == zzdyo.zza.b)
      this.q = null; 
  }
  
  final void R() {
    zzdza<?> zzdza1 = this.q;
    if (zzdza1 != null)
      zzdza1.execute(); 
  }
  
  final void S(int paramInt, Object paramObject) {}
  
  protected final void f() {
    zzdza<?> zzdza1 = this.q;
    if (zzdza1 != null)
      zzdza1.interruptTask(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/us1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */