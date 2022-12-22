package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

final class pk0<T> implements x6<Object> {
  private final WeakReference<T> a;
  
  private final String b;
  
  private final x6<T> c;
  
  private pk0(dk0 paramdk0, WeakReference<T> paramWeakReference, String paramString, x6<T> paramx6) {
    this.a = paramWeakReference;
    this.b = paramString;
    this.c = paramx6;
  }
  
  public final void a(Object paramObject, Map<String, String> paramMap) {
    paramObject = this.a.get();
    if (paramObject == null) {
      this.d.i(this.b, this);
      return;
    } 
    this.c.a((T)paramObject, paramMap);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pk0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */