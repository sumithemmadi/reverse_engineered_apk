package com.google.android.gms.internal.ads;

final class j0 implements u2 {
  j0(i0 parami0) {}
  
  public final Boolean a(String paramString, boolean paramBoolean) {
    return Boolean.valueOf(i0.b(this.a).getBoolean(paramString, paramBoolean));
  }
  
  public final String b(String paramString1, String paramString2) {
    return i0.b(this.a).getString(paramString1, paramString2);
  }
  
  public final Double c(String paramString, double paramDouble) {
    return Double.valueOf(i0.b(this.a).getFloat(paramString, (float)paramDouble));
  }
  
  public final Long getLong(String paramString, long paramLong) {
    try {
      long l = i0.b(this.a).getLong(paramString, paramLong);
      return Long.valueOf(l);
    } catch (ClassCastException classCastException) {
      return Long.valueOf(i0.b(this.a).getInt(paramString, (int)paramLong));
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/j0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */