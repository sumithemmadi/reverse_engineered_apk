package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.d;
import androidx.core.app.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;

public class FragmentActivity extends ComponentActivity implements a.c, a.e {
  final f l = f.b(new c(this));
  
  final i m = new i((h)this);
  
  boolean n;
  
  boolean o;
  
  boolean p = true;
  
  public FragmentActivity() {
    u();
  }
  
  private void u() {
    j().d("android:support:fragments", new a(this));
    n(new b(this));
  }
  
  private static boolean w(FragmentManager paramFragmentManager, Lifecycle.State paramState) {
    Iterator<Fragment> iterator = paramFragmentManager.t0().iterator();
    boolean bool = false;
    while (iterator.hasNext()) {
      Fragment fragment = iterator.next();
      if (fragment == null)
        continue; 
      boolean bool1 = bool;
      if (fragment.C() != null)
        bool1 = bool | w(fragment.s(), paramState); 
      w w = fragment.V;
      bool = bool1;
      if (w != null) {
        bool = bool1;
        if (w.a().b().isAtLeast(Lifecycle.State.e)) {
          fragment.V.i(paramState);
          bool = true;
        } 
      } 
      if (fragment.U.b().isAtLeast(Lifecycle.State.e)) {
        fragment.U.o(paramState);
        bool = true;
      } 
    } 
    return bool;
  }
  
  @Deprecated
  public void A() {
    invalidateOptionsMenu();
  }
  
  @Deprecated
  public final void b(int paramInt) {}
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append("  ");
    String str = stringBuilder.toString();
    paramPrintWriter.print(str);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(this.n);
    paramPrintWriter.print(" mResumed=");
    paramPrintWriter.print(this.o);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(this.p);
    if (getApplication() != null)
      b.o.a.a.b((h)this).a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString); 
    this.l.t().W(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    this.l.u();
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    this.l.u();
    this.l.d(paramConfiguration);
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    this.m.h(Lifecycle.Event.ON_CREATE);
    this.l.f();
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu) {
    return (paramInt == 0) ? (super.onCreatePanelMenu(paramInt, paramMenu) | this.l.g(paramMenu, getMenuInflater())) : super.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    View view = r(paramView, paramString, paramContext, paramAttributeSet);
    return (view == null) ? super.onCreateView(paramView, paramString, paramContext, paramAttributeSet) : view;
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    View view = r(null, paramString, paramContext, paramAttributeSet);
    return (view == null) ? super.onCreateView(paramString, paramContext, paramAttributeSet) : view;
  }
  
  protected void onDestroy() {
    super.onDestroy();
    this.l.h();
    this.m.h(Lifecycle.Event.ON_DESTROY);
  }
  
  public void onLowMemory() {
    super.onLowMemory();
    this.l.i();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem) {
    return super.onMenuItemSelected(paramInt, paramMenuItem) ? true : ((paramInt != 0) ? ((paramInt != 6) ? false : this.l.e(paramMenuItem)) : this.l.k(paramMenuItem));
  }
  
  public void onMultiWindowModeChanged(boolean paramBoolean) {
    this.l.j(paramBoolean);
  }
  
  protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent paramIntent) {
    super.onNewIntent(paramIntent);
    this.l.u();
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu) {
    if (paramInt == 0)
      this.l.l(paramMenu); 
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  protected void onPause() {
    super.onPause();
    this.o = false;
    this.l.m();
    this.m.h(Lifecycle.Event.ON_PAUSE);
  }
  
  public void onPictureInPictureModeChanged(boolean paramBoolean) {
    this.l.n(paramBoolean);
  }
  
  protected void onPostResume() {
    super.onPostResume();
    z();
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu) {
    return (paramInt == 0) ? (y(paramView, paramMenu) | this.l.o(paramMenu)) : super.onPreparePanel(paramInt, paramView, paramMenu);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfint) {
    this.l.u();
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfint);
  }
  
  protected void onResume() {
    super.onResume();
    this.o = true;
    this.l.u();
    this.l.s();
  }
  
  protected void onStart() {
    super.onStart();
    this.p = false;
    if (!this.n) {
      this.n = true;
      this.l.c();
    } 
    this.l.u();
    this.l.s();
    this.m.h(Lifecycle.Event.ON_START);
    this.l.q();
  }
  
  public void onStateNotSaved() {
    this.l.u();
  }
  
  protected void onStop() {
    super.onStop();
    this.p = true;
    v();
    this.l.r();
    this.m.h(Lifecycle.Event.ON_STOP);
  }
  
  final View r(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    return this.l.v(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public FragmentManager s() {
    return this.l.t();
  }
  
  @Deprecated
  public b.o.a.a t() {
    return b.o.a.a.b((h)this);
  }
  
  void v() {
    do {
    
    } while (w(s(), Lifecycle.State.d));
  }
  
  @Deprecated
  public void x(Fragment paramFragment) {}
  
  @Deprecated
  protected boolean y(View paramView, Menu paramMenu) {
    return super.onPreparePanel(0, paramView, paramMenu);
  }
  
  protected void z() {
    this.m.h(Lifecycle.Event.ON_RESUME);
    this.l.p();
  }
  
  class a implements SavedStateRegistry.b {
    a(FragmentActivity this$0) {}
    
    public Bundle a() {
      Bundle bundle = new Bundle();
      this.a.v();
      this.a.m.h(Lifecycle.Event.ON_STOP);
      Parcelable parcelable = this.a.l.x();
      if (parcelable != null)
        bundle.putParcelable("android:support:fragments", parcelable); 
      return bundle;
    }
  }
  
  class b implements androidx.activity.d.b {
    b(FragmentActivity this$0) {}
    
    public void a(Context param1Context) {
      this.a.l.a(null);
      Bundle bundle = this.a.j().a("android:support:fragments");
      if (bundle != null) {
        Parcelable parcelable = bundle.getParcelable("android:support:fragments");
        this.a.l.w(parcelable);
      } 
    }
  }
  
  class c extends h<FragmentActivity> implements u, androidx.activity.c, d, m {
    public c(FragmentActivity this$0) {
      super(this$0);
    }
    
    public Lifecycle a() {
      return (Lifecycle)this.g.m;
    }
    
    public void b(FragmentManager param1FragmentManager, Fragment param1Fragment) {
      this.g.x(param1Fragment);
    }
    
    public OnBackPressedDispatcher c() {
      return this.g.c();
    }
    
    public View e(int param1Int) {
      return this.g.findViewById(param1Int);
    }
    
    public androidx.activity.result.c f() {
      return this.g.f();
    }
    
    public boolean g() {
      boolean bool;
      Window window = this.g.getWindow();
      if (window != null && window.peekDecorView() != null) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public t h() {
      return this.g.h();
    }
    
    public void m(String param1String, FileDescriptor param1FileDescriptor, PrintWriter param1PrintWriter, String[] param1ArrayOfString) {
      this.g.dump(param1String, param1FileDescriptor, param1PrintWriter, param1ArrayOfString);
    }
    
    public LayoutInflater o() {
      return this.g.getLayoutInflater().cloneInContext((Context)this.g);
    }
    
    public boolean p(Fragment param1Fragment) {
      return this.g.isFinishing() ^ true;
    }
    
    public void r() {
      this.g.A();
    }
    
    public FragmentActivity s() {
      return this.g;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/FragmentActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */