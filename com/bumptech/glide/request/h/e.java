package com.bumptech.glide.request.h;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.i.b;

public abstract class e<Z> extends i<ImageView, Z> implements b.a {
  private Animatable i;
  
  public e(ImageView paramImageView) {
    super(paramImageView);
  }
  
  private void m(Z paramZ) {
    if (paramZ instanceof Animatable) {
      Animatable animatable = (Animatable)paramZ;
      this.i = animatable;
      animatable.start();
    } else {
      this.i = null;
    } 
  }
  
  private void p(Z paramZ) {
    o(paramZ);
    m(paramZ);
  }
  
  public void X() {
    Animatable animatable = this.i;
    if (animatable != null)
      animatable.stop(); 
  }
  
  public void b(Z paramZ, b<? super Z> paramb) {
    if (paramb == null || !paramb.a(paramZ, this)) {
      p(paramZ);
      return;
    } 
    m(paramZ);
  }
  
  public void d(Drawable paramDrawable) {
    super.d(paramDrawable);
    p(null);
    n(paramDrawable);
  }
  
  public void e(Drawable paramDrawable) {
    super.e(paramDrawable);
    p(null);
    n(paramDrawable);
  }
  
  public void g(Drawable paramDrawable) {
    super.g(paramDrawable);
    Animatable animatable = this.i;
    if (animatable != null)
      animatable.stop(); 
    p(null);
    n(paramDrawable);
  }
  
  public void n(Drawable paramDrawable) {
    ((ImageView)this.d).setImageDrawable(paramDrawable);
  }
  
  protected abstract void o(Z paramZ);
  
  public void onStart() {
    Animatable animatable = this.i;
    if (animatable != null)
      animatable.start(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/request/h/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */