package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.h0;
import java.nio.ByteBuffer;

final class y extends p {
  private int i;
  
  private int j;
  
  private boolean k;
  
  private int l;
  
  private byte[] m = h0.f;
  
  private int n;
  
  private long o;
  
  public ByteBuffer d() {
    if (super.o()) {
      int i = this.n;
      if (i > 0) {
        l(i).put(this.m, 0, this.n).flip();
        this.n = 0;
      } 
    } 
    return super.d();
  }
  
  public void e(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.limit();
    int k = j - i;
    if (k == 0)
      return; 
    int m = Math.min(k, this.l);
    this.o += (m / this.b.e);
    this.l -= m;
    paramByteBuffer.position(i + m);
    if (this.l > 0)
      return; 
    i = k - m;
    k = this.n + i - this.m.length;
    ByteBuffer byteBuffer = l(k);
    m = h0.n(k, 0, this.n);
    byteBuffer.put(this.m, 0, m);
    k = h0.n(k - m, 0, i);
    paramByteBuffer.limit(paramByteBuffer.position() + k);
    byteBuffer.put(paramByteBuffer);
    paramByteBuffer.limit(j);
    i -= k;
    j = this.n - m;
    this.n = j;
    byte[] arrayOfByte = this.m;
    System.arraycopy(arrayOfByte, m, arrayOfByte, 0, j);
    paramByteBuffer.get(this.m, this.n, i);
    this.n += i;
    byteBuffer.flip();
  }
  
  public AudioProcessor.a h(AudioProcessor.a parama) {
    if (parama.d == 2) {
      this.k = true;
      AudioProcessor.a a1 = parama;
      if (this.i == 0)
        if (this.j != 0) {
          a1 = parama;
        } else {
          a1 = AudioProcessor.a.a;
        }  
      return a1;
    } 
    throw new AudioProcessor.UnhandledAudioFormatException(parama);
  }
  
  protected void i() {
    if (this.k) {
      this.k = false;
      int i = this.j;
      int j = this.b.e;
      this.m = new byte[i * j];
      this.l = this.i * j;
    } else {
      this.l = 0;
    } 
    this.n = 0;
  }
  
  protected void j() {
    if (this.k) {
      int i = this.n;
      if (i > 0)
        this.o += (i / this.b.e); 
      this.n = 0;
    } 
  }
  
  protected void k() {
    this.m = h0.f;
  }
  
  public long m() {
    return this.o;
  }
  
  public void n() {
    this.o = 0L;
  }
  
  public boolean o() {
    boolean bool;
    if (super.o() && this.n == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void p(int paramInt1, int paramInt2) {
    this.i = paramInt1;
    this.j = paramInt2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/audio/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */