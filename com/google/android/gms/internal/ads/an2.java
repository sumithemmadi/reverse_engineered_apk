package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.a;

public final class an2 {
  private xr2 a;
  
  private final Context b;
  
  private final String c;
  
  private final ut2 d;
  
  private final int e;
  
  private final a.a f;
  
  private final nb g = new nb();
  
  private final lq2 h;
  
  public an2(Context paramContext, String paramString, ut2 paramut2, int paramInt, a.a parama) {
    this.b = paramContext;
    this.c = paramString;
    this.d = paramut2;
    this.e = paramInt;
    this.f = parama;
    this.h = lq2.a;
  }
  
  public final void a() {
    try {
      zzvs zzvs = zzvs.t0();
      this.a = er2.b().c(this.b, zzvs, this.c, this.g);
      zzvx zzvx = new zzvx();
      this(this.e);
      this.a.Z7(zzvx);
      xr2 xr21 = this.a;
      km2 km2 = new km2();
      this(this.f, this.c);
      xr21.h3(km2);
      this.a.o7(lq2.a(this.b, this.d));
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/an2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */