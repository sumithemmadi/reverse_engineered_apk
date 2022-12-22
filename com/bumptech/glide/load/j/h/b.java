package com.bumptech.glide.load.j.h;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.resource.bitmap.t;
import com.bumptech.glide.p.j;

public class b implements e<Bitmap, BitmapDrawable> {
  private final Resources a;
  
  public b(Resources paramResources) {
    this.a = (Resources)j.d(paramResources);
  }
  
  public s<BitmapDrawable> a(s<Bitmap> params, e parame) {
    return t.e(this.a, params);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/j/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */