package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.engine.x.e;
import java.security.MessageDigest;

public class i extends f {
  private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(c.a);
  
  public void a(MessageDigest paramMessageDigest) {
    paramMessageDigest.update(b);
  }
  
  protected Bitmap c(e parame, Bitmap paramBitmap, int paramInt1, int paramInt2) {
    return x.b(parame, paramBitmap, paramInt1, paramInt2);
  }
  
  public boolean equals(Object paramObject) {
    return paramObject instanceof i;
  }
  
  public int hashCode() {
    return -599754482;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */