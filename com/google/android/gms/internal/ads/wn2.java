package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.d;

final class wn2 implements d.b {
  wn2(qn2 paramqn2, sm paramsm) {}
  
  public final void i1(ConnectionResult paramConnectionResult) {
    synchronized (qn2.d(this.b)) {
      sm sm1 = this.a;
      RuntimeException runtimeException = new RuntimeException();
      this("Connection failed.");
      sm1.d(runtimeException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wn2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */