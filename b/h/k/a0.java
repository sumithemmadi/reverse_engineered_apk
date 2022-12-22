package b.h.k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class a0 {
  private WeakReference<View> a;
  
  Runnable b = null;
  
  Runnable c = null;
  
  int d = -1;
  
  a0(View paramView) {
    this.a = new WeakReference<View>(paramView);
  }
  
  private void g(View paramView, b0 paramb0) {
    if (paramb0 != null) {
      paramView.animate().setListener((Animator.AnimatorListener)new a(this, paramb0, paramView));
    } else {
      paramView.animate().setListener(null);
    } 
  }
  
  public a0 a(float paramFloat) {
    View view = this.a.get();
    if (view != null)
      view.animate().alpha(paramFloat); 
    return this;
  }
  
  public void b() {
    View view = this.a.get();
    if (view != null)
      view.animate().cancel(); 
  }
  
  public long c() {
    View view = this.a.get();
    return (view != null) ? view.animate().getDuration() : 0L;
  }
  
  public a0 d(long paramLong) {
    View view = this.a.get();
    if (view != null)
      view.animate().setDuration(paramLong); 
    return this;
  }
  
  public a0 e(Interpolator paramInterpolator) {
    View view = this.a.get();
    if (view != null)
      view.animate().setInterpolator((TimeInterpolator)paramInterpolator); 
    return this;
  }
  
  public a0 f(b0 paramb0) {
    View view = this.a.get();
    if (view != null)
      if (Build.VERSION.SDK_INT >= 16) {
        g(view, paramb0);
      } else {
        view.setTag(2113929216, paramb0);
        g(view, new c(this));
      }  
    return this;
  }
  
  public a0 h(long paramLong) {
    View view = this.a.get();
    if (view != null)
      view.animate().setStartDelay(paramLong); 
    return this;
  }
  
  public a0 i(d0 paramd0) {
    View view = this.a.get();
    if (view != null && Build.VERSION.SDK_INT >= 19) {
      b b = null;
      if (paramd0 != null)
        b = new b(this, paramd0, view); 
      view.animate().setUpdateListener(b);
    } 
    return this;
  }
  
  public void j() {
    View view = this.a.get();
    if (view != null)
      view.animate().start(); 
  }
  
  public a0 k(float paramFloat) {
    View view = this.a.get();
    if (view != null)
      view.animate().translationY(paramFloat); 
    return this;
  }
  
  class a extends AnimatorListenerAdapter {
    a(a0 this$0, b0 param1b0, View param1View) {}
    
    public void onAnimationCancel(Animator param1Animator) {
      this.a.a(this.b);
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      this.a.b(this.b);
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.a.c(this.b);
    }
  }
  
  class b implements ValueAnimator.AnimatorUpdateListener {
    b(a0 this$0, d0 param1d0, View param1View) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      this.a.a(this.b);
    }
  }
  
  static class c implements b0 {
    a0 a;
    
    boolean b;
    
    c(a0 param1a0) {
      this.a = param1a0;
    }
    
    public void a(View param1View) {
      Object object = param1View.getTag(2113929216);
      if (object instanceof b0) {
        object = object;
      } else {
        object = null;
      } 
      if (object != null)
        object.a(param1View); 
    }
    
    @SuppressLint({"WrongConstant"})
    public void b(View param1View) {
      int i = this.a.d;
      b0 b01 = null;
      if (i > -1) {
        param1View.setLayerType(i, null);
        this.a.d = -1;
      } 
      if (Build.VERSION.SDK_INT >= 16 || !this.b) {
        a0 a01 = this.a;
        Runnable runnable = a01.c;
        if (runnable != null) {
          a01.c = null;
          runnable.run();
        } 
        Object object = param1View.getTag(2113929216);
        if (object instanceof b0)
          b01 = (b0)object; 
        if (b01 != null)
          b01.b(param1View); 
        this.b = true;
      } 
    }
    
    public void c(View param1View) {
      this.b = false;
      int i = this.a.d;
      b0 b01 = null;
      if (i > -1)
        param1View.setLayerType(2, null); 
      a0 a01 = this.a;
      Runnable runnable = a01.b;
      if (runnable != null) {
        a01.b = null;
        runnable.run();
      } 
      Object object = param1View.getTag(2113929216);
      if (object instanceof b0)
        b01 = (b0)object; 
      if (b01 != null)
        b01.c(param1View); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */