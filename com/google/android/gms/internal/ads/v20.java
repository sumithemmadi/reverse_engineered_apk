package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.p;
import java.util.concurrent.Executor;

public final class v20 implements a92<gb0<p>> {
  private final m92<g70> a;
  
  private final m92<Executor> b;
  
  private v20(m92<g70> paramm92, m92<Executor> paramm921) {
    this.a = paramm92;
    this.b = paramm921;
  }
  
  public static v20 a(m92<g70> paramm92, m92<Executor> paramm921) {
    return new v20(paramm92, paramm921);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/v20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */