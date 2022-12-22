package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import b.a.j;
import b.h.k.a0;
import b.h.k.b0;
import b.h.k.w;

abstract class a extends ViewGroup {
  protected final a b = new a(this);
  
  protected final Context c;
  
  protected ActionMenuView d;
  
  protected ActionMenuPresenter e;
  
  protected int f;
  
  protected a0 g;
  
  private boolean h;
  
  private boolean i;
  
  a(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  a(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    TypedValue typedValue = new TypedValue();
    if (paramContext.getTheme().resolveAttribute(b.a.a.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
      this.c = (Context)new ContextThemeWrapper(paramContext, typedValue.resourceId);
    } else {
      this.c = paramContext;
    } 
  }
  
  protected static int d(int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramBoolean) {
      paramInt1 -= paramInt2;
    } else {
      paramInt1 += paramInt2;
    } 
    return paramInt1;
  }
  
  protected int c(View paramView, int paramInt1, int paramInt2, int paramInt3) {
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, -2147483648), paramInt2);
    return Math.max(0, paramInt1 - paramView.getMeasuredWidth() - paramInt3);
  }
  
  protected int e(View paramView, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    paramInt2 += (paramInt3 - j) / 2;
    if (paramBoolean) {
      paramView.layout(paramInt1 - i, paramInt2, paramInt1, j + paramInt2);
    } else {
      paramView.layout(paramInt1, paramInt2, paramInt1 + i, j + paramInt2);
    } 
    paramInt1 = i;
    if (paramBoolean)
      paramInt1 = -i; 
    return paramInt1;
  }
  
  public a0 f(int paramInt, long paramLong) {
    a0 a01 = this.g;
    if (a01 != null)
      a01.b(); 
    if (paramInt == 0) {
      if (getVisibility() != 0)
        setAlpha(0.0F); 
      a01 = w.d((View)this).a(1.0F);
      a01.d(paramLong);
      a01.f(this.b.d(a01, paramInt));
      return a01;
    } 
    a01 = w.d((View)this).a(0.0F);
    a01.d(paramLong);
    a01.f(this.b.d(a01, paramInt));
    return a01;
  }
  
  public int getAnimatedVisibility() {
    return (this.g != null) ? this.b.b : getVisibility();
  }
  
  public int getContentHeight() {
    return this.f;
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    TypedArray typedArray = getContext().obtainStyledAttributes(null, j.ActionBar, b.a.a.actionBarStyle, 0);
    setContentHeight(typedArray.getLayoutDimension(j.ActionBar_height, 0));
    typedArray.recycle();
    ActionMenuPresenter actionMenuPresenter = this.e;
    if (actionMenuPresenter != null)
      actionMenuPresenter.I(paramConfiguration); 
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionMasked();
    if (i == 9)
      this.i = false; 
    if (!this.i) {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if (i == 9 && !bool)
        this.i = true; 
    } 
    if (i == 10 || i == 3)
      this.i = false; 
    return true;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0)
      this.h = false; 
    if (!this.h) {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if (i == 0 && !bool)
        this.h = true; 
    } 
    if (i == 1 || i == 3)
      this.h = false; 
    return true;
  }
  
  public abstract void setContentHeight(int paramInt);
  
  public void setVisibility(int paramInt) {
    if (paramInt != getVisibility()) {
      a0 a01 = this.g;
      if (a01 != null)
        a01.b(); 
      super.setVisibility(paramInt);
    } 
  }
  
  protected class a implements b0 {
    private boolean a = false;
    
    int b;
    
    protected a(a this$0) {}
    
    public void a(View param1View) {
      this.a = true;
    }
    
    public void b(View param1View) {
      if (this.a)
        return; 
      a a1 = this.c;
      a1.g = null;
      a.b(a1, this.b);
    }
    
    public void c(View param1View) {
      a.a(this.c, 0);
      this.a = false;
    }
    
    public a d(a0 param1a0, int param1Int) {
      this.c.g = param1a0;
      this.b = param1Int;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */