package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

final class h22 extends ThreadLocal<Mac> {
  h22(e22 parame22) {}
  
  private final Mac a() {
    try {
      Mac mac = t12.d.a(e22.b(this.a));
      mac.init(e22.c(this.a));
      return mac;
    } catch (GeneralSecurityException generalSecurityException) {
      throw new IllegalStateException(generalSecurityException);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/h22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */