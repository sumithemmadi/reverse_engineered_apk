package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

class e extends d {
  private static Method i;
  
  e(Drawable paramDrawable) {
    super(paramDrawable);
    g();
  }
  
  e(f paramf, Resources paramResources) {
    super(paramf, paramResources);
    g();
  }
  
  private void g() {
    if (i == null)
      try {
        i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
      } catch (Exception exception) {
        Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", exception);
      }  
  }
  
  protected boolean c() {
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    null = bool;
    if (i == 21) {
      Drawable drawable = this.h;
      if (!(drawable instanceof android.graphics.drawable.GradientDrawable) && !(drawable instanceof android.graphics.drawable.DrawableContainer) && !(drawable instanceof android.graphics.drawable.InsetDrawable)) {
        null = bool;
        return (drawable instanceof android.graphics.drawable.RippleDrawable) ? true : null;
      } 
    } else {
      return null;
    } 
    return true;
  }
  
  public Rect getDirtyBounds() {
    return this.h.getDirtyBounds();
  }
  
  public void getOutline(Outline paramOutline) {
    this.h.getOutline(paramOutline);
  }
  
  public boolean isProjected() {
    Drawable drawable = this.h;
    if (drawable != null) {
      Method method = i;
      if (method != null)
        try {
          return ((Boolean)method.invoke(drawable, new Object[0])).booleanValue();
        } catch (Exception exception) {
          Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", exception);
        }  
    } 
    return false;
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2) {
    this.h.setHotspot(paramFloat1, paramFloat2);
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.h.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean setState(int[] paramArrayOfint) {
    if (super.setState(paramArrayOfint)) {
      invalidateSelf();
      return true;
    } 
    return false;
  }
  
  public void setTint(int paramInt) {
    if (c()) {
      super.setTint(paramInt);
    } else {
      this.h.setTint(paramInt);
    } 
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    if (c()) {
      super.setTintList(paramColorStateList);
    } else {
      this.h.setTintList(paramColorStateList);
    } 
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    if (c()) {
      super.setTintMode(paramMode);
    } else {
      this.h.setTintMode(paramMode);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/graphics/drawable/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */