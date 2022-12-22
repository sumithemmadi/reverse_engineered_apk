package com.bumptech.glide.request.h;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class f {
  public <Z> i<ImageView, Z> a(ImageView paramImageView, Class<Z> paramClass) {
    if (Bitmap.class.equals(paramClass))
      return new b(paramImageView); 
    if (Drawable.class.isAssignableFrom(paramClass))
      return new d(paramImageView); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unhandled class: ");
    stringBuilder.append(paramClass);
    stringBuilder.append(", try .as*(Class).transcode(ResourceTranscoder)");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/request/h/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */