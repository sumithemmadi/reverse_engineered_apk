package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import b.a.f;
import b.a.g;
import b.a.j;
import b.a.o.b;
import b.h.k.a0;
import b.h.k.w;

public class ActionBarContextView extends a {
  private CharSequence j;
  
  private CharSequence k;
  
  private View l;
  
  private View m;
  
  private View n;
  
  private LinearLayout o;
  
  private TextView p;
  
  private TextView q;
  
  private int r;
  
  private int s;
  
  private boolean t;
  
  private int u;
  
  public ActionBarContextView(Context paramContext) {
    this(paramContext, null);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.a.a.actionModeStyle);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    e0 e0 = e0.v(paramContext, paramAttributeSet, j.ActionMode, paramInt, 0);
    w.u0((View)this, e0.g(j.ActionMode_background));
    this.r = e0.n(j.ActionMode_titleTextStyle, 0);
    this.s = e0.n(j.ActionMode_subtitleTextStyle, 0);
    this.f = e0.m(j.ActionMode_height, 0);
    this.u = e0.n(j.ActionMode_closeItemLayout, g.abc_action_mode_close_item_material);
    e0.w();
  }
  
  private void i() {
    if (this.o == null) {
      LayoutInflater.from(getContext()).inflate(g.abc_action_bar_title_item, this);
      LinearLayout linearLayout1 = (LinearLayout)getChildAt(getChildCount() - 1);
      this.o = linearLayout1;
      this.p = (TextView)linearLayout1.findViewById(f.action_bar_title);
      this.q = (TextView)this.o.findViewById(f.action_bar_subtitle);
      if (this.r != 0)
        this.p.setTextAppearance(getContext(), this.r); 
      if (this.s != 0)
        this.q.setTextAppearance(getContext(), this.s); 
    } 
    this.p.setText(this.j);
    this.q.setText(this.k);
    boolean bool = TextUtils.isEmpty(this.j);
    int i = TextUtils.isEmpty(this.k) ^ true;
    TextView textView = this.q;
    boolean bool1 = false;
    if (i != 0) {
      b = 0;
    } else {
      b = 8;
    } 
    textView.setVisibility(b);
    LinearLayout linearLayout = this.o;
    byte b = bool1;
    if ((bool ^ true) == 0)
      if (i != 0) {
        b = bool1;
      } else {
        b = 8;
      }  
    linearLayout.setVisibility(b);
    if (this.o.getParent() == null)
      addView((View)this.o); 
  }
  
  public void g() {
    if (this.l == null)
      k(); 
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
    return (ViewGroup.LayoutParams)new ViewGroup.MarginLayoutParams(-1, -2);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    return (ViewGroup.LayoutParams)new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }
  
  public CharSequence getSubtitle() {
    return this.k;
  }
  
  public CharSequence getTitle() {
    return this.j;
  }
  
  public void h(b paramb) {
    View view = this.l;
    if (view == null) {
      view = LayoutInflater.from(getContext()).inflate(this.u, this, false);
      this.l = view;
      addView(view);
    } else if (view.getParent() == null) {
      addView(this.l);
    } 
    view = this.l.findViewById(f.action_mode_close_button);
    this.m = view;
    view.setOnClickListener(new a(this, paramb));
    g g = (g)paramb.e();
    ActionMenuPresenter actionMenuPresenter = this.e;
    if (actionMenuPresenter != null)
      actionMenuPresenter.B(); 
    actionMenuPresenter = new ActionMenuPresenter(getContext());
    this.e = actionMenuPresenter;
    actionMenuPresenter.M(true);
    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
    g.c((m)this.e, this.c);
    ActionMenuView actionMenuView = (ActionMenuView)this.e.r(this);
    this.d = actionMenuView;
    w.u0((View)actionMenuView, null);
    addView((View)this.d, layoutParams);
  }
  
  public boolean j() {
    return this.t;
  }
  
  public void k() {
    removeAllViews();
    this.n = null;
    this.d = null;
    this.e = null;
    View view = this.m;
    if (view != null)
      view.setOnClickListener(null); 
  }
  
  public boolean l() {
    ActionMenuPresenter actionMenuPresenter = this.e;
    return (actionMenuPresenter != null) ? actionMenuPresenter.N() : false;
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    ActionMenuPresenter actionMenuPresenter = this.e;
    if (actionMenuPresenter != null) {
      actionMenuPresenter.E();
      this.e.F();
    } 
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    if (paramAccessibilityEvent.getEventType() == 32) {
      paramAccessibilityEvent.setSource((View)this);
      paramAccessibilityEvent.setClassName(getClass().getName());
      paramAccessibilityEvent.setPackageName(getContext().getPackageName());
      paramAccessibilityEvent.setContentDescription(this.j);
    } else {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    } 
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i;
    paramBoolean = k0.b((View)this);
    if (paramBoolean) {
      i = paramInt3 - paramInt1 - getPaddingRight();
    } else {
      i = getPaddingLeft();
    } 
    int j = getPaddingTop();
    int k = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
    View view2 = this.l;
    paramInt2 = i;
    if (view2 != null) {
      paramInt2 = i;
      if (view2.getVisibility() != 8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.l.getLayoutParams();
        if (paramBoolean) {
          paramInt2 = marginLayoutParams.rightMargin;
        } else {
          paramInt2 = marginLayoutParams.leftMargin;
        } 
        if (paramBoolean) {
          paramInt4 = marginLayoutParams.leftMargin;
        } else {
          paramInt4 = marginLayoutParams.rightMargin;
        } 
        paramInt2 = a.d(i, paramInt2, paramBoolean);
        paramInt2 = a.d(paramInt2 + e(this.l, paramInt2, j, k, paramBoolean), paramInt4, paramBoolean);
      } 
    } 
    paramInt4 = paramInt2;
    LinearLayout linearLayout = this.o;
    paramInt2 = paramInt4;
    if (linearLayout != null) {
      paramInt2 = paramInt4;
      if (this.n == null) {
        paramInt2 = paramInt4;
        if (linearLayout.getVisibility() != 8)
          paramInt2 = paramInt4 + e((View)this.o, paramInt4, j, k, paramBoolean); 
      } 
    } 
    View view1 = this.n;
    if (view1 != null)
      e(view1, paramInt2, j, k, paramBoolean); 
    if (paramBoolean) {
      paramInt1 = getPaddingLeft();
    } else {
      paramInt1 = paramInt3 - paramInt1 - getPaddingRight();
    } 
    ActionMenuView actionMenuView = this.d;
    if (actionMenuView != null)
      e((View)actionMenuView, paramInt1, j, k, paramBoolean ^ true); 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = 1073741824;
    if (i == 1073741824) {
      if (View.MeasureSpec.getMode(paramInt2) != 0) {
        int k = View.MeasureSpec.getSize(paramInt1);
        i = this.f;
        if (i <= 0)
          i = View.MeasureSpec.getSize(paramInt2); 
        int m = getPaddingTop() + getPaddingBottom();
        paramInt1 = k - getPaddingLeft() - getPaddingRight();
        int n = i - m;
        int i1 = View.MeasureSpec.makeMeasureSpec(n, -2147483648);
        View view2 = this.l;
        boolean bool = false;
        paramInt2 = paramInt1;
        if (view2 != null) {
          paramInt1 = c(view2, paramInt1, i1, 0);
          ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.l.getLayoutParams();
          paramInt2 = paramInt1 - marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        } 
        ActionMenuView actionMenuView = this.d;
        paramInt1 = paramInt2;
        if (actionMenuView != null) {
          paramInt1 = paramInt2;
          if (actionMenuView.getParent() == this)
            paramInt1 = c((View)this.d, paramInt2, i1, 0); 
        } 
        LinearLayout linearLayout = this.o;
        paramInt2 = paramInt1;
        if (linearLayout != null) {
          paramInt2 = paramInt1;
          if (this.n == null)
            if (this.t) {
              paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 0);
              this.o.measure(paramInt2, i1);
              int i2 = this.o.getMeasuredWidth();
              if (i2 <= paramInt1) {
                i1 = 1;
              } else {
                i1 = 0;
              } 
              paramInt2 = paramInt1;
              if (i1 != 0)
                paramInt2 = paramInt1 - i2; 
              linearLayout = this.o;
              if (i1 != 0) {
                paramInt1 = 0;
              } else {
                paramInt1 = 8;
              } 
              linearLayout.setVisibility(paramInt1);
            } else {
              paramInt2 = c((View)linearLayout, paramInt1, i1, 0);
            }  
        } 
        View view1 = this.n;
        if (view1 != null) {
          ViewGroup.LayoutParams layoutParams = view1.getLayoutParams();
          int i2 = layoutParams.width;
          if (i2 != -2) {
            paramInt1 = 1073741824;
          } else {
            paramInt1 = Integer.MIN_VALUE;
          } 
          i1 = paramInt2;
          if (i2 >= 0)
            i1 = Math.min(i2, paramInt2); 
          i2 = layoutParams.height;
          if (i2 != -2) {
            paramInt2 = j;
          } else {
            paramInt2 = Integer.MIN_VALUE;
          } 
          j = n;
          if (i2 >= 0)
            j = Math.min(i2, n); 
          this.n.measure(View.MeasureSpec.makeMeasureSpec(i1, paramInt1), View.MeasureSpec.makeMeasureSpec(j, paramInt2));
        } 
        if (this.f <= 0) {
          j = getChildCount();
          paramInt2 = 0;
          paramInt1 = bool;
          while (paramInt1 < j) {
            i1 = getChildAt(paramInt1).getMeasuredHeight() + m;
            i = paramInt2;
            if (i1 > paramInt2)
              i = i1; 
            paramInt1++;
            paramInt2 = i;
          } 
          setMeasuredDimension(k, paramInt2);
        } else {
          setMeasuredDimension(k, i);
        } 
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(getClass().getSimpleName());
      stringBuilder1.append(" can only be used with android:layout_height=\"wrap_content\"");
      throw new IllegalStateException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getClass().getSimpleName());
    stringBuilder.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    IllegalStateException illegalStateException = new IllegalStateException(stringBuilder.toString());
    throw illegalStateException;
  }
  
  public void setContentHeight(int paramInt) {
    this.f = paramInt;
  }
  
  public void setCustomView(View paramView) {
    View view = this.n;
    if (view != null)
      removeView(view); 
    this.n = paramView;
    if (paramView != null) {
      LinearLayout linearLayout = this.o;
      if (linearLayout != null) {
        removeView((View)linearLayout);
        this.o = null;
      } 
    } 
    if (paramView != null)
      addView(paramView); 
    requestLayout();
  }
  
  public void setSubtitle(CharSequence paramCharSequence) {
    this.k = paramCharSequence;
    i();
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    this.j = paramCharSequence;
    i();
  }
  
  public void setTitleOptional(boolean paramBoolean) {
    if (paramBoolean != this.t)
      requestLayout(); 
    this.t = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState() {
    return false;
  }
  
  class a implements View.OnClickListener {
    a(ActionBarContextView this$0, b param1b) {}
    
    public void onClick(View param1View) {
      this.b.c();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/ActionBarContextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */