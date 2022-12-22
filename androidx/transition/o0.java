package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

class o0 extends n0 {
  public float c(View paramView) {
    return paramView.getTransitionAlpha();
  }
  
  public void e(View paramView, Matrix paramMatrix) {
    paramView.setAnimationMatrix(paramMatrix);
  }
  
  public void f(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramView.setLeftTopRightBottom(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void g(View paramView, float paramFloat) {
    paramView.setTransitionAlpha(paramFloat);
  }
  
  public void h(View paramView, int paramInt) {
    paramView.setTransitionVisibility(paramInt);
  }
  
  public void i(View paramView, Matrix paramMatrix) {
    paramView.transformMatrixToGlobal(paramMatrix);
  }
  
  public void j(View paramView, Matrix paramMatrix) {
    paramView.transformMatrixToLocal(paramMatrix);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/o0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */