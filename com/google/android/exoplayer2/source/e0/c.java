package com.google.android.exoplayer2.source.e0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.j;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.util.h0;
import java.util.Arrays;

public abstract class c extends b {
  private byte[] i;
  
  private volatile boolean j;
  
  public c(j paramj, l paraml, int paramInt1, Format paramFormat, int paramInt2, Object paramObject, byte[] paramArrayOfbyte) {
    super(paramj, paraml, paramInt1, paramFormat, paramInt2, paramObject, -9223372036854775807L, -9223372036854775807L);
    this.i = paramArrayOfbyte;
  }
  
  private void i(int paramInt) {
    byte[] arrayOfByte = this.i;
    if (arrayOfByte == null) {
      this.i = new byte[16384];
    } else if (arrayOfByte.length < paramInt + 16384) {
      this.i = Arrays.copyOf(arrayOfByte, arrayOfByte.length + 16384);
    } 
  }
  
  public final void a() {
    this.j = true;
  }
  
  public final void b() {
    try {
      this.h.g0(this.a);
      int i = 0;
      int j = 0;
      while (i != -1 && !this.j) {
        i(j);
        int k = this.h.read(this.i, j, 16384);
        i = k;
        if (k != -1) {
          j += k;
          i = k;
        } 
      } 
      if (!this.j)
        g(this.i, j); 
      return;
    } finally {
      h0.j((j)this.h);
    } 
  }
  
  protected abstract void g(byte[] paramArrayOfbyte, int paramInt);
  
  public byte[] h() {
    return this.i;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/e0/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */