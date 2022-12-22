package b.t.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import b.h.e.c;
import org.xmlpull.v1.XmlPullParser;

public class g implements Interpolator {
  private float[] a;
  
  private float[] b;
  
  public g(Context paramContext, AttributeSet paramAttributeSet, XmlPullParser paramXmlPullParser) {
    this(paramContext.getResources(), paramContext.getTheme(), paramAttributeSet, paramXmlPullParser);
  }
  
  public g(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, XmlPullParser paramXmlPullParser) {
    TypedArray typedArray = androidx.core.content.d.g.k(paramResources, paramTheme, paramAttributeSet, a.l);
    d(typedArray, paramXmlPullParser);
    typedArray.recycle();
  }
  
  private void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    Path path = new Path();
    path.moveTo(0.0F, 0.0F);
    path.cubicTo(paramFloat1, paramFloat2, paramFloat3, paramFloat4, 1.0F, 1.0F);
    b(path);
  }
  
  private void b(Path paramPath) {
    byte b = 0;
    PathMeasure pathMeasure = new PathMeasure(paramPath, false);
    float f = pathMeasure.getLength();
    int i = Math.min(3000, (int)(f / 0.002F) + 1);
    if (i > 0) {
      this.a = new float[i];
      this.b = new float[i];
      float[] arrayOfFloat = new float[2];
      int j;
      for (j = 0; j < i; j++) {
        pathMeasure.getPosTan(j * f / (i - 1), arrayOfFloat, null);
        this.a[j] = arrayOfFloat[0];
        this.b[j] = arrayOfFloat[1];
      } 
      if (Math.abs(this.a[0]) <= 1.0E-5D && Math.abs(this.b[0]) <= 1.0E-5D) {
        arrayOfFloat = this.a;
        j = i - 1;
        if (Math.abs(arrayOfFloat[j] - 1.0F) <= 1.0E-5D && Math.abs(this.b[j] - 1.0F) <= 1.0E-5D) {
          StringBuilder stringBuilder2;
          f = 0.0F;
          j = 0;
          while (b < i) {
            arrayOfFloat = this.a;
            float f1 = arrayOfFloat[j];
            if (f1 >= f) {
              arrayOfFloat[b] = f1;
              b++;
              f = f1;
              j++;
              continue;
            } 
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("The Path cannot loop back on itself, x :");
            stringBuilder2.append(f1);
            throw new IllegalArgumentException(stringBuilder2.toString());
          } 
          if (!stringBuilder2.nextContour())
            return; 
          throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
        } 
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("The Path must start at (0,0) and end at (1,1) start: ");
      stringBuilder1.append(this.a[0]);
      stringBuilder1.append(",");
      stringBuilder1.append(this.b[0]);
      stringBuilder1.append(" end:");
      arrayOfFloat = this.a;
      j = i - 1;
      stringBuilder1.append(arrayOfFloat[j]);
      stringBuilder1.append(",");
      stringBuilder1.append(this.b[j]);
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("The Path has a invalid length ");
    stringBuilder.append(f);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
  
  private void c(float paramFloat1, float paramFloat2) {
    Path path = new Path();
    path.moveTo(0.0F, 0.0F);
    path.quadTo(paramFloat1, paramFloat2, 1.0F, 1.0F);
    b(path);
  }
  
  private void d(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser) {
    String str;
    StringBuilder stringBuilder;
    if (androidx.core.content.d.g.j(paramXmlPullParser, "pathData")) {
      str = androidx.core.content.d.g.i(paramTypedArray, paramXmlPullParser, "pathData", 4);
      Path path = c.e(str);
      if (path != null) {
        b(path);
      } else {
        stringBuilder = new StringBuilder();
        stringBuilder.append("The path is null, which is created from ");
        stringBuilder.append(str);
        throw new InflateException(stringBuilder.toString());
      } 
    } else {
      if (androidx.core.content.d.g.j((XmlPullParser)stringBuilder, "controlX1")) {
        if (androidx.core.content.d.g.j((XmlPullParser)stringBuilder, "controlY1")) {
          float f1 = androidx.core.content.d.g.f((TypedArray)str, (XmlPullParser)stringBuilder, "controlX1", 0, 0.0F);
          float f2 = androidx.core.content.d.g.f((TypedArray)str, (XmlPullParser)stringBuilder, "controlY1", 1, 0.0F);
          boolean bool = androidx.core.content.d.g.j((XmlPullParser)stringBuilder, "controlX2");
          if (bool == androidx.core.content.d.g.j((XmlPullParser)stringBuilder, "controlY2")) {
            if (!bool) {
              c(f1, f2);
            } else {
              a(f1, f2, androidx.core.content.d.g.f((TypedArray)str, (XmlPullParser)stringBuilder, "controlX2", 2, 0.0F), androidx.core.content.d.g.f((TypedArray)str, (XmlPullParser)stringBuilder, "controlY2", 3, 0.0F));
            } 
            return;
          } 
          throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        } 
        throw new InflateException("pathInterpolator requires the controlY1 attribute");
      } 
      throw new InflateException("pathInterpolator requires the controlX1 attribute");
    } 
  }
  
  public float getInterpolation(float paramFloat) {
    if (paramFloat <= 0.0F)
      return 0.0F; 
    if (paramFloat >= 1.0F)
      return 1.0F; 
    int i = 0;
    int j = this.a.length - 1;
    while (j - i > 1) {
      int k = (i + j) / 2;
      if (paramFloat < this.a[k]) {
        j = k;
        continue;
      } 
      i = k;
    } 
    float[] arrayOfFloat = this.a;
    float f = arrayOfFloat[j] - arrayOfFloat[i];
    if (f == 0.0F)
      return this.b[i]; 
    paramFloat = (paramFloat - arrayOfFloat[i]) / f;
    arrayOfFloat = this.b;
    f = arrayOfFloat[i];
    return f + paramFloat * (arrayOfFloat[j] - f);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/t/a/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */