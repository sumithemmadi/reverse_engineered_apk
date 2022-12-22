package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

class k0 extends p0 {
  private static boolean f = true;
  
  public void a(View paramView) {}
  
  @SuppressLint({"NewApi"})
  public float c(View paramView) {
    if (f)
      try {
        return paramView.getTransitionAlpha();
      } catch (NoSuchMethodError noSuchMethodError) {
        f = false;
      }  
    return paramView.getAlpha();
  }
  
  public void d(View paramView) {}
  
  @SuppressLint({"NewApi"})
  public void g(View paramView, float paramFloat) {
    if (f)
      try {
        paramView.setTransitionAlpha(paramFloat);
        return;
      } catch (NoSuchMethodError noSuchMethodError) {
        f = false;
      }  
    paramView.setAlpha(paramFloat);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/k0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */