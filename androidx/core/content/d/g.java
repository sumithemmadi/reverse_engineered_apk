package androidx.core.content.d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

public class g {
  public static boolean a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt, boolean paramBoolean) {
    return !j(paramXmlPullParser, paramString) ? paramBoolean : paramTypedArray.getBoolean(paramInt, paramBoolean);
  }
  
  public static int b(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt1, int paramInt2) {
    return !j(paramXmlPullParser, paramString) ? paramInt2 : paramTypedArray.getColor(paramInt1, paramInt2);
  }
  
  public static ColorStateList c(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme, String paramString, int paramInt) {
    if (j(paramXmlPullParser, paramString)) {
      TypedValue typedValue = new TypedValue();
      paramTypedArray.getValue(paramInt, typedValue);
      int i = typedValue.type;
      if (i != 2)
        return (i >= 28 && i <= 31) ? d(typedValue) : a.c(paramTypedArray.getResources(), paramTypedArray.getResourceId(paramInt, 0), paramTheme); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failed to resolve attribute at index ");
      stringBuilder.append(paramInt);
      stringBuilder.append(": ");
      stringBuilder.append(typedValue);
      throw new UnsupportedOperationException(stringBuilder.toString());
    } 
    return null;
  }
  
  private static ColorStateList d(TypedValue paramTypedValue) {
    return ColorStateList.valueOf(paramTypedValue.data);
  }
  
  public static b e(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme, String paramString, int paramInt1, int paramInt2) {
    if (j(paramXmlPullParser, paramString)) {
      TypedValue typedValue = new TypedValue();
      paramTypedArray.getValue(paramInt1, typedValue);
      int i = typedValue.type;
      if (i >= 28 && i <= 31)
        return b.b(typedValue.data); 
      b b = b.g(paramTypedArray.getResources(), paramTypedArray.getResourceId(paramInt1, 0), paramTheme);
      if (b != null)
        return b; 
    } 
    return b.b(paramInt2);
  }
  
  public static float f(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt, float paramFloat) {
    return !j(paramXmlPullParser, paramString) ? paramFloat : paramTypedArray.getFloat(paramInt, paramFloat);
  }
  
  public static int g(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt1, int paramInt2) {
    return !j(paramXmlPullParser, paramString) ? paramInt2 : paramTypedArray.getInt(paramInt1, paramInt2);
  }
  
  public static int h(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt1, int paramInt2) {
    return !j(paramXmlPullParser, paramString) ? paramInt2 : paramTypedArray.getResourceId(paramInt1, paramInt2);
  }
  
  public static String i(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt) {
    return !j(paramXmlPullParser, paramString) ? null : paramTypedArray.getString(paramInt);
  }
  
  public static boolean j(XmlPullParser paramXmlPullParser, String paramString) {
    boolean bool;
    if (paramXmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", paramString) != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static TypedArray k(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfint) {
    return (paramTheme == null) ? paramResources.obtainAttributes(paramAttributeSet, paramArrayOfint) : paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfint, 0, 0);
  }
  
  public static TypedValue l(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt) {
    return !j(paramXmlPullParser, paramString) ? null : paramTypedArray.peekValue(paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/content/d/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */