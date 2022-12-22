package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Queue;

public final class as1 {
  private static final OutputStream a = new ds1();
  
  public static byte[] a(InputStream paramInputStream) {
    xq1.b(paramInputStream);
    ArrayDeque<byte[]> arrayDeque = new ArrayDeque(20);
    int i = 8192;
    int j = 0;
    while (j < 2147483639) {
      int k = Math.min(i, 2147483639 - j);
      byte[] arrayOfByte = new byte[k];
      arrayDeque.add(arrayOfByte);
      int m = 0;
      while (m < k) {
        int n = paramInputStream.read(arrayOfByte, m, k - m);
        if (n == -1)
          return b((Queue<byte[]>)arrayDeque, j); 
        m += n;
        j += n;
      } 
      i = fs1.a(i, 2);
    } 
    if (paramInputStream.read() == -1)
      return b((Queue<byte[]>)arrayDeque, 2147483639); 
    OutOfMemoryError outOfMemoryError = new OutOfMemoryError("input is too large to fit in a byte array");
    throw outOfMemoryError;
  }
  
  private static byte[] b(Queue<byte[]> paramQueue, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    for (int i = paramInt; i > 0; i -= j) {
      byte[] arrayOfByte1 = paramQueue.remove();
      int j = Math.min(i, arrayOfByte1.length);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte, paramInt - i, j);
    } 
    return arrayOfByte;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/as1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */