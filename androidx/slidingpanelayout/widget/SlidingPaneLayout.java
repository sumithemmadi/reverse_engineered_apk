package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.customview.view.AbsSavedState;
import b.h.k.w;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup {
  private int b = -858993460;
  
  private int c;
  
  private Drawable d;
  
  private Drawable e;
  
  private final int f;
  
  private boolean g;
  
  View h;
  
  float i;
  
  private float j;
  
  int k;
  
  boolean l;
  
  private int m;
  
  private float n;
  
  private float o;
  
  private d p;
  
  final b.j.a.c q;
  
  boolean r;
  
  private boolean s = true;
  
  private final Rect t = new Rect();
  
  final ArrayList<b> u = new ArrayList<b>();
  
  private Method v;
  
  private Field w;
  
  private boolean x;
  
  public SlidingPaneLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    float f = (paramContext.getResources().getDisplayMetrics()).density;
    this.f = (int)(32.0F * f + 0.5F);
    setWillNotDraw(false);
    w.r0((View)this, new a(this));
    w.B0((View)this, 1);
    b.j.a.c c1 = b.j.a.c.o(this, 0.5F, new c(this));
    this.q = c1;
    c1.M(f * 400.0F);
  }
  
  private boolean b(View paramView, int paramInt) {
    if (this.s || q(0.0F, paramInt)) {
      this.r = false;
      return true;
    } 
    return false;
  }
  
  private void c(View paramView, float paramFloat, int paramInt) {
    LayoutParams layoutParams = (LayoutParams)paramView.getLayoutParams();
    if (paramFloat > 0.0F && paramInt != 0) {
      int i = (int)(((0xFF000000 & paramInt) >>> 24) * paramFloat);
      if (layoutParams.e == null)
        layoutParams.e = new Paint(); 
      layoutParams.e.setColorFilter((ColorFilter)new PorterDuffColorFilter(i << 24 | paramInt & 0xFFFFFF, PorterDuff.Mode.SRC_OVER));
      if (paramView.getLayerType() != 2)
        paramView.setLayerType(2, layoutParams.e); 
      g(paramView);
    } else if (paramView.getLayerType() != 0) {
      Paint paint = layoutParams.e;
      if (paint != null)
        paint.setColorFilter(null); 
      b b = new b(this, paramView);
      this.u.add(b);
      w.j0((View)this, b);
    } 
  }
  
  private boolean n(View paramView, int paramInt) {
    if (this.s || q(1.0F, paramInt)) {
      this.r = true;
      return true;
    } 
    return false;
  }
  
  private void o(float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual i : ()Z
    //   4: istore_2
    //   5: aload_0
    //   6: getfield h : Landroid/view/View;
    //   9: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   12: checkcast androidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams
    //   15: astore_3
    //   16: aload_3
    //   17: getfield d : Z
    //   20: istore #4
    //   22: iconst_0
    //   23: istore #5
    //   25: iload #4
    //   27: ifeq -> 60
    //   30: iload_2
    //   31: ifeq -> 43
    //   34: aload_3
    //   35: getfield rightMargin : I
    //   38: istore #6
    //   40: goto -> 49
    //   43: aload_3
    //   44: getfield leftMargin : I
    //   47: istore #6
    //   49: iload #6
    //   51: ifgt -> 60
    //   54: iconst_1
    //   55: istore #6
    //   57: goto -> 63
    //   60: iconst_0
    //   61: istore #6
    //   63: aload_0
    //   64: invokevirtual getChildCount : ()I
    //   67: istore #7
    //   69: iload #5
    //   71: iload #7
    //   73: if_icmpge -> 201
    //   76: aload_0
    //   77: iload #5
    //   79: invokevirtual getChildAt : (I)Landroid/view/View;
    //   82: astore_3
    //   83: aload_3
    //   84: aload_0
    //   85: getfield h : Landroid/view/View;
    //   88: if_acmpne -> 94
    //   91: goto -> 195
    //   94: aload_0
    //   95: getfield j : F
    //   98: fstore #8
    //   100: aload_0
    //   101: getfield m : I
    //   104: istore #9
    //   106: fconst_1
    //   107: fload #8
    //   109: fsub
    //   110: iload #9
    //   112: i2f
    //   113: fmul
    //   114: f2i
    //   115: istore #10
    //   117: aload_0
    //   118: fload_1
    //   119: putfield j : F
    //   122: iload #10
    //   124: fconst_1
    //   125: fload_1
    //   126: fsub
    //   127: iload #9
    //   129: i2f
    //   130: fmul
    //   131: f2i
    //   132: isub
    //   133: istore #9
    //   135: iload #9
    //   137: istore #10
    //   139: iload_2
    //   140: ifeq -> 148
    //   143: iload #9
    //   145: ineg
    //   146: istore #10
    //   148: aload_3
    //   149: iload #10
    //   151: invokevirtual offsetLeftAndRight : (I)V
    //   154: iload #6
    //   156: ifeq -> 195
    //   159: aload_0
    //   160: getfield j : F
    //   163: fstore #8
    //   165: iload_2
    //   166: ifeq -> 178
    //   169: fload #8
    //   171: fconst_1
    //   172: fsub
    //   173: fstore #8
    //   175: goto -> 184
    //   178: fconst_1
    //   179: fload #8
    //   181: fsub
    //   182: fstore #8
    //   184: aload_0
    //   185: aload_3
    //   186: fload #8
    //   188: aload_0
    //   189: getfield c : I
    //   192: invokespecial c : (Landroid/view/View;FI)V
    //   195: iinc #5, 1
    //   198: goto -> 69
    //   201: return
  }
  
  private static boolean s(View paramView) {
    boolean bool = paramView.isOpaque();
    boolean bool1 = true;
    if (bool)
      return true; 
    if (Build.VERSION.SDK_INT >= 18)
      return false; 
    Drawable drawable = paramView.getBackground();
    if (drawable != null) {
      if (drawable.getOpacity() != -1)
        bool1 = false; 
      return bool1;
    } 
    return false;
  }
  
  public boolean a() {
    return b(this.h, 0);
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
    if (this.q.n(true)) {
      if (!this.g) {
        this.q.a();
        return;
      } 
      w.h0((View)this);
    } 
  }
  
  void d(View paramView) {
    d d1 = this.p;
    if (d1 != null)
      d1.c(paramView); 
    sendAccessibilityEvent(32);
  }
  
  public void draw(Canvas paramCanvas) {
    Drawable drawable;
    View view;
    super.draw(paramCanvas);
    if (i()) {
      drawable = this.e;
    } else {
      drawable = this.d;
    } 
    if (getChildCount() > 1) {
      view = getChildAt(1);
    } else {
      view = null;
    } 
    if (view != null && drawable != null) {
      int m;
      int n;
      int i = view.getTop();
      int j = view.getBottom();
      int k = drawable.getIntrinsicWidth();
      if (i()) {
        m = view.getRight();
        n = k + m;
      } else {
        m = view.getLeft();
        n = m;
        m -= k;
      } 
      drawable.setBounds(m, i, n, j);
      drawable.draw(paramCanvas);
    } 
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong) {
    LayoutParams layoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = paramCanvas.save();
    if (this.g && !layoutParams.c && this.h != null) {
      paramCanvas.getClipBounds(this.t);
      if (i()) {
        Rect rect = this.t;
        rect.left = Math.max(rect.left, this.h.getRight());
      } else {
        Rect rect = this.t;
        rect.right = Math.min(rect.right, this.h.getLeft());
      } 
      paramCanvas.clipRect(this.t);
    } 
    boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
    paramCanvas.restoreToCount(i);
    return bool;
  }
  
  void e(View paramView) {
    d d1 = this.p;
    if (d1 != null)
      d1.b(paramView); 
    sendAccessibilityEvent(32);
  }
  
  void f(View paramView) {
    d d1 = this.p;
    if (d1 != null)
      d1.a(paramView, this.i); 
  }
  
  void g(View paramView) {
    // Byte code:
    //   0: getstatic android/os/Build$VERSION.SDK_INT : I
    //   3: istore_2
    //   4: iload_2
    //   5: bipush #17
    //   7: if_icmplt -> 25
    //   10: aload_1
    //   11: aload_1
    //   12: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   15: checkcast androidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams
    //   18: getfield e : Landroid/graphics/Paint;
    //   21: invokestatic D0 : (Landroid/view/View;Landroid/graphics/Paint;)V
    //   24: return
    //   25: iload_2
    //   26: bipush #16
    //   28: if_icmplt -> 163
    //   31: aload_0
    //   32: getfield x : Z
    //   35: ifne -> 105
    //   38: aload_0
    //   39: ldc android/view/View
    //   41: ldc_w 'getDisplayList'
    //   44: aconst_null
    //   45: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   48: putfield v : Ljava/lang/reflect/Method;
    //   51: goto -> 66
    //   54: astore_3
    //   55: ldc_w 'SlidingPaneLayout'
    //   58: ldc_w 'Couldn't fetch getDisplayList method; dimming won't work right.'
    //   61: aload_3
    //   62: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   65: pop
    //   66: ldc android/view/View
    //   68: ldc_w 'mRecreateDisplayList'
    //   71: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   74: astore_3
    //   75: aload_0
    //   76: aload_3
    //   77: putfield w : Ljava/lang/reflect/Field;
    //   80: aload_3
    //   81: iconst_1
    //   82: invokevirtual setAccessible : (Z)V
    //   85: goto -> 100
    //   88: astore_3
    //   89: ldc_w 'SlidingPaneLayout'
    //   92: ldc_w 'Couldn't fetch mRecreateDisplayList field; dimming will be slow.'
    //   95: aload_3
    //   96: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   99: pop
    //   100: aload_0
    //   101: iconst_1
    //   102: putfield x : Z
    //   105: aload_0
    //   106: getfield v : Ljava/lang/reflect/Method;
    //   109: ifnull -> 158
    //   112: aload_0
    //   113: getfield w : Ljava/lang/reflect/Field;
    //   116: astore_3
    //   117: aload_3
    //   118: ifnonnull -> 124
    //   121: goto -> 158
    //   124: aload_3
    //   125: aload_1
    //   126: iconst_1
    //   127: invokevirtual setBoolean : (Ljava/lang/Object;Z)V
    //   130: aload_0
    //   131: getfield v : Ljava/lang/reflect/Method;
    //   134: aload_1
    //   135: aconst_null
    //   136: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   139: pop
    //   140: goto -> 163
    //   143: astore_3
    //   144: ldc_w 'SlidingPaneLayout'
    //   147: ldc_w 'Error refreshing display list state'
    //   150: aload_3
    //   151: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   154: pop
    //   155: goto -> 163
    //   158: aload_1
    //   159: invokevirtual invalidate : ()V
    //   162: return
    //   163: aload_0
    //   164: aload_1
    //   165: invokevirtual getLeft : ()I
    //   168: aload_1
    //   169: invokevirtual getTop : ()I
    //   172: aload_1
    //   173: invokevirtual getRight : ()I
    //   176: aload_1
    //   177: invokevirtual getBottom : ()I
    //   180: invokestatic i0 : (Landroid/view/View;IIII)V
    //   183: return
    // Exception table:
    //   from	to	target	type
    //   38	51	54	java/lang/NoSuchMethodException
    //   66	85	88	java/lang/NoSuchFieldException
    //   124	140	143	java/lang/Exception
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
    return (ViewGroup.LayoutParams)new LayoutParams();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    return (ViewGroup.LayoutParams)new LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    LayoutParams layoutParams;
    if (paramLayoutParams instanceof ViewGroup.MarginLayoutParams) {
      layoutParams = new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    } else {
      layoutParams = new LayoutParams((ViewGroup.LayoutParams)layoutParams);
    } 
    return (ViewGroup.LayoutParams)layoutParams;
  }
  
  public int getCoveredFadeColor() {
    return this.c;
  }
  
  public int getParallaxDistance() {
    return this.m;
  }
  
  public int getSliderFadeColor() {
    return this.b;
  }
  
  boolean h(View paramView) {
    boolean bool1 = false;
    if (paramView == null)
      return false; 
    LayoutParams layoutParams = (LayoutParams)paramView.getLayoutParams();
    boolean bool2 = bool1;
    if (this.g) {
      bool2 = bool1;
      if (layoutParams.d) {
        bool2 = bool1;
        if (this.i > 0.0F)
          bool2 = true; 
      } 
    } 
    return bool2;
  }
  
  boolean i() {
    int i = w.C((View)this);
    boolean bool = true;
    if (i != 1)
      bool = false; 
    return bool;
  }
  
  public boolean j() {
    return (!this.g || this.i == 1.0F);
  }
  
  public boolean k() {
    return this.g;
  }
  
  void l(int paramInt) {
    if (this.h == null) {
      this.i = 0.0F;
      return;
    } 
    boolean bool = i();
    LayoutParams layoutParams = (LayoutParams)this.h.getLayoutParams();
    int i = this.h.getWidth();
    int j = paramInt;
    if (bool)
      j = getWidth() - paramInt - i; 
    if (bool) {
      paramInt = getPaddingRight();
    } else {
      paramInt = getPaddingLeft();
    } 
    if (bool) {
      i = layoutParams.rightMargin;
    } else {
      i = layoutParams.leftMargin;
    } 
    float f = (j - paramInt + i) / this.k;
    this.i = f;
    if (this.m != 0)
      o(f); 
    if (layoutParams.d)
      c(this.h, this.i, this.b); 
    f(this.h);
  }
  
  public boolean m() {
    return n(this.h, 0);
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.s = true;
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    this.s = true;
    int i = this.u.size();
    for (byte b = 0; b < i; b++)
      ((b)this.u.get(b)).run(); 
    this.u.clear();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getActionMasked : ()I
    //   4: istore_2
    //   5: aload_0
    //   6: getfield g : Z
    //   9: istore_3
    //   10: iconst_1
    //   11: istore #4
    //   13: iload_3
    //   14: ifne -> 66
    //   17: iload_2
    //   18: ifne -> 66
    //   21: aload_0
    //   22: invokevirtual getChildCount : ()I
    //   25: iconst_1
    //   26: if_icmple -> 66
    //   29: aload_0
    //   30: iconst_1
    //   31: invokevirtual getChildAt : (I)Landroid/view/View;
    //   34: astore #5
    //   36: aload #5
    //   38: ifnull -> 66
    //   41: aload_0
    //   42: aload_0
    //   43: getfield q : Lb/j/a/c;
    //   46: aload #5
    //   48: aload_1
    //   49: invokevirtual getX : ()F
    //   52: f2i
    //   53: aload_1
    //   54: invokevirtual getY : ()F
    //   57: f2i
    //   58: invokevirtual E : (Landroid/view/View;II)Z
    //   61: iconst_1
    //   62: ixor
    //   63: putfield r : Z
    //   66: aload_0
    //   67: getfield g : Z
    //   70: ifeq -> 288
    //   73: aload_0
    //   74: getfield l : Z
    //   77: ifeq -> 87
    //   80: iload_2
    //   81: ifeq -> 87
    //   84: goto -> 288
    //   87: iload_2
    //   88: iconst_3
    //   89: if_icmpeq -> 279
    //   92: iload_2
    //   93: iconst_1
    //   94: if_icmpne -> 100
    //   97: goto -> 279
    //   100: iload_2
    //   101: ifeq -> 184
    //   104: iload_2
    //   105: iconst_2
    //   106: if_icmpeq -> 112
    //   109: goto -> 249
    //   112: aload_1
    //   113: invokevirtual getX : ()F
    //   116: fstore #6
    //   118: aload_1
    //   119: invokevirtual getY : ()F
    //   122: fstore #7
    //   124: fload #6
    //   126: aload_0
    //   127: getfield n : F
    //   130: fsub
    //   131: invokestatic abs : (F)F
    //   134: fstore #6
    //   136: fload #7
    //   138: aload_0
    //   139: getfield o : F
    //   142: fsub
    //   143: invokestatic abs : (F)F
    //   146: fstore #7
    //   148: fload #6
    //   150: aload_0
    //   151: getfield q : Lb/j/a/c;
    //   154: invokevirtual z : ()I
    //   157: i2f
    //   158: fcmpl
    //   159: ifle -> 249
    //   162: fload #7
    //   164: fload #6
    //   166: fcmpl
    //   167: ifle -> 249
    //   170: aload_0
    //   171: getfield q : Lb/j/a/c;
    //   174: invokevirtual b : ()V
    //   177: aload_0
    //   178: iconst_1
    //   179: putfield l : Z
    //   182: iconst_0
    //   183: ireturn
    //   184: aload_0
    //   185: iconst_0
    //   186: putfield l : Z
    //   189: aload_1
    //   190: invokevirtual getX : ()F
    //   193: fstore #6
    //   195: aload_1
    //   196: invokevirtual getY : ()F
    //   199: fstore #7
    //   201: aload_0
    //   202: fload #6
    //   204: putfield n : F
    //   207: aload_0
    //   208: fload #7
    //   210: putfield o : F
    //   213: aload_0
    //   214: getfield q : Lb/j/a/c;
    //   217: aload_0
    //   218: getfield h : Landroid/view/View;
    //   221: fload #6
    //   223: f2i
    //   224: fload #7
    //   226: f2i
    //   227: invokevirtual E : (Landroid/view/View;II)Z
    //   230: ifeq -> 249
    //   233: aload_0
    //   234: aload_0
    //   235: getfield h : Landroid/view/View;
    //   238: invokevirtual h : (Landroid/view/View;)Z
    //   241: ifeq -> 249
    //   244: iconst_1
    //   245: istore_2
    //   246: goto -> 251
    //   249: iconst_0
    //   250: istore_2
    //   251: iload #4
    //   253: istore_3
    //   254: aload_0
    //   255: getfield q : Lb/j/a/c;
    //   258: aload_1
    //   259: invokevirtual O : (Landroid/view/MotionEvent;)Z
    //   262: ifne -> 277
    //   265: iload_2
    //   266: ifeq -> 275
    //   269: iload #4
    //   271: istore_3
    //   272: goto -> 277
    //   275: iconst_0
    //   276: istore_3
    //   277: iload_3
    //   278: ireturn
    //   279: aload_0
    //   280: getfield q : Lb/j/a/c;
    //   283: invokevirtual b : ()V
    //   286: iconst_0
    //   287: ireturn
    //   288: aload_0
    //   289: getfield q : Lb/j/a/c;
    //   292: invokevirtual b : ()V
    //   295: aload_0
    //   296: aload_1
    //   297: invokespecial onInterceptTouchEvent : (Landroid/view/MotionEvent;)Z
    //   300: ireturn
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual i : ()Z
    //   4: istore #6
    //   6: iload #6
    //   8: ifeq -> 22
    //   11: aload_0
    //   12: getfield q : Lb/j/a/c;
    //   15: iconst_2
    //   16: invokevirtual L : (I)V
    //   19: goto -> 30
    //   22: aload_0
    //   23: getfield q : Lb/j/a/c;
    //   26: iconst_1
    //   27: invokevirtual L : (I)V
    //   30: iload #4
    //   32: iload_2
    //   33: isub
    //   34: istore #7
    //   36: iload #6
    //   38: ifeq -> 49
    //   41: aload_0
    //   42: invokevirtual getPaddingRight : ()I
    //   45: istore_2
    //   46: goto -> 54
    //   49: aload_0
    //   50: invokevirtual getPaddingLeft : ()I
    //   53: istore_2
    //   54: iload #6
    //   56: ifeq -> 68
    //   59: aload_0
    //   60: invokevirtual getPaddingLeft : ()I
    //   63: istore #5
    //   65: goto -> 74
    //   68: aload_0
    //   69: invokevirtual getPaddingRight : ()I
    //   72: istore #5
    //   74: aload_0
    //   75: invokevirtual getPaddingTop : ()I
    //   78: istore #8
    //   80: aload_0
    //   81: invokevirtual getChildCount : ()I
    //   84: istore #9
    //   86: aload_0
    //   87: getfield s : Z
    //   90: ifeq -> 122
    //   93: aload_0
    //   94: getfield g : Z
    //   97: ifeq -> 113
    //   100: aload_0
    //   101: getfield r : Z
    //   104: ifeq -> 113
    //   107: fconst_1
    //   108: fstore #10
    //   110: goto -> 116
    //   113: fconst_0
    //   114: fstore #10
    //   116: aload_0
    //   117: fload #10
    //   119: putfield i : F
    //   122: iload_2
    //   123: istore_3
    //   124: iconst_0
    //   125: istore #11
    //   127: iload #11
    //   129: iload #9
    //   131: if_icmpge -> 424
    //   134: aload_0
    //   135: iload #11
    //   137: invokevirtual getChildAt : (I)Landroid/view/View;
    //   140: astore #12
    //   142: aload #12
    //   144: invokevirtual getVisibility : ()I
    //   147: bipush #8
    //   149: if_icmpne -> 155
    //   152: goto -> 418
    //   155: aload #12
    //   157: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   160: checkcast androidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams
    //   163: astore #13
    //   165: aload #12
    //   167: invokevirtual getMeasuredWidth : ()I
    //   170: istore #14
    //   172: aload #13
    //   174: getfield c : Z
    //   177: ifeq -> 316
    //   180: aload #13
    //   182: getfield leftMargin : I
    //   185: istore #4
    //   187: aload #13
    //   189: getfield rightMargin : I
    //   192: istore #15
    //   194: iload #7
    //   196: iload #5
    //   198: isub
    //   199: istore #16
    //   201: iload_2
    //   202: iload #16
    //   204: aload_0
    //   205: getfield f : I
    //   208: isub
    //   209: invokestatic min : (II)I
    //   212: iload_3
    //   213: isub
    //   214: iload #4
    //   216: iload #15
    //   218: iadd
    //   219: isub
    //   220: istore #15
    //   222: aload_0
    //   223: iload #15
    //   225: putfield k : I
    //   228: iload #6
    //   230: ifeq -> 243
    //   233: aload #13
    //   235: getfield rightMargin : I
    //   238: istore #4
    //   240: goto -> 250
    //   243: aload #13
    //   245: getfield leftMargin : I
    //   248: istore #4
    //   250: iload_3
    //   251: iload #4
    //   253: iadd
    //   254: iload #15
    //   256: iadd
    //   257: iload #14
    //   259: iconst_2
    //   260: idiv
    //   261: iadd
    //   262: iload #16
    //   264: if_icmple -> 272
    //   267: iconst_1
    //   268: istore_1
    //   269: goto -> 274
    //   272: iconst_0
    //   273: istore_1
    //   274: aload #13
    //   276: iload_1
    //   277: putfield d : Z
    //   280: iload #15
    //   282: i2f
    //   283: aload_0
    //   284: getfield i : F
    //   287: fmul
    //   288: f2i
    //   289: istore #16
    //   291: iload_3
    //   292: iload #4
    //   294: iload #16
    //   296: iadd
    //   297: iadd
    //   298: istore_3
    //   299: aload_0
    //   300: iload #16
    //   302: i2f
    //   303: iload #15
    //   305: i2f
    //   306: fdiv
    //   307: putfield i : F
    //   310: iconst_0
    //   311: istore #4
    //   313: goto -> 354
    //   316: aload_0
    //   317: getfield g : Z
    //   320: ifeq -> 349
    //   323: aload_0
    //   324: getfield m : I
    //   327: istore_3
    //   328: iload_3
    //   329: ifeq -> 349
    //   332: fconst_1
    //   333: aload_0
    //   334: getfield i : F
    //   337: fsub
    //   338: iload_3
    //   339: i2f
    //   340: fmul
    //   341: f2i
    //   342: istore #4
    //   344: iload_2
    //   345: istore_3
    //   346: goto -> 354
    //   349: iload_2
    //   350: istore_3
    //   351: iconst_0
    //   352: istore #4
    //   354: iload #6
    //   356: ifeq -> 378
    //   359: iload #7
    //   361: iload_3
    //   362: isub
    //   363: iload #4
    //   365: iadd
    //   366: istore #15
    //   368: iload #15
    //   370: iload #14
    //   372: isub
    //   373: istore #4
    //   375: goto -> 391
    //   378: iload_3
    //   379: iload #4
    //   381: isub
    //   382: istore #4
    //   384: iload #4
    //   386: iload #14
    //   388: iadd
    //   389: istore #15
    //   391: aload #12
    //   393: iload #4
    //   395: iload #8
    //   397: iload #15
    //   399: aload #12
    //   401: invokevirtual getMeasuredHeight : ()I
    //   404: iload #8
    //   406: iadd
    //   407: invokevirtual layout : (IIII)V
    //   410: iload_2
    //   411: aload #12
    //   413: invokevirtual getWidth : ()I
    //   416: iadd
    //   417: istore_2
    //   418: iinc #11, 1
    //   421: goto -> 127
    //   424: aload_0
    //   425: getfield s : Z
    //   428: ifeq -> 524
    //   431: aload_0
    //   432: getfield g : Z
    //   435: ifeq -> 488
    //   438: aload_0
    //   439: getfield m : I
    //   442: ifeq -> 453
    //   445: aload_0
    //   446: aload_0
    //   447: getfield i : F
    //   450: invokespecial o : (F)V
    //   453: aload_0
    //   454: getfield h : Landroid/view/View;
    //   457: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   460: checkcast androidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams
    //   463: getfield d : Z
    //   466: ifeq -> 516
    //   469: aload_0
    //   470: aload_0
    //   471: getfield h : Landroid/view/View;
    //   474: aload_0
    //   475: getfield i : F
    //   478: aload_0
    //   479: getfield b : I
    //   482: invokespecial c : (Landroid/view/View;FI)V
    //   485: goto -> 516
    //   488: iconst_0
    //   489: istore_2
    //   490: iload_2
    //   491: iload #9
    //   493: if_icmpge -> 516
    //   496: aload_0
    //   497: aload_0
    //   498: iload_2
    //   499: invokevirtual getChildAt : (I)Landroid/view/View;
    //   502: fconst_0
    //   503: aload_0
    //   504: getfield b : I
    //   507: invokespecial c : (Landroid/view/View;FI)V
    //   510: iinc #2, 1
    //   513: goto -> 490
    //   516: aload_0
    //   517: aload_0
    //   518: getfield h : Landroid/view/View;
    //   521: invokevirtual r : (Landroid/view/View;)V
    //   524: aload_0
    //   525: iconst_0
    //   526: putfield s : Z
    //   529: return
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    int m;
    int n;
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    int k = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (i != 1073741824) {
      if (isInEditMode()) {
        if (i == Integer.MIN_VALUE) {
          m = j;
          n = k;
          paramInt1 = paramInt2;
        } else {
          m = j;
          n = k;
          paramInt1 = paramInt2;
          if (i == 0) {
            m = 300;
            n = k;
            paramInt1 = paramInt2;
          } 
        } 
      } else {
        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
      } 
    } else {
      m = j;
      n = k;
      paramInt1 = paramInt2;
      if (k == 0)
        if (isInEditMode()) {
          m = j;
          n = k;
          paramInt1 = paramInt2;
          if (k == 0) {
            n = Integer.MIN_VALUE;
            paramInt1 = 300;
            m = j;
          } 
        } else {
          throw new IllegalStateException("Height must not be UNSPECIFIED");
        }  
    } 
    if (n != Integer.MIN_VALUE) {
      if (n != 1073741824) {
        paramInt1 = 0;
        paramInt2 = 0;
      } else {
        paramInt1 = paramInt1 - getPaddingTop() - getPaddingBottom();
        paramInt2 = paramInt1;
      } 
    } else {
      paramInt2 = paramInt1 - getPaddingTop() - getPaddingBottom();
      paramInt1 = 0;
    } 
    int i1 = m - getPaddingLeft() - getPaddingRight();
    int i2 = getChildCount();
    if (i2 > 2)
      Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported."); 
    this.h = null;
    i = i1;
    int i3 = 0;
    int i4 = 0;
    float f = 0.0F;
    for (j = paramInt1; i3 < i2; j = paramInt1) {
      byte b;
      View view = getChildAt(i3);
      LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
      if (view.getVisibility() == 8) {
        layoutParams.d = false;
        paramInt1 = j;
        continue;
      } 
      float f1 = layoutParams.b;
      float f2 = f;
      if (f1 > 0.0F) {
        f += f1;
        f2 = f;
        if (layoutParams.width == 0) {
          paramInt1 = j;
          continue;
        } 
      } 
      paramInt1 = layoutParams.leftMargin + layoutParams.rightMargin;
      k = layoutParams.width;
      if (k == -2) {
        paramInt1 = View.MeasureSpec.makeMeasureSpec(i1 - paramInt1, -2147483648);
      } else if (k == -1) {
        paramInt1 = View.MeasureSpec.makeMeasureSpec(i1 - paramInt1, 1073741824);
      } else {
        paramInt1 = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
      } 
      k = layoutParams.height;
      if (k == -2) {
        k = View.MeasureSpec.makeMeasureSpec(paramInt2, -2147483648);
      } else if (k == -1) {
        k = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
      } else {
        k = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
      } 
      view.measure(paramInt1, k);
      k = view.getMeasuredWidth();
      int i5 = view.getMeasuredHeight();
      paramInt1 = j;
      if (n == Integer.MIN_VALUE) {
        paramInt1 = j;
        if (i5 > j)
          paramInt1 = Math.min(i5, paramInt2); 
      } 
      i -= k;
      if (i < 0) {
        b = 1;
      } else {
        b = 0;
      } 
      layoutParams.c = b;
      i4 |= b;
      if (b != 0)
        this.h = view; 
      f = f2;
      continue;
      i3++;
    } 
    if (i4 != 0 || f > 0.0F) {
      n = i1 - this.f;
      for (k = 0; k < i2; k++) {
        View view = getChildAt(k);
        if (view.getVisibility() != 8) {
          LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
          if (view.getVisibility() != 8) {
            if (layoutParams.width == 0 && layoutParams.b > 0.0F) {
              paramInt1 = 1;
            } else {
              paramInt1 = 0;
            } 
            if (paramInt1 != 0) {
              i3 = 0;
            } else {
              i3 = view.getMeasuredWidth();
            } 
            if (i4 != 0 && view != this.h) {
              if (layoutParams.width < 0 && (i3 > n || layoutParams.b > 0.0F)) {
                if (paramInt1 != 0) {
                  paramInt1 = layoutParams.height;
                  if (paramInt1 == -2) {
                    paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt2, -2147483648);
                  } else if (paramInt1 == -1) {
                    paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
                  } else {
                    paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
                  } 
                } else {
                  paramInt1 = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824);
                } 
                view.measure(View.MeasureSpec.makeMeasureSpec(n, 1073741824), paramInt1);
              } 
            } else if (layoutParams.b > 0.0F) {
              if (layoutParams.width == 0) {
                paramInt1 = layoutParams.height;
                if (paramInt1 == -2) {
                  paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt2, -2147483648);
                } else if (paramInt1 == -1) {
                  paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
                } else {
                  paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
                } 
              } else {
                paramInt1 = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824);
              } 
              if (i4 != 0) {
                int i5 = i1 - layoutParams.leftMargin + layoutParams.rightMargin;
                int i6 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                if (i3 != i5)
                  view.measure(i6, paramInt1); 
              } else {
                int i5 = Math.max(0, i);
                view.measure(View.MeasureSpec.makeMeasureSpec(i3 + (int)(layoutParams.b * i5 / f), 1073741824), paramInt1);
              } 
            } 
          } 
        } 
      } 
    } 
    setMeasuredDimension(m, j + getPaddingTop() + getPaddingBottom());
    this.g = i4;
    if (this.q.A() != 0 && i4 == 0)
      this.q.a(); 
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof SavedState)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    SavedState savedState = (SavedState)paramParcelable;
    super.onRestoreInstanceState(savedState.a());
    if (savedState.d) {
      m();
    } else {
      a();
    } 
    this.r = savedState.d;
  }
  
  protected Parcelable onSaveInstanceState() {
    boolean bool;
    SavedState savedState = new SavedState(super.onSaveInstanceState());
    if (k()) {
      bool = j();
    } else {
      bool = this.r;
    } 
    savedState.d = bool;
    return (Parcelable)savedState;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
      this.s = true; 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (!this.g)
      return super.onTouchEvent(paramMotionEvent); 
    this.q.F(paramMotionEvent);
    int i = paramMotionEvent.getActionMasked();
    if (i != 0) {
      if (i == 1 && h(this.h)) {
        float f1 = paramMotionEvent.getX();
        float f2 = paramMotionEvent.getY();
        float f3 = f1 - this.n;
        float f4 = f2 - this.o;
        i = this.q.z();
        if (f3 * f3 + f4 * f4 < (i * i) && this.q.E(this.h, (int)f1, (int)f2))
          b(this.h, 0); 
      } 
    } else {
      float f2 = paramMotionEvent.getX();
      float f1 = paramMotionEvent.getY();
      this.n = f2;
      this.o = f1;
    } 
    return true;
  }
  
  void p() {
    int i = getChildCount();
    for (byte b = 0; b < i; b++) {
      View view = getChildAt(b);
      if (view.getVisibility() == 4)
        view.setVisibility(0); 
    } 
  }
  
  boolean q(float paramFloat, int paramInt) {
    if (!this.g)
      return false; 
    boolean bool = i();
    LayoutParams layoutParams = (LayoutParams)this.h.getLayoutParams();
    if (bool) {
      int i = getPaddingRight();
      int j = layoutParams.rightMargin;
      paramInt = this.h.getWidth();
      paramInt = (int)(getWidth() - (i + j) + paramFloat * this.k + paramInt);
    } else {
      paramInt = (int)((getPaddingLeft() + layoutParams.leftMargin) + paramFloat * this.k);
    } 
    b.j.a.c c1 = this.q;
    View view = this.h;
    if (c1.P(view, paramInt, view.getTop())) {
      p();
      w.h0((View)this);
      return true;
    } 
    return false;
  }
  
  void r(View paramView) {
    int i;
    int j;
    byte b1;
    byte b2;
    byte b3;
    byte b4;
    boolean bool = i();
    if (bool) {
      i = getWidth() - getPaddingRight();
    } else {
      i = getPaddingLeft();
    } 
    if (bool) {
      j = getPaddingLeft();
    } else {
      j = getWidth() - getPaddingRight();
    } 
    int k = getPaddingTop();
    int m = getHeight();
    int n = getPaddingBottom();
    if (paramView != null && s(paramView)) {
      b1 = paramView.getLeft();
      b2 = paramView.getRight();
      b3 = paramView.getTop();
      b4 = paramView.getBottom();
    } else {
      b1 = 0;
      b2 = 0;
      b3 = 0;
      b4 = 0;
    } 
    int i1 = getChildCount();
    for (byte b5 = 0; b5 < i1; b5++) {
      View view = getChildAt(b5);
      if (view == paramView)
        break; 
      if (view.getVisibility() != 8) {
        if (bool) {
          i2 = j;
        } else {
          i2 = i;
        } 
        int i3 = Math.max(i2, view.getLeft());
        int i4 = Math.max(k, view.getTop());
        if (bool) {
          i2 = i;
        } else {
          i2 = j;
        } 
        int i2 = Math.min(i2, view.getRight());
        int i5 = Math.min(m - n, view.getBottom());
        if (i3 >= b1 && i4 >= b3 && i2 <= b2 && i5 <= b4) {
          i2 = 4;
        } else {
          i2 = 0;
        } 
        view.setVisibility(i2);
      } 
    } 
  }
  
  public void requestChildFocus(View paramView1, View paramView2) {
    super.requestChildFocus(paramView1, paramView2);
    if (!isInTouchMode() && !this.g) {
      boolean bool;
      if (paramView1 == this.h) {
        bool = true;
      } else {
        bool = false;
      } 
      this.r = bool;
    } 
  }
  
  public void setCoveredFadeColor(int paramInt) {
    this.c = paramInt;
  }
  
  public void setPanelSlideListener(d paramd) {
    this.p = paramd;
  }
  
  public void setParallaxDistance(int paramInt) {
    this.m = paramInt;
    requestLayout();
  }
  
  @Deprecated
  public void setShadowDrawable(Drawable paramDrawable) {
    setShadowDrawableLeft(paramDrawable);
  }
  
  public void setShadowDrawableLeft(Drawable paramDrawable) {
    this.d = paramDrawable;
  }
  
  public void setShadowDrawableRight(Drawable paramDrawable) {
    this.e = paramDrawable;
  }
  
  @Deprecated
  public void setShadowResource(int paramInt) {
    setShadowDrawable(getResources().getDrawable(paramInt));
  }
  
  public void setShadowResourceLeft(int paramInt) {
    setShadowDrawableLeft(androidx.core.content.a.f(getContext(), paramInt));
  }
  
  public void setShadowResourceRight(int paramInt) {
    setShadowDrawableRight(androidx.core.content.a.f(getContext(), paramInt));
  }
  
  public void setSliderFadeColor(int paramInt) {
    this.b = paramInt;
  }
  
  public static class LayoutParams extends ViewGroup.MarginLayoutParams {
    private static final int[] a = new int[] { 16843137 };
    
    public float b = 0.0F;
    
    boolean c;
    
    boolean d;
    
    Paint e;
    
    public LayoutParams() {
      super(-1, -1);
    }
    
    public LayoutParams(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, a);
      this.b = typedArray.getFloat(0, 0.0F);
      typedArray.recycle();
    }
    
    public LayoutParams(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public LayoutParams(ViewGroup.MarginLayoutParams param1MarginLayoutParams) {
      super(param1MarginLayoutParams);
    }
  }
  
  static class SavedState extends AbsSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = (Parcelable.Creator<SavedState>)new a();
    
    boolean d;
    
    SavedState(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      boolean bool;
      if (param1Parcel.readInt() != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      this.d = bool;
    }
    
    SavedState(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeInt(this.d);
    }
    
    static final class a implements Parcelable.ClassLoaderCreator<SavedState> {
      public SlidingPaneLayout.SavedState a(Parcel param2Parcel) {
        return new SlidingPaneLayout.SavedState(param2Parcel, null);
      }
      
      public SlidingPaneLayout.SavedState b(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new SlidingPaneLayout.SavedState(param2Parcel, null);
      }
      
      public SlidingPaneLayout.SavedState[] c(int param2Int) {
        return new SlidingPaneLayout.SavedState[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.ClassLoaderCreator<SavedState> {
    public SlidingPaneLayout.SavedState a(Parcel param1Parcel) {
      return new SlidingPaneLayout.SavedState(param1Parcel, null);
    }
    
    public SlidingPaneLayout.SavedState b(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new SlidingPaneLayout.SavedState(param1Parcel, null);
    }
    
    public SlidingPaneLayout.SavedState[] c(int param1Int) {
      return new SlidingPaneLayout.SavedState[param1Int];
    }
  }
  
  class a extends b.h.k.a {
    private final Rect d = new Rect();
    
    a(SlidingPaneLayout this$0) {}
    
    private void n(b.h.k.f0.c param1c1, b.h.k.f0.c param1c2) {
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
      param1c1.p0(param1c2.t());
    }
    
    public void f(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      super.f(param1View, param1AccessibilityEvent);
      param1AccessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
    }
    
    public void g(View param1View, b.h.k.f0.c param1c) {
      b.h.k.f0.c c1 = b.h.k.f0.c.Q(param1c);
      super.g(param1View, c1);
      n(param1c, c1);
      c1.S();
      param1c.c0(SlidingPaneLayout.class.getName());
      param1c.A0(param1View);
      ViewParent viewParent = w.J(param1View);
      if (viewParent instanceof View)
        param1c.s0((View)viewParent); 
      int i = this.e.getChildCount();
      for (byte b = 0; b < i; b++) {
        View view = this.e.getChildAt(b);
        if (!o(view) && view.getVisibility() == 0) {
          w.B0(view, 1);
          param1c.c(view);
        } 
      } 
    }
    
    public boolean i(ViewGroup param1ViewGroup, View param1View, AccessibilityEvent param1AccessibilityEvent) {
      return !o(param1View) ? super.i(param1ViewGroup, param1View, param1AccessibilityEvent) : false;
    }
    
    public boolean o(View param1View) {
      return this.e.h(param1View);
    }
  }
  
  private class b implements Runnable {
    final View b;
    
    b(SlidingPaneLayout this$0, View param1View) {
      this.b = param1View;
    }
    
    public void run() {
      if (this.b.getParent() == this.c) {
        this.b.setLayerType(0, null);
        this.c.g(this.b);
      } 
      this.c.u.remove(this);
    }
  }
  
  private class c extends b.j.a.c.c {
    c(SlidingPaneLayout this$0) {}
    
    public int a(View param1View, int param1Int1, int param1Int2) {
      SlidingPaneLayout.LayoutParams layoutParams = (SlidingPaneLayout.LayoutParams)this.a.h.getLayoutParams();
      if (this.a.i()) {
        param1Int2 = this.a.getWidth() - this.a.getPaddingRight() + layoutParams.rightMargin + this.a.h.getWidth();
        int i = this.a.k;
        param1Int1 = Math.max(Math.min(param1Int1, param1Int2), param1Int2 - i);
      } else {
        param1Int2 = this.a.getPaddingLeft() + layoutParams.leftMargin;
        int i = this.a.k;
        param1Int1 = Math.min(Math.max(param1Int1, param1Int2), i + param1Int2);
      } 
      return param1Int1;
    }
    
    public int b(View param1View, int param1Int1, int param1Int2) {
      return param1View.getTop();
    }
    
    public int d(View param1View) {
      return this.a.k;
    }
    
    public void f(int param1Int1, int param1Int2) {
      SlidingPaneLayout slidingPaneLayout = this.a;
      slidingPaneLayout.q.c(slidingPaneLayout.h, param1Int2);
    }
    
    public void i(View param1View, int param1Int) {
      this.a.p();
    }
    
    public void j(int param1Int) {
      if (this.a.q.A() == 0) {
        SlidingPaneLayout slidingPaneLayout = this.a;
        if (slidingPaneLayout.i == 0.0F) {
          slidingPaneLayout.r(slidingPaneLayout.h);
          slidingPaneLayout = this.a;
          slidingPaneLayout.d(slidingPaneLayout.h);
          this.a.r = false;
        } else {
          slidingPaneLayout.e(slidingPaneLayout.h);
          this.a.r = true;
        } 
      } 
    }
    
    public void k(View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      this.a.l(param1Int1);
      this.a.invalidate();
    }
    
    public void l(View param1View, float param1Float1, float param1Float2) {
      // Byte code:
      //   0: aload_1
      //   1: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
      //   4: checkcast androidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams
      //   7: astore #4
      //   9: aload_0
      //   10: getfield a : Landroidx/slidingpanelayout/widget/SlidingPaneLayout;
      //   13: invokevirtual i : ()Z
      //   16: ifeq -> 109
      //   19: aload_0
      //   20: getfield a : Landroidx/slidingpanelayout/widget/SlidingPaneLayout;
      //   23: invokevirtual getPaddingRight : ()I
      //   26: aload #4
      //   28: getfield rightMargin : I
      //   31: iadd
      //   32: istore #5
      //   34: fload_2
      //   35: fconst_0
      //   36: fcmpg
      //   37: iflt -> 67
      //   40: iload #5
      //   42: istore #6
      //   44: fload_2
      //   45: fconst_0
      //   46: fcmpl
      //   47: ifne -> 79
      //   50: iload #5
      //   52: istore #6
      //   54: aload_0
      //   55: getfield a : Landroidx/slidingpanelayout/widget/SlidingPaneLayout;
      //   58: getfield i : F
      //   61: ldc 0.5
      //   63: fcmpl
      //   64: ifle -> 79
      //   67: iload #5
      //   69: aload_0
      //   70: getfield a : Landroidx/slidingpanelayout/widget/SlidingPaneLayout;
      //   73: getfield k : I
      //   76: iadd
      //   77: istore #6
      //   79: aload_0
      //   80: getfield a : Landroidx/slidingpanelayout/widget/SlidingPaneLayout;
      //   83: getfield h : Landroid/view/View;
      //   86: invokevirtual getWidth : ()I
      //   89: istore #5
      //   91: aload_0
      //   92: getfield a : Landroidx/slidingpanelayout/widget/SlidingPaneLayout;
      //   95: invokevirtual getWidth : ()I
      //   98: iload #6
      //   100: isub
      //   101: iload #5
      //   103: isub
      //   104: istore #6
      //   106: goto -> 173
      //   109: aload_0
      //   110: getfield a : Landroidx/slidingpanelayout/widget/SlidingPaneLayout;
      //   113: invokevirtual getPaddingLeft : ()I
      //   116: istore #6
      //   118: aload #4
      //   120: getfield leftMargin : I
      //   123: iload #6
      //   125: iadd
      //   126: istore #5
      //   128: fload_2
      //   129: fconst_0
      //   130: fcmpl
      //   131: ifgt -> 161
      //   134: iload #5
      //   136: istore #6
      //   138: fload_2
      //   139: fconst_0
      //   140: fcmpl
      //   141: ifne -> 173
      //   144: iload #5
      //   146: istore #6
      //   148: aload_0
      //   149: getfield a : Landroidx/slidingpanelayout/widget/SlidingPaneLayout;
      //   152: getfield i : F
      //   155: ldc 0.5
      //   157: fcmpl
      //   158: ifle -> 173
      //   161: iload #5
      //   163: aload_0
      //   164: getfield a : Landroidx/slidingpanelayout/widget/SlidingPaneLayout;
      //   167: getfield k : I
      //   170: iadd
      //   171: istore #6
      //   173: aload_0
      //   174: getfield a : Landroidx/slidingpanelayout/widget/SlidingPaneLayout;
      //   177: getfield q : Lb/j/a/c;
      //   180: iload #6
      //   182: aload_1
      //   183: invokevirtual getTop : ()I
      //   186: invokevirtual N : (II)Z
      //   189: pop
      //   190: aload_0
      //   191: getfield a : Landroidx/slidingpanelayout/widget/SlidingPaneLayout;
      //   194: invokevirtual invalidate : ()V
      //   197: return
    }
    
    public boolean m(View param1View, int param1Int) {
      return this.a.l ? false : ((SlidingPaneLayout.LayoutParams)param1View.getLayoutParams()).c;
    }
  }
  
  public static interface d {
    void a(View param1View, float param1Float);
    
    void b(View param1View);
    
    void c(View param1View);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/slidingpanelayout/widget/SlidingPaneLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */