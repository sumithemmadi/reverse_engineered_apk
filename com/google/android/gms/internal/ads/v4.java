package com.google.android.gms.internal.ads;

public final class v4<T> {
  public final T a = null;
  
  public final hh2 b = null;
  
  public final zzap c;
  
  public boolean d = false;
  
  private v4(zzap paramzzap) {
    this.c = paramzzap;
  }
  
  private v4(T paramT, hh2 paramhh2) {
    this.c = null;
  }
  
  public static <T> v4<T> b(T paramT, hh2 paramhh2) {
    return new v4<T>(paramT, paramhh2);
  }
  
  public static <T> v4<T> c(zzap paramzzap) {
    return new v4<T>(paramzzap);
  }
  
  public final boolean a() {
    return (this.c == null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/v4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */