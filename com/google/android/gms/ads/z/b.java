package com.google.android.gms.ads.z;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.e;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.ads.bj;

public class b {
  private bj a = null;
  
  protected b() {}
  
  @Deprecated
  public b(Context paramContext, String paramString) {
    t.k(paramContext, "context cannot be null");
    t.k(paramString, "adUnitID cannot be null");
    this.a = new bj(paramContext, paramString);
  }
  
  @Deprecated
  public boolean a() {
    bj bj1 = this.a;
    return (bj1 != null) ? bj1.a() : false;
  }
  
  @Deprecated
  public void b(e parame, d paramd) {
    bj bj1 = this.a;
    if (bj1 != null)
      bj1.d(parame.a(), paramd); 
  }
  
  @Deprecated
  public void c(Activity paramActivity, c paramc) {
    bj bj1 = this.a;
    if (bj1 != null)
      bj1.c(paramActivity, paramc); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/z/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */