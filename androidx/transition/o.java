package androidx.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

class o {
  static PropertyValuesHolder a(Property<?, PointF> paramProperty, Path paramPath) {
    return (Build.VERSION.SDK_INT >= 21) ? PropertyValuesHolder.ofObject(paramProperty, null, paramPath) : PropertyValuesHolder.ofFloat(new n(paramProperty, paramPath), new float[] { 0.0F, 1.0F });
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */