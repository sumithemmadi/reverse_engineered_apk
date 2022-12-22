package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import b.h.k.f0.c;
import b.h.k.f0.e;
import b.h.k.k;
import b.h.k.l;
import b.h.k.n;
import b.h.k.p;
import b.h.k.w;

public class NestedScrollView extends FrameLayout implements n, k {
  private static final a b = new a();
  
  private static final int[] c = new int[] { 16843130 };
  
  private final l A;
  
  private float B;
  
  private b C;
  
  private long d;
  
  private final Rect e = new Rect();
  
  private OverScroller f;
  
  private EdgeEffect g;
  
  private EdgeEffect h;
  
  private int i;
  
  private boolean j = true;
  
  private boolean k = false;
  
  private View l = null;
  
  private boolean m = false;
  
  private VelocityTracker n;
  
  private boolean o;
  
  private boolean p = true;
  
  private int q;
  
  private int r;
  
  private int s;
  
  private int t = -1;
  
  private final int[] u = new int[2];
  
  private final int[] v = new int[2];
  
  private int w;
  
  private int x;
  
  private SavedState y;
  
  private final p z;
  
  public NestedScrollView(Context paramContext) {
    this(paramContext, null);
  }
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    x();
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, c, paramInt, 0);
    setFillViewport(typedArray.getBoolean(0, false));
    typedArray.recycle();
    this.z = new p((ViewGroup)this);
    this.A = new l((View)this);
    setNestedScrollingEnabled(true);
    w.r0((View)this, b);
  }
  
  private static boolean A(View paramView1, View paramView2) {
    boolean bool = true;
    if (paramView1 == paramView2)
      return true; 
    ViewParent viewParent = paramView1.getParent();
    if (!(viewParent instanceof ViewGroup) || !A((View)viewParent, paramView2))
      bool = false; 
    return bool;
  }
  
  private boolean B(View paramView, int paramInt1, int paramInt2) {
    boolean bool;
    paramView.getDrawingRect(this.e);
    offsetDescendantRectToMyCoords(paramView, this.e);
    if (this.e.bottom + paramInt1 >= getScrollY() && this.e.top - paramInt1 <= getScrollY() + paramInt2) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void C(int paramInt1, int paramInt2, int[] paramArrayOfint) {
    int i = getScrollY();
    scrollBy(0, paramInt1);
    i = getScrollY() - i;
    if (paramArrayOfint != null)
      paramArrayOfint[1] = paramArrayOfint[1] + i; 
    this.A.e(0, i, 0, paramInt1 - i, null, paramInt2, paramArrayOfint);
  }
  
  private void D(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i) == this.t) {
      if (i == 0) {
        i = 1;
      } else {
        i = 0;
      } 
      this.i = (int)paramMotionEvent.getY(i);
      this.t = paramMotionEvent.getPointerId(i);
      VelocityTracker velocityTracker = this.n;
      if (velocityTracker != null)
        velocityTracker.clear(); 
    } 
  }
  
  private void G() {
    VelocityTracker velocityTracker = this.n;
    if (velocityTracker != null) {
      velocityTracker.recycle();
      this.n = null;
    } 
  }
  
  private void H(boolean paramBoolean) {
    if (paramBoolean) {
      P(2, 1);
    } else {
      Q(1);
    } 
    this.x = getScrollY();
    w.h0((View)this);
  }
  
  private boolean I(int paramInt1, int paramInt2, int paramInt3) {
    boolean bool2;
    NestedScrollView nestedScrollView;
    int i = getHeight();
    int j = getScrollY();
    i += j;
    boolean bool1 = false;
    if (paramInt1 == 33) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    View view1 = r(bool2, paramInt2, paramInt3);
    View view2 = view1;
    if (view1 == null)
      nestedScrollView = this; 
    if (paramInt2 >= j && paramInt3 <= i) {
      bool2 = bool1;
    } else {
      if (bool2) {
        paramInt2 -= j;
      } else {
        paramInt2 = paramInt3 - i;
      } 
      n(paramInt2);
      bool2 = true;
    } 
    if (nestedScrollView != findFocus())
      nestedScrollView.requestFocus(paramInt1); 
    return bool2;
  }
  
  private void J(View paramView) {
    paramView.getDrawingRect(this.e);
    offsetDescendantRectToMyCoords(paramView, this.e);
    int i = e(this.e);
    if (i != 0)
      scrollBy(0, i); 
  }
  
  private boolean K(Rect paramRect, boolean paramBoolean) {
    boolean bool;
    int i = e(paramRect);
    if (i != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool)
      if (paramBoolean) {
        scrollBy(0, i);
      } else {
        L(0, i);
      }  
    return bool;
  }
  
  private void M(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    if (getChildCount() == 0)
      return; 
    if (AnimationUtils.currentAnimationTimeMillis() - this.d > 250L) {
      View view = getChildAt(0);
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
      int i = view.getHeight();
      int j = layoutParams.topMargin;
      int m = layoutParams.bottomMargin;
      int i1 = getHeight();
      int i2 = getPaddingTop();
      int i3 = getPaddingBottom();
      paramInt1 = getScrollY();
      paramInt2 = Math.max(0, Math.min(paramInt2 + paramInt1, Math.max(0, i + j + m - i1 - i2 - i3)));
      this.f.startScroll(getScrollX(), paramInt1, 0, paramInt2 - paramInt1, paramInt3);
      H(paramBoolean);
    } else {
      if (!this.f.isFinished())
        a(); 
      scrollBy(paramInt1, paramInt2);
    } 
    this.d = AnimationUtils.currentAnimationTimeMillis();
  }
  
  private void a() {
    this.f.abortAnimation();
    Q(1);
  }
  
  private boolean c() {
    int i = getChildCount();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i > 0) {
      View view = getChildAt(0);
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
      bool2 = bool1;
      if (view.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > getHeight() - getPaddingTop() - getPaddingBottom())
        bool2 = true; 
    } 
    return bool2;
  }
  
  private static int d(int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt2 >= paramInt3 || paramInt1 < 0) ? 0 : ((paramInt2 + paramInt1 > paramInt3) ? (paramInt3 - paramInt2) : paramInt1);
  }
  
  private float getVerticalScrollFactorCompat() {
    if (this.B == 0.0F) {
      TypedValue typedValue = new TypedValue();
      Context context = getContext();
      if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
        this.B = typedValue.getDimension(context.getResources().getDisplayMetrics());
      } else {
        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
      } 
    } 
    return this.B;
  }
  
  private void n(int paramInt) {
    if (paramInt != 0)
      if (this.p) {
        L(0, paramInt);
      } else {
        scrollBy(0, paramInt);
      }  
  }
  
  private void o() {
    this.m = false;
    G();
    Q(0);
    EdgeEffect edgeEffect = this.g;
    if (edgeEffect != null) {
      edgeEffect.onRelease();
      this.h.onRelease();
    } 
  }
  
  private void p() {
    if (getOverScrollMode() != 2) {
      if (this.g == null) {
        Context context = getContext();
        this.g = new EdgeEffect(context);
        this.h = new EdgeEffect(context);
      } 
    } else {
      this.g = null;
      this.h = null;
    } 
  }
  
  private View r(boolean paramBoolean, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_2
    //   2: invokevirtual getFocusables : (I)Ljava/util/ArrayList;
    //   5: astore #4
    //   7: aload #4
    //   9: invokeinterface size : ()I
    //   14: istore #5
    //   16: aconst_null
    //   17: astore #6
    //   19: iconst_0
    //   20: istore #7
    //   22: iconst_0
    //   23: istore #8
    //   25: iload #7
    //   27: iload #5
    //   29: if_icmpge -> 246
    //   32: aload #4
    //   34: iload #7
    //   36: invokeinterface get : (I)Ljava/lang/Object;
    //   41: checkcast android/view/View
    //   44: astore #9
    //   46: aload #9
    //   48: invokevirtual getTop : ()I
    //   51: istore #10
    //   53: aload #9
    //   55: invokevirtual getBottom : ()I
    //   58: istore #11
    //   60: aload #6
    //   62: astore #12
    //   64: iload #8
    //   66: istore #13
    //   68: iload_2
    //   69: iload #11
    //   71: if_icmpge -> 232
    //   74: aload #6
    //   76: astore #12
    //   78: iload #8
    //   80: istore #13
    //   82: iload #10
    //   84: iload_3
    //   85: if_icmpge -> 232
    //   88: iload_2
    //   89: iload #10
    //   91: if_icmpge -> 106
    //   94: iload #11
    //   96: iload_3
    //   97: if_icmpge -> 106
    //   100: iconst_1
    //   101: istore #14
    //   103: goto -> 109
    //   106: iconst_0
    //   107: istore #14
    //   109: aload #6
    //   111: ifnonnull -> 125
    //   114: aload #9
    //   116: astore #12
    //   118: iload #14
    //   120: istore #13
    //   122: goto -> 232
    //   125: iload_1
    //   126: ifeq -> 139
    //   129: iload #10
    //   131: aload #6
    //   133: invokevirtual getTop : ()I
    //   136: if_icmplt -> 153
    //   139: iload_1
    //   140: ifne -> 159
    //   143: iload #11
    //   145: aload #6
    //   147: invokevirtual getBottom : ()I
    //   150: if_icmple -> 159
    //   153: iconst_1
    //   154: istore #11
    //   156: goto -> 162
    //   159: iconst_0
    //   160: istore #11
    //   162: iload #8
    //   164: ifeq -> 196
    //   167: aload #6
    //   169: astore #12
    //   171: iload #8
    //   173: istore #13
    //   175: iload #14
    //   177: ifeq -> 232
    //   180: aload #6
    //   182: astore #12
    //   184: iload #8
    //   186: istore #13
    //   188: iload #11
    //   190: ifeq -> 232
    //   193: goto -> 224
    //   196: iload #14
    //   198: ifeq -> 211
    //   201: aload #9
    //   203: astore #12
    //   205: iconst_1
    //   206: istore #13
    //   208: goto -> 232
    //   211: aload #6
    //   213: astore #12
    //   215: iload #8
    //   217: istore #13
    //   219: iload #11
    //   221: ifeq -> 232
    //   224: aload #9
    //   226: astore #12
    //   228: iload #8
    //   230: istore #13
    //   232: iinc #7, 1
    //   235: aload #12
    //   237: astore #6
    //   239: iload #13
    //   241: istore #8
    //   243: goto -> 25
    //   246: aload #6
    //   248: areturn
  }
  
  private boolean v(int paramInt1, int paramInt2) {
    int i = getChildCount();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i > 0) {
      i = getScrollY();
      View view = getChildAt(0);
      bool2 = bool1;
      if (paramInt2 >= view.getTop() - i) {
        bool2 = bool1;
        if (paramInt2 < view.getBottom() - i) {
          bool2 = bool1;
          if (paramInt1 >= view.getLeft()) {
            bool2 = bool1;
            if (paramInt1 < view.getRight())
              bool2 = true; 
          } 
        } 
      } 
    } 
    return bool2;
  }
  
  private void w() {
    VelocityTracker velocityTracker = this.n;
    if (velocityTracker == null) {
      this.n = VelocityTracker.obtain();
    } else {
      velocityTracker.clear();
    } 
  }
  
  private void x() {
    this.f = new OverScroller(getContext());
    setFocusable(true);
    setDescendantFocusability(262144);
    setWillNotDraw(false);
    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
    this.q = viewConfiguration.getScaledTouchSlop();
    this.r = viewConfiguration.getScaledMinimumFlingVelocity();
    this.s = viewConfiguration.getScaledMaximumFlingVelocity();
  }
  
  private void y() {
    if (this.n == null)
      this.n = VelocityTracker.obtain(); 
  }
  
  private boolean z(View paramView) {
    return B(paramView, 0, getHeight()) ^ true;
  }
  
  boolean E(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getOverScrollMode : ()I
    //   4: istore #10
    //   6: aload_0
    //   7: invokevirtual computeHorizontalScrollRange : ()I
    //   10: istore #11
    //   12: aload_0
    //   13: invokevirtual computeHorizontalScrollExtent : ()I
    //   16: istore #12
    //   18: iconst_0
    //   19: istore #13
    //   21: iload #11
    //   23: iload #12
    //   25: if_icmple -> 34
    //   28: iconst_1
    //   29: istore #11
    //   31: goto -> 37
    //   34: iconst_0
    //   35: istore #11
    //   37: aload_0
    //   38: invokevirtual computeVerticalScrollRange : ()I
    //   41: aload_0
    //   42: invokevirtual computeVerticalScrollExtent : ()I
    //   45: if_icmple -> 54
    //   48: iconst_1
    //   49: istore #12
    //   51: goto -> 57
    //   54: iconst_0
    //   55: istore #12
    //   57: iload #10
    //   59: ifeq -> 82
    //   62: iload #10
    //   64: iconst_1
    //   65: if_icmpne -> 76
    //   68: iload #11
    //   70: ifeq -> 76
    //   73: goto -> 82
    //   76: iconst_0
    //   77: istore #11
    //   79: goto -> 85
    //   82: iconst_1
    //   83: istore #11
    //   85: iload #10
    //   87: ifeq -> 110
    //   90: iload #10
    //   92: iconst_1
    //   93: if_icmpne -> 104
    //   96: iload #12
    //   98: ifeq -> 104
    //   101: goto -> 110
    //   104: iconst_0
    //   105: istore #12
    //   107: goto -> 113
    //   110: iconst_1
    //   111: istore #12
    //   113: iload_3
    //   114: iload_1
    //   115: iadd
    //   116: istore_3
    //   117: iload #11
    //   119: ifne -> 127
    //   122: iconst_0
    //   123: istore_1
    //   124: goto -> 130
    //   127: iload #7
    //   129: istore_1
    //   130: iload #4
    //   132: iload_2
    //   133: iadd
    //   134: istore #4
    //   136: iload #12
    //   138: ifne -> 146
    //   141: iconst_0
    //   142: istore_2
    //   143: goto -> 149
    //   146: iload #8
    //   148: istore_2
    //   149: iload_1
    //   150: ineg
    //   151: istore #7
    //   153: iload_1
    //   154: iload #5
    //   156: iadd
    //   157: istore_1
    //   158: iload_2
    //   159: ineg
    //   160: istore #5
    //   162: iload_2
    //   163: iload #6
    //   165: iadd
    //   166: istore #6
    //   168: iload_3
    //   169: iload_1
    //   170: if_icmple -> 181
    //   173: iconst_1
    //   174: istore #9
    //   176: iload_1
    //   177: istore_2
    //   178: goto -> 198
    //   181: iload_3
    //   182: iload #7
    //   184: if_icmpge -> 193
    //   187: iload #7
    //   189: istore_1
    //   190: goto -> 173
    //   193: iconst_0
    //   194: istore #9
    //   196: iload_3
    //   197: istore_2
    //   198: iload #4
    //   200: iload #6
    //   202: if_icmple -> 214
    //   205: iload #6
    //   207: istore_1
    //   208: iconst_1
    //   209: istore #14
    //   211: goto -> 233
    //   214: iload #4
    //   216: iload #5
    //   218: if_icmpge -> 227
    //   221: iload #5
    //   223: istore_1
    //   224: goto -> 208
    //   227: iconst_0
    //   228: istore #14
    //   230: iload #4
    //   232: istore_1
    //   233: iload #14
    //   235: ifeq -> 263
    //   238: aload_0
    //   239: iconst_1
    //   240: invokevirtual u : (I)Z
    //   243: ifne -> 263
    //   246: aload_0
    //   247: getfield f : Landroid/widget/OverScroller;
    //   250: iload_2
    //   251: iload_1
    //   252: iconst_0
    //   253: iconst_0
    //   254: iconst_0
    //   255: aload_0
    //   256: invokevirtual getScrollRange : ()I
    //   259: invokevirtual springBack : (IIIIII)Z
    //   262: pop
    //   263: aload_0
    //   264: iload_2
    //   265: iload_1
    //   266: iload #9
    //   268: iload #14
    //   270: invokevirtual onOverScrolled : (IIZZ)V
    //   273: iload #9
    //   275: ifne -> 287
    //   278: iload #13
    //   280: istore #9
    //   282: iload #14
    //   284: ifeq -> 290
    //   287: iconst_1
    //   288: istore #9
    //   290: iload #9
    //   292: ireturn
  }
  
  public boolean F(int paramInt) {
    if (paramInt == 130) {
      i = 1;
    } else {
      i = 0;
    } 
    int j = getHeight();
    if (i) {
      this.e.top = getScrollY() + j;
      i = getChildCount();
      if (i > 0) {
        View view = getChildAt(i - 1);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        i = view.getBottom() + layoutParams.bottomMargin + getPaddingBottom();
        Rect rect1 = this.e;
        if (rect1.top + j > i)
          rect1.top = i - j; 
      } 
    } else {
      this.e.top = getScrollY() - j;
      Rect rect1 = this.e;
      if (rect1.top < 0)
        rect1.top = 0; 
    } 
    Rect rect = this.e;
    int i = rect.top;
    j += i;
    rect.bottom = j;
    return I(paramInt, i, j);
  }
  
  public final void L(int paramInt1, int paramInt2) {
    M(paramInt1, paramInt2, 250, false);
  }
  
  void N(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    M(paramInt1 - getScrollX(), paramInt2 - getScrollY(), paramInt3, paramBoolean);
  }
  
  void O(int paramInt1, int paramInt2, boolean paramBoolean) {
    N(paramInt1, paramInt2, 250, paramBoolean);
  }
  
  public boolean P(int paramInt1, int paramInt2) {
    return this.A.p(paramInt1, paramInt2);
  }
  
  public void Q(int paramInt) {
    this.A.r(paramInt);
  }
  
  public void addView(View paramView) {
    if (getChildCount() <= 0) {
      super.addView(paramView);
      return;
    } 
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public void addView(View paramView, int paramInt) {
    if (getChildCount() <= 0) {
      super.addView(paramView, paramInt);
      return;
    } 
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    if (getChildCount() <= 0) {
      super.addView(paramView, paramInt, paramLayoutParams);
      return;
    } 
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    if (getChildCount() <= 0) {
      super.addView(paramView, paramLayoutParams);
      return;
    } 
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public boolean b(int paramInt) {
    View view1 = findFocus();
    View view2 = view1;
    if (view1 == this)
      view2 = null; 
    view1 = FocusFinder.getInstance().findNextFocus((ViewGroup)this, view2, paramInt);
    int i = getMaxScrollAmount();
    if (view1 != null && B(view1, i, getHeight())) {
      view1.getDrawingRect(this.e);
      offsetDescendantRectToMyCoords(view1, this.e);
      n(e(this.e));
      view1.requestFocus(paramInt);
    } else {
      int j;
      if (paramInt == 33 && getScrollY() < i) {
        j = getScrollY();
      } else {
        j = i;
        if (paramInt == 130) {
          j = i;
          if (getChildCount() > 0) {
            view1 = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view1.getLayoutParams();
            j = Math.min(view1.getBottom() + layoutParams.bottomMargin - getScrollY() + getHeight() - getPaddingBottom(), i);
          } 
        } 
      } 
      if (j == 0)
        return false; 
      if (paramInt != 130)
        j = -j; 
      n(j);
    } 
    if (view2 != null && view2.isFocused() && z(view2)) {
      paramInt = getDescendantFocusability();
      setDescendantFocusability(131072);
      requestFocus();
      setDescendantFocusability(paramInt);
    } 
    return true;
  }
  
  public int computeHorizontalScrollExtent() {
    return super.computeHorizontalScrollExtent();
  }
  
  public int computeHorizontalScrollOffset() {
    return super.computeHorizontalScrollOffset();
  }
  
  public int computeHorizontalScrollRange() {
    return super.computeHorizontalScrollRange();
  }
  
  public void computeScroll() {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : Landroid/widget/OverScroller;
    //   4: invokevirtual isFinished : ()Z
    //   7: ifeq -> 11
    //   10: return
    //   11: aload_0
    //   12: getfield f : Landroid/widget/OverScroller;
    //   15: invokevirtual computeScrollOffset : ()Z
    //   18: pop
    //   19: aload_0
    //   20: getfield f : Landroid/widget/OverScroller;
    //   23: invokevirtual getCurrY : ()I
    //   26: istore_1
    //   27: iload_1
    //   28: aload_0
    //   29: getfield x : I
    //   32: isub
    //   33: istore_2
    //   34: aload_0
    //   35: iload_1
    //   36: putfield x : I
    //   39: aload_0
    //   40: getfield v : [I
    //   43: astore_3
    //   44: iconst_0
    //   45: istore #4
    //   47: aload_3
    //   48: iconst_1
    //   49: iconst_0
    //   50: iastore
    //   51: aload_0
    //   52: iconst_0
    //   53: iload_2
    //   54: aload_3
    //   55: aconst_null
    //   56: iconst_1
    //   57: invokevirtual f : (II[I[II)Z
    //   60: pop
    //   61: iload_2
    //   62: aload_0
    //   63: getfield v : [I
    //   66: iconst_1
    //   67: iaload
    //   68: isub
    //   69: istore_1
    //   70: aload_0
    //   71: invokevirtual getScrollRange : ()I
    //   74: istore #5
    //   76: iload_1
    //   77: istore_2
    //   78: iload_1
    //   79: ifeq -> 148
    //   82: aload_0
    //   83: invokevirtual getScrollY : ()I
    //   86: istore_2
    //   87: aload_0
    //   88: iconst_0
    //   89: iload_1
    //   90: aload_0
    //   91: invokevirtual getScrollX : ()I
    //   94: iload_2
    //   95: iconst_0
    //   96: iload #5
    //   98: iconst_0
    //   99: iconst_0
    //   100: iconst_0
    //   101: invokevirtual E : (IIIIIIIIZ)Z
    //   104: pop
    //   105: aload_0
    //   106: invokevirtual getScrollY : ()I
    //   109: iload_2
    //   110: isub
    //   111: istore_2
    //   112: iload_1
    //   113: iload_2
    //   114: isub
    //   115: istore_1
    //   116: aload_0
    //   117: getfield v : [I
    //   120: astore_3
    //   121: aload_3
    //   122: iconst_1
    //   123: iconst_0
    //   124: iastore
    //   125: aload_0
    //   126: iconst_0
    //   127: iload_2
    //   128: iconst_0
    //   129: iload_1
    //   130: aload_0
    //   131: getfield u : [I
    //   134: iconst_1
    //   135: aload_3
    //   136: invokevirtual g : (IIII[II[I)V
    //   139: iload_1
    //   140: aload_0
    //   141: getfield v : [I
    //   144: iconst_1
    //   145: iaload
    //   146: isub
    //   147: istore_2
    //   148: iload_2
    //   149: ifeq -> 251
    //   152: aload_0
    //   153: invokevirtual getOverScrollMode : ()I
    //   156: istore #6
    //   158: iload #6
    //   160: ifeq -> 180
    //   163: iload #4
    //   165: istore_1
    //   166: iload #6
    //   168: iconst_1
    //   169: if_icmpne -> 182
    //   172: iload #4
    //   174: istore_1
    //   175: iload #5
    //   177: ifle -> 182
    //   180: iconst_1
    //   181: istore_1
    //   182: iload_1
    //   183: ifeq -> 247
    //   186: aload_0
    //   187: invokespecial p : ()V
    //   190: iload_2
    //   191: ifge -> 222
    //   194: aload_0
    //   195: getfield g : Landroid/widget/EdgeEffect;
    //   198: invokevirtual isFinished : ()Z
    //   201: ifeq -> 247
    //   204: aload_0
    //   205: getfield g : Landroid/widget/EdgeEffect;
    //   208: aload_0
    //   209: getfield f : Landroid/widget/OverScroller;
    //   212: invokevirtual getCurrVelocity : ()F
    //   215: f2i
    //   216: invokevirtual onAbsorb : (I)V
    //   219: goto -> 247
    //   222: aload_0
    //   223: getfield h : Landroid/widget/EdgeEffect;
    //   226: invokevirtual isFinished : ()Z
    //   229: ifeq -> 247
    //   232: aload_0
    //   233: getfield h : Landroid/widget/EdgeEffect;
    //   236: aload_0
    //   237: getfield f : Landroid/widget/OverScroller;
    //   240: invokevirtual getCurrVelocity : ()F
    //   243: f2i
    //   244: invokevirtual onAbsorb : (I)V
    //   247: aload_0
    //   248: invokespecial a : ()V
    //   251: aload_0
    //   252: getfield f : Landroid/widget/OverScroller;
    //   255: invokevirtual isFinished : ()Z
    //   258: ifne -> 268
    //   261: aload_0
    //   262: invokestatic h0 : (Landroid/view/View;)V
    //   265: goto -> 273
    //   268: aload_0
    //   269: iconst_1
    //   270: invokevirtual Q : (I)V
    //   273: return
  }
  
  public int computeVerticalScrollExtent() {
    return super.computeVerticalScrollExtent();
  }
  
  public int computeVerticalScrollOffset() {
    return Math.max(0, super.computeVerticalScrollOffset());
  }
  
  public int computeVerticalScrollRange() {
    int i = getChildCount();
    int j = getHeight() - getPaddingBottom() - getPaddingTop();
    if (i == 0)
      return j; 
    View view = getChildAt(0);
    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
    i = view.getBottom() + layoutParams.bottomMargin;
    int m = getScrollY();
    int i1 = Math.max(0, i - j);
    if (m < 0) {
      j = i - m;
    } else {
      j = i;
      if (m > i1)
        j = i + m - i1; 
    } 
    return j;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    return (super.dispatchKeyEvent(paramKeyEvent) || q(paramKeyEvent));
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    return this.A.a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2) {
    return this.A.b(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    return f(paramInt1, paramInt2, paramArrayOfint1, paramArrayOfint2, 0);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) {
    return this.A.f(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfint);
  }
  
  public void draw(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial draw : (Landroid/graphics/Canvas;)V
    //   5: aload_0
    //   6: getfield g : Landroid/widget/EdgeEffect;
    //   9: ifnull -> 398
    //   12: aload_0
    //   13: invokevirtual getScrollY : ()I
    //   16: istore_2
    //   17: aload_0
    //   18: getfield g : Landroid/widget/EdgeEffect;
    //   21: invokevirtual isFinished : ()Z
    //   24: istore_3
    //   25: iconst_0
    //   26: istore #4
    //   28: iload_3
    //   29: ifne -> 202
    //   32: aload_1
    //   33: invokevirtual save : ()I
    //   36: istore #5
    //   38: aload_0
    //   39: invokevirtual getWidth : ()I
    //   42: istore #6
    //   44: aload_0
    //   45: invokevirtual getHeight : ()I
    //   48: istore #7
    //   50: iconst_0
    //   51: iload_2
    //   52: invokestatic min : (II)I
    //   55: istore #8
    //   57: getstatic android/os/Build$VERSION.SDK_INT : I
    //   60: istore #9
    //   62: iload #9
    //   64: bipush #21
    //   66: if_icmplt -> 85
    //   69: aload_0
    //   70: invokevirtual getClipToPadding : ()Z
    //   73: ifeq -> 79
    //   76: goto -> 85
    //   79: iconst_0
    //   80: istore #10
    //   82: goto -> 107
    //   85: iload #6
    //   87: aload_0
    //   88: invokevirtual getPaddingLeft : ()I
    //   91: aload_0
    //   92: invokevirtual getPaddingRight : ()I
    //   95: iadd
    //   96: isub
    //   97: istore #6
    //   99: aload_0
    //   100: invokevirtual getPaddingLeft : ()I
    //   103: iconst_0
    //   104: iadd
    //   105: istore #10
    //   107: iload #7
    //   109: istore #11
    //   111: iload #8
    //   113: istore #12
    //   115: iload #9
    //   117: bipush #21
    //   119: if_icmplt -> 160
    //   122: iload #7
    //   124: istore #11
    //   126: iload #8
    //   128: istore #12
    //   130: aload_0
    //   131: invokevirtual getClipToPadding : ()Z
    //   134: ifeq -> 160
    //   137: iload #7
    //   139: aload_0
    //   140: invokevirtual getPaddingTop : ()I
    //   143: aload_0
    //   144: invokevirtual getPaddingBottom : ()I
    //   147: iadd
    //   148: isub
    //   149: istore #11
    //   151: iload #8
    //   153: aload_0
    //   154: invokevirtual getPaddingTop : ()I
    //   157: iadd
    //   158: istore #12
    //   160: aload_1
    //   161: iload #10
    //   163: i2f
    //   164: iload #12
    //   166: i2f
    //   167: invokevirtual translate : (FF)V
    //   170: aload_0
    //   171: getfield g : Landroid/widget/EdgeEffect;
    //   174: iload #6
    //   176: iload #11
    //   178: invokevirtual setSize : (II)V
    //   181: aload_0
    //   182: getfield g : Landroid/widget/EdgeEffect;
    //   185: aload_1
    //   186: invokevirtual draw : (Landroid/graphics/Canvas;)Z
    //   189: ifeq -> 196
    //   192: aload_0
    //   193: invokestatic h0 : (Landroid/view/View;)V
    //   196: aload_1
    //   197: iload #5
    //   199: invokevirtual restoreToCount : (I)V
    //   202: aload_0
    //   203: getfield h : Landroid/widget/EdgeEffect;
    //   206: invokevirtual isFinished : ()Z
    //   209: ifne -> 398
    //   212: aload_1
    //   213: invokevirtual save : ()I
    //   216: istore #5
    //   218: aload_0
    //   219: invokevirtual getWidth : ()I
    //   222: istore #12
    //   224: aload_0
    //   225: invokevirtual getHeight : ()I
    //   228: istore #7
    //   230: aload_0
    //   231: invokevirtual getScrollRange : ()I
    //   234: iload_2
    //   235: invokestatic max : (II)I
    //   238: iload #7
    //   240: iadd
    //   241: istore #8
    //   243: getstatic android/os/Build$VERSION.SDK_INT : I
    //   246: istore_2
    //   247: iload_2
    //   248: bipush #21
    //   250: if_icmplt -> 268
    //   253: iload #4
    //   255: istore #6
    //   257: iload #12
    //   259: istore #10
    //   261: aload_0
    //   262: invokevirtual getClipToPadding : ()Z
    //   265: ifeq -> 290
    //   268: iload #12
    //   270: aload_0
    //   271: invokevirtual getPaddingLeft : ()I
    //   274: aload_0
    //   275: invokevirtual getPaddingRight : ()I
    //   278: iadd
    //   279: isub
    //   280: istore #10
    //   282: iconst_0
    //   283: aload_0
    //   284: invokevirtual getPaddingLeft : ()I
    //   287: iadd
    //   288: istore #6
    //   290: iload #8
    //   292: istore #11
    //   294: iload #7
    //   296: istore #12
    //   298: iload_2
    //   299: bipush #21
    //   301: if_icmplt -> 342
    //   304: iload #8
    //   306: istore #11
    //   308: iload #7
    //   310: istore #12
    //   312: aload_0
    //   313: invokevirtual getClipToPadding : ()Z
    //   316: ifeq -> 342
    //   319: iload #7
    //   321: aload_0
    //   322: invokevirtual getPaddingTop : ()I
    //   325: aload_0
    //   326: invokevirtual getPaddingBottom : ()I
    //   329: iadd
    //   330: isub
    //   331: istore #12
    //   333: iload #8
    //   335: aload_0
    //   336: invokevirtual getPaddingBottom : ()I
    //   339: isub
    //   340: istore #11
    //   342: aload_1
    //   343: iload #6
    //   345: iload #10
    //   347: isub
    //   348: i2f
    //   349: iload #11
    //   351: i2f
    //   352: invokevirtual translate : (FF)V
    //   355: aload_1
    //   356: ldc_w 180.0
    //   359: iload #10
    //   361: i2f
    //   362: fconst_0
    //   363: invokevirtual rotate : (FFF)V
    //   366: aload_0
    //   367: getfield h : Landroid/widget/EdgeEffect;
    //   370: iload #10
    //   372: iload #12
    //   374: invokevirtual setSize : (II)V
    //   377: aload_0
    //   378: getfield h : Landroid/widget/EdgeEffect;
    //   381: aload_1
    //   382: invokevirtual draw : (Landroid/graphics/Canvas;)Z
    //   385: ifeq -> 392
    //   388: aload_0
    //   389: invokestatic h0 : (Landroid/view/View;)V
    //   392: aload_1
    //   393: iload #5
    //   395: invokevirtual restoreToCount : (I)V
    //   398: return
  }
  
  protected int e(Rect paramRect) {
    int i = getChildCount();
    boolean bool = false;
    if (i == 0)
      return 0; 
    int j = getHeight();
    i = getScrollY();
    int m = i + j;
    int i1 = getVerticalFadingEdgeLength();
    int i2 = i;
    if (paramRect.top > 0)
      i2 = i + i1; 
    View view = getChildAt(0);
    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
    if (paramRect.bottom < view.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
      i1 = m - i1;
    } else {
      i1 = m;
    } 
    int i3 = paramRect.bottom;
    if (i3 > i1 && paramRect.top > i2) {
      if (paramRect.height() > j) {
        i = paramRect.top - i2;
      } else {
        i = paramRect.bottom - i1;
      } 
      i = Math.min(i + 0, view.getBottom() + layoutParams.bottomMargin - m);
    } else {
      i = bool;
      if (paramRect.top < i2) {
        i = bool;
        if (i3 < i1) {
          if (paramRect.height() > j) {
            i = 0 - i1 - paramRect.bottom;
          } else {
            i = 0 - i2 - paramRect.top;
          } 
          i = Math.max(i, -getScrollY());
        } 
      } 
    } 
    return i;
  }
  
  public boolean f(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt3) {
    return this.A.d(paramInt1, paramInt2, paramArrayOfint1, paramArrayOfint2, paramInt3);
  }
  
  public void g(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint1, int paramInt5, int[] paramArrayOfint2) {
    this.A.e(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfint1, paramInt5, paramArrayOfint2);
  }
  
  protected float getBottomFadingEdgeStrength() {
    if (getChildCount() == 0)
      return 0.0F; 
    View view = getChildAt(0);
    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
    int i = getVerticalFadingEdgeLength();
    int j = getHeight();
    int m = getPaddingBottom();
    m = view.getBottom() + layoutParams.bottomMargin - getScrollY() - j - m;
    return (m < i) ? (m / i) : 1.0F;
  }
  
  public int getMaxScrollAmount() {
    return (int)(getHeight() * 0.5F);
  }
  
  public int getNestedScrollAxes() {
    return this.z.a();
  }
  
  int getScrollRange() {
    int i = getChildCount();
    int j = 0;
    if (i > 0) {
      View view = getChildAt(0);
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
      j = Math.max(0, view.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin - getHeight() - getPaddingTop() - getPaddingBottom());
    } 
    return j;
  }
  
  protected float getTopFadingEdgeStrength() {
    if (getChildCount() == 0)
      return 0.0F; 
    int i = getVerticalFadingEdgeLength();
    int j = getScrollY();
    return (j < i) ? (j / i) : 1.0F;
  }
  
  public void h(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfint) {
    C(paramInt4, paramInt5, paramArrayOfint);
  }
  
  public boolean hasNestedScrollingParent() {
    return u(0);
  }
  
  public void i(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    C(paramInt4, paramInt5, null);
  }
  
  public boolean isNestedScrollingEnabled() {
    return this.A.l();
  }
  
  public boolean j(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    boolean bool;
    if ((paramInt1 & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void k(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    this.z.c(paramView1, paramView2, paramInt1, paramInt2);
    P(2, paramInt2);
  }
  
  public void l(View paramView, int paramInt) {
    this.z.e(paramView, paramInt);
    Q(paramInt);
  }
  
  public void m(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3) {
    f(paramInt1, paramInt2, paramArrayOfint, null, paramInt3);
  }
  
  protected void measureChild(View paramView, int paramInt1, int paramInt2) {
    ViewGroup.LayoutParams layoutParams = paramView.getLayoutParams();
    paramView.measure(FrameLayout.getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
  }
  
  protected void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    paramView.measure(FrameLayout.getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + paramInt2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.k = false;
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent) {
    if ((paramMotionEvent.getSource() & 0x2) != 0 && paramMotionEvent.getAction() == 8 && !this.m) {
      float f = paramMotionEvent.getAxisValue(9);
      if (f != 0.0F) {
        int i = (int)(f * getVerticalScrollFactorCompat());
        int j = getScrollRange();
        int m = getScrollY();
        i = m - i;
        if (i < 0) {
          j = 0;
        } else if (i <= j) {
          j = i;
        } 
        if (j != m) {
          super.scrollTo(getScrollX(), j);
          return true;
        } 
      } 
    } 
    return false;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    ViewParent viewParent;
    int i = paramMotionEvent.getAction();
    if (i == 2 && this.m)
      return true; 
    i &= 0xFF;
    if (i != 0) {
      if (i != 1)
        if (i != 2) {
          if (i != 3) {
            if (i == 6)
              D(paramMotionEvent); 
            return this.m;
          } 
        } else {
          i = this.t;
          if (i != -1) {
            StringBuilder stringBuilder;
            int j = paramMotionEvent.findPointerIndex(i);
            if (j == -1) {
              stringBuilder = new StringBuilder();
              stringBuilder.append("Invalid pointerId=");
              stringBuilder.append(i);
              stringBuilder.append(" in onInterceptTouchEvent");
              Log.e("NestedScrollView", stringBuilder.toString());
            } else {
              i = (int)stringBuilder.getY(j);
              if (Math.abs(i - this.i) > this.q && (0x2 & getNestedScrollAxes()) == 0) {
                this.m = true;
                this.i = i;
                y();
                this.n.addMovement((MotionEvent)stringBuilder);
                this.w = 0;
                viewParent = getParent();
                if (viewParent != null)
                  viewParent.requestDisallowInterceptTouchEvent(true); 
              } 
            } 
          } 
          return this.m;
        }  
      this.m = false;
      this.t = -1;
      G();
      if (this.f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
        w.h0((View)this); 
      Q(0);
    } else {
      i = (int)viewParent.getY();
      if (!v((int)viewParent.getX(), i)) {
        this.m = false;
        G();
      } else {
        this.i = i;
        this.t = viewParent.getPointerId(0);
        w();
        this.n.addMovement((MotionEvent)viewParent);
        this.f.computeScrollOffset();
        this.m = this.f.isFinished() ^ true;
        P(2, 0);
      } 
    } 
    return this.m;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    paramInt1 = 0;
    this.j = false;
    View view = this.l;
    if (view != null && A(view, (View)this))
      J(this.l); 
    this.l = null;
    if (!this.k) {
      if (this.y != null) {
        scrollTo(getScrollX(), this.y.b);
        this.y = null;
      } 
      if (getChildCount() > 0) {
        view = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        paramInt1 = view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
      } 
      int i = getPaddingTop();
      int j = getPaddingBottom();
      paramInt3 = getScrollY();
      paramInt1 = d(paramInt3, paramInt4 - paramInt2 - i - j, paramInt1);
      if (paramInt1 != paramInt3)
        scrollTo(getScrollX(), paramInt1); 
    } 
    scrollTo(getScrollX(), getScrollY());
    this.k = true;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    if (!this.o)
      return; 
    if (View.MeasureSpec.getMode(paramInt2) == 0)
      return; 
    if (getChildCount() > 0) {
      View view = getChildAt(0);
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
      paramInt2 = view.getMeasuredHeight();
      int i = getMeasuredHeight() - getPaddingTop() - getPaddingBottom() - layoutParams.topMargin - layoutParams.bottomMargin;
      if (paramInt2 < i)
        view.measure(FrameLayout.getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(i, 1073741824)); 
    } 
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    if (!paramBoolean) {
      dispatchNestedFling(0.0F, paramFloat2, true);
      s((int)paramFloat2);
      return true;
    } 
    return false;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2) {
    return dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    m(paramView, paramInt1, paramInt2, paramArrayOfint, 0);
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    C(paramInt4, 0, null);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt) {
    k(paramView1, paramView2, paramInt, 0);
  }
  
  protected void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    super.scrollTo(paramInt1, paramInt2);
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect) {
    int i;
    View view;
    if (paramInt == 2) {
      i = 130;
    } else {
      i = paramInt;
      if (paramInt == 1)
        i = 33; 
    } 
    if (paramRect == null) {
      view = FocusFinder.getInstance().findNextFocus((ViewGroup)this, null, i);
    } else {
      view = FocusFinder.getInstance().findNextFocusFromRect((ViewGroup)this, paramRect, i);
    } 
    return (view == null) ? false : (z(view) ? false : view.requestFocus(i, paramRect));
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof SavedState)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    SavedState savedState = (SavedState)paramParcelable;
    super.onRestoreInstanceState(savedState.getSuperState());
    this.y = savedState;
    requestLayout();
  }
  
  protected Parcelable onSaveInstanceState() {
    SavedState savedState = new SavedState(super.onSaveInstanceState());
    savedState.b = getScrollY();
    return (Parcelable)savedState;
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    b b1 = this.C;
    if (b1 != null)
      b1.a(this, paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    View view = findFocus();
    if (view != null && this != view && B(view, 0, paramInt4)) {
      view.getDrawingRect(this.e);
      offsetDescendantRectToMyCoords(view, this.e);
      n(e(this.e));
    } 
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt) {
    return j(paramView1, paramView2, paramInt, 0);
  }
  
  public void onStopNestedScroll(View paramView) {
    l(paramView, 0);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    y();
    int i = paramMotionEvent.getActionMasked();
    if (i == 0)
      this.w = 0; 
    MotionEvent motionEvent = MotionEvent.obtain(paramMotionEvent);
    motionEvent.offsetLocation(0.0F, this.w);
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 5) {
              if (i == 6) {
                D(paramMotionEvent);
                this.i = (int)paramMotionEvent.getY(paramMotionEvent.findPointerIndex(this.t));
              } 
            } else {
              i = paramMotionEvent.getActionIndex();
              this.i = (int)paramMotionEvent.getY(i);
              this.t = paramMotionEvent.getPointerId(i);
            } 
          } else {
            if (this.m && getChildCount() > 0 && this.f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
              w.h0((View)this); 
            this.t = -1;
            o();
          } 
        } else {
          StringBuilder stringBuilder;
          int j = paramMotionEvent.findPointerIndex(this.t);
          if (j == -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid pointerId=");
            stringBuilder.append(this.t);
            stringBuilder.append(" in onTouchEvent");
            Log.e("NestedScrollView", stringBuilder.toString());
          } else {
            int m = (int)stringBuilder.getY(j);
            int i1 = this.i - m;
            i = i1;
            if (!this.m) {
              i = i1;
              if (Math.abs(i1) > this.q) {
                ViewParent viewParent = getParent();
                if (viewParent != null)
                  viewParent.requestDisallowInterceptTouchEvent(true); 
                this.m = true;
                if (i1 > 0) {
                  i = i1 - this.q;
                } else {
                  i = i1 + this.q;
                } 
              } 
            } 
            i1 = i;
            if (this.m) {
              i = i1;
              if (f(0, i1, this.v, this.u, 0)) {
                i = i1 - this.v[1];
                this.w += this.u[1];
              } 
              this.i = m - this.u[1];
              int i2 = getScrollY();
              m = getScrollRange();
              i1 = getOverScrollMode();
              if (i1 == 0 || (i1 == 1 && m > 0)) {
                i1 = 1;
              } else {
                i1 = 0;
              } 
              if (E(0, i, 0, getScrollY(), 0, m, 0, 0, true) && !u(0))
                this.n.clear(); 
              int i3 = getScrollY() - i2;
              int[] arrayOfInt = this.v;
              arrayOfInt[1] = 0;
              g(0, i3, 0, i - i3, this.u, 0, arrayOfInt);
              i3 = this.i;
              arrayOfInt = this.u;
              this.i = i3 - arrayOfInt[1];
              this.w += arrayOfInt[1];
              if (i1 != 0) {
                i -= this.v[1];
                p();
                i1 = i2 + i;
                if (i1 < 0) {
                  d.a(this.g, i / getHeight(), stringBuilder.getX(j) / getWidth());
                  if (!this.h.isFinished())
                    this.h.onRelease(); 
                } else if (i1 > m) {
                  d.a(this.h, i / getHeight(), 1.0F - stringBuilder.getX(j) / getWidth());
                  if (!this.g.isFinished())
                    this.g.onRelease(); 
                } 
                EdgeEffect edgeEffect = this.g;
                if (edgeEffect != null && (!edgeEffect.isFinished() || !this.h.isFinished()))
                  w.h0((View)this); 
              } 
            } 
          } 
        } 
      } else {
        velocityTracker = this.n;
        velocityTracker.computeCurrentVelocity(1000, this.s);
        i = (int)velocityTracker.getYVelocity(this.t);
        if (Math.abs(i) >= this.r) {
          i = -i;
          float f = i;
          if (!dispatchNestedPreFling(0.0F, f)) {
            dispatchNestedFling(0.0F, f, true);
            s(i);
          } 
        } else if (this.f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
          w.h0((View)this);
        } 
        this.t = -1;
        o();
      } 
    } else {
      if (getChildCount() == 0)
        return false; 
      int j = this.f.isFinished() ^ true;
      this.m = j;
      if (j != 0) {
        ViewParent viewParent = getParent();
        if (viewParent != null)
          viewParent.requestDisallowInterceptTouchEvent(true); 
      } 
      if (!this.f.isFinished())
        a(); 
      this.i = (int)velocityTracker.getY();
      this.t = velocityTracker.getPointerId(0);
      P(2, 0);
    } 
    VelocityTracker velocityTracker = this.n;
    if (velocityTracker != null)
      velocityTracker.addMovement(motionEvent); 
    motionEvent.recycle();
    return true;
  }
  
  public boolean q(KeyEvent paramKeyEvent) {
    View view;
    this.e.setEmpty();
    boolean bool = c();
    boolean bool1 = false;
    boolean bool2 = false;
    char c = '';
    if (!bool) {
      bool = bool2;
      if (isFocused()) {
        bool = bool2;
        if (paramKeyEvent.getKeyCode() != 4) {
          View view1 = findFocus();
          view = view1;
          if (view1 == this)
            view = null; 
          view = FocusFinder.getInstance().findNextFocus((ViewGroup)this, view, 130);
          bool = bool2;
          if (view != null) {
            bool = bool2;
            if (view != this) {
              bool = bool2;
              if (view.requestFocus(130))
                bool = true; 
            } 
          } 
        } 
      } 
      return bool;
    } 
    bool = bool1;
    if (view.getAction() == 0) {
      int i = view.getKeyCode();
      if (i != 19) {
        if (i != 20) {
          if (i != 62) {
            bool = bool1;
          } else {
            if (view.isShiftPressed())
              c = '!'; 
            F(c);
            bool = bool1;
          } 
        } else if (!view.isAltPressed()) {
          bool = b(130);
        } else {
          bool = t(130);
        } 
      } else if (!view.isAltPressed()) {
        bool = b(33);
      } else {
        bool = t(33);
      } 
    } 
    return bool;
  }
  
  public void requestChildFocus(View paramView1, View paramView2) {
    if (!this.j) {
      J(paramView2);
    } else {
      this.l = paramView2;
    } 
    super.requestChildFocus(paramView1, paramView2);
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean) {
    paramRect.offset(paramView.getLeft() - paramView.getScrollX(), paramView.getTop() - paramView.getScrollY());
    return K(paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean) {
    if (paramBoolean)
      G(); 
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout() {
    this.j = true;
    super.requestLayout();
  }
  
  public void s(int paramInt) {
    if (getChildCount() > 0) {
      this.f.fling(getScrollX(), getScrollY(), 0, paramInt, 0, 0, -2147483648, 2147483647, 0, 0);
      H(true);
    } 
  }
  
  public void scrollTo(int paramInt1, int paramInt2) {
    if (getChildCount() > 0) {
      View view = getChildAt(0);
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
      int i = getWidth();
      int j = getPaddingLeft();
      int m = getPaddingRight();
      int i1 = view.getWidth();
      int i2 = layoutParams.leftMargin;
      int i3 = layoutParams.rightMargin;
      int i4 = getHeight();
      int i5 = getPaddingTop();
      int i6 = getPaddingBottom();
      int i7 = view.getHeight();
      int i8 = layoutParams.topMargin;
      int i9 = layoutParams.bottomMargin;
      paramInt1 = d(paramInt1, i - j - m, i1 + i2 + i3);
      paramInt2 = d(paramInt2, i4 - i5 - i6, i7 + i8 + i9);
      if (paramInt1 != getScrollX() || paramInt2 != getScrollY())
        super.scrollTo(paramInt1, paramInt2); 
    } 
  }
  
  public void setFillViewport(boolean paramBoolean) {
    if (paramBoolean != this.o) {
      this.o = paramBoolean;
      requestLayout();
    } 
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean) {
    this.A.m(paramBoolean);
  }
  
  public void setOnScrollChangeListener(b paramb) {
    this.C = paramb;
  }
  
  public void setSmoothScrollingEnabled(boolean paramBoolean) {
    this.p = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState() {
    return true;
  }
  
  public boolean startNestedScroll(int paramInt) {
    return P(paramInt, 0);
  }
  
  public void stopNestedScroll() {
    Q(0);
  }
  
  public boolean t(int paramInt) {
    int i;
    if (paramInt == 130) {
      i = 1;
    } else {
      i = 0;
    } 
    int j = getHeight();
    Rect rect = this.e;
    rect.top = 0;
    rect.bottom = j;
    if (i) {
      i = getChildCount();
      if (i > 0) {
        View view = getChildAt(i - 1);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        this.e.bottom = view.getBottom() + layoutParams.bottomMargin + getPaddingBottom();
        Rect rect1 = this.e;
        rect1.top = rect1.bottom - j;
      } 
    } 
    rect = this.e;
    return I(paramInt, rect.top, rect.bottom);
  }
  
  public boolean u(int paramInt) {
    return this.A.k(paramInt);
  }
  
  static class SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = new a();
    
    public int b;
    
    SavedState(Parcel param1Parcel) {
      super(param1Parcel);
      this.b = param1Parcel.readInt();
    }
    
    SavedState(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("HorizontalScrollView.SavedState{");
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append(" scrollPosition=");
      stringBuilder.append(this.b);
      stringBuilder.append("}");
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeInt(this.b);
    }
    
    class a implements Parcelable.Creator<SavedState> {
      public NestedScrollView.SavedState a(Parcel param2Parcel) {
        return new NestedScrollView.SavedState(param2Parcel);
      }
      
      public NestedScrollView.SavedState[] b(int param2Int) {
        return new NestedScrollView.SavedState[param2Int];
      }
    }
  }
  
  class a implements Parcelable.Creator<SavedState> {
    public NestedScrollView.SavedState a(Parcel param1Parcel) {
      return new NestedScrollView.SavedState(param1Parcel);
    }
    
    public NestedScrollView.SavedState[] b(int param1Int) {
      return new NestedScrollView.SavedState[param1Int];
    }
  }
  
  static class a extends b.h.k.a {
    public void f(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      boolean bool;
      super.f(param1View, param1AccessibilityEvent);
      NestedScrollView nestedScrollView = (NestedScrollView)param1View;
      param1AccessibilityEvent.setClassName(ScrollView.class.getName());
      if (nestedScrollView.getScrollRange() > 0) {
        bool = true;
      } else {
        bool = false;
      } 
      param1AccessibilityEvent.setScrollable(bool);
      param1AccessibilityEvent.setScrollX(nestedScrollView.getScrollX());
      param1AccessibilityEvent.setScrollY(nestedScrollView.getScrollY());
      e.a((AccessibilityRecord)param1AccessibilityEvent, nestedScrollView.getScrollX());
      e.b((AccessibilityRecord)param1AccessibilityEvent, nestedScrollView.getScrollRange());
    }
    
    public void g(View param1View, c param1c) {
      super.g(param1View, param1c);
      NestedScrollView nestedScrollView = (NestedScrollView)param1View;
      param1c.c0(ScrollView.class.getName());
      if (nestedScrollView.isEnabled()) {
        int i = nestedScrollView.getScrollRange();
        if (i > 0) {
          param1c.x0(true);
          if (nestedScrollView.getScrollY() > 0) {
            param1c.b(c.a.n);
            param1c.b(c.a.y);
          } 
          if (nestedScrollView.getScrollY() < i) {
            param1c.b(c.a.m);
            param1c.b(c.a.A);
          } 
        } 
      } 
    }
    
    public boolean j(View param1View, int param1Int, Bundle param1Bundle) {
      if (super.j(param1View, param1Int, param1Bundle))
        return true; 
      NestedScrollView nestedScrollView = (NestedScrollView)param1View;
      if (!nestedScrollView.isEnabled())
        return false; 
      if (param1Int != 4096)
        if (param1Int != 8192 && param1Int != 16908344) {
          if (param1Int != 16908346)
            return false; 
        } else {
          int k = nestedScrollView.getHeight();
          int m = nestedScrollView.getPaddingBottom();
          param1Int = nestedScrollView.getPaddingTop();
          param1Int = Math.max(nestedScrollView.getScrollY() - k - m - param1Int, 0);
          if (param1Int != nestedScrollView.getScrollY()) {
            nestedScrollView.O(0, param1Int, true);
            return true;
          } 
          return false;
        }  
      int j = nestedScrollView.getHeight();
      int i = nestedScrollView.getPaddingBottom();
      param1Int = nestedScrollView.getPaddingTop();
      param1Int = Math.min(nestedScrollView.getScrollY() + j - i - param1Int, nestedScrollView.getScrollRange());
      if (param1Int != nestedScrollView.getScrollY()) {
        nestedScrollView.O(0, param1Int, true);
        return true;
      } 
      return false;
    }
  }
  
  public static interface b {
    void a(NestedScrollView param1NestedScrollView, int param1Int1, int param1Int2, int param1Int3, int param1Int4);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/widget/NestedScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */