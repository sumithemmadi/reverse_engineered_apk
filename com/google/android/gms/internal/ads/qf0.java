package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class qf0 extends mt2 {
  private final Object b = new Object();
  
  private nt2 c;
  
  private final fc d;
  
  public qf0(nt2 paramnt2, fc paramfc) {
    this.c = paramnt2;
    this.d = paramfc;
  }
  
  public final boolean K1() {
    throw new RemoteException();
  }
  
  public final boolean K7() {
    throw new RemoteException();
  }
  
  public final float P0() {
    fc fc1 = this.d;
    return (fc1 != null) ? fc1.V2() : 0.0F;
  }
  
  public final void P2(ot2 paramot2) {
    synchronized (this.b) {
      nt2 nt21 = this.c;
      if (nt21 != null)
        nt21.P2(paramot2); 
      return;
    } 
  }
  
  public final int V() {
    throw new RemoteException();
  }
  
  public final void c1() {
    throw new RemoteException();
  }
  
  public final ot2 d5() {
    synchronized (this.b) {
      nt2 nt21 = this.c;
      if (nt21 != null)
        return nt21.d5(); 
      return null;
    } 
  }
  
  public final float getDuration() {
    fc fc1 = this.d;
    return (fc1 != null) ? fc1.n3() : 0.0F;
  }
  
  public final float k0() {
    throw new RemoteException();
  }
  
  public final void pause() {
    throw new RemoteException();
  }
  
  public final void stop() {
    throw new RemoteException();
  }
  
  public final void v3(boolean paramBoolean) {
    throw new RemoteException();
  }
  
  public final boolean w2() {
    throw new RemoteException();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qf0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */