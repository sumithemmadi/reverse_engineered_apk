package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.z.b;
import com.google.android.gms.ads.z.c;
import com.google.android.gms.ads.z.d;
import com.google.android.gms.dynamic.b;

public final class bj extends b {
  private final String b;
  
  private final li c;
  
  private final Context d;
  
  private final ij e;
  
  private final dj f;
  
  public bj(Context paramContext, String paramString) {
    this.d = paramContext.getApplicationContext();
    this.b = paramString;
    this.c = er2.b().k(paramContext, paramString, new nb());
    this.e = new ij();
    this.f = new dj();
  }
  
  public final boolean a() {
    try {
      return this.c.O0();
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return false;
    } 
  }
  
  public final void c(Activity paramActivity, c paramc) {
    this.f.S9(paramc);
    try {
      this.c.d3(this.f);
      this.c.p0(b.a2(paramActivity));
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void d(ut2 paramut2, d paramd) {
    try {
      li li1 = this.c;
      zzvl zzvl = lq2.a(this.d, paramut2);
      ej ej = new ej();
      this(paramd, this);
      li1.w7(zzvl, ej);
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */