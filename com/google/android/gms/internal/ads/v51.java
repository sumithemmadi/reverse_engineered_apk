package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

public final class v51 implements s91<t91<Bundle>> {
  private final Executor a;
  
  private final fl b;
  
  v51(Executor paramExecutor, fl paramfl) {
    this.a = paramExecutor;
    this.b = paramfl;
  }
  
  public final ot1<t91<Bundle>> a() {
    x<Boolean> x = m0.V1;
    return ((Boolean)er2.e().<Boolean>c(x)).booleanValue() ? dt1.h(null) : dt1.j(this.b.s(), u51.a, this.a);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/v51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */