package androidx.core.content.d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import b.h.d;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class a {
  public static ColorStateList a(Resources paramResources, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme) {
    int i;
    AttributeSet attributeSet = Xml.asAttributeSet(paramXmlPullParser);
    while (true) {
      i = paramXmlPullParser.next();
      if (i != 2 && i != 1)
        continue; 
      break;
    } 
    if (i == 2)
      return b(paramResources, paramXmlPullParser, attributeSet, paramTheme); 
    XmlPullParserException xmlPullParserException = new XmlPullParserException("No start tag found");
    throw xmlPullParserException;
  }
  
  public static ColorStateList b(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    String str = paramXmlPullParser.getName();
    if (str.equals("selector"))
      return d(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramXmlPullParser.getPositionDescription());
    stringBuilder.append(": invalid color state list tag ");
    stringBuilder.append(str);
    throw new XmlPullParserException(stringBuilder.toString());
  }
  
  public static ColorStateList c(Resources paramResources, int paramInt, Resources.Theme paramTheme) {
    try {
      return a(paramResources, (XmlPullParser)paramResources.getXml(paramInt), paramTheme);
    } catch (Exception exception) {
      Log.e("CSLCompat", "Failed to inflate ColorStateList.", exception);
      return null;
    } 
  }
  
  private static ColorStateList d(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    int i = paramXmlPullParser.getDepth() + 1;
    int[][] arrayOfInt3 = new int[20][];
    int[] arrayOfInt4 = new int[20];
    byte b = 0;
    while (true) {
      int j = paramXmlPullParser.next();
      if (j != 1) {
        int k = paramXmlPullParser.getDepth();
        if (k >= i || j != 3) {
          if (j != 2 || k > i || !paramXmlPullParser.getName().equals("item"))
            continue; 
          TypedArray typedArray = f(paramResources, paramTheme, paramAttributeSet, d.ColorStateListItem);
          int m = typedArray.getColor(d.ColorStateListItem_android_color, -65281);
          float f = 1.0F;
          j = d.ColorStateListItem_android_alpha;
          if (typedArray.hasValue(j)) {
            f = typedArray.getFloat(j, 1.0F);
          } else {
            j = d.ColorStateListItem_alpha;
            if (typedArray.hasValue(j))
              f = typedArray.getFloat(j, 1.0F); 
          } 
          typedArray.recycle();
          int n = paramAttributeSet.getAttributeCount();
          int[] arrayOfInt = new int[n];
          k = 0;
          for (j = 0; k < n; j = i2) {
            int i1 = paramAttributeSet.getAttributeNameResource(k);
            int i2 = j;
            if (i1 != 16843173) {
              i2 = j;
              if (i1 != 16843551) {
                i2 = j;
                if (i1 != b.h.a.alpha) {
                  if (paramAttributeSet.getAttributeBooleanValue(k, false)) {
                    i2 = i1;
                  } else {
                    i2 = -i1;
                  } 
                  arrayOfInt[j] = i2;
                  i2 = j + 1;
                } 
              } 
            } 
            k++;
          } 
          arrayOfInt = StateSet.trimStateSet(arrayOfInt, j);
          arrayOfInt4 = e.a(arrayOfInt4, b, e(m, f));
          arrayOfInt3 = e.<int[]>b(arrayOfInt3, b, arrayOfInt);
          b++;
          continue;
        } 
      } 
      break;
    } 
    int[] arrayOfInt1 = new int[b];
    int[][] arrayOfInt2 = new int[b][];
    System.arraycopy(arrayOfInt4, 0, arrayOfInt1, 0, b);
    System.arraycopy(arrayOfInt3, 0, arrayOfInt2, 0, b);
    return new ColorStateList(arrayOfInt2, arrayOfInt1);
  }
  
  private static int e(int paramInt, float paramFloat) {
    return paramInt & 0xFFFFFF | Math.round(Color.alpha(paramInt) * paramFloat) << 24;
  }
  
  private static TypedArray f(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfint) {
    TypedArray typedArray;
    if (paramTheme == null) {
      typedArray = paramResources.obtainAttributes(paramAttributeSet, paramArrayOfint);
    } else {
      typedArray = paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfint, 0, 0);
    } 
    return typedArray;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/content/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */