package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import b.d.b;
import b.d.c;

class g extends Drawable {
  private static final double a = Math.cos(Math.toRadians(45.0D));
  
  static a b;
  
  private final int c;
  
  private Paint d;
  
  private Paint e;
  
  private Paint f;
  
  private final RectF g;
  
  private float h;
  
  private Path i;
  
  private float j;
  
  private float k;
  
  private float l;
  
  private ColorStateList m;
  
  private boolean n = true;
  
  private final int o;
  
  private final int p;
  
  private boolean q = true;
  
  private boolean r = false;
  
  g(Resources paramResources, ColorStateList paramColorStateList, float paramFloat1, float paramFloat2, float paramFloat3) {
    this.o = paramResources.getColor(b.cardview_shadow_start_color);
    this.p = paramResources.getColor(b.cardview_shadow_end_color);
    this.c = paramResources.getDimensionPixelSize(c.cardview_compat_inset_shadow);
    this.d = new Paint(5);
    n(paramColorStateList);
    Paint paint = new Paint(5);
    this.e = paint;
    paint.setStyle(Paint.Style.FILL);
    this.h = (int)(paramFloat1 + 0.5F);
    this.g = new RectF();
    paint = new Paint(this.e);
    this.f = paint;
    paint.setAntiAlias(false);
    s(paramFloat2, paramFloat3);
  }
  
  private void a(Rect paramRect) {
    float f1 = this.j;
    float f2 = 1.5F * f1;
    this.g.set(paramRect.left + f1, paramRect.top + f2, paramRect.right - f1, paramRect.bottom - f2);
    b();
  }
  
  private void b() {
    float f1 = this.h;
    RectF rectF1 = new RectF(-f1, -f1, f1, f1);
    RectF rectF2 = new RectF(rectF1);
    f1 = this.k;
    rectF2.inset(-f1, -f1);
    Path path = this.i;
    if (path == null) {
      this.i = new Path();
    } else {
      path.reset();
    } 
    this.i.setFillType(Path.FillType.EVEN_ODD);
    this.i.moveTo(-this.h, 0.0F);
    this.i.rLineTo(-this.k, 0.0F);
    this.i.arcTo(rectF2, 180.0F, 90.0F, false);
    this.i.arcTo(rectF1, 270.0F, -90.0F, false);
    this.i.close();
    f1 = this.h;
    float f2 = f1 / (this.k + f1);
    Paint paint = this.e;
    float f3 = this.h;
    f1 = this.k;
    int i = this.o;
    int j = this.p;
    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
    paint.setShader((Shader)new RadialGradient(0.0F, 0.0F, f3 + f1, new int[] { i, i, j }, new float[] { 0.0F, f2, 1.0F }, tileMode));
    paint = this.f;
    f2 = this.h;
    f3 = -f2;
    f1 = this.k;
    f2 = -f2;
    j = this.o;
    i = this.p;
    tileMode = Shader.TileMode.CLAMP;
    paint.setShader((Shader)new LinearGradient(0.0F, f3 + f1, 0.0F, f2 - f1, new int[] { j, j, i }, new float[] { 0.0F, 0.5F, 1.0F }, tileMode));
    this.f.setAntiAlias(false);
  }
  
  static float c(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    float f = paramFloat1;
    if (paramBoolean) {
      double d1 = paramFloat1;
      double d2 = a;
      double d3 = paramFloat2;
      Double.isNaN(d3);
      Double.isNaN(d1);
      f = (float)(d1 + (1.0D - d2) * d3);
    } 
    return f;
  }
  
  static float d(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    if (paramBoolean) {
      double d1 = (paramFloat1 * 1.5F);
      double d2 = a;
      double d3 = paramFloat2;
      Double.isNaN(d3);
      Double.isNaN(d1);
      return (float)(d1 + (1.0D - d2) * d3);
    } 
    return paramFloat1 * 1.5F;
  }
  
  private void e(Canvas paramCanvas) {
    boolean bool;
    float f1 = this.h;
    float f2 = -f1 - this.k;
    float f3 = f1 + this.c + this.l / 2.0F;
    f1 = this.g.width();
    float f4 = f3 * 2.0F;
    if (f1 - f4 > 0.0F) {
      i = 1;
    } else {
      i = 0;
    } 
    if (this.g.height() - f4 > 0.0F) {
      bool = true;
    } else {
      bool = false;
    } 
    int j = paramCanvas.save();
    RectF rectF = this.g;
    paramCanvas.translate(rectF.left + f3, rectF.top + f3);
    paramCanvas.drawPath(this.i, this.e);
    if (i)
      paramCanvas.drawRect(0.0F, f2, this.g.width() - f4, -this.h, this.f); 
    paramCanvas.restoreToCount(j);
    j = paramCanvas.save();
    rectF = this.g;
    paramCanvas.translate(rectF.right - f3, rectF.bottom - f3);
    paramCanvas.rotate(180.0F);
    paramCanvas.drawPath(this.i, this.e);
    if (i)
      paramCanvas.drawRect(0.0F, f2, this.g.width() - f4, -this.h + this.k, this.f); 
    paramCanvas.restoreToCount(j);
    int i = paramCanvas.save();
    rectF = this.g;
    paramCanvas.translate(rectF.left + f3, rectF.bottom - f3);
    paramCanvas.rotate(270.0F);
    paramCanvas.drawPath(this.i, this.e);
    if (bool)
      paramCanvas.drawRect(0.0F, f2, this.g.height() - f4, -this.h, this.f); 
    paramCanvas.restoreToCount(i);
    i = paramCanvas.save();
    rectF = this.g;
    paramCanvas.translate(rectF.right - f3, rectF.top + f3);
    paramCanvas.rotate(90.0F);
    paramCanvas.drawPath(this.i, this.e);
    if (bool)
      paramCanvas.drawRect(0.0F, f2, this.g.height() - f4, -this.h, this.f); 
    paramCanvas.restoreToCount(i);
  }
  
  private void n(ColorStateList paramColorStateList) {
    ColorStateList colorStateList = paramColorStateList;
    if (paramColorStateList == null)
      colorStateList = ColorStateList.valueOf(0); 
    this.m = colorStateList;
    this.d.setColor(colorStateList.getColorForState(getState(), this.m.getDefaultColor()));
  }
  
  private void s(float paramFloat1, float paramFloat2) {
    if (paramFloat1 >= 0.0F) {
      if (paramFloat2 >= 0.0F) {
        float f = t(paramFloat1);
        paramFloat2 = t(paramFloat2);
        paramFloat1 = f;
        if (f > paramFloat2) {
          if (!this.r)
            this.r = true; 
          paramFloat1 = paramFloat2;
        } 
        if (this.l == paramFloat1 && this.j == paramFloat2)
          return; 
        this.l = paramFloat1;
        this.j = paramFloat2;
        this.k = (int)(paramFloat1 * 1.5F + this.c + 0.5F);
        this.n = true;
        invalidateSelf();
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Invalid max shadow size ");
      stringBuilder1.append(paramFloat2);
      stringBuilder1.append(". Must be >= 0");
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid shadow size ");
    stringBuilder.append(paramFloat1);
    stringBuilder.append(". Must be >= 0");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private int t(float paramFloat) {
    int i = (int)(paramFloat + 0.5F);
    int j = i;
    if (i % 2 == 1)
      j = i - 1; 
    return j;
  }
  
  public void draw(Canvas paramCanvas) {
    if (this.n) {
      a(getBounds());
      this.n = false;
    } 
    paramCanvas.translate(0.0F, this.l / 2.0F);
    e(paramCanvas);
    paramCanvas.translate(0.0F, -this.l / 2.0F);
    b.a(paramCanvas, this.g, this.h, this.d);
  }
  
  ColorStateList f() {
    return this.m;
  }
  
  float g() {
    return this.h;
  }
  
  public int getOpacity() {
    return -3;
  }
  
  public boolean getPadding(Rect paramRect) {
    int i = (int)Math.ceil(d(this.j, this.h, this.q));
    int j = (int)Math.ceil(c(this.j, this.h, this.q));
    paramRect.set(j, i, j, i);
    return true;
  }
  
  void h(Rect paramRect) {
    getPadding(paramRect);
  }
  
  float i() {
    return this.j;
  }
  
  public boolean isStateful() {
    boolean bool;
    ColorStateList colorStateList = this.m;
    if ((colorStateList != null && colorStateList.isStateful()) || super.isStateful()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  float j() {
    float f = this.j;
    return Math.max(f, this.h + this.c + f * 1.5F / 2.0F) * 2.0F + (this.j * 1.5F + this.c) * 2.0F;
  }
  
  float k() {
    float f = this.j;
    return Math.max(f, this.h + this.c + f / 2.0F) * 2.0F + (this.j + this.c) * 2.0F;
  }
  
  float l() {
    return this.l;
  }
  
  void m(boolean paramBoolean) {
    this.q = paramBoolean;
    invalidateSelf();
  }
  
  void o(ColorStateList paramColorStateList) {
    n(paramColorStateList);
    invalidateSelf();
  }
  
  protected void onBoundsChange(Rect paramRect) {
    super.onBoundsChange(paramRect);
    this.n = true;
  }
  
  protected boolean onStateChange(int[] paramArrayOfint) {
    ColorStateList colorStateList = this.m;
    int i = colorStateList.getColorForState(paramArrayOfint, colorStateList.getDefaultColor());
    if (this.d.getColor() == i)
      return false; 
    this.d.setColor(i);
    this.n = true;
    invalidateSelf();
    return true;
  }
  
  void p(float paramFloat) {
    if (paramFloat >= 0.0F) {
      paramFloat = (int)(paramFloat + 0.5F);
      if (this.h == paramFloat)
        return; 
      this.h = paramFloat;
      this.n = true;
      invalidateSelf();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid radius ");
    stringBuilder.append(paramFloat);
    stringBuilder.append(". Must be >= 0");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  void q(float paramFloat) {
    s(this.l, paramFloat);
  }
  
  void r(float paramFloat) {
    s(paramFloat, this.j);
  }
  
  public void setAlpha(int paramInt) {
    this.d.setAlpha(paramInt);
    this.e.setAlpha(paramInt);
    this.f.setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    this.d.setColorFilter(paramColorFilter);
  }
  
  static interface a {
    void a(Canvas param1Canvas, RectF param1RectF, float param1Float, Paint param1Paint);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/cardview/widget/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */