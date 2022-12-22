package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import b.a.j;
import b.h.k.e;
import b.h.k.w;

public class LinearLayoutCompat extends ViewGroup {
  private boolean b = true;
  
  private int c = -1;
  
  private int d = 0;
  
  private int e;
  
  private int f = 8388659;
  
  private int g;
  
  private float h;
  
  private boolean i;
  
  private int[] j;
  
  private int[] k;
  
  private Drawable l;
  
  private int m;
  
  private int n;
  
  private int o;
  
  private int p;
  
  public LinearLayoutCompat(Context paramContext) {
    this(paramContext, null);
  }
  
  public LinearLayoutCompat(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public LinearLayoutCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    int[] arrayOfInt = j.LinearLayoutCompat;
    e0 e0 = e0.v(paramContext, paramAttributeSet, arrayOfInt, paramInt, 0);
    w.p0((View)this, paramContext, arrayOfInt, paramAttributeSet, e0.r(), paramInt, 0);
    paramInt = e0.k(j.LinearLayoutCompat_android_orientation, -1);
    if (paramInt >= 0)
      setOrientation(paramInt); 
    paramInt = e0.k(j.LinearLayoutCompat_android_gravity, -1);
    if (paramInt >= 0)
      setGravity(paramInt); 
    boolean bool = e0.a(j.LinearLayoutCompat_android_baselineAligned, true);
    if (!bool)
      setBaselineAligned(bool); 
    this.h = e0.i(j.LinearLayoutCompat_android_weightSum, -1.0F);
    this.c = e0.k(j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
    this.i = e0.a(j.LinearLayoutCompat_measureWithLargestChild, false);
    setDividerDrawable(e0.g(j.LinearLayoutCompat_divider));
    this.o = e0.k(j.LinearLayoutCompat_showDividers, 0);
    this.p = e0.f(j.LinearLayoutCompat_dividerPadding, 0);
    e0.w();
  }
  
  private void A(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramView.layout(paramInt1, paramInt2, paramInt3 + paramInt1, paramInt4 + paramInt2);
  }
  
  private void k(int paramInt1, int paramInt2) {
    int i = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
    for (byte b = 0; b < paramInt1; b++) {
      View view = s(b);
      if (view.getVisibility() != 8) {
        LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
        if (layoutParams.height == -1) {
          int j = layoutParams.width;
          layoutParams.width = view.getMeasuredWidth();
          measureChildWithMargins(view, paramInt2, 0, i, 0);
          layoutParams.width = j;
        } 
      } 
    } 
  }
  
  private void l(int paramInt1, int paramInt2) {
    int i = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
    for (byte b = 0; b < paramInt1; b++) {
      View view = s(b);
      if (view.getVisibility() != 8) {
        LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
        if (layoutParams.width == -1) {
          int j = layoutParams.height;
          layoutParams.height = view.getMeasuredHeight();
          measureChildWithMargins(view, i, 0, paramInt2, 0);
          layoutParams.height = j;
        } 
      } 
    } 
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return paramLayoutParams instanceof LayoutParams;
  }
  
  void g(Canvas paramCanvas) {
    int i = getVirtualChildCount();
    boolean bool = k0.b((View)this);
    int j;
    for (j = 0; j < i; j++) {
      View view = s(j);
      if (view != null && view.getVisibility() != 8 && t(j)) {
        int k;
        LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
        if (bool) {
          k = view.getRight() + layoutParams.rightMargin;
        } else {
          k = view.getLeft() - layoutParams.leftMargin - this.m;
        } 
        j(paramCanvas, k);
      } 
    } 
    if (t(i)) {
      View view = s(i - 1);
      if (view == null) {
        if (bool) {
          j = getPaddingLeft();
        } else {
          int k = getWidth() - getPaddingRight();
          j = this.m;
          j = k - j;
        } 
      } else {
        int k;
        LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
        if (bool) {
          k = view.getLeft() - layoutParams.leftMargin;
          j = this.m;
        } else {
          j = view.getRight() + layoutParams.rightMargin;
          j(paramCanvas, j);
        } 
        j = k - j;
      } 
    } else {
      return;
    } 
    j(paramCanvas, j);
  }
  
  public int getBaseline() {
    if (this.c < 0)
      return super.getBaseline(); 
    int i = getChildCount();
    int j = this.c;
    if (i > j) {
      View view = getChildAt(j);
      int k = view.getBaseline();
      if (k == -1) {
        if (this.c == 0)
          return -1; 
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
      } 
      j = this.d;
      i = j;
      if (this.e == 1) {
        int m = this.f & 0x70;
        i = j;
        if (m != 48)
          if (m != 16) {
            if (m != 80) {
              i = j;
            } else {
              i = getBottom() - getTop() - getPaddingBottom() - this.g;
            } 
          } else {
            i = j + (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - this.g) / 2;
          }  
      } 
      return i + ((LayoutParams)view.getLayoutParams()).topMargin + k;
    } 
    throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
  }
  
  public int getBaselineAlignedChildIndex() {
    return this.c;
  }
  
  public Drawable getDividerDrawable() {
    return this.l;
  }
  
  public int getDividerPadding() {
    return this.p;
  }
  
  public int getDividerWidth() {
    return this.m;
  }
  
  public int getGravity() {
    return this.f;
  }
  
  public int getOrientation() {
    return this.e;
  }
  
  public int getShowDividers() {
    return this.o;
  }
  
  int getVirtualChildCount() {
    return getChildCount();
  }
  
  public float getWeightSum() {
    return this.h;
  }
  
  void h(Canvas paramCanvas) {
    int i = getVirtualChildCount();
    int j;
    for (j = 0; j < i; j++) {
      View view = s(j);
      if (view != null && view.getVisibility() != 8 && t(j)) {
        LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
        i(paramCanvas, view.getTop() - layoutParams.topMargin - this.n);
      } 
    } 
    if (t(i)) {
      View view = s(i - 1);
      if (view == null) {
        j = getHeight() - getPaddingBottom() - this.n;
      } else {
        LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
        j = view.getBottom() + layoutParams.bottomMargin;
      } 
      i(paramCanvas, j);
    } 
  }
  
  void i(Canvas paramCanvas, int paramInt) {
    this.l.setBounds(getPaddingLeft() + this.p, paramInt, getWidth() - getPaddingRight() - this.p, this.n + paramInt);
    this.l.draw(paramCanvas);
  }
  
  void j(Canvas paramCanvas, int paramInt) {
    this.l.setBounds(paramInt, getPaddingTop() + this.p, this.m + paramInt, getHeight() - getPaddingBottom() - this.p);
    this.l.draw(paramCanvas);
  }
  
  protected LayoutParams m() {
    int i = this.e;
    return (i == 0) ? new LayoutParams(-2, -2) : ((i == 1) ? new LayoutParams(-1, -2) : null);
  }
  
  public LayoutParams n(AttributeSet paramAttributeSet) {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected LayoutParams o(ViewGroup.LayoutParams paramLayoutParams) {
    return new LayoutParams(paramLayoutParams);
  }
  
  protected void onDraw(Canvas paramCanvas) {
    if (this.l == null)
      return; 
    if (this.e == 1) {
      h(paramCanvas);
    } else {
      g(paramCanvas);
    } 
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.e == 1) {
      v(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      u(paramInt1, paramInt2, paramInt3, paramInt4);
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    if (this.e == 1) {
      z(paramInt1, paramInt2);
    } else {
      x(paramInt1, paramInt2);
    } 
  }
  
  int p(View paramView, int paramInt) {
    return 0;
  }
  
  int q(View paramView) {
    return 0;
  }
  
  int r(View paramView) {
    return 0;
  }
  
  View s(int paramInt) {
    return getChildAt(paramInt);
  }
  
  public void setBaselineAligned(boolean paramBoolean) {
    this.b = paramBoolean;
  }
  
  public void setBaselineAlignedChildIndex(int paramInt) {
    if (paramInt >= 0 && paramInt < getChildCount()) {
      this.c = paramInt;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("base aligned child index out of range (0, ");
    stringBuilder.append(getChildCount());
    stringBuilder.append(")");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void setDividerDrawable(Drawable paramDrawable) {
    if (paramDrawable == this.l)
      return; 
    this.l = paramDrawable;
    boolean bool = false;
    if (paramDrawable != null) {
      this.m = paramDrawable.getIntrinsicWidth();
      this.n = paramDrawable.getIntrinsicHeight();
    } else {
      this.m = 0;
      this.n = 0;
    } 
    if (paramDrawable == null)
      bool = true; 
    setWillNotDraw(bool);
    requestLayout();
  }
  
  public void setDividerPadding(int paramInt) {
    this.p = paramInt;
  }
  
  public void setGravity(int paramInt) {
    if (this.f != paramInt) {
      int i = paramInt;
      if ((0x800007 & paramInt) == 0)
        i = paramInt | 0x800003; 
      paramInt = i;
      if ((i & 0x70) == 0)
        paramInt = i | 0x30; 
      this.f = paramInt;
      requestLayout();
    } 
  }
  
  public void setHorizontalGravity(int paramInt) {
    paramInt &= 0x800007;
    int i = this.f;
    if ((0x800007 & i) != paramInt) {
      this.f = paramInt | 0xFF7FFFF8 & i;
      requestLayout();
    } 
  }
  
  public void setMeasureWithLargestChildEnabled(boolean paramBoolean) {
    this.i = paramBoolean;
  }
  
  public void setOrientation(int paramInt) {
    if (this.e != paramInt) {
      this.e = paramInt;
      requestLayout();
    } 
  }
  
  public void setShowDividers(int paramInt) {
    if (paramInt != this.o)
      requestLayout(); 
    this.o = paramInt;
  }
  
  public void setVerticalGravity(int paramInt) {
    paramInt &= 0x70;
    int i = this.f;
    if ((i & 0x70) != paramInt) {
      this.f = paramInt | i & 0xFFFFFF8F;
      requestLayout();
    } 
  }
  
  public void setWeightSum(float paramFloat) {
    this.h = Math.max(0.0F, paramFloat);
  }
  
  public boolean shouldDelayChildPressedState() {
    return false;
  }
  
  protected boolean t(int paramInt) {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (paramInt == 0) {
      if ((this.o & 0x1) != 0)
        bool3 = true; 
      return bool3;
    } 
    if (paramInt == getChildCount()) {
      bool3 = bool1;
      if ((this.o & 0x4) != 0)
        bool3 = true; 
      return bool3;
    } 
    bool3 = bool2;
    if ((this.o & 0x2) != 0) {
      paramInt--;
      while (true) {
        bool3 = bool2;
        if (paramInt >= 0) {
          if (getChildAt(paramInt).getVisibility() != 8) {
            bool3 = true;
            break;
          } 
          paramInt--;
          continue;
        } 
        break;
      } 
    } 
    return bool3;
  }
  
  void u(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    byte b1;
    byte b2;
    boolean bool1 = k0.b((View)this);
    int i = getPaddingTop();
    int j = paramInt4 - paramInt2;
    int k = getPaddingBottom();
    int m = getPaddingBottom();
    int n = getVirtualChildCount();
    paramInt2 = this.f;
    paramInt4 = paramInt2 & 0x70;
    boolean bool2 = this.b;
    int[] arrayOfInt1 = this.j;
    int[] arrayOfInt2 = this.k;
    paramInt2 = e.b(0x800007 & paramInt2, w.C((View)this));
    if (paramInt2 != 1) {
      if (paramInt2 != 5) {
        paramInt2 = getPaddingLeft();
      } else {
        paramInt2 = getPaddingLeft() + paramInt3 - paramInt1 - this.g;
      } 
    } else {
      paramInt2 = getPaddingLeft() + (paramInt3 - paramInt1 - this.g) / 2;
    } 
    if (bool1) {
      b1 = n - 1;
      b2 = -1;
    } else {
      b1 = 0;
      b2 = 1;
    } 
    int i1 = 0;
    paramInt3 = paramInt4;
    paramInt4 = i;
    while (i1 < n) {
      int i2 = b1 + b2 * i1;
      View view = s(i2);
      if (view == null) {
        paramInt2 += y(i2);
      } else if (view.getVisibility() != 8) {
        int i3 = view.getMeasuredWidth();
        int i4 = view.getMeasuredHeight();
        LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
        if (bool2 && layoutParams.height != -1) {
          i5 = view.getBaseline();
        } else {
          i5 = -1;
        } 
        int i6 = layoutParams.gravity;
        paramInt1 = i6;
        if (i6 < 0)
          paramInt1 = paramInt3; 
        paramInt1 &= 0x70;
        if (paramInt1 != 16) {
          if (paramInt1 != 48) {
            if (paramInt1 != 80) {
              paramInt1 = paramInt4;
            } else {
              i6 = j - k - i4 - layoutParams.bottomMargin;
              paramInt1 = i6;
              if (i5 != -1) {
                paramInt1 = view.getMeasuredHeight();
                paramInt1 = i6 - arrayOfInt2[2] - paramInt1 - i5;
              } 
            } 
          } else {
            i6 = layoutParams.topMargin + paramInt4;
            paramInt1 = i6;
            if (i5 != -1)
              paramInt1 = i6 + arrayOfInt1[1] - i5; 
          } 
        } else {
          paramInt1 = (j - i - m - i4) / 2 + paramInt4 + layoutParams.topMargin - layoutParams.bottomMargin;
        } 
        int i5 = paramInt2;
        if (t(i2))
          i5 = paramInt2 + this.m; 
        paramInt2 = layoutParams.leftMargin + i5;
        A(view, paramInt2 + q(view), paramInt1, i3, i4);
        i5 = layoutParams.rightMargin;
        paramInt1 = r(view);
        i1 += p(view, i2);
        paramInt2 += i3 + i5 + paramInt1;
      } 
      i1++;
    } 
  }
  
  void v(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = getPaddingLeft();
    int j = paramInt3 - paramInt1;
    int k = getPaddingRight();
    int m = getPaddingRight();
    int n = getVirtualChildCount();
    int i1 = this.f;
    paramInt1 = i1 & 0x70;
    if (paramInt1 != 16) {
      if (paramInt1 != 80) {
        paramInt1 = getPaddingTop();
      } else {
        paramInt1 = getPaddingTop() + paramInt4 - paramInt2 - this.g;
      } 
    } else {
      paramInt1 = getPaddingTop() + (paramInt4 - paramInt2 - this.g) / 2;
    } 
    paramInt2 = 0;
    while (paramInt2 < n) {
      View view = s(paramInt2);
      if (view == null) {
        paramInt3 = paramInt1 + y(paramInt2);
        paramInt4 = paramInt2;
      } else {
        paramInt3 = paramInt1;
        paramInt4 = paramInt2;
        if (view.getVisibility() != 8) {
          int i2 = view.getMeasuredWidth();
          int i3 = view.getMeasuredHeight();
          LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
          paramInt4 = layoutParams.gravity;
          paramInt3 = paramInt4;
          if (paramInt4 < 0)
            paramInt3 = i1 & 0x800007; 
          paramInt3 = e.b(paramInt3, w.C((View)this)) & 0x7;
          if (paramInt3 != 1) {
            if (paramInt3 != 5) {
              paramInt3 = layoutParams.leftMargin + i;
            } else {
              paramInt3 = j - k - i2;
              paramInt4 = layoutParams.rightMargin;
              paramInt3 -= paramInt4;
            } 
          } else {
            paramInt3 = (j - i - m - i2) / 2 + i + layoutParams.leftMargin;
            paramInt4 = layoutParams.rightMargin;
            paramInt3 -= paramInt4;
          } 
          paramInt4 = paramInt1;
          if (t(paramInt2))
            paramInt4 = paramInt1 + this.n; 
          paramInt1 = paramInt4 + layoutParams.topMargin;
          A(view, paramInt3, paramInt1 + q(view), i2, i3);
          i2 = layoutParams.bottomMargin;
          paramInt3 = r(view);
          paramInt4 = paramInt2 + p(view, paramInt2);
          paramInt3 = paramInt1 + i3 + i2 + paramInt3;
        } 
      } 
      paramInt2 = paramInt4 + 1;
      paramInt1 = paramInt3;
    } 
  }
  
  void w(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    measureChildWithMargins(paramView, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  void x(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield g : I
    //   5: aload_0
    //   6: invokevirtual getVirtualChildCount : ()I
    //   9: istore_3
    //   10: iload_1
    //   11: invokestatic getMode : (I)I
    //   14: istore #4
    //   16: iload_2
    //   17: invokestatic getMode : (I)I
    //   20: istore #5
    //   22: aload_0
    //   23: getfield j : [I
    //   26: ifnull -> 36
    //   29: aload_0
    //   30: getfield k : [I
    //   33: ifnonnull -> 50
    //   36: aload_0
    //   37: iconst_4
    //   38: newarray int
    //   40: putfield j : [I
    //   43: aload_0
    //   44: iconst_4
    //   45: newarray int
    //   47: putfield k : [I
    //   50: aload_0
    //   51: getfield j : [I
    //   54: astore #6
    //   56: aload_0
    //   57: getfield k : [I
    //   60: astore #7
    //   62: aload #6
    //   64: iconst_3
    //   65: iconst_m1
    //   66: iastore
    //   67: aload #6
    //   69: iconst_2
    //   70: iconst_m1
    //   71: iastore
    //   72: aload #6
    //   74: iconst_1
    //   75: iconst_m1
    //   76: iastore
    //   77: aload #6
    //   79: iconst_0
    //   80: iconst_m1
    //   81: iastore
    //   82: aload #7
    //   84: iconst_3
    //   85: iconst_m1
    //   86: iastore
    //   87: aload #7
    //   89: iconst_2
    //   90: iconst_m1
    //   91: iastore
    //   92: aload #7
    //   94: iconst_1
    //   95: iconst_m1
    //   96: iastore
    //   97: aload #7
    //   99: iconst_0
    //   100: iconst_m1
    //   101: iastore
    //   102: aload_0
    //   103: getfield b : Z
    //   106: istore #8
    //   108: aload_0
    //   109: getfield i : Z
    //   112: istore #9
    //   114: iload #4
    //   116: ldc 1073741824
    //   118: if_icmpne -> 127
    //   121: iconst_1
    //   122: istore #10
    //   124: goto -> 130
    //   127: iconst_0
    //   128: istore #10
    //   130: fconst_0
    //   131: fstore #11
    //   133: iconst_0
    //   134: istore #12
    //   136: iconst_0
    //   137: istore #13
    //   139: iconst_0
    //   140: istore #14
    //   142: iconst_0
    //   143: istore #15
    //   145: iconst_0
    //   146: istore #16
    //   148: iconst_0
    //   149: istore #17
    //   151: iconst_0
    //   152: istore #18
    //   154: iconst_1
    //   155: istore #19
    //   157: iconst_0
    //   158: istore #20
    //   160: iload #12
    //   162: iload_3
    //   163: if_icmpge -> 844
    //   166: aload_0
    //   167: iload #12
    //   169: invokevirtual s : (I)Landroid/view/View;
    //   172: astore #21
    //   174: aload #21
    //   176: ifnonnull -> 197
    //   179: aload_0
    //   180: aload_0
    //   181: getfield g : I
    //   184: aload_0
    //   185: iload #12
    //   187: invokevirtual y : (I)I
    //   190: iadd
    //   191: putfield g : I
    //   194: goto -> 838
    //   197: aload #21
    //   199: invokevirtual getVisibility : ()I
    //   202: bipush #8
    //   204: if_icmpne -> 223
    //   207: iload #12
    //   209: aload_0
    //   210: aload #21
    //   212: iload #12
    //   214: invokevirtual p : (Landroid/view/View;I)I
    //   217: iadd
    //   218: istore #12
    //   220: goto -> 194
    //   223: aload_0
    //   224: iload #12
    //   226: invokevirtual t : (I)Z
    //   229: ifeq -> 245
    //   232: aload_0
    //   233: aload_0
    //   234: getfield g : I
    //   237: aload_0
    //   238: getfield m : I
    //   241: iadd
    //   242: putfield g : I
    //   245: aload #21
    //   247: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   250: checkcast androidx/appcompat/widget/LinearLayoutCompat$LayoutParams
    //   253: astore #22
    //   255: aload #22
    //   257: getfield weight : F
    //   260: fstore #23
    //   262: fload #11
    //   264: fload #23
    //   266: fadd
    //   267: fstore #11
    //   269: iload #4
    //   271: ldc 1073741824
    //   273: if_icmpne -> 382
    //   276: aload #22
    //   278: getfield width : I
    //   281: ifne -> 382
    //   284: fload #23
    //   286: fconst_0
    //   287: fcmpl
    //   288: ifle -> 382
    //   291: iload #10
    //   293: ifeq -> 319
    //   296: aload_0
    //   297: aload_0
    //   298: getfield g : I
    //   301: aload #22
    //   303: getfield leftMargin : I
    //   306: aload #22
    //   308: getfield rightMargin : I
    //   311: iadd
    //   312: iadd
    //   313: putfield g : I
    //   316: goto -> 348
    //   319: aload_0
    //   320: getfield g : I
    //   323: istore #24
    //   325: aload_0
    //   326: iload #24
    //   328: aload #22
    //   330: getfield leftMargin : I
    //   333: iload #24
    //   335: iadd
    //   336: aload #22
    //   338: getfield rightMargin : I
    //   341: iadd
    //   342: invokestatic max : (II)I
    //   345: putfield g : I
    //   348: iload #8
    //   350: ifeq -> 376
    //   353: iconst_0
    //   354: iconst_0
    //   355: invokestatic makeMeasureSpec : (II)I
    //   358: istore #24
    //   360: aload #21
    //   362: iload #24
    //   364: iload #24
    //   366: invokevirtual measure : (II)V
    //   369: iload #13
    //   371: istore #24
    //   373: goto -> 564
    //   376: iconst_1
    //   377: istore #17
    //   379: goto -> 568
    //   382: aload #22
    //   384: getfield width : I
    //   387: ifne -> 410
    //   390: fload #23
    //   392: fconst_0
    //   393: fcmpl
    //   394: ifle -> 410
    //   397: aload #22
    //   399: bipush #-2
    //   401: putfield width : I
    //   404: iconst_0
    //   405: istore #24
    //   407: goto -> 415
    //   410: ldc_w -2147483648
    //   413: istore #24
    //   415: fload #11
    //   417: fconst_0
    //   418: fcmpl
    //   419: ifne -> 431
    //   422: aload_0
    //   423: getfield g : I
    //   426: istore #25
    //   428: goto -> 434
    //   431: iconst_0
    //   432: istore #25
    //   434: aload_0
    //   435: aload #21
    //   437: iload #12
    //   439: iload_1
    //   440: iload #25
    //   442: iload_2
    //   443: iconst_0
    //   444: invokevirtual w : (Landroid/view/View;IIIII)V
    //   447: iload #24
    //   449: ldc_w -2147483648
    //   452: if_icmpeq -> 462
    //   455: aload #22
    //   457: iload #24
    //   459: putfield width : I
    //   462: aload #21
    //   464: invokevirtual getMeasuredWidth : ()I
    //   467: istore #25
    //   469: iload #10
    //   471: ifeq -> 507
    //   474: aload_0
    //   475: aload_0
    //   476: getfield g : I
    //   479: aload #22
    //   481: getfield leftMargin : I
    //   484: iload #25
    //   486: iadd
    //   487: aload #22
    //   489: getfield rightMargin : I
    //   492: iadd
    //   493: aload_0
    //   494: aload #21
    //   496: invokevirtual r : (Landroid/view/View;)I
    //   499: iadd
    //   500: iadd
    //   501: putfield g : I
    //   504: goto -> 546
    //   507: aload_0
    //   508: getfield g : I
    //   511: istore #24
    //   513: aload_0
    //   514: iload #24
    //   516: iload #24
    //   518: iload #25
    //   520: iadd
    //   521: aload #22
    //   523: getfield leftMargin : I
    //   526: iadd
    //   527: aload #22
    //   529: getfield rightMargin : I
    //   532: iadd
    //   533: aload_0
    //   534: aload #21
    //   536: invokevirtual r : (Landroid/view/View;)I
    //   539: iadd
    //   540: invokestatic max : (II)I
    //   543: putfield g : I
    //   546: iload #13
    //   548: istore #24
    //   550: iload #9
    //   552: ifeq -> 564
    //   555: iload #25
    //   557: iload #13
    //   559: invokestatic max : (II)I
    //   562: istore #24
    //   564: iload #24
    //   566: istore #13
    //   568: iload #12
    //   570: istore #26
    //   572: iload #5
    //   574: ldc 1073741824
    //   576: if_icmpeq -> 597
    //   579: aload #22
    //   581: getfield height : I
    //   584: iconst_m1
    //   585: if_icmpne -> 597
    //   588: iconst_1
    //   589: istore #12
    //   591: iconst_1
    //   592: istore #20
    //   594: goto -> 600
    //   597: iconst_0
    //   598: istore #12
    //   600: aload #22
    //   602: getfield topMargin : I
    //   605: aload #22
    //   607: getfield bottomMargin : I
    //   610: iadd
    //   611: istore #25
    //   613: aload #21
    //   615: invokevirtual getMeasuredHeight : ()I
    //   618: iload #25
    //   620: iadd
    //   621: istore #24
    //   623: iload #18
    //   625: aload #21
    //   627: invokevirtual getMeasuredState : ()I
    //   630: invokestatic combineMeasuredStates : (II)I
    //   633: istore #27
    //   635: iload #8
    //   637: ifeq -> 722
    //   640: aload #21
    //   642: invokevirtual getBaseline : ()I
    //   645: istore #28
    //   647: iload #28
    //   649: iconst_m1
    //   650: if_icmpeq -> 722
    //   653: aload #22
    //   655: getfield gravity : I
    //   658: istore #29
    //   660: iload #29
    //   662: istore #18
    //   664: iload #29
    //   666: ifge -> 675
    //   669: aload_0
    //   670: getfield f : I
    //   673: istore #18
    //   675: iload #18
    //   677: bipush #112
    //   679: iand
    //   680: iconst_4
    //   681: ishr
    //   682: bipush #-2
    //   684: iand
    //   685: iconst_1
    //   686: ishr
    //   687: istore #18
    //   689: aload #6
    //   691: iload #18
    //   693: aload #6
    //   695: iload #18
    //   697: iaload
    //   698: iload #28
    //   700: invokestatic max : (II)I
    //   703: iastore
    //   704: aload #7
    //   706: iload #18
    //   708: aload #7
    //   710: iload #18
    //   712: iaload
    //   713: iload #24
    //   715: iload #28
    //   717: isub
    //   718: invokestatic max : (II)I
    //   721: iastore
    //   722: iload #14
    //   724: iload #24
    //   726: invokestatic max : (II)I
    //   729: istore #14
    //   731: iload #19
    //   733: ifeq -> 751
    //   736: aload #22
    //   738: getfield height : I
    //   741: iconst_m1
    //   742: if_icmpne -> 751
    //   745: iconst_1
    //   746: istore #19
    //   748: goto -> 754
    //   751: iconst_0
    //   752: istore #19
    //   754: aload #22
    //   756: getfield weight : F
    //   759: fconst_0
    //   760: fcmpl
    //   761: ifle -> 788
    //   764: iload #12
    //   766: ifeq -> 772
    //   769: goto -> 776
    //   772: iload #24
    //   774: istore #25
    //   776: iload #16
    //   778: iload #25
    //   780: invokestatic max : (II)I
    //   783: istore #12
    //   785: goto -> 813
    //   788: iload #12
    //   790: ifeq -> 796
    //   793: goto -> 800
    //   796: iload #24
    //   798: istore #25
    //   800: iload #15
    //   802: iload #25
    //   804: invokestatic max : (II)I
    //   807: istore #15
    //   809: iload #16
    //   811: istore #12
    //   813: aload_0
    //   814: aload #21
    //   816: iload #26
    //   818: invokevirtual p : (Landroid/view/View;I)I
    //   821: iload #26
    //   823: iadd
    //   824: istore #24
    //   826: iload #27
    //   828: istore #18
    //   830: iload #12
    //   832: istore #16
    //   834: iload #24
    //   836: istore #12
    //   838: iinc #12, 1
    //   841: goto -> 160
    //   844: aload_0
    //   845: getfield g : I
    //   848: ifle -> 872
    //   851: aload_0
    //   852: iload_3
    //   853: invokevirtual t : (I)Z
    //   856: ifeq -> 872
    //   859: aload_0
    //   860: aload_0
    //   861: getfield g : I
    //   864: aload_0
    //   865: getfield m : I
    //   868: iadd
    //   869: putfield g : I
    //   872: aload #6
    //   874: iconst_1
    //   875: iaload
    //   876: iconst_m1
    //   877: if_icmpne -> 914
    //   880: aload #6
    //   882: iconst_0
    //   883: iaload
    //   884: iconst_m1
    //   885: if_icmpne -> 914
    //   888: aload #6
    //   890: iconst_2
    //   891: iaload
    //   892: iconst_m1
    //   893: if_icmpne -> 914
    //   896: aload #6
    //   898: iconst_3
    //   899: iaload
    //   900: iconst_m1
    //   901: if_icmpeq -> 907
    //   904: goto -> 914
    //   907: iload #14
    //   909: istore #12
    //   911: goto -> 972
    //   914: iload #14
    //   916: aload #6
    //   918: iconst_3
    //   919: iaload
    //   920: aload #6
    //   922: iconst_0
    //   923: iaload
    //   924: aload #6
    //   926: iconst_1
    //   927: iaload
    //   928: aload #6
    //   930: iconst_2
    //   931: iaload
    //   932: invokestatic max : (II)I
    //   935: invokestatic max : (II)I
    //   938: invokestatic max : (II)I
    //   941: aload #7
    //   943: iconst_3
    //   944: iaload
    //   945: aload #7
    //   947: iconst_0
    //   948: iaload
    //   949: aload #7
    //   951: iconst_1
    //   952: iaload
    //   953: aload #7
    //   955: iconst_2
    //   956: iaload
    //   957: invokestatic max : (II)I
    //   960: invokestatic max : (II)I
    //   963: invokestatic max : (II)I
    //   966: iadd
    //   967: invokestatic max : (II)I
    //   970: istore #12
    //   972: iload #18
    //   974: istore #14
    //   976: iload #12
    //   978: istore #24
    //   980: iload #9
    //   982: ifeq -> 1170
    //   985: iload #4
    //   987: ldc_w -2147483648
    //   990: if_icmpeq -> 1002
    //   993: iload #12
    //   995: istore #24
    //   997: iload #4
    //   999: ifne -> 1170
    //   1002: aload_0
    //   1003: iconst_0
    //   1004: putfield g : I
    //   1007: iconst_0
    //   1008: istore #18
    //   1010: iload #12
    //   1012: istore #24
    //   1014: iload #18
    //   1016: iload_3
    //   1017: if_icmpge -> 1170
    //   1020: aload_0
    //   1021: iload #18
    //   1023: invokevirtual s : (I)Landroid/view/View;
    //   1026: astore #22
    //   1028: aload #22
    //   1030: ifnonnull -> 1051
    //   1033: aload_0
    //   1034: aload_0
    //   1035: getfield g : I
    //   1038: aload_0
    //   1039: iload #18
    //   1041: invokevirtual y : (I)I
    //   1044: iadd
    //   1045: putfield g : I
    //   1048: goto -> 1074
    //   1051: aload #22
    //   1053: invokevirtual getVisibility : ()I
    //   1056: bipush #8
    //   1058: if_icmpne -> 1077
    //   1061: iload #18
    //   1063: aload_0
    //   1064: aload #22
    //   1066: iload #18
    //   1068: invokevirtual p : (Landroid/view/View;I)I
    //   1071: iadd
    //   1072: istore #18
    //   1074: goto -> 1164
    //   1077: aload #22
    //   1079: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1082: checkcast androidx/appcompat/widget/LinearLayoutCompat$LayoutParams
    //   1085: astore #21
    //   1087: iload #10
    //   1089: ifeq -> 1125
    //   1092: aload_0
    //   1093: aload_0
    //   1094: getfield g : I
    //   1097: aload #21
    //   1099: getfield leftMargin : I
    //   1102: iload #13
    //   1104: iadd
    //   1105: aload #21
    //   1107: getfield rightMargin : I
    //   1110: iadd
    //   1111: aload_0
    //   1112: aload #22
    //   1114: invokevirtual r : (Landroid/view/View;)I
    //   1117: iadd
    //   1118: iadd
    //   1119: putfield g : I
    //   1122: goto -> 1074
    //   1125: aload_0
    //   1126: getfield g : I
    //   1129: istore #24
    //   1131: aload_0
    //   1132: iload #24
    //   1134: iload #24
    //   1136: iload #13
    //   1138: iadd
    //   1139: aload #21
    //   1141: getfield leftMargin : I
    //   1144: iadd
    //   1145: aload #21
    //   1147: getfield rightMargin : I
    //   1150: iadd
    //   1151: aload_0
    //   1152: aload #22
    //   1154: invokevirtual r : (Landroid/view/View;)I
    //   1157: iadd
    //   1158: invokestatic max : (II)I
    //   1161: putfield g : I
    //   1164: iinc #18, 1
    //   1167: goto -> 1010
    //   1170: aload_0
    //   1171: getfield g : I
    //   1174: aload_0
    //   1175: invokevirtual getPaddingLeft : ()I
    //   1178: aload_0
    //   1179: invokevirtual getPaddingRight : ()I
    //   1182: iadd
    //   1183: iadd
    //   1184: istore #12
    //   1186: aload_0
    //   1187: iload #12
    //   1189: putfield g : I
    //   1192: iload #12
    //   1194: aload_0
    //   1195: invokevirtual getSuggestedMinimumWidth : ()I
    //   1198: invokestatic max : (II)I
    //   1201: iload_1
    //   1202: iconst_0
    //   1203: invokestatic resolveSizeAndState : (III)I
    //   1206: istore #26
    //   1208: ldc_w 16777215
    //   1211: iload #26
    //   1213: iand
    //   1214: aload_0
    //   1215: getfield g : I
    //   1218: isub
    //   1219: istore #25
    //   1221: iload #17
    //   1223: ifne -> 1355
    //   1226: iload #25
    //   1228: ifeq -> 1241
    //   1231: fload #11
    //   1233: fconst_0
    //   1234: fcmpl
    //   1235: ifle -> 1241
    //   1238: goto -> 1355
    //   1241: iload #15
    //   1243: iload #16
    //   1245: invokestatic max : (II)I
    //   1248: istore #18
    //   1250: iload #9
    //   1252: ifeq -> 1341
    //   1255: iload #4
    //   1257: ldc 1073741824
    //   1259: if_icmpeq -> 1341
    //   1262: iconst_0
    //   1263: istore #15
    //   1265: iload #15
    //   1267: iload_3
    //   1268: if_icmpge -> 1341
    //   1271: aload_0
    //   1272: iload #15
    //   1274: invokevirtual s : (I)Landroid/view/View;
    //   1277: astore #7
    //   1279: aload #7
    //   1281: ifnull -> 1335
    //   1284: aload #7
    //   1286: invokevirtual getVisibility : ()I
    //   1289: bipush #8
    //   1291: if_icmpne -> 1297
    //   1294: goto -> 1335
    //   1297: aload #7
    //   1299: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1302: checkcast androidx/appcompat/widget/LinearLayoutCompat$LayoutParams
    //   1305: getfield weight : F
    //   1308: fconst_0
    //   1309: fcmpl
    //   1310: ifle -> 1335
    //   1313: aload #7
    //   1315: iload #13
    //   1317: ldc 1073741824
    //   1319: invokestatic makeMeasureSpec : (II)I
    //   1322: aload #7
    //   1324: invokevirtual getMeasuredHeight : ()I
    //   1327: ldc 1073741824
    //   1329: invokestatic makeMeasureSpec : (II)I
    //   1332: invokevirtual measure : (II)V
    //   1335: iinc #15, 1
    //   1338: goto -> 1265
    //   1341: iload_3
    //   1342: istore #12
    //   1344: iload #24
    //   1346: istore #13
    //   1348: iload #18
    //   1350: istore #15
    //   1352: goto -> 2089
    //   1355: aload_0
    //   1356: getfield h : F
    //   1359: fstore #23
    //   1361: fload #23
    //   1363: fconst_0
    //   1364: fcmpl
    //   1365: ifle -> 1372
    //   1368: fload #23
    //   1370: fstore #11
    //   1372: aload #6
    //   1374: iconst_3
    //   1375: iconst_m1
    //   1376: iastore
    //   1377: aload #6
    //   1379: iconst_2
    //   1380: iconst_m1
    //   1381: iastore
    //   1382: aload #6
    //   1384: iconst_1
    //   1385: iconst_m1
    //   1386: iastore
    //   1387: aload #6
    //   1389: iconst_0
    //   1390: iconst_m1
    //   1391: iastore
    //   1392: aload #7
    //   1394: iconst_3
    //   1395: iconst_m1
    //   1396: iastore
    //   1397: aload #7
    //   1399: iconst_2
    //   1400: iconst_m1
    //   1401: iastore
    //   1402: aload #7
    //   1404: iconst_1
    //   1405: iconst_m1
    //   1406: iastore
    //   1407: aload #7
    //   1409: iconst_0
    //   1410: iconst_m1
    //   1411: iastore
    //   1412: aload_0
    //   1413: iconst_0
    //   1414: putfield g : I
    //   1417: iload #14
    //   1419: istore #18
    //   1421: iconst_m1
    //   1422: istore #16
    //   1424: iconst_0
    //   1425: istore #14
    //   1427: iload #19
    //   1429: istore #12
    //   1431: iload_3
    //   1432: istore #13
    //   1434: iload #18
    //   1436: istore #19
    //   1438: iload #15
    //   1440: istore #18
    //   1442: iload #25
    //   1444: istore #15
    //   1446: iload #14
    //   1448: iload #13
    //   1450: if_icmpge -> 1951
    //   1453: aload_0
    //   1454: iload #14
    //   1456: invokevirtual s : (I)Landroid/view/View;
    //   1459: astore #22
    //   1461: aload #22
    //   1463: ifnull -> 1945
    //   1466: aload #22
    //   1468: invokevirtual getVisibility : ()I
    //   1471: bipush #8
    //   1473: if_icmpne -> 1479
    //   1476: goto -> 1945
    //   1479: aload #22
    //   1481: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1484: checkcast androidx/appcompat/widget/LinearLayoutCompat$LayoutParams
    //   1487: astore #21
    //   1489: aload #21
    //   1491: getfield weight : F
    //   1494: fstore #23
    //   1496: fload #23
    //   1498: fconst_0
    //   1499: fcmpl
    //   1500: ifle -> 1663
    //   1503: iload #15
    //   1505: i2f
    //   1506: fload #23
    //   1508: fmul
    //   1509: fload #11
    //   1511: fdiv
    //   1512: f2i
    //   1513: istore #24
    //   1515: iload_2
    //   1516: aload_0
    //   1517: invokevirtual getPaddingTop : ()I
    //   1520: aload_0
    //   1521: invokevirtual getPaddingBottom : ()I
    //   1524: iadd
    //   1525: aload #21
    //   1527: getfield topMargin : I
    //   1530: iadd
    //   1531: aload #21
    //   1533: getfield bottomMargin : I
    //   1536: iadd
    //   1537: aload #21
    //   1539: getfield height : I
    //   1542: invokestatic getChildMeasureSpec : (III)I
    //   1545: istore #25
    //   1547: aload #21
    //   1549: getfield width : I
    //   1552: ifne -> 1597
    //   1555: iload #4
    //   1557: ldc 1073741824
    //   1559: if_icmpeq -> 1565
    //   1562: goto -> 1597
    //   1565: iload #24
    //   1567: ifle -> 1577
    //   1570: iload #24
    //   1572: istore #17
    //   1574: goto -> 1580
    //   1577: iconst_0
    //   1578: istore #17
    //   1580: aload #22
    //   1582: iload #17
    //   1584: ldc 1073741824
    //   1586: invokestatic makeMeasureSpec : (II)I
    //   1589: iload #25
    //   1591: invokevirtual measure : (II)V
    //   1594: goto -> 1630
    //   1597: aload #22
    //   1599: invokevirtual getMeasuredWidth : ()I
    //   1602: iload #24
    //   1604: iadd
    //   1605: istore_3
    //   1606: iload_3
    //   1607: istore #17
    //   1609: iload_3
    //   1610: ifge -> 1616
    //   1613: iconst_0
    //   1614: istore #17
    //   1616: aload #22
    //   1618: iload #17
    //   1620: ldc 1073741824
    //   1622: invokestatic makeMeasureSpec : (II)I
    //   1625: iload #25
    //   1627: invokevirtual measure : (II)V
    //   1630: iload #19
    //   1632: aload #22
    //   1634: invokevirtual getMeasuredState : ()I
    //   1637: ldc_w -16777216
    //   1640: iand
    //   1641: invokestatic combineMeasuredStates : (II)I
    //   1644: istore #19
    //   1646: fload #11
    //   1648: fload #23
    //   1650: fsub
    //   1651: fstore #11
    //   1653: iload #15
    //   1655: iload #24
    //   1657: isub
    //   1658: istore #15
    //   1660: goto -> 1663
    //   1663: iload #10
    //   1665: ifeq -> 1704
    //   1668: aload_0
    //   1669: aload_0
    //   1670: getfield g : I
    //   1673: aload #22
    //   1675: invokevirtual getMeasuredWidth : ()I
    //   1678: aload #21
    //   1680: getfield leftMargin : I
    //   1683: iadd
    //   1684: aload #21
    //   1686: getfield rightMargin : I
    //   1689: iadd
    //   1690: aload_0
    //   1691: aload #22
    //   1693: invokevirtual r : (Landroid/view/View;)I
    //   1696: iadd
    //   1697: iadd
    //   1698: putfield g : I
    //   1701: goto -> 1746
    //   1704: aload_0
    //   1705: getfield g : I
    //   1708: istore #17
    //   1710: aload_0
    //   1711: iload #17
    //   1713: aload #22
    //   1715: invokevirtual getMeasuredWidth : ()I
    //   1718: iload #17
    //   1720: iadd
    //   1721: aload #21
    //   1723: getfield leftMargin : I
    //   1726: iadd
    //   1727: aload #21
    //   1729: getfield rightMargin : I
    //   1732: iadd
    //   1733: aload_0
    //   1734: aload #22
    //   1736: invokevirtual r : (Landroid/view/View;)I
    //   1739: iadd
    //   1740: invokestatic max : (II)I
    //   1743: putfield g : I
    //   1746: iload #5
    //   1748: ldc 1073741824
    //   1750: if_icmpeq -> 1768
    //   1753: aload #21
    //   1755: getfield height : I
    //   1758: iconst_m1
    //   1759: if_icmpne -> 1768
    //   1762: iconst_1
    //   1763: istore #17
    //   1765: goto -> 1771
    //   1768: iconst_0
    //   1769: istore #17
    //   1771: aload #21
    //   1773: getfield topMargin : I
    //   1776: aload #21
    //   1778: getfield bottomMargin : I
    //   1781: iadd
    //   1782: istore #25
    //   1784: aload #22
    //   1786: invokevirtual getMeasuredHeight : ()I
    //   1789: iload #25
    //   1791: iadd
    //   1792: istore_3
    //   1793: iload #16
    //   1795: iload_3
    //   1796: invokestatic max : (II)I
    //   1799: istore #24
    //   1801: iload #17
    //   1803: ifeq -> 1813
    //   1806: iload #25
    //   1808: istore #16
    //   1810: goto -> 1816
    //   1813: iload_3
    //   1814: istore #16
    //   1816: iload #18
    //   1818: iload #16
    //   1820: invokestatic max : (II)I
    //   1823: istore #16
    //   1825: iload #12
    //   1827: ifeq -> 1845
    //   1830: aload #21
    //   1832: getfield height : I
    //   1835: iconst_m1
    //   1836: if_icmpne -> 1845
    //   1839: iconst_1
    //   1840: istore #12
    //   1842: goto -> 1848
    //   1845: iconst_0
    //   1846: istore #12
    //   1848: iload #8
    //   1850: ifeq -> 1934
    //   1853: aload #22
    //   1855: invokevirtual getBaseline : ()I
    //   1858: istore #25
    //   1860: iload #25
    //   1862: iconst_m1
    //   1863: if_icmpeq -> 1934
    //   1866: aload #21
    //   1868: getfield gravity : I
    //   1871: istore #17
    //   1873: iload #17
    //   1875: istore #18
    //   1877: iload #17
    //   1879: ifge -> 1888
    //   1882: aload_0
    //   1883: getfield f : I
    //   1886: istore #18
    //   1888: iload #18
    //   1890: bipush #112
    //   1892: iand
    //   1893: iconst_4
    //   1894: ishr
    //   1895: bipush #-2
    //   1897: iand
    //   1898: iconst_1
    //   1899: ishr
    //   1900: istore #18
    //   1902: aload #6
    //   1904: iload #18
    //   1906: aload #6
    //   1908: iload #18
    //   1910: iaload
    //   1911: iload #25
    //   1913: invokestatic max : (II)I
    //   1916: iastore
    //   1917: aload #7
    //   1919: iload #18
    //   1921: aload #7
    //   1923: iload #18
    //   1925: iaload
    //   1926: iload_3
    //   1927: iload #25
    //   1929: isub
    //   1930: invokestatic max : (II)I
    //   1933: iastore
    //   1934: iload #16
    //   1936: istore #18
    //   1938: iload #24
    //   1940: istore #16
    //   1942: goto -> 1945
    //   1945: iinc #14, 1
    //   1948: goto -> 1446
    //   1951: aload_0
    //   1952: aload_0
    //   1953: getfield g : I
    //   1956: aload_0
    //   1957: invokevirtual getPaddingLeft : ()I
    //   1960: aload_0
    //   1961: invokevirtual getPaddingRight : ()I
    //   1964: iadd
    //   1965: iadd
    //   1966: putfield g : I
    //   1969: aload #6
    //   1971: iconst_1
    //   1972: iaload
    //   1973: iconst_m1
    //   1974: if_icmpne -> 2011
    //   1977: aload #6
    //   1979: iconst_0
    //   1980: iaload
    //   1981: iconst_m1
    //   1982: if_icmpne -> 2011
    //   1985: aload #6
    //   1987: iconst_2
    //   1988: iaload
    //   1989: iconst_m1
    //   1990: if_icmpne -> 2011
    //   1993: aload #6
    //   1995: iconst_3
    //   1996: iaload
    //   1997: iconst_m1
    //   1998: if_icmpeq -> 2004
    //   2001: goto -> 2011
    //   2004: iload #16
    //   2006: istore #15
    //   2008: goto -> 2069
    //   2011: iload #16
    //   2013: aload #6
    //   2015: iconst_3
    //   2016: iaload
    //   2017: aload #6
    //   2019: iconst_0
    //   2020: iaload
    //   2021: aload #6
    //   2023: iconst_1
    //   2024: iaload
    //   2025: aload #6
    //   2027: iconst_2
    //   2028: iaload
    //   2029: invokestatic max : (II)I
    //   2032: invokestatic max : (II)I
    //   2035: invokestatic max : (II)I
    //   2038: aload #7
    //   2040: iconst_3
    //   2041: iaload
    //   2042: aload #7
    //   2044: iconst_0
    //   2045: iaload
    //   2046: aload #7
    //   2048: iconst_1
    //   2049: iaload
    //   2050: aload #7
    //   2052: iconst_2
    //   2053: iaload
    //   2054: invokestatic max : (II)I
    //   2057: invokestatic max : (II)I
    //   2060: invokestatic max : (II)I
    //   2063: iadd
    //   2064: invokestatic max : (II)I
    //   2067: istore #15
    //   2069: iload #19
    //   2071: istore #14
    //   2073: iload #12
    //   2075: istore #19
    //   2077: iload #13
    //   2079: istore #12
    //   2081: iload #15
    //   2083: istore #13
    //   2085: iload #18
    //   2087: istore #15
    //   2089: iload #19
    //   2091: ifne -> 2104
    //   2094: iload #5
    //   2096: ldc 1073741824
    //   2098: if_icmpeq -> 2104
    //   2101: goto -> 2108
    //   2104: iload #13
    //   2106: istore #15
    //   2108: aload_0
    //   2109: iload #26
    //   2111: iload #14
    //   2113: ldc_w -16777216
    //   2116: iand
    //   2117: ior
    //   2118: iload #15
    //   2120: aload_0
    //   2121: invokevirtual getPaddingTop : ()I
    //   2124: aload_0
    //   2125: invokevirtual getPaddingBottom : ()I
    //   2128: iadd
    //   2129: iadd
    //   2130: aload_0
    //   2131: invokevirtual getSuggestedMinimumHeight : ()I
    //   2134: invokestatic max : (II)I
    //   2137: iload_2
    //   2138: iload #14
    //   2140: bipush #16
    //   2142: ishl
    //   2143: invokestatic resolveSizeAndState : (III)I
    //   2146: invokevirtual setMeasuredDimension : (II)V
    //   2149: iload #20
    //   2151: ifeq -> 2161
    //   2154: aload_0
    //   2155: iload #12
    //   2157: iload_1
    //   2158: invokespecial k : (II)V
    //   2161: return
  }
  
  int y(int paramInt) {
    return 0;
  }
  
  void z(int paramInt1, int paramInt2) {
    this.g = 0;
    int i = getVirtualChildCount();
    int j = View.MeasureSpec.getMode(paramInt1);
    int k = View.MeasureSpec.getMode(paramInt2);
    int m = this.c;
    boolean bool = this.i;
    float f = 0.0F;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 1;
    boolean bool1 = false;
    while (i5 < i) {
      View view = s(i5);
      if (view == null) {
        this.g += y(i5);
      } else if (view.getVisibility() == 8) {
        i5 += p(view, i5);
      } else {
        if (t(i5))
          this.g += this.n; 
        LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
        float f1 = layoutParams.weight;
        f += f1;
        if (k == 1073741824 && layoutParams.height == 0 && f1 > 0.0F) {
          i6 = this.g;
          this.g = Math.max(i6, layoutParams.topMargin + i6 + layoutParams.bottomMargin);
          i6 = 1;
        } else {
          if (layoutParams.height == 0 && f1 > 0.0F) {
            layoutParams.height = -2;
            i10 = 0;
          } else {
            i10 = Integer.MIN_VALUE;
          } 
          if (f == 0.0F) {
            i11 = this.g;
          } else {
            i11 = 0;
          } 
          w(view, i5, paramInt1, 0, paramInt2, i11);
          if (i10 != Integer.MIN_VALUE)
            layoutParams.height = i10; 
          int i10 = view.getMeasuredHeight();
          int i11 = this.g;
          this.g = Math.max(i11, i11 + i10 + layoutParams.topMargin + layoutParams.bottomMargin + r(view));
          if (bool)
            i2 = Math.max(i10, i2); 
        } 
        int i9 = i5;
        if (m >= 0 && m == i9 + 1)
          this.d = this.g; 
        if (i9 >= m || layoutParams.weight <= 0.0F) {
          if (j != 1073741824 && layoutParams.width == -1) {
            i5 = 1;
            bool1 = true;
          } else {
            i5 = 0;
          } 
          int i10 = layoutParams.leftMargin + layoutParams.rightMargin;
          int i11 = view.getMeasuredWidth() + i10;
          i1 = Math.max(i1, i11);
          int i12 = View.combineMeasuredStates(n, view.getMeasuredState());
          if (i7 && layoutParams.width == -1) {
            n = 1;
          } else {
            n = 0;
          } 
          if (layoutParams.weight > 0.0F) {
            if (i5 == 0)
              i10 = i11; 
            i3 = Math.max(i3, i10);
            i7 = i4;
          } else {
            if (i5 == 0)
              i10 = i11; 
            i7 = Math.max(i4, i10);
          } 
          i5 = p(view, i9);
          i4 = i7;
          i10 = i12;
          i5 += i9;
          i7 = n;
          n = i10;
        } else {
          throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
        } 
      } 
      i5++;
    } 
    if (this.g > 0 && t(i))
      this.g += this.n; 
    if (bool && (k == Integer.MIN_VALUE || k == 0)) {
      this.g = 0;
      for (i5 = 0; i5 < i; i5++) {
        View view = s(i5);
        if (view == null) {
          this.g += y(i5);
        } else if (view.getVisibility() == 8) {
          i5 += p(view, i5);
        } else {
          LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
          int i9 = this.g;
          this.g = Math.max(i9, i9 + i2 + layoutParams.topMargin + layoutParams.bottomMargin + r(view));
        } 
      } 
    } 
    i5 = this.g + getPaddingTop() + getPaddingBottom();
    this.g = i5;
    int i8 = View.resolveSizeAndState(Math.max(i5, getSuggestedMinimumHeight()), paramInt2, 0);
    i5 = (0xFFFFFF & i8) - this.g;
    if (i6 != 0 || (i5 != 0 && f > 0.0F)) {
      float f1 = this.h;
      if (f1 > 0.0F)
        f = f1; 
      this.g = 0;
      i3 = i5;
      i5 = 0;
      i2 = i1;
      while (i5 < i) {
        View view = s(i5);
        if (view.getVisibility() != 8) {
          LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
          f1 = layoutParams.weight;
          if (f1 > 0.0F) {
            i1 = (int)(i3 * f1 / f);
            int i10 = getPaddingLeft();
            int i11 = getPaddingRight();
            m = layoutParams.leftMargin;
            int i13 = layoutParams.rightMargin;
            int i12 = layoutParams.width;
            i6 = i3 - i1;
            i10 = ViewGroup.getChildMeasureSpec(paramInt1, i10 + i11 + m + i13, i12);
            if (layoutParams.height != 0 || k != 1073741824) {
              i1 = view.getMeasuredHeight() + i1;
              i3 = i1;
              if (i1 < 0)
                i3 = 0; 
              view.measure(i10, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            } else {
              if (i1 > 0) {
                i3 = i1;
              } else {
                i3 = 0;
              } 
              view.measure(i10, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            } 
            n = View.combineMeasuredStates(n, view.getMeasuredState() & 0xFFFFFF00);
            f -= f1;
            i3 = i6;
          } 
          i1 = layoutParams.leftMargin + layoutParams.rightMargin;
          int i9 = view.getMeasuredWidth() + i1;
          i6 = Math.max(i2, i9);
          if (j != 1073741824 && layoutParams.width == -1) {
            i2 = 1;
          } else {
            i2 = 0;
          } 
          if (i2 != 0) {
            i2 = i1;
          } else {
            i2 = i9;
          } 
          i4 = Math.max(i4, i2);
          if (i7 != 0 && layoutParams.width == -1) {
            i7 = 1;
          } else {
            i7 = 0;
          } 
          i2 = this.g;
          this.g = Math.max(i2, view.getMeasuredHeight() + i2 + layoutParams.topMargin + layoutParams.bottomMargin + r(view));
          i2 = i6;
        } 
        i5++;
      } 
      this.g += getPaddingTop() + getPaddingBottom();
      i3 = n;
      n = i4;
    } else {
      i4 = Math.max(i4, i3);
      if (bool && k != 1073741824)
        for (i3 = 0; i3 < i; i3++) {
          View view = s(i3);
          if (view != null && view.getVisibility() != 8 && ((LayoutParams)view.getLayoutParams()).weight > 0.0F)
            view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824)); 
        }  
      i3 = n;
      n = i4;
      i2 = i1;
    } 
    if (i7 != 0 || j == 1073741824)
      n = i2; 
    setMeasuredDimension(View.resolveSizeAndState(Math.max(n + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), paramInt1, i3), i8);
    if (bool1)
      l(i, paramInt2); 
  }
  
  public static class LayoutParams extends LinearLayout.LayoutParams {
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
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/LinearLayoutCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */