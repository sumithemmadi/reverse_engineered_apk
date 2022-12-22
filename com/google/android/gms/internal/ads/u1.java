package com.google.android.gms.internal.ads;

public final class u1<T> extends t1<T> {
  protected u1(String paramString, T paramT, Integer paramInteger) {
    super(paramString, paramT, paramInteger);
  }
  
  public static t1<Boolean> d(String paramString, boolean paramBoolean) {
    return new u1<Boolean>(paramString, Boolean.TRUE, v1.a);
  }
  
  public final T a() {
    if (t2.b.get())
      return super.a(); 
    throw new IllegalStateException("Striped code is accessed: 54c42518-856a-44fb-aae0-cd6676d514e5");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/u1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */