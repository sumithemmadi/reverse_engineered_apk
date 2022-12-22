package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.engine.x.e;
import java.security.MessageDigest;

public class p extends f {
  private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(c.a);
  
  public void a(MessageDigest paramMessageDigest) {
    paramMessageDigest.update(b);
  }
  
  protected Bitmap c(e parame, Bitmap paramBitmap, int paramInt1, int paramInt2) {
    return x.f(parame, paramBitmap, paramInt1, paramInt2);
  }
  
  public boolean equals(Object paramObject) {
    return paramObject instanceof p;
  }
  
  public int hashCode() {
    return 1572326941;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */