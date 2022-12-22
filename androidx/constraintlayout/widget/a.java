package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class a {
  private final ConstraintLayout a;
  
  b b;
  
  int c = -1;
  
  int d = -1;
  
  private SparseArray<a> e = new SparseArray();
  
  private SparseArray<b> f = new SparseArray();
  
  private c g;
  
  a(Context paramContext, ConstraintLayout paramConstraintLayout, int paramInt) {
    this.a = paramConstraintLayout;
    a(paramContext, paramInt);
  }
  
  private void a(Context paramContext, int paramInt) {
    XmlResourceParser xmlResourceParser = paramContext.getResources().getXml(paramInt);
    StringBuilder stringBuilder = null;
    try {
      paramInt = xmlResourceParser.getEventType();
      while (paramInt != 1) {
        StringBuilder stringBuilder1;
        if (paramInt != 0) {
          if (paramInt != 2) {
            stringBuilder1 = stringBuilder;
          } else {
            String str = xmlResourceParser.getName();
            paramInt = -1;
            switch (str.hashCode()) {
              case 1901439077:
                if (str.equals("Variant"))
                  paramInt = 3; 
                break;
              case 1657696882:
                if (str.equals("layoutDescription"))
                  paramInt = 0; 
                break;
              case 1382829617:
                if (str.equals("StateSet"))
                  paramInt = 1; 
                break;
              case 80204913:
                if (str.equals("State"))
                  paramInt = 2; 
                break;
              case -1349929691:
                if (str.equals("ConstraintSet"))
                  paramInt = 4; 
                break;
            } 
            stringBuilder1 = stringBuilder;
            if (paramInt != 0) {
              stringBuilder1 = stringBuilder;
              if (paramInt != 1)
                if (paramInt != 2) {
                  if (paramInt != 3) {
                    if (paramInt != 4) {
                      stringBuilder1 = new StringBuilder();
                      this();
                      stringBuilder1.append("unknown tag ");
                      stringBuilder1.append(str);
                      Log.v("ConstraintLayoutStates", stringBuilder1.toString());
                      stringBuilder1 = stringBuilder;
                    } else {
                      b(paramContext, (XmlPullParser)xmlResourceParser);
                      stringBuilder1 = stringBuilder;
                    } 
                  } else {
                    b b1 = new b();
                    this(paramContext, (XmlPullParser)xmlResourceParser);
                    stringBuilder1 = stringBuilder;
                    if (stringBuilder != null) {
                      stringBuilder.a(b1);
                      stringBuilder1 = stringBuilder;
                    } 
                  } 
                } else {
                  a a1 = new a();
                  this(paramContext, (XmlPullParser)xmlResourceParser);
                  this.e.put(a1.a, a1);
                }  
            } 
          } 
        } else {
          xmlResourceParser.getName();
          stringBuilder1 = stringBuilder;
        } 
        paramInt = xmlResourceParser.next();
        stringBuilder = stringBuilder1;
      } 
    } catch (XmlPullParserException xmlPullParserException) {
      xmlPullParserException.printStackTrace();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
  }
  
  private void b(Context paramContext, XmlPullParser paramXmlPullParser) {
    b b1 = new b();
    int i = paramXmlPullParser.getAttributeCount();
    for (int j = 0; j < i; j++) {
      if ("id".equals(paramXmlPullParser.getAttributeName(j))) {
        String str = paramXmlPullParser.getAttributeValue(j);
        if (str.contains("/")) {
          String str1 = str.substring(str.indexOf('/') + 1);
          j = paramContext.getResources().getIdentifier(str1, "id", paramContext.getPackageName());
        } else {
          j = -1;
        } 
        i = j;
        if (j == -1)
          if (str.length() > 1) {
            i = Integer.parseInt(str.substring(1));
          } else {
            Log.e("ConstraintLayoutStates", "error in parsing id");
            i = j;
          }  
        b1.x(paramContext, paramXmlPullParser);
        this.f.put(i, b1);
        break;
      } 
    } 
  }
  
  public void c(c paramc) {}
  
  public void d(int paramInt, float paramFloat1, float paramFloat2) {
    int i = this.c;
    if (i == paramInt) {
      a a1;
      b b1;
      if (paramInt == -1) {
        a1 = (a)this.e.valueAt(0);
      } else {
        a1 = (a)this.e.get(i);
      } 
      paramInt = this.d;
      if (paramInt != -1 && ((b)a1.b.get(paramInt)).a(paramFloat1, paramFloat2))
        return; 
      paramInt = a1.b(paramFloat1, paramFloat2);
      if (this.d == paramInt)
        return; 
      if (paramInt == -1) {
        b1 = this.b;
      } else {
        b1 = ((b)a1.b.get(paramInt)).f;
      } 
      if (paramInt != -1)
        i = ((b)a1.b.get(paramInt)).e; 
      if (b1 == null)
        return; 
      this.d = paramInt;
      if (this.g == null) {
        b1.d(this.a);
        if (this.g != null)
          throw null; 
      } else {
        throw null;
      } 
    } else {
      b b1;
      StringBuilder stringBuilder;
      this.c = paramInt;
      a a1 = (a)this.e.get(paramInt);
      i = a1.b(paramFloat1, paramFloat2);
      if (i == -1) {
        b1 = a1.d;
      } else {
        b1 = ((b)a1.b.get(i)).f;
      } 
      if (i != -1)
        int j = ((b)a1.b.get(i)).e; 
      if (b1 == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("NO Constraint set found ! id=");
        stringBuilder.append(paramInt);
        stringBuilder.append(", dim =");
        stringBuilder.append(paramFloat1);
        stringBuilder.append(", ");
        stringBuilder.append(paramFloat2);
        Log.v("ConstraintLayoutStates", stringBuilder.toString());
        return;
      } 
      this.d = i;
      if (this.g == null) {
        stringBuilder.d(this.a);
        if (this.g != null)
          throw null; 
        return;
      } 
      throw null;
    } 
  }
  
  static class a {
    int a;
    
    ArrayList<a.b> b = new ArrayList<a.b>();
    
    int c = -1;
    
    b d;
    
    public a(Context param1Context, XmlPullParser param1XmlPullParser) {
      TypedArray typedArray = param1Context.obtainStyledAttributes(Xml.asAttributeSet(param1XmlPullParser), e.State);
      int i = typedArray.getIndexCount();
      for (byte b1 = 0; b1 < i; b1++) {
        int j = typedArray.getIndex(b1);
        if (j == e.State_android_id) {
          this.a = typedArray.getResourceId(j, this.a);
        } else if (j == e.State_constraints) {
          this.c = typedArray.getResourceId(j, this.c);
          String str = param1Context.getResources().getResourceTypeName(this.c);
          param1Context.getResources().getResourceName(this.c);
          if ("layout".equals(str)) {
            b b2 = new b();
            this.d = b2;
            b2.i(param1Context, this.c);
          } 
        } 
      } 
      typedArray.recycle();
    }
    
    void a(a.b param1b) {
      this.b.add(param1b);
    }
    
    public int b(float param1Float1, float param1Float2) {
      for (byte b1 = 0; b1 < this.b.size(); b1++) {
        if (((a.b)this.b.get(b1)).a(param1Float1, param1Float2))
          return b1; 
      } 
      return -1;
    }
  }
  
  static class b {
    float a = Float.NaN;
    
    float b = Float.NaN;
    
    float c = Float.NaN;
    
    float d = Float.NaN;
    
    int e = -1;
    
    b f;
    
    public b(Context param1Context, XmlPullParser param1XmlPullParser) {
      TypedArray typedArray = param1Context.obtainStyledAttributes(Xml.asAttributeSet(param1XmlPullParser), e.Variant);
      int i = typedArray.getIndexCount();
      for (byte b1 = 0; b1 < i; b1++) {
        int j = typedArray.getIndex(b1);
        if (j == e.Variant_constraints) {
          this.e = typedArray.getResourceId(j, this.e);
          String str = param1Context.getResources().getResourceTypeName(this.e);
          param1Context.getResources().getResourceName(this.e);
          if ("layout".equals(str)) {
            b b2 = new b();
            this.f = b2;
            b2.i(param1Context, this.e);
          } 
        } else if (j == e.Variant_region_heightLessThan) {
          this.d = typedArray.getDimension(j, this.d);
        } else if (j == e.Variant_region_heightMoreThan) {
          this.b = typedArray.getDimension(j, this.b);
        } else if (j == e.Variant_region_widthLessThan) {
          this.c = typedArray.getDimension(j, this.c);
        } else if (j == e.Variant_region_widthMoreThan) {
          this.a = typedArray.getDimension(j, this.a);
        } else {
          Log.v("ConstraintLayoutStates", "Unknown tag");
        } 
      } 
      typedArray.recycle();
    }
    
    boolean a(float param1Float1, float param1Float2) {
      return (!Float.isNaN(this.a) && param1Float1 < this.a) ? false : ((!Float.isNaN(this.b) && param1Float2 < this.b) ? false : ((!Float.isNaN(this.c) && param1Float1 > this.c) ? false : (!(!Float.isNaN(this.d) && param1Float2 > this.d))));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */