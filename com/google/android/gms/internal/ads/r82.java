package com.google.android.gms.internal.ads;

public abstract class r82 {
  public static r82 b(Class paramClass) {
    return (r82)(System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new o82(paramClass.getSimpleName()) : new q82(paramClass.getSimpleName()));
  }
  
  public abstract void a(String paramString);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/r82.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */