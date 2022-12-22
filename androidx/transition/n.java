package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

class n<T> extends Property<T, Float> {
  private final Property<T, PointF> a;
  
  private final PathMeasure b;
  
  private final float c;
  
  private final float[] d = new float[2];
  
  private final PointF e = new PointF();
  
  private float f;
  
  n(Property<T, PointF> paramProperty, Path paramPath) {
    super(Float.class, paramProperty.getName());
    this.a = paramProperty;
    PathMeasure pathMeasure = new PathMeasure(paramPath, false);
    this.b = pathMeasure;
    this.c = pathMeasure.getLength();
  }
  
  public Float a(T paramT) {
    return Float.valueOf(this.f);
  }
  
  public void b(T paramT, Float paramFloat) {
    this.f = paramFloat.floatValue();
    this.b.getPosTan(this.c * paramFloat.floatValue(), this.d, null);
    PointF pointF = this.e;
    float[] arrayOfFloat = this.d;
    pointF.x = arrayOfFloat[0];
    pointF.y = arrayOfFloat[1];
    this.a.set(paramT, pointF);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */