package com.google.android.exoplayer2.upstream;

import android.content.Context;

public final class p implements j.a {
  private final Context a;
  
  private final x b;
  
  private final j.a c;
  
  public p(Context paramContext, x paramx, j.a parama) {
    this.a = paramContext.getApplicationContext();
    this.b = paramx;
    this.c = parama;
  }
  
  public p(Context paramContext, String paramString) {
    this(paramContext, paramString, (x)null);
  }
  
  public p(Context paramContext, String paramString, x paramx) {
    this(paramContext, paramx, new r(paramString, paramx));
  }
  
  public o b() {
    o o = new o(this.a, this.c.a());
    x x1 = this.b;
    if (x1 != null)
      o.f0(x1); 
    return o;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/upstream/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */