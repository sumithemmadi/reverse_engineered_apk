package com.google.android.gms.internal.ads;

import java.util.Map;

public final class c6 implements x6<Object> {
  private final b6 a;
  
  public c6(b6 paramb6) {
    this.a = paramb6;
  }
  
  public final void a(Object paramObject, Map<String, String> paramMap) {
    paramObject = paramMap.get("name");
    if (paramObject == null) {
      cm.i("App event with no name parameter.");
      return;
    } 
    this.a.n((String)paramObject, paramMap.get("info"));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/c6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */