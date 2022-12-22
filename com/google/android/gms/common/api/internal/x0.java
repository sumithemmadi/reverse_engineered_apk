package com.google.android.gms.common.api.internal;

import android.os.Bundle;

final class x0 implements Runnable {
  x0(w0 paramw0, LifecycleCallback paramLifecycleCallback, String paramString) {}
  
  public final void run() {
    if (w0.Q1(this.d) > 0) {
      Bundle bundle;
      LifecycleCallback lifecycleCallback = this.b;
      if (w0.S1(this.d) != null) {
        bundle = w0.S1(this.d).getBundle(this.c);
      } else {
        bundle = null;
      } 
      lifecycleCallback.f(bundle);
    } 
    if (w0.Q1(this.d) >= 2)
      this.b.j(); 
    if (w0.Q1(this.d) >= 3)
      this.b.h(); 
    if (w0.Q1(this.d) >= 4)
      this.b.k(); 
    if (w0.Q1(this.d) >= 5)
      this.b.g(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/x0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */