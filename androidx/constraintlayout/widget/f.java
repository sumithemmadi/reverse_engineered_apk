package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class f {
  int a = -1;
  
  int b = -1;
  
  int c = -1;
  
  private SparseArray<a> d = new SparseArray();
  
  private SparseArray<b> e = new SparseArray();
  
  public f(Context paramContext, XmlPullParser paramXmlPullParser) {
    b(paramContext, paramXmlPullParser);
  }
  
  private void b(Context paramContext, XmlPullParser paramXmlPullParser) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(Xml.asAttributeSet(paramXmlPullParser), e.StateSet);
    int i = typedArray.getIndexCount();
    int j;
    for (j = 0; j < i; j++) {
      int k = typedArray.getIndex(j);
      if (k == e.StateSet_defaultState)
        this.a = typedArray.getResourceId(k, this.a); 
    } 
    typedArray.recycle();
    typedArray = null;
    try {
      j = paramXmlPullParser.getEventType();
      while (j != 1) {
        TypedArray typedArray1;
        if (j != 0) {
          if (j != 2) {
            if (j != 3) {
              typedArray1 = typedArray;
            } else {
              typedArray1 = typedArray;
              if ("StateSet".equals(paramXmlPullParser.getName()))
                return; 
            } 
          } else {
            String str = paramXmlPullParser.getName();
            j = -1;
            switch (str.hashCode()) {
              case 1901439077:
                if (str.equals("Variant"))
                  j = 3; 
                break;
              case 1382829617:
                if (str.equals("StateSet"))
                  j = 1; 
                break;
              case 1301459538:
                if (str.equals("LayoutDescription"))
                  j = 0; 
                break;
              case 80204913:
                if (str.equals("State"))
                  j = 2; 
                break;
            } 
            typedArray1 = typedArray;
            if (j != 0) {
              typedArray1 = typedArray;
              if (j != 1)
                if (j != 2) {
                  if (j != 3) {
                    StringBuilder stringBuilder = new StringBuilder();
                    this();
                    stringBuilder.append("unknown tag ");
                    stringBuilder.append(str);
                    Log.v("ConstraintLayoutStates", stringBuilder.toString());
                    TypedArray typedArray2 = typedArray;
                  } else {
                    b b = new b();
                    this(paramContext, paramXmlPullParser);
                    typedArray1 = typedArray;
                    if (typedArray != null) {
                      typedArray.a(b);
                      typedArray1 = typedArray;
                    } 
                  } 
                } else {
                  a a = new a();
                  this(paramContext, paramXmlPullParser);
                  this.d.put(a.a, a);
                }  
            } 
          } 
        } else {
          paramXmlPullParser.getName();
          typedArray1 = typedArray;
        } 
        j = paramXmlPullParser.next();
        typedArray = typedArray1;
      } 
    } catch (XmlPullParserException xmlPullParserException) {
      xmlPullParserException.printStackTrace();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
  }
  
  public int a(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2) {
    a a = (a)this.d.get(paramInt2);
    if (a == null)
      return paramInt2; 
    if (paramFloat1 == -1.0F || paramFloat2 == -1.0F) {
      if (a.c == paramInt1)
        return paramInt1; 
      Iterator<b> iterator = a.b.iterator();
      while (iterator.hasNext()) {
        if (paramInt1 == ((b)iterator.next()).e)
          return paramInt1; 
      } 
      return a.c;
    } 
    b b = null;
    for (b b1 : a.b) {
      if (b1.a(paramFloat1, paramFloat2)) {
        if (paramInt1 == b1.e)
          return paramInt1; 
        b = b1;
      } 
    } 
    return (b != null) ? b.e : a.c;
  }
  
  public int c(int paramInt1, int paramInt2, int paramInt3) {
    return d(-1, paramInt1, paramInt2, paramInt3);
  }
  
  public int d(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2) {
    if (paramInt1 == paramInt2) {
      a a1;
      if (paramInt2 == -1) {
        a1 = (a)this.d.valueAt(0);
      } else {
        a1 = (a)this.d.get(this.b);
      } 
      if (a1 == null)
        return -1; 
      if (this.c != -1 && ((b)a1.b.get(paramInt1)).a(paramFloat1, paramFloat2))
        return paramInt1; 
      paramInt2 = a1.b(paramFloat1, paramFloat2);
      if (paramInt1 == paramInt2)
        return paramInt1; 
      if (paramInt2 == -1) {
        paramInt1 = a1.c;
      } else {
        paramInt1 = ((b)a1.b.get(paramInt2)).e;
      } 
      return paramInt1;
    } 
    a a = (a)this.d.get(paramInt2);
    if (a == null)
      return -1; 
    paramInt1 = a.b(paramFloat1, paramFloat2);
    if (paramInt1 == -1) {
      paramInt1 = a.c;
    } else {
      paramInt1 = ((b)a.b.get(paramInt1)).e;
    } 
    return paramInt1;
  }
  
  static class a {
    int a;
    
    ArrayList<f.b> b = new ArrayList<f.b>();
    
    int c = -1;
    
    boolean d;
    
    public a(Context param1Context, XmlPullParser param1XmlPullParser) {
      byte b = 0;
      this.d = false;
      TypedArray typedArray = param1Context.obtainStyledAttributes(Xml.asAttributeSet(param1XmlPullParser), e.State);
      int i = typedArray.getIndexCount();
      while (b < i) {
        int j = typedArray.getIndex(b);
        if (j == e.State_android_id) {
          this.a = typedArray.getResourceId(j, this.a);
        } else if (j == e.State_constraints) {
          this.c = typedArray.getResourceId(j, this.c);
          String str = param1Context.getResources().getResourceTypeName(this.c);
          param1Context.getResources().getResourceName(this.c);
          if ("layout".equals(str))
            this.d = true; 
        } 
        b++;
      } 
      typedArray.recycle();
    }
    
    void a(f.b param1b) {
      this.b.add(param1b);
    }
    
    public int b(float param1Float1, float param1Float2) {
      for (byte b = 0; b < this.b.size(); b++) {
        if (((f.b)this.b.get(b)).a(param1Float1, param1Float2))
          return b; 
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
    
    boolean f;
    
    public b(Context param1Context, XmlPullParser param1XmlPullParser) {
      byte b1 = 0;
      this.f = false;
      TypedArray typedArray = param1Context.obtainStyledAttributes(Xml.asAttributeSet(param1XmlPullParser), e.Variant);
      int i = typedArray.getIndexCount();
      while (b1 < i) {
        int j = typedArray.getIndex(b1);
        if (j == e.Variant_constraints) {
          this.e = typedArray.getResourceId(j, this.e);
          String str = param1Context.getResources().getResourceTypeName(this.e);
          param1Context.getResources().getResourceName(this.e);
          if ("layout".equals(str))
            this.f = true; 
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
        b1++;
      } 
      typedArray.recycle();
    }
    
    boolean a(float param1Float1, float param1Float2) {
      return (!Float.isNaN(this.a) && param1Float1 < this.a) ? false : ((!Float.isNaN(this.b) && param1Float2 < this.b) ? false : ((!Float.isNaN(this.c) && param1Float1 > this.c) ? false : (!(!Float.isNaN(this.d) && param1Float2 > this.d))));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/widget/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */