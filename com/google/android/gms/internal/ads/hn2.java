package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.d;

final class hn2 implements d.b {
  hn2(dn2 paramdn2) {}
  
  public final void i1(ConnectionResult paramConnectionResult) {
    synchronized (dn2.k(this.a)) {
      dn2.g(this.a, null);
      if (dn2.l(this.a) != null)
        dn2.f(this.a, null); 
      dn2.k(this.a).notifyAll();
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hn2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */