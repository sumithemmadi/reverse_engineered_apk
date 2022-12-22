package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

class n0 extends m0 {
  private static boolean k = true;
  
  @SuppressLint({"NewApi"})
  public void h(View paramView, int paramInt) {
    if (Build.VERSION.SDK_INT == 28) {
      super.h(paramView, paramInt);
    } else if (k) {
      try {
        paramView.setTransitionVisibility(paramInt);
      } catch (NoSuchMethodError noSuchMethodError) {
        k = false;
      } 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/n0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */