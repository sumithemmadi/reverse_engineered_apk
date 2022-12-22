package b.t.a.a;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import androidx.core.graphics.drawable.b;

abstract class h extends Drawable implements b {
  Drawable b;
  
  public void applyTheme(Resources.Theme paramTheme) {
    Drawable drawable = this.b;
    if (drawable != null)
      a.a(drawable, paramTheme); 
  }
  
  public void clearColorFilter() {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.clearColorFilter();
      return;
    } 
    super.clearColorFilter();
  }
  
  public Drawable getCurrent() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getCurrent() : super.getCurrent();
  }
  
  public int getMinimumHeight() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getMinimumHeight() : super.getMinimumHeight();
  }
  
  public int getMinimumWidth() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getMinimumWidth() : super.getMinimumWidth();
  }
  
  public boolean getPadding(Rect paramRect) {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getPadding(paramRect) : super.getPadding(paramRect);
  }
  
  public int[] getState() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getState() : super.getState();
  }
  
  public Region getTransparentRegion() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getTransparentRegion() : super.getTransparentRegion();
  }
  
  public void jumpToCurrentState() {
    Drawable drawable = this.b;
    if (drawable != null)
      a.i(drawable); 
  }
  
  protected boolean onLevelChange(int paramInt) {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.setLevel(paramInt) : super.onLevelChange(paramInt);
  }
  
  public void setChangingConfigurations(int paramInt) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setChangingConfigurations(paramInt);
      return;
    } 
    super.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(int paramInt, PorterDuff.Mode paramMode) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setColorFilter(paramInt, paramMode);
      return;
    } 
    super.setColorFilter(paramInt, paramMode);
  }
  
  public void setFilterBitmap(boolean paramBoolean) {
    Drawable drawable = this.b;
    if (drawable != null)
      drawable.setFilterBitmap(paramBoolean); 
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2) {
    Drawable drawable = this.b;
    if (drawable != null)
      a.k(drawable, paramFloat1, paramFloat2); 
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Drawable drawable = this.b;
    if (drawable != null)
      a.l(drawable, paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  public boolean setState(int[] paramArrayOfint) {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.setState(paramArrayOfint) : super.setState(paramArrayOfint);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/t/a/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */