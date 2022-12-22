package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.solver.widgets.j;

public abstract class VirtualLayout extends ConstraintHelper {
  private boolean k;
  
  private boolean l;
  
  public VirtualLayout(Context paramContext) {
    super(paramContext);
  }
  
  public VirtualLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public VirtualLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void n(AttributeSet paramAttributeSet) {
    super.n(paramAttributeSet);
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, e.ConstraintLayout_Layout);
      int i = typedArray.getIndexCount();
      for (byte b = 0; b < i; b++) {
        int j = typedArray.getIndex(b);
        if (j == e.ConstraintLayout_Layout_android_visibility) {
          this.k = true;
        } else if (j == e.ConstraintLayout_Layout_android_elevation) {
          this.l = true;
        } 
      } 
      typedArray.recycle();
    } 
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    if (this.k || this.l) {
      ViewParent viewParent = getParent();
      if (viewParent != null && viewParent instanceof ConstraintLayout) {
        float f;
        ConstraintLayout constraintLayout = (ConstraintLayout)viewParent;
        int i = getVisibility();
        if (Build.VERSION.SDK_INT >= 21) {
          f = getElevation();
        } else {
          f = 0.0F;
        } 
        for (byte b = 0; b < this.c; b++) {
          View view = constraintLayout.o(this.b[b]);
          if (view != null) {
            if (this.k)
              view.setVisibility(i); 
            if (this.l && f > 0.0F && Build.VERSION.SDK_INT >= 21)
              view.setTranslationZ(view.getTranslationZ() + f); 
          } 
        } 
      } 
    } 
  }
  
  public void setElevation(float paramFloat) {
    super.setElevation(paramFloat);
    h();
  }
  
  public void setVisibility(int paramInt) {
    super.setVisibility(paramInt);
    h();
  }
  
  public void w(j paramj, int paramInt1, int paramInt2) {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/widget/VirtualLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */