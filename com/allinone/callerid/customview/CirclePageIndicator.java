package com.allinone.callerid.customview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import b.h.k.x;
import com.allinone.callerid.R;

public class CirclePageIndicator extends View implements ViewPager.i {
  private float b;
  
  private final Paint c;
  
  private final Paint d;
  
  private final Paint e;
  
  private ViewPager f;
  
  private ViewPager.i g;
  
  private int h;
  
  private int i;
  
  private float j;
  
  private int k;
  
  private int l;
  
  private boolean m;
  
  private boolean n;
  
  private int o;
  
  private float p;
  
  private int q;
  
  private boolean r;
  
  private float s;
  
  public CirclePageIndicator(Context paramContext) {
    this(paramContext, null);
  }
  
  public CirclePageIndicator(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130969957);
  }
  
  public CirclePageIndicator(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    Paint paint1 = new Paint(1);
    this.c = paint1;
    Paint paint2 = new Paint(1);
    this.d = paint2;
    Paint paint3 = new Paint(1);
    this.e = paint3;
    this.p = -1.0F;
    this.q = -1;
    if (isInEditMode())
      return; 
    Resources resources = getResources();
    int j = resources.getColor(2131099758);
    int k = resources.getColor(2131099757);
    int m = resources.getInteger(2131361798);
    int n = resources.getColor(2131099759);
    float f1 = resources.getDimension(2131165281);
    float f2 = resources.getDimension(2131165280);
    boolean bool1 = resources.getBoolean(2131034114);
    boolean bool2 = resources.getBoolean(2131034115);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.CirclePageIndicator, paramInt, 0);
    this.m = typedArray.getBoolean(2, bool1);
    this.l = typedArray.getInt(0, m);
    paint1.setStyle(Paint.Style.FILL);
    paint1.setColor(typedArray.getColor(4, j));
    paint2.setStyle(Paint.Style.STROKE);
    paint2.setColor(typedArray.getColor(7, n));
    paint2.setStrokeWidth(typedArray.getDimension(8, f1));
    paint3.setStyle(Paint.Style.FILL);
    paint3.setColor(typedArray.getColor(3, k));
    this.b = typedArray.getDimension(5, f2);
    this.n = typedArray.getBoolean(6, bool2);
    Drawable drawable = typedArray.getDrawable(1);
    if (drawable != null)
      setBackgroundDrawable(drawable); 
    typedArray.recycle();
    this.o = x.d(ViewConfiguration.get(paramContext));
  }
  
  private int b(int paramInt) {
    int j = View.MeasureSpec.getMode(paramInt);
    int k = View.MeasureSpec.getSize(paramInt);
    paramInt = k;
    if (j != 1073741824) {
      ViewPager viewPager = this.f;
      if (viewPager == null) {
        paramInt = k;
      } else {
        paramInt = viewPager.getAdapter().e();
        float f1 = (getPaddingLeft() + getPaddingRight());
        float f2 = (paramInt * 2);
        float f3 = this.b;
        paramInt = (int)(f1 + f2 * f3 + (paramInt - 1) * f3 + 1.0F);
        if (j == Integer.MIN_VALUE)
          paramInt = Math.min(paramInt, k); 
      } 
    } 
    return paramInt;
  }
  
  private int e(int paramInt) {
    int j = View.MeasureSpec.getMode(paramInt);
    int k = View.MeasureSpec.getSize(paramInt);
    if (j == 1073741824) {
      paramInt = k;
    } else {
      paramInt = (int)(this.b * 2.0F + getPaddingTop() + getPaddingBottom() + 1.0F);
      if (j == Integer.MIN_VALUE)
        paramInt = Math.min(paramInt, k); 
    } 
    return paramInt;
  }
  
  public void a(int paramInt1, float paramFloat, int paramInt2) {
    this.h = paramInt1;
    this.j = paramFloat;
    invalidate();
    ViewPager.i i1 = this.g;
    if (i1 != null)
      i1.a(paramInt1, paramFloat, paramInt2); 
  }
  
  public void c(int paramInt) {
    this.k = paramInt;
    ViewPager.i i1 = this.g;
    if (i1 != null)
      i1.c(paramInt); 
  }
  
  public void d(int paramInt) {
    if (this.n || this.k == 0) {
      this.h = paramInt;
      this.i = paramInt;
      invalidate();
    } 
    ViewPager.i i1 = this.g;
    if (i1 != null)
      i1.d(paramInt); 
  }
  
  public int getFillColor() {
    return this.e.getColor();
  }
  
  public int getOrientation() {
    return this.l;
  }
  
  public int getPageColor() {
    return this.c.getColor();
  }
  
  public float getRadius() {
    return this.b;
  }
  
  public int getStrokeColor() {
    return this.d.getColor();
  }
  
  public float getStrokeWidth() {
    return this.d.getStrokeWidth();
  }
  
  protected void onDraw(Canvas paramCanvas) {
    int k;
    int m;
    int n;
    super.onDraw(paramCanvas);
    ViewPager viewPager = this.f;
    if (viewPager == null)
      return; 
    int j = viewPager.getAdapter().e();
    if (j == 0)
      return; 
    if (this.h >= j) {
      setCurrentItem(j - 1);
      return;
    } 
    if (this.l == 0) {
      k = getWidth();
      m = getPaddingLeft();
      n = getPaddingRight();
      i1 = getPaddingTop();
    } else {
      k = getHeight();
      m = getPaddingTop();
      n = getPaddingBottom();
      i1 = getPaddingLeft();
    } 
    if (this.s == 0.0F)
      this.s = this.b; 
    float f1 = this.b;
    float f2 = this.s;
    float f3 = f1 * 2.0F + f2;
    float f4 = i1 + f1;
    float f5 = m + f1;
    float f6 = f5;
    if (this.m) {
      if (j > 1) {
        f6 = (k - m - n) / 2.0F - ((j * 2) * f1 + (j - 1) * f2) / 2.0F;
      } else {
        f6 = (k - m - n) / 2.0F - f1;
      } 
      f6 = f5 + f6;
    } 
    f5 = f1;
    if (this.d.getStrokeWidth() > 0.0F)
      f5 = f1 - this.d.getStrokeWidth() / 2.0F; 
    int i1;
    for (i1 = 0; i1 < j; i1++) {
      f1 = i1 * f3 + f6;
      if (this.l == 0) {
        f2 = f4;
      } else {
        f2 = f1;
        f1 = f4;
      } 
      if (this.c.getAlpha() > 0)
        paramCanvas.drawCircle(f1, f2, f5, this.c); 
      float f = this.b;
      if (f5 != f)
        paramCanvas.drawCircle(f1, f2, f, this.d); 
    } 
    boolean bool = this.n;
    if (bool) {
      i1 = this.i;
    } else {
      i1 = this.h;
    } 
    f1 = i1 * f3;
    f5 = f1;
    if (!bool)
      f5 = f1 + this.j * f3; 
    if (this.l == 0) {
      f5 = f6 + f5;
      f6 = f4;
    } else {
      f6 += f5;
      f5 = f4;
    } 
    paramCanvas.drawCircle(f5, f6, this.b, this.e);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    if (this.l == 0) {
      setMeasuredDimension(b(paramInt1), e(paramInt2));
    } else {
      setMeasuredDimension(e(paramInt1), b(paramInt2));
    } 
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {
    SavedState savedState = (SavedState)paramParcelable;
    super.onRestoreInstanceState(savedState.getSuperState());
    int j = savedState.b;
    this.h = j;
    this.i = j;
    requestLayout();
  }
  
  public Parcelable onSaveInstanceState() {
    SavedState savedState = new SavedState(super.onSaveInstanceState());
    savedState.b = this.h;
    return (Parcelable)savedState;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial onTouchEvent : (Landroid/view/MotionEvent;)Z
    //   5: ifeq -> 10
    //   8: iconst_1
    //   9: ireturn
    //   10: aload_0
    //   11: getfield f : Landroidx/viewpager/widget/ViewPager;
    //   14: astore_2
    //   15: iconst_0
    //   16: istore_3
    //   17: aload_2
    //   18: ifnull -> 443
    //   21: aload_2
    //   22: invokevirtual getAdapter : ()Landroidx/viewpager/widget/a;
    //   25: invokevirtual e : ()I
    //   28: ifne -> 34
    //   31: goto -> 443
    //   34: aload_1
    //   35: invokevirtual getAction : ()I
    //   38: sipush #255
    //   41: iand
    //   42: istore #4
    //   44: iload #4
    //   46: ifeq -> 424
    //   49: iload #4
    //   51: iconst_1
    //   52: if_icmpeq -> 262
    //   55: iload #4
    //   57: iconst_2
    //   58: if_icmpeq -> 163
    //   61: iload #4
    //   63: iconst_3
    //   64: if_icmpeq -> 262
    //   67: iload #4
    //   69: iconst_5
    //   70: if_icmpeq -> 137
    //   73: iload #4
    //   75: bipush #6
    //   77: if_icmpeq -> 83
    //   80: goto -> 441
    //   83: aload_1
    //   84: invokestatic b : (Landroid/view/MotionEvent;)I
    //   87: istore #4
    //   89: aload_1
    //   90: iload #4
    //   92: invokestatic d : (Landroid/view/MotionEvent;I)I
    //   95: aload_0
    //   96: getfield q : I
    //   99: if_icmpne -> 118
    //   102: iload #4
    //   104: ifne -> 109
    //   107: iconst_1
    //   108: istore_3
    //   109: aload_0
    //   110: aload_1
    //   111: iload_3
    //   112: invokestatic d : (Landroid/view/MotionEvent;I)I
    //   115: putfield q : I
    //   118: aload_0
    //   119: aload_1
    //   120: aload_1
    //   121: aload_0
    //   122: getfield q : I
    //   125: invokestatic a : (Landroid/view/MotionEvent;I)I
    //   128: invokestatic e : (Landroid/view/MotionEvent;I)F
    //   131: putfield p : F
    //   134: goto -> 441
    //   137: aload_1
    //   138: invokestatic b : (Landroid/view/MotionEvent;)I
    //   141: istore_3
    //   142: aload_0
    //   143: aload_1
    //   144: iload_3
    //   145: invokestatic e : (Landroid/view/MotionEvent;I)F
    //   148: putfield p : F
    //   151: aload_0
    //   152: aload_1
    //   153: iload_3
    //   154: invokestatic d : (Landroid/view/MotionEvent;I)I
    //   157: putfield q : I
    //   160: goto -> 441
    //   163: aload_1
    //   164: aload_1
    //   165: aload_0
    //   166: getfield q : I
    //   169: invokestatic a : (Landroid/view/MotionEvent;I)I
    //   172: invokestatic e : (Landroid/view/MotionEvent;I)F
    //   175: fstore #5
    //   177: fload #5
    //   179: aload_0
    //   180: getfield p : F
    //   183: fsub
    //   184: fstore #6
    //   186: aload_0
    //   187: getfield r : Z
    //   190: ifne -> 212
    //   193: fload #6
    //   195: invokestatic abs : (F)F
    //   198: aload_0
    //   199: getfield o : I
    //   202: i2f
    //   203: fcmpl
    //   204: ifle -> 212
    //   207: aload_0
    //   208: iconst_1
    //   209: putfield r : Z
    //   212: aload_0
    //   213: getfield r : Z
    //   216: ifeq -> 441
    //   219: aload_0
    //   220: fload #5
    //   222: putfield p : F
    //   225: aload_0
    //   226: getfield f : Landroidx/viewpager/widget/ViewPager;
    //   229: invokevirtual A : ()Z
    //   232: ifne -> 245
    //   235: aload_0
    //   236: getfield f : Landroidx/viewpager/widget/ViewPager;
    //   239: invokevirtual e : ()Z
    //   242: ifeq -> 441
    //   245: aload_0
    //   246: getfield f : Landroidx/viewpager/widget/ViewPager;
    //   249: fload #6
    //   251: invokevirtual s : (F)V
    //   254: goto -> 441
    //   257: astore_2
    //   258: aload_2
    //   259: invokevirtual printStackTrace : ()V
    //   262: aload_0
    //   263: getfield r : Z
    //   266: ifne -> 386
    //   269: aload_0
    //   270: getfield f : Landroidx/viewpager/widget/ViewPager;
    //   273: invokevirtual getAdapter : ()Landroidx/viewpager/widget/a;
    //   276: invokevirtual e : ()I
    //   279: istore_3
    //   280: aload_0
    //   281: invokevirtual getWidth : ()I
    //   284: i2f
    //   285: fstore #6
    //   287: fload #6
    //   289: fconst_2
    //   290: fdiv
    //   291: fstore #5
    //   293: fload #6
    //   295: ldc_w 6.0
    //   298: fdiv
    //   299: fstore #6
    //   301: aload_0
    //   302: getfield h : I
    //   305: ifle -> 342
    //   308: aload_1
    //   309: invokevirtual getX : ()F
    //   312: fload #5
    //   314: fload #6
    //   316: fsub
    //   317: fcmpg
    //   318: ifge -> 342
    //   321: iload #4
    //   323: iconst_3
    //   324: if_icmpeq -> 340
    //   327: aload_0
    //   328: getfield f : Landroidx/viewpager/widget/ViewPager;
    //   331: aload_0
    //   332: getfield h : I
    //   335: iconst_1
    //   336: isub
    //   337: invokevirtual setCurrentItem : (I)V
    //   340: iconst_1
    //   341: ireturn
    //   342: aload_0
    //   343: getfield h : I
    //   346: iload_3
    //   347: iconst_1
    //   348: isub
    //   349: if_icmpge -> 386
    //   352: aload_1
    //   353: invokevirtual getX : ()F
    //   356: fload #5
    //   358: fload #6
    //   360: fadd
    //   361: fcmpl
    //   362: ifle -> 386
    //   365: iload #4
    //   367: iconst_3
    //   368: if_icmpeq -> 384
    //   371: aload_0
    //   372: getfield f : Landroidx/viewpager/widget/ViewPager;
    //   375: aload_0
    //   376: getfield h : I
    //   379: iconst_1
    //   380: iadd
    //   381: invokevirtual setCurrentItem : (I)V
    //   384: iconst_1
    //   385: ireturn
    //   386: aload_0
    //   387: iconst_0
    //   388: putfield r : Z
    //   391: aload_0
    //   392: iconst_m1
    //   393: putfield q : I
    //   396: aload_0
    //   397: getfield f : Landroidx/viewpager/widget/ViewPager;
    //   400: invokevirtual A : ()Z
    //   403: ifeq -> 441
    //   406: aload_0
    //   407: getfield f : Landroidx/viewpager/widget/ViewPager;
    //   410: invokevirtual q : ()V
    //   413: goto -> 441
    //   416: astore_1
    //   417: aload_1
    //   418: invokevirtual printStackTrace : ()V
    //   421: goto -> 441
    //   424: aload_0
    //   425: aload_1
    //   426: iconst_0
    //   427: invokestatic d : (Landroid/view/MotionEvent;I)I
    //   430: putfield q : I
    //   433: aload_0
    //   434: aload_1
    //   435: invokevirtual getX : ()F
    //   438: putfield p : F
    //   441: iconst_1
    //   442: ireturn
    //   443: iconst_0
    //   444: ireturn
    // Exception table:
    //   from	to	target	type
    //   163	212	257	java/lang/Exception
    //   212	245	257	java/lang/Exception
    //   245	254	257	java/lang/Exception
    //   262	287	416	java/lang/Exception
    //   301	321	416	java/lang/Exception
    //   327	340	416	java/lang/Exception
    //   342	365	416	java/lang/Exception
    //   371	384	416	java/lang/Exception
    //   386	413	416	java/lang/Exception
  }
  
  public void setCentered(boolean paramBoolean) {
    this.m = paramBoolean;
    invalidate();
  }
  
  public void setCurrentItem(int paramInt) {
    ViewPager viewPager = this.f;
    if (viewPager != null) {
      viewPager.setCurrentItem(paramInt);
      this.h = paramInt;
      invalidate();
      return;
    } 
    throw new IllegalStateException("ViewPager has not been bound.");
  }
  
  public void setFillColor(int paramInt) {
    this.e.setColor(paramInt);
    invalidate();
  }
  
  public void setOnPageChangeListener(ViewPager.i parami) {
    this.g = parami;
  }
  
  public void setOrientation(int paramInt) {
    if (paramInt == 0 || paramInt == 1) {
      this.l = paramInt;
      requestLayout();
      return;
    } 
    throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
  }
  
  public void setPaddind(float paramFloat) {
    this.s = paramFloat;
    invalidate();
  }
  
  public void setPageColor(int paramInt) {
    this.c.setColor(paramInt);
    invalidate();
  }
  
  public void setRadius(float paramFloat) {
    this.b = paramFloat;
    invalidate();
  }
  
  public void setSnap(boolean paramBoolean) {
    this.n = paramBoolean;
    invalidate();
  }
  
  public void setStrokeColor(int paramInt) {
    this.d.setColor(paramInt);
    invalidate();
  }
  
  public void setStrokeWidth(float paramFloat) {
    this.d.setStrokeWidth(paramFloat);
    invalidate();
  }
  
  public void setViewPager(ViewPager paramViewPager) {
    ViewPager viewPager = this.f;
    if (viewPager == paramViewPager)
      return; 
    if (viewPager != null)
      viewPager.setOnPageChangeListener(null); 
    if (paramViewPager.getAdapter() != null) {
      this.f = paramViewPager;
      paramViewPager.setOnPageChangeListener(this);
      invalidate();
      return;
    } 
    throw new IllegalStateException("ViewPager does not have adapter instance.");
  }
  
  public void setViewPager(ViewPager paramViewPager, int paramInt) {
    setViewPager(paramViewPager);
    setCurrentItem(paramInt);
  }
  
  static class SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = new a();
    
    int b;
    
    private SavedState(Parcel param1Parcel) {
      super(param1Parcel);
      this.b = param1Parcel.readInt();
    }
    
    public SavedState(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeInt(this.b);
    }
    
    static final class a implements Parcelable.Creator<SavedState> {
      public CirclePageIndicator.SavedState a(Parcel param2Parcel) {
        return new CirclePageIndicator.SavedState(param2Parcel, null);
      }
      
      public CirclePageIndicator.SavedState[] b(int param2Int) {
        return new CirclePageIndicator.SavedState[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.Creator<SavedState> {
    public CirclePageIndicator.SavedState a(Parcel param1Parcel) {
      return new CirclePageIndicator.SavedState(param1Parcel, null);
    }
    
    public CirclePageIndicator.SavedState[] b(int param1Int) {
      return new CirclePageIndicator.SavedState[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/CirclePageIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */