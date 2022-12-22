package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.c;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.engine.x.e;
import com.bumptech.glide.load.h;
import java.security.MessageDigest;

public class n implements h<Drawable> {
  private final h<Bitmap> b;
  
  private final boolean c;
  
  public n(h<Bitmap> paramh, boolean paramBoolean) {
    this.b = paramh;
    this.c = paramBoolean;
  }
  
  private s<Drawable> d(Context paramContext, s<Bitmap> params) {
    return (s)t.e(paramContext.getResources(), params);
  }
  
  public void a(MessageDigest paramMessageDigest) {
    this.b.a(paramMessageDigest);
  }
  
  public s<Drawable> b(Context paramContext, s<Drawable> params, int paramInt1, int paramInt2) {
    StringBuilder stringBuilder;
    e e = c.c(paramContext).f();
    Drawable drawable = (Drawable)params.get();
    s<Bitmap> s1 = m.a(e, drawable, paramInt1, paramInt2);
    if (s1 == null) {
      if (!this.c)
        return params; 
      stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to convert ");
      stringBuilder.append(drawable);
      stringBuilder.append(" to a Bitmap");
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    s<Bitmap> s2 = this.b.b((Context)stringBuilder, s1, paramInt1, paramInt2);
    if (s2.equals(s1)) {
      s2.a();
      return params;
    } 
    return d((Context)stringBuilder, s2);
  }
  
  public h<BitmapDrawable> c() {
    return this;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof n) {
      paramObject = paramObject;
      return this.b.equals(((n)paramObject).b);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.b.hashCode();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */