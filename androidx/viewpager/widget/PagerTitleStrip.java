package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.widget.i;
import java.lang.ref.WeakReference;
import java.util.Locale;

@e
public class PagerTitleStrip extends ViewGroup {
  private static final int[] b = new int[] { 16842804, 16842901, 16842904, 16842927 };
  
  private static final int[] c = new int[] { 16843660 };
  
  ViewPager d;
  
  TextView e;
  
  TextView f;
  
  TextView g;
  
  private int h = -1;
  
  float i = -1.0F;
  
  private int j;
  
  private int k;
  
  private boolean l;
  
  private boolean m;
  
  private final a n = new a(this);
  
  private WeakReference<a> o;
  
  private int p;
  
  int q;
  
  public PagerTitleStrip(Context paramContext) {
    this(paramContext, null);
  }
  
  public PagerTitleStrip(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    TextView textView = new TextView(paramContext);
    this.e = textView;
    addView((View)textView);
    textView = new TextView(paramContext);
    this.f = textView;
    addView((View)textView);
    textView = new TextView(paramContext);
    this.g = textView;
    addView((View)textView);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, b);
    boolean bool = false;
    int i = typedArray.getResourceId(0, 0);
    if (i != 0) {
      i.q(this.e, i);
      i.q(this.f, i);
      i.q(this.g, i);
    } 
    int j = typedArray.getDimensionPixelSize(1, 0);
    if (j != 0)
      setTextSize(0, j); 
    if (typedArray.hasValue(2)) {
      j = typedArray.getColor(2, 0);
      this.e.setTextColor(j);
      this.f.setTextColor(j);
      this.g.setTextColor(j);
    } 
    this.k = typedArray.getInteger(3, 80);
    typedArray.recycle();
    this.q = this.f.getTextColors().getDefaultColor();
    setNonPrimaryAlpha(0.6F);
    this.e.setEllipsize(TextUtils.TruncateAt.END);
    this.f.setEllipsize(TextUtils.TruncateAt.END);
    this.g.setEllipsize(TextUtils.TruncateAt.END);
    if (i != 0) {
      typedArray = paramContext.obtainStyledAttributes(i, c);
      bool = typedArray.getBoolean(0, false);
      typedArray.recycle();
    } 
    if (bool) {
      setSingleLineAllCaps(this.e);
      setSingleLineAllCaps(this.f);
      setSingleLineAllCaps(this.g);
    } else {
      this.e.setSingleLine();
      this.f.setSingleLine();
      this.g.setSingleLine();
    } 
    this.j = (int)((paramContext.getResources().getDisplayMetrics()).density * 16.0F);
  }
  
  private static void setSingleLineAllCaps(TextView paramTextView) {
    paramTextView.setTransformationMethod((TransformationMethod)new b(paramTextView.getContext()));
  }
  
  void a(a parama1, a parama2) {
    if (parama1 != null) {
      parama1.u(this.n);
      this.o = null;
    } 
    if (parama2 != null) {
      parama2.m(this.n);
      this.o = new WeakReference<a>(parama2);
    } 
    ViewPager viewPager = this.d;
    if (viewPager != null) {
      this.h = -1;
      this.i = -1.0F;
      b(viewPager.getCurrentItem(), parama2);
      requestLayout();
    } 
  }
  
  void b(int paramInt, a parama) {
    if (parama != null) {
      i = parama.e();
    } else {
      i = 0;
    } 
    this.l = true;
    CharSequence charSequence1 = null;
    if (paramInt >= 1 && parama != null) {
      charSequence2 = parama.g(paramInt - 1);
    } else {
      charSequence2 = null;
    } 
    this.e.setText(charSequence2);
    TextView textView = this.f;
    if (parama != null && paramInt < i) {
      charSequence2 = parama.g(paramInt);
    } else {
      charSequence2 = null;
    } 
    textView.setText(charSequence2);
    int j = paramInt + 1;
    CharSequence charSequence2 = charSequence1;
    if (j < i) {
      charSequence2 = charSequence1;
      if (parama != null)
        charSequence2 = parama.g(j); 
    } 
    this.g.setText(charSequence2);
    j = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int)((getWidth() - getPaddingLeft() - getPaddingRight()) * 0.8F)), -2147483648);
    int i = View.MeasureSpec.makeMeasureSpec(Math.max(0, getHeight() - getPaddingTop() - getPaddingBottom()), -2147483648);
    this.e.measure(j, i);
    this.f.measure(j, i);
    this.g.measure(j, i);
    this.h = paramInt;
    if (!this.m)
      c(paramInt, this.i, false); 
    this.l = false;
  }
  
  void c(int paramInt, float paramFloat, boolean paramBoolean) {
    if (paramInt != this.h) {
      b(paramInt, this.d.getAdapter());
    } else if (!paramBoolean && paramFloat == this.i) {
      return;
    } 
    this.m = true;
    int i = this.e.getMeasuredWidth();
    int j = this.f.getMeasuredWidth();
    int k = this.g.getMeasuredWidth();
    int m = j / 2;
    int n = getWidth();
    int i1 = getHeight();
    int i2 = getPaddingLeft();
    int i3 = getPaddingRight();
    paramInt = getPaddingTop();
    int i4 = getPaddingBottom();
    int i5 = i3 + m;
    float f1 = 0.5F + paramFloat;
    float f2 = f1;
    if (f1 > 1.0F)
      f2 = f1 - 1.0F; 
    m = n - i5 - (int)((n - i2 + m - i5) * f2) - m;
    i5 = j + m;
    int i6 = this.e.getBaseline();
    j = this.f.getBaseline();
    int i7 = this.g.getBaseline();
    int i8 = Math.max(Math.max(i6, j), i7);
    i6 = i8 - i6;
    j = i8 - j;
    i8 -= i7;
    int i9 = this.e.getMeasuredHeight();
    i7 = this.f.getMeasuredHeight();
    int i10 = this.g.getMeasuredHeight();
    i7 = Math.max(Math.max(i9 + i6, i7 + j), i10 + i8);
    i9 = this.k & 0x70;
    if (i9 != 16) {
      if (i9 != 80) {
        i1 = i6 + paramInt;
        j += paramInt;
        paramInt += i8;
      } else {
        paramInt = i1 - i4 - i7;
        i1 = i6 + paramInt;
        j += paramInt;
        paramInt += i8;
      } 
    } else {
      paramInt = (i1 - paramInt - i4 - i7) / 2;
      i1 = i6 + paramInt;
      j += paramInt;
      paramInt += i8;
    } 
    TextView textView = this.f;
    textView.layout(m, j, i5, textView.getMeasuredHeight() + j);
    j = Math.min(i2, m - this.j - i);
    textView = this.e;
    textView.layout(j, i1, i + j, textView.getMeasuredHeight() + i1);
    i1 = Math.max(n - i3 - k, i5 + this.j);
    textView = this.g;
    textView.layout(i1, paramInt, i1 + k, textView.getMeasuredHeight() + paramInt);
    this.i = paramFloat;
    this.m = false;
  }
  
  int getMinHeight() {
    boolean bool;
    Drawable drawable = getBackground();
    if (drawable != null) {
      bool = drawable.getIntrinsicHeight();
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int getTextSpacing() {
    return this.j;
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    ViewParent viewParent = getParent();
    if (viewParent instanceof ViewPager) {
      ViewPager viewPager = (ViewPager)viewParent;
      a a1 = viewPager.getAdapter();
      viewPager.T(this.n);
      viewPager.b(this.n);
      this.d = viewPager;
      WeakReference<a> weakReference = this.o;
      if (weakReference != null) {
        a a2 = weakReference.get();
      } else {
        weakReference = null;
      } 
      a((a)weakReference, a1);
      return;
    } 
    throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    ViewPager viewPager = this.d;
    if (viewPager != null) {
      a(viewPager.getAdapter(), null);
      this.d.T(null);
      this.d.M(this.n);
      this.d = null;
    } 
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.d != null) {
      float f = this.i;
      if (f < 0.0F)
        f = 0.0F; 
      c(this.h, f, true);
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824) {
      int i = getPaddingTop() + getPaddingBottom();
      int j = ViewGroup.getChildMeasureSpec(paramInt2, i, -2);
      int k = View.MeasureSpec.getSize(paramInt1);
      paramInt1 = ViewGroup.getChildMeasureSpec(paramInt1, (int)(k * 0.2F), -2);
      this.e.measure(paramInt1, j);
      this.f.measure(paramInt1, j);
      this.g.measure(paramInt1, j);
      if (View.MeasureSpec.getMode(paramInt2) == 1073741824) {
        paramInt1 = View.MeasureSpec.getSize(paramInt2);
      } else {
        paramInt1 = this.f.getMeasuredHeight();
        paramInt1 = Math.max(getMinHeight(), paramInt1 + i);
      } 
      setMeasuredDimension(k, View.resolveSizeAndState(paramInt1, paramInt2, this.f.getMeasuredState() << 16));
      return;
    } 
    throw new IllegalStateException("Must measure with an exact width");
  }
  
  public void requestLayout() {
    if (!this.l)
      super.requestLayout(); 
  }
  
  public void setGravity(int paramInt) {
    this.k = paramInt;
    requestLayout();
  }
  
  public void setNonPrimaryAlpha(float paramFloat) {
    int i = (int)(paramFloat * 255.0F) & 0xFF;
    this.p = i;
    i = i << 24 | this.q & 0xFFFFFF;
    this.e.setTextColor(i);
    this.g.setTextColor(i);
  }
  
  public void setTextColor(int paramInt) {
    this.q = paramInt;
    this.f.setTextColor(paramInt);
    paramInt = this.p << 24 | this.q & 0xFFFFFF;
    this.e.setTextColor(paramInt);
    this.g.setTextColor(paramInt);
  }
  
  public void setTextSize(int paramInt, float paramFloat) {
    this.e.setTextSize(paramInt, paramFloat);
    this.f.setTextSize(paramInt, paramFloat);
    this.g.setTextSize(paramInt, paramFloat);
  }
  
  public void setTextSpacing(int paramInt) {
    this.j = paramInt;
    requestLayout();
  }
  
  private class a extends DataSetObserver implements ViewPager.i, ViewPager.h {
    private int b;
    
    a(PagerTitleStrip this$0) {}
    
    public void a(int param1Int1, float param1Float, int param1Int2) {
      param1Int2 = param1Int1;
      if (param1Float > 0.5F)
        param1Int2 = param1Int1 + 1; 
      this.c.c(param1Int2, param1Float, false);
    }
    
    public void b(ViewPager param1ViewPager, a param1a1, a param1a2) {
      this.c.a(param1a1, param1a2);
    }
    
    public void c(int param1Int) {
      this.b = param1Int;
    }
    
    public void d(int param1Int) {
      if (this.b == 0) {
        PagerTitleStrip pagerTitleStrip = this.c;
        pagerTitleStrip.b(pagerTitleStrip.d.getCurrentItem(), this.c.d.getAdapter());
        pagerTitleStrip = this.c;
        float f = pagerTitleStrip.i;
        if (f < 0.0F)
          f = 0.0F; 
        pagerTitleStrip.c(pagerTitleStrip.d.getCurrentItem(), f, true);
      } 
    }
    
    public void onChanged() {
      PagerTitleStrip pagerTitleStrip = this.c;
      pagerTitleStrip.b(pagerTitleStrip.d.getCurrentItem(), this.c.d.getAdapter());
      pagerTitleStrip = this.c;
      float f = pagerTitleStrip.i;
      if (f < 0.0F)
        f = 0.0F; 
      pagerTitleStrip.c(pagerTitleStrip.d.getCurrentItem(), f, true);
    }
  }
  
  private static class b extends SingleLineTransformationMethod {
    private Locale b;
    
    b(Context param1Context) {
      this.b = (param1Context.getResources().getConfiguration()).locale;
    }
    
    public CharSequence getTransformation(CharSequence param1CharSequence, View param1View) {
      param1CharSequence = super.getTransformation(param1CharSequence, param1View);
      if (param1CharSequence != null) {
        param1CharSequence = param1CharSequence.toString().toUpperCase(this.b);
      } else {
        param1CharSequence = null;
      } 
      return param1CharSequence;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/viewpager/widget/PagerTitleStrip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */