package com.bumptech.glide.load.j.g;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.c;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.engine.x.e;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.resource.bitmap.e;
import com.bumptech.glide.p.j;
import java.security.MessageDigest;

public class f implements h<c> {
  private final h<Bitmap> b;
  
  public f(h<Bitmap> paramh) {
    this.b = (h<Bitmap>)j.d(paramh);
  }
  
  public void a(MessageDigest paramMessageDigest) {
    this.b.a(paramMessageDigest);
  }
  
  public s<c> b(Context paramContext, s<c> params, int paramInt1, int paramInt2) {
    c c = (c)params.get();
    e e1 = c.c(paramContext).f();
    e e = new e(c.e(), e1);
    s s1 = this.b.b(paramContext, (s)e, paramInt1, paramInt2);
    if (!e.equals(s1))
      e.a(); 
    Bitmap bitmap = (Bitmap)s1.get();
    c.m(this.b, bitmap);
    return params;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof f) {
      paramObject = paramObject;
      return this.b.equals(((f)paramObject).b);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.b.hashCode();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/j/g/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */