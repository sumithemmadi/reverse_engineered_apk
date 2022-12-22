package com.bumptech.glide.load.engine.y;

import android.annotation.SuppressLint;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.p.g;

public class g extends g<c, s<?>> implements h {
  private h.a e;
  
  public g(long paramLong) {
    super(paramLong);
  }
  
  @SuppressLint({"InlinedApi"})
  public void a(int paramInt) {
    if (paramInt >= 40) {
      b();
    } else if (paramInt >= 20 || paramInt == 15) {
      m(h() / 2L);
    } 
  }
  
  public void e(h.a parama) {
    this.e = parama;
  }
  
  protected int n(s<?> params) {
    return (params == null) ? super.i(null) : params.b();
  }
  
  protected void o(c paramc, s<?> params) {
    h.a a1 = this.e;
    if (a1 != null && params != null)
      a1.a(params); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/y/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */