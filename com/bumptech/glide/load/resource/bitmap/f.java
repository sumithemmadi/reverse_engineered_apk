package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.c;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.engine.x.e;
import com.bumptech.glide.load.h;
import com.bumptech.glide.p.k;

public abstract class f implements h<Bitmap> {
  public final s<Bitmap> b(Context paramContext, s<Bitmap> params, int paramInt1, int paramInt2) {
    if (k.s(paramInt1, paramInt2)) {
      e e = c.c(paramContext).f();
      Bitmap bitmap1 = (Bitmap)params.get();
      int i = paramInt1;
      if (paramInt1 == Integer.MIN_VALUE)
        i = bitmap1.getWidth(); 
      paramInt1 = paramInt2;
      if (paramInt2 == Integer.MIN_VALUE)
        paramInt1 = bitmap1.getHeight(); 
      Bitmap bitmap2 = c(e, bitmap1, i, paramInt1);
      if (!bitmap1.equals(bitmap2))
        params = e.e(bitmap2, e); 
      return params;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot apply transformation on width: ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(" or height: ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  protected abstract Bitmap c(e parame, Bitmap paramBitmap, int paramInt1, int paramInt2);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */