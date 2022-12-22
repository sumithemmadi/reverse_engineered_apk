package b.h.k;

import android.view.View;
import android.view.ViewTreeObserver;

public final class t implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
  private final View b;
  
  private ViewTreeObserver c;
  
  private final Runnable d;
  
  private t(View paramView, Runnable paramRunnable) {
    this.b = paramView;
    this.c = paramView.getViewTreeObserver();
    this.d = paramRunnable;
  }
  
  public static t a(View paramView, Runnable paramRunnable) {
    if (paramView != null) {
      if (paramRunnable != null) {
        t t1 = new t(paramView, paramRunnable);
        paramView.getViewTreeObserver().addOnPreDrawListener(t1);
        paramView.addOnAttachStateChangeListener(t1);
        return t1;
      } 
      throw new NullPointerException("runnable == null");
    } 
    throw new NullPointerException("view == null");
  }
  
  public void b() {
    if (this.c.isAlive()) {
      this.c.removeOnPreDrawListener(this);
    } else {
      this.b.getViewTreeObserver().removeOnPreDrawListener(this);
    } 
    this.b.removeOnAttachStateChangeListener(this);
  }
  
  public boolean onPreDraw() {
    b();
    this.d.run();
    return true;
  }
  
  public void onViewAttachedToWindow(View paramView) {
    this.c = paramView.getViewTreeObserver();
  }
  
  public void onViewDetachedFromWindow(View paramView) {
    b();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */