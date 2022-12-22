package com.bumptech.glide.request.h;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.p.k;

public abstract class c<T> implements h<T> {
  private final int b;
  
  private final int c;
  
  private com.bumptech.glide.request.c d;
  
  public c() {
    this(-2147483648, -2147483648);
  }
  
  public c(int paramInt1, int paramInt2) {
    if (k.s(paramInt1, paramInt2)) {
      this.b = paramInt1;
      this.c = paramInt2;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(" and height: ");
    stringBuilder.append(paramInt2);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void X() {}
  
  public final void a(g paramg) {}
  
  public final void c(com.bumptech.glide.request.c paramc) {
    this.d = paramc;
  }
  
  public void d(Drawable paramDrawable) {}
  
  public void e(Drawable paramDrawable) {}
  
  public final com.bumptech.glide.request.c f() {
    return this.d;
  }
  
  public final void h(g paramg) {
    paramg.e(this.b, this.c);
  }
  
  public void onDestroy() {}
  
  public void onStart() {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/request/h/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */