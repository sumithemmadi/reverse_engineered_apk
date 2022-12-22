package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class p implements AudioProcessor {
  protected AudioProcessor.a b;
  
  protected AudioProcessor.a c;
  
  private AudioProcessor.a d;
  
  private AudioProcessor.a e;
  
  private ByteBuffer f;
  
  private ByteBuffer g;
  
  private boolean h;
  
  public p() {
    ByteBuffer byteBuffer = AudioProcessor.a;
    this.f = byteBuffer;
    this.g = byteBuffer;
    AudioProcessor.a a1 = AudioProcessor.a.a;
    this.d = a1;
    this.e = a1;
    this.b = a1;
    this.c = a1;
  }
  
  public final void a() {
    flush();
    this.f = AudioProcessor.a;
    AudioProcessor.a a1 = AudioProcessor.a.a;
    this.d = a1;
    this.e = a1;
    this.b = a1;
    this.c = a1;
    k();
  }
  
  protected final boolean b() {
    return this.g.hasRemaining();
  }
  
  public boolean c() {
    boolean bool;
    if (this.e != AudioProcessor.a.a) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public ByteBuffer d() {
    ByteBuffer byteBuffer = this.g;
    this.g = AudioProcessor.a;
    return byteBuffer;
  }
  
  public final AudioProcessor.a f(AudioProcessor.a parama) {
    this.d = parama;
    this.e = h(parama);
    if (c()) {
      parama = this.e;
    } else {
      parama = AudioProcessor.a.a;
    } 
    return parama;
  }
  
  public final void flush() {
    this.g = AudioProcessor.a;
    this.h = false;
    this.b = this.d;
    this.c = this.e;
    i();
  }
  
  public final void g() {
    this.h = true;
    j();
  }
  
  protected abstract AudioProcessor.a h(AudioProcessor.a parama);
  
  protected void i() {}
  
  protected void j() {}
  
  protected void k() {}
  
  protected final ByteBuffer l(int paramInt) {
    if (this.f.capacity() < paramInt) {
      this.f = ByteBuffer.allocateDirect(paramInt).order(ByteOrder.nativeOrder());
    } else {
      this.f.clear();
    } 
    ByteBuffer byteBuffer = this.f;
    this.g = byteBuffer;
    return byteBuffer;
  }
  
  public boolean o() {
    boolean bool;
    if (this.h && this.g == AudioProcessor.a) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/audio/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */