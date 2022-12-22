package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.f;
import com.bumptech.glide.p.k;

public final class y implements f<Bitmap, Bitmap> {
  public s<Bitmap> c(Bitmap paramBitmap, int paramInt1, int paramInt2, e parame) {
    return new a(paramBitmap);
  }
  
  public boolean d(Bitmap paramBitmap, e parame) {
    return true;
  }
  
  private static final class a implements s<Bitmap> {
    private final Bitmap b;
    
    a(Bitmap param1Bitmap) {
      this.b = param1Bitmap;
    }
    
    public void a() {}
    
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
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */