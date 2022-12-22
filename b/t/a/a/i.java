package b.t.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class i extends h {
  static final PorterDuff.Mode c = PorterDuff.Mode.SRC_IN;
  
  private h d = new h();
  
  private PorterDuffColorFilter e;
  
  private ColorFilter f;
  
  private boolean g;
  
  private boolean h = true;
  
  private Drawable.ConstantState i;
  
  private final float[] j = new float[9];
  
  private final Matrix k = new Matrix();
  
  private final Rect l = new Rect();
  
  i() {}
  
  i(h paramh) {
    this.e = j(this.e, paramh.c, paramh.d);
  }
  
  static int a(int paramInt, float paramFloat) {
    return paramInt & 0xFFFFFF | (int)(Color.alpha(paramInt) * paramFloat) << 24;
  }
  
  public static i b(Resources paramResources, int paramInt, Resources.Theme paramTheme) {
    if (Build.VERSION.SDK_INT >= 24) {
      i i1 = new i();
      i1.b = androidx.core.content.d.f.a(paramResources, paramInt, paramTheme);
      i1.i = new i(i1.b.getConstantState());
      return i1;
    } 
    try {
      XmlResourceParser xmlResourceParser = paramResources.getXml(paramInt);
      AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
      while (true) {
        paramInt = xmlResourceParser.next();
        if (paramInt != 2 && paramInt != 1)
          continue; 
        break;
      } 
      if (paramInt == 2)
        return c(paramResources, (XmlPullParser)xmlResourceParser, attributeSet, paramTheme); 
      XmlPullParserException xmlPullParserException = new XmlPullParserException();
      this("No start tag found");
      throw xmlPullParserException;
    } catch (XmlPullParserException xmlPullParserException) {
      Log.e("VectorDrawableCompat", "parser error", (Throwable)xmlPullParserException);
    } catch (IOException iOException) {
      Log.e("VectorDrawableCompat", "parser error", iOException);
    } 
    return null;
  }
  
  public static i c(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    i i1 = new i();
    i1.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return i1;
  }
  
  private void e(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    h h1 = this.d;
    g g = h1.b;
    ArrayDeque<d> arrayDeque = new ArrayDeque();
    arrayDeque.push(g.i);
    int j = paramXmlPullParser.getEventType();
    int k = paramXmlPullParser.getDepth();
    int m;
    for (m = 1; j != 1 && (paramXmlPullParser.getDepth() >= k + 1 || j != 3); m = n) {
      int n;
      if (j == 2) {
        c c;
        String str = paramXmlPullParser.getName();
        d d = arrayDeque.peek();
        if ("path".equals(str)) {
          c = new c();
          c.g(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
          d.b.add(c);
          if (c.getPathName() != null)
            g.q.put(c.getPathName(), c); 
          n = 0;
          m = h1.a;
          h1.a = c.d | m;
        } else {
          b b;
          if ("clip-path".equals(c)) {
            b = new b();
            b.e(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
            d.b.add(b);
            if (b.getPathName() != null)
              g.q.put(b.getPathName(), b); 
            n = h1.a;
            h1.a = b.d | n;
            n = m;
          } else {
            n = m;
            if ("group".equals(b)) {
              d d1 = new d();
              d1.c(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
              d.b.add(d1);
              arrayDeque.push(d1);
              if (d1.getGroupName() != null)
                g.q.put(d1.getGroupName(), d1); 
              n = h1.a;
              h1.a = d1.k | n;
              n = m;
            } 
          } 
        } 
      } else {
        n = m;
        if (j == 3) {
          n = m;
          if ("group".equals(paramXmlPullParser.getName())) {
            arrayDeque.pop();
            n = m;
          } 
        } 
      } 
      j = paramXmlPullParser.next();
    } 
    if (m == 0)
      return; 
    XmlPullParserException xmlPullParserException = new XmlPullParserException("no path defined");
    throw xmlPullParserException;
  }
  
  private boolean f() {
    int j = Build.VERSION.SDK_INT;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (j >= 17) {
      bool2 = bool1;
      if (isAutoMirrored()) {
        bool2 = bool1;
        if (androidx.core.graphics.drawable.a.f(this) == 1)
          bool2 = true; 
      } 
    } 
    return bool2;
  }
  
  private static PorterDuff.Mode g(int paramInt, PorterDuff.Mode paramMode) {
    if (paramInt != 3) {
      if (paramInt != 5) {
        if (paramInt != 9) {
          switch (paramInt) {
            default:
              return paramMode;
            case 16:
              return PorterDuff.Mode.ADD;
            case 15:
              return PorterDuff.Mode.SCREEN;
            case 14:
              break;
          } 
          return PorterDuff.Mode.MULTIPLY;
        } 
        return PorterDuff.Mode.SRC_ATOP;
      } 
      return PorterDuff.Mode.SRC_IN;
    } 
    return PorterDuff.Mode.SRC_OVER;
  }
  
  private void i(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme) {
    String str;
    h h1 = this.d;
    g g = h1.b;
    h1.d = g(androidx.core.content.d.g.g(paramTypedArray, paramXmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
    ColorStateList colorStateList = androidx.core.content.d.g.c(paramTypedArray, paramXmlPullParser, paramTheme, "tint", 1);
    if (colorStateList != null)
      h1.c = colorStateList; 
    h1.e = androidx.core.content.d.g.a(paramTypedArray, paramXmlPullParser, "autoMirrored", 5, h1.e);
    g.l = androidx.core.content.d.g.f(paramTypedArray, paramXmlPullParser, "viewportWidth", 7, g.l);
    float f = androidx.core.content.d.g.f(paramTypedArray, paramXmlPullParser, "viewportHeight", 8, g.m);
    g.m = f;
    if (g.l > 0.0F) {
      if (f > 0.0F) {
        g.j = paramTypedArray.getDimension(3, g.j);
        f = paramTypedArray.getDimension(2, g.k);
        g.k = f;
        if (g.j > 0.0F) {
          if (f > 0.0F) {
            g.setAlpha(androidx.core.content.d.g.f(paramTypedArray, paramXmlPullParser, "alpha", 4, g.getAlpha()));
            str = paramTypedArray.getString(0);
            if (str != null) {
              g.o = str;
              g.q.put(str, g);
            } 
            return;
          } 
          StringBuilder stringBuilder3 = new StringBuilder();
          stringBuilder3.append(str.getPositionDescription());
          stringBuilder3.append("<vector> tag requires height > 0");
          throw new XmlPullParserException(stringBuilder3.toString());
        } 
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str.getPositionDescription());
        stringBuilder2.append("<vector> tag requires width > 0");
        throw new XmlPullParserException(stringBuilder2.toString());
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str.getPositionDescription());
      stringBuilder1.append("<vector> tag requires viewportHeight > 0");
      throw new XmlPullParserException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str.getPositionDescription());
    stringBuilder.append("<vector> tag requires viewportWidth > 0");
    throw new XmlPullParserException(stringBuilder.toString());
  }
  
  public boolean canApplyTheme() {
    Drawable drawable = this.b;
    if (drawable != null)
      androidx.core.graphics.drawable.a.b(drawable); 
    return false;
  }
  
  Object d(String paramString) {
    return this.d.b.q.get(paramString);
  }
  
  public void draw(Canvas paramCanvas) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.draw(paramCanvas);
      return;
    } 
    copyBounds(this.l);
    if (this.l.width() > 0 && this.l.height() > 0) {
      PorterDuffColorFilter porterDuffColorFilter;
      ColorFilter colorFilter2 = this.f;
      ColorFilter colorFilter1 = colorFilter2;
      if (colorFilter2 == null)
        porterDuffColorFilter = this.e; 
      paramCanvas.getMatrix(this.k);
      this.k.getValues(this.j);
      float f1 = Math.abs(this.j[0]);
      float f2 = Math.abs(this.j[4]);
      float f3 = Math.abs(this.j[1]);
      float f4 = Math.abs(this.j[3]);
      if (f3 != 0.0F || f4 != 0.0F) {
        f1 = 1.0F;
        f2 = 1.0F;
      } 
      int j = (int)(this.l.width() * f1);
      int k = (int)(this.l.height() * f2);
      j = Math.min(2048, j);
      k = Math.min(2048, k);
      if (j > 0 && k > 0) {
        int m = paramCanvas.save();
        Rect rect = this.l;
        paramCanvas.translate(rect.left, rect.top);
        if (f()) {
          paramCanvas.translate(this.l.width(), 0.0F);
          paramCanvas.scale(-1.0F, 1.0F);
        } 
        this.l.offsetTo(0, 0);
        this.d.c(j, k);
        if (!this.h) {
          this.d.j(j, k);
        } else if (!this.d.b()) {
          this.d.j(j, k);
          this.d.i();
        } 
        this.d.d(paramCanvas, (ColorFilter)porterDuffColorFilter, this.l);
        paramCanvas.restoreToCount(m);
      } 
    } 
  }
  
  public int getAlpha() {
    Drawable drawable = this.b;
    return (drawable != null) ? androidx.core.graphics.drawable.a.d(drawable) : this.d.b.getRootAlpha();
  }
  
  public int getChangingConfigurations() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getChangingConfigurations() : (super.getChangingConfigurations() | this.d.getChangingConfigurations());
  }
  
  public ColorFilter getColorFilter() {
    Drawable drawable = this.b;
    return (drawable != null) ? androidx.core.graphics.drawable.a.e(drawable) : this.f;
  }
  
  public Drawable.ConstantState getConstantState() {
    if (this.b != null && Build.VERSION.SDK_INT >= 24)
      return new i(this.b.getConstantState()); 
    this.d.a = getChangingConfigurations();
    return this.d;
  }
  
  public int getIntrinsicHeight() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getIntrinsicHeight() : (int)this.d.b.k;
  }
  
  public int getIntrinsicWidth() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getIntrinsicWidth() : (int)this.d.b.j;
  }
  
  public int getOpacity() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getOpacity() : -3;
  }
  
  void h(boolean paramBoolean) {
    this.h = paramBoolean;
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
      return;
    } 
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    Drawable drawable = this.b;
    if (drawable != null) {
      androidx.core.graphics.drawable.a.g(drawable, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    } 
    h h1 = this.d;
    h1.b = new g();
    TypedArray typedArray = androidx.core.content.d.g.k(paramResources, paramTheme, paramAttributeSet, a.a);
    i(typedArray, paramXmlPullParser, paramTheme);
    typedArray.recycle();
    h1.a = getChangingConfigurations();
    h1.k = true;
    e(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    this.e = j(this.e, h1.c, h1.d);
  }
  
  public void invalidateSelf() {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.invalidateSelf();
      return;
    } 
    super.invalidateSelf();
  }
  
  public boolean isAutoMirrored() {
    Drawable drawable = this.b;
    return (drawable != null) ? androidx.core.graphics.drawable.a.h(drawable) : this.d.e;
  }
  
  public boolean isStateful() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Landroid/graphics/drawable/Drawable;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull -> 14
    //   9: aload_1
    //   10: invokevirtual isStateful : ()Z
    //   13: ireturn
    //   14: aload_0
    //   15: invokespecial isStateful : ()Z
    //   18: ifne -> 64
    //   21: aload_0
    //   22: getfield d : Lb/t/a/a/i$h;
    //   25: astore_1
    //   26: aload_1
    //   27: ifnull -> 59
    //   30: aload_1
    //   31: invokevirtual g : ()Z
    //   34: ifne -> 64
    //   37: aload_0
    //   38: getfield d : Lb/t/a/a/i$h;
    //   41: getfield c : Landroid/content/res/ColorStateList;
    //   44: astore_1
    //   45: aload_1
    //   46: ifnull -> 59
    //   49: aload_1
    //   50: invokevirtual isStateful : ()Z
    //   53: ifeq -> 59
    //   56: goto -> 64
    //   59: iconst_0
    //   60: istore_2
    //   61: goto -> 66
    //   64: iconst_1
    //   65: istore_2
    //   66: iload_2
    //   67: ireturn
  }
  
  PorterDuffColorFilter j(PorterDuffColorFilter paramPorterDuffColorFilter, ColorStateList paramColorStateList, PorterDuff.Mode paramMode) {
    return (paramColorStateList == null || paramMode == null) ? null : new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode);
  }
  
  public Drawable mutate() {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.mutate();
      return this;
    } 
    if (!this.g && super.mutate() == this) {
      this.d = new h(this.d);
      this.g = true;
    } 
    return this;
  }
  
  protected void onBoundsChange(Rect paramRect) {
    Drawable drawable = this.b;
    if (drawable != null)
      drawable.setBounds(paramRect); 
  }
  
  protected boolean onStateChange(int[] paramArrayOfint) {
    Drawable drawable = this.b;
    if (drawable != null)
      return drawable.setState(paramArrayOfint); 
    boolean bool1 = false;
    h h1 = this.d;
    ColorStateList colorStateList = h1.c;
    boolean bool2 = true;
    boolean bool3 = bool1;
    if (colorStateList != null) {
      PorterDuff.Mode mode = h1.d;
      bool3 = bool1;
      if (mode != null) {
        this.e = j(this.e, colorStateList, mode);
        invalidateSelf();
        bool3 = true;
      } 
    } 
    if (h1.g() && h1.h(paramArrayOfint)) {
      invalidateSelf();
      bool3 = bool2;
    } 
    return bool3;
  }
  
  public void scheduleSelf(Runnable paramRunnable, long paramLong) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.scheduleSelf(paramRunnable, paramLong);
      return;
    } 
    super.scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setAlpha(paramInt);
      return;
    } 
    if (this.d.b.getRootAlpha() != paramInt) {
      this.d.b.setRootAlpha(paramInt);
      invalidateSelf();
    } 
  }
  
  public void setAutoMirrored(boolean paramBoolean) {
    Drawable drawable = this.b;
    if (drawable != null) {
      androidx.core.graphics.drawable.a.j(drawable, paramBoolean);
      return;
    } 
    this.d.e = paramBoolean;
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setColorFilter(paramColorFilter);
      return;
    } 
    this.f = paramColorFilter;
    invalidateSelf();
  }
  
  public void setTint(int paramInt) {
    Drawable drawable = this.b;
    if (drawable != null) {
      androidx.core.graphics.drawable.a.n(drawable, paramInt);
      return;
    } 
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    Drawable drawable = this.b;
    if (drawable != null) {
      androidx.core.graphics.drawable.a.o(drawable, paramColorStateList);
      return;
    } 
    h h1 = this.d;
    if (h1.c != paramColorStateList) {
      h1.c = paramColorStateList;
      this.e = j(this.e, paramColorStateList, h1.d);
      invalidateSelf();
    } 
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    Drawable drawable = this.b;
    if (drawable != null) {
      androidx.core.graphics.drawable.a.p(drawable, paramMode);
      return;
    } 
    h h1 = this.d;
    if (h1.d != paramMode) {
      h1.d = paramMode;
      this.e = j(this.e, h1.c, paramMode);
      invalidateSelf();
    } 
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.setVisible(paramBoolean1, paramBoolean2) : super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void unscheduleSelf(Runnable paramRunnable) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.unscheduleSelf(paramRunnable);
      return;
    } 
    super.unscheduleSelf(paramRunnable);
  }
  
  private static class b extends f {
    b() {}
    
    b(b param1b) {
      super(param1b);
    }
    
    private void f(TypedArray param1TypedArray, XmlPullParser param1XmlPullParser) {
      String str = param1TypedArray.getString(0);
      if (str != null)
        this.b = str; 
      str = param1TypedArray.getString(1);
      if (str != null)
        this.a = b.h.e.c.d(str); 
      this.c = androidx.core.content.d.g.g(param1TypedArray, param1XmlPullParser, "fillType", 2, 0);
    }
    
    public boolean c() {
      return true;
    }
    
    public void e(Resources param1Resources, AttributeSet param1AttributeSet, Resources.Theme param1Theme, XmlPullParser param1XmlPullParser) {
      if (!androidx.core.content.d.g.j(param1XmlPullParser, "pathData"))
        return; 
      TypedArray typedArray = androidx.core.content.d.g.k(param1Resources, param1Theme, param1AttributeSet, a.d);
      f(typedArray, param1XmlPullParser);
      typedArray.recycle();
    }
  }
  
  private static class c extends f {
    private int[] e;
    
    androidx.core.content.d.b f;
    
    float g = 0.0F;
    
    androidx.core.content.d.b h;
    
    float i = 1.0F;
    
    float j = 1.0F;
    
    float k = 0.0F;
    
    float l = 1.0F;
    
    float m = 0.0F;
    
    Paint.Cap n = Paint.Cap.BUTT;
    
    Paint.Join o = Paint.Join.MITER;
    
    float p = 4.0F;
    
    c() {}
    
    c(c param1c) {
      super(param1c);
      this.e = param1c.e;
      this.f = param1c.f;
      this.g = param1c.g;
      this.i = param1c.i;
      this.h = param1c.h;
      this.c = param1c.c;
      this.j = param1c.j;
      this.k = param1c.k;
      this.l = param1c.l;
      this.m = param1c.m;
      this.n = param1c.n;
      this.o = param1c.o;
      this.p = param1c.p;
    }
    
    private Paint.Cap e(int param1Int, Paint.Cap param1Cap) {
      return (param1Int != 0) ? ((param1Int != 1) ? ((param1Int != 2) ? param1Cap : Paint.Cap.SQUARE) : Paint.Cap.ROUND) : Paint.Cap.BUTT;
    }
    
    private Paint.Join f(int param1Int, Paint.Join param1Join) {
      return (param1Int != 0) ? ((param1Int != 1) ? ((param1Int != 2) ? param1Join : Paint.Join.BEVEL) : Paint.Join.ROUND) : Paint.Join.MITER;
    }
    
    private void h(TypedArray param1TypedArray, XmlPullParser param1XmlPullParser, Resources.Theme param1Theme) {
      this.e = null;
      if (!androidx.core.content.d.g.j(param1XmlPullParser, "pathData"))
        return; 
      String str = param1TypedArray.getString(0);
      if (str != null)
        this.b = str; 
      str = param1TypedArray.getString(2);
      if (str != null)
        this.a = b.h.e.c.d(str); 
      this.h = androidx.core.content.d.g.e(param1TypedArray, param1XmlPullParser, param1Theme, "fillColor", 1, 0);
      this.j = androidx.core.content.d.g.f(param1TypedArray, param1XmlPullParser, "fillAlpha", 12, this.j);
      this.n = e(androidx.core.content.d.g.g(param1TypedArray, param1XmlPullParser, "strokeLineCap", 8, -1), this.n);
      this.o = f(androidx.core.content.d.g.g(param1TypedArray, param1XmlPullParser, "strokeLineJoin", 9, -1), this.o);
      this.p = androidx.core.content.d.g.f(param1TypedArray, param1XmlPullParser, "strokeMiterLimit", 10, this.p);
      this.f = androidx.core.content.d.g.e(param1TypedArray, param1XmlPullParser, param1Theme, "strokeColor", 3, 0);
      this.i = androidx.core.content.d.g.f(param1TypedArray, param1XmlPullParser, "strokeAlpha", 11, this.i);
      this.g = androidx.core.content.d.g.f(param1TypedArray, param1XmlPullParser, "strokeWidth", 4, this.g);
      this.l = androidx.core.content.d.g.f(param1TypedArray, param1XmlPullParser, "trimPathEnd", 6, this.l);
      this.m = androidx.core.content.d.g.f(param1TypedArray, param1XmlPullParser, "trimPathOffset", 7, this.m);
      this.k = androidx.core.content.d.g.f(param1TypedArray, param1XmlPullParser, "trimPathStart", 5, this.k);
      this.c = androidx.core.content.d.g.g(param1TypedArray, param1XmlPullParser, "fillType", 13, this.c);
    }
    
    public boolean a() {
      return (this.h.i() || this.f.i());
    }
    
    public boolean b(int[] param1ArrayOfint) {
      boolean bool = this.h.j(param1ArrayOfint);
      return this.f.j(param1ArrayOfint) | bool;
    }
    
    public void g(Resources param1Resources, AttributeSet param1AttributeSet, Resources.Theme param1Theme, XmlPullParser param1XmlPullParser) {
      TypedArray typedArray = androidx.core.content.d.g.k(param1Resources, param1Theme, param1AttributeSet, a.c);
      h(typedArray, param1XmlPullParser, param1Theme);
      typedArray.recycle();
    }
    
    float getFillAlpha() {
      return this.j;
    }
    
    int getFillColor() {
      return this.h.e();
    }
    
    float getStrokeAlpha() {
      return this.i;
    }
    
    int getStrokeColor() {
      return this.f.e();
    }
    
    float getStrokeWidth() {
      return this.g;
    }
    
    float getTrimPathEnd() {
      return this.l;
    }
    
    float getTrimPathOffset() {
      return this.m;
    }
    
    float getTrimPathStart() {
      return this.k;
    }
    
    void setFillAlpha(float param1Float) {
      this.j = param1Float;
    }
    
    void setFillColor(int param1Int) {
      this.h.k(param1Int);
    }
    
    void setStrokeAlpha(float param1Float) {
      this.i = param1Float;
    }
    
    void setStrokeColor(int param1Int) {
      this.f.k(param1Int);
    }
    
    void setStrokeWidth(float param1Float) {
      this.g = param1Float;
    }
    
    void setTrimPathEnd(float param1Float) {
      this.l = param1Float;
    }
    
    void setTrimPathOffset(float param1Float) {
      this.m = param1Float;
    }
    
    void setTrimPathStart(float param1Float) {
      this.k = param1Float;
    }
  }
  
  private static class d extends e {
    final Matrix a = new Matrix();
    
    final ArrayList<i.e> b = new ArrayList<i.e>();
    
    float c = 0.0F;
    
    private float d = 0.0F;
    
    private float e = 0.0F;
    
    private float f = 1.0F;
    
    private float g = 1.0F;
    
    private float h = 0.0F;
    
    private float i = 0.0F;
    
    final Matrix j;
    
    int k;
    
    private int[] l;
    
    private String m;
    
    public d() {
      super(null);
      this.j = new Matrix();
      this.m = null;
    }
    
    public d(d param1d, b.e.a<String, Object> param1a) {
      super(null);
      Matrix matrix = new Matrix();
      this.j = matrix;
      this.m = null;
      this.c = param1d.c;
      this.d = param1d.d;
      this.e = param1d.e;
      this.f = param1d.f;
      this.g = param1d.g;
      this.h = param1d.h;
      this.i = param1d.i;
      this.l = param1d.l;
      String str = param1d.m;
      this.m = str;
      this.k = param1d.k;
      if (str != null)
        param1a.put(str, this); 
      matrix.set(param1d.j);
      ArrayList<i.e> arrayList = param1d.b;
      for (byte b = 0; b < arrayList.size(); b++) {
        param1d = (d)arrayList.get(b);
        if (param1d instanceof d) {
          param1d = param1d;
          this.b.add(new d(param1d, param1a));
        } else {
          i.c c;
          i.b b1;
          if (param1d instanceof i.c) {
            c = new i.c((i.c)param1d);
          } else if (c instanceof i.b) {
            b1 = new i.b((i.b)c);
          } else {
            throw new IllegalStateException("Unknown object in the tree!");
          } 
          this.b.add(b1);
          String str1 = b1.b;
          if (str1 != null)
            param1a.put(str1, b1); 
        } 
      } 
    }
    
    private void d() {
      this.j.reset();
      this.j.postTranslate(-this.d, -this.e);
      this.j.postScale(this.f, this.g);
      this.j.postRotate(this.c, 0.0F, 0.0F);
      this.j.postTranslate(this.h + this.d, this.i + this.e);
    }
    
    private void e(TypedArray param1TypedArray, XmlPullParser param1XmlPullParser) {
      this.l = null;
      this.c = androidx.core.content.d.g.f(param1TypedArray, param1XmlPullParser, "rotation", 5, this.c);
      this.d = param1TypedArray.getFloat(1, this.d);
      this.e = param1TypedArray.getFloat(2, this.e);
      this.f = androidx.core.content.d.g.f(param1TypedArray, param1XmlPullParser, "scaleX", 3, this.f);
      this.g = androidx.core.content.d.g.f(param1TypedArray, param1XmlPullParser, "scaleY", 4, this.g);
      this.h = androidx.core.content.d.g.f(param1TypedArray, param1XmlPullParser, "translateX", 6, this.h);
      this.i = androidx.core.content.d.g.f(param1TypedArray, param1XmlPullParser, "translateY", 7, this.i);
      String str = param1TypedArray.getString(0);
      if (str != null)
        this.m = str; 
      d();
    }
    
    public boolean a() {
      for (byte b = 0; b < this.b.size(); b++) {
        if (((i.e)this.b.get(b)).a())
          return true; 
      } 
      return false;
    }
    
    public boolean b(int[] param1ArrayOfint) {
      byte b = 0;
      boolean bool = false;
      while (b < this.b.size()) {
        bool |= ((i.e)this.b.get(b)).b(param1ArrayOfint);
        b++;
      } 
      return bool;
    }
    
    public void c(Resources param1Resources, AttributeSet param1AttributeSet, Resources.Theme param1Theme, XmlPullParser param1XmlPullParser) {
      TypedArray typedArray = androidx.core.content.d.g.k(param1Resources, param1Theme, param1AttributeSet, a.b);
      e(typedArray, param1XmlPullParser);
      typedArray.recycle();
    }
    
    public String getGroupName() {
      return this.m;
    }
    
    public Matrix getLocalMatrix() {
      return this.j;
    }
    
    public float getPivotX() {
      return this.d;
    }
    
    public float getPivotY() {
      return this.e;
    }
    
    public float getRotation() {
      return this.c;
    }
    
    public float getScaleX() {
      return this.f;
    }
    
    public float getScaleY() {
      return this.g;
    }
    
    public float getTranslateX() {
      return this.h;
    }
    
    public float getTranslateY() {
      return this.i;
    }
    
    public void setPivotX(float param1Float) {
      if (param1Float != this.d) {
        this.d = param1Float;
        d();
      } 
    }
    
    public void setPivotY(float param1Float) {
      if (param1Float != this.e) {
        this.e = param1Float;
        d();
      } 
    }
    
    public void setRotation(float param1Float) {
      if (param1Float != this.c) {
        this.c = param1Float;
        d();
      } 
    }
    
    public void setScaleX(float param1Float) {
      if (param1Float != this.f) {
        this.f = param1Float;
        d();
      } 
    }
    
    public void setScaleY(float param1Float) {
      if (param1Float != this.g) {
        this.g = param1Float;
        d();
      } 
    }
    
    public void setTranslateX(float param1Float) {
      if (param1Float != this.h) {
        this.h = param1Float;
        d();
      } 
    }
    
    public void setTranslateY(float param1Float) {
      if (param1Float != this.i) {
        this.i = param1Float;
        d();
      } 
    }
  }
  
  private static abstract class e {
    private e() {}
    
    public boolean a() {
      return false;
    }
    
    public boolean b(int[] param1ArrayOfint) {
      return false;
    }
  }
  
  private static abstract class f extends e {
    protected b.h.e.c.b[] a = null;
    
    String b;
    
    int c = 0;
    
    int d;
    
    public f() {
      super(null);
    }
    
    public f(f param1f) {
      super(null);
      this.b = param1f.b;
      this.d = param1f.d;
      this.a = b.h.e.c.f(param1f.a);
    }
    
    public boolean c() {
      return false;
    }
    
    public void d(Path param1Path) {
      param1Path.reset();
      b.h.e.c.b[] arrayOfB = this.a;
      if (arrayOfB != null)
        b.h.e.c.b.e(arrayOfB, param1Path); 
    }
    
    public b.h.e.c.b[] getPathData() {
      return this.a;
    }
    
    public String getPathName() {
      return this.b;
    }
    
    public void setPathData(b.h.e.c.b[] param1ArrayOfb) {
      if (!b.h.e.c.b(this.a, param1ArrayOfb)) {
        this.a = b.h.e.c.f(param1ArrayOfb);
      } else {
        b.h.e.c.j(this.a, param1ArrayOfb);
      } 
    }
  }
  
  private static class g {
    private static final Matrix a = new Matrix();
    
    private final Path b;
    
    private final Path c;
    
    private final Matrix d = new Matrix();
    
    Paint e;
    
    Paint f;
    
    private PathMeasure g;
    
    private int h;
    
    final i.d i;
    
    float j = 0.0F;
    
    float k = 0.0F;
    
    float l = 0.0F;
    
    float m = 0.0F;
    
    int n = 255;
    
    String o = null;
    
    Boolean p = null;
    
    final b.e.a<String, Object> q;
    
    public g() {
      this.q = new b.e.a();
      this.i = new i.d();
      this.b = new Path();
      this.c = new Path();
    }
    
    public g(g param1g) {
      b.e.a<String, Object> a1 = new b.e.a();
      this.q = a1;
      this.i = new i.d(param1g.i, a1);
      this.b = new Path(param1g.b);
      this.c = new Path(param1g.c);
      this.j = param1g.j;
      this.k = param1g.k;
      this.l = param1g.l;
      this.m = param1g.m;
      this.h = param1g.h;
      this.n = param1g.n;
      this.o = param1g.o;
      String str = param1g.o;
      if (str != null)
        a1.put(str, this); 
      this.p = param1g.p;
    }
    
    private static float a(float param1Float1, float param1Float2, float param1Float3, float param1Float4) {
      return param1Float1 * param1Float4 - param1Float2 * param1Float3;
    }
    
    private void c(i.d param1d, Matrix param1Matrix, Canvas param1Canvas, int param1Int1, int param1Int2, ColorFilter param1ColorFilter) {
      param1d.a.set(param1Matrix);
      param1d.a.preConcat(param1d.j);
      param1Canvas.save();
      for (byte b = 0; b < param1d.b.size(); b++) {
        i.e e = param1d.b.get(b);
        if (e instanceof i.d) {
          c((i.d)e, param1d.a, param1Canvas, param1Int1, param1Int2, param1ColorFilter);
        } else if (e instanceof i.f) {
          d(param1d, (i.f)e, param1Canvas, param1Int1, param1Int2, param1ColorFilter);
        } 
      } 
      param1Canvas.restore();
    }
    
    private void d(i.d param1d, i.f param1f, Canvas param1Canvas, int param1Int1, int param1Int2, ColorFilter param1ColorFilter) {
      Path path1;
      float f1 = param1Int1 / this.l;
      float f2 = param1Int2 / this.m;
      float f3 = Math.min(f1, f2);
      Matrix matrix = param1d.a;
      this.d.set(matrix);
      this.d.postScale(f1, f2);
      f1 = e(matrix);
      if (f1 == 0.0F)
        return; 
      param1f.d(this.b);
      Path path2 = this.b;
      this.c.reset();
      if (param1f.c()) {
        Path.FillType fillType;
        path1 = this.c;
        if (param1f.c == 0) {
          fillType = Path.FillType.WINDING;
        } else {
          fillType = Path.FillType.EVEN_ODD;
        } 
        path1.setFillType(fillType);
        this.c.addPath(path2, this.d);
        param1Canvas.clipPath(this.c);
      } else {
        param1f = param1f;
        float f4 = ((i.c)param1f).k;
        if (f4 != 0.0F || ((i.c)param1f).l != 1.0F) {
          float f5 = ((i.c)param1f).m;
          float f6 = ((i.c)param1f).l;
          if (this.g == null)
            this.g = new PathMeasure(); 
          this.g.setPath(this.b, false);
          f2 = this.g.getLength();
          f4 = (f4 + f5) % 1.0F * f2;
          f6 = (f6 + f5) % 1.0F * f2;
          path2.reset();
          if (f4 > f6) {
            this.g.getSegment(f4, f2, path2, true);
            this.g.getSegment(0.0F, f6, path2, true);
          } else {
            this.g.getSegment(f4, f6, path2, true);
          } 
          path2.rLineTo(0.0F, 0.0F);
        } 
        this.c.addPath(path2, this.d);
        if (((i.c)param1f).h.l()) {
          Shader shader;
          Path.FillType fillType;
          androidx.core.content.d.b b = ((i.c)param1f).h;
          if (this.f == null) {
            Paint paint1 = new Paint(1);
            this.f = paint1;
            paint1.setStyle(Paint.Style.FILL);
          } 
          Paint paint = this.f;
          if (b.h()) {
            shader = b.f();
            shader.setLocalMatrix(this.d);
            paint.setShader(shader);
            paint.setAlpha(Math.round(((i.c)param1f).j * 255.0F));
          } else {
            paint.setShader(null);
            paint.setAlpha(255);
            paint.setColor(i.a(shader.e(), ((i.c)param1f).j));
          } 
          paint.setColorFilter((ColorFilter)path1);
          Path path = this.c;
          if (param1f.c == 0) {
            fillType = Path.FillType.WINDING;
          } else {
            fillType = Path.FillType.EVEN_ODD;
          } 
          path.setFillType(fillType);
          param1Canvas.drawPath(this.c, paint);
        } 
        if (((i.c)param1f).f.l()) {
          Shader shader;
          androidx.core.content.d.b b = ((i.c)param1f).f;
          if (this.e == null) {
            Paint paint1 = new Paint(1);
            this.e = paint1;
            paint1.setStyle(Paint.Style.STROKE);
          } 
          Paint paint = this.e;
          Paint.Join join = ((i.c)param1f).o;
          if (join != null)
            paint.setStrokeJoin(join); 
          Paint.Cap cap = ((i.c)param1f).n;
          if (cap != null)
            paint.setStrokeCap(cap); 
          paint.setStrokeMiter(((i.c)param1f).p);
          if (b.h()) {
            shader = b.f();
            shader.setLocalMatrix(this.d);
            paint.setShader(shader);
            paint.setAlpha(Math.round(((i.c)param1f).i * 255.0F));
          } else {
            paint.setShader(null);
            paint.setAlpha(255);
            paint.setColor(i.a(shader.e(), ((i.c)param1f).i));
          } 
          paint.setColorFilter((ColorFilter)path1);
          paint.setStrokeWidth(((i.c)param1f).g * f3 * f1);
          param1Canvas.drawPath(this.c, paint);
        } 
      } 
    }
    
    private float e(Matrix param1Matrix) {
      float[] arrayOfFloat = new float[4];
      arrayOfFloat[0] = 0.0F;
      arrayOfFloat[1] = 1.0F;
      arrayOfFloat[2] = 1.0F;
      arrayOfFloat[3] = 0.0F;
      param1Matrix.mapVectors(arrayOfFloat);
      float f1 = (float)Math.hypot(arrayOfFloat[0], arrayOfFloat[1]);
      float f2 = (float)Math.hypot(arrayOfFloat[2], arrayOfFloat[3]);
      float f3 = a(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], arrayOfFloat[3]);
      f1 = Math.max(f1, f2);
      f2 = 0.0F;
      if (f1 > 0.0F)
        f2 = Math.abs(f3) / f1; 
      return f2;
    }
    
    public void b(Canvas param1Canvas, int param1Int1, int param1Int2, ColorFilter param1ColorFilter) {
      c(this.i, a, param1Canvas, param1Int1, param1Int2, param1ColorFilter);
    }
    
    public boolean f() {
      if (this.p == null)
        this.p = Boolean.valueOf(this.i.a()); 
      return this.p.booleanValue();
    }
    
    public boolean g(int[] param1ArrayOfint) {
      return this.i.b(param1ArrayOfint);
    }
    
    public float getAlpha() {
      return getRootAlpha() / 255.0F;
    }
    
    public int getRootAlpha() {
      return this.n;
    }
    
    public void setAlpha(float param1Float) {
      setRootAlpha((int)(param1Float * 255.0F));
    }
    
    public void setRootAlpha(int param1Int) {
      this.n = param1Int;
    }
  }
  
  private static class h extends Drawable.ConstantState {
    int a;
    
    i.g b;
    
    ColorStateList c = null;
    
    PorterDuff.Mode d = i.c;
    
    boolean e;
    
    Bitmap f;
    
    ColorStateList g;
    
    PorterDuff.Mode h;
    
    int i;
    
    boolean j;
    
    boolean k;
    
    Paint l;
    
    public h() {
      this.b = new i.g();
    }
    
    public h(h param1h) {
      if (param1h != null) {
        this.a = param1h.a;
        i.g g1 = new i.g(param1h.b);
        this.b = g1;
        if (param1h.b.f != null)
          g1.f = new Paint(param1h.b.f); 
        if (param1h.b.e != null)
          this.b.e = new Paint(param1h.b.e); 
        this.c = param1h.c;
        this.d = param1h.d;
        this.e = param1h.e;
      } 
    }
    
    public boolean a(int param1Int1, int param1Int2) {
      return (param1Int1 == this.f.getWidth() && param1Int2 == this.f.getHeight());
    }
    
    public boolean b() {
      return (!this.k && this.g == this.c && this.h == this.d && this.j == this.e && this.i == this.b.getRootAlpha());
    }
    
    public void c(int param1Int1, int param1Int2) {
      if (this.f == null || !a(param1Int1, param1Int2)) {
        this.f = Bitmap.createBitmap(param1Int1, param1Int2, Bitmap.Config.ARGB_8888);
        this.k = true;
      } 
    }
    
    public void d(Canvas param1Canvas, ColorFilter param1ColorFilter, Rect param1Rect) {
      Paint paint = e(param1ColorFilter);
      param1Canvas.drawBitmap(this.f, null, param1Rect, paint);
    }
    
    public Paint e(ColorFilter param1ColorFilter) {
      if (!f() && param1ColorFilter == null)
        return null; 
      if (this.l == null) {
        Paint paint = new Paint();
        this.l = paint;
        paint.setFilterBitmap(true);
      } 
      this.l.setAlpha(this.b.getRootAlpha());
      this.l.setColorFilter(param1ColorFilter);
      return this.l;
    }
    
    public boolean f() {
      boolean bool;
      if (this.b.getRootAlpha() < 255) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public boolean g() {
      return this.b.f();
    }
    
    public int getChangingConfigurations() {
      return this.a;
    }
    
    public boolean h(int[] param1ArrayOfint) {
      boolean bool = this.b.g(param1ArrayOfint);
      this.k |= bool;
      return bool;
    }
    
    public void i() {
      this.g = this.c;
      this.h = this.d;
      this.i = this.b.getRootAlpha();
      this.j = this.e;
      this.k = false;
    }
    
    public void j(int param1Int1, int param1Int2) {
      this.f.eraseColor(0);
      Canvas canvas = new Canvas(this.f);
      this.b.b(canvas, param1Int1, param1Int2, null);
    }
    
    public Drawable newDrawable() {
      return new i(this);
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      return new i(this);
    }
  }
  
  private static class i extends Drawable.ConstantState {
    private final Drawable.ConstantState a;
    
    public i(Drawable.ConstantState param1ConstantState) {
      this.a = param1ConstantState;
    }
    
    public boolean canApplyTheme() {
      return this.a.canApplyTheme();
    }
    
    public int getChangingConfigurations() {
      return this.a.getChangingConfigurations();
    }
    
    public Drawable newDrawable() {
      i i1 = new i();
      i1.b = this.a.newDrawable();
      return i1;
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      i i1 = new i();
      i1.b = this.a.newDrawable(param1Resources);
      return i1;
    }
    
    public Drawable newDrawable(Resources param1Resources, Resources.Theme param1Theme) {
      i i1 = new i();
      i1.b = this.a.newDrawable(param1Resources, param1Theme);
      return i1;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/t/a/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */