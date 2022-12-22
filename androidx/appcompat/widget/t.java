package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.p;

public abstract class t implements View.OnTouchListener, View.OnAttachStateChangeListener {
  private final float b;
  
  private final int c;
  
  private final int d;
  
  final View e;
  
  private Runnable f;
  
  private Runnable g;
  
  private boolean h;
  
  private int i;
  
  private final int[] j = new int[2];
  
  public t(View paramView) {
    this.e = paramView;
    paramView.setLongClickable(true);
    paramView.addOnAttachStateChangeListener(this);
    this.b = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
    int i = ViewConfiguration.getTapTimeout();
    this.c = i;
    this.d = (i + ViewConfiguration.getLongPressTimeout()) / 2;
  }
  
  private void a() {
    Runnable runnable = this.g;
    if (runnable != null)
      this.e.removeCallbacks(runnable); 
    runnable = this.f;
    if (runnable != null)
      this.e.removeCallbacks(runnable); 
  }
  
  private boolean f(MotionEvent paramMotionEvent) {
    View view = this.e;
    p p = b();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (p != null)
      if (!p.a()) {
        bool2 = bool1;
      } else {
        r r = (r)p.U0();
        bool2 = bool1;
        if (r != null)
          if (!r.isShown()) {
            bool2 = bool1;
          } else {
            MotionEvent motionEvent = MotionEvent.obtainNoHistory(paramMotionEvent);
            i(view, motionEvent);
            j((View)r, motionEvent);
            boolean bool = r.e(motionEvent, this.i);
            motionEvent.recycle();
            int i = paramMotionEvent.getActionMasked();
            if (i != 1 && i != 3) {
              i = 1;
            } else {
              i = 0;
            } 
            bool2 = bool1;
            if (bool) {
              bool2 = bool1;
              if (i != 0)
                bool2 = true; 
            } 
          }  
      }  
    return bool2;
  }
  
  private boolean g(MotionEvent paramMotionEvent) {
    View view = this.e;
    if (!view.isEnabled())
      return false; 
    int i = paramMotionEvent.getActionMasked();
    if (i != 0) {
      if (i != 1)
        if (i != 2) {
          if (i != 3)
            return false; 
        } else {
          i = paramMotionEvent.findPointerIndex(this.i);
          if (i >= 0 && !h(view, paramMotionEvent.getX(i), paramMotionEvent.getY(i), this.b)) {
            a();
            view.getParent().requestDisallowInterceptTouchEvent(true);
            return true;
          } 
          return false;
        }  
      a();
    } else {
      this.i = paramMotionEvent.getPointerId(0);
      if (this.f == null)
        this.f = new a(this); 
      view.postDelayed(this.f, this.c);
      if (this.g == null)
        this.g = new b(this); 
      view.postDelayed(this.g, this.d);
    } 
    return false;
  }
  
  private static boolean h(View paramView, float paramFloat1, float paramFloat2, float paramFloat3) {
    boolean bool;
    float f = -paramFloat3;
    if (paramFloat1 >= f && paramFloat2 >= f && paramFloat1 < (paramView.getRight() - paramView.getLeft()) + paramFloat3 && paramFloat2 < (paramView.getBottom() - paramView.getTop()) + paramFloat3) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private boolean i(View paramView, MotionEvent paramMotionEvent) {
    int[] arrayOfInt = this.j;
    paramView.getLocationOnScreen(arrayOfInt);
    paramMotionEvent.offsetLocation(arrayOfInt[0], arrayOfInt[1]);
    return true;
  }
  
  private boolean j(View paramView, MotionEvent paramMotionEvent) {
    int[] arrayOfInt = this.j;
    paramView.getLocationOnScreen(arrayOfInt);
    paramMotionEvent.offsetLocation(-arrayOfInt[0], -arrayOfInt[1]);
    return true;
  }
  
  public abstract p b();
  
  protected abstract boolean c();
  
  protected boolean d() {
    p p = b();
    if (p != null && p.a())
      p.dismiss(); 
    return true;
  }
  
  void e() {
    a();
    View view = this.e;
    if (view.isEnabled() && !view.isLongClickable()) {
      if (!c())
        return; 
      view.getParent().requestDisallowInterceptTouchEvent(true);
      long l = SystemClock.uptimeMillis();
      MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
      view.onTouchEvent(motionEvent);
      motionEvent.recycle();
      this.h = true;
    } 
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    boolean bool2;
    boolean bool = this.h;
    boolean bool1 = true;
    if (bool) {
      if (f(paramMotionEvent) || !d()) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
    } else {
      boolean bool4;
      if (g(paramMotionEvent) && c()) {
        bool4 = true;
      } else {
        bool4 = false;
      } 
      bool2 = bool4;
      if (bool4) {
        long l = SystemClock.uptimeMillis();
        MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        this.e.onTouchEvent(motionEvent);
        motionEvent.recycle();
        bool2 = bool4;
      } 
    } 
    this.h = bool2;
    boolean bool3 = bool1;
    if (!bool2)
      if (bool) {
        bool3 = bool1;
      } else {
        bool3 = false;
      }  
    return bool3;
  }
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView) {
    this.h = false;
    this.i = -1;
    Runnable runnable = this.f;
    if (runnable != null)
      this.e.removeCallbacks(runnable); 
  }
  
  private class a implements Runnable {
    a(t this$0) {}
    
    public void run() {
      ViewParent viewParent = this.b.e.getParent();
      if (viewParent != null)
        viewParent.requestDisallowInterceptTouchEvent(true); 
    }
  }
  
  private class b implements Runnable {
    b(t this$0) {}
    
    public void run() {
      this.b.e();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */