package androidx.core.content.d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class b {
  private final Shader a;
  
  private final ColorStateList b;
  
  private int c;
  
  private b(Shader paramShader, ColorStateList paramColorStateList, int paramInt) {
    this.a = paramShader;
    this.b = paramColorStateList;
    this.c = paramInt;
  }
  
  private static b a(Resources paramResources, int paramInt, Resources.Theme paramTheme) {
    XmlResourceParser xmlResourceParser = paramResources.getXml(paramInt);
    AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
    while (true) {
      paramInt = xmlResourceParser.next();
      if (paramInt != 2 && paramInt != 1)
        continue; 
      break;
    } 
    if (paramInt == 2) {
      StringBuilder stringBuilder;
      String str = xmlResourceParser.getName();
      str.hashCode();
      if (!str.equals("gradient")) {
        if (str.equals("selector"))
          return c(a.b(paramResources, (XmlPullParser)xmlResourceParser, attributeSet, paramTheme)); 
        stringBuilder = new StringBuilder();
        stringBuilder.append(xmlResourceParser.getPositionDescription());
        stringBuilder.append(": unsupported complex color tag ");
        stringBuilder.append(str);
        throw new XmlPullParserException(stringBuilder.toString());
      } 
      return d(d.b((Resources)stringBuilder, (XmlPullParser)xmlResourceParser, attributeSet, paramTheme));
    } 
    XmlPullParserException xmlPullParserException = new XmlPullParserException("No start tag found");
    throw xmlPullParserException;
  }
  
  static b b(int paramInt) {
    return new b(null, null, paramInt);
  }
  
  static b c(ColorStateList paramColorStateList) {
    return new b(null, paramColorStateList, paramColorStateList.getDefaultColor());
  }
  
  static b d(Shader paramShader) {
    return new b(paramShader, null, 0);
  }
  
  public static b g(Resources paramResources, int paramInt, Resources.Theme paramTheme) {
    try {
      return a(paramResources, paramInt, paramTheme);
    } catch (Exception exception) {
      Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", exception);
      return null;
    } 
  }
  
  public int e() {
    return this.c;
  }
  
  public Shader f() {
    return this.a;
  }
  
  public boolean h() {
    boolean bool;
    if (this.a != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean i() {
    if (this.a == null) {
      ColorStateList colorStateList = this.b;
      if (colorStateList != null && colorStateList.isStateful())
        return true; 
    } 
    return false;
  }
  
  public boolean j(int[] paramArrayOfint) {
    if (i()) {
      ColorStateList colorStateList = this.b;
      int i = colorStateList.getColorForState(paramArrayOfint, colorStateList.getDefaultColor());
      if (i != this.c) {
        boolean bool = true;
        this.c = i;
        return bool;
      } 
    } 
    return false;
  }
  
  public void k(int paramInt) {
    this.c = paramInt;
  }
  
  public boolean l() {
    return (h() || this.c != 0);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/content/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */