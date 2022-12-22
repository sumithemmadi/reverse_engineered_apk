package com.google.android.gms.internal.ads;

import java.util.Map;

final class n6 implements x6<Object> {
  public final void a(Object paramObject, Map<String, String> paramMap) {
    paramObject = String.valueOf(paramMap.get("string"));
    if (paramObject.length() != 0) {
      paramObject = "Received log message: ".concat((String)paramObject);
    } else {
      paramObject = new String("Received log message: ");
    } 
    cm.h((String)paramObject);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/n6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */