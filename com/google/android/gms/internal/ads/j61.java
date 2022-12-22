package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class j61 implements s91<t91<Bundle>> {
  private final le1 a;
  
  j61(le1 paramle1) {
    this.a = paramle1;
  }
  
  public final ot1<t91<Bundle>> a() {
    le1 le11 = this.a;
    if (le11 != null && le11.a() != null && !this.a.a().isEmpty()) {
      m61 m61 = new m61(this);
    } else {
      le11 = null;
    } 
    return (ot1)dt1.h(le11);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/j61.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */