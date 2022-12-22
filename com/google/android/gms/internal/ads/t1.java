package com.google.android.gms.internal.ads;

public class t1<T> {
  private final String a;
  
  private final T b;
  
  private final int c;
  
  protected t1(String paramString, T paramT, Integer paramInteger) {
    this.a = paramString;
    this.b = paramT;
    this.c = paramInteger;
  }
  
  public static t1<Double> b(String paramString, double paramDouble) {
    return new t1<Double>(paramString, Double.valueOf(paramDouble), v1.c);
  }
  
  public static t1<Long> c(String paramString, long paramLong) {
    return new t1<Long>(paramString, Long.valueOf(paramLong), v1.b);
  }
  
  public static t1<Boolean> d(String paramString, boolean paramBoolean) {
    return new t1<Boolean>(paramString, Boolean.valueOf(paramBoolean), v1.a);
  }
  
  public static t1<String> e(String paramString1, String paramString2) {
    return new t1<String>(paramString1, paramString2, v1.d);
  }
  
  public T a() {
    u2 u2 = t2.b();
    if (u2 != null) {
      int i = s1.a[this.c - 1];
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i == 4)
              return (T)u2.b(this.a, (String)this.b); 
            throw new IllegalStateException();
          } 
          return (T)u2.c(this.a, ((Double)this.b).doubleValue());
        } 
        return (T)u2.getLong(this.a, ((Long)this.b).longValue());
      } 
      return (T)u2.a(this.a, ((Boolean)this.b).booleanValue());
    } 
    throw new IllegalStateException("Flag is not initialized.");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/t1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */