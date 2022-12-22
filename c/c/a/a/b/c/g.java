package c.c.a.a.b.c;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Queue;

public final class g {
  private static final OutputStream a = new e();
  
  public static byte[] a(InputStream paramInputStream) {
    byte[] arrayOfByte;
    ArrayDeque<byte[]> arrayDeque = new ArrayDeque(20);
    int i = 8192;
    int j = 0;
    while (j < 2147483639) {
      int k = Math.min(i, 2147483639 - j);
      byte[] arrayOfByte1 = new byte[k];
      arrayDeque.add(arrayOfByte1);
      int m = 0;
      while (m < k) {
        int n = paramInputStream.read(arrayOfByte1, m, k - m);
        if (n == -1) {
          arrayOfByte = c((Queue<byte[]>)arrayDeque, j);
          // Byte code: goto -> 165
        } 
        m += n;
        j += n;
      } 
      long l = i;
      l += l;
      if (l > 2147483647L) {
        i = Integer.MAX_VALUE;
        continue;
      } 
      if (l < -2147483648L) {
        i = Integer.MIN_VALUE;
        continue;
      } 
      i = (int)l;
    } 
    if (arrayOfByte.read() == -1)
      return c((Queue<byte[]>)arrayDeque, 2147483639); 
    OutOfMemoryError outOfMemoryError = new OutOfMemoryError("input is too large to fit in a byte array");
    throw outOfMemoryError;
  }
  
  public static InputStream b(InputStream paramInputStream, long paramLong) {
    return new f(paramInputStream, 1048577L);
  }
  
  private static byte[] c(Queue<byte[]> paramQueue, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    for (int i = paramInt; i > 0; i -= j) {
      byte[] arrayOfByte1 = paramQueue.remove();
      int j = Math.min(i, arrayOfByte1.length);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte, paramInt - i, j);
    } 
    return arrayOfByte;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/c/c/a/a/b/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */