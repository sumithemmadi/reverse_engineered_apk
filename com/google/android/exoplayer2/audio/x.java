package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class x implements AudioProcessor {
  private int b;
  
  private float c = 1.0F;
  
  private float d = 1.0F;
  
  private AudioProcessor.a e;
  
  private AudioProcessor.a f;
  
  private AudioProcessor.a g;
  
  private AudioProcessor.a h;
  
  private boolean i;
  
  private w j;
  
  private ByteBuffer k;
  
  private ShortBuffer l;
  
  private ByteBuffer m;
  
  private long n;
  
  private long o;
  
  private boolean p;
  
  public x() {
    AudioProcessor.a a1 = AudioProcessor.a.a;
    this.e = a1;
    this.f = a1;
    this.g = a1;
    this.h = a1;
    ByteBuffer byteBuffer = AudioProcessor.a;
    this.k = byteBuffer;
    this.l = byteBuffer.asShortBuffer();
    this.m = byteBuffer;
    this.b = -1;
  }
  
  public void a() {
    this.c = 1.0F;
    this.d = 1.0F;
    AudioProcessor.a a1 = AudioProcessor.a.a;
    this.e = a1;
    this.f = a1;
    this.g = a1;
    this.h = a1;
    ByteBuffer byteBuffer = AudioProcessor.a;
    this.k = byteBuffer;
    this.l = byteBuffer.asShortBuffer();
    this.m = byteBuffer;
    this.b = -1;
    this.i = false;
    this.j = null;
    this.n = 0L;
    this.o = 0L;
    this.p = false;
  }
  
  public long b(long paramLong) {
    long l = this.o;
    if (l >= 1024L) {
      int i = this.h.b;
      int j = this.g.b;
      if (i == j) {
        paramLong = h0.l0(paramLong, this.n, l);
      } else {
        paramLong = h0.l0(paramLong, this.n * i, l * j);
      } 
      return paramLong;
    } 
    double d1 = this.c;
    double d2 = paramLong;
    Double.isNaN(d1);
    Double.isNaN(d2);
    return (long)(d1 * d2);
  }
  
  public boolean c() {
    boolean bool;
    if (this.f.b != -1 && (Math.abs(this.c - 1.0F) >= 0.01F || Math.abs(this.d - 1.0F) >= 0.01F || this.f.b != this.e.b)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public ByteBuffer d() {
    ByteBuffer byteBuffer = this.m;
    this.m = AudioProcessor.a;
    return byteBuffer;
  }
  
  public void e(ByteBuffer paramByteBuffer) {
    w w1 = (w)e.e(this.j);
    if (paramByteBuffer.hasRemaining()) {
      ShortBuffer shortBuffer = paramByteBuffer.asShortBuffer();
      int j = paramByteBuffer.remaining();
      this.n += j;
      w1.s(shortBuffer);
      paramByteBuffer.position(paramByteBuffer.position() + j);
    } 
    int i = w1.k();
    if (i > 0) {
      if (this.k.capacity() < i) {
        paramByteBuffer = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        this.k = paramByteBuffer;
        this.l = paramByteBuffer.asShortBuffer();
      } else {
        this.k.clear();
        this.l.clear();
      } 
      w1.j(this.l);
      this.o += i;
      this.k.limit(i);
      this.m = this.k;
    } 
  }
  
  public AudioProcessor.a f(AudioProcessor.a parama) {
    if (parama.d == 2) {
      int i = this.b;
      int j = i;
      if (i == -1)
        j = parama.b; 
      this.e = parama;
      parama = new AudioProcessor.a(j, parama.c, 2);
      this.f = parama;
      this.i = true;
      return parama;
    } 
    throw new AudioProcessor.UnhandledAudioFormatException(parama);
  }
  
  public void flush() {
    if (c()) {
      AudioProcessor.a a1 = this.e;
      this.g = a1;
      AudioProcessor.a a2 = this.f;
      this.h = a2;
      if (this.i) {
        this.j = new w(a1.b, a1.c, this.c, this.d, a2.b);
      } else {
        w w1 = this.j;
        if (w1 != null)
          w1.i(); 
      } 
    } 
    this.m = AudioProcessor.a;
    this.n = 0L;
    this.o = 0L;
    this.p = false;
  }
  
  public void g() {
    w w1 = this.j;
    if (w1 != null)
      w1.r(); 
    this.p = true;
  }
  
  public float h(float paramFloat) {
    paramFloat = h0.m(paramFloat, 0.1F, 8.0F);
    if (this.d != paramFloat) {
      this.d = paramFloat;
      this.i = true;
    } 
    return paramFloat;
  }
  
  public float i(float paramFloat) {
    paramFloat = h0.m(paramFloat, 0.1F, 8.0F);
    if (this.c != paramFloat) {
      this.c = paramFloat;
      this.i = true;
    } 
    return paramFloat;
  }
  
  public boolean o() {
    if (this.p) {
      w w1 = this.j;
      if (w1 == null || w1.k() == 0)
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/audio/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */