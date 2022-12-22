package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

public final class qt extends ByteArrayOutputStream {
  private final eg b;
  
  public qt(eg parameg, int paramInt) {
    this.b = parameg;
    this.buf = parameg.b(Math.max(paramInt, 256));
  }
  
  private final void b(int paramInt) {
    int i = this.count;
    if (i + paramInt <= this.buf.length)
      return; 
    byte[] arrayOfByte = this.b.b(i + paramInt << 1);
    System.arraycopy(this.buf, 0, arrayOfByte, 0, this.count);
    this.b.a(this.buf);
    this.buf = arrayOfByte;
  }
  
  public final void close() {
    this.b.a(this.buf);
    this.buf = null;
    super.close();
  }
  
  public final void finalize() {
    this.b.a(this.buf);
  }
  
  public final void write(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_1
    //   4: invokespecial b : (I)V
    //   7: aload_0
    //   8: iload_1
    //   9: invokespecial write : (I)V
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
  
  public final void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_3
    //   4: invokespecial b : (I)V
    //   7: aload_0
    //   8: aload_1
    //   9: iload_2
    //   10: iload_3
    //   11: invokespecial write : ([BII)V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: astore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_1
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	17	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */