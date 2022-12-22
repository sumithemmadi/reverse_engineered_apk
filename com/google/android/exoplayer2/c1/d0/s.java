package com.google.android.exoplayer2.c1.d0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.v;

public final class s implements o {
  private final v a = new v(10);
  
  private v b;
  
  private boolean c;
  
  private long d;
  
  private int e;
  
  private int f;
  
  public void b(v paramv) {
    if (!this.c)
      return; 
    int i = paramv.a();
    int j = this.f;
    if (j < 10) {
      j = Math.min(i, 10 - j);
      System.arraycopy(paramv.a, paramv.c(), this.a.a, this.f, j);
      if (this.f + j == 10) {
        this.a.M(0);
        if (73 != this.a.z() || 68 != this.a.z() || 51 != this.a.z()) {
          o.f("Id3Reader", "Discarding invalid ID3 tag");
          this.c = false;
          return;
        } 
        this.a.N(3);
        this.e = this.a.y() + 10;
      } 
    } 
    i = Math.min(i, this.e - this.f);
    this.b.b(paramv, i);
    this.f += i;
  }
  
  public void c() {
    this.c = false;
  }
  
  public void d() {
    if (this.c) {
      int i = this.e;
      if (i != 0 && this.f == i) {
        this.b.c(this.d, 1, i, 0, null);
        this.c = false;
      } 
    } 
  }
  
  public void e(j paramj, h0.d paramd) {
    paramd.a();
    v v1 = paramj.g(paramd.c(), 4);
    this.b = v1;
    v1.d(Format.u(paramd.b(), "application/id3", null, -1, null));
  }
  
  public void f(long paramLong, int paramInt) {
    if ((paramInt & 0x4) == 0)
      return; 
    this.c = true;
    this.d = paramLong;
    this.e = 0;
    this.f = 0;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */