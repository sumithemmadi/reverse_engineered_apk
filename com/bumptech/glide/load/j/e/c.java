package com.bumptech.glide.load.j.e;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.s;

final class c extends b<Drawable> {
  private c(Drawable paramDrawable) {
    super(paramDrawable);
  }
  
  static s<Drawable> e(Drawable paramDrawable) {
    if (paramDrawable != null) {
      c c1 = new c(paramDrawable);
    } else {
      paramDrawable = null;
    } 
    return (s<Drawable>)paramDrawable;
  }
  
  public void a() {}
  
  public int b() {
    return Math.max(1, this.b.getIntrinsicWidth() * this.b.getIntrinsicHeight() * 4);
  }
  
  public Class<Drawable> c() {
    return (Class)this.b.getClass();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/j/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */