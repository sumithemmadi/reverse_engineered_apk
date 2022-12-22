package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.c1.l;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.j;
import com.google.android.exoplayer2.upstream.u;
import com.google.android.exoplayer2.upstream.x;

public final class y extends l implements x.c {
  private final Uri f;
  
  private final j.a g;
  
  private final l h;
  
  private final k<?> i;
  
  private final u j;
  
  private final String k;
  
  private final int l;
  
  private final Object m;
  
  private long n;
  
  private boolean o;
  
  private boolean p;
  
  private x q;
  
  y(Uri paramUri, j.a parama, l paraml, k<?> paramk, u paramu, String paramString, int paramInt, Object paramObject) {
    this.f = paramUri;
    this.g = parama;
    this.h = paraml;
    this.i = paramk;
    this.j = paramu;
    this.k = paramString;
    this.l = paramInt;
    this.n = -9223372036854775807L;
    this.m = paramObject;
  }
  
  private void t(long paramLong, boolean paramBoolean1, boolean paramBoolean2) {
    this.n = paramLong;
    this.o = paramBoolean1;
    this.p = paramBoolean2;
    r(new d0(this.n, this.o, false, this.p, null, this.m));
  }
  
  public u a(v.a parama, e parame, long paramLong) {
    j j = this.g.a();
    x x1 = this.q;
    if (x1 != null)
      j.f0(x1); 
    return new x(this.f, j, this.h.a(), this.i, this.j, m(parama), this, parame, this.k, this.l);
  }
  
  public void g(long paramLong, boolean paramBoolean1, boolean paramBoolean2) {
    long l1 = paramLong;
    if (paramLong == -9223372036854775807L)
      l1 = this.n; 
    if (this.n == l1 && this.o == paramBoolean1 && this.p == paramBoolean2)
      return; 
    t(l1, paramBoolean1, paramBoolean2);
  }
  
  public void h() {}
  
  public void i(u paramu) {
    ((x)paramu).a0();
  }
  
  protected void q(x paramx) {
    this.q = paramx;
    this.i.c();
    t(this.n, this.o, this.p);
  }
  
  protected void s() {
    this.i.a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */