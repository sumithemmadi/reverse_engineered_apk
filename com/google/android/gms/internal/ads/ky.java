package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

public final class ky extends rm2 {
  private final ly b;
  
  private final xr2 c;
  
  private final yc1 d;
  
  private boolean e = false;
  
  public ky(ly paramly, xr2 paramxr2, yc1 paramyc1) {
    this.b = paramly;
    this.c = paramxr2;
    this.d = paramyc1;
  }
  
  public final xr2 b5() {
    return this.c;
  }
  
  public final void g2(um2 paramum2) {}
  
  public final void o(boolean paramBoolean) {
    this.e = paramBoolean;
  }
  
  public final ht2 p() {
    x<Boolean> x = m0.p5;
    return !((Boolean)er2.e().<Boolean>c(x)).booleanValue() ? null : this.b.d();
  }
  
  public final void u3(a parama, zm2 paramzm2) {
    try {
      this.d.d(paramzm2);
      this.b.g((Activity)b.o1(parama), paramzm2, this.e);
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */