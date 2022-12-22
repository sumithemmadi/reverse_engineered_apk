package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

final class re0 implements x6<Object> {
  private WeakReference<ne0> a;
  
  private re0(ne0 paramne0) {
    this.a = new WeakReference<ne0>(paramne0);
  }
  
  public final void a(Object paramObject, Map<String, String> paramMap) {
    paramObject = this.a.get();
    if (paramObject == null)
      return; 
    ne0.p((ne0)paramObject).S();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/re0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */