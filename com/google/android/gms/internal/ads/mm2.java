package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.a;
import com.google.android.gms.ads.j;
import com.google.android.gms.dynamic.b;

public final class mm2 extends a {
  private final om2 a;
  
  private final String b;
  
  private final pm2 c = new pm2();
  
  private j d;
  
  public mm2(om2 paramom2, String paramString) {
    this.a = paramom2;
    this.b = paramString;
  }
  
  public final void b(Activity paramActivity, j paramj) {
    this.d = paramj;
    this.c.S9(paramj);
    if (paramActivity == null)
      cm.i("The activity for show is null, will proceed with show using the context provided when loading the ad."); 
    try {
      this.a.u3(b.a2(paramActivity), this.c);
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  protected final void c(um2 paramum2) {
    try {
      this.a.g2(paramum2);
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  protected final xr2 d() {
    try {
      return this.a.b5();
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return null;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */