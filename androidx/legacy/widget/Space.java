package androidx.legacy.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
public class Space extends View {
  @Deprecated
  public Space(Context paramContext) {
    this(paramContext, null);
  }
  
  @Deprecated
  public Space(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  @Deprecated
  public Space(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    if (getVisibility() == 0)
      setVisibility(4); 
  }
  
  private static int a(int paramInt1, int paramInt2) {
    int i = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (i != Integer.MIN_VALUE) {
      if (i == 1073741824)
        paramInt1 = paramInt2; 
    } else {
      paramInt1 = Math.min(paramInt1, paramInt2);
    } 
    return paramInt1;
  }
  
  @Deprecated
  @SuppressLint({"MissingSuperCall"})
  public void draw(Canvas paramCanvas) {}
  
  @Deprecated
  protected void onMeasure(int paramInt1, int paramInt2) {
    setMeasuredDimension(a(getSuggestedMinimumWidth(), paramInt1), a(getSuggestedMinimumHeight(), paramInt2));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/legacy/widget/Space.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */