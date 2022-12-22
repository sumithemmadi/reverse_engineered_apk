package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

public final class vu1 {
  private static final CopyOnWriteArrayList<su1> a = new CopyOnWriteArrayList<su1>();
  
  public static su1 a(String paramString) {
    for (su1 su1 : a) {
      if (su1.b(paramString))
        return su1; 
    } 
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      paramString = "No KMS client does support: ".concat(paramString);
    } else {
      paramString = new String("No KMS client does support: ");
    } 
    GeneralSecurityException generalSecurityException = new GeneralSecurityException(paramString);
    throw generalSecurityException;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vu1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */