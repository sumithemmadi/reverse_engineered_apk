package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.p;
import b.a.f;
import b.a.o.g;
import b.a.o.h;
import b.h.k.a0;
import b.h.k.b0;
import b.h.k.c0;
import b.h.k.d0;
import b.h.k.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class j extends ActionBar implements ActionBarOverlayLayout.d {
  private static final Interpolator a = (Interpolator)new AccelerateInterpolator();
  
  private static final Interpolator b = (Interpolator)new DecelerateInterpolator();
  
  h A;
  
  private boolean B;
  
  boolean C;
  
  final b0 D = (b0)new a(this);
  
  final b0 E = (b0)new b(this);
  
  final d0 F = new c(this);
  
  Context c;
  
  private Context d;
  
  private Activity e;
  
  ActionBarOverlayLayout f;
  
  ActionBarContainer g;
  
  p h;
  
  ActionBarContextView i;
  
  View j;
  
  ScrollingTabContainerView k;
  
  private ArrayList<?> l = new ArrayList();
  
  private int m = -1;
  
  private boolean n;
  
  d o;
  
  b.a.o.b p;
  
  b.a.o.b.a q;
  
  private boolean r;
  
  private ArrayList<ActionBar.a> s = new ArrayList<ActionBar.a>();
  
  private boolean t;
  
  private int u = 0;
  
  boolean v = true;
  
  boolean w;
  
  boolean x;
  
  private boolean y;
  
  private boolean z = true;
  
  public j(Activity paramActivity, boolean paramBoolean) {
    this.e = paramActivity;
    View view = paramActivity.getWindow().getDecorView();
    C(view);
    if (!paramBoolean)
      this.j = view.findViewById(16908290); 
  }
  
  public j(Dialog paramDialog) {
    C(paramDialog.getWindow().getDecorView());
  }
  
  private void B() {
    if (this.y) {
      this.y = false;
      ActionBarOverlayLayout actionBarOverlayLayout = this.f;
      if (actionBarOverlayLayout != null)
        actionBarOverlayLayout.setShowingForActionMode(false); 
      L(false);
    } 
  }
  
  private void C(View paramView) {
    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout)paramView.findViewById(f.decor_content_parent);
    this.f = actionBarOverlayLayout;
    if (actionBarOverlayLayout != null)
      actionBarOverlayLayout.setActionBarVisibilityCallback(this); 
    this.h = z(paramView.findViewById(f.action_bar));
    this.i = (ActionBarContextView)paramView.findViewById(f.action_context_bar);
    ActionBarContainer actionBarContainer = (ActionBarContainer)paramView.findViewById(f.action_bar_container);
    this.g = actionBarContainer;
    p p1 = this.h;
    if (p1 != null && this.i != null && actionBarContainer != null) {
      boolean bool;
      this.c = p1.getContext();
      if ((this.h.o() & 0x4) != 0) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i)
        this.n = true; 
      b.a.o.a a1 = b.a.o.a.b(this.c);
      if (a1.a() || i) {
        bool = true;
      } else {
        bool = false;
      } 
      I(bool);
      G(a1.g());
      TypedArray typedArray = this.c.obtainStyledAttributes(null, b.a.j.ActionBar, b.a.a.actionBarStyle, 0);
      if (typedArray.getBoolean(b.a.j.ActionBar_hideOnContentScroll, false))
        H(true); 
      int i = typedArray.getDimensionPixelSize(b.a.j.ActionBar_elevation, 0);
      if (i != 0)
        F(i); 
      typedArray.recycle();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(j.class.getSimpleName());
    stringBuilder.append(" can only be used with a compatible window decor layout");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  private void G(boolean paramBoolean) {
    this.t = paramBoolean;
    if (!paramBoolean) {
      this.h.g(null);
      this.g.setTabContainer(this.k);
    } else {
      this.g.setTabContainer(null);
      this.h.g(this.k);
    } 
    int i = A();
    boolean bool = true;
    if (i == 2) {
      i = 1;
    } else {
      i = 0;
    } 
    ScrollingTabContainerView scrollingTabContainerView = this.k;
    if (scrollingTabContainerView != null) {
      ActionBarOverlayLayout actionBarOverlayLayout1;
      if (i != 0) {
        scrollingTabContainerView.setVisibility(0);
        actionBarOverlayLayout1 = this.f;
        if (actionBarOverlayLayout1 != null)
          w.o0((View)actionBarOverlayLayout1); 
      } else {
        actionBarOverlayLayout1.setVisibility(8);
      } 
    } 
    p p1 = this.h;
    if (!this.t && i != 0) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    p1.r(paramBoolean);
    ActionBarOverlayLayout actionBarOverlayLayout = this.f;
    if (!this.t && i != 0) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    } 
    actionBarOverlayLayout.setHasNonEmbeddedTabs(paramBoolean);
  }
  
  private boolean J() {
    return w.V((View)this.g);
  }
  
  private void K() {
    if (!this.y) {
      this.y = true;
      ActionBarOverlayLayout actionBarOverlayLayout = this.f;
      if (actionBarOverlayLayout != null)
        actionBarOverlayLayout.setShowingForActionMode(true); 
      L(false);
    } 
  }
  
  private void L(boolean paramBoolean) {
    if (v(this.w, this.x, this.y)) {
      if (!this.z) {
        this.z = true;
        y(paramBoolean);
      } 
    } else if (this.z) {
      this.z = false;
      x(paramBoolean);
    } 
  }
  
  static boolean v(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    return paramBoolean3 ? true : (!(paramBoolean1 || paramBoolean2));
  }
  
  private p z(View paramView) {
    String str;
    if (paramView instanceof p)
      return (p)paramView; 
    if (paramView instanceof Toolbar)
      return ((Toolbar)paramView).getWrapper(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Can't make a decor toolbar out of ");
    if (paramView != null) {
      str = paramView.getClass().getSimpleName();
    } else {
      str = "null";
    } 
    stringBuilder.append(str);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public int A() {
    return this.h.k();
  }
  
  public void D(boolean paramBoolean) {
    boolean bool;
    if (paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    E(bool, 4);
  }
  
  public void E(int paramInt1, int paramInt2) {
    int i = this.h.o();
    if ((paramInt2 & 0x4) != 0)
      this.n = true; 
    this.h.i(paramInt1 & paramInt2 | (paramInt2 ^ 0xFFFFFFFF) & i);
  }
  
  public void F(float paramFloat) {
    w.y0((View)this.g, paramFloat);
  }
  
  public void H(boolean paramBoolean) {
    if (!paramBoolean || this.f.u()) {
      this.C = paramBoolean;
      this.f.setHideOnContentScrollEnabled(paramBoolean);
      return;
    } 
    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
  }
  
  public void I(boolean paramBoolean) {
    this.h.n(paramBoolean);
  }
  
  public void a() {
    if (this.x) {
      this.x = false;
      L(true);
    } 
  }
  
  public void b() {}
  
  public void c(boolean paramBoolean) {
    this.v = paramBoolean;
  }
  
  public void d() {
    if (!this.x) {
      this.x = true;
      L(true);
    } 
  }
  
  public void e() {
    h h1 = this.A;
    if (h1 != null) {
      h1.a();
      this.A = null;
    } 
  }
  
  public boolean g() {
    p p1 = this.h;
    if (p1 != null && p1.h()) {
      this.h.collapseActionView();
      return true;
    } 
    return false;
  }
  
  public void h(boolean paramBoolean) {
    if (paramBoolean == this.r)
      return; 
    this.r = paramBoolean;
    int i = this.s.size();
    for (byte b1 = 0; b1 < i; b1++)
      ((ActionBar.a)this.s.get(b1)).a(paramBoolean); 
  }
  
  public int i() {
    return this.h.o();
  }
  
  public Context j() {
    if (this.d == null) {
      TypedValue typedValue = new TypedValue();
      this.c.getTheme().resolveAttribute(b.a.a.actionBarWidgetTheme, typedValue, true);
      int i = typedValue.resourceId;
      if (i != 0) {
        this.d = (Context)new ContextThemeWrapper(this.c, i);
      } else {
        this.d = this.c;
      } 
    } 
    return this.d;
  }
  
  public void l(Configuration paramConfiguration) {
    G(b.a.o.a.b(this.c).g());
  }
  
  public boolean n(int paramInt, KeyEvent paramKeyEvent) {
    d d1 = this.o;
    if (d1 == null)
      return false; 
    Menu menu = d1.e();
    if (menu != null) {
      if (paramKeyEvent != null) {
        i = paramKeyEvent.getDeviceId();
      } else {
        i = -1;
      } 
      int i = KeyCharacterMap.load(i).getKeyboardType();
      boolean bool = true;
      if (i == 1)
        bool = false; 
      menu.setQwertyMode(bool);
      return menu.performShortcut(paramInt, paramKeyEvent, 0);
    } 
    return false;
  }
  
  public void onWindowVisibilityChanged(int paramInt) {
    this.u = paramInt;
  }
  
  public void q(boolean paramBoolean) {
    if (!this.n)
      D(paramBoolean); 
  }
  
  public void r(boolean paramBoolean) {
    this.B = paramBoolean;
    if (!paramBoolean) {
      h h1 = this.A;
      if (h1 != null)
        h1.a(); 
    } 
  }
  
  public void s(CharSequence paramCharSequence) {
    this.h.setWindowTitle(paramCharSequence);
  }
  
  public b.a.o.b t(b.a.o.b.a parama) {
    d d2 = this.o;
    if (d2 != null)
      d2.c(); 
    this.f.setHideOnContentScrollEnabled(false);
    this.i.k();
    d d1 = new d(this, this.i.getContext(), parama);
    if (d1.t()) {
      this.o = d1;
      d1.k();
      this.i.h(d1);
      u(true);
      this.i.sendAccessibilityEvent(32);
      return d1;
    } 
    return null;
  }
  
  public void u(boolean paramBoolean) {
    if (paramBoolean) {
      K();
    } else {
      B();
    } 
    if (J()) {
      a0 a01;
      a0 a02;
      if (paramBoolean) {
        a01 = this.h.l(4, 100L);
        a02 = this.i.f(0, 200L);
      } else {
        a02 = this.h.l(0, 200L);
        a01 = this.i.f(8, 100L);
      } 
      h h1 = new h();
      h1.d(a01, a02);
      h1.h();
    } else if (paramBoolean) {
      this.h.setVisibility(4);
      this.i.setVisibility(0);
    } else {
      this.h.setVisibility(0);
      this.i.setVisibility(8);
    } 
  }
  
  void w() {
    b.a.o.b.a a1 = this.q;
    if (a1 != null) {
      a1.a(this.p);
      this.p = null;
      this.q = null;
    } 
  }
  
  public void x(boolean paramBoolean) {
    h h1 = this.A;
    if (h1 != null)
      h1.a(); 
    if (this.u == 0 && (this.B || paramBoolean)) {
      this.g.setAlpha(1.0F);
      this.g.setTransitioning(true);
      h1 = new h();
      float f1 = -this.g.getHeight();
      float f2 = f1;
      if (paramBoolean) {
        int[] arrayOfInt = new int[2];
        arrayOfInt[0] = 0;
        arrayOfInt[1] = 0;
        this.g.getLocationInWindow(arrayOfInt);
        f2 = f1 - arrayOfInt[1];
      } 
      a0 a0 = w.d((View)this.g).k(f2);
      a0.i(this.F);
      h1.c(a0);
      if (this.v) {
        View view = this.j;
        if (view != null)
          h1.c(w.d(view).k(f2)); 
      } 
      h1.f(a);
      h1.e(250L);
      h1.g(this.D);
      this.A = h1;
      h1.h();
    } else {
      this.D.b(null);
    } 
  }
  
  public void y(boolean paramBoolean) {
    h h1 = this.A;
    if (h1 != null)
      h1.a(); 
    this.g.setVisibility(0);
    if (this.u == 0 && (this.B || paramBoolean)) {
      this.g.setTranslationY(0.0F);
      float f1 = -this.g.getHeight();
      float f2 = f1;
      if (paramBoolean) {
        int[] arrayOfInt = new int[2];
        arrayOfInt[0] = 0;
        arrayOfInt[1] = 0;
        this.g.getLocationInWindow(arrayOfInt);
        f2 = f1 - arrayOfInt[1];
      } 
      this.g.setTranslationY(f2);
      h1 = new h();
      a0 a0 = w.d((View)this.g).k(0.0F);
      a0.i(this.F);
      h1.c(a0);
      if (this.v) {
        View view = this.j;
        if (view != null) {
          view.setTranslationY(f2);
          h1.c(w.d(this.j).k(0.0F));
        } 
      } 
      h1.f(b);
      h1.e(250L);
      h1.g(this.E);
      this.A = h1;
      h1.h();
    } else {
      this.g.setAlpha(1.0F);
      this.g.setTranslationY(0.0F);
      if (this.v) {
        View view = this.j;
        if (view != null)
          view.setTranslationY(0.0F); 
      } 
      this.E.b(null);
    } 
    ActionBarOverlayLayout actionBarOverlayLayout = this.f;
    if (actionBarOverlayLayout != null)
      w.o0((View)actionBarOverlayLayout); 
  }
  
  class a extends c0 {
    a(j this$0) {}
    
    public void b(View param1View) {
      j j1 = this.a;
      if (j1.v) {
        View view = j1.j;
        if (view != null) {
          view.setTranslationY(0.0F);
          this.a.g.setTranslationY(0.0F);
        } 
      } 
      this.a.g.setVisibility(8);
      this.a.g.setTransitioning(false);
      j1 = this.a;
      j1.A = null;
      j1.w();
      ActionBarOverlayLayout actionBarOverlayLayout = this.a.f;
      if (actionBarOverlayLayout != null)
        w.o0((View)actionBarOverlayLayout); 
    }
  }
  
  class b extends c0 {
    b(j this$0) {}
    
    public void b(View param1View) {
      j j1 = this.a;
      j1.A = null;
      j1.g.requestLayout();
    }
  }
  
  class c implements d0 {
    c(j this$0) {}
    
    public void a(View param1View) {
      ((View)this.a.g.getParent()).invalidate();
    }
  }
  
  public class d extends b.a.o.b implements g.a {
    private final Context d;
    
    private final g e;
    
    private b.a.o.b.a f;
    
    private WeakReference<View> g;
    
    public d(j this$0, Context param1Context, b.a.o.b.a param1a) {
      this.d = param1Context;
      this.f = param1a;
      g g1 = (new g(param1Context)).W(1);
      this.e = g1;
      g1.V(this);
    }
    
    public boolean a(g param1g, MenuItem param1MenuItem) {
      b.a.o.b.a a1 = this.f;
      return (a1 != null) ? a1.d(this, param1MenuItem) : false;
    }
    
    public void b(g param1g) {
      if (this.f == null)
        return; 
      k();
      this.h.i.l();
    }
    
    public void c() {
      j j1 = this.h;
      if (j1.o != this)
        return; 
      if (!j.v(j1.w, j1.x, false)) {
        j1 = this.h;
        j1.p = this;
        j1.q = this.f;
      } else {
        this.f.a(this);
      } 
      this.f = null;
      this.h.u(false);
      this.h.i.g();
      this.h.h.m().sendAccessibilityEvent(32);
      j1 = this.h;
      j1.f.setHideOnContentScrollEnabled(j1.C);
      this.h.o = null;
    }
    
    public View d() {
      WeakReference<View> weakReference = this.g;
      if (weakReference != null) {
        View view = weakReference.get();
      } else {
        weakReference = null;
      } 
      return (View)weakReference;
    }
    
    public Menu e() {
      return (Menu)this.e;
    }
    
    public MenuInflater f() {
      return (MenuInflater)new g(this.d);
    }
    
    public CharSequence g() {
      return this.h.i.getSubtitle();
    }
    
    public CharSequence i() {
      return this.h.i.getTitle();
    }
    
    public void k() {
      if (this.h.o != this)
        return; 
      this.e.h0();
      try {
        this.f.c(this, (Menu)this.e);
        return;
      } finally {
        this.e.g0();
      } 
    }
    
    public boolean l() {
      return this.h.i.j();
    }
    
    public void m(View param1View) {
      this.h.i.setCustomView(param1View);
      this.g = new WeakReference<View>(param1View);
    }
    
    public void n(int param1Int) {
      o(this.h.c.getResources().getString(param1Int));
    }
    
    public void o(CharSequence param1CharSequence) {
      this.h.i.setSubtitle(param1CharSequence);
    }
    
    public void q(int param1Int) {
      r(this.h.c.getResources().getString(param1Int));
    }
    
    public void r(CharSequence param1CharSequence) {
      this.h.i.setTitle(param1CharSequence);
    }
    
    public void s(boolean param1Boolean) {
      super.s(param1Boolean);
      this.h.i.setTitleOptional(param1Boolean);
    }
    
    public boolean t() {
      this.e.h0();
      try {
        return this.f.b(this, (Menu)this.e);
      } finally {
        this.e.g0();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/app/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */