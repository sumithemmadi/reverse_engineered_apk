package com.bumptech.glide.p;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public final class d extends InputStream {
  private static final Queue<d> b = k.e(0);
  
  private InputStream c;
  
  private IOException d;
  
  public static d c(InputStream paramInputStream) {
    Queue<d> queue;
    d d1;
    synchronized (b) {
      d d2 = queue.poll();
      d1 = d2;
      if (d2 == null)
        d1 = new d(); 
      d1.e(paramInputStream);
      return d1;
    } 
  }
  
  public int available() {
    return this.c.available();
  }
  
  public IOException b() {
    return this.d;
  }
  
  public void close() {
    this.c.close();
  }
  
  public void d() {
    this.d = null;
    this.c = null;
    synchronized (b) {
      null.offer(this);
      return;
    } 
  }
  
  void e(InputStream paramInputStream) {
    this.c = paramInputStream;
  }
  
  public void mark(int paramInt) {
    this.c.mark(paramInt);
  }
  
  public boolean markSupported() {
    return this.c.markSupported();
  }
  
  public int read() {
    try {
      return this.c.read();
    } catch (IOException iOException) {
      this.d = iOException;
      throw iOException;
    } 
  }
  
  public int read(byte[] paramArrayOfbyte) {
    try {
      return this.c.read(paramArrayOfbyte);
    } catch (IOException iOException) {
      this.d = iOException;
      throw iOException;
    } 
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    try {
      return this.c.read(paramArrayOfbyte, paramInt1, paramInt2);
    } catch (IOException iOException) {
      this.d = iOException;
      throw iOException;
    } 
  }
  
  public void reset() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/io/InputStream;
    //   6: invokevirtual reset : ()V
    //   9: aload_0
    //   10: monitorexit
    //   11: return
    //   12: astore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	12	finally
  }
  
  public long skip(long paramLong) {
    try {
      return this.c.skip(paramLong);
    } catch (IOException iOException) {
      this.d = iOException;
      throw iOException;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/p/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */