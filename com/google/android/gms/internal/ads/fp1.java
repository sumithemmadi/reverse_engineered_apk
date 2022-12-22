package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.k;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public final class fp1 {
  public static File a(File paramFile, boolean paramBoolean) {
    if (paramBoolean && paramFile.exists() && !paramFile.isDirectory())
      paramFile.delete(); 
    if (!paramFile.exists())
      paramFile.mkdirs(); 
    return paramFile;
  }
  
  public static File b(String paramString, File paramFile) {
    return TextUtils.isEmpty(paramString) ? null : a(new File(paramFile, paramString), false);
  }
  
  public static File c(String paramString1, String paramString2, File paramFile) {
    return (TextUtils.isEmpty(paramString1) || TextUtils.isEmpty(paramString2)) ? null : new File(b(paramString1, paramFile), paramString2);
  }
  
  public static boolean d(File paramFile, byte[] paramArrayOfbyte) {
    Closeable closeable2;
    Closeable closeable1 = null;
    byte[] arrayOfByte = null;
    try {
      closeable2 = new FileOutputStream();
    } catch (IOException iOException) {
    
    } finally {
      paramArrayOfbyte = arrayOfByte;
      k.a((Closeable)paramArrayOfbyte);
    } 
    k.a(closeable2);
    return false;
  }
  
  public static boolean e(File paramFile) {
    boolean bool;
    if (!paramFile.exists())
      return true; 
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile != null) {
      int i = arrayOfFile.length;
      byte b = 0;
      boolean bool1 = true;
      while (true) {
        bool = bool1;
        if (b < i) {
          File file = arrayOfFile[b];
          if (file != null && e(file) && bool1) {
            bool1 = true;
          } else {
            bool1 = false;
          } 
          b++;
          continue;
        } 
        break;
      } 
    } else {
      bool = true;
    } 
    return (paramFile.delete() && bool);
  }
  
  public static byte[] f(File paramFile) {
    Closeable closeable2;
    Closeable closeable1 = null;
    try {
      closeable2 = new FileInputStream();
      this(paramFile);
      try {
        return arrayOfByte;
      } catch (IOException iOException) {
      
      } finally {}
      k.a(closeable2);
      throw paramFile;
    } catch (IOException iOException) {
    
    } finally {
      closeable2 = closeable1;
      k.a(closeable2);
    } 
    k.a(closeable2);
    return null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fp1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */