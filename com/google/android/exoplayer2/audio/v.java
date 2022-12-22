package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.h0;
import java.nio.ByteBuffer;

public final class v extends p {
  private int i;
  
  private boolean j;
  
  private byte[] k;
  
  private byte[] l;
  
  private int m;
  
  private int n;
  
  private int o;
  
  private boolean p;
  
  private long q;
  
  public v() {
    byte[] arrayOfByte = h0.f;
    this.k = arrayOfByte;
    this.l = arrayOfByte;
  }
  
  private int m(long paramLong) {
    return (int)(paramLong * this.b.b / 1000000L);
  }
  
  private int n(ByteBuffer paramByteBuffer) {
    for (int i = paramByteBuffer.limit() - 1; i >= paramByteBuffer.position(); i -= 2) {
      if (Math.abs(paramByteBuffer.get(i)) > 4) {
        int j = this.i;
        return i / j * j + j;
      } 
    } 
    return paramByteBuffer.position();
  }
  
  private int p(ByteBuffer paramByteBuffer) {
    for (int i = paramByteBuffer.position() + 1; i < paramByteBuffer.limit(); i += 2) {
      if (Math.abs(paramByteBuffer.get(i)) > 4) {
        int j = this.i;
        return j * i / j;
      } 
    } 
    return paramByteBuffer.limit();
  }
  
  private void r(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.remaining();
    l(i).put(paramByteBuffer).flip();
    if (i > 0)
      this.p = true; 
  }
  
  private void s(byte[] paramArrayOfbyte, int paramInt) {
    l(paramInt).put(paramArrayOfbyte, 0, paramInt).flip();
    if (paramInt > 0)
      this.p = true; 
  }
  
  private void t(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.limit();
    int j = p(paramByteBuffer);
    int k = j - paramByteBuffer.position();
    byte[] arrayOfByte = this.k;
    int m = arrayOfByte.length;
    int n = this.n;
    m -= n;
    if (j < i && k < m) {
      s(arrayOfByte, n);
      this.n = 0;
      this.m = 0;
    } else {
      j = Math.min(k, m);
      paramByteBuffer.limit(paramByteBuffer.position() + j);
      paramByteBuffer.get(this.k, this.n, j);
      j = this.n + j;
      this.n = j;
      arrayOfByte = this.k;
      if (j == arrayOfByte.length) {
        if (this.p) {
          s(arrayOfByte, this.o);
          this.q += ((this.n - this.o * 2) / this.i);
        } else {
          this.q += ((j - this.o) / this.i);
        } 
        x(paramByteBuffer, this.k, this.n);
        this.n = 0;
        this.m = 2;
      } 
      paramByteBuffer.limit(i);
    } 
  }
  
  private void u(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.limit();
    paramByteBuffer.limit(Math.min(i, paramByteBuffer.position() + this.k.length));
    int j = n(paramByteBuffer);
    if (j == paramByteBuffer.position()) {
      this.m = 1;
    } else {
      paramByteBuffer.limit(j);
      r(paramByteBuffer);
    } 
    paramByteBuffer.limit(i);
  }
  
  private void v(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.limit();
    int j = p(paramByteBuffer);
    paramByteBuffer.limit(j);
    this.q += (paramByteBuffer.remaining() / this.i);
    x(paramByteBuffer, this.l, this.o);
    if (j < i) {
      s(this.l, this.o);
      this.m = 0;
      paramByteBuffer.limit(i);
    } 
  }
  
  private void x(ByteBuffer paramByteBuffer, byte[] paramArrayOfbyte, int paramInt) {
    int i = Math.min(paramByteBuffer.remaining(), this.o);
    int j = this.o - i;
    System.arraycopy(paramArrayOfbyte, paramInt - j, this.l, 0, j);
    paramByteBuffer.position(paramByteBuffer.limit() - i);
    paramByteBuffer.get(this.l, j, i);
  }
  
  public boolean c() {
    return this.j;
  }
  
  public void e(ByteBuffer paramByteBuffer) {
    while (paramByteBuffer.hasRemaining() && !b()) {
      int i = this.m;
      if (i != 0) {
        if (i != 1) {
          if (i == 2) {
            v(paramByteBuffer);
            continue;
          } 
          throw new IllegalStateException();
        } 
        t(paramByteBuffer);
        continue;
      } 
      u(paramByteBuffer);
    } 
  }
  
  public AudioProcessor.a h(AudioProcessor.a parama) {
    if (parama.d == 2) {
      if (!this.j)
        parama = AudioProcessor.a.a; 
      return parama;
    } 
    throw new AudioProcessor.UnhandledAudioFormatException(parama);
  }
  
  protected void i() {
    if (this.j) {
      this.i = this.b.e;
      int i = m(150000L) * this.i;
      if (this.k.length != i)
        this.k = new byte[i]; 
      i = m(20000L) * this.i;
      this.o = i;
      if (this.l.length != i)
        this.l = new byte[i]; 
    } 
    this.m = 0;
    this.q = 0L;
    this.n = 0;
    this.p = false;
  }
  
  protected void j() {
    int i = this.n;
    if (i > 0)
      s(this.k, i); 
    if (!this.p)
      this.q += (this.o / this.i); 
  }
  
  protected void k() {
    this.j = false;
    this.o = 0;
    byte[] arrayOfByte = h0.f;
    this.k = arrayOfByte;
    this.l = arrayOfByte;
  }
  
  public long q() {
    return this.q;
  }
  
  public void w(boolean paramBoolean) {
    this.j = paramBoolean;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/audio/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */