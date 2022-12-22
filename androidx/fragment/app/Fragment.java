package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.o;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, h, u, c {
  static final Object b = new Object();
  
  String A;
  
  boolean B;
  
  boolean C;
  
  boolean D;
  
  boolean E;
  
  boolean F;
  
  boolean G = true;
  
  private boolean H;
  
  ViewGroup I;
  
  View J;
  
  boolean K;
  
  boolean L = true;
  
  e M;
  
  Runnable N = new a(this);
  
  boolean O;
  
  boolean P;
  
  float Q;
  
  LayoutInflater R;
  
  boolean S;
  
  Lifecycle.State T = Lifecycle.State.f;
  
  i U;
  
  w V;
  
  m<h> W = new m();
  
  s.a X;
  
  androidx.savedstate.b Y;
  
  private int Z;
  
  private final AtomicInteger a0 = new AtomicInteger();
  
  private final ArrayList<f> b0 = new ArrayList<f>();
  
  int c = -1;
  
  Bundle d;
  
  SparseArray<Parcelable> e;
  
  Bundle f;
  
  Boolean g;
  
  String h = UUID.randomUUID().toString();
  
  Bundle i;
  
  Fragment j;
  
  String k = null;
  
  int l;
  
  private Boolean m = null;
  
  boolean n;
  
  boolean o;
  
  boolean p;
  
  boolean q;
  
  boolean r;
  
  boolean s;
  
  int t;
  
  FragmentManager u;
  
  h<?> v;
  
  FragmentManager w = new k();
  
  Fragment x;
  
  int y;
  
  int z;
  
  public Fragment() {
    Y();
  }
  
  private int F() {
    Lifecycle.State state = this.T;
    return (state == Lifecycle.State.c || this.x == null) ? state.ordinal() : Math.min(state.ordinal(), this.x.F());
  }
  
  private void Y() {
    this.U = new i(this);
    this.Y = androidx.savedstate.b.a(this);
    this.X = null;
  }
  
  @Deprecated
  public static Fragment a0(Context paramContext, String paramString, Bundle paramBundle) {
    try {
      Fragment fragment = g.d(paramContext.getClassLoader(), paramString).getConstructor(new Class[0]).newInstance(new Object[0]);
      if (paramBundle != null) {
        paramBundle.setClassLoader(fragment.getClass().getClassLoader());
        fragment.B1(paramBundle);
      } 
      return fragment;
    } catch (InstantiationException instantiationException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": make sure class name exists, is public, and has an empty constructor that is public");
      throw new InstantiationException(stringBuilder.toString(), instantiationException);
    } catch (IllegalAccessException illegalAccessException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": make sure class name exists, is public, and has an empty constructor that is public");
      throw new InstantiationException(stringBuilder.toString(), illegalAccessException);
    } catch (NoSuchMethodException noSuchMethodException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": could not find Fragment constructor");
      throw new InstantiationException(stringBuilder.toString(), noSuchMethodException);
    } catch (InvocationTargetException invocationTargetException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": calling Fragment constructor caused an exception");
      throw new InstantiationException(stringBuilder.toString(), invocationTargetException);
    } 
  }
  
  private e k() {
    if (this.M == null)
      this.M = new e(); 
    return this.M;
  }
  
  private void w1() {
    if (FragmentManager.G0(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("moveto RESTORE_VIEW_STATE: ");
      stringBuilder.append(this);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    if (this.J != null)
      x1(this.d); 
    this.d = null;
  }
  
  View A() {
    e e1 = this.M;
    return (e1 == null) ? null : e1.v;
  }
  
  public void A0() {
    this.H = true;
  }
  
  void A1(Animator paramAnimator) {
    (k()).b = paramAnimator;
  }
  
  @Deprecated
  public final FragmentManager B() {
    return this.u;
  }
  
  public LayoutInflater B0(Bundle paramBundle) {
    return E(paramBundle);
  }
  
  public void B1(Bundle paramBundle) {
    if (this.u == null || !k0()) {
      this.i = paramBundle;
      return;
    } 
    throw new IllegalStateException("Fragment already added and state has been saved");
  }
  
  public final Object C() {
    h<?> h1 = this.v;
    if (h1 == null) {
      h1 = null;
    } else {
      h1 = (h<?>)h1.n();
    } 
    return h1;
  }
  
  public void C0(boolean paramBoolean) {}
  
  void C1(View paramView) {
    (k()).v = paramView;
  }
  
  public final LayoutInflater D() {
    LayoutInflater layoutInflater1 = this.R;
    LayoutInflater layoutInflater2 = layoutInflater1;
    if (layoutInflater1 == null)
      layoutInflater2 = e1(null); 
    return layoutInflater2;
  }
  
  @Deprecated
  public void D0(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle) {
    this.H = true;
  }
  
  void D1(boolean paramBoolean) {
    (k()).y = paramBoolean;
  }
  
  @Deprecated
  public LayoutInflater E(Bundle paramBundle) {
    h<?> h1 = this.v;
    if (h1 != null) {
      LayoutInflater layoutInflater = h1.o();
      b.h.k.g.b(layoutInflater, this.w.v0());
      return layoutInflater;
    } 
    throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
  }
  
  public void E0(Context paramContext, AttributeSet paramAttributeSet, Bundle paramBundle) {
    Activity activity;
    this.H = true;
    h<?> h1 = this.v;
    if (h1 == null) {
      h1 = null;
    } else {
      activity = h1.i();
    } 
    if (activity != null) {
      this.H = false;
      D0(activity, paramAttributeSet, paramBundle);
    } 
  }
  
  public void E1(SavedState paramSavedState) {
    if (this.u == null) {
      if (paramSavedState != null) {
        Bundle bundle = paramSavedState.b;
        if (bundle != null) {
          this.d = bundle;
          return;
        } 
      } 
      paramSavedState = null;
    } else {
      throw new IllegalStateException("Fragment already added");
    } 
    this.d = (Bundle)paramSavedState;
  }
  
  public void F0(boolean paramBoolean) {}
  
  public void F1(boolean paramBoolean) {
    if (this.G != paramBoolean) {
      this.G = paramBoolean;
      if (this.F && b0() && !d0())
        this.v.r(); 
    } 
  }
  
  int G() {
    e e1 = this.M;
    return (e1 == null) ? 0 : e1.h;
  }
  
  public boolean G0(MenuItem paramMenuItem) {
    return false;
  }
  
  void G1(int paramInt) {
    if (this.M == null && paramInt == 0)
      return; 
    k();
    this.M.h = paramInt;
  }
  
  public final Fragment H() {
    return this.x;
  }
  
  public void H0(Menu paramMenu) {}
  
  void H1(g paramg) {
    k();
    e e1 = this.M;
    g g1 = e1.x;
    if (paramg == g1)
      return; 
    if (paramg == null || g1 == null) {
      if (e1.w)
        e1.x = paramg; 
      if (paramg != null)
        paramg.a(); 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Trying to set a replacement startPostponedEnterTransition on ");
    stringBuilder.append(this);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public final FragmentManager I() {
    FragmentManager fragmentManager = this.u;
    if (fragmentManager != null)
      return fragmentManager; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" not associated with a fragment manager.");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public void I0() {
    this.H = true;
  }
  
  void I1(boolean paramBoolean) {
    if (this.M == null)
      return; 
    (k()).c = paramBoolean;
  }
  
  boolean J() {
    e e1 = this.M;
    return (e1 == null) ? false : e1.c;
  }
  
  public void J0(boolean paramBoolean) {}
  
  void J1(float paramFloat) {
    (k()).u = paramFloat;
  }
  
  int K() {
    e e1 = this.M;
    return (e1 == null) ? 0 : e1.f;
  }
  
  public void K0(Menu paramMenu) {}
  
  void K1(ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2) {
    k();
    e e1 = this.M;
    e1.i = paramArrayList1;
    e1.j = paramArrayList2;
  }
  
  int L() {
    e e1 = this.M;
    return (e1 == null) ? 0 : e1.g;
  }
  
  public void L0(boolean paramBoolean) {}
  
  @Deprecated
  public void L1(boolean paramBoolean) {
    boolean bool;
    if (!this.L && paramBoolean && this.c < 5 && this.u != null && b0() && this.S) {
      FragmentManager fragmentManager = this.u;
      fragmentManager.U0(fragmentManager.v(this));
    } 
    this.L = paramBoolean;
    if (this.c < 5 && !paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    this.K = bool;
    if (this.d != null)
      this.g = Boolean.valueOf(paramBoolean); 
  }
  
  float M() {
    e e1 = this.M;
    return (e1 == null) ? 1.0F : e1.u;
  }
  
  @Deprecated
  public void M0(int paramInt, String[] paramArrayOfString, int[] paramArrayOfint) {}
  
  public void M1(@SuppressLint({"UnknownNullness"}) Intent paramIntent) {
    N1(paramIntent, null);
  }
  
  public Object N() {
    e e1 = this.M;
    if (e1 == null)
      return null; 
    Object object2 = e1.n;
    Object object1 = object2;
    if (object2 == b)
      object1 = y(); 
    return object1;
  }
  
  public void N0() {
    this.H = true;
  }
  
  public void N1(@SuppressLint({"UnknownNullness"}) Intent paramIntent, Bundle paramBundle) {
    h<?> h1 = this.v;
    if (h1 != null) {
      h1.q(this, paramIntent, -1, paramBundle);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" not attached to Activity");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public final Resources O() {
    return t1().getResources();
  }
  
  public void O0(Bundle paramBundle) {}
  
  @Deprecated
  public void O1(@SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt, Bundle paramBundle) {
    if (this.v != null) {
      I().M0(this, paramIntent, paramInt, paramBundle);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" not attached to Activity");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public Object P() {
    e e1 = this.M;
    if (e1 == null)
      return null; 
    Object object2 = e1.l;
    Object object1 = object2;
    if (object2 == b)
      object1 = v(); 
    return object1;
  }
  
  public void P0() {
    this.H = true;
  }
  
  public void P1() {
    if (this.M != null && (k()).w)
      if (this.v == null) {
        (k()).w = false;
      } else if (Looper.myLooper() != this.v.l().getLooper()) {
        this.v.l().postAtFrontOfQueue(new b(this));
      } else {
        f(true);
      }  
  }
  
  public Object Q() {
    e e1 = this.M;
    return (e1 == null) ? null : e1.o;
  }
  
  public void Q0() {
    this.H = true;
  }
  
  public Object R() {
    e e1 = this.M;
    if (e1 == null)
      return null; 
    Object object2 = e1.p;
    Object object1 = object2;
    if (object2 == b)
      object1 = Q(); 
    return object1;
  }
  
  public void R0(View paramView, Bundle paramBundle) {}
  
  ArrayList<String> S() {
    e e1 = this.M;
    if (e1 != null) {
      ArrayList<String> arrayList = e1.i;
      if (arrayList != null)
        return arrayList; 
    } 
    return new ArrayList<String>();
  }
  
  public void S0(Bundle paramBundle) {
    this.H = true;
  }
  
  ArrayList<String> T() {
    e e1 = this.M;
    if (e1 != null) {
      ArrayList<String> arrayList = e1.j;
      if (arrayList != null)
        return arrayList; 
    } 
    return new ArrayList<String>();
  }
  
  void T0(Bundle paramBundle) {
    this.w.S0();
    this.c = 3;
    this.H = false;
    m0(paramBundle);
    if (this.H) {
      w1();
      this.w.y();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not call through to super.onActivityCreated()");
    throw new SuperNotCalledException(stringBuilder.toString());
  }
  
  public final String U(int paramInt) {
    return O().getString(paramInt);
  }
  
  void U0() {
    Iterator<f> iterator = this.b0.iterator();
    while (iterator.hasNext())
      ((f)iterator.next()).a(); 
    this.b0.clear();
    this.w.j(this.v, g(), this);
    this.c = 0;
    this.H = false;
    p0(this.v.k());
    if (this.H) {
      this.u.I(this);
      this.w.z();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not call through to super.onAttach()");
    SuperNotCalledException superNotCalledException = new SuperNotCalledException(stringBuilder.toString());
    throw superNotCalledException;
  }
  
  @Deprecated
  public final Fragment V() {
    Fragment fragment = this.j;
    if (fragment != null)
      return fragment; 
    FragmentManager fragmentManager = this.u;
    if (fragmentManager != null) {
      String str = this.k;
      if (str != null)
        return fragmentManager.g0(str); 
    } 
    return null;
  }
  
  void V0(Configuration paramConfiguration) {
    onConfigurationChanged(paramConfiguration);
    this.w.A(paramConfiguration);
  }
  
  public View W() {
    return this.J;
  }
  
  boolean W0(MenuItem paramMenuItem) {
    return !this.B ? (r0(paramMenuItem) ? true : this.w.B(paramMenuItem)) : false;
  }
  
  public LiveData<h> X() {
    return (LiveData<h>)this.W;
  }
  
  void X0(Bundle paramBundle) {
    this.w.S0();
    this.c = 1;
    this.H = false;
    if (Build.VERSION.SDK_INT >= 19)
      this.U.a((androidx.lifecycle.g)new androidx.lifecycle.f(this) {
            public void c(h param1h, Lifecycle.Event param1Event) {
              if (param1Event == Lifecycle.Event.ON_STOP) {
                View view = this.b.J;
                if (view != null)
                  view.cancelPendingInputEvents(); 
              } 
            }
          }); 
    this.Y.c(paramBundle);
    s0(paramBundle);
    this.S = true;
    if (this.H) {
      this.U.h(Lifecycle.Event.ON_CREATE);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not call through to super.onCreate()");
    throw new SuperNotCalledException(stringBuilder.toString());
  }
  
  void Z() {
    Y();
    this.h = UUID.randomUUID().toString();
    this.n = false;
    this.o = false;
    this.p = false;
    this.q = false;
    this.r = false;
    this.t = 0;
    this.u = null;
    this.w = new k();
    this.v = null;
    this.y = 0;
    this.z = 0;
    this.A = null;
    this.B = false;
    this.C = false;
  }
  
  boolean Z0(Menu paramMenu, MenuInflater paramMenuInflater) {
    boolean bool1 = this.B;
    boolean bool2 = false;
    boolean bool3 = false;
    if (!bool1) {
      boolean bool = bool3;
      if (this.F) {
        bool = bool3;
        if (this.G) {
          bool = true;
          v0(paramMenu, paramMenuInflater);
        } 
      } 
      bool2 = bool | this.w.D(paramMenu, paramMenuInflater);
    } 
    return bool2;
  }
  
  public Lifecycle a() {
    return (Lifecycle)this.U;
  }
  
  void a1(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    this.w.S0();
    this.s = true;
    this.V = new w(this, h());
    View view = w0(paramLayoutInflater, paramViewGroup, paramBundle);
    this.J = view;
    if (view != null) {
      this.V.d();
      v.a(this.J, (h)this.V);
      w.a(this.J, this.V);
      androidx.savedstate.d.a(this.J, this.V);
      this.W.n(this.V);
    } else {
      if (!this.V.e()) {
        this.V = null;
        return;
      } 
      throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    } 
  }
  
  public final boolean b0() {
    boolean bool;
    if (this.v != null && this.n) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  void b1() {
    this.w.E();
    this.U.h(Lifecycle.Event.ON_DESTROY);
    this.c = 0;
    this.H = false;
    this.S = false;
    x0();
    if (this.H)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not call through to super.onDestroy()");
    throw new SuperNotCalledException(stringBuilder.toString());
  }
  
  public final boolean c0() {
    return this.C;
  }
  
  void c1() {
    this.w.F();
    if (this.J != null && this.V.a().b().isAtLeast(Lifecycle.State.d))
      this.V.b(Lifecycle.Event.ON_DESTROY); 
    this.c = 1;
    this.H = false;
    z0();
    if (this.H) {
      b.o.a.a.b(this).d();
      this.s = false;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not call through to super.onDestroyView()");
    throw new SuperNotCalledException(stringBuilder.toString());
  }
  
  public final boolean d0() {
    return this.B;
  }
  
  void d1() {
    this.c = -1;
    this.H = false;
    A0();
    this.R = null;
    if (this.H) {
      if (!this.w.F0()) {
        this.w.E();
        this.w = new k();
      } 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not call through to super.onDetach()");
    throw new SuperNotCalledException(stringBuilder.toString());
  }
  
  boolean e0() {
    e e1 = this.M;
    return (e1 == null) ? false : e1.y;
  }
  
  LayoutInflater e1(Bundle paramBundle) {
    LayoutInflater layoutInflater = B0(paramBundle);
    this.R = layoutInflater;
    return layoutInflater;
  }
  
  public final boolean equals(Object paramObject) {
    return super.equals(paramObject);
  }
  
  void f(boolean paramBoolean) {
    e e1 = this.M;
    g g = null;
    if (e1 != null) {
      e1.w = false;
      g = e1.x;
      e1.x = null;
    } 
    if (g != null) {
      g.b();
    } else if (FragmentManager.b && this.J != null) {
      ViewGroup viewGroup = this.I;
      if (viewGroup != null) {
        FragmentManager fragmentManager = this.u;
        if (fragmentManager != null) {
          SpecialEffectsController specialEffectsController = SpecialEffectsController.n(viewGroup, fragmentManager);
          specialEffectsController.p();
          if (paramBoolean) {
            this.v.l().post(new c(this, specialEffectsController));
          } else {
            specialEffectsController.g();
          } 
        } 
      } 
    } 
  }
  
  final boolean f0() {
    boolean bool;
    if (this.t > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  void f1() {
    onLowMemory();
    this.w.G();
  }
  
  e g() {
    return new d(this);
  }
  
  public final boolean g0() {
    if (this.G) {
      FragmentManager fragmentManager = this.u;
      if (fragmentManager == null || fragmentManager.I0(this.x))
        return true; 
    } 
    return false;
  }
  
  void g1(boolean paramBoolean) {
    F0(paramBoolean);
    this.w.H(paramBoolean);
  }
  
  public t h() {
    if (this.u != null) {
      if (F() != Lifecycle.State.c.ordinal())
        return this.u.B0(this); 
      throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    } 
    throw new IllegalStateException("Can't access ViewModels from detached fragment");
  }
  
  boolean h0() {
    e e1 = this.M;
    return (e1 == null) ? false : e1.w;
  }
  
  boolean h1(MenuItem paramMenuItem) {
    return !this.B ? ((this.F && this.G && G0(paramMenuItem)) ? true : this.w.J(paramMenuItem)) : false;
  }
  
  public final int hashCode() {
    return super.hashCode();
  }
  
  public void i(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mFragmentId=#");
    paramPrintWriter.print(Integer.toHexString(this.y));
    paramPrintWriter.print(" mContainerId=#");
    paramPrintWriter.print(Integer.toHexString(this.z));
    paramPrintWriter.print(" mTag=");
    paramPrintWriter.println(this.A);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mState=");
    paramPrintWriter.print(this.c);
    paramPrintWriter.print(" mWho=");
    paramPrintWriter.print(this.h);
    paramPrintWriter.print(" mBackStackNesting=");
    paramPrintWriter.println(this.t);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mAdded=");
    paramPrintWriter.print(this.n);
    paramPrintWriter.print(" mRemoving=");
    paramPrintWriter.print(this.o);
    paramPrintWriter.print(" mFromLayout=");
    paramPrintWriter.print(this.p);
    paramPrintWriter.print(" mInLayout=");
    paramPrintWriter.println(this.q);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mHidden=");
    paramPrintWriter.print(this.B);
    paramPrintWriter.print(" mDetached=");
    paramPrintWriter.print(this.C);
    paramPrintWriter.print(" mMenuVisible=");
    paramPrintWriter.print(this.G);
    paramPrintWriter.print(" mHasMenu=");
    paramPrintWriter.println(this.F);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mRetainInstance=");
    paramPrintWriter.print(this.D);
    paramPrintWriter.print(" mUserVisibleHint=");
    paramPrintWriter.println(this.L);
    if (this.u != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mFragmentManager=");
      paramPrintWriter.println(this.u);
    } 
    if (this.v != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mHost=");
      paramPrintWriter.println(this.v);
    } 
    if (this.x != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mParentFragment=");
      paramPrintWriter.println(this.x);
    } 
    if (this.i != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mArguments=");
      paramPrintWriter.println(this.i);
    } 
    if (this.d != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedFragmentState=");
      paramPrintWriter.println(this.d);
    } 
    if (this.e != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedViewState=");
      paramPrintWriter.println(this.e);
    } 
    if (this.f != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedViewRegistryState=");
      paramPrintWriter.println(this.f);
    } 
    Fragment fragment = V();
    if (fragment != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTarget=");
      paramPrintWriter.print(fragment);
      paramPrintWriter.print(" mTargetRequestCode=");
      paramPrintWriter.println(this.l);
    } 
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mPopDirection=");
    paramPrintWriter.println(J());
    if (u() != 0) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("getEnterAnim=");
      paramPrintWriter.println(u());
    } 
    if (x() != 0) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("getExitAnim=");
      paramPrintWriter.println(x());
    } 
    if (K() != 0) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("getPopEnterAnim=");
      paramPrintWriter.println(K());
    } 
    if (L() != 0) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("getPopExitAnim=");
      paramPrintWriter.println(L());
    } 
    if (this.I != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mContainer=");
      paramPrintWriter.println(this.I);
    } 
    if (this.J != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mView=");
      paramPrintWriter.println(this.J);
    } 
    if (p() != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAnimatingAway=");
      paramPrintWriter.println(p());
    } 
    if (t() != null)
      b.o.a.a.b(this).a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString); 
    paramPrintWriter.print(paramString);
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("Child ");
    stringBuilder1.append(this.w);
    stringBuilder1.append(":");
    paramPrintWriter.println(stringBuilder1.toString());
    FragmentManager fragmentManager = this.w;
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(paramString);
    stringBuilder2.append("  ");
    fragmentManager.W(stringBuilder2.toString(), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public final boolean i0() {
    return this.o;
  }
  
  void i1(Menu paramMenu) {
    if (!this.B) {
      if (this.F && this.G)
        H0(paramMenu); 
      this.w.K(paramMenu);
    } 
  }
  
  public final SavedStateRegistry j() {
    return this.Y.b();
  }
  
  final boolean j0() {
    boolean bool;
    Fragment fragment = H();
    if (fragment != null && (fragment.i0() || fragment.j0())) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  void j1() {
    this.w.M();
    if (this.J != null)
      this.V.b(Lifecycle.Event.ON_PAUSE); 
    this.U.h(Lifecycle.Event.ON_PAUSE);
    this.c = 6;
    this.H = false;
    I0();
    if (this.H)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not call through to super.onPause()");
    throw new SuperNotCalledException(stringBuilder.toString());
  }
  
  public final boolean k0() {
    FragmentManager fragmentManager = this.u;
    return (fragmentManager == null) ? false : fragmentManager.L0();
  }
  
  void k1(boolean paramBoolean) {
    J0(paramBoolean);
    this.w.N(paramBoolean);
  }
  
  Fragment l(String paramString) {
    return paramString.equals(this.h) ? this : this.w.j0(paramString);
  }
  
  void l0() {
    this.w.S0();
  }
  
  boolean l1(Menu paramMenu) {
    boolean bool1 = this.B;
    boolean bool2 = false;
    boolean bool3 = false;
    if (!bool1) {
      boolean bool = bool3;
      if (this.F) {
        bool = bool3;
        if (this.G) {
          bool = true;
          K0(paramMenu);
        } 
      } 
      bool2 = bool | this.w.O(paramMenu);
    } 
    return bool2;
  }
  
  public final FragmentActivity m() {
    FragmentActivity fragmentActivity;
    h<?> h1 = this.v;
    if (h1 == null) {
      h1 = null;
    } else {
      fragmentActivity = (FragmentActivity)h1.i();
    } 
    return fragmentActivity;
  }
  
  @Deprecated
  public void m0(Bundle paramBundle) {
    this.H = true;
  }
  
  void m1() {
    boolean bool = this.u.J0(this);
    Boolean bool1 = this.m;
    if (bool1 == null || bool1.booleanValue() != bool) {
      this.m = Boolean.valueOf(bool);
      L0(bool);
      this.w.P();
    } 
  }
  
  public boolean n() {
    e e1 = this.M;
    if (e1 != null) {
      Boolean bool = e1.r;
      return (bool == null) ? true : bool.booleanValue();
    } 
    return true;
  }
  
  @Deprecated
  public void n0(int paramInt1, int paramInt2, Intent paramIntent) {
    if (FragmentManager.G0(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Fragment ");
      stringBuilder.append(this);
      stringBuilder.append(" received the following in onActivityResult(): requestCode: ");
      stringBuilder.append(paramInt1);
      stringBuilder.append(" resultCode: ");
      stringBuilder.append(paramInt2);
      stringBuilder.append(" data: ");
      stringBuilder.append(paramIntent);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
  
  void n1() {
    this.w.S0();
    this.w.a0(true);
    this.c = 7;
    this.H = false;
    N0();
    if (this.H) {
      i i1 = this.U;
      Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
      i1.h(event);
      if (this.J != null)
        this.V.b(event); 
      this.w.Q();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not call through to super.onResume()");
    throw new SuperNotCalledException(stringBuilder.toString());
  }
  
  public boolean o() {
    e e1 = this.M;
    if (e1 != null) {
      Boolean bool = e1.q;
      return (bool == null) ? true : bool.booleanValue();
    } 
    return true;
  }
  
  @Deprecated
  public void o0(Activity paramActivity) {
    this.H = true;
  }
  
  void o1(Bundle paramBundle) {
    O0(paramBundle);
    this.Y.d(paramBundle);
    Parcelable parcelable = this.w.h1();
    if (parcelable != null)
      paramBundle.putParcelable("android:support:fragments", parcelable); 
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    this.H = true;
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo) {
    s1().onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }
  
  public void onLowMemory() {
    this.H = true;
  }
  
  View p() {
    e e1 = this.M;
    return (e1 == null) ? null : e1.a;
  }
  
  public void p0(Context paramContext) {
    Activity activity;
    this.H = true;
    h<?> h1 = this.v;
    if (h1 == null) {
      h1 = null;
    } else {
      activity = h1.i();
    } 
    if (activity != null) {
      this.H = false;
      o0(activity);
    } 
  }
  
  void p1() {
    this.w.S0();
    this.w.a0(true);
    this.c = 5;
    this.H = false;
    P0();
    if (this.H) {
      i i1 = this.U;
      Lifecycle.Event event = Lifecycle.Event.ON_START;
      i1.h(event);
      if (this.J != null)
        this.V.b(event); 
      this.w.R();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not call through to super.onStart()");
    throw new SuperNotCalledException(stringBuilder.toString());
  }
  
  Animator q() {
    e e1 = this.M;
    return (e1 == null) ? null : e1.b;
  }
  
  @Deprecated
  public void q0(Fragment paramFragment) {}
  
  void q1() {
    this.w.T();
    if (this.J != null)
      this.V.b(Lifecycle.Event.ON_STOP); 
    this.U.h(Lifecycle.Event.ON_STOP);
    this.c = 4;
    this.H = false;
    Q0();
    if (this.H)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not call through to super.onStop()");
    throw new SuperNotCalledException(stringBuilder.toString());
  }
  
  public final Bundle r() {
    return this.i;
  }
  
  public boolean r0(MenuItem paramMenuItem) {
    return false;
  }
  
  void r1() {
    R0(this.J, this.d);
    this.w.U();
  }
  
  public final FragmentManager s() {
    if (this.v != null)
      return this.w; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" has not been attached yet.");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public void s0(Bundle paramBundle) {
    this.H = true;
    v1(paramBundle);
    if (!this.w.K0(1))
      this.w.C(); 
  }
  
  public final FragmentActivity s1() {
    FragmentActivity fragmentActivity = m();
    if (fragmentActivity != null)
      return fragmentActivity; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" not attached to an activity.");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  @Deprecated
  public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt) {
    O1(paramIntent, paramInt, null);
  }
  
  public Context t() {
    Context context;
    h<?> h1 = this.v;
    if (h1 == null) {
      h1 = null;
    } else {
      context = h1.k();
    } 
    return context;
  }
  
  public Animation t0(int paramInt1, boolean paramBoolean, int paramInt2) {
    return null;
  }
  
  public final Context t1() {
    Context context = t();
    if (context != null)
      return context; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" not attached to a context.");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append(getClass().getSimpleName());
    stringBuilder.append("{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append("}");
    stringBuilder.append(" (");
    stringBuilder.append(this.h);
    if (this.y != 0) {
      stringBuilder.append(" id=0x");
      stringBuilder.append(Integer.toHexString(this.y));
    } 
    if (this.A != null) {
      stringBuilder.append(" tag=");
      stringBuilder.append(this.A);
    } 
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  int u() {
    e e1 = this.M;
    return (e1 == null) ? 0 : e1.d;
  }
  
  public Animator u0(int paramInt1, boolean paramBoolean, int paramInt2) {
    return null;
  }
  
  public final View u1() {
    View view = W();
    if (view != null)
      return view; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not return a View from onCreateView() or this was called before onCreateView().");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public Object v() {
    e e1 = this.M;
    return (e1 == null) ? null : e1.k;
  }
  
  public void v0(Menu paramMenu, MenuInflater paramMenuInflater) {}
  
  void v1(Bundle paramBundle) {
    if (paramBundle != null) {
      Parcelable parcelable = paramBundle.getParcelable("android:support:fragments");
      if (parcelable != null) {
        this.w.f1(parcelable);
        this.w.C();
      } 
    } 
  }
  
  o w() {
    e e1 = this.M;
    return (e1 == null) ? null : e1.s;
  }
  
  public View w0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    int j = this.Z;
    return (j != 0) ? paramLayoutInflater.inflate(j, paramViewGroup, false) : null;
  }
  
  int x() {
    e e1 = this.M;
    return (e1 == null) ? 0 : e1.e;
  }
  
  public void x0() {
    this.H = true;
  }
  
  final void x1(Bundle paramBundle) {
    SparseArray<Parcelable> sparseArray = this.e;
    if (sparseArray != null) {
      this.J.restoreHierarchyState(sparseArray);
      this.e = null;
    } 
    if (this.J != null) {
      this.V.f(this.f);
      this.f = null;
    } 
    this.H = false;
    S0(paramBundle);
    if (this.H) {
      if (this.J != null)
        this.V.b(Lifecycle.Event.ON_CREATE); 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" did not call through to super.onViewStateRestored()");
    throw new SuperNotCalledException(stringBuilder.toString());
  }
  
  public Object y() {
    e e1 = this.M;
    return (e1 == null) ? null : e1.m;
  }
  
  public void y0() {}
  
  void y1(View paramView) {
    (k()).a = paramView;
  }
  
  o z() {
    e e1 = this.M;
    return (e1 == null) ? null : e1.t;
  }
  
  public void z0() {
    this.H = true;
  }
  
  void z1(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.M == null && paramInt1 == 0 && paramInt2 == 0 && paramInt3 == 0 && paramInt4 == 0)
      return; 
    (k()).d = paramInt1;
    (k()).e = paramInt2;
    (k()).f = paramInt3;
    (k()).g = paramInt4;
  }
  
  public static class InstantiationException extends RuntimeException {
    public InstantiationException(String param1String, Exception param1Exception) {
      super(param1String, param1Exception);
    }
  }
  
  @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
  public static class SavedState implements Parcelable {
    public static final Parcelable.Creator<SavedState> CREATOR = (Parcelable.Creator<SavedState>)new a();
    
    final Bundle b;
    
    SavedState(Bundle param1Bundle) {
      this.b = param1Bundle;
    }
    
    SavedState(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      Bundle bundle = param1Parcel.readBundle();
      this.b = bundle;
      if (param1ClassLoader != null && bundle != null)
        bundle.setClassLoader(param1ClassLoader); 
    }
    
    public int describeContents() {
      return 0;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeBundle(this.b);
    }
    
    class a implements Parcelable.ClassLoaderCreator<SavedState> {
      public Fragment.SavedState a(Parcel param2Parcel) {
        return new Fragment.SavedState(param2Parcel, null);
      }
      
      public Fragment.SavedState b(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new Fragment.SavedState(param2Parcel, param2ClassLoader);
      }
      
      public Fragment.SavedState[] c(int param2Int) {
        return new Fragment.SavedState[param2Int];
      }
    }
  }
  
  class a implements Parcelable.ClassLoaderCreator<SavedState> {
    public Fragment.SavedState a(Parcel param1Parcel) {
      return new Fragment.SavedState(param1Parcel, null);
    }
    
    public Fragment.SavedState b(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new Fragment.SavedState(param1Parcel, param1ClassLoader);
    }
    
    public Fragment.SavedState[] c(int param1Int) {
      return new Fragment.SavedState[param1Int];
    }
  }
  
  class a implements Runnable {
    a(Fragment this$0) {}
    
    public void run() {
      this.b.P1();
    }
  }
  
  class b implements Runnable {
    b(Fragment this$0) {}
    
    public void run() {
      this.b.f(false);
    }
  }
  
  class c implements Runnable {
    c(Fragment this$0, SpecialEffectsController param1SpecialEffectsController) {}
    
    public void run() {
      this.b.g();
    }
  }
  
  class d extends e {
    d(Fragment this$0) {}
    
    public View e(int param1Int) {
      View view = this.a.J;
      if (view != null)
        return view.findViewById(param1Int); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Fragment ");
      stringBuilder.append(this.a);
      stringBuilder.append(" does not have a view");
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    public boolean g() {
      boolean bool;
      if (this.a.J != null) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
  }
  
  static class e {
    View a;
    
    Animator b;
    
    boolean c;
    
    int d;
    
    int e;
    
    int f;
    
    int g;
    
    int h;
    
    ArrayList<String> i;
    
    ArrayList<String> j;
    
    Object k = null;
    
    Object l;
    
    Object m;
    
    Object n;
    
    Object o;
    
    Object p;
    
    Boolean q;
    
    Boolean r;
    
    o s;
    
    o t;
    
    float u;
    
    View v;
    
    boolean w;
    
    Fragment.g x;
    
    boolean y;
    
    e() {
      Object object = Fragment.b;
      this.l = object;
      this.m = null;
      this.n = object;
      this.o = null;
      this.p = object;
      this.u = 1.0F;
      this.v = null;
    }
  }
  
  private static abstract class f {
    abstract void a();
  }
  
  static interface g {
    void a();
    
    void b();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/Fragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */