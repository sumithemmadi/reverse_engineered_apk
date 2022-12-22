package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

class h0 implements i0 {
  private final ViewOverlay a;
  
  h0(View paramView) {
    this.a = paramView.getOverlay();
  }
  
  public void a(Drawable paramDrawable) {
    this.a.add(paramDrawable);
  }
  
  public void b(Drawable paramDrawable) {
    this.a.remove(paramDrawable);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */