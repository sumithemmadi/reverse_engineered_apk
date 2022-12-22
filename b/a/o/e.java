package b.a.o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

public class e extends b implements g.a {
  private Context d;
  
  private ActionBarContextView e;
  
  private b.a f;
  
  private WeakReference<View> g;
  
  private boolean h;
  
  private boolean i;
  
  private g j;
  
  public e(Context paramContext, ActionBarContextView paramActionBarContextView, b.a parama, boolean paramBoolean) {
    this.d = paramContext;
    this.e = paramActionBarContextView;
    this.f = parama;
    g g1 = (new g(paramActionBarContextView.getContext())).W(1);
    this.j = g1;
    g1.V(this);
    this.i = paramBoolean;
  }
  
  public boolean a(g paramg, MenuItem paramMenuItem) {
    return this.f.d(this, paramMenuItem);
  }
  
  public void b(g paramg) {
    k();
    this.e.l();
  }
  
  public void c() {
    if (this.h)
      return; 
    this.h = true;
    this.e.sendAccessibilityEvent(32);
    this.f.a(this);
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
    return (Menu)this.j;
  }
  
  public MenuInflater f() {
    return new g(this.e.getContext());
  }
  
  public CharSequence g() {
    return this.e.getSubtitle();
  }
  
  public CharSequence i() {
    return this.e.getTitle();
  }
  
  public void k() {
    this.f.c(this, (Menu)this.j);
  }
  
  public boolean l() {
    return this.e.j();
  }
  
  public void m(View paramView) {
    this.e.setCustomView(paramView);
    if (paramView != null) {
      WeakReference<View> weakReference = new WeakReference<View>(paramView);
    } else {
      paramView = null;
    } 
    this.g = (WeakReference<View>)paramView;
  }
  
  public void n(int paramInt) {
    o(this.d.getString(paramInt));
  }
  
  public void o(CharSequence paramCharSequence) {
    this.e.setSubtitle(paramCharSequence);
  }
  
  public void q(int paramInt) {
    r(this.d.getString(paramInt));
  }
  
  public void r(CharSequence paramCharSequence) {
    this.e.setTitle(paramCharSequence);
  }
  
  public void s(boolean paramBoolean) {
    super.s(paramBoolean);
    this.e.setTitleOptional(paramBoolean);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/a/o/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */