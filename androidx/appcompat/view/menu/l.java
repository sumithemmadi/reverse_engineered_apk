package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import b.a.d;
import b.h.k.e;
import b.h.k.w;

public class l {
  private final Context a;
  
  private final g b;
  
  private final boolean c;
  
  private final int d;
  
  private final int e;
  
  private View f;
  
  private int g = 8388611;
  
  private boolean h;
  
  private m.a i;
  
  private k j;
  
  private PopupWindow.OnDismissListener k;
  
  private final PopupWindow.OnDismissListener l = new a(this);
  
  public l(Context paramContext, g paramg, View paramView, boolean paramBoolean, int paramInt) {
    this(paramContext, paramg, paramView, paramBoolean, paramInt, 0);
  }
  
  public l(Context paramContext, g paramg, View paramView, boolean paramBoolean, int paramInt1, int paramInt2) {
    this.a = paramContext;
    this.b = paramg;
    this.f = paramView;
    this.c = paramBoolean;
    this.d = paramInt1;
    this.e = paramInt2;
  }
  
  private k a() {
    q q;
    boolean bool;
    Display display = ((WindowManager)this.a.getSystemService("window")).getDefaultDisplay();
    Point point = new Point();
    if (Build.VERSION.SDK_INT >= 17) {
      display.getRealSize(point);
    } else {
      display.getSize(point);
    } 
    if (Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(d.abc_cascading_menus_min_smallest_width)) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      d d = new d(this.a, this.f, this.d, this.e, this.c);
    } else {
      q = new q(this.a, this.b, this.f, this.d, this.e, this.c);
    } 
    q.l(this.b);
    q.u(this.l);
    q.p(this.f);
    q.g(this.i);
    q.r(this.h);
    q.s(this.g);
    return q;
  }
  
  private void l(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    k k1 = c();
    k1.v(paramBoolean2);
    if (paramBoolean1) {
      int i = paramInt1;
      if ((e.b(this.g, w.C(this.f)) & 0x7) == 5)
        i = paramInt1 - this.f.getWidth(); 
      k1.t(i);
      k1.w(paramInt2);
      paramInt1 = (int)((this.a.getResources().getDisplayMetrics()).density * 48.0F / 2.0F);
      k1.q(new Rect(i - paramInt1, paramInt2 - paramInt1, i + paramInt1, paramInt2 + paramInt1));
    } 
    k1.T0();
  }
  
  public void b() {
    if (d())
      this.j.dismiss(); 
  }
  
  public k c() {
    if (this.j == null)
      this.j = a(); 
    return this.j;
  }
  
  public boolean d() {
    boolean bool;
    k k1 = this.j;
    if (k1 != null && k1.a()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  protected void e() {
    this.j = null;
    PopupWindow.OnDismissListener onDismissListener = this.k;
    if (onDismissListener != null)
      onDismissListener.onDismiss(); 
  }
  
  public void f(View paramView) {
    this.f = paramView;
  }
  
  public void g(boolean paramBoolean) {
    this.h = paramBoolean;
    k k1 = this.j;
    if (k1 != null)
      k1.r(paramBoolean); 
  }
  
  public void h(int paramInt) {
    this.g = paramInt;
  }
  
  public void i(PopupWindow.OnDismissListener paramOnDismissListener) {
    this.k = paramOnDismissListener;
  }
  
  public void j(m.a parama) {
    this.i = parama;
    k k1 = this.j;
    if (k1 != null)
      k1.g(parama); 
  }
  
  public void k() {
    if (m())
      return; 
    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
  }
  
  public boolean m() {
    if (d())
      return true; 
    if (this.f == null)
      return false; 
    l(0, 0, false, false);
    return true;
  }
  
  public boolean n(int paramInt1, int paramInt2) {
    if (d())
      return true; 
    if (this.f == null)
      return false; 
    l(paramInt1, paramInt2, true, true);
    return true;
  }
  
  class a implements PopupWindow.OnDismissListener {
    a(l this$0) {}
    
    public void onDismiss() {
      this.b.e();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/view/menu/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */