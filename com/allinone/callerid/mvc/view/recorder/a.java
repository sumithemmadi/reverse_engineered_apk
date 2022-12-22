package com.allinone.callerid.mvc.view.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.DecelerateInterpolator;

public class a {
  private b a;
  
  @SuppressLint({"NewApi"})
  private void b(boolean paramBoolean, View paramView1, View paramView2) {
    b b1;
    if (Build.VERSION.SDK_INT < 21) {
      if (paramBoolean) {
        paramView2.setVisibility(0);
        b1 = this.a;
        if (b1 != null)
          b1.b(); 
      } else {
        paramView2.setVisibility(8);
        b1 = this.a;
        if (b1 != null)
          b1.a(); 
      } 
      return;
    } 
    int[] arrayOfInt2 = new int[2];
    b1.getLocationInWindow(arrayOfInt2);
    int i = arrayOfInt2[0] + b1.getWidth() / 2;
    int j = arrayOfInt2[1] + b1.getHeight() / 2;
    int[] arrayOfInt1 = new int[2];
    paramView2.getLocationInWindow(arrayOfInt1);
    int k = arrayOfInt1[0];
    int m = paramView2.getWidth() / 2;
    int n = arrayOfInt1[1];
    int i1 = paramView2.getHeight() / 2;
    if (i < k + m) {
      m = paramView2.getWidth() - i;
    } else {
      m = i - arrayOfInt1[0];
    } 
    if (j < n + i1) {
      n = paramView2.getHeight() - j;
    } else {
      n = j - arrayOfInt1[1];
    } 
    float f1 = (float)Math.sqrt((m * m + n * n));
    float f2 = 0.0F;
    float f3 = f1;
    if (paramBoolean) {
      f3 = 0.0F;
      f2 = f1;
    } 
    Animator animator = ViewAnimationUtils.createCircularReveal(paramView2, i, j, f3, f2);
    paramView2.setVisibility(0);
    animator.setDuration(300L);
    animator.setInterpolator((TimeInterpolator)new DecelerateInterpolator());
    animator.addListener((Animator.AnimatorListener)new a(this, paramBoolean, paramView2));
    animator.start();
  }
  
  public void c(View paramView1, View paramView2) {
    b(false, paramView1, paramView2);
  }
  
  public void d(b paramb) {
    this.a = paramb;
  }
  
  class a extends AnimatorListenerAdapter {
    a(a this$0, boolean param1Boolean, View param1View) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      super.onAnimationEnd(param1Animator);
      if (this.a) {
        this.b.setVisibility(0);
        if (a.a(this.c) != null)
          a.a(this.c).b(); 
      } else {
        this.b.setVisibility(8);
        if (a.a(this.c) != null)
          a.a(this.c).a(); 
      } 
    }
  }
  
  public static interface b {
    void a();
    
    void b();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/view/recorder/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */