package com.google.android.exoplayer2.c1.c0;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.util.v;
import java.io.EOFException;

final class f {
  public int a;
  
  public int b;
  
  public long c;
  
  public long d;
  
  public long e;
  
  public long f;
  
  public int g;
  
  public int h;
  
  public int i;
  
  public final int[] j = new int[255];
  
  private final v k = new v(255);
  
  public boolean a(i parami, boolean paramBoolean) {
    EOFException eOFException;
    this.k.H();
    b();
    long l = parami.getLength();
    boolean bool = false;
    if (l == -1L || parami.getLength() - parami.d() >= 27L) {
      j = 1;
    } else {
      j = 0;
    } 
    if (!j || !parami.c(this.k.a, 0, 27, true)) {
      if (paramBoolean)
        return false; 
      eOFException = new EOFException();
      throw eOFException;
    } 
    if (this.k.B() != 1332176723L) {
      if (paramBoolean)
        return false; 
      throw new ParserException("expected OggS capture pattern at begin of page");
    } 
    int j = this.k.z();
    this.a = j;
    if (j != 0) {
      if (paramBoolean)
        return false; 
      throw new ParserException("unsupported bit stream revision");
    } 
    this.b = this.k.z();
    this.c = this.k.o();
    this.d = this.k.p();
    this.e = this.k.p();
    this.f = this.k.p();
    j = this.k.z();
    this.g = j;
    this.h = j + 27;
    this.k.H();
    eOFException.k(this.k.a, 0, this.g);
    for (j = bool; j < this.g; j++) {
      this.j[j] = this.k.z();
      this.i += this.j[j];
    } 
    return true;
  }
  
  public void b() {
    this.a = 0;
    this.b = 0;
    this.c = 0L;
    this.d = 0L;
    this.e = 0L;
    this.f = 0L;
    this.g = 0;
    this.h = 0;
    this.i = 0;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/c0/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */