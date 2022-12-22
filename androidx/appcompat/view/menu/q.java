package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.MenuPopupWindow;
import b.a.d;
import b.a.g;
import b.h.k.w;

final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {
  private static final int c = g.abc_popup_menu_item_layout;
  
  private final Context d;
  
  private final g e;
  
  private final f f;
  
  private final boolean g;
  
  private final int h;
  
  private final int i;
  
  private final int j;
  
  final MenuPopupWindow k;
  
  final ViewTreeObserver.OnGlobalLayoutListener l = new a(this);
  
  private final View.OnAttachStateChangeListener m = new b(this);
  
  private PopupWindow.OnDismissListener n;
  
  private View o;
  
  View p;
  
  private m.a q;
  
  ViewTreeObserver r;
  
  private boolean s;
  
  private boolean t;
  
  private int u;
  
  private int v = 0;
  
  private boolean w;
  
  public q(Context paramContext, g paramg, View paramView, int paramInt1, int paramInt2, boolean paramBoolean) {
    this.d = paramContext;
    this.e = paramg;
    this.g = paramBoolean;
    this.f = new f(paramg, LayoutInflater.from(paramContext), paramBoolean, c);
    this.i = paramInt1;
    this.j = paramInt2;
    Resources resources = paramContext.getResources();
    this.h = Math.max((resources.getDisplayMetrics()).widthPixels / 2, resources.getDimensionPixelSize(d.abc_config_prefDialogWidth));
    this.o = paramView;
    this.k = new MenuPopupWindow(paramContext, null, paramInt1, paramInt2);
    paramg.c(this, paramContext);
  }
  
  private boolean z() {
    if (a())
      return true; 
    if (!this.s) {
      View view = this.o;
      if (view != null) {
        boolean bool;
        this.p = view;
        this.k.I(this);
        this.k.J(this);
        this.k.H(true);
        view = this.p;
        if (this.r == null) {
          bool = true;
        } else {
          bool = false;
        } 
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        this.r = viewTreeObserver;
        if (bool)
          viewTreeObserver.addOnGlobalLayoutListener(this.l); 
        view.addOnAttachStateChangeListener(this.m);
        this.k.B(view);
        this.k.E(this.v);
        if (!this.t) {
          this.u = k.o((ListAdapter)this.f, null, this.d, this.h);
          this.t = true;
        } 
        this.k.D(this.u);
        this.k.G(2);
        this.k.F(n());
        this.k.T0();
        ListView listView = this.k.U0();
        listView.setOnKeyListener(this);
        if (this.w && this.e.z() != null) {
          FrameLayout frameLayout = (FrameLayout)LayoutInflater.from(this.d).inflate(g.abc_popup_menu_header_item_layout, (ViewGroup)listView, false);
          TextView textView = (TextView)frameLayout.findViewById(16908310);
          if (textView != null)
            textView.setText(this.e.z()); 
          frameLayout.setEnabled(false);
          listView.addHeaderView((View)frameLayout, null, false);
        } 
        this.k.n((ListAdapter)this.f);
        this.k.T0();
        return true;
      } 
    } 
    return false;
  }
  
  public void T0() {
    if (z())
      return; 
    throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
  }
  
  public ListView U0() {
    return this.k.U0();
  }
  
  public boolean a() {
    boolean bool;
    if (!this.s && this.k.a()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void b(g paramg, boolean paramBoolean) {
    if (paramg != this.e)
      return; 
    dismiss();
    m.a a1 = this.q;
    if (a1 != null)
      a1.b(paramg, paramBoolean); 
  }
  
  public void c(boolean paramBoolean) {
    this.t = false;
    f f1 = this.f;
    if (f1 != null)
      f1.notifyDataSetChanged(); 
  }
  
  public boolean d() {
    return false;
  }
  
  public void dismiss() {
    if (a())
      this.k.dismiss(); 
  }
  
  public void g(m.a parama) {
    this.q = parama;
  }
  
  public void i(Parcelable paramParcelable) {}
  
  public boolean j(r paramr) {
    if (paramr.hasVisibleItems()) {
      l l = new l(this.d, paramr, this.p, this.g, this.i, this.j);
      l.j(this.q);
      l.g(k.x(paramr));
      l.i(this.n);
      this.n = null;
      this.e.e(false);
      int i = this.k.c();
      int j = this.k.m();
      int n = i;
      if ((Gravity.getAbsoluteGravity(this.v, w.C(this.o)) & 0x7) == 5)
        n = i + this.o.getWidth(); 
      if (l.n(n, j)) {
        m.a a1 = this.q;
        if (a1 != null)
          a1.c(paramr); 
        return true;
      } 
    } 
    return false;
  }
  
  public Parcelable k() {
    return null;
  }
  
  public void l(g paramg) {}
  
  public void onDismiss() {
    this.s = true;
    this.e.close();
    ViewTreeObserver viewTreeObserver = this.r;
    if (viewTreeObserver != null) {
      if (!viewTreeObserver.isAlive())
        this.r = this.p.getViewTreeObserver(); 
      this.r.removeGlobalOnLayoutListener(this.l);
      this.r = null;
    } 
    this.p.removeOnAttachStateChangeListener(this.m);
    PopupWindow.OnDismissListener onDismissListener = this.n;
    if (onDismissListener != null)
      onDismissListener.onDismiss(); 
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getAction() == 1 && paramInt == 82) {
      dismiss();
      return true;
    } 
    return false;
  }
  
  public void p(View paramView) {
    this.o = paramView;
  }
  
  public void r(boolean paramBoolean) {
    this.f.d(paramBoolean);
  }
  
  public void s(int paramInt) {
    this.v = paramInt;
  }
  
  public void t(int paramInt) {
    this.k.e(paramInt);
  }
  
  public void u(PopupWindow.OnDismissListener paramOnDismissListener) {
    this.n = paramOnDismissListener;
  }
  
  public void v(boolean paramBoolean) {
    this.w = paramBoolean;
  }
  
  public void w(int paramInt) {
    this.k.j(paramInt);
  }
  
  class a implements ViewTreeObserver.OnGlobalLayoutListener {
    a(q this$0) {}
    
    public void onGlobalLayout() {
      if (this.b.a() && !this.b.k.z()) {
        View view = this.b.p;
        if (view == null || !view.isShown()) {
          this.b.dismiss();
          return;
        } 
        this.b.k.T0();
      } 
    }
  }
  
  class b implements View.OnAttachStateChangeListener {
    b(q this$0) {}
    
    public void onViewAttachedToWindow(View param1View) {}
    
    public void onViewDetachedFromWindow(View param1View) {
      ViewTreeObserver viewTreeObserver = this.b.r;
      if (viewTreeObserver != null) {
        if (!viewTreeObserver.isAlive())
          this.b.r = param1View.getViewTreeObserver(); 
        q q1 = this.b;
        q1.r.removeGlobalOnLayoutListener(q1.l);
      } 
      param1View.removeOnAttachStateChangeListener(this);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/view/menu/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */