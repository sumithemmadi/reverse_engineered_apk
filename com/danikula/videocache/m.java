package com.danikula.videocache;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.slf4j.b;
import org.slf4j.c;

public class m {
  private static final b a = c.i("ProxyCacheUtils");
  
  static void a(byte[] paramArrayOfbyte, long paramLong, int paramInt) {
    boolean bool2;
    k.e(paramArrayOfbyte, "Buffer must be not null!");
    boolean bool1 = true;
    if (paramLong >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    k.c(bool2, "Data offset must be positive!");
    if (paramInt >= 0 && paramInt <= paramArrayOfbyte.length) {
      bool2 = bool1;
    } else {
      bool2 = false;
    } 
    k.c(bool2, "Length must be in range [0..buffer.length]");
  }
  
  private static String b(byte[] paramArrayOfbyte) {
    StringBuffer stringBuffer = new StringBuffer();
    int i = paramArrayOfbyte.length;
    for (byte b1 = 0; b1 < i; b1++) {
      stringBuffer.append(String.format("%02x", new Object[] { Byte.valueOf(paramArrayOfbyte[b1]) }));
    } 
    return stringBuffer.toString();
  }
  
  static void c(Closeable paramCloseable) {
    if (paramCloseable != null)
      try {
        paramCloseable.close();
      } catch (IOException iOException) {
        a.error("Error closing resource", iOException);
      }  
  }
  
  public static String d(String paramString) {
    try {
      return b(MessageDigest.getInstance("MD5").digest(paramString.getBytes()));
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      throw new IllegalStateException(noSuchAlgorithmException);
    } 
  }
  
  static String e(String paramString) {
    try {
      return URLDecoder.decode(paramString, "utf-8");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new RuntimeException("Error decoding url", unsupportedEncodingException);
    } 
  }
  
  static String f(String paramString) {
    try {
      return URLEncoder.encode(paramString, "utf-8");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new RuntimeException("Error encoding url", unsupportedEncodingException);
    } 
  }
  
  static String g(String paramString) {
    MimeTypeMap mimeTypeMap = MimeTypeMap.getSingleton();
    paramString = MimeTypeMap.getFileExtensionFromUrl(paramString);
    if (TextUtils.isEmpty(paramString)) {
      paramString = null;
    } else {
      paramString = mimeTypeMap.getMimeTypeFromExtension(paramString);
    } 
    return paramString;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/danikula/videocache/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */