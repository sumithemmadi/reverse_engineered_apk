package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.e;

public final class r extends HttpDataSource.a {
  private final String b;
  
  private final x c;
  
  private final int d;
  
  private final int e;
  
  private final boolean f;
  
  public r(String paramString, x paramx) {
    this(paramString, paramx, 8000, 8000, false);
  }
  
  public r(String paramString, x paramx, int paramInt1, int paramInt2, boolean paramBoolean) {
    this.b = e.d(paramString);
    this.c = paramx;
    this.d = paramInt1;
    this.e = paramInt2;
    this.f = paramBoolean;
  }
  
  protected q d(HttpDataSource.b paramb) {
    q q = new q(this.b, this.d, this.e, this.f, paramb);
    x x1 = this.c;
    if (x1 != null)
      q.f0(x1); 
    return q;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/upstream/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */