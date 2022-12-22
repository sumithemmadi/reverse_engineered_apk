package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;

public class q {
  private static String a;
  
  private static int b;
  
  public static String a() {
    if (a == null) {
      if (b == 0)
        b = Process.myPid(); 
      a = c(b);
    } 
    return a;
  }
  
  private static BufferedReader b(String paramString) {
    StrictMode.ThreadPolicy threadPolicy = StrictMode.allowThreadDiskReads();
    try {
      FileReader fileReader = new FileReader();
      this(paramString);
      return new BufferedReader(fileReader);
    } finally {
      StrictMode.setThreadPolicy(threadPolicy);
    } 
  }
  
  private static String c(int paramInt) {
    Closeable closeable;
    null = null;
    if (paramInt <= 0)
      return null; 
    try {
      StringBuilder stringBuilder = new StringBuilder();
      this(25);
      stringBuilder.append("/proc/");
      stringBuilder.append(paramInt);
      stringBuilder.append("/cmdline");
      closeable = b(stringBuilder.toString());
      try {
        return str;
      } catch (IOException iOException) {
      
      } finally {}
      k.a(closeable);
      throw null;
    } catch (IOException iOException) {
    
    } finally {
      closeable = null;
      k.a(closeable);
    } 
    k.a(closeable);
    return (String)SYNTHETIC_LOCAL_VARIABLE_1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/util/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */