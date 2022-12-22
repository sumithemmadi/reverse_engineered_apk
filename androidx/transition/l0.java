package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

class l0 extends k0 {
  private static boolean g = true;
  
  private static boolean h = true;
  
  private static boolean i = true;
  
  @SuppressLint({"NewApi"})
  public void e(View paramView, Matrix paramMatrix) {
    if (g)
      try {
        paramView.setAnimationMatrix(paramMatrix);
      } catch (NoSuchMethodError noSuchMethodError) {
        g = false;
      }  
  }
  
  @SuppressLint({"NewApi"})
  public void i(View paramView, Matrix paramMatrix) {
    if (h)
      try {
        paramView.transformMatrixToGlobal(paramMatrix);
      } catch (NoSuchMethodError noSuchMethodError) {
        h = false;
      }  
  }
  
  @SuppressLint({"NewApi"})
  public void j(View paramView, Matrix paramMatrix) {
    if (i)
      try {
        paramView.transformMatrixToLocal(paramMatrix);
      } catch (NoSuchMethodError noSuchMethodError) {
        i = false;
      }  
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/l0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */