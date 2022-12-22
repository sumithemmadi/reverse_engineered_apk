package com.google.android.gms.internal.ads;

public final class d40 implements a92<String> {
  private final w30 a;
  
  private final m92<d20> b;
  
  private d40(w30 paramw30, m92<d20> paramm92) {
    this.a = paramw30;
    this.b = paramm92;
  }
  
  public static String a(w30 paramw30, d20 paramd20) {
    return g92.<String>b(paramd20.r(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public static d40 b(w30 paramw30, m92<d20> paramm92) {
    return new d40(paramw30, paramm92);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/d40.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */