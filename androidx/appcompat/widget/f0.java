package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import b.a.e;
import b.a.f;
import b.a.h;
import b.a.j;
import b.h.k.a0;
import b.h.k.b0;
import b.h.k.c0;
import b.h.k.w;

public class f0 implements p {
  Toolbar a;
  
  private int b;
  
  private View c;
  
  private View d;
  
  private Drawable e;
  
  private Drawable f;
  
  private Drawable g;
  
  private boolean h;
  
  CharSequence i;
  
  private CharSequence j;
  
  private CharSequence k;
  
  Window.Callback l;
  
  boolean m;
  
  private ActionMenuPresenter n;
  
  private int o;
  
  private int p;
  
  private Drawable q;
  
  public f0(Toolbar paramToolbar, boolean paramBoolean) {
    this(paramToolbar, paramBoolean, h.abc_action_bar_up_description, e.abc_ic_ab_back_material);
  }
  
  public f0(Toolbar paramToolbar, boolean paramBoolean, int paramInt1, int paramInt2) {
    boolean bool;
    this.o = 0;
    this.p = 0;
    this.a = paramToolbar;
    this.i = paramToolbar.getTitle();
    this.j = paramToolbar.getSubtitle();
    if (this.i != null) {
      bool = true;
    } else {
      bool = false;
    } 
    this.h = bool;
    this.g = paramToolbar.getNavigationIcon();
    e0 e0 = e0.v(paramToolbar.getContext(), null, j.ActionBar, b.a.a.actionBarStyle, 0);
    this.q = e0.g(j.ActionBar_homeAsUpIndicator);
    if (paramBoolean) {
      CharSequence charSequence = e0.p(j.ActionBar_title);
      if (!TextUtils.isEmpty(charSequence))
        A(charSequence); 
      charSequence = e0.p(j.ActionBar_subtitle);
      if (!TextUtils.isEmpty(charSequence))
        z(charSequence); 
      Drawable drawable = e0.g(j.ActionBar_logo);
      if (drawable != null)
        v(drawable); 
      drawable = e0.g(j.ActionBar_icon);
      if (drawable != null)
        setIcon(drawable); 
      if (this.g == null) {
        drawable = this.q;
        if (drawable != null)
          y(drawable); 
      } 
      i(e0.k(j.ActionBar_displayOptions, 0));
      paramInt2 = e0.n(j.ActionBar_customNavigationLayout, 0);
      if (paramInt2 != 0) {
        t(LayoutInflater.from(this.a.getContext()).inflate(paramInt2, this.a, false));
        i(this.b | 0x10);
      } 
      paramInt2 = e0.m(j.ActionBar_height, 0);
      if (paramInt2 > 0) {
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.height = paramInt2;
        this.a.setLayoutParams(layoutParams);
      } 
      int i = e0.e(j.ActionBar_contentInsetStart, -1);
      paramInt2 = e0.e(j.ActionBar_contentInsetEnd, -1);
      if (i >= 0 || paramInt2 >= 0)
        this.a.setContentInsetsRelative(Math.max(i, 0), Math.max(paramInt2, 0)); 
      paramInt2 = e0.n(j.ActionBar_titleTextStyle, 0);
      if (paramInt2 != 0) {
        Toolbar toolbar = this.a;
        toolbar.setTitleTextAppearance(toolbar.getContext(), paramInt2);
      } 
      paramInt2 = e0.n(j.ActionBar_subtitleTextStyle, 0);
      if (paramInt2 != 0) {
        Toolbar toolbar = this.a;
        toolbar.setSubtitleTextAppearance(toolbar.getContext(), paramInt2);
      } 
      paramInt2 = e0.n(j.ActionBar_popupTheme, 0);
      if (paramInt2 != 0)
        this.a.setPopupTheme(paramInt2); 
    } else {
      this.b = s();
    } 
    e0.w();
    u(paramInt1);
    this.k = this.a.getNavigationContentDescription();
    this.a.setNavigationOnClickListener(new a(this));
  }
  
  private void B(CharSequence paramCharSequence) {
    this.i = paramCharSequence;
    if ((this.b & 0x8) != 0)
      this.a.setTitle(paramCharSequence); 
  }
  
  private void C() {
    if ((this.b & 0x4) != 0)
      if (TextUtils.isEmpty(this.k)) {
        this.a.setNavigationContentDescription(this.p);
      } else {
        this.a.setNavigationContentDescription(this.k);
      }  
  }
  
  private void D() {
    if ((this.b & 0x4) != 0) {
      Toolbar toolbar = this.a;
      Drawable drawable = this.g;
      if (drawable == null)
        drawable = this.q; 
      toolbar.setNavigationIcon(drawable);
    } else {
      this.a.setNavigationIcon((Drawable)null);
    } 
  }
  
  private void E() {
    Drawable drawable;
    int i = this.b;
    if ((i & 0x2) != 0) {
      if ((i & 0x1) != 0) {
        drawable = this.f;
        if (drawable == null)
          drawable = this.e; 
      } else {
        drawable = this.e;
      } 
    } else {
      drawable = null;
    } 
    this.a.setLogo(drawable);
  }
  
  private int s() {
    byte b;
    if (this.a.getNavigationIcon() != null) {
      b = 15;
      this.q = this.a.getNavigationIcon();
    } else {
      b = 11;
    } 
    return b;
  }
  
  public void A(CharSequence paramCharSequence) {
    this.h = true;
    B(paramCharSequence);
  }
  
  public boolean a() {
    return this.a.A();
  }
  
  public boolean b() {
    return this.a.d();
  }
  
  public boolean c() {
    return this.a.z();
  }
  
  public void collapseActionView() {
    this.a.e();
  }
  
  public boolean d() {
    return this.a.w();
  }
  
  public boolean e() {
    return this.a.J();
  }
  
  public void f() {
    this.a.f();
  }
  
  public void g(ScrollingTabContainerView paramScrollingTabContainerView) {
    View view = this.c;
    if (view != null) {
      ViewParent viewParent = view.getParent();
      Toolbar toolbar = this.a;
      if (viewParent == toolbar)
        toolbar.removeView(this.c); 
    } 
    this.c = (View)paramScrollingTabContainerView;
    if (paramScrollingTabContainerView != null && this.o == 2) {
      this.a.addView((View)paramScrollingTabContainerView, 0);
      Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams)this.c.getLayoutParams();
      ((ViewGroup.MarginLayoutParams)layoutParams).width = -2;
      ((ViewGroup.MarginLayoutParams)layoutParams).height = -2;
      layoutParams.a = 8388691;
      paramScrollingTabContainerView.setAllowCollapse(true);
    } 
  }
  
  public Context getContext() {
    return this.a.getContext();
  }
  
  public CharSequence getTitle() {
    return this.a.getTitle();
  }
  
  public boolean h() {
    return this.a.v();
  }
  
  public void i(int paramInt) {
    int i = this.b ^ paramInt;
    this.b = paramInt;
    if (i != 0) {
      if ((i & 0x4) != 0) {
        if ((paramInt & 0x4) != 0)
          C(); 
        D();
      } 
      if ((i & 0x3) != 0)
        E(); 
      if ((i & 0x8) != 0)
        if ((paramInt & 0x8) != 0) {
          this.a.setTitle(this.i);
          this.a.setSubtitle(this.j);
        } else {
          this.a.setTitle((CharSequence)null);
          this.a.setSubtitle((CharSequence)null);
        }  
      if ((i & 0x10) != 0) {
        View view = this.d;
        if (view != null)
          if ((paramInt & 0x10) != 0) {
            this.a.addView(view);
          } else {
            this.a.removeView(view);
          }  
      } 
    } 
  }
  
  public void j(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = b.a.k.a.a.d(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    v(drawable);
  }
  
  public int k() {
    return this.o;
  }
  
  public a0 l(int paramInt, long paramLong) {
    float f;
    a0 a0 = w.d((View)this.a);
    if (paramInt == 0) {
      f = 1.0F;
    } else {
      f = 0.0F;
    } 
    return a0.a(f).d(paramLong).f((b0)new b(this, paramInt));
  }
  
  public ViewGroup m() {
    return this.a;
  }
  
  public void n(boolean paramBoolean) {}
  
  public int o() {
    return this.b;
  }
  
  public void p() {
    Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
  }
  
  public void q() {
    Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
  }
  
  public void r(boolean paramBoolean) {
    this.a.setCollapsible(paramBoolean);
  }
  
  public void setIcon(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = b.a.k.a.a.d(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    setIcon(drawable);
  }
  
  public void setIcon(Drawable paramDrawable) {
    this.e = paramDrawable;
    E();
  }
  
  public void setMenu(Menu paramMenu, m.a parama) {
    if (this.n == null) {
      ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.a.getContext());
      this.n = actionMenuPresenter;
      actionMenuPresenter.s(f.action_menu_presenter);
    } 
    this.n.g(parama);
    this.a.setMenu((g)paramMenu, this.n);
  }
  
  public void setMenuPrepared() {
    this.m = true;
  }
  
  public void setVisibility(int paramInt) {
    this.a.setVisibility(paramInt);
  }
  
  public void setWindowCallback(Window.Callback paramCallback) {
    this.l = paramCallback;
  }
  
  public void setWindowTitle(CharSequence paramCharSequence) {
    if (!this.h)
      B(paramCharSequence); 
  }
  
  public void t(View paramView) {
    View view = this.d;
    if (view != null && (this.b & 0x10) != 0)
      this.a.removeView(view); 
    this.d = paramView;
    if (paramView != null && (this.b & 0x10) != 0)
      this.a.addView(paramView); 
  }
  
  public void u(int paramInt) {
    if (paramInt == this.p)
      return; 
    this.p = paramInt;
    if (TextUtils.isEmpty(this.a.getNavigationContentDescription()))
      w(this.p); 
  }
  
  public void v(Drawable paramDrawable) {
    this.f = paramDrawable;
    E();
  }
  
  public void w(int paramInt) {
    String str;
    if (paramInt == 0) {
      str = null;
    } else {
      str = getContext().getString(paramInt);
    } 
    x(str);
  }
  
  public void x(CharSequence paramCharSequence) {
    this.k = paramCharSequence;
    C();
  }
  
  public void y(Drawable paramDrawable) {
    this.g = paramDrawable;
    D();
  }
  
  public void z(CharSequence paramCharSequence) {
    this.j = paramCharSequence;
    if ((this.b & 0x8) != 0)
      this.a.setSubtitle(paramCharSequence); 
  }
  
  class a implements View.OnClickListener {
    final androidx.appcompat.view.menu.a b;
    
    a(f0 this$0) {
      this.b = new androidx.appcompat.view.menu.a(this$0.a.getContext(), 0, 16908332, 0, 0, this$0.i);
    }
    
    public void onClick(View param1View) {
      f0 f01 = this.c;
      Window.Callback callback = f01.l;
      if (callback != null && f01.m)
        callback.onMenuItemSelected(0, (MenuItem)this.b); 
    }
  }
  
  class b extends c0 {
    private boolean a = false;
    
    b(f0 this$0, int param1Int) {}
    
    public void a(View param1View) {
      this.a = true;
    }
    
    public void b(View param1View) {
      if (!this.a)
        this.c.a.setVisibility(this.b); 
    }
    
    public void c(View param1View) {
      this.c.a.setVisibility(0);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */