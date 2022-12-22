package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class kx1 {
  private static final String a = (new gx1()).a();
  
  @Deprecated
  private static final o02 b;
  
  @Deprecated
  private static final o02 c;
  
  @Deprecated
  private static final o02 d;
  
  static {
    o02 o021 = o02.K();
    b = o021;
    c = o021;
    d = o021;
    try {
      a();
      return;
    } catch (GeneralSecurityException generalSecurityException) {
      throw new ExceptionInInitializerError(generalSecurityException);
    } 
  }
  
  public static void a() {
    dv1.k(new gx1(), true);
    dv1.k(new fx1(), true);
    dv1.l(new nx1());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kx1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */