package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.f;
import java.nio.ByteBuffer;

public final class h implements f<ByteBuffer, Bitmap> {
  private final d a = new d();
  
  public s<Bitmap> c(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, e parame) {
    ImageDecoder.Source source = ImageDecoder.createSource(paramByteBuffer);
    return this.a.d(source, paramInt1, paramInt2, parame);
  }
  
  public boolean d(ByteBuffer paramByteBuffer, e parame) {
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */