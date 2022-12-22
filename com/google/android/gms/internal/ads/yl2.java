package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class yl2 {
  private static MessageDigest a;
  
  protected Object b = new Object();
  
  abstract byte[] a(String paramString);
  
  protected final MessageDigest b() {
    synchronized (this.b) {
      MessageDigest messageDigest = a;
      if (messageDigest != null)
        return messageDigest; 
      byte b = 0;
      while (true) {
        if (b < 2) {
          try {
            a = MessageDigest.getInstance("MD5");
          } catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
          b++;
          continue;
        } 
        messageDigest = a;
        return messageDigest;
      } 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yl2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */