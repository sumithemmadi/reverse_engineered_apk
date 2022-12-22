package androidx.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

class m {
  static <T> ObjectAnimator a(T paramT, Property<T, PointF> paramProperty, Path paramPath) {
    return (Build.VERSION.SDK_INT >= 21) ? ObjectAnimator.ofObject(paramT, paramProperty, null, paramPath) : ObjectAnimator.ofFloat(paramT, new n<T>(paramProperty, paramPath), new float[] { 0.0F, 1.0F });
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */