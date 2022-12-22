package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class dz0 implements ov0<vk0, xi1, cx0> {
  private final Context a;
  
  private final Executor b;
  
  private final cl0 c;
  
  public dz0(Context paramContext, Executor paramExecutor, cl0 paramcl0) {
    this.a = paramContext;
    this.b = paramExecutor;
    this.c = paramcl0;
  }
  
  public final void b(ci1 paramci1, nh1 paramnh1, jv0<xi1, cx0> paramjv0) {
    try {
      gi1 gi1 = paramci1.a.a;
      if (gi1.o.a == yh1.c) {
        ((xi1)paramjv0.b).u(this.a, gi1.d, paramnh1.u.toString(), (sb)paramjv0.c);
        return;
      } 
      ((xi1)paramjv0.b).t(this.a, gi1.d, paramnh1.u.toString(), (sb)paramjv0.c);
      return;
    } catch (Exception exception) {
      String str = String.valueOf(paramjv0.a);
      if (str.length() != 0) {
        str = "Fail to load ad from adapter ".concat(str);
      } else {
        str = new String("Fail to load ad from adapter ");
      } 
      cm.d(str, exception);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */