package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.f;
import com.bumptech.glide.p.a;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class g implements f<ByteBuffer, Bitmap> {
  private final l a;
  
  public g(l paraml) {
    this.a = paraml;
  }
  
  public s<Bitmap> c(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, e parame) {
    InputStream inputStream = a.f(paramByteBuffer);
    return this.a.f(inputStream, paramInt1, paramInt2, parame);
  }
  
  public boolean d(ByteBuffer paramByteBuffer, e parame) {
    return this.a.q(paramByteBuffer);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */