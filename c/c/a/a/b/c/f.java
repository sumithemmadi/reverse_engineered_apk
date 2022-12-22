package c.c.a.a.b.c;

import java.io.FilterInputStream;
import java.io.InputStream;

final class f extends FilterInputStream {
  private long b;
  
  private long c = -1L;
  
  f(InputStream paramInputStream, long paramLong) {
    super(paramInputStream);
    paramInputStream.getClass();
    this.b = 1048577L;
  }
  
  public final int available() {
    return (int)Math.min(this.in.available(), this.b);
  }
  
  public final void mark(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield in : Ljava/io/InputStream;
    //   6: iload_1
    //   7: invokevirtual mark : (I)V
    //   10: aload_0
    //   11: aload_0
    //   12: getfield b : J
    //   15: putfield c : J
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: astore_2
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_2
    //   25: athrow
    // Exception table:
    //   from	to	target	type
    //   2	18	21	finally
  }
  
  public final int read() {
    if (this.b == 0L)
      return -1; 
    int i = this.in.read();
    if (i != -1)
      this.b--; 
    return i;
  }
  
  public final int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = this.b;
    if (l == 0L)
      return -1; 
    l = Math.min(paramInt2, l);
    paramInt1 = this.in.read(paramArrayOfbyte, paramInt1, (int)l);
    if (paramInt1 != -1)
      this.b -= paramInt1; 
    return paramInt1;
  }
  
  public final void reset() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield in : Ljava/io/InputStream;
    //   6: invokevirtual markSupported : ()Z
    //   9: ifeq -> 53
    //   12: aload_0
    //   13: getfield c : J
    //   16: ldc2_w -1
    //   19: lcmp
    //   20: ifeq -> 41
    //   23: aload_0
    //   24: getfield in : Ljava/io/InputStream;
    //   27: invokevirtual reset : ()V
    //   30: aload_0
    //   31: aload_0
    //   32: getfield c : J
    //   35: putfield b : J
    //   38: aload_0
    //   39: monitorexit
    //   40: return
    //   41: new java/io/IOException
    //   44: astore_1
    //   45: aload_1
    //   46: ldc 'Mark not set'
    //   48: invokespecial <init> : (Ljava/lang/String;)V
    //   51: aload_1
    //   52: athrow
    //   53: new java/io/IOException
    //   56: astore_1
    //   57: aload_1
    //   58: ldc 'Mark not supported'
    //   60: invokespecial <init> : (Ljava/lang/String;)V
    //   63: aload_1
    //   64: athrow
    //   65: astore_1
    //   66: aload_0
    //   67: monitorexit
    //   68: aload_1
    //   69: athrow
    // Exception table:
    //   from	to	target	type
    //   2	38	65	finally
    //   41	53	65	finally
    //   53	65	65	finally
  }
  
  public final long skip(long paramLong) {
    paramLong = Math.min(paramLong, this.b);
    paramLong = this.in.skip(paramLong);
    this.b -= paramLong;
    return paramLong;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/c/c/a/a/b/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */