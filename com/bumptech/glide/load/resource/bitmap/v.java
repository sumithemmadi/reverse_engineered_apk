package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.engine.x.e;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.j.e.d;

public class v implements f<Uri, Bitmap> {
  private final d a;
  
  private final e b;
  
  public v(d paramd, e parame) {
    this.a = paramd;
    this.b = parame;
  }
  
  public s<Bitmap> c(Uri paramUri, int paramInt1, int paramInt2, e parame) {
    s s = this.a.c(paramUri, paramInt1, paramInt2, parame);
    if (s == null)
      return null; 
    Drawable drawable = (Drawable)s.get();
    return m.a(this.b, drawable, paramInt1, paramInt2);
  }
  
  public boolean d(Uri paramUri, e parame) {
    return "android.resource".equals(paramUri.getScheme());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */