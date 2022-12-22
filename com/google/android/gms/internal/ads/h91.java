package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class h91 implements s91<t91<Bundle>> {
  private final boolean a;
  
  h91(kf1 paramkf1) {
    if (paramkf1 != null) {
      this.a = true;
      return;
    } 
    this.a = false;
  }
  
  public final ot1<t91<Bundle>> a() {
    t91 t91;
    if (this.a) {
      t91 = l91.a;
    } else {
      t91 = null;
    } 
    return dt1.h(t91);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/h91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */