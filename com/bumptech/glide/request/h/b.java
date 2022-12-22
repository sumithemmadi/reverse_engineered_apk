package com.bumptech.glide.request.h;

import android.graphics.Bitmap;
import android.widget.ImageView;

public class b extends e<Bitmap> {
  public b(ImageView paramImageView) {
    super(paramImageView);
  }
  
  protected void q(Bitmap paramBitmap) {
    ((ImageView)this.d).setImageBitmap(paramBitmap);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/request/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */