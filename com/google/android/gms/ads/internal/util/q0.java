package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.em;

public final class q0 extends a {
  private final em d;
  
  private final String e;
  
  public q0(Context paramContext, String paramString1, String paramString2) {
    this(paramString2, q.c().r0(paramContext, paramString1));
  }
  
  private q0(String paramString1, String paramString2) {
    this.d = new em(paramString2);
    this.e = paramString1;
  }
  
  public final void b() {
    this.d.a(this.e);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/q0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */