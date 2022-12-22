package com.github.clans.fab;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import com.allinone.callerid.R;

public class FloatingActionMenu extends ViewGroup {
  private boolean A;
  
  private int B;
  
  private float C = 4.0F;
  
  private float D = 1.0F;
  
  private float E = 3.0F;
  
  private int F;
  
  private int G;
  
  private int H;
  
  private Drawable I;
  
  private int J;
  
  private Interpolator K;
  
  private Interpolator L;
  
  private boolean M = true;
  
  private boolean N;
  
  private int O;
  
  private int P;
  
  private int Q;
  
  private int R;
  
  private Typeface S;
  
  private boolean T = true;
  
  private ImageView U;
  
  private Animation V;
  
  private Animation W;
  
  private Animation a0;
  
  private AnimatorSet b = new AnimatorSet();
  
  private Animation b0;
  
  private AnimatorSet c = new AnimatorSet();
  
  private boolean c0;
  
  private AnimatorSet d;
  
  private int d0;
  
  private int e = a.a(getContext(), 0.0F);
  
  private h e0;
  
  private FloatingActionButton f;
  
  private ValueAnimator f0;
  
  private int g;
  
  private ValueAnimator g0;
  
  private int h = a.a(getContext(), 0.0F);
  
  private int h0;
  
  private int i = a.a(getContext(), 0.0F);
  
  private int i0;
  
  private int j;
  
  private Context j0;
  
  private boolean k;
  
  private String k0;
  
  private boolean l;
  
  private boolean l0;
  
  private Handler m = new Handler();
  
  private int n;
  
  private int o;
  
  private int p = a.a(getContext(), 4.0F);
  
  private int q = a.a(getContext(), 8.0F);
  
  private int r = a.a(getContext(), 4.0F);
  
  private int s = a.a(getContext(), 8.0F);
  
  private ColorStateList t;
  
  private float u;
  
  private int v = a.a(getContext(), 3.0F);
  
  private boolean w;
  
  private int x;
  
  private int y;
  
  private int z;
  
  public FloatingActionMenu(Context paramContext) {
    this(paramContext, null);
  }
  
  public FloatingActionMenu(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public FloatingActionMenu(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    n(paramContext, paramAttributeSet);
  }
  
  private void e(FloatingActionButton paramFloatingActionButton) {
    String str = paramFloatingActionButton.getLabelText();
    if (TextUtils.isEmpty(str))
      return; 
    Label label = new Label(this.j0);
    label.setClickable(true);
    label.setFab(paramFloatingActionButton);
    label.setShowAnimation(AnimationUtils.loadAnimation(getContext(), this.n));
    label.setHideAnimation(AnimationUtils.loadAnimation(getContext(), this.o));
    if (this.R > 0) {
      label.setTextAppearance(getContext(), this.R);
      label.setShowShadow(false);
      label.setUsingStyle(true);
    } else {
      label.w(this.x, this.y, this.z);
      label.setShowShadow(this.w);
      label.setCornerRadius(this.v);
      if (this.O > 0)
        setLabelEllipsize(label); 
      label.setMaxLines(this.P);
      label.y();
      label.setTextSize(0, this.u);
      label.setTextColor(this.t);
      int i = this.s;
      int j = this.p;
      int k = i;
      int m = j;
      if (this.w) {
        k = i + paramFloatingActionButton.getShadowRadius() + Math.abs(paramFloatingActionButton.getShadowXOffset());
        m = j + paramFloatingActionButton.getShadowRadius() + Math.abs(paramFloatingActionButton.getShadowYOffset());
      } 
      label.setPadding(k, m, this.s, this.p);
      if (this.P < 0 || this.N)
        label.setSingleLine(this.N); 
    } 
    Typeface typeface = this.S;
    if (typeface != null)
      label.setTypeface(typeface); 
    label.setText(str);
    label.setOnClickListener(paramFloatingActionButton.getOnClickListener());
    addView((View)label);
    paramFloatingActionButton.setTag(2131296696, label);
  }
  
  private int f(int paramInt) {
    double d = paramInt;
    Double.isNaN(d);
    Double.isNaN(d);
    return (int)(0.03D * d + d);
  }
  
  private void h() {
    // Byte code:
    //   0: aload_0
    //   1: getfield d0 : I
    //   4: istore_1
    //   5: ldc_w 135.0
    //   8: fstore_2
    //   9: iload_1
    //   10: ifne -> 50
    //   13: aload_0
    //   14: getfield i0 : I
    //   17: istore_1
    //   18: iload_1
    //   19: ifne -> 29
    //   22: ldc_w -135.0
    //   25: fstore_3
    //   26: goto -> 33
    //   29: ldc_w 135.0
    //   32: fstore_3
    //   33: fload_3
    //   34: fstore #4
    //   36: iload_1
    //   37: ifne -> 80
    //   40: fload_3
    //   41: fstore #4
    //   43: ldc_w -135.0
    //   46: fstore_2
    //   47: goto -> 80
    //   50: aload_0
    //   51: getfield i0 : I
    //   54: istore_1
    //   55: iload_1
    //   56: ifne -> 66
    //   59: ldc_w 135.0
    //   62: fstore_3
    //   63: goto -> 70
    //   66: ldc_w -135.0
    //   69: fstore_3
    //   70: fload_3
    //   71: fstore #4
    //   73: iload_1
    //   74: ifne -> 43
    //   77: fload_3
    //   78: fstore #4
    //   80: aload_0
    //   81: getfield U : Landroid/widget/ImageView;
    //   84: ldc_w 'rotation'
    //   87: iconst_2
    //   88: newarray float
    //   90: dup
    //   91: iconst_0
    //   92: fload #4
    //   94: fastore
    //   95: dup
    //   96: iconst_1
    //   97: fconst_0
    //   98: fastore
    //   99: invokestatic ofFloat : (Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;
    //   102: astore #5
    //   104: aload_0
    //   105: getfield U : Landroid/widget/ImageView;
    //   108: ldc_w 'rotation'
    //   111: iconst_2
    //   112: newarray float
    //   114: dup
    //   115: iconst_0
    //   116: fconst_0
    //   117: fastore
    //   118: dup
    //   119: iconst_1
    //   120: fload_2
    //   121: fastore
    //   122: invokestatic ofFloat : (Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;
    //   125: astore #6
    //   127: aload_0
    //   128: getfield b : Landroid/animation/AnimatorSet;
    //   131: aload #6
    //   133: invokevirtual play : (Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;
    //   136: pop
    //   137: aload_0
    //   138: getfield c : Landroid/animation/AnimatorSet;
    //   141: aload #5
    //   143: invokevirtual play : (Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;
    //   146: pop
    //   147: aload_0
    //   148: getfield b : Landroid/animation/AnimatorSet;
    //   151: aload_0
    //   152: getfield K : Landroid/view/animation/Interpolator;
    //   155: invokevirtual setInterpolator : (Landroid/animation/TimeInterpolator;)V
    //   158: aload_0
    //   159: getfield c : Landroid/animation/AnimatorSet;
    //   162: aload_0
    //   163: getfield L : Landroid/view/animation/Interpolator;
    //   166: invokevirtual setInterpolator : (Landroid/animation/TimeInterpolator;)V
    //   169: aload_0
    //   170: getfield b : Landroid/animation/AnimatorSet;
    //   173: ldc2_w 300
    //   176: invokevirtual setDuration : (J)Landroid/animation/AnimatorSet;
    //   179: pop
    //   180: aload_0
    //   181: getfield c : Landroid/animation/AnimatorSet;
    //   184: ldc2_w 300
    //   187: invokevirtual setDuration : (J)Landroid/animation/AnimatorSet;
    //   190: pop
    //   191: return
  }
  
  private void i() {
    for (byte b = 0; b < this.j; b++) {
      if (getChildAt(b) != this.U) {
        FloatingActionButton floatingActionButton = (FloatingActionButton)getChildAt(b);
        if (floatingActionButton.getTag(2131296696) == null) {
          e(floatingActionButton);
          FloatingActionButton floatingActionButton1 = this.f;
          if (floatingActionButton == floatingActionButton1)
            floatingActionButton1.setOnClickListener(new c(this)); 
        } 
      } 
    } 
  }
  
  private void j() {
    FloatingActionButton floatingActionButton = new FloatingActionButton(getContext());
    this.f = floatingActionButton;
    boolean bool = this.A;
    floatingActionButton.d = bool;
    if (bool) {
      floatingActionButton.f = a.a(getContext(), this.C);
      this.f.g = a.a(getContext(), this.D);
      this.f.h = a.a(getContext(), this.E);
    } 
    this.f.E(this.F, this.G, this.H);
    floatingActionButton = this.f;
    floatingActionButton.e = this.B;
    floatingActionButton.c = this.Q;
    floatingActionButton.I();
    this.f.setLabelText(this.k0);
    ImageView imageView = new ImageView(getContext());
    this.U = imageView;
    imageView.setImageDrawable(this.I);
    addView((View)this.f, super.generateDefaultLayoutParams());
    addView((View)this.U);
    h();
  }
  
  private void n(Context paramContext, AttributeSet paramAttributeSet) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.FloatingActionMenu, 0, 0);
    this.e = typedArray.getDimensionPixelSize(2, this.e);
    this.h = typedArray.getDimensionPixelSize(19, this.h);
    int i = typedArray.getInt(26, 0);
    this.i0 = i;
    if (i == 0) {
      i = 2130772025;
    } else {
      i = 2130772024;
    } 
    this.n = typedArray.getResourceId(27, i);
    if (this.i0 == 0) {
      i = 2130772027;
    } else {
      i = 2130772026;
    } 
    this.o = typedArray.getResourceId(18, i);
    this.p = typedArray.getDimensionPixelSize(25, this.p);
    this.q = typedArray.getDimensionPixelSize(24, this.q);
    this.r = typedArray.getDimensionPixelSize(22, this.r);
    this.s = typedArray.getDimensionPixelSize(23, this.s);
    ColorStateList colorStateList = typedArray.getColorStateList(31);
    this.t = colorStateList;
    if (colorStateList == null)
      this.t = ColorStateList.valueOf(-1); 
    this.u = typedArray.getDimension(32, getResources().getDimension(2131165368));
    this.v = typedArray.getDimensionPixelSize(15, this.v);
    this.w = typedArray.getBoolean(28, true);
    this.x = typedArray.getColor(12, -13421773);
    this.y = typedArray.getColor(13, -12303292);
    this.z = typedArray.getColor(14, 1728053247);
    this.A = typedArray.getBoolean(38, true);
    this.B = typedArray.getColor(34, 1711276032);
    this.C = typedArray.getDimension(35, this.C);
    this.D = typedArray.getDimension(36, this.D);
    this.E = typedArray.getDimension(37, this.E);
    this.F = typedArray.getColor(4, -2473162);
    this.G = typedArray.getColor(5, -1617853);
    this.H = typedArray.getColor(6, -1711276033);
    this.J = typedArray.getInt(0, 50);
    Drawable drawable = typedArray.getDrawable(11);
    this.I = drawable;
    if (drawable == null)
      this.I = getResources().getDrawable(2131231031); 
    this.N = typedArray.getBoolean(29, false);
    this.O = typedArray.getInt(17, 0);
    this.P = typedArray.getInt(20, -1);
    this.Q = typedArray.getInt(10, 0);
    this.R = typedArray.getResourceId(30, 0);
    String str = typedArray.getString(16);
    try {
      if (!TextUtils.isEmpty(str))
        this.S = Typeface.createFromAsset(getContext().getAssets(), str); 
      this.d0 = typedArray.getInt(33, 0);
      this.h0 = typedArray.getColor(1, 0);
      if (typedArray.hasValue(8)) {
        this.l0 = true;
        this.k0 = typedArray.getString(8);
      } 
      if (typedArray.hasValue(21))
        q(typedArray.getDimensionPixelSize(21, 0)); 
      this.K = (Interpolator)new OvershootInterpolator();
      this.L = (Interpolator)new AnticipateInterpolator();
      this.j0 = (Context)new ContextThemeWrapper(getContext(), this.R);
      o();
      j();
      p(typedArray);
      typedArray.recycle();
      return;
    } catch (RuntimeException runtimeException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to load specified custom font: ");
      stringBuilder.append(str);
      throw new IllegalArgumentException(stringBuilder.toString(), runtimeException);
    } 
  }
  
  private void o() {
    int i = Color.alpha(this.h0);
    int j = Color.red(this.h0);
    int k = Color.green(this.h0);
    int m = Color.blue(this.h0);
    ValueAnimator valueAnimator = ValueAnimator.ofInt(new int[] { 0, i });
    this.f0 = valueAnimator;
    valueAnimator.setDuration(300L);
    this.f0.addUpdateListener(new a(this, j, k, m));
    valueAnimator = ValueAnimator.ofInt(new int[] { i, 0 });
    this.g0 = valueAnimator;
    valueAnimator.setDuration(300L);
    this.g0.addUpdateListener(new b(this, j, k, m));
  }
  
  private void p(TypedArray paramTypedArray) {
    int i = paramTypedArray.getResourceId(9, 2130772023);
    setMenuButtonShowAnimation(AnimationUtils.loadAnimation(getContext(), i));
    this.a0 = AnimationUtils.loadAnimation(getContext(), i);
    i = paramTypedArray.getResourceId(7, 2130772022);
    setMenuButtonHideAnimation(AnimationUtils.loadAnimation(getContext(), i));
    this.b0 = AnimationUtils.loadAnimation(getContext(), i);
  }
  
  private void q(int paramInt) {
    this.p = paramInt;
    this.q = paramInt;
    this.r = paramInt;
    this.s = paramInt;
  }
  
  private boolean r() {
    boolean bool;
    if (this.h0 != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void setLabelEllipsize(Label paramLabel) {
    int i = this.O;
    if (i != 1) {
      if (i != 2) {
        if (i != 3) {
          if (i == 4)
            paramLabel.setEllipsize(TextUtils.TruncateAt.MARQUEE); 
        } else {
          paramLabel.setEllipsize(TextUtils.TruncateAt.END);
        } 
      } else {
        paramLabel.setEllipsize(TextUtils.TruncateAt.MIDDLE);
      } 
    } else {
      paramLabel.setEllipsize(TextUtils.TruncateAt.START);
    } 
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return paramLayoutParams instanceof ViewGroup.MarginLayoutParams;
  }
  
  public void g(boolean paramBoolean) {
    if (s()) {
      if (r())
        this.g0.start(); 
      if (this.T) {
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
          animatorSet.start();
        } else {
          this.c.start();
          this.b.cancel();
        } 
      } 
      byte b = 0;
      this.l = false;
      int i = 0;
      int j;
      for (j = 0; b < getChildCount(); j = m) {
        View view = getChildAt(b);
        int k = i;
        int m = j;
        if (view instanceof FloatingActionButton) {
          k = i;
          m = j;
          if (view.getVisibility() != 8) {
            k = i + 1;
            FloatingActionButton floatingActionButton = (FloatingActionButton)view;
            this.m.postDelayed(new f(this, floatingActionButton, paramBoolean), j);
            m = j + this.J;
          } 
        } 
        b++;
        i = k;
      } 
      this.m.postDelayed(new g(this), ((i + 1) * this.J));
    } 
  }
  
  public int getAnimationDelayPerItem() {
    return this.J;
  }
  
  public AnimatorSet getIconToggleAnimatorSet() {
    return this.d;
  }
  
  public int getMenuButtonColorNormal() {
    return this.F;
  }
  
  public int getMenuButtonColorPressed() {
    return this.G;
  }
  
  public int getMenuButtonColorRipple() {
    return this.H;
  }
  
  public String getMenuButtonLabelText() {
    return this.k0;
  }
  
  public ImageView getMenuIconView() {
    return this.U;
  }
  
  protected ViewGroup.MarginLayoutParams k() {
    return new ViewGroup.MarginLayoutParams(-2, -2);
  }
  
  public ViewGroup.MarginLayoutParams l(AttributeSet paramAttributeSet) {
    return new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.MarginLayoutParams m(ViewGroup.LayoutParams paramLayoutParams) {
    return new ViewGroup.MarginLayoutParams(paramLayoutParams);
  }
  
  protected void onFinishInflate() {
    super.onFinishInflate();
    bringChildToFront((View)this.f);
    bringChildToFront((View)this.U);
    this.j = getChildCount();
    i();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    boolean bool;
    if (this.i0 == 0) {
      paramInt3 = paramInt3 - paramInt1 - this.g / 2 - getPaddingRight();
    } else {
      paramInt3 = this.g / 2 + getPaddingLeft();
    } 
    if (this.d0 == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      paramInt1 = paramInt4 - paramInt2 - this.f.getMeasuredHeight() - getPaddingBottom();
    } else {
      paramInt1 = getPaddingTop();
    } 
    paramInt2 = paramInt3 - this.f.getMeasuredWidth() / 2;
    FloatingActionButton floatingActionButton = this.f;
    floatingActionButton.layout(paramInt2, paramInt1, floatingActionButton.getMeasuredWidth() + paramInt2, this.f.getMeasuredHeight() + paramInt1);
    paramInt2 = paramInt3 - this.U.getMeasuredWidth() / 2;
    paramInt4 = this.f.getMeasuredHeight() / 2 + paramInt1 - this.U.getMeasuredHeight() / 2;
    ImageView imageView = this.U;
    imageView.layout(paramInt2, paramInt4, imageView.getMeasuredWidth() + paramInt2, this.U.getMeasuredHeight() + paramInt4);
    paramInt2 = paramInt1;
    if (bool)
      paramInt2 = paramInt1 + this.f.getMeasuredHeight() + this.e; 
    paramInt4 = this.j - 1;
    paramInt1 = paramInt2;
    while (paramInt4 >= 0) {
      View view = getChildAt(paramInt4);
      if (view != this.U) {
        FloatingActionButton floatingActionButton1 = (FloatingActionButton)view;
        if (floatingActionButton1.getVisibility() != 8) {
          paramInt2 = paramInt3 - floatingActionButton1.getMeasuredWidth() / 2;
          int i = paramInt1;
          if (bool)
            i = paramInt1 - floatingActionButton1.getMeasuredHeight() - this.e; 
          if (floatingActionButton1 != this.f) {
            floatingActionButton1.layout(paramInt2, i, floatingActionButton1.getMeasuredWidth() + paramInt2, floatingActionButton1.getMeasuredHeight() + i);
            if (!this.l)
              floatingActionButton1.u(false); 
          } 
          View view1 = (View)floatingActionButton1.getTag(2131296696);
          if (view1 != null) {
            int k;
            if (this.l0) {
              paramInt1 = this.g;
            } else {
              paramInt1 = floatingActionButton1.getMeasuredWidth();
            } 
            paramInt1 = paramInt1 / 2 + this.h;
            paramInt2 = this.i0;
            if (paramInt2 == 0) {
              paramInt1 = paramInt3 - paramInt1;
            } else {
              paramInt1 += paramInt3;
            } 
            if (paramInt2 == 0) {
              paramInt2 = paramInt1 - view1.getMeasuredWidth();
            } else {
              paramInt2 = view1.getMeasuredWidth() + paramInt1;
            } 
            int j = this.i0;
            if (j == 0) {
              k = paramInt2;
            } else {
              k = paramInt1;
            } 
            if (j != 0)
              paramInt1 = paramInt2; 
            paramInt2 = i - this.i + (floatingActionButton1.getMeasuredHeight() - view1.getMeasuredHeight()) / 2;
            view1.layout(k, paramInt2, paramInt1, view1.getMeasuredHeight() + paramInt2);
            if (!this.l)
              view1.setVisibility(4); 
          } 
          if (bool) {
            paramInt1 = i - this.e;
          } else {
            paramInt1 = i + view.getMeasuredHeight() + this.e;
          } 
        } 
      } 
      paramInt4--;
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    this.g = 0;
    measureChildWithMargins((View)this.U, paramInt1, 0, paramInt2, 0);
    int i;
    for (i = 0; i < this.j; i++) {
      View view = getChildAt(i);
      if (view.getVisibility() != 8 && view != this.U) {
        measureChildWithMargins(view, paramInt1, 0, paramInt2, 0);
        this.g = Math.max(this.g, view.getMeasuredWidth());
      } 
    } 
    int j = 0;
    byte b = 0;
    i = 0;
    while (true) {
      int k = this.j;
      boolean bool = true;
      if (b < k) {
        View view = getChildAt(b);
        int m = j;
        k = i;
        if (view.getVisibility() != 8)
          if (view == this.U) {
            m = j;
            k = i;
          } else {
            int n = view.getMeasuredWidth();
            m = view.getMeasuredHeight();
            Label label = (Label)view.getTag(2131296696);
            k = i;
            if (label != null) {
              int i1 = this.g;
              int i2 = view.getMeasuredWidth();
              if (this.l0) {
                k = bool;
              } else {
                k = 2;
              } 
              k = (i1 - i2) / k;
              measureChildWithMargins((View)label, paramInt1, view.getMeasuredWidth() + label.n() + this.h + k, paramInt2, 0);
              k = Math.max(i, n + 0 + label.getMeasuredWidth() + k);
            } 
            m = j + m;
          }  
        b++;
        j = m;
        i = k;
        continue;
      } 
      i = Math.max(this.g, i + this.h) + getPaddingLeft() + getPaddingRight();
      k = f(j + this.e * (this.j - 1) + getPaddingTop() + getPaddingBottom());
      if ((getLayoutParams()).width == -1)
        i = ViewGroup.getDefaultSize(getSuggestedMinimumWidth(), paramInt1); 
      paramInt1 = k;
      if ((getLayoutParams()).height == -1)
        paramInt1 = ViewGroup.getDefaultSize(getSuggestedMinimumHeight(), paramInt2); 
      setMeasuredDimension(i, paramInt1);
      return;
    } 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (this.c0) {
      boolean bool = false;
      int i = paramMotionEvent.getAction();
      if (i != 0) {
        if (i == 1) {
          g(this.M);
          bool = true;
        } 
      } else {
        bool = s();
      } 
      return bool;
    } 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public boolean s() {
    return this.k;
  }
  
  public void setAnimated(boolean paramBoolean) {
    long l2;
    this.M = paramBoolean;
    AnimatorSet animatorSet = this.b;
    long l1 = 300L;
    if (paramBoolean) {
      l2 = 300L;
    } else {
      l2 = 0L;
    } 
    animatorSet.setDuration(l2);
    animatorSet = this.c;
    if (paramBoolean) {
      l2 = l1;
    } else {
      l2 = 0L;
    } 
    animatorSet.setDuration(l2);
  }
  
  public void setAnimationDelayPerItem(int paramInt) {
    this.J = paramInt;
  }
  
  public void setClosedOnTouchOutside(boolean paramBoolean) {
    this.c0 = paramBoolean;
  }
  
  public void setContentDescription(String paramString) {
    FloatingActionButton floatingActionButton = this.f;
    if (floatingActionButton != null)
      floatingActionButton.setContentDescription(paramString); 
  }
  
  public void setIconAnimated(boolean paramBoolean) {
    this.T = paramBoolean;
  }
  
  public void setIconAnimationCloseInterpolator(Interpolator paramInterpolator) {
    this.c.setInterpolator((TimeInterpolator)paramInterpolator);
  }
  
  public void setIconAnimationInterpolator(Interpolator paramInterpolator) {
    this.b.setInterpolator((TimeInterpolator)paramInterpolator);
    this.c.setInterpolator((TimeInterpolator)paramInterpolator);
  }
  
  public void setIconAnimationOpenInterpolator(Interpolator paramInterpolator) {
    this.b.setInterpolator((TimeInterpolator)paramInterpolator);
  }
  
  public void setIconToggleAnimatorSet(AnimatorSet paramAnimatorSet) {
    this.d = paramAnimatorSet;
  }
  
  public void setMenuButtonColorNormal(int paramInt) {
    this.F = paramInt;
    this.f.setColorNormal(paramInt);
  }
  
  public void setMenuButtonColorNormalResId(int paramInt) {
    this.F = getResources().getColor(paramInt);
    this.f.setColorNormalResId(paramInt);
  }
  
  public void setMenuButtonColorPressed(int paramInt) {
    this.G = paramInt;
    this.f.setColorPressed(paramInt);
  }
  
  public void setMenuButtonColorPressedResId(int paramInt) {
    this.G = getResources().getColor(paramInt);
    this.f.setColorPressedResId(paramInt);
  }
  
  public void setMenuButtonColorRipple(int paramInt) {
    this.H = paramInt;
    this.f.setColorRipple(paramInt);
  }
  
  public void setMenuButtonColorRippleResId(int paramInt) {
    this.H = getResources().getColor(paramInt);
    this.f.setColorRippleResId(paramInt);
  }
  
  public void setMenuButtonHideAnimation(Animation paramAnimation) {
    this.W = paramAnimation;
    this.f.setHideAnimation(paramAnimation);
  }
  
  public void setMenuButtonLabelText(String paramString) {
    this.f.setLabelText(paramString);
  }
  
  public void setMenuButtonShowAnimation(Animation paramAnimation) {
    this.V = paramAnimation;
    this.f.setShowAnimation(paramAnimation);
  }
  
  public void setOnMenuButtonClickListener(View.OnClickListener paramOnClickListener) {
    this.f.setOnClickListener(paramOnClickListener);
  }
  
  public void setOnMenuButtonLongClickListener(View.OnLongClickListener paramOnLongClickListener) {
    this.f.setOnLongClickListener(paramOnLongClickListener);
  }
  
  public void setOnMenuToggleListener(h paramh) {
    this.e0 = paramh;
  }
  
  public void t(boolean paramBoolean) {
    if (!s()) {
      if (r())
        this.f0.start(); 
      if (this.T) {
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
          animatorSet.start();
        } else {
          this.c.cancel();
          this.b.start();
        } 
      } 
      this.l = true;
      int i = getChildCount() - 1;
      int j = 0;
      int k;
      for (k = 0; i >= 0; k = n) {
        View view = getChildAt(i);
        int m = j;
        int n = k;
        if (view instanceof FloatingActionButton) {
          m = j;
          n = k;
          if (view.getVisibility() != 8) {
            m = j + 1;
            FloatingActionButton floatingActionButton = (FloatingActionButton)view;
            this.m.postDelayed(new d(this, floatingActionButton, paramBoolean), k);
            n = k + this.J;
          } 
        } 
        i--;
        j = m;
      } 
      this.m.postDelayed(new e(this), ((j + 1) * this.J));
    } 
  }
  
  public void u(boolean paramBoolean) {
    if (s()) {
      g(paramBoolean);
    } else {
      t(paramBoolean);
    } 
  }
  
  class a implements ValueAnimator.AnimatorUpdateListener {
    a(FloatingActionMenu this$0, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      Integer integer = (Integer)param1ValueAnimator.getAnimatedValue();
      this.d.setBackgroundColor(Color.argb(integer.intValue(), this.a, this.b, this.c));
    }
  }
  
  class b implements ValueAnimator.AnimatorUpdateListener {
    b(FloatingActionMenu this$0, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      Integer integer = (Integer)param1ValueAnimator.getAnimatedValue();
      this.d.setBackgroundColor(Color.argb(integer.intValue(), this.a, this.b, this.c));
    }
  }
  
  class c implements View.OnClickListener {
    c(FloatingActionMenu this$0) {}
    
    public void onClick(View param1View) {
      FloatingActionMenu floatingActionMenu = this.b;
      floatingActionMenu.u(FloatingActionMenu.a(floatingActionMenu));
    }
  }
  
  class d implements Runnable {
    d(FloatingActionMenu this$0, FloatingActionButton param1FloatingActionButton, boolean param1Boolean) {}
    
    public void run() {
      if (this.d.s())
        return; 
      if (this.b != FloatingActionMenu.b(this.d))
        this.b.H(this.c); 
      Label label = (Label)this.b.getTag(2131296696);
      if (label != null && label.r())
        label.x(this.c); 
    }
  }
  
  class e implements Runnable {
    e(FloatingActionMenu this$0) {}
    
    public void run() {
      FloatingActionMenu.c(this.b, true);
      if (FloatingActionMenu.d(this.b) != null)
        FloatingActionMenu.d(this.b).a(true); 
    }
  }
  
  class f implements Runnable {
    f(FloatingActionMenu this$0, FloatingActionButton param1FloatingActionButton, boolean param1Boolean) {}
    
    public void run() {
      if (!this.d.s())
        return; 
      if (this.b != FloatingActionMenu.b(this.d))
        this.b.u(this.c); 
      Label label = (Label)this.b.getTag(2131296696);
      if (label != null && label.r())
        label.q(this.c); 
    }
  }
  
  class g implements Runnable {
    g(FloatingActionMenu this$0) {}
    
    public void run() {
      FloatingActionMenu.c(this.b, false);
      if (FloatingActionMenu.d(this.b) != null)
        FloatingActionMenu.d(this.b).a(false); 
    }
  }
  
  public static interface h {
    void a(boolean param1Boolean);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/clans/fab/FloatingActionMenu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */