package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import com.google.android.gms.common.k.c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class a {
  static {
  
  }
  
  public static byte[] a(Context paramContext, String paramString) {
    PackageInfo packageInfo = c.a(paramContext).e(paramString, 64);
    Signature[] arrayOfSignature = packageInfo.signatures;
    if (arrayOfSignature != null && arrayOfSignature.length == 1) {
      MessageDigest messageDigest = b("SHA1");
      if (messageDigest != null)
        return messageDigest.digest(packageInfo.signatures[0].toByteArray()); 
    } 
    return null;
  }
  
  public static MessageDigest b(String paramString) {
    byte b = 0;
    while (true) {
      if (b < 2) {
        try {
          MessageDigest messageDigest = MessageDigest.getInstance(paramString);
          if (messageDigest != null)
            return messageDigest; 
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
        b++;
        continue;
      } 
      return null;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/util/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */