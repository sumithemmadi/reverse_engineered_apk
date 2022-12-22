package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.engine.x.e;
import com.bumptech.glide.load.engine.x.f;
import com.bumptech.glide.load.j.a;

public final class d extends a<Bitmap> {
  private final e b = (e)new f();
  
  protected s<Bitmap> c(ImageDecoder.Source paramSource, int paramInt1, int paramInt2, ImageDecoder.OnHeaderDecodedListener paramOnHeaderDecodedListener) {
    Bitmap bitmap = ImageDecoder.decodeBitmap(paramSource, paramOnHeaderDecodedListener);
    if (Log.isLoggable("BitmapImageDecoder", 2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Decoded [");
      stringBuilder.append(bitmap.getWidth());
      stringBuilder.append("x");
      stringBuilder.append(bitmap.getHeight());
      stringBuilder.append("] for [");
      stringBuilder.append(paramInt1);
      stringBuilder.append("x");
      stringBuilder.append(paramInt2);
      stringBuilder.append("]");
      Log.v("BitmapImageDecoder", stringBuilder.toString());
    } 
    return new e(bitmap, this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */