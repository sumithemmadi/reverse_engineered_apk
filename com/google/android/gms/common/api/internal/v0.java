package com.google.android.gms.common.api.internal;

import android.os.Bundle;

final class v0 implements Runnable {
  v0(zzb paramzzb, LifecycleCallback paramLifecycleCallback, String paramString) {}
  
  public final void run() {
    if (zzb.a(this.d) > 0) {
      Bundle bundle;
      LifecycleCallback lifecycleCallback = this.b;
      if (zzb.f(this.d) != null) {
        bundle = zzb.f(this.d).getBundle(this.c);
      } else {
        bundle = null;
      } 
      lifecycleCallback.f(bundle);
    } 
    if (zzb.a(this.d) >= 2)
      this.b.j(); 
    if (zzb.a(this.d) >= 3)
      this.b.h(); 
    if (zzb.a(this.d) >= 4)
      this.b.k(); 
    if (zzb.a(this.d) >= 5)
      this.b.g(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/v0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */