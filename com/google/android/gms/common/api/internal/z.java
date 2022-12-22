package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

final class z implements Runnable {
  z(f.b paramb, ConnectionResult paramConnectionResult) {}
  
  public final void run() {
    f.a a = (f.a)f.v(this.c.f).get(f.b.d(this.c));
    if (a == null)
      return; 
    if (this.b.s0()) {
      f.b.e(this.c, true);
      if (f.b.f(this.c).q()) {
        f.b.h(this.c);
        return;
      } 
      try {
        f.b.f(this.c).e(null, f.b.f(this.c).d());
        return;
      } catch (SecurityException securityException) {
        Log.e("GoogleApiManager", "Failed to get service from broker. ", securityException);
        a.i1(new ConnectionResult(10));
        return;
      } 
    } 
    a.i1(this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */