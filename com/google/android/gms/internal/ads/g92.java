package com.google.android.gms.internal.ads;

public final class g92 {
  public static <T> T a(T paramT) {
    paramT.getClass();
    return paramT;
  }
  
  public static <T> T b(T paramT, String paramString) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException(paramString);
  }
  
  public static <T> void c(T paramT, Class<T> paramClass) {
    if (paramT != null)
      return; 
    throw new IllegalStateException(String.valueOf(paramClass.getCanonicalName()).concat(" must be set"));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/g92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */