package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.engine.x.e;
import com.bumptech.glide.load.g;
import java.io.File;

public class b implements g<BitmapDrawable> {
  private final e a;
  
  private final g<Bitmap> b;
  
  public b(e parame, g<Bitmap> paramg) {
    this.a = parame;
    this.b = paramg;
  }
  
  public EncodeStrategy b(e parame) {
    return this.b.b(parame);
  }
  
  public boolean c(s<BitmapDrawable> params, File paramFile, e parame) {
    return this.b.a(new e(((BitmapDrawable)params.get()).getBitmap(), this.a), paramFile, parame);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */