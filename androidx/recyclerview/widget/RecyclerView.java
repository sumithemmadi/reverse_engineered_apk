package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import b.h.k.k;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements k {
  private static final int[] b = new int[] { 16843830 };
  
  static final boolean c;
  
  static final boolean d;
  
  static final boolean e;
  
  static final boolean f;
  
  private static final boolean g;
  
  private static final boolean h;
  
  private static final Class<?>[] i;
  
  static final Interpolator j = new c();
  
  private final ArrayList<r> A;
  
  private j A0;
  
  private r B;
  
  private final int[] B0;
  
  boolean C;
  
  private b.h.k.l C0;
  
  boolean D;
  
  private final int[] D0;
  
  boolean E;
  
  private final int[] E0;
  
  boolean F;
  
  final int[] F0;
  
  private int G;
  
  final List<b0> G0;
  
  boolean H;
  
  private Runnable H0;
  
  boolean I;
  
  private boolean I0;
  
  private boolean J;
  
  private int J0;
  
  private int K;
  
  private int K0;
  
  boolean L;
  
  private final p.b L0;
  
  private final AccessibilityManager M;
  
  private List<p> N;
  
  boolean O;
  
  boolean P;
  
  private int Q;
  
  private int R;
  
  private k S;
  
  private EdgeEffect T;
  
  private EdgeEffect U;
  
  private EdgeEffect V;
  
  private EdgeEffect W;
  
  l a0;
  
  private int b0;
  
  private int c0;
  
  private VelocityTracker d0;
  
  private int e0;
  
  private int f0;
  
  private int g0;
  
  private int h0;
  
  private int i0;
  
  private q j0;
  
  private final w k;
  
  private final int k0;
  
  final u l;
  
  private final int l0;
  
  SavedState m;
  
  private float m0;
  
  a n;
  
  private float n0;
  
  b o;
  
  private boolean o0;
  
  final p p;
  
  final a0 p0;
  
  boolean q;
  
  e q0;
  
  final Runnable r;
  
  e.b r0;
  
  final Rect s;
  
  final y s0;
  
  private final Rect t;
  
  private s t0;
  
  final RectF u;
  
  private List<s> u0;
  
  Adapter v;
  
  boolean v0;
  
  o w;
  
  boolean w0;
  
  v x;
  
  private l.b x0;
  
  final List<v> y;
  
  boolean y0;
  
  final ArrayList<n> z;
  
  k z0;
  
  public RecyclerView(Context paramContext) {
    this(paramContext, null);
  }
  
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.q.a.recyclerViewStyle);
  }
  
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    e.b b1;
    this.k = new w(this);
    this.l = new u(this);
    this.p = new p();
    this.r = new a(this);
    this.s = new Rect();
    this.t = new Rect();
    this.u = new RectF();
    this.y = new ArrayList<v>();
    this.z = new ArrayList<n>();
    this.A = new ArrayList<r>();
    this.G = 0;
    this.O = false;
    this.P = false;
    this.Q = 0;
    this.R = 0;
    this.S = new k();
    this.a0 = new c();
    this.b0 = 0;
    this.c0 = -1;
    this.m0 = Float.MIN_VALUE;
    this.n0 = Float.MIN_VALUE;
    boolean bool = true;
    this.o0 = true;
    this.p0 = new a0(this);
    if (f) {
      b1 = new e.b();
    } else {
      b1 = null;
    } 
    this.r0 = b1;
    this.s0 = new y();
    this.v0 = false;
    this.w0 = false;
    this.x0 = new m(this);
    this.y0 = false;
    this.B0 = new int[2];
    this.D0 = new int[2];
    this.E0 = new int[2];
    this.F0 = new int[2];
    this.G0 = new ArrayList<b0>();
    this.H0 = new b(this);
    this.J0 = 0;
    this.K0 = 0;
    this.L0 = new d(this);
    setScrollContainer(true);
    setFocusableInTouchMode(true);
    ViewConfiguration viewConfiguration = ViewConfiguration.get(paramContext);
    this.i0 = viewConfiguration.getScaledTouchSlop();
    this.m0 = b.h.k.x.b(viewConfiguration, paramContext);
    this.n0 = b.h.k.x.e(viewConfiguration, paramContext);
    this.k0 = viewConfiguration.getScaledMinimumFlingVelocity();
    this.l0 = viewConfiguration.getScaledMaximumFlingVelocity();
    if (getOverScrollMode() == 2) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    setWillNotDraw(bool1);
    this.a0.v(this.x0);
    o0();
    q0();
    p0();
    if (b.h.k.w.A((View)this) == 0)
      b.h.k.w.B0((View)this, 1); 
    this.M = (AccessibilityManager)getContext().getSystemService("accessibility");
    setAccessibilityDelegateCompat(new k(this));
    int[] arrayOfInt = b.q.c.RecyclerView;
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt, 0);
    b.h.k.w.p0((View)this, paramContext, arrayOfInt, paramAttributeSet, typedArray, paramInt, 0);
    String str = typedArray.getString(b.q.c.RecyclerView_layoutManager);
    if (typedArray.getInt(b.q.c.RecyclerView_android_descendantFocusability, -1) == -1)
      setDescendantFocusability(262144); 
    this.q = typedArray.getBoolean(b.q.c.RecyclerView_android_clipToPadding, true);
    boolean bool1 = typedArray.getBoolean(b.q.c.RecyclerView_fastScrollEnabled, false);
    this.E = bool1;
    if (bool1)
      r0((StateListDrawable)typedArray.getDrawable(b.q.c.RecyclerView_fastScrollVerticalThumbDrawable), typedArray.getDrawable(b.q.c.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable)typedArray.getDrawable(b.q.c.RecyclerView_fastScrollHorizontalThumbDrawable), typedArray.getDrawable(b.q.c.RecyclerView_fastScrollHorizontalTrackDrawable)); 
    typedArray.recycle();
    w(paramContext, str, paramAttributeSet, paramInt, 0);
    bool1 = bool;
    if (Build.VERSION.SDK_INT >= 21) {
      int[] arrayOfInt1 = b;
      TypedArray typedArray1 = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt1, paramInt, 0);
      b.h.k.w.p0((View)this, paramContext, arrayOfInt1, paramAttributeSet, typedArray1, paramInt, 0);
      bool1 = typedArray1.getBoolean(0, true);
      typedArray1.recycle();
    } 
    setNestedScrollingEnabled(bool1);
  }
  
  private void B() {
    int i = this.K;
    this.K = 0;
    if (i != 0 && t0()) {
      AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain();
      accessibilityEvent.setEventType(2048);
      b.h.k.f0.b.b(accessibilityEvent, i);
      sendAccessibilityEventUnchecked(accessibilityEvent);
    } 
  }
  
  private void D() {
    y y1 = this.s0;
    boolean bool = true;
    y1.a(1);
    R(this.s0);
    this.s0.j = false;
    r1();
    this.p.f();
    H0();
    P0();
    e1();
    y1 = this.s0;
    if (!y1.k || !this.w0)
      bool = false; 
    y1.i = bool;
    this.w0 = false;
    this.v0 = false;
    y1.h = y1.l;
    y1.f = this.v.d();
    V(this.B0);
    if (this.s0.k) {
      int i = this.o.g();
      for (byte b1 = 0; b1 < i; b1++) {
        b0 b0 = g0(this.o.f(b1));
        if (!b0.J() && (!b0.t() || this.v.h())) {
          l.c c = this.a0.t(this.s0, b0, l.e(b0), b0.o());
          this.p.e(b0, c);
          if (this.s0.i && b0.y() && !b0.v() && !b0.J() && !b0.t()) {
            long l1 = d0(b0);
            this.p.c(l1, b0);
          } 
        } 
      } 
    } 
    if (this.s0.l) {
      f1();
      y1 = this.s0;
      bool = y1.g;
      y1.g = false;
      this.w.X0(this.l, y1);
      this.s0.g = bool;
      for (byte b1 = 0; b1 < this.o.g(); b1++) {
        b0 b0 = g0(this.o.f(b1));
        if (!b0.J() && !this.p.i(b0)) {
          int m = l.e(b0);
          bool = b0.p(8192);
          int i = m;
          if (!bool)
            i = m | 0x1000; 
          l.c c = this.a0.t(this.s0, b0, i, b0.o());
          if (bool) {
            S0(b0, c);
          } else {
            this.p.a(b0, c);
          } 
        } 
      } 
      t();
    } else {
      t();
    } 
    I0();
    t1(false);
    this.s0.e = 2;
  }
  
  private void E() {
    boolean bool;
    r1();
    H0();
    this.s0.a(6);
    this.n.j();
    this.s0.f = this.v.d();
    this.s0.d = 0;
    if (this.m != null && this.v.b()) {
      Parcelable parcelable = this.m.d;
      if (parcelable != null)
        this.w.c1(parcelable); 
      this.m = null;
    } 
    y y1 = this.s0;
    y1.h = false;
    this.w.X0(this.l, y1);
    y1 = this.s0;
    y1.g = false;
    if (y1.k && this.a0 != null) {
      bool = true;
    } else {
      bool = false;
    } 
    y1.k = bool;
    y1.e = 4;
    I0();
    t1(false);
  }
  
  private void F() {
    this.s0.a(4);
    r1();
    H0();
    y y1 = this.s0;
    y1.e = 1;
    if (y1.k) {
      for (int i = this.o.g() - 1; i >= 0; i--) {
        b0 b0 = g0(this.o.f(i));
        if (!b0.J()) {
          long l1 = d0(b0);
          l.c c = this.a0.s(this.s0, b0);
          b0 b01 = this.p.g(l1);
          if (b01 != null && !b01.J()) {
            boolean bool1 = this.p.h(b01);
            boolean bool2 = this.p.h(b0);
            if (bool1 && b01 == b0) {
              this.p.d(b0, c);
            } else {
              l.c c1 = this.p.n(b01);
              this.p.d(b0, c);
              c = this.p.m(b0);
              if (c1 == null) {
                l0(l1, b0, b01);
              } else {
                n(b01, b0, c1, c, bool1, bool2);
              } 
            } 
          } else {
            this.p.d(b0, c);
          } 
        } 
      } 
      this.p.o(this.L0);
    } 
    this.w.l1(this.l);
    y1 = this.s0;
    y1.c = y1.f;
    this.O = false;
    this.P = false;
    y1.k = false;
    y1.l = false;
    this.w.h = false;
    ArrayList<b0> arrayList = this.l.b;
    if (arrayList != null)
      arrayList.clear(); 
    o o1 = this.w;
    if (o1.n) {
      o1.m = 0;
      o1.n = false;
      this.l.K();
    } 
    this.w.Y0(this.s0);
    I0();
    t1(false);
    this.p.f();
    int[] arrayOfInt = this.B0;
    if (y(arrayOfInt[0], arrayOfInt[1]))
      J(0, 0); 
    T0();
    c1();
  }
  
  private void K0(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i) == this.c0) {
      if (i == 0) {
        i = 1;
      } else {
        i = 0;
      } 
      this.c0 = paramMotionEvent.getPointerId(i);
      int m = (int)(paramMotionEvent.getX(i) + 0.5F);
      this.g0 = m;
      this.e0 = m;
      i = (int)(paramMotionEvent.getY(i) + 0.5F);
      this.h0 = i;
      this.f0 = i;
    } 
  }
  
  private boolean L(MotionEvent paramMotionEvent) {
    r r1 = this.B;
    if (r1 == null)
      return (paramMotionEvent.getAction() == 0) ? false : U(paramMotionEvent); 
    r1.a(this, paramMotionEvent);
    int i = paramMotionEvent.getAction();
    if (i == 3 || i == 1)
      this.B = null; 
    return true;
  }
  
  private boolean O0() {
    boolean bool;
    if (this.a0 != null && this.w.M1()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void P0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield O : Z
    //   4: ifeq -> 29
    //   7: aload_0
    //   8: getfield n : Landroidx/recyclerview/widget/a;
    //   11: invokevirtual x : ()V
    //   14: aload_0
    //   15: getfield P : Z
    //   18: ifeq -> 29
    //   21: aload_0
    //   22: getfield w : Landroidx/recyclerview/widget/RecyclerView$o;
    //   25: aload_0
    //   26: invokevirtual S0 : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   29: aload_0
    //   30: invokespecial O0 : ()Z
    //   33: ifeq -> 46
    //   36: aload_0
    //   37: getfield n : Landroidx/recyclerview/widget/a;
    //   40: invokevirtual v : ()V
    //   43: goto -> 53
    //   46: aload_0
    //   47: getfield n : Landroidx/recyclerview/widget/a;
    //   50: invokevirtual j : ()V
    //   53: aload_0
    //   54: getfield v0 : Z
    //   57: istore_1
    //   58: iconst_0
    //   59: istore_2
    //   60: iload_1
    //   61: ifne -> 79
    //   64: aload_0
    //   65: getfield w0 : Z
    //   68: ifeq -> 74
    //   71: goto -> 79
    //   74: iconst_0
    //   75: istore_3
    //   76: goto -> 81
    //   79: iconst_1
    //   80: istore_3
    //   81: aload_0
    //   82: getfield s0 : Landroidx/recyclerview/widget/RecyclerView$y;
    //   85: astore #4
    //   87: aload_0
    //   88: getfield F : Z
    //   91: ifeq -> 143
    //   94: aload_0
    //   95: getfield a0 : Landroidx/recyclerview/widget/RecyclerView$l;
    //   98: ifnull -> 143
    //   101: aload_0
    //   102: getfield O : Z
    //   105: istore_1
    //   106: iload_1
    //   107: ifne -> 124
    //   110: iload_3
    //   111: ifne -> 124
    //   114: aload_0
    //   115: getfield w : Landroidx/recyclerview/widget/RecyclerView$o;
    //   118: getfield h : Z
    //   121: ifeq -> 143
    //   124: iload_1
    //   125: ifeq -> 138
    //   128: aload_0
    //   129: getfield v : Landroidx/recyclerview/widget/RecyclerView$Adapter;
    //   132: invokevirtual h : ()Z
    //   135: ifeq -> 143
    //   138: iconst_1
    //   139: istore_1
    //   140: goto -> 145
    //   143: iconst_0
    //   144: istore_1
    //   145: aload #4
    //   147: iload_1
    //   148: putfield k : Z
    //   151: aload_0
    //   152: getfield s0 : Landroidx/recyclerview/widget/RecyclerView$y;
    //   155: astore #4
    //   157: iload_2
    //   158: istore_1
    //   159: aload #4
    //   161: getfield k : Z
    //   164: ifeq -> 193
    //   167: iload_2
    //   168: istore_1
    //   169: iload_3
    //   170: ifeq -> 193
    //   173: iload_2
    //   174: istore_1
    //   175: aload_0
    //   176: getfield O : Z
    //   179: ifne -> 193
    //   182: iload_2
    //   183: istore_1
    //   184: aload_0
    //   185: invokespecial O0 : ()Z
    //   188: ifeq -> 193
    //   191: iconst_1
    //   192: istore_1
    //   193: aload #4
    //   195: iload_1
    //   196: putfield l : Z
    //   199: return
  }
  
  private void R0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    // Byte code:
    //   0: iconst_1
    //   1: istore #5
    //   3: fload_2
    //   4: fconst_0
    //   5: fcmpg
    //   6: ifge -> 43
    //   9: aload_0
    //   10: invokevirtual N : ()V
    //   13: aload_0
    //   14: getfield T : Landroid/widget/EdgeEffect;
    //   17: fload_2
    //   18: fneg
    //   19: aload_0
    //   20: invokevirtual getWidth : ()I
    //   23: i2f
    //   24: fdiv
    //   25: fconst_1
    //   26: fload_3
    //   27: aload_0
    //   28: invokevirtual getHeight : ()I
    //   31: i2f
    //   32: fdiv
    //   33: fsub
    //   34: invokestatic a : (Landroid/widget/EdgeEffect;FF)V
    //   37: iconst_1
    //   38: istore #6
    //   40: goto -> 80
    //   43: fload_2
    //   44: fconst_0
    //   45: fcmpl
    //   46: ifle -> 77
    //   49: aload_0
    //   50: invokevirtual O : ()V
    //   53: aload_0
    //   54: getfield V : Landroid/widget/EdgeEffect;
    //   57: fload_2
    //   58: aload_0
    //   59: invokevirtual getWidth : ()I
    //   62: i2f
    //   63: fdiv
    //   64: fload_3
    //   65: aload_0
    //   66: invokevirtual getHeight : ()I
    //   69: i2f
    //   70: fdiv
    //   71: invokestatic a : (Landroid/widget/EdgeEffect;FF)V
    //   74: goto -> 37
    //   77: iconst_0
    //   78: istore #6
    //   80: fload #4
    //   82: fconst_0
    //   83: fcmpg
    //   84: ifge -> 121
    //   87: aload_0
    //   88: invokevirtual P : ()V
    //   91: aload_0
    //   92: getfield U : Landroid/widget/EdgeEffect;
    //   95: fload #4
    //   97: fneg
    //   98: aload_0
    //   99: invokevirtual getHeight : ()I
    //   102: i2f
    //   103: fdiv
    //   104: fload_1
    //   105: aload_0
    //   106: invokevirtual getWidth : ()I
    //   109: i2f
    //   110: fdiv
    //   111: invokestatic a : (Landroid/widget/EdgeEffect;FF)V
    //   114: iload #5
    //   116: istore #6
    //   118: goto -> 163
    //   121: fload #4
    //   123: fconst_0
    //   124: fcmpl
    //   125: ifle -> 163
    //   128: aload_0
    //   129: invokevirtual M : ()V
    //   132: aload_0
    //   133: getfield W : Landroid/widget/EdgeEffect;
    //   136: fload #4
    //   138: aload_0
    //   139: invokevirtual getHeight : ()I
    //   142: i2f
    //   143: fdiv
    //   144: fconst_1
    //   145: fload_1
    //   146: aload_0
    //   147: invokevirtual getWidth : ()I
    //   150: i2f
    //   151: fdiv
    //   152: fsub
    //   153: invokestatic a : (Landroid/widget/EdgeEffect;FF)V
    //   156: iload #5
    //   158: istore #6
    //   160: goto -> 163
    //   163: iload #6
    //   165: ifne -> 181
    //   168: fload_2
    //   169: fconst_0
    //   170: fcmpl
    //   171: ifne -> 181
    //   174: fload #4
    //   176: fconst_0
    //   177: fcmpl
    //   178: ifeq -> 185
    //   181: aload_0
    //   182: invokestatic h0 : (Landroid/view/View;)V
    //   185: return
  }
  
  private void T0() {
    if (this.o0 && this.v != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
      View view1;
      if (!isFocused()) {
        view1 = getFocusedChild();
        if (h && (view1.getParent() == null || !view1.hasFocus())) {
          if (this.o.g() == 0) {
            requestFocus();
            return;
          } 
        } else if (!this.o.n(view1)) {
          return;
        } 
      } 
      long l1 = this.s0.n;
      View view2 = null;
      if (l1 != -1L && this.v.h()) {
        view1 = (View)Z(this.s0.n);
      } else {
        view1 = null;
      } 
      if (view1 == null || this.o.n(((b0)view1).b) || !((b0)view1).b.hasFocusable()) {
        view1 = view2;
        if (this.o.g() > 0)
          view1 = X(); 
      } else {
        view1 = ((b0)view1).b;
      } 
      if (view1 != null) {
        int i = this.s0.o;
        view2 = view1;
        if (i != -1L) {
          View view = view1.findViewById(i);
          view2 = view1;
          if (view != null) {
            view2 = view1;
            if (view.isFocusable())
              view2 = view; 
          } 
        } 
        view2.requestFocus();
      } 
    } 
  }
  
  private boolean U(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getAction();
    int m = this.A.size();
    for (byte b1 = 0; b1 < m; b1++) {
      r r1 = this.A.get(b1);
      if (r1.b(this, paramMotionEvent) && i != 3) {
        this.B = r1;
        return true;
      } 
    } 
    return false;
  }
  
  private void U0() {
    EdgeEffect edgeEffect = this.T;
    if (edgeEffect != null) {
      edgeEffect.onRelease();
      bool1 = this.T.isFinished();
    } else {
      bool1 = false;
    } 
    edgeEffect = this.U;
    boolean bool2 = bool1;
    if (edgeEffect != null) {
      edgeEffect.onRelease();
      bool2 = bool1 | this.U.isFinished();
    } 
    edgeEffect = this.V;
    boolean bool1 = bool2;
    if (edgeEffect != null) {
      edgeEffect.onRelease();
      bool1 = bool2 | this.V.isFinished();
    } 
    edgeEffect = this.W;
    bool2 = bool1;
    if (edgeEffect != null) {
      edgeEffect.onRelease();
      bool2 = bool1 | this.W.isFinished();
    } 
    if (bool2)
      b.h.k.w.h0((View)this); 
  }
  
  private void V(int[] paramArrayOfint) {
    int i = this.o.g();
    if (i == 0) {
      paramArrayOfint[0] = -1;
      paramArrayOfint[1] = -1;
      return;
    } 
    int m = Integer.MAX_VALUE;
    int n = Integer.MIN_VALUE;
    byte b1 = 0;
    while (b1 < i) {
      int i1;
      b0 b0 = g0(this.o.f(b1));
      if (b0.J()) {
        i1 = n;
      } else {
        int i2 = b0.m();
        int i3 = m;
        if (i2 < m)
          i3 = i2; 
        m = i3;
        i1 = n;
        if (i2 > n) {
          i1 = i2;
          m = i3;
        } 
      } 
      b1++;
      n = i1;
    } 
    paramArrayOfint[0] = m;
    paramArrayOfint[1] = n;
  }
  
  static RecyclerView W(View paramView) {
    if (!(paramView instanceof ViewGroup))
      return null; 
    if (paramView instanceof RecyclerView)
      return (RecyclerView)paramView; 
    ViewGroup viewGroup = (ViewGroup)paramView;
    int i = viewGroup.getChildCount();
    for (byte b1 = 0; b1 < i; b1++) {
      RecyclerView recyclerView = W(viewGroup.getChildAt(b1));
      if (recyclerView != null)
        return recyclerView; 
    } 
    return null;
  }
  
  private View X() {
    y y1 = this.s0;
    int i = y1.m;
    if (i == -1)
      i = 0; 
    int m = y1.b();
    for (int n = i; n < m; n++) {
      b0 b0 = Y(n);
      if (b0 == null)
        break; 
      if (b0.b.hasFocusable())
        return b0.b; 
    } 
    for (i = Math.min(m, i) - 1; i >= 0; i--) {
      b0 b0 = Y(i);
      if (b0 == null)
        return null; 
      if (b0.b.hasFocusable())
        return b0.b; 
    } 
    return null;
  }
  
  private void b1(View paramView1, View paramView2) {
    View view;
    boolean bool1;
    if (paramView2 != null) {
      view = paramView2;
    } else {
      view = paramView1;
    } 
    this.s.set(0, 0, view.getWidth(), view.getHeight());
    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
    if (layoutParams instanceof LayoutParams) {
      LayoutParams layoutParams1 = (LayoutParams)layoutParams;
      if (!layoutParams1.c) {
        Rect rect2 = layoutParams1.b;
        Rect rect1 = this.s;
        rect1.left -= rect2.left;
        rect1.right += rect2.right;
        rect1.top -= rect2.top;
        rect1.bottom += rect2.bottom;
      } 
    } 
    if (paramView2 != null) {
      offsetDescendantRectToMyCoords(paramView2, this.s);
      offsetRectIntoDescendantCoords(paramView1, this.s);
    } 
    o o1 = this.w;
    Rect rect = this.s;
    boolean bool = this.F;
    if (paramView2 == null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    o1.s1(this, paramView1, rect, bool ^ true, bool1);
  }
  
  private void c1() {
    y y1 = this.s0;
    y1.n = -1L;
    y1.m = -1;
    y1.o = -1;
  }
  
  private void d1() {
    VelocityTracker velocityTracker = this.d0;
    if (velocityTracker != null)
      velocityTracker.clear(); 
    u1(0);
    U0();
  }
  
  private void e1() {
    b0 b02;
    boolean bool = this.o0;
    b0 b01 = null;
    if (bool && hasFocus() && this.v != null) {
      b02 = (b0)getFocusedChild();
    } else {
      b02 = null;
    } 
    if (b02 == null) {
      b02 = b01;
    } else {
      b02 = T((View)b02);
    } 
    if (b02 == null) {
      c1();
    } else {
      long l1;
      int i;
      y y1 = this.s0;
      if (this.v.h()) {
        l1 = b02.k();
      } else {
        l1 = -1L;
      } 
      y1.n = l1;
      y1 = this.s0;
      if (this.O) {
        i = -1;
      } else if (b02.v()) {
        i = b02.e;
      } else {
        i = b02.j();
      } 
      y1.m = i;
      this.s0.o = i0(b02.b);
    } 
  }
  
  private void g(b0 paramb0) {
    boolean bool;
    View view = paramb0.b;
    if (view.getParent() == this) {
      bool = true;
    } else {
      bool = false;
    } 
    this.l.J(f0(view));
    if (paramb0.x()) {
      this.o.c(view, -1, view.getLayoutParams(), true);
    } else if (!bool) {
      this.o.b(view, true);
    } else {
      this.o.k(view);
    } 
  }
  
  static b0 g0(View paramView) {
    return (paramView == null) ? null : ((LayoutParams)paramView.getLayoutParams()).a;
  }
  
  private b.h.k.l getScrollingChildHelper() {
    if (this.C0 == null)
      this.C0 = new b.h.k.l((View)this); 
    return this.C0;
  }
  
  static void h0(View paramView, Rect paramRect) {
    LayoutParams layoutParams = (LayoutParams)paramView.getLayoutParams();
    Rect rect = layoutParams.b;
    paramRect.set(paramView.getLeft() - rect.left - layoutParams.leftMargin, paramView.getTop() - rect.top - layoutParams.topMargin, paramView.getRight() + rect.right + layoutParams.rightMargin, paramView.getBottom() + rect.bottom + layoutParams.bottomMargin);
  }
  
  private int i0(View paramView) {
    int i = paramView.getId();
    while (!paramView.isFocused() && paramView instanceof ViewGroup && paramView.hasFocus()) {
      View view = ((ViewGroup)paramView).getFocusedChild();
      paramView = view;
      if (view.getId() != -1) {
        i = view.getId();
        paramView = view;
      } 
    } 
    return i;
  }
  
  private String j0(Context paramContext, String paramString) {
    if (paramString.charAt(0) == '.') {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(paramContext.getPackageName());
      stringBuilder1.append(paramString);
      return stringBuilder1.toString();
    } 
    if (paramString.contains("."))
      return paramString; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(RecyclerView.class.getPackage().getName());
    stringBuilder.append('.');
    stringBuilder.append(paramString);
    return stringBuilder.toString();
  }
  
  private void j1(Adapter paramAdapter, boolean paramBoolean1, boolean paramBoolean2) {
    Adapter adapter = this.v;
    if (adapter != null) {
      adapter.z(this.k);
      this.v.s(this);
    } 
    if (!paramBoolean1 || paramBoolean2)
      V0(); 
    this.n.x();
    adapter = this.v;
    this.v = paramAdapter;
    if (paramAdapter != null) {
      paramAdapter.x(this.k);
      paramAdapter.o(this);
    } 
    o o1 = this.w;
    if (o1 != null)
      o1.E0(adapter, this.v); 
    this.l.x(adapter, this.v, paramBoolean1);
    this.s0.g = true;
  }
  
  private void l0(long paramLong, b0 paramb01, b0 paramb02) {
    StringBuilder stringBuilder1;
    int i = this.o.g();
    for (byte b1 = 0; b1 < i; b1++) {
      b0 b01 = g0(this.o.f(b1));
      if (b01 != paramb01 && d0(b01) == paramLong) {
        Adapter adapter = this.v;
        if (adapter != null && adapter.h()) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
          stringBuilder.append(b01);
          stringBuilder.append(" \n View Holder 2:");
          stringBuilder.append(paramb01);
          stringBuilder.append(Q());
          throw new IllegalStateException(stringBuilder.toString());
        } 
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
        stringBuilder1.append(b01);
        stringBuilder1.append(" \n View Holder 2:");
        stringBuilder1.append(paramb01);
        stringBuilder1.append(Q());
        throw new IllegalStateException(stringBuilder1.toString());
      } 
    } 
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
    stringBuilder2.append(stringBuilder1);
    stringBuilder2.append(" cannot be found but it is necessary for ");
    stringBuilder2.append(paramb01);
    stringBuilder2.append(Q());
    Log.e("RecyclerView", stringBuilder2.toString());
  }
  
  private void n(b0 paramb01, b0 paramb02, l.c paramc1, l.c paramc2, boolean paramBoolean1, boolean paramBoolean2) {
    paramb01.G(false);
    if (paramBoolean1)
      g(paramb01); 
    if (paramb01 != paramb02) {
      if (paramBoolean2)
        g(paramb02); 
      paramb01.i = paramb02;
      g(paramb01);
      this.l.J(paramb01);
      paramb02.G(false);
      paramb02.j = paramb01;
    } 
    if (this.a0.b(paramb01, paramb02, paramc1, paramc2))
      N0(); 
  }
  
  private boolean n0() {
    int i = this.o.g();
    for (byte b1 = 0; b1 < i; b1++) {
      b0 b0 = g0(this.o.f(b1));
      if (b0 != null && !b0.J() && b0.y())
        return true; 
    } 
    return false;
  }
  
  @SuppressLint({"InlinedApi"})
  private void p0() {
    if (b.h.k.w.B((View)this) == 0)
      b.h.k.w.C0((View)this, 8); 
  }
  
  private void q0() {
    this.o = new b(new e(this));
  }
  
  private void r() {
    d1();
    setScrollState(0);
  }
  
  static void s(b0 paramb0) {
    WeakReference<RecyclerView> weakReference = paramb0.c;
    if (weakReference != null) {
      View view = (View)weakReference.get();
      while (view != null) {
        if (view == paramb0.b)
          return; 
        ViewParent viewParent = view.getParent();
        if (viewParent instanceof View) {
          View view1 = (View)viewParent;
          continue;
        } 
        viewParent = null;
      } 
      paramb0.c = null;
    } 
  }
  
  private boolean v0(View paramView1, View paramView2, int paramInt) {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    boolean bool7 = bool5;
    if (paramView2 != null) {
      bool7 = bool5;
      if (paramView2 != this)
        if (paramView2 == paramView1) {
          bool7 = bool5;
        } else {
          byte b2;
          if (S(paramView2) == null)
            return false; 
          if (paramView1 == null)
            return true; 
          if (S(paramView1) == null)
            return true; 
          this.s.set(0, 0, paramView1.getWidth(), paramView1.getHeight());
          this.t.set(0, 0, paramView2.getWidth(), paramView2.getHeight());
          offsetDescendantRectToMyCoords(paramView1, this.s);
          offsetDescendantRectToMyCoords(paramView2, this.t);
          int i = this.w.Z();
          byte b1 = -1;
          if (i == 1) {
            b2 = -1;
          } else {
            b2 = 1;
          } 
          Rect rect2 = this.s;
          int m = rect2.left;
          Rect rect1 = this.t;
          int n = rect1.left;
          if ((m < n || rect2.right <= n) && rect2.right < rect1.right) {
            i = 1;
          } else {
            i = rect2.right;
            int i2 = rect1.right;
            if ((i > i2 || m >= i2) && m > n) {
              i = -1;
            } else {
              i = 0;
            } 
          } 
          int i1 = rect2.top;
          n = rect1.top;
          if ((i1 < n || rect2.bottom <= n) && rect2.bottom < rect1.bottom) {
            b1 = 1;
          } else {
            int i2 = rect2.bottom;
            m = rect1.bottom;
            if ((i2 <= m && i1 < m) || i1 <= n)
              b1 = 0; 
          } 
          if (paramInt != 1) {
            if (paramInt != 2) {
              if (paramInt != 17) {
                if (paramInt != 33) {
                  if (paramInt != 66) {
                    if (paramInt == 130) {
                      bool7 = bool6;
                      if (b1 > 0)
                        bool7 = true; 
                      return bool7;
                    } 
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid direction: ");
                    stringBuilder.append(paramInt);
                    stringBuilder.append(Q());
                    throw new IllegalArgumentException(stringBuilder.toString());
                  } 
                  bool7 = bool1;
                  if (i > 0)
                    bool7 = true; 
                  return bool7;
                } 
                bool7 = bool2;
                if (b1 < 0)
                  bool7 = true; 
                return bool7;
              } 
              bool7 = bool3;
              if (i < 0)
                bool7 = true; 
              return bool7;
            } 
            if (b1 <= 0) {
              bool7 = bool4;
              if (b1 == 0) {
                bool7 = bool4;
                if (i * b2 > 0)
                  bool7 = true; 
              } 
              return bool7;
            } 
          } else {
            if (b1 >= 0) {
              bool7 = bool5;
              if (b1 == 0) {
                bool7 = bool5;
                if (i * b2 < 0)
                  bool7 = true; 
              } 
              return bool7;
            } 
            bool7 = true;
          } 
          bool7 = true;
        }  
    } 
    return bool7;
  }
  
  private void w(Context paramContext, String paramString, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    if (paramString != null) {
      paramString = paramString.trim();
      if (!paramString.isEmpty()) {
        String str = j0(paramContext, paramString);
        try {
          StringBuilder stringBuilder;
          ClassLoader classLoader;
          if (isInEditMode()) {
            classLoader = getClass().getClassLoader();
          } else {
            classLoader = paramContext.getClassLoader();
          } 
          Class<? extends o> clazz = Class.forName(str, false, classLoader).asSubclass(o.class);
          NoSuchMethodException noSuchMethodException2 = null;
          try {
            Constructor<? extends o> constructor = clazz.getConstructor(i);
            Object[] arrayOfObject = { paramContext, paramAttributeSet, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) };
          } catch (NoSuchMethodException noSuchMethodException) {
            try {
              Constructor<? extends o> constructor = clazz.getConstructor(new Class[0]);
              noSuchMethodException = noSuchMethodException2;
              constructor.setAccessible(true);
              setLayoutManager(constructor.newInstance((Object[])noSuchMethodException));
            } catch (NoSuchMethodException noSuchMethodException1) {
              noSuchMethodException1.initCause(noSuchMethodException);
              IllegalStateException illegalStateException = new IllegalStateException();
              stringBuilder = new StringBuilder();
              this();
              stringBuilder.append(paramAttributeSet.getPositionDescription());
              stringBuilder.append(": Error creating LayoutManager ");
              stringBuilder.append(str);
              this(stringBuilder.toString(), noSuchMethodException1);
              throw illegalStateException;
            } 
          } 
          noSuchMethodException1.setAccessible(true);
          setLayoutManager(noSuchMethodException1.newInstance((Object[])stringBuilder));
        } catch (ClassNotFoundException classNotFoundException) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(paramAttributeSet.getPositionDescription());
          stringBuilder.append(": Unable to find LayoutManager ");
          stringBuilder.append(str);
          throw new IllegalStateException(stringBuilder.toString(), classNotFoundException);
        } catch (InvocationTargetException invocationTargetException) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(paramAttributeSet.getPositionDescription());
          stringBuilder.append(": Could not instantiate the LayoutManager: ");
          stringBuilder.append(str);
          throw new IllegalStateException(stringBuilder.toString(), invocationTargetException);
        } catch (InstantiationException instantiationException) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(paramAttributeSet.getPositionDescription());
          stringBuilder.append(": Could not instantiate the LayoutManager: ");
          stringBuilder.append(str);
          throw new IllegalStateException(stringBuilder.toString(), instantiationException);
        } catch (IllegalAccessException illegalAccessException) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(paramAttributeSet.getPositionDescription());
          stringBuilder.append(": Cannot access non-public constructor ");
          stringBuilder.append(str);
          throw new IllegalStateException(stringBuilder.toString(), illegalAccessException);
        } catch (ClassCastException classCastException) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(paramAttributeSet.getPositionDescription());
          stringBuilder.append(": Class is not a LayoutManager ");
          stringBuilder.append(str);
          throw new IllegalStateException(stringBuilder.toString(), classCastException);
        } 
      } 
    } 
  }
  
  private void w1() {
    this.p0.f();
    o o1 = this.w;
    if (o1 != null)
      o1.L1(); 
  }
  
  private boolean y(int paramInt1, int paramInt2) {
    V(this.B0);
    int[] arrayOfInt = this.B0;
    boolean bool = false;
    if (arrayOfInt[0] != paramInt1 || arrayOfInt[1] != paramInt2)
      bool = true; 
    return bool;
  }
  
  private void z0(int paramInt1, int paramInt2, MotionEvent paramMotionEvent, int paramInt3) {
    boolean bool4;
    boolean bool5;
    o o1 = this.w;
    if (o1 == null) {
      Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    } 
    if (this.I)
      return; 
    int[] arrayOfInt = this.F0;
    boolean bool1 = false;
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 0;
    boolean bool2 = o1.k();
    boolean bool3 = this.w.l();
    if (bool2) {
      i = 1;
    } else {
      i = 0;
    } 
    int m = i;
    if (bool3)
      m = i | 0x2; 
    s1(m, paramInt3);
    if (bool2) {
      bool4 = paramInt1;
    } else {
      bool4 = false;
    } 
    if (bool3) {
      bool5 = paramInt2;
    } else {
      bool5 = false;
    } 
    m = paramInt1;
    int i = paramInt2;
    if (G(bool4, bool5, this.F0, this.D0, paramInt3)) {
      int[] arrayOfInt1 = this.F0;
      m = paramInt1 - arrayOfInt1[0];
      i = paramInt2 - arrayOfInt1[1];
    } 
    if (bool2) {
      paramInt1 = m;
    } else {
      paramInt1 = 0;
    } 
    paramInt2 = bool1;
    if (bool3)
      paramInt2 = i; 
    g1(paramInt1, paramInt2, paramMotionEvent, paramInt3);
    e e1 = this.q0;
    if (e1 != null && (m != 0 || i != 0))
      e1.f(this, m, i); 
    u1(paramInt3);
  }
  
  void A(View paramView) {
    b0 b0 = g0(paramView);
    G0(paramView);
    Adapter<b0> adapter = this.v;
    if (adapter != null && b0 != null)
      adapter.v(b0); 
    List<p> list = this.N;
    if (list != null)
      for (int i = list.size() - 1; i >= 0; i--)
        ((p)this.N.get(i)).a(paramView);  
  }
  
  public void A0(int paramInt) {
    int i = this.o.g();
    for (byte b1 = 0; b1 < i; b1++)
      this.o.f(b1).offsetLeftAndRight(paramInt); 
  }
  
  public void B0(int paramInt) {
    int i = this.o.g();
    for (byte b1 = 0; b1 < i; b1++)
      this.o.f(b1).offsetTopAndBottom(paramInt); 
  }
  
  void C() {
    boolean bool;
    if (this.v == null) {
      Log.w("RecyclerView", "No adapter attached; skipping layout");
      return;
    } 
    if (this.w == null) {
      Log.e("RecyclerView", "No layout manager attached; skipping layout");
      return;
    } 
    this.s0.j = false;
    if (this.I0 && (this.J0 != getWidth() || this.K0 != getHeight())) {
      bool = true;
    } else {
      bool = false;
    } 
    this.J0 = 0;
    this.K0 = 0;
    this.I0 = false;
    if (this.s0.e == 1) {
      D();
      this.w.A1(this);
      E();
    } else if (this.n.q() || bool || this.w.o0() != getWidth() || this.w.W() != getHeight()) {
      this.w.A1(this);
      E();
    } else {
      this.w.A1(this);
    } 
    F();
  }
  
  void C0(int paramInt1, int paramInt2) {
    int i = this.o.j();
    for (byte b1 = 0; b1 < i; b1++) {
      b0 b0 = g0(this.o.i(b1));
      if (b0 != null && !b0.J() && b0.d >= paramInt1) {
        b0.A(paramInt2, false);
        this.s0.g = true;
      } 
    } 
    this.l.u(paramInt1, paramInt2);
    requestLayout();
  }
  
  void D0(int paramInt1, int paramInt2) {
    boolean bool;
    int m;
    int n;
    int i = this.o.j();
    if (paramInt1 < paramInt2) {
      bool = true;
      m = paramInt1;
      n = paramInt2;
    } else {
      n = paramInt1;
      m = paramInt2;
      bool = true;
    } 
    for (byte b1 = 0; b1 < i; b1++) {
      b0 b0 = g0(this.o.i(b1));
      if (b0 != null) {
        int i1 = b0.d;
        if (i1 >= m && i1 <= n) {
          if (i1 == paramInt1) {
            b0.A(paramInt2 - paramInt1, false);
          } else {
            b0.A(bool, false);
          } 
          this.s0.g = true;
        } 
      } 
    } 
    this.l.v(paramInt1, paramInt2);
    requestLayout();
  }
  
  void E0(int paramInt1, int paramInt2, boolean paramBoolean) {
    int i = this.o.j();
    for (byte b1 = 0; b1 < i; b1++) {
      b0 b0 = g0(this.o.i(b1));
      if (b0 != null && !b0.J()) {
        int m = b0.d;
        if (m >= paramInt1 + paramInt2) {
          b0.A(-paramInt2, paramBoolean);
          this.s0.g = true;
        } else if (m >= paramInt1) {
          b0.i(paramInt1 - 1, -paramInt2, paramBoolean);
          this.s0.g = true;
        } 
      } 
    } 
    this.l.w(paramInt1, paramInt2, paramBoolean);
    requestLayout();
  }
  
  public void F0(View paramView) {}
  
  public boolean G(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt3) {
    return getScrollingChildHelper().d(paramInt1, paramInt2, paramArrayOfint1, paramArrayOfint2, paramInt3);
  }
  
  public void G0(View paramView) {}
  
  public final void H(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint1, int paramInt5, int[] paramArrayOfint2) {
    getScrollingChildHelper().e(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfint1, paramInt5, paramArrayOfint2);
  }
  
  void H0() {
    this.Q++;
  }
  
  void I(int paramInt) {
    o o1 = this.w;
    if (o1 != null)
      o1.e1(paramInt); 
    L0(paramInt);
    s s1 = this.t0;
    if (s1 != null)
      s1.a(this, paramInt); 
    List<s> list = this.u0;
    if (list != null)
      for (int i = list.size() - 1; i >= 0; i--)
        ((s)this.u0.get(i)).a(this, paramInt);  
  }
  
  void I0() {
    J0(true);
  }
  
  void J(int paramInt1, int paramInt2) {
    this.R++;
    int i = getScrollX();
    int m = getScrollY();
    onScrollChanged(i, m, i - paramInt1, m - paramInt2);
    M0(paramInt1, paramInt2);
    s s1 = this.t0;
    if (s1 != null)
      s1.b(this, paramInt1, paramInt2); 
    List<s> list = this.u0;
    if (list != null)
      for (i = list.size() - 1; i >= 0; i--)
        ((s)this.u0.get(i)).b(this, paramInt1, paramInt2);  
    this.R--;
  }
  
  void J0(boolean paramBoolean) {
    int i = this.Q - 1;
    this.Q = i;
    if (i < 1) {
      this.Q = 0;
      if (paramBoolean) {
        B();
        K();
      } 
    } 
  }
  
  void K() {
    for (int i = this.G0.size() - 1; i >= 0; i--) {
      b0 b0 = this.G0.get(i);
      if (b0.b.getParent() == this && !b0.J()) {
        int m = b0.r;
        if (m != -1) {
          b.h.k.w.B0(b0.b, m);
          b0.r = -1;
        } 
      } 
    } 
    this.G0.clear();
  }
  
  public void L0(int paramInt) {}
  
  void M() {
    if (this.W != null)
      return; 
    EdgeEffect edgeEffect = this.S.a(this, 3);
    this.W = edgeEffect;
    if (this.q) {
      edgeEffect.setSize(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
    } else {
      edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
    } 
  }
  
  public void M0(int paramInt1, int paramInt2) {}
  
  void N() {
    if (this.T != null)
      return; 
    EdgeEffect edgeEffect = this.S.a(this, 0);
    this.T = edgeEffect;
    if (this.q) {
      edgeEffect.setSize(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
    } else {
      edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
    } 
  }
  
  void N0() {
    if (!this.y0 && this.C) {
      b.h.k.w.j0((View)this, this.H0);
      this.y0 = true;
    } 
  }
  
  void O() {
    if (this.V != null)
      return; 
    EdgeEffect edgeEffect = this.S.a(this, 2);
    this.V = edgeEffect;
    if (this.q) {
      edgeEffect.setSize(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
    } else {
      edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
    } 
  }
  
  void P() {
    if (this.U != null)
      return; 
    EdgeEffect edgeEffect = this.S.a(this, 1);
    this.U = edgeEffect;
    if (this.q) {
      edgeEffect.setSize(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
    } else {
      edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
    } 
  }
  
  String Q() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(" ");
    stringBuilder.append(toString());
    stringBuilder.append(", adapter:");
    stringBuilder.append(this.v);
    stringBuilder.append(", layout:");
    stringBuilder.append(this.w);
    stringBuilder.append(", context:");
    stringBuilder.append(getContext());
    return stringBuilder.toString();
  }
  
  void Q0(boolean paramBoolean) {
    this.P = paramBoolean | this.P;
    this.O = true;
    y0();
  }
  
  final void R(y paramy) {
    if (getScrollState() == 2) {
      OverScroller overScroller = this.p0.d;
      paramy.p = overScroller.getFinalX() - overScroller.getCurrX();
      paramy.q = overScroller.getFinalY() - overScroller.getCurrY();
    } else {
      paramy.p = 0;
      paramy.q = 0;
    } 
  }
  
  public View S(View paramView) {
    ViewParent viewParent;
    for (viewParent = paramView.getParent(); viewParent != null && viewParent != this && viewParent instanceof View; viewParent = paramView.getParent())
      paramView = (View)viewParent; 
    if (viewParent != this)
      paramView = null; 
    return paramView;
  }
  
  void S0(b0 paramb0, l.c paramc) {
    paramb0.F(0, 8192);
    if (this.s0.i && paramb0.y() && !paramb0.v() && !paramb0.J()) {
      long l1 = d0(paramb0);
      this.p.c(l1, paramb0);
    } 
    this.p.e(paramb0, paramc);
  }
  
  public b0 T(View paramView) {
    b0 b0;
    paramView = S(paramView);
    if (paramView == null) {
      paramView = null;
    } else {
      b0 = f0(paramView);
    } 
    return b0;
  }
  
  void V0() {
    l l1 = this.a0;
    if (l1 != null)
      l1.k(); 
    o o1 = this.w;
    if (o1 != null) {
      o1.k1(this.l);
      this.w.l1(this.l);
    } 
    this.l.c();
  }
  
  boolean W0(View paramView) {
    r1();
    boolean bool = this.o.r(paramView);
    if (bool) {
      b0 b0 = g0(paramView);
      this.l.J(b0);
      this.l.C(b0);
    } 
    t1(bool ^ true);
    return bool;
  }
  
  public void X0(n paramn) {
    o o1 = this.w;
    if (o1 != null)
      o1.g("Cannot remove item decoration during a scroll  or layout"); 
    this.z.remove(paramn);
    if (this.z.isEmpty()) {
      boolean bool;
      if (getOverScrollMode() == 2) {
        bool = true;
      } else {
        bool = false;
      } 
      setWillNotDraw(bool);
    } 
    x0();
    requestLayout();
  }
  
  public b0 Y(int paramInt) {
    boolean bool = this.O;
    b0 b0 = null;
    if (bool)
      return null; 
    int i = this.o.j();
    byte b1 = 0;
    while (b1 < i) {
      b0 b01 = g0(this.o.i(b1));
      b0 b02 = b0;
      if (b01 != null) {
        b02 = b0;
        if (!b01.v()) {
          b02 = b0;
          if (c0(b01) == paramInt)
            if (this.o.n(b01.b)) {
              b02 = b01;
            } else {
              return b01;
            }  
        } 
      } 
      b1++;
      b0 = b02;
    } 
    return b0;
  }
  
  public void Y0(r paramr) {
    this.A.remove(paramr);
    if (this.B == paramr)
      this.B = null; 
  }
  
  public b0 Z(long paramLong) {
    Adapter adapter = this.v;
    b0 b01 = null;
    b0 b02 = null;
    b0 b03 = b01;
    if (adapter != null)
      if (!adapter.h()) {
        b03 = b01;
      } else {
        int i = this.o.j();
        byte b1 = 0;
        while (true) {
          b03 = b02;
          if (b1 < i) {
            b01 = g0(this.o.i(b1));
            b03 = b02;
            if (b01 != null) {
              b03 = b02;
              if (!b01.v()) {
                b03 = b02;
                if (b01.k() == paramLong)
                  if (this.o.n(b01.b)) {
                    b03 = b01;
                  } else {
                    return b01;
                  }  
              } 
            } 
            b1++;
            b02 = b03;
            continue;
          } 
          break;
        } 
      }  
    return b03;
  }
  
  public void Z0(s params) {
    List<s> list = this.u0;
    if (list != null)
      list.remove(params); 
  }
  
  void a(int paramInt1, int paramInt2) {
    if (paramInt1 < 0) {
      N();
      if (this.T.isFinished())
        this.T.onAbsorb(-paramInt1); 
    } else if (paramInt1 > 0) {
      O();
      if (this.V.isFinished())
        this.V.onAbsorb(paramInt1); 
    } 
    if (paramInt2 < 0) {
      P();
      if (this.U.isFinished())
        this.U.onAbsorb(-paramInt2); 
    } else if (paramInt2 > 0) {
      M();
      if (this.W.isFinished())
        this.W.onAbsorb(paramInt2); 
    } 
    if (paramInt1 != 0 || paramInt2 != 0)
      b.h.k.w.h0((View)this); 
  }
  
  b0 a0(int paramInt, boolean paramBoolean) {
    int i = this.o.j();
    Object object = null;
    byte b1 = 0;
    while (b1 < i) {
      b0 b0 = g0(this.o.i(b1));
      Object object1 = object;
      if (b0 != null) {
        object1 = object;
        if (!b0.v()) {
          if (paramBoolean) {
            if (b0.d != paramInt) {
              object1 = object;
              continue;
            } 
          } else if (b0.m() != paramInt) {
            object1 = object;
            continue;
          } 
          if (this.o.n(b0.b)) {
            object1 = b0;
          } else {
            return b0;
          } 
        } 
      } 
      continue;
      b1++;
      object = SYNTHETIC_LOCAL_VARIABLE_7;
    } 
    return (b0)object;
  }
  
  void a1() {
    int i = this.o.g();
    for (byte b1 = 0; b1 < i; b1++) {
      View view = this.o.f(b1);
      b0 b0 = f0(view);
      if (b0 != null) {
        b0 = b0.j;
        if (b0 != null) {
          View view1 = b0.b;
          int m = view.getLeft();
          int n = view.getTop();
          if (m != view1.getLeft() || n != view1.getTop())
            view1.layout(m, n, view1.getWidth() + m, view1.getHeight() + n); 
        } 
      } 
    } 
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2) {
    o o1 = this.w;
    if (o1 == null || !o1.F0(this, paramArrayList, paramInt1, paramInt2))
      super.addFocusables(paramArrayList, paramInt1, paramInt2); 
  }
  
  public boolean b0(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield w : Landroidx/recyclerview/widget/RecyclerView$o;
    //   4: astore_3
    //   5: iconst_0
    //   6: istore #4
    //   8: aload_3
    //   9: ifnonnull -> 24
    //   12: ldc_w 'RecyclerView'
    //   15: ldc_w 'Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.'
    //   18: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   21: pop
    //   22: iconst_0
    //   23: ireturn
    //   24: aload_0
    //   25: getfield I : Z
    //   28: ifeq -> 33
    //   31: iconst_0
    //   32: ireturn
    //   33: aload_3
    //   34: invokevirtual k : ()Z
    //   37: istore #5
    //   39: aload_0
    //   40: getfield w : Landroidx/recyclerview/widget/RecyclerView$o;
    //   43: invokevirtual l : ()Z
    //   46: istore #6
    //   48: iload #5
    //   50: ifeq -> 67
    //   53: iload_1
    //   54: istore #7
    //   56: iload_1
    //   57: invokestatic abs : (I)I
    //   60: aload_0
    //   61: getfield k0 : I
    //   64: if_icmpge -> 70
    //   67: iconst_0
    //   68: istore #7
    //   70: iload #6
    //   72: ifeq -> 89
    //   75: iload_2
    //   76: istore #8
    //   78: iload_2
    //   79: invokestatic abs : (I)I
    //   82: aload_0
    //   83: getfield k0 : I
    //   86: if_icmpge -> 92
    //   89: iconst_0
    //   90: istore #8
    //   92: iload #7
    //   94: ifne -> 104
    //   97: iload #8
    //   99: ifne -> 104
    //   102: iconst_0
    //   103: ireturn
    //   104: iload #7
    //   106: i2f
    //   107: fstore #9
    //   109: iload #8
    //   111: i2f
    //   112: fstore #10
    //   114: aload_0
    //   115: fload #9
    //   117: fload #10
    //   119: invokevirtual dispatchNestedPreFling : (FF)Z
    //   122: ifne -> 258
    //   125: iload #5
    //   127: ifne -> 144
    //   130: iload #6
    //   132: ifeq -> 138
    //   135: goto -> 144
    //   138: iconst_0
    //   139: istore #11
    //   141: goto -> 147
    //   144: iconst_1
    //   145: istore #11
    //   147: aload_0
    //   148: fload #9
    //   150: fload #10
    //   152: iload #11
    //   154: invokevirtual dispatchNestedFling : (FFZ)Z
    //   157: pop
    //   158: aload_0
    //   159: getfield j0 : Landroidx/recyclerview/widget/RecyclerView$q;
    //   162: astore_3
    //   163: aload_3
    //   164: ifnull -> 180
    //   167: aload_3
    //   168: iload #7
    //   170: iload #8
    //   172: invokevirtual a : (II)Z
    //   175: ifeq -> 180
    //   178: iconst_1
    //   179: ireturn
    //   180: iload #11
    //   182: ifeq -> 258
    //   185: iload #4
    //   187: istore_1
    //   188: iload #5
    //   190: ifeq -> 195
    //   193: iconst_1
    //   194: istore_1
    //   195: iload_1
    //   196: istore_2
    //   197: iload #6
    //   199: ifeq -> 206
    //   202: iload_1
    //   203: iconst_2
    //   204: ior
    //   205: istore_2
    //   206: aload_0
    //   207: iload_2
    //   208: iconst_1
    //   209: invokevirtual s1 : (II)Z
    //   212: pop
    //   213: aload_0
    //   214: getfield l0 : I
    //   217: istore_1
    //   218: iload_1
    //   219: ineg
    //   220: iload #7
    //   222: iload_1
    //   223: invokestatic min : (II)I
    //   226: invokestatic max : (II)I
    //   229: istore_1
    //   230: aload_0
    //   231: getfield l0 : I
    //   234: istore_2
    //   235: iload_2
    //   236: ineg
    //   237: iload #8
    //   239: iload_2
    //   240: invokestatic min : (II)I
    //   243: invokestatic max : (II)I
    //   246: istore_2
    //   247: aload_0
    //   248: getfield p0 : Landroidx/recyclerview/widget/RecyclerView$a0;
    //   251: iload_1
    //   252: iload_2
    //   253: invokevirtual b : (II)V
    //   256: iconst_1
    //   257: ireturn
    //   258: iconst_0
    //   259: ireturn
  }
  
  int c0(b0 paramb0) {
    return (paramb0.p(524) || !paramb0.s()) ? -1 : this.n.e(paramb0.d);
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    boolean bool;
    if (paramLayoutParams instanceof LayoutParams && this.w.m((LayoutParams)paramLayoutParams)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int computeHorizontalScrollExtent() {
    o o1 = this.w;
    int i = 0;
    if (o1 == null)
      return 0; 
    if (o1.k())
      i = this.w.q(this.s0); 
    return i;
  }
  
  public int computeHorizontalScrollOffset() {
    o o1 = this.w;
    int i = 0;
    if (o1 == null)
      return 0; 
    if (o1.k())
      i = this.w.r(this.s0); 
    return i;
  }
  
  public int computeHorizontalScrollRange() {
    o o1 = this.w;
    int i = 0;
    if (o1 == null)
      return 0; 
    if (o1.k())
      i = this.w.s(this.s0); 
    return i;
  }
  
  public int computeVerticalScrollExtent() {
    o o1 = this.w;
    int i = 0;
    if (o1 == null)
      return 0; 
    if (o1.l())
      i = this.w.t(this.s0); 
    return i;
  }
  
  public int computeVerticalScrollOffset() {
    o o1 = this.w;
    int i = 0;
    if (o1 == null)
      return 0; 
    if (o1.l())
      i = this.w.u(this.s0); 
    return i;
  }
  
  public int computeVerticalScrollRange() {
    o o1 = this.w;
    int i = 0;
    if (o1 == null)
      return 0; 
    if (o1.l())
      i = this.w.v(this.s0); 
    return i;
  }
  
  long d0(b0 paramb0) {
    long l1;
    if (this.v.h()) {
      l1 = paramb0.k();
    } else {
      l1 = paramb0.d;
    } 
    return l1;
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    return getScrollingChildHelper().a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2) {
    return getScrollingChildHelper().b(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    return getScrollingChildHelper().c(paramInt1, paramInt2, paramArrayOfint1, paramArrayOfint2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) {
    return getScrollingChildHelper().f(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfint);
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    onPopulateAccessibilityEvent(paramAccessibilityEvent);
    return true;
  }
  
  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray) {
    dispatchThawSelfOnly(paramSparseArray);
  }
  
  protected void dispatchSaveInstanceState(SparseArray<Parcelable> paramSparseArray) {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
  
  public void draw(Canvas paramCanvas) {
    super.draw(paramCanvas);
    int i = this.z.size();
    boolean bool1 = false;
    int m;
    for (m = 0; m < i; m++)
      ((n)this.z.get(m)).i(paramCanvas, this, this.s0); 
    EdgeEffect edgeEffect = this.T;
    boolean bool2 = true;
    if (edgeEffect != null && !edgeEffect.isFinished()) {
      int n = paramCanvas.save();
      if (this.q) {
        m = getPaddingBottom();
      } else {
        m = 0;
      } 
      paramCanvas.rotate(270.0F);
      paramCanvas.translate((-getHeight() + m), 0.0F);
      edgeEffect = this.T;
      if (edgeEffect != null && edgeEffect.draw(paramCanvas)) {
        i = 1;
      } else {
        i = 0;
      } 
      paramCanvas.restoreToCount(n);
    } else {
      i = 0;
    } 
    edgeEffect = this.U;
    m = i;
    if (edgeEffect != null) {
      m = i;
      if (!edgeEffect.isFinished()) {
        int n = paramCanvas.save();
        if (this.q)
          paramCanvas.translate(getPaddingLeft(), getPaddingTop()); 
        edgeEffect = this.U;
        if (edgeEffect != null && edgeEffect.draw(paramCanvas)) {
          m = 1;
        } else {
          m = 0;
        } 
        m = i | m;
        paramCanvas.restoreToCount(n);
      } 
    } 
    edgeEffect = this.V;
    i = m;
    if (edgeEffect != null) {
      i = m;
      if (!edgeEffect.isFinished()) {
        int n = paramCanvas.save();
        int i1 = getWidth();
        if (this.q) {
          i = getPaddingTop();
        } else {
          i = 0;
        } 
        paramCanvas.rotate(90.0F);
        paramCanvas.translate(i, -i1);
        edgeEffect = this.V;
        if (edgeEffect != null && edgeEffect.draw(paramCanvas)) {
          i = 1;
        } else {
          i = 0;
        } 
        i = m | i;
        paramCanvas.restoreToCount(n);
      } 
    } 
    edgeEffect = this.W;
    m = i;
    if (edgeEffect != null) {
      m = i;
      if (!edgeEffect.isFinished()) {
        int n = paramCanvas.save();
        paramCanvas.rotate(180.0F);
        if (this.q) {
          paramCanvas.translate((-getWidth() + getPaddingRight()), (-getHeight() + getPaddingBottom()));
        } else {
          paramCanvas.translate(-getWidth(), -getHeight());
        } 
        edgeEffect = this.W;
        m = bool1;
        if (edgeEffect != null) {
          m = bool1;
          if (edgeEffect.draw(paramCanvas))
            m = 1; 
        } 
        m = i | m;
        paramCanvas.restoreToCount(n);
      } 
    } 
    if (m == 0 && this.a0 != null && this.z.size() > 0 && this.a0.p())
      m = bool2; 
    if (m != 0)
      b.h.k.w.h0((View)this); 
  }
  
  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong) {
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  public int e0(View paramView) {
    byte b1;
    b0 b0 = g0(paramView);
    if (b0 != null) {
      b1 = b0.m();
    } else {
      b1 = -1;
    } 
    return b1;
  }
  
  public b0 f0(View paramView) {
    ViewParent viewParent = paramView.getParent();
    if (viewParent == null || viewParent == this)
      return g0(paramView); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("View ");
    stringBuilder.append(paramView);
    stringBuilder.append(" is not a direct child of ");
    stringBuilder.append(this);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  void f1() {
    int i = this.o.j();
    for (byte b1 = 0; b1 < i; b1++) {
      b0 b0 = g0(this.o.i(b1));
      if (!b0.J())
        b0.E(); 
    } 
  }
  
  public View focusSearch(View paramView, int paramInt) {
    View view1;
    int i;
    View view2 = this.w.Q0(paramView, paramInt);
    if (view2 != null)
      return view2; 
    Adapter adapter = this.v;
    boolean bool = true;
    if (adapter != null && this.w != null && !u0() && !this.I) {
      i = 1;
    } else {
      i = 0;
    } 
    FocusFinder focusFinder = FocusFinder.getInstance();
    if (i && (paramInt == 2 || paramInt == 1)) {
      if (this.w.l()) {
        byte b1;
        byte b2;
        if (paramInt == 2) {
          b1 = 130;
        } else {
          b1 = 33;
        } 
        if (focusFinder.findNextFocus(this, paramView, b1) == null) {
          b2 = 1;
        } else {
          b2 = 0;
        } 
        i = b2;
        if (g) {
          paramInt = b1;
          i = b2;
        } 
      } else {
        i = 0;
      } 
      int n = i;
      int m = paramInt;
      if (!i) {
        n = i;
        m = paramInt;
        if (this.w.k()) {
          if (this.w.Z() == 1) {
            i = 1;
          } else {
            i = 0;
          } 
          if (paramInt == 2) {
            m = 1;
          } else {
            m = 0;
          } 
          if ((i ^ m) != 0) {
            i = 66;
          } else {
            i = 17;
          } 
          if (focusFinder.findNextFocus(this, paramView, i) == null) {
            m = bool;
          } else {
            m = 0;
          } 
          if (g)
            paramInt = i; 
          n = m;
          m = paramInt;
        } 
      } 
      if (n != 0) {
        v();
        if (S(paramView) == null)
          return null; 
        r1();
        this.w.J0(paramView, m, this.l, this.s0);
        t1(false);
      } 
      view1 = focusFinder.findNextFocus(this, paramView, m);
      paramInt = m;
    } else {
      view1 = view1.findNextFocus(this, paramView, paramInt);
      if (view1 == null && i != 0) {
        v();
        if (S(paramView) == null)
          return null; 
        r1();
        view1 = this.w.J0(paramView, paramInt, this.l, this.s0);
        t1(false);
      } 
    } 
    if (view1 != null && !view1.hasFocusable()) {
      if (getFocusedChild() == null)
        return super.focusSearch(paramView, paramInt); 
      b1(view1, null);
      return paramView;
    } 
    if (!v0(paramView, view1, paramInt))
      view1 = super.focusSearch(paramView, paramInt); 
    return view1;
  }
  
  boolean g1(int paramInt1, int paramInt2, MotionEvent paramMotionEvent, int paramInt3) {
    byte b1;
    byte b2;
    boolean bool2;
    boolean bool3;
    v();
    Adapter adapter = this.v;
    boolean bool1 = true;
    if (adapter != null) {
      int[] arrayOfInt = this.F0;
      arrayOfInt[0] = 0;
      arrayOfInt[1] = 0;
      h1(paramInt1, paramInt2, arrayOfInt);
      arrayOfInt = this.F0;
      b1 = arrayOfInt[0];
      b2 = arrayOfInt[1];
      bool2 = b2;
      bool3 = b1;
      b1 = paramInt1 - b1;
      b2 = paramInt2 - b2;
    } else {
      bool2 = false;
      bool3 = false;
      b1 = 0;
      b2 = 0;
    } 
    if (!this.z.isEmpty())
      invalidate(); 
    int[] arrayOfInt1 = this.F0;
    arrayOfInt1[0] = 0;
    arrayOfInt1[1] = 0;
    H(bool3, bool2, b1, b2, this.D0, paramInt3, arrayOfInt1);
    arrayOfInt1 = this.F0;
    int i = arrayOfInt1[0];
    int m = arrayOfInt1[1];
    if (arrayOfInt1[0] != 0 || arrayOfInt1[1] != 0) {
      paramInt3 = 1;
    } else {
      paramInt3 = 0;
    } 
    int n = this.g0;
    int[] arrayOfInt2 = this.D0;
    this.g0 = n - arrayOfInt2[0];
    this.h0 -= arrayOfInt2[1];
    arrayOfInt1 = this.E0;
    arrayOfInt1[0] = arrayOfInt1[0] + arrayOfInt2[0];
    arrayOfInt1[1] = arrayOfInt1[1] + arrayOfInt2[1];
    if (getOverScrollMode() != 2) {
      if (paramMotionEvent != null && !b.h.k.j.g(paramMotionEvent, 8194))
        R0(paramMotionEvent.getX(), (b1 - i), paramMotionEvent.getY(), (b2 - m)); 
      u(paramInt1, paramInt2);
    } 
    if (bool3 || bool2)
      J(bool3, bool2); 
    if (!awakenScrollBars())
      invalidate(); 
    boolean bool4 = bool1;
    if (paramInt3 == 0) {
      bool4 = bool1;
      if (!bool3)
        if (bool2) {
          bool4 = bool1;
        } else {
          bool4 = false;
        }  
    } 
    return bool4;
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
    o o1 = this.w;
    if (o1 != null)
      return (ViewGroup.LayoutParams)o1.D(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("RecyclerView has no LayoutManager");
    stringBuilder.append(Q());
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    o o1 = this.w;
    if (o1 != null)
      return (ViewGroup.LayoutParams)o1.E(getContext(), paramAttributeSet); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("RecyclerView has no LayoutManager");
    stringBuilder.append(Q());
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    o o1 = this.w;
    if (o1 != null)
      return (ViewGroup.LayoutParams)o1.F(paramLayoutParams); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("RecyclerView has no LayoutManager");
    stringBuilder.append(Q());
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public CharSequence getAccessibilityClassName() {
    return "androidx.recyclerview.widget.RecyclerView";
  }
  
  public Adapter getAdapter() {
    return this.v;
  }
  
  public int getBaseline() {
    o o1 = this.w;
    return (o1 != null) ? o1.G() : super.getBaseline();
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2) {
    j j1 = this.A0;
    return (j1 == null) ? super.getChildDrawingOrder(paramInt1, paramInt2) : j1.a(paramInt1, paramInt2);
  }
  
  public boolean getClipToPadding() {
    return this.q;
  }
  
  public k getCompatAccessibilityDelegate() {
    return this.z0;
  }
  
  public k getEdgeEffectFactory() {
    return this.S;
  }
  
  public l getItemAnimator() {
    return this.a0;
  }
  
  public int getItemDecorationCount() {
    return this.z.size();
  }
  
  public o getLayoutManager() {
    return this.w;
  }
  
  public int getMaxFlingVelocity() {
    return this.l0;
  }
  
  public int getMinFlingVelocity() {
    return this.k0;
  }
  
  long getNanoTime() {
    return f ? System.nanoTime() : 0L;
  }
  
  public q getOnFlingListener() {
    return this.j0;
  }
  
  public boolean getPreserveFocusAfterLayout() {
    return this.o0;
  }
  
  public t getRecycledViewPool() {
    return this.l.i();
  }
  
  public int getScrollState() {
    return this.b0;
  }
  
  public void h(n paramn) {
    i(paramn, -1);
  }
  
  void h1(int paramInt1, int paramInt2, int[] paramArrayOfint) {
    r1();
    H0();
    androidx.core.os.c.a("RV Scroll");
    R(this.s0);
    if (paramInt1 != 0) {
      paramInt1 = this.w.w1(paramInt1, this.l, this.s0);
    } else {
      paramInt1 = 0;
    } 
    if (paramInt2 != 0) {
      paramInt2 = this.w.y1(paramInt2, this.l, this.s0);
    } else {
      paramInt2 = 0;
    } 
    androidx.core.os.c.b();
    a1();
    I0();
    t1(false);
    if (paramArrayOfint != null) {
      paramArrayOfint[0] = paramInt1;
      paramArrayOfint[1] = paramInt2;
    } 
  }
  
  public boolean hasNestedScrollingParent() {
    return getScrollingChildHelper().j();
  }
  
  public void i(n paramn, int paramInt) {
    o o1 = this.w;
    if (o1 != null)
      o1.g("Cannot add item decoration during a scroll  or layout"); 
    if (this.z.isEmpty())
      setWillNotDraw(false); 
    if (paramInt < 0) {
      this.z.add(paramn);
    } else {
      this.z.add(paramInt, paramn);
    } 
    x0();
    requestLayout();
  }
  
  public void i1(int paramInt) {
    if (this.I)
      return; 
    v1();
    o o1 = this.w;
    if (o1 == null) {
      Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    } 
    o1.x1(paramInt);
    awakenScrollBars();
  }
  
  public boolean isAttachedToWindow() {
    return this.C;
  }
  
  public final boolean isLayoutSuppressed() {
    return this.I;
  }
  
  public boolean isNestedScrollingEnabled() {
    return getScrollingChildHelper().l();
  }
  
  public void j(p paramp) {
    if (this.N == null)
      this.N = new ArrayList<p>(); 
    this.N.add(paramp);
  }
  
  public void k(r paramr) {
    this.A.add(paramr);
  }
  
  Rect k0(View paramView) {
    LayoutParams layoutParams = (LayoutParams)paramView.getLayoutParams();
    if (!layoutParams.c)
      return layoutParams.b; 
    if (this.s0.e() && (layoutParams.b() || layoutParams.d()))
      return layoutParams.b; 
    Rect rect = layoutParams.b;
    rect.set(0, 0, 0, 0);
    int i = this.z.size();
    for (byte b1 = 0; b1 < i; b1++) {
      this.s.set(0, 0, 0, 0);
      ((n)this.z.get(b1)).e(this.s, paramView, this, this.s0);
      int m = rect.left;
      Rect rect1 = this.s;
      rect.left = m + rect1.left;
      rect.top += rect1.top;
      rect.right += rect1.right;
      rect.bottom += rect1.bottom;
    } 
    layoutParams.c = false;
    return rect;
  }
  
  boolean k1(b0 paramb0, int paramInt) {
    if (u0()) {
      paramb0.r = paramInt;
      this.G0.add(paramb0);
      return false;
    } 
    b.h.k.w.B0(paramb0.b, paramInt);
    return true;
  }
  
  public void l(s params) {
    if (this.u0 == null)
      this.u0 = new ArrayList<s>(); 
    this.u0.add(params);
  }
  
  boolean l1(AccessibilityEvent paramAccessibilityEvent) {
    boolean bool = u0();
    boolean bool1 = false;
    if (bool) {
      boolean bool2;
      if (paramAccessibilityEvent != null) {
        bool2 = b.h.k.f0.b.a(paramAccessibilityEvent);
      } else {
        bool2 = false;
      } 
      if (!bool2)
        bool2 = bool1; 
      this.K |= bool2;
      return true;
    } 
    return false;
  }
  
  void m(b0 paramb0, l.c paramc1, l.c paramc2) {
    paramb0.G(false);
    if (this.a0.a(paramb0, paramc1, paramc2))
      N0(); 
  }
  
  public boolean m0() {
    return (!this.F || this.O || this.n.p());
  }
  
  public void m1(int paramInt1, int paramInt2) {
    n1(paramInt1, paramInt2, null);
  }
  
  public void n1(int paramInt1, int paramInt2, Interpolator paramInterpolator) {
    o1(paramInt1, paramInt2, paramInterpolator, -2147483648);
  }
  
  void o(b0 paramb0, l.c paramc1, l.c paramc2) {
    g(paramb0);
    paramb0.G(false);
    if (this.a0.c(paramb0, paramc1, paramc2))
      N0(); 
  }
  
  void o0() {
    this.n = new a(new f(this));
  }
  
  public void o1(int paramInt1, int paramInt2, Interpolator paramInterpolator, int paramInt3) {
    p1(paramInt1, paramInt2, paramInterpolator, paramInt3, false);
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.Q = 0;
    boolean bool = true;
    this.C = true;
    if (!this.F || isLayoutRequested())
      bool = false; 
    this.F = bool;
    o o1 = this.w;
    if (o1 != null)
      o1.z(this); 
    this.y0 = false;
    if (f) {
      ThreadLocal<e> threadLocal = e.b;
      e e1 = threadLocal.get();
      this.q0 = e1;
      if (e1 == null) {
        this.q0 = new e();
        Display display = b.h.k.w.v((View)this);
        float f1 = 60.0F;
        float f2 = f1;
        if (!isInEditMode()) {
          f2 = f1;
          if (display != null) {
            float f = display.getRefreshRate();
            f2 = f1;
            if (f >= 30.0F)
              f2 = f; 
          } 
        } 
        e e2 = this.q0;
        e2.f = (long)(1.0E9F / f2);
        threadLocal.set(e2);
      } 
      this.q0.a(this);
    } 
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    l l1 = this.a0;
    if (l1 != null)
      l1.k(); 
    v1();
    this.C = false;
    o o1 = this.w;
    if (o1 != null)
      o1.A(this, this.l); 
    this.G0.clear();
    removeCallbacks(this.H0);
    this.p.j();
    if (f) {
      e e1 = this.q0;
      if (e1 != null) {
        e1.j(this);
        this.q0 = null;
      } 
    } 
  }
  
  public void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    int i = this.z.size();
    for (byte b1 = 0; b1 < i; b1++)
      ((n)this.z.get(b1)).g(paramCanvas, this, this.s0); 
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield w : Landroidx/recyclerview/widget/RecyclerView$o;
    //   4: ifnonnull -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_0
    //   10: getfield I : Z
    //   13: ifeq -> 18
    //   16: iconst_0
    //   17: ireturn
    //   18: aload_1
    //   19: invokevirtual getAction : ()I
    //   22: bipush #8
    //   24: if_icmpne -> 172
    //   27: aload_1
    //   28: invokevirtual getSource : ()I
    //   31: iconst_2
    //   32: iand
    //   33: ifeq -> 87
    //   36: aload_0
    //   37: getfield w : Landroidx/recyclerview/widget/RecyclerView$o;
    //   40: invokevirtual l : ()Z
    //   43: ifeq -> 57
    //   46: aload_1
    //   47: bipush #9
    //   49: invokevirtual getAxisValue : (I)F
    //   52: fneg
    //   53: fstore_2
    //   54: goto -> 59
    //   57: fconst_0
    //   58: fstore_2
    //   59: fload_2
    //   60: fstore_3
    //   61: aload_0
    //   62: getfield w : Landroidx/recyclerview/widget/RecyclerView$o;
    //   65: invokevirtual k : ()Z
    //   68: ifeq -> 138
    //   71: aload_1
    //   72: bipush #10
    //   74: invokevirtual getAxisValue : (I)F
    //   77: fstore #4
    //   79: fload_2
    //   80: fstore_3
    //   81: fload #4
    //   83: fstore_2
    //   84: goto -> 140
    //   87: aload_1
    //   88: invokevirtual getSource : ()I
    //   91: ldc_w 4194304
    //   94: iand
    //   95: ifeq -> 136
    //   98: aload_1
    //   99: bipush #26
    //   101: invokevirtual getAxisValue : (I)F
    //   104: fstore_2
    //   105: aload_0
    //   106: getfield w : Landroidx/recyclerview/widget/RecyclerView$o;
    //   109: invokevirtual l : ()Z
    //   112: ifeq -> 121
    //   115: fload_2
    //   116: fneg
    //   117: fstore_3
    //   118: goto -> 138
    //   121: aload_0
    //   122: getfield w : Landroidx/recyclerview/widget/RecyclerView$o;
    //   125: invokevirtual k : ()Z
    //   128: ifeq -> 136
    //   131: fconst_0
    //   132: fstore_3
    //   133: goto -> 140
    //   136: fconst_0
    //   137: fstore_3
    //   138: fconst_0
    //   139: fstore_2
    //   140: fload_3
    //   141: fconst_0
    //   142: fcmpl
    //   143: ifne -> 152
    //   146: fload_2
    //   147: fconst_0
    //   148: fcmpl
    //   149: ifeq -> 172
    //   152: aload_0
    //   153: fload_2
    //   154: aload_0
    //   155: getfield m0 : F
    //   158: fmul
    //   159: f2i
    //   160: fload_3
    //   161: aload_0
    //   162: getfield n0 : F
    //   165: fmul
    //   166: f2i
    //   167: aload_1
    //   168: iconst_1
    //   169: invokespecial z0 : (IILandroid/view/MotionEvent;I)V
    //   172: iconst_0
    //   173: ireturn
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    StringBuilder stringBuilder;
    int i;
    boolean bool1 = this.I;
    boolean bool = false;
    if (bool1)
      return false; 
    this.B = null;
    if (U(paramMotionEvent)) {
      r();
      return true;
    } 
    o o1 = this.w;
    if (o1 == null)
      return false; 
    boolean bool2 = o1.k();
    bool1 = this.w.l();
    if (this.d0 == null)
      this.d0 = VelocityTracker.obtain(); 
    this.d0.addMovement(paramMotionEvent);
    int m = paramMotionEvent.getActionMasked();
    int n = paramMotionEvent.getActionIndex();
    if (m != 0) {
      if (m != 1) {
        if (m != 2) {
          if (m != 3) {
            if (m != 5) {
              if (m == 6)
                K0(paramMotionEvent); 
            } else {
              this.c0 = paramMotionEvent.getPointerId(n);
              i = (int)(paramMotionEvent.getX(n) + 0.5F);
              this.g0 = i;
              this.e0 = i;
              n = (int)(paramMotionEvent.getY(n) + 0.5F);
              this.h0 = n;
              this.f0 = n;
            } 
          } else {
            r();
          } 
        } else {
          m = paramMotionEvent.findPointerIndex(this.c0);
          if (m < 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Error processing scroll; pointer index for id ");
            stringBuilder.append(this.c0);
            stringBuilder.append(" not found. Did any MotionEvents get skipped?");
            Log.e("RecyclerView", stringBuilder.toString());
            return false;
          } 
          n = (int)(stringBuilder.getX(m) + 0.5F);
          int i1 = (int)(stringBuilder.getY(m) + 0.5F);
          if (this.b0 != 1) {
            int i2 = this.e0;
            m = this.f0;
            if (i != 0 && Math.abs(n - i2) > this.i0) {
              this.g0 = n;
              n = 1;
            } else {
              n = 0;
            } 
            i = n;
            if (bool1) {
              i = n;
              if (Math.abs(i1 - m) > this.i0) {
                this.h0 = i1;
                i = 1;
              } 
            } 
            if (i != 0)
              setScrollState(1); 
          } 
        } 
      } else {
        this.d0.clear();
        u1(0);
      } 
    } else {
      if (this.J)
        this.J = false; 
      this.c0 = stringBuilder.getPointerId(0);
      n = (int)(stringBuilder.getX() + 0.5F);
      this.g0 = n;
      this.e0 = n;
      n = (int)(stringBuilder.getY() + 0.5F);
      this.h0 = n;
      this.f0 = n;
      if (this.b0 == 2) {
        getParent().requestDisallowInterceptTouchEvent(true);
        setScrollState(1);
        u1(1);
      } 
      int[] arrayOfInt = this.E0;
      arrayOfInt[1] = 0;
      arrayOfInt[0] = 0;
      n = i;
      if (bool1)
        n = i | 0x2; 
      s1(n, 0);
    } 
    if (this.b0 == 1)
      bool = true; 
    return bool;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    androidx.core.os.c.a("RV OnLayout");
    C();
    androidx.core.os.c.b();
    this.F = true;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    o o1 = this.w;
    if (o1 == null) {
      x(paramInt1, paramInt2);
      return;
    } 
    boolean bool = o1.s0();
    boolean bool1 = false;
    if (bool) {
      int i = View.MeasureSpec.getMode(paramInt1);
      int m = View.MeasureSpec.getMode(paramInt2);
      this.w.Z0(this.l, this.s0, paramInt1, paramInt2);
      bool = bool1;
      if (i == 1073741824) {
        bool = bool1;
        if (m == 1073741824)
          bool = true; 
      } 
      this.I0 = bool;
      if (bool || this.v == null)
        return; 
      if (this.s0.e == 1)
        D(); 
      this.w.B1(paramInt1, paramInt2);
      this.s0.j = true;
      E();
      this.w.E1(paramInt1, paramInt2);
      if (this.w.H1()) {
        this.w.B1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        this.s0.j = true;
        E();
        this.w.E1(paramInt1, paramInt2);
      } 
      this.J0 = getMeasuredWidth();
      this.K0 = getMeasuredHeight();
    } else {
      if (this.D) {
        this.w.Z0(this.l, this.s0, paramInt1, paramInt2);
        return;
      } 
      if (this.L) {
        r1();
        H0();
        P0();
        I0();
        y y1 = this.s0;
        if (y1.l) {
          y1.h = true;
        } else {
          this.n.j();
          this.s0.h = false;
        } 
        this.L = false;
        t1(false);
      } else if (this.s0.l) {
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        return;
      } 
      Adapter adapter = this.v;
      if (adapter != null) {
        this.s0.f = adapter.d();
      } else {
        this.s0.f = 0;
      } 
      r1();
      this.w.Z0(this.l, this.s0, paramInt1, paramInt2);
      t1(false);
      this.s0.h = false;
    } 
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect) {
    return u0() ? false : super.onRequestFocusInDescendants(paramInt, paramRect);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof SavedState)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    SavedState savedState = (SavedState)paramParcelable;
    this.m = savedState;
    super.onRestoreInstanceState(savedState.a());
    requestLayout();
  }
  
  protected Parcelable onSaveInstanceState() {
    SavedState savedState1 = new SavedState(super.onSaveInstanceState());
    SavedState savedState2 = this.m;
    if (savedState2 != null) {
      savedState1.b(savedState2);
    } else {
      o o1 = this.w;
      if (o1 != null) {
        savedState1.d = o1.d1();
      } else {
        savedState1.d = null;
      } 
    } 
    return (Parcelable)savedState1;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3 || paramInt2 != paramInt4)
      s0(); 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield I : Z
    //   4: istore_2
    //   5: iconst_0
    //   6: istore_3
    //   7: iload_2
    //   8: ifne -> 1042
    //   11: aload_0
    //   12: getfield J : Z
    //   15: ifeq -> 21
    //   18: goto -> 1042
    //   21: aload_0
    //   22: aload_1
    //   23: invokespecial L : (Landroid/view/MotionEvent;)Z
    //   26: ifeq -> 35
    //   29: aload_0
    //   30: invokespecial r : ()V
    //   33: iconst_1
    //   34: ireturn
    //   35: aload_0
    //   36: getfield w : Landroidx/recyclerview/widget/RecyclerView$o;
    //   39: astore #4
    //   41: aload #4
    //   43: ifnonnull -> 48
    //   46: iconst_0
    //   47: ireturn
    //   48: aload #4
    //   50: invokevirtual k : ()Z
    //   53: istore #5
    //   55: aload_0
    //   56: getfield w : Landroidx/recyclerview/widget/RecyclerView$o;
    //   59: invokevirtual l : ()Z
    //   62: istore_2
    //   63: aload_0
    //   64: getfield d0 : Landroid/view/VelocityTracker;
    //   67: ifnonnull -> 77
    //   70: aload_0
    //   71: invokestatic obtain : ()Landroid/view/VelocityTracker;
    //   74: putfield d0 : Landroid/view/VelocityTracker;
    //   77: aload_1
    //   78: invokevirtual getActionMasked : ()I
    //   81: istore #6
    //   83: aload_1
    //   84: invokevirtual getActionIndex : ()I
    //   87: istore #7
    //   89: iload #6
    //   91: ifne -> 110
    //   94: aload_0
    //   95: getfield E0 : [I
    //   98: astore #4
    //   100: aload #4
    //   102: iconst_1
    //   103: iconst_0
    //   104: iastore
    //   105: aload #4
    //   107: iconst_0
    //   108: iconst_0
    //   109: iastore
    //   110: aload_1
    //   111: invokestatic obtain : (Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
    //   114: astore #4
    //   116: aload_0
    //   117: getfield E0 : [I
    //   120: astore #8
    //   122: aload #4
    //   124: aload #8
    //   126: iconst_0
    //   127: iaload
    //   128: i2f
    //   129: aload #8
    //   131: iconst_1
    //   132: iaload
    //   133: i2f
    //   134: invokevirtual offsetLocation : (FF)V
    //   137: iload #6
    //   139: ifeq -> 941
    //   142: iload #6
    //   144: iconst_1
    //   145: if_icmpeq -> 826
    //   148: iload #6
    //   150: iconst_2
    //   151: if_icmpeq -> 266
    //   154: iload #6
    //   156: iconst_3
    //   157: if_icmpeq -> 256
    //   160: iload #6
    //   162: iconst_5
    //   163: if_icmpeq -> 190
    //   166: iload #6
    //   168: bipush #6
    //   170: if_icmpeq -> 179
    //   173: iload_3
    //   174: istore #9
    //   176: goto -> 1021
    //   179: aload_0
    //   180: aload_1
    //   181: invokespecial K0 : (Landroid/view/MotionEvent;)V
    //   184: iload_3
    //   185: istore #9
    //   187: goto -> 1021
    //   190: aload_0
    //   191: aload_1
    //   192: iload #7
    //   194: invokevirtual getPointerId : (I)I
    //   197: putfield c0 : I
    //   200: aload_1
    //   201: iload #7
    //   203: invokevirtual getX : (I)F
    //   206: ldc_w 0.5
    //   209: fadd
    //   210: f2i
    //   211: istore #6
    //   213: aload_0
    //   214: iload #6
    //   216: putfield g0 : I
    //   219: aload_0
    //   220: iload #6
    //   222: putfield e0 : I
    //   225: aload_1
    //   226: iload #7
    //   228: invokevirtual getY : (I)F
    //   231: ldc_w 0.5
    //   234: fadd
    //   235: f2i
    //   236: istore #7
    //   238: aload_0
    //   239: iload #7
    //   241: putfield h0 : I
    //   244: aload_0
    //   245: iload #7
    //   247: putfield f0 : I
    //   250: iload_3
    //   251: istore #9
    //   253: goto -> 1021
    //   256: aload_0
    //   257: invokespecial r : ()V
    //   260: iload_3
    //   261: istore #9
    //   263: goto -> 1021
    //   266: aload_1
    //   267: aload_0
    //   268: getfield c0 : I
    //   271: invokevirtual findPointerIndex : (I)I
    //   274: istore #7
    //   276: iload #7
    //   278: ifge -> 327
    //   281: new java/lang/StringBuilder
    //   284: dup
    //   285: invokespecial <init> : ()V
    //   288: astore_1
    //   289: aload_1
    //   290: ldc_w 'Error processing scroll; pointer index for id '
    //   293: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   296: pop
    //   297: aload_1
    //   298: aload_0
    //   299: getfield c0 : I
    //   302: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   305: pop
    //   306: aload_1
    //   307: ldc_w ' not found. Did any MotionEvents get skipped?'
    //   310: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: pop
    //   314: ldc_w 'RecyclerView'
    //   317: aload_1
    //   318: invokevirtual toString : ()Ljava/lang/String;
    //   321: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   324: pop
    //   325: iconst_0
    //   326: ireturn
    //   327: aload_1
    //   328: iload #7
    //   330: invokevirtual getX : (I)F
    //   333: ldc_w 0.5
    //   336: fadd
    //   337: f2i
    //   338: istore #10
    //   340: aload_1
    //   341: iload #7
    //   343: invokevirtual getY : (I)F
    //   346: ldc_w 0.5
    //   349: fadd
    //   350: f2i
    //   351: istore #11
    //   353: aload_0
    //   354: getfield g0 : I
    //   357: iload #10
    //   359: isub
    //   360: istore #7
    //   362: aload_0
    //   363: getfield h0 : I
    //   366: iload #11
    //   368: isub
    //   369: istore #9
    //   371: iload #7
    //   373: istore #6
    //   375: iload #9
    //   377: istore #12
    //   379: aload_0
    //   380: getfield b0 : I
    //   383: iconst_1
    //   384: if_icmpeq -> 544
    //   387: iload #7
    //   389: istore #13
    //   391: iload #5
    //   393: ifeq -> 445
    //   396: iload #7
    //   398: ifle -> 417
    //   401: iconst_0
    //   402: iload #7
    //   404: aload_0
    //   405: getfield i0 : I
    //   408: isub
    //   409: invokestatic max : (II)I
    //   412: istore #7
    //   414: goto -> 430
    //   417: iconst_0
    //   418: iload #7
    //   420: aload_0
    //   421: getfield i0 : I
    //   424: iadd
    //   425: invokestatic min : (II)I
    //   428: istore #7
    //   430: iload #7
    //   432: istore #13
    //   434: iload #7
    //   436: ifeq -> 445
    //   439: iconst_1
    //   440: istore #6
    //   442: goto -> 452
    //   445: iconst_0
    //   446: istore #6
    //   448: iload #13
    //   450: istore #7
    //   452: iload #9
    //   454: istore #13
    //   456: iload #6
    //   458: istore #14
    //   460: iload_2
    //   461: ifeq -> 518
    //   464: iload #9
    //   466: ifle -> 485
    //   469: iconst_0
    //   470: iload #9
    //   472: aload_0
    //   473: getfield i0 : I
    //   476: isub
    //   477: invokestatic max : (II)I
    //   480: istore #12
    //   482: goto -> 498
    //   485: iconst_0
    //   486: iload #9
    //   488: aload_0
    //   489: getfield i0 : I
    //   492: iadd
    //   493: invokestatic min : (II)I
    //   496: istore #12
    //   498: iload #12
    //   500: istore #13
    //   502: iload #6
    //   504: istore #14
    //   506: iload #12
    //   508: ifeq -> 518
    //   511: iconst_1
    //   512: istore #14
    //   514: iload #12
    //   516: istore #13
    //   518: iload #7
    //   520: istore #6
    //   522: iload #13
    //   524: istore #12
    //   526: iload #14
    //   528: ifeq -> 544
    //   531: aload_0
    //   532: iconst_1
    //   533: invokevirtual setScrollState : (I)V
    //   536: iload #13
    //   538: istore #12
    //   540: iload #7
    //   542: istore #6
    //   544: iload #6
    //   546: istore #13
    //   548: iload_3
    //   549: istore #9
    //   551: aload_0
    //   552: getfield b0 : I
    //   555: iconst_1
    //   556: if_icmpne -> 1021
    //   559: aload_0
    //   560: getfield F0 : [I
    //   563: astore #8
    //   565: aload #8
    //   567: iconst_0
    //   568: iconst_0
    //   569: iastore
    //   570: aload #8
    //   572: iconst_1
    //   573: iconst_0
    //   574: iastore
    //   575: iload #5
    //   577: ifeq -> 587
    //   580: iload #13
    //   582: istore #9
    //   584: goto -> 590
    //   587: iconst_0
    //   588: istore #9
    //   590: iload_2
    //   591: ifeq -> 601
    //   594: iload #12
    //   596: istore #14
    //   598: goto -> 604
    //   601: iconst_0
    //   602: istore #14
    //   604: iload #13
    //   606: istore #6
    //   608: iload #12
    //   610: istore #7
    //   612: aload_0
    //   613: iload #9
    //   615: iload #14
    //   617: aload #8
    //   619: aload_0
    //   620: getfield D0 : [I
    //   623: iconst_0
    //   624: invokevirtual G : (II[I[II)Z
    //   627: ifeq -> 706
    //   630: aload_0
    //   631: getfield F0 : [I
    //   634: astore #8
    //   636: iload #13
    //   638: aload #8
    //   640: iconst_0
    //   641: iaload
    //   642: isub
    //   643: istore #6
    //   645: iload #12
    //   647: aload #8
    //   649: iconst_1
    //   650: iaload
    //   651: isub
    //   652: istore #7
    //   654: aload_0
    //   655: getfield E0 : [I
    //   658: astore #8
    //   660: aload #8
    //   662: iconst_0
    //   663: iaload
    //   664: istore #13
    //   666: aload_0
    //   667: getfield D0 : [I
    //   670: astore #15
    //   672: aload #8
    //   674: iconst_0
    //   675: iload #13
    //   677: aload #15
    //   679: iconst_0
    //   680: iaload
    //   681: iadd
    //   682: iastore
    //   683: aload #8
    //   685: iconst_1
    //   686: aload #8
    //   688: iconst_1
    //   689: iaload
    //   690: aload #15
    //   692: iconst_1
    //   693: iaload
    //   694: iadd
    //   695: iastore
    //   696: aload_0
    //   697: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   700: iconst_1
    //   701: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   706: aload_0
    //   707: getfield D0 : [I
    //   710: astore #8
    //   712: aload_0
    //   713: iload #10
    //   715: aload #8
    //   717: iconst_0
    //   718: iaload
    //   719: isub
    //   720: putfield g0 : I
    //   723: aload_0
    //   724: iload #11
    //   726: aload #8
    //   728: iconst_1
    //   729: iaload
    //   730: isub
    //   731: putfield h0 : I
    //   734: iload #5
    //   736: ifeq -> 746
    //   739: iload #6
    //   741: istore #13
    //   743: goto -> 749
    //   746: iconst_0
    //   747: istore #13
    //   749: iload_2
    //   750: ifeq -> 760
    //   753: iload #7
    //   755: istore #12
    //   757: goto -> 763
    //   760: iconst_0
    //   761: istore #12
    //   763: aload_0
    //   764: iload #13
    //   766: iload #12
    //   768: aload_1
    //   769: iconst_0
    //   770: invokevirtual g1 : (IILandroid/view/MotionEvent;I)Z
    //   773: ifeq -> 786
    //   776: aload_0
    //   777: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   780: iconst_1
    //   781: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   786: aload_0
    //   787: getfield q0 : Landroidx/recyclerview/widget/e;
    //   790: astore_1
    //   791: iload_3
    //   792: istore #9
    //   794: aload_1
    //   795: ifnull -> 1021
    //   798: iload #6
    //   800: ifne -> 811
    //   803: iload_3
    //   804: istore #9
    //   806: iload #7
    //   808: ifeq -> 1021
    //   811: aload_1
    //   812: aload_0
    //   813: iload #6
    //   815: iload #7
    //   817: invokevirtual f : (Landroidx/recyclerview/widget/RecyclerView;II)V
    //   820: iload_3
    //   821: istore #9
    //   823: goto -> 1021
    //   826: aload_0
    //   827: getfield d0 : Landroid/view/VelocityTracker;
    //   830: aload #4
    //   832: invokevirtual addMovement : (Landroid/view/MotionEvent;)V
    //   835: aload_0
    //   836: getfield d0 : Landroid/view/VelocityTracker;
    //   839: sipush #1000
    //   842: aload_0
    //   843: getfield l0 : I
    //   846: i2f
    //   847: invokevirtual computeCurrentVelocity : (IF)V
    //   850: iload #5
    //   852: ifeq -> 872
    //   855: aload_0
    //   856: getfield d0 : Landroid/view/VelocityTracker;
    //   859: aload_0
    //   860: getfield c0 : I
    //   863: invokevirtual getXVelocity : (I)F
    //   866: fneg
    //   867: fstore #16
    //   869: goto -> 875
    //   872: fconst_0
    //   873: fstore #16
    //   875: iload_2
    //   876: ifeq -> 896
    //   879: aload_0
    //   880: getfield d0 : Landroid/view/VelocityTracker;
    //   883: aload_0
    //   884: getfield c0 : I
    //   887: invokevirtual getYVelocity : (I)F
    //   890: fneg
    //   891: fstore #17
    //   893: goto -> 899
    //   896: fconst_0
    //   897: fstore #17
    //   899: fload #16
    //   901: fconst_0
    //   902: fcmpl
    //   903: ifne -> 913
    //   906: fload #17
    //   908: fconst_0
    //   909: fcmpl
    //   910: ifeq -> 926
    //   913: aload_0
    //   914: fload #16
    //   916: f2i
    //   917: fload #17
    //   919: f2i
    //   920: invokevirtual b0 : (II)Z
    //   923: ifne -> 931
    //   926: aload_0
    //   927: iconst_0
    //   928: invokevirtual setScrollState : (I)V
    //   931: aload_0
    //   932: invokespecial d1 : ()V
    //   935: iconst_1
    //   936: istore #9
    //   938: goto -> 1021
    //   941: aload_0
    //   942: aload_1
    //   943: iconst_0
    //   944: invokevirtual getPointerId : (I)I
    //   947: putfield c0 : I
    //   950: aload_1
    //   951: invokevirtual getX : ()F
    //   954: ldc_w 0.5
    //   957: fadd
    //   958: f2i
    //   959: istore #7
    //   961: aload_0
    //   962: iload #7
    //   964: putfield g0 : I
    //   967: aload_0
    //   968: iload #7
    //   970: putfield e0 : I
    //   973: aload_1
    //   974: invokevirtual getY : ()F
    //   977: ldc_w 0.5
    //   980: fadd
    //   981: f2i
    //   982: istore #7
    //   984: aload_0
    //   985: iload #7
    //   987: putfield h0 : I
    //   990: aload_0
    //   991: iload #7
    //   993: putfield f0 : I
    //   996: iload #5
    //   998: istore #7
    //   1000: iload_2
    //   1001: ifeq -> 1010
    //   1004: iload #5
    //   1006: iconst_2
    //   1007: ior
    //   1008: istore #7
    //   1010: aload_0
    //   1011: iload #7
    //   1013: iconst_0
    //   1014: invokevirtual s1 : (II)Z
    //   1017: pop
    //   1018: iload_3
    //   1019: istore #9
    //   1021: iload #9
    //   1023: ifne -> 1035
    //   1026: aload_0
    //   1027: getfield d0 : Landroid/view/VelocityTracker;
    //   1030: aload #4
    //   1032: invokevirtual addMovement : (Landroid/view/MotionEvent;)V
    //   1035: aload #4
    //   1037: invokevirtual recycle : ()V
    //   1040: iconst_1
    //   1041: ireturn
    //   1042: iconst_0
    //   1043: ireturn
  }
  
  void p(String paramString) {
    if (u0()) {
      StringBuilder stringBuilder;
      if (paramString == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
        stringBuilder.append(Q());
        throw new IllegalStateException(stringBuilder.toString());
      } 
      throw new IllegalStateException(stringBuilder);
    } 
    if (this.R > 0) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("");
      stringBuilder.append(Q());
      Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(stringBuilder.toString()));
    } 
  }
  
  void p1(int paramInt1, int paramInt2, Interpolator paramInterpolator, int paramInt3, boolean paramBoolean) {
    o o1 = this.w;
    if (o1 == null) {
      Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    } 
    if (this.I)
      return; 
    boolean bool = o1.k();
    int i = 0;
    int m = paramInt1;
    if (!bool)
      m = 0; 
    if (!this.w.l())
      paramInt2 = 0; 
    if (m != 0 || paramInt2 != 0) {
      if (paramInt3 == Integer.MIN_VALUE || paramInt3 > 0) {
        paramInt1 = 1;
      } else {
        paramInt1 = 0;
      } 
      if (paramInt1 != 0) {
        if (paramBoolean) {
          paramInt1 = i;
          if (m != 0)
            paramInt1 = 1; 
          i = paramInt1;
          if (paramInt2 != 0)
            i = paramInt1 | 0x2; 
          s1(i, 1);
        } 
        this.p0.e(m, paramInt2, paramInt3, paramInterpolator);
      } else {
        scrollBy(m, paramInt2);
      } 
    } 
  }
  
  boolean q(b0 paramb0) {
    l l1 = this.a0;
    return (l1 == null || l1.g(paramb0, paramb0.o()));
  }
  
  public void q1(int paramInt) {
    if (this.I)
      return; 
    o o1 = this.w;
    if (o1 == null) {
      Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    } 
    o1.J1(this, this.s0, paramInt);
  }
  
  void r0(StateListDrawable paramStateListDrawable1, Drawable paramDrawable1, StateListDrawable paramStateListDrawable2, Drawable paramDrawable2) {
    if (paramStateListDrawable1 != null && paramDrawable1 != null && paramStateListDrawable2 != null && paramDrawable2 != null) {
      Resources resources = getContext().getResources();
      new d(this, paramStateListDrawable1, paramDrawable1, paramStateListDrawable2, paramDrawable2, resources.getDimensionPixelSize(b.q.b.fastscroll_default_thickness), resources.getDimensionPixelSize(b.q.b.fastscroll_minimum_range), resources.getDimensionPixelOffset(b.q.b.fastscroll_margin));
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Trying to set fast scroller without both required drawables.");
    stringBuilder.append(Q());
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  void r1() {
    int i = this.G + 1;
    this.G = i;
    if (i == 1 && !this.I)
      this.H = false; 
  }
  
  protected void removeDetachedView(View paramView, boolean paramBoolean) {
    StringBuilder stringBuilder;
    b0 b0 = g0(paramView);
    if (b0 != null)
      if (b0.x()) {
        b0.f();
      } else if (!b0.J()) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
        stringBuilder.append(b0);
        stringBuilder.append(Q());
        throw new IllegalArgumentException(stringBuilder.toString());
      }  
    stringBuilder.clearAnimation();
    A((View)stringBuilder);
    super.removeDetachedView((View)stringBuilder, paramBoolean);
  }
  
  public void requestChildFocus(View paramView1, View paramView2) {
    if (!this.w.b1(this, this.s0, paramView1, paramView2) && paramView2 != null)
      b1(paramView1, paramView2); 
    super.requestChildFocus(paramView1, paramView2);
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean) {
    return this.w.r1(this, paramView, paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean) {
    int i = this.A.size();
    for (byte b1 = 0; b1 < i; b1++)
      ((r)this.A.get(b1)).c(paramBoolean); 
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout() {
    if (this.G == 0 && !this.I) {
      super.requestLayout();
    } else {
      this.H = true;
    } 
  }
  
  void s0() {
    this.W = null;
    this.U = null;
    this.V = null;
    this.T = null;
  }
  
  public boolean s1(int paramInt1, int paramInt2) {
    return getScrollingChildHelper().p(paramInt1, paramInt2);
  }
  
  public void scrollBy(int paramInt1, int paramInt2) {
    o o1 = this.w;
    if (o1 == null) {
      Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    } 
    if (this.I)
      return; 
    boolean bool1 = o1.k();
    boolean bool2 = this.w.l();
    if (bool1 || bool2) {
      if (!bool1)
        paramInt1 = 0; 
      if (!bool2)
        paramInt2 = 0; 
      g1(paramInt1, paramInt2, null, 0);
    } 
  }
  
  public void scrollTo(int paramInt1, int paramInt2) {
    Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
  }
  
  public void sendAccessibilityEventUnchecked(AccessibilityEvent paramAccessibilityEvent) {
    if (l1(paramAccessibilityEvent))
      return; 
    super.sendAccessibilityEventUnchecked(paramAccessibilityEvent);
  }
  
  public void setAccessibilityDelegateCompat(k paramk) {
    this.z0 = paramk;
    b.h.k.w.r0((View)this, paramk);
  }
  
  public void setAdapter(Adapter paramAdapter) {
    setLayoutFrozen(false);
    j1(paramAdapter, false, true);
    Q0(false);
    requestLayout();
  }
  
  public void setChildDrawingOrderCallback(j paramj) {
    boolean bool;
    if (paramj == this.A0)
      return; 
    this.A0 = paramj;
    if (paramj != null) {
      bool = true;
    } else {
      bool = false;
    } 
    setChildrenDrawingOrderEnabled(bool);
  }
  
  public void setClipToPadding(boolean paramBoolean) {
    if (paramBoolean != this.q)
      s0(); 
    this.q = paramBoolean;
    super.setClipToPadding(paramBoolean);
    if (this.F)
      requestLayout(); 
  }
  
  public void setEdgeEffectFactory(k paramk) {
    b.h.j.i.e(paramk);
    this.S = paramk;
    s0();
  }
  
  public void setHasFixedSize(boolean paramBoolean) {
    this.D = paramBoolean;
  }
  
  public void setItemAnimator(l paraml) {
    l l1 = this.a0;
    if (l1 != null) {
      l1.k();
      this.a0.v(null);
    } 
    this.a0 = paraml;
    if (paraml != null)
      paraml.v(this.x0); 
  }
  
  public void setItemViewCacheSize(int paramInt) {
    this.l.G(paramInt);
  }
  
  @Deprecated
  public void setLayoutFrozen(boolean paramBoolean) {
    suppressLayout(paramBoolean);
  }
  
  public void setLayoutManager(o paramo) {
    if (paramo == this.w)
      return; 
    v1();
    if (this.w != null) {
      l l1 = this.a0;
      if (l1 != null)
        l1.k(); 
      this.w.k1(this.l);
      this.w.l1(this.l);
      this.l.c();
      if (this.C)
        this.w.A(this, this.l); 
      this.w.F1(null);
      this.w = null;
    } else {
      this.l.c();
    } 
    this.o.o();
    this.w = paramo;
    if (paramo != null)
      if (paramo.b == null) {
        paramo.F1(this);
        if (this.C)
          this.w.z(this); 
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LayoutManager ");
        stringBuilder.append(paramo);
        stringBuilder.append(" is already attached to a RecyclerView:");
        stringBuilder.append(paramo.b.Q());
        throw new IllegalArgumentException(stringBuilder.toString());
      }  
    this.l.K();
    requestLayout();
  }
  
  @Deprecated
  public void setLayoutTransition(LayoutTransition paramLayoutTransition) {
    if (Build.VERSION.SDK_INT < 18) {
      if (paramLayoutTransition == null) {
        suppressLayout(false);
        return;
      } 
      if (paramLayoutTransition.getAnimator(0) == null && paramLayoutTransition.getAnimator(1) == null && paramLayoutTransition.getAnimator(2) == null && paramLayoutTransition.getAnimator(3) == null && paramLayoutTransition.getAnimator(4) == null) {
        suppressLayout(true);
        return;
      } 
    } 
    if (paramLayoutTransition == null) {
      super.setLayoutTransition(null);
      return;
    } 
    throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean) {
    getScrollingChildHelper().m(paramBoolean);
  }
  
  public void setOnFlingListener(q paramq) {
    this.j0 = paramq;
  }
  
  @Deprecated
  public void setOnScrollListener(s params) {
    this.t0 = params;
  }
  
  public void setPreserveFocusAfterLayout(boolean paramBoolean) {
    this.o0 = paramBoolean;
  }
  
  public void setRecycledViewPool(t paramt) {
    this.l.E(paramt);
  }
  
  @Deprecated
  public void setRecyclerListener(v paramv) {
    this.x = paramv;
  }
  
  void setScrollState(int paramInt) {
    if (paramInt == this.b0)
      return; 
    this.b0 = paramInt;
    if (paramInt != 2)
      w1(); 
    I(paramInt);
  }
  
  public void setScrollingTouchSlop(int paramInt) {
    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
    if (paramInt != 0)
      if (paramInt != 1) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setScrollingTouchSlop(): bad argument constant ");
        stringBuilder.append(paramInt);
        stringBuilder.append("; using default value");
        Log.w("RecyclerView", stringBuilder.toString());
      } else {
        this.i0 = viewConfiguration.getScaledPagingTouchSlop();
        return;
      }  
    this.i0 = viewConfiguration.getScaledTouchSlop();
  }
  
  public void setViewCacheExtension(z paramz) {
    this.l.F(paramz);
  }
  
  public boolean startNestedScroll(int paramInt) {
    return getScrollingChildHelper().o(paramInt);
  }
  
  public void stopNestedScroll() {
    getScrollingChildHelper().q();
  }
  
  public final void suppressLayout(boolean paramBoolean) {
    if (paramBoolean != this.I) {
      p("Do not suppressLayout in layout or scroll");
      if (!paramBoolean) {
        this.I = false;
        if (this.H && this.w != null && this.v != null)
          requestLayout(); 
        this.H = false;
      } else {
        long l1 = SystemClock.uptimeMillis();
        onTouchEvent(MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0));
        this.I = true;
        this.J = true;
        v1();
      } 
    } 
  }
  
  void t() {
    int i = this.o.j();
    for (byte b1 = 0; b1 < i; b1++) {
      b0 b0 = g0(this.o.i(b1));
      if (!b0.J())
        b0.c(); 
    } 
    this.l.d();
  }
  
  boolean t0() {
    boolean bool;
    AccessibilityManager accessibilityManager = this.M;
    if (accessibilityManager != null && accessibilityManager.isEnabled()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  void t1(boolean paramBoolean) {
    if (this.G < 1)
      this.G = 1; 
    if (!paramBoolean && !this.I)
      this.H = false; 
    if (this.G == 1) {
      if (paramBoolean && this.H && !this.I && this.w != null && this.v != null)
        C(); 
      if (!this.I)
        this.H = false; 
    } 
    this.G--;
  }
  
  void u(int paramInt1, int paramInt2) {
    EdgeEffect edgeEffect = this.T;
    if (edgeEffect != null && !edgeEffect.isFinished() && paramInt1 > 0) {
      this.T.onRelease();
      bool1 = this.T.isFinished();
    } else {
      bool1 = false;
    } 
    edgeEffect = this.V;
    boolean bool2 = bool1;
    if (edgeEffect != null) {
      bool2 = bool1;
      if (!edgeEffect.isFinished()) {
        bool2 = bool1;
        if (paramInt1 < 0) {
          this.V.onRelease();
          bool2 = bool1 | this.V.isFinished();
        } 
      } 
    } 
    edgeEffect = this.U;
    boolean bool1 = bool2;
    if (edgeEffect != null) {
      bool1 = bool2;
      if (!edgeEffect.isFinished()) {
        bool1 = bool2;
        if (paramInt2 > 0) {
          this.U.onRelease();
          bool1 = bool2 | this.U.isFinished();
        } 
      } 
    } 
    edgeEffect = this.W;
    bool2 = bool1;
    if (edgeEffect != null) {
      bool2 = bool1;
      if (!edgeEffect.isFinished()) {
        bool2 = bool1;
        if (paramInt2 < 0) {
          this.W.onRelease();
          bool2 = bool1 | this.W.isFinished();
        } 
      } 
    } 
    if (bool2)
      b.h.k.w.h0((View)this); 
  }
  
  public boolean u0() {
    boolean bool;
    if (this.Q > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void u1(int paramInt) {
    getScrollingChildHelper().r(paramInt);
  }
  
  void v() {
    if (!this.F || this.O) {
      androidx.core.os.c.a("RV FullInvalidate");
      C();
      androidx.core.os.c.b();
      return;
    } 
    if (!this.n.p())
      return; 
    if (this.n.o(4) && !this.n.o(11)) {
      androidx.core.os.c.a("RV PartialInvalidate");
      r1();
      H0();
      this.n.v();
      if (!this.H)
        if (n0()) {
          C();
        } else {
          this.n.i();
        }  
      t1(true);
      I0();
      androidx.core.os.c.b();
    } else if (this.n.p()) {
      androidx.core.os.c.a("RV FullInvalidate");
      C();
      androidx.core.os.c.b();
    } 
  }
  
  public void v1() {
    setScrollState(0);
    w1();
  }
  
  void w0(int paramInt) {
    if (this.w == null)
      return; 
    setScrollState(2);
    this.w.x1(paramInt);
    awakenScrollBars();
  }
  
  void x(int paramInt1, int paramInt2) {
    setMeasuredDimension(o.n(paramInt1, getPaddingLeft() + getPaddingRight(), b.h.k.w.E((View)this)), o.n(paramInt2, getPaddingTop() + getPaddingBottom(), b.h.k.w.D((View)this)));
  }
  
  void x0() {
    int i = this.o.j();
    for (byte b1 = 0; b1 < i; b1++)
      ((LayoutParams)this.o.i(b1).getLayoutParams()).c = true; 
    this.l.s();
  }
  
  void x1(int paramInt1, int paramInt2, Object paramObject) {
    int i = this.o.j();
    for (byte b1 = 0; b1 < i; b1++) {
      View view = this.o.i(b1);
      b0 b0 = g0(view);
      if (b0 != null && !b0.J()) {
        int m = b0.d;
        if (m >= paramInt1 && m < paramInt1 + paramInt2) {
          b0.b(2);
          b0.a(paramObject);
          ((LayoutParams)view.getLayoutParams()).c = true;
        } 
      } 
    } 
    this.l.M(paramInt1, paramInt2);
  }
  
  void y0() {
    int i = this.o.j();
    for (byte b1 = 0; b1 < i; b1++) {
      b0 b0 = g0(this.o.i(b1));
      if (b0 != null && !b0.J())
        b0.b(6); 
    } 
    x0();
    this.l.t();
  }
  
  void z(View paramView) {
    b0 b0 = g0(paramView);
    F0(paramView);
    Adapter<b0> adapter = this.v;
    if (adapter != null && b0 != null)
      adapter.u(b0); 
    List<p> list = this.N;
    if (list != null)
      for (int i = list.size() - 1; i >= 0; i--)
        ((p)this.N.get(i)).b(paramView);  
  }
  
  static {
    boolean bool;
  }
  
  static {
    int i = Build.VERSION.SDK_INT;
    if (i == 18 || i == 19 || i == 20) {
      bool = true;
    } else {
      bool = false;
    } 
    c = bool;
    if (i >= 23) {
      bool = true;
    } else {
      bool = false;
    } 
    d = bool;
    if (i >= 16) {
      bool = true;
    } else {
      bool = false;
    } 
    e = bool;
    if (i >= 21) {
      bool = true;
    } else {
      bool = false;
    } 
    f = bool;
    if (i <= 15) {
      bool = true;
    } else {
      bool = false;
    } 
    g = bool;
    if (i <= 15) {
      bool = true;
    } else {
      bool = false;
    } 
    h = bool;
    Class<int> clazz = int.class;
    i = new Class[] { Context.class, AttributeSet.class, clazz, clazz };
  }
  
  public static abstract class Adapter<VH extends b0> {
    private final RecyclerView.h a = new RecyclerView.h();
    
    private boolean b = false;
    
    private StateRestorationPolicy c = StateRestorationPolicy.b;
    
    public final void a(VH param1VH, int param1Int) {
      boolean bool;
      if (((RecyclerView.b0)param1VH).t == null) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        ((RecyclerView.b0)param1VH).d = param1Int;
        if (h())
          ((RecyclerView.b0)param1VH).f = e(param1Int); 
        param1VH.F(1, 519);
        androidx.core.os.c.a("RV OnBindView");
      } 
      ((RecyclerView.b0)param1VH).t = this;
      q(param1VH, param1Int, param1VH.o());
      if (bool) {
        param1VH.d();
        ViewGroup.LayoutParams layoutParams = ((RecyclerView.b0)param1VH).b.getLayoutParams();
        if (layoutParams instanceof RecyclerView.LayoutParams)
          ((RecyclerView.LayoutParams)layoutParams).c = true; 
        androidx.core.os.c.b();
      } 
    }
    
    boolean b() {
      int i = RecyclerView.g.a[this.c.ordinal()];
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (i != 1) {
        if (i != 2)
          return true; 
        bool2 = bool1;
        if (d() > 0)
          bool2 = true; 
      } 
      return bool2;
    }
    
    public final VH c(ViewGroup param1ViewGroup, int param1Int) {
      try {
        androidx.core.os.c.a("RV CreateView");
        param1ViewGroup = (ViewGroup)r(param1ViewGroup, param1Int);
        if (((RecyclerView.b0)param1ViewGroup).b.getParent() == null) {
          ((RecyclerView.b0)param1ViewGroup).g = param1Int;
          return (VH)param1ViewGroup;
        } 
        IllegalStateException illegalStateException = new IllegalStateException();
        this("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        throw illegalStateException;
      } finally {
        androidx.core.os.c.b();
      } 
    }
    
    public abstract int d();
    
    public long e(int param1Int) {
      return -1L;
    }
    
    public int f(int param1Int) {
      return 0;
    }
    
    public final boolean g() {
      return this.a.a();
    }
    
    public final boolean h() {
      return this.b;
    }
    
    public final void i() {
      this.a.b();
    }
    
    public final void j(int param1Int) {
      this.a.e(param1Int, 1);
    }
    
    public final void k(int param1Int1, int param1Int2) {
      this.a.c(param1Int1, param1Int2);
    }
    
    public final void l(int param1Int1, int param1Int2) {
      this.a.e(param1Int1, param1Int2);
    }
    
    public final void m(int param1Int1, int param1Int2) {
      this.a.f(param1Int1, param1Int2);
    }
    
    public final void n(int param1Int) {
      this.a.f(param1Int, 1);
    }
    
    public void o(RecyclerView param1RecyclerView) {}
    
    public abstract void p(VH param1VH, int param1Int);
    
    public void q(VH param1VH, int param1Int, List<Object> param1List) {
      p(param1VH, param1Int);
    }
    
    public abstract VH r(ViewGroup param1ViewGroup, int param1Int);
    
    public void s(RecyclerView param1RecyclerView) {}
    
    public boolean t(VH param1VH) {
      return false;
    }
    
    public void u(VH param1VH) {}
    
    public void v(VH param1VH) {}
    
    public void w(VH param1VH) {}
    
    public void x(RecyclerView.i param1i) {
      this.a.registerObserver(param1i);
    }
    
    public void y(boolean param1Boolean) {
      if (!g()) {
        this.b = param1Boolean;
        return;
      } 
      throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }
    
    public void z(RecyclerView.i param1i) {
      this.a.unregisterObserver(param1i);
    }
    
    public enum StateRestorationPolicy {
      b, c, d;
      
      static {
        StateRestorationPolicy stateRestorationPolicy1 = new StateRestorationPolicy("ALLOW", 0);
        b = stateRestorationPolicy1;
        StateRestorationPolicy stateRestorationPolicy2 = new StateRestorationPolicy("PREVENT_WHEN_EMPTY", 1);
        c = stateRestorationPolicy2;
        StateRestorationPolicy stateRestorationPolicy3 = new StateRestorationPolicy("PREVENT", 2);
        d = stateRestorationPolicy3;
        e = new StateRestorationPolicy[] { stateRestorationPolicy1, stateRestorationPolicy2, stateRestorationPolicy3 };
      }
    }
  }
  
  public enum StateRestorationPolicy {
    b, c, d;
    
    static {
      StateRestorationPolicy stateRestorationPolicy1 = new StateRestorationPolicy("ALLOW", 0);
      b = stateRestorationPolicy1;
      StateRestorationPolicy stateRestorationPolicy2 = new StateRestorationPolicy("PREVENT_WHEN_EMPTY", 1);
      c = stateRestorationPolicy2;
      StateRestorationPolicy stateRestorationPolicy3 = new StateRestorationPolicy("PREVENT", 2);
      d = stateRestorationPolicy3;
      e = new StateRestorationPolicy[] { stateRestorationPolicy1, stateRestorationPolicy2, stateRestorationPolicy3 };
    }
  }
  
  public static class LayoutParams extends ViewGroup.MarginLayoutParams {
    RecyclerView.b0 a;
    
    final Rect b = new Rect();
    
    boolean c = true;
    
    boolean d = false;
    
    public LayoutParams(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    public LayoutParams(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
    
    public LayoutParams(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public LayoutParams(ViewGroup.MarginLayoutParams param1MarginLayoutParams) {
      super(param1MarginLayoutParams);
    }
    
    public LayoutParams(LayoutParams param1LayoutParams) {
      super((ViewGroup.LayoutParams)param1LayoutParams);
    }
    
    public int a() {
      return this.a.m();
    }
    
    public boolean b() {
      return this.a.y();
    }
    
    public boolean c() {
      return this.a.v();
    }
    
    public boolean d() {
      return this.a.t();
    }
  }
  
  public static class SavedState extends AbsSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = (Parcelable.Creator<SavedState>)new a();
    
    Parcelable d;
    
    SavedState(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      if (param1ClassLoader == null)
        param1ClassLoader = RecyclerView.o.class.getClassLoader(); 
      this.d = param1Parcel.readParcelable(param1ClassLoader);
    }
    
    SavedState(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    void b(SavedState param1SavedState) {
      this.d = param1SavedState.d;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeParcelable(this.d, 0);
    }
    
    class a implements Parcelable.ClassLoaderCreator<SavedState> {
      public RecyclerView.SavedState a(Parcel param2Parcel) {
        return new RecyclerView.SavedState(param2Parcel, null);
      }
      
      public RecyclerView.SavedState b(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new RecyclerView.SavedState(param2Parcel, param2ClassLoader);
      }
      
      public RecyclerView.SavedState[] c(int param2Int) {
        return new RecyclerView.SavedState[param2Int];
      }
    }
  }
  
  class a implements Parcelable.ClassLoaderCreator<SavedState> {
    public RecyclerView.SavedState a(Parcel param1Parcel) {
      return new RecyclerView.SavedState(param1Parcel, null);
    }
    
    public RecyclerView.SavedState b(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new RecyclerView.SavedState(param1Parcel, param1ClassLoader);
    }
    
    public RecyclerView.SavedState[] c(int param1Int) {
      return new RecyclerView.SavedState[param1Int];
    }
  }
  
  class a implements Runnable {
    a(RecyclerView this$0) {}
    
    public void run() {
      RecyclerView recyclerView = this.b;
      if (recyclerView.F && !recyclerView.isLayoutRequested()) {
        recyclerView = this.b;
        if (!recyclerView.C) {
          recyclerView.requestLayout();
          return;
        } 
        if (recyclerView.I) {
          recyclerView.H = true;
          return;
        } 
        recyclerView.v();
      } 
    }
  }
  
  class a0 implements Runnable {
    private int b;
    
    private int c;
    
    OverScroller d;
    
    Interpolator e;
    
    private boolean f;
    
    private boolean g;
    
    a0(RecyclerView this$0) {
      Interpolator interpolator = RecyclerView.j;
      this.e = interpolator;
      this.f = false;
      this.g = false;
      this.d = new OverScroller(this$0.getContext(), interpolator);
    }
    
    private int a(int param1Int1, int param1Int2) {
      int i = Math.abs(param1Int1);
      int j = Math.abs(param1Int2);
      if (i > j) {
        param1Int2 = 1;
      } else {
        param1Int2 = 0;
      } 
      RecyclerView recyclerView = this.h;
      if (param1Int2 != 0) {
        param1Int1 = recyclerView.getWidth();
      } else {
        param1Int1 = recyclerView.getHeight();
      } 
      if (param1Int2 != 0) {
        param1Int2 = i;
      } else {
        param1Int2 = j;
      } 
      return Math.min((int)((param1Int2 / param1Int1 + 1.0F) * 300.0F), 2000);
    }
    
    private void c() {
      this.h.removeCallbacks(this);
      b.h.k.w.j0((View)this.h, this);
    }
    
    public void b(int param1Int1, int param1Int2) {
      this.h.setScrollState(2);
      this.c = 0;
      this.b = 0;
      Interpolator interpolator1 = this.e;
      Interpolator interpolator2 = RecyclerView.j;
      if (interpolator1 != interpolator2) {
        this.e = interpolator2;
        this.d = new OverScroller(this.h.getContext(), interpolator2);
      } 
      this.d.fling(0, 0, param1Int1, param1Int2, -2147483648, 2147483647, -2147483648, 2147483647);
      d();
    }
    
    void d() {
      if (this.f) {
        this.g = true;
      } else {
        c();
      } 
    }
    
    public void e(int param1Int1, int param1Int2, int param1Int3, Interpolator param1Interpolator) {
      int i = param1Int3;
      if (param1Int3 == Integer.MIN_VALUE)
        i = a(param1Int1, param1Int2); 
      Interpolator interpolator = param1Interpolator;
      if (param1Interpolator == null)
        interpolator = RecyclerView.j; 
      if (this.e != interpolator) {
        this.e = interpolator;
        this.d = new OverScroller(this.h.getContext(), interpolator);
      } 
      this.c = 0;
      this.b = 0;
      this.h.setScrollState(2);
      this.d.startScroll(0, 0, param1Int1, param1Int2, i);
      if (Build.VERSION.SDK_INT < 23)
        this.d.computeScrollOffset(); 
      d();
    }
    
    public void f() {
      this.h.removeCallbacks(this);
      this.d.abortAnimation();
    }
    
    public void run() {
      RecyclerView recyclerView = this.h;
      if (recyclerView.w == null) {
        f();
        return;
      } 
      this.g = false;
      this.f = true;
      recyclerView.v();
      OverScroller overScroller = this.d;
      if (overScroller.computeScrollOffset()) {
        int i = overScroller.getCurrX();
        int j = overScroller.getCurrY();
        int k = i - this.b;
        int m = j - this.c;
        this.b = i;
        this.c = j;
        RecyclerView recyclerView1 = this.h;
        int[] arrayOfInt2 = recyclerView1.F0;
        arrayOfInt2[0] = 0;
        arrayOfInt2[1] = 0;
        j = k;
        i = m;
        if (recyclerView1.G(k, m, arrayOfInt2, null, 1)) {
          int[] arrayOfInt = this.h.F0;
          j = k - arrayOfInt[0];
          i = m - arrayOfInt[1];
        } 
        if (this.h.getOverScrollMode() != 2)
          this.h.u(j, i); 
        RecyclerView recyclerView2 = this.h;
        if (recyclerView2.v != null) {
          int[] arrayOfInt = recyclerView2.F0;
          arrayOfInt[0] = 0;
          arrayOfInt[1] = 0;
          recyclerView2.h1(j, i, arrayOfInt);
          recyclerView2 = this.h;
          arrayOfInt = recyclerView2.F0;
          int i2 = arrayOfInt[0];
          int i3 = arrayOfInt[1];
          int i4 = j - i2;
          int i5 = i - i3;
          RecyclerView.x x2 = recyclerView2.w.g;
          j = i4;
          m = i3;
          i = i2;
          k = i5;
          if (x2 != null) {
            j = i4;
            m = i3;
            i = i2;
            k = i5;
            if (!x2.g()) {
              j = i4;
              m = i3;
              i = i2;
              k = i5;
              if (x2.h()) {
                j = this.h.s0.b();
                if (j == 0) {
                  x2.r();
                  j = i4;
                  m = i3;
                  i = i2;
                  k = i5;
                } else if (x2.f() >= j) {
                  x2.p(j - 1);
                  x2.j(i2, i3);
                  j = i4;
                  m = i3;
                  i = i2;
                  k = i5;
                } else {
                  x2.j(i2, i3);
                  j = i4;
                  m = i3;
                  i = i2;
                  k = i5;
                } 
              } 
            } 
          } 
        } else {
          m = 0;
          boolean bool = false;
          k = i;
          i = bool;
        } 
        if (!this.h.z.isEmpty())
          this.h.invalidate(); 
        recyclerView1 = this.h;
        int[] arrayOfInt1 = recyclerView1.F0;
        arrayOfInt1[0] = 0;
        arrayOfInt1[1] = 0;
        recyclerView1.H(i, m, j, k, null, 1, arrayOfInt1);
        recyclerView1 = this.h;
        arrayOfInt1 = recyclerView1.F0;
        int n = j - arrayOfInt1[0];
        int i1 = k - arrayOfInt1[1];
        if (i != 0 || m != 0)
          recyclerView1.J(i, m); 
        if (!RecyclerView.e(this.h))
          this.h.invalidate(); 
        if (overScroller.getCurrX() == overScroller.getFinalX()) {
          j = 1;
        } else {
          j = 0;
        } 
        if (overScroller.getCurrY() == overScroller.getFinalY()) {
          k = 1;
        } else {
          k = 0;
        } 
        if (overScroller.isFinished() || ((j != 0 || n != 0) && (k != 0 || i1 != 0))) {
          j = 1;
        } else {
          j = 0;
        } 
        RecyclerView.x x1 = this.h.w.g;
        if (x1 != null && x1.g()) {
          k = 1;
        } else {
          k = 0;
        } 
        if (k == 0 && j != 0) {
          if (this.h.getOverScrollMode() != 2) {
            i = (int)overScroller.getCurrVelocity();
            if (n < 0) {
              j = -i;
            } else if (n > 0) {
              j = i;
            } else {
              j = 0;
            } 
            if (i1 < 0) {
              i = -i;
            } else if (i1 <= 0) {
              i = 0;
            } 
            this.h.a(j, i);
          } 
          if (RecyclerView.f)
            this.h.r0.b(); 
        } else {
          d();
          RecyclerView recyclerView3 = this.h;
          e e = recyclerView3.q0;
          if (e != null)
            e.f(recyclerView3, i, m); 
        } 
      } 
      RecyclerView.x x = this.h.w.g;
      if (x != null && x.g())
        x.j(0, 0); 
      this.f = false;
      if (this.g) {
        c();
      } else {
        this.h.setScrollState(0);
        this.h.u1(1);
      } 
    }
  }
  
  class b implements Runnable {
    b(RecyclerView this$0) {}
    
    public void run() {
      RecyclerView.l l = this.b.a0;
      if (l != null)
        l.u(); 
      this.b.y0 = false;
    }
  }
  
  public static abstract class b0 {
    private static final List<Object> a = Collections.emptyList();
    
    public final View b;
    
    WeakReference<RecyclerView> c;
    
    int d = -1;
    
    int e = -1;
    
    long f = -1L;
    
    int g = -1;
    
    int h = -1;
    
    b0 i = null;
    
    b0 j = null;
    
    int k;
    
    List<Object> l = null;
    
    List<Object> m = null;
    
    private int n = 0;
    
    RecyclerView.u o = null;
    
    boolean p = false;
    
    private int q = 0;
    
    int r = -1;
    
    RecyclerView s;
    
    RecyclerView.Adapter<? extends b0> t;
    
    public b0(View param1View) {
      if (param1View != null) {
        this.b = param1View;
        return;
      } 
      throw new IllegalArgumentException("itemView may not be null");
    }
    
    private void g() {
      if (this.l == null) {
        ArrayList<Object> arrayList = new ArrayList();
        this.l = arrayList;
        this.m = Collections.unmodifiableList(arrayList);
      } 
    }
    
    void A(int param1Int, boolean param1Boolean) {
      if (this.e == -1)
        this.e = this.d; 
      if (this.h == -1)
        this.h = this.d; 
      if (param1Boolean)
        this.h += param1Int; 
      this.d += param1Int;
      if (this.b.getLayoutParams() != null)
        ((RecyclerView.LayoutParams)this.b.getLayoutParams()).c = true; 
    }
    
    void B(RecyclerView param1RecyclerView) {
      int i = this.r;
      if (i != -1) {
        this.q = i;
      } else {
        this.q = b.h.k.w.A(this.b);
      } 
      param1RecyclerView.k1(this, 4);
    }
    
    void C(RecyclerView param1RecyclerView) {
      param1RecyclerView.k1(this, this.q);
      this.q = 0;
    }
    
    void D() {
      this.k = 0;
      this.d = -1;
      this.e = -1;
      this.f = -1L;
      this.h = -1;
      this.n = 0;
      this.i = null;
      this.j = null;
      d();
      this.q = 0;
      this.r = -1;
      RecyclerView.s(this);
    }
    
    void E() {
      if (this.e == -1)
        this.e = this.d; 
    }
    
    void F(int param1Int1, int param1Int2) {
      this.k = param1Int1 & param1Int2 | this.k & (param1Int2 ^ 0xFFFFFFFF);
    }
    
    public final void G(boolean param1Boolean) {
      int i = this.n;
      if (param1Boolean) {
        i--;
      } else {
        i++;
      } 
      this.n = i;
      if (i < 0) {
        this.n = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
        stringBuilder.append(this);
        Log.e("View", stringBuilder.toString());
      } else if (!param1Boolean && i == 1) {
        this.k |= 0x10;
      } else if (param1Boolean && i == 0) {
        this.k &= 0xFFFFFFEF;
      } 
    }
    
    void H(RecyclerView.u param1u, boolean param1Boolean) {
      this.o = param1u;
      this.p = param1Boolean;
    }
    
    boolean I() {
      boolean bool;
      if ((this.k & 0x10) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    boolean J() {
      boolean bool;
      if ((this.k & 0x80) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    void K() {
      this.o.J(this);
    }
    
    boolean L() {
      boolean bool;
      if ((this.k & 0x20) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    void a(Object param1Object) {
      if (param1Object == null) {
        b(1024);
      } else if ((0x400 & this.k) == 0) {
        g();
        this.l.add(param1Object);
      } 
    }
    
    void b(int param1Int) {
      this.k = param1Int | this.k;
    }
    
    void c() {
      this.e = -1;
      this.h = -1;
    }
    
    void d() {
      List<Object> list = this.l;
      if (list != null)
        list.clear(); 
      this.k &= 0xFFFFFBFF;
    }
    
    void e() {
      this.k &= 0xFFFFFFDF;
    }
    
    void f() {
      this.k &= 0xFFFFFEFF;
    }
    
    boolean h() {
      boolean bool;
      if ((this.k & 0x10) == 0 && b.h.k.w.S(this.b)) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    void i(int param1Int1, int param1Int2, boolean param1Boolean) {
      b(8);
      A(param1Int2, param1Boolean);
      this.d = param1Int1;
    }
    
    public final int j() {
      RecyclerView recyclerView = this.s;
      return (recyclerView == null) ? -1 : recyclerView.c0(this);
    }
    
    public final long k() {
      return this.f;
    }
    
    public final int l() {
      return this.g;
    }
    
    public final int m() {
      int i = this.h;
      int j = i;
      if (i == -1)
        j = this.d; 
      return j;
    }
    
    public final int n() {
      return this.e;
    }
    
    List<Object> o() {
      if ((this.k & 0x400) == 0) {
        List<Object> list = this.l;
        return (list == null || list.size() == 0) ? a : this.m;
      } 
      return a;
    }
    
    boolean p(int param1Int) {
      boolean bool;
      if ((param1Int & this.k) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    boolean q() {
      return ((this.k & 0x200) != 0 || t());
    }
    
    boolean r() {
      boolean bool;
      if (this.b.getParent() != null && this.b.getParent() != this.s) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    boolean s() {
      int i = this.k;
      boolean bool = true;
      if ((i & 0x1) == 0)
        bool = false; 
      return bool;
    }
    
    boolean t() {
      boolean bool;
      if ((this.k & 0x4) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public String toString() {
      String str;
      if (getClass().isAnonymousClass()) {
        str = "ViewHolder";
      } else {
        str = getClass().getSimpleName();
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      stringBuilder.append("{");
      stringBuilder.append(Integer.toHexString(hashCode()));
      stringBuilder.append(" position=");
      stringBuilder.append(this.d);
      stringBuilder.append(" id=");
      stringBuilder.append(this.f);
      stringBuilder.append(", oldPos=");
      stringBuilder.append(this.e);
      stringBuilder.append(", pLpos:");
      stringBuilder.append(this.h);
      stringBuilder = new StringBuilder(stringBuilder.toString());
      if (w()) {
        stringBuilder.append(" scrap ");
        if (this.p) {
          str = "[changeScrap]";
        } else {
          str = "[attachedScrap]";
        } 
        stringBuilder.append(str);
      } 
      if (t())
        stringBuilder.append(" invalid"); 
      if (!s())
        stringBuilder.append(" unbound"); 
      if (z())
        stringBuilder.append(" update"); 
      if (v())
        stringBuilder.append(" removed"); 
      if (J())
        stringBuilder.append(" ignored"); 
      if (x())
        stringBuilder.append(" tmpDetached"); 
      if (!u()) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(" not recyclable(");
        stringBuilder1.append(this.n);
        stringBuilder1.append(")");
        stringBuilder.append(stringBuilder1.toString());
      } 
      if (q())
        stringBuilder.append(" undefined adapter position"); 
      if (this.b.getParent() == null)
        stringBuilder.append(" no parent"); 
      stringBuilder.append("}");
      return stringBuilder.toString();
    }
    
    public final boolean u() {
      boolean bool;
      if ((this.k & 0x10) == 0 && !b.h.k.w.S(this.b)) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    boolean v() {
      boolean bool;
      if ((this.k & 0x8) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    boolean w() {
      boolean bool;
      if (this.o != null) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    boolean x() {
      boolean bool;
      if ((this.k & 0x100) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    boolean y() {
      boolean bool;
      if ((this.k & 0x2) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    boolean z() {
      boolean bool;
      if ((this.k & 0x2) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
  }
  
  class c implements Interpolator {
    public float getInterpolation(float param1Float) {
      param1Float--;
      return param1Float * param1Float * param1Float * param1Float * param1Float + 1.0F;
    }
  }
  
  class d implements p.b {
    d(RecyclerView this$0) {}
    
    public void a(RecyclerView.b0 param1b0) {
      RecyclerView recyclerView = this.a;
      recyclerView.w.m1(param1b0.b, recyclerView.l);
    }
    
    public void b(RecyclerView.b0 param1b0, RecyclerView.l.c param1c1, RecyclerView.l.c param1c2) {
      this.a.m(param1b0, param1c1, param1c2);
    }
    
    public void c(RecyclerView.b0 param1b0, RecyclerView.l.c param1c1, RecyclerView.l.c param1c2) {
      this.a.l.J(param1b0);
      this.a.o(param1b0, param1c1, param1c2);
    }
    
    public void d(RecyclerView.b0 param1b0, RecyclerView.l.c param1c1, RecyclerView.l.c param1c2) {
      param1b0.G(false);
      RecyclerView recyclerView = this.a;
      if (recyclerView.O) {
        if (recyclerView.a0.b(param1b0, param1b0, param1c1, param1c2))
          this.a.N0(); 
      } else if (recyclerView.a0.d(param1b0, param1c1, param1c2)) {
        this.a.N0();
      } 
    }
  }
  
  class e implements b.b {
    e(RecyclerView this$0) {}
    
    public View a(int param1Int) {
      return this.a.getChildAt(param1Int);
    }
    
    public void b(View param1View) {
      RecyclerView.b0 b0 = RecyclerView.g0(param1View);
      if (b0 != null)
        b0.B(this.a); 
    }
    
    public int c() {
      return this.a.getChildCount();
    }
    
    public void d() {
      int i = c();
      for (byte b1 = 0; b1 < i; b1++) {
        View view = a(b1);
        this.a.A(view);
        view.clearAnimation();
      } 
      this.a.removeAllViews();
    }
    
    public int e(View param1View) {
      return this.a.indexOfChild(param1View);
    }
    
    public RecyclerView.b0 f(View param1View) {
      return RecyclerView.g0(param1View);
    }
    
    public void g(int param1Int) {
      View view = a(param1Int);
      if (view != null) {
        RecyclerView.b0 b0 = RecyclerView.g0(view);
        if (b0 != null)
          if (!b0.x() || b0.J()) {
            b0.b(256);
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("called detach on an already detached child ");
            stringBuilder.append(b0);
            stringBuilder.append(this.a.Q());
            throw new IllegalArgumentException(stringBuilder.toString());
          }  
      } 
      RecyclerView.d(this.a, param1Int);
    }
    
    public void h(View param1View) {
      RecyclerView.b0 b0 = RecyclerView.g0(param1View);
      if (b0 != null)
        b0.C(this.a); 
    }
    
    public void i(View param1View, int param1Int) {
      this.a.addView(param1View, param1Int);
      this.a.z(param1View);
    }
    
    public void j(int param1Int) {
      View view = this.a.getChildAt(param1Int);
      if (view != null) {
        this.a.A(view);
        view.clearAnimation();
      } 
      this.a.removeViewAt(param1Int);
    }
    
    public void k(View param1View, int param1Int, ViewGroup.LayoutParams param1LayoutParams) {
      StringBuilder stringBuilder;
      RecyclerView.b0 b0 = RecyclerView.g0(param1View);
      if (b0 != null)
        if (b0.x() || b0.J()) {
          b0.f();
        } else {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Called attach on a child which is not detached: ");
          stringBuilder.append(b0);
          stringBuilder.append(this.a.Q());
          throw new IllegalArgumentException(stringBuilder.toString());
        }  
      RecyclerView.c(this.a, (View)stringBuilder, param1Int, param1LayoutParams);
    }
  }
  
  class f implements a.a {
    f(RecyclerView this$0) {}
    
    public void a(int param1Int1, int param1Int2) {
      this.a.D0(param1Int1, param1Int2);
      this.a.v0 = true;
    }
    
    public void b(a.b param1b) {
      i(param1b);
    }
    
    public void c(int param1Int1, int param1Int2, Object param1Object) {
      this.a.x1(param1Int1, param1Int2, param1Object);
      this.a.w0 = true;
    }
    
    public void d(a.b param1b) {
      i(param1b);
    }
    
    public RecyclerView.b0 e(int param1Int) {
      RecyclerView.b0 b0 = this.a.a0(param1Int, true);
      return (b0 == null) ? null : (this.a.o.n(b0.b) ? null : b0);
    }
    
    public void f(int param1Int1, int param1Int2) {
      this.a.E0(param1Int1, param1Int2, false);
      this.a.v0 = true;
    }
    
    public void g(int param1Int1, int param1Int2) {
      this.a.C0(param1Int1, param1Int2);
      this.a.v0 = true;
    }
    
    public void h(int param1Int1, int param1Int2) {
      this.a.E0(param1Int1, param1Int2, true);
      RecyclerView recyclerView = this.a;
      recyclerView.v0 = true;
      RecyclerView.y y = recyclerView.s0;
      y.d += param1Int2;
    }
    
    void i(a.b param1b) {
      int i = param1b.a;
      if (i != 1) {
        if (i != 2) {
          if (i != 4) {
            if (i == 8) {
              RecyclerView recyclerView = this.a;
              recyclerView.w.T0(recyclerView, param1b.b, param1b.d, 1);
            } 
          } else {
            RecyclerView recyclerView = this.a;
            recyclerView.w.W0(recyclerView, param1b.b, param1b.d, param1b.c);
          } 
        } else {
          RecyclerView recyclerView = this.a;
          recyclerView.w.U0(recyclerView, param1b.b, param1b.d);
        } 
      } else {
        RecyclerView recyclerView = this.a;
        recyclerView.w.R0(recyclerView, param1b.b, param1b.d);
      } 
    }
  }
  
  static class h extends Observable<i> {
    public boolean a() {
      return this.mObservers.isEmpty() ^ true;
    }
    
    public void b() {
      for (int i = this.mObservers.size() - 1; i >= 0; i--)
        ((RecyclerView.i)this.mObservers.get(i)).a(); 
    }
    
    public void c(int param1Int1, int param1Int2) {
      d(param1Int1, param1Int2, null);
    }
    
    public void d(int param1Int1, int param1Int2, Object param1Object) {
      for (int i = this.mObservers.size() - 1; i >= 0; i--)
        ((RecyclerView.i)this.mObservers.get(i)).c(param1Int1, param1Int2, param1Object); 
    }
    
    public void e(int param1Int1, int param1Int2) {
      for (int i = this.mObservers.size() - 1; i >= 0; i--)
        ((RecyclerView.i)this.mObservers.get(i)).d(param1Int1, param1Int2); 
    }
    
    public void f(int param1Int1, int param1Int2) {
      for (int i = this.mObservers.size() - 1; i >= 0; i--)
        ((RecyclerView.i)this.mObservers.get(i)).e(param1Int1, param1Int2); 
    }
  }
  
  public static abstract class i {
    public void a() {}
    
    public void b(int param1Int1, int param1Int2) {}
    
    public void c(int param1Int1, int param1Int2, Object param1Object) {
      b(param1Int1, param1Int2);
    }
    
    public void d(int param1Int1, int param1Int2) {}
    
    public void e(int param1Int1, int param1Int2) {}
  }
  
  public static interface j {
    int a(int param1Int1, int param1Int2);
  }
  
  public static class k {
    protected EdgeEffect a(RecyclerView param1RecyclerView, int param1Int) {
      return new EdgeEffect(param1RecyclerView.getContext());
    }
  }
  
  public static abstract class l {
    private b a = null;
    
    private ArrayList<a> b = new ArrayList<a>();
    
    private long c = 120L;
    
    private long d = 120L;
    
    private long e = 250L;
    
    private long f = 250L;
    
    static int e(RecyclerView.b0 param1b0) {
      int i = param1b0.k & 0xE;
      if (param1b0.t())
        return 4; 
      int j = i;
      if ((i & 0x4) == 0) {
        int k = param1b0.n();
        int m = param1b0.j();
        j = i;
        if (k != -1) {
          j = i;
          if (m != -1) {
            j = i;
            if (k != m)
              j = i | 0x800; 
          } 
        } 
      } 
      return j;
    }
    
    public abstract boolean a(RecyclerView.b0 param1b0, c param1c1, c param1c2);
    
    public abstract boolean b(RecyclerView.b0 param1b01, RecyclerView.b0 param1b02, c param1c1, c param1c2);
    
    public abstract boolean c(RecyclerView.b0 param1b0, c param1c1, c param1c2);
    
    public abstract boolean d(RecyclerView.b0 param1b0, c param1c1, c param1c2);
    
    public abstract boolean f(RecyclerView.b0 param1b0);
    
    public boolean g(RecyclerView.b0 param1b0, List<Object> param1List) {
      return f(param1b0);
    }
    
    public final void h(RecyclerView.b0 param1b0) {
      r(param1b0);
      b b1 = this.a;
      if (b1 != null)
        b1.a(param1b0); 
    }
    
    public final void i() {
      int i = this.b.size();
      for (byte b1 = 0; b1 < i; b1++)
        ((a)this.b.get(b1)).a(); 
      this.b.clear();
    }
    
    public abstract void j(RecyclerView.b0 param1b0);
    
    public abstract void k();
    
    public long l() {
      return this.c;
    }
    
    public long m() {
      return this.f;
    }
    
    public long n() {
      return this.e;
    }
    
    public long o() {
      return this.d;
    }
    
    public abstract boolean p();
    
    public c q() {
      return new c();
    }
    
    public void r(RecyclerView.b0 param1b0) {}
    
    public c s(RecyclerView.y param1y, RecyclerView.b0 param1b0) {
      return q().a(param1b0);
    }
    
    public c t(RecyclerView.y param1y, RecyclerView.b0 param1b0, int param1Int, List<Object> param1List) {
      return q().a(param1b0);
    }
    
    public abstract void u();
    
    void v(b param1b) {
      this.a = param1b;
    }
    
    public static interface a {
      void a();
    }
    
    static interface b {
      void a(RecyclerView.b0 param2b0);
    }
    
    public static class c {
      public int a;
      
      public int b;
      
      public int c;
      
      public int d;
      
      public c a(RecyclerView.b0 param2b0) {
        return b(param2b0, 0);
      }
      
      public c b(RecyclerView.b0 param2b0, int param2Int) {
        View view = param2b0.b;
        this.a = view.getLeft();
        this.b = view.getTop();
        this.c = view.getRight();
        this.d = view.getBottom();
        return this;
      }
    }
  }
  
  public static interface a {
    void a();
  }
  
  static interface b {
    void a(RecyclerView.b0 param1b0);
  }
  
  public static class c {
    public int a;
    
    public int b;
    
    public int c;
    
    public int d;
    
    public c a(RecyclerView.b0 param1b0) {
      return b(param1b0, 0);
    }
    
    public c b(RecyclerView.b0 param1b0, int param1Int) {
      View view = param1b0.b;
      this.a = view.getLeft();
      this.b = view.getTop();
      this.c = view.getRight();
      this.d = view.getBottom();
      return this;
    }
  }
  
  private class m implements l.b {
    m(RecyclerView this$0) {}
    
    public void a(RecyclerView.b0 param1b0) {
      param1b0.G(true);
      if (param1b0.i != null && param1b0.j == null)
        param1b0.i = null; 
      param1b0.j = null;
      if (!param1b0.I() && !this.a.W0(param1b0.b) && param1b0.x())
        this.a.removeDetachedView(param1b0.b, false); 
    }
  }
  
  public static abstract class n {
    @Deprecated
    public void d(Rect param1Rect, int param1Int, RecyclerView param1RecyclerView) {
      param1Rect.set(0, 0, 0, 0);
    }
    
    public void e(Rect param1Rect, View param1View, RecyclerView param1RecyclerView, RecyclerView.y param1y) {
      d(param1Rect, ((RecyclerView.LayoutParams)param1View.getLayoutParams()).a(), param1RecyclerView);
    }
    
    @Deprecated
    public void f(Canvas param1Canvas, RecyclerView param1RecyclerView) {}
    
    public void g(Canvas param1Canvas, RecyclerView param1RecyclerView, RecyclerView.y param1y) {
      f(param1Canvas, param1RecyclerView);
    }
    
    @Deprecated
    public void h(Canvas param1Canvas, RecyclerView param1RecyclerView) {}
    
    public void i(Canvas param1Canvas, RecyclerView param1RecyclerView, RecyclerView.y param1y) {
      h(param1Canvas, param1RecyclerView);
    }
  }
  
  public static abstract class o {
    b a;
    
    RecyclerView b;
    
    private final o.b c;
    
    private final o.b d;
    
    o e;
    
    o f;
    
    RecyclerView.x g;
    
    boolean h;
    
    boolean i;
    
    boolean j;
    
    private boolean k;
    
    private boolean l;
    
    int m;
    
    boolean n;
    
    private int o;
    
    private int p;
    
    private int q;
    
    private int r;
    
    public o() {
      a a = new a(this);
      this.c = a;
      b b1 = new b(this);
      this.d = b1;
      this.e = new o(a);
      this.f = new o(b1);
      this.h = false;
      this.i = false;
      this.j = false;
      this.k = true;
      this.l = true;
    }
    
    public static int K(int param1Int1, int param1Int2, int param1Int3, int param1Int4, boolean param1Boolean) {
      // Byte code:
      //   0: iconst_0
      //   1: iload_0
      //   2: iload_2
      //   3: isub
      //   4: invokestatic max : (II)I
      //   7: istore_2
      //   8: iload #4
      //   10: ifeq -> 48
      //   13: iload_3
      //   14: iflt -> 20
      //   17: goto -> 52
      //   20: iload_3
      //   21: iconst_m1
      //   22: if_icmpne -> 102
      //   25: iload_1
      //   26: istore_0
      //   27: iload_1
      //   28: ldc -2147483648
      //   30: if_icmpeq -> 65
      //   33: iload_1
      //   34: ifeq -> 102
      //   37: iload_1
      //   38: istore_0
      //   39: iload_1
      //   40: ldc 1073741824
      //   42: if_icmpeq -> 65
      //   45: goto -> 102
      //   48: iload_3
      //   49: iflt -> 58
      //   52: ldc 1073741824
      //   54: istore_0
      //   55: goto -> 106
      //   58: iload_3
      //   59: iconst_m1
      //   60: if_icmpne -> 70
      //   63: iload_1
      //   64: istore_0
      //   65: iload_2
      //   66: istore_3
      //   67: goto -> 106
      //   70: iload_3
      //   71: bipush #-2
      //   73: if_icmpne -> 102
      //   76: iload_1
      //   77: ldc -2147483648
      //   79: if_icmpeq -> 96
      //   82: iload_1
      //   83: ldc 1073741824
      //   85: if_icmpne -> 91
      //   88: goto -> 96
      //   91: iconst_0
      //   92: istore_0
      //   93: goto -> 65
      //   96: ldc -2147483648
      //   98: istore_0
      //   99: goto -> 65
      //   102: iconst_0
      //   103: istore_0
      //   104: iconst_0
      //   105: istore_3
      //   106: iload_3
      //   107: iload_0
      //   108: invokestatic makeMeasureSpec : (II)I
      //   111: ireturn
    }
    
    private int[] L(View param1View, Rect param1Rect) {
      int i = e0();
      int j = g0();
      int k = o0();
      int m = f0();
      int n = W();
      int i1 = d0();
      int i2 = param1View.getLeft() + param1Rect.left - param1View.getScrollX();
      int i3 = param1View.getTop() + param1Rect.top - param1View.getScrollY();
      int i4 = param1Rect.width();
      int i5 = param1Rect.height();
      int i6 = i2 - i;
      i = Math.min(0, i6);
      int i7 = i3 - j;
      j = Math.min(0, i7);
      i2 = i4 + i2 - k - m;
      m = Math.max(0, i2);
      i1 = Math.max(0, i5 + i3 - n - i1);
      if (Z() == 1) {
        if (m != 0) {
          i = m;
        } else {
          i = Math.max(i, i2);
        } 
      } else if (i == 0) {
        i = Math.min(i6, m);
      } 
      if (j == 0)
        j = Math.min(i7, i1); 
      return new int[] { i, j };
    }
    
    private void f(View param1View, int param1Int, boolean param1Boolean) {
      StringBuilder stringBuilder;
      RecyclerView.b0 b0 = RecyclerView.g0(param1View);
      if (param1Boolean || b0.v()) {
        this.b.p.b(b0);
      } else {
        this.b.p.p(b0);
      } 
      RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)param1View.getLayoutParams();
      if (b0.L() || b0.w()) {
        if (b0.w()) {
          b0.K();
        } else {
          b0.e();
        } 
        this.a.c(param1View, param1Int, param1View.getLayoutParams(), false);
      } else if (param1View.getParent() == this.b) {
        int i = this.a.m(param1View);
        int j = param1Int;
        if (param1Int == -1)
          j = this.a.g(); 
        if (i != -1) {
          if (i != j)
            this.b.w.B0(i, j); 
        } else {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
          stringBuilder.append(this.b.indexOfChild(param1View));
          stringBuilder.append(this.b.Q());
          throw new IllegalStateException(stringBuilder.toString());
        } 
      } else {
        this.a.a(param1View, param1Int, false);
        layoutParams.c = true;
        RecyclerView.x x1 = this.g;
        if (x1 != null && x1.h())
          this.g.k(param1View); 
      } 
      if (layoutParams.d) {
        ((RecyclerView.b0)stringBuilder).b.invalidate();
        layoutParams.d = false;
      } 
    }
    
    public static d i0(Context param1Context, AttributeSet param1AttributeSet, int param1Int1, int param1Int2) {
      d d = new d();
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, b.q.c.RecyclerView, param1Int1, param1Int2);
      d.a = typedArray.getInt(b.q.c.RecyclerView_android_orientation, 1);
      d.b = typedArray.getInt(b.q.c.RecyclerView_spanCount, 1);
      d.c = typedArray.getBoolean(b.q.c.RecyclerView_reverseLayout, false);
      d.d = typedArray.getBoolean(b.q.c.RecyclerView_stackFromEnd, false);
      typedArray.recycle();
      return d;
    }
    
    public static int n(int param1Int1, int param1Int2, int param1Int3) {
      int i = View.MeasureSpec.getMode(param1Int1);
      param1Int1 = View.MeasureSpec.getSize(param1Int1);
      if (i != Integer.MIN_VALUE) {
        if (i != 1073741824)
          param1Int1 = Math.max(param1Int2, param1Int3); 
        return param1Int1;
      } 
      return Math.min(param1Int1, Math.max(param1Int2, param1Int3));
    }
    
    private boolean t0(RecyclerView param1RecyclerView, int param1Int1, int param1Int2) {
      View view = param1RecyclerView.getFocusedChild();
      if (view == null)
        return false; 
      int i = e0();
      int j = g0();
      int k = o0();
      int m = f0();
      int n = W();
      int i1 = d0();
      Rect rect = this.b.s;
      P(view, rect);
      return !(rect.left - param1Int1 >= k - m || rect.right - param1Int1 <= i || rect.top - param1Int2 >= n - i1 || rect.bottom - param1Int2 <= j);
    }
    
    private void v1(RecyclerView.u param1u, int param1Int, View param1View) {
      RecyclerView.b0 b0 = RecyclerView.g0(param1View);
      if (b0.J())
        return; 
      if (b0.t() && !b0.v() && !this.b.v.h()) {
        q1(param1Int);
        param1u.C(b0);
      } else {
        x(param1Int);
        param1u.D(param1View);
        this.b.p.k(b0);
      } 
    }
    
    private static boolean w0(int param1Int1, int param1Int2, int param1Int3) {
      int i = View.MeasureSpec.getMode(param1Int2);
      param1Int2 = View.MeasureSpec.getSize(param1Int2);
      boolean bool1 = false;
      boolean bool2 = false;
      if (param1Int3 > 0 && param1Int1 != param1Int3)
        return false; 
      if (i != Integer.MIN_VALUE) {
        if (i != 0) {
          if (i != 1073741824)
            return false; 
          if (param1Int2 == param1Int1)
            bool2 = true; 
          return bool2;
        } 
        return true;
      } 
      bool2 = bool1;
      if (param1Int2 >= param1Int1)
        bool2 = true; 
      return bool2;
    }
    
    private void y(int param1Int, View param1View) {
      this.a.d(param1Int);
    }
    
    void A(RecyclerView param1RecyclerView, RecyclerView.u param1u) {
      this.i = false;
      I0(param1RecyclerView, param1u);
    }
    
    public void A0(View param1View, int param1Int1, int param1Int2) {
      RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)param1View.getLayoutParams();
      Rect rect = this.b.k0(param1View);
      int i = rect.left;
      int j = rect.right;
      int k = rect.top;
      int m = rect.bottom;
      param1Int1 = K(o0(), p0(), e0() + f0() + layoutParams.leftMargin + layoutParams.rightMargin + param1Int1 + i + j, layoutParams.width, k());
      param1Int2 = K(W(), X(), g0() + d0() + layoutParams.topMargin + layoutParams.bottomMargin + param1Int2 + k + m, layoutParams.height, l());
      if (G1(param1View, param1Int1, param1Int2, layoutParams))
        param1View.measure(param1Int1, param1Int2); 
    }
    
    void A1(RecyclerView param1RecyclerView) {
      B1(View.MeasureSpec.makeMeasureSpec(param1RecyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(param1RecyclerView.getHeight(), 1073741824));
    }
    
    public View B(View param1View) {
      RecyclerView recyclerView = this.b;
      if (recyclerView == null)
        return null; 
      param1View = recyclerView.S(param1View);
      return (param1View == null) ? null : (this.a.n(param1View) ? null : param1View);
    }
    
    public void B0(int param1Int1, int param1Int2) {
      View view = I(param1Int1);
      if (view != null) {
        x(param1Int1);
        h(view, param1Int2);
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot move a child from non-existing index:");
      stringBuilder.append(param1Int1);
      stringBuilder.append(this.b.toString());
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    void B1(int param1Int1, int param1Int2) {
      this.q = View.MeasureSpec.getSize(param1Int1);
      param1Int1 = View.MeasureSpec.getMode(param1Int1);
      this.o = param1Int1;
      if (param1Int1 == 0 && !RecyclerView.d)
        this.q = 0; 
      this.r = View.MeasureSpec.getSize(param1Int2);
      param1Int1 = View.MeasureSpec.getMode(param1Int2);
      this.p = param1Int1;
      if (param1Int1 == 0 && !RecyclerView.d)
        this.r = 0; 
    }
    
    public View C(int param1Int) {
      int i = J();
      for (byte b1 = 0; b1 < i; b1++) {
        View view = I(b1);
        RecyclerView.b0 b0 = RecyclerView.g0(view);
        if (b0 != null && b0.m() == param1Int && !b0.J() && (this.b.s0.e() || !b0.v()))
          return view; 
      } 
      return null;
    }
    
    public void C0(int param1Int) {
      RecyclerView recyclerView = this.b;
      if (recyclerView != null)
        recyclerView.A0(param1Int); 
    }
    
    public void C1(int param1Int1, int param1Int2) {
      RecyclerView.f(this.b, param1Int1, param1Int2);
    }
    
    public abstract RecyclerView.LayoutParams D();
    
    public void D0(int param1Int) {
      RecyclerView recyclerView = this.b;
      if (recyclerView != null)
        recyclerView.B0(param1Int); 
    }
    
    public void D1(Rect param1Rect, int param1Int1, int param1Int2) {
      int i = param1Rect.width();
      int j = e0();
      int k = f0();
      int m = param1Rect.height();
      int n = g0();
      int i1 = d0();
      C1(n(param1Int1, i + j + k, c0()), n(param1Int2, m + n + i1, b0()));
    }
    
    public RecyclerView.LayoutParams E(Context param1Context, AttributeSet param1AttributeSet) {
      return new RecyclerView.LayoutParams(param1Context, param1AttributeSet);
    }
    
    public void E0(RecyclerView.Adapter param1Adapter1, RecyclerView.Adapter param1Adapter2) {}
    
    void E1(int param1Int1, int param1Int2) {
      int i = J();
      if (i == 0) {
        this.b.x(param1Int1, param1Int2);
        return;
      } 
      byte b1 = 0;
      int j = Integer.MIN_VALUE;
      int k = Integer.MIN_VALUE;
      int m = Integer.MAX_VALUE;
      int n;
      for (n = Integer.MAX_VALUE; b1 < i; n = i1) {
        View view = I(b1);
        Rect rect = this.b.s;
        P(view, rect);
        int i1 = rect.left;
        int i2 = m;
        if (i1 < m)
          i2 = i1; 
        i1 = rect.right;
        m = j;
        if (i1 > j)
          m = i1; 
        j = rect.top;
        i1 = n;
        if (j < n)
          i1 = j; 
        j = rect.bottom;
        n = k;
        if (j > k)
          n = j; 
        b1++;
        j = m;
        k = n;
        m = i2;
      } 
      this.b.s.set(m, n, j, k);
      D1(this.b.s, param1Int1, param1Int2);
    }
    
    public RecyclerView.LayoutParams F(ViewGroup.LayoutParams param1LayoutParams) {
      return (param1LayoutParams instanceof RecyclerView.LayoutParams) ? new RecyclerView.LayoutParams((RecyclerView.LayoutParams)param1LayoutParams) : ((param1LayoutParams instanceof ViewGroup.MarginLayoutParams) ? new RecyclerView.LayoutParams((ViewGroup.MarginLayoutParams)param1LayoutParams) : new RecyclerView.LayoutParams(param1LayoutParams));
    }
    
    public boolean F0(RecyclerView param1RecyclerView, ArrayList<View> param1ArrayList, int param1Int1, int param1Int2) {
      return false;
    }
    
    void F1(RecyclerView param1RecyclerView) {
      if (param1RecyclerView == null) {
        this.b = null;
        this.a = null;
        this.q = 0;
        this.r = 0;
      } else {
        this.b = param1RecyclerView;
        this.a = param1RecyclerView.o;
        this.q = param1RecyclerView.getWidth();
        this.r = param1RecyclerView.getHeight();
      } 
      this.o = 1073741824;
      this.p = 1073741824;
    }
    
    public int G() {
      return -1;
    }
    
    public void G0(RecyclerView param1RecyclerView) {}
    
    boolean G1(View param1View, int param1Int1, int param1Int2, RecyclerView.LayoutParams param1LayoutParams) {
      return (param1View.isLayoutRequested() || !this.k || !w0(param1View.getWidth(), param1Int1, param1LayoutParams.width) || !w0(param1View.getHeight(), param1Int2, param1LayoutParams.height));
    }
    
    public int H(View param1View) {
      return ((RecyclerView.LayoutParams)param1View.getLayoutParams()).b.bottom;
    }
    
    @Deprecated
    public void H0(RecyclerView param1RecyclerView) {}
    
    boolean H1() {
      return false;
    }
    
    public View I(int param1Int) {
      b b1 = this.a;
      if (b1 != null) {
        View view = b1.f(param1Int);
      } else {
        b1 = null;
      } 
      return (View)b1;
    }
    
    public void I0(RecyclerView param1RecyclerView, RecyclerView.u param1u) {
      H0(param1RecyclerView);
    }
    
    boolean I1(View param1View, int param1Int1, int param1Int2, RecyclerView.LayoutParams param1LayoutParams) {
      return (!this.k || !w0(param1View.getMeasuredWidth(), param1Int1, param1LayoutParams.width) || !w0(param1View.getMeasuredHeight(), param1Int2, param1LayoutParams.height));
    }
    
    public int J() {
      boolean bool;
      b b1 = this.a;
      if (b1 != null) {
        bool = b1.g();
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public View J0(View param1View, int param1Int, RecyclerView.u param1u, RecyclerView.y param1y) {
      return null;
    }
    
    public void J1(RecyclerView param1RecyclerView, RecyclerView.y param1y, int param1Int) {
      Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }
    
    public void K0(AccessibilityEvent param1AccessibilityEvent) {
      RecyclerView recyclerView = this.b;
      L0(recyclerView.l, recyclerView.s0, param1AccessibilityEvent);
    }
    
    public void K1(RecyclerView.x param1x) {
      RecyclerView.x x1 = this.g;
      if (x1 != null && param1x != x1 && x1.h())
        this.g.r(); 
      this.g = param1x;
      param1x.q(this.b, this);
    }
    
    public void L0(RecyclerView.u param1u, RecyclerView.y param1y, AccessibilityEvent param1AccessibilityEvent) {
      RecyclerView recyclerView = this.b;
      if (recyclerView != null && param1AccessibilityEvent != null) {
        boolean bool1 = true;
        boolean bool2 = bool1;
        if (!recyclerView.canScrollVertically(1)) {
          bool2 = bool1;
          if (!this.b.canScrollVertically(-1)) {
            bool2 = bool1;
            if (!this.b.canScrollHorizontally(-1))
              if (this.b.canScrollHorizontally(1)) {
                bool2 = bool1;
              } else {
                bool2 = false;
              }  
          } 
        } 
        param1AccessibilityEvent.setScrollable(bool2);
        RecyclerView.Adapter adapter = this.b.v;
        if (adapter != null)
          param1AccessibilityEvent.setItemCount(adapter.d()); 
      } 
    }
    
    void L1() {
      RecyclerView.x x1 = this.g;
      if (x1 != null)
        x1.r(); 
    }
    
    public boolean M() {
      boolean bool;
      RecyclerView recyclerView = this.b;
      if (recyclerView != null && recyclerView.q) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    void M0(b.h.k.f0.c param1c) {
      RecyclerView recyclerView = this.b;
      N0(recyclerView.l, recyclerView.s0, param1c);
    }
    
    public boolean M1() {
      return false;
    }
    
    public int N(RecyclerView.u param1u, RecyclerView.y param1y) {
      return -1;
    }
    
    public void N0(RecyclerView.u param1u, RecyclerView.y param1y, b.h.k.f0.c param1c) {
      if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
        param1c.a(8192);
        param1c.x0(true);
      } 
      if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
        param1c.a(4096);
        param1c.x0(true);
      } 
      param1c.e0(b.h.k.f0.c.b.b(k0(param1u, param1y), N(param1u, param1y), v0(param1u, param1y), l0(param1u, param1y)));
    }
    
    public int O(View param1View) {
      return param1View.getBottom() + H(param1View);
    }
    
    void O0(View param1View, b.h.k.f0.c param1c) {
      RecyclerView.b0 b0 = RecyclerView.g0(param1View);
      if (b0 != null && !b0.v() && !this.a.n(b0.b)) {
        RecyclerView recyclerView = this.b;
        P0(recyclerView.l, recyclerView.s0, param1View, param1c);
      } 
    }
    
    public void P(View param1View, Rect param1Rect) {
      RecyclerView.h0(param1View, param1Rect);
    }
    
    public void P0(RecyclerView.u param1u, RecyclerView.y param1y, View param1View, b.h.k.f0.c param1c) {}
    
    public int Q(View param1View) {
      return param1View.getLeft() - a0(param1View);
    }
    
    public View Q0(View param1View, int param1Int) {
      return null;
    }
    
    public int R(View param1View) {
      Rect rect = ((RecyclerView.LayoutParams)param1View.getLayoutParams()).b;
      return param1View.getMeasuredHeight() + rect.top + rect.bottom;
    }
    
    public void R0(RecyclerView param1RecyclerView, int param1Int1, int param1Int2) {}
    
    public int S(View param1View) {
      Rect rect = ((RecyclerView.LayoutParams)param1View.getLayoutParams()).b;
      return param1View.getMeasuredWidth() + rect.left + rect.right;
    }
    
    public void S0(RecyclerView param1RecyclerView) {}
    
    public int T(View param1View) {
      return param1View.getRight() + j0(param1View);
    }
    
    public void T0(RecyclerView param1RecyclerView, int param1Int1, int param1Int2, int param1Int3) {}
    
    public int U(View param1View) {
      return param1View.getTop() - m0(param1View);
    }
    
    public void U0(RecyclerView param1RecyclerView, int param1Int1, int param1Int2) {}
    
    public View V() {
      RecyclerView recyclerView = this.b;
      if (recyclerView == null)
        return null; 
      View view = recyclerView.getFocusedChild();
      return (view == null || this.a.n(view)) ? null : view;
    }
    
    public void V0(RecyclerView param1RecyclerView, int param1Int1, int param1Int2) {}
    
    public int W() {
      return this.r;
    }
    
    public void W0(RecyclerView param1RecyclerView, int param1Int1, int param1Int2, Object param1Object) {
      V0(param1RecyclerView, param1Int1, param1Int2);
    }
    
    public int X() {
      return this.p;
    }
    
    public void X0(RecyclerView.u param1u, RecyclerView.y param1y) {
      Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }
    
    public int Y() {
      boolean bool;
      RecyclerView recyclerView = this.b;
      if (recyclerView != null) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
      } else {
        recyclerView = null;
      } 
      if (recyclerView != null) {
        bool = recyclerView.d();
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public void Y0(RecyclerView.y param1y) {}
    
    public int Z() {
      return b.h.k.w.C((View)this.b);
    }
    
    public void Z0(RecyclerView.u param1u, RecyclerView.y param1y, int param1Int1, int param1Int2) {
      this.b.x(param1Int1, param1Int2);
    }
    
    public int a0(View param1View) {
      return ((RecyclerView.LayoutParams)param1View.getLayoutParams()).b.left;
    }
    
    @Deprecated
    public boolean a1(RecyclerView param1RecyclerView, View param1View1, View param1View2) {
      return (x0() || param1RecyclerView.u0());
    }
    
    public void b(View param1View) {
      c(param1View, -1);
    }
    
    public int b0() {
      return b.h.k.w.D((View)this.b);
    }
    
    public boolean b1(RecyclerView param1RecyclerView, RecyclerView.y param1y, View param1View1, View param1View2) {
      return a1(param1RecyclerView, param1View1, param1View2);
    }
    
    public void c(View param1View, int param1Int) {
      f(param1View, param1Int, true);
    }
    
    public int c0() {
      return b.h.k.w.E((View)this.b);
    }
    
    public void c1(Parcelable param1Parcelable) {}
    
    public void d(View param1View) {
      e(param1View, -1);
    }
    
    public int d0() {
      boolean bool;
      RecyclerView recyclerView = this.b;
      if (recyclerView != null) {
        bool = recyclerView.getPaddingBottom();
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public Parcelable d1() {
      return null;
    }
    
    public void e(View param1View, int param1Int) {
      f(param1View, param1Int, false);
    }
    
    public int e0() {
      boolean bool;
      RecyclerView recyclerView = this.b;
      if (recyclerView != null) {
        bool = recyclerView.getPaddingLeft();
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public void e1(int param1Int) {}
    
    public int f0() {
      boolean bool;
      RecyclerView recyclerView = this.b;
      if (recyclerView != null) {
        bool = recyclerView.getPaddingRight();
      } else {
        bool = false;
      } 
      return bool;
    }
    
    void f1(RecyclerView.x param1x) {
      if (this.g == param1x)
        this.g = null; 
    }
    
    public void g(String param1String) {
      RecyclerView recyclerView = this.b;
      if (recyclerView != null)
        recyclerView.p(param1String); 
    }
    
    public int g0() {
      boolean bool;
      RecyclerView recyclerView = this.b;
      if (recyclerView != null) {
        bool = recyclerView.getPaddingTop();
      } else {
        bool = false;
      } 
      return bool;
    }
    
    boolean g1(int param1Int, Bundle param1Bundle) {
      RecyclerView recyclerView = this.b;
      return h1(recyclerView.l, recyclerView.s0, param1Int, param1Bundle);
    }
    
    public void h(View param1View, int param1Int) {
      i(param1View, param1Int, (RecyclerView.LayoutParams)param1View.getLayoutParams());
    }
    
    public int h0(View param1View) {
      return ((RecyclerView.LayoutParams)param1View.getLayoutParams()).a();
    }
    
    public boolean h1(RecyclerView.u param1u, RecyclerView.y param1y, int param1Int, Bundle param1Bundle) {
      // Byte code:
      //   0: aload_0
      //   1: getfield b : Landroidx/recyclerview/widget/RecyclerView;
      //   4: astore_1
      //   5: aload_1
      //   6: ifnonnull -> 11
      //   9: iconst_0
      //   10: ireturn
      //   11: iload_3
      //   12: sipush #4096
      //   15: if_icmpeq -> 96
      //   18: iload_3
      //   19: sipush #8192
      //   22: if_icmpeq -> 33
      //   25: iconst_0
      //   26: istore_3
      //   27: iconst_0
      //   28: istore #5
      //   30: goto -> 169
      //   33: aload_1
      //   34: iconst_m1
      //   35: invokevirtual canScrollVertically : (I)Z
      //   38: ifeq -> 60
      //   41: aload_0
      //   42: invokevirtual W : ()I
      //   45: aload_0
      //   46: invokevirtual g0 : ()I
      //   49: isub
      //   50: aload_0
      //   51: invokevirtual d0 : ()I
      //   54: isub
      //   55: ineg
      //   56: istore_3
      //   57: goto -> 62
      //   60: iconst_0
      //   61: istore_3
      //   62: iload_3
      //   63: istore #5
      //   65: aload_0
      //   66: getfield b : Landroidx/recyclerview/widget/RecyclerView;
      //   69: iconst_m1
      //   70: invokevirtual canScrollHorizontally : (I)Z
      //   73: ifeq -> 167
      //   76: aload_0
      //   77: invokevirtual o0 : ()I
      //   80: aload_0
      //   81: invokevirtual e0 : ()I
      //   84: isub
      //   85: aload_0
      //   86: invokevirtual f0 : ()I
      //   89: isub
      //   90: ineg
      //   91: istore #5
      //   93: goto -> 154
      //   96: aload_1
      //   97: iconst_1
      //   98: invokevirtual canScrollVertically : (I)Z
      //   101: ifeq -> 122
      //   104: aload_0
      //   105: invokevirtual W : ()I
      //   108: aload_0
      //   109: invokevirtual g0 : ()I
      //   112: isub
      //   113: aload_0
      //   114: invokevirtual d0 : ()I
      //   117: isub
      //   118: istore_3
      //   119: goto -> 124
      //   122: iconst_0
      //   123: istore_3
      //   124: iload_3
      //   125: istore #5
      //   127: aload_0
      //   128: getfield b : Landroidx/recyclerview/widget/RecyclerView;
      //   131: iconst_1
      //   132: invokevirtual canScrollHorizontally : (I)Z
      //   135: ifeq -> 167
      //   138: aload_0
      //   139: invokevirtual o0 : ()I
      //   142: aload_0
      //   143: invokevirtual e0 : ()I
      //   146: isub
      //   147: aload_0
      //   148: invokevirtual f0 : ()I
      //   151: isub
      //   152: istore #5
      //   154: iload_3
      //   155: istore #6
      //   157: iload #5
      //   159: istore_3
      //   160: iload #6
      //   162: istore #5
      //   164: goto -> 169
      //   167: iconst_0
      //   168: istore_3
      //   169: iload #5
      //   171: ifne -> 180
      //   174: iload_3
      //   175: ifne -> 180
      //   178: iconst_0
      //   179: ireturn
      //   180: aload_0
      //   181: getfield b : Landroidx/recyclerview/widget/RecyclerView;
      //   184: iload_3
      //   185: iload #5
      //   187: aconst_null
      //   188: ldc -2147483648
      //   190: iconst_1
      //   191: invokevirtual p1 : (IILandroid/view/animation/Interpolator;IZ)V
      //   194: iconst_1
      //   195: ireturn
    }
    
    public void i(View param1View, int param1Int, RecyclerView.LayoutParams param1LayoutParams) {
      RecyclerView.b0 b0 = RecyclerView.g0(param1View);
      if (b0.v()) {
        this.b.p.b(b0);
      } else {
        this.b.p.p(b0);
      } 
      this.a.c(param1View, param1Int, (ViewGroup.LayoutParams)param1LayoutParams, b0.v());
    }
    
    boolean i1(View param1View, int param1Int, Bundle param1Bundle) {
      RecyclerView recyclerView = this.b;
      return j1(recyclerView.l, recyclerView.s0, param1View, param1Int, param1Bundle);
    }
    
    public void j(View param1View, Rect param1Rect) {
      RecyclerView recyclerView = this.b;
      if (recyclerView == null) {
        param1Rect.set(0, 0, 0, 0);
        return;
      } 
      param1Rect.set(recyclerView.k0(param1View));
    }
    
    public int j0(View param1View) {
      return ((RecyclerView.LayoutParams)param1View.getLayoutParams()).b.right;
    }
    
    public boolean j1(RecyclerView.u param1u, RecyclerView.y param1y, View param1View, int param1Int, Bundle param1Bundle) {
      return false;
    }
    
    public boolean k() {
      return false;
    }
    
    public int k0(RecyclerView.u param1u, RecyclerView.y param1y) {
      return -1;
    }
    
    public void k1(RecyclerView.u param1u) {
      for (int i = J() - 1; i >= 0; i--) {
        if (!RecyclerView.g0(I(i)).J())
          n1(i, param1u); 
      } 
    }
    
    public boolean l() {
      return false;
    }
    
    public int l0(RecyclerView.u param1u, RecyclerView.y param1y) {
      return 0;
    }
    
    void l1(RecyclerView.u param1u) {
      int i = param1u.j();
      for (int j = i - 1; j >= 0; j--) {
        View view = param1u.n(j);
        RecyclerView.b0 b0 = RecyclerView.g0(view);
        if (!b0.J()) {
          b0.G(false);
          if (b0.x())
            this.b.removeDetachedView(view, false); 
          RecyclerView.l l = this.b.a0;
          if (l != null)
            l.j(b0); 
          b0.G(true);
          param1u.y(view);
        } 
      } 
      param1u.e();
      if (i > 0)
        this.b.invalidate(); 
    }
    
    public boolean m(RecyclerView.LayoutParams param1LayoutParams) {
      boolean bool;
      if (param1LayoutParams != null) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public int m0(View param1View) {
      return ((RecyclerView.LayoutParams)param1View.getLayoutParams()).b.top;
    }
    
    public void m1(View param1View, RecyclerView.u param1u) {
      p1(param1View);
      param1u.B(param1View);
    }
    
    public void n0(View param1View, boolean param1Boolean, Rect param1Rect) {
      if (param1Boolean) {
        Rect rect = ((RecyclerView.LayoutParams)param1View.getLayoutParams()).b;
        param1Rect.set(-rect.left, -rect.top, param1View.getWidth() + rect.right, param1View.getHeight() + rect.bottom);
      } else {
        param1Rect.set(0, 0, param1View.getWidth(), param1View.getHeight());
      } 
      if (this.b != null) {
        Matrix matrix = param1View.getMatrix();
        if (matrix != null && !matrix.isIdentity()) {
          RectF rectF = this.b.u;
          rectF.set(param1Rect);
          matrix.mapRect(rectF);
          param1Rect.set((int)Math.floor(rectF.left), (int)Math.floor(rectF.top), (int)Math.ceil(rectF.right), (int)Math.ceil(rectF.bottom));
        } 
      } 
      param1Rect.offset(param1View.getLeft(), param1View.getTop());
    }
    
    public void n1(int param1Int, RecyclerView.u param1u) {
      View view = I(param1Int);
      q1(param1Int);
      param1u.B(view);
    }
    
    public void o(int param1Int1, int param1Int2, RecyclerView.y param1y, c param1c) {}
    
    public int o0() {
      return this.q;
    }
    
    public boolean o1(Runnable param1Runnable) {
      RecyclerView recyclerView = this.b;
      return (recyclerView != null) ? recyclerView.removeCallbacks(param1Runnable) : false;
    }
    
    public void p(int param1Int, c param1c) {}
    
    public int p0() {
      return this.o;
    }
    
    public void p1(View param1View) {
      this.a.p(param1View);
    }
    
    public int q(RecyclerView.y param1y) {
      return 0;
    }
    
    boolean q0() {
      int i = J();
      for (byte b1 = 0; b1 < i; b1++) {
        ViewGroup.LayoutParams layoutParams = I(b1).getLayoutParams();
        if (layoutParams.width < 0 && layoutParams.height < 0)
          return true; 
      } 
      return false;
    }
    
    public void q1(int param1Int) {
      if (I(param1Int) != null)
        this.a.q(param1Int); 
    }
    
    public int r(RecyclerView.y param1y) {
      return 0;
    }
    
    public boolean r0() {
      return this.i;
    }
    
    public boolean r1(RecyclerView param1RecyclerView, View param1View, Rect param1Rect, boolean param1Boolean) {
      return s1(param1RecyclerView, param1View, param1Rect, param1Boolean, false);
    }
    
    public int s(RecyclerView.y param1y) {
      return 0;
    }
    
    public boolean s0() {
      return this.j;
    }
    
    public boolean s1(RecyclerView param1RecyclerView, View param1View, Rect param1Rect, boolean param1Boolean1, boolean param1Boolean2) {
      int[] arrayOfInt = L(param1View, param1Rect);
      int i = arrayOfInt[0];
      int j = arrayOfInt[1];
      if ((!param1Boolean2 || t0(param1RecyclerView, i, j)) && (i != 0 || j != 0)) {
        if (param1Boolean1) {
          param1RecyclerView.scrollBy(i, j);
        } else {
          param1RecyclerView.m1(i, j);
        } 
        return true;
      } 
      return false;
    }
    
    public int t(RecyclerView.y param1y) {
      return 0;
    }
    
    public void t1() {
      RecyclerView recyclerView = this.b;
      if (recyclerView != null)
        recyclerView.requestLayout(); 
    }
    
    public int u(RecyclerView.y param1y) {
      return 0;
    }
    
    public final boolean u0() {
      return this.l;
    }
    
    public void u1() {
      this.h = true;
    }
    
    public int v(RecyclerView.y param1y) {
      return 0;
    }
    
    public boolean v0(RecyclerView.u param1u, RecyclerView.y param1y) {
      return false;
    }
    
    public void w(RecyclerView.u param1u) {
      for (int i = J() - 1; i >= 0; i--)
        v1(param1u, i, I(i)); 
    }
    
    public int w1(int param1Int, RecyclerView.u param1u, RecyclerView.y param1y) {
      return 0;
    }
    
    public void x(int param1Int) {
      y(param1Int, I(param1Int));
    }
    
    public boolean x0() {
      boolean bool;
      RecyclerView.x x1 = this.g;
      if (x1 != null && x1.h()) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public void x1(int param1Int) {}
    
    public boolean y0(View param1View, boolean param1Boolean1, boolean param1Boolean2) {
      if (this.e.b(param1View, 24579) && this.f.b(param1View, 24579)) {
        param1Boolean2 = true;
      } else {
        param1Boolean2 = false;
      } 
      return param1Boolean1 ? param1Boolean2 : (param1Boolean2 ^ true);
    }
    
    public int y1(int param1Int, RecyclerView.u param1u, RecyclerView.y param1y) {
      return 0;
    }
    
    void z(RecyclerView param1RecyclerView) {
      this.i = true;
      G0(param1RecyclerView);
    }
    
    public void z0(View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)param1View.getLayoutParams();
      Rect rect = layoutParams.b;
      param1View.layout(param1Int1 + rect.left + layoutParams.leftMargin, param1Int2 + rect.top + layoutParams.topMargin, param1Int3 - rect.right - layoutParams.rightMargin, param1Int4 - rect.bottom - layoutParams.bottomMargin);
    }
    
    @Deprecated
    public void z1(boolean param1Boolean) {
      this.j = param1Boolean;
    }
    
    class a implements o.b {
      a(RecyclerView.o this$0) {}
      
      public View a(int param2Int) {
        return this.a.I(param2Int);
      }
      
      public int b(View param2View) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)param2View.getLayoutParams();
        return this.a.Q(param2View) - layoutParams.leftMargin;
      }
      
      public int c() {
        return this.a.e0();
      }
      
      public int d() {
        return this.a.o0() - this.a.f0();
      }
      
      public int e(View param2View) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)param2View.getLayoutParams();
        return this.a.T(param2View) + layoutParams.rightMargin;
      }
    }
    
    class b implements o.b {
      b(RecyclerView.o this$0) {}
      
      public View a(int param2Int) {
        return this.a.I(param2Int);
      }
      
      public int b(View param2View) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)param2View.getLayoutParams();
        return this.a.U(param2View) - layoutParams.topMargin;
      }
      
      public int c() {
        return this.a.g0();
      }
      
      public int d() {
        return this.a.W() - this.a.d0();
      }
      
      public int e(View param2View) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)param2View.getLayoutParams();
        return this.a.O(param2View) + layoutParams.bottomMargin;
      }
    }
    
    public static interface c {
      void a(int param2Int1, int param2Int2);
    }
    
    public static class d {
      public int a;
      
      public int b;
      
      public boolean c;
      
      public boolean d;
    }
  }
  
  class a implements o.b {
    a(RecyclerView this$0) {}
    
    public View a(int param1Int) {
      return this.a.I(param1Int);
    }
    
    public int b(View param1View) {
      RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)param1View.getLayoutParams();
      return this.a.Q(param1View) - layoutParams.leftMargin;
    }
    
    public int c() {
      return this.a.e0();
    }
    
    public int d() {
      return this.a.o0() - this.a.f0();
    }
    
    public int e(View param1View) {
      RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)param1View.getLayoutParams();
      return this.a.T(param1View) + layoutParams.rightMargin;
    }
  }
  
  class b implements o.b {
    b(RecyclerView this$0) {}
    
    public View a(int param1Int) {
      return this.a.I(param1Int);
    }
    
    public int b(View param1View) {
      RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)param1View.getLayoutParams();
      return this.a.U(param1View) - layoutParams.topMargin;
    }
    
    public int c() {
      return this.a.g0();
    }
    
    public int d() {
      return this.a.W() - this.a.d0();
    }
    
    public int e(View param1View) {
      RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)param1View.getLayoutParams();
      return this.a.O(param1View) + layoutParams.bottomMargin;
    }
  }
  
  public static interface c {
    void a(int param1Int1, int param1Int2);
  }
  
  public static class d {
    public int a;
    
    public int b;
    
    public boolean c;
    
    public boolean d;
  }
  
  public static interface p {
    void a(View param1View);
    
    void b(View param1View);
  }
  
  public static abstract class q {
    public abstract boolean a(int param1Int1, int param1Int2);
  }
  
  public static interface r {
    void a(RecyclerView param1RecyclerView, MotionEvent param1MotionEvent);
    
    boolean b(RecyclerView param1RecyclerView, MotionEvent param1MotionEvent);
    
    void c(boolean param1Boolean);
  }
  
  public static abstract class s {
    public void a(RecyclerView param1RecyclerView, int param1Int) {}
    
    public void b(RecyclerView param1RecyclerView, int param1Int1, int param1Int2) {}
  }
  
  public static class t {
    SparseArray<a> a = new SparseArray();
    
    private int b = 0;
    
    private a g(int param1Int) {
      a a1 = (a)this.a.get(param1Int);
      a a2 = a1;
      if (a1 == null) {
        a2 = new a();
        this.a.put(param1Int, a2);
      } 
      return a2;
    }
    
    void a() {
      this.b++;
    }
    
    public void b() {
      for (byte b = 0; b < this.a.size(); b++)
        ((a)this.a.valueAt(b)).a.clear(); 
    }
    
    void c() {
      this.b--;
    }
    
    void d(int param1Int, long param1Long) {
      a a = g(param1Int);
      a.d = j(a.d, param1Long);
    }
    
    void e(int param1Int, long param1Long) {
      a a = g(param1Int);
      a.c = j(a.c, param1Long);
    }
    
    public RecyclerView.b0 f(int param1Int) {
      a a = (a)this.a.get(param1Int);
      if (a != null && !a.a.isEmpty()) {
        ArrayList<RecyclerView.b0> arrayList = a.a;
        for (param1Int = arrayList.size() - 1; param1Int >= 0; param1Int--) {
          if (!((RecyclerView.b0)arrayList.get(param1Int)).r())
            return arrayList.remove(param1Int); 
        } 
      } 
      return null;
    }
    
    void h(RecyclerView.Adapter param1Adapter1, RecyclerView.Adapter param1Adapter2, boolean param1Boolean) {
      if (param1Adapter1 != null)
        c(); 
      if (!param1Boolean && this.b == 0)
        b(); 
      if (param1Adapter2 != null)
        a(); 
    }
    
    public void i(RecyclerView.b0 param1b0) {
      int i = param1b0.l();
      ArrayList<RecyclerView.b0> arrayList = (g(i)).a;
      if (((a)this.a.get(i)).b <= arrayList.size())
        return; 
      param1b0.D();
      arrayList.add(param1b0);
    }
    
    long j(long param1Long1, long param1Long2) {
      return (param1Long1 == 0L) ? param1Long2 : (param1Long1 / 4L * 3L + param1Long2 / 4L);
    }
    
    boolean k(int param1Int, long param1Long1, long param1Long2) {
      long l = (g(param1Int)).d;
      return (l == 0L || param1Long1 + l < param1Long2);
    }
    
    boolean l(int param1Int, long param1Long1, long param1Long2) {
      long l = (g(param1Int)).c;
      return (l == 0L || param1Long1 + l < param1Long2);
    }
    
    static class a {
      final ArrayList<RecyclerView.b0> a = new ArrayList<RecyclerView.b0>();
      
      int b = 5;
      
      long c = 0L;
      
      long d = 0L;
    }
  }
  
  static class a {
    final ArrayList<RecyclerView.b0> a = new ArrayList<RecyclerView.b0>();
    
    int b = 5;
    
    long c = 0L;
    
    long d = 0L;
  }
  
  public final class u {
    final ArrayList<RecyclerView.b0> a;
    
    ArrayList<RecyclerView.b0> b;
    
    final ArrayList<RecyclerView.b0> c;
    
    private final List<RecyclerView.b0> d;
    
    private int e;
    
    int f;
    
    RecyclerView.t g;
    
    private RecyclerView.z h;
    
    public u(RecyclerView this$0) {
      ArrayList<RecyclerView.b0> arrayList = new ArrayList();
      this.a = arrayList;
      this.b = null;
      this.c = new ArrayList<RecyclerView.b0>();
      this.d = Collections.unmodifiableList(arrayList);
      this.e = 2;
      this.f = 2;
    }
    
    private boolean H(RecyclerView.b0 param1b0, int param1Int1, int param1Int2, long param1Long) {
      param1b0.t = null;
      param1b0.s = this.i;
      int i = param1b0.l();
      long l = this.i.getNanoTime();
      if (param1Long != Long.MAX_VALUE && !this.g.k(i, l, param1Long))
        return false; 
      this.i.v.a(param1b0, param1Int1);
      param1Long = this.i.getNanoTime();
      this.g.d(param1b0.l(), param1Long - l);
      b(param1b0);
      if (this.i.s0.e())
        param1b0.h = param1Int2; 
      return true;
    }
    
    private void b(RecyclerView.b0 param1b0) {
      if (this.i.t0()) {
        View view = param1b0.b;
        if (b.h.k.w.A(view) == 0)
          b.h.k.w.B0(view, 1); 
        k k = this.i.z0;
        if (k == null)
          return; 
        b.h.k.a a = k.n();
        if (a instanceof k.a)
          ((k.a)a).o(view); 
        b.h.k.w.r0(view, a);
      } 
    }
    
    private void q(ViewGroup param1ViewGroup, boolean param1Boolean) {
      int i;
      for (i = param1ViewGroup.getChildCount() - 1; i >= 0; i--) {
        View view = param1ViewGroup.getChildAt(i);
        if (view instanceof ViewGroup)
          q((ViewGroup)view, true); 
      } 
      if (!param1Boolean)
        return; 
      if (param1ViewGroup.getVisibility() == 4) {
        param1ViewGroup.setVisibility(0);
        param1ViewGroup.setVisibility(4);
      } else {
        i = param1ViewGroup.getVisibility();
        param1ViewGroup.setVisibility(4);
        param1ViewGroup.setVisibility(i);
      } 
    }
    
    private void r(RecyclerView.b0 param1b0) {
      View view = param1b0.b;
      if (view instanceof ViewGroup)
        q((ViewGroup)view, false); 
    }
    
    void A(int param1Int) {
      a(this.c.get(param1Int), true);
      this.c.remove(param1Int);
    }
    
    public void B(View param1View) {
      RecyclerView.b0 b0 = RecyclerView.g0(param1View);
      if (b0.x())
        this.i.removeDetachedView(param1View, false); 
      if (b0.w()) {
        b0.K();
      } else if (b0.L()) {
        b0.e();
      } 
      C(b0);
      if (this.i.a0 != null && !b0.u())
        this.i.a0.j(b0); 
    }
    
    void C(RecyclerView.b0 param1b0) {
      // Byte code:
      //   0: aload_1
      //   1: invokevirtual w : ()Z
      //   4: istore_2
      //   5: iconst_0
      //   6: istore_3
      //   7: iconst_0
      //   8: istore #4
      //   10: iconst_1
      //   11: istore #5
      //   13: iload_2
      //   14: ifne -> 431
      //   17: aload_1
      //   18: getfield b : Landroid/view/View;
      //   21: invokevirtual getParent : ()Landroid/view/ViewParent;
      //   24: ifnull -> 30
      //   27: goto -> 431
      //   30: aload_1
      //   31: invokevirtual x : ()Z
      //   34: ifne -> 380
      //   37: aload_1
      //   38: invokevirtual J : ()Z
      //   41: ifne -> 340
      //   44: aload_1
      //   45: invokevirtual h : ()Z
      //   48: istore_3
      //   49: aload_0
      //   50: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   53: getfield v : Landroidx/recyclerview/widget/RecyclerView$Adapter;
      //   56: astore #6
      //   58: aload #6
      //   60: ifnull -> 82
      //   63: iload_3
      //   64: ifeq -> 82
      //   67: aload #6
      //   69: aload_1
      //   70: invokevirtual t : (Landroidx/recyclerview/widget/RecyclerView$b0;)Z
      //   73: ifeq -> 82
      //   76: iconst_1
      //   77: istore #7
      //   79: goto -> 85
      //   82: iconst_0
      //   83: istore #7
      //   85: iload #7
      //   87: ifne -> 110
      //   90: iload #4
      //   92: istore #7
      //   94: aload_1
      //   95: invokevirtual u : ()Z
      //   98: ifeq -> 104
      //   101: goto -> 110
      //   104: iconst_0
      //   105: istore #4
      //   107: goto -> 304
      //   110: aload_0
      //   111: getfield f : I
      //   114: ifle -> 280
      //   117: aload_1
      //   118: sipush #526
      //   121: invokevirtual p : (I)Z
      //   124: ifne -> 280
      //   127: aload_0
      //   128: getfield c : Ljava/util/ArrayList;
      //   131: invokevirtual size : ()I
      //   134: istore #4
      //   136: iload #4
      //   138: istore #7
      //   140: iload #4
      //   142: aload_0
      //   143: getfield f : I
      //   146: if_icmplt -> 169
      //   149: iload #4
      //   151: istore #7
      //   153: iload #4
      //   155: ifle -> 169
      //   158: aload_0
      //   159: iconst_0
      //   160: invokevirtual A : (I)V
      //   163: iload #4
      //   165: iconst_1
      //   166: isub
      //   167: istore #7
      //   169: iload #7
      //   171: istore #4
      //   173: getstatic androidx/recyclerview/widget/RecyclerView.f : Z
      //   176: ifeq -> 264
      //   179: iload #7
      //   181: istore #4
      //   183: iload #7
      //   185: ifle -> 264
      //   188: iload #7
      //   190: istore #4
      //   192: aload_0
      //   193: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   196: getfield r0 : Landroidx/recyclerview/widget/e$b;
      //   199: aload_1
      //   200: getfield d : I
      //   203: invokevirtual d : (I)Z
      //   206: ifne -> 264
      //   209: iinc #7, -1
      //   212: iload #7
      //   214: iflt -> 258
      //   217: aload_0
      //   218: getfield c : Ljava/util/ArrayList;
      //   221: iload #7
      //   223: invokevirtual get : (I)Ljava/lang/Object;
      //   226: checkcast androidx/recyclerview/widget/RecyclerView$b0
      //   229: getfield d : I
      //   232: istore #4
      //   234: aload_0
      //   235: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   238: getfield r0 : Landroidx/recyclerview/widget/e$b;
      //   241: iload #4
      //   243: invokevirtual d : (I)Z
      //   246: ifne -> 252
      //   249: goto -> 258
      //   252: iinc #7, -1
      //   255: goto -> 212
      //   258: iload #7
      //   260: iconst_1
      //   261: iadd
      //   262: istore #4
      //   264: aload_0
      //   265: getfield c : Ljava/util/ArrayList;
      //   268: iload #4
      //   270: aload_1
      //   271: invokevirtual add : (ILjava/lang/Object;)V
      //   274: iconst_1
      //   275: istore #7
      //   277: goto -> 283
      //   280: iconst_0
      //   281: istore #7
      //   283: iload #7
      //   285: ifne -> 301
      //   288: aload_0
      //   289: aload_1
      //   290: iconst_1
      //   291: invokevirtual a : (Landroidx/recyclerview/widget/RecyclerView$b0;Z)V
      //   294: iload #5
      //   296: istore #4
      //   298: goto -> 304
      //   301: goto -> 104
      //   304: aload_0
      //   305: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   308: getfield p : Landroidx/recyclerview/widget/p;
      //   311: aload_1
      //   312: invokevirtual q : (Landroidx/recyclerview/widget/RecyclerView$b0;)V
      //   315: iload #7
      //   317: ifne -> 339
      //   320: iload #4
      //   322: ifne -> 339
      //   325: iload_3
      //   326: ifeq -> 339
      //   329: aload_1
      //   330: aconst_null
      //   331: putfield t : Landroidx/recyclerview/widget/RecyclerView$Adapter;
      //   334: aload_1
      //   335: aconst_null
      //   336: putfield s : Landroidx/recyclerview/widget/RecyclerView;
      //   339: return
      //   340: new java/lang/StringBuilder
      //   343: dup
      //   344: invokespecial <init> : ()V
      //   347: astore_1
      //   348: aload_1
      //   349: ldc_w 'Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.'
      //   352: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   355: pop
      //   356: aload_1
      //   357: aload_0
      //   358: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   361: invokevirtual Q : ()Ljava/lang/String;
      //   364: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   367: pop
      //   368: new java/lang/IllegalArgumentException
      //   371: dup
      //   372: aload_1
      //   373: invokevirtual toString : ()Ljava/lang/String;
      //   376: invokespecial <init> : (Ljava/lang/String;)V
      //   379: athrow
      //   380: new java/lang/StringBuilder
      //   383: dup
      //   384: invokespecial <init> : ()V
      //   387: astore #6
      //   389: aload #6
      //   391: ldc_w 'Tmp detached view should be removed from RecyclerView before it can be recycled: '
      //   394: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   397: pop
      //   398: aload #6
      //   400: aload_1
      //   401: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   404: pop
      //   405: aload #6
      //   407: aload_0
      //   408: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   411: invokevirtual Q : ()Ljava/lang/String;
      //   414: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   417: pop
      //   418: new java/lang/IllegalArgumentException
      //   421: dup
      //   422: aload #6
      //   424: invokevirtual toString : ()Ljava/lang/String;
      //   427: invokespecial <init> : (Ljava/lang/String;)V
      //   430: athrow
      //   431: new java/lang/StringBuilder
      //   434: dup
      //   435: invokespecial <init> : ()V
      //   438: astore #6
      //   440: aload #6
      //   442: ldc_w 'Scrapped or attached views may not be recycled. isScrap:'
      //   445: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   448: pop
      //   449: aload #6
      //   451: aload_1
      //   452: invokevirtual w : ()Z
      //   455: invokevirtual append : (Z)Ljava/lang/StringBuilder;
      //   458: pop
      //   459: aload #6
      //   461: ldc_w ' isAttached:'
      //   464: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   467: pop
      //   468: aload_1
      //   469: getfield b : Landroid/view/View;
      //   472: invokevirtual getParent : ()Landroid/view/ViewParent;
      //   475: ifnull -> 480
      //   478: iconst_1
      //   479: istore_3
      //   480: aload #6
      //   482: iload_3
      //   483: invokevirtual append : (Z)Ljava/lang/StringBuilder;
      //   486: pop
      //   487: aload #6
      //   489: aload_0
      //   490: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   493: invokevirtual Q : ()Ljava/lang/String;
      //   496: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   499: pop
      //   500: new java/lang/IllegalArgumentException
      //   503: dup
      //   504: aload #6
      //   506: invokevirtual toString : ()Ljava/lang/String;
      //   509: invokespecial <init> : (Ljava/lang/String;)V
      //   512: astore_1
      //   513: goto -> 518
      //   516: aload_1
      //   517: athrow
      //   518: goto -> 516
    }
    
    void D(View param1View) {
      StringBuilder stringBuilder;
      RecyclerView.b0 b0 = RecyclerView.g0(param1View);
      if (b0.p(12) || !b0.y() || this.i.q(b0)) {
        if (!b0.t() || b0.v() || this.i.v.h()) {
          b0.H(this, false);
          this.a.add(b0);
          return;
        } 
        stringBuilder = new StringBuilder();
        stringBuilder.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
        stringBuilder.append(this.i.Q());
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      if (this.b == null)
        this.b = new ArrayList<RecyclerView.b0>(); 
      stringBuilder.H(this, true);
      this.b.add(stringBuilder);
    }
    
    void E(RecyclerView.t param1t) {
      RecyclerView.t t1 = this.g;
      if (t1 != null)
        t1.c(); 
      this.g = param1t;
      if (param1t != null && this.i.getAdapter() != null)
        this.g.a(); 
    }
    
    void F(RecyclerView.z param1z) {}
    
    public void G(int param1Int) {
      this.e = param1Int;
      K();
    }
    
    RecyclerView.b0 I(int param1Int, boolean param1Boolean, long param1Long) {
      // Byte code:
      //   0: iload_1
      //   1: iflt -> 905
      //   4: iload_1
      //   5: aload_0
      //   6: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   9: getfield s0 : Landroidx/recyclerview/widget/RecyclerView$y;
      //   12: invokevirtual b : ()I
      //   15: if_icmpge -> 905
      //   18: aload_0
      //   19: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   22: getfield s0 : Landroidx/recyclerview/widget/RecyclerView$y;
      //   25: invokevirtual e : ()Z
      //   28: istore #5
      //   30: iconst_1
      //   31: istore #6
      //   33: iload #5
      //   35: ifeq -> 64
      //   38: aload_0
      //   39: iload_1
      //   40: invokevirtual h : (I)Landroidx/recyclerview/widget/RecyclerView$b0;
      //   43: astore #7
      //   45: aload #7
      //   47: astore #8
      //   49: aload #7
      //   51: ifnull -> 67
      //   54: iconst_1
      //   55: istore #9
      //   57: aload #7
      //   59: astore #8
      //   61: goto -> 70
      //   64: aconst_null
      //   65: astore #8
      //   67: iconst_0
      //   68: istore #9
      //   70: aload #8
      //   72: astore #7
      //   74: iload #9
      //   76: istore #10
      //   78: aload #8
      //   80: ifnonnull -> 188
      //   83: aload_0
      //   84: iload_1
      //   85: iload_2
      //   86: invokevirtual m : (IZ)Landroidx/recyclerview/widget/RecyclerView$b0;
      //   89: astore #8
      //   91: aload #8
      //   93: astore #7
      //   95: iload #9
      //   97: istore #10
      //   99: aload #8
      //   101: ifnull -> 188
      //   104: aload_0
      //   105: aload #8
      //   107: invokevirtual L : (Landroidx/recyclerview/widget/RecyclerView$b0;)Z
      //   110: ifne -> 181
      //   113: iload_2
      //   114: ifne -> 171
      //   117: aload #8
      //   119: iconst_4
      //   120: invokevirtual b : (I)V
      //   123: aload #8
      //   125: invokevirtual w : ()Z
      //   128: ifeq -> 152
      //   131: aload_0
      //   132: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   135: aload #8
      //   137: getfield b : Landroid/view/View;
      //   140: iconst_0
      //   141: invokevirtual removeDetachedView : (Landroid/view/View;Z)V
      //   144: aload #8
      //   146: invokevirtual K : ()V
      //   149: goto -> 165
      //   152: aload #8
      //   154: invokevirtual L : ()Z
      //   157: ifeq -> 165
      //   160: aload #8
      //   162: invokevirtual e : ()V
      //   165: aload_0
      //   166: aload #8
      //   168: invokevirtual C : (Landroidx/recyclerview/widget/RecyclerView$b0;)V
      //   171: aconst_null
      //   172: astore #7
      //   174: iload #9
      //   176: istore #10
      //   178: goto -> 188
      //   181: iconst_1
      //   182: istore #10
      //   184: aload #8
      //   186: astore #7
      //   188: aload #7
      //   190: astore #8
      //   192: iload #10
      //   194: istore #11
      //   196: aload #7
      //   198: ifnonnull -> 597
      //   201: aload_0
      //   202: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   205: getfield n : Landroidx/recyclerview/widget/a;
      //   208: iload_1
      //   209: invokevirtual m : (I)I
      //   212: istore #11
      //   214: iload #11
      //   216: iflt -> 504
      //   219: iload #11
      //   221: aload_0
      //   222: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   225: getfield v : Landroidx/recyclerview/widget/RecyclerView$Adapter;
      //   228: invokevirtual d : ()I
      //   231: if_icmpge -> 504
      //   234: aload_0
      //   235: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   238: getfield v : Landroidx/recyclerview/widget/RecyclerView$Adapter;
      //   241: iload #11
      //   243: invokevirtual f : (I)I
      //   246: istore #12
      //   248: aload #7
      //   250: astore #8
      //   252: iload #10
      //   254: istore #9
      //   256: aload_0
      //   257: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   260: getfield v : Landroidx/recyclerview/widget/RecyclerView$Adapter;
      //   263: invokevirtual h : ()Z
      //   266: ifeq -> 317
      //   269: aload_0
      //   270: aload_0
      //   271: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   274: getfield v : Landroidx/recyclerview/widget/RecyclerView$Adapter;
      //   277: iload #11
      //   279: invokevirtual e : (I)J
      //   282: iload #12
      //   284: iload_2
      //   285: invokevirtual l : (JIZ)Landroidx/recyclerview/widget/RecyclerView$b0;
      //   288: astore #7
      //   290: aload #7
      //   292: astore #8
      //   294: iload #10
      //   296: istore #9
      //   298: aload #7
      //   300: ifnull -> 317
      //   303: aload #7
      //   305: iload #11
      //   307: putfield d : I
      //   310: iconst_1
      //   311: istore #9
      //   313: aload #7
      //   315: astore #8
      //   317: aload #8
      //   319: ifnonnull -> 334
      //   322: aload_0
      //   323: getfield h : Landroidx/recyclerview/widget/RecyclerView$z;
      //   326: ifnonnull -> 332
      //   329: goto -> 334
      //   332: aconst_null
      //   333: athrow
      //   334: aload #8
      //   336: astore #7
      //   338: aload #8
      //   340: ifnonnull -> 376
      //   343: aload_0
      //   344: invokevirtual i : ()Landroidx/recyclerview/widget/RecyclerView$t;
      //   347: iload #12
      //   349: invokevirtual f : (I)Landroidx/recyclerview/widget/RecyclerView$b0;
      //   352: astore #7
      //   354: aload #7
      //   356: ifnull -> 376
      //   359: aload #7
      //   361: invokevirtual D : ()V
      //   364: getstatic androidx/recyclerview/widget/RecyclerView.c : Z
      //   367: ifeq -> 376
      //   370: aload_0
      //   371: aload #7
      //   373: invokespecial r : (Landroidx/recyclerview/widget/RecyclerView$b0;)V
      //   376: aload #7
      //   378: astore #8
      //   380: iload #9
      //   382: istore #11
      //   384: aload #7
      //   386: ifnonnull -> 597
      //   389: aload_0
      //   390: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   393: invokevirtual getNanoTime : ()J
      //   396: lstore #13
      //   398: lload_3
      //   399: ldc2_w 9223372036854775807
      //   402: lcmp
      //   403: ifeq -> 423
      //   406: aload_0
      //   407: getfield g : Landroidx/recyclerview/widget/RecyclerView$t;
      //   410: iload #12
      //   412: lload #13
      //   414: lload_3
      //   415: invokevirtual l : (IJJ)Z
      //   418: ifne -> 423
      //   421: aconst_null
      //   422: areturn
      //   423: aload_0
      //   424: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   427: astore #7
      //   429: aload #7
      //   431: getfield v : Landroidx/recyclerview/widget/RecyclerView$Adapter;
      //   434: aload #7
      //   436: iload #12
      //   438: invokevirtual c : (Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$b0;
      //   441: astore #8
      //   443: getstatic androidx/recyclerview/widget/RecyclerView.f : Z
      //   446: ifeq -> 478
      //   449: aload #8
      //   451: getfield b : Landroid/view/View;
      //   454: invokestatic W : (Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;
      //   457: astore #7
      //   459: aload #7
      //   461: ifnull -> 478
      //   464: aload #8
      //   466: new java/lang/ref/WeakReference
      //   469: dup
      //   470: aload #7
      //   472: invokespecial <init> : (Ljava/lang/Object;)V
      //   475: putfield c : Ljava/lang/ref/WeakReference;
      //   478: aload_0
      //   479: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   482: invokevirtual getNanoTime : ()J
      //   485: lstore #15
      //   487: aload_0
      //   488: getfield g : Landroidx/recyclerview/widget/RecyclerView$t;
      //   491: iload #12
      //   493: lload #15
      //   495: lload #13
      //   497: lsub
      //   498: invokevirtual e : (IJ)V
      //   501: goto -> 601
      //   504: new java/lang/StringBuilder
      //   507: dup
      //   508: invokespecial <init> : ()V
      //   511: astore #7
      //   513: aload #7
      //   515: ldc_w 'Inconsistency detected. Invalid item position '
      //   518: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   521: pop
      //   522: aload #7
      //   524: iload_1
      //   525: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   528: pop
      //   529: aload #7
      //   531: ldc_w '(offset:'
      //   534: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   537: pop
      //   538: aload #7
      //   540: iload #11
      //   542: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   545: pop
      //   546: aload #7
      //   548: ldc_w ').state:'
      //   551: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   554: pop
      //   555: aload #7
      //   557: aload_0
      //   558: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   561: getfield s0 : Landroidx/recyclerview/widget/RecyclerView$y;
      //   564: invokevirtual b : ()I
      //   567: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   570: pop
      //   571: aload #7
      //   573: aload_0
      //   574: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   577: invokevirtual Q : ()Ljava/lang/String;
      //   580: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   583: pop
      //   584: new java/lang/IndexOutOfBoundsException
      //   587: dup
      //   588: aload #7
      //   590: invokevirtual toString : ()Ljava/lang/String;
      //   593: invokespecial <init> : (Ljava/lang/String;)V
      //   596: athrow
      //   597: iload #11
      //   599: istore #9
      //   601: iload #9
      //   603: ifeq -> 704
      //   606: aload_0
      //   607: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   610: getfield s0 : Landroidx/recyclerview/widget/RecyclerView$y;
      //   613: invokevirtual e : ()Z
      //   616: ifne -> 704
      //   619: aload #8
      //   621: sipush #8192
      //   624: invokevirtual p : (I)Z
      //   627: ifeq -> 704
      //   630: aload #8
      //   632: iconst_0
      //   633: sipush #8192
      //   636: invokevirtual F : (II)V
      //   639: aload_0
      //   640: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   643: getfield s0 : Landroidx/recyclerview/widget/RecyclerView$y;
      //   646: getfield k : Z
      //   649: ifeq -> 704
      //   652: aload #8
      //   654: invokestatic e : (Landroidx/recyclerview/widget/RecyclerView$b0;)I
      //   657: istore #10
      //   659: aload_0
      //   660: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   663: astore #7
      //   665: aload #7
      //   667: getfield a0 : Landroidx/recyclerview/widget/RecyclerView$l;
      //   670: aload #7
      //   672: getfield s0 : Landroidx/recyclerview/widget/RecyclerView$y;
      //   675: aload #8
      //   677: iload #10
      //   679: sipush #4096
      //   682: ior
      //   683: aload #8
      //   685: invokevirtual o : ()Ljava/util/List;
      //   688: invokevirtual t : (Landroidx/recyclerview/widget/RecyclerView$y;Landroidx/recyclerview/widget/RecyclerView$b0;ILjava/util/List;)Landroidx/recyclerview/widget/RecyclerView$l$c;
      //   691: astore #7
      //   693: aload_0
      //   694: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   697: aload #8
      //   699: aload #7
      //   701: invokevirtual S0 : (Landroidx/recyclerview/widget/RecyclerView$b0;Landroidx/recyclerview/widget/RecyclerView$l$c;)V
      //   704: aload_0
      //   705: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   708: getfield s0 : Landroidx/recyclerview/widget/RecyclerView$y;
      //   711: invokevirtual e : ()Z
      //   714: ifeq -> 734
      //   717: aload #8
      //   719: invokevirtual s : ()Z
      //   722: ifeq -> 734
      //   725: aload #8
      //   727: iload_1
      //   728: putfield h : I
      //   731: goto -> 761
      //   734: aload #8
      //   736: invokevirtual s : ()Z
      //   739: ifeq -> 766
      //   742: aload #8
      //   744: invokevirtual z : ()Z
      //   747: ifne -> 766
      //   750: aload #8
      //   752: invokevirtual t : ()Z
      //   755: ifeq -> 761
      //   758: goto -> 766
      //   761: iconst_0
      //   762: istore_2
      //   763: goto -> 786
      //   766: aload_0
      //   767: aload #8
      //   769: aload_0
      //   770: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   773: getfield n : Landroidx/recyclerview/widget/a;
      //   776: iload_1
      //   777: invokevirtual m : (I)I
      //   780: iload_1
      //   781: lload_3
      //   782: invokespecial H : (Landroidx/recyclerview/widget/RecyclerView$b0;IIJ)Z
      //   785: istore_2
      //   786: aload #8
      //   788: getfield b : Landroid/view/View;
      //   791: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
      //   794: astore #7
      //   796: aload #7
      //   798: ifnonnull -> 826
      //   801: aload_0
      //   802: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   805: invokevirtual generateDefaultLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
      //   808: checkcast androidx/recyclerview/widget/RecyclerView$LayoutParams
      //   811: astore #7
      //   813: aload #8
      //   815: getfield b : Landroid/view/View;
      //   818: aload #7
      //   820: invokevirtual setLayoutParams : (Landroid/view/ViewGroup$LayoutParams;)V
      //   823: goto -> 872
      //   826: aload_0
      //   827: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   830: aload #7
      //   832: invokevirtual checkLayoutParams : (Landroid/view/ViewGroup$LayoutParams;)Z
      //   835: ifne -> 865
      //   838: aload_0
      //   839: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   842: aload #7
      //   844: invokevirtual generateLayoutParams : (Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
      //   847: checkcast androidx/recyclerview/widget/RecyclerView$LayoutParams
      //   850: astore #7
      //   852: aload #8
      //   854: getfield b : Landroid/view/View;
      //   857: aload #7
      //   859: invokevirtual setLayoutParams : (Landroid/view/ViewGroup$LayoutParams;)V
      //   862: goto -> 872
      //   865: aload #7
      //   867: checkcast androidx/recyclerview/widget/RecyclerView$LayoutParams
      //   870: astore #7
      //   872: aload #7
      //   874: aload #8
      //   876: putfield a : Landroidx/recyclerview/widget/RecyclerView$b0;
      //   879: iload #9
      //   881: ifeq -> 894
      //   884: iload_2
      //   885: ifeq -> 894
      //   888: iload #6
      //   890: istore_2
      //   891: goto -> 896
      //   894: iconst_0
      //   895: istore_2
      //   896: aload #7
      //   898: iload_2
      //   899: putfield d : Z
      //   902: aload #8
      //   904: areturn
      //   905: new java/lang/StringBuilder
      //   908: dup
      //   909: invokespecial <init> : ()V
      //   912: astore #7
      //   914: aload #7
      //   916: ldc_w 'Invalid item position '
      //   919: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   922: pop
      //   923: aload #7
      //   925: iload_1
      //   926: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   929: pop
      //   930: aload #7
      //   932: ldc_w '('
      //   935: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   938: pop
      //   939: aload #7
      //   941: iload_1
      //   942: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   945: pop
      //   946: aload #7
      //   948: ldc_w '). Item count:'
      //   951: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   954: pop
      //   955: aload #7
      //   957: aload_0
      //   958: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   961: getfield s0 : Landroidx/recyclerview/widget/RecyclerView$y;
      //   964: invokevirtual b : ()I
      //   967: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   970: pop
      //   971: aload #7
      //   973: aload_0
      //   974: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   977: invokevirtual Q : ()Ljava/lang/String;
      //   980: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   983: pop
      //   984: new java/lang/IndexOutOfBoundsException
      //   987: dup
      //   988: aload #7
      //   990: invokevirtual toString : ()Ljava/lang/String;
      //   993: invokespecial <init> : (Ljava/lang/String;)V
      //   996: athrow
    }
    
    void J(RecyclerView.b0 param1b0) {
      if (param1b0.p) {
        this.b.remove(param1b0);
      } else {
        this.a.remove(param1b0);
      } 
      param1b0.o = null;
      param1b0.p = false;
      param1b0.e();
    }
    
    void K() {
      RecyclerView.o o = this.i.w;
      if (o != null) {
        i = o.m;
      } else {
        i = 0;
      } 
      this.f = this.e + i;
      for (int i = this.c.size() - 1; i >= 0 && this.c.size() > this.f; i--)
        A(i); 
    }
    
    boolean L(RecyclerView.b0 param1b0) {
      if (param1b0.v())
        return this.i.s0.e(); 
      int i = param1b0.d;
      if (i >= 0 && i < this.i.v.d()) {
        boolean bool = this.i.s0.e();
        boolean bool1 = false;
        if (!bool && this.i.v.f(param1b0.d) != param1b0.l())
          return false; 
        if (this.i.v.h()) {
          if (param1b0.k() == this.i.v.e(param1b0.d))
            bool1 = true; 
          return bool1;
        } 
        return true;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Inconsistency detected. Invalid view holder adapter position");
      stringBuilder.append(param1b0);
      stringBuilder.append(this.i.Q());
      throw new IndexOutOfBoundsException(stringBuilder.toString());
    }
    
    void M(int param1Int1, int param1Int2) {
      for (int i = this.c.size() - 1; i >= 0; i--) {
        RecyclerView.b0 b0 = this.c.get(i);
        if (b0 != null) {
          int j = b0.d;
          if (j >= param1Int1 && j < param1Int2 + param1Int1) {
            b0.b(2);
            A(i);
          } 
        } 
      } 
    }
    
    void a(RecyclerView.b0 param1b0, boolean param1Boolean) {
      RecyclerView.s(param1b0);
      View view = param1b0.b;
      k k = this.i.z0;
      if (k != null) {
        b.h.k.a a = k.n();
        if (a instanceof k.a) {
          a = ((k.a)a).n(view);
        } else {
          a = null;
        } 
        b.h.k.w.r0(view, a);
      } 
      if (param1Boolean)
        g(param1b0); 
      param1b0.t = null;
      param1b0.s = null;
      i().i(param1b0);
    }
    
    public void c() {
      this.a.clear();
      z();
    }
    
    void d() {
      int i = this.c.size();
      boolean bool = false;
      byte b;
      for (b = 0; b < i; b++)
        ((RecyclerView.b0)this.c.get(b)).c(); 
      i = this.a.size();
      for (b = 0; b < i; b++)
        ((RecyclerView.b0)this.a.get(b)).c(); 
      ArrayList<RecyclerView.b0> arrayList = this.b;
      if (arrayList != null) {
        i = arrayList.size();
        for (b = bool; b < i; b++)
          ((RecyclerView.b0)this.b.get(b)).c(); 
      } 
    }
    
    void e() {
      this.a.clear();
      ArrayList<RecyclerView.b0> arrayList = this.b;
      if (arrayList != null)
        arrayList.clear(); 
    }
    
    public int f(int param1Int) {
      if (param1Int >= 0 && param1Int < this.i.s0.b())
        return !this.i.s0.e() ? param1Int : this.i.n.m(param1Int); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("invalid position ");
      stringBuilder.append(param1Int);
      stringBuilder.append(". State item count is ");
      stringBuilder.append(this.i.s0.b());
      stringBuilder.append(this.i.Q());
      throw new IndexOutOfBoundsException(stringBuilder.toString());
    }
    
    void g(RecyclerView.b0 param1b0) {
      RecyclerView.v v = this.i.x;
      if (v != null)
        v.a(param1b0); 
      int i = this.i.y.size();
      for (byte b = 0; b < i; b++)
        ((RecyclerView.v)this.i.y.get(b)).a(param1b0); 
      RecyclerView.Adapter<RecyclerView.b0> adapter = this.i.v;
      if (adapter != null)
        adapter.w(param1b0); 
      RecyclerView recyclerView = this.i;
      if (recyclerView.s0 != null)
        recyclerView.p.q(param1b0); 
    }
    
    RecyclerView.b0 h(int param1Int) {
      ArrayList<RecyclerView.b0> arrayList = this.b;
      if (arrayList != null) {
        int i = arrayList.size();
        if (i != 0) {
          boolean bool = false;
          for (byte b = 0; b < i; b++) {
            RecyclerView.b0 b0 = this.b.get(b);
            if (!b0.L() && b0.m() == param1Int) {
              b0.b(32);
              return b0;
            } 
          } 
          if (this.i.v.h()) {
            param1Int = this.i.n.m(param1Int);
            if (param1Int > 0 && param1Int < this.i.v.d()) {
              long l = this.i.v.e(param1Int);
              for (param1Int = bool; param1Int < i; param1Int++) {
                RecyclerView.b0 b0 = this.b.get(param1Int);
                if (!b0.L() && b0.k() == l) {
                  b0.b(32);
                  return b0;
                } 
              } 
            } 
          } 
        } 
      } 
      return null;
    }
    
    RecyclerView.t i() {
      if (this.g == null)
        this.g = new RecyclerView.t(); 
      return this.g;
    }
    
    int j() {
      return this.a.size();
    }
    
    public List<RecyclerView.b0> k() {
      return this.d;
    }
    
    RecyclerView.b0 l(long param1Long, int param1Int, boolean param1Boolean) {
      int i;
      for (i = this.a.size() - 1; i >= 0; i--) {
        RecyclerView.b0 b0 = this.a.get(i);
        if (b0.k() == param1Long && !b0.L()) {
          if (param1Int == b0.l()) {
            b0.b(32);
            if (b0.v() && !this.i.s0.e())
              b0.F(2, 14); 
            return b0;
          } 
          if (!param1Boolean) {
            this.a.remove(i);
            this.i.removeDetachedView(b0.b, false);
            y(b0.b);
          } 
        } 
      } 
      for (i = this.c.size() - 1; i >= 0; i--) {
        RecyclerView.b0 b0 = this.c.get(i);
        if (b0.k() == param1Long && !b0.r()) {
          if (param1Int == b0.l()) {
            if (!param1Boolean)
              this.c.remove(i); 
            return b0;
          } 
          if (!param1Boolean) {
            A(i);
            return null;
          } 
        } 
      } 
      return null;
    }
    
    RecyclerView.b0 m(int param1Int, boolean param1Boolean) {
      int i = this.a.size();
      boolean bool = false;
      byte b;
      for (b = 0; b < i; b++) {
        RecyclerView.b0 b0 = this.a.get(b);
        if (!b0.L() && b0.m() == param1Int && !b0.t() && (this.i.s0.h || !b0.v())) {
          b0.b(32);
          return b0;
        } 
      } 
      if (!param1Boolean) {
        View view = this.i.o.e(param1Int);
        if (view != null) {
          RecyclerView.b0 b0 = RecyclerView.g0(view);
          this.i.o.s(view);
          param1Int = this.i.o.m(view);
          if (param1Int != -1) {
            this.i.o.d(param1Int);
            D(view);
            b0.b(8224);
            return b0;
          } 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("layout index should not be -1 after unhiding a view:");
          stringBuilder.append(b0);
          stringBuilder.append(this.i.Q());
          throw new IllegalStateException(stringBuilder.toString());
        } 
      } 
      i = this.c.size();
      for (b = bool; b < i; b++) {
        RecyclerView.b0 b0 = this.c.get(b);
        if (!b0.t() && b0.m() == param1Int && !b0.r()) {
          if (!param1Boolean)
            this.c.remove(b); 
          return b0;
        } 
      } 
      return null;
    }
    
    View n(int param1Int) {
      return ((RecyclerView.b0)this.a.get(param1Int)).b;
    }
    
    public View o(int param1Int) {
      return p(param1Int, false);
    }
    
    View p(int param1Int, boolean param1Boolean) {
      return (I(param1Int, param1Boolean, Long.MAX_VALUE)).b;
    }
    
    void s() {
      int i = this.c.size();
      for (byte b = 0; b < i; b++) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)((RecyclerView.b0)this.c.get(b)).b.getLayoutParams();
        if (layoutParams != null)
          layoutParams.c = true; 
      } 
    }
    
    void t() {
      int i = this.c.size();
      for (byte b = 0; b < i; b++) {
        RecyclerView.b0 b0 = this.c.get(b);
        if (b0 != null) {
          b0.b(6);
          b0.a(null);
        } 
      } 
      RecyclerView.Adapter adapter = this.i.v;
      if (adapter == null || !adapter.h())
        z(); 
    }
    
    void u(int param1Int1, int param1Int2) {
      int i = this.c.size();
      for (byte b = 0; b < i; b++) {
        RecyclerView.b0 b0 = this.c.get(b);
        if (b0 != null && b0.d >= param1Int1)
          b0.A(param1Int2, false); 
      } 
    }
    
    void v(int param1Int1, int param1Int2) {
      boolean bool;
      int i;
      int j;
      if (param1Int1 < param1Int2) {
        bool = true;
        i = param1Int1;
        j = param1Int2;
      } else {
        bool = true;
        j = param1Int1;
        i = param1Int2;
      } 
      int k = this.c.size();
      for (byte b = 0; b < k; b++) {
        RecyclerView.b0 b0 = this.c.get(b);
        if (b0 != null) {
          int m = b0.d;
          if (m >= i && m <= j)
            if (m == param1Int1) {
              b0.A(param1Int2 - param1Int1, false);
            } else {
              b0.A(bool, false);
            }  
        } 
      } 
    }
    
    void w(int param1Int1, int param1Int2, boolean param1Boolean) {
      for (int i = this.c.size() - 1; i >= 0; i--) {
        RecyclerView.b0 b0 = this.c.get(i);
        if (b0 != null) {
          int j = b0.d;
          if (j >= param1Int1 + param1Int2) {
            b0.A(-param1Int2, param1Boolean);
          } else if (j >= param1Int1) {
            b0.b(8);
            A(i);
          } 
        } 
      } 
    }
    
    void x(RecyclerView.Adapter param1Adapter1, RecyclerView.Adapter param1Adapter2, boolean param1Boolean) {
      c();
      i().h(param1Adapter1, param1Adapter2, param1Boolean);
    }
    
    void y(View param1View) {
      RecyclerView.b0 b0 = RecyclerView.g0(param1View);
      b0.o = null;
      b0.p = false;
      b0.e();
      C(b0);
    }
    
    void z() {
      for (int i = this.c.size() - 1; i >= 0; i--)
        A(i); 
      this.c.clear();
      if (RecyclerView.f)
        this.i.r0.b(); 
    }
  }
  
  public static interface v {
    void a(RecyclerView.b0 param1b0);
  }
  
  private class w extends i {
    w(RecyclerView this$0) {}
    
    public void a() {
      this.a.p(null);
      RecyclerView recyclerView = this.a;
      recyclerView.s0.g = true;
      recyclerView.Q0(true);
      if (!this.a.n.p())
        this.a.requestLayout(); 
    }
    
    public void c(int param1Int1, int param1Int2, Object param1Object) {
      this.a.p(null);
      if (this.a.n.r(param1Int1, param1Int2, param1Object))
        f(); 
    }
    
    public void d(int param1Int1, int param1Int2) {
      this.a.p(null);
      if (this.a.n.s(param1Int1, param1Int2))
        f(); 
    }
    
    public void e(int param1Int1, int param1Int2) {
      this.a.p(null);
      if (this.a.n.t(param1Int1, param1Int2))
        f(); 
    }
    
    void f() {
      if (RecyclerView.e) {
        RecyclerView recyclerView1 = this.a;
        if (recyclerView1.D && recyclerView1.C) {
          b.h.k.w.j0((View)recyclerView1, recyclerView1.r);
          return;
        } 
      } 
      RecyclerView recyclerView = this.a;
      recyclerView.L = true;
      recyclerView.requestLayout();
    }
  }
  
  public static abstract class x {
    private int a = -1;
    
    private RecyclerView b;
    
    private RecyclerView.o c;
    
    private boolean d;
    
    private boolean e;
    
    private View f;
    
    private final a g = new a(0, 0);
    
    private boolean h;
    
    public PointF a(int param1Int) {
      RecyclerView.o o1 = e();
      if (o1 instanceof b)
        return ((b)o1).a(param1Int); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
      stringBuilder.append(b.class.getCanonicalName());
      Log.w("RecyclerView", stringBuilder.toString());
      return null;
    }
    
    public View b(int param1Int) {
      return this.b.w.C(param1Int);
    }
    
    public int c() {
      return this.b.w.J();
    }
    
    public int d(View param1View) {
      return this.b.e0(param1View);
    }
    
    public RecyclerView.o e() {
      return this.c;
    }
    
    public int f() {
      return this.a;
    }
    
    public boolean g() {
      return this.d;
    }
    
    public boolean h() {
      return this.e;
    }
    
    protected void i(PointF param1PointF) {
      float f1 = param1PointF.x;
      float f2 = param1PointF.y;
      f2 = (float)Math.sqrt((f1 * f1 + f2 * f2));
      param1PointF.x /= f2;
      param1PointF.y /= f2;
    }
    
    void j(int param1Int1, int param1Int2) {
      RecyclerView recyclerView = this.b;
      if (this.a == -1 || recyclerView == null)
        r(); 
      if (this.d && this.f == null && this.c != null) {
        PointF pointF = a(this.a);
        if (pointF != null) {
          float f = pointF.x;
          if (f != 0.0F || pointF.y != 0.0F)
            recyclerView.h1((int)Math.signum(f), (int)Math.signum(pointF.y), null); 
        } 
      } 
      this.d = false;
      View view = this.f;
      if (view != null)
        if (d(view) == this.a) {
          o(this.f, recyclerView.s0, this.g);
          this.g.c(recyclerView);
          r();
        } else {
          Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
          this.f = null;
        }  
      if (this.e) {
        l(param1Int1, param1Int2, recyclerView.s0, this.g);
        boolean bool = this.g.a();
        this.g.c(recyclerView);
        if (bool && this.e) {
          this.d = true;
          recyclerView.p0.d();
        } 
      } 
    }
    
    protected void k(View param1View) {
      if (d(param1View) == f())
        this.f = param1View; 
    }
    
    protected abstract void l(int param1Int1, int param1Int2, RecyclerView.y param1y, a param1a);
    
    protected abstract void m();
    
    protected abstract void n();
    
    protected abstract void o(View param1View, RecyclerView.y param1y, a param1a);
    
    public void p(int param1Int) {
      this.a = param1Int;
    }
    
    void q(RecyclerView param1RecyclerView, RecyclerView.o param1o) {
      param1RecyclerView.p0.f();
      if (this.h) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("An instance of ");
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(" was started more than once. Each instance of");
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(" is intended to only be used once. You should create a new instance for each use.");
        Log.w("RecyclerView", stringBuilder.toString());
      } 
      this.b = param1RecyclerView;
      this.c = param1o;
      int i = this.a;
      if (i != -1) {
        param1RecyclerView.s0.a = i;
        this.e = true;
        this.d = true;
        this.f = b(f());
        m();
        this.b.p0.d();
        this.h = true;
        return;
      } 
      throw new IllegalArgumentException("Invalid target position");
    }
    
    protected final void r() {
      if (!this.e)
        return; 
      this.e = false;
      n();
      this.b.s0.a = -1;
      this.f = null;
      this.a = -1;
      this.d = false;
      this.c.f1(this);
      this.c = null;
      this.b = null;
    }
    
    public static class a {
      private int a;
      
      private int b;
      
      private int c;
      
      private int d = -1;
      
      private Interpolator e;
      
      private boolean f = false;
      
      private int g = 0;
      
      public a(int param2Int1, int param2Int2) {
        this(param2Int1, param2Int2, -2147483648, null);
      }
      
      public a(int param2Int1, int param2Int2, int param2Int3, Interpolator param2Interpolator) {
        this.a = param2Int1;
        this.b = param2Int2;
        this.c = param2Int3;
        this.e = param2Interpolator;
      }
      
      private void e() {
        if (this.e == null || this.c >= 1) {
          if (this.c >= 1)
            return; 
          throw new IllegalStateException("Scroll duration must be a positive number");
        } 
        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
      }
      
      boolean a() {
        boolean bool;
        if (this.d >= 0) {
          bool = true;
        } else {
          bool = false;
        } 
        return bool;
      }
      
      public void b(int param2Int) {
        this.d = param2Int;
      }
      
      void c(RecyclerView param2RecyclerView) {
        int i = this.d;
        if (i >= 0) {
          this.d = -1;
          param2RecyclerView.w0(i);
          this.f = false;
          return;
        } 
        if (this.f) {
          e();
          param2RecyclerView.p0.e(this.a, this.b, this.c, this.e);
          i = this.g + 1;
          this.g = i;
          if (i > 10)
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary"); 
          this.f = false;
        } else {
          this.g = 0;
        } 
      }
      
      public void d(int param2Int1, int param2Int2, int param2Int3, Interpolator param2Interpolator) {
        this.a = param2Int1;
        this.b = param2Int2;
        this.c = param2Int3;
        this.e = param2Interpolator;
        this.f = true;
      }
    }
    
    public static interface b {
      PointF a(int param2Int);
    }
  }
  
  public static class a {
    private int a;
    
    private int b;
    
    private int c;
    
    private int d = -1;
    
    private Interpolator e;
    
    private boolean f = false;
    
    private int g = 0;
    
    public a(int param1Int1, int param1Int2) {
      this(param1Int1, param1Int2, -2147483648, null);
    }
    
    public a(int param1Int1, int param1Int2, int param1Int3, Interpolator param1Interpolator) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = param1Int3;
      this.e = param1Interpolator;
    }
    
    private void e() {
      if (this.e == null || this.c >= 1) {
        if (this.c >= 1)
          return; 
        throw new IllegalStateException("Scroll duration must be a positive number");
      } 
      throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
    }
    
    boolean a() {
      boolean bool;
      if (this.d >= 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public void b(int param1Int) {
      this.d = param1Int;
    }
    
    void c(RecyclerView param1RecyclerView) {
      int i = this.d;
      if (i >= 0) {
        this.d = -1;
        param1RecyclerView.w0(i);
        this.f = false;
        return;
      } 
      if (this.f) {
        e();
        param1RecyclerView.p0.e(this.a, this.b, this.c, this.e);
        i = this.g + 1;
        this.g = i;
        if (i > 10)
          Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary"); 
        this.f = false;
      } else {
        this.g = 0;
      } 
    }
    
    public void d(int param1Int1, int param1Int2, int param1Int3, Interpolator param1Interpolator) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = param1Int3;
      this.e = param1Interpolator;
      this.f = true;
    }
  }
  
  public static interface b {
    PointF a(int param1Int);
  }
  
  public static class y {
    int a = -1;
    
    private SparseArray<Object> b;
    
    int c = 0;
    
    int d = 0;
    
    int e = 1;
    
    int f = 0;
    
    boolean g = false;
    
    boolean h = false;
    
    boolean i = false;
    
    boolean j = false;
    
    boolean k = false;
    
    boolean l = false;
    
    int m;
    
    long n;
    
    int o;
    
    int p;
    
    int q;
    
    void a(int param1Int) {
      if ((this.e & param1Int) != 0)
        return; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Layout state should be one of ");
      stringBuilder.append(Integer.toBinaryString(param1Int));
      stringBuilder.append(" but it is ");
      stringBuilder.append(Integer.toBinaryString(this.e));
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    public int b() {
      int i;
      if (this.h) {
        i = this.c - this.d;
      } else {
        i = this.f;
      } 
      return i;
    }
    
    public int c() {
      return this.a;
    }
    
    public boolean d() {
      boolean bool;
      if (this.a != -1) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public boolean e() {
      return this.h;
    }
    
    void f(RecyclerView.Adapter param1Adapter) {
      this.e = 1;
      this.f = param1Adapter.d();
      this.h = false;
      this.i = false;
      this.j = false;
    }
    
    public boolean g() {
      return this.l;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("State{mTargetPosition=");
      stringBuilder.append(this.a);
      stringBuilder.append(", mData=");
      stringBuilder.append(this.b);
      stringBuilder.append(", mItemCount=");
      stringBuilder.append(this.f);
      stringBuilder.append(", mIsMeasuring=");
      stringBuilder.append(this.j);
      stringBuilder.append(", mPreviousLayoutItemCount=");
      stringBuilder.append(this.c);
      stringBuilder.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
      stringBuilder.append(this.d);
      stringBuilder.append(", mStructureChanged=");
      stringBuilder.append(this.g);
      stringBuilder.append(", mInPreLayout=");
      stringBuilder.append(this.h);
      stringBuilder.append(", mRunSimpleAnimations=");
      stringBuilder.append(this.k);
      stringBuilder.append(", mRunPredictiveAnimations=");
      stringBuilder.append(this.l);
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
  }
  
  public static abstract class z {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/recyclerview/widget/RecyclerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */