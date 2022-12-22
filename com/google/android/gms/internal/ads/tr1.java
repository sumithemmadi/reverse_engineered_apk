package com.google.android.gms.internal.ads;

public final class tr1 {
  static Object a(Object paramObject, int paramInt) {
    if (paramObject != null)
      return paramObject; 
    paramObject = new StringBuilder(20);
    paramObject.append("at index ");
    paramObject.append(paramInt);
    throw new NullPointerException(paramObject.toString());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tr1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */