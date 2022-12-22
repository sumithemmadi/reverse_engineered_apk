package androidx.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

class j {
  static f a(View paramView, ViewGroup paramViewGroup, Matrix paramMatrix) {
    return (Build.VERSION.SDK_INT == 28) ? h.b(paramView, paramViewGroup, paramMatrix) : i.b(paramView, paramViewGroup, paramMatrix);
  }
  
  static void b(View paramView) {
    if (Build.VERSION.SDK_INT == 28) {
      h.f(paramView);
    } else {
      i.f(paramView);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */