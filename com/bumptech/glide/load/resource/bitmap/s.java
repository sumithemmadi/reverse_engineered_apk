package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.f;
import com.bumptech.glide.p.a;
import java.io.InputStream;

public final class s implements f<InputStream, Bitmap> {
  private final d a = new d();
  
  public com.bumptech.glide.load.engine.s<Bitmap> c(InputStream paramInputStream, int paramInt1, int paramInt2, e parame) {
    ImageDecoder.Source source = ImageDecoder.createSource(a.b(paramInputStream));
    return this.a.d(source, paramInt1, paramInt2, parame);
  }
  
  public boolean d(InputStream paramInputStream, e parame) {
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */