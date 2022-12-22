package com.google.android.gms.internal.ads;

public final class x82<T> implements a92<T> {
  private m92<T> a;
  
  public static <T> void a(m92<T> paramm921, m92<T> paramm922) {
    g92.a(paramm922);
    paramm921 = paramm921;
    if (((x82)paramm921).a == null) {
      ((x82)paramm921).a = paramm922;
      return;
    } 
    throw new IllegalStateException();
  }
  
  public final T get() {
    m92<T> m921 = this.a;
    if (m921 != null)
      return m921.get(); 
    throw new IllegalStateException();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/x82.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */