package b.a.l.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

public class c extends Drawable implements Drawable.Callback {
  private Drawable b;
  
  public c(Drawable paramDrawable) {
    b(paramDrawable);
  }
  
  public Drawable a() {
    return this.b;
  }
  
  public void b(Drawable paramDrawable) {
    Drawable drawable = this.b;
    if (drawable != null)
      drawable.setCallback(null); 
    this.b = paramDrawable;
    if (paramDrawable != null)
      paramDrawable.setCallback(this); 
  }
  
  public void draw(Canvas paramCanvas) {
    this.b.draw(paramCanvas);
  }
  
  public int getChangingConfigurations() {
    return this.b.getChangingConfigurations();
  }
  
  public Drawable getCurrent() {
    return this.b.getCurrent();
  }
  
  public int getIntrinsicHeight() {
    return this.b.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth() {
    return this.b.getIntrinsicWidth();
  }
  
  public int getMinimumHeight() {
    return this.b.getMinimumHeight();
  }
  
  public int getMinimumWidth() {
    return this.b.getMinimumWidth();
  }
  
  public int getOpacity() {
    return this.b.getOpacity();
  }
  
  public boolean getPadding(Rect paramRect) {
    return this.b.getPadding(paramRect);
  }
  
  public int[] getState() {
    return this.b.getState();
  }
  
  public Region getTransparentRegion() {
    return this.b.getTransparentRegion();
  }
  
  public void invalidateDrawable(Drawable paramDrawable) {
    invalidateSelf();
  }
  
  public boolean isAutoMirrored() {
    return a.h(this.b);
  }
  
  public boolean isStateful() {
    return this.b.isStateful();
  }
  
  public void jumpToCurrentState() {
    this.b.jumpToCurrentState();
  }
  
  protected void onBoundsChange(Rect paramRect) {
    this.b.setBounds(paramRect);
  }
  
  protected boolean onLevelChange(int paramInt) {
    return this.b.setLevel(paramInt);
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong) {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt) {
    this.b.setAlpha(paramInt);
  }
  
  public void setAutoMirrored(boolean paramBoolean) {
    a.j(this.b, paramBoolean);
  }
  
  public void setChangingConfigurations(int paramInt) {
    this.b.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    this.b.setColorFilter(paramColorFilter);
  }
  
  public void setDither(boolean paramBoolean) {
    this.b.setDither(paramBoolean);
  }
  
  public void setFilterBitmap(boolean paramBoolean) {
    this.b.setFilterBitmap(paramBoolean);
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2) {
    a.k(this.b, paramFloat1, paramFloat2);
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a.l(this.b, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean setState(int[] paramArrayOfint) {
    return this.b.setState(paramArrayOfint);
  }
  
  public void setTint(int paramInt) {
    a.n(this.b, paramInt);
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    a.o(this.b, paramColorStateList);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    a.p(this.b, paramMode);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    return (super.setVisible(paramBoolean1, paramBoolean2) || this.b.setVisible(paramBoolean1, paramBoolean2));
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable) {
    unscheduleSelf(paramRunnable);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/a/l/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */