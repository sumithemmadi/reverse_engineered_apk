package androidx.core.content.d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class d {
  private static a a(a parama, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3) {
    return (parama != null) ? parama : (paramBoolean ? new a(paramInt1, paramInt3, paramInt2) : new a(paramInt1, paramInt2));
  }
  
  static Shader b(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    TypedArray typedArray;
    String str = paramXmlPullParser.getName();
    if (str.equals("gradient")) {
      typedArray = g.k(paramResources, paramTheme, paramAttributeSet, b.h.d.GradientColor);
      float f1 = g.f(typedArray, paramXmlPullParser, "startX", b.h.d.GradientColor_android_startX, 0.0F);
      float f2 = g.f(typedArray, paramXmlPullParser, "startY", b.h.d.GradientColor_android_startY, 0.0F);
      float f3 = g.f(typedArray, paramXmlPullParser, "endX", b.h.d.GradientColor_android_endX, 0.0F);
      float f4 = g.f(typedArray, paramXmlPullParser, "endY", b.h.d.GradientColor_android_endY, 0.0F);
      float f5 = g.f(typedArray, paramXmlPullParser, "centerX", b.h.d.GradientColor_android_centerX, 0.0F);
      float f6 = g.f(typedArray, paramXmlPullParser, "centerY", b.h.d.GradientColor_android_centerY, 0.0F);
      int i = g.g(typedArray, paramXmlPullParser, "type", b.h.d.GradientColor_android_type, 0);
      int j = g.b(typedArray, paramXmlPullParser, "startColor", b.h.d.GradientColor_android_startColor, 0);
      boolean bool = g.j(paramXmlPullParser, "centerColor");
      int k = g.b(typedArray, paramXmlPullParser, "centerColor", b.h.d.GradientColor_android_centerColor, 0);
      int m = g.b(typedArray, paramXmlPullParser, "endColor", b.h.d.GradientColor_android_endColor, 0);
      int n = g.g(typedArray, paramXmlPullParser, "tileMode", b.h.d.GradientColor_android_tileMode, 0);
      float f7 = g.f(typedArray, paramXmlPullParser, "gradientRadius", b.h.d.GradientColor_android_gradientRadius, 0.0F);
      typedArray.recycle();
      a a = a(c(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme), j, m, bool, k);
      if (i != 1)
        return (Shader)((i != 2) ? new LinearGradient(f1, f2, f3, f4, a.a, a.b, d(n)) : new SweepGradient(f5, f6, a.a, a.b)); 
      if (f7 > 0.0F)
        return (Shader)new RadialGradient(f5, f6, f7, a.a, a.b, d(n)); 
      throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramXmlPullParser.getPositionDescription());
    stringBuilder.append(": invalid gradient color tag ");
    stringBuilder.append((String)typedArray);
    throw new XmlPullParserException(stringBuilder.toString());
  }
  
  private static a c(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    int i = paramXmlPullParser.getDepth() + 1;
    ArrayList<Float> arrayList = new ArrayList(20);
    ArrayList<Integer> arrayList1 = new ArrayList(20);
    while (true) {
      int j = paramXmlPullParser.next();
      if (j != 1) {
        int k = paramXmlPullParser.getDepth();
        if (k >= i || j != 3) {
          if (j != 2 || k > i || !paramXmlPullParser.getName().equals("item"))
            continue; 
          TypedArray typedArray = g.k(paramResources, paramTheme, paramAttributeSet, b.h.d.GradientColorItem);
          j = b.h.d.GradientColorItem_android_color;
          boolean bool1 = typedArray.hasValue(j);
          k = b.h.d.GradientColorItem_android_offset;
          boolean bool2 = typedArray.hasValue(k);
          if (bool1 && bool2) {
            j = typedArray.getColor(j, 0);
            float f = typedArray.getFloat(k, 0.0F);
            typedArray.recycle();
            arrayList1.add(Integer.valueOf(j));
            arrayList.add(Float.valueOf(f));
            continue;
          } 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(paramXmlPullParser.getPositionDescription());
          stringBuilder.append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
          throw new XmlPullParserException(stringBuilder.toString());
        } 
      } 
      break;
    } 
    return (arrayList1.size() > 0) ? new a(arrayList1, arrayList) : null;
  }
  
  private static Shader.TileMode d(int paramInt) {
    return (paramInt != 1) ? ((paramInt != 2) ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR) : Shader.TileMode.REPEAT;
  }
  
  static final class a {
    final int[] a;
    
    final float[] b;
    
    a(int param1Int1, int param1Int2) {
      this.a = new int[] { param1Int1, param1Int2 };
      this.b = new float[] { 0.0F, 1.0F };
    }
    
    a(int param1Int1, int param1Int2, int param1Int3) {
      this.a = new int[] { param1Int1, param1Int2, param1Int3 };
      this.b = new float[] { 0.0F, 0.5F, 1.0F };
    }
    
    a(List<Integer> param1List, List<Float> param1List1) {
      int i = param1List.size();
      this.a = new int[i];
      this.b = new float[i];
      for (byte b = 0; b < i; b++) {
        this.a[b] = ((Integer)param1List.get(b)).intValue();
        this.b[b] = ((Float)param1List1.get(b)).floatValue();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/content/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */