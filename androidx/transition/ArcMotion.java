package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.core.content.d.g;
import org.xmlpull.v1.XmlPullParser;

public class ArcMotion extends PathMotion {
  private static final float a = (float)Math.tan(Math.toRadians(35.0D));
  
  private float b = 0.0F;
  
  private float c = 0.0F;
  
  private float d = 70.0F;
  
  private float e = 0.0F;
  
  private float f = 0.0F;
  
  private float g = a;
  
  public ArcMotion() {}
  
  @SuppressLint({"RestrictedApi"})
  public ArcMotion(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, t.j);
    XmlPullParser xmlPullParser = (XmlPullParser)paramAttributeSet;
    d(g.f(typedArray, xmlPullParser, "minimumVerticalAngle", 1, 0.0F));
    c(g.f(typedArray, xmlPullParser, "minimumHorizontalAngle", 0, 0.0F));
    b(g.f(typedArray, xmlPullParser, "maximumAngle", 2, 70.0F));
    typedArray.recycle();
  }
  
  private static float e(float paramFloat) {
    if (paramFloat >= 0.0F && paramFloat <= 90.0F)
      return (float)Math.tan(Math.toRadians((paramFloat / 2.0F))); 
    throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
  }
  
  public Path a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    boolean bool;
    Path path = new Path();
    path.moveTo(paramFloat1, paramFloat2);
    float f1 = paramFloat3 - paramFloat1;
    float f2 = paramFloat4 - paramFloat2;
    float f3 = f1 * f1 + f2 * f2;
    float f4 = (paramFloat1 + paramFloat3) / 2.0F;
    float f5 = (paramFloat2 + paramFloat4) / 2.0F;
    float f6 = 0.25F * f3;
    if (paramFloat2 > paramFloat4) {
      bool = true;
    } else {
      bool = false;
    } 
    if (Math.abs(f1) < Math.abs(f2)) {
      f2 = Math.abs(f3 / f2 * 2.0F);
      if (bool) {
        f2 += paramFloat4;
        f3 = paramFloat3;
      } else {
        f2 += paramFloat2;
        f3 = paramFloat1;
      } 
      f1 = this.f;
    } else {
      f3 /= f1 * 2.0F;
      if (bool) {
        f2 = paramFloat2;
        f3 += paramFloat1;
      } else {
        f3 = paramFloat3 - f3;
        f2 = paramFloat4;
      } 
      f1 = this.e;
    } 
    f1 = f6 * f1 * f1;
    float f7 = f4 - f3;
    float f8 = f5 - f2;
    f7 = f7 * f7 + f8 * f8;
    f8 = this.g;
    f6 = f6 * f8 * f8;
    if (f7 >= f1)
      if (f7 > f6) {
        f1 = f6;
      } else {
        f1 = 0.0F;
      }  
    f8 = f2;
    f6 = f3;
    if (f1 != 0.0F) {
      f1 = (float)Math.sqrt((f1 / f7));
      f6 = (f3 - f4) * f1 + f4;
      f8 = f5 + f1 * (f2 - f5);
    } 
    path.cubicTo((paramFloat1 + f6) / 2.0F, (paramFloat2 + f8) / 2.0F, (f6 + paramFloat3) / 2.0F, (f8 + paramFloat4) / 2.0F, paramFloat3, paramFloat4);
    return path;
  }
  
  public void b(float paramFloat) {
    this.d = paramFloat;
    this.g = e(paramFloat);
  }
  
  public void c(float paramFloat) {
    this.b = paramFloat;
    this.e = e(paramFloat);
  }
  
  public void d(float paramFloat) {
    this.c = paramFloat;
    this.f = e(paramFloat);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/ArcMotion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */