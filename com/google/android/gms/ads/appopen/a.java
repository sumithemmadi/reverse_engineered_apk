package com.google.android.gms.ads.appopen;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.j;
import com.google.android.gms.ads.l;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.ads.an2;
import com.google.android.gms.internal.ads.um2;
import com.google.android.gms.internal.ads.xr2;

public abstract class a {
  public static void a(Context paramContext, String paramString, e parame, int paramInt, a parama) {
    t.k(paramContext, "Context cannot be null.");
    t.k(paramString, "adUnitId cannot be null.");
    t.k(parame, "AdRequest cannot be null.");
    (new an2(paramContext, paramString, parame.a(), paramInt, parama)).a();
  }
  
  @Deprecated
  public abstract void b(Activity paramActivity, j paramj);
  
  protected abstract void c(um2 paramum2);
  
  protected abstract xr2 d();
  
  public static class a extends c<a> {
    @Deprecated
    public void c(int param1Int) {}
    
    @Deprecated
    public void d(l param1l) {
      throw null;
    }
    
    @Deprecated
    public void e(a param1a) {
      throw null;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/appopen/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */