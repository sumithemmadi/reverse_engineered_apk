package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public class PagerTabStrip extends PagerTitleStrip {
  private boolean A;
  
  private boolean B;
  
  private int C;
  
  private boolean D;
  
  private float E;
  
  private float F;
  
  private int G;
  
  private int r;
  
  private int s;
  
  private int t;
  
  private int u;
  
  private int v;
  
  private int w;
  
  private final Paint x;
  
  private final Rect y;
  
  private int z;
  
  public PagerTabStrip(Context paramContext) {
    this(paramContext, null);
  }
  
  public PagerTabStrip(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    Paint paint = new Paint();
    this.x = paint;
    this.y = new Rect();
    this.z = 255;
    this.A = false;
    this.B = false;
    int i = this.q;
    this.r = i;
    paint.setColor(i);
    float f = (paramContext.getResources().getDisplayMetrics()).density;
    this.s = (int)(3.0F * f + 0.5F);
    this.t = (int)(6.0F * f + 0.5F);
    this.u = (int)(64.0F * f);
    this.w = (int)(16.0F * f + 0.5F);
    this.C = (int)(1.0F * f + 0.5F);
    this.v = (int)(f * 32.0F + 0.5F);
    this.G = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    setTextSpacing(getTextSpacing());
    setWillNotDraw(false);
    this.e.setFocusable(true);
    this.e.setOnClickListener(new a(this));
    this.g.setFocusable(true);
    this.g.setOnClickListener(new b(this));
    if (getBackground() == null)
      this.A = true; 
  }
  
  void c(int paramInt, float paramFloat, boolean paramBoolean) {
    Rect rect = this.y;
    int i = getHeight();
    int j = this.f.getLeft();
    int k = this.w;
    int m = this.f.getRight();
    int n = this.w;
    int i1 = i - this.s;
    rect.set(j - k, i1, m + n, i);
    super.c(paramInt, paramFloat, paramBoolean);
    this.z = (int)(Math.abs(paramFloat - 0.5F) * 2.0F * 255.0F);
    rect.union(this.f.getLeft() - this.w, i1, this.f.getRight() + this.w, i);
    invalidate(rect);
  }
  
  public boolean getDrawFullUnderline() {
    return this.A;
  }
  
  int getMinHeight() {
    return Math.max(super.getMinHeight(), this.v);
  }
  
  public int getTabIndicatorColor() {
    return this.r;
  }
  
  protected void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    int i = getHeight();
    int j = this.f.getLeft();
    int k = this.w;
    int m = this.f.getRight();
    int n = this.w;
    int i1 = this.s;
    this.x.setColor(this.z << 24 | this.r & 0xFFFFFF);
    float f1 = (j - k);
    float f2 = (i - i1);
    float f3 = (m + n);
    float f4 = i;
    paramCanvas.drawRect(f1, f2, f3, f4, this.x);
    if (this.A) {
      this.x.setColor(0xFF000000 | this.r & 0xFFFFFF);
      paramCanvas.drawRect(getPaddingLeft(), (i - this.C), (getWidth() - getPaddingRight()), f4, this.x);
    } 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getAction();
    if (i != 0 && this.D)
      return false; 
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    if (i != 0) {
      if (i != 1) {
        if (i == 2 && (Math.abs(f1 - this.E) > this.G || Math.abs(f2 - this.F) > this.G))
          this.D = true; 
      } else if (f1 < (this.f.getLeft() - this.w)) {
        ViewPager viewPager = this.d;
        viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
      } else if (f1 > (this.f.getRight() + this.w)) {
        ViewPager viewPager = this.d;
        viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
      } 
    } else {
      this.E = f1;
      this.F = f2;
      this.D = false;
    } 
    return true;
  }
  
  public void setBackgroundColor(int paramInt) {
    super.setBackgroundColor(paramInt);
    if (!this.B) {
      boolean bool;
      if ((paramInt & 0xFF000000) == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      this.A = bool;
    } 
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    if (!this.B) {
      boolean bool;
      if (paramDrawable == null) {
        bool = true;
      } else {
        bool = false;
      } 
      this.A = bool;
    } 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    if (!this.B) {
      boolean bool;
      if (paramInt == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      this.A = bool;
    } 
  }
  
  public void setDrawFullUnderline(boolean paramBoolean) {
    this.A = paramBoolean;
    this.B = true;
    invalidate();
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = this.t;
    int j = paramInt4;
    if (paramInt4 < i)
      j = i; 
    super.setPadding(paramInt1, paramInt2, paramInt3, j);
  }
  
  public void setTabIndicatorColor(int paramInt) {
    this.r = paramInt;
    this.x.setColor(paramInt);
    invalidate();
  }
  
  public void setTabIndicatorColorResource(int paramInt) {
    setTabIndicatorColor(androidx.core.content.a.d(getContext(), paramInt));
  }
  
  public void setTextSpacing(int paramInt) {
    int i = this.u;
    int j = paramInt;
    if (paramInt < i)
      j = i; 
    super.setTextSpacing(j);
  }
  
  class a implements View.OnClickListener {
    a(PagerTabStrip this$0) {}
    
    public void onClick(View param1View) {
      ViewPager viewPager = this.b.d;
      viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
    }
  }
  
  class b implements View.OnClickListener {
    b(PagerTabStrip this$0) {}
    
    public void onClick(View param1View) {
      ViewPager viewPager = this.b.d;
      viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/viewpager/widget/PagerTabStrip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */