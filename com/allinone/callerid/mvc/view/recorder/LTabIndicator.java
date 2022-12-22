package com.allinone.callerid.mvc.view.recorder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.allinone.callerid.customview.LFrameLayout;
import com.allinone.callerid.util.g1;

public class LTabIndicator extends HorizontalScrollView {
  private int A = 52;
  
  private float B = 3.0F;
  
  private float C = 1.0F;
  
  private int D = 1;
  
  private int E = 0;
  
  private boolean F;
  
  public ViewPager.i b;
  
  private b c;
  
  private LinearLayout d;
  
  private ViewPager e;
  
  private int f;
  
  private int g = 0;
  
  private float h = 0.0F;
  
  private Paint i = new Paint();
  
  private Paint j = new Paint();
  
  private Paint k;
  
  private int l = -1;
  
  private int m = 16777215;
  
  public int n = 436207616;
  
  public int o = -1;
  
  public int p = 1728053247;
  
  public int q = 419430400;
  
  private boolean r = true;
  
  private boolean s = false;
  
  private boolean t = false;
  
  private boolean u = true;
  
  public int v = 12;
  
  public int w = 24;
  
  public int x = 0;
  
  public int y = 0;
  
  public int z = 14;
  
  public LTabIndicator(Context paramContext) {
    this(paramContext, null);
  }
  
  public LTabIndicator(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public LTabIndicator(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    setFillViewport(true);
    setWillNotDraw(false);
    DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
    LinearLayout linearLayout = new LinearLayout(paramContext);
    this.d = linearLayout;
    linearLayout.setOrientation(0);
    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
    layoutParams.height = (int)TypedValue.applyDimension(1, 50.0F, displayMetrics);
    this.d.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
    addView((View)this.d);
    this.A = (int)TypedValue.applyDimension(1, this.A, displayMetrics);
    this.v = (int)TypedValue.applyDimension(1, this.v, displayMetrics);
    this.w = (int)TypedValue.applyDimension(1, this.w, displayMetrics);
    this.D = (int)TypedValue.applyDimension(1, this.D, displayMetrics);
    this.B = TypedValue.applyDimension(1, this.B, displayMetrics);
    this.C = TypedValue.applyDimension(1, this.C, displayMetrics);
    this.i.setAntiAlias(true);
    this.i.setStyle(Paint.Style.FILL);
    this.i.setColor(this.l);
    this.j.setAntiAlias(true);
    this.j.setStyle(Paint.Style.FILL);
    this.j.setColor(this.m);
    Paint paint = new Paint();
    this.k = paint;
    paint.setAntiAlias(true);
    this.k.setStrokeWidth(this.D);
  }
  
  private void j(int paramInt, String paramString) {
    LinearLayout.LayoutParams layoutParams;
    d d = new d(getContext());
    d.b().setText(paramString);
    d.setFocusable(true);
    d.setOnClickListener(new a(this, paramInt));
    if (!this.r) {
      int j = this.w;
      d.setPadding(j, 0, j, 0);
    } 
    LinearLayout linearLayout = this.d;
    if (this.r) {
      layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0F);
    } else {
      layoutParams = new LinearLayout.LayoutParams(-2, -1);
    } 
    linearLayout.addView((View)d, paramInt, (ViewGroup.LayoutParams)layoutParams);
  }
  
  private void l(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : I
    //   4: ifne -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield d : Landroid/widget/LinearLayout;
    //   12: iload_1
    //   13: invokevirtual getChildAt : (I)Landroid/view/View;
    //   16: invokevirtual getLeft : ()I
    //   19: iload_2
    //   20: iadd
    //   21: istore_3
    //   22: iload_1
    //   23: ifgt -> 32
    //   26: iload_3
    //   27: istore_1
    //   28: iload_2
    //   29: ifle -> 39
    //   32: iload_3
    //   33: aload_0
    //   34: getfield A : I
    //   37: isub
    //   38: istore_1
    //   39: iload_1
    //   40: aload_0
    //   41: getfield E : I
    //   44: if_icmpeq -> 58
    //   47: aload_0
    //   48: iload_1
    //   49: putfield E : I
    //   52: aload_0
    //   53: iload_1
    //   54: iconst_0
    //   55: invokevirtual scrollTo : (II)V
    //   58: return
  }
  
  private void m(int paramInt) {
    int j = this.d.getChildCount();
    for (byte b1 = 0; b1 < j; b1++) {
      boolean bool;
      View view = this.d.getChildAt(b1);
      if (b1 == paramInt) {
        bool = true;
      } else {
        bool = false;
      } 
      view.setSelected(bool);
      if (bool) {
        ((d)view).b().setTextColor(this.o);
      } else {
        ((d)view).b().setTextColor(this.p);
      } 
    } 
  }
  
  private void n() {
    for (byte b1 = 0; b1 < this.f; b1++)
      this.d.getChildAt(b1).setBackgroundColor(0); 
    m(this.e.getCurrentItem());
  }
  
  public boolean getViewPagerScrollWithAnimation() {
    return this.u;
  }
  
  public void k() {
    this.d.removeAllViews();
    this.f = this.e.getAdapter().e();
    for (byte b1 = 0; b1 < this.f; b1++)
      j(b1, this.e.getAdapter().g(b1).toString()); 
    n();
  }
  
  protected void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    if (!isInEditMode() && this.f != 0) {
      int j = getHeight();
      if (this.t) {
        paramCanvas.drawRect(0.0F, 0.0F, this.d.getWidth(), this.C, this.j);
      } else {
        float f = j;
        paramCanvas.drawRect(0.0F, f - this.C, this.d.getWidth(), f, this.j);
      } 
      View view = this.d.getChildAt(this.g);
      float f2 = view.getLeft();
      float f3 = view.getRight();
      float f4 = f3;
      float f1 = f2;
      if (this.h > 0.0F) {
        int k = this.g;
        f4 = f3;
        f1 = f2;
        if (k < this.f - 1) {
          view = this.d.getChildAt(k + 1);
          f1 = view.getLeft();
          f4 = view.getRight();
          float f = this.h;
          f1 = f1 * f + (1.0F - f) * f2;
          f4 = f4 * f + (1.0F - f) * f3;
        } 
      } 
      if (this.t) {
        paramCanvas.drawRect(f1, 0.0F, f4, this.B, this.i);
      } else {
        f3 = j;
        paramCanvas.drawRect(f1, f3 - this.B, f4, f3, this.i);
      } 
      if (this.s) {
        this.k.setColor(this.n);
        for (byte b1 = 0; b1 < this.f - 1; b1++) {
          view = this.d.getChildAt(b1);
          paramCanvas.drawLine(view.getRight(), this.v, view.getRight(), (j - this.v), this.k);
        } 
      } 
    } 
  }
  
  public void setCurrentItem(int paramInt) {
    this.e.setCurrentItem(paramInt, this.u);
  }
  
  public void setEnableDivider(boolean paramBoolean) {
    this.s = paramBoolean;
  }
  
  public void setEnableExpand(boolean paramBoolean) {
    this.r = paramBoolean;
  }
  
  public void setIndicatorColor(int paramInt) {
    this.i.setColor(paramInt);
  }
  
  public void setIndicatorOnTop(boolean paramBoolean) {
    this.t = paramBoolean;
  }
  
  public void setOnPageChangeListener(ViewPager.i parami) {
    this.b = parami;
  }
  
  public void setOnTabReselectedListener(b paramb) {
    this.c = paramb;
  }
  
  public void setTabText(int paramInt, String paramString) {
    if (paramInt >= 0 && paramInt <= this.d.getChildCount() - 1) {
      View view = this.d.getChildAt(paramInt);
      if (view instanceof TextView)
        ((TextView)view).setText(paramString); 
      return;
    } 
    throw new RuntimeException("tabs does not have this position.");
  }
  
  public void setUnderlineColor(int paramInt) {
    this.j.setColor(paramInt);
  }
  
  public void setViewPager(ViewPager paramViewPager) {
    this.e = paramViewPager;
    if (paramViewPager.getAdapter() != null) {
      paramViewPager.setOnPageChangeListener(new c(null));
      k();
      return;
    } 
    throw new IllegalStateException("ViewPager does not have adapter instance.");
  }
  
  public void setViewPagerScrollWithAnimation(boolean paramBoolean) {
    this.u = paramBoolean;
  }
  
  class a implements View.OnClickListener {
    a(LTabIndicator this$0, int param1Int) {}
    
    public void onClick(View param1View) {
      if (LTabIndicator.b(this.c).getCurrentItem() != this.b && LTabIndicator.c(this.c) != null)
        LTabIndicator.c(this.c).a(this.b); 
      LTabIndicator.b(this.c).setCurrentItem(this.b, LTabIndicator.d(this.c));
    }
  }
  
  public static interface b {
    void a(int param1Int);
  }
  
  private class c implements ViewPager.i {
    private c(LTabIndicator this$0) {}
    
    public void a(int param1Int1, float param1Float, int param1Int2) {
      LTabIndicator.e(this.b, param1Int1);
      LTabIndicator.f(this.b, param1Float);
      LTabIndicator lTabIndicator = this.b;
      LTabIndicator.h(lTabIndicator, param1Int1, (int)(LTabIndicator.g(lTabIndicator).getChildAt(param1Int1).getWidth() * param1Float));
      this.b.invalidate();
      ViewPager.i i1 = this.b.b;
      if (i1 != null)
        i1.a(param1Int1, param1Float, param1Int2); 
    }
    
    public void c(int param1Int) {
      if (param1Int == 0) {
        LTabIndicator lTabIndicator = this.b;
        LTabIndicator.h(lTabIndicator, LTabIndicator.b(lTabIndicator).getCurrentItem(), 0);
      } 
      ViewPager.i i1 = this.b.b;
      if (i1 != null)
        i1.c(param1Int); 
    }
    
    public void d(int param1Int) {
      LTabIndicator.i(this.b, param1Int);
      ViewPager.i i1 = this.b.b;
      if (i1 != null)
        i1.d(param1Int); 
    }
  }
  
  private class d extends LFrameLayout {
    private TextView c;
    
    private Typeface d = g1.a();
    
    public d(Context param1Context) {
      this(param1Context, null);
    }
    
    public d(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      c();
      setDelayClick(false);
      setColor(LTabIndicator.this.q);
    }
    
    private void c() {
      this.c = new TextView(getContext());
      if (!LTabIndicator.a(this.e))
        this.c.setTypeface(this.d); 
      this.c.setTextSize(this.e.z / (getResources().getConfiguration()).fontScale);
      this.c.setSingleLine(true);
      this.c.setGravity(17);
      TextView textView = this.c;
      LTabIndicator lTabIndicator = this.e;
      textView.setPadding(lTabIndicator.x, 0, lTabIndicator.y, 0);
      FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
      addView((View)this.c, (ViewGroup.LayoutParams)layoutParams);
    }
    
    public TextView b() {
      return this.c;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/view/recorder/LTabIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */