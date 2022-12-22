package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;

public class MotionHelper extends ConstraintHelper implements MotionLayout.i {
  private boolean k = false;
  
  private boolean l = false;
  
  private float m;
  
  protected View[] n;
  
  public MotionHelper(Context paramContext) {
    super(paramContext);
  }
  
  public MotionHelper(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    n(paramAttributeSet);
  }
  
  public MotionHelper(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    n(paramAttributeSet);
  }
  
  public void a(MotionLayout paramMotionLayout, int paramInt1, int paramInt2, float paramFloat) {}
  
  public void b(MotionLayout paramMotionLayout, int paramInt1, int paramInt2) {}
  
  public void c(MotionLayout paramMotionLayout, int paramInt, boolean paramBoolean, float paramFloat) {}
  
  public void d(MotionLayout paramMotionLayout, int paramInt) {}
  
  public float getProgress() {
    return this.m;
  }
  
  protected void n(AttributeSet paramAttributeSet) {
    super.n(paramAttributeSet);
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, e.MotionHelper);
      int j = typedArray.getIndexCount();
      for (byte b = 0; b < j; b++) {
        int k = typedArray.getIndex(b);
        if (k == e.MotionHelper_onShow) {
          this.k = typedArray.getBoolean(k, this.k);
        } else if (k == e.MotionHelper_onHide) {
          this.l = typedArray.getBoolean(k, this.l);
        } 
      } 
      typedArray.recycle();
    } 
  }
  
  public void setProgress(float paramFloat) {
    this.m = paramFloat;
    int j = this.c;
    int k = 0;
    int m = 0;
    if (j > 0) {
      this.n = m((ConstraintLayout)getParent());
      for (k = m; k < this.c; k++)
        setProgress(this.n[k], paramFloat); 
    } else {
      ViewGroup viewGroup = (ViewGroup)getParent();
      m = viewGroup.getChildCount();
      while (k < m) {
        View view = viewGroup.getChildAt(k);
        if (!(view instanceof MotionHelper))
          setProgress(view, paramFloat); 
        k++;
      } 
    } 
  }
  
  public void setProgress(View paramView, float paramFloat) {}
  
  public boolean w() {
    return this.l;
  }
  
  public boolean x() {
    return this.k;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/motion/widget/MotionHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */