package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

class b extends Drawable {
  final ActionBarContainer a;
  
  public b(ActionBarContainer paramActionBarContainer) {
    this.a = paramActionBarContainer;
  }
  
  public void draw(Canvas paramCanvas) {
    Drawable drawable;
    ActionBarContainer actionBarContainer = this.a;
    if (actionBarContainer.i) {
      drawable = actionBarContainer.h;
      if (drawable != null)
        drawable.draw(paramCanvas); 
    } else {
      drawable = ((ActionBarContainer)drawable).f;
      if (drawable != null)
        drawable.draw(paramCanvas); 
      ActionBarContainer actionBarContainer1 = this.a;
      Drawable drawable1 = actionBarContainer1.g;
      if (drawable1 != null && actionBarContainer1.j)
        drawable1.draw(paramCanvas); 
    } 
  }
  
  public int getOpacity() {
    return 0;
  }
  
  public void getOutline(Outline paramOutline) {
    Drawable drawable;
    ActionBarContainer actionBarContainer = this.a;
    if (actionBarContainer.i) {
      drawable = actionBarContainer.h;
      if (drawable != null)
        drawable.getOutline(paramOutline); 
    } else {
      drawable = ((ActionBarContainer)drawable).f;
      if (drawable != null)
        drawable.getOutline(paramOutline); 
    } 
  }
  
  public void setAlpha(int paramInt) {}
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */