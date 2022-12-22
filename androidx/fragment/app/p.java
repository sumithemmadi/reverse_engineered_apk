package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.Lifecycle;
import b.h.k.w;

class p {
  private final j a;
  
  private final r b;
  
  private final Fragment c;
  
  private boolean d = false;
  
  private int e = -1;
  
  p(j paramj, r paramr, Fragment paramFragment) {
    this.a = paramj;
    this.b = paramr;
    this.c = paramFragment;
  }
  
  p(j paramj, r paramr, Fragment paramFragment, FragmentState paramFragmentState) {
    this.a = paramj;
    this.b = paramr;
    this.c = paramFragment;
    paramFragment.e = null;
    paramFragment.f = null;
    paramFragment.t = 0;
    paramFragment.q = false;
    paramFragment.n = false;
    Fragment fragment = paramFragment.j;
    if (fragment != null) {
      String str = fragment.h;
    } else {
      fragment = null;
    } 
    paramFragment.k = (String)fragment;
    paramFragment.j = null;
    Bundle bundle = paramFragmentState.n;
    if (bundle != null) {
      paramFragment.d = bundle;
    } else {
      paramFragment.d = new Bundle();
    } 
  }
  
  p(j paramj, r paramr, ClassLoader paramClassLoader, g paramg, FragmentState paramFragmentState) {
    this.a = paramj;
    this.b = paramr;
    Fragment fragment = paramg.a(paramClassLoader, paramFragmentState.b);
    this.c = fragment;
    Bundle bundle = paramFragmentState.k;
    if (bundle != null)
      bundle.setClassLoader(paramClassLoader); 
    fragment.B1(paramFragmentState.k);
    fragment.h = paramFragmentState.c;
    fragment.p = paramFragmentState.d;
    fragment.r = true;
    fragment.y = paramFragmentState.e;
    fragment.z = paramFragmentState.f;
    fragment.A = paramFragmentState.g;
    fragment.D = paramFragmentState.h;
    fragment.o = paramFragmentState.i;
    fragment.C = paramFragmentState.j;
    fragment.B = paramFragmentState.l;
    fragment.T = Lifecycle.State.values()[paramFragmentState.m];
    bundle = paramFragmentState.n;
    if (bundle != null) {
      fragment.d = bundle;
    } else {
      fragment.d = new Bundle();
    } 
    if (FragmentManager.G0(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Instantiated fragment ");
      stringBuilder.append(fragment);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
  
  private boolean l(View paramView) {
    if (paramView == this.c.J)
      return true; 
    for (ViewParent viewParent = paramView.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
      if (viewParent == this.c.J)
        return true; 
    } 
    return false;
  }
  
  private Bundle q() {
    Bundle bundle1 = new Bundle();
    this.c.o1(bundle1);
    this.a.j(this.c, bundle1, false);
    Bundle bundle2 = bundle1;
    if (bundle1.isEmpty())
      bundle2 = null; 
    if (this.c.J != null)
      t(); 
    bundle1 = bundle2;
    if (this.c.e != null) {
      bundle1 = bundle2;
      if (bundle2 == null)
        bundle1 = new Bundle(); 
      bundle1.putSparseParcelableArray("android:view_state", this.c.e);
    } 
    bundle2 = bundle1;
    if (this.c.f != null) {
      bundle2 = bundle1;
      if (bundle1 == null)
        bundle2 = new Bundle(); 
      bundle2.putBundle("android:view_registry_state", this.c.f);
    } 
    bundle1 = bundle2;
    if (!this.c.L) {
      bundle1 = bundle2;
      if (bundle2 == null)
        bundle1 = new Bundle(); 
      bundle1.putBoolean("android:user_visible_hint", this.c.L);
    } 
    return bundle1;
  }
  
  void a() {
    if (FragmentManager.G0(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("moveto ACTIVITY_CREATED: ");
      stringBuilder.append(this.c);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    Fragment fragment1 = this.c;
    fragment1.T0(fragment1.d);
    j j1 = this.a;
    Fragment fragment2 = this.c;
    j1.a(fragment2, fragment2.d, false);
  }
  
  void b() {
    int i = this.b.j(this.c);
    Fragment fragment = this.c;
    fragment.I.addView(fragment.J, i);
  }
  
  void c() {
    StringBuilder stringBuilder;
    if (FragmentManager.G0(3)) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("moveto ATTACHED: ");
      stringBuilder.append(this.c);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    Fragment fragment2 = this.c;
    Fragment fragment3 = fragment2.j;
    p p1 = null;
    if (fragment3 != null) {
      p1 = this.b.m(fragment3.h);
      if (p1 != null) {
        fragment2 = this.c;
        fragment2.k = fragment2.j.h;
        fragment2.j = null;
      } else {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this.c);
        stringBuilder.append(" declared target fragment ");
        stringBuilder.append(this.c.j);
        stringBuilder.append(" that does not belong to this FragmentManager!");
        throw new IllegalStateException(stringBuilder.toString());
      } 
    } else {
      String str = fragment2.k;
      if (str != null) {
        p1 = this.b.m(str);
        if (p1 == null) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Fragment ");
          stringBuilder.append(this.c);
          stringBuilder.append(" declared target fragment ");
          stringBuilder.append(this.c.k);
          stringBuilder.append(" that does not belong to this FragmentManager!");
          throw new IllegalStateException(stringBuilder.toString());
        } 
      } 
    } 
    if (stringBuilder != null && (FragmentManager.b || (stringBuilder.k()).c < 1))
      stringBuilder.m(); 
    Fragment fragment1 = this.c;
    fragment1.v = fragment1.u.u0();
    fragment1 = this.c;
    fragment1.x = fragment1.u.x0();
    this.a.g(this.c, false);
    this.c.U0();
    this.a.b(this.c, false);
  }
  
  int d() {
    SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact;
    Fragment fragment2 = this.c;
    if (fragment2.u == null)
      return fragment2.c; 
    int i = this.e;
    int k = b.a[fragment2.T.ordinal()];
    int m = i;
    if (k != 1)
      if (k != 2) {
        if (k != 3) {
          if (k != 4) {
            m = Math.min(i, -1);
          } else {
            m = Math.min(i, 0);
          } 
        } else {
          m = Math.min(i, 1);
        } 
      } else {
        m = Math.min(i, 5);
      }  
    fragment2 = this.c;
    i = m;
    if (fragment2.p) {
      View view;
      if (fragment2.q) {
        m = Math.max(this.e, 2);
        view = this.c.J;
        i = m;
        if (view != null) {
          i = m;
          if (view.getParent() == null)
            i = Math.min(m, 2); 
        } 
      } else if (this.e < 4) {
        i = Math.min(m, ((Fragment)view).c);
      } else {
        i = Math.min(m, 1);
      } 
    } 
    k = i;
    if (!this.c.n)
      k = Math.min(i, 1); 
    Fragment fragment3 = null;
    fragment2 = fragment3;
    if (FragmentManager.b) {
      Fragment fragment = this.c;
      ViewGroup viewGroup = fragment.I;
      fragment2 = fragment3;
      if (viewGroup != null)
        lifecycleImpact = SpecialEffectsController.n(viewGroup, fragment.I()).l(this); 
    } 
    if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.c) {
      m = Math.min(k, 6);
    } else if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.d) {
      m = Math.max(k, 3);
    } else {
      Fragment fragment = this.c;
      m = k;
      if (fragment.o)
        if (fragment.f0()) {
          m = Math.min(k, 1);
        } else {
          m = Math.min(k, -1);
        }  
    } 
    Fragment fragment1 = this.c;
    i = m;
    if (fragment1.K) {
      i = m;
      if (fragment1.c < 5)
        i = Math.min(m, 4); 
    } 
    if (FragmentManager.G0(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("computeExpectedState() of ");
      stringBuilder.append(i);
      stringBuilder.append(" for ");
      stringBuilder.append(this.c);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    return i;
  }
  
  void e() {
    j j1;
    if (FragmentManager.G0(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("moveto CREATED: ");
      stringBuilder.append(this.c);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    Fragment fragment = this.c;
    if (!fragment.S) {
      this.a.h(fragment, fragment.d, false);
      fragment = this.c;
      fragment.X0(fragment.d);
      j1 = this.a;
      Fragment fragment1 = this.c;
      j1.c(fragment1, fragment1.d, false);
    } else {
      j1.v1(((Fragment)j1).d);
      this.c.c = 1;
    } 
  }
  
  void f() {
    StringBuilder stringBuilder;
    if (this.c.p)
      return; 
    if (FragmentManager.G0(3)) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("moveto CREATE_VIEW: ");
      stringBuilder.append(this.c);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    Fragment fragment1 = this.c;
    LayoutInflater layoutInflater = fragment1.e1(fragment1.d);
    ViewGroup viewGroup2 = null;
    Fragment fragment3 = this.c;
    ViewGroup viewGroup1 = fragment3.I;
    if (viewGroup1 == null) {
      int i = fragment3.z;
      viewGroup1 = viewGroup2;
      if (i != 0)
        if (i != -1) {
          viewGroup2 = (ViewGroup)fragment3.u.o0().e(this.c.z);
          viewGroup1 = viewGroup2;
          if (viewGroup2 == null) {
            ViewGroup viewGroup;
            Fragment fragment = this.c;
            if (fragment.r) {
              viewGroup = viewGroup2;
            } else {
              String str;
              try {
                str = viewGroup.O().getResourceName(this.c.z);
              } catch (android.content.res.Resources.NotFoundException notFoundException) {
                str = "unknown";
              } 
              StringBuilder stringBuilder1 = new StringBuilder();
              stringBuilder1.append("No view found for id 0x");
              stringBuilder1.append(Integer.toHexString(this.c.z));
              stringBuilder1.append(" (");
              stringBuilder1.append(str);
              stringBuilder1.append(") for fragment ");
              stringBuilder1.append(this.c);
              throw new IllegalArgumentException(stringBuilder1.toString());
            } 
          } 
        } else {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Cannot create fragment ");
          stringBuilder.append(this.c);
          stringBuilder.append(" for a container view with no id");
          throw new IllegalArgumentException(stringBuilder.toString());
        }  
    } 
    Fragment fragment2 = this.c;
    fragment2.I = (ViewGroup)stringBuilder;
    fragment2.a1(layoutInflater, (ViewGroup)stringBuilder, fragment2.d);
    View view = this.c.J;
    if (view != null) {
      boolean bool = false;
      view.setSaveFromParentEnabled(false);
      Fragment fragment5 = this.c;
      fragment5.J.setTag(b.m.b.fragment_container_view_tag, fragment5);
      if (stringBuilder != null)
        b(); 
      Fragment fragment4 = this.c;
      if (fragment4.B)
        fragment4.J.setVisibility(8); 
      if (w.U(this.c.J)) {
        w.o0(this.c.J);
      } else {
        View view1 = this.c.J;
        view1.addOnAttachStateChangeListener(new a(this, view1));
      } 
      this.c.r1();
      j j1 = this.a;
      fragment4 = this.c;
      j1.m(fragment4, fragment4.J, fragment4.d, false);
      int i = this.c.J.getVisibility();
      float f = this.c.J.getAlpha();
      if (FragmentManager.b) {
        this.c.J1(f);
        fragment4 = this.c;
        if (fragment4.I != null && i == 0) {
          View view1 = fragment4.J.findFocus();
          if (view1 != null) {
            this.c.C1(view1);
            if (FragmentManager.G0(2)) {
              StringBuilder stringBuilder1 = new StringBuilder();
              stringBuilder1.append("requestFocus: Saved focused view ");
              stringBuilder1.append(view1);
              stringBuilder1.append(" for Fragment ");
              stringBuilder1.append(this.c);
              Log.v("FragmentManager", stringBuilder1.toString());
            } 
          } 
          this.c.J.setAlpha(0.0F);
        } 
      } else {
        fragment4 = this.c;
        boolean bool1 = bool;
        if (i == 0) {
          bool1 = bool;
          if (fragment4.I != null)
            bool1 = true; 
        } 
        fragment4.O = bool1;
      } 
    } 
    this.c.c = 2;
  }
  
  void g() {
    boolean bool3;
    boolean bool4;
    if (FragmentManager.G0(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("movefrom CREATED: ");
      stringBuilder.append(this.c);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    Fragment fragment = this.c;
    boolean bool1 = fragment.o;
    boolean bool2 = true;
    if (bool1 && !fragment.f0()) {
      bool3 = true;
    } else {
      bool3 = false;
    } 
    if (bool3 || this.b.o().o(this.c)) {
      bool4 = true;
    } else {
      bool4 = false;
    } 
    if (bool4) {
      int i;
      h<?> h = this.c.v;
      if (h instanceof androidx.lifecycle.u) {
        bool2 = this.b.o().l();
      } else if (h.k() instanceof Activity) {
        i = true ^ ((Activity)h.k()).isChangingConfigurations();
      } 
      if (bool3 || i != 0)
        this.b.o().f(this.c); 
      this.c.b1();
      this.a.d(this.c, false);
      for (p p1 : this.b.k()) {
        if (p1 != null) {
          Fragment fragment2 = p1.k();
          if (this.c.h.equals(fragment2.k)) {
            fragment2.j = this.c;
            fragment2.k = null;
          } 
        } 
      } 
      Fragment fragment1 = this.c;
      String str = fragment1.k;
      if (str != null)
        fragment1.j = this.b.f(str); 
      this.b.q(this);
    } else {
      String str = this.c.k;
      if (str != null) {
        Fragment fragment1 = this.b.f(str);
        if (fragment1 != null && fragment1.D)
          this.c.j = fragment1; 
      } 
      this.c.c = 0;
    } 
  }
  
  void h() {
    if (FragmentManager.G0(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("movefrom CREATE_VIEW: ");
      stringBuilder.append(this.c);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    Fragment fragment2 = this.c;
    ViewGroup viewGroup = fragment2.I;
    if (viewGroup != null) {
      View view = fragment2.J;
      if (view != null)
        viewGroup.removeView(view); 
    } 
    this.c.c1();
    this.a.n(this.c, false);
    Fragment fragment1 = this.c;
    fragment1.I = null;
    fragment1.J = null;
    fragment1.V = null;
    fragment1.W.n(null);
    this.c.q = false;
  }
  
  void i() {
    if (FragmentManager.G0(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("movefrom ATTACHED: ");
      stringBuilder.append(this.c);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    this.c.d1();
    j j1 = this.a;
    Fragment fragment2 = this.c;
    boolean bool1 = false;
    j1.e(fragment2, false);
    Fragment fragment1 = this.c;
    fragment1.c = -1;
    fragment1.v = null;
    fragment1.x = null;
    fragment1.u = null;
    boolean bool2 = bool1;
    if (fragment1.o) {
      bool2 = bool1;
      if (!fragment1.f0())
        bool2 = true; 
    } 
    if (bool2 || this.b.o().o(this.c)) {
      if (FragmentManager.G0(3)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("initState called for fragment: ");
        stringBuilder.append(this.c);
        Log.d("FragmentManager", stringBuilder.toString());
      } 
      this.c.Z();
    } 
  }
  
  void j() {
    Fragment fragment = this.c;
    if (fragment.p && fragment.q && !fragment.s) {
      if (FragmentManager.G0(3)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("moveto CREATE_VIEW: ");
        stringBuilder.append(this.c);
        Log.d("FragmentManager", stringBuilder.toString());
      } 
      fragment = this.c;
      fragment.a1(fragment.e1(fragment.d), null, this.c.d);
      View view = this.c.J;
      if (view != null) {
        view.setSaveFromParentEnabled(false);
        Fragment fragment1 = this.c;
        fragment1.J.setTag(b.m.b.fragment_container_view_tag, fragment1);
        fragment1 = this.c;
        if (fragment1.B)
          fragment1.J.setVisibility(8); 
        this.c.r1();
        j j1 = this.a;
        fragment1 = this.c;
        j1.m(fragment1, fragment1.J, fragment1.d, false);
        this.c.c = 2;
      } 
    } 
  }
  
  Fragment k() {
    return this.c;
  }
  
  void m() {
    if (this.d) {
      if (FragmentManager.G0(2)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ignoring re-entrant call to moveToExpectedState() for ");
        stringBuilder.append(k());
        Log.v("FragmentManager", stringBuilder.toString());
      } 
      return;
    } 
    try {
      this.d = true;
      while (true) {
        int i = d();
        Fragment fragment = this.c;
        int k = fragment.c;
        if (i != k) {
          if (i > k) {
            switch (k + 1) {
              default:
                continue;
              case 7:
                p();
                continue;
              case 6:
                fragment.c = 6;
                continue;
              case 5:
                v();
                continue;
              case 4:
                if (fragment.J != null) {
                  ViewGroup viewGroup = fragment.I;
                  if (viewGroup != null)
                    SpecialEffectsController.n(viewGroup, fragment.I()).b(SpecialEffectsController.Operation.State.from(this.c.J.getVisibility()), this); 
                } 
                this.c.c = 4;
                continue;
              case 3:
                a();
                continue;
              case 2:
                j();
                f();
                continue;
              case 1:
                e();
                continue;
              case 0:
                break;
            } 
            c();
            continue;
          } 
          switch (k - 1) {
            default:
              continue;
            case 6:
              n();
              continue;
            case 5:
              fragment.c = 5;
              continue;
            case 4:
              w();
              continue;
            case 3:
              if (FragmentManager.G0(3)) {
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("movefrom ACTIVITY_CREATED: ");
                stringBuilder.append(this.c);
                Log.d("FragmentManager", stringBuilder.toString());
              } 
              fragment = this.c;
              if (fragment.J != null && fragment.e == null)
                t(); 
              fragment = this.c;
              if (fragment.J != null) {
                ViewGroup viewGroup = fragment.I;
                if (viewGroup != null)
                  SpecialEffectsController.n(viewGroup, fragment.I()).d(this); 
              } 
              this.c.c = 3;
              continue;
            case 2:
              fragment.q = false;
              fragment.c = 2;
              continue;
            case 1:
              h();
              this.c.c = 1;
              continue;
            case 0:
              g();
              continue;
            case -1:
              break;
          } 
          i();
          continue;
        } 
        if (FragmentManager.b && fragment.P) {
          if (fragment.J != null) {
            ViewGroup viewGroup = fragment.I;
            if (viewGroup != null) {
              SpecialEffectsController specialEffectsController = SpecialEffectsController.n(viewGroup, fragment.I());
              if (this.c.B) {
                specialEffectsController.c(this);
              } else {
                specialEffectsController.e(this);
              } 
            } 
          } 
          fragment = this.c;
          FragmentManager fragmentManager = fragment.u;
          if (fragmentManager != null)
            fragmentManager.E0(fragment); 
          fragment = this.c;
          fragment.P = false;
          fragment.C0(fragment.B);
        } 
        return;
      } 
    } finally {
      this.d = false;
    } 
  }
  
  void n() {
    if (FragmentManager.G0(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("movefrom RESUMED: ");
      stringBuilder.append(this.c);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    this.c.j1();
    this.a.f(this.c, false);
  }
  
  void o(ClassLoader paramClassLoader) {
    Bundle bundle = this.c.d;
    if (bundle == null)
      return; 
    bundle.setClassLoader(paramClassLoader);
    Fragment fragment2 = this.c;
    fragment2.e = fragment2.d.getSparseParcelableArray("android:view_state");
    fragment2 = this.c;
    fragment2.f = fragment2.d.getBundle("android:view_registry_state");
    fragment2 = this.c;
    fragment2.k = fragment2.d.getString("android:target_state");
    fragment2 = this.c;
    if (fragment2.k != null)
      fragment2.l = fragment2.d.getInt("android:target_req_state", 0); 
    Fragment fragment3 = this.c;
    Boolean bool = fragment3.g;
    if (bool != null) {
      fragment3.L = bool.booleanValue();
      this.c.g = null;
    } else {
      fragment3.L = fragment3.d.getBoolean("android:user_visible_hint", true);
    } 
    Fragment fragment1 = this.c;
    if (!fragment1.L)
      fragment1.K = true; 
  }
  
  void p() {
    if (FragmentManager.G0(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("moveto RESUMED: ");
      stringBuilder.append(this.c);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    View view = this.c.A();
    if (view != null && l(view)) {
      boolean bool = view.requestFocus();
      if (FragmentManager.G0(2)) {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("requestFocus: Restoring focused view ");
        stringBuilder.append(view);
        stringBuilder.append(" ");
        if (bool) {
          str = "succeeded";
        } else {
          str = "failed";
        } 
        stringBuilder.append(str);
        stringBuilder.append(" on Fragment ");
        stringBuilder.append(this.c);
        stringBuilder.append(" resulting in focused view ");
        stringBuilder.append(this.c.J.findFocus());
        Log.v("FragmentManager", stringBuilder.toString());
      } 
    } 
    this.c.C1(null);
    this.c.n1();
    this.a.i(this.c, false);
    Fragment fragment = this.c;
    fragment.d = null;
    fragment.e = null;
    fragment.f = null;
  }
  
  Fragment.SavedState r() {
    int i = this.c.c;
    Fragment.SavedState savedState1 = null;
    Fragment.SavedState savedState2 = savedState1;
    if (i > -1) {
      Bundle bundle = q();
      savedState2 = savedState1;
      if (bundle != null)
        savedState2 = new Fragment.SavedState(bundle); 
    } 
    return savedState2;
  }
  
  FragmentState s() {
    Bundle bundle;
    FragmentState fragmentState = new FragmentState(this.c);
    Fragment fragment = this.c;
    if (fragment.c > -1 && fragmentState.n == null) {
      bundle = q();
      fragmentState.n = bundle;
      if (this.c.k != null) {
        if (bundle == null)
          fragmentState.n = new Bundle(); 
        fragmentState.n.putString("android:target_state", this.c.k);
        int i = this.c.l;
        if (i != 0)
          fragmentState.n.putInt("android:target_req_state", i); 
      } 
    } else {
      fragmentState.n = ((Fragment)bundle).d;
    } 
    return fragmentState;
  }
  
  void t() {
    if (this.c.J == null)
      return; 
    SparseArray<Parcelable> sparseArray = new SparseArray();
    this.c.J.saveHierarchyState(sparseArray);
    if (sparseArray.size() > 0)
      this.c.e = sparseArray; 
    Bundle bundle = new Bundle();
    this.c.V.g(bundle);
    if (!bundle.isEmpty())
      this.c.f = bundle; 
  }
  
  void u(int paramInt) {
    this.e = paramInt;
  }
  
  void v() {
    if (FragmentManager.G0(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("moveto STARTED: ");
      stringBuilder.append(this.c);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    this.c.p1();
    this.a.k(this.c, false);
  }
  
  void w() {
    if (FragmentManager.G0(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("movefrom STARTED: ");
      stringBuilder.append(this.c);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    this.c.q1();
    this.a.l(this.c, false);
  }
  
  class a implements View.OnAttachStateChangeListener {
    a(p this$0, View param1View) {}
    
    public void onViewAttachedToWindow(View param1View) {
      this.b.removeOnAttachStateChangeListener(this);
      w.o0(this.b);
    }
    
    public void onViewDetachedFromWindow(View param1View) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */