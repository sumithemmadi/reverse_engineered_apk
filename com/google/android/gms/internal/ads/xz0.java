package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class xz0 implements ov0<vk0, xi1, fx0> {
  private final Context a;
  
  private final Executor b;
  
  private final cl0 c;
  
  public xz0(Context paramContext, Executor paramExecutor, cl0 paramcl0) {
    this.a = paramContext;
    this.b = paramExecutor;
    this.c = paramcl0;
  }
  
  private static void e(ci1 paramci1, nh1 paramnh1, jv0<xi1, fx0> paramjv0) {
    try {
      ((xi1)paramjv0.b).s(paramci1.a.a.d, paramnh1.u.toString());
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
  
  public final void b(ci1 paramci1, nh1 paramnh1, jv0<xi1, fx0> paramjv0) {
    if (!((xi1)paramjv0.b).d()) {
      a01 a01 = new a01(this, paramci1, paramnh1, paramjv0);
      ((fx0)paramjv0.c).U9(a01);
      ((xi1)paramjv0.b).n(this.a, paramci1.a.a.d, null, (fi)paramjv0.c, paramnh1.u.toString());
      return;
    } 
    e(paramci1, paramnh1, paramjv0);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */