package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.r;
import androidx.customview.view.AbsSavedState;
import b.a.j;
import b.a.o.g;
import b.h.k.h;
import b.h.k.w;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
  private ColorStateList A;
  
  private ColorStateList B;
  
  private boolean C;
  
  private boolean D;
  
  private final ArrayList<View> E = new ArrayList<View>();
  
  private final ArrayList<View> F = new ArrayList<View>();
  
  private final int[] G = new int[2];
  
  e H;
  
  private final ActionMenuView.d I = new a(this);
  
  private f0 J;
  
  private ActionMenuPresenter K;
  
  private d L;
  
  private m.a M;
  
  private g.a N;
  
  private boolean O;
  
  private final Runnable P = new b(this);
  
  private ActionMenuView b;
  
  private TextView c;
  
  private TextView d;
  
  private ImageButton e;
  
  private ImageView f;
  
  private Drawable g;
  
  private CharSequence h;
  
  ImageButton i;
  
  View j;
  
  private Context k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  int o;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private int s;
  
  private int t;
  
  private x u;
  
  private int v;
  
  private int w;
  
  private int x = 8388627;
  
  private CharSequence y;
  
  private CharSequence z;
  
  public Toolbar(Context paramContext) {
    this(paramContext, null);
  }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.a.a.toolbarStyle);
  }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    Context context = getContext();
    int[] arrayOfInt = j.Toolbar;
    e0 e0 = e0.v(context, paramAttributeSet, arrayOfInt, paramInt, 0);
    w.p0((View)this, paramContext, arrayOfInt, paramAttributeSet, e0.r(), paramInt, 0);
    this.m = e0.n(j.Toolbar_titleTextAppearance, 0);
    this.n = e0.n(j.Toolbar_subtitleTextAppearance, 0);
    this.x = e0.l(j.Toolbar_android_gravity, this.x);
    this.o = e0.l(j.Toolbar_buttonGravity, 48);
    int i = e0.e(j.Toolbar_titleMargin, 0);
    int j = j.Toolbar_titleMargins;
    paramInt = i;
    if (e0.s(j))
      paramInt = e0.e(j, i); 
    this.t = paramInt;
    this.s = paramInt;
    this.r = paramInt;
    this.q = paramInt;
    paramInt = e0.e(j.Toolbar_titleMarginStart, -1);
    if (paramInt >= 0)
      this.q = paramInt; 
    paramInt = e0.e(j.Toolbar_titleMarginEnd, -1);
    if (paramInt >= 0)
      this.r = paramInt; 
    paramInt = e0.e(j.Toolbar_titleMarginTop, -1);
    if (paramInt >= 0)
      this.s = paramInt; 
    paramInt = e0.e(j.Toolbar_titleMarginBottom, -1);
    if (paramInt >= 0)
      this.t = paramInt; 
    this.p = e0.f(j.Toolbar_maxButtonHeight, -1);
    j = e0.e(j.Toolbar_contentInsetStart, -2147483648);
    int k = e0.e(j.Toolbar_contentInsetEnd, -2147483648);
    paramInt = e0.f(j.Toolbar_contentInsetLeft, 0);
    i = e0.f(j.Toolbar_contentInsetRight, 0);
    h();
    this.u.e(paramInt, i);
    if (j != Integer.MIN_VALUE || k != Integer.MIN_VALUE)
      this.u.g(j, k); 
    this.v = e0.e(j.Toolbar_contentInsetStartWithNavigation, -2147483648);
    this.w = e0.e(j.Toolbar_contentInsetEndWithActions, -2147483648);
    this.g = e0.g(j.Toolbar_collapseIcon);
    this.h = e0.p(j.Toolbar_collapseContentDescription);
    CharSequence charSequence3 = e0.p(j.Toolbar_title);
    if (!TextUtils.isEmpty(charSequence3))
      setTitle(charSequence3); 
    charSequence3 = e0.p(j.Toolbar_subtitle);
    if (!TextUtils.isEmpty(charSequence3))
      setSubtitle(charSequence3); 
    this.k = getContext();
    setPopupTheme(e0.n(j.Toolbar_popupTheme, 0));
    Drawable drawable2 = e0.g(j.Toolbar_navigationIcon);
    if (drawable2 != null)
      setNavigationIcon(drawable2); 
    CharSequence charSequence2 = e0.p(j.Toolbar_navigationContentDescription);
    if (!TextUtils.isEmpty(charSequence2))
      setNavigationContentDescription(charSequence2); 
    Drawable drawable1 = e0.g(j.Toolbar_logo);
    if (drawable1 != null)
      setLogo(drawable1); 
    CharSequence charSequence1 = e0.p(j.Toolbar_logoDescription);
    if (!TextUtils.isEmpty(charSequence1))
      setLogoDescription(charSequence1); 
    paramInt = j.Toolbar_titleTextColor;
    if (e0.s(paramInt))
      setTitleTextColor(e0.c(paramInt)); 
    paramInt = j.Toolbar_subtitleTextColor;
    if (e0.s(paramInt))
      setSubtitleTextColor(e0.c(paramInt)); 
    paramInt = j.Toolbar_menu;
    if (e0.s(paramInt))
      x(e0.n(paramInt, 0)); 
    e0.w();
  }
  
  private int B(View paramView, int paramInt1, int[] paramArrayOfint, int paramInt2) {
    LayoutParams layoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = ((ViewGroup.MarginLayoutParams)layoutParams).leftMargin - paramArrayOfint[0];
    paramInt1 += Math.max(0, i);
    paramArrayOfint[0] = Math.max(0, -i);
    i = q(paramView, paramInt2);
    paramInt2 = paramView.getMeasuredWidth();
    paramView.layout(paramInt1, i, paramInt1 + paramInt2, paramView.getMeasuredHeight() + i);
    return paramInt1 + paramInt2 + ((ViewGroup.MarginLayoutParams)layoutParams).rightMargin;
  }
  
  private int C(View paramView, int paramInt1, int[] paramArrayOfint, int paramInt2) {
    LayoutParams layoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = ((ViewGroup.MarginLayoutParams)layoutParams).rightMargin - paramArrayOfint[1];
    paramInt1 -= Math.max(0, i);
    paramArrayOfint[1] = Math.max(0, -i);
    i = q(paramView, paramInt2);
    paramInt2 = paramView.getMeasuredWidth();
    paramView.layout(paramInt1 - paramInt2, i, paramInt1, paramView.getMeasuredHeight() + i);
    return paramInt1 - paramInt2 + ((ViewGroup.MarginLayoutParams)layoutParams).leftMargin;
  }
  
  private int D(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = marginLayoutParams.leftMargin - paramArrayOfint[0];
    int j = marginLayoutParams.rightMargin - paramArrayOfint[1];
    int k = Math.max(0, i) + Math.max(0, j);
    paramArrayOfint[0] = Math.max(0, -i);
    paramArrayOfint[1] = Math.max(0, -j);
    paramView.measure(ViewGroup.getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + k + paramInt2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + paramInt4, marginLayoutParams.height));
    return paramView.getMeasuredWidth() + k;
  }
  
  private void E(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = ViewGroup.getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + paramInt2, marginLayoutParams.width);
    paramInt2 = ViewGroup.getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + paramInt4, marginLayoutParams.height);
    paramInt3 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = paramInt2;
    if (paramInt3 != 1073741824) {
      paramInt1 = paramInt2;
      if (paramInt5 >= 0) {
        paramInt1 = paramInt5;
        if (paramInt3 != 0)
          paramInt1 = Math.min(View.MeasureSpec.getSize(paramInt2), paramInt5); 
        paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      } 
    } 
    paramView.measure(i, paramInt1);
  }
  
  private void F() {
    removeCallbacks(this.P);
    post(this.P);
  }
  
  private boolean H() {
    if (!this.O)
      return false; 
    int i = getChildCount();
    for (byte b = 0; b < i; b++) {
      View view = getChildAt(b);
      if (I(view) && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0)
        return false; 
    } 
    return true;
  }
  
  private boolean I(View paramView) {
    boolean bool;
    if (paramView != null && paramView.getParent() == this && paramView.getVisibility() != 8) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void b(List<View> paramList, int paramInt) {
    int i = w.C((View)this);
    boolean bool = false;
    if (i == 1) {
      i = 1;
    } else {
      i = 0;
    } 
    int j = getChildCount();
    int k = b.h.k.e.b(paramInt, w.C((View)this));
    paramList.clear();
    paramInt = bool;
    if (i != 0) {
      for (paramInt = j - 1; paramInt >= 0; paramInt--) {
        View view = getChildAt(paramInt);
        LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
        if (layoutParams.b == 0 && I(view) && p(layoutParams.a) == k)
          paramList.add(view); 
      } 
    } else {
      while (paramInt < j) {
        View view = getChildAt(paramInt);
        LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
        if (layoutParams.b == 0 && I(view) && p(layoutParams.a) == k)
          paramList.add(view); 
        paramInt++;
      } 
    } 
  }
  
  private void c(View paramView, boolean paramBoolean) {
    LayoutParams layoutParams;
    ViewGroup.LayoutParams layoutParams1 = paramView.getLayoutParams();
    if (layoutParams1 == null) {
      layoutParams = m();
    } else if (!checkLayoutParams((ViewGroup.LayoutParams)layoutParams)) {
      layoutParams = o((ViewGroup.LayoutParams)layoutParams);
    } else {
      layoutParams = layoutParams;
    } 
    layoutParams.b = 1;
    if (paramBoolean && this.j != null) {
      paramView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
      this.F.add(paramView);
    } else {
      addView(paramView, (ViewGroup.LayoutParams)layoutParams);
    } 
  }
  
  private MenuInflater getMenuInflater() {
    return (MenuInflater)new g(getContext());
  }
  
  private void h() {
    if (this.u == null)
      this.u = new x(); 
  }
  
  private void i() {
    if (this.f == null)
      this.f = new AppCompatImageView(getContext()); 
  }
  
  private void j() {
    k();
    if (this.b.N() == null) {
      g g = (g)this.b.getMenu();
      if (this.L == null)
        this.L = new d(this); 
      this.b.setExpandedActionViewsExclusive(true);
      g.c(this.L, this.k);
    } 
  }
  
  private void k() {
    if (this.b == null) {
      ActionMenuView actionMenuView = new ActionMenuView(getContext());
      this.b = actionMenuView;
      actionMenuView.setPopupTheme(this.l);
      this.b.setOnMenuItemClickListener(this.I);
      this.b.setMenuCallbacks(this.M, this.N);
      LayoutParams layoutParams = m();
      layoutParams.a = 0x800005 | this.o & 0x70;
      this.b.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
      c((View)this.b, false);
    } 
  }
  
  private void l() {
    if (this.e == null) {
      this.e = new AppCompatImageButton(getContext(), null, b.a.a.toolbarNavigationButtonStyle);
      LayoutParams layoutParams = m();
      layoutParams.a = 0x800003 | this.o & 0x70;
      this.e.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
    } 
  }
  
  private int p(int paramInt) {
    int i = w.C((View)this);
    int j = b.h.k.e.b(paramInt, i) & 0x7;
    if (j != 1) {
      paramInt = 3;
      if (j != 3 && j != 5) {
        if (i == 1)
          paramInt = 5; 
        return paramInt;
      } 
    } 
    return j;
  }
  
  private int q(View paramView, int paramInt) {
    LayoutParams layoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = paramView.getMeasuredHeight();
    if (paramInt > 0) {
      paramInt = (i - paramInt) / 2;
    } else {
      paramInt = 0;
    } 
    int j = r(layoutParams.a);
    if (j != 48) {
      if (j != 80) {
        int k = getPaddingTop();
        int m = getPaddingBottom();
        int n = getHeight();
        j = (n - k - m - i) / 2;
        paramInt = ((ViewGroup.MarginLayoutParams)layoutParams).topMargin;
        if (j >= paramInt) {
          n = n - m - i - j - k;
          i = ((ViewGroup.MarginLayoutParams)layoutParams).bottomMargin;
          paramInt = j;
          if (n < i)
            paramInt = Math.max(0, j - i - n); 
        } 
        return k + paramInt;
      } 
      return getHeight() - getPaddingBottom() - i - ((ViewGroup.MarginLayoutParams)layoutParams).bottomMargin - paramInt;
    } 
    return getPaddingTop() - paramInt;
  }
  
  private int r(int paramInt) {
    int i = paramInt & 0x70;
    paramInt = i;
    if (i != 16) {
      paramInt = i;
      if (i != 48) {
        paramInt = i;
        if (i != 80)
          paramInt = this.x & 0x70; 
      } 
    } 
    return paramInt;
  }
  
  private int s(View paramView) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    return h.b(marginLayoutParams) + h.a(marginLayoutParams);
  }
  
  private int t(View paramView) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
  }
  
  private int u(List<View> paramList, int[] paramArrayOfint) {
    int i = paramArrayOfint[0];
    int j = paramArrayOfint[1];
    int k = paramList.size();
    byte b = 0;
    int m = 0;
    while (b < k) {
      View view = paramList.get(b);
      LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
      i = ((ViewGroup.MarginLayoutParams)layoutParams).leftMargin - i;
      j = ((ViewGroup.MarginLayoutParams)layoutParams).rightMargin - j;
      int n = Math.max(0, i);
      int i1 = Math.max(0, j);
      i = Math.max(0, -i);
      j = Math.max(0, -j);
      m += n + view.getMeasuredWidth() + i1;
      b++;
    } 
    return m;
  }
  
  private boolean y(View paramView) {
    return (paramView.getParent() == this || this.F.contains(paramView));
  }
  
  public boolean A() {
    boolean bool;
    ActionMenuView actionMenuView = this.b;
    if (actionMenuView != null && actionMenuView.J()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  void G() {
    for (int i = getChildCount() - 1; i >= 0; i--) {
      View view = getChildAt(i);
      if (((LayoutParams)view.getLayoutParams()).b != 2 && view != this.b) {
        removeViewAt(i);
        this.F.add(view);
      } 
    } 
  }
  
  public boolean J() {
    boolean bool;
    ActionMenuView actionMenuView = this.b;
    if (actionMenuView != null && actionMenuView.O()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  void a() {
    for (int i = this.F.size() - 1; i >= 0; i--)
      addView(this.F.get(i)); 
    this.F.clear();
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    boolean bool;
    if (super.checkLayoutParams(paramLayoutParams) && paramLayoutParams instanceof LayoutParams) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean d() {
    if (getVisibility() == 0) {
      ActionMenuView actionMenuView = this.b;
      if (actionMenuView != null && actionMenuView.K())
        return true; 
    } 
    return false;
  }
  
  public void e() {
    i i;
    d d1 = this.L;
    if (d1 == null) {
      d1 = null;
    } else {
      i = d1.c;
    } 
    if (i != null)
      i.collapseActionView(); 
  }
  
  public void f() {
    ActionMenuView actionMenuView = this.b;
    if (actionMenuView != null)
      actionMenuView.B(); 
  }
  
  void g() {
    if (this.i == null) {
      AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, b.a.a.toolbarNavigationButtonStyle);
      this.i = appCompatImageButton;
      appCompatImageButton.setImageDrawable(this.g);
      this.i.setContentDescription(this.h);
      LayoutParams layoutParams = m();
      layoutParams.a = 0x800003 | this.o & 0x70;
      layoutParams.b = 2;
      this.i.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
      this.i.setOnClickListener(new c(this));
    } 
  }
  
  public CharSequence getCollapseContentDescription() {
    ImageButton imageButton = this.i;
    if (imageButton != null) {
      CharSequence charSequence = imageButton.getContentDescription();
    } else {
      imageButton = null;
    } 
    return (CharSequence)imageButton;
  }
  
  public Drawable getCollapseIcon() {
    ImageButton imageButton = this.i;
    if (imageButton != null) {
      Drawable drawable = imageButton.getDrawable();
    } else {
      imageButton = null;
    } 
    return (Drawable)imageButton;
  }
  
  public int getContentInsetEnd() {
    boolean bool;
    x x1 = this.u;
    if (x1 != null) {
      bool = x1.a();
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int getContentInsetEndWithActions() {
    int i = this.w;
    if (i == Integer.MIN_VALUE)
      i = getContentInsetEnd(); 
    return i;
  }
  
  public int getContentInsetLeft() {
    boolean bool;
    x x1 = this.u;
    if (x1 != null) {
      bool = x1.b();
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int getContentInsetRight() {
    boolean bool;
    x x1 = this.u;
    if (x1 != null) {
      bool = x1.c();
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int getContentInsetStart() {
    boolean bool;
    x x1 = this.u;
    if (x1 != null) {
      bool = x1.d();
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int getContentInsetStartWithNavigation() {
    int i = this.v;
    if (i == Integer.MIN_VALUE)
      i = getContentInsetStart(); 
    return i;
  }
  
  public int getCurrentContentInsetEnd() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Landroidx/appcompat/widget/ActionMenuView;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull -> 30
    //   9: aload_1
    //   10: invokevirtual N : ()Landroidx/appcompat/view/menu/g;
    //   13: astore_1
    //   14: aload_1
    //   15: ifnull -> 30
    //   18: aload_1
    //   19: invokevirtual hasVisibleItems : ()Z
    //   22: ifeq -> 30
    //   25: iconst_1
    //   26: istore_2
    //   27: goto -> 32
    //   30: iconst_0
    //   31: istore_2
    //   32: iload_2
    //   33: ifeq -> 55
    //   36: aload_0
    //   37: invokevirtual getContentInsetEnd : ()I
    //   40: aload_0
    //   41: getfield w : I
    //   44: iconst_0
    //   45: invokestatic max : (II)I
    //   48: invokestatic max : (II)I
    //   51: istore_2
    //   52: goto -> 60
    //   55: aload_0
    //   56: invokevirtual getContentInsetEnd : ()I
    //   59: istore_2
    //   60: iload_2
    //   61: ireturn
  }
  
  public int getCurrentContentInsetLeft() {
    int i;
    if (w.C((View)this) == 1) {
      i = getCurrentContentInsetEnd();
    } else {
      i = getCurrentContentInsetStart();
    } 
    return i;
  }
  
  public int getCurrentContentInsetRight() {
    int i;
    if (w.C((View)this) == 1) {
      i = getCurrentContentInsetStart();
    } else {
      i = getCurrentContentInsetEnd();
    } 
    return i;
  }
  
  public int getCurrentContentInsetStart() {
    int i;
    if (getNavigationIcon() != null) {
      i = Math.max(getContentInsetStart(), Math.max(this.v, 0));
    } else {
      i = getContentInsetStart();
    } 
    return i;
  }
  
  public Drawable getLogo() {
    ImageView imageView = this.f;
    if (imageView != null) {
      Drawable drawable = imageView.getDrawable();
    } else {
      imageView = null;
    } 
    return (Drawable)imageView;
  }
  
  public CharSequence getLogoDescription() {
    ImageView imageView = this.f;
    if (imageView != null) {
      CharSequence charSequence = imageView.getContentDescription();
    } else {
      imageView = null;
    } 
    return (CharSequence)imageView;
  }
  
  public Menu getMenu() {
    j();
    return this.b.getMenu();
  }
  
  public CharSequence getNavigationContentDescription() {
    ImageButton imageButton = this.e;
    if (imageButton != null) {
      CharSequence charSequence = imageButton.getContentDescription();
    } else {
      imageButton = null;
    } 
    return (CharSequence)imageButton;
  }
  
  public Drawable getNavigationIcon() {
    ImageButton imageButton = this.e;
    if (imageButton != null) {
      Drawable drawable = imageButton.getDrawable();
    } else {
      imageButton = null;
    } 
    return (Drawable)imageButton;
  }
  
  ActionMenuPresenter getOuterActionMenuPresenter() {
    return this.K;
  }
  
  public Drawable getOverflowIcon() {
    j();
    return this.b.getOverflowIcon();
  }
  
  Context getPopupContext() {
    return this.k;
  }
  
  public int getPopupTheme() {
    return this.l;
  }
  
  public CharSequence getSubtitle() {
    return this.z;
  }
  
  final TextView getSubtitleTextView() {
    return this.d;
  }
  
  public CharSequence getTitle() {
    return this.y;
  }
  
  public int getTitleMarginBottom() {
    return this.t;
  }
  
  public int getTitleMarginEnd() {
    return this.r;
  }
  
  public int getTitleMarginStart() {
    return this.q;
  }
  
  public int getTitleMarginTop() {
    return this.s;
  }
  
  final TextView getTitleTextView() {
    return this.c;
  }
  
  public p getWrapper() {
    if (this.J == null)
      this.J = new f0(this, true); 
    return this.J;
  }
  
  protected LayoutParams m() {
    return new LayoutParams(-2, -2);
  }
  
  public LayoutParams n(AttributeSet paramAttributeSet) {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected LayoutParams o(ViewGroup.LayoutParams paramLayoutParams) {
    return (paramLayoutParams instanceof LayoutParams) ? new LayoutParams((LayoutParams)paramLayoutParams) : ((paramLayoutParams instanceof ActionBar.LayoutParams) ? new LayoutParams((ActionBar.LayoutParams)paramLayoutParams) : ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams) ? new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams) : new LayoutParams(paramLayoutParams)));
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    removeCallbacks(this.P);
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionMasked();
    if (i == 9)
      this.D = false; 
    if (!this.D) {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if (i == 9 && !bool)
        this.D = true; 
    } 
    if (i == 10 || i == 3)
      this.D = false; 
    return true;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (w.C((View)this) == 1) {
      i = 1;
    } else {
      i = 0;
    } 
    int j = getWidth();
    int k = getHeight();
    int m = getPaddingLeft();
    int n = getPaddingRight();
    int i1 = getPaddingTop();
    int i2 = getPaddingBottom();
    int i3 = j - n;
    int[] arrayOfInt = this.G;
    arrayOfInt[1] = 0;
    arrayOfInt[0] = 0;
    paramInt1 = w.D((View)this);
    if (paramInt1 >= 0) {
      paramInt4 = Math.min(paramInt1, paramInt4 - paramInt2);
    } else {
      paramInt4 = 0;
    } 
    if (I((View)this.e)) {
      if (i) {
        paramInt3 = C((View)this.e, i3, arrayOfInt, paramInt4);
        i4 = m;
      } else {
        i4 = B((View)this.e, m, arrayOfInt, paramInt4);
        paramInt3 = i3;
      } 
    } else {
      i4 = m;
      paramInt3 = i3;
    } 
    paramInt2 = i4;
    paramInt1 = paramInt3;
    if (I((View)this.i))
      if (i) {
        paramInt1 = C((View)this.i, paramInt3, arrayOfInt, paramInt4);
        paramInt2 = i4;
      } else {
        paramInt2 = B((View)this.i, i4, arrayOfInt, paramInt4);
        paramInt1 = paramInt3;
      }  
    int i4 = paramInt2;
    paramInt3 = paramInt1;
    if (I((View)this.b))
      if (i) {
        i4 = B((View)this.b, paramInt2, arrayOfInt, paramInt4);
        paramInt3 = paramInt1;
      } else {
        paramInt3 = C((View)this.b, paramInt1, arrayOfInt, paramInt4);
        i4 = paramInt2;
      }  
    paramInt2 = getCurrentContentInsetLeft();
    paramInt1 = getCurrentContentInsetRight();
    arrayOfInt[0] = Math.max(0, paramInt2 - i4);
    arrayOfInt[1] = Math.max(0, paramInt1 - i3 - paramInt3);
    paramInt2 = Math.max(i4, paramInt2);
    paramInt3 = Math.min(paramInt3, i3 - paramInt1);
    i4 = paramInt2;
    paramInt1 = paramInt3;
    if (I(this.j))
      if (i) {
        paramInt1 = C(this.j, paramInt3, arrayOfInt, paramInt4);
        i4 = paramInt2;
      } else {
        i4 = B(this.j, paramInt2, arrayOfInt, paramInt4);
        paramInt1 = paramInt3;
      }  
    paramInt3 = i4;
    paramInt2 = paramInt1;
    if (I((View)this.f))
      if (i) {
        paramInt2 = C((View)this.f, paramInt1, arrayOfInt, paramInt4);
        paramInt3 = i4;
      } else {
        paramInt3 = B((View)this.f, i4, arrayOfInt, paramInt4);
        paramInt2 = paramInt1;
      }  
    paramBoolean = I((View)this.c);
    boolean bool = I((View)this.d);
    if (paramBoolean) {
      LayoutParams layoutParams = (LayoutParams)this.c.getLayoutParams();
      paramInt1 = ((ViewGroup.MarginLayoutParams)layoutParams).topMargin + this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams)layoutParams).bottomMargin + 0;
    } else {
      paramInt1 = 0;
    } 
    if (bool) {
      LayoutParams layoutParams = (LayoutParams)this.d.getLayoutParams();
      paramInt1 += ((ViewGroup.MarginLayoutParams)layoutParams).topMargin + this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams)layoutParams).bottomMargin;
    } 
    if (paramBoolean || bool) {
      TextView textView1;
      TextView textView2;
      if (paramBoolean) {
        textView1 = this.c;
      } else {
        textView1 = this.d;
      } 
      if (bool) {
        textView2 = this.d;
      } else {
        textView2 = this.c;
      } 
      LayoutParams layoutParams1 = (LayoutParams)textView1.getLayoutParams();
      LayoutParams layoutParams2 = (LayoutParams)textView2.getLayoutParams();
      if ((paramBoolean && this.c.getMeasuredWidth() > 0) || (bool && this.d.getMeasuredWidth() > 0)) {
        i4 = 1;
      } else {
        i4 = 0;
      } 
      i3 = this.x & 0x70;
      if (i3 != 48) {
        if (i3 != 80) {
          i3 = (k - i1 - i2 - paramInt1) / 2;
          int i5 = ((ViewGroup.MarginLayoutParams)layoutParams1).topMargin;
          int i6 = this.s;
          if (i3 < i5 + i6) {
            paramInt1 = i5 + i6;
          } else {
            i5 = k - i2 - paramInt1 - i3 - i1;
            i2 = ((ViewGroup.MarginLayoutParams)layoutParams1).bottomMargin;
            k = this.t;
            paramInt1 = i3;
            if (i5 < i2 + k)
              paramInt1 = Math.max(0, i3 - ((ViewGroup.MarginLayoutParams)layoutParams2).bottomMargin + k - i5); 
          } 
          paramInt1 = i1 + paramInt1;
        } else {
          paramInt1 = k - i2 - ((ViewGroup.MarginLayoutParams)layoutParams2).bottomMargin - this.t - paramInt1;
        } 
      } else {
        paramInt1 = getPaddingTop() + ((ViewGroup.MarginLayoutParams)layoutParams1).topMargin + this.s;
      } 
      if (i) {
        if (i4 != 0) {
          i = this.q;
        } else {
          i = 0;
        } 
        i -= arrayOfInt[1];
        paramInt2 -= Math.max(0, i);
        arrayOfInt[1] = Math.max(0, -i);
        if (paramBoolean) {
          layoutParams1 = (LayoutParams)this.c.getLayoutParams();
          i3 = paramInt2 - this.c.getMeasuredWidth();
          i = this.c.getMeasuredHeight() + paramInt1;
          this.c.layout(i3, paramInt1, paramInt2, i);
          paramInt1 = i3 - this.r;
          i3 = i + ((ViewGroup.MarginLayoutParams)layoutParams1).bottomMargin;
        } else {
          i = paramInt2;
          i3 = paramInt1;
          paramInt1 = i;
        } 
        if (bool) {
          i3 += ((ViewGroup.MarginLayoutParams)this.d.getLayoutParams()).topMargin;
          i = this.d.getMeasuredWidth();
          i1 = this.d.getMeasuredHeight();
          this.d.layout(paramInt2 - i, i3, paramInt2, i1 + i3);
          i = paramInt2 - this.r;
        } else {
          i = paramInt2;
        } 
        if (i4 != 0)
          paramInt2 = Math.min(paramInt1, i); 
        paramInt1 = paramInt3;
      } else {
        if (i4 != 0) {
          i = this.q;
        } else {
          i = 0;
        } 
        i -= arrayOfInt[0];
        paramInt3 += Math.max(0, i);
        arrayOfInt[0] = Math.max(0, -i);
        if (paramBoolean) {
          layoutParams1 = (LayoutParams)this.c.getLayoutParams();
          i = this.c.getMeasuredWidth() + paramInt3;
          i3 = this.c.getMeasuredHeight() + paramInt1;
          this.c.layout(paramInt3, paramInt1, i, i3);
          i += this.r;
          paramInt1 = i3 + ((ViewGroup.MarginLayoutParams)layoutParams1).bottomMargin;
        } else {
          i = paramInt3;
        } 
        if (bool) {
          i3 = paramInt1 + ((ViewGroup.MarginLayoutParams)this.d.getLayoutParams()).topMargin;
          i1 = this.d.getMeasuredWidth() + paramInt3;
          paramInt1 = this.d.getMeasuredHeight();
          this.d.layout(paramInt3, i3, i1, paramInt1 + i3);
          i3 = i1 + this.r;
        } else {
          i3 = paramInt3;
        } 
        paramInt1 = paramInt3;
        paramInt3 = paramInt2;
        if (i4 != 0) {
          paramInt1 = Math.max(i, i3);
          paramInt3 = paramInt2;
        } 
        i4 = m;
        m = 0;
        b(this.E, 3);
        i = this.E.size();
        paramInt2 = 0;
      } 
    } else {
      paramInt1 = paramInt3;
    } 
    paramInt3 = paramInt2;
    i4 = m;
    m = 0;
    b(this.E, 3);
    int i = this.E.size();
    paramInt2 = 0;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    int[] arrayOfInt = this.G;
    boolean bool = k0.b((View)this);
    boolean bool1 = false;
    if (bool) {
      i = 1;
      j = 0;
    } else {
      i = 0;
      j = 1;
    } 
    if (I((View)this.e)) {
      E((View)this.e, paramInt1, 0, paramInt2, 0, this.p);
      k = this.e.getMeasuredWidth() + s((View)this.e);
      m = Math.max(0, this.e.getMeasuredHeight() + t((View)this.e));
      n = View.combineMeasuredStates(0, this.e.getMeasuredState());
    } else {
      k = 0;
      m = 0;
      n = 0;
    } 
    int i1 = k;
    int i2 = m;
    int k = n;
    if (I((View)this.i)) {
      E((View)this.i, paramInt1, 0, paramInt2, 0, this.p);
      i1 = this.i.getMeasuredWidth() + s((View)this.i);
      i2 = Math.max(m, this.i.getMeasuredHeight() + t((View)this.i));
      k = View.combineMeasuredStates(n, this.i.getMeasuredState());
    } 
    int n = getCurrentContentInsetStart();
    int m = 0 + Math.max(n, i1);
    arrayOfInt[i] = Math.max(0, n - i1);
    if (I((View)this.b)) {
      E((View)this.b, paramInt1, m, paramInt2, 0, this.p);
      n = this.b.getMeasuredWidth() + s((View)this.b);
      i2 = Math.max(i2, this.b.getMeasuredHeight() + t((View)this.b));
      k = View.combineMeasuredStates(k, this.b.getMeasuredState());
    } else {
      n = 0;
    } 
    i1 = getCurrentContentInsetEnd();
    int i = m + Math.max(i1, n);
    arrayOfInt[j] = Math.max(0, i1 - n);
    int j = i2;
    n = k;
    m = i;
    if (I(this.j)) {
      m = i + D(this.j, paramInt1, i, paramInt2, 0, arrayOfInt);
      j = Math.max(i2, this.j.getMeasuredHeight() + t(this.j));
      n = View.combineMeasuredStates(k, this.j.getMeasuredState());
    } 
    i2 = j;
    i = n;
    k = m;
    if (I((View)this.f)) {
      k = m + D((View)this.f, paramInt1, m, paramInt2, 0, arrayOfInt);
      i2 = Math.max(j, this.f.getMeasuredHeight() + t((View)this.f));
      i = View.combineMeasuredStates(n, this.f.getMeasuredState());
    } 
    int i3 = getChildCount();
    n = 0;
    m = k;
    k = i;
    j = i2;
    i2 = n;
    while (i2 < i3) {
      View view = getChildAt(i2);
      i1 = j;
      i = k;
      n = m;
      if (((LayoutParams)view.getLayoutParams()).b == 0)
        if (!I(view)) {
          i1 = j;
          i = k;
          n = m;
        } else {
          n = m + D(view, paramInt1, m, paramInt2, 0, arrayOfInt);
          i1 = Math.max(j, view.getMeasuredHeight() + t(view));
          i = View.combineMeasuredStates(k, view.getMeasuredState());
        }  
      i2++;
      j = i1;
      k = i;
      m = n;
    } 
    i = this.s + this.t;
    i1 = this.q + this.r;
    if (I((View)this.c)) {
      D((View)this.c, paramInt1, m + i1, paramInt2, i, arrayOfInt);
      n = this.c.getMeasuredWidth();
      i3 = s((View)this.c);
      i2 = this.c.getMeasuredHeight();
      int i4 = t((View)this.c);
      k = View.combineMeasuredStates(k, this.c.getMeasuredState());
      i2 += i4;
      n += i3;
    } else {
      n = 0;
      i2 = 0;
    } 
    if (I((View)this.d)) {
      n = Math.max(n, D((View)this.d, paramInt1, m + i1, paramInt2, i2 + i, arrayOfInt));
      i2 += this.d.getMeasuredHeight() + t((View)this.d);
      k = View.combineMeasuredStates(k, this.d.getMeasuredState());
    } 
    j = Math.max(j, i2);
    i1 = getPaddingLeft();
    i3 = getPaddingRight();
    i = getPaddingTop();
    i2 = getPaddingBottom();
    n = View.resolveSizeAndState(Math.max(m + n + i1 + i3, getSuggestedMinimumWidth()), paramInt1, 0xFF000000 & k);
    paramInt1 = View.resolveSizeAndState(Math.max(j + i + i2, getSuggestedMinimumHeight()), paramInt2, k << 16);
    if (H())
      paramInt1 = bool1; 
    setMeasuredDimension(n, paramInt1);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof SavedState)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    SavedState savedState = (SavedState)paramParcelable;
    super.onRestoreInstanceState(savedState.a());
    ActionMenuView actionMenuView = this.b;
    if (actionMenuView != null) {
      g g = actionMenuView.N();
    } else {
      actionMenuView = null;
    } 
    int i = savedState.d;
    if (i != 0 && this.L != null && actionMenuView != null) {
      MenuItem menuItem = actionMenuView.findItem(i);
      if (menuItem != null)
        menuItem.expandActionView(); 
    } 
    if (savedState.e)
      F(); 
  }
  
  public void onRtlPropertiesChanged(int paramInt) {
    if (Build.VERSION.SDK_INT >= 17)
      super.onRtlPropertiesChanged(paramInt); 
    h();
    x x1 = this.u;
    boolean bool = true;
    if (paramInt != 1)
      bool = false; 
    x1.f(bool);
  }
  
  protected Parcelable onSaveInstanceState() {
    SavedState savedState = new SavedState(super.onSaveInstanceState());
    d d1 = this.L;
    if (d1 != null) {
      i i = d1.c;
      if (i != null)
        savedState.d = i.getItemId(); 
    } 
    savedState.e = A();
    return (Parcelable)savedState;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0)
      this.C = false; 
    if (!this.C) {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if (i == 0 && !bool)
        this.C = true; 
    } 
    if (i == 1 || i == 3)
      this.C = false; 
    return true;
  }
  
  public void setCollapseContentDescription(int paramInt) {
    CharSequence charSequence;
    if (paramInt != 0) {
      charSequence = getContext().getText(paramInt);
    } else {
      charSequence = null;
    } 
    setCollapseContentDescription(charSequence);
  }
  
  public void setCollapseContentDescription(CharSequence paramCharSequence) {
    if (!TextUtils.isEmpty(paramCharSequence))
      g(); 
    ImageButton imageButton = this.i;
    if (imageButton != null)
      imageButton.setContentDescription(paramCharSequence); 
  }
  
  public void setCollapseIcon(int paramInt) {
    setCollapseIcon(b.a.k.a.a.d(getContext(), paramInt));
  }
  
  public void setCollapseIcon(Drawable paramDrawable) {
    if (paramDrawable != null) {
      g();
      this.i.setImageDrawable(paramDrawable);
    } else {
      ImageButton imageButton = this.i;
      if (imageButton != null)
        imageButton.setImageDrawable(this.g); 
    } 
  }
  
  public void setCollapsible(boolean paramBoolean) {
    this.O = paramBoolean;
    requestLayout();
  }
  
  public void setContentInsetEndWithActions(int paramInt) {
    int i = paramInt;
    if (paramInt < 0)
      i = Integer.MIN_VALUE; 
    if (i != this.w) {
      this.w = i;
      if (getNavigationIcon() != null)
        requestLayout(); 
    } 
  }
  
  public void setContentInsetStartWithNavigation(int paramInt) {
    int i = paramInt;
    if (paramInt < 0)
      i = Integer.MIN_VALUE; 
    if (i != this.v) {
      this.v = i;
      if (getNavigationIcon() != null)
        requestLayout(); 
    } 
  }
  
  public void setContentInsetsAbsolute(int paramInt1, int paramInt2) {
    h();
    this.u.e(paramInt1, paramInt2);
  }
  
  public void setContentInsetsRelative(int paramInt1, int paramInt2) {
    h();
    this.u.g(paramInt1, paramInt2);
  }
  
  public void setLogo(int paramInt) {
    setLogo(b.a.k.a.a.d(getContext(), paramInt));
  }
  
  public void setLogo(Drawable paramDrawable) {
    if (paramDrawable != null) {
      i();
      if (!y((View)this.f))
        c((View)this.f, true); 
    } else {
      ImageView imageView1 = this.f;
      if (imageView1 != null && y((View)imageView1)) {
        removeView((View)this.f);
        this.F.remove(this.f);
      } 
    } 
    ImageView imageView = this.f;
    if (imageView != null)
      imageView.setImageDrawable(paramDrawable); 
  }
  
  public void setLogoDescription(int paramInt) {
    setLogoDescription(getContext().getText(paramInt));
  }
  
  public void setLogoDescription(CharSequence paramCharSequence) {
    if (!TextUtils.isEmpty(paramCharSequence))
      i(); 
    ImageView imageView = this.f;
    if (imageView != null)
      imageView.setContentDescription(paramCharSequence); 
  }
  
  public void setMenu(g paramg, ActionMenuPresenter paramActionMenuPresenter) {
    if (paramg == null && this.b == null)
      return; 
    k();
    g g1 = this.b.N();
    if (g1 == paramg)
      return; 
    if (g1 != null) {
      g1.Q((m)this.K);
      g1.Q(this.L);
    } 
    if (this.L == null)
      this.L = new d(this); 
    paramActionMenuPresenter.J(true);
    if (paramg != null) {
      paramg.c((m)paramActionMenuPresenter, this.k);
      paramg.c(this.L, this.k);
    } else {
      paramActionMenuPresenter.h(this.k, null);
      this.L.h(this.k, null);
      paramActionMenuPresenter.c(true);
      this.L.c(true);
    } 
    this.b.setPopupTheme(this.l);
    this.b.setPresenter(paramActionMenuPresenter);
    this.K = paramActionMenuPresenter;
  }
  
  public void setMenuCallbacks(m.a parama, g.a parama1) {
    this.M = parama;
    this.N = parama1;
    ActionMenuView actionMenuView = this.b;
    if (actionMenuView != null)
      actionMenuView.setMenuCallbacks(parama, parama1); 
  }
  
  public void setNavigationContentDescription(int paramInt) {
    CharSequence charSequence;
    if (paramInt != 0) {
      charSequence = getContext().getText(paramInt);
    } else {
      charSequence = null;
    } 
    setNavigationContentDescription(charSequence);
  }
  
  public void setNavigationContentDescription(CharSequence paramCharSequence) {
    if (!TextUtils.isEmpty(paramCharSequence))
      l(); 
    ImageButton imageButton = this.e;
    if (imageButton != null)
      imageButton.setContentDescription(paramCharSequence); 
  }
  
  public void setNavigationIcon(int paramInt) {
    setNavigationIcon(b.a.k.a.a.d(getContext(), paramInt));
  }
  
  public void setNavigationIcon(Drawable paramDrawable) {
    if (paramDrawable != null) {
      l();
      if (!y((View)this.e))
        c((View)this.e, true); 
    } else {
      ImageButton imageButton1 = this.e;
      if (imageButton1 != null && y((View)imageButton1)) {
        removeView((View)this.e);
        this.F.remove(this.e);
      } 
    } 
    ImageButton imageButton = this.e;
    if (imageButton != null)
      imageButton.setImageDrawable(paramDrawable); 
  }
  
  public void setNavigationOnClickListener(View.OnClickListener paramOnClickListener) {
    l();
    this.e.setOnClickListener(paramOnClickListener);
  }
  
  public void setOnMenuItemClickListener(e parame) {
    this.H = parame;
  }
  
  public void setOverflowIcon(Drawable paramDrawable) {
    j();
    this.b.setOverflowIcon(paramDrawable);
  }
  
  public void setPopupTheme(int paramInt) {
    if (this.l != paramInt) {
      this.l = paramInt;
      if (paramInt == 0) {
        this.k = getContext();
      } else {
        this.k = (Context)new ContextThemeWrapper(getContext(), paramInt);
      } 
    } 
  }
  
  public void setSubtitle(int paramInt) {
    setSubtitle(getContext().getText(paramInt));
  }
  
  public void setSubtitle(CharSequence paramCharSequence) {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      if (this.d == null) {
        Context context = getContext();
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        this.d = appCompatTextView;
        appCompatTextView.setSingleLine();
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        int i = this.n;
        if (i != 0)
          this.d.setTextAppearance(context, i); 
        ColorStateList colorStateList = this.B;
        if (colorStateList != null)
          this.d.setTextColor(colorStateList); 
      } 
      if (!y((View)this.d))
        c((View)this.d, true); 
    } else {
      TextView textView1 = this.d;
      if (textView1 != null && y((View)textView1)) {
        removeView((View)this.d);
        this.F.remove(this.d);
      } 
    } 
    TextView textView = this.d;
    if (textView != null)
      textView.setText(paramCharSequence); 
    this.z = paramCharSequence;
  }
  
  public void setSubtitleTextAppearance(Context paramContext, int paramInt) {
    this.n = paramInt;
    TextView textView = this.d;
    if (textView != null)
      textView.setTextAppearance(paramContext, paramInt); 
  }
  
  public void setSubtitleTextColor(int paramInt) {
    setSubtitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setSubtitleTextColor(ColorStateList paramColorStateList) {
    this.B = paramColorStateList;
    TextView textView = this.d;
    if (textView != null)
      textView.setTextColor(paramColorStateList); 
  }
  
  public void setTitle(int paramInt) {
    setTitle(getContext().getText(paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      if (this.c == null) {
        Context context = getContext();
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        this.c = appCompatTextView;
        appCompatTextView.setSingleLine();
        this.c.setEllipsize(TextUtils.TruncateAt.END);
        int i = this.m;
        if (i != 0)
          this.c.setTextAppearance(context, i); 
        ColorStateList colorStateList = this.A;
        if (colorStateList != null)
          this.c.setTextColor(colorStateList); 
      } 
      if (!y((View)this.c))
        c((View)this.c, true); 
    } else {
      TextView textView1 = this.c;
      if (textView1 != null && y((View)textView1)) {
        removeView((View)this.c);
        this.F.remove(this.c);
      } 
    } 
    TextView textView = this.c;
    if (textView != null)
      textView.setText(paramCharSequence); 
    this.y = paramCharSequence;
  }
  
  public void setTitleMargin(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.q = paramInt1;
    this.s = paramInt2;
    this.r = paramInt3;
    this.t = paramInt4;
    requestLayout();
  }
  
  public void setTitleMarginBottom(int paramInt) {
    this.t = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginEnd(int paramInt) {
    this.r = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginStart(int paramInt) {
    this.q = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginTop(int paramInt) {
    this.s = paramInt;
    requestLayout();
  }
  
  public void setTitleTextAppearance(Context paramContext, int paramInt) {
    this.m = paramInt;
    TextView textView = this.c;
    if (textView != null)
      textView.setTextAppearance(paramContext, paramInt); 
  }
  
  public void setTitleTextColor(int paramInt) {
    setTitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setTitleTextColor(ColorStateList paramColorStateList) {
    this.A = paramColorStateList;
    TextView textView = this.c;
    if (textView != null)
      textView.setTextColor(paramColorStateList); 
  }
  
  public boolean v() {
    boolean bool;
    d d1 = this.L;
    if (d1 != null && d1.c != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean w() {
    boolean bool;
    ActionMenuView actionMenuView = this.b;
    if (actionMenuView != null && actionMenuView.H()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void x(int paramInt) {
    getMenuInflater().inflate(paramInt, getMenu());
  }
  
  public boolean z() {
    boolean bool;
    ActionMenuView actionMenuView = this.b;
    if (actionMenuView != null && actionMenuView.I()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static class LayoutParams extends ActionBar.LayoutParams {
    int b = 0;
    
    public LayoutParams(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
      this.a = 8388627;
    }
    
    public LayoutParams(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
    
    public LayoutParams(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public LayoutParams(ViewGroup.MarginLayoutParams param1MarginLayoutParams) {
      super((ViewGroup.LayoutParams)param1MarginLayoutParams);
      a(param1MarginLayoutParams);
    }
    
    public LayoutParams(ActionBar.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public LayoutParams(LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
      this.b = param1LayoutParams.b;
    }
    
    void a(ViewGroup.MarginLayoutParams param1MarginLayoutParams) {
      ((ViewGroup.MarginLayoutParams)this).leftMargin = param1MarginLayoutParams.leftMargin;
      ((ViewGroup.MarginLayoutParams)this).topMargin = param1MarginLayoutParams.topMargin;
      ((ViewGroup.MarginLayoutParams)this).rightMargin = param1MarginLayoutParams.rightMargin;
      ((ViewGroup.MarginLayoutParams)this).bottomMargin = param1MarginLayoutParams.bottomMargin;
    }
  }
  
  public static class SavedState extends AbsSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = (Parcelable.Creator<SavedState>)new a();
    
    int d;
    
    boolean e;
    
    public SavedState(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      boolean bool;
      this.d = param1Parcel.readInt();
      if (param1Parcel.readInt() != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      this.e = bool;
    }
    
    public SavedState(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeInt(this.d);
      param1Parcel.writeInt(this.e);
    }
    
    class a implements Parcelable.ClassLoaderCreator<SavedState> {
      public Toolbar.SavedState a(Parcel param2Parcel) {
        return new Toolbar.SavedState(param2Parcel, null);
      }
      
      public Toolbar.SavedState b(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new Toolbar.SavedState(param2Parcel, param2ClassLoader);
      }
      
      public Toolbar.SavedState[] c(int param2Int) {
        return new Toolbar.SavedState[param2Int];
      }
    }
  }
  
  class a implements Parcelable.ClassLoaderCreator<SavedState> {
    public Toolbar.SavedState a(Parcel param1Parcel) {
      return new Toolbar.SavedState(param1Parcel, null);
    }
    
    public Toolbar.SavedState b(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new Toolbar.SavedState(param1Parcel, param1ClassLoader);
    }
    
    public Toolbar.SavedState[] c(int param1Int) {
      return new Toolbar.SavedState[param1Int];
    }
  }
  
  class a implements ActionMenuView.d {
    a(Toolbar this$0) {}
    
    public boolean onMenuItemClick(MenuItem param1MenuItem) {
      Toolbar.e e = this.a.H;
      return (e != null) ? e.onMenuItemClick(param1MenuItem) : false;
    }
  }
  
  class b implements Runnable {
    b(Toolbar this$0) {}
    
    public void run() {
      this.b.J();
    }
  }
  
  class c implements View.OnClickListener {
    c(Toolbar this$0) {}
    
    public void onClick(View param1View) {
      this.b.e();
    }
  }
  
  private class d implements m {
    g b;
    
    i c;
    
    d(Toolbar this$0) {}
    
    public void b(g param1g, boolean param1Boolean) {}
    
    public void c(boolean param1Boolean) {
      if (this.c != null) {
        g g1 = this.b;
        boolean bool1 = false;
        boolean bool2 = bool1;
        if (g1 != null) {
          int j = g1.size();
          byte b = 0;
          while (true) {
            bool2 = bool1;
            if (b < j) {
              if (this.b.getItem(b) == this.c) {
                bool2 = true;
                break;
              } 
              b++;
              continue;
            } 
            break;
          } 
        } 
        if (!bool2)
          e(this.b, this.c); 
      } 
    }
    
    public boolean d() {
      return false;
    }
    
    public boolean e(g param1g, i param1i) {
      View view = this.d.j;
      if (view instanceof b.a.o.c)
        ((b.a.o.c)view).f(); 
      Toolbar toolbar = this.d;
      toolbar.removeView(toolbar.j);
      toolbar = this.d;
      toolbar.removeView((View)toolbar.i);
      toolbar = this.d;
      toolbar.j = null;
      toolbar.a();
      this.c = null;
      this.d.requestLayout();
      param1i.r(false);
      return true;
    }
    
    public boolean f(g param1g, i param1i) {
      this.d.g();
      ViewParent viewParent1 = this.d.i.getParent();
      Toolbar toolbar2 = this.d;
      if (viewParent1 != toolbar2) {
        if (viewParent1 instanceof ViewGroup)
          ((ViewGroup)viewParent1).removeView((View)toolbar2.i); 
        Toolbar toolbar = this.d;
        toolbar.addView((View)toolbar.i);
      } 
      this.d.j = param1i.getActionView();
      this.c = param1i;
      ViewParent viewParent2 = this.d.j.getParent();
      Toolbar toolbar1 = this.d;
      if (viewParent2 != toolbar1) {
        if (viewParent2 instanceof ViewGroup)
          ((ViewGroup)viewParent2).removeView(toolbar1.j); 
        Toolbar.LayoutParams layoutParams = this.d.m();
        Toolbar toolbar4 = this.d;
        layoutParams.a = 0x800003 | toolbar4.o & 0x70;
        layoutParams.b = 2;
        toolbar4.j.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        Toolbar toolbar3 = this.d;
        toolbar3.addView(toolbar3.j);
      } 
      this.d.G();
      this.d.requestLayout();
      param1i.r(true);
      View view = this.d.j;
      if (view instanceof b.a.o.c)
        ((b.a.o.c)view).c(); 
      return true;
    }
    
    public int getId() {
      return 0;
    }
    
    public void h(Context param1Context, g param1g) {
      g g1 = this.b;
      if (g1 != null) {
        i i1 = this.c;
        if (i1 != null)
          g1.f(i1); 
      } 
      this.b = param1g;
    }
    
    public void i(Parcelable param1Parcelable) {}
    
    public boolean j(r param1r) {
      return false;
    }
    
    public Parcelable k() {
      return null;
    }
  }
  
  public static interface e {
    boolean onMenuItemClick(MenuItem param1MenuItem);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/Toolbar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */