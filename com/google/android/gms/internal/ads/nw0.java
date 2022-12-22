package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

public final class nw0 implements ov0<qy, kd, cx0> {
  private final Context a;
  
  private final nz b;
  
  private View c;
  
  public nw0(Context paramContext, nz paramnz) {
    this.a = paramContext;
    this.b = paramnz;
  }
  
  public final void b(ci1 paramci1, nh1 paramnh1, jv0<kd, cx0> paramjv0) {
    try {
      ((kd)paramjv0.b).G1(paramnh1.T);
      kd kd = (kd)paramjv0.b;
      String str1 = paramnh1.O;
      String str2 = paramnh1.u.toString();
      zzvl zzvl = paramci1.a.a.d;
      a a = b.a2(this.a);
      sw0 sw0 = new sw0();
      this(this, paramjv0, null);
      kd.I4(str1, str2, zzvl, a, sw0, (sb)paramjv0.c, paramci1.a.a.e);
      return;
    } catch (RemoteException remoteException) {
      throw new zzdnt(remoteException);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nw0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */