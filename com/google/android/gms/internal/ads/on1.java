package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

public final class on1 {
  private static final byte[] a = new byte[] { 
      61, 122, 18, 35, 1, -102, -93, -99, -98, -96, 
      -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 
      121, -12, -34, 95, -25, -62, 63, 50, 108, -113, 
      -103, 74 };
  
  private static final byte[] b = new byte[] { 
      16, 57, 56, -18, 69, 55, -27, -98, -114, -25, 
      -110, -10, 84, 80, 79, -72, 52, 111, -58, -77, 
      70, -48, -69, -60, 65, 95, -61, 57, -4, -4, 
      -114, -63 };
  
  private final byte[] c = b;
  
  private final byte[] d = a;
  
  private static X509Certificate b(String paramString) {
    try {
      X509Certificate[][] arrayOfX509Certificate = qm.h(paramString);
      if (arrayOfX509Certificate.length == 1)
        return arrayOfX509Certificate[0][0]; 
      throw new GeneralSecurityException("APK has more than one signature.");
    } catch (zzh zzh) {
      throw new GeneralSecurityException("Package is not signed", zzh);
    } catch (IOException iOException) {
      throw new GeneralSecurityException("Failed to verify signatures", iOException);
    } catch (RuntimeException runtimeException) {
      throw new GeneralSecurityException("Failed to verify signatures", runtimeException);
    } 
  }
  
  public final boolean a(File paramFile) {
    X509Certificate x509Certificate = b(paramFile.getAbsolutePath());
    byte[] arrayOfByte = MessageDigest.getInstance("SHA-256").digest(x509Certificate.getEncoded());
    return (Arrays.equals(this.d, arrayOfByte) || (!"user".equals(Build.TYPE) && Arrays.equals(this.c, arrayOfByte)));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/on1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */