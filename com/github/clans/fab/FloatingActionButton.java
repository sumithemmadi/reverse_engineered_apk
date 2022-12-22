package com.github.clans.fab;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.Xfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import com.allinone.callerid.R;

public class FloatingActionButton extends ImageButton {
  private static final Xfermode b = (Xfermode)new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
  
  private float A = -1.0F;
  
  private float B = -1.0F;
  
  private boolean C;
  
  private RectF D = new RectF();
  
  private Paint E = new Paint(1);
  
  private Paint F = new Paint(1);
  
  private boolean G;
  
  private long H;
  
  private float I = 195.0F;
  
  private long J = 0L;
  
  private double K;
  
  private boolean L = true;
  
  private int M = 16;
  
  private float N;
  
  private float O;
  
  private float P;
  
  private int Q;
  
  private boolean R;
  
  private boolean S;
  
  private boolean T;
  
  private int U = 100;
  
  private boolean V;
  
  GestureDetector W = new GestureDetector(getContext(), (GestureDetector.OnGestureListener)new b(this));
  
  int c;
  
  boolean d;
  
  int e;
  
  int f = a.a(getContext(), 4.0F);
  
  int g = a.a(getContext(), 1.0F);
  
  int h = a.a(getContext(), 3.0F);
  
  private int i;
  
  private int j;
  
  private int k;
  
  private int l;
  
  private Drawable m;
  
  private int n = a.a(getContext(), 24.0F);
  
  private Animation o;
  
  private Animation p;
  
  private String q;
  
  private View.OnClickListener r;
  
  private Drawable s;
  
  private boolean t;
  
  private boolean u;
  
  private boolean v;
  
  private int w = a.a(getContext(), 6.0F);
  
  private int x;
  
  private int y;
  
  private boolean z;
  
  public FloatingActionButton(Context paramContext) {
    this(paramContext, null);
  }
  
  public FloatingActionButton(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public FloatingActionButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    v(paramContext, paramAttributeSet, paramInt);
  }
  
  private void D() {
    if (!this.C) {
      if (this.A == -1.0F)
        this.A = getX(); 
      if (this.B == -1.0F)
        this.B = getY(); 
      this.C = true;
    } 
  }
  
  private void F() {
    this.E.setColor(this.y);
    this.E.setStyle(Paint.Style.STROKE);
    this.E.setStrokeWidth(this.w);
    this.F.setColor(this.x);
    this.F.setStyle(Paint.Style.STROKE);
    this.F.setStrokeWidth(this.w);
  }
  
  private void G() {
    byte b;
    boolean bool = t();
    int i = 0;
    if (bool) {
      b = getShadowX();
    } else {
      b = 0;
    } 
    if (t())
      i = getShadowY(); 
    int j = this.w;
    this.D = new RectF((j / 2 + b), (j / 2 + i), (o() - b - this.w / 2), (n() - i - this.w / 2));
  }
  
  private void J() {
    float f1;
    float f2;
    if (this.v) {
      if (this.A > getX()) {
        f1 = getX() + this.w;
      } else {
        f1 = getX() - this.w;
      } 
      if (this.B > getY()) {
        float f = getY() + this.w;
        f2 = f1;
        f1 = f;
      } else {
        float f = getY() - this.w;
        f2 = f1;
        f1 = f;
      } 
    } else {
      f2 = this.A;
      f1 = this.B;
    } 
    setX(f2);
    setY(f1);
  }
  
  private void K(long paramLong) {
    long l = this.J;
    if (l >= 200L) {
      double d1 = this.K;
      double d2 = paramLong;
      Double.isNaN(d2);
      d1 += d2;
      this.K = d1;
      if (d1 > 500.0D) {
        this.K = d1 - 500.0D;
        this.J = 0L;
        this.L ^= 0x1;
      } 
      float f1 = (float)Math.cos((this.K / 500.0D + 1.0D) * Math.PI) / 2.0F + 0.5F;
      float f2 = (270 - this.M);
      if (this.L) {
        this.N = f1 * f2;
      } else {
        f2 *= 1.0F - f1;
        this.O += this.N - f2;
        this.N = f2;
      } 
    } else {
      this.J = l + paramLong;
    } 
  }
  
  private int getCircleSize() {
    int i;
    Resources resources = getResources();
    if (this.c == 0) {
      i = 2131165351;
    } else {
      i = 2131165350;
    } 
    return resources.getDimensionPixelSize(i);
  }
  
  private int getShadowX() {
    return this.f + Math.abs(this.g);
  }
  
  private int getShadowY() {
    return this.f + Math.abs(this.h);
  }
  
  private float l() {
    return (getMeasuredWidth() / 2);
  }
  
  private float m() {
    return (getMeasuredHeight() / 2);
  }
  
  private int n() {
    int i = getCircleSize() + p();
    int j = i;
    if (this.v)
      j = i + this.w * 2; 
    return j;
  }
  
  private int o() {
    int i = getCircleSize() + q();
    int j = i;
    if (this.v)
      j = i + this.w * 2; 
    return j;
  }
  
  private Drawable r(int paramInt) {
    d d = new d((Shape)new OvalShape(), null);
    d.getPaint().setColor(paramInt);
    return (Drawable)d;
  }
  
  @TargetApi(21)
  private Drawable s() {
    RippleDrawable rippleDrawable;
    StateListDrawable stateListDrawable = new StateListDrawable();
    Drawable drawable = r(this.k);
    stateListDrawable.addState(new int[] { -16842910 }, drawable);
    drawable = r(this.j);
    stateListDrawable.addState(new int[] { 16842919 }, drawable);
    drawable = r(this.i);
    stateListDrawable.addState(new int[0], drawable);
    if (a.c()) {
      int i = this.l;
      rippleDrawable = new RippleDrawable(new ColorStateList(new int[][] { {} }, new int[] { i }), (Drawable)stateListDrawable, null);
      setOutlineProvider(new a(this));
      setClipToOutline(true);
      this.s = (Drawable)rippleDrawable;
      return (Drawable)rippleDrawable;
    } 
    this.s = (Drawable)rippleDrawable;
    return (Drawable)rippleDrawable;
  }
  
  @TargetApi(16)
  private void setBackgroundCompat(Drawable paramDrawable) {
    if (a.b()) {
      setBackground(paramDrawable);
    } else {
      setBackgroundDrawable(paramDrawable);
    } 
  }
  
  private void v(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.FloatingActionButtonNew, paramInt, 0);
    this.i = typedArray.getColor(1, -2473162);
    this.j = typedArray.getColor(2, -1617853);
    this.k = typedArray.getColor(0, -5592406);
    this.l = typedArray.getColor(3, -1711276033);
    this.d = typedArray.getBoolean(18, true);
    this.e = typedArray.getColor(13, 1711276032);
    this.f = typedArray.getDimensionPixelSize(14, this.f);
    this.g = typedArray.getDimensionPixelSize(15, this.g);
    this.h = typedArray.getDimensionPixelSize(16, this.h);
    this.c = typedArray.getInt(19, 0);
    this.q = typedArray.getString(6);
    this.S = typedArray.getBoolean(10, false);
    this.x = typedArray.getColor(9, -16738680);
    this.y = typedArray.getColor(8, 1291845632);
    this.U = typedArray.getInt(11, this.U);
    this.V = typedArray.getBoolean(12, true);
    if (typedArray.hasValue(7)) {
      this.Q = typedArray.getInt(7, 0);
      this.T = true;
    } 
    if (typedArray.hasValue(4)) {
      float f = typedArray.getDimensionPixelOffset(4, 0);
      if (isInEditMode()) {
        setElevation(f);
      } else {
        setElevationCompat(f);
      } 
    } 
    x(typedArray);
    w(typedArray);
    typedArray.recycle();
    if (isInEditMode())
      if (this.S) {
        setIndeterminate(true);
      } else if (this.T) {
        D();
        setProgress(this.Q, false);
      }  
    setClickable(true);
  }
  
  private void w(TypedArray paramTypedArray) {
    int i = paramTypedArray.getResourceId(5, 2130772022);
    this.p = AnimationUtils.loadAnimation(getContext(), i);
  }
  
  private void x(TypedArray paramTypedArray) {
    int i = paramTypedArray.getResourceId(17, 2130772023);
    this.o = AnimationUtils.loadAnimation(getContext(), i);
  }
  
  @TargetApi(21)
  void A() {
    Drawable drawable = this.s;
    if (drawable instanceof StateListDrawable) {
      ((StateListDrawable)drawable).setState(new int[] { 16842910 });
    } else if (a.c()) {
      RippleDrawable rippleDrawable = (RippleDrawable)this.s;
      rippleDrawable.setState(new int[] { 16842910 });
      rippleDrawable.setHotspot(l(), m());
      rippleDrawable.setVisible(true, true);
    } 
  }
  
  void B() {
    this.o.cancel();
    startAnimation(this.p);
  }
  
  void C() {
    this.p.cancel();
    startAnimation(this.o);
  }
  
  void E(int paramInt1, int paramInt2, int paramInt3) {
    this.i = paramInt1;
    this.j = paramInt2;
    this.l = paramInt3;
  }
  
  public void H(boolean paramBoolean) {
    if (y()) {
      if (paramBoolean)
        C(); 
      super.setVisibility(0);
    } 
  }
  
  void I() {
    LayerDrawable layerDrawable;
    boolean bool = t();
    int i = 0;
    if (bool) {
      layerDrawable = new LayerDrawable(new Drawable[] { new e(null), s(), getIconDrawable() });
    } else {
      layerDrawable = new LayerDrawable(new Drawable[] { s(), getIconDrawable() });
    } 
    int j = -1;
    if (getIconDrawable() != null)
      j = Math.max(getIconDrawable().getIntrinsicWidth(), getIconDrawable().getIntrinsicHeight()); 
    int k = getCircleSize();
    if (j <= 0)
      j = this.n; 
    int m = (k - j) / 2;
    if (t()) {
      j = this.f + Math.abs(this.g);
    } else {
      j = 0;
    } 
    if (t())
      i = this.f + Math.abs(this.h); 
    int n = i;
    k = j;
    if (this.v) {
      n = this.w;
      k = j + n;
      n = i + n;
    } 
    if (t()) {
      j = 2;
    } else {
      j = 1;
    } 
    i = k + m;
    k = n + m;
    layerDrawable.setLayerInset(j, i, k, i, k);
    setBackgroundCompat((Drawable)layerDrawable);
  }
  
  public int getButtonSize() {
    return this.c;
  }
  
  public int getColorDisabled() {
    return this.k;
  }
  
  public int getColorNormal() {
    return this.i;
  }
  
  public int getColorPressed() {
    return this.j;
  }
  
  public int getColorRipple() {
    return this.l;
  }
  
  Animation getHideAnimation() {
    return this.p;
  }
  
  protected Drawable getIconDrawable() {
    Drawable drawable = this.m;
    return (Drawable)((drawable != null) ? drawable : new ColorDrawable(0));
  }
  
  public String getLabelText() {
    return this.q;
  }
  
  Label getLabelView() {
    return (Label)getTag(2131296696);
  }
  
  public int getLabelVisibility() {
    Label label = getLabelView();
    return (label != null) ? label.getVisibility() : -1;
  }
  
  public int getMax() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield U : I
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  View.OnClickListener getOnClickListener() {
    return this.r;
  }
  
  public int getProgress() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield G : Z
    //   6: ifeq -> 14
    //   9: iconst_0
    //   10: istore_1
    //   11: goto -> 19
    //   14: aload_0
    //   15: getfield Q : I
    //   18: istore_1
    //   19: aload_0
    //   20: monitorexit
    //   21: iload_1
    //   22: ireturn
    //   23: astore_2
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_2
    //   27: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	23	finally
    //   14	19	23	finally
  }
  
  public int getShadowColor() {
    return this.e;
  }
  
  public int getShadowRadius() {
    return this.f;
  }
  
  public int getShadowXOffset() {
    return this.g;
  }
  
  public int getShadowYOffset() {
    return this.h;
  }
  
  Animation getShowAnimation() {
    return this.o;
  }
  
  protected void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    if (this.v) {
      if (this.V)
        paramCanvas.drawArc(this.D, 360.0F, 360.0F, false, this.E); 
      boolean bool1 = false;
      boolean bool = this.G;
      boolean bool2 = true;
      if (bool) {
        long l = SystemClock.uptimeMillis() - this.H;
        float f1 = (float)l * this.I / 1000.0F;
        K(l);
        f1 = this.O + f1;
        this.O = f1;
        if (f1 > 360.0F)
          this.O = f1 - 360.0F; 
        this.H = SystemClock.uptimeMillis();
        float f2 = this.O;
        f1 = this.M;
        float f3 = this.N;
        if (isInEditMode()) {
          f2 = 0.0F;
          f1 = 135.0F;
        } else {
          f2 -= 90.0F;
          f1 += f3;
        } 
        paramCanvas.drawArc(this.D, f2, f1, false, this.F);
      } else {
        bool2 = bool1;
        if (this.O != this.P) {
          float f1 = (float)(SystemClock.uptimeMillis() - this.H) / 1000.0F * this.I;
          float f2 = this.O;
          float f3 = this.P;
          if (f2 > f3) {
            this.O = Math.max(f2 - f1, f3);
          } else {
            this.O = Math.min(f2 + f1, f3);
          } 
          this.H = SystemClock.uptimeMillis();
          bool2 = true;
        } 
        paramCanvas.drawArc(this.D, -90.0F, this.O, false, this.F);
      } 
      if (bool2)
        invalidate(); 
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    setMeasuredDimension(o(), n());
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof ProgressSavedState)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    ProgressSavedState progressSavedState = (ProgressSavedState)paramParcelable;
    super.onRestoreInstanceState(progressSavedState.getSuperState());
    this.O = progressSavedState.b;
    this.P = progressSavedState.c;
    this.I = progressSavedState.d;
    this.w = progressSavedState.f;
    this.x = progressSavedState.g;
    this.y = progressSavedState.h;
    this.S = progressSavedState.l;
    this.T = progressSavedState.m;
    this.Q = progressSavedState.e;
    this.R = progressSavedState.n;
    this.V = progressSavedState.o;
    this.H = SystemClock.uptimeMillis();
  }
  
  public Parcelable onSaveInstanceState() {
    ProgressSavedState progressSavedState = new ProgressSavedState(super.onSaveInstanceState());
    progressSavedState.b = this.O;
    progressSavedState.c = this.P;
    progressSavedState.d = this.I;
    progressSavedState.f = this.w;
    progressSavedState.g = this.x;
    progressSavedState.h = this.y;
    boolean bool = this.G;
    progressSavedState.l = bool;
    if (this.v && this.Q > 0 && !bool) {
      bool = true;
    } else {
      bool = false;
    } 
    progressSavedState.m = bool;
    progressSavedState.e = this.Q;
    progressSavedState.n = this.R;
    progressSavedState.o = this.V;
    return (Parcelable)progressSavedState;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    D();
    if (this.S) {
      setIndeterminate(true);
      this.S = false;
    } else if (this.T) {
      setProgress(this.Q, this.R);
      this.T = false;
    } else if (this.z) {
      J();
      this.z = false;
    } 
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    G();
    F();
    I();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (this.r != null && isEnabled()) {
      Label label = (Label)getTag(2131296696);
      if (label == null)
        return super.onTouchEvent(paramMotionEvent); 
      int i = paramMotionEvent.getAction();
      if (i != 1) {
        if (i == 3) {
          label.t();
          A();
        } 
      } else {
        label.t();
        A();
      } 
      this.W.onTouchEvent(paramMotionEvent);
    } 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  int p() {
    boolean bool;
    if (t()) {
      bool = getShadowY() * 2;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  int q() {
    boolean bool;
    if (t()) {
      bool = getShadowX() * 2;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void setButtonSize(int paramInt) {
    if (paramInt == 0 || paramInt == 1) {
      if (this.c != paramInt) {
        this.c = paramInt;
        I();
      } 
      return;
    } 
    throw new IllegalArgumentException("Use @FabSize constants only!");
  }
  
  public void setColorDisabled(int paramInt) {
    if (paramInt != this.k) {
      this.k = paramInt;
      I();
    } 
  }
  
  public void setColorDisabledResId(int paramInt) {
    setColorDisabled(getResources().getColor(paramInt));
  }
  
  public void setColorNormal(int paramInt) {
    if (this.i != paramInt) {
      this.i = paramInt;
      I();
    } 
  }
  
  public void setColorNormalResId(int paramInt) {
    setColorNormal(getResources().getColor(paramInt));
  }
  
  public void setColorPressed(int paramInt) {
    if (paramInt != this.j) {
      this.j = paramInt;
      I();
    } 
  }
  
  public void setColorPressedResId(int paramInt) {
    setColorPressed(getResources().getColor(paramInt));
  }
  
  public void setColorRipple(int paramInt) {
    if (paramInt != this.l) {
      this.l = paramInt;
      I();
    } 
  }
  
  public void setColorRippleResId(int paramInt) {
    setColorRipple(getResources().getColor(paramInt));
  }
  
  public void setElevation(float paramFloat) {
    if (a.c() && paramFloat > 0.0F) {
      super.setElevation(paramFloat);
      if (!isInEditMode()) {
        this.t = true;
        this.d = false;
      } 
      I();
    } 
  }
  
  @TargetApi(21)
  public void setElevationCompat(float paramFloat) {
    this.e = 637534208;
    float f = paramFloat / 2.0F;
    this.f = Math.round(f);
    this.g = 0;
    if (this.c == 0)
      f = paramFloat; 
    this.h = Math.round(f);
    if (a.c()) {
      super.setElevation(paramFloat);
      this.u = true;
      this.d = false;
      I();
      ViewGroup.LayoutParams layoutParams = getLayoutParams();
      if (layoutParams != null)
        setLayoutParams(layoutParams); 
    } else {
      this.d = true;
      I();
    } 
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    Label label = (Label)getTag(2131296696);
    if (label != null)
      label.setEnabled(paramBoolean); 
  }
  
  public void setHideAnimation(Animation paramAnimation) {
    this.p = paramAnimation;
  }
  
  public void setImageDrawable(Drawable paramDrawable) {
    if (this.m != paramDrawable) {
      this.m = paramDrawable;
      I();
    } 
  }
  
  public void setImageResource(int paramInt) {
    Drawable drawable = getResources().getDrawable(paramInt);
    if (this.m != drawable) {
      this.m = drawable;
      I();
    } 
  }
  
  public void setIndeterminate(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: ifne -> 11
    //   6: aload_0
    //   7: fconst_0
    //   8: putfield O : F
    //   11: aload_0
    //   12: iload_1
    //   13: putfield v : Z
    //   16: aload_0
    //   17: iconst_1
    //   18: putfield z : Z
    //   21: aload_0
    //   22: iload_1
    //   23: putfield G : Z
    //   26: aload_0
    //   27: invokestatic uptimeMillis : ()J
    //   30: putfield H : J
    //   33: aload_0
    //   34: invokespecial G : ()V
    //   37: aload_0
    //   38: invokevirtual I : ()V
    //   41: aload_0
    //   42: monitorexit
    //   43: return
    //   44: astore_2
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_2
    //   48: athrow
    // Exception table:
    //   from	to	target	type
    //   6	11	44	finally
    //   11	41	44	finally
  }
  
  public void setLabelColors(int paramInt1, int paramInt2, int paramInt3) {
    Label label = getLabelView();
    int i = label.getPaddingLeft();
    int j = label.getPaddingTop();
    int k = label.getPaddingRight();
    int m = label.getPaddingBottom();
    label.w(paramInt1, paramInt2, paramInt3);
    label.y();
    label.setPadding(i, j, k, m);
  }
  
  public void setLabelText(String paramString) {
    this.q = paramString;
    Label label = getLabelView();
    if (label != null)
      label.setText(paramString); 
  }
  
  public void setLabelTextColor(int paramInt) {
    getLabelView().setTextColor(paramInt);
  }
  
  public void setLabelTextColor(ColorStateList paramColorStateList) {
    getLabelView().setTextColor(paramColorStateList);
  }
  
  public void setLabelTextType(Typeface paramTypeface) {
    getLabelView().setTypeface(paramTypeface);
  }
  
  public void setLabelVisibility(int paramInt) {
    Label label = getLabelView();
    if (label != null) {
      boolean bool;
      label.setVisibility(paramInt);
      if (paramInt == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      label.setHandleVisibilityChanges(bool);
    } 
  }
  
  @TargetApi(21)
  public void setLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    if (paramLayoutParams instanceof ViewGroup.MarginLayoutParams && this.u) {
      ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramLayoutParams;
      marginLayoutParams.leftMargin += getShadowX();
      marginLayoutParams.topMargin += getShadowY();
      marginLayoutParams.rightMargin += getShadowX();
      marginLayoutParams.bottomMargin += getShadowY();
    } 
    super.setLayoutParams(paramLayoutParams);
  }
  
  public void setMax(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_1
    //   4: putfield U : I
    //   7: aload_0
    //   8: monitorexit
    //   9: return
    //   10: astore_2
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_2
    //   14: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	10	finally
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener) {
    super.setOnClickListener(paramOnClickListener);
    this.r = paramOnClickListener;
    View view = (View)getTag(2131296696);
    if (view != null)
      view.setOnClickListener(new c(this)); 
  }
  
  public void setProgress(int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield G : Z
    //   6: istore_3
    //   7: iload_3
    //   8: ifeq -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: iload_1
    //   16: putfield Q : I
    //   19: aload_0
    //   20: iload_2
    //   21: putfield R : Z
    //   24: aload_0
    //   25: getfield C : Z
    //   28: ifne -> 39
    //   31: aload_0
    //   32: iconst_1
    //   33: putfield T : Z
    //   36: aload_0
    //   37: monitorexit
    //   38: return
    //   39: aload_0
    //   40: iconst_1
    //   41: putfield v : Z
    //   44: aload_0
    //   45: iconst_1
    //   46: putfield z : Z
    //   49: aload_0
    //   50: invokespecial G : ()V
    //   53: aload_0
    //   54: invokespecial D : ()V
    //   57: aload_0
    //   58: invokevirtual I : ()V
    //   61: iload_1
    //   62: ifge -> 71
    //   65: iconst_0
    //   66: istore #4
    //   68: goto -> 90
    //   71: aload_0
    //   72: getfield U : I
    //   75: istore #5
    //   77: iload_1
    //   78: istore #4
    //   80: iload_1
    //   81: iload #5
    //   83: if_icmple -> 90
    //   86: iload #5
    //   88: istore #4
    //   90: iload #4
    //   92: i2f
    //   93: fstore #6
    //   95: aload_0
    //   96: getfield P : F
    //   99: fstore #7
    //   101: fload #6
    //   103: fload #7
    //   105: fcmpl
    //   106: ifne -> 112
    //   109: aload_0
    //   110: monitorexit
    //   111: return
    //   112: aload_0
    //   113: getfield U : I
    //   116: istore_1
    //   117: iload_1
    //   118: ifle -> 135
    //   121: fload #6
    //   123: iload_1
    //   124: i2f
    //   125: fdiv
    //   126: ldc_w 360.0
    //   129: fmul
    //   130: fstore #6
    //   132: goto -> 138
    //   135: fconst_0
    //   136: fstore #6
    //   138: aload_0
    //   139: fload #6
    //   141: putfield P : F
    //   144: aload_0
    //   145: invokestatic uptimeMillis : ()J
    //   148: putfield H : J
    //   151: iload_2
    //   152: ifne -> 163
    //   155: aload_0
    //   156: aload_0
    //   157: getfield P : F
    //   160: putfield O : F
    //   163: aload_0
    //   164: invokevirtual invalidate : ()V
    //   167: aload_0
    //   168: monitorexit
    //   169: return
    //   170: astore #8
    //   172: aload_0
    //   173: monitorexit
    //   174: aload #8
    //   176: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	170	finally
    //   14	36	170	finally
    //   39	61	170	finally
    //   71	77	170	finally
    //   95	101	170	finally
    //   112	117	170	finally
    //   138	151	170	finally
    //   155	163	170	finally
    //   163	167	170	finally
  }
  
  public void setShadowColor(int paramInt) {
    if (this.e != paramInt) {
      this.e = paramInt;
      I();
    } 
  }
  
  public void setShadowColorResource(int paramInt) {
    paramInt = getResources().getColor(paramInt);
    if (this.e != paramInt) {
      this.e = paramInt;
      I();
    } 
  }
  
  public void setShadowRadius(float paramFloat) {
    this.f = a.a(getContext(), paramFloat);
    requestLayout();
    I();
  }
  
  public void setShadowRadius(int paramInt) {
    paramInt = getResources().getDimensionPixelSize(paramInt);
    if (this.f != paramInt) {
      this.f = paramInt;
      requestLayout();
      I();
    } 
  }
  
  public void setShadowXOffset(float paramFloat) {
    this.g = a.a(getContext(), paramFloat);
    requestLayout();
    I();
  }
  
  public void setShadowXOffset(int paramInt) {
    paramInt = getResources().getDimensionPixelSize(paramInt);
    if (this.g != paramInt) {
      this.g = paramInt;
      requestLayout();
      I();
    } 
  }
  
  public void setShadowYOffset(float paramFloat) {
    this.h = a.a(getContext(), paramFloat);
    requestLayout();
    I();
  }
  
  public void setShadowYOffset(int paramInt) {
    paramInt = getResources().getDimensionPixelSize(paramInt);
    if (this.h != paramInt) {
      this.h = paramInt;
      requestLayout();
      I();
    } 
  }
  
  public void setShowAnimation(Animation paramAnimation) {
    this.o = paramAnimation;
  }
  
  public void setShowProgressBackground(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_1
    //   4: putfield V : Z
    //   7: aload_0
    //   8: monitorexit
    //   9: return
    //   10: astore_2
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_2
    //   14: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	10	finally
  }
  
  public void setShowShadow(boolean paramBoolean) {
    if (this.d != paramBoolean) {
      this.d = paramBoolean;
      I();
    } 
  }
  
  public void setVisibility(int paramInt) {
    super.setVisibility(paramInt);
    Label label = (Label)getTag(2131296696);
    if (label != null)
      label.setVisibility(paramInt); 
  }
  
  public boolean t() {
    boolean bool;
    if (!this.t && this.d) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void u(boolean paramBoolean) {
    if (!y()) {
      if (paramBoolean)
        B(); 
      super.setVisibility(4);
    } 
  }
  
  public boolean y() {
    boolean bool;
    if (getVisibility() == 4) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  @TargetApi(21)
  void z() {
    Drawable drawable = this.s;
    if (drawable instanceof StateListDrawable) {
      ((StateListDrawable)drawable).setState(new int[] { 16842910, 16842919 });
    } else if (a.c()) {
      RippleDrawable rippleDrawable = (RippleDrawable)this.s;
      rippleDrawable.setState(new int[] { 16842910, 16842919 });
      rippleDrawable.setHotspot(l(), m());
      rippleDrawable.setVisible(true, true);
    } 
  }
  
  static class ProgressSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<ProgressSavedState> CREATOR = new a();
    
    float b;
    
    float c;
    
    float d;
    
    int e;
    
    int f;
    
    int g;
    
    int h;
    
    boolean i;
    
    boolean j;
    
    boolean k;
    
    boolean l;
    
    boolean m;
    
    boolean n;
    
    boolean o;
    
    private ProgressSavedState(Parcel param1Parcel) {
      super(param1Parcel);
      boolean bool2;
      this.b = param1Parcel.readFloat();
      this.c = param1Parcel.readFloat();
      int i = param1Parcel.readInt();
      boolean bool1 = true;
      if (i != 0) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      this.i = bool2;
      this.d = param1Parcel.readFloat();
      this.e = param1Parcel.readInt();
      this.f = param1Parcel.readInt();
      this.g = param1Parcel.readInt();
      this.h = param1Parcel.readInt();
      if (param1Parcel.readInt() != 0) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      this.j = bool2;
      if (param1Parcel.readInt() != 0) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      this.k = bool2;
      if (param1Parcel.readInt() != 0) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      this.l = bool2;
      if (param1Parcel.readInt() != 0) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      this.m = bool2;
      if (param1Parcel.readInt() != 0) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      this.n = bool2;
      if (param1Parcel.readInt() != 0) {
        bool2 = bool1;
      } else {
        bool2 = false;
      } 
      this.o = bool2;
    }
    
    ProgressSavedState(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeFloat(this.b);
      param1Parcel.writeFloat(this.c);
      param1Parcel.writeInt(this.i);
      param1Parcel.writeFloat(this.d);
      param1Parcel.writeInt(this.e);
      param1Parcel.writeInt(this.f);
      param1Parcel.writeInt(this.g);
      param1Parcel.writeInt(this.h);
      param1Parcel.writeInt(this.j);
      param1Parcel.writeInt(this.k);
      param1Parcel.writeInt(this.l);
      param1Parcel.writeInt(this.m);
      param1Parcel.writeInt(this.n);
      param1Parcel.writeInt(this.o);
    }
    
    static final class a implements Parcelable.Creator<ProgressSavedState> {
      public FloatingActionButton.ProgressSavedState a(Parcel param2Parcel) {
        return new FloatingActionButton.ProgressSavedState(param2Parcel, null);
      }
      
      public FloatingActionButton.ProgressSavedState[] b(int param2Int) {
        return new FloatingActionButton.ProgressSavedState[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.Creator<ProgressSavedState> {
    public FloatingActionButton.ProgressSavedState a(Parcel param1Parcel) {
      return new FloatingActionButton.ProgressSavedState(param1Parcel, null);
    }
    
    public FloatingActionButton.ProgressSavedState[] b(int param1Int) {
      return new FloatingActionButton.ProgressSavedState[param1Int];
    }
  }
  
  class a extends ViewOutlineProvider {
    a(FloatingActionButton this$0) {}
    
    public void getOutline(View param1View, Outline param1Outline) {
      param1Outline.setOval(0, 0, param1View.getWidth(), param1View.getHeight());
    }
  }
  
  class b extends GestureDetector.SimpleOnGestureListener {
    b(FloatingActionButton this$0) {}
    
    public boolean onDown(MotionEvent param1MotionEvent) {
      Label label = (Label)this.b.getTag(2131296696);
      if (label != null)
        label.s(); 
      this.b.z();
      return super.onDown(param1MotionEvent);
    }
    
    public boolean onSingleTapUp(MotionEvent param1MotionEvent) {
      Label label = (Label)this.b.getTag(2131296696);
      if (label != null)
        label.t(); 
      this.b.A();
      return super.onSingleTapUp(param1MotionEvent);
    }
  }
  
  class c implements View.OnClickListener {
    c(FloatingActionButton this$0) {}
    
    public void onClick(View param1View) {
      if (FloatingActionButton.c(this.b) != null)
        FloatingActionButton.c(this.b).onClick((View)this.b); 
    }
  }
  
  private class d extends ShapeDrawable {
    private int a;
    
    private int b;
    
    private d(FloatingActionButton this$0, Shape param1Shape) {
      super(param1Shape);
      boolean bool = FloatingActionButton.this.t();
      byte b = 0;
      if (bool) {
        i = FloatingActionButton.this.f + Math.abs(FloatingActionButton.this.g);
      } else {
        i = 0;
      } 
      this.a = i;
      int i = b;
      if (FloatingActionButton.this.t()) {
        i = FloatingActionButton.this.f;
        i = Math.abs(FloatingActionButton.this.h) + i;
      } 
      this.b = i;
      if (FloatingActionButton.d(FloatingActionButton.this)) {
        this.a += FloatingActionButton.e(FloatingActionButton.this);
        this.b += FloatingActionButton.e(FloatingActionButton.this);
      } 
    }
    
    public void draw(Canvas param1Canvas) {
      setBounds(this.a, this.b, FloatingActionButton.f(this.c) - this.a, FloatingActionButton.g(this.c) - this.b);
      super.draw(param1Canvas);
    }
  }
  
  private class e extends Drawable {
    private Paint a = new Paint(1);
    
    private Paint b = new Paint(1);
    
    private float c;
    
    private e(FloatingActionButton this$0) {
      a();
    }
    
    private void a() {
      this.d.setLayerType(1, null);
      this.a.setStyle(Paint.Style.FILL);
      this.a.setColor(FloatingActionButton.h(this.d));
      this.b.setXfermode(FloatingActionButton.i());
      if (!this.d.isInEditMode()) {
        Paint paint = this.a;
        FloatingActionButton floatingActionButton = this.d;
        paint.setShadowLayer(floatingActionButton.f, floatingActionButton.g, floatingActionButton.h, floatingActionButton.e);
      } 
      this.c = (FloatingActionButton.j(this.d) / 2);
      if (FloatingActionButton.d(this.d) && FloatingActionButton.k(this.d))
        this.c += FloatingActionButton.e(this.d); 
    }
    
    public void draw(Canvas param1Canvas) {
      param1Canvas.drawCircle(FloatingActionButton.a(this.d), FloatingActionButton.b(this.d), this.c, this.a);
      param1Canvas.drawCircle(FloatingActionButton.a(this.d), FloatingActionButton.b(this.d), this.c, this.b);
    }
    
    public int getOpacity() {
      return 0;
    }
    
    public void setAlpha(int param1Int) {}
    
    public void setColorFilter(ColorFilter param1ColorFilter) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/clans/fab/FloatingActionButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */