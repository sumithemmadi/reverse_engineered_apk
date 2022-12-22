package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout extends LinearLayout implements s {
  private s.a b;
  
  public FitWindowsLinearLayout(Context paramContext) {
    super(paramContext);
  }
  
  public FitWindowsLinearLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  protected boolean fitSystemWindows(Rect paramRect) {
    s.a a1 = this.b;
    if (a1 != null)
      a1.a(paramRect); 
    return super.fitSystemWindows(paramRect);
  }
  
  public void setOnFitSystemWindowsListener(s.a parama) {
    this.b = parama;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/FitWindowsLinearLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */