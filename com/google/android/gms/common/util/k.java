package com.google.android.gms.common.util;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
public final class k {
  public static void a(Closeable paramCloseable) {
    if (paramCloseable != null)
      try {
        paramCloseable.close();
      } catch (IOException iOException) {} 
  }
  
  @Deprecated
  public static long b(InputStream paramInputStream, OutputStream paramOutputStream) {
    return e(paramInputStream, paramOutputStream, false);
  }
  
  @Deprecated
  public static long c(InputStream paramInputStream, OutputStream paramOutputStream, boolean paramBoolean, int paramInt) {
    null = new byte[paramInt];
    long l = 0L;
    try {
      while (true) {
        int i = paramInputStream.read(null, 0, paramInt);
        if (i != -1) {
          l += i;
          paramOutputStream.write(null, 0, i);
          continue;
        } 
        return l;
      } 
    } finally {
      if (paramBoolean) {
        a(paramInputStream);
        a(paramOutputStream);
      } 
    } 
  }
  
  @Deprecated
  public static byte[] d(InputStream paramInputStream, boolean paramBoolean) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    e(paramInputStream, byteArrayOutputStream, paramBoolean);
    return byteArrayOutputStream.toByteArray();
  }
  
  @Deprecated
  private static long e(InputStream paramInputStream, OutputStream paramOutputStream, boolean paramBoolean) {
    return c(paramInputStream, paramOutputStream, paramBoolean, 1024);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/util/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */