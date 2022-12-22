package com.bumptech.glide.load.j.e;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.o;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.j.g.c;
import com.bumptech.glide.p.j;

public abstract class b<T extends Drawable> implements s<T>, o {
  protected final T b;
  
  public b(T paramT) {
    this.b = (T)j.d(paramT);
  }
  
  public void D() {
    T t = this.b;
    if (t instanceof BitmapDrawable) {
      ((BitmapDrawable)t).getBitmap().prepareToDraw();
    } else if (t instanceof c) {
      ((c)t).e().prepareToDraw();
    } 
  }
  
  public final T d() {
    Drawable.ConstantState constantState = this.b.getConstantState();
    return (T)((constantState == null) ? (Object)this.b : constantState.newDrawable());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/j/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */