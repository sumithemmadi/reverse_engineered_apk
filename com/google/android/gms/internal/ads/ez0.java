package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

public final class ez0 implements ov0<vk0, kd, cx0> {
  private final Context a;
  
  private final cl0 b;
  
  public ez0(Context paramContext, cl0 paramcl0) {
    this.a = paramContext;
    this.b = paramcl0;
  }
  
  public final void b(ci1 paramci1, nh1 paramnh1, jv0<kd, cx0> paramjv0) {
    try {
      zzvl zzvl1;
      ((kd)paramjv0.b).G1(paramnh1.T);
      if (paramci1.a.a.o.a == yh1.c) {
        kd kd1 = (kd)paramjv0.b;
        String str = paramnh1.O;
        str1 = paramnh1.u.toString();
        zzvl1 = paramci1.a.a.d;
        a a1 = b.a2(this.a);
        gz0 gz01 = new gz0();
        this(this, paramjv0, null);
        kd1.B5(str, str1, zzvl1, a1, gz01, (sb)paramjv0.c);
        return;
      } 
      kd kd = (kd)paramjv0.b;
      String str2 = ((nh1)str1).O;
      String str1 = ((nh1)str1).u.toString();
      zzvl zzvl2 = ((ci1)zzvl1).a.a.d;
      a a = b.a2(this.a);
      gz0 gz0 = new gz0();
      this(this, paramjv0, null);
      kd.u4(str2, str1, zzvl2, a, gz0, (sb)paramjv0.c);
      return;
    } catch (RemoteException remoteException) {
      b1.l("Remote exception loading a rewarded RTB ad", (Throwable)remoteException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ez0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */