package com.bumptech.glide.p;

import java.io.FilterInputStream;
import java.io.InputStream;

public class h extends FilterInputStream {
  private int b = Integer.MIN_VALUE;
  
  public h(InputStream paramInputStream) {
    super(paramInputStream);
  }
  
  private long b(long paramLong) {
    int i = this.b;
    if (i == 0)
      return -1L; 
    long l = paramLong;
    if (i != Integer.MIN_VALUE) {
      l = paramLong;
      if (paramLong > i)
        l = i; 
    } 
    return l;
  }
  
  private void c(long paramLong) {
    int i = this.b;
    if (i != Integer.MIN_VALUE && paramLong != -1L)
      this.b = (int)(i - paramLong); 
  }
  
  public int available() {
    int i = this.b;
    if (i == Integer.MIN_VALUE) {
      i = super.available();
    } else {
      i = Math.min(i, super.available());
    } 
    return i;
  }
  
  public void mark(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_1
    //   4: invokespecial mark : (I)V
    //   7: aload_0
    //   8: iload_1
    //   9: putfield b : I
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: astore_2
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_2
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	15	finally
  }
  
  public int read() {
    if (b(1L) == -1L)
      return -1; 
    int i = super.read();
    c(1L);
    return i;
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    paramInt2 = (int)b(paramInt2);
    if (paramInt2 == -1)
      return -1; 
    paramInt1 = super.read(paramArrayOfbyte, paramInt1, paramInt2);
    c(paramInt1);
    return paramInt1;
  }
  
  public void reset() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial reset : ()V
    //   6: aload_0
    //   7: ldc -2147483648
    //   9: putfield b : I
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	15	finally
  }
  
  public long skip(long paramLong) {
    paramLong = b(paramLong);
    if (paramLong == -1L)
      return 0L; 
    paramLong = super.skip(paramLong);
    c(paramLong);
    return paramLong;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/p/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */