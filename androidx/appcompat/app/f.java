package androidx.appcompat.app;

import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class f {
  private final Deque<WeakReference<XmlPullParser>> a = new ArrayDeque<WeakReference<XmlPullParser>>();
  
  private static boolean b(XmlPullParser paramXmlPullParser) {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (paramXmlPullParser != null) {
      bool2 = bool1;
      try {
        if (paramXmlPullParser.getEventType() != 3) {
          int i = paramXmlPullParser.getEventType();
          if (i == 1) {
            bool2 = bool1;
          } else {
            bool2 = false;
          } 
        } 
      } catch (XmlPullParserException xmlPullParserException) {
        bool2 = bool1;
      } 
    } 
    return bool2;
  }
  
  private static XmlPullParser c(Deque<WeakReference<XmlPullParser>> paramDeque) {
    while (!paramDeque.isEmpty()) {
      XmlPullParser xmlPullParser = ((WeakReference<XmlPullParser>)paramDeque.peek()).get();
      if (b(xmlPullParser)) {
        paramDeque.pop();
        continue;
      } 
      return xmlPullParser;
    } 
    return null;
  }
  
  private static boolean d(XmlPullParser paramXmlPullParser1, XmlPullParser paramXmlPullParser2) {
    if (paramXmlPullParser2 != null && paramXmlPullParser1 != paramXmlPullParser2)
      try {
        if (paramXmlPullParser2.getEventType() == 2)
          return "include".equals(paramXmlPullParser2.getName()); 
      } catch (XmlPullParserException xmlPullParserException) {} 
    return false;
  }
  
  boolean a(AttributeSet paramAttributeSet) {
    if (paramAttributeSet instanceof XmlPullParser) {
      XmlPullParser xmlPullParser = (XmlPullParser)paramAttributeSet;
      if (xmlPullParser.getDepth() == 1) {
        XmlPullParser xmlPullParser1 = c(this.a);
        this.a.push(new WeakReference<XmlPullParser>(xmlPullParser));
        if (d(xmlPullParser, xmlPullParser1))
          return true; 
      } 
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/app/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */