package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

class f extends Drawable {
  private float a;
  
  private final Paint b;
  
  private final RectF c;
  
  private final Rect d;
  
  private float e;
  
  private boolean f = false;
  
  private boolean g = true;
  
  private ColorStateList h;
  
  private PorterDuffColorFilter i;
  
  private ColorStateList j;
  
  private PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
  
  f(ColorStateList paramColorStateList, float paramFloat) {
    this.a = paramFloat;
    this.b = new Paint(5);
    e(paramColorStateList);
    this.c = new RectF();
    this.d = new Rect();
  }
  
  private PorterDuffColorFilter a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode) {
    return (paramColorStateList == null || paramMode == null) ? null : new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode);
  }
  
  private void e(ColorStateList paramColorStateList) {
    ColorStateList colorStateList = paramColorStateList;
    if (paramColorStateList == null)
      colorStateList = ColorStateList.valueOf(0); 
    this.h = colorStateList;
    this.b.setColor(colorStateList.getColorForState(getState(), this.h.getDefaultColor()));
  }
  
  private void i(Rect paramRect) {
    Rect rect = paramRect;
    if (paramRect == null)
      rect = getBounds(); 
    this.c.set(rect.left, rect.top, rect.right, rect.bottom);
    this.d.set(rect);
    if (this.f) {
      float f1 = g.d(this.e, this.a, this.g);
      float f2 = g.c(this.e, this.a, this.g);
      this.d.inset((int)Math.ceil(f2), (int)Math.ceil(f1));
      this.c.set(this.d);
    } 
  }
  
  public ColorStateList b() {
    return this.h;
  }
  
  float c() {
    return this.e;
  }
  
  public float d() {
    return this.a;
  }
  
  public void draw(Canvas paramCanvas) {
    boolean bool;
    Paint paint = this.b;
    if (this.i != null && paint.getColorFilter() == null) {
      paint.setColorFilter((ColorFilter)this.i);
      bool = true;
    } else {
      bool = false;
    } 
    RectF rectF = this.c;
    float f1 = this.a;
    paramCanvas.drawRoundRect(rectF, f1, f1, paint);
    if (bool)
      paint.setColorFilter(null); 
  }
  
  public void f(ColorStateList paramColorStateList) {
    e(paramColorStateList);
    invalidateSelf();
  }
  
  void g(float paramFloat, boolean paramBoolean1, boolean paramBoolean2) {
    if (paramFloat == this.e && this.f == paramBoolean1 && this.g == paramBoolean2)
      return; 
    this.e = paramFloat;
    this.f = paramBoolean1;
    this.g = paramBoolean2;
    i(null);
    invalidateSelf();
  }
  
  public int getOpacity() {
    return -3;
  }
  
  public void getOutline(Outline paramOutline) {
    paramOutline.setRoundRect(this.d, this.a);
  }
  
  void h(float paramFloat) {
    if (paramFloat == this.a)
      return; 
    this.a = paramFloat;
    i(null);
    invalidateSelf();
  }
  
  public boolean isStateful() {
    ColorStateList colorStateList = this.j;
    if (colorStateList == null || !colorStateList.isStateful()) {
      colorStateList = this.h;
      return ((colorStateList != null && colorStateList.isStateful()) || super.isStateful());
    } 
    return true;
  }
  
  protected void onBoundsChange(Rect paramRect) {
    super.onBoundsChange(paramRect);
    i(paramRect);
  }
  
  protected boolean onStateChange(int[] paramArrayOfint) {
    boolean bool;
    ColorStateList colorStateList = this.h;
    int i = colorStateList.getColorForState(paramArrayOfint, colorStateList.getDefaultColor());
    if (i != this.b.getColor()) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool)
      this.b.setColor(i); 
    colorStateList = this.j;
    if (colorStateList != null) {
      PorterDuff.Mode mode = this.k;
      if (mode != null) {
        this.i = a(colorStateList, mode);
        return true;
      } 
    } 
    return bool;
  }
  
  public void setAlpha(int paramInt) {
    this.b.setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    this.b.setColorFilter(paramColorFilter);
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    this.j = paramColorStateList;
    this.i = a(paramColorStateList, this.k);
    invalidateSelf();
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    this.k = paramMode;
    this.i = a(this.j, paramMode);
    invalidateSelf();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/cardview/widget/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */