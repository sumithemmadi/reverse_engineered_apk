package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import b.h.k.e0;
import b.h.k.q;
import b.h.k.w;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
  static final int[] b = new int[] { 16842931 };
  
  private static final Comparator<f> c = new a();
  
  private static final Interpolator d = new b();
  
  private static final l e = new l();
  
  private boolean A;
  
  private boolean B;
  
  private int C = 1;
  
  private boolean D;
  
  private boolean E;
  
  private int F;
  
  private int G;
  
  private int H;
  
  private float I;
  
  private float J;
  
  private float K;
  
  private float L;
  
  private int M = -1;
  
  private VelocityTracker N;
  
  private int O;
  
  private int P;
  
  private int Q;
  
  private int R;
  
  private boolean S;
  
  private long T;
  
  private EdgeEffect U;
  
  private EdgeEffect V;
  
  private boolean W = true;
  
  private boolean a0 = false;
  
  private boolean b0;
  
  private int c0;
  
  private List<i> d0;
  
  private i e0;
  
  private int f;
  
  private i f0;
  
  private final ArrayList<f> g = new ArrayList<f>();
  
  private List<h> g0;
  
  private final f h = new f();
  
  private j h0;
  
  private final Rect i = new Rect();
  
  private int i0;
  
  a j;
  
  private int j0;
  
  int k;
  
  private ArrayList<View> k0;
  
  private int l = -1;
  
  private final Runnable l0 = new c(this);
  
  private Parcelable m = null;
  
  private int m0 = 0;
  
  private ClassLoader n = null;
  
  private Scroller o;
  
  private boolean p;
  
  private k q;
  
  private int r;
  
  private Drawable s;
  
  private int t;
  
  private int u;
  
  private float v = -3.4028235E38F;
  
  private float w = Float.MAX_VALUE;
  
  private int x;
  
  private int y;
  
  private boolean z;
  
  public ViewPager(Context paramContext) {
    super(paramContext);
    y();
  }
  
  public ViewPager(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    y();
  }
  
  private boolean B(float paramFloat1, float paramFloat2) {
    boolean bool;
    if ((paramFloat1 < this.G && paramFloat2 > 0.0F) || (paramFloat1 > (getWidth() - this.G) && paramFloat2 < 0.0F)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void D(MotionEvent paramMotionEvent) {
    int m = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(m) == this.M) {
      if (m == 0) {
        m = 1;
      } else {
        m = 0;
      } 
      this.I = paramMotionEvent.getX(m);
      this.M = paramMotionEvent.getPointerId(m);
      VelocityTracker velocityTracker = this.N;
      if (velocityTracker != null)
        velocityTracker.clear(); 
    } 
  }
  
  private boolean G(int paramInt) {
    if (this.g.size() == 0) {
      if (this.W)
        return false; 
      this.b0 = false;
      C(0, 0.0F, 0);
      if (this.b0)
        return false; 
      throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    } 
    f f1 = w();
    int m = getClientWidth();
    int n = this.r;
    float f2 = n;
    float f3 = m;
    f2 /= f3;
    int i1 = f1.b;
    f3 = (paramInt / f3 - f1.e) / (f1.d + f2);
    paramInt = (int)((m + n) * f3);
    this.b0 = false;
    C(i1, f3, paramInt);
    if (this.b0)
      return true; 
    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
  }
  
  private boolean H(float paramFloat) {
    boolean bool4;
    float f1 = this.I;
    this.I = paramFloat;
    float f2 = getScrollX() + f1 - paramFloat;
    float f3 = getClientWidth();
    paramFloat = this.v * f3;
    f1 = this.w * f3;
    ArrayList<f> arrayList1 = this.g;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    f f4 = arrayList1.get(0);
    ArrayList<f> arrayList2 = this.g;
    f f5 = arrayList2.get(arrayList2.size() - 1);
    if (f4.b != 0) {
      paramFloat = f4.e * f3;
      m = 0;
    } else {
      m = 1;
    } 
    if (f5.b != this.j.e() - 1) {
      f1 = f5.e * f3;
      bool4 = false;
    } else {
      bool4 = true;
    } 
    if (f2 < paramFloat) {
      if (m) {
        this.U.onPull(Math.abs(paramFloat - f2) / f3);
        bool3 = true;
      } 
    } else {
      bool3 = bool2;
      paramFloat = f2;
      if (f2 > f1) {
        bool3 = bool1;
        if (bool4) {
          this.V.onPull(Math.abs(f2 - f1) / f3);
          bool3 = true;
        } 
        paramFloat = f1;
      } 
    } 
    f1 = this.I;
    int m = (int)paramFloat;
    this.I = f1 + paramFloat - m;
    scrollTo(m, getScrollY());
    G(m);
    return bool3;
  }
  
  private void K(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt2 > 0 && !this.g.isEmpty()) {
      if (!this.o.isFinished()) {
        this.o.setFinalX(getCurrentItem() * getClientWidth());
      } else {
        int m = getPaddingLeft();
        int n = getPaddingRight();
        int i1 = getPaddingLeft();
        int i2 = getPaddingRight();
        scrollTo((int)(getScrollX() / (paramInt2 - i1 - i2 + paramInt4) * (paramInt1 - m - n + paramInt3)), getScrollY());
      } 
    } else {
      float f2;
      f f1 = x(this.k);
      if (f1 != null) {
        f2 = Math.min(f1.e, this.w);
      } else {
        f2 = 0.0F;
      } 
      paramInt1 = (int)(f2 * (paramInt1 - getPaddingLeft() - getPaddingRight()));
      if (paramInt1 != getScrollX()) {
        h(false);
        scrollTo(paramInt1, getScrollY());
      } 
    } 
  }
  
  private void L() {
    for (int m = 0; m < getChildCount(); m = n + 1) {
      int n = m;
      if (!((LayoutParams)getChildAt(m).getLayoutParams()).a) {
        removeViewAt(m);
        n = m - 1;
      } 
    } 
  }
  
  private void O(boolean paramBoolean) {
    ViewParent viewParent = getParent();
    if (viewParent != null)
      viewParent.requestDisallowInterceptTouchEvent(paramBoolean); 
  }
  
  private boolean P() {
    this.M = -1;
    p();
    this.U.onRelease();
    this.V.onRelease();
    return (this.U.isFinished() || this.V.isFinished());
  }
  
  private void Q(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2) {
    boolean bool;
    f f1 = x(paramInt1);
    if (f1 != null) {
      bool = (int)(getClientWidth() * Math.max(this.v, Math.min(f1.e, this.w)));
    } else {
      bool = false;
    } 
    if (paramBoolean1) {
      U(bool, 0, paramInt2);
      if (paramBoolean2)
        l(paramInt1); 
    } else {
      if (paramBoolean2)
        l(paramInt1); 
      h(false);
      scrollTo(bool, 0);
      G(bool);
    } 
  }
  
  private void V() {
    if (this.j0 != 0) {
      ArrayList<View> arrayList = this.k0;
      if (arrayList == null) {
        this.k0 = new ArrayList<View>();
      } else {
        arrayList.clear();
      } 
      int m = getChildCount();
      for (byte b = 0; b < m; b++) {
        View view = getChildAt(b);
        this.k0.add(view);
      } 
      Collections.sort(this.k0, e);
    } 
  }
  
  private void f(f paramf1, int paramInt, f paramf2) {
    float f1;
    float f3;
    int m = this.j.e();
    int n = getClientWidth();
    if (n > 0) {
      f1 = this.r / n;
    } else {
      f1 = 0.0F;
    } 
    if (paramf2 != null) {
      n = paramf2.b;
      int i3 = paramf1.b;
      if (n < i3) {
        float f4 = paramf2.e + paramf2.d + f1;
        n++;
        i3 = 0;
        while (n <= paramf1.b && i3 < this.g.size()) {
          int i4;
          paramf2 = this.g.get(i3);
          while (true) {
            i4 = n;
            f3 = f4;
            if (n > paramf2.b) {
              i4 = n;
              f3 = f4;
              if (i3 < this.g.size() - 1) {
                paramf2 = this.g.get(++i3);
                continue;
              } 
            } 
            break;
          } 
          while (i4 < paramf2.b) {
            f3 += this.j.h(i4) + f1;
            i4++;
          } 
          paramf2.e = f3;
          f4 = f3 + paramf2.d + f1;
          n = i4 + 1;
        } 
      } else if (n > i3) {
        i3 = this.g.size() - 1;
        float f4 = paramf2.e;
        while (--n >= paramf1.b && i3 >= 0) {
          int i4;
          paramf2 = this.g.get(i3);
          while (true) {
            i4 = n;
            f3 = f4;
            if (n < paramf2.b) {
              i4 = n;
              f3 = f4;
              if (i3 > 0) {
                paramf2 = this.g.get(--i3);
                continue;
              } 
            } 
            break;
          } 
          while (i4 > paramf2.b) {
            f3 -= this.j.h(i4) + f1;
            i4--;
          } 
          f4 = f3 - paramf2.d + f1;
          paramf2.e = f4;
          n = i4 - 1;
        } 
      } 
    } 
    int i2 = this.g.size();
    float f2 = paramf1.e;
    int i1 = paramf1.b;
    n = i1 - 1;
    if (i1 == 0) {
      f3 = f2;
    } else {
      f3 = -3.4028235E38F;
    } 
    this.v = f3;
    if (i1 == --m) {
      f3 = paramf1.d + f2 - 1.0F;
    } else {
      f3 = Float.MAX_VALUE;
    } 
    this.w = f3;
    i1 = paramInt - 1;
    while (i1 >= 0) {
      paramf2 = this.g.get(i1);
      while (true) {
        int i3 = paramf2.b;
        if (n > i3) {
          f2 -= this.j.h(n) + f1;
          n--;
          continue;
        } 
        f2 -= paramf2.d + f1;
        paramf2.e = f2;
        if (i3 == 0)
          this.v = f2; 
        break;
      } 
      i1--;
      n--;
    } 
    f2 = paramf1.e + paramf1.d + f1;
    i1 = paramf1.b + 1;
    n = paramInt + 1;
    for (paramInt = i1; n < i2; paramInt++) {
      paramf1 = this.g.get(n);
      while (true) {
        i1 = paramf1.b;
        if (paramInt < i1) {
          f2 += this.j.h(paramInt) + f1;
          paramInt++;
          continue;
        } 
        if (i1 == m)
          this.w = paramf1.d + f2 - 1.0F; 
        break;
      } 
      paramf1.e = f2;
      f2 += paramf1.d + f1;
      n++;
    } 
    this.a0 = false;
  }
  
  private int getClientWidth() {
    return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
  }
  
  private void h(boolean paramBoolean) {
    boolean bool;
    if (this.m0 == 2) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      setScrollingCacheEnabled(false);
      if ((this.o.isFinished() ^ true) != 0) {
        this.o.abortAnimation();
        int m = getScrollX();
        int n = getScrollY();
        int i1 = this.o.getCurrX();
        int i2 = this.o.getCurrY();
        if (m != i1 || n != i2) {
          scrollTo(i1, i2);
          if (i1 != m)
            G(i1); 
        } 
      } 
    } 
    this.B = false;
    for (byte b = 0; b < this.g.size(); b++) {
      f f1 = this.g.get(b);
      if (f1.c) {
        f1.c = false;
        bool = true;
      } 
    } 
    if (bool)
      if (paramBoolean) {
        w.j0((View)this, this.l0);
      } else {
        this.l0.run();
      }  
  }
  
  private int j(int paramInt1, float paramFloat, int paramInt2, int paramInt3) {
    if (Math.abs(paramInt3) > this.Q && Math.abs(paramInt2) > this.O) {
      if (paramInt2 <= 0)
        paramInt1++; 
    } else {
      float f1;
      if (paramInt1 >= this.k) {
        f1 = 0.4F;
      } else {
        f1 = 0.6F;
      } 
      paramInt1 += (int)(paramFloat + f1);
    } 
    paramInt2 = paramInt1;
    if (this.g.size() > 0) {
      f f1 = this.g.get(0);
      ArrayList<f> arrayList = this.g;
      f f2 = arrayList.get(arrayList.size() - 1);
      paramInt2 = Math.max(f1.b, Math.min(paramInt1, f2.b));
    } 
    return paramInt2;
  }
  
  private void k(int paramInt1, float paramFloat, int paramInt2) {
    i i2 = this.e0;
    if (i2 != null)
      i2.a(paramInt1, paramFloat, paramInt2); 
    List<i> list = this.d0;
    if (list != null) {
      byte b = 0;
      int m = list.size();
      while (b < m) {
        i i3 = this.d0.get(b);
        if (i3 != null)
          i3.a(paramInt1, paramFloat, paramInt2); 
        b++;
      } 
    } 
    i i1 = this.f0;
    if (i1 != null)
      i1.a(paramInt1, paramFloat, paramInt2); 
  }
  
  private void l(int paramInt) {
    i i2 = this.e0;
    if (i2 != null)
      i2.d(paramInt); 
    List<i> list = this.d0;
    if (list != null) {
      byte b = 0;
      int m = list.size();
      while (b < m) {
        i i3 = this.d0.get(b);
        if (i3 != null)
          i3.d(paramInt); 
        b++;
      } 
    } 
    i i1 = this.f0;
    if (i1 != null)
      i1.d(paramInt); 
  }
  
  private void m(int paramInt) {
    i i2 = this.e0;
    if (i2 != null)
      i2.c(paramInt); 
    List<i> list = this.d0;
    if (list != null) {
      byte b = 0;
      int m = list.size();
      while (b < m) {
        i i3 = this.d0.get(b);
        if (i3 != null)
          i3.c(paramInt); 
        b++;
      } 
    } 
    i i1 = this.f0;
    if (i1 != null)
      i1.c(paramInt); 
  }
  
  private void o(boolean paramBoolean) {
    int m = getChildCount();
    for (byte b = 0; b < m; b++) {
      boolean bool;
      if (paramBoolean) {
        bool = this.i0;
      } else {
        bool = false;
      } 
      getChildAt(b).setLayerType(bool, null);
    } 
  }
  
  private void p() {
    this.D = false;
    this.E = false;
    VelocityTracker velocityTracker = this.N;
    if (velocityTracker != null) {
      velocityTracker.recycle();
      this.N = null;
    } 
  }
  
  private void setScrollingCacheEnabled(boolean paramBoolean) {
    if (this.A != paramBoolean)
      this.A = paramBoolean; 
  }
  
  private Rect t(Rect paramRect, View paramView) {
    Rect rect = paramRect;
    if (paramRect == null)
      rect = new Rect(); 
    if (paramView == null) {
      rect.set(0, 0, 0, 0);
      return rect;
    } 
    rect.left = paramView.getLeft();
    rect.right = paramView.getRight();
    rect.top = paramView.getTop();
    rect.bottom = paramView.getBottom();
    ViewParent viewParent = paramView.getParent();
    while (viewParent instanceof ViewGroup && viewParent != this) {
      ViewGroup viewGroup = (ViewGroup)viewParent;
      rect.left += viewGroup.getLeft();
      rect.right += viewGroup.getRight();
      rect.top += viewGroup.getTop();
      rect.bottom += viewGroup.getBottom();
      ViewParent viewParent1 = viewGroup.getParent();
    } 
    return rect;
  }
  
  private f w() {
    float f2;
    float f3;
    int m = getClientWidth();
    float f1 = 0.0F;
    if (m > 0) {
      f2 = getScrollX() / m;
    } else {
      f2 = 0.0F;
    } 
    if (m > 0) {
      f3 = this.r / m;
    } else {
      f3 = 0.0F;
    } 
    f f4 = null;
    float f5 = 0.0F;
    int n = -1;
    m = 0;
    boolean bool = true;
    while (m < this.g.size()) {
      f f6 = this.g.get(m);
      int i1 = m;
      f f7 = f6;
      if (!bool) {
        int i2 = f6.b;
        n++;
        i1 = m;
        f7 = f6;
        if (i2 != n) {
          f7 = this.h;
          f7.e = f1 + f5 + f3;
          f7.b = n;
          f7.d = this.j.h(n);
          i1 = m - 1;
        } 
      } 
      f1 = f7.e;
      f5 = f7.d;
      if (bool || f2 >= f1) {
        if (f2 < f5 + f1 + f3 || i1 == this.g.size() - 1)
          return f7; 
        n = f7.b;
        f5 = f7.d;
        m = i1 + 1;
        bool = false;
        f4 = f7;
        continue;
      } 
      return f4;
    } 
    return f4;
  }
  
  private static boolean z(View paramView) {
    boolean bool;
    if (paramView.getClass().getAnnotation(e.class) != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean A() {
    return this.S;
  }
  
  protected void C(int paramInt1, float paramFloat, int paramInt2) {
    int m = this.c0;
    boolean bool = false;
    if (m > 0) {
      int n = getScrollX();
      m = getPaddingLeft();
      int i1 = getPaddingRight();
      int i2 = getWidth();
      int i3 = getChildCount();
      for (byte b = 0; b < i3; b++) {
        View view = getChildAt(b);
        LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
        if (layoutParams.a) {
          int i4 = layoutParams.b & 0x7;
          if (i4 != 1) {
            if (i4 != 3) {
              if (i4 != 5) {
                int i5 = m;
                i4 = m;
                m = i5;
              } else {
                i4 = i2 - i1 - view.getMeasuredWidth();
                i1 += view.getMeasuredWidth();
              } 
            } else {
              int i5 = view.getWidth() + m;
              i4 = m;
              m = i5;
            } 
          } else {
            i4 = Math.max((i2 - view.getMeasuredWidth()) / 2, m);
          } 
          i4 = i4 + n - view.getLeft();
          if (i4 != 0)
            view.offsetLeftAndRight(i4); 
        } 
      } 
    } 
    k(paramInt1, paramFloat, paramInt2);
    if (this.h0 != null) {
      m = getScrollX();
      paramInt2 = getChildCount();
      for (paramInt1 = bool; paramInt1 < paramInt2; paramInt1++) {
        View view = getChildAt(paramInt1);
        if (!((LayoutParams)view.getLayoutParams()).a) {
          paramFloat = (view.getLeft() - m) / getClientWidth();
          this.h0.a(view, paramFloat);
        } 
      } 
    } 
    this.b0 = true;
  }
  
  boolean E() {
    int m = this.k;
    if (m > 0) {
      setCurrentItem(m - 1, true);
      return true;
    } 
    return false;
  }
  
  boolean F() {
    a a1 = this.j;
    if (a1 != null && this.k < a1.e() - 1) {
      setCurrentItem(this.k + 1, true);
      return true;
    } 
    return false;
  }
  
  void I() {
    J(this.k);
  }
  
  void J(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield k : I
    //   4: istore_2
    //   5: iload_2
    //   6: iload_1
    //   7: if_icmpeq -> 24
    //   10: aload_0
    //   11: iload_2
    //   12: invokevirtual x : (I)Landroidx/viewpager/widget/ViewPager$f;
    //   15: astore_3
    //   16: aload_0
    //   17: iload_1
    //   18: putfield k : I
    //   21: goto -> 26
    //   24: aconst_null
    //   25: astore_3
    //   26: aload_0
    //   27: getfield j : Landroidx/viewpager/widget/a;
    //   30: ifnonnull -> 38
    //   33: aload_0
    //   34: invokespecial V : ()V
    //   37: return
    //   38: aload_0
    //   39: getfield B : Z
    //   42: ifeq -> 50
    //   45: aload_0
    //   46: invokespecial V : ()V
    //   49: return
    //   50: aload_0
    //   51: invokevirtual getWindowToken : ()Landroid/os/IBinder;
    //   54: ifnonnull -> 58
    //   57: return
    //   58: aload_0
    //   59: getfield j : Landroidx/viewpager/widget/a;
    //   62: aload_0
    //   63: invokevirtual t : (Landroid/view/ViewGroup;)V
    //   66: aload_0
    //   67: getfield C : I
    //   70: istore_1
    //   71: iconst_0
    //   72: aload_0
    //   73: getfield k : I
    //   76: iload_1
    //   77: isub
    //   78: invokestatic max : (II)I
    //   81: istore #4
    //   83: aload_0
    //   84: getfield j : Landroidx/viewpager/widget/a;
    //   87: invokevirtual e : ()I
    //   90: istore #5
    //   92: iload #5
    //   94: iconst_1
    //   95: isub
    //   96: aload_0
    //   97: getfield k : I
    //   100: iload_1
    //   101: iadd
    //   102: invokestatic min : (II)I
    //   105: istore #6
    //   107: iload #5
    //   109: aload_0
    //   110: getfield f : I
    //   113: if_icmpne -> 1192
    //   116: iconst_0
    //   117: istore_1
    //   118: iload_1
    //   119: aload_0
    //   120: getfield g : Ljava/util/ArrayList;
    //   123: invokevirtual size : ()I
    //   126: if_icmpge -> 175
    //   129: aload_0
    //   130: getfield g : Ljava/util/ArrayList;
    //   133: iload_1
    //   134: invokevirtual get : (I)Ljava/lang/Object;
    //   137: checkcast androidx/viewpager/widget/ViewPager$f
    //   140: astore #7
    //   142: aload #7
    //   144: getfield b : I
    //   147: istore_2
    //   148: aload_0
    //   149: getfield k : I
    //   152: istore #8
    //   154: iload_2
    //   155: iload #8
    //   157: if_icmplt -> 169
    //   160: iload_2
    //   161: iload #8
    //   163: if_icmpne -> 175
    //   166: goto -> 178
    //   169: iinc #1, 1
    //   172: goto -> 118
    //   175: aconst_null
    //   176: astore #7
    //   178: aload #7
    //   180: astore #9
    //   182: aload #7
    //   184: ifnonnull -> 207
    //   187: aload #7
    //   189: astore #9
    //   191: iload #5
    //   193: ifle -> 207
    //   196: aload_0
    //   197: aload_0
    //   198: getfield k : I
    //   201: iload_1
    //   202: invokevirtual a : (II)Landroidx/viewpager/widget/ViewPager$f;
    //   205: astore #9
    //   207: aload #9
    //   209: ifnull -> 988
    //   212: iload_1
    //   213: iconst_1
    //   214: isub
    //   215: istore_2
    //   216: iload_2
    //   217: iflt -> 236
    //   220: aload_0
    //   221: getfield g : Ljava/util/ArrayList;
    //   224: iload_2
    //   225: invokevirtual get : (I)Ljava/lang/Object;
    //   228: checkcast androidx/viewpager/widget/ViewPager$f
    //   231: astore #7
    //   233: goto -> 239
    //   236: aconst_null
    //   237: astore #7
    //   239: aload_0
    //   240: invokespecial getClientWidth : ()I
    //   243: istore #10
    //   245: iload #10
    //   247: ifgt -> 256
    //   250: fconst_0
    //   251: fstore #11
    //   253: goto -> 275
    //   256: fconst_2
    //   257: aload #9
    //   259: getfield d : F
    //   262: fsub
    //   263: aload_0
    //   264: invokevirtual getPaddingLeft : ()I
    //   267: i2f
    //   268: iload #10
    //   270: i2f
    //   271: fdiv
    //   272: fadd
    //   273: fstore #11
    //   275: aload_0
    //   276: getfield k : I
    //   279: iconst_1
    //   280: isub
    //   281: istore #12
    //   283: fconst_0
    //   284: fstore #13
    //   286: aload #7
    //   288: astore #14
    //   290: iload #12
    //   292: iflt -> 579
    //   295: fload #13
    //   297: fload #11
    //   299: fcmpl
    //   300: iflt -> 428
    //   303: iload #12
    //   305: iload #4
    //   307: if_icmpge -> 428
    //   310: aload #14
    //   312: ifnonnull -> 318
    //   315: goto -> 579
    //   318: iload_1
    //   319: istore #15
    //   321: iload_2
    //   322: istore #8
    //   324: aload #14
    //   326: astore #7
    //   328: fload #13
    //   330: fstore #16
    //   332: iload #12
    //   334: aload #14
    //   336: getfield b : I
    //   339: if_icmpne -> 559
    //   342: iload_1
    //   343: istore #15
    //   345: iload_2
    //   346: istore #8
    //   348: aload #14
    //   350: astore #7
    //   352: fload #13
    //   354: fstore #16
    //   356: aload #14
    //   358: getfield c : Z
    //   361: ifne -> 559
    //   364: aload_0
    //   365: getfield g : Ljava/util/ArrayList;
    //   368: iload_2
    //   369: invokevirtual remove : (I)Ljava/lang/Object;
    //   372: pop
    //   373: aload_0
    //   374: getfield j : Landroidx/viewpager/widget/a;
    //   377: aload_0
    //   378: iload #12
    //   380: aload #14
    //   382: getfield a : Ljava/lang/Object;
    //   385: invokevirtual b : (Landroid/view/ViewGroup;ILjava/lang/Object;)V
    //   388: iinc #2, -1
    //   391: iinc #1, -1
    //   394: iload_1
    //   395: istore #8
    //   397: iload_2
    //   398: istore #15
    //   400: fload #13
    //   402: fstore #16
    //   404: iload_2
    //   405: iflt -> 544
    //   408: aload_0
    //   409: getfield g : Ljava/util/ArrayList;
    //   412: iload_2
    //   413: invokevirtual get : (I)Ljava/lang/Object;
    //   416: checkcast androidx/viewpager/widget/ViewPager$f
    //   419: astore #7
    //   421: fload #13
    //   423: fstore #16
    //   425: goto -> 553
    //   428: aload #14
    //   430: ifnull -> 490
    //   433: iload #12
    //   435: aload #14
    //   437: getfield b : I
    //   440: if_icmpne -> 490
    //   443: fload #13
    //   445: aload #14
    //   447: getfield d : F
    //   450: fadd
    //   451: fstore #13
    //   453: iinc #2, -1
    //   456: iload_1
    //   457: istore #8
    //   459: iload_2
    //   460: istore #15
    //   462: fload #13
    //   464: fstore #16
    //   466: iload_2
    //   467: iflt -> 544
    //   470: aload_0
    //   471: getfield g : Ljava/util/ArrayList;
    //   474: iload_2
    //   475: invokevirtual get : (I)Ljava/lang/Object;
    //   478: checkcast androidx/viewpager/widget/ViewPager$f
    //   481: astore #7
    //   483: fload #13
    //   485: fstore #16
    //   487: goto -> 553
    //   490: fload #13
    //   492: aload_0
    //   493: iload #12
    //   495: iload_2
    //   496: iconst_1
    //   497: iadd
    //   498: invokevirtual a : (II)Landroidx/viewpager/widget/ViewPager$f;
    //   501: getfield d : F
    //   504: fadd
    //   505: fstore #13
    //   507: iinc #1, 1
    //   510: iload_1
    //   511: istore #8
    //   513: iload_2
    //   514: istore #15
    //   516: fload #13
    //   518: fstore #16
    //   520: iload_2
    //   521: iflt -> 544
    //   524: aload_0
    //   525: getfield g : Ljava/util/ArrayList;
    //   528: iload_2
    //   529: invokevirtual get : (I)Ljava/lang/Object;
    //   532: checkcast androidx/viewpager/widget/ViewPager$f
    //   535: astore #7
    //   537: fload #13
    //   539: fstore #16
    //   541: goto -> 553
    //   544: aconst_null
    //   545: astore #7
    //   547: iload #15
    //   549: istore_2
    //   550: iload #8
    //   552: istore_1
    //   553: iload_2
    //   554: istore #8
    //   556: iload_1
    //   557: istore #15
    //   559: iinc #12, -1
    //   562: iload #15
    //   564: istore_1
    //   565: iload #8
    //   567: istore_2
    //   568: aload #7
    //   570: astore #14
    //   572: fload #16
    //   574: fstore #13
    //   576: goto -> 290
    //   579: aload #9
    //   581: getfield d : F
    //   584: fstore #13
    //   586: iload_1
    //   587: iconst_1
    //   588: iadd
    //   589: istore #8
    //   591: fload #13
    //   593: fconst_2
    //   594: fcmpg
    //   595: ifge -> 963
    //   598: iload #8
    //   600: aload_0
    //   601: getfield g : Ljava/util/ArrayList;
    //   604: invokevirtual size : ()I
    //   607: if_icmpge -> 627
    //   610: aload_0
    //   611: getfield g : Ljava/util/ArrayList;
    //   614: iload #8
    //   616: invokevirtual get : (I)Ljava/lang/Object;
    //   619: checkcast androidx/viewpager/widget/ViewPager$f
    //   622: astore #7
    //   624: goto -> 630
    //   627: aconst_null
    //   628: astore #7
    //   630: iload #10
    //   632: ifgt -> 641
    //   635: fconst_0
    //   636: fstore #11
    //   638: goto -> 654
    //   641: aload_0
    //   642: invokevirtual getPaddingRight : ()I
    //   645: i2f
    //   646: iload #10
    //   648: i2f
    //   649: fdiv
    //   650: fconst_2
    //   651: fadd
    //   652: fstore #11
    //   654: aload_0
    //   655: getfield k : I
    //   658: istore_2
    //   659: aload #7
    //   661: astore #14
    //   663: iload_2
    //   664: iconst_1
    //   665: iadd
    //   666: istore #15
    //   668: iload #15
    //   670: iload #5
    //   672: if_icmpge -> 963
    //   675: fload #13
    //   677: fload #11
    //   679: fcmpl
    //   680: iflt -> 812
    //   683: iload #15
    //   685: iload #6
    //   687: if_icmple -> 812
    //   690: aload #14
    //   692: ifnonnull -> 698
    //   695: goto -> 963
    //   698: fload #13
    //   700: fstore #16
    //   702: iload #8
    //   704: istore_2
    //   705: aload #14
    //   707: astore #7
    //   709: iload #15
    //   711: aload #14
    //   713: getfield b : I
    //   716: if_icmpne -> 946
    //   719: fload #13
    //   721: fstore #16
    //   723: iload #8
    //   725: istore_2
    //   726: aload #14
    //   728: astore #7
    //   730: aload #14
    //   732: getfield c : Z
    //   735: ifne -> 946
    //   738: aload_0
    //   739: getfield g : Ljava/util/ArrayList;
    //   742: iload #8
    //   744: invokevirtual remove : (I)Ljava/lang/Object;
    //   747: pop
    //   748: aload_0
    //   749: getfield j : Landroidx/viewpager/widget/a;
    //   752: aload_0
    //   753: iload #15
    //   755: aload #14
    //   757: getfield a : Ljava/lang/Object;
    //   760: invokevirtual b : (Landroid/view/ViewGroup;ILjava/lang/Object;)V
    //   763: fload #13
    //   765: fstore #16
    //   767: iload #8
    //   769: istore_2
    //   770: iload #8
    //   772: aload_0
    //   773: getfield g : Ljava/util/ArrayList;
    //   776: invokevirtual size : ()I
    //   779: if_icmpge -> 806
    //   782: aload_0
    //   783: getfield g : Ljava/util/ArrayList;
    //   786: iload #8
    //   788: invokevirtual get : (I)Ljava/lang/Object;
    //   791: checkcast androidx/viewpager/widget/ViewPager$f
    //   794: astore #7
    //   796: fload #13
    //   798: fstore #16
    //   800: iload #8
    //   802: istore_2
    //   803: goto -> 946
    //   806: aconst_null
    //   807: astore #7
    //   809: goto -> 946
    //   812: aload #14
    //   814: ifnull -> 883
    //   817: iload #15
    //   819: aload #14
    //   821: getfield b : I
    //   824: if_icmpne -> 883
    //   827: fload #13
    //   829: aload #14
    //   831: getfield d : F
    //   834: fadd
    //   835: fstore #13
    //   837: iinc #8, 1
    //   840: fload #13
    //   842: fstore #16
    //   844: iload #8
    //   846: istore_2
    //   847: iload #8
    //   849: aload_0
    //   850: getfield g : Ljava/util/ArrayList;
    //   853: invokevirtual size : ()I
    //   856: if_icmpge -> 806
    //   859: aload_0
    //   860: getfield g : Ljava/util/ArrayList;
    //   863: iload #8
    //   865: invokevirtual get : (I)Ljava/lang/Object;
    //   868: checkcast androidx/viewpager/widget/ViewPager$f
    //   871: astore #7
    //   873: fload #13
    //   875: fstore #16
    //   877: iload #8
    //   879: istore_2
    //   880: goto -> 946
    //   883: aload_0
    //   884: iload #15
    //   886: iload #8
    //   888: invokevirtual a : (II)Landroidx/viewpager/widget/ViewPager$f;
    //   891: astore #7
    //   893: iinc #8, 1
    //   896: fload #13
    //   898: aload #7
    //   900: getfield d : F
    //   903: fadd
    //   904: fstore #13
    //   906: fload #13
    //   908: fstore #16
    //   910: iload #8
    //   912: istore_2
    //   913: iload #8
    //   915: aload_0
    //   916: getfield g : Ljava/util/ArrayList;
    //   919: invokevirtual size : ()I
    //   922: if_icmpge -> 806
    //   925: aload_0
    //   926: getfield g : Ljava/util/ArrayList;
    //   929: iload #8
    //   931: invokevirtual get : (I)Ljava/lang/Object;
    //   934: checkcast androidx/viewpager/widget/ViewPager$f
    //   937: astore #7
    //   939: iload #8
    //   941: istore_2
    //   942: fload #13
    //   944: fstore #16
    //   946: fload #16
    //   948: fstore #13
    //   950: iload_2
    //   951: istore #8
    //   953: aload #7
    //   955: astore #14
    //   957: iload #15
    //   959: istore_2
    //   960: goto -> 663
    //   963: aload_0
    //   964: aload #9
    //   966: iload_1
    //   967: aload_3
    //   968: invokespecial f : (Landroidx/viewpager/widget/ViewPager$f;ILandroidx/viewpager/widget/ViewPager$f;)V
    //   971: aload_0
    //   972: getfield j : Landroidx/viewpager/widget/a;
    //   975: aload_0
    //   976: aload_0
    //   977: getfield k : I
    //   980: aload #9
    //   982: getfield a : Ljava/lang/Object;
    //   985: invokevirtual q : (Landroid/view/ViewGroup;ILjava/lang/Object;)V
    //   988: aload_0
    //   989: getfield j : Landroidx/viewpager/widget/a;
    //   992: aload_0
    //   993: invokevirtual d : (Landroid/view/ViewGroup;)V
    //   996: aload_0
    //   997: invokevirtual getChildCount : ()I
    //   1000: istore_2
    //   1001: iconst_0
    //   1002: istore_1
    //   1003: iload_1
    //   1004: iload_2
    //   1005: if_icmpge -> 1081
    //   1008: aload_0
    //   1009: iload_1
    //   1010: invokevirtual getChildAt : (I)Landroid/view/View;
    //   1013: astore_3
    //   1014: aload_3
    //   1015: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1018: checkcast androidx/viewpager/widget/ViewPager$LayoutParams
    //   1021: astore #7
    //   1023: aload #7
    //   1025: iload_1
    //   1026: putfield f : I
    //   1029: aload #7
    //   1031: getfield a : Z
    //   1034: ifne -> 1075
    //   1037: aload #7
    //   1039: getfield c : F
    //   1042: fconst_0
    //   1043: fcmpl
    //   1044: ifne -> 1075
    //   1047: aload_0
    //   1048: aload_3
    //   1049: invokevirtual v : (Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$f;
    //   1052: astore_3
    //   1053: aload_3
    //   1054: ifnull -> 1075
    //   1057: aload #7
    //   1059: aload_3
    //   1060: getfield d : F
    //   1063: putfield c : F
    //   1066: aload #7
    //   1068: aload_3
    //   1069: getfield b : I
    //   1072: putfield e : I
    //   1075: iinc #1, 1
    //   1078: goto -> 1003
    //   1081: aload_0
    //   1082: invokespecial V : ()V
    //   1085: aload_0
    //   1086: invokevirtual hasFocus : ()Z
    //   1089: ifeq -> 1191
    //   1092: aload_0
    //   1093: invokevirtual findFocus : ()Landroid/view/View;
    //   1096: astore #7
    //   1098: aload #7
    //   1100: ifnull -> 1114
    //   1103: aload_0
    //   1104: aload #7
    //   1106: invokevirtual u : (Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$f;
    //   1109: astore #7
    //   1111: goto -> 1117
    //   1114: aconst_null
    //   1115: astore #7
    //   1117: aload #7
    //   1119: ifnull -> 1134
    //   1122: aload #7
    //   1124: getfield b : I
    //   1127: aload_0
    //   1128: getfield k : I
    //   1131: if_icmpeq -> 1191
    //   1134: iconst_0
    //   1135: istore_1
    //   1136: iload_1
    //   1137: aload_0
    //   1138: invokevirtual getChildCount : ()I
    //   1141: if_icmpge -> 1191
    //   1144: aload_0
    //   1145: iload_1
    //   1146: invokevirtual getChildAt : (I)Landroid/view/View;
    //   1149: astore_3
    //   1150: aload_0
    //   1151: aload_3
    //   1152: invokevirtual v : (Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$f;
    //   1155: astore #7
    //   1157: aload #7
    //   1159: ifnull -> 1185
    //   1162: aload #7
    //   1164: getfield b : I
    //   1167: aload_0
    //   1168: getfield k : I
    //   1171: if_icmpne -> 1185
    //   1174: aload_3
    //   1175: iconst_2
    //   1176: invokevirtual requestFocus : (I)Z
    //   1179: ifeq -> 1185
    //   1182: goto -> 1191
    //   1185: iinc #1, 1
    //   1188: goto -> 1136
    //   1191: return
    //   1192: aload_0
    //   1193: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1196: aload_0
    //   1197: invokevirtual getId : ()I
    //   1200: invokevirtual getResourceName : (I)Ljava/lang/String;
    //   1203: astore #7
    //   1205: goto -> 1219
    //   1208: astore #7
    //   1210: aload_0
    //   1211: invokevirtual getId : ()I
    //   1214: invokestatic toHexString : (I)Ljava/lang/String;
    //   1217: astore #7
    //   1219: new java/lang/StringBuilder
    //   1222: dup
    //   1223: invokespecial <init> : ()V
    //   1226: astore_3
    //   1227: aload_3
    //   1228: ldc_w 'The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: '
    //   1231: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1234: pop
    //   1235: aload_3
    //   1236: aload_0
    //   1237: getfield f : I
    //   1240: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1243: pop
    //   1244: aload_3
    //   1245: ldc_w ', found: '
    //   1248: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1251: pop
    //   1252: aload_3
    //   1253: iload #5
    //   1255: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1258: pop
    //   1259: aload_3
    //   1260: ldc_w ' Pager id: '
    //   1263: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1266: pop
    //   1267: aload_3
    //   1268: aload #7
    //   1270: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1273: pop
    //   1274: aload_3
    //   1275: ldc_w ' Pager class: '
    //   1278: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1281: pop
    //   1282: aload_3
    //   1283: aload_0
    //   1284: invokevirtual getClass : ()Ljava/lang/Class;
    //   1287: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1290: pop
    //   1291: aload_3
    //   1292: ldc_w ' Problematic adapter: '
    //   1295: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1298: pop
    //   1299: aload_3
    //   1300: aload_0
    //   1301: getfield j : Landroidx/viewpager/widget/a;
    //   1304: invokevirtual getClass : ()Ljava/lang/Class;
    //   1307: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1310: pop
    //   1311: new java/lang/IllegalStateException
    //   1314: dup
    //   1315: aload_3
    //   1316: invokevirtual toString : ()Ljava/lang/String;
    //   1319: invokespecial <init> : (Ljava/lang/String;)V
    //   1322: astore #7
    //   1324: goto -> 1330
    //   1327: aload #7
    //   1329: athrow
    //   1330: goto -> 1327
    // Exception table:
    //   from	to	target	type
    //   1192	1205	1208	android/content/res/Resources$NotFoundException
  }
  
  public void M(h paramh) {
    List<h> list = this.g0;
    if (list != null)
      list.remove(paramh); 
  }
  
  public void N(i parami) {
    List<i> list = this.d0;
    if (list != null)
      list.remove(parami); 
  }
  
  void R(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    S(paramInt, paramBoolean1, paramBoolean2, 0);
  }
  
  void S(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2) {
    int m;
    a a1 = this.j;
    boolean bool = false;
    if (a1 == null || a1.e() <= 0) {
      setScrollingCacheEnabled(false);
      return;
    } 
    if (!paramBoolean2 && this.k == paramInt1 && this.g.size() != 0) {
      setScrollingCacheEnabled(false);
      return;
    } 
    if (paramInt1 < 0) {
      m = 0;
    } else {
      m = paramInt1;
      if (paramInt1 >= this.j.e())
        m = this.j.e() - 1; 
    } 
    int n = this.C;
    paramInt1 = this.k;
    if (m > paramInt1 + n || m < paramInt1 - n)
      for (paramInt1 = 0; paramInt1 < this.g.size(); paramInt1++)
        ((f)this.g.get(paramInt1)).c = true;  
    paramBoolean2 = bool;
    if (this.k != m)
      paramBoolean2 = true; 
    if (this.W) {
      this.k = m;
      if (paramBoolean2)
        l(m); 
      requestLayout();
    } else {
      J(m);
      Q(m, paramBoolean1, paramInt2, paramBoolean2);
    } 
  }
  
  i T(i parami) {
    i i1 = this.f0;
    this.f0 = parami;
    return i1;
  }
  
  void U(int paramInt1, int paramInt2, int paramInt3) {
    int m;
    if (getChildCount() == 0) {
      setScrollingCacheEnabled(false);
      return;
    } 
    Scroller scroller = this.o;
    if (scroller != null && !scroller.isFinished()) {
      m = 1;
    } else {
      m = 0;
    } 
    if (m) {
      if (this.p) {
        m = this.o.getCurrX();
      } else {
        m = this.o.getStartX();
      } 
      this.o.abortAnimation();
      setScrollingCacheEnabled(false);
    } else {
      m = getScrollX();
    } 
    int n = getScrollY();
    int i1 = paramInt1 - m;
    paramInt2 -= n;
    if (i1 == 0 && paramInt2 == 0) {
      h(false);
      I();
      setScrollState(0);
      return;
    } 
    setScrollingCacheEnabled(true);
    setScrollState(2);
    paramInt1 = getClientWidth();
    int i2 = paramInt1 / 2;
    float f1 = Math.abs(i1);
    float f2 = paramInt1;
    float f3 = Math.min(1.0F, f1 * 1.0F / f2);
    f1 = i2;
    f3 = n(f3);
    paramInt1 = Math.abs(paramInt3);
    if (paramInt1 > 0) {
      paramInt1 = Math.round(Math.abs((f1 + f3 * f1) / paramInt1) * 1000.0F) * 4;
    } else {
      f1 = this.j.h(this.k);
      paramInt1 = (int)((Math.abs(i1) / (f2 * f1 + this.r) + 1.0F) * 100.0F);
    } 
    paramInt1 = Math.min(paramInt1, 600);
    this.p = false;
    this.o.startScroll(m, n, i1, paramInt2, paramInt1);
    w.h0((View)this);
  }
  
  f a(int paramInt1, int paramInt2) {
    f f1 = new f();
    f1.b = paramInt1;
    f1.a = this.j.j(this, paramInt1);
    f1.d = this.j.h(paramInt1);
    if (paramInt2 < 0 || paramInt2 >= this.g.size()) {
      this.g.add(f1);
      return f1;
    } 
    this.g.add(paramInt2, f1);
    return f1;
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2) {
    int m = paramArrayList.size();
    int n = getDescendantFocusability();
    if (n != 393216)
      for (byte b = 0; b < getChildCount(); b++) {
        View view = getChildAt(b);
        if (view.getVisibility() == 0) {
          f f1 = v(view);
          if (f1 != null && f1.b == this.k)
            view.addFocusables(paramArrayList, paramInt1, paramInt2); 
        } 
      }  
    if (n != 262144 || m == paramArrayList.size()) {
      if (!isFocusable())
        return; 
      if ((paramInt2 & 0x1) == 1 && isInTouchMode() && !isFocusableInTouchMode())
        return; 
      paramArrayList.add(this);
    } 
  }
  
  public void addTouchables(ArrayList<View> paramArrayList) {
    for (byte b = 0; b < getChildCount(); b++) {
      View view = getChildAt(b);
      if (view.getVisibility() == 0) {
        f f1 = v(view);
        if (f1 != null && f1.b == this.k)
          view.addTouchables(paramArrayList); 
      } 
    } 
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    ViewGroup.LayoutParams layoutParams = paramLayoutParams;
    if (!checkLayoutParams(paramLayoutParams))
      layoutParams = generateLayoutParams(paramLayoutParams); 
    paramLayoutParams = layoutParams;
    int m = ((LayoutParams)paramLayoutParams).a | z(paramView);
    ((LayoutParams)paramLayoutParams).a = m;
    if (this.z) {
      if (m == 0) {
        ((LayoutParams)paramLayoutParams).d = true;
        addViewInLayout(paramView, paramInt, layoutParams);
      } else {
        throw new IllegalStateException("Cannot add pager decor view during layout");
      } 
    } else {
      super.addView(paramView, paramInt, layoutParams);
    } 
  }
  
  public void b(h paramh) {
    if (this.g0 == null)
      this.g0 = new ArrayList<h>(); 
    this.g0.add(paramh);
  }
  
  public void c(i parami) {
    if (this.d0 == null)
      this.d0 = new ArrayList<i>(); 
    this.d0.add(parami);
  }
  
  public boolean canScrollHorizontally(int paramInt) {
    a a1 = this.j;
    boolean bool1 = false;
    boolean bool2 = false;
    if (a1 == null)
      return false; 
    int m = getClientWidth();
    int n = getScrollX();
    if (paramInt < 0) {
      if (n > (int)(m * this.v))
        bool2 = true; 
      return bool2;
    } 
    bool2 = bool1;
    if (paramInt > 0) {
      bool2 = bool1;
      if (n < (int)(m * this.w))
        bool2 = true; 
    } 
    return bool2;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    boolean bool;
    if (paramLayoutParams instanceof LayoutParams && super.checkLayoutParams(paramLayoutParams)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void computeScroll() {
    this.p = true;
    if (!this.o.isFinished() && this.o.computeScrollOffset()) {
      int m = getScrollX();
      int n = getScrollY();
      int i1 = this.o.getCurrX();
      int i2 = this.o.getCurrY();
      if (m != i1 || n != i2) {
        scrollTo(i1, i2);
        if (!G(i1)) {
          this.o.abortAnimation();
          scrollTo(0, i2);
        } 
      } 
      w.h0((View)this);
      return;
    } 
    h(true);
  }
  
  public boolean d(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual findFocus : ()Landroid/view/View;
    //   4: astore_2
    //   5: iconst_0
    //   6: istore_3
    //   7: aload_2
    //   8: aload_0
    //   9: if_acmpne -> 18
    //   12: aconst_null
    //   13: astore #4
    //   15: goto -> 189
    //   18: aload_2
    //   19: astore #4
    //   21: aload_2
    //   22: ifnull -> 189
    //   25: aload_2
    //   26: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   29: astore #4
    //   31: aload #4
    //   33: instanceof android/view/ViewGroup
    //   36: ifeq -> 63
    //   39: aload #4
    //   41: aload_0
    //   42: if_acmpne -> 51
    //   45: iconst_1
    //   46: istore #5
    //   48: goto -> 66
    //   51: aload #4
    //   53: invokeinterface getParent : ()Landroid/view/ViewParent;
    //   58: astore #4
    //   60: goto -> 31
    //   63: iconst_0
    //   64: istore #5
    //   66: aload_2
    //   67: astore #4
    //   69: iload #5
    //   71: ifne -> 189
    //   74: new java/lang/StringBuilder
    //   77: dup
    //   78: invokespecial <init> : ()V
    //   81: astore #6
    //   83: aload #6
    //   85: aload_2
    //   86: invokevirtual getClass : ()Ljava/lang/Class;
    //   89: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: pop
    //   96: aload_2
    //   97: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   100: astore #4
    //   102: aload #4
    //   104: instanceof android/view/ViewGroup
    //   107: ifeq -> 145
    //   110: aload #6
    //   112: ldc_w ' => '
    //   115: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: pop
    //   119: aload #6
    //   121: aload #4
    //   123: invokevirtual getClass : ()Ljava/lang/Class;
    //   126: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   129: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: pop
    //   133: aload #4
    //   135: invokeinterface getParent : ()Landroid/view/ViewParent;
    //   140: astore #4
    //   142: goto -> 102
    //   145: new java/lang/StringBuilder
    //   148: dup
    //   149: invokespecial <init> : ()V
    //   152: astore #4
    //   154: aload #4
    //   156: ldc_w 'arrowScroll tried to find focus based on non-child current focused view '
    //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: pop
    //   163: aload #4
    //   165: aload #6
    //   167: invokevirtual toString : ()Ljava/lang/String;
    //   170: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: pop
    //   174: ldc_w 'ViewPager'
    //   177: aload #4
    //   179: invokevirtual toString : ()Ljava/lang/String;
    //   182: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   185: pop
    //   186: goto -> 12
    //   189: invokestatic getInstance : ()Landroid/view/FocusFinder;
    //   192: aload_0
    //   193: aload #4
    //   195: iload_1
    //   196: invokevirtual findNextFocus : (Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
    //   199: astore_2
    //   200: aload_2
    //   201: ifnull -> 336
    //   204: aload_2
    //   205: aload #4
    //   207: if_acmpeq -> 336
    //   210: iload_1
    //   211: bipush #17
    //   213: if_icmpne -> 273
    //   216: aload_0
    //   217: aload_0
    //   218: getfield i : Landroid/graphics/Rect;
    //   221: aload_2
    //   222: invokespecial t : (Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
    //   225: getfield left : I
    //   228: istore #5
    //   230: aload_0
    //   231: aload_0
    //   232: getfield i : Landroid/graphics/Rect;
    //   235: aload #4
    //   237: invokespecial t : (Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
    //   240: getfield left : I
    //   243: istore #7
    //   245: aload #4
    //   247: ifnull -> 265
    //   250: iload #5
    //   252: iload #7
    //   254: if_icmplt -> 265
    //   257: aload_0
    //   258: invokevirtual E : ()Z
    //   261: istore_3
    //   262: goto -> 270
    //   265: aload_2
    //   266: invokevirtual requestFocus : ()Z
    //   269: istore_3
    //   270: goto -> 374
    //   273: iload_1
    //   274: bipush #66
    //   276: if_icmpne -> 374
    //   279: aload_0
    //   280: aload_0
    //   281: getfield i : Landroid/graphics/Rect;
    //   284: aload_2
    //   285: invokespecial t : (Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
    //   288: getfield left : I
    //   291: istore #5
    //   293: aload_0
    //   294: aload_0
    //   295: getfield i : Landroid/graphics/Rect;
    //   298: aload #4
    //   300: invokespecial t : (Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
    //   303: getfield left : I
    //   306: istore #7
    //   308: aload #4
    //   310: ifnull -> 328
    //   313: iload #5
    //   315: iload #7
    //   317: if_icmpgt -> 328
    //   320: aload_0
    //   321: invokevirtual F : ()Z
    //   324: istore_3
    //   325: goto -> 270
    //   328: aload_2
    //   329: invokevirtual requestFocus : ()Z
    //   332: istore_3
    //   333: goto -> 270
    //   336: iload_1
    //   337: bipush #17
    //   339: if_icmpeq -> 369
    //   342: iload_1
    //   343: iconst_1
    //   344: if_icmpne -> 350
    //   347: goto -> 369
    //   350: iload_1
    //   351: bipush #66
    //   353: if_icmpeq -> 361
    //   356: iload_1
    //   357: iconst_2
    //   358: if_icmpne -> 374
    //   361: aload_0
    //   362: invokevirtual F : ()Z
    //   365: istore_3
    //   366: goto -> 374
    //   369: aload_0
    //   370: invokevirtual E : ()Z
    //   373: istore_3
    //   374: iload_3
    //   375: ifeq -> 386
    //   378: aload_0
    //   379: iload_1
    //   380: invokestatic getContantForFocusDirection : (I)I
    //   383: invokevirtual playSoundEffect : (I)V
    //   386: iload_3
    //   387: ireturn
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    return (super.dispatchKeyEvent(paramKeyEvent) || r(paramKeyEvent));
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    if (paramAccessibilityEvent.getEventType() == 4096)
      return super.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent); 
    int m = getChildCount();
    for (byte b = 0; b < m; b++) {
      View view = getChildAt(b);
      if (view.getVisibility() == 0) {
        f f1 = v(view);
        if (f1 != null && f1.b == this.k && view.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent))
          return true; 
      } 
    } 
    return false;
  }
  
  public void draw(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial draw : (Landroid/graphics/Canvas;)V
    //   5: aload_0
    //   6: invokevirtual getOverScrollMode : ()I
    //   9: istore_2
    //   10: iconst_0
    //   11: istore_3
    //   12: iconst_0
    //   13: istore #4
    //   15: iload_2
    //   16: ifeq -> 64
    //   19: iload_2
    //   20: iconst_1
    //   21: if_icmpne -> 47
    //   24: aload_0
    //   25: getfield j : Landroidx/viewpager/widget/a;
    //   28: astore #5
    //   30: aload #5
    //   32: ifnull -> 47
    //   35: aload #5
    //   37: invokevirtual e : ()I
    //   40: iconst_1
    //   41: if_icmple -> 47
    //   44: goto -> 64
    //   47: aload_0
    //   48: getfield U : Landroid/widget/EdgeEffect;
    //   51: invokevirtual finish : ()V
    //   54: aload_0
    //   55: getfield V : Landroid/widget/EdgeEffect;
    //   58: invokevirtual finish : ()V
    //   61: goto -> 256
    //   64: aload_0
    //   65: getfield U : Landroid/widget/EdgeEffect;
    //   68: invokevirtual isFinished : ()Z
    //   71: ifne -> 154
    //   74: aload_1
    //   75: invokevirtual save : ()I
    //   78: istore_3
    //   79: aload_0
    //   80: invokevirtual getHeight : ()I
    //   83: aload_0
    //   84: invokevirtual getPaddingTop : ()I
    //   87: isub
    //   88: aload_0
    //   89: invokevirtual getPaddingBottom : ()I
    //   92: isub
    //   93: istore #4
    //   95: aload_0
    //   96: invokevirtual getWidth : ()I
    //   99: istore_2
    //   100: aload_1
    //   101: ldc_w 270.0
    //   104: invokevirtual rotate : (F)V
    //   107: aload_1
    //   108: iload #4
    //   110: ineg
    //   111: aload_0
    //   112: invokevirtual getPaddingTop : ()I
    //   115: iadd
    //   116: i2f
    //   117: aload_0
    //   118: getfield v : F
    //   121: iload_2
    //   122: i2f
    //   123: fmul
    //   124: invokevirtual translate : (FF)V
    //   127: aload_0
    //   128: getfield U : Landroid/widget/EdgeEffect;
    //   131: iload #4
    //   133: iload_2
    //   134: invokevirtual setSize : (II)V
    //   137: iconst_0
    //   138: aload_0
    //   139: getfield U : Landroid/widget/EdgeEffect;
    //   142: aload_1
    //   143: invokevirtual draw : (Landroid/graphics/Canvas;)Z
    //   146: ior
    //   147: istore #4
    //   149: aload_1
    //   150: iload_3
    //   151: invokevirtual restoreToCount : (I)V
    //   154: iload #4
    //   156: istore_3
    //   157: aload_0
    //   158: getfield V : Landroid/widget/EdgeEffect;
    //   161: invokevirtual isFinished : ()Z
    //   164: ifne -> 256
    //   167: aload_1
    //   168: invokevirtual save : ()I
    //   171: istore_2
    //   172: aload_0
    //   173: invokevirtual getWidth : ()I
    //   176: istore #6
    //   178: aload_0
    //   179: invokevirtual getHeight : ()I
    //   182: istore_3
    //   183: aload_0
    //   184: invokevirtual getPaddingTop : ()I
    //   187: istore #7
    //   189: aload_0
    //   190: invokevirtual getPaddingBottom : ()I
    //   193: istore #8
    //   195: aload_1
    //   196: ldc_w 90.0
    //   199: invokevirtual rotate : (F)V
    //   202: aload_1
    //   203: aload_0
    //   204: invokevirtual getPaddingTop : ()I
    //   207: ineg
    //   208: i2f
    //   209: aload_0
    //   210: getfield w : F
    //   213: fconst_1
    //   214: fadd
    //   215: fneg
    //   216: iload #6
    //   218: i2f
    //   219: fmul
    //   220: invokevirtual translate : (FF)V
    //   223: aload_0
    //   224: getfield V : Landroid/widget/EdgeEffect;
    //   227: iload_3
    //   228: iload #7
    //   230: isub
    //   231: iload #8
    //   233: isub
    //   234: iload #6
    //   236: invokevirtual setSize : (II)V
    //   239: iload #4
    //   241: aload_0
    //   242: getfield V : Landroid/widget/EdgeEffect;
    //   245: aload_1
    //   246: invokevirtual draw : (Landroid/graphics/Canvas;)Z
    //   249: ior
    //   250: istore_3
    //   251: aload_1
    //   252: iload_2
    //   253: invokevirtual restoreToCount : (I)V
    //   256: iload_3
    //   257: ifeq -> 264
    //   260: aload_0
    //   261: invokestatic h0 : (Landroid/view/View;)V
    //   264: return
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    Drawable drawable = this.s;
    if (drawable != null && drawable.isStateful())
      drawable.setState(getDrawableState()); 
  }
  
  public boolean e() {
    if (this.D)
      return false; 
    this.S = true;
    setScrollState(1);
    this.I = 0.0F;
    this.K = 0.0F;
    VelocityTracker velocityTracker = this.N;
    if (velocityTracker == null) {
      this.N = VelocityTracker.obtain();
    } else {
      velocityTracker.clear();
    } 
    long l1 = SystemClock.uptimeMillis();
    MotionEvent motionEvent = MotionEvent.obtain(l1, l1, 0, 0.0F, 0.0F, 0);
    this.N.addMovement(motionEvent);
    motionEvent.recycle();
    this.T = l1;
    return true;
  }
  
  protected boolean g(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3) {
    boolean bool = paramView instanceof ViewGroup;
    boolean bool1 = true;
    if (bool) {
      ViewGroup viewGroup = (ViewGroup)paramView;
      int m = paramView.getScrollX();
      int n = paramView.getScrollY();
      for (int i1 = viewGroup.getChildCount() - 1; i1 >= 0; i1--) {
        View view = viewGroup.getChildAt(i1);
        int i2 = paramInt2 + m;
        if (i2 >= view.getLeft() && i2 < view.getRight()) {
          int i3 = paramInt3 + n;
          if (i3 >= view.getTop() && i3 < view.getBottom() && g(view, true, paramInt1, i2 - view.getLeft(), i3 - view.getTop()))
            return true; 
        } 
      } 
    } 
    if (paramBoolean && paramView.canScrollHorizontally(-paramInt1)) {
      paramBoolean = bool1;
    } else {
      paramBoolean = false;
    } 
    return paramBoolean;
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
    return new LayoutParams();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return generateDefaultLayoutParams();
  }
  
  public a getAdapter() {
    return this.j;
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2) {
    int m = paramInt2;
    if (this.j0 == 2)
      m = paramInt1 - 1 - paramInt2; 
    return ((LayoutParams)((View)this.k0.get(m)).getLayoutParams()).f;
  }
  
  public int getCurrentItem() {
    return this.k;
  }
  
  public int getOffscreenPageLimit() {
    return this.C;
  }
  
  public int getPageMargin() {
    return this.r;
  }
  
  void i() {
    // Byte code:
    //   0: aload_0
    //   1: getfield j : Landroidx/viewpager/widget/a;
    //   4: invokevirtual e : ()I
    //   7: istore_1
    //   8: aload_0
    //   9: iload_1
    //   10: putfield f : I
    //   13: aload_0
    //   14: getfield g : Ljava/util/ArrayList;
    //   17: invokevirtual size : ()I
    //   20: aload_0
    //   21: getfield C : I
    //   24: iconst_2
    //   25: imul
    //   26: iconst_1
    //   27: iadd
    //   28: if_icmpge -> 47
    //   31: aload_0
    //   32: getfield g : Ljava/util/ArrayList;
    //   35: invokevirtual size : ()I
    //   38: iload_1
    //   39: if_icmpge -> 47
    //   42: iconst_1
    //   43: istore_2
    //   44: goto -> 49
    //   47: iconst_0
    //   48: istore_2
    //   49: aload_0
    //   50: getfield k : I
    //   53: istore_3
    //   54: iconst_0
    //   55: istore #4
    //   57: iconst_0
    //   58: istore #5
    //   60: iload_2
    //   61: istore #6
    //   63: iload #4
    //   65: aload_0
    //   66: getfield g : Ljava/util/ArrayList;
    //   69: invokevirtual size : ()I
    //   72: if_icmpge -> 301
    //   75: aload_0
    //   76: getfield g : Ljava/util/ArrayList;
    //   79: iload #4
    //   81: invokevirtual get : (I)Ljava/lang/Object;
    //   84: checkcast androidx/viewpager/widget/ViewPager$f
    //   87: astore #7
    //   89: aload_0
    //   90: getfield j : Landroidx/viewpager/widget/a;
    //   93: aload #7
    //   95: getfield a : Ljava/lang/Object;
    //   98: invokevirtual f : (Ljava/lang/Object;)I
    //   101: istore #8
    //   103: iload #8
    //   105: iconst_m1
    //   106: if_icmpne -> 122
    //   109: iload_3
    //   110: istore_2
    //   111: iload #4
    //   113: istore #9
    //   115: iload #5
    //   117: istore #10
    //   119: goto -> 286
    //   122: iload #8
    //   124: bipush #-2
    //   126: if_icmpne -> 240
    //   129: aload_0
    //   130: getfield g : Ljava/util/ArrayList;
    //   133: iload #4
    //   135: invokevirtual remove : (I)Ljava/lang/Object;
    //   138: pop
    //   139: iload #4
    //   141: iconst_1
    //   142: isub
    //   143: istore #6
    //   145: iload #5
    //   147: istore_2
    //   148: iload #5
    //   150: ifne -> 163
    //   153: aload_0
    //   154: getfield j : Landroidx/viewpager/widget/a;
    //   157: aload_0
    //   158: invokevirtual t : (Landroid/view/ViewGroup;)V
    //   161: iconst_1
    //   162: istore_2
    //   163: aload_0
    //   164: getfield j : Landroidx/viewpager/widget/a;
    //   167: aload_0
    //   168: aload #7
    //   170: getfield b : I
    //   173: aload #7
    //   175: getfield a : Ljava/lang/Object;
    //   178: invokevirtual b : (Landroid/view/ViewGroup;ILjava/lang/Object;)V
    //   181: aload_0
    //   182: getfield k : I
    //   185: istore #10
    //   187: iload #6
    //   189: istore #4
    //   191: iload_2
    //   192: istore #5
    //   194: iload #10
    //   196: aload #7
    //   198: getfield b : I
    //   201: if_icmpne -> 224
    //   204: iconst_0
    //   205: iload #10
    //   207: iload_1
    //   208: iconst_1
    //   209: isub
    //   210: invokestatic min : (II)I
    //   213: invokestatic max : (II)I
    //   216: istore_3
    //   217: iload_2
    //   218: istore #5
    //   220: iload #6
    //   222: istore #4
    //   224: iconst_1
    //   225: istore #6
    //   227: iload_3
    //   228: istore_2
    //   229: iload #4
    //   231: istore #9
    //   233: iload #5
    //   235: istore #10
    //   237: goto -> 286
    //   240: aload #7
    //   242: getfield b : I
    //   245: istore #11
    //   247: iload_3
    //   248: istore_2
    //   249: iload #4
    //   251: istore #9
    //   253: iload #5
    //   255: istore #10
    //   257: iload #11
    //   259: iload #8
    //   261: if_icmpeq -> 286
    //   264: iload #11
    //   266: aload_0
    //   267: getfield k : I
    //   270: if_icmpne -> 276
    //   273: iload #8
    //   275: istore_3
    //   276: aload #7
    //   278: iload #8
    //   280: putfield b : I
    //   283: goto -> 224
    //   286: iload #9
    //   288: iconst_1
    //   289: iadd
    //   290: istore #4
    //   292: iload_2
    //   293: istore_3
    //   294: iload #10
    //   296: istore #5
    //   298: goto -> 63
    //   301: iload #5
    //   303: ifeq -> 314
    //   306: aload_0
    //   307: getfield j : Landroidx/viewpager/widget/a;
    //   310: aload_0
    //   311: invokevirtual d : (Landroid/view/ViewGroup;)V
    //   314: aload_0
    //   315: getfield g : Ljava/util/ArrayList;
    //   318: getstatic androidx/viewpager/widget/ViewPager.c : Ljava/util/Comparator;
    //   321: invokestatic sort : (Ljava/util/List;Ljava/util/Comparator;)V
    //   324: iload #6
    //   326: ifeq -> 390
    //   329: aload_0
    //   330: invokevirtual getChildCount : ()I
    //   333: istore #4
    //   335: iconst_0
    //   336: istore #5
    //   338: iload #5
    //   340: iload #4
    //   342: if_icmpge -> 379
    //   345: aload_0
    //   346: iload #5
    //   348: invokevirtual getChildAt : (I)Landroid/view/View;
    //   351: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   354: checkcast androidx/viewpager/widget/ViewPager$LayoutParams
    //   357: astore #7
    //   359: aload #7
    //   361: getfield a : Z
    //   364: ifne -> 373
    //   367: aload #7
    //   369: fconst_0
    //   370: putfield c : F
    //   373: iinc #5, 1
    //   376: goto -> 338
    //   379: aload_0
    //   380: iload_3
    //   381: iconst_0
    //   382: iconst_1
    //   383: invokevirtual R : (IZZ)V
    //   386: aload_0
    //   387: invokevirtual requestLayout : ()V
    //   390: return
  }
  
  float n(float paramFloat) {
    return (float)Math.sin(((paramFloat - 0.5F) * 0.47123894F));
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.W = true;
  }
  
  protected void onDetachedFromWindow() {
    removeCallbacks(this.l0);
    Scroller scroller = this.o;
    if (scroller != null && !scroller.isFinished())
      this.o.abortAnimation(); 
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    if (this.r > 0 && this.s != null && this.g.size() > 0 && this.j != null) {
      int m = getScrollX();
      int n = getWidth();
      float f1 = this.r;
      float f2 = n;
      float f3 = f1 / f2;
      ArrayList<f> arrayList = this.g;
      byte b = 0;
      f f4 = arrayList.get(0);
      f1 = f4.e;
      int i1 = this.g.size();
      int i2 = f4.b;
      int i3 = ((f)this.g.get(i1 - 1)).b;
      while (i2 < i3) {
        f f5;
        int i4;
        float f6;
        while (true) {
          i4 = f4.b;
          if (i2 > i4 && b < i1) {
            ArrayList<f> arrayList1 = this.g;
            f5 = arrayList1.get(++b);
            continue;
          } 
          break;
        } 
        if (i2 == i4) {
          f1 = f5.e;
          float f7 = f5.d;
          f6 = (f1 + f7) * f2;
          f1 = f1 + f7 + f3;
        } else {
          float f7 = this.j.h(i2);
          f6 = (f1 + f7) * f2;
          f1 += f7 + f3;
        } 
        if (this.r + f6 > m) {
          this.s.setBounds(Math.round(f6), this.t, Math.round(this.r + f6), this.u);
          this.s.draw(paramCanvas);
        } 
        if (f6 > (m + n))
          break; 
        i2++;
      } 
    } 
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    int m = paramMotionEvent.getAction() & 0xFF;
    if (m == 3 || m == 1) {
      P();
      return false;
    } 
    if (m != 0) {
      if (this.D)
        return true; 
      if (this.E)
        return false; 
    } 
    if (m != 0) {
      if (m != 2) {
        if (m == 6)
          D(paramMotionEvent); 
      } else {
        m = this.M;
        if (m != -1) {
          m = paramMotionEvent.findPointerIndex(m);
          float f1 = paramMotionEvent.getX(m);
          float f2 = f1 - this.I;
          float f3 = Math.abs(f2);
          float f4 = paramMotionEvent.getY(m);
          float f5 = Math.abs(f4 - this.L);
          if (f2 != 0.0F && !B(this.I, f2) && g((View)this, false, (int)f2, (int)f1, (int)f4)) {
            this.I = f1;
            this.J = f4;
            this.E = true;
            return false;
          } 
          m = this.H;
          if (f3 > m && f3 * 0.5F > f5) {
            this.D = true;
            O(true);
            setScrollState(1);
            if (f2 > 0.0F) {
              f3 = this.K + this.H;
            } else {
              f3 = this.K - this.H;
            } 
            this.I = f3;
            this.J = f4;
            setScrollingCacheEnabled(true);
          } else if (f5 > m) {
            this.E = true;
          } 
          if (this.D && H(f1))
            w.h0((View)this); 
        } 
      } 
    } else {
      float f1 = paramMotionEvent.getX();
      this.K = f1;
      this.I = f1;
      f1 = paramMotionEvent.getY();
      this.L = f1;
      this.J = f1;
      this.M = paramMotionEvent.getPointerId(0);
      this.E = false;
      this.p = true;
      this.o.computeScrollOffset();
      if (this.m0 == 2 && Math.abs(this.o.getFinalX() - this.o.getCurrX()) > this.R) {
        this.o.abortAnimation();
        this.B = false;
        I();
        this.D = true;
        O(true);
        setScrollState(1);
      } else {
        h(false);
        this.D = false;
      } 
    } 
    if (this.N == null)
      this.N = VelocityTracker.obtain(); 
    this.N.addMovement(paramMotionEvent);
    return this.D;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int m = getChildCount();
    int n = paramInt3 - paramInt1;
    int i1 = paramInt4 - paramInt2;
    paramInt2 = getPaddingLeft();
    paramInt1 = getPaddingTop();
    paramInt4 = getPaddingRight();
    paramInt3 = getPaddingBottom();
    int i2 = getScrollX();
    int i3 = 0;
    int i4;
    for (i4 = 0; i3 < m; i4 = i9) {
      View view = getChildAt(i3);
      int i5 = paramInt2;
      int i6 = paramInt1;
      int i7 = paramInt4;
      int i8 = paramInt3;
      int i9 = i4;
      if (view.getVisibility() != 8) {
        LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
        i5 = paramInt2;
        i6 = paramInt1;
        i7 = paramInt4;
        i8 = paramInt3;
        i9 = i4;
        if (layoutParams.a) {
          i8 = layoutParams.b;
          i9 = i8 & 0x7;
          i7 = i8 & 0x70;
          if (i9 != 1) {
            if (i9 != 3) {
              if (i9 != 5) {
                i9 = paramInt2;
                i8 = paramInt2;
                paramInt2 = i9;
              } else {
                i9 = n - paramInt4 - view.getMeasuredWidth();
                paramInt4 += view.getMeasuredWidth();
                i8 = i9;
              } 
            } else {
              i9 = view.getMeasuredWidth() + paramInt2;
              i8 = paramInt2;
              paramInt2 = i9;
            } 
          } else {
            i9 = Math.max((n - view.getMeasuredWidth()) / 2, paramInt2);
            i8 = i9;
          } 
          if (i7 != 16) {
            if (i7 != 48) {
              if (i7 != 80) {
                i7 = paramInt1;
                i9 = paramInt1;
                paramInt1 = i7;
              } else {
                i9 = i1 - paramInt3 - view.getMeasuredHeight();
                paramInt3 += view.getMeasuredHeight();
              } 
            } else {
              i7 = view.getMeasuredHeight() + paramInt1;
              i9 = paramInt1;
              paramInt1 = i7;
            } 
          } else {
            i9 = Math.max((i1 - view.getMeasuredHeight()) / 2, paramInt1);
          } 
          i8 += i2;
          view.layout(i8, i9, view.getMeasuredWidth() + i8, i9 + view.getMeasuredHeight());
          i9 = i4 + 1;
          i8 = paramInt3;
          i7 = paramInt4;
          i6 = paramInt1;
          i5 = paramInt2;
        } 
      } 
      i3++;
      paramInt2 = i5;
      paramInt1 = i6;
      paramInt4 = i7;
      paramInt3 = i8;
    } 
    for (byte b = 0; b < m; b++) {
      View view = getChildAt(b);
      if (view.getVisibility() != 8) {
        LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
        if (!layoutParams.a) {
          f f1 = v(view);
          if (f1 != null) {
            float f2 = (n - paramInt2 - paramInt4);
            i3 = (int)(f1.e * f2) + paramInt2;
            if (layoutParams.d) {
              layoutParams.d = false;
              view.measure(View.MeasureSpec.makeMeasureSpec((int)(f2 * layoutParams.c), 1073741824), View.MeasureSpec.makeMeasureSpec(i1 - paramInt1 - paramInt3, 1073741824));
            } 
            view.layout(i3, paramInt1, view.getMeasuredWidth() + i3, view.getMeasuredHeight() + paramInt1);
          } 
        } 
      } 
    } 
    this.t = paramInt1;
    this.u = i1 - paramInt3;
    this.c0 = i4;
    if (this.W)
      Q(this.k, false, 0, false); 
    this.W = false;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: iconst_0
    //   4: iload_1
    //   5: invokestatic getDefaultSize : (II)I
    //   8: iconst_0
    //   9: iload_2
    //   10: invokestatic getDefaultSize : (II)I
    //   13: invokevirtual setMeasuredDimension : (II)V
    //   16: aload_0
    //   17: invokevirtual getMeasuredWidth : ()I
    //   20: istore_1
    //   21: aload_0
    //   22: iload_1
    //   23: bipush #10
    //   25: idiv
    //   26: aload_0
    //   27: getfield F : I
    //   30: invokestatic min : (II)I
    //   33: putfield G : I
    //   36: iload_1
    //   37: aload_0
    //   38: invokevirtual getPaddingLeft : ()I
    //   41: isub
    //   42: aload_0
    //   43: invokevirtual getPaddingRight : ()I
    //   46: isub
    //   47: istore_1
    //   48: aload_0
    //   49: invokevirtual getMeasuredHeight : ()I
    //   52: aload_0
    //   53: invokevirtual getPaddingTop : ()I
    //   56: isub
    //   57: aload_0
    //   58: invokevirtual getPaddingBottom : ()I
    //   61: isub
    //   62: istore_2
    //   63: aload_0
    //   64: invokevirtual getChildCount : ()I
    //   67: istore #4
    //   69: iconst_0
    //   70: istore #5
    //   72: iconst_1
    //   73: istore #6
    //   75: ldc_w 1073741824
    //   78: istore #7
    //   80: iload #5
    //   82: iload #4
    //   84: if_icmpge -> 434
    //   87: aload_0
    //   88: iload #5
    //   90: invokevirtual getChildAt : (I)Landroid/view/View;
    //   93: astore #8
    //   95: iload_1
    //   96: istore #9
    //   98: iload_2
    //   99: istore #10
    //   101: aload #8
    //   103: invokevirtual getVisibility : ()I
    //   106: bipush #8
    //   108: if_icmpeq -> 422
    //   111: aload #8
    //   113: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   116: checkcast androidx/viewpager/widget/ViewPager$LayoutParams
    //   119: astore #11
    //   121: iload_1
    //   122: istore #9
    //   124: iload_2
    //   125: istore #10
    //   127: aload #11
    //   129: ifnull -> 422
    //   132: iload_1
    //   133: istore #9
    //   135: iload_2
    //   136: istore #10
    //   138: aload #11
    //   140: getfield a : Z
    //   143: ifeq -> 422
    //   146: aload #11
    //   148: getfield b : I
    //   151: istore #9
    //   153: iload #9
    //   155: bipush #7
    //   157: iand
    //   158: istore #10
    //   160: iload #9
    //   162: bipush #112
    //   164: iand
    //   165: istore #9
    //   167: iload #9
    //   169: bipush #48
    //   171: if_icmpeq -> 190
    //   174: iload #9
    //   176: bipush #80
    //   178: if_icmpne -> 184
    //   181: goto -> 190
    //   184: iconst_0
    //   185: istore #12
    //   187: goto -> 193
    //   190: iconst_1
    //   191: istore #12
    //   193: iload #6
    //   195: istore #13
    //   197: iload #10
    //   199: iconst_3
    //   200: if_icmpeq -> 219
    //   203: iload #10
    //   205: iconst_5
    //   206: if_icmpne -> 216
    //   209: iload #6
    //   211: istore #13
    //   213: goto -> 219
    //   216: iconst_0
    //   217: istore #13
    //   219: ldc_w -2147483648
    //   222: istore #10
    //   224: iload #12
    //   226: ifeq -> 237
    //   229: ldc_w 1073741824
    //   232: istore #9
    //   234: goto -> 262
    //   237: iload #10
    //   239: istore #9
    //   241: iload #13
    //   243: ifeq -> 262
    //   246: ldc_w 1073741824
    //   249: istore #6
    //   251: iload #10
    //   253: istore #9
    //   255: iload #6
    //   257: istore #10
    //   259: goto -> 267
    //   262: ldc_w -2147483648
    //   265: istore #10
    //   267: aload #11
    //   269: getfield width : I
    //   272: istore #6
    //   274: iload #6
    //   276: bipush #-2
    //   278: if_icmpeq -> 309
    //   281: iload #6
    //   283: iconst_m1
    //   284: if_icmpeq -> 294
    //   287: iload #6
    //   289: istore #9
    //   291: goto -> 297
    //   294: iload_1
    //   295: istore #9
    //   297: ldc_w 1073741824
    //   300: istore #14
    //   302: iload #9
    //   304: istore #6
    //   306: goto -> 316
    //   309: iload_1
    //   310: istore #6
    //   312: iload #9
    //   314: istore #14
    //   316: aload #11
    //   318: getfield height : I
    //   321: istore #9
    //   323: iload #9
    //   325: bipush #-2
    //   327: if_icmpeq -> 349
    //   330: iload #9
    //   332: iconst_m1
    //   333: if_icmpeq -> 343
    //   336: iload #9
    //   338: istore #10
    //   340: goto -> 360
    //   343: iload_2
    //   344: istore #10
    //   346: goto -> 360
    //   349: iload_2
    //   350: istore #9
    //   352: iload #10
    //   354: istore #7
    //   356: iload #9
    //   358: istore #10
    //   360: aload #8
    //   362: iload #6
    //   364: iload #14
    //   366: invokestatic makeMeasureSpec : (II)I
    //   369: iload #10
    //   371: iload #7
    //   373: invokestatic makeMeasureSpec : (II)I
    //   376: invokevirtual measure : (II)V
    //   379: iload #12
    //   381: ifeq -> 399
    //   384: iload_2
    //   385: aload #8
    //   387: invokevirtual getMeasuredHeight : ()I
    //   390: isub
    //   391: istore #10
    //   393: iload_1
    //   394: istore #9
    //   396: goto -> 422
    //   399: iload_1
    //   400: istore #9
    //   402: iload_2
    //   403: istore #10
    //   405: iload #13
    //   407: ifeq -> 422
    //   410: iload_1
    //   411: aload #8
    //   413: invokevirtual getMeasuredWidth : ()I
    //   416: isub
    //   417: istore #9
    //   419: iload_2
    //   420: istore #10
    //   422: iinc #5, 1
    //   425: iload #9
    //   427: istore_1
    //   428: iload #10
    //   430: istore_2
    //   431: goto -> 72
    //   434: aload_0
    //   435: iload_1
    //   436: ldc_w 1073741824
    //   439: invokestatic makeMeasureSpec : (II)I
    //   442: putfield x : I
    //   445: aload_0
    //   446: iload_2
    //   447: ldc_w 1073741824
    //   450: invokestatic makeMeasureSpec : (II)I
    //   453: putfield y : I
    //   456: aload_0
    //   457: iconst_1
    //   458: putfield z : Z
    //   461: aload_0
    //   462: invokevirtual I : ()V
    //   465: aload_0
    //   466: iconst_0
    //   467: putfield z : Z
    //   470: aload_0
    //   471: invokevirtual getChildCount : ()I
    //   474: istore #10
    //   476: iload_3
    //   477: istore_2
    //   478: iload_2
    //   479: iload #10
    //   481: if_icmpge -> 554
    //   484: aload_0
    //   485: iload_2
    //   486: invokevirtual getChildAt : (I)Landroid/view/View;
    //   489: astore #8
    //   491: aload #8
    //   493: invokevirtual getVisibility : ()I
    //   496: bipush #8
    //   498: if_icmpeq -> 548
    //   501: aload #8
    //   503: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   506: checkcast androidx/viewpager/widget/ViewPager$LayoutParams
    //   509: astore #11
    //   511: aload #11
    //   513: ifnull -> 524
    //   516: aload #11
    //   518: getfield a : Z
    //   521: ifne -> 548
    //   524: aload #8
    //   526: iload_1
    //   527: i2f
    //   528: aload #11
    //   530: getfield c : F
    //   533: fmul
    //   534: f2i
    //   535: ldc_w 1073741824
    //   538: invokestatic makeMeasureSpec : (II)I
    //   541: aload_0
    //   542: getfield y : I
    //   545: invokevirtual measure : (II)V
    //   548: iinc #2, 1
    //   551: goto -> 478
    //   554: return
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect) {
    byte b;
    int m = getChildCount();
    int n = -1;
    if ((paramInt & 0x2) != 0) {
      n = m;
      m = 0;
      b = 1;
    } else {
      m--;
      b = -1;
    } 
    while (m != n) {
      View view = getChildAt(m);
      if (view.getVisibility() == 0) {
        f f1 = v(view);
        if (f1 != null && f1.b == this.k && view.requestFocus(paramInt, paramRect))
          return true; 
      } 
      m += b;
    } 
    return false;
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof SavedState)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    SavedState savedState = (SavedState)paramParcelable;
    super.onRestoreInstanceState(savedState.a());
    a a1 = this.j;
    if (a1 != null) {
      a1.n(savedState.e, savedState.f);
      R(savedState.d, false, true);
    } else {
      this.l = savedState.d;
      this.m = savedState.e;
      this.n = savedState.f;
    } 
  }
  
  public Parcelable onSaveInstanceState() {
    SavedState savedState = new SavedState(super.onSaveInstanceState());
    savedState.d = this.k;
    a a1 = this.j;
    if (a1 != null)
      savedState.e = a1.o(); 
    return (Parcelable)savedState;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3) {
      paramInt2 = this.r;
      K(paramInt1, paramInt3, paramInt2, paramInt2);
    } 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield S : Z
    //   4: ifeq -> 9
    //   7: iconst_1
    //   8: ireturn
    //   9: aload_1
    //   10: invokevirtual getAction : ()I
    //   13: istore_2
    //   14: iconst_0
    //   15: istore_3
    //   16: iload_2
    //   17: ifne -> 29
    //   20: aload_1
    //   21: invokevirtual getEdgeFlags : ()I
    //   24: ifeq -> 29
    //   27: iconst_0
    //   28: ireturn
    //   29: aload_0
    //   30: getfield j : Landroidx/viewpager/widget/a;
    //   33: astore #4
    //   35: aload #4
    //   37: ifnull -> 611
    //   40: aload #4
    //   42: invokevirtual e : ()I
    //   45: ifne -> 51
    //   48: goto -> 611
    //   51: aload_0
    //   52: getfield N : Landroid/view/VelocityTracker;
    //   55: ifnonnull -> 65
    //   58: aload_0
    //   59: invokestatic obtain : ()Landroid/view/VelocityTracker;
    //   62: putfield N : Landroid/view/VelocityTracker;
    //   65: aload_0
    //   66: getfield N : Landroid/view/VelocityTracker;
    //   69: aload_1
    //   70: invokevirtual addMovement : (Landroid/view/MotionEvent;)V
    //   73: aload_1
    //   74: invokevirtual getAction : ()I
    //   77: sipush #255
    //   80: iand
    //   81: istore_2
    //   82: iload_2
    //   83: ifeq -> 540
    //   86: iload_2
    //   87: iconst_1
    //   88: if_icmpeq -> 396
    //   91: iload_2
    //   92: iconst_2
    //   93: if_icmpeq -> 191
    //   96: iload_2
    //   97: iconst_3
    //   98: if_icmpeq -> 165
    //   101: iload_2
    //   102: iconst_5
    //   103: if_icmpeq -> 139
    //   106: iload_2
    //   107: bipush #6
    //   109: if_icmpeq -> 115
    //   112: goto -> 601
    //   115: aload_0
    //   116: aload_1
    //   117: invokespecial D : (Landroid/view/MotionEvent;)V
    //   120: aload_0
    //   121: aload_1
    //   122: aload_1
    //   123: aload_0
    //   124: getfield M : I
    //   127: invokevirtual findPointerIndex : (I)I
    //   130: invokevirtual getX : (I)F
    //   133: putfield I : F
    //   136: goto -> 601
    //   139: aload_1
    //   140: invokevirtual getActionIndex : ()I
    //   143: istore_2
    //   144: aload_0
    //   145: aload_1
    //   146: iload_2
    //   147: invokevirtual getX : (I)F
    //   150: putfield I : F
    //   153: aload_0
    //   154: aload_1
    //   155: iload_2
    //   156: invokevirtual getPointerId : (I)I
    //   159: putfield M : I
    //   162: goto -> 601
    //   165: aload_0
    //   166: getfield D : Z
    //   169: ifeq -> 601
    //   172: aload_0
    //   173: aload_0
    //   174: getfield k : I
    //   177: iconst_1
    //   178: iconst_0
    //   179: iconst_0
    //   180: invokespecial Q : (IZIZ)V
    //   183: aload_0
    //   184: invokespecial P : ()Z
    //   187: istore_3
    //   188: goto -> 601
    //   191: aload_0
    //   192: getfield D : Z
    //   195: ifne -> 367
    //   198: aload_1
    //   199: aload_0
    //   200: getfield M : I
    //   203: invokevirtual findPointerIndex : (I)I
    //   206: istore_2
    //   207: iload_2
    //   208: iconst_m1
    //   209: if_icmpne -> 220
    //   212: aload_0
    //   213: invokespecial P : ()Z
    //   216: istore_3
    //   217: goto -> 601
    //   220: aload_1
    //   221: iload_2
    //   222: invokevirtual getX : (I)F
    //   225: fstore #5
    //   227: fload #5
    //   229: aload_0
    //   230: getfield I : F
    //   233: fsub
    //   234: invokestatic abs : (F)F
    //   237: fstore #6
    //   239: aload_1
    //   240: iload_2
    //   241: invokevirtual getY : (I)F
    //   244: fstore #7
    //   246: fload #7
    //   248: aload_0
    //   249: getfield J : F
    //   252: fsub
    //   253: invokestatic abs : (F)F
    //   256: fstore #8
    //   258: fload #6
    //   260: aload_0
    //   261: getfield H : I
    //   264: i2f
    //   265: fcmpl
    //   266: ifle -> 367
    //   269: fload #6
    //   271: fload #8
    //   273: fcmpl
    //   274: ifle -> 367
    //   277: aload_0
    //   278: iconst_1
    //   279: putfield D : Z
    //   282: aload_0
    //   283: iconst_1
    //   284: invokespecial O : (Z)V
    //   287: aload_0
    //   288: getfield K : F
    //   291: fstore #8
    //   293: fload #5
    //   295: fload #8
    //   297: fsub
    //   298: fconst_0
    //   299: fcmpl
    //   300: ifle -> 316
    //   303: fload #8
    //   305: aload_0
    //   306: getfield H : I
    //   309: i2f
    //   310: fadd
    //   311: fstore #5
    //   313: goto -> 326
    //   316: fload #8
    //   318: aload_0
    //   319: getfield H : I
    //   322: i2f
    //   323: fsub
    //   324: fstore #5
    //   326: aload_0
    //   327: fload #5
    //   329: putfield I : F
    //   332: aload_0
    //   333: fload #7
    //   335: putfield J : F
    //   338: aload_0
    //   339: iconst_1
    //   340: invokevirtual setScrollState : (I)V
    //   343: aload_0
    //   344: iconst_1
    //   345: invokespecial setScrollingCacheEnabled : (Z)V
    //   348: aload_0
    //   349: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   352: astore #4
    //   354: aload #4
    //   356: ifnull -> 367
    //   359: aload #4
    //   361: iconst_1
    //   362: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   367: aload_0
    //   368: getfield D : Z
    //   371: ifeq -> 601
    //   374: iconst_0
    //   375: aload_0
    //   376: aload_1
    //   377: aload_1
    //   378: aload_0
    //   379: getfield M : I
    //   382: invokevirtual findPointerIndex : (I)I
    //   385: invokevirtual getX : (I)F
    //   388: invokespecial H : (F)Z
    //   391: ior
    //   392: istore_3
    //   393: goto -> 601
    //   396: aload_0
    //   397: getfield D : Z
    //   400: ifeq -> 601
    //   403: aload_0
    //   404: getfield N : Landroid/view/VelocityTracker;
    //   407: astore #4
    //   409: aload #4
    //   411: sipush #1000
    //   414: aload_0
    //   415: getfield P : I
    //   418: i2f
    //   419: invokevirtual computeCurrentVelocity : (IF)V
    //   422: aload #4
    //   424: aload_0
    //   425: getfield M : I
    //   428: invokevirtual getXVelocity : (I)F
    //   431: f2i
    //   432: istore #9
    //   434: aload_0
    //   435: iconst_1
    //   436: putfield B : Z
    //   439: aload_0
    //   440: invokespecial getClientWidth : ()I
    //   443: istore_2
    //   444: aload_0
    //   445: invokevirtual getScrollX : ()I
    //   448: istore #10
    //   450: aload_0
    //   451: invokespecial w : ()Landroidx/viewpager/widget/ViewPager$f;
    //   454: astore #4
    //   456: aload_0
    //   457: getfield r : I
    //   460: i2f
    //   461: fstore #7
    //   463: iload_2
    //   464: i2f
    //   465: fstore #5
    //   467: fload #7
    //   469: fload #5
    //   471: fdiv
    //   472: fstore #7
    //   474: aload_0
    //   475: aload_0
    //   476: aload #4
    //   478: getfield b : I
    //   481: iload #10
    //   483: i2f
    //   484: fload #5
    //   486: fdiv
    //   487: aload #4
    //   489: getfield e : F
    //   492: fsub
    //   493: aload #4
    //   495: getfield d : F
    //   498: fload #7
    //   500: fadd
    //   501: fdiv
    //   502: iload #9
    //   504: aload_1
    //   505: aload_1
    //   506: aload_0
    //   507: getfield M : I
    //   510: invokevirtual findPointerIndex : (I)I
    //   513: invokevirtual getX : (I)F
    //   516: aload_0
    //   517: getfield K : F
    //   520: fsub
    //   521: f2i
    //   522: invokespecial j : (IFII)I
    //   525: iconst_1
    //   526: iconst_1
    //   527: iload #9
    //   529: invokevirtual S : (IZZI)V
    //   532: aload_0
    //   533: invokespecial P : ()Z
    //   536: istore_3
    //   537: goto -> 601
    //   540: aload_0
    //   541: getfield o : Landroid/widget/Scroller;
    //   544: invokevirtual abortAnimation : ()V
    //   547: aload_0
    //   548: iconst_0
    //   549: putfield B : Z
    //   552: aload_0
    //   553: invokevirtual I : ()V
    //   556: aload_1
    //   557: invokevirtual getX : ()F
    //   560: fstore #5
    //   562: aload_0
    //   563: fload #5
    //   565: putfield K : F
    //   568: aload_0
    //   569: fload #5
    //   571: putfield I : F
    //   574: aload_1
    //   575: invokevirtual getY : ()F
    //   578: fstore #5
    //   580: aload_0
    //   581: fload #5
    //   583: putfield L : F
    //   586: aload_0
    //   587: fload #5
    //   589: putfield J : F
    //   592: aload_0
    //   593: aload_1
    //   594: iconst_0
    //   595: invokevirtual getPointerId : (I)I
    //   598: putfield M : I
    //   601: iload_3
    //   602: ifeq -> 609
    //   605: aload_0
    //   606: invokestatic h0 : (Landroid/view/View;)V
    //   609: iconst_1
    //   610: ireturn
    //   611: iconst_0
    //   612: ireturn
  }
  
  public void q() {
    if (this.S) {
      if (this.j != null) {
        VelocityTracker velocityTracker = this.N;
        velocityTracker.computeCurrentVelocity(1000, this.P);
        int m = (int)velocityTracker.getXVelocity(this.M);
        this.B = true;
        int n = getClientWidth();
        int i1 = getScrollX();
        f f1 = w();
        S(j(f1.b, (i1 / n - f1.e) / f1.d, m, (int)(this.I - this.K)), true, true, m);
      } 
      p();
      this.S = false;
      return;
    } 
    throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
  }
  
  public boolean r(KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getAction : ()I
    //   4: ifne -> 118
    //   7: aload_1
    //   8: invokevirtual getKeyCode : ()I
    //   11: istore_2
    //   12: iload_2
    //   13: bipush #21
    //   15: if_icmpeq -> 92
    //   18: iload_2
    //   19: bipush #22
    //   21: if_icmpeq -> 66
    //   24: iload_2
    //   25: bipush #61
    //   27: if_icmpeq -> 33
    //   30: goto -> 118
    //   33: aload_1
    //   34: invokevirtual hasNoModifiers : ()Z
    //   37: ifeq -> 49
    //   40: aload_0
    //   41: iconst_2
    //   42: invokevirtual d : (I)Z
    //   45: istore_3
    //   46: goto -> 120
    //   49: aload_1
    //   50: iconst_1
    //   51: invokevirtual hasModifiers : (I)Z
    //   54: ifeq -> 118
    //   57: aload_0
    //   58: iconst_1
    //   59: invokevirtual d : (I)Z
    //   62: istore_3
    //   63: goto -> 120
    //   66: aload_1
    //   67: iconst_2
    //   68: invokevirtual hasModifiers : (I)Z
    //   71: ifeq -> 82
    //   74: aload_0
    //   75: invokevirtual F : ()Z
    //   78: istore_3
    //   79: goto -> 120
    //   82: aload_0
    //   83: bipush #66
    //   85: invokevirtual d : (I)Z
    //   88: istore_3
    //   89: goto -> 120
    //   92: aload_1
    //   93: iconst_2
    //   94: invokevirtual hasModifiers : (I)Z
    //   97: ifeq -> 108
    //   100: aload_0
    //   101: invokevirtual E : ()Z
    //   104: istore_3
    //   105: goto -> 120
    //   108: aload_0
    //   109: bipush #17
    //   111: invokevirtual d : (I)Z
    //   114: istore_3
    //   115: goto -> 120
    //   118: iconst_0
    //   119: istore_3
    //   120: iload_3
    //   121: ireturn
  }
  
  public void removeView(View paramView) {
    if (this.z) {
      removeViewInLayout(paramView);
    } else {
      super.removeView(paramView);
    } 
  }
  
  public void s(float paramFloat) {
    if (this.S) {
      if (this.j == null)
        return; 
      this.I += paramFloat;
      float f1 = getScrollX() - paramFloat;
      float f2 = getClientWidth();
      paramFloat = this.v * f2;
      float f3 = this.w * f2;
      f f4 = this.g.get(0);
      ArrayList<f> arrayList = this.g;
      f f5 = arrayList.get(arrayList.size() - 1);
      if (f4.b != 0)
        paramFloat = f4.e * f2; 
      if (f5.b != this.j.e() - 1)
        f3 = f5.e * f2; 
      if (f1 >= paramFloat) {
        paramFloat = f1;
        if (f1 > f3)
          paramFloat = f3; 
      } 
      f3 = this.I;
      int m = (int)paramFloat;
      this.I = f3 + paramFloat - m;
      scrollTo(m, getScrollY());
      G(m);
      long l1 = SystemClock.uptimeMillis();
      MotionEvent motionEvent = MotionEvent.obtain(this.T, l1, 2, this.I, 0.0F, 0);
      this.N.addMovement(motionEvent);
      motionEvent.recycle();
      return;
    } 
    throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
  }
  
  public void setAdapter(a parama) {
    a a1 = this.j;
    byte b = 0;
    if (a1 != null) {
      a1.r(null);
      this.j.t(this);
      for (byte b1 = 0; b1 < this.g.size(); b1++) {
        f f1 = this.g.get(b1);
        this.j.b(this, f1.b, f1.a);
      } 
      this.j.d(this);
      this.g.clear();
      L();
      this.k = 0;
      scrollTo(0, 0);
    } 
    a a2 = this.j;
    this.j = parama;
    this.f = 0;
    if (parama != null) {
      if (this.q == null)
        this.q = new k(this); 
      this.j.r(this.q);
      this.B = false;
      boolean bool = this.W;
      this.W = true;
      this.f = this.j.e();
      if (this.l >= 0) {
        this.j.n(this.m, this.n);
        R(this.l, false, true);
        this.l = -1;
        this.m = null;
        this.n = null;
      } else if (!bool) {
        I();
      } else {
        requestLayout();
      } 
    } 
    List<h> list = this.g0;
    if (list != null && !list.isEmpty()) {
      int m = this.g0.size();
      for (byte b1 = b; b1 < m; b1++)
        ((h)this.g0.get(b1)).b(this, a2, parama); 
    } 
  }
  
  public void setCurrentItem(int paramInt) {
    this.B = false;
    R(paramInt, this.W ^ true, false);
  }
  
  public void setCurrentItem(int paramInt, boolean paramBoolean) {
    this.B = false;
    R(paramInt, paramBoolean, false);
  }
  
  public void setOffscreenPageLimit(int paramInt) {
    int m = paramInt;
    if (paramInt < 1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Requested offscreen page limit ");
      stringBuilder.append(paramInt);
      stringBuilder.append(" too small; defaulting to ");
      stringBuilder.append(1);
      Log.w("ViewPager", stringBuilder.toString());
      m = 1;
    } 
    if (m != this.C) {
      this.C = m;
      I();
    } 
  }
  
  @Deprecated
  public void setOnPageChangeListener(i parami) {
    this.e0 = parami;
  }
  
  public void setPageMargin(int paramInt) {
    int m = this.r;
    this.r = paramInt;
    int n = getWidth();
    K(n, n, paramInt, m);
    requestLayout();
  }
  
  public void setPageMarginDrawable(int paramInt) {
    setPageMarginDrawable(androidx.core.content.a.f(getContext(), paramInt));
  }
  
  public void setPageMarginDrawable(Drawable paramDrawable) {
    boolean bool;
    this.s = paramDrawable;
    if (paramDrawable != null)
      refreshDrawableState(); 
    if (paramDrawable == null) {
      bool = true;
    } else {
      bool = false;
    } 
    setWillNotDraw(bool);
    invalidate();
  }
  
  public void setPageTransformer(boolean paramBoolean, j paramj) {
    setPageTransformer(paramBoolean, paramj, 2);
  }
  
  public void setPageTransformer(boolean paramBoolean, j paramj, int paramInt) {
    boolean bool1;
    boolean bool2;
    boolean bool3;
    byte b = 1;
    if (paramj != null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (this.h0 != null) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (bool1 != bool2) {
      bool3 = true;
    } else {
      bool3 = false;
    } 
    this.h0 = paramj;
    setChildrenDrawingOrderEnabled(bool1);
    if (bool1) {
      if (paramBoolean)
        b = 2; 
      this.j0 = b;
      this.i0 = paramInt;
    } else {
      this.j0 = 0;
    } 
    if (bool3)
      I(); 
  }
  
  void setScrollState(int paramInt) {
    if (this.m0 == paramInt)
      return; 
    this.m0 = paramInt;
    if (this.h0 != null) {
      boolean bool;
      if (paramInt != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      o(bool);
    } 
    m(paramInt);
  }
  
  f u(View paramView) {
    while (true) {
      ViewParent viewParent = paramView.getParent();
      if (viewParent != this) {
        if (viewParent != null) {
          if (!(viewParent instanceof View))
            return null; 
          paramView = (View)viewParent;
          continue;
        } 
        continue;
      } 
      return v(paramView);
    } 
  }
  
  f v(View paramView) {
    for (byte b = 0; b < this.g.size(); b++) {
      f f1 = this.g.get(b);
      if (this.j.k(paramView, f1.a))
        return f1; 
    } 
    return null;
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable) {
    return (super.verifyDrawable(paramDrawable) || paramDrawable == this.s);
  }
  
  f x(int paramInt) {
    for (byte b = 0; b < this.g.size(); b++) {
      f f1 = this.g.get(b);
      if (f1.b == paramInt)
        return f1; 
    } 
    return null;
  }
  
  void y() {
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    setFocusable(true);
    Context context = getContext();
    this.o = new Scroller(context, d);
    ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
    float f1 = (context.getResources().getDisplayMetrics()).density;
    this.H = viewConfiguration.getScaledPagingTouchSlop();
    this.O = (int)(400.0F * f1);
    this.P = viewConfiguration.getScaledMaximumFlingVelocity();
    this.U = new EdgeEffect(context);
    this.V = new EdgeEffect(context);
    this.Q = (int)(25.0F * f1);
    this.R = (int)(2.0F * f1);
    this.F = (int)(f1 * 16.0F);
    w.r0((View)this, new g(this));
    if (w.A((View)this) == 0)
      w.B0((View)this, 1); 
    w.E0((View)this, new d(this));
  }
  
  public static class LayoutParams extends ViewGroup.LayoutParams {
    public boolean a;
    
    public int b;
    
    float c = 0.0F;
    
    boolean d;
    
    int e;
    
    int f;
    
    public LayoutParams() {
      super(-1, -1);
    }
    
    public LayoutParams(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, ViewPager.b);
      this.b = typedArray.getInteger(0, 48);
      typedArray.recycle();
    }
  }
  
  public static class SavedState extends AbsSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = (Parcelable.Creator<SavedState>)new a();
    
    int d;
    
    Parcelable e;
    
    ClassLoader f;
    
    SavedState(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      ClassLoader classLoader = param1ClassLoader;
      if (param1ClassLoader == null)
        classLoader = getClass().getClassLoader(); 
      this.d = param1Parcel.readInt();
      this.e = param1Parcel.readParcelable(classLoader);
      this.f = classLoader;
    }
    
    public SavedState(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("FragmentPager.SavedState{");
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append(" position=");
      stringBuilder.append(this.d);
      stringBuilder.append("}");
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeInt(this.d);
      param1Parcel.writeParcelable(this.e, param1Int);
    }
    
    static final class a implements Parcelable.ClassLoaderCreator<SavedState> {
      public ViewPager.SavedState a(Parcel param2Parcel) {
        return new ViewPager.SavedState(param2Parcel, null);
      }
      
      public ViewPager.SavedState b(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new ViewPager.SavedState(param2Parcel, param2ClassLoader);
      }
      
      public ViewPager.SavedState[] c(int param2Int) {
        return new ViewPager.SavedState[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.ClassLoaderCreator<SavedState> {
    public ViewPager.SavedState a(Parcel param1Parcel) {
      return new ViewPager.SavedState(param1Parcel, null);
    }
    
    public ViewPager.SavedState b(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new ViewPager.SavedState(param1Parcel, param1ClassLoader);
    }
    
    public ViewPager.SavedState[] c(int param1Int) {
      return new ViewPager.SavedState[param1Int];
    }
  }
  
  static final class a implements Comparator<f> {
    public int a(ViewPager.f param1f1, ViewPager.f param1f2) {
      return param1f1.b - param1f2.b;
    }
  }
  
  static final class b implements Interpolator {
    public float getInterpolation(float param1Float) {
      param1Float--;
      return param1Float * param1Float * param1Float * param1Float * param1Float + 1.0F;
    }
  }
  
  class c implements Runnable {
    c(ViewPager this$0) {}
    
    public void run() {
      this.b.setScrollState(0);
      this.b.I();
    }
  }
  
  class d implements q {
    private final Rect a = new Rect();
    
    d(ViewPager this$0) {}
    
    public e0 a(View param1View, e0 param1e0) {
      param1e0 = w.c0(param1View, param1e0);
      if (param1e0.m())
        return param1e0; 
      Rect rect = this.a;
      rect.left = param1e0.g();
      rect.top = param1e0.i();
      rect.right = param1e0.h();
      rect.bottom = param1e0.f();
      byte b = 0;
      int i = this.b.getChildCount();
      while (b < i) {
        e0 e01 = w.h(this.b.getChildAt(b), param1e0);
        rect.left = Math.min(e01.g(), rect.left);
        rect.top = Math.min(e01.i(), rect.top);
        rect.right = Math.min(e01.h(), rect.right);
        rect.bottom = Math.min(e01.f(), rect.bottom);
        b++;
      } 
      return param1e0.n(rect.left, rect.top, rect.right, rect.bottom);
    }
  }
  
  @Inherited
  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.TYPE})
  public static @interface e {}
  
  static class f {
    Object a;
    
    int b;
    
    boolean c;
    
    float d;
    
    float e;
  }
  
  class g extends b.h.k.a {
    g(ViewPager this$0) {}
    
    private boolean n() {
      a a1 = this.d.j;
      boolean bool = true;
      if (a1 == null || a1.e() <= 1)
        bool = false; 
      return bool;
    }
    
    public void f(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      super.f(param1View, param1AccessibilityEvent);
      param1AccessibilityEvent.setClassName(ViewPager.class.getName());
      param1AccessibilityEvent.setScrollable(n());
      if (param1AccessibilityEvent.getEventType() == 4096) {
        a a1 = this.d.j;
        if (a1 != null) {
          param1AccessibilityEvent.setItemCount(a1.e());
          param1AccessibilityEvent.setFromIndex(this.d.k);
          param1AccessibilityEvent.setToIndex(this.d.k);
        } 
      } 
    }
    
    public void g(View param1View, b.h.k.f0.c param1c) {
      super.g(param1View, param1c);
      param1c.c0(ViewPager.class.getName());
      param1c.x0(n());
      if (this.d.canScrollHorizontally(1))
        param1c.a(4096); 
      if (this.d.canScrollHorizontally(-1))
        param1c.a(8192); 
    }
    
    public boolean j(View param1View, int param1Int, Bundle param1Bundle) {
      if (super.j(param1View, param1Int, param1Bundle))
        return true; 
      if (param1Int != 4096) {
        if (param1Int != 8192)
          return false; 
        if (this.d.canScrollHorizontally(-1)) {
          ViewPager viewPager = this.d;
          viewPager.setCurrentItem(viewPager.k - 1);
          return true;
        } 
        return false;
      } 
      if (this.d.canScrollHorizontally(1)) {
        ViewPager viewPager = this.d;
        viewPager.setCurrentItem(viewPager.k + 1);
        return true;
      } 
      return false;
    }
  }
  
  public static interface h {
    void b(ViewPager param1ViewPager, a param1a1, a param1a2);
  }
  
  public static interface i {
    void a(int param1Int1, float param1Float, int param1Int2);
    
    void c(int param1Int);
    
    void d(int param1Int);
  }
  
  public static interface j {
    void a(View param1View, float param1Float);
  }
  
  private class k extends DataSetObserver {
    k(ViewPager this$0) {}
    
    public void onChanged() {
      this.a.i();
    }
    
    public void onInvalidated() {
      this.a.i();
    }
  }
  
  static class l implements Comparator<View> {
    public int a(View param1View1, View param1View2) {
      ViewPager.LayoutParams layoutParams1 = (ViewPager.LayoutParams)param1View1.getLayoutParams();
      ViewPager.LayoutParams layoutParams2 = (ViewPager.LayoutParams)param1View2.getLayoutParams();
      boolean bool = layoutParams1.a;
      if (bool != layoutParams2.a) {
        byte b;
        if (bool) {
          b = 1;
        } else {
          b = -1;
        } 
        return b;
      } 
      return layoutParams1.e - layoutParams2.e;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/viewpager/widget/ViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */