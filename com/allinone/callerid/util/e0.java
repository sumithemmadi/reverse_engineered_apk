package com.allinone.callerid.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class e0 {
  private static String a(MessageDigest paramMessageDigest) {
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b : paramMessageDigest.digest()) {
      stringBuilder.append(Integer.toHexString(b >> 4 & 0xF));
      stringBuilder.append(Integer.toHexString(b & 0xF));
    } 
    return stringBuilder.toString();
  }
  
  public static String b(String paramString) {
    try {
      MessageDigest messageDigest = MessageDigest.getInstance("MD5");
      messageDigest.update(paramString.getBytes());
      return a(messageDigest);
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      noSuchAlgorithmException.printStackTrace();
      return null;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */