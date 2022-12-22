package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.y.c;

public final class ci implements c {
  private final rh a;
  
  private final Context b;
  
  private final Object c = new Object();
  
  private final bi d = new bi(null);
  
  public ci(Context paramContext, rh paramrh) {
    rh rh1 = paramrh;
    if (paramrh == null)
      rh1 = new l(); 
    this.a = rh1;
    this.b = paramContext.getApplicationContext();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */