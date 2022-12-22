package com.bumptech.glide.p;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

public final class a {
  private static final AtomicReference<byte[]> a = (AtomicReference)new AtomicReference<byte>();
  
  public static ByteBuffer a(File paramFile) {
    IOException iOException;
    RandomAccessFile randomAccessFile;
    MappedByteBuffer mappedByteBuffer = null;
    File file = null;
    try {
      long l = paramFile.length();
    } finally {
      paramFile = null;
    } 
    if (iOException != null)
      try {
        iOException.close();
      } catch (IOException iOException1) {} 
    if (randomAccessFile != null)
      try {
        randomAccessFile.close();
      } catch (IOException iOException1) {} 
    throw paramFile;
  }
  
  public static ByteBuffer b(InputStream paramInputStream) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
    byte[] arrayOfByte1 = a.getAndSet(null);
    byte[] arrayOfByte2 = arrayOfByte1;
    if (arrayOfByte1 == null)
      arrayOfByte2 = new byte[16384]; 
    while (true) {
      int i = paramInputStream.read(arrayOfByte2);
      if (i >= 0) {
        byteArrayOutputStream.write(arrayOfByte2, 0, i);
        continue;
      } 
      a.set(arrayOfByte2);
      byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
      return (ByteBuffer)ByteBuffer.allocateDirect(arrayOfByte.length).put(arrayOfByte).position(0);
    } 
  }
  
  private static b c(ByteBuffer paramByteBuffer) {
    return (!paramByteBuffer.isReadOnly() && paramByteBuffer.hasArray()) ? new b(paramByteBuffer.array(), paramByteBuffer.arrayOffset(), paramByteBuffer.limit()) : null;
  }
  
  public static byte[] d(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte;
    b b = c(paramByteBuffer);
    if (b != null && b.a == 0 && b.b == b.c.length) {
      arrayOfByte = paramByteBuffer.array();
    } else {
      ByteBuffer byteBuffer = arrayOfByte.asReadOnlyBuffer();
      arrayOfByte = new byte[byteBuffer.limit()];
      byteBuffer.position(0);
      byteBuffer.get(arrayOfByte);
    } 
    return arrayOfByte;
  }
  
  public static void e(ByteBuffer paramByteBuffer, File paramFile) {
    paramByteBuffer.position(0);
    FileChannel fileChannel = null;
    File file = null;
    try {
      RandomAccessFile randomAccessFile = new RandomAccessFile();
      this(paramFile, "rw");
      paramFile = file;
    } finally {
      paramByteBuffer = null;
    } 
    if (fileChannel != null)
      try {
        fileChannel.close();
      } catch (IOException iOException) {} 
    if (paramFile != null)
      try {
        paramFile.close();
      } catch (IOException iOException) {} 
    throw paramByteBuffer;
  }
  
  public static InputStream f(ByteBuffer paramByteBuffer) {
    return new a(paramByteBuffer);
  }
  
  private static class a extends InputStream {
    private final ByteBuffer b;
    
    private int c = -1;
    
    a(ByteBuffer param1ByteBuffer) {
      this.b = param1ByteBuffer;
    }
    
    public int available() {
      return this.b.remaining();
    }
    
    public void mark(int param1Int) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: aload_0
      //   4: getfield b : Ljava/nio/ByteBuffer;
      //   7: invokevirtual position : ()I
      //   10: putfield c : I
      //   13: aload_0
      //   14: monitorexit
      //   15: return
      //   16: astore_2
      //   17: aload_0
      //   18: monitorexit
      //   19: aload_2
      //   20: athrow
      // Exception table:
      //   from	to	target	type
      //   2	13	16	finally
    }
    
    public boolean markSupported() {
      return true;
    }
    
    public int read() {
      return !this.b.hasRemaining() ? -1 : (this.b.get() & 0xFF);
    }
    
    public int read(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      if (!this.b.hasRemaining())
        return -1; 
      param1Int2 = Math.min(param1Int2, available());
      this.b.get(param1ArrayOfbyte, param1Int1, param1Int2);
      return param1Int2;
    }
    
    public void reset() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield c : I
      //   6: istore_1
      //   7: iload_1
      //   8: iconst_m1
      //   9: if_icmpeq -> 24
      //   12: aload_0
      //   13: getfield b : Ljava/nio/ByteBuffer;
      //   16: iload_1
      //   17: invokevirtual position : (I)Ljava/nio/Buffer;
      //   20: pop
      //   21: aload_0
      //   22: monitorexit
      //   23: return
      //   24: new java/io/IOException
      //   27: astore_2
      //   28: aload_2
      //   29: ldc 'Cannot reset to unset mark position'
      //   31: invokespecial <init> : (Ljava/lang/String;)V
      //   34: aload_2
      //   35: athrow
      //   36: astore_2
      //   37: aload_0
      //   38: monitorexit
      //   39: aload_2
      //   40: athrow
      // Exception table:
      //   from	to	target	type
      //   2	7	36	finally
      //   12	21	36	finally
      //   24	36	36	finally
    }
    
    public long skip(long param1Long) {
      if (!this.b.hasRemaining())
        return -1L; 
      param1Long = Math.min(param1Long, available());
      ByteBuffer byteBuffer = this.b;
      byteBuffer.position((int)(byteBuffer.position() + param1Long));
      return param1Long;
    }
  }
  
  static final class b {
    final int a;
    
    final int b;
    
    final byte[] c;
    
    b(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      this.c = param1ArrayOfbyte;
      this.a = param1Int1;
      this.b = param1Int2;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/p/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */