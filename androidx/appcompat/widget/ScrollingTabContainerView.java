package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;

public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
  private static final Interpolator b = (Interpolator)new DecelerateInterpolator();
  
  Runnable c;
  
  private c d;
  
  LinearLayoutCompat e;
  
  private Spinner f;
  
  private boolean g;
  
  int h;
  
  int i;
  
  private int j;
  
  private int k;
  
  protected ViewPropertyAnimator l;
  
  protected final e m = new e(this);
  
  public ScrollingTabContainerView(Context paramContext) {
    super(paramContext);
    setHorizontalScrollBarEnabled(false);
    b.a.o.a a = b.a.o.a.b(paramContext);
    setContentHeight(a.f());
    this.i = a.e();
    LinearLayoutCompat linearLayoutCompat = c();
    this.e = linearLayoutCompat;
    addView((View)linearLayoutCompat, new ViewGroup.LayoutParams(-2, -1));
  }
  
  private Spinner b() {
    AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, b.a.a.actionDropDownStyle);
    appCompatSpinner.setLayoutParams((ViewGroup.LayoutParams)new LinearLayoutCompat.LayoutParams(-2, -1));
    appCompatSpinner.setOnItemSelectedListener(this);
    return appCompatSpinner;
  }
  
  private LinearLayoutCompat c() {
    LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, b.a.a.actionBarTabBarStyle);
    linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
    linearLayoutCompat.setGravity(17);
    linearLayoutCompat.setLayoutParams((ViewGroup.LayoutParams)new LinearLayoutCompat.LayoutParams(-2, -1));
    return linearLayoutCompat;
  }
  
  private boolean e() {
    boolean bool;
    Spinner spinner = this.f;
    if (spinner != null && spinner.getParent() == this) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void f() {
    if (e())
      return; 
    if (this.f == null)
      this.f = b(); 
    removeView((View)this.e);
    addView((View)this.f, new ViewGroup.LayoutParams(-2, -1));
    if (this.f.getAdapter() == null)
      this.f.setAdapter((SpinnerAdapter)new b(this)); 
    Runnable runnable = this.c;
    if (runnable != null) {
      removeCallbacks(runnable);
      this.c = null;
    } 
    this.f.setSelection(this.k);
  }
  
  private boolean g() {
    if (!e())
      return false; 
    removeView((View)this.f);
    addView((View)this.e, new ViewGroup.LayoutParams(-2, -1));
    setTabSelected(this.f.getSelectedItemPosition());
    return false;
  }
  
  public void a(int paramInt) {
    View view = this.e.getChildAt(paramInt);
    Runnable runnable = this.c;
    if (runnable != null)
      removeCallbacks(runnable); 
    runnable = new a(this, view);
    this.c = runnable;
    post(runnable);
  }
  
  d d(ActionBar.b paramb, boolean paramBoolean) {
    d d = new d(this, getContext(), paramb, paramBoolean);
    if (paramBoolean) {
      d.setBackgroundDrawable(null);
      d.setLayoutParams((ViewGroup.LayoutParams)new AbsListView.LayoutParams(-1, this.j));
    } else {
      d.setFocusable(true);
      if (this.d == null)
        this.d = new c(this); 
      d.setOnClickListener(this.d);
    } 
    return d;
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    Runnable runnable = this.c;
    if (runnable != null)
      post(runnable); 
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    b.a.o.a a = b.a.o.a.b(getContext());
    setContentHeight(a.f());
    this.i = a.e();
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    Runnable runnable = this.c;
    if (runnable != null)
      removeCallbacks(runnable); 
  }
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) {
    ((d)paramView).b().e();
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    boolean bool;
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt2 = 1;
    if (i == 1073741824) {
      bool = true;
    } else {
      bool = false;
    } 
    setFillViewport(bool);
    int j = this.e.getChildCount();
    if (j > 1 && (i == 1073741824 || i == Integer.MIN_VALUE)) {
      if (j > 2) {
        this.h = (int)(View.MeasureSpec.getSize(paramInt1) * 0.4F);
      } else {
        this.h = View.MeasureSpec.getSize(paramInt1) / 2;
      } 
      this.h = Math.min(this.h, this.i);
    } else {
      this.h = -1;
    } 
    j = View.MeasureSpec.makeMeasureSpec(this.j, 1073741824);
    if (bool || !this.g)
      paramInt2 = 0; 
    if (paramInt2 != 0) {
      this.e.measure(0, j);
      if (this.e.getMeasuredWidth() > View.MeasureSpec.getSize(paramInt1)) {
        f();
      } else {
        g();
      } 
    } else {
      g();
    } 
    paramInt2 = getMeasuredWidth();
    super.onMeasure(paramInt1, j);
    paramInt1 = getMeasuredWidth();
    if (bool && paramInt2 != paramInt1)
      setTabSelected(this.k); 
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
  
  public void setAllowCollapse(boolean paramBoolean) {
    this.g = paramBoolean;
  }
  
  public void setContentHeight(int paramInt) {
    this.j = paramInt;
    requestLayout();
  }
  
  public void setTabSelected(int paramInt) {
    this.k = paramInt;
    int i = this.e.getChildCount();
    for (byte b = 0; b < i; b++) {
      boolean bool;
      View view = this.e.getChildAt(b);
      if (b == paramInt) {
        bool = true;
      } else {
        bool = false;
      } 
      view.setSelected(bool);
      if (bool)
        a(paramInt); 
    } 
    Spinner spinner = this.f;
    if (spinner != null && paramInt >= 0)
      spinner.setSelection(paramInt); 
  }
  
  class a implements Runnable {
    a(ScrollingTabContainerView this$0, View param1View) {}
    
    public void run() {
      int i = this.b.getLeft();
      int j = (this.c.getWidth() - this.b.getWidth()) / 2;
      this.c.smoothScrollTo(i - j, 0);
      this.c.c = null;
    }
  }
  
  private class b extends BaseAdapter {
    b(ScrollingTabContainerView this$0) {}
    
    public int getCount() {
      return this.b.e.getChildCount();
    }
    
    public Object getItem(int param1Int) {
      return ((ScrollingTabContainerView.d)this.b.e.getChildAt(param1Int)).b();
    }
    
    public long getItemId(int param1Int) {
      return param1Int;
    }
    
    public View getView(int param1Int, View param1View, ViewGroup param1ViewGroup) {
      ScrollingTabContainerView.d d;
      if (param1View == null) {
        d = this.b.d((ActionBar.b)getItem(param1Int), true);
      } else {
        d.a((ActionBar.b)getItem(param1Int));
      } 
      return (View)d;
    }
  }
  
  private class c implements View.OnClickListener {
    c(ScrollingTabContainerView this$0) {}
    
    public void onClick(View param1View) {
      ((ScrollingTabContainerView.d)param1View).b().e();
      int i = this.b.e.getChildCount();
      for (byte b = 0; b < i; b++) {
        boolean bool;
        View view = this.b.e.getChildAt(b);
        if (view == param1View) {
          bool = true;
        } else {
          bool = false;
        } 
        view.setSelected(bool);
      } 
    }
  }
  
  private class d extends LinearLayout {
    private final int[] b;
    
    private ActionBar.b c;
    
    private TextView d;
    
    private ImageView e;
    
    private View f;
    
    public d(ScrollingTabContainerView this$0, Context param1Context, ActionBar.b param1b, boolean param1Boolean) {
      super(param1Context, null, i);
      int[] arrayOfInt = new int[1];
      arrayOfInt[0] = 16842964;
      this.b = arrayOfInt;
      this.c = param1b;
      e0 e0 = e0.v(param1Context, null, arrayOfInt, i, 0);
      if (e0.s(0))
        setBackgroundDrawable(e0.g(0)); 
      e0.w();
      if (param1Boolean)
        setGravity(8388627); 
      c();
    }
    
    public void a(ActionBar.b param1b) {
      this.c = param1b;
      c();
    }
    
    public ActionBar.b b() {
      return this.c;
    }
    
    public void c() {
      ActionBar.b b1 = this.c;
      View view = b1.b();
      ViewParent viewParent = null;
      if (view != null) {
        viewParent = view.getParent();
        if (viewParent != this) {
          if (viewParent != null)
            ((ViewGroup)viewParent).removeView(view); 
          addView(view);
        } 
        this.f = view;
        TextView textView = this.d;
        if (textView != null)
          textView.setVisibility(8); 
        ImageView imageView = this.e;
        if (imageView != null) {
          imageView.setVisibility(8);
          this.e.setImageDrawable(null);
        } 
      } else {
        CharSequence charSequence2;
        view = this.f;
        if (view != null) {
          removeView(view);
          this.f = null;
        } 
        Drawable drawable = b1.c();
        CharSequence charSequence1 = b1.d();
        if (drawable != null) {
          if (this.e == null) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            appCompatImageView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            addView((View)appCompatImageView, 0);
            this.e = appCompatImageView;
          } 
          this.e.setImageDrawable(drawable);
          this.e.setVisibility(0);
        } else {
          ImageView imageView1 = this.e;
          if (imageView1 != null) {
            imageView1.setVisibility(8);
            this.e.setImageDrawable(null);
          } 
        } 
        int i = TextUtils.isEmpty(charSequence1) ^ true;
        if (i != 0) {
          if (this.d == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, b.a.a.actionBarTabTextStyle);
            appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            appCompatTextView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            addView((View)appCompatTextView);
            this.d = appCompatTextView;
          } 
          this.d.setText(charSequence1);
          this.d.setVisibility(0);
        } else {
          TextView textView = this.d;
          if (textView != null) {
            textView.setVisibility(8);
            this.d.setText(null);
          } 
        } 
        ImageView imageView = this.e;
        if (imageView != null)
          imageView.setContentDescription(b1.a()); 
        if (i == 0)
          charSequence2 = b1.a(); 
        g0.a((View)this, charSequence2);
      } 
    }
    
    public void onInitializeAccessibilityEvent(AccessibilityEvent param1AccessibilityEvent) {
      super.onInitializeAccessibilityEvent(param1AccessibilityEvent);
      param1AccessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
    }
    
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo param1AccessibilityNodeInfo) {
      super.onInitializeAccessibilityNodeInfo(param1AccessibilityNodeInfo);
      param1AccessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
    }
    
    public void onMeasure(int param1Int1, int param1Int2) {
      super.onMeasure(param1Int1, param1Int2);
      if (this.g.h > 0) {
        param1Int1 = getMeasuredWidth();
        int i = this.g.h;
        if (param1Int1 > i)
          super.onMeasure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), param1Int2); 
      } 
    }
    
    public void setSelected(boolean param1Boolean) {
      boolean bool;
      if (isSelected() != param1Boolean) {
        bool = true;
      } else {
        bool = false;
      } 
      super.setSelected(param1Boolean);
      if (bool && param1Boolean)
        sendAccessibilityEvent(4); 
    }
  }
  
  protected class e extends AnimatorListenerAdapter {
    private boolean a = false;
    
    private int b;
    
    protected e(ScrollingTabContainerView this$0) {}
    
    public void onAnimationCancel(Animator param1Animator) {
      this.a = true;
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      if (this.a)
        return; 
      ScrollingTabContainerView scrollingTabContainerView = this.c;
      scrollingTabContainerView.l = null;
      scrollingTabContainerView.setVisibility(this.b);
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.c.setVisibility(0);
      this.a = false;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/ScrollingTabContainerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */