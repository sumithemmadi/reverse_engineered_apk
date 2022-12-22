package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

final class ax1 {
  public static zzehz a(zzefs paramzzefs) {
    int i = dx1.b[paramzzefs.ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i == 3)
          return zzehz.d; 
        String str = String.valueOf(paramzzefs);
        StringBuilder stringBuilder = new StringBuilder(str.length() + 20);
        stringBuilder.append("unknown curve type: ");
        stringBuilder.append(str);
        throw new GeneralSecurityException(stringBuilder.toString());
      } 
      return zzehz.c;
    } 
    return zzehz.b;
  }
  
  public static zzeic b(zzefe paramzzefe) {
    int i = dx1.c[paramzzefe.ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i == 3)
          return zzeic.c; 
        String str = String.valueOf(paramzzefe);
        StringBuilder stringBuilder = new StringBuilder(str.length() + 22);
        stringBuilder.append("unknown point format: ");
        stringBuilder.append(str);
        throw new GeneralSecurityException(stringBuilder.toString());
      } 
      return zzeic.d;
    } 
    return zzeic.b;
  }
  
  public static String c(zzeft paramzzeft) {
    int i = dx1.a[paramzzeft.ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i == 3)
          return "HmacSha512"; 
        String str = String.valueOf(paramzzeft);
        StringBuilder stringBuilder = new StringBuilder(str.length() + 27);
        stringBuilder.append("hash unsupported for HMAC: ");
        stringBuilder.append(str);
        throw new NoSuchAlgorithmException(stringBuilder.toString());
      } 
      return "HmacSha256";
    } 
    return "HmacSha1";
  }
  
  public static void d(ez1 paramez1) {
    n12.d(a(paramez1.J().J()));
    c(paramez1.J().K());
    if (paramez1.L() != zzefe.b) {
      dv1.e(paramez1.K().J());
      return;
    } 
    throw new GeneralSecurityException("unknown EC point format");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ax1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */