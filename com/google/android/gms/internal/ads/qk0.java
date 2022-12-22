package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.t;

public final class qk0 extends t.a {
  private final pf0 a;
  
  public qk0(pf0 parampf0) {
    this.a = parampf0;
  }
  
  private static ot2 f(pf0 parampf0) {
    nt2 nt2 = parampf0.n();
    if (nt2 == null)
      return null; 
    try {
      return nt2.d5();
    } catch (RemoteException remoteException) {
      return null;
    } 
  }
  
  public final void a() {
    ot2 ot2 = f(this.a);
    if (ot2 == null)
      return; 
    try {
      ot2.N0();
      return;
    } catch (RemoteException remoteException) {
      cm.d("Unable to call onVideoEnd()", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void c() {
    ot2 ot2 = f(this.a);
    if (ot2 == null)
      return; 
    try {
      ot2.q0();
      return;
    } catch (RemoteException remoteException) {
      cm.d("Unable to call onVideoEnd()", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void e() {
    ot2 ot2 = f(this.a);
    if (ot2 == null)
      return; 
    try {
      ot2.I6();
      return;
    } catch (RemoteException remoteException) {
      cm.d("Unable to call onVideoEnd()", (Throwable)remoteException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qk0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */