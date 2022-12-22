package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.e;
import java.io.InputStream;

public final class k extends InputStream {
  private final j b;
  
  private final l c;
  
  private final byte[] d;
  
  private boolean e = false;
  
  private boolean f = false;
  
  private long g;
  
  public k(j paramj, l paraml) {
    this.b = paramj;
    this.c = paraml;
    this.d = new byte[1];
  }
  
  private void b() {
    if (!this.e) {
      this.b.g0(this.c);
      this.e = true;
    } 
  }
  
  public void c() {
    b();
  }
  
  public void close() {
    if (!this.f) {
      this.b.close();
      this.f = true;
    } 
  }
  
  public int read() {
    int i = read(this.d);
    int m = -1;
    if (i != -1)
      m = this.d[0] & 0xFF; 
    return m;
  }
  
  public int read(byte[] paramArrayOfbyte) {
    return read(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    e.f(this.f ^ true);
    b();
    paramInt1 = this.b.read(paramArrayOfbyte, paramInt1, paramInt2);
    if (paramInt1 == -1)
      return -1; 
    this.g += paramInt1;
    return paramInt1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/upstream/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */