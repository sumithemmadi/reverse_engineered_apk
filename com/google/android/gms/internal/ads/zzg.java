package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

final class zzg extends zzj {
  private byte[] zzj;
  
  public zzg(X509Certificate paramX509Certificate, byte[] paramArrayOfbyte) {
    super(paramX509Certificate);
    this.zzj = paramArrayOfbyte;
  }
  
  public final byte[] getEncoded() {
    return this.zzj;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */