package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.core.content.d.g;
import b.h.e.c;
import org.xmlpull.v1.XmlPullParser;

public class PatternPathMotion extends PathMotion {
  private Path a;
  
  private final Path b;
  
  private final Matrix c;
  
  public PatternPathMotion() {
    Path path = new Path();
    this.b = path;
    this.c = new Matrix();
    path.lineTo(1.0F, 0.0F);
    this.a = path;
  }
  
  @SuppressLint({"RestrictedApi"})
  public PatternPathMotion(Context paramContext, AttributeSet paramAttributeSet) {
    this.b = new Path();
    this.c = new Matrix();
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, t.k);
    try {
      String str = g.i(typedArray, (XmlPullParser)paramAttributeSet, "patternPathData", 0);
      if (str != null) {
        c(c.e(str));
        return;
      } 
      RuntimeException runtimeException = new RuntimeException();
      this("pathData must be supplied for patternPathMotion");
      throw runtimeException;
    } finally {
      typedArray.recycle();
    } 
  }
  
  private static float b(float paramFloat1, float paramFloat2) {
    return (float)Math.sqrt((paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2));
  }
  
  public Path a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    paramFloat3 -= paramFloat1;
    float f = paramFloat4 - paramFloat2;
    paramFloat4 = b(paramFloat3, f);
    double d = Math.atan2(f, paramFloat3);
    this.c.setScale(paramFloat4, paramFloat4);
    this.c.postRotate((float)Math.toDegrees(d));
    this.c.postTranslate(paramFloat1, paramFloat2);
    Path path = new Path();
    this.b.transform(this.c, path);
    return path;
  }
  
  public void c(Path paramPath) {
    PathMeasure pathMeasure = new PathMeasure(paramPath, false);
    float f1 = pathMeasure.getLength();
    float[] arrayOfFloat = new float[2];
    pathMeasure.getPosTan(f1, arrayOfFloat, null);
    float f2 = arrayOfFloat[0];
    f1 = arrayOfFloat[1];
    pathMeasure.getPosTan(0.0F, arrayOfFloat, null);
    float f3 = arrayOfFloat[0];
    float f4 = arrayOfFloat[1];
    if (f3 != f2 || f4 != f1) {
      this.c.setTranslate(-f3, -f4);
      f3 = f2 - f3;
      f1 -= f4;
      f4 = 1.0F / b(f3, f1);
      this.c.postScale(f4, f4);
      double d = Math.atan2(f1, f3);
      this.c.postRotate((float)Math.toDegrees(-d));
      paramPath.transform(this.c, this.b);
      this.a = paramPath;
      return;
    } 
    throw new IllegalArgumentException("pattern must not end at the starting point");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/PatternPathMotion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */