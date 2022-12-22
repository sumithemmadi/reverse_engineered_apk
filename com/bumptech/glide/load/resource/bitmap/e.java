package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.o;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.p.j;
import com.bumptech.glide.p.k;

public class e implements s<Bitmap>, o {
  private final Bitmap b;
  
  private final com.bumptech.glide.load.engine.x.e c;
  
  public e(Bitmap paramBitmap, com.bumptech.glide.load.engine.x.e parame) {
    this.b = (Bitmap)j.e(paramBitmap, "Bitmap must not be null");
    this.c = (com.bumptech.glide.load.engine.x.e)j.e(parame, "BitmapPool must not be null");
  }
  
  public static e e(Bitmap paramBitmap, com.bumptech.glide.load.engine.x.e parame) {
    return (paramBitmap == null) ? null : new e(paramBitmap, parame);
  }
  
  public void D() {
    this.b.prepareToDraw();
  }
  
  public void a() {
    this.c.c(this.b);
  }
  
  public int b() {
    return k.g(this.b);
  }
  
  public Class<Bitmap> c() {
    return Bitmap.class;
  }
  
  public Bitmap d() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */