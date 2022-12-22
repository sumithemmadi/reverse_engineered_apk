package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

public final class iy0 implements ov0<ff0, kd, cx0> {
  private final Context a;
  
  private final ce0 b;
  
  private fc c;
  
  public iy0(Context paramContext, ce0 paramce0) {
    this.a = paramContext;
    this.b = paramce0;
  }
  
  public final void b(ci1 paramci1, nh1 paramnh1, jv0<kd, cx0> paramjv0) {
    try {
      ((kd)paramjv0.b).G1(paramnh1.T);
      kd kd = (kd)paramjv0.b;
      String str2 = paramnh1.O;
      String str1 = paramnh1.u.toString();
      zzvl zzvl = paramci1.a.a.d;
      a a = b.a2(this.a);
      ky0 ky0 = new ky0();
      this(this, paramjv0, null);
      kd.U3(str2, str1, zzvl, a, ky0, (sb)paramjv0.c);
      return;
    } catch (RemoteException remoteException) {
      throw new zzdnt(remoteException);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/iy0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */