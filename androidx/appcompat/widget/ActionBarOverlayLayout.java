package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.m;
import b.a.f;
import b.h.k.e0;
import b.h.k.m;
import b.h.k.n;
import b.h.k.o;
import b.h.k.p;
import b.h.k.w;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements o, o, m, n {
  static final int[] b = new int[] { b.a.a.actionBarSize, 16842841 };
  
  private d A;
  
  private OverScroller B;
  
  ViewPropertyAnimator C;
  
  final AnimatorListenerAdapter D;
  
  private final Runnable E;
  
  private final Runnable F;
  
  private final p G;
  
  private int c;
  
  private int d = 0;
  
  private ContentFrameLayout e;
  
  ActionBarContainer f;
  
  private p g;
  
  private Drawable h;
  
  private boolean i;
  
  private boolean j;
  
  private boolean k;
  
  private boolean l;
  
  boolean m;
  
  private int n;
  
  private int o;
  
  private final Rect p = new Rect();
  
  private final Rect q = new Rect();
  
  private final Rect r = new Rect();
  
  private final Rect s = new Rect();
  
  private final Rect t = new Rect();
  
  private final Rect u = new Rect();
  
  private final Rect v = new Rect();
  
  private e0 w;
  
  private e0 x;
  
  private e0 y;
  
  private e0 z;
  
  public ActionBarOverlayLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public ActionBarOverlayLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    e0 e01 = e0.a;
    this.w = e01;
    this.x = e01;
    this.y = e01;
    this.z = e01;
    this.D = new a(this);
    this.E = new b(this);
    this.F = new c(this);
    t(paramContext);
    this.G = new p(this);
  }
  
  private void n() {
    s();
    this.F.run();
  }
  
  private boolean o(View paramView, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   4: checkcast androidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams
    //   7: astore_1
    //   8: iconst_1
    //   9: istore #7
    //   11: iload_3
    //   12: ifeq -> 46
    //   15: aload_1
    //   16: getfield leftMargin : I
    //   19: istore #8
    //   21: aload_2
    //   22: getfield left : I
    //   25: istore #9
    //   27: iload #8
    //   29: iload #9
    //   31: if_icmpeq -> 46
    //   34: aload_1
    //   35: iload #9
    //   37: putfield leftMargin : I
    //   40: iconst_1
    //   41: istore #10
    //   43: goto -> 49
    //   46: iconst_0
    //   47: istore #10
    //   49: iload #10
    //   51: istore_3
    //   52: iload #4
    //   54: ifeq -> 87
    //   57: aload_1
    //   58: getfield topMargin : I
    //   61: istore #8
    //   63: aload_2
    //   64: getfield top : I
    //   67: istore #9
    //   69: iload #10
    //   71: istore_3
    //   72: iload #8
    //   74: iload #9
    //   76: if_icmpeq -> 87
    //   79: aload_1
    //   80: iload #9
    //   82: putfield topMargin : I
    //   85: iconst_1
    //   86: istore_3
    //   87: iload_3
    //   88: istore #4
    //   90: iload #6
    //   92: ifeq -> 126
    //   95: aload_1
    //   96: getfield rightMargin : I
    //   99: istore #9
    //   101: aload_2
    //   102: getfield right : I
    //   105: istore #8
    //   107: iload_3
    //   108: istore #4
    //   110: iload #9
    //   112: iload #8
    //   114: if_icmpeq -> 126
    //   117: aload_1
    //   118: iload #8
    //   120: putfield rightMargin : I
    //   123: iconst_1
    //   124: istore #4
    //   126: iload #5
    //   128: ifeq -> 162
    //   131: aload_1
    //   132: getfield bottomMargin : I
    //   135: istore #9
    //   137: aload_2
    //   138: getfield bottom : I
    //   141: istore #8
    //   143: iload #9
    //   145: iload #8
    //   147: if_icmpeq -> 162
    //   150: aload_1
    //   151: iload #8
    //   153: putfield bottomMargin : I
    //   156: iload #7
    //   158: istore_3
    //   159: goto -> 165
    //   162: iload #4
    //   164: istore_3
    //   165: iload_3
    //   166: ireturn
  }
  
  private p r(View paramView) {
    if (paramView instanceof p)
      return (p)paramView; 
    if (paramView instanceof Toolbar)
      return ((Toolbar)paramView).getWrapper(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Can't make a decor toolbar out of ");
    stringBuilder.append(paramView.getClass().getSimpleName());
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  private void t(Context paramContext) {
    TypedArray typedArray = getContext().getTheme().obtainStyledAttributes(b);
    boolean bool1 = false;
    this.c = typedArray.getDimensionPixelSize(0, 0);
    Drawable drawable = typedArray.getDrawable(1);
    this.h = drawable;
    if (drawable == null) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    setWillNotDraw(bool2);
    typedArray.recycle();
    boolean bool2 = bool1;
    if ((paramContext.getApplicationInfo()).targetSdkVersion < 19)
      bool2 = true; 
    this.i = bool2;
    this.B = new OverScroller(paramContext);
  }
  
  private void v() {
    s();
    postDelayed(this.F, 600L);
  }
  
  private void w() {
    s();
    postDelayed(this.E, 600L);
  }
  
  private void y() {
    s();
    this.E.run();
  }
  
  private boolean z(float paramFloat) {
    boolean bool;
    this.B.fling(0, 0, 0, (int)paramFloat, 0, 0, -2147483648, 2147483647);
    if (this.B.getFinalY() > this.f.getHeight()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean a() {
    x();
    return this.g.a();
  }
  
  public boolean b() {
    x();
    return this.g.b();
  }
  
  public boolean c() {
    x();
    return this.g.c();
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return paramLayoutParams instanceof LayoutParams;
  }
  
  public boolean d() {
    x();
    return this.g.d();
  }
  
  public void draw(Canvas paramCanvas) {
    super.draw(paramCanvas);
    if (this.h != null && !this.i) {
      byte b;
      if (this.f.getVisibility() == 0) {
        b = (int)(this.f.getBottom() + this.f.getTranslationY() + 0.5F);
      } else {
        b = 0;
      } 
      this.h.setBounds(0, b, getWidth(), this.h.getIntrinsicHeight() + b);
      this.h.draw(paramCanvas);
    } 
  }
  
  public boolean e() {
    x();
    return this.g.e();
  }
  
  public void f(int paramInt) {
    x();
    if (paramInt != 2) {
      if (paramInt != 5) {
        if (paramInt == 109)
          setOverlayMode(true); 
      } else {
        this.g.q();
      } 
    } else {
      this.g.p();
    } 
  }
  
  protected boolean fitSystemWindows(Rect paramRect) {
    if (Build.VERSION.SDK_INT >= 21)
      return super.fitSystemWindows(paramRect); 
    x();
    boolean bool = o((View)this.f, paramRect, true, true, false, true);
    this.s.set(paramRect);
    k0.a((View)this, this.s, this.p);
    if (!this.t.equals(this.s)) {
      this.t.set(this.s);
      bool = true;
    } 
    if (!this.q.equals(this.p)) {
      this.q.set(this.p);
      bool = true;
    } 
    if (bool)
      requestLayout(); 
    return true;
  }
  
  public void g() {
    x();
    this.g.f();
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (ViewGroup.LayoutParams)new LayoutParams(paramLayoutParams);
  }
  
  public int getActionBarHideOffset() {
    boolean bool;
    ActionBarContainer actionBarContainer = this.f;
    if (actionBarContainer != null) {
      bool = -((int)actionBarContainer.getTranslationY());
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int getNestedScrollAxes() {
    return this.G.a();
  }
  
  public CharSequence getTitle() {
    x();
    return this.g.getTitle();
  }
  
  public void h(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfint) {
    i(paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public void i(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt5 == 0)
      onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  public boolean j(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    boolean bool;
    if (paramInt2 == 0 && onStartNestedScroll(paramView1, paramView2, paramInt1)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void k(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    if (paramInt2 == 0)
      onNestedScrollAccepted(paramView1, paramView2, paramInt1); 
  }
  
  public void l(View paramView, int paramInt) {
    if (paramInt == 0)
      onStopNestedScroll(paramView); 
  }
  
  public void m(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3) {
    if (paramInt3 == 0)
      onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfint); 
  }
  
  public WindowInsets onApplyWindowInsets(WindowInsets paramWindowInsets) {
    x();
    e0 e01 = e0.u(paramWindowInsets, (View)this);
    Rect rect = new Rect(e01.g(), e01.i(), e01.h(), e01.f());
    boolean bool1 = o((View)this.f, rect, true, true, false, true);
    w.g((View)this, e01, this.p);
    rect = this.p;
    e0 e02 = e01.k(rect.left, rect.top, rect.right, rect.bottom);
    this.w = e02;
    boolean bool2 = this.x.equals(e02);
    boolean bool = true;
    if (!bool2) {
      this.x = this.w;
      bool1 = true;
    } 
    if (!this.q.equals(this.p)) {
      this.q.set(this.p);
      bool1 = bool;
    } 
    if (bool1)
      requestLayout(); 
    return e01.a().c().b().s();
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    t(getContext());
    w.o0((View)this);
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    s();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt4 = getChildCount();
    paramInt3 = getPaddingLeft();
    paramInt2 = getPaddingTop();
    for (paramInt1 = 0; paramInt1 < paramInt4; paramInt1++) {
      View view = getChildAt(paramInt1);
      if (view.getVisibility() != 8) {
        LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
        int i = view.getMeasuredWidth();
        int j = view.getMeasuredHeight();
        int k = layoutParams.leftMargin + paramInt3;
        int i1 = layoutParams.topMargin + paramInt2;
        view.layout(k, i1, i + k, j + i1);
      } 
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    x();
    measureChildWithMargins((View)this.f, paramInt1, 0, paramInt2, 0);
    LayoutParams layoutParams = (LayoutParams)this.f.getLayoutParams();
    int i = Math.max(0, this.f.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    int j = Math.max(0, this.f.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
    int k = View.combineMeasuredStates(0, this.f.getMeasuredState());
    if ((w.O((View)this) & 0x100) != 0) {
      i1 = 1;
    } else {
      i1 = 0;
    } 
    if (i1) {
      int i4 = this.c;
      i3 = i4;
      if (this.k) {
        i3 = i4;
        if (this.f.getTabContainer() != null)
          i3 = i4 + this.c; 
      } 
    } else if (this.f.getVisibility() != 8) {
      i3 = this.f.getMeasuredHeight();
    } else {
      i3 = 0;
    } 
    this.r.set(this.p);
    int i2 = Build.VERSION.SDK_INT;
    if (i2 >= 21) {
      this.y = this.w;
    } else {
      this.u.set(this.s);
    } 
    if (!this.j && !i1) {
      Rect rect = this.r;
      rect.top += i3;
      rect.bottom += 0;
      if (i2 >= 21)
        this.y = this.y.k(0, i3, 0, 0); 
    } else if (i2 >= 21) {
      b.h.e.b b = b.h.e.b.b(this.y.g(), this.y.i() + i3, this.y.h(), this.y.f() + 0);
      this.y = (new e0.b(this.y)).c(b).a();
    } else {
      Rect rect = this.u;
      rect.top += i3;
      rect.bottom += 0;
    } 
    o((View)this.e, this.r, true, true, true, true);
    if (i2 >= 21 && !this.z.equals(this.y)) {
      e0 e01 = this.y;
      this.z = e01;
      w.h((View)this.e, e01);
    } else if (i2 < 21 && !this.v.equals(this.u)) {
      this.v.set(this.u);
      this.e.a(this.u);
    } 
    measureChildWithMargins((View)this.e, paramInt1, 0, paramInt2, 0);
    layoutParams = (LayoutParams)this.e.getLayoutParams();
    int i3 = Math.max(i, this.e.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    i2 = Math.max(j, this.e.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
    int i1 = View.combineMeasuredStates(k, this.e.getMeasuredState());
    k = getPaddingLeft();
    j = getPaddingRight();
    i2 = Math.max(i2 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight());
    setMeasuredDimension(View.resolveSizeAndState(Math.max(i3 + k + j, getSuggestedMinimumWidth()), paramInt1, i1), View.resolveSizeAndState(i2, paramInt2, i1 << 16));
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    if (!this.l || !paramBoolean)
      return false; 
    if (z(paramFloat2)) {
      n();
    } else {
      y();
    } 
    this.m = true;
    return true;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2) {
    return false;
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint) {}
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt1 = this.n + paramInt2;
    this.n = paramInt1;
    setActionBarHideOffset(paramInt1);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt) {
    this.G.b(paramView1, paramView2, paramInt);
    this.n = getActionBarHideOffset();
    s();
    d d1 = this.A;
    if (d1 != null)
      d1.e(); 
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt) {
    return ((paramInt & 0x2) == 0 || this.f.getVisibility() != 0) ? false : this.l;
  }
  
  public void onStopNestedScroll(View paramView) {
    if (this.l && !this.m)
      if (this.n <= this.f.getHeight()) {
        w();
      } else {
        v();
      }  
    d d1 = this.A;
    if (d1 != null)
      d1.b(); 
  }
  
  @Deprecated
  public void onWindowSystemUiVisibilityChanged(int paramInt) {
    boolean bool2;
    if (Build.VERSION.SDK_INT >= 16)
      super.onWindowSystemUiVisibilityChanged(paramInt); 
    x();
    int i = this.o;
    this.o = paramInt;
    boolean bool1 = false;
    if ((paramInt & 0x4) == 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if ((paramInt & 0x100) != 0)
      bool1 = true; 
    d d1 = this.A;
    if (d1 != null) {
      d1.c(bool1 ^ true);
      if (bool2 || !bool1) {
        this.A.a();
      } else {
        this.A.d();
      } 
    } 
    if (((i ^ paramInt) & 0x100) != 0 && this.A != null)
      w.o0((View)this); 
  }
  
  protected void onWindowVisibilityChanged(int paramInt) {
    super.onWindowVisibilityChanged(paramInt);
    this.d = paramInt;
    d d1 = this.A;
    if (d1 != null)
      d1.onWindowVisibilityChanged(paramInt); 
  }
  
  protected LayoutParams p() {
    return new LayoutParams(-1, -1);
  }
  
  public LayoutParams q(AttributeSet paramAttributeSet) {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  void s() {
    removeCallbacks(this.E);
    removeCallbacks(this.F);
    ViewPropertyAnimator viewPropertyAnimator = this.C;
    if (viewPropertyAnimator != null)
      viewPropertyAnimator.cancel(); 
  }
  
  public void setActionBarHideOffset(int paramInt) {
    s();
    paramInt = Math.max(0, Math.min(paramInt, this.f.getHeight()));
    this.f.setTranslationY(-paramInt);
  }
  
  public void setActionBarVisibilityCallback(d paramd) {
    this.A = paramd;
    if (getWindowToken() != null) {
      this.A.onWindowVisibilityChanged(this.d);
      int i = this.o;
      if (i != 0) {
        onWindowSystemUiVisibilityChanged(i);
        w.o0((View)this);
      } 
    } 
  }
  
  public void setHasNonEmbeddedTabs(boolean paramBoolean) {
    this.k = paramBoolean;
  }
  
  public void setHideOnContentScrollEnabled(boolean paramBoolean) {
    if (paramBoolean != this.l) {
      this.l = paramBoolean;
      if (!paramBoolean) {
        s();
        setActionBarHideOffset(0);
      } 
    } 
  }
  
  public void setIcon(int paramInt) {
    x();
    this.g.setIcon(paramInt);
  }
  
  public void setIcon(Drawable paramDrawable) {
    x();
    this.g.setIcon(paramDrawable);
  }
  
  public void setLogo(int paramInt) {
    x();
    this.g.j(paramInt);
  }
  
  public void setMenu(Menu paramMenu, m.a parama) {
    x();
    this.g.setMenu(paramMenu, parama);
  }
  
  public void setMenuPrepared() {
    x();
    this.g.setMenuPrepared();
  }
  
  public void setOverlayMode(boolean paramBoolean) {
    this.j = paramBoolean;
    if (paramBoolean && (getContext().getApplicationInfo()).targetSdkVersion < 19) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    this.i = paramBoolean;
  }
  
  public void setShowingForActionMode(boolean paramBoolean) {}
  
  public void setUiOptions(int paramInt) {}
  
  public void setWindowCallback(Window.Callback paramCallback) {
    x();
    this.g.setWindowCallback(paramCallback);
  }
  
  public void setWindowTitle(CharSequence paramCharSequence) {
    x();
    this.g.setWindowTitle(paramCharSequence);
  }
  
  public boolean shouldDelayChildPressedState() {
    return false;
  }
  
  public boolean u() {
    return this.j;
  }
  
  void x() {
    if (this.e == null) {
      this.e = (ContentFrameLayout)findViewById(f.action_bar_activity_content);
      this.f = (ActionBarContainer)findViewById(f.action_bar_container);
      this.g = r(findViewById(f.action_bar));
    } 
  }
  
  public static class LayoutParams extends ViewGroup.MarginLayoutParams {
    public LayoutParams(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    public LayoutParams(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
    
    public LayoutParams(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
  }
  
  class a extends AnimatorListenerAdapter {
    a(ActionBarOverlayLayout this$0) {}
    
    public void onAnimationCancel(Animator param1Animator) {
      ActionBarOverlayLayout actionBarOverlayLayout = this.a;
      actionBarOverlayLayout.C = null;
      actionBarOverlayLayout.m = false;
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      ActionBarOverlayLayout actionBarOverlayLayout = this.a;
      actionBarOverlayLayout.C = null;
      actionBarOverlayLayout.m = false;
    }
  }
  
  class b implements Runnable {
    b(ActionBarOverlayLayout this$0) {}
    
    public void run() {
      this.b.s();
      ActionBarOverlayLayout actionBarOverlayLayout = this.b;
      actionBarOverlayLayout.C = actionBarOverlayLayout.f.animate().translationY(0.0F).setListener((Animator.AnimatorListener)this.b.D);
    }
  }
  
  class c implements Runnable {
    c(ActionBarOverlayLayout this$0) {}
    
    public void run() {
      this.b.s();
      ActionBarOverlayLayout actionBarOverlayLayout = this.b;
      actionBarOverlayLayout.C = actionBarOverlayLayout.f.animate().translationY(-this.b.f.getHeight()).setListener((Animator.AnimatorListener)this.b.D);
    }
  }
  
  public static interface d {
    void a();
    
    void b();
    
    void c(boolean param1Boolean);
    
    void d();
    
    void e();
    
    void onWindowVisibilityChanged(int param1Int);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/ActionBarOverlayLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */