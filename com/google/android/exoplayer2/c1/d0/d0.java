package com.google.android.exoplayer2.c1.d0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.v;

public final class d0 implements a0 {
  private e0 a;
  
  private v b;
  
  private boolean c;
  
  public void a(e0 parame0, j paramj, h0.d paramd) {
    this.a = parame0;
    paramd.a();
    v v1 = paramj.g(paramd.c(), 4);
    this.b = v1;
    v1.d(Format.u(paramd.b(), "application/x-scte35", null, -1, null));
  }
  
  public void b(v paramv) {
    if (!this.c) {
      if (this.a.e() == -9223372036854775807L)
        return; 
      this.b.d(Format.t(null, "application/x-scte35", this.a.e()));
      this.c = true;
    } 
    int i = paramv.a();
    this.b.b(paramv, i);
    this.b.c(this.a.d(), 1, i, 0, null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/d0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */