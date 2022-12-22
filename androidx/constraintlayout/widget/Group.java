package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;

public class Group extends ConstraintHelper {
  public Group(Context paramContext) {
    super(paramContext);
  }
  
  public Group(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public Group(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void n(AttributeSet paramAttributeSet) {
    super.n(paramAttributeSet);
    this.f = false;
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    h();
  }
  
  public void q(ConstraintLayout paramConstraintLayout) {
    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams)getLayoutParams();
    layoutParams.n0.Y0(0);
    layoutParams.n0.z0(0);
  }
  
  public void setElevation(float paramFloat) {
    super.setElevation(paramFloat);
    h();
  }
  
  public void setVisibility(int paramInt) {
    super.setVisibility(paramInt);
    h();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/widget/Group.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */