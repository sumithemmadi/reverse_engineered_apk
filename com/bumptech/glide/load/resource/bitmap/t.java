package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.o;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.p.j;

public final class t implements s<BitmapDrawable>, o {
  private final Resources b;
  
  private final s<Bitmap> c;
  
  private t(Resources paramResources, s<Bitmap> params) {
    this.b = (Resources)j.d(paramResources);
    this.c = (s<Bitmap>)j.d(params);
  }
  
  public static s<BitmapDrawable> e(Resources paramResources, s<Bitmap> params) {
    return (params == null) ? null : new t(paramResources, params);
  }
  
  public void D() {
    s<Bitmap> s1 = this.c;
    if (s1 instanceof o)
      ((o)s1).D(); 
  }
  
  public void a() {
    this.c.a();
  }
  
  public int b() {
    return this.c.b();
  }
  
  public Class<BitmapDrawable> c() {
    return BitmapDrawable.class;
  }
  
  public BitmapDrawable d() {
    return new BitmapDrawable(this.b, (Bitmap)this.c.get());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */