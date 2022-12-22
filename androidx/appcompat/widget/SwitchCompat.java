package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.widget.i;
import b.a.h;
import b.a.j;
import b.h.k.w;

public class SwitchCompat extends CompoundButton {
  private static final Property<SwitchCompat, Float> b = new a(Float.class, "thumbPos");
  
  private static final int[] c = new int[] { 16842912 };
  
  float A;
  
  private int B;
  
  private int C;
  
  private int D;
  
  private int E;
  
  private int F;
  
  private int G;
  
  private int H;
  
  private final TextPaint I;
  
  private ColorStateList J;
  
  private Layout K;
  
  private Layout L;
  
  private TransformationMethod M;
  
  ObjectAnimator N;
  
  private final m O;
  
  private final Rect P = new Rect();
  
  private Drawable d;
  
  private ColorStateList e = null;
  
  private PorterDuff.Mode f = null;
  
  private boolean g = false;
  
  private boolean h = false;
  
  private Drawable i;
  
  private ColorStateList j = null;
  
  private PorterDuff.Mode k = null;
  
  private boolean l = false;
  
  private boolean m = false;
  
  private int n;
  
  private int o;
  
  private int p;
  
  private boolean q;
  
  private CharSequence r;
  
  private CharSequence s;
  
  private boolean t;
  
  private int u;
  
  private int v;
  
  private float w;
  
  private float x;
  
  private VelocityTracker y = VelocityTracker.obtain();
  
  private int z;
  
  public SwitchCompat(Context paramContext) {
    this(paramContext, null);
  }
  
  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.a.a.switchStyle);
  }
  
  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    z.a((View)this, getContext());
    TextPaint textPaint = new TextPaint(1);
    this.I = textPaint;
    textPaint.density = (getResources().getDisplayMetrics()).density;
    int[] arrayOfInt = j.SwitchCompat;
    e0 e0 = e0.v(paramContext, paramAttributeSet, arrayOfInt, paramInt, 0);
    w.p0((View)this, paramContext, arrayOfInt, paramAttributeSet, e0.r(), paramInt, 0);
    Drawable drawable = e0.g(j.SwitchCompat_android_thumb);
    this.d = drawable;
    if (drawable != null)
      drawable.setCallback((Drawable.Callback)this); 
    drawable = e0.g(j.SwitchCompat_track);
    this.i = drawable;
    if (drawable != null)
      drawable.setCallback((Drawable.Callback)this); 
    this.r = e0.p(j.SwitchCompat_android_textOn);
    this.s = e0.p(j.SwitchCompat_android_textOff);
    this.t = e0.a(j.SwitchCompat_showText, true);
    this.n = e0.f(j.SwitchCompat_thumbTextPadding, 0);
    this.o = e0.f(j.SwitchCompat_switchMinWidth, 0);
    this.p = e0.f(j.SwitchCompat_switchPadding, 0);
    this.q = e0.a(j.SwitchCompat_splitTrack, false);
    ColorStateList colorStateList2 = e0.c(j.SwitchCompat_thumbTint);
    if (colorStateList2 != null) {
      this.e = colorStateList2;
      this.g = true;
    } 
    PorterDuff.Mode mode2 = q.e(e0.k(j.SwitchCompat_thumbTintMode, -1), null);
    if (this.f != mode2) {
      this.f = mode2;
      this.h = true;
    } 
    if (this.g || this.h)
      b(); 
    ColorStateList colorStateList1 = e0.c(j.SwitchCompat_trackTint);
    if (colorStateList1 != null) {
      this.j = colorStateList1;
      this.l = true;
    } 
    PorterDuff.Mode mode1 = q.e(e0.k(j.SwitchCompat_trackTintMode, -1), null);
    if (this.k != mode1) {
      this.k = mode1;
      this.m = true;
    } 
    if (this.l || this.m)
      c(); 
    int i = e0.n(j.SwitchCompat_switchTextAppearance, 0);
    if (i != 0)
      setSwitchTextAppearance(paramContext, i); 
    m m1 = new m((TextView)this);
    this.O = m1;
    m1.m(paramAttributeSet, paramInt);
    e0.w();
    ViewConfiguration viewConfiguration = ViewConfiguration.get(paramContext);
    this.v = viewConfiguration.getScaledTouchSlop();
    this.z = viewConfiguration.getScaledMinimumFlingVelocity();
    refreshDrawableState();
    setChecked(isChecked());
  }
  
  private void a(boolean paramBoolean) {
    float f;
    if (paramBoolean) {
      f = 1.0F;
    } else {
      f = 0.0F;
    } 
    ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(this, b, new float[] { f });
    this.N = objectAnimator;
    objectAnimator.setDuration(250L);
    if (Build.VERSION.SDK_INT >= 18)
      this.N.setAutoCancel(true); 
    this.N.start();
  }
  
  private void b() {
    Drawable drawable = this.d;
    if (drawable != null && (this.g || this.h)) {
      drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
      this.d = drawable;
      if (this.g)
        androidx.core.graphics.drawable.a.o(drawable, this.e); 
      if (this.h)
        androidx.core.graphics.drawable.a.p(this.d, this.f); 
      if (this.d.isStateful())
        this.d.setState(getDrawableState()); 
    } 
  }
  
  private void c() {
    Drawable drawable = this.i;
    if (drawable != null && (this.l || this.m)) {
      drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
      this.i = drawable;
      if (this.l)
        androidx.core.graphics.drawable.a.o(drawable, this.j); 
      if (this.m)
        androidx.core.graphics.drawable.a.p(this.i, this.k); 
      if (this.i.isStateful())
        this.i.setState(getDrawableState()); 
    } 
  }
  
  private void d() {
    ObjectAnimator objectAnimator = this.N;
    if (objectAnimator != null)
      objectAnimator.cancel(); 
  }
  
  private void e(MotionEvent paramMotionEvent) {
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    paramMotionEvent.setAction(3);
    super.onTouchEvent(paramMotionEvent);
    paramMotionEvent.recycle();
  }
  
  private static float f(float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramFloat1 >= paramFloat2) {
      paramFloat2 = paramFloat1;
      if (paramFloat1 > paramFloat3)
        paramFloat2 = paramFloat3; 
    } 
    return paramFloat2;
  }
  
  private boolean g(float paramFloat1, float paramFloat2) {
    Drawable drawable = this.d;
    boolean bool1 = false;
    if (drawable == null)
      return false; 
    int i = getThumbOffset();
    this.d.getPadding(this.P);
    int j = this.F;
    int k = this.v;
    int n = this.E + i - k;
    i = this.D;
    Rect rect = this.P;
    int i1 = rect.left;
    int i2 = rect.right;
    int i3 = this.H;
    boolean bool2 = bool1;
    if (paramFloat1 > n) {
      bool2 = bool1;
      if (paramFloat1 < (i + n + i1 + i2 + k)) {
        bool2 = bool1;
        if (paramFloat2 > (j - k)) {
          bool2 = bool1;
          if (paramFloat2 < (i3 + k))
            bool2 = true; 
        } 
      } 
    } 
    return bool2;
  }
  
  private boolean getTargetCheckedState() {
    boolean bool;
    if (this.A > 0.5F) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private int getThumbOffset() {
    float f;
    if (k0.b((View)this)) {
      f = 1.0F - this.A;
    } else {
      f = this.A;
    } 
    return (int)(f * getThumbScrollRange() + 0.5F);
  }
  
  private int getThumbScrollRange() {
    Drawable drawable = this.i;
    if (drawable != null) {
      Rect rect1;
      Rect rect2 = this.P;
      drawable.getPadding(rect2);
      drawable = this.d;
      if (drawable != null) {
        rect1 = q.d(drawable);
      } else {
        rect1 = q.c;
      } 
      return this.B - this.D - rect2.left - rect2.right - rect1.left - rect1.right;
    } 
    return 0;
  }
  
  private Layout h(CharSequence paramCharSequence) {
    boolean bool;
    TransformationMethod transformationMethod = this.M;
    CharSequence charSequence = paramCharSequence;
    if (transformationMethod != null)
      charSequence = transformationMethod.getTransformation(paramCharSequence, (View)this); 
    TextPaint textPaint = this.I;
    if (charSequence != null) {
      bool = (int)Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
    } else {
      bool = false;
    } 
    return (Layout)new StaticLayout(charSequence, textPaint, bool, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
  }
  
  private void i() {
    if (Build.VERSION.SDK_INT >= 30) {
      CharSequence charSequence1 = this.s;
      CharSequence charSequence2 = charSequence1;
      if (charSequence1 == null)
        charSequence2 = getResources().getString(h.abc_capital_off); 
      w.I0((View)this, charSequence2);
    } 
  }
  
  private void j() {
    if (Build.VERSION.SDK_INT >= 30) {
      CharSequence charSequence1 = this.r;
      CharSequence charSequence2 = charSequence1;
      if (charSequence1 == null)
        charSequence2 = getResources().getString(h.abc_capital_on); 
      w.I0((View)this, charSequence2);
    } 
  }
  
  private void k(int paramInt1, int paramInt2) {
    Typeface typeface;
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        if (paramInt1 != 3) {
          typeface = null;
        } else {
          typeface = Typeface.MONOSPACE;
        } 
      } else {
        typeface = Typeface.SERIF;
      } 
    } else {
      typeface = Typeface.SANS_SERIF;
    } 
    setSwitchTypeface(typeface, paramInt2);
  }
  
  private void l(MotionEvent paramMotionEvent) {
    this.u = 0;
    int i = paramMotionEvent.getAction();
    boolean bool1 = true;
    if (i == 1 && isEnabled()) {
      i = 1;
    } else {
      i = 0;
    } 
    boolean bool2 = isChecked();
    if (i != 0) {
      this.y.computeCurrentVelocity(1000);
      float f = this.y.getXVelocity();
      if (Math.abs(f) > this.z) {
        if (k0.b((View)this) ? (f < 0.0F) : (f > 0.0F))
          bool1 = false; 
      } else {
        bool1 = getTargetCheckedState();
      } 
    } else {
      bool1 = bool2;
    } 
    if (bool1 != bool2)
      playSoundEffect(0); 
    setChecked(bool1);
    e(paramMotionEvent);
  }
  
  public void draw(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: getfield P : Landroid/graphics/Rect;
    //   4: astore_2
    //   5: aload_0
    //   6: getfield E : I
    //   9: istore_3
    //   10: aload_0
    //   11: getfield F : I
    //   14: istore #4
    //   16: aload_0
    //   17: getfield G : I
    //   20: istore #5
    //   22: aload_0
    //   23: getfield H : I
    //   26: istore #6
    //   28: aload_0
    //   29: invokespecial getThumbOffset : ()I
    //   32: iload_3
    //   33: iadd
    //   34: istore #7
    //   36: aload_0
    //   37: getfield d : Landroid/graphics/drawable/Drawable;
    //   40: astore #8
    //   42: aload #8
    //   44: ifnull -> 57
    //   47: aload #8
    //   49: invokestatic d : (Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;
    //   52: astore #8
    //   54: goto -> 62
    //   57: getstatic androidx/appcompat/widget/q.c : Landroid/graphics/Rect;
    //   60: astore #8
    //   62: aload_0
    //   63: getfield i : Landroid/graphics/drawable/Drawable;
    //   66: astore #9
    //   68: iload #7
    //   70: istore #10
    //   72: aload #9
    //   74: ifnull -> 281
    //   77: aload #9
    //   79: aload_2
    //   80: invokevirtual getPadding : (Landroid/graphics/Rect;)Z
    //   83: pop
    //   84: aload_2
    //   85: getfield left : I
    //   88: istore #11
    //   90: iload #7
    //   92: iload #11
    //   94: iadd
    //   95: istore #12
    //   97: aload #8
    //   99: ifnull -> 247
    //   102: aload #8
    //   104: getfield left : I
    //   107: istore #7
    //   109: iload_3
    //   110: istore #10
    //   112: iload #7
    //   114: iload #11
    //   116: if_icmple -> 128
    //   119: iload_3
    //   120: iload #7
    //   122: iload #11
    //   124: isub
    //   125: iadd
    //   126: istore #10
    //   128: aload #8
    //   130: getfield top : I
    //   133: istore #11
    //   135: aload_2
    //   136: getfield top : I
    //   139: istore #7
    //   141: iload #11
    //   143: iload #7
    //   145: if_icmple -> 161
    //   148: iload #11
    //   150: iload #7
    //   152: isub
    //   153: iload #4
    //   155: iadd
    //   156: istore #7
    //   158: goto -> 165
    //   161: iload #4
    //   163: istore #7
    //   165: aload #8
    //   167: getfield right : I
    //   170: istore #13
    //   172: aload_2
    //   173: getfield right : I
    //   176: istore_3
    //   177: iload #5
    //   179: istore #11
    //   181: iload #13
    //   183: iload_3
    //   184: if_icmple -> 196
    //   187: iload #5
    //   189: iload #13
    //   191: iload_3
    //   192: isub
    //   193: isub
    //   194: istore #11
    //   196: aload #8
    //   198: getfield bottom : I
    //   201: istore #14
    //   203: aload_2
    //   204: getfield bottom : I
    //   207: istore #15
    //   209: iload #10
    //   211: istore_3
    //   212: iload #11
    //   214: istore #5
    //   216: iload #7
    //   218: istore #13
    //   220: iload #14
    //   222: iload #15
    //   224: if_icmple -> 251
    //   227: iload #6
    //   229: iload #14
    //   231: iload #15
    //   233: isub
    //   234: isub
    //   235: istore #5
    //   237: iload #10
    //   239: istore_3
    //   240: iload #5
    //   242: istore #10
    //   244: goto -> 263
    //   247: iload #4
    //   249: istore #13
    //   251: iload #6
    //   253: istore #10
    //   255: iload #13
    //   257: istore #7
    //   259: iload #5
    //   261: istore #11
    //   263: aload_0
    //   264: getfield i : Landroid/graphics/drawable/Drawable;
    //   267: iload_3
    //   268: iload #7
    //   270: iload #11
    //   272: iload #10
    //   274: invokevirtual setBounds : (IIII)V
    //   277: iload #12
    //   279: istore #10
    //   281: aload_0
    //   282: getfield d : Landroid/graphics/drawable/Drawable;
    //   285: astore #8
    //   287: aload #8
    //   289: ifnull -> 361
    //   292: aload #8
    //   294: aload_2
    //   295: invokevirtual getPadding : (Landroid/graphics/Rect;)Z
    //   298: pop
    //   299: iload #10
    //   301: aload_2
    //   302: getfield left : I
    //   305: isub
    //   306: istore #7
    //   308: iload #10
    //   310: aload_0
    //   311: getfield D : I
    //   314: iadd
    //   315: aload_2
    //   316: getfield right : I
    //   319: iadd
    //   320: istore #10
    //   322: aload_0
    //   323: getfield d : Landroid/graphics/drawable/Drawable;
    //   326: iload #7
    //   328: iload #4
    //   330: iload #10
    //   332: iload #6
    //   334: invokevirtual setBounds : (IIII)V
    //   337: aload_0
    //   338: invokevirtual getBackground : ()Landroid/graphics/drawable/Drawable;
    //   341: astore #8
    //   343: aload #8
    //   345: ifnull -> 361
    //   348: aload #8
    //   350: iload #7
    //   352: iload #4
    //   354: iload #10
    //   356: iload #6
    //   358: invokestatic l : (Landroid/graphics/drawable/Drawable;IIII)V
    //   361: aload_0
    //   362: aload_1
    //   363: invokespecial draw : (Landroid/graphics/Canvas;)V
    //   366: return
  }
  
  public void drawableHotspotChanged(float paramFloat1, float paramFloat2) {
    if (Build.VERSION.SDK_INT >= 21)
      super.drawableHotspotChanged(paramFloat1, paramFloat2); 
    Drawable drawable = this.d;
    if (drawable != null)
      androidx.core.graphics.drawable.a.k(drawable, paramFloat1, paramFloat2); 
    drawable = this.i;
    if (drawable != null)
      androidx.core.graphics.drawable.a.k(drawable, paramFloat1, paramFloat2); 
  }
  
  protected void drawableStateChanged() {
    boolean bool;
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    Drawable drawable = this.d;
    int i = 0;
    int j = i;
    if (drawable != null) {
      j = i;
      if (drawable.isStateful())
        j = false | drawable.setState(arrayOfInt); 
    } 
    drawable = this.i;
    i = j;
    if (drawable != null) {
      i = j;
      if (drawable.isStateful())
        bool = j | drawable.setState(arrayOfInt); 
    } 
    if (bool)
      invalidate(); 
  }
  
  public int getCompoundPaddingLeft() {
    if (!k0.b((View)this))
      return super.getCompoundPaddingLeft(); 
    int i = super.getCompoundPaddingLeft() + this.B;
    int j = i;
    if (!TextUtils.isEmpty(getText()))
      j = i + this.p; 
    return j;
  }
  
  public int getCompoundPaddingRight() {
    if (k0.b((View)this))
      return super.getCompoundPaddingRight(); 
    int i = super.getCompoundPaddingRight() + this.B;
    int j = i;
    if (!TextUtils.isEmpty(getText()))
      j = i + this.p; 
    return j;
  }
  
  public boolean getShowText() {
    return this.t;
  }
  
  public boolean getSplitTrack() {
    return this.q;
  }
  
  public int getSwitchMinWidth() {
    return this.o;
  }
  
  public int getSwitchPadding() {
    return this.p;
  }
  
  public CharSequence getTextOff() {
    return this.s;
  }
  
  public CharSequence getTextOn() {
    return this.r;
  }
  
  public Drawable getThumbDrawable() {
    return this.d;
  }
  
  public int getThumbTextPadding() {
    return this.n;
  }
  
  public ColorStateList getThumbTintList() {
    return this.e;
  }
  
  public PorterDuff.Mode getThumbTintMode() {
    return this.f;
  }
  
  public Drawable getTrackDrawable() {
    return this.i;
  }
  
  public ColorStateList getTrackTintList() {
    return this.j;
  }
  
  public PorterDuff.Mode getTrackTintMode() {
    return this.k;
  }
  
  public void jumpDrawablesToCurrentState() {
    super.jumpDrawablesToCurrentState();
    Drawable drawable = this.d;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
    drawable = this.i;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
    ObjectAnimator objectAnimator = this.N;
    if (objectAnimator != null && objectAnimator.isStarted()) {
      this.N.end();
      this.N = null;
    } 
  }
  
  protected int[] onCreateDrawableState(int paramInt) {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (isChecked())
      CompoundButton.mergeDrawableStates(arrayOfInt, c); 
    return arrayOfInt;
  }
  
  protected void onDraw(Canvas paramCanvas) {
    Layout layout;
    super.onDraw(paramCanvas);
    Rect rect = this.P;
    Drawable drawable1 = this.i;
    if (drawable1 != null) {
      drawable1.getPadding(rect);
    } else {
      rect.setEmpty();
    } 
    int i = this.F;
    int j = this.H;
    int k = rect.top;
    int n = rect.bottom;
    Drawable drawable2 = this.d;
    if (drawable1 != null)
      if (this.q && drawable2 != null) {
        Rect rect1 = q.d(drawable2);
        drawable2.copyBounds(rect);
        rect.left += rect1.left;
        rect.right -= rect1.right;
        int i2 = paramCanvas.save();
        paramCanvas.clipRect(rect, Region.Op.DIFFERENCE);
        drawable1.draw(paramCanvas);
        paramCanvas.restoreToCount(i2);
      } else {
        drawable1.draw(paramCanvas);
      }  
    int i1 = paramCanvas.save();
    if (drawable2 != null)
      drawable2.draw(paramCanvas); 
    if (getTargetCheckedState()) {
      layout = this.K;
    } else {
      layout = this.L;
    } 
    if (layout != null) {
      int[] arrayOfInt = getDrawableState();
      ColorStateList colorStateList = this.J;
      if (colorStateList != null)
        this.I.setColor(colorStateList.getColorForState(arrayOfInt, 0)); 
      this.I.drawableState = arrayOfInt;
      if (drawable2 != null) {
        Rect rect1 = drawable2.getBounds();
        i2 = rect1.left + rect1.right;
      } else {
        i2 = getWidth();
      } 
      int i3 = i2 / 2;
      int i2 = layout.getWidth() / 2;
      n = (i + k + j - n) / 2;
      k = layout.getHeight() / 2;
      paramCanvas.translate((i3 - i2), (n - k));
      layout.draw(paramCanvas);
    } 
    paramCanvas.restoreToCount(i1);
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("android.widget.Switch");
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName("android.widget.Switch");
    if (Build.VERSION.SDK_INT < 30) {
      CharSequence charSequence;
      if (isChecked()) {
        charSequence = this.r;
      } else {
        charSequence = this.s;
      } 
      if (!TextUtils.isEmpty(charSequence)) {
        CharSequence charSequence1 = paramAccessibilityNodeInfo.getText();
        if (TextUtils.isEmpty(charSequence1)) {
          paramAccessibilityNodeInfo.setText(charSequence);
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(charSequence1);
          stringBuilder.append(' ');
          stringBuilder.append(charSequence);
          paramAccessibilityNodeInfo.setText(stringBuilder);
        } 
      } 
    } 
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Drawable drawable = this.d;
    paramInt2 = 0;
    if (drawable != null) {
      Rect rect1 = this.P;
      Drawable drawable1 = this.i;
      if (drawable1 != null) {
        drawable1.getPadding(rect1);
      } else {
        rect1.setEmpty();
      } 
      Rect rect2 = q.d(this.d);
      paramInt1 = Math.max(0, rect2.left - rect1.left);
      paramInt2 = Math.max(0, rect2.right - rect1.right);
    } else {
      paramInt1 = 0;
    } 
    if (k0.b((View)this)) {
      paramInt3 = getPaddingLeft() + paramInt1;
      paramInt1 = this.B + paramInt3 - paramInt1 - paramInt2;
      paramInt2 = paramInt3;
      paramInt3 = paramInt1;
    } else {
      paramInt3 = getWidth() - getPaddingRight() - paramInt2;
      paramInt2 = paramInt3 - this.B + paramInt1 + paramInt2;
    } 
    paramInt1 = getGravity() & 0x70;
    if (paramInt1 != 16) {
      if (paramInt1 != 80) {
        paramInt1 = getPaddingTop();
        paramInt4 = this.C;
      } else {
        paramInt4 = getHeight() - getPaddingBottom();
        paramInt1 = paramInt4 - this.C;
        this.E = paramInt2;
        this.F = paramInt1;
        this.H = paramInt4;
        this.G = paramInt3;
      } 
    } else {
      paramInt1 = (getPaddingTop() + getHeight() - getPaddingBottom()) / 2;
      paramInt4 = this.C;
      paramInt1 -= paramInt4 / 2;
    } 
    paramInt4 += paramInt1;
    this.E = paramInt2;
    this.F = paramInt1;
    this.H = paramInt4;
    this.G = paramInt3;
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    int j;
    if (this.t) {
      if (this.K == null)
        this.K = h(this.r); 
      if (this.L == null)
        this.L = h(this.s); 
    } 
    Rect rect = this.P;
    Drawable drawable2 = this.d;
    int i = 0;
    if (drawable2 != null) {
      drawable2.getPadding(rect);
      j = this.d.getIntrinsicWidth() - rect.left - rect.right;
      k = this.d.getIntrinsicHeight();
    } else {
      j = 0;
      k = 0;
    } 
    if (this.t) {
      n = Math.max(this.K.getWidth(), this.L.getWidth()) + this.n * 2;
    } else {
      n = 0;
    } 
    this.D = Math.max(n, j);
    drawable2 = this.i;
    if (drawable2 != null) {
      drawable2.getPadding(rect);
      j = this.i.getIntrinsicHeight();
    } else {
      rect.setEmpty();
      j = i;
    } 
    int i1 = rect.left;
    int i2 = rect.right;
    Drawable drawable1 = this.d;
    i = i2;
    int n = i1;
    if (drawable1 != null) {
      Rect rect1 = q.d(drawable1);
      n = Math.max(i1, rect1.left);
      i = Math.max(i2, rect1.right);
    } 
    n = Math.max(this.o, this.D * 2 + n + i);
    int k = Math.max(j, k);
    this.B = n;
    this.C = k;
    super.onMeasure(paramInt1, paramInt2);
    if (getMeasuredHeight() < k)
      setMeasuredDimension(getMeasuredWidthAndState(), k); 
  }
  
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    CharSequence charSequence;
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    if (isChecked()) {
      charSequence = this.r;
    } else {
      charSequence = this.s;
    } 
    if (charSequence != null)
      paramAccessibilityEvent.getText().add(charSequence); 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    this.y.addMovement(paramMotionEvent);
    int i = paramMotionEvent.getActionMasked();
    if (i != 0) {
      if (i != 1)
        if (i != 2) {
          if (i != 3)
            return super.onTouchEvent(paramMotionEvent); 
        } else {
          i = this.u;
          if (i != 1) {
            if (i == 2) {
              float f1 = paramMotionEvent.getX();
              i = getThumbScrollRange();
              float f2 = f1 - this.w;
              if (i != 0) {
                f2 /= i;
              } else if (f2 > 0.0F) {
                f2 = 1.0F;
              } else {
                f2 = -1.0F;
              } 
              float f3 = f2;
              if (k0.b((View)this))
                f3 = -f2; 
              f2 = f(this.A + f3, 0.0F, 1.0F);
              if (f2 != this.A) {
                this.w = f1;
                setThumbPosition(f2);
              } 
              return true;
            } 
          } else {
            float f1 = paramMotionEvent.getX();
            float f2 = paramMotionEvent.getY();
            if (Math.abs(f1 - this.w) > this.v || Math.abs(f2 - this.x) > this.v) {
              this.u = 2;
              getParent().requestDisallowInterceptTouchEvent(true);
              this.w = f1;
              this.x = f2;
              return true;
            } 
          } 
          return super.onTouchEvent(paramMotionEvent);
        }  
      if (this.u == 2) {
        l(paramMotionEvent);
        super.onTouchEvent(paramMotionEvent);
        return true;
      } 
      this.u = 0;
      this.y.clear();
    } else {
      float f2 = paramMotionEvent.getX();
      float f1 = paramMotionEvent.getY();
      if (isEnabled() && g(f2, f1)) {
        this.u = 1;
        this.w = f2;
        this.x = f1;
      } 
    } 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setChecked(boolean paramBoolean) {
    super.setChecked(paramBoolean);
    paramBoolean = isChecked();
    if (paramBoolean) {
      j();
    } else {
      i();
    } 
    if (getWindowToken() != null && w.V((View)this)) {
      a(paramBoolean);
    } else {
      float f;
      d();
      if (paramBoolean) {
        f = 1.0F;
      } else {
        f = 0.0F;
      } 
      setThumbPosition(f);
    } 
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback) {
    super.setCustomSelectionActionModeCallback(i.s((TextView)this, paramCallback));
  }
  
  public void setShowText(boolean paramBoolean) {
    if (this.t != paramBoolean) {
      this.t = paramBoolean;
      requestLayout();
    } 
  }
  
  public void setSplitTrack(boolean paramBoolean) {
    this.q = paramBoolean;
    invalidate();
  }
  
  public void setSwitchMinWidth(int paramInt) {
    this.o = paramInt;
    requestLayout();
  }
  
  public void setSwitchPadding(int paramInt) {
    this.p = paramInt;
    requestLayout();
  }
  
  public void setSwitchTextAppearance(Context paramContext, int paramInt) {
    e0 e0 = e0.t(paramContext, paramInt, j.TextAppearance);
    ColorStateList colorStateList = e0.c(j.TextAppearance_android_textColor);
    if (colorStateList != null) {
      this.J = colorStateList;
    } else {
      this.J = getTextColors();
    } 
    paramInt = e0.f(j.TextAppearance_android_textSize, 0);
    if (paramInt != 0) {
      float f = paramInt;
      if (f != this.I.getTextSize()) {
        this.I.setTextSize(f);
        requestLayout();
      } 
    } 
    k(e0.k(j.TextAppearance_android_typeface, -1), e0.k(j.TextAppearance_android_textStyle, -1));
    if (e0.a(j.TextAppearance_textAllCaps, false)) {
      this.M = (TransformationMethod)new b.a.n.a(getContext());
    } else {
      this.M = null;
    } 
    e0.w();
  }
  
  public void setSwitchTypeface(Typeface paramTypeface) {
    if ((this.I.getTypeface() != null && !this.I.getTypeface().equals(paramTypeface)) || (this.I.getTypeface() == null && paramTypeface != null)) {
      this.I.setTypeface(paramTypeface);
      requestLayout();
      invalidate();
    } 
  }
  
  public void setSwitchTypeface(Typeface paramTypeface, int paramInt) {
    TextPaint textPaint;
    float f = 0.0F;
    boolean bool = false;
    if (paramInt > 0) {
      boolean bool1;
      if (paramTypeface == null) {
        paramTypeface = Typeface.defaultFromStyle(paramInt);
      } else {
        paramTypeface = Typeface.create(paramTypeface, paramInt);
      } 
      setSwitchTypeface(paramTypeface);
      if (paramTypeface != null) {
        bool1 = paramTypeface.getStyle();
      } else {
        bool1 = false;
      } 
      paramInt = (bool1 ^ 0xFFFFFFFF) & paramInt;
      textPaint = this.I;
      if ((paramInt & 0x1) != 0)
        bool = true; 
      textPaint.setFakeBoldText(bool);
      textPaint = this.I;
      if ((paramInt & 0x2) != 0)
        f = -0.25F; 
      textPaint.setTextSkewX(f);
    } else {
      this.I.setFakeBoldText(false);
      this.I.setTextSkewX(0.0F);
      setSwitchTypeface((Typeface)textPaint);
    } 
  }
  
  public void setTextOff(CharSequence paramCharSequence) {
    this.s = paramCharSequence;
    requestLayout();
    if (!isChecked())
      i(); 
  }
  
  public void setTextOn(CharSequence paramCharSequence) {
    this.r = paramCharSequence;
    requestLayout();
    if (isChecked())
      j(); 
  }
  
  public void setThumbDrawable(Drawable paramDrawable) {
    Drawable drawable = this.d;
    if (drawable != null)
      drawable.setCallback(null); 
    this.d = paramDrawable;
    if (paramDrawable != null)
      paramDrawable.setCallback((Drawable.Callback)this); 
    requestLayout();
  }
  
  void setThumbPosition(float paramFloat) {
    this.A = paramFloat;
    invalidate();
  }
  
  public void setThumbResource(int paramInt) {
    setThumbDrawable(b.a.k.a.a.d(getContext(), paramInt));
  }
  
  public void setThumbTextPadding(int paramInt) {
    this.n = paramInt;
    requestLayout();
  }
  
  public void setThumbTintList(ColorStateList paramColorStateList) {
    this.e = paramColorStateList;
    this.g = true;
    b();
  }
  
  public void setThumbTintMode(PorterDuff.Mode paramMode) {
    this.f = paramMode;
    this.h = true;
    b();
  }
  
  public void setTrackDrawable(Drawable paramDrawable) {
    Drawable drawable = this.i;
    if (drawable != null)
      drawable.setCallback(null); 
    this.i = paramDrawable;
    if (paramDrawable != null)
      paramDrawable.setCallback((Drawable.Callback)this); 
    requestLayout();
  }
  
  public void setTrackResource(int paramInt) {
    setTrackDrawable(b.a.k.a.a.d(getContext(), paramInt));
  }
  
  public void setTrackTintList(ColorStateList paramColorStateList) {
    this.j = paramColorStateList;
    this.l = true;
    c();
  }
  
  public void setTrackTintMode(PorterDuff.Mode paramMode) {
    this.k = paramMode;
    this.m = true;
    c();
  }
  
  public void toggle() {
    setChecked(isChecked() ^ true);
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable) {
    return (super.verifyDrawable(paramDrawable) || paramDrawable == this.d || paramDrawable == this.i);
  }
  
  class a extends Property<SwitchCompat, Float> {
    a(SwitchCompat this$0, String param1String) {
      super((Class)this$0, param1String);
    }
    
    public Float a(SwitchCompat param1SwitchCompat) {
      return Float.valueOf(param1SwitchCompat.A);
    }
    
    public void b(SwitchCompat param1SwitchCompat, Float param1Float) {
      param1SwitchCompat.setThumbPosition(param1Float.floatValue());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/SwitchCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */