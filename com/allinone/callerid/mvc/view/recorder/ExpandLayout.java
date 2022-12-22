package com.allinone.callerid.mvc.view.recorder;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class ExpandLayout extends LinearLayout {
  private View b;
  
  private int c;
  
  private boolean d;
  
  private long e;
  
  public ExpandLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public ExpandLayout(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ExpandLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    h();
  }
  
  private void d(long paramLong) {
    ValueAnimator valueAnimator;
    if (this.d) {
      valueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, this.c });
    } else {
      valueAnimator = ValueAnimator.ofFloat(new float[] { this.c, 0.0F });
    } 
    paramLong /= 2L;
    valueAnimator.setDuration(paramLong);
    valueAnimator.setStartDelay(paramLong);
    valueAnimator.addUpdateListener(new b(this));
    valueAnimator.start();
  }
  
  private void h() {
    this.b = (View)this;
    this.d = true;
    this.e = 300L;
    j();
  }
  
  private void j() {
    this.b.post(new a(this));
  }
  
  public static void setViewHeight(View paramView, int paramInt) {
    (paramView.getLayoutParams()).height = paramInt;
    paramView.requestLayout();
  }
  
  public void e() {
    this.d = false;
    d(this.e);
  }
  
  public void f() {
    this.d = true;
    d(this.e);
  }
  
  public void g(boolean paramBoolean) {
    this.d = paramBoolean;
    if (!paramBoolean)
      d(10L); 
  }
  
  public boolean i() {
    return this.d;
  }
  
  public int k(View paramView) {
    paramView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    return paramView.getMeasuredHeight();
  }
  
  public void setAnimationDuration(long paramLong) {
    this.e = paramLong;
  }
  
  public void setViewHeight(int paramInt) {
    this.c = paramInt;
  }
  
  class a implements Runnable {
    a(ExpandLayout this$0) {}
    
    public void run() {
      if (ExpandLayout.a(this.b) <= 0) {
        ExpandLayout expandLayout = this.b;
        ExpandLayout.b(expandLayout, expandLayout.k(ExpandLayout.c(expandLayout)));
      } 
    }
  }
  
  class b implements ValueAnimator.AnimatorUpdateListener {
    b(ExpandLayout this$0) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      float f = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
      ExpandLayout.setViewHeight(ExpandLayout.c(this.a), (int)f);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/view/recorder/ExpandLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */