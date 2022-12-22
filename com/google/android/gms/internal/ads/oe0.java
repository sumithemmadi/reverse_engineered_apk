package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

final class oe0 implements x6<Object> {
  private WeakReference<ne0> a;
  
  private oe0(ne0 paramne0) {
    this.a = new WeakReference<ne0>(paramne0);
  }
  
  public final void a(Object paramObject, Map<String, String> paramMap) {
    paramObject = this.a.get();
    if (paramObject == null)
      return; 
    ne0.t((ne0)paramObject).x();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/oe0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */