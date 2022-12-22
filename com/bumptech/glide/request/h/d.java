package com.bumptech.glide.request.h;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class d extends e<Drawable> {
  public d(ImageView paramImageView) {
    super(paramImageView);
  }
  
  protected void q(Drawable paramDrawable) {
    ((ImageView)this.d).setImageDrawable(paramDrawable);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/request/h/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */