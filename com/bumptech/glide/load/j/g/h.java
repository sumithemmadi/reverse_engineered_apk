package com.bumptech.glide.load.j.g;

import android.graphics.Bitmap;
import com.bumptech.glide.l.a;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.engine.x.e;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.resource.bitmap.e;

public final class h implements f<a, Bitmap> {
  private final e a;
  
  public h(e parame) {
    this.a = parame;
  }
  
  public s<Bitmap> c(a parama, int paramInt1, int paramInt2, e parame) {
    return (s<Bitmap>)e.e(parama.a(), this.a);
  }
  
  public boolean d(a parama, e parame) {
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/j/g/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */