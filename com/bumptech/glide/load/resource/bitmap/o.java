package com.bumptech.glide.load.resource.bitmap;

import b.l.a.a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.x.b;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class o implements ImageHeaderParser {
  public ImageHeaderParser.ImageType a(ByteBuffer paramByteBuffer) {
    return ImageHeaderParser.ImageType.UNKNOWN;
  }
  
  public ImageHeaderParser.ImageType b(InputStream paramInputStream) {
    return ImageHeaderParser.ImageType.UNKNOWN;
  }
  
  public int c(InputStream paramInputStream, b paramb) {
    int i = (new a(paramInputStream)).e("Orientation", 1);
    int j = i;
    if (i == 0)
      j = -1; 
    return j;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */