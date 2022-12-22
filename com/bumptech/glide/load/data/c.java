package com.bumptech.glide.load.data;

import com.bumptech.glide.load.engine.x.b;
import java.io.OutputStream;

public final class c extends OutputStream {
  private final OutputStream b;
  
  private byte[] c;
  
  private b d;
  
  private int e;
  
  public c(OutputStream paramOutputStream, b paramb) {
    this(paramOutputStream, paramb, 65536);
  }
  
  c(OutputStream paramOutputStream, b paramb, int paramInt) {
    this.b = paramOutputStream;
    this.d = paramb;
    this.c = (byte[])paramb.e(paramInt, byte[].class);
  }
  
  private void b() {
    int i = this.e;
    if (i > 0) {
      this.b.write(this.c, 0, i);
      this.e = 0;
    } 
  }
  
  private void c() {
    if (this.e == this.c.length)
      b(); 
  }
  
  private void d() {
    byte[] arrayOfByte = this.c;
    if (arrayOfByte != null) {
      this.d.d(arrayOfByte);
      this.c = null;
    } 
  }
  
  public void close() {
    try {
      flush();
      this.b.close();
      return;
    } finally {
      this.b.close();
    } 
  }
  
  public void flush() {
    b();
    this.b.flush();
  }
  
  public void write(int paramInt) {
    byte[] arrayOfByte = this.c;
    int i = this.e;
    this.e = i + 1;
    arrayOfByte[i] = (byte)(byte)paramInt;
    c();
  }
  
  public void write(byte[] paramArrayOfbyte) {
    write(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int j;
    int i = 0;
    do {
      int k = paramInt2 - i;
      j = paramInt1 + i;
      int m = this.e;
      if (m == 0 && k >= this.c.length) {
        this.b.write(paramArrayOfbyte, j, k);
        return;
      } 
      k = Math.min(k, this.c.length - m);
      System.arraycopy(paramArrayOfbyte, j, this.c, this.e, k);
      this.e += k;
      j = i + k;
      c();
      i = j;
    } while (j < paramInt2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/data/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */