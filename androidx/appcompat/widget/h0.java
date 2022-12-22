package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import b.h.k.w;
import b.h.k.x;

class h0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
  private static h0 b;
  
  private static h0 c;
  
  private final View d;
  
  private final CharSequence e;
  
  private final int f;
  
  private final Runnable g = new a(this);
  
  private final Runnable h = new b(this);
  
  private int i;
  
  private int j;
  
  private i0 k;
  
  private boolean l;
  
  private h0(View paramView, CharSequence paramCharSequence) {
    this.d = paramView;
    this.e = paramCharSequence;
    this.f = x.c(ViewConfiguration.get(paramView.getContext()));
    b();
    paramView.setOnLongClickListener(this);
    paramView.setOnHoverListener(this);
  }
  
  private void a() {
    this.d.removeCallbacks(this.g);
  }
  
  private void b() {
    this.i = Integer.MAX_VALUE;
    this.j = Integer.MAX_VALUE;
  }
  
  private void d() {
    this.d.postDelayed(this.g, ViewConfiguration.getLongPressTimeout());
  }
  
  private static void e(h0 paramh0) {
    h0 h01 = b;
    if (h01 != null)
      h01.a(); 
    b = paramh0;
    if (paramh0 != null)
      paramh0.d(); 
  }
  
  public static void f(View paramView, CharSequence paramCharSequence) {
    h0 h01;
    h0 h02 = b;
    if (h02 != null && h02.d == paramView)
      e(null); 
    if (TextUtils.isEmpty(paramCharSequence)) {
      h01 = c;
      if (h01 != null && h01.d == paramView)
        h01.c(); 
      paramView.setOnLongClickListener(null);
      paramView.setLongClickable(false);
      paramView.setOnHoverListener(null);
    } else {
      new h0(paramView, (CharSequence)h01);
    } 
  }
  
  private boolean h(MotionEvent paramMotionEvent) {
    int i = (int)paramMotionEvent.getX();
    int j = (int)paramMotionEvent.getY();
    if (Math.abs(i - this.i) <= this.f && Math.abs(j - this.j) <= this.f)
      return false; 
    this.i = i;
    this.j = j;
    return true;
  }
  
  void c() {
    if (c == this) {
      c = null;
      i0 i01 = this.k;
      if (i01 != null) {
        i01.c();
        this.k = null;
        b();
        this.d.removeOnAttachStateChangeListener(this);
      } else {
        Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
      } 
    } 
    if (b == this)
      e(null); 
    this.d.removeCallbacks(this.h);
  }
  
  void g(boolean paramBoolean) {
    long l;
    if (!w.U(this.d))
      return; 
    e(null);
    h0 h01 = c;
    if (h01 != null)
      h01.c(); 
    c = this;
    this.l = paramBoolean;
    i0 i01 = new i0(this.d.getContext());
    this.k = i01;
    i01.e(this.d, this.i, this.j, this.l, this.e);
    this.d.addOnAttachStateChangeListener(this);
    if (this.l) {
      l = 2500L;
    } else {
      int i;
      if ((w.O(this.d) & 0x1) == 1) {
        l = 3000L;
        i = ViewConfiguration.getLongPressTimeout();
      } else {
        l = 15000L;
        i = ViewConfiguration.getLongPressTimeout();
      } 
      l -= i;
    } 
    this.d.removeCallbacks(this.h);
    this.d.postDelayed(this.h, l);
  }
  
  public boolean onHover(View paramView, MotionEvent paramMotionEvent) {
    if (this.k != null && this.l)
      return false; 
    AccessibilityManager accessibilityManager = (AccessibilityManager)this.d.getContext().getSystemService("accessibility");
    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled())
      return false; 
    int i = paramMotionEvent.getAction();
    if (i != 7) {
      if (i == 10) {
        b();
        c();
      } 
    } else if (this.d.isEnabled() && this.k == null && h(paramMotionEvent)) {
      e(this);
    } 
    return false;
  }
  
  public boolean onLongClick(View paramView) {
    this.i = paramView.getWidth() / 2;
    this.j = paramView.getHeight() / 2;
    g(true);
    return true;
  }
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView) {
    c();
  }
  
  class a implements Runnable {
    a(h0 this$0) {}
    
    public void run() {
      this.b.g(false);
    }
  }
  
  class b implements Runnable {
    b(h0 this$0) {}
    
    public void run() {
      this.b.c();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */