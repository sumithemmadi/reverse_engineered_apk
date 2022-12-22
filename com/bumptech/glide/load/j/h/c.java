package com.bumptech.glide.load.j.h;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.engine.x.e;
import com.bumptech.glide.load.resource.bitmap.e;

public final class c implements e<Drawable, byte[]> {
  private final e a;
  
  private final e<Bitmap, byte[]> b;
  
  private final e<com.bumptech.glide.load.j.g.c, byte[]> c;
  
  public c(e parame, e<Bitmap, byte[]> parame1, e<com.bumptech.glide.load.j.g.c, byte[]> parame2) {
    this.a = parame;
    this.b = parame1;
    this.c = parame2;
  }
  
  private static s<com.bumptech.glide.load.j.g.c> b(s<Drawable> params) {
    return (s)params;
  }
  
  public s<byte[]> a(s<Drawable> params, e parame) {
    Drawable drawable = (Drawable)params.get();
    return (s)((drawable instanceof BitmapDrawable) ? this.b.a((s<Bitmap>)e.e(((BitmapDrawable)drawable).getBitmap(), this.a), parame) : ((drawable instanceof com.bumptech.glide.load.j.g.c) ? this.c.a(b(params), parame) : null));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/j/h/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */