package b.j.a;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityRecord;
import b.e.h;
import b.h.k.a;
import b.h.k.f0.d;
import b.h.k.f0.e;
import b.h.k.w;
import b.h.k.z;
import java.util.ArrayList;
import java.util.List;

public abstract class a extends a {
  private static final Rect d = new Rect(2147483647, 2147483647, -2147483648, -2147483648);
  
  private static final b.a<b.h.k.f0.c> e = new a();
  
  private static final b.b<h<b.h.k.f0.c>, b.h.k.f0.c> f = new b();
  
  private final Rect g = new Rect();
  
  private final Rect h = new Rect();
  
  private final Rect i = new Rect();
  
  private final int[] j = new int[2];
  
  private final AccessibilityManager k;
  
  private final View l;
  
  private c m;
  
  int n = Integer.MIN_VALUE;
  
  int o = Integer.MIN_VALUE;
  
  private int p = Integer.MIN_VALUE;
  
  public a(View paramView) {
    if (paramView != null) {
      this.l = paramView;
      this.k = (AccessibilityManager)paramView.getContext().getSystemService("accessibility");
      paramView.setFocusable(true);
      if (w.A(paramView) == 0)
        w.B0(paramView, 1); 
      return;
    } 
    throw new IllegalArgumentException("View may not be null");
  }
  
  private static Rect D(View paramView, int paramInt, Rect paramRect) {
    int i = paramView.getWidth();
    int j = paramView.getHeight();
    if (paramInt != 17) {
      if (paramInt != 33) {
        if (paramInt != 66) {
          if (paramInt == 130) {
            paramRect.set(0, -1, i, -1);
          } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
          } 
        } else {
          paramRect.set(-1, 0, -1, j);
        } 
      } else {
        paramRect.set(0, j, i, j);
      } 
    } else {
      paramRect.set(i, 0, i, j);
    } 
    return paramRect;
  }
  
  private boolean G(Rect paramRect) {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramRect != null)
      if (paramRect.isEmpty()) {
        bool2 = bool1;
      } else {
        if (this.l.getWindowVisibility() != 0)
          return false; 
        ViewParent viewParent = this.l.getParent();
        while (viewParent instanceof View) {
          View view = (View)viewParent;
          if (view.getAlpha() <= 0.0F || view.getVisibility() != 0)
            return false; 
          viewParent = view.getParent();
        } 
        bool2 = bool1;
        if (viewParent != null)
          bool2 = true; 
      }  
    return bool2;
  }
  
  private static int H(int paramInt) {
    return (paramInt != 19) ? ((paramInt != 21) ? ((paramInt != 22) ? 130 : 66) : 17) : 33;
  }
  
  private boolean I(int paramInt, Rect paramRect) {
    b.h.k.f0.c c1;
    b.h.k.f0.c c2;
    h<b.h.k.f0.c> h = y();
    int i = this.o;
    int j = Integer.MIN_VALUE;
    if (i == Integer.MIN_VALUE) {
      c2 = null;
    } else {
      c2 = (b.h.k.f0.c)h.i(i);
    } 
    if (paramInt != 1 && paramInt != 2) {
      if (paramInt == 17 || paramInt == 33 || paramInt == 66 || paramInt == 130) {
        Rect rect = new Rect();
        i = this.o;
        if (i != Integer.MIN_VALUE) {
          z(i, rect);
        } else if (paramRect != null) {
          rect.set(paramRect);
        } else {
          D(this.l, paramInt, rect);
        } 
        c1 = b.<h<b.h.k.f0.c>, b.h.k.f0.c>c(h, f, e, c2, rect, paramInt);
      } else {
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
      } 
    } else {
      boolean bool;
      if (w.C(this.l) == 1) {
        bool = true;
      } else {
        bool = false;
      } 
      c1 = b.<h<b.h.k.f0.c>, b.h.k.f0.c>d(h, f, e, c2, paramInt, bool, false);
    } 
    if (c1 == null) {
      paramInt = j;
    } else {
      paramInt = h.m(h.l(c1));
    } 
    return V(paramInt);
  }
  
  private boolean S(int paramInt1, int paramInt2, Bundle paramBundle) {
    return (paramInt2 != 1) ? ((paramInt2 != 2) ? ((paramInt2 != 64) ? ((paramInt2 != 128) ? L(paramInt1, paramInt2, paramBundle) : n(paramInt1)) : U(paramInt1)) : o(paramInt1)) : V(paramInt1);
  }
  
  private boolean T(int paramInt, Bundle paramBundle) {
    return w.f0(this.l, paramInt, paramBundle);
  }
  
  private boolean U(int paramInt) {
    if (this.k.isEnabled() && this.k.isTouchExplorationEnabled()) {
      int i = this.n;
      if (i != paramInt) {
        if (i != Integer.MIN_VALUE)
          n(i); 
        this.n = paramInt;
        this.l.invalidate();
        W(paramInt, 32768);
        return true;
      } 
    } 
    return false;
  }
  
  private void X(int paramInt) {
    int i = this.p;
    if (i == paramInt)
      return; 
    this.p = paramInt;
    W(paramInt, 128);
    W(i, 256);
  }
  
  private boolean n(int paramInt) {
    if (this.n == paramInt) {
      this.n = Integer.MIN_VALUE;
      this.l.invalidate();
      W(paramInt, 65536);
      return true;
    } 
    return false;
  }
  
  private boolean p() {
    boolean bool;
    int i = this.o;
    if (i != Integer.MIN_VALUE && L(i, 16, null)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private AccessibilityEvent q(int paramInt1, int paramInt2) {
    return (paramInt1 != -1) ? r(paramInt1, paramInt2) : s(paramInt2);
  }
  
  private AccessibilityEvent r(int paramInt1, int paramInt2) {
    AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain(paramInt2);
    b.h.k.f0.c c1 = J(paramInt1);
    accessibilityEvent.getText().add(c1.x());
    accessibilityEvent.setContentDescription(c1.r());
    accessibilityEvent.setScrollable(c1.K());
    accessibilityEvent.setPassword(c1.J());
    accessibilityEvent.setEnabled(c1.F());
    accessibilityEvent.setChecked(c1.D());
    N(paramInt1, accessibilityEvent);
    if (!accessibilityEvent.getText().isEmpty() || accessibilityEvent.getContentDescription() != null) {
      accessibilityEvent.setClassName(c1.p());
      e.c((AccessibilityRecord)accessibilityEvent, this.l, paramInt1);
      accessibilityEvent.setPackageName(this.l.getContext().getPackageName());
      return accessibilityEvent;
    } 
    throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
  }
  
  private AccessibilityEvent s(int paramInt) {
    AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain(paramInt);
    this.l.onInitializeAccessibilityEvent(accessibilityEvent);
    return accessibilityEvent;
  }
  
  private b.h.k.f0.c t(int paramInt) {
    b.h.k.f0.c c1 = b.h.k.f0.c.O();
    c1.h0(true);
    c1.j0(true);
    c1.c0("android.view.View");
    Rect rect = d;
    c1.X(rect);
    c1.Y(rect);
    c1.s0(this.l);
    P(paramInt, c1);
    if (c1.x() != null || c1.r() != null) {
      c1.m(this.h);
      if (!this.h.equals(rect)) {
        int i = c1.k();
        if ((i & 0x40) == 0) {
          if ((i & 0x80) == 0) {
            boolean bool;
            c1.q0(this.l.getContext().getPackageName());
            c1.B0(this.l, paramInt);
            if (this.n == paramInt) {
              c1.V(true);
              c1.a(128);
            } else {
              c1.V(false);
              c1.a(64);
            } 
            if (this.o == paramInt) {
              bool = true;
            } else {
              bool = false;
            } 
            if (bool) {
              c1.a(2);
            } else if (c1.G()) {
              c1.a(1);
            } 
            c1.k0(bool);
            this.l.getLocationOnScreen(this.j);
            c1.n(this.g);
            if (this.g.equals(rect)) {
              c1.m(this.g);
              if (c1.c != -1) {
                b.h.k.f0.c c2 = b.h.k.f0.c.O();
                for (paramInt = c1.c; paramInt != -1; paramInt = c2.c) {
                  c2.t0(this.l, -1);
                  c2.X(d);
                  P(paramInt, c2);
                  c2.m(this.h);
                  Rect rect1 = this.g;
                  rect = this.h;
                  rect1.offset(rect.left, rect.top);
                } 
                c2.S();
              } 
              this.g.offset(this.j[0] - this.l.getScrollX(), this.j[1] - this.l.getScrollY());
            } 
            if (this.l.getLocalVisibleRect(this.i)) {
              this.i.offset(this.j[0] - this.l.getScrollX(), this.j[1] - this.l.getScrollY());
              if (this.g.intersect(this.i)) {
                c1.Y(this.g);
                if (G(this.g))
                  c1.F0(true); 
              } 
            } 
            return c1;
          } 
          throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        } 
        throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
      } 
      RuntimeException runtimeException = new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
      throw runtimeException;
    } 
    throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
  }
  
  private b.h.k.f0.c u() {
    b.h.k.f0.c c1 = b.h.k.f0.c.P(this.l);
    w.d0(this.l, c1);
    ArrayList<Integer> arrayList = new ArrayList();
    C(arrayList);
    if (c1.o() <= 0 || arrayList.size() <= 0) {
      byte b1 = 0;
      int i = arrayList.size();
      while (b1 < i) {
        c1.d(this.l, ((Integer)arrayList.get(b1)).intValue());
        b1++;
      } 
      return c1;
    } 
    throw new RuntimeException("Views cannot have both real and virtual children");
  }
  
  private h<b.h.k.f0.c> y() {
    ArrayList<Integer> arrayList = new ArrayList();
    C(arrayList);
    h<b.h.k.f0.c> h = new h();
    for (byte b1 = 0; b1 < arrayList.size(); b1++)
      h.n(b1, t(b1)); 
    return h;
  }
  
  private void z(int paramInt, Rect paramRect) {
    J(paramInt).m(paramRect);
  }
  
  public final int A() {
    return this.o;
  }
  
  protected abstract int B(float paramFloat1, float paramFloat2);
  
  protected abstract void C(List<Integer> paramList);
  
  public final void E(int paramInt) {
    F(paramInt, 0);
  }
  
  public final void F(int paramInt1, int paramInt2) {
    if (paramInt1 != Integer.MIN_VALUE && this.k.isEnabled()) {
      ViewParent viewParent = this.l.getParent();
      if (viewParent != null) {
        AccessibilityEvent accessibilityEvent = q(paramInt1, 2048);
        b.h.k.f0.b.b(accessibilityEvent, paramInt2);
        z.h(viewParent, this.l, accessibilityEvent);
      } 
    } 
  }
  
  b.h.k.f0.c J(int paramInt) {
    return (paramInt == -1) ? u() : t(paramInt);
  }
  
  public final void K(boolean paramBoolean, int paramInt, Rect paramRect) {
    int i = this.o;
    if (i != Integer.MIN_VALUE)
      o(i); 
    if (paramBoolean)
      I(paramInt, paramRect); 
  }
  
  protected abstract boolean L(int paramInt1, int paramInt2, Bundle paramBundle);
  
  protected void M(AccessibilityEvent paramAccessibilityEvent) {}
  
  protected void N(int paramInt, AccessibilityEvent paramAccessibilityEvent) {}
  
  protected void O(b.h.k.f0.c paramc) {}
  
  protected abstract void P(int paramInt, b.h.k.f0.c paramc);
  
  protected void Q(int paramInt, boolean paramBoolean) {}
  
  boolean R(int paramInt1, int paramInt2, Bundle paramBundle) {
    return (paramInt1 != -1) ? S(paramInt1, paramInt2, paramBundle) : T(paramInt2, paramBundle);
  }
  
  public final boolean V(int paramInt) {
    if (!this.l.isFocused() && !this.l.requestFocus())
      return false; 
    int i = this.o;
    if (i == paramInt)
      return false; 
    if (i != Integer.MIN_VALUE)
      o(i); 
    this.o = paramInt;
    Q(paramInt, true);
    W(paramInt, 8);
    return true;
  }
  
  public final boolean W(int paramInt1, int paramInt2) {
    if (paramInt1 == Integer.MIN_VALUE || !this.k.isEnabled())
      return false; 
    ViewParent viewParent = this.l.getParent();
    if (viewParent == null)
      return false; 
    AccessibilityEvent accessibilityEvent = q(paramInt1, paramInt2);
    return z.h(viewParent, this.l, accessibilityEvent);
  }
  
  public d b(View paramView) {
    if (this.m == null)
      this.m = new c(this); 
    return this.m;
  }
  
  public void f(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    super.f(paramView, paramAccessibilityEvent);
    M(paramAccessibilityEvent);
  }
  
  public void g(View paramView, b.h.k.f0.c paramc) {
    super.g(paramView, paramc);
    O(paramc);
  }
  
  public final boolean o(int paramInt) {
    if (this.o != paramInt)
      return false; 
    this.o = Integer.MIN_VALUE;
    Q(paramInt, false);
    W(paramInt, 8);
    return true;
  }
  
  public final boolean v(MotionEvent paramMotionEvent) {
    boolean bool = this.k.isEnabled();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (bool)
      if (!this.k.isTouchExplorationEnabled()) {
        bool2 = bool1;
      } else {
        int i = paramMotionEvent.getAction();
        if (i != 7 && i != 9) {
          if (i != 10)
            return false; 
          if (this.p != Integer.MIN_VALUE) {
            X(-2147483648);
            return true;
          } 
          return false;
        } 
        i = B(paramMotionEvent.getX(), paramMotionEvent.getY());
        X(i);
        bool2 = bool1;
        if (i != Integer.MIN_VALUE)
          bool2 = true; 
      }  
    return bool2;
  }
  
  public final boolean w(KeyEvent paramKeyEvent) {
    int i = paramKeyEvent.getAction();
    boolean bool1 = false;
    byte b1 = 0;
    boolean bool2 = bool1;
    if (i != 1) {
      i = paramKeyEvent.getKeyCode();
      if (i != 61) {
        if (i != 66)
          switch (i) {
            default:
              return bool1;
            case 19:
            case 20:
            case 21:
            case 22:
              bool2 = bool1;
              if (paramKeyEvent.hasNoModifiers()) {
                i = H(i);
                int j = paramKeyEvent.getRepeatCount();
                for (bool2 = false; b1 < j + 1 && I(i, null); bool2 = true)
                  b1++; 
              } 
              return bool2;
            case 23:
              break;
          }  
        bool2 = bool1;
        if (paramKeyEvent.hasNoModifiers()) {
          bool2 = bool1;
          if (paramKeyEvent.getRepeatCount() == 0) {
            p();
            bool2 = true;
          } 
        } 
      } else if (paramKeyEvent.hasNoModifiers()) {
        bool2 = I(2, null);
      } else {
        bool2 = bool1;
        if (paramKeyEvent.hasModifiers(1))
          bool2 = I(1, null); 
      } 
    } 
    return bool2;
  }
  
  public final int x() {
    return this.n;
  }
  
  static final class a implements b.a<b.h.k.f0.c> {
    public void b(b.h.k.f0.c param1c, Rect param1Rect) {
      param1c.m(param1Rect);
    }
  }
  
  static final class b implements b.b<h<b.h.k.f0.c>, b.h.k.f0.c> {
    public b.h.k.f0.c c(h<b.h.k.f0.c> param1h, int param1Int) {
      return (b.h.k.f0.c)param1h.s(param1Int);
    }
    
    public int d(h<b.h.k.f0.c> param1h) {
      return param1h.r();
    }
  }
  
  private class c extends d {
    c(a this$0) {}
    
    public b.h.k.f0.c b(int param1Int) {
      return b.h.k.f0.c.Q(this.b.J(param1Int));
    }
    
    public b.h.k.f0.c d(int param1Int) {
      if (param1Int == 2) {
        param1Int = this.b.n;
      } else {
        param1Int = this.b.o;
      } 
      return (param1Int == Integer.MIN_VALUE) ? null : b(param1Int);
    }
    
    public boolean f(int param1Int1, int param1Int2, Bundle param1Bundle) {
      return this.b.R(param1Int1, param1Int2, param1Bundle);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/j/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */