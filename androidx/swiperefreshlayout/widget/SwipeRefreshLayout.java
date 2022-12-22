package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import b.h.k.k;
import b.h.k.l;
import b.h.k.o;
import b.h.k.p;
import b.h.k.w;

public class SwipeRefreshLayout extends ViewGroup implements o, k {
  private static final String b = SwipeRefreshLayout.class.getSimpleName();
  
  private static final int[] c = new int[] { 16842766 };
  
  float A;
  
  protected int B;
  
  int C;
  
  int D;
  
  b E;
  
  private Animation F;
  
  private Animation G;
  
  private Animation H;
  
  private Animation I;
  
  private Animation J;
  
  boolean K;
  
  private int L;
  
  boolean M;
  
  private i N;
  
  private Animation.AnimationListener O = new a(this);
  
  private final Animation P = new f(this);
  
  private final Animation Q = new g(this);
  
  private View d;
  
  j e;
  
  boolean f = false;
  
  private int g;
  
  private float h = -1.0F;
  
  private float i;
  
  private final p j;
  
  private final l k;
  
  private final int[] l = new int[2];
  
  private final int[] m = new int[2];
  
  private boolean n;
  
  private int o;
  
  int p;
  
  private float q;
  
  private float r;
  
  private boolean s;
  
  private int t = -1;
  
  boolean u;
  
  private boolean v;
  
  private final DecelerateInterpolator w;
  
  a x;
  
  private int y = -1;
  
  protected int z;
  
  public SwipeRefreshLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public SwipeRefreshLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    this.g = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    this.o = getResources().getInteger(17694721);
    setWillNotDraw(false);
    this.w = new DecelerateInterpolator(2.0F);
    DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
    this.L = (int)(displayMetrics.density * 40.0F);
    d();
    setChildrenDrawingOrderEnabled(true);
    int m = (int)(displayMetrics.density * 64.0F);
    this.C = m;
    this.h = m;
    this.j = new p(this);
    this.k = new l((View)this);
    setNestedScrollingEnabled(true);
    m = -this.L;
    this.p = m;
    this.B = m;
    o(1.0F);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, c);
    setEnabled(typedArray.getBoolean(0, true));
    typedArray.recycle();
  }
  
  private void a(int paramInt, Animation.AnimationListener paramAnimationListener) {
    this.z = paramInt;
    this.P.reset();
    this.P.setDuration(200L);
    this.P.setInterpolator((Interpolator)this.w);
    if (paramAnimationListener != null)
      this.x.b(paramAnimationListener); 
    this.x.clearAnimation();
    this.x.startAnimation(this.P);
  }
  
  private void b(int paramInt, Animation.AnimationListener paramAnimationListener) {
    if (this.u) {
      x(paramInt, paramAnimationListener);
    } else {
      this.z = paramInt;
      this.Q.reset();
      this.Q.setDuration(200L);
      this.Q.setInterpolator((Interpolator)this.w);
      if (paramAnimationListener != null)
        this.x.b(paramAnimationListener); 
      this.x.clearAnimation();
      this.x.startAnimation(this.Q);
    } 
  }
  
  private void d() {
    this.x = new a(getContext(), -328966);
    b b1 = new b(getContext());
    this.E = b1;
    b1.l(1);
    this.x.setImageDrawable(this.E);
    this.x.setVisibility(8);
    addView((View)this.x);
  }
  
  private void e() {
    if (this.d == null)
      for (byte b1 = 0; b1 < getChildCount(); b1++) {
        View view = getChildAt(b1);
        if (!view.equals(this.x)) {
          this.d = view;
          break;
        } 
      }  
  }
  
  private void f(float paramFloat) {
    if (paramFloat > this.h) {
      r(true, true);
    } else {
      this.f = false;
      this.E.j(0.0F, 0.0F);
      e e = null;
      if (!this.u)
        e = new e(this); 
      b(this.p, e);
      this.E.d(false);
    } 
  }
  
  private boolean g(Animation paramAnimation) {
    boolean bool;
    if (paramAnimation != null && paramAnimation.hasStarted() && !paramAnimation.hasEnded()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void n(float paramFloat) {
    this.E.d(true);
    float f1 = Math.min(1.0F, Math.abs(paramFloat / this.h));
    double d1 = f1;
    Double.isNaN(d1);
    float f2 = (float)Math.max(d1 - 0.4D, 0.0D) * 5.0F / 3.0F;
    float f3 = Math.abs(paramFloat);
    float f4 = this.h;
    int m = this.D;
    if (m <= 0)
      if (this.M) {
        m = this.C - this.B;
      } else {
        m = this.C;
      }  
    float f5 = m;
    d1 = (Math.max(0.0F, Math.min(f3 - f4, f5 * 2.0F) / f5) / 4.0F);
    double d2 = Math.pow(d1, 2.0D);
    Double.isNaN(d1);
    f4 = (float)(d1 - d2) * 2.0F;
    int n = this.B;
    m = (int)(f5 * f1 + f5 * f4 * 2.0F);
    if (this.x.getVisibility() != 0)
      this.x.setVisibility(0); 
    if (!this.u) {
      this.x.setScaleX(1.0F);
      this.x.setScaleY(1.0F);
    } 
    if (this.u)
      setAnimationProgress(Math.min(1.0F, paramFloat / this.h)); 
    if (paramFloat < this.h) {
      if (this.E.getAlpha() > 76 && !g(this.H))
        v(); 
    } else if (this.E.getAlpha() < 255 && !g(this.I)) {
      u();
    } 
    this.E.j(0.0F, Math.min(0.8F, f2 * 0.8F));
    this.E.e(Math.min(1.0F, f2));
    this.E.g((f2 * 0.4F - 0.25F + f4 * 2.0F) * 0.5F);
    setTargetOffsetTopAndBottom(n + m - this.p);
  }
  
  private void p(MotionEvent paramMotionEvent) {
    int m = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(m) == this.t) {
      if (m == 0) {
        m = 1;
      } else {
        m = 0;
      } 
      this.t = paramMotionEvent.getPointerId(m);
    } 
  }
  
  private void r(boolean paramBoolean1, boolean paramBoolean2) {
    if (this.f != paramBoolean1) {
      this.K = paramBoolean2;
      e();
      this.f = paramBoolean1;
      if (paramBoolean1) {
        a(this.p, this.O);
      } else {
        w(this.O);
      } 
    } 
  }
  
  private Animation s(int paramInt1, int paramInt2) {
    d d = new d(this, paramInt1, paramInt2);
    d.setDuration(300L);
    this.x.b(null);
    this.x.clearAnimation();
    this.x.startAnimation(d);
    return d;
  }
  
  private void setColorViewAlpha(int paramInt) {
    this.x.getBackground().setAlpha(paramInt);
    this.E.setAlpha(paramInt);
  }
  
  private void t(float paramFloat) {
    float f = this.r;
    int m = this.g;
    if (paramFloat - f > m && !this.s) {
      this.q = f + m;
      this.s = true;
      this.E.setAlpha(76);
    } 
  }
  
  private void u() {
    this.I = s(this.E.getAlpha(), 255);
  }
  
  private void v() {
    this.H = s(this.E.getAlpha(), 76);
  }
  
  private void x(int paramInt, Animation.AnimationListener paramAnimationListener) {
    this.z = paramInt;
    this.A = this.x.getScaleX();
    h h = new h(this);
    this.J = h;
    h.setDuration(150L);
    if (paramAnimationListener != null)
      this.x.b(paramAnimationListener); 
    this.x.clearAnimation();
    this.x.startAnimation(this.J);
  }
  
  private void y(Animation.AnimationListener paramAnimationListener) {
    this.x.setVisibility(0);
    this.E.setAlpha(255);
    b b1 = new b(this);
    this.F = b1;
    b1.setDuration(this.o);
    if (paramAnimationListener != null)
      this.x.b(paramAnimationListener); 
    this.x.clearAnimation();
    this.x.startAnimation(this.F);
  }
  
  public boolean c() {
    i i1 = this.N;
    if (i1 != null)
      return i1.a(this, this.d); 
    View view = this.d;
    return (view instanceof ListView) ? androidx.core.widget.g.a((ListView)view, -1) : view.canScrollVertically(-1);
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    return this.k.a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2) {
    return this.k.b(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    return this.k.c(paramInt1, paramInt2, paramArrayOfint1, paramArrayOfint2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) {
    return this.k.f(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfint);
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2) {
    int m = this.y;
    if (m < 0)
      return paramInt2; 
    if (paramInt2 == paramInt1 - 1)
      return m; 
    paramInt1 = paramInt2;
    if (paramInt2 >= m)
      paramInt1 = paramInt2 + 1; 
    return paramInt1;
  }
  
  public int getNestedScrollAxes() {
    return this.j.a();
  }
  
  public int getProgressCircleDiameter() {
    return this.L;
  }
  
  public int getProgressViewEndOffset() {
    return this.C;
  }
  
  public int getProgressViewStartOffset() {
    return this.B;
  }
  
  public boolean hasNestedScrollingParent() {
    return this.k.j();
  }
  
  public boolean isNestedScrollingEnabled() {
    return this.k.l();
  }
  
  void o(float paramFloat) {
    int m = this.z;
    setTargetOffsetTopAndBottom(m + (int)((this.B - m) * paramFloat) - this.x.getTop());
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    q();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    e();
    int m = paramMotionEvent.getActionMasked();
    if (this.v && m == 0)
      this.v = false; 
    if (!isEnabled() || this.v || c() || this.f || this.n)
      return false; 
    if (m != 0) {
      if (m != 1)
        if (m != 2) {
          if (m != 3) {
            if (m == 6)
              p(paramMotionEvent); 
            return this.s;
          } 
        } else {
          m = this.t;
          if (m == -1) {
            Log.e(b, "Got ACTION_MOVE event but don't have an active pointer id.");
            return false;
          } 
          m = paramMotionEvent.findPointerIndex(m);
          if (m < 0)
            return false; 
          t(paramMotionEvent.getY(m));
          return this.s;
        }  
      this.s = false;
      this.t = -1;
    } else {
      setTargetOffsetTopAndBottom(this.B - this.x.getTop());
      m = paramMotionEvent.getPointerId(0);
      this.t = m;
      this.s = false;
      m = paramMotionEvent.findPointerIndex(m);
      if (m < 0)
        return false; 
      this.r = paramMotionEvent.getY(m);
    } 
    return this.s;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt2 = getMeasuredWidth();
    paramInt4 = getMeasuredHeight();
    if (getChildCount() == 0)
      return; 
    if (this.d == null)
      e(); 
    View view = this.d;
    if (view == null)
      return; 
    paramInt1 = getPaddingLeft();
    paramInt3 = getPaddingTop();
    view.layout(paramInt1, paramInt3, paramInt2 - getPaddingLeft() - getPaddingRight() + paramInt1, paramInt4 - getPaddingTop() - getPaddingBottom() + paramInt3);
    paramInt3 = this.x.getMeasuredWidth();
    paramInt1 = this.x.getMeasuredHeight();
    a a1 = this.x;
    paramInt2 /= 2;
    paramInt3 /= 2;
    paramInt4 = this.p;
    a1.layout(paramInt2 - paramInt3, paramInt4, paramInt2 + paramInt3, paramInt1 + paramInt4);
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    if (this.d == null)
      e(); 
    View view = this.d;
    if (view == null)
      return; 
    view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 1073741824));
    this.x.measure(View.MeasureSpec.makeMeasureSpec(this.L, 1073741824), View.MeasureSpec.makeMeasureSpec(this.L, 1073741824));
    this.y = -1;
    for (paramInt1 = 0; paramInt1 < getChildCount(); paramInt1++) {
      if (getChildAt(paramInt1) == this.x) {
        this.y = paramInt1;
        break;
      } 
    } 
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    return dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2) {
    return dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    if (paramInt2 > 0) {
      float f = this.i;
      if (f > 0.0F) {
        float f1 = paramInt2;
        if (f1 > f) {
          paramArrayOfint[1] = paramInt2 - (int)f;
          this.i = 0.0F;
        } else {
          this.i = f - f1;
          paramArrayOfint[1] = paramInt2;
        } 
        n(this.i);
      } 
    } 
    if (this.M && paramInt2 > 0 && this.i == 0.0F && Math.abs(paramInt2 - paramArrayOfint[1]) > 0)
      this.x.setVisibility(8); 
    int[] arrayOfInt = this.l;
    if (dispatchNestedPreScroll(paramInt1 - paramArrayOfint[0], paramInt2 - paramArrayOfint[1], arrayOfInt, null)) {
      paramArrayOfint[0] = paramArrayOfint[0] + arrayOfInt[0];
      paramArrayOfint[1] = paramArrayOfint[1] + arrayOfInt[1];
    } 
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, this.m);
    paramInt1 = paramInt4 + this.m[1];
    if (paramInt1 < 0 && !c()) {
      float f = this.i + Math.abs(paramInt1);
      this.i = f;
      n(f);
    } 
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt) {
    this.j.b(paramView1, paramView2, paramInt);
    startNestedScroll(paramInt & 0x2);
    this.i = 0.0F;
    this.n = true;
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt) {
    boolean bool;
    if (isEnabled() && !this.v && !this.f && (paramInt & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void onStopNestedScroll(View paramView) {
    this.j.d(paramView);
    this.n = false;
    float f = this.i;
    if (f > 0.0F) {
      f(f);
      this.i = 0.0F;
    } 
    stopNestedScroll();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    int m = paramMotionEvent.getActionMasked();
    if (this.v && m == 0)
      this.v = false; 
    if (!isEnabled() || this.v || c() || this.f || this.n)
      return false; 
    if (m != 0) {
      if (m != 1) {
        if (m != 2) {
          if (m != 3) {
            if (m != 5) {
              if (m == 6)
                p(paramMotionEvent); 
            } else {
              m = paramMotionEvent.getActionIndex();
              if (m < 0) {
                Log.e(b, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                return false;
              } 
              this.t = paramMotionEvent.getPointerId(m);
            } 
          } else {
            return false;
          } 
        } else {
          m = paramMotionEvent.findPointerIndex(this.t);
          if (m < 0) {
            Log.e(b, "Got ACTION_MOVE event but have an invalid active pointer id.");
            return false;
          } 
          float f = paramMotionEvent.getY(m);
          t(f);
          if (this.s) {
            f = (f - this.q) * 0.5F;
            if (f > 0.0F) {
              n(f);
            } else {
              return false;
            } 
          } 
        } 
      } else {
        m = paramMotionEvent.findPointerIndex(this.t);
        if (m < 0) {
          Log.e(b, "Got ACTION_UP event but don't have an active pointer id.");
          return false;
        } 
        if (this.s) {
          float f1 = paramMotionEvent.getY(m);
          float f2 = this.q;
          this.s = false;
          f((f1 - f2) * 0.5F);
        } 
        this.t = -1;
        return false;
      } 
    } else {
      this.t = paramMotionEvent.getPointerId(0);
      this.s = false;
    } 
    return true;
  }
  
  void q() {
    this.x.clearAnimation();
    this.E.stop();
    this.x.setVisibility(8);
    setColorViewAlpha(255);
    if (this.u) {
      setAnimationProgress(0.0F);
    } else {
      setTargetOffsetTopAndBottom(this.B - this.p);
    } 
    this.p = this.x.getTop();
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 21 || !(this.d instanceof android.widget.AbsListView)) {
      View view = this.d;
      if (view == null || w.W(view))
        super.requestDisallowInterceptTouchEvent(paramBoolean); 
    } 
  }
  
  void setAnimationProgress(float paramFloat) {
    this.x.setScaleX(paramFloat);
    this.x.setScaleY(paramFloat);
  }
  
  @Deprecated
  public void setColorScheme(int... paramVarArgs) {
    setColorSchemeResources(paramVarArgs);
  }
  
  public void setColorSchemeColors(int... paramVarArgs) {
    e();
    this.E.f(paramVarArgs);
  }
  
  public void setColorSchemeResources(int... paramVarArgs) {
    Context context = getContext();
    int[] arrayOfInt = new int[paramVarArgs.length];
    for (byte b1 = 0; b1 < paramVarArgs.length; b1++)
      arrayOfInt[b1] = androidx.core.content.a.d(context, paramVarArgs[b1]); 
    setColorSchemeColors(arrayOfInt);
  }
  
  public void setDistanceToTriggerSync(int paramInt) {
    this.h = paramInt;
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    if (!paramBoolean)
      q(); 
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean) {
    this.k.m(paramBoolean);
  }
  
  public void setOnChildScrollUpCallback(i parami) {
    this.N = parami;
  }
  
  public void setOnRefreshListener(j paramj) {
    this.e = paramj;
  }
  
  @Deprecated
  public void setProgressBackgroundColor(int paramInt) {
    setProgressBackgroundColorSchemeResource(paramInt);
  }
  
  public void setProgressBackgroundColorSchemeColor(int paramInt) {
    this.x.setBackgroundColor(paramInt);
  }
  
  public void setProgressBackgroundColorSchemeResource(int paramInt) {
    setProgressBackgroundColorSchemeColor(androidx.core.content.a.d(getContext(), paramInt));
  }
  
  public void setProgressViewEndTarget(boolean paramBoolean, int paramInt) {
    this.C = paramInt;
    this.u = paramBoolean;
    this.x.invalidate();
  }
  
  public void setProgressViewOffset(boolean paramBoolean, int paramInt1, int paramInt2) {
    this.u = paramBoolean;
    this.B = paramInt1;
    this.C = paramInt2;
    this.M = true;
    q();
    this.f = false;
  }
  
  public void setRefreshing(boolean paramBoolean) {
    if (paramBoolean && this.f != paramBoolean) {
      int m;
      this.f = paramBoolean;
      if (!this.M) {
        m = this.C + this.B;
      } else {
        m = this.C;
      } 
      setTargetOffsetTopAndBottom(m - this.p);
      this.K = false;
      y(this.O);
    } else {
      r(paramBoolean, false);
    } 
  }
  
  public void setSize(int paramInt) {
    if (paramInt != 0 && paramInt != 1)
      return; 
    DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
    if (paramInt == 0) {
      this.L = (int)(displayMetrics.density * 56.0F);
    } else {
      this.L = (int)(displayMetrics.density * 40.0F);
    } 
    this.x.setImageDrawable(null);
    this.E.l(paramInt);
    this.x.setImageDrawable(this.E);
  }
  
  public void setSlingshotDistance(int paramInt) {
    this.D = paramInt;
  }
  
  void setTargetOffsetTopAndBottom(int paramInt) {
    this.x.bringToFront();
    w.b0((View)this.x, paramInt);
    this.p = this.x.getTop();
  }
  
  public boolean startNestedScroll(int paramInt) {
    return this.k.o(paramInt);
  }
  
  public void stopNestedScroll() {
    this.k.q();
  }
  
  void w(Animation.AnimationListener paramAnimationListener) {
    c c = new c(this);
    this.G = c;
    c.setDuration(150L);
    this.x.b(paramAnimationListener);
    this.x.clearAnimation();
    this.x.startAnimation(this.G);
  }
  
  class a implements Animation.AnimationListener {
    a(SwipeRefreshLayout this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      SwipeRefreshLayout swipeRefreshLayout = this.a;
      if (swipeRefreshLayout.f) {
        swipeRefreshLayout.E.setAlpha(255);
        this.a.E.start();
        swipeRefreshLayout = this.a;
        if (swipeRefreshLayout.K) {
          SwipeRefreshLayout.j j = swipeRefreshLayout.e;
          if (j != null)
            j.a(); 
        } 
        swipeRefreshLayout = this.a;
        swipeRefreshLayout.p = swipeRefreshLayout.x.getTop();
      } else {
        swipeRefreshLayout.q();
      } 
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class b extends Animation {
    b(SwipeRefreshLayout this$0) {}
    
    public void applyTransformation(float param1Float, Transformation param1Transformation) {
      this.b.setAnimationProgress(param1Float);
    }
  }
  
  class c extends Animation {
    c(SwipeRefreshLayout this$0) {}
    
    public void applyTransformation(float param1Float, Transformation param1Transformation) {
      this.b.setAnimationProgress(1.0F - param1Float);
    }
  }
  
  class d extends Animation {
    d(SwipeRefreshLayout this$0, int param1Int1, int param1Int2) {}
    
    public void applyTransformation(float param1Float, Transformation param1Transformation) {
      b b = this.d.E;
      int i = this.b;
      b.setAlpha((int)(i + (this.c - i) * param1Float));
    }
  }
  
  class e implements Animation.AnimationListener {
    e(SwipeRefreshLayout this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      SwipeRefreshLayout swipeRefreshLayout = this.a;
      if (!swipeRefreshLayout.u)
        swipeRefreshLayout.w(null); 
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class f extends Animation {
    f(SwipeRefreshLayout this$0) {}
    
    public void applyTransformation(float param1Float, Transformation param1Transformation) {
      SwipeRefreshLayout swipeRefreshLayout = this.b;
      if (!swipeRefreshLayout.M) {
        i = swipeRefreshLayout.C - Math.abs(swipeRefreshLayout.B);
      } else {
        i = swipeRefreshLayout.C;
      } 
      swipeRefreshLayout = this.b;
      int j = swipeRefreshLayout.z;
      int i = (int)((i - j) * param1Float);
      int k = swipeRefreshLayout.x.getTop();
      this.b.setTargetOffsetTopAndBottom(j + i - k);
      this.b.E.e(1.0F - param1Float);
    }
  }
  
  class g extends Animation {
    g(SwipeRefreshLayout this$0) {}
    
    public void applyTransformation(float param1Float, Transformation param1Transformation) {
      this.b.o(param1Float);
    }
  }
  
  class h extends Animation {
    h(SwipeRefreshLayout this$0) {}
    
    public void applyTransformation(float param1Float, Transformation param1Transformation) {
      SwipeRefreshLayout swipeRefreshLayout = this.b;
      float f = swipeRefreshLayout.A;
      swipeRefreshLayout.setAnimationProgress(f + -f * param1Float);
      this.b.o(param1Float);
    }
  }
  
  public static interface i {
    boolean a(SwipeRefreshLayout param1SwipeRefreshLayout, View param1View);
  }
  
  public static interface j {
    void a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/swiperefreshlayout/widget/SwipeRefreshLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */