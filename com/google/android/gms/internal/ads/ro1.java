package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

final class ro1 implements kp1 {
  ro1(qm1 paramqm1, on1 paramon1) {}
  
  public final boolean a(File paramFile) {
    try {
      return this.a.a(paramFile);
    } catch (GeneralSecurityException generalSecurityException) {
      return false;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ro1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */