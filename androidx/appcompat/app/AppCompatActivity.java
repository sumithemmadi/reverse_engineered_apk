package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.j0;
import androidx.core.app.g;
import androidx.core.app.p;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.h;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.c;
import androidx.savedstate.d;

public class AppCompatActivity extends FragmentActivity implements b, p.a {
  private c q;
  
  private Resources r;
  
  public AppCompatActivity() {
    D();
  }
  
  private void D() {
    j().d("androidx:appcompat", new a(this));
    n(new b(this));
  }
  
  private boolean J(KeyEvent paramKeyEvent) {
    if (Build.VERSION.SDK_INT < 26 && !paramKeyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(paramKeyEvent.getMetaState()) && paramKeyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(paramKeyEvent.getKeyCode())) {
      Window window = getWindow();
      if (window != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(paramKeyEvent))
        return true; 
    } 
    return false;
  }
  
  private void p() {
    v.a(getWindow().getDecorView(), (h)this);
    w.a(getWindow().getDecorView(), (u)this);
    d.a(getWindow().getDecorView(), (c)this);
  }
  
  public void A() {
    B().q();
  }
  
  public c B() {
    if (this.q == null)
      this.q = c.i((Activity)this, this); 
    return this.q;
  }
  
  public ActionBar C() {
    return B().o();
  }
  
  public void E(p paramp) {
    paramp.c((Activity)this);
  }
  
  protected void F(int paramInt) {}
  
  public void G(p paramp) {}
  
  @Deprecated
  public void H() {}
  
  public boolean I() {
    Intent intent = g();
    if (intent != null) {
      if (L(intent)) {
        p p = p.i((Context)this);
        E(p);
        G(p);
        p.j();
        try {
          androidx.core.app.a.m((Activity)this);
        } catch (IllegalStateException illegalStateException) {
          finish();
        } 
      } else {
        K((Intent)illegalStateException);
      } 
      return true;
    } 
    return false;
  }
  
  public void K(Intent paramIntent) {
    g.e((Activity)this, paramIntent);
  }
  
  public boolean L(Intent paramIntent) {
    return g.f((Activity)this, paramIntent);
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    p();
    B().d(paramView, paramLayoutParams);
  }
  
  protected void attachBaseContext(Context paramContext) {
    super.attachBaseContext(B().h(paramContext));
  }
  
  public void closeOptionsMenu() {
    ActionBar actionBar = C();
    if (getWindow().hasFeature(0) && (actionBar == null || !actionBar.f()))
      super.closeOptionsMenu(); 
  }
  
  public void d(b.a.o.b paramb) {}
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    int i = paramKeyEvent.getKeyCode();
    ActionBar actionBar = C();
    return (i == 82 && actionBar != null && actionBar.o(paramKeyEvent)) ? true : super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public void e(b.a.o.b paramb) {}
  
  public <T extends View> T findViewById(int paramInt) {
    return B().k(paramInt);
  }
  
  public Intent g() {
    return g.a((Activity)this);
  }
  
  public MenuInflater getMenuInflater() {
    return B().n();
  }
  
  public Resources getResources() {
    if (this.r == null && j0.b())
      this.r = (Resources)new j0((Context)this, super.getResources()); 
    Resources resources1 = this.r;
    Resources resources2 = resources1;
    if (resources1 == null)
      resources2 = super.getResources(); 
    return resources2;
  }
  
  public b.a.o.b i(b.a.o.b.a parama) {
    return null;
  }
  
  public void invalidateOptionsMenu() {
    B().q();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    if (this.r != null) {
      DisplayMetrics displayMetrics = super.getResources().getDisplayMetrics();
      this.r.updateConfiguration(paramConfiguration, displayMetrics);
    } 
    B().r(paramConfiguration);
  }
  
  public void onContentChanged() {
    H();
  }
  
  protected void onDestroy() {
    super.onDestroy();
    B().t();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    return J(paramKeyEvent) ? true : super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem) {
    if (super.onMenuItemSelected(paramInt, paramMenuItem))
      return true; 
    ActionBar actionBar = C();
    return (paramMenuItem.getItemId() == 16908332 && actionBar != null && (actionBar.i() & 0x4) != 0) ? I() : false;
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu) {
    return super.onMenuOpened(paramInt, paramMenu);
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu) {
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  protected void onPostCreate(Bundle paramBundle) {
    super.onPostCreate(paramBundle);
    B().u(paramBundle);
  }
  
  protected void onPostResume() {
    super.onPostResume();
    B().v();
  }
  
  protected void onStart() {
    super.onStart();
    B().x();
  }
  
  protected void onStop() {
    super.onStop();
    B().y();
  }
  
  protected void onTitleChanged(CharSequence paramCharSequence, int paramInt) {
    super.onTitleChanged(paramCharSequence, paramInt);
    B().H(paramCharSequence);
  }
  
  public void openOptionsMenu() {
    ActionBar actionBar = C();
    if (getWindow().hasFeature(0) && (actionBar == null || !actionBar.p()))
      super.openOptionsMenu(); 
  }
  
  public void setContentView(int paramInt) {
    p();
    B().C(paramInt);
  }
  
  public void setContentView(View paramView) {
    p();
    B().D(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    p();
    B().E(paramView, paramLayoutParams);
  }
  
  public void setTheme(int paramInt) {
    super.setTheme(paramInt);
    B().G(paramInt);
  }
  
  class a implements SavedStateRegistry.b {
    a(AppCompatActivity this$0) {}
    
    public Bundle a() {
      Bundle bundle = new Bundle();
      this.a.B().w(bundle);
      return bundle;
    }
  }
  
  class b implements androidx.activity.d.b {
    b(AppCompatActivity this$0) {}
    
    public void a(Context param1Context) {
      c c = this.a.B();
      c.p();
      c.s(this.a.j().a("androidx:appcompat"));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/app/AppCompatActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */