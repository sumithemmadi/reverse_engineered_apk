package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class i {
  static HashMap<String, Constructor<? extends c>> a;
  
  private HashMap<Integer, ArrayList<c>> b = new HashMap<Integer, ArrayList<c>>();
  
  static {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    a = (HashMap)hashMap;
    try {
      hashMap.put("KeyAttribute", d.class.getConstructor(new Class[0]));
      a.put("KeyPosition", j.class.getConstructor(new Class[0]));
      a.put("KeyCycle", f.class.getConstructor(new Class[0]));
      a.put("KeyTimeCycle", l.class.getConstructor(new Class[0]));
      a.put("KeyTrigger", m.class.getConstructor(new Class[0]));
    } catch (NoSuchMethodException noSuchMethodException) {
      Log.e("KeyFrames", "unable to load", noSuchMethodException);
    } 
  }
  
  public i(Context paramContext, XmlPullParser paramXmlPullParser) {
    c c = null;
    try {
      int j = paramXmlPullParser.getEventType();
      while (true) {
        c c1;
        if (j != 1) {
          if (j != 2) {
            if (j != 3) {
              c1 = c;
            } else {
              c1 = c;
              if ("KeyFrameSet".equals(paramXmlPullParser.getName()))
                return; 
            } 
          } else {
            Exception exception;
            String str = paramXmlPullParser.getName();
            boolean bool = a.containsKey(str);
            if (bool) {
              try {
                c c2 = ((Constructor<c>)a.get(str)).newInstance(new Object[0]);
                try {
                  c2.c(paramContext, Xml.asAttributeSet(paramXmlPullParser));
                  b(c2);
                  c = c2;
                } catch (Exception null) {
                  c = c2;
                } 
              } catch (Exception exception1) {
                exception = exception1;
              } 
              Log.e("KeyFrames", "unable to create ", exception);
            } 
            c1 = c;
            if (exception.equalsIgnoreCase("CustomAttribute")) {
              c1 = c;
              if (c != null) {
                HashMap<String, ConstraintAttribute> hashMap = c.f;
                c1 = c;
                if (hashMap != null) {
                  ConstraintAttribute.g(paramContext, paramXmlPullParser, hashMap);
                  c1 = c;
                } 
              } 
            } 
          } 
        } else {
          break;
        } 
        j = paramXmlPullParser.next();
        c = c1;
      } 
    } catch (XmlPullParserException xmlPullParserException) {
      xmlPullParserException.printStackTrace();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
  }
  
  private void b(c paramc) {
    if (!this.b.containsKey(Integer.valueOf(paramc.c)))
      this.b.put(Integer.valueOf(paramc.c), new ArrayList<c>()); 
    ((ArrayList<c>)this.b.get(Integer.valueOf(paramc.c))).add(paramc);
  }
  
  public void a(o paramo) {
    ArrayList<c> arrayList = this.b.get(Integer.valueOf(paramo.b));
    if (arrayList != null)
      paramo.b(arrayList); 
    arrayList = this.b.get(Integer.valueOf(-1));
    if (arrayList != null)
      for (c c : arrayList) {
        if (c.d(((ConstraintLayout.LayoutParams)paramo.a.getLayoutParams()).V))
          paramo.a(c); 
      }  
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/motion/widget/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */