package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import b.h.j.i;

public class f {
  private final h<?> a;
  
  private f(h<?> paramh) {
    this.a = paramh;
  }
  
  public static f b(h<?> paramh) {
    return new f((h)i.f(paramh, "callbacks == null"));
  }
  
  public void a(Fragment paramFragment) {
    h<?> h1 = this.a;
    h1.f.j(h1, h1, paramFragment);
  }
  
  public void c() {
    this.a.f.y();
  }
  
  public void d(Configuration paramConfiguration) {
    this.a.f.A(paramConfiguration);
  }
  
  public boolean e(MenuItem paramMenuItem) {
    return this.a.f.B(paramMenuItem);
  }
  
  public void f() {
    this.a.f.C();
  }
  
  public boolean g(Menu paramMenu, MenuInflater paramMenuInflater) {
    return this.a.f.D(paramMenu, paramMenuInflater);
  }
  
  public void h() {
    this.a.f.E();
  }
  
  public void i() {
    this.a.f.G();
  }
  
  public void j(boolean paramBoolean) {
    this.a.f.H(paramBoolean);
  }
  
  public boolean k(MenuItem paramMenuItem) {
    return this.a.f.J(paramMenuItem);
  }
  
  public void l(Menu paramMenu) {
    this.a.f.K(paramMenu);
  }
  
  public void m() {
    this.a.f.M();
  }
  
  public void n(boolean paramBoolean) {
    this.a.f.N(paramBoolean);
  }
  
  public boolean o(Menu paramMenu) {
    return this.a.f.O(paramMenu);
  }
  
  public void p() {
    this.a.f.Q();
  }
  
  public void q() {
    this.a.f.R();
  }
  
  public void r() {
    this.a.f.T();
  }
  
  public boolean s() {
    return this.a.f.a0(true);
  }
  
  public FragmentManager t() {
    return this.a.f;
  }
  
  public void u() {
    this.a.f.S0();
  }
  
  public View v(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    return this.a.f.v0().onCreateView(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public void w(Parcelable paramParcelable) {
    h<?> h1 = this.a;
    if (h1 instanceof androidx.lifecycle.u) {
      h1.f.f1(paramParcelable);
      return;
    } 
    throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
  }
  
  public Parcelable x() {
    return this.a.f.h1();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */