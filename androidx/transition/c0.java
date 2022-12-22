package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

class c0 implements d0 {
  private final ViewGroupOverlay a;
  
  c0(ViewGroup paramViewGroup) {
    this.a = paramViewGroup.getOverlay();
  }
  
  public void a(Drawable paramDrawable) {
    this.a.add(paramDrawable);
  }
  
  public void b(Drawable paramDrawable) {
    this.a.remove(paramDrawable);
  }
  
  public void c(View paramView) {
    this.a.add(paramView);
  }
  
  public void d(View paramView) {
    this.a.remove(paramView);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */