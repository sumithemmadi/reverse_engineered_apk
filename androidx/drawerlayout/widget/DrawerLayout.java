package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.customview.view.AbsSavedState;
import b.h.k.w;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup {
  private static final int[] b = new int[] { 16843828 };
  
  static final int[] c = new int[] { 16842931 };
  
  static final boolean d;
  
  private static final boolean e;
  
  private float A;
  
  private float B;
  
  private Drawable C;
  
  private Drawable D;
  
  private Drawable E;
  
  private CharSequence F;
  
  private CharSequence G;
  
  private Object H;
  
  private boolean I;
  
  private Drawable J = null;
  
  private Drawable K = null;
  
  private Drawable L = null;
  
  private Drawable M = null;
  
  private final ArrayList<View> N;
  
  private Rect O;
  
  private Matrix P;
  
  private final c f = new c();
  
  private float g;
  
  private int h;
  
  private int i = -1728053248;
  
  private float j;
  
  private Paint k = new Paint();
  
  private final b.j.a.c l;
  
  private final b.j.a.c m;
  
  private final e n;
  
  private final e o;
  
  private int p;
  
  private boolean q;
  
  private boolean r = true;
  
  private int s = 3;
  
  private int t = 3;
  
  private int u = 3;
  
  private int v = 3;
  
  private boolean w;
  
  private boolean x;
  
  private d y;
  
  private List<d> z;
  
  static {
    int i = Build.VERSION.SDK_INT;
    if (i >= 19) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    d = bool2;
    if (i >= 21) {
      bool2 = bool1;
    } else {
      bool2 = false;
    } 
    e = bool2;
  }
  
  public DrawerLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    setDescendantFocusability(262144);
    float f1 = (getResources().getDisplayMetrics()).density;
    this.h = (int)(64.0F * f1 + 0.5F);
    float f2 = 400.0F * f1;
    e e2 = new e(this, 3);
    this.n = e2;
    e e1 = new e(this, 5);
    this.o = e1;
    b.j.a.c c2 = b.j.a.c.o(this, 1.0F, e2);
    this.l = c2;
    c2.L(1);
    c2.M(f2);
    e2.q(c2);
    b.j.a.c c1 = b.j.a.c.o(this, 1.0F, e1);
    this.m = c1;
    c1.L(2);
    c1.M(f2);
    e1.q(c1);
    setFocusableInTouchMode(true);
    w.B0((View)this, 1);
    w.r0((View)this, new b(this));
    setMotionEventSplittingEnabled(false);
    if (w.z((View)this))
      if (Build.VERSION.SDK_INT >= 21) {
        setOnApplyWindowInsetsListener(new a(this));
        setSystemUiVisibility(1280);
        TypedArray typedArray = paramContext.obtainStyledAttributes(b);
        try {
          this.C = typedArray.getDrawable(0);
        } finally {
          typedArray.recycle();
        } 
      } else {
        this.C = null;
      }  
    this.g = f1 * 10.0F;
    this.N = new ArrayList<View>();
  }
  
  static boolean A(View paramView) {
    boolean bool;
    if (w.A(paramView) != 4 && w.A(paramView) != 2) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private boolean G(float paramFloat1, float paramFloat2, View paramView) {
    if (this.O == null)
      this.O = new Rect(); 
    paramView.getHitRect(this.O);
    return this.O.contains((int)paramFloat1, (int)paramFloat2);
  }
  
  private boolean H(Drawable paramDrawable, int paramInt) {
    if (paramDrawable == null || !androidx.core.graphics.drawable.a.h(paramDrawable))
      return false; 
    androidx.core.graphics.drawable.a.m(paramDrawable, paramInt);
    return true;
  }
  
  private Drawable O() {
    int i = w.C((View)this);
    if (i == 0) {
      Drawable drawable = this.J;
      if (drawable != null) {
        H(drawable, i);
        return this.J;
      } 
    } else {
      Drawable drawable = this.K;
      if (drawable != null) {
        H(drawable, i);
        return this.K;
      } 
    } 
    return this.L;
  }
  
  private Drawable P() {
    int i = w.C((View)this);
    if (i == 0) {
      Drawable drawable = this.K;
      if (drawable != null) {
        H(drawable, i);
        return this.K;
      } 
    } else {
      Drawable drawable = this.J;
      if (drawable != null) {
        H(drawable, i);
        return this.J;
      } 
    } 
    return this.M;
  }
  
  private void Q() {
    if (e)
      return; 
    this.D = O();
    this.E = P();
  }
  
  private void S(View paramView, boolean paramBoolean) {
    int i = getChildCount();
    for (byte b = 0; b < i; b++) {
      View view = getChildAt(b);
      if ((!paramBoolean && !E(view)) || (paramBoolean && view == paramView)) {
        w.B0(view, 1);
      } else {
        w.B0(view, 4);
      } 
    } 
  }
  
  private boolean m(MotionEvent paramMotionEvent, View paramView) {
    boolean bool;
    if (!paramView.getMatrix().isIdentity()) {
      paramMotionEvent = v(paramMotionEvent, paramView);
      bool = paramView.dispatchGenericMotionEvent(paramMotionEvent);
      paramMotionEvent.recycle();
    } else {
      float f1 = (getScrollX() - paramView.getLeft());
      float f2 = (getScrollY() - paramView.getTop());
      paramMotionEvent.offsetLocation(f1, f2);
      bool = paramView.dispatchGenericMotionEvent(paramMotionEvent);
      paramMotionEvent.offsetLocation(-f1, -f2);
    } 
    return bool;
  }
  
  private MotionEvent v(MotionEvent paramMotionEvent, View paramView) {
    float f1 = (getScrollX() - paramView.getLeft());
    float f2 = (getScrollY() - paramView.getTop());
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    paramMotionEvent.offsetLocation(f1, f2);
    Matrix matrix = paramView.getMatrix();
    if (!matrix.isIdentity()) {
      if (this.P == null)
        this.P = new Matrix(); 
      matrix.invert(this.P);
      paramMotionEvent.transform(this.P);
    } 
    return paramMotionEvent;
  }
  
  static String w(int paramInt) {
    return ((paramInt & 0x3) == 3) ? "LEFT" : (((paramInt & 0x5) == 5) ? "RIGHT" : Integer.toHexString(paramInt));
  }
  
  private static boolean x(View paramView) {
    Drawable drawable = paramView.getBackground();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (drawable != null) {
      bool2 = bool1;
      if (drawable.getOpacity() == -1)
        bool2 = true; 
    } 
    return bool2;
  }
  
  private boolean y() {
    int i = getChildCount();
    for (byte b = 0; b < i; b++) {
      if (((LayoutParams)getChildAt(b).getLayoutParams()).c)
        return true; 
    } 
    return false;
  }
  
  private boolean z() {
    boolean bool;
    if (p() != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  boolean B(View paramView) {
    boolean bool;
    if (((LayoutParams)paramView.getLayoutParams()).a == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean C(int paramInt) {
    View view = n(paramInt);
    return (view != null) ? D(view) : false;
  }
  
  public boolean D(View paramView) {
    if (E(paramView)) {
      int i = ((LayoutParams)paramView.getLayoutParams()).d;
      boolean bool = true;
      if ((i & 0x1) != 1)
        bool = false; 
      return bool;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("View ");
    stringBuilder.append(paramView);
    stringBuilder.append(" is not a drawer");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  boolean E(View paramView) {
    int i = b.h.k.e.b(((LayoutParams)paramView.getLayoutParams()).a, w.C(paramView));
    return ((i & 0x3) != 0) ? true : (((i & 0x5) != 0));
  }
  
  public boolean F(View paramView) {
    if (E(paramView)) {
      boolean bool;
      if (((LayoutParams)paramView.getLayoutParams()).b > 0.0F) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("View ");
    stringBuilder.append(paramView);
    stringBuilder.append(" is not a drawer");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  void I(View paramView, float paramFloat) {
    float f1 = u(paramView);
    float f2 = paramView.getWidth();
    int i = (int)(f1 * f2);
    i = (int)(f2 * paramFloat) - i;
    if (!c(paramView, 3))
      i = -i; 
    paramView.offsetLeftAndRight(i);
    R(paramView, paramFloat);
  }
  
  public void J(int paramInt) {
    K(paramInt, true);
  }
  
  public void K(int paramInt, boolean paramBoolean) {
    View view = n(paramInt);
    if (view != null) {
      M(view, paramBoolean);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("No drawer view found with gravity ");
    stringBuilder.append(w(paramInt));
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void L(View paramView) {
    M(paramView, true);
  }
  
  public void M(View paramView, boolean paramBoolean) {
    if (E(paramView)) {
      LayoutParams layoutParams = (LayoutParams)paramView.getLayoutParams();
      if (this.r) {
        layoutParams.b = 1.0F;
        layoutParams.d = 1;
        S(paramView, true);
      } else if (paramBoolean) {
        layoutParams.d |= 0x2;
        if (c(paramView, 3)) {
          this.l.P(paramView, 0, paramView.getTop());
        } else {
          this.m.P(paramView, getWidth() - paramView.getWidth(), paramView.getTop());
        } 
      } else {
        I(paramView, 1.0F);
        T(layoutParams.a, 0, paramView);
        paramView.setVisibility(0);
      } 
      invalidate();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("View ");
    stringBuilder.append(paramView);
    stringBuilder.append(" is not a sliding drawer");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void N(d paramd) {
    if (paramd == null)
      return; 
    List<d> list = this.z;
    if (list == null)
      return; 
    list.remove(paramd);
  }
  
  void R(View paramView, float paramFloat) {
    LayoutParams layoutParams = (LayoutParams)paramView.getLayoutParams();
    if (paramFloat == layoutParams.b)
      return; 
    layoutParams.b = paramFloat;
    l(paramView, paramFloat);
  }
  
  void T(int paramInt1, int paramInt2, View paramView) {
    int i = this.l.A();
    int j = this.m.A();
    byte b = 2;
    if (i == 1 || j == 1) {
      paramInt1 = 1;
    } else {
      paramInt1 = b;
      if (i != 2)
        if (j == 2) {
          paramInt1 = b;
        } else {
          paramInt1 = 0;
        }  
    } 
    if (paramView != null && paramInt2 == 0) {
      float f = ((LayoutParams)paramView.getLayoutParams()).b;
      if (f == 0.0F) {
        j(paramView);
      } else if (f == 1.0F) {
        k(paramView);
      } 
    } 
    if (paramInt1 != this.p) {
      this.p = paramInt1;
      List<d> list = this.z;
      if (list != null)
        for (paramInt2 = list.size() - 1; paramInt2 >= 0; paramInt2--)
          ((d)this.z.get(paramInt2)).c(paramInt1);  
    } 
  }
  
  public void a(d paramd) {
    if (paramd == null)
      return; 
    if (this.z == null)
      this.z = new ArrayList<d>(); 
    this.z.add(paramd);
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2) {
    if (getDescendantFocusability() == 393216)
      return; 
    int i = getChildCount();
    boolean bool = false;
    byte b = 0;
    int j = 0;
    while (b < i) {
      View view = getChildAt(b);
      if (E(view)) {
        if (D(view)) {
          view.addFocusables(paramArrayList, paramInt1, paramInt2);
          j = 1;
        } 
      } else {
        this.N.add(view);
      } 
      b++;
    } 
    if (!j) {
      j = this.N.size();
      for (b = bool; b < j; b++) {
        View view = this.N.get(b);
        if (view.getVisibility() == 0)
          view.addFocusables(paramArrayList, paramInt1, paramInt2); 
      } 
    } 
    this.N.clear();
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    super.addView(paramView, paramInt, paramLayoutParams);
    if (o() != null || E(paramView)) {
      w.B0(paramView, 4);
    } else {
      w.B0(paramView, 1);
    } 
    if (!d)
      w.r0(paramView, this.f); 
  }
  
  void b() {
    if (!this.x) {
      long l = SystemClock.uptimeMillis();
      MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
      int i = getChildCount();
      for (byte b = 0; b < i; b++)
        getChildAt(b).dispatchTouchEvent(motionEvent); 
      motionEvent.recycle();
      this.x = true;
    } 
  }
  
  boolean c(View paramView, int paramInt) {
    boolean bool;
    if ((t(paramView) & paramInt) == paramInt) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
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
    int i = getChildCount();
    float f = 0.0F;
    for (byte b = 0; b < i; b++)
      f = Math.max(f, ((LayoutParams)getChildAt(b).getLayoutParams()).b); 
    this.j = f;
    boolean bool1 = this.l.n(true);
    boolean bool2 = this.m.n(true);
    if (bool1 || bool2)
      w.h0((View)this); 
  }
  
  public void d(int paramInt) {
    e(paramInt, true);
  }
  
  public boolean dispatchGenericMotionEvent(MotionEvent paramMotionEvent) {
    if ((paramMotionEvent.getSource() & 0x2) == 0 || paramMotionEvent.getAction() == 10 || this.j <= 0.0F)
      return super.dispatchGenericMotionEvent(paramMotionEvent); 
    int i = getChildCount();
    if (i != 0) {
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      while (--i >= 0) {
        View view = getChildAt(i);
        if (G(f1, f2, view) && !B(view) && m(paramMotionEvent, view))
          return true; 
        i--;
      } 
    } 
    return false;
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong) {
    int i = getHeight();
    boolean bool1 = B(paramView);
    int j = getWidth();
    int k = paramCanvas.save();
    int m = 0;
    int n = j;
    if (bool1) {
      int i1 = getChildCount();
      m = 0;
      for (n = 0; m < i1; n = i3) {
        View view = getChildAt(m);
        int i2 = j;
        int i3 = n;
        if (view != paramView) {
          i2 = j;
          i3 = n;
          if (view.getVisibility() == 0) {
            i2 = j;
            i3 = n;
            if (x(view)) {
              i2 = j;
              i3 = n;
              if (E(view))
                if (view.getHeight() < i) {
                  i2 = j;
                  i3 = n;
                } else if (c(view, 3)) {
                  int i4 = view.getRight();
                  i2 = j;
                  i3 = n;
                  if (i4 > n) {
                    i3 = i4;
                    i2 = j;
                  } 
                } else {
                  int i4 = view.getLeft();
                  i2 = j;
                  i3 = n;
                  if (i4 < j) {
                    i2 = i4;
                    i3 = n;
                  } 
                }  
            } 
          } 
        } 
        m++;
        j = i2;
      } 
      paramCanvas.clipRect(n, 0, j, getHeight());
      m = n;
      n = j;
    } 
    boolean bool2 = super.drawChild(paramCanvas, paramView, paramLong);
    paramCanvas.restoreToCount(k);
    float f = this.j;
    if (f > 0.0F && bool1) {
      int i1 = this.i;
      j = (int)(((0xFF000000 & i1) >>> 24) * f);
      this.k.setColor(i1 & 0xFFFFFF | j << 24);
      paramCanvas.drawRect(m, 0.0F, n, getHeight(), this.k);
    } else if (this.D != null && c(paramView, 3)) {
      m = this.D.getIntrinsicWidth();
      j = paramView.getRight();
      n = this.l.x();
      f = Math.max(0.0F, Math.min(j / n, 1.0F));
      this.D.setBounds(j, paramView.getTop(), m + j, paramView.getBottom());
      this.D.setAlpha((int)(f * 255.0F));
      this.D.draw(paramCanvas);
    } else if (this.E != null && c(paramView, 5)) {
      n = this.E.getIntrinsicWidth();
      j = paramView.getLeft();
      int i1 = getWidth();
      m = this.m.x();
      f = Math.max(0.0F, Math.min((i1 - j) / m, 1.0F));
      this.E.setBounds(j - n, paramView.getTop(), j, paramView.getBottom());
      this.E.setAlpha((int)(f * 255.0F));
      this.E.draw(paramCanvas);
    } 
    return bool2;
  }
  
  public void e(int paramInt, boolean paramBoolean) {
    View view = n(paramInt);
    if (view != null) {
      g(view, paramBoolean);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("No drawer view found with gravity ");
    stringBuilder.append(w(paramInt));
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void f(View paramView) {
    g(paramView, true);
  }
  
  public void g(View paramView, boolean paramBoolean) {
    if (E(paramView)) {
      LayoutParams layoutParams = (LayoutParams)paramView.getLayoutParams();
      if (this.r) {
        layoutParams.b = 0.0F;
        layoutParams.d = 0;
      } else if (paramBoolean) {
        layoutParams.d |= 0x4;
        if (c(paramView, 3)) {
          this.l.P(paramView, -paramView.getWidth(), paramView.getTop());
        } else {
          this.m.P(paramView, getWidth(), paramView.getTop());
        } 
      } else {
        I(paramView, 0.0F);
        T(layoutParams.a, 0, paramView);
        paramView.setVisibility(4);
      } 
      invalidate();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("View ");
    stringBuilder.append(paramView);
    stringBuilder.append(" is not a sliding drawer");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
    return (ViewGroup.LayoutParams)new LayoutParams(-1, -1);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    return (ViewGroup.LayoutParams)new LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    LayoutParams layoutParams;
    if (paramLayoutParams instanceof LayoutParams) {
      layoutParams = new LayoutParams((LayoutParams)paramLayoutParams);
    } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
      layoutParams = new LayoutParams(layoutParams);
    } else {
      layoutParams = new LayoutParams((ViewGroup.LayoutParams)layoutParams);
    } 
    return (ViewGroup.LayoutParams)layoutParams;
  }
  
  public float getDrawerElevation() {
    return e ? this.g : 0.0F;
  }
  
  public Drawable getStatusBarBackgroundDrawable() {
    return this.C;
  }
  
  public void h() {
    i(false);
  }
  
  void i(boolean paramBoolean) {
    int j;
    int i = getChildCount();
    byte b = 0;
    int k = 0;
    while (b < i) {
      int m;
      View view = getChildAt(b);
      LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
      int n = k;
      if (E(view))
        if (paramBoolean && !layoutParams.c) {
          n = k;
        } else {
          int i1;
          n = view.getWidth();
          if (c(view, 3)) {
            i1 = this.l.P(view, -n, view.getTop());
          } else {
            i1 = this.m.P(view, getWidth(), view.getTop());
          } 
          m = k | i1;
          layoutParams.c = false;
        }  
      b++;
      j = m;
    } 
    this.n.p();
    this.o.p();
    if (j != 0)
      invalidate(); 
  }
  
  void j(View paramView) {
    LayoutParams layoutParams = (LayoutParams)paramView.getLayoutParams();
    if ((layoutParams.d & 0x1) == 1) {
      layoutParams.d = 0;
      List<d> list = this.z;
      if (list != null)
        for (int i = list.size() - 1; i >= 0; i--)
          ((d)this.z.get(i)).b(paramView);  
      S(paramView, false);
      if (hasWindowFocus()) {
        paramView = getRootView();
        if (paramView != null)
          paramView.sendAccessibilityEvent(32); 
      } 
    } 
  }
  
  void k(View paramView) {
    LayoutParams layoutParams = (LayoutParams)paramView.getLayoutParams();
    if ((layoutParams.d & 0x1) == 0) {
      layoutParams.d = 1;
      List<d> list = this.z;
      if (list != null)
        for (int i = list.size() - 1; i >= 0; i--)
          ((d)this.z.get(i)).a(paramView);  
      S(paramView, true);
      if (hasWindowFocus())
        sendAccessibilityEvent(32); 
    } 
  }
  
  void l(View paramView, float paramFloat) {
    List<d> list = this.z;
    if (list != null)
      for (int i = list.size() - 1; i >= 0; i--)
        ((d)this.z.get(i)).d(paramView, paramFloat);  
  }
  
  View n(int paramInt) {
    int i = b.h.k.e.b(paramInt, w.C((View)this));
    int j = getChildCount();
    for (paramInt = 0; paramInt < j; paramInt++) {
      View view = getChildAt(paramInt);
      if ((t(view) & 0x7) == (i & 0x7))
        return view; 
    } 
    return null;
  }
  
  View o() {
    int i = getChildCount();
    for (byte b = 0; b < i; b++) {
      View view = getChildAt(b);
      if ((((LayoutParams)view.getLayoutParams()).d & 0x1) == 1)
        return view; 
    } 
    return null;
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.r = true;
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    this.r = true;
  }
  
  public void onDraw(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial onDraw : (Landroid/graphics/Canvas;)V
    //   5: aload_0
    //   6: getfield I : Z
    //   9: ifeq -> 75
    //   12: aload_0
    //   13: getfield C : Landroid/graphics/drawable/Drawable;
    //   16: ifnull -> 75
    //   19: getstatic android/os/Build$VERSION.SDK_INT : I
    //   22: bipush #21
    //   24: if_icmplt -> 47
    //   27: aload_0
    //   28: getfield H : Ljava/lang/Object;
    //   31: astore_2
    //   32: aload_2
    //   33: ifnull -> 47
    //   36: aload_2
    //   37: checkcast android/view/WindowInsets
    //   40: invokevirtual getSystemWindowInsetTop : ()I
    //   43: istore_3
    //   44: goto -> 49
    //   47: iconst_0
    //   48: istore_3
    //   49: iload_3
    //   50: ifle -> 75
    //   53: aload_0
    //   54: getfield C : Landroid/graphics/drawable/Drawable;
    //   57: iconst_0
    //   58: iconst_0
    //   59: aload_0
    //   60: invokevirtual getWidth : ()I
    //   63: iload_3
    //   64: invokevirtual setBounds : (IIII)V
    //   67: aload_0
    //   68: getfield C : Landroid/graphics/drawable/Drawable;
    //   71: aload_1
    //   72: invokevirtual draw : (Landroid/graphics/Canvas;)V
    //   75: return
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getActionMasked : ()I
    //   4: istore_2
    //   5: aload_0
    //   6: getfield l : Lb/j/a/c;
    //   9: aload_1
    //   10: invokevirtual O : (Landroid/view/MotionEvent;)Z
    //   13: istore_3
    //   14: aload_0
    //   15: getfield m : Lb/j/a/c;
    //   18: aload_1
    //   19: invokevirtual O : (Landroid/view/MotionEvent;)Z
    //   22: istore #4
    //   24: iconst_1
    //   25: istore #5
    //   27: iload_2
    //   28: ifeq -> 97
    //   31: iload_2
    //   32: iconst_1
    //   33: if_icmpeq -> 77
    //   36: iload_2
    //   37: iconst_2
    //   38: if_icmpeq -> 49
    //   41: iload_2
    //   42: iconst_3
    //   43: if_icmpeq -> 77
    //   46: goto -> 92
    //   49: aload_0
    //   50: getfield l : Lb/j/a/c;
    //   53: iconst_3
    //   54: invokevirtual e : (I)Z
    //   57: ifeq -> 92
    //   60: aload_0
    //   61: getfield n : Landroidx/drawerlayout/widget/DrawerLayout$e;
    //   64: invokevirtual p : ()V
    //   67: aload_0
    //   68: getfield o : Landroidx/drawerlayout/widget/DrawerLayout$e;
    //   71: invokevirtual p : ()V
    //   74: goto -> 92
    //   77: aload_0
    //   78: iconst_1
    //   79: invokevirtual i : (Z)V
    //   82: aload_0
    //   83: iconst_0
    //   84: putfield w : Z
    //   87: aload_0
    //   88: iconst_0
    //   89: putfield x : Z
    //   92: iconst_0
    //   93: istore_2
    //   94: goto -> 173
    //   97: aload_1
    //   98: invokevirtual getX : ()F
    //   101: fstore #6
    //   103: aload_1
    //   104: invokevirtual getY : ()F
    //   107: fstore #7
    //   109: aload_0
    //   110: fload #6
    //   112: putfield A : F
    //   115: aload_0
    //   116: fload #7
    //   118: putfield B : F
    //   121: aload_0
    //   122: getfield j : F
    //   125: fconst_0
    //   126: fcmpl
    //   127: ifle -> 161
    //   130: aload_0
    //   131: getfield l : Lb/j/a/c;
    //   134: fload #6
    //   136: f2i
    //   137: fload #7
    //   139: f2i
    //   140: invokevirtual u : (II)Landroid/view/View;
    //   143: astore_1
    //   144: aload_1
    //   145: ifnull -> 161
    //   148: aload_0
    //   149: aload_1
    //   150: invokevirtual B : (Landroid/view/View;)Z
    //   153: ifeq -> 161
    //   156: iconst_1
    //   157: istore_2
    //   158: goto -> 163
    //   161: iconst_0
    //   162: istore_2
    //   163: aload_0
    //   164: iconst_0
    //   165: putfield w : Z
    //   168: aload_0
    //   169: iconst_0
    //   170: putfield x : Z
    //   173: iload #5
    //   175: istore #8
    //   177: iload_3
    //   178: iload #4
    //   180: ior
    //   181: ifne -> 220
    //   184: iload #5
    //   186: istore #8
    //   188: iload_2
    //   189: ifne -> 220
    //   192: iload #5
    //   194: istore #8
    //   196: aload_0
    //   197: invokespecial y : ()Z
    //   200: ifne -> 220
    //   203: aload_0
    //   204: getfield x : Z
    //   207: ifeq -> 217
    //   210: iload #5
    //   212: istore #8
    //   214: goto -> 220
    //   217: iconst_0
    //   218: istore #8
    //   220: iload #8
    //   222: ireturn
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4 && z()) {
      paramKeyEvent.startTracking();
      return true;
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent) {
    View view;
    if (paramInt == 4) {
      boolean bool;
      view = p();
      if (view != null && r(view) == 0)
        h(); 
      if (view != null) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
    return super.onKeyUp(paramInt, (KeyEvent)view);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.q = true;
    int i = paramInt3 - paramInt1;
    int j = getChildCount();
    for (paramInt3 = 0; paramInt3 < j; paramInt3++) {
      View view = getChildAt(paramInt3);
      if (view.getVisibility() != 8) {
        LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
        if (B(view)) {
          paramInt1 = layoutParams.leftMargin;
          view.layout(paramInt1, layoutParams.topMargin, view.getMeasuredWidth() + paramInt1, layoutParams.topMargin + view.getMeasuredHeight());
        } else {
          float f;
          int n;
          boolean bool;
          int k = view.getMeasuredWidth();
          int m = view.getMeasuredHeight();
          if (c(view, 3)) {
            paramInt1 = -k;
            f = k;
            n = paramInt1 + (int)(layoutParams.b * f);
            f = (k + n) / f;
          } else {
            f = k;
            n = i - (int)(layoutParams.b * f);
            f = (i - n) / f;
          } 
          if (f != layoutParams.b) {
            bool = true;
          } else {
            bool = false;
          } 
          paramInt1 = layoutParams.a & 0x70;
          if (paramInt1 != 16) {
            if (paramInt1 != 80) {
              paramInt1 = layoutParams.topMargin;
              view.layout(n, paramInt1, k + n, m + paramInt1);
            } else {
              paramInt1 = paramInt4 - paramInt2;
              view.layout(n, paramInt1 - layoutParams.bottomMargin - view.getMeasuredHeight(), k + n, paramInt1 - layoutParams.bottomMargin);
            } 
          } else {
            int i1 = paramInt4 - paramInt2;
            int i2 = (i1 - m) / 2;
            paramInt1 = layoutParams.topMargin;
            if (i2 >= paramInt1) {
              int i3 = layoutParams.bottomMargin;
              paramInt1 = i2;
              if (i2 + m > i1 - i3)
                paramInt1 = i1 - i3 - m; 
            } 
            view.layout(n, paramInt1, k + n, m + paramInt1);
          } 
          if (bool)
            R(view, f); 
          if (layoutParams.b > 0.0F) {
            paramInt1 = 0;
          } else {
            paramInt1 = 4;
          } 
          if (view.getVisibility() != paramInt1)
            view.setVisibility(paramInt1); 
        } 
      } 
    } 
    this.q = false;
    this.r = false;
  }
  
  @SuppressLint({"WrongConstant"})
  protected void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: invokestatic getMode : (I)I
    //   4: istore_3
    //   5: iload_2
    //   6: invokestatic getMode : (I)I
    //   9: istore #4
    //   11: iload_1
    //   12: invokestatic getSize : (I)I
    //   15: istore #5
    //   17: iload_2
    //   18: invokestatic getSize : (I)I
    //   21: istore #6
    //   23: iload_3
    //   24: ldc_w 1073741824
    //   27: if_icmpne -> 46
    //   30: iload #5
    //   32: istore #7
    //   34: iload #6
    //   36: istore #8
    //   38: iload #4
    //   40: ldc_w 1073741824
    //   43: if_icmpeq -> 113
    //   46: aload_0
    //   47: invokevirtual isInEditMode : ()Z
    //   50: ifeq -> 811
    //   53: iload_3
    //   54: ldc_w -2147483648
    //   57: if_icmpne -> 63
    //   60: goto -> 72
    //   63: iload_3
    //   64: ifne -> 72
    //   67: sipush #300
    //   70: istore #5
    //   72: iload #4
    //   74: ldc_w -2147483648
    //   77: if_icmpne -> 91
    //   80: iload #5
    //   82: istore #7
    //   84: iload #6
    //   86: istore #8
    //   88: goto -> 113
    //   91: iload #5
    //   93: istore #7
    //   95: iload #6
    //   97: istore #8
    //   99: iload #4
    //   101: ifne -> 113
    //   104: sipush #300
    //   107: istore #8
    //   109: iload #5
    //   111: istore #7
    //   113: aload_0
    //   114: iload #7
    //   116: iload #8
    //   118: invokevirtual setMeasuredDimension : (II)V
    //   121: aload_0
    //   122: getfield H : Ljava/lang/Object;
    //   125: ifnull -> 141
    //   128: aload_0
    //   129: invokestatic z : (Landroid/view/View;)Z
    //   132: ifeq -> 141
    //   135: iconst_1
    //   136: istore #4
    //   138: goto -> 144
    //   141: iconst_0
    //   142: istore #4
    //   144: aload_0
    //   145: invokestatic C : (Landroid/view/View;)I
    //   148: istore #9
    //   150: aload_0
    //   151: invokevirtual getChildCount : ()I
    //   154: istore #10
    //   156: iconst_0
    //   157: istore_3
    //   158: iconst_0
    //   159: istore #6
    //   161: iconst_0
    //   162: istore #5
    //   164: iload_3
    //   165: iload #10
    //   167: if_icmpge -> 810
    //   170: aload_0
    //   171: iload_3
    //   172: invokevirtual getChildAt : (I)Landroid/view/View;
    //   175: astore #11
    //   177: aload #11
    //   179: invokevirtual getVisibility : ()I
    //   182: bipush #8
    //   184: if_icmpne -> 190
    //   187: goto -> 494
    //   190: aload #11
    //   192: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   195: checkcast androidx/drawerlayout/widget/DrawerLayout$LayoutParams
    //   198: astore #12
    //   200: iload #4
    //   202: ifeq -> 440
    //   205: aload #12
    //   207: getfield a : I
    //   210: iload #9
    //   212: invokestatic b : (II)I
    //   215: istore #13
    //   217: aload #11
    //   219: invokestatic z : (Landroid/view/View;)Z
    //   222: ifeq -> 318
    //   225: getstatic android/os/Build$VERSION.SDK_INT : I
    //   228: bipush #21
    //   230: if_icmplt -> 440
    //   233: aload_0
    //   234: getfield H : Ljava/lang/Object;
    //   237: checkcast android/view/WindowInsets
    //   240: astore #14
    //   242: iload #13
    //   244: iconst_3
    //   245: if_icmpne -> 274
    //   248: aload #14
    //   250: aload #14
    //   252: invokevirtual getSystemWindowInsetLeft : ()I
    //   255: aload #14
    //   257: invokevirtual getSystemWindowInsetTop : ()I
    //   260: iconst_0
    //   261: aload #14
    //   263: invokevirtual getSystemWindowInsetBottom : ()I
    //   266: invokevirtual replaceSystemWindowInsets : (IIII)Landroid/view/WindowInsets;
    //   269: astore #15
    //   271: goto -> 307
    //   274: aload #14
    //   276: astore #15
    //   278: iload #13
    //   280: iconst_5
    //   281: if_icmpne -> 307
    //   284: aload #14
    //   286: iconst_0
    //   287: aload #14
    //   289: invokevirtual getSystemWindowInsetTop : ()I
    //   292: aload #14
    //   294: invokevirtual getSystemWindowInsetRight : ()I
    //   297: aload #14
    //   299: invokevirtual getSystemWindowInsetBottom : ()I
    //   302: invokevirtual replaceSystemWindowInsets : (IIII)Landroid/view/WindowInsets;
    //   305: astore #15
    //   307: aload #11
    //   309: aload #15
    //   311: invokevirtual dispatchApplyWindowInsets : (Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    //   314: pop
    //   315: goto -> 440
    //   318: getstatic android/os/Build$VERSION.SDK_INT : I
    //   321: bipush #21
    //   323: if_icmplt -> 440
    //   326: aload_0
    //   327: getfield H : Ljava/lang/Object;
    //   330: checkcast android/view/WindowInsets
    //   333: astore #14
    //   335: iload #13
    //   337: iconst_3
    //   338: if_icmpne -> 367
    //   341: aload #14
    //   343: aload #14
    //   345: invokevirtual getSystemWindowInsetLeft : ()I
    //   348: aload #14
    //   350: invokevirtual getSystemWindowInsetTop : ()I
    //   353: iconst_0
    //   354: aload #14
    //   356: invokevirtual getSystemWindowInsetBottom : ()I
    //   359: invokevirtual replaceSystemWindowInsets : (IIII)Landroid/view/WindowInsets;
    //   362: astore #15
    //   364: goto -> 400
    //   367: aload #14
    //   369: astore #15
    //   371: iload #13
    //   373: iconst_5
    //   374: if_icmpne -> 400
    //   377: aload #14
    //   379: iconst_0
    //   380: aload #14
    //   382: invokevirtual getSystemWindowInsetTop : ()I
    //   385: aload #14
    //   387: invokevirtual getSystemWindowInsetRight : ()I
    //   390: aload #14
    //   392: invokevirtual getSystemWindowInsetBottom : ()I
    //   395: invokevirtual replaceSystemWindowInsets : (IIII)Landroid/view/WindowInsets;
    //   398: astore #15
    //   400: aload #12
    //   402: aload #15
    //   404: invokevirtual getSystemWindowInsetLeft : ()I
    //   407: putfield leftMargin : I
    //   410: aload #12
    //   412: aload #15
    //   414: invokevirtual getSystemWindowInsetTop : ()I
    //   417: putfield topMargin : I
    //   420: aload #12
    //   422: aload #15
    //   424: invokevirtual getSystemWindowInsetRight : ()I
    //   427: putfield rightMargin : I
    //   430: aload #12
    //   432: aload #15
    //   434: invokevirtual getSystemWindowInsetBottom : ()I
    //   437: putfield bottomMargin : I
    //   440: aload_0
    //   441: aload #11
    //   443: invokevirtual B : (Landroid/view/View;)Z
    //   446: ifeq -> 497
    //   449: aload #11
    //   451: iload #7
    //   453: aload #12
    //   455: getfield leftMargin : I
    //   458: isub
    //   459: aload #12
    //   461: getfield rightMargin : I
    //   464: isub
    //   465: ldc_w 1073741824
    //   468: invokestatic makeMeasureSpec : (II)I
    //   471: iload #8
    //   473: aload #12
    //   475: getfield topMargin : I
    //   478: isub
    //   479: aload #12
    //   481: getfield bottomMargin : I
    //   484: isub
    //   485: ldc_w 1073741824
    //   488: invokestatic makeMeasureSpec : (II)I
    //   491: invokevirtual measure : (II)V
    //   494: goto -> 731
    //   497: aload_0
    //   498: aload #11
    //   500: invokevirtual E : (Landroid/view/View;)Z
    //   503: ifeq -> 737
    //   506: getstatic androidx/drawerlayout/widget/DrawerLayout.e : Z
    //   509: ifeq -> 540
    //   512: aload #11
    //   514: invokestatic w : (Landroid/view/View;)F
    //   517: fstore #16
    //   519: aload_0
    //   520: getfield g : F
    //   523: fstore #17
    //   525: fload #16
    //   527: fload #17
    //   529: fcmpl
    //   530: ifeq -> 540
    //   533: aload #11
    //   535: fload #17
    //   537: invokestatic y0 : (Landroid/view/View;F)V
    //   540: aload_0
    //   541: aload #11
    //   543: invokevirtual t : (Landroid/view/View;)I
    //   546: bipush #7
    //   548: iand
    //   549: istore #18
    //   551: iload #18
    //   553: iconst_3
    //   554: if_icmpne -> 563
    //   557: iconst_1
    //   558: istore #13
    //   560: goto -> 566
    //   563: iconst_0
    //   564: istore #13
    //   566: iload #13
    //   568: ifeq -> 576
    //   571: iload #6
    //   573: ifne -> 589
    //   576: iload #13
    //   578: ifne -> 667
    //   581: iload #5
    //   583: ifne -> 589
    //   586: goto -> 667
    //   589: new java/lang/StringBuilder
    //   592: dup
    //   593: invokespecial <init> : ()V
    //   596: astore #15
    //   598: aload #15
    //   600: ldc_w 'Child drawer has absolute gravity '
    //   603: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   606: pop
    //   607: aload #15
    //   609: iload #18
    //   611: invokestatic w : (I)Ljava/lang/String;
    //   614: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   617: pop
    //   618: aload #15
    //   620: ldc_w ' but this '
    //   623: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   626: pop
    //   627: aload #15
    //   629: ldc_w 'DrawerLayout'
    //   632: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   635: pop
    //   636: aload #15
    //   638: ldc_w ' already has a '
    //   641: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   644: pop
    //   645: aload #15
    //   647: ldc_w 'drawer view along that edge'
    //   650: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   653: pop
    //   654: new java/lang/IllegalStateException
    //   657: dup
    //   658: aload #15
    //   660: invokevirtual toString : ()Ljava/lang/String;
    //   663: invokespecial <init> : (Ljava/lang/String;)V
    //   666: athrow
    //   667: iload #13
    //   669: ifeq -> 678
    //   672: iconst_1
    //   673: istore #6
    //   675: goto -> 681
    //   678: iconst_1
    //   679: istore #5
    //   681: aload #11
    //   683: iload_1
    //   684: aload_0
    //   685: getfield h : I
    //   688: aload #12
    //   690: getfield leftMargin : I
    //   693: iadd
    //   694: aload #12
    //   696: getfield rightMargin : I
    //   699: iadd
    //   700: aload #12
    //   702: getfield width : I
    //   705: invokestatic getChildMeasureSpec : (III)I
    //   708: iload_2
    //   709: aload #12
    //   711: getfield topMargin : I
    //   714: aload #12
    //   716: getfield bottomMargin : I
    //   719: iadd
    //   720: aload #12
    //   722: getfield height : I
    //   725: invokestatic getChildMeasureSpec : (III)I
    //   728: invokevirtual measure : (II)V
    //   731: iinc #3, 1
    //   734: goto -> 164
    //   737: new java/lang/StringBuilder
    //   740: dup
    //   741: invokespecial <init> : ()V
    //   744: astore #15
    //   746: aload #15
    //   748: ldc_w 'Child '
    //   751: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   754: pop
    //   755: aload #15
    //   757: aload #11
    //   759: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   762: pop
    //   763: aload #15
    //   765: ldc_w ' at index '
    //   768: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   771: pop
    //   772: aload #15
    //   774: iload_3
    //   775: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   778: pop
    //   779: aload #15
    //   781: ldc_w ' does not have a valid layout_gravity - must be Gravity.LEFT, '
    //   784: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   787: pop
    //   788: aload #15
    //   790: ldc_w 'Gravity.RIGHT or Gravity.NO_GRAVITY'
    //   793: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   796: pop
    //   797: new java/lang/IllegalStateException
    //   800: dup
    //   801: aload #15
    //   803: invokevirtual toString : ()Ljava/lang/String;
    //   806: invokespecial <init> : (Ljava/lang/String;)V
    //   809: athrow
    //   810: return
    //   811: new java/lang/IllegalArgumentException
    //   814: dup
    //   815: ldc_w 'DrawerLayout must be measured with MeasureSpec.EXACTLY.'
    //   818: invokespecial <init> : (Ljava/lang/String;)V
    //   821: astore #15
    //   823: goto -> 829
    //   826: aload #15
    //   828: athrow
    //   829: goto -> 826
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof SavedState)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    SavedState savedState = (SavedState)paramParcelable;
    super.onRestoreInstanceState(savedState.a());
    int i = savedState.d;
    if (i != 0) {
      View view = n(i);
      if (view != null)
        L(view); 
    } 
    i = savedState.e;
    if (i != 3)
      setDrawerLockMode(i, 3); 
    i = savedState.f;
    if (i != 3)
      setDrawerLockMode(i, 5); 
    i = savedState.g;
    if (i != 3)
      setDrawerLockMode(i, 8388611); 
    i = savedState.h;
    if (i != 3)
      setDrawerLockMode(i, 8388613); 
  }
  
  public void onRtlPropertiesChanged(int paramInt) {
    Q();
  }
  
  protected Parcelable onSaveInstanceState() {
    SavedState savedState = new SavedState(super.onSaveInstanceState());
    int i = getChildCount();
    for (byte b = 0; b < i; b++) {
      boolean bool2;
      LayoutParams layoutParams = (LayoutParams)getChildAt(b).getLayoutParams();
      int j = layoutParams.d;
      boolean bool1 = true;
      if (j == 1) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      if (j != 2)
        bool1 = false; 
      if (bool2 || bool1) {
        savedState.d = layoutParams.a;
        break;
      } 
    } 
    savedState.e = this.s;
    savedState.f = this.t;
    savedState.g = this.u;
    savedState.h = this.v;
    return (Parcelable)savedState;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield l : Lb/j/a/c;
    //   4: aload_1
    //   5: invokevirtual F : (Landroid/view/MotionEvent;)V
    //   8: aload_0
    //   9: getfield m : Lb/j/a/c;
    //   12: aload_1
    //   13: invokevirtual F : (Landroid/view/MotionEvent;)V
    //   16: aload_1
    //   17: invokevirtual getAction : ()I
    //   20: sipush #255
    //   23: iand
    //   24: istore_2
    //   25: iload_2
    //   26: ifeq -> 181
    //   29: iload_2
    //   30: iconst_1
    //   31: if_icmpeq -> 60
    //   34: iload_2
    //   35: iconst_3
    //   36: if_icmpeq -> 42
    //   39: goto -> 213
    //   42: aload_0
    //   43: iconst_1
    //   44: invokevirtual i : (Z)V
    //   47: aload_0
    //   48: iconst_0
    //   49: putfield w : Z
    //   52: aload_0
    //   53: iconst_0
    //   54: putfield x : Z
    //   57: goto -> 213
    //   60: aload_1
    //   61: invokevirtual getX : ()F
    //   64: fstore_3
    //   65: aload_1
    //   66: invokevirtual getY : ()F
    //   69: fstore #4
    //   71: aload_0
    //   72: getfield l : Lb/j/a/c;
    //   75: fload_3
    //   76: f2i
    //   77: fload #4
    //   79: f2i
    //   80: invokevirtual u : (II)Landroid/view/View;
    //   83: astore_1
    //   84: aload_1
    //   85: ifnull -> 164
    //   88: aload_0
    //   89: aload_1
    //   90: invokevirtual B : (Landroid/view/View;)Z
    //   93: ifeq -> 164
    //   96: fload_3
    //   97: aload_0
    //   98: getfield A : F
    //   101: fsub
    //   102: fstore_3
    //   103: fload #4
    //   105: aload_0
    //   106: getfield B : F
    //   109: fsub
    //   110: fstore #4
    //   112: aload_0
    //   113: getfield l : Lb/j/a/c;
    //   116: invokevirtual z : ()I
    //   119: istore_2
    //   120: fload_3
    //   121: fload_3
    //   122: fmul
    //   123: fload #4
    //   125: fload #4
    //   127: fmul
    //   128: fadd
    //   129: iload_2
    //   130: iload_2
    //   131: imul
    //   132: i2f
    //   133: fcmpg
    //   134: ifge -> 164
    //   137: aload_0
    //   138: invokevirtual o : ()Landroid/view/View;
    //   141: astore_1
    //   142: aload_1
    //   143: ifnull -> 164
    //   146: aload_0
    //   147: aload_1
    //   148: invokevirtual r : (Landroid/view/View;)I
    //   151: iconst_2
    //   152: if_icmpne -> 158
    //   155: goto -> 164
    //   158: iconst_0
    //   159: istore #5
    //   161: goto -> 167
    //   164: iconst_1
    //   165: istore #5
    //   167: aload_0
    //   168: iload #5
    //   170: invokevirtual i : (Z)V
    //   173: aload_0
    //   174: iconst_0
    //   175: putfield w : Z
    //   178: goto -> 213
    //   181: aload_1
    //   182: invokevirtual getX : ()F
    //   185: fstore_3
    //   186: aload_1
    //   187: invokevirtual getY : ()F
    //   190: fstore #4
    //   192: aload_0
    //   193: fload_3
    //   194: putfield A : F
    //   197: aload_0
    //   198: fload #4
    //   200: putfield B : F
    //   203: aload_0
    //   204: iconst_0
    //   205: putfield w : Z
    //   208: aload_0
    //   209: iconst_0
    //   210: putfield x : Z
    //   213: iconst_1
    //   214: ireturn
  }
  
  View p() {
    int i = getChildCount();
    for (byte b = 0; b < i; b++) {
      View view = getChildAt(b);
      if (E(view) && F(view))
        return view; 
    } 
    return null;
  }
  
  public int q(int paramInt) {
    int i = w.C((View)this);
    if (paramInt != 3) {
      if (paramInt != 5) {
        if (paramInt != 8388611) {
          if (paramInt == 8388613) {
            paramInt = this.v;
            if (paramInt != 3)
              return paramInt; 
            if (i == 0) {
              paramInt = this.t;
            } else {
              paramInt = this.s;
            } 
            if (paramInt != 3)
              return paramInt; 
          } 
        } else {
          paramInt = this.u;
          if (paramInt != 3)
            return paramInt; 
          if (i == 0) {
            paramInt = this.s;
          } else {
            paramInt = this.t;
          } 
          if (paramInt != 3)
            return paramInt; 
        } 
      } else {
        paramInt = this.t;
        if (paramInt != 3)
          return paramInt; 
        if (i == 0) {
          paramInt = this.v;
        } else {
          paramInt = this.u;
        } 
        if (paramInt != 3)
          return paramInt; 
      } 
    } else {
      paramInt = this.s;
      if (paramInt != 3)
        return paramInt; 
      if (i == 0) {
        paramInt = this.u;
      } else {
        paramInt = this.v;
      } 
      if (paramInt != 3)
        return paramInt; 
    } 
    return 0;
  }
  
  public int r(View paramView) {
    if (E(paramView))
      return q(((LayoutParams)paramView.getLayoutParams()).a); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("View ");
    stringBuilder.append(paramView);
    stringBuilder.append(" is not a drawer");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean) {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    this.w = paramBoolean;
    if (paramBoolean)
      i(true); 
  }
  
  public void requestLayout() {
    if (!this.q)
      super.requestLayout(); 
  }
  
  public CharSequence s(int paramInt) {
    paramInt = b.h.k.e.b(paramInt, w.C((View)this));
    return (paramInt == 3) ? this.F : ((paramInt == 5) ? this.G : null);
  }
  
  public void setChildInsets(Object paramObject, boolean paramBoolean) {
    this.H = paramObject;
    this.I = paramBoolean;
    if (!paramBoolean && getBackground() == null) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    setWillNotDraw(paramBoolean);
    requestLayout();
  }
  
  public void setDrawerElevation(float paramFloat) {
    this.g = paramFloat;
    for (byte b = 0; b < getChildCount(); b++) {
      View view = getChildAt(b);
      if (E(view))
        w.y0(view, this.g); 
    } 
  }
  
  @Deprecated
  public void setDrawerListener(d paramd) {
    d d1 = this.y;
    if (d1 != null)
      N(d1); 
    if (paramd != null)
      a(paramd); 
    this.y = paramd;
  }
  
  public void setDrawerLockMode(int paramInt) {
    setDrawerLockMode(paramInt, 3);
    setDrawerLockMode(paramInt, 5);
  }
  
  public void setDrawerLockMode(int paramInt1, int paramInt2) {
    int i = b.h.k.e.b(paramInt2, w.C((View)this));
    if (paramInt2 != 3) {
      if (paramInt2 != 5) {
        if (paramInt2 != 8388611) {
          if (paramInt2 == 8388613)
            this.v = paramInt1; 
        } else {
          this.u = paramInt1;
        } 
      } else {
        this.t = paramInt1;
      } 
    } else {
      this.s = paramInt1;
    } 
    if (paramInt1 != 0) {
      b.j.a.c c1;
      if (i == 3) {
        c1 = this.l;
      } else {
        c1 = this.m;
      } 
      c1.b();
    } 
    if (paramInt1 != 1) {
      if (paramInt1 == 2) {
        View view = n(i);
        if (view != null)
          L(view); 
      } 
    } else {
      View view = n(i);
      if (view != null)
        f(view); 
    } 
  }
  
  public void setDrawerLockMode(int paramInt, View paramView) {
    if (E(paramView)) {
      setDrawerLockMode(paramInt, ((LayoutParams)paramView.getLayoutParams()).a);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("View ");
    stringBuilder.append(paramView);
    stringBuilder.append(" is not a ");
    stringBuilder.append("drawer with appropriate layout_gravity");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void setDrawerShadow(int paramInt1, int paramInt2) {
    setDrawerShadow(androidx.core.content.a.f(getContext(), paramInt1), paramInt2);
  }
  
  public void setDrawerShadow(Drawable paramDrawable, int paramInt) {
    if (e)
      return; 
    if ((paramInt & 0x800003) == 8388611) {
      this.J = paramDrawable;
    } else if ((paramInt & 0x800005) == 8388613) {
      this.K = paramDrawable;
    } else if ((paramInt & 0x3) == 3) {
      this.L = paramDrawable;
    } else if ((paramInt & 0x5) == 5) {
      this.M = paramDrawable;
    } else {
      return;
    } 
    Q();
    invalidate();
  }
  
  public void setDrawerTitle(int paramInt, CharSequence paramCharSequence) {
    paramInt = b.h.k.e.b(paramInt, w.C((View)this));
    if (paramInt == 3) {
      this.F = paramCharSequence;
    } else if (paramInt == 5) {
      this.G = paramCharSequence;
    } 
  }
  
  public void setScrimColor(int paramInt) {
    this.i = paramInt;
    invalidate();
  }
  
  public void setStatusBarBackground(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = androidx.core.content.a.f(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    this.C = drawable;
    invalidate();
  }
  
  public void setStatusBarBackground(Drawable paramDrawable) {
    this.C = paramDrawable;
    invalidate();
  }
  
  public void setStatusBarBackgroundColor(int paramInt) {
    this.C = (Drawable)new ColorDrawable(paramInt);
    invalidate();
  }
  
  int t(View paramView) {
    return b.h.k.e.b(((LayoutParams)paramView.getLayoutParams()).a, w.C((View)this));
  }
  
  float u(View paramView) {
    return ((LayoutParams)paramView.getLayoutParams()).b;
  }
  
  static {
    boolean bool2;
    boolean bool1 = true;
  }
  
  public static class LayoutParams extends ViewGroup.MarginLayoutParams {
    public int a = 0;
    
    float b;
    
    boolean c;
    
    int d;
    
    public LayoutParams(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    public LayoutParams(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, DrawerLayout.c);
      this.a = typedArray.getInt(0, 0);
      typedArray.recycle();
    }
    
    public LayoutParams(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public LayoutParams(ViewGroup.MarginLayoutParams param1MarginLayoutParams) {
      super(param1MarginLayoutParams);
    }
    
    public LayoutParams(LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
      this.a = param1LayoutParams.a;
    }
  }
  
  protected static class SavedState extends AbsSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = (Parcelable.Creator<SavedState>)new a();
    
    int d = 0;
    
    int e;
    
    int f;
    
    int g;
    
    int h;
    
    public SavedState(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      this.d = param1Parcel.readInt();
      this.e = param1Parcel.readInt();
      this.f = param1Parcel.readInt();
      this.g = param1Parcel.readInt();
      this.h = param1Parcel.readInt();
    }
    
    public SavedState(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeInt(this.d);
      param1Parcel.writeInt(this.e);
      param1Parcel.writeInt(this.f);
      param1Parcel.writeInt(this.g);
      param1Parcel.writeInt(this.h);
    }
    
    static final class a implements Parcelable.ClassLoaderCreator<SavedState> {
      public DrawerLayout.SavedState a(Parcel param2Parcel) {
        return new DrawerLayout.SavedState(param2Parcel, null);
      }
      
      public DrawerLayout.SavedState b(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new DrawerLayout.SavedState(param2Parcel, param2ClassLoader);
      }
      
      public DrawerLayout.SavedState[] c(int param2Int) {
        return new DrawerLayout.SavedState[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.ClassLoaderCreator<SavedState> {
    public DrawerLayout.SavedState a(Parcel param1Parcel) {
      return new DrawerLayout.SavedState(param1Parcel, null);
    }
    
    public DrawerLayout.SavedState b(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new DrawerLayout.SavedState(param1Parcel, param1ClassLoader);
    }
    
    public DrawerLayout.SavedState[] c(int param1Int) {
      return new DrawerLayout.SavedState[param1Int];
    }
  }
  
  class a implements View.OnApplyWindowInsetsListener {
    a(DrawerLayout this$0) {}
    
    public WindowInsets onApplyWindowInsets(View param1View, WindowInsets param1WindowInsets) {
      boolean bool;
      DrawerLayout drawerLayout = (DrawerLayout)param1View;
      if (param1WindowInsets.getSystemWindowInsetTop() > 0) {
        bool = true;
      } else {
        bool = false;
      } 
      drawerLayout.setChildInsets(param1WindowInsets, bool);
      return param1WindowInsets.consumeSystemWindowInsets();
    }
  }
  
  class b extends b.h.k.a {
    private final Rect d = new Rect();
    
    b(DrawerLayout this$0) {}
    
    private void n(b.h.k.f0.c param1c, ViewGroup param1ViewGroup) {
      int i = param1ViewGroup.getChildCount();
      for (byte b1 = 0; b1 < i; b1++) {
        View view = param1ViewGroup.getChildAt(b1);
        if (DrawerLayout.A(view))
          param1c.c(view); 
      } 
    }
    
    private void o(b.h.k.f0.c param1c1, b.h.k.f0.c param1c2) {
      Rect rect = this.d;
      param1c2.m(rect);
      param1c1.X(rect);
      param1c2.n(rect);
      param1c1.Y(rect);
      param1c1.F0(param1c2.N());
      param1c1.q0(param1c2.v());
      param1c1.c0(param1c2.p());
      param1c1.g0(param1c2.r());
      param1c1.h0(param1c2.F());
      param1c1.d0(param1c2.E());
      param1c1.j0(param1c2.G());
      param1c1.k0(param1c2.H());
      param1c1.V(param1c2.B());
      param1c1.y0(param1c2.L());
      param1c1.n0(param1c2.I());
      param1c1.a(param1c2.k());
    }
    
    public boolean a(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      List<CharSequence> list;
      CharSequence charSequence;
      if (param1AccessibilityEvent.getEventType() == 32) {
        list = param1AccessibilityEvent.getText();
        View view = this.e.p();
        if (view != null) {
          int i = this.e.t(view);
          charSequence = this.e.s(i);
          if (charSequence != null)
            list.add(charSequence); 
        } 
        return true;
      } 
      return super.a((View)list, (AccessibilityEvent)charSequence);
    }
    
    public void f(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      super.f(param1View, param1AccessibilityEvent);
      param1AccessibilityEvent.setClassName(DrawerLayout.class.getName());
    }
    
    public void g(View param1View, b.h.k.f0.c param1c) {
      if (DrawerLayout.d) {
        super.g(param1View, param1c);
      } else {
        b.h.k.f0.c c1 = b.h.k.f0.c.Q(param1c);
        super.g(param1View, c1);
        param1c.A0(param1View);
        ViewParent viewParent = w.J(param1View);
        if (viewParent instanceof View)
          param1c.s0((View)viewParent); 
        o(param1c, c1);
        c1.S();
        n(param1c, (ViewGroup)param1View);
      } 
      param1c.c0(DrawerLayout.class.getName());
      param1c.j0(false);
      param1c.k0(false);
      param1c.T(b.h.k.f0.c.a.a);
      param1c.T(b.h.k.f0.c.a.b);
    }
    
    public boolean i(ViewGroup param1ViewGroup, View param1View, AccessibilityEvent param1AccessibilityEvent) {
      return (DrawerLayout.d || DrawerLayout.A(param1View)) ? super.i(param1ViewGroup, param1View, param1AccessibilityEvent) : false;
    }
  }
  
  static final class c extends b.h.k.a {
    public void g(View param1View, b.h.k.f0.c param1c) {
      super.g(param1View, param1c);
      if (!DrawerLayout.A(param1View))
        param1c.s0(null); 
    }
  }
  
  public static interface d {
    void a(View param1View);
    
    void b(View param1View);
    
    void c(int param1Int);
    
    void d(View param1View, float param1Float);
  }
  
  private class e extends b.j.a.c.c {
    private final int a;
    
    private b.j.a.c b;
    
    private final Runnable c = new a(this);
    
    e(DrawerLayout this$0, int param1Int) {
      this.a = param1Int;
    }
    
    private void n() {
      int i = this.a;
      byte b = 3;
      if (i == 3)
        b = 5; 
      View view = this.d.n(b);
      if (view != null)
        this.d.f(view); 
    }
    
    public int a(View param1View, int param1Int1, int param1Int2) {
      if (this.d.c(param1View, 3))
        return Math.max(-param1View.getWidth(), Math.min(param1Int1, 0)); 
      param1Int2 = this.d.getWidth();
      return Math.max(param1Int2 - param1View.getWidth(), Math.min(param1Int1, param1Int2));
    }
    
    public int b(View param1View, int param1Int1, int param1Int2) {
      return param1View.getTop();
    }
    
    public int d(View param1View) {
      boolean bool;
      if (this.d.E(param1View)) {
        bool = param1View.getWidth();
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public void f(int param1Int1, int param1Int2) {
      View view;
      if ((param1Int1 & 0x1) == 1) {
        view = this.d.n(3);
      } else {
        view = this.d.n(5);
      } 
      if (view != null && this.d.r(view) == 0)
        this.b.c(view, param1Int2); 
    }
    
    public boolean g(int param1Int) {
      return false;
    }
    
    public void h(int param1Int1, int param1Int2) {
      this.d.postDelayed(this.c, 160L);
    }
    
    public void i(View param1View, int param1Int) {
      ((DrawerLayout.LayoutParams)param1View.getLayoutParams()).c = false;
      n();
    }
    
    public void j(int param1Int) {
      this.d.T(this.a, param1Int, this.b.w());
    }
    
    public void k(View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      float f;
      param1Int2 = param1View.getWidth();
      if (this.d.c(param1View, 3)) {
        f = (param1Int1 + param1Int2);
      } else {
        f = (this.d.getWidth() - param1Int1);
      } 
      f /= param1Int2;
      this.d.R(param1View, f);
      if (f == 0.0F) {
        param1Int1 = 4;
      } else {
        param1Int1 = 0;
      } 
      param1View.setVisibility(param1Int1);
      this.d.invalidate();
    }
    
    public void l(View param1View, float param1Float1, float param1Float2) {
      // Byte code:
      //   0: aload_0
      //   1: getfield d : Landroidx/drawerlayout/widget/DrawerLayout;
      //   4: aload_1
      //   5: invokevirtual u : (Landroid/view/View;)F
      //   8: fstore_3
      //   9: aload_1
      //   10: invokevirtual getWidth : ()I
      //   13: istore #4
      //   15: aload_0
      //   16: getfield d : Landroidx/drawerlayout/widget/DrawerLayout;
      //   19: aload_1
      //   20: iconst_3
      //   21: invokevirtual c : (Landroid/view/View;I)Z
      //   24: ifeq -> 63
      //   27: fload_2
      //   28: fconst_0
      //   29: fcmpl
      //   30: ifgt -> 57
      //   33: fload_2
      //   34: fconst_0
      //   35: fcmpl
      //   36: ifne -> 49
      //   39: fload_3
      //   40: ldc 0.5
      //   42: fcmpl
      //   43: ifle -> 49
      //   46: goto -> 57
      //   49: iload #4
      //   51: ineg
      //   52: istore #5
      //   54: goto -> 106
      //   57: iconst_0
      //   58: istore #5
      //   60: goto -> 106
      //   63: aload_0
      //   64: getfield d : Landroidx/drawerlayout/widget/DrawerLayout;
      //   67: invokevirtual getWidth : ()I
      //   70: istore #6
      //   72: fload_2
      //   73: fconst_0
      //   74: fcmpg
      //   75: iflt -> 99
      //   78: iload #6
      //   80: istore #5
      //   82: fload_2
      //   83: fconst_0
      //   84: fcmpl
      //   85: ifne -> 106
      //   88: iload #6
      //   90: istore #5
      //   92: fload_3
      //   93: ldc 0.5
      //   95: fcmpl
      //   96: ifle -> 106
      //   99: iload #6
      //   101: iload #4
      //   103: isub
      //   104: istore #5
      //   106: aload_0
      //   107: getfield b : Lb/j/a/c;
      //   110: iload #5
      //   112: aload_1
      //   113: invokevirtual getTop : ()I
      //   116: invokevirtual N : (II)Z
      //   119: pop
      //   120: aload_0
      //   121: getfield d : Landroidx/drawerlayout/widget/DrawerLayout;
      //   124: invokevirtual invalidate : ()V
      //   127: return
    }
    
    public boolean m(View param1View, int param1Int) {
      boolean bool;
      if (this.d.E(param1View) && this.d.c(param1View, this.a) && this.d.r(param1View) == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    void o() {
      View view;
      int i = this.b.x();
      int j = this.a;
      int k = 0;
      if (j == 3) {
        j = 1;
      } else {
        j = 0;
      } 
      if (j != 0) {
        view = this.d.n(3);
        if (view != null)
          k = -view.getWidth(); 
        k += i;
      } else {
        view = this.d.n(5);
        k = this.d.getWidth() - i;
      } 
      if (view != null && ((j != 0 && view.getLeft() < k) || (j == 0 && view.getLeft() > k)) && this.d.r(view) == 0) {
        DrawerLayout.LayoutParams layoutParams = (DrawerLayout.LayoutParams)view.getLayoutParams();
        this.b.P(view, k, view.getTop());
        layoutParams.c = true;
        this.d.invalidate();
        n();
        this.d.b();
      } 
    }
    
    public void p() {
      this.d.removeCallbacks(this.c);
    }
    
    public void q(b.j.a.c param1c) {
      this.b = param1c;
    }
    
    class a implements Runnable {
      a(DrawerLayout.e this$0) {}
      
      public void run() {
        this.b.o();
      }
    }
  }
  
  class a implements Runnable {
    a(DrawerLayout this$0) {}
    
    public void run() {
      this.b.o();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/drawerlayout/widget/DrawerLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */