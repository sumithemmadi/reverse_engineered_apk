package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

class m0 extends l0 {
  private static boolean j = true;
  
  @SuppressLint({"NewApi"})
  public void f(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (j)
      try {
        paramView.setLeftTopRightBottom(paramInt1, paramInt2, paramInt3, paramInt4);
      } catch (NoSuchMethodError noSuchMethodError) {
        j = false;
      }  
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/m0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */