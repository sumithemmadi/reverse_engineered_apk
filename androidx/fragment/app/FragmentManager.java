package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class FragmentManager {
  private static boolean a = false;
  
  static boolean b = true;
  
  private y A = new f(this);
  
  private androidx.activity.result.b<Intent> B;
  
  private androidx.activity.result.b<IntentSenderRequest> C;
  
  private androidx.activity.result.b<String[]> D;
  
  ArrayDeque<LaunchedFragmentInfo> E = new ArrayDeque<LaunchedFragmentInfo>();
  
  private boolean F;
  
  private boolean G;
  
  private boolean H;
  
  private boolean I;
  
  private boolean J;
  
  private ArrayList<a> K;
  
  private ArrayList<Boolean> L;
  
  private ArrayList<Fragment> M;
  
  private ArrayList<p> N;
  
  private l O;
  
  private Runnable P = new g(this);
  
  private final ArrayList<n> c = new ArrayList<n>();
  
  private boolean d;
  
  private final r e = new r();
  
  ArrayList<a> f;
  
  private ArrayList<Fragment> g;
  
  private final i h = new i(this);
  
  private OnBackPressedDispatcher i;
  
  private final androidx.activity.b j = new c(this, false);
  
  private final AtomicInteger k = new AtomicInteger();
  
  private final Map<String, Bundle> l = Collections.synchronizedMap(new HashMap<String, Bundle>());
  
  private final Map<String, ?> m = Collections.synchronizedMap(new HashMap<String, Object>());
  
  private ArrayList<m> n;
  
  private Map<Fragment, HashSet<androidx.core.os.b>> o = Collections.synchronizedMap(new HashMap<Fragment, HashSet<androidx.core.os.b>>());
  
  private final t.g p = new d(this);
  
  private final j q = new j(this);
  
  private final CopyOnWriteArrayList<m> r = new CopyOnWriteArrayList<m>();
  
  int s = -1;
  
  private h<?> t;
  
  private e u;
  
  private Fragment v;
  
  Fragment w;
  
  private g x = null;
  
  private g y = new e(this);
  
  private y z = null;
  
  static Fragment A0(View paramView) {
    Object object = paramView.getTag(b.m.b.fragment_container_view_tag);
    return (object instanceof Fragment) ? (Fragment)object : null;
  }
  
  static boolean G0(int paramInt) {
    return (a || Log.isLoggable("FragmentManager", paramInt));
  }
  
  private boolean H0(Fragment paramFragment) {
    boolean bool;
    if ((paramFragment.F && paramFragment.G) || paramFragment.w.n()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void L(Fragment paramFragment) {
    if (paramFragment != null && paramFragment.equals(g0(paramFragment.h)))
      paramFragment.m1(); 
  }
  
  private void N0(b.e.b<Fragment> paramb) {
    int k = paramb.size();
    for (byte b1 = 0; b1 < k; b1++) {
      Fragment fragment = (Fragment)paramb.m(b1);
      if (!fragment.n) {
        View view = fragment.u1();
        fragment.Q = view.getAlpha();
        view.setAlpha(0.0F);
      } 
    } 
  }
  
  private void S(int paramInt) {
    try {
      this.d = true;
      this.e.d(paramInt);
      P0(paramInt, false);
      if (b) {
        Iterator<SpecialEffectsController> iterator = r().iterator();
        while (iterator.hasNext())
          ((SpecialEffectsController)iterator.next()).j(); 
      } 
      this.d = false;
      return;
    } finally {
      this.d = false;
    } 
  }
  
  private void V() {
    if (this.J) {
      this.J = false;
      p1();
    } 
  }
  
  private void X() {
    if (b) {
      Iterator<SpecialEffectsController> iterator = r().iterator();
      while (iterator.hasNext())
        ((SpecialEffectsController)iterator.next()).j(); 
    } else if (!this.o.isEmpty()) {
      for (Fragment fragment : this.o.keySet()) {
        m(fragment);
        Q0(fragment);
      } 
    } 
  }
  
  private boolean X0(String paramString, int paramInt1, int paramInt2) {
    a0(false);
    Z(true);
    Fragment fragment = this.w;
    if (fragment != null && paramInt1 < 0 && paramString == null && fragment.s().W0())
      return true; 
    boolean bool = Y0(this.K, this.L, paramString, paramInt1, paramInt2);
    if (bool) {
      this.d = true;
      try {
        d1(this.K, this.L);
      } finally {
        p();
      } 
    } 
    r1();
    V();
    this.e.b();
    return bool;
  }
  
  private void Z(boolean paramBoolean) {
    if (!this.d) {
      if (this.t == null) {
        if (this.I)
          throw new IllegalStateException("FragmentManager has been destroyed"); 
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
      } 
      if (Looper.myLooper() == this.t.l().getLooper()) {
        if (!paramBoolean)
          o(); 
        if (this.K == null) {
          this.K = new ArrayList<a>();
          this.L = new ArrayList<Boolean>();
        } 
        this.d = true;
        try {
          f0(null, null);
          return;
        } finally {
          this.d = false;
        } 
      } 
      throw new IllegalStateException("Must be called from main thread of fragment host");
    } 
    throw new IllegalStateException("FragmentManager is already executing transactions");
  }
  
  private int Z0(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2, b.e.b<Fragment> paramb) {
    int k = paramInt2 - 1;
    int m;
    for (m = paramInt2; k >= paramInt1; m = n) {
      boolean bool1;
      a a = paramArrayList.get(k);
      boolean bool = ((Boolean)paramArrayList1.get(k)).booleanValue();
      if (a.E() && !a.C(paramArrayList, k + 1, paramInt2)) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      int n = m;
      if (bool1) {
        if (this.N == null)
          this.N = new ArrayList<p>(); 
        p p = new p(a, bool);
        this.N.add(p);
        a.G(p);
        if (bool) {
          a.x();
        } else {
          a.y(false);
        } 
        n = m - 1;
        if (k != n) {
          paramArrayList.remove(k);
          paramArrayList.add(n, a);
        } 
        d(paramb);
      } 
      k--;
    } 
    return m;
  }
  
  private static void c0(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2) {
    while (paramInt1 < paramInt2) {
      a a = paramArrayList.get(paramInt1);
      boolean bool = ((Boolean)paramArrayList1.get(paramInt1)).booleanValue();
      boolean bool1 = true;
      if (bool) {
        a.t(-1);
        if (paramInt1 != paramInt2 - 1)
          bool1 = false; 
        a.y(bool1);
      } else {
        a.t(1);
        a.x();
      } 
      paramInt1++;
    } 
  }
  
  private void d(b.e.b<Fragment> paramb) {
    int k = this.s;
    if (k < 1)
      return; 
    k = Math.min(k, 5);
    for (Fragment fragment : this.e.n()) {
      if (fragment.c < k) {
        R0(fragment, k);
        if (fragment.J != null && !fragment.B && fragment.O)
          paramb.add(fragment); 
      } 
    } 
  }
  
  private void d0(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2) {
    boolean bool = ((a)paramArrayList.get(paramInt1)).r;
    ArrayList<Fragment> arrayList = this.M;
    if (arrayList == null) {
      this.M = new ArrayList<Fragment>();
    } else {
      arrayList.clear();
    } 
    this.M.addAll(this.e.n());
    Fragment fragment = y0();
    int k = paramInt1;
    boolean bool1 = false;
    while (k < paramInt2) {
      a a = paramArrayList.get(k);
      if (!((Boolean)paramArrayList1.get(k)).booleanValue()) {
        fragment = a.z(this.M, fragment);
      } else {
        fragment = a.H(this.M, fragment);
      } 
      if (bool1 || a.i) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      k++;
    } 
    this.M.clear();
    if (!bool && this.s >= 1)
      if (b) {
        for (k = paramInt1; k < paramInt2; k++) {
          Iterator<s.a> iterator = ((a)paramArrayList.get(k)).c.iterator();
          while (iterator.hasNext()) {
            Fragment fragment1 = ((s.a)iterator.next()).b;
            if (fragment1 != null && fragment1.u != null) {
              p p = v(fragment1);
              this.e.p(p);
            } 
          } 
        } 
      } else {
        t.B(this.t.k(), this.u, paramArrayList, paramArrayList1, paramInt1, paramInt2, false, this.p);
      }  
    c0(paramArrayList, paramArrayList1, paramInt1, paramInt2);
    if (b) {
      bool = ((Boolean)paramArrayList1.get(paramInt2 - 1)).booleanValue();
      for (k = paramInt1; k < paramInt2; k++) {
        a a = paramArrayList.get(k);
        if (bool) {
          for (int m = a.c.size() - 1; m >= 0; m--) {
            Fragment fragment1 = ((s.a)a.c.get(m)).b;
            if (fragment1 != null)
              v(fragment1).m(); 
          } 
        } else {
          Iterator<s.a> iterator = a.c.iterator();
          while (iterator.hasNext()) {
            Fragment fragment1 = ((s.a)iterator.next()).b;
            if (fragment1 != null)
              v(fragment1).m(); 
          } 
        } 
      } 
      P0(this.s, true);
      for (SpecialEffectsController specialEffectsController : s(paramArrayList, paramInt1, paramInt2)) {
        specialEffectsController.r(bool);
        specialEffectsController.p();
        specialEffectsController.g();
      } 
    } else {
      if (bool) {
        b.e.b<Fragment> b1 = new b.e.b();
        d(b1);
        k = Z0(paramArrayList, paramArrayList1, paramInt1, paramInt2, b1);
        N0(b1);
      } else {
        k = paramInt2;
      } 
      ArrayList<Boolean> arrayList1 = paramArrayList1;
      if (k != paramInt1 && bool) {
        if (this.s >= 1)
          t.B(this.t.k(), this.u, paramArrayList, paramArrayList1, paramInt1, k, true, this.p); 
        paramArrayList1 = arrayList1;
        P0(this.s, true);
      } else {
        paramArrayList1 = arrayList1;
      } 
    } 
    while (paramInt1 < paramInt2) {
      a a = paramArrayList.get(paramInt1);
      if (((Boolean)paramArrayList1.get(paramInt1)).booleanValue() && a.v >= 0)
        a.v = -1; 
      a.F();
      paramInt1++;
    } 
    if (bool1)
      e1(); 
  }
  
  private void d1(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1) {
    if (paramArrayList.isEmpty())
      return; 
    if (paramArrayList.size() == paramArrayList1.size()) {
      f0(paramArrayList, paramArrayList1);
      int k = paramArrayList.size();
      int m = 0;
      int n;
      for (n = 0; m < k; n = i2) {
        int i1 = m;
        int i2 = n;
        if (!((a)paramArrayList.get(m)).r) {
          if (n != m)
            d0(paramArrayList, paramArrayList1, n, m); 
          n = m + 1;
          i2 = n;
          if (((Boolean)paramArrayList1.get(m)).booleanValue())
            while (true) {
              i2 = n;
              if (n < k) {
                i2 = n;
                if (((Boolean)paramArrayList1.get(n)).booleanValue()) {
                  i2 = n;
                  if (!((a)paramArrayList.get(n)).r) {
                    n++;
                    continue;
                  } 
                } 
              } 
              break;
            }  
          d0(paramArrayList, paramArrayList1, m, i2);
          i1 = i2 - 1;
        } 
        m = i1 + 1;
      } 
      if (n != k)
        d0(paramArrayList, paramArrayList1, n, k); 
      return;
    } 
    IllegalStateException illegalStateException = new IllegalStateException("Internal error with the back stack records");
    throw illegalStateException;
  }
  
  private void e1() {
    if (this.n != null)
      for (byte b1 = 0; b1 < this.n.size(); b1++)
        ((m)this.n.get(b1)).a();  
  }
  
  private void f0(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1) {
    // Byte code:
    //   0: aload_0
    //   1: getfield N : Ljava/util/ArrayList;
    //   4: astore_3
    //   5: aload_3
    //   6: ifnonnull -> 15
    //   9: iconst_0
    //   10: istore #4
    //   12: goto -> 21
    //   15: aload_3
    //   16: invokevirtual size : ()I
    //   19: istore #4
    //   21: iconst_0
    //   22: istore #5
    //   24: iload #4
    //   26: istore #6
    //   28: iload #5
    //   30: iload #6
    //   32: if_icmpge -> 258
    //   35: aload_0
    //   36: getfield N : Ljava/util/ArrayList;
    //   39: iload #5
    //   41: invokevirtual get : (I)Ljava/lang/Object;
    //   44: checkcast androidx/fragment/app/FragmentManager$p
    //   47: astore_3
    //   48: aload_1
    //   49: ifnull -> 123
    //   52: aload_3
    //   53: getfield a : Z
    //   56: ifne -> 123
    //   59: aload_1
    //   60: aload_3
    //   61: getfield b : Landroidx/fragment/app/a;
    //   64: invokevirtual indexOf : (Ljava/lang/Object;)I
    //   67: istore #4
    //   69: iload #4
    //   71: iconst_m1
    //   72: if_icmpeq -> 123
    //   75: aload_2
    //   76: ifnull -> 123
    //   79: aload_2
    //   80: iload #4
    //   82: invokevirtual get : (I)Ljava/lang/Object;
    //   85: checkcast java/lang/Boolean
    //   88: invokevirtual booleanValue : ()Z
    //   91: ifeq -> 123
    //   94: aload_0
    //   95: getfield N : Ljava/util/ArrayList;
    //   98: iload #5
    //   100: invokevirtual remove : (I)Ljava/lang/Object;
    //   103: pop
    //   104: iload #5
    //   106: iconst_1
    //   107: isub
    //   108: istore #7
    //   110: iload #6
    //   112: iconst_1
    //   113: isub
    //   114: istore #4
    //   116: aload_3
    //   117: invokevirtual c : ()V
    //   120: goto -> 245
    //   123: aload_3
    //   124: invokevirtual e : ()Z
    //   127: ifne -> 166
    //   130: iload #6
    //   132: istore #4
    //   134: iload #5
    //   136: istore #7
    //   138: aload_1
    //   139: ifnull -> 245
    //   142: iload #6
    //   144: istore #4
    //   146: iload #5
    //   148: istore #7
    //   150: aload_3
    //   151: getfield b : Landroidx/fragment/app/a;
    //   154: aload_1
    //   155: iconst_0
    //   156: aload_1
    //   157: invokevirtual size : ()I
    //   160: invokevirtual C : (Ljava/util/ArrayList;II)Z
    //   163: ifeq -> 245
    //   166: aload_0
    //   167: getfield N : Ljava/util/ArrayList;
    //   170: iload #5
    //   172: invokevirtual remove : (I)Ljava/lang/Object;
    //   175: pop
    //   176: iload #5
    //   178: iconst_1
    //   179: isub
    //   180: istore #7
    //   182: iload #6
    //   184: iconst_1
    //   185: isub
    //   186: istore #4
    //   188: aload_1
    //   189: ifnull -> 241
    //   192: aload_3
    //   193: getfield a : Z
    //   196: ifne -> 241
    //   199: aload_1
    //   200: aload_3
    //   201: getfield b : Landroidx/fragment/app/a;
    //   204: invokevirtual indexOf : (Ljava/lang/Object;)I
    //   207: istore #5
    //   209: iload #5
    //   211: iconst_m1
    //   212: if_icmpeq -> 241
    //   215: aload_2
    //   216: ifnull -> 241
    //   219: aload_2
    //   220: iload #5
    //   222: invokevirtual get : (I)Ljava/lang/Object;
    //   225: checkcast java/lang/Boolean
    //   228: invokevirtual booleanValue : ()Z
    //   231: ifeq -> 241
    //   234: aload_3
    //   235: invokevirtual c : ()V
    //   238: goto -> 245
    //   241: aload_3
    //   242: invokevirtual d : ()V
    //   245: iload #7
    //   247: iconst_1
    //   248: iadd
    //   249: istore #5
    //   251: iload #4
    //   253: istore #6
    //   255: goto -> 28
    //   258: return
  }
  
  static int g1(int paramInt) {
    char c = ' ';
    if (paramInt != 4097)
      if (paramInt != 4099) {
        if (paramInt != 8194) {
          c = Character.MIN_VALUE;
        } else {
          c = 'ခ';
        } 
      } else {
        c = 'ဃ';
      }  
    return c;
  }
  
  private void k0() {
    if (b) {
      Iterator<SpecialEffectsController> iterator = r().iterator();
      while (iterator.hasNext())
        ((SpecialEffectsController)iterator.next()).k(); 
    } else if (this.N != null) {
      while (!this.N.isEmpty())
        ((p)this.N.remove(0)).d(); 
    } 
  }
  
  private boolean l0(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1) {
    synchronized (this.c) {
      boolean bool = this.c.isEmpty();
      byte b1 = 0;
      if (bool)
        return false; 
      int k = this.c.size();
      bool = false;
      while (b1 < k) {
        bool |= ((n)this.c.get(b1)).a(paramArrayList, paramArrayList1);
        b1++;
      } 
      this.c.clear();
      this.t.l().removeCallbacks(this.P);
      return bool;
    } 
  }
  
  private void m(Fragment paramFragment) {
    HashSet hashSet = this.o.get(paramFragment);
    if (hashSet != null) {
      Iterator<androidx.core.os.b> iterator = hashSet.iterator();
      while (iterator.hasNext())
        ((androidx.core.os.b)iterator.next()).a(); 
      hashSet.clear();
      w(paramFragment);
      this.o.remove(paramFragment);
    } 
  }
  
  private l n0(Fragment paramFragment) {
    return this.O.h(paramFragment);
  }
  
  private void n1(Fragment paramFragment) {
    ViewGroup viewGroup = q0(paramFragment);
    if (viewGroup != null && paramFragment.u() + paramFragment.x() + paramFragment.K() + paramFragment.L() > 0) {
      int k = b.m.b.visible_removing_fragment_view_tag;
      if (viewGroup.getTag(k) == null)
        viewGroup.setTag(k, paramFragment); 
      ((Fragment)viewGroup.getTag(k)).I1(paramFragment.J());
    } 
  }
  
  private void o() {
    if (!L0())
      return; 
    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
  }
  
  private void p() {
    this.d = false;
    this.L.clear();
    this.K.clear();
  }
  
  private void p1() {
    Iterator<p> iterator = this.e.k().iterator();
    while (iterator.hasNext())
      U0(iterator.next()); 
  }
  
  private ViewGroup q0(Fragment paramFragment) {
    ViewGroup viewGroup = paramFragment.I;
    if (viewGroup != null)
      return viewGroup; 
    if (paramFragment.z <= 0)
      return null; 
    if (this.u.g()) {
      View view = this.u.e(paramFragment.z);
      if (view instanceof ViewGroup)
        return (ViewGroup)view; 
    } 
    return null;
  }
  
  private void q1(RuntimeException paramRuntimeException) {
    Log.e("FragmentManager", paramRuntimeException.getMessage());
    Log.e("FragmentManager", "Activity state:");
    PrintWriter printWriter = new PrintWriter(new x("FragmentManager"));
    h<?> h1 = this.t;
    if (h1 != null) {
      try {
        h1.m("  ", null, printWriter, new String[0]);
      } catch (Exception exception) {
        Log.e("FragmentManager", "Failed dumping state", exception);
      } 
    } else {
      try {
        W("  ", null, printWriter, new String[0]);
      } catch (Exception exception) {
        Log.e("FragmentManager", "Failed dumping state", exception);
      } 
    } 
    throw paramRuntimeException;
  }
  
  private Set<SpecialEffectsController> r() {
    HashSet<SpecialEffectsController> hashSet = new HashSet();
    Iterator<p> iterator = this.e.k().iterator();
    while (iterator.hasNext()) {
      ViewGroup viewGroup = (((p)iterator.next()).k()).I;
      if (viewGroup != null)
        hashSet.add(SpecialEffectsController.o(viewGroup, z0())); 
    } 
    return hashSet;
  }
  
  private void r1() {
    synchronized (this.c) {
      boolean bool = this.c.isEmpty();
      boolean bool1 = true;
      if (!bool) {
        this.j.f(true);
        return;
      } 
      androidx.activity.b b1 = this.j;
      if (m0() <= 0 || !J0(this.v))
        bool1 = false; 
      b1.f(bool1);
      return;
    } 
  }
  
  private Set<SpecialEffectsController> s(ArrayList<a> paramArrayList, int paramInt1, int paramInt2) {
    HashSet<SpecialEffectsController> hashSet = new HashSet();
    while (paramInt1 < paramInt2) {
      Iterator<s.a> iterator = ((a)paramArrayList.get(paramInt1)).c.iterator();
      while (iterator.hasNext()) {
        Fragment fragment = ((s.a)iterator.next()).b;
        if (fragment != null) {
          ViewGroup viewGroup = fragment.I;
          if (viewGroup != null)
            hashSet.add(SpecialEffectsController.n(viewGroup, this)); 
        } 
      } 
      paramInt1++;
    } 
    return hashSet;
  }
  
  private void u(Fragment paramFragment) {
    // Byte code:
    //   0: aload_1
    //   1: getfield J : Landroid/view/View;
    //   4: ifnull -> 196
    //   7: aload_0
    //   8: getfield t : Landroidx/fragment/app/h;
    //   11: invokevirtual k : ()Landroid/content/Context;
    //   14: aload_1
    //   15: aload_1
    //   16: getfield B : Z
    //   19: iconst_1
    //   20: ixor
    //   21: aload_1
    //   22: invokevirtual J : ()Z
    //   25: invokestatic c : (Landroid/content/Context;Landroidx/fragment/app/Fragment;ZZ)Landroidx/fragment/app/d$d;
    //   28: astore_2
    //   29: aload_2
    //   30: ifnull -> 129
    //   33: aload_2
    //   34: getfield b : Landroid/animation/Animator;
    //   37: astore_3
    //   38: aload_3
    //   39: ifnull -> 129
    //   42: aload_3
    //   43: aload_1
    //   44: getfield J : Landroid/view/View;
    //   47: invokevirtual setTarget : (Ljava/lang/Object;)V
    //   50: aload_1
    //   51: getfield B : Z
    //   54: ifeq -> 111
    //   57: aload_1
    //   58: invokevirtual e0 : ()Z
    //   61: ifeq -> 72
    //   64: aload_1
    //   65: iconst_0
    //   66: invokevirtual D1 : (Z)V
    //   69: goto -> 119
    //   72: aload_1
    //   73: getfield I : Landroid/view/ViewGroup;
    //   76: astore_3
    //   77: aload_1
    //   78: getfield J : Landroid/view/View;
    //   81: astore #4
    //   83: aload_3
    //   84: aload #4
    //   86: invokevirtual startViewTransition : (Landroid/view/View;)V
    //   89: aload_2
    //   90: getfield b : Landroid/animation/Animator;
    //   93: new androidx/fragment/app/FragmentManager$h
    //   96: dup
    //   97: aload_0
    //   98: aload_3
    //   99: aload #4
    //   101: aload_1
    //   102: invokespecial <init> : (Landroidx/fragment/app/FragmentManager;Landroid/view/ViewGroup;Landroid/view/View;Landroidx/fragment/app/Fragment;)V
    //   105: invokevirtual addListener : (Landroid/animation/Animator$AnimatorListener;)V
    //   108: goto -> 119
    //   111: aload_1
    //   112: getfield J : Landroid/view/View;
    //   115: iconst_0
    //   116: invokevirtual setVisibility : (I)V
    //   119: aload_2
    //   120: getfield b : Landroid/animation/Animator;
    //   123: invokevirtual start : ()V
    //   126: goto -> 196
    //   129: aload_2
    //   130: ifnull -> 151
    //   133: aload_1
    //   134: getfield J : Landroid/view/View;
    //   137: aload_2
    //   138: getfield a : Landroid/view/animation/Animation;
    //   141: invokevirtual startAnimation : (Landroid/view/animation/Animation;)V
    //   144: aload_2
    //   145: getfield a : Landroid/view/animation/Animation;
    //   148: invokevirtual start : ()V
    //   151: aload_1
    //   152: getfield B : Z
    //   155: ifeq -> 172
    //   158: aload_1
    //   159: invokevirtual e0 : ()Z
    //   162: ifne -> 172
    //   165: bipush #8
    //   167: istore #5
    //   169: goto -> 175
    //   172: iconst_0
    //   173: istore #5
    //   175: aload_1
    //   176: getfield J : Landroid/view/View;
    //   179: iload #5
    //   181: invokevirtual setVisibility : (I)V
    //   184: aload_1
    //   185: invokevirtual e0 : ()Z
    //   188: ifeq -> 196
    //   191: aload_1
    //   192: iconst_0
    //   193: invokevirtual D1 : (Z)V
    //   196: aload_0
    //   197: aload_1
    //   198: invokevirtual E0 : (Landroidx/fragment/app/Fragment;)V
    //   201: aload_1
    //   202: iconst_0
    //   203: putfield P : Z
    //   206: aload_1
    //   207: aload_1
    //   208: getfield B : Z
    //   211: invokevirtual C0 : (Z)V
    //   214: return
  }
  
  private void w(Fragment paramFragment) {
    paramFragment.c1();
    this.q.n(paramFragment, false);
    paramFragment.I = null;
    paramFragment.J = null;
    paramFragment.V = null;
    paramFragment.W.n(null);
    paramFragment.q = false;
  }
  
  void A(Configuration paramConfiguration) {
    for (Fragment fragment : this.e.n()) {
      if (fragment != null)
        fragment.V0(paramConfiguration); 
    } 
  }
  
  boolean B(MenuItem paramMenuItem) {
    if (this.s < 1)
      return false; 
    for (Fragment fragment : this.e.n()) {
      if (fragment != null && fragment.W0(paramMenuItem))
        return true; 
    } 
    return false;
  }
  
  t B0(Fragment paramFragment) {
    return this.O.k(paramFragment);
  }
  
  void C() {
    this.G = false;
    this.H = false;
    this.O.n(false);
    S(1);
  }
  
  void C0() {
    a0(true);
    if (this.j.c()) {
      W0();
    } else {
      this.i.c();
    } 
  }
  
  boolean D(Menu paramMenu, MenuInflater paramMenuInflater) {
    int k = this.s;
    byte b1 = 0;
    if (k < 1)
      return false; 
    ArrayList<Fragment> arrayList = null;
    Iterator<Fragment> iterator = this.e.n().iterator();
    boolean bool = false;
    while (iterator.hasNext()) {
      Fragment fragment = iterator.next();
      if (fragment != null && I0(fragment) && fragment.Z0(paramMenu, paramMenuInflater)) {
        ArrayList<Fragment> arrayList1 = arrayList;
        if (arrayList == null)
          arrayList1 = new ArrayList(); 
        arrayList1.add(fragment);
        bool = true;
        arrayList = arrayList1;
      } 
    } 
    if (this.g != null)
      while (b1 < this.g.size()) {
        Fragment fragment = this.g.get(b1);
        if (arrayList == null || !arrayList.contains(fragment))
          fragment.y0(); 
        b1++;
      }  
    this.g = arrayList;
    return bool;
  }
  
  void D0(Fragment paramFragment) {
    if (G0(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("hide: ");
      stringBuilder.append(paramFragment);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    if (!paramFragment.B) {
      paramFragment.B = true;
      paramFragment.P = true ^ paramFragment.P;
      n1(paramFragment);
    } 
  }
  
  void E() {
    this.I = true;
    a0(true);
    X();
    S(-1);
    this.t = null;
    this.u = null;
    this.v = null;
    if (this.i != null) {
      this.j.d();
      this.i = null;
    } 
    androidx.activity.result.b<Intent> b1 = this.B;
    if (b1 != null) {
      b1.c();
      this.C.c();
      this.D.c();
    } 
  }
  
  void E0(Fragment paramFragment) {
    if (paramFragment.n && H0(paramFragment))
      this.F = true; 
  }
  
  void F() {
    S(1);
  }
  
  public boolean F0() {
    return this.I;
  }
  
  void G() {
    for (Fragment fragment : this.e.n()) {
      if (fragment != null)
        fragment.f1(); 
    } 
  }
  
  void H(boolean paramBoolean) {
    for (Fragment fragment : this.e.n()) {
      if (fragment != null)
        fragment.g1(paramBoolean); 
    } 
  }
  
  void I(Fragment paramFragment) {
    Iterator<m> iterator = this.r.iterator();
    while (iterator.hasNext())
      ((m)iterator.next()).b(this, paramFragment); 
  }
  
  boolean I0(Fragment paramFragment) {
    return (paramFragment == null) ? true : paramFragment.g0();
  }
  
  boolean J(MenuItem paramMenuItem) {
    if (this.s < 1)
      return false; 
    for (Fragment fragment : this.e.n()) {
      if (fragment != null && fragment.h1(paramMenuItem))
        return true; 
    } 
    return false;
  }
  
  boolean J0(Fragment paramFragment) {
    boolean bool = true;
    if (paramFragment == null)
      return true; 
    FragmentManager fragmentManager = paramFragment.u;
    if (!paramFragment.equals(fragmentManager.y0()) || !J0(fragmentManager.v))
      bool = false; 
    return bool;
  }
  
  void K(Menu paramMenu) {
    if (this.s < 1)
      return; 
    for (Fragment fragment : this.e.n()) {
      if (fragment != null)
        fragment.i1(paramMenu); 
    } 
  }
  
  boolean K0(int paramInt) {
    boolean bool;
    if (this.s >= paramInt) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean L0() {
    return (this.G || this.H);
  }
  
  void M() {
    S(5);
  }
  
  void M0(Fragment paramFragment, @SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt, Bundle paramBundle) {
    LaunchedFragmentInfo launchedFragmentInfo;
    if (this.B != null) {
      launchedFragmentInfo = new LaunchedFragmentInfo(paramFragment.h, paramInt);
      this.E.addLast(launchedFragmentInfo);
      if (paramIntent != null && paramBundle != null)
        paramIntent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", paramBundle); 
      this.B.a(paramIntent);
    } else {
      this.t.q((Fragment)launchedFragmentInfo, paramIntent, paramInt, paramBundle);
    } 
  }
  
  void N(boolean paramBoolean) {
    for (Fragment fragment : this.e.n()) {
      if (fragment != null)
        fragment.k1(paramBoolean); 
    } 
  }
  
  boolean O(Menu paramMenu) {
    int k = this.s;
    boolean bool = false;
    if (k < 1)
      return false; 
    for (Fragment fragment : this.e.n()) {
      if (fragment != null && I0(fragment) && fragment.l1(paramMenu))
        bool = true; 
    } 
    return bool;
  }
  
  void O0(Fragment paramFragment) {
    if (!this.e.c(paramFragment.h)) {
      if (G0(3)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ignoring moving ");
        stringBuilder.append(paramFragment);
        stringBuilder.append(" to state ");
        stringBuilder.append(this.s);
        stringBuilder.append("since it is not added to ");
        stringBuilder.append(this);
        Log.d("FragmentManager", stringBuilder.toString());
      } 
      return;
    } 
    Q0(paramFragment);
    View view = paramFragment.J;
    if (view != null && paramFragment.O && paramFragment.I != null) {
      float f = paramFragment.Q;
      if (f > 0.0F)
        view.setAlpha(f); 
      paramFragment.Q = 0.0F;
      paramFragment.O = false;
      d.d d = d.c(this.t.k(), paramFragment, true, paramFragment.J());
      if (d != null) {
        Animation animation = d.a;
        if (animation != null) {
          paramFragment.J.startAnimation(animation);
        } else {
          d.b.setTarget(paramFragment.J);
          d.b.start();
        } 
      } 
    } 
    if (paramFragment.P)
      u(paramFragment); 
  }
  
  void P() {
    r1();
    L(this.w);
  }
  
  void P0(int paramInt, boolean paramBoolean) {
    if (this.t != null || paramInt == -1) {
      if (!paramBoolean && paramInt == this.s)
        return; 
      this.s = paramInt;
      if (b) {
        this.e.r();
      } else {
        Iterator<Fragment> iterator = this.e.n().iterator();
        while (iterator.hasNext())
          O0(iterator.next()); 
        for (p p : this.e.k()) {
          Fragment fragment = p.k();
          if (!fragment.O)
            O0(fragment); 
          if (fragment.o && !fragment.f0()) {
            paramInt = 1;
          } else {
            paramInt = 0;
          } 
          if (paramInt != 0)
            this.e.q(p); 
        } 
      } 
      p1();
      if (this.F) {
        h<?> h1 = this.t;
        if (h1 != null && this.s == 7) {
          h1.r();
          this.F = false;
        } 
      } 
      return;
    } 
    throw new IllegalStateException("No activity");
  }
  
  void Q() {
    this.G = false;
    this.H = false;
    this.O.n(false);
    S(7);
  }
  
  void Q0(Fragment paramFragment) {
    R0(paramFragment, this.s);
  }
  
  void R() {
    this.G = false;
    this.H = false;
    this.O.n(false);
    S(5);
  }
  
  void R0(Fragment paramFragment, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Landroidx/fragment/app/r;
    //   4: aload_1
    //   5: getfield h : Ljava/lang/String;
    //   8: invokevirtual m : (Ljava/lang/String;)Landroidx/fragment/app/p;
    //   11: astore_3
    //   12: iconst_1
    //   13: istore #4
    //   15: aload_3
    //   16: astore #5
    //   18: aload_3
    //   19: ifnonnull -> 46
    //   22: new androidx/fragment/app/p
    //   25: dup
    //   26: aload_0
    //   27: getfield q : Landroidx/fragment/app/j;
    //   30: aload_0
    //   31: getfield e : Landroidx/fragment/app/r;
    //   34: aload_1
    //   35: invokespecial <init> : (Landroidx/fragment/app/j;Landroidx/fragment/app/r;Landroidx/fragment/app/Fragment;)V
    //   38: astore #5
    //   40: aload #5
    //   42: iconst_1
    //   43: invokevirtual u : (I)V
    //   46: iload_2
    //   47: istore #6
    //   49: aload_1
    //   50: getfield p : Z
    //   53: ifeq -> 84
    //   56: iload_2
    //   57: istore #6
    //   59: aload_1
    //   60: getfield q : Z
    //   63: ifeq -> 84
    //   66: iload_2
    //   67: istore #6
    //   69: aload_1
    //   70: getfield c : I
    //   73: iconst_2
    //   74: if_icmpne -> 84
    //   77: iload_2
    //   78: iconst_2
    //   79: invokestatic max : (II)I
    //   82: istore #6
    //   84: iload #6
    //   86: aload #5
    //   88: invokevirtual d : ()I
    //   91: invokestatic min : (II)I
    //   94: istore_2
    //   95: aload_1
    //   96: getfield c : I
    //   99: istore #7
    //   101: iload #7
    //   103: iload_2
    //   104: if_icmpgt -> 255
    //   107: iload #7
    //   109: iload_2
    //   110: if_icmpge -> 130
    //   113: aload_0
    //   114: getfield o : Ljava/util/Map;
    //   117: invokeinterface isEmpty : ()Z
    //   122: ifne -> 130
    //   125: aload_0
    //   126: aload_1
    //   127: invokespecial m : (Landroidx/fragment/app/Fragment;)V
    //   130: aload_1
    //   131: getfield c : I
    //   134: istore #6
    //   136: iload #6
    //   138: iconst_m1
    //   139: if_icmpeq -> 177
    //   142: iload #6
    //   144: ifeq -> 187
    //   147: iload #6
    //   149: iconst_1
    //   150: if_icmpeq -> 196
    //   153: iload #6
    //   155: iconst_2
    //   156: if_icmpeq -> 216
    //   159: iload #6
    //   161: iconst_4
    //   162: if_icmpeq -> 226
    //   165: iload #6
    //   167: iconst_5
    //   168: if_icmpeq -> 236
    //   171: iload_2
    //   172: istore #6
    //   174: goto -> 687
    //   177: iload_2
    //   178: iconst_m1
    //   179: if_icmple -> 187
    //   182: aload #5
    //   184: invokevirtual c : ()V
    //   187: iload_2
    //   188: ifle -> 196
    //   191: aload #5
    //   193: invokevirtual e : ()V
    //   196: iload_2
    //   197: iconst_m1
    //   198: if_icmple -> 206
    //   201: aload #5
    //   203: invokevirtual j : ()V
    //   206: iload_2
    //   207: iconst_1
    //   208: if_icmple -> 216
    //   211: aload #5
    //   213: invokevirtual f : ()V
    //   216: iload_2
    //   217: iconst_2
    //   218: if_icmple -> 226
    //   221: aload #5
    //   223: invokevirtual a : ()V
    //   226: iload_2
    //   227: iconst_4
    //   228: if_icmple -> 236
    //   231: aload #5
    //   233: invokevirtual v : ()V
    //   236: iload_2
    //   237: istore #6
    //   239: iload_2
    //   240: iconst_5
    //   241: if_icmple -> 687
    //   244: aload #5
    //   246: invokevirtual p : ()V
    //   249: iload_2
    //   250: istore #6
    //   252: goto -> 687
    //   255: iload_2
    //   256: istore #6
    //   258: iload #7
    //   260: iload_2
    //   261: if_icmple -> 687
    //   264: iload #7
    //   266: ifeq -> 675
    //   269: iload #7
    //   271: iconst_1
    //   272: if_icmpeq -> 646
    //   275: iload #7
    //   277: iconst_2
    //   278: if_icmpeq -> 401
    //   281: iload #7
    //   283: iconst_4
    //   284: if_icmpeq -> 327
    //   287: iload #7
    //   289: iconst_5
    //   290: if_icmpeq -> 317
    //   293: iload #7
    //   295: bipush #7
    //   297: if_icmpeq -> 306
    //   300: iload_2
    //   301: istore #6
    //   303: goto -> 687
    //   306: iload_2
    //   307: bipush #7
    //   309: if_icmpge -> 317
    //   312: aload #5
    //   314: invokevirtual n : ()V
    //   317: iload_2
    //   318: iconst_5
    //   319: if_icmpge -> 327
    //   322: aload #5
    //   324: invokevirtual w : ()V
    //   327: iload_2
    //   328: iconst_4
    //   329: if_icmpge -> 401
    //   332: iconst_3
    //   333: invokestatic G0 : (I)Z
    //   336: ifeq -> 371
    //   339: new java/lang/StringBuilder
    //   342: dup
    //   343: invokespecial <init> : ()V
    //   346: astore_3
    //   347: aload_3
    //   348: ldc_w 'movefrom ACTIVITY_CREATED: '
    //   351: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: pop
    //   355: aload_3
    //   356: aload_1
    //   357: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   360: pop
    //   361: ldc 'FragmentManager'
    //   363: aload_3
    //   364: invokevirtual toString : ()Ljava/lang/String;
    //   367: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   370: pop
    //   371: aload_1
    //   372: getfield J : Landroid/view/View;
    //   375: ifnull -> 401
    //   378: aload_0
    //   379: getfield t : Landroidx/fragment/app/h;
    //   382: aload_1
    //   383: invokevirtual p : (Landroidx/fragment/app/Fragment;)Z
    //   386: ifeq -> 401
    //   389: aload_1
    //   390: getfield e : Landroid/util/SparseArray;
    //   393: ifnonnull -> 401
    //   396: aload #5
    //   398: invokevirtual t : ()V
    //   401: iload_2
    //   402: iconst_2
    //   403: if_icmpge -> 646
    //   406: aconst_null
    //   407: astore #8
    //   409: aload_1
    //   410: getfield J : Landroid/view/View;
    //   413: astore #9
    //   415: aload #9
    //   417: ifnull -> 628
    //   420: aload_1
    //   421: getfield I : Landroid/view/ViewGroup;
    //   424: astore_3
    //   425: aload_3
    //   426: ifnull -> 628
    //   429: aload_3
    //   430: aload #9
    //   432: invokevirtual endViewTransition : (Landroid/view/View;)V
    //   435: aload_1
    //   436: getfield J : Landroid/view/View;
    //   439: invokevirtual clearAnimation : ()V
    //   442: aload_1
    //   443: invokevirtual j0 : ()Z
    //   446: ifne -> 628
    //   449: aload #8
    //   451: astore_3
    //   452: aload_0
    //   453: getfield s : I
    //   456: iconst_m1
    //   457: if_icmple -> 512
    //   460: aload #8
    //   462: astore_3
    //   463: aload_0
    //   464: getfield I : Z
    //   467: ifne -> 512
    //   470: aload #8
    //   472: astore_3
    //   473: aload_1
    //   474: getfield J : Landroid/view/View;
    //   477: invokevirtual getVisibility : ()I
    //   480: ifne -> 512
    //   483: aload #8
    //   485: astore_3
    //   486: aload_1
    //   487: getfield Q : F
    //   490: fconst_0
    //   491: fcmpl
    //   492: iflt -> 512
    //   495: aload_0
    //   496: getfield t : Landroidx/fragment/app/h;
    //   499: invokevirtual k : ()Landroid/content/Context;
    //   502: aload_1
    //   503: iconst_0
    //   504: aload_1
    //   505: invokevirtual J : ()Z
    //   508: invokestatic c : (Landroid/content/Context;Landroidx/fragment/app/Fragment;ZZ)Landroidx/fragment/app/d$d;
    //   511: astore_3
    //   512: aload_1
    //   513: fconst_0
    //   514: putfield Q : F
    //   517: aload_1
    //   518: getfield I : Landroid/view/ViewGroup;
    //   521: astore #9
    //   523: aload_1
    //   524: getfield J : Landroid/view/View;
    //   527: astore #8
    //   529: aload_3
    //   530: ifnull -> 542
    //   533: aload_1
    //   534: aload_3
    //   535: aload_0
    //   536: getfield p : Landroidx/fragment/app/t$g;
    //   539: invokestatic a : (Landroidx/fragment/app/Fragment;Landroidx/fragment/app/d$d;Landroidx/fragment/app/t$g;)V
    //   542: aload #9
    //   544: aload #8
    //   546: invokevirtual removeView : (Landroid/view/View;)V
    //   549: iconst_2
    //   550: invokestatic G0 : (I)Z
    //   553: ifeq -> 618
    //   556: new java/lang/StringBuilder
    //   559: dup
    //   560: invokespecial <init> : ()V
    //   563: astore_3
    //   564: aload_3
    //   565: ldc_w 'Removing view '
    //   568: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   571: pop
    //   572: aload_3
    //   573: aload #8
    //   575: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   578: pop
    //   579: aload_3
    //   580: ldc_w ' for fragment '
    //   583: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   586: pop
    //   587: aload_3
    //   588: aload_1
    //   589: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   592: pop
    //   593: aload_3
    //   594: ldc_w ' from container '
    //   597: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   600: pop
    //   601: aload_3
    //   602: aload #9
    //   604: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   607: pop
    //   608: ldc 'FragmentManager'
    //   610: aload_3
    //   611: invokevirtual toString : ()Ljava/lang/String;
    //   614: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   617: pop
    //   618: aload #9
    //   620: aload_1
    //   621: getfield I : Landroid/view/ViewGroup;
    //   624: if_acmpeq -> 628
    //   627: return
    //   628: aload_0
    //   629: getfield o : Ljava/util/Map;
    //   632: aload_1
    //   633: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   638: ifnonnull -> 646
    //   641: aload #5
    //   643: invokevirtual h : ()V
    //   646: iload_2
    //   647: iconst_1
    //   648: if_icmpge -> 675
    //   651: aload_0
    //   652: getfield o : Ljava/util/Map;
    //   655: aload_1
    //   656: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   661: ifnull -> 670
    //   664: iload #4
    //   666: istore_2
    //   667: goto -> 675
    //   670: aload #5
    //   672: invokevirtual g : ()V
    //   675: iload_2
    //   676: ifge -> 684
    //   679: aload #5
    //   681: invokevirtual i : ()V
    //   684: iload_2
    //   685: istore #6
    //   687: aload_1
    //   688: getfield c : I
    //   691: iload #6
    //   693: if_icmpeq -> 781
    //   696: iconst_3
    //   697: invokestatic G0 : (I)Z
    //   700: ifeq -> 775
    //   703: new java/lang/StringBuilder
    //   706: dup
    //   707: invokespecial <init> : ()V
    //   710: astore #5
    //   712: aload #5
    //   714: ldc_w 'moveToState: Fragment state for '
    //   717: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   720: pop
    //   721: aload #5
    //   723: aload_1
    //   724: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   727: pop
    //   728: aload #5
    //   730: ldc_w ' not updated inline; expected state '
    //   733: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   736: pop
    //   737: aload #5
    //   739: iload #6
    //   741: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   744: pop
    //   745: aload #5
    //   747: ldc_w ' found '
    //   750: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   753: pop
    //   754: aload #5
    //   756: aload_1
    //   757: getfield c : I
    //   760: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   763: pop
    //   764: ldc 'FragmentManager'
    //   766: aload #5
    //   768: invokevirtual toString : ()Ljava/lang/String;
    //   771: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   774: pop
    //   775: aload_1
    //   776: iload #6
    //   778: putfield c : I
    //   781: return
  }
  
  void S0() {
    if (this.t == null)
      return; 
    this.G = false;
    this.H = false;
    this.O.n(false);
    for (Fragment fragment : this.e.n()) {
      if (fragment != null)
        fragment.l0(); 
    } 
  }
  
  void T() {
    this.H = true;
    this.O.n(true);
    S(4);
  }
  
  void T0(FragmentContainerView paramFragmentContainerView) {
    for (p p : this.e.k()) {
      Fragment fragment = p.k();
      if (fragment.z == paramFragmentContainerView.getId()) {
        View view = fragment.J;
        if (view != null && view.getParent() == null) {
          fragment.I = (ViewGroup)paramFragmentContainerView;
          p.b();
        } 
      } 
    } 
  }
  
  void U() {
    S(2);
  }
  
  void U0(p paramp) {
    Fragment fragment = paramp.k();
    if (fragment.K) {
      if (this.d) {
        this.J = true;
        return;
      } 
      fragment.K = false;
      if (b) {
        paramp.m();
      } else {
        Q0(fragment);
      } 
    } 
  }
  
  public void V0(int paramInt1, int paramInt2) {
    if (paramInt1 >= 0) {
      Y(new o(this, null, paramInt1, paramInt2), false);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Bad id: ");
    stringBuilder.append(paramInt1);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void W(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(paramString);
    stringBuilder2.append("    ");
    String str = stringBuilder2.toString();
    this.e.e(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    ArrayList<Fragment> arrayList1 = this.g;
    byte b1 = 0;
    if (arrayList1 != null) {
      int k = arrayList1.size();
      if (k > 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Fragments Created Menus:");
        for (byte b2 = 0; b2 < k; b2++) {
          Fragment fragment = this.g.get(b2);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(b2);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(fragment.toString());
        } 
      } 
    } 
    ArrayList<a> arrayList = this.f;
    if (arrayList != null) {
      int k = arrayList.size();
      if (k > 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Back Stack:");
        for (byte b2 = 0; b2 < k; b2++) {
          a a = this.f.get(b2);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(b2);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(a.toString());
          a.v(str, paramPrintWriter);
        } 
      } 
    } 
    paramPrintWriter.print(paramString);
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("Back Stack Index: ");
    stringBuilder1.append(this.k.get());
    paramPrintWriter.println(stringBuilder1.toString());
    synchronized (this.c) {
      int k = this.c.size();
      if (k > 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Pending Actions:");
        for (byte b2 = b1; b2 < k; b2++) {
          n n = this.c.get(b2);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(b2);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(n);
        } 
      } 
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("FragmentManager misc state:");
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mHost=");
      paramPrintWriter.println(this.t);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mContainer=");
      paramPrintWriter.println(this.u);
      if (this.v != null) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  mParent=");
        paramPrintWriter.println(this.v);
      } 
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mCurState=");
      paramPrintWriter.print(this.s);
      paramPrintWriter.print(" mStateSaved=");
      paramPrintWriter.print(this.G);
      paramPrintWriter.print(" mStopped=");
      paramPrintWriter.print(this.H);
      paramPrintWriter.print(" mDestroyed=");
      paramPrintWriter.println(this.I);
      if (this.F) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  mNeedMenuInvalidate=");
        paramPrintWriter.println(this.F);
      } 
      return;
    } 
  }
  
  public boolean W0() {
    return X0(null, -1, 0);
  }
  
  void Y(n paramn, boolean paramBoolean) {
    if (!paramBoolean) {
      if (this.t == null) {
        if (this.I)
          throw new IllegalStateException("FragmentManager has been destroyed"); 
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
      } 
      o();
    } 
    synchronized (this.c) {
      IllegalStateException illegalStateException;
      if (this.t == null) {
        if (paramBoolean)
          return; 
        illegalStateException = new IllegalStateException();
        this("Activity has been destroyed");
        throw illegalStateException;
      } 
      this.c.add(illegalStateException);
      j1();
      return;
    } 
  }
  
  boolean Y0(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1, String paramString, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : Ljava/util/ArrayList;
    //   4: astore #6
    //   6: aload #6
    //   8: ifnonnull -> 13
    //   11: iconst_0
    //   12: ireturn
    //   13: aload_3
    //   14: ifnonnull -> 70
    //   17: iload #4
    //   19: ifge -> 70
    //   22: iload #5
    //   24: iconst_1
    //   25: iand
    //   26: ifne -> 70
    //   29: aload #6
    //   31: invokevirtual size : ()I
    //   34: iconst_1
    //   35: isub
    //   36: istore #4
    //   38: iload #4
    //   40: ifge -> 45
    //   43: iconst_0
    //   44: ireturn
    //   45: aload_1
    //   46: aload_0
    //   47: getfield f : Ljava/util/ArrayList;
    //   50: iload #4
    //   52: invokevirtual remove : (I)Ljava/lang/Object;
    //   55: invokevirtual add : (Ljava/lang/Object;)Z
    //   58: pop
    //   59: aload_2
    //   60: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   63: invokevirtual add : (Ljava/lang/Object;)Z
    //   66: pop
    //   67: goto -> 322
    //   70: aload_3
    //   71: ifnonnull -> 88
    //   74: iload #4
    //   76: iflt -> 82
    //   79: goto -> 88
    //   82: iconst_m1
    //   83: istore #4
    //   85: goto -> 260
    //   88: aload #6
    //   90: invokevirtual size : ()I
    //   93: iconst_1
    //   94: isub
    //   95: istore #7
    //   97: iload #7
    //   99: iflt -> 159
    //   102: aload_0
    //   103: getfield f : Ljava/util/ArrayList;
    //   106: iload #7
    //   108: invokevirtual get : (I)Ljava/lang/Object;
    //   111: checkcast androidx/fragment/app/a
    //   114: astore #6
    //   116: aload_3
    //   117: ifnull -> 135
    //   120: aload_3
    //   121: aload #6
    //   123: invokevirtual A : ()Ljava/lang/String;
    //   126: invokevirtual equals : (Ljava/lang/Object;)Z
    //   129: ifeq -> 135
    //   132: goto -> 159
    //   135: iload #4
    //   137: iflt -> 153
    //   140: iload #4
    //   142: aload #6
    //   144: getfield v : I
    //   147: if_icmpne -> 153
    //   150: goto -> 159
    //   153: iinc #7, -1
    //   156: goto -> 97
    //   159: iload #7
    //   161: ifge -> 166
    //   164: iconst_0
    //   165: ireturn
    //   166: iload #7
    //   168: istore #8
    //   170: iload #5
    //   172: iconst_1
    //   173: iand
    //   174: ifeq -> 256
    //   177: iload #7
    //   179: iconst_1
    //   180: isub
    //   181: istore #5
    //   183: iload #5
    //   185: istore #8
    //   187: iload #5
    //   189: iflt -> 256
    //   192: aload_0
    //   193: getfield f : Ljava/util/ArrayList;
    //   196: iload #5
    //   198: invokevirtual get : (I)Ljava/lang/Object;
    //   201: checkcast androidx/fragment/app/a
    //   204: astore #6
    //   206: aload_3
    //   207: ifnull -> 226
    //   210: iload #5
    //   212: istore #7
    //   214: aload_3
    //   215: aload #6
    //   217: invokevirtual A : ()Ljava/lang/String;
    //   220: invokevirtual equals : (Ljava/lang/Object;)Z
    //   223: ifne -> 177
    //   226: iload #5
    //   228: istore #8
    //   230: iload #4
    //   232: iflt -> 256
    //   235: iload #5
    //   237: istore #8
    //   239: iload #4
    //   241: aload #6
    //   243: getfield v : I
    //   246: if_icmpne -> 256
    //   249: iload #5
    //   251: istore #7
    //   253: goto -> 177
    //   256: iload #8
    //   258: istore #4
    //   260: iload #4
    //   262: aload_0
    //   263: getfield f : Ljava/util/ArrayList;
    //   266: invokevirtual size : ()I
    //   269: iconst_1
    //   270: isub
    //   271: if_icmpne -> 276
    //   274: iconst_0
    //   275: ireturn
    //   276: aload_0
    //   277: getfield f : Ljava/util/ArrayList;
    //   280: invokevirtual size : ()I
    //   283: iconst_1
    //   284: isub
    //   285: istore #5
    //   287: iload #5
    //   289: iload #4
    //   291: if_icmple -> 322
    //   294: aload_1
    //   295: aload_0
    //   296: getfield f : Ljava/util/ArrayList;
    //   299: iload #5
    //   301: invokevirtual remove : (I)Ljava/lang/Object;
    //   304: invokevirtual add : (Ljava/lang/Object;)Z
    //   307: pop
    //   308: aload_2
    //   309: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   312: invokevirtual add : (Ljava/lang/Object;)Z
    //   315: pop
    //   316: iinc #5, -1
    //   319: goto -> 287
    //   322: iconst_1
    //   323: ireturn
  }
  
  boolean a0(boolean paramBoolean) {
    Z(paramBoolean);
    paramBoolean = false;
    while (l0(this.K, this.L)) {
      this.d = true;
      try {
        d1(this.K, this.L);
        p();
      } finally {
        p();
      } 
    } 
    r1();
    V();
    this.e.b();
    return paramBoolean;
  }
  
  public void a1(Bundle paramBundle, String paramString, Fragment paramFragment) {
    if (paramFragment.u != this) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Fragment ");
      stringBuilder.append(paramFragment);
      stringBuilder.append(" is not currently in the FragmentManager");
      q1(new IllegalStateException(stringBuilder.toString()));
    } 
    paramBundle.putString(paramString, paramFragment.h);
  }
  
  void b0(n paramn, boolean paramBoolean) {
    if (paramBoolean && (this.t == null || this.I))
      return; 
    Z(paramBoolean);
    if (paramn.a(this.K, this.L)) {
      this.d = true;
      try {
        d1(this.K, this.L);
      } finally {
        p();
      } 
    } 
    r1();
    V();
    this.e.b();
  }
  
  void b1(Fragment paramFragment, androidx.core.os.b paramb) {
    HashSet hashSet = this.o.get(paramFragment);
    if (hashSet != null && hashSet.remove(paramb) && hashSet.isEmpty()) {
      this.o.remove(paramFragment);
      if (paramFragment.c < 5) {
        w(paramFragment);
        Q0(paramFragment);
      } 
    } 
  }
  
  void c1(Fragment paramFragment) {
    if (G0(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("remove: ");
      stringBuilder.append(paramFragment);
      stringBuilder.append(" nesting=");
      stringBuilder.append(paramFragment.t);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    boolean bool = paramFragment.f0();
    if (!paramFragment.C || (bool ^ true) != 0) {
      this.e.s(paramFragment);
      if (H0(paramFragment))
        this.F = true; 
      paramFragment.o = true;
      n1(paramFragment);
    } 
  }
  
  void e(a parama) {
    if (this.f == null)
      this.f = new ArrayList<a>(); 
    this.f.add(parama);
  }
  
  public boolean e0() {
    boolean bool = a0(true);
    k0();
    return bool;
  }
  
  void f(Fragment paramFragment, androidx.core.os.b paramb) {
    if (this.o.get(paramFragment) == null)
      this.o.put(paramFragment, new HashSet<androidx.core.os.b>()); 
    ((HashSet<androidx.core.os.b>)this.o.get(paramFragment)).add(paramb);
  }
  
  void f1(Parcelable paramParcelable) {
    if (paramParcelable == null)
      return; 
    FragmentManagerState fragmentManagerState = (FragmentManagerState)paramParcelable;
    if (fragmentManagerState.b == null)
      return; 
    this.e.t();
    for (FragmentState fragmentState : fragmentManagerState.b) {
      if (fragmentState != null) {
        p p;
        Fragment fragment2 = this.O.g(fragmentState.c);
        if (fragment2 != null) {
          if (G0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("restoreSaveState: re-attaching retained ");
            stringBuilder.append(fragment2);
            Log.v("FragmentManager", stringBuilder.toString());
          } 
          p = new p(this.q, this.e, fragment2, fragmentState);
        } else {
          p = new p(this.q, this.e, this.t.k().getClassLoader(), r0(), fragmentState);
        } 
        Fragment fragment1 = p.k();
        fragment1.u = this;
        if (G0(2)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("restoreSaveState: active (");
          stringBuilder.append(fragment1.h);
          stringBuilder.append("): ");
          stringBuilder.append(fragment1);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        p.o(this.t.k().getClassLoader());
        this.e.p(p);
        p.u(this.s);
      } 
    } 
    for (Fragment fragment : this.O.j()) {
      if (!this.e.c(fragment.h)) {
        if (G0(2)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Discarding retained Fragment ");
          stringBuilder.append(fragment);
          stringBuilder.append(" that was not found in the set of active Fragments ");
          stringBuilder.append(fragmentManagerState.b);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        this.O.m(fragment);
        fragment.u = this;
        p p = new p(this.q, this.e, fragment);
        p.u(1);
        p.m();
        fragment.o = true;
        p.m();
      } 
    } 
    this.e.u(fragmentManagerState.c);
    BackStackState[] arrayOfBackStackState = fragmentManagerState.d;
    byte b1 = 0;
    if (arrayOfBackStackState != null) {
      this.f = new ArrayList<a>(fragmentManagerState.d.length);
      byte b2 = 0;
      while (true) {
        arrayOfBackStackState = fragmentManagerState.d;
        if (b2 < arrayOfBackStackState.length) {
          a a = arrayOfBackStackState[b2].a(this);
          if (G0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("restoreAllState: back stack #");
            stringBuilder.append(b2);
            stringBuilder.append(" (index ");
            stringBuilder.append(a.v);
            stringBuilder.append("): ");
            stringBuilder.append(a);
            Log.v("FragmentManager", stringBuilder.toString());
            PrintWriter printWriter = new PrintWriter(new x("FragmentManager"));
            a.w("  ", printWriter, false);
            printWriter.close();
          } 
          this.f.add(a);
          b2++;
          continue;
        } 
        break;
      } 
    } else {
      this.f = null;
    } 
    this.k.set(fragmentManagerState.e);
    String str = fragmentManagerState.f;
    if (str != null) {
      Fragment fragment = g0(str);
      this.w = fragment;
      L(fragment);
    } 
    ArrayList<String> arrayList = fragmentManagerState.g;
    if (arrayList != null)
      for (byte b2 = b1; b2 < arrayList.size(); b2++) {
        Bundle bundle = fragmentManagerState.h.get(b2);
        bundle.setClassLoader(this.t.k().getClassLoader());
        this.l.put(arrayList.get(b2), bundle);
      }  
    this.E = new ArrayDeque<LaunchedFragmentInfo>(fragmentManagerState.i);
  }
  
  p g(Fragment paramFragment) {
    if (G0(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("add: ");
      stringBuilder.append(paramFragment);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    p p = v(paramFragment);
    paramFragment.u = this;
    this.e.p(p);
    if (!paramFragment.C) {
      this.e.a(paramFragment);
      paramFragment.o = false;
      if (paramFragment.J == null)
        paramFragment.P = false; 
      if (H0(paramFragment))
        this.F = true; 
    } 
    return p;
  }
  
  Fragment g0(String paramString) {
    return this.e.f(paramString);
  }
  
  public void h(m paramm) {
    this.r.add(paramm);
  }
  
  public Fragment h0(int paramInt) {
    return this.e.g(paramInt);
  }
  
  Parcelable h1() {
    StringBuilder stringBuilder;
    k0();
    X();
    a0(true);
    this.G = true;
    this.O.n(true);
    ArrayList<FragmentState> arrayList = this.e.v();
    boolean bool = arrayList.isEmpty();
    BackStackState[] arrayOfBackStackState1 = null;
    if (bool) {
      if (G0(2))
        Log.v("FragmentManager", "saveAllState: no fragments!"); 
      return null;
    } 
    ArrayList<String> arrayList1 = this.e.w();
    ArrayList<a> arrayList2 = this.f;
    BackStackState[] arrayOfBackStackState2 = arrayOfBackStackState1;
    if (arrayList2 != null) {
      int k = arrayList2.size();
      arrayOfBackStackState2 = arrayOfBackStackState1;
      if (k > 0) {
        arrayOfBackStackState1 = new BackStackState[k];
        byte b1 = 0;
        while (true) {
          arrayOfBackStackState2 = arrayOfBackStackState1;
          if (b1 < k) {
            arrayOfBackStackState1[b1] = new BackStackState(this.f.get(b1));
            if (G0(2)) {
              stringBuilder = new StringBuilder();
              stringBuilder.append("saveAllState: adding back stack #");
              stringBuilder.append(b1);
              stringBuilder.append(": ");
              stringBuilder.append(this.f.get(b1));
              Log.v("FragmentManager", stringBuilder.toString());
            } 
            b1++;
            continue;
          } 
          break;
        } 
      } 
    } 
    FragmentManagerState fragmentManagerState = new FragmentManagerState();
    fragmentManagerState.b = arrayList;
    fragmentManagerState.c = arrayList1;
    fragmentManagerState.d = (BackStackState[])stringBuilder;
    fragmentManagerState.e = this.k.get();
    Fragment fragment = this.w;
    if (fragment != null)
      fragmentManagerState.f = fragment.h; 
    fragmentManagerState.g.addAll(this.l.keySet());
    fragmentManagerState.h.addAll(this.l.values());
    fragmentManagerState.i = new ArrayList<LaunchedFragmentInfo>(this.E);
    return fragmentManagerState;
  }
  
  int i() {
    return this.k.getAndIncrement();
  }
  
  public Fragment i0(String paramString) {
    return this.e.h(paramString);
  }
  
  public Fragment.SavedState i1(Fragment paramFragment) {
    p p = this.e.m(paramFragment.h);
    if (p == null || !p.k().equals(paramFragment)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Fragment ");
      stringBuilder.append(paramFragment);
      stringBuilder.append(" is not currently in the FragmentManager");
      q1(new IllegalStateException(stringBuilder.toString()));
    } 
    return p.r();
  }
  
  @SuppressLint({"SyntheticAccessor"})
  void j(h<?> paramh, e parame, Fragment paramFragment) {
    if (this.t == null) {
      this.t = paramh;
      this.u = parame;
      this.v = paramFragment;
      if (paramFragment != null) {
        h(new i(this, paramFragment));
      } else if (paramh instanceof m) {
        h((m)paramh);
      } 
      if (this.v != null)
        r1(); 
      if (paramh instanceof androidx.activity.c) {
        Fragment fragment;
        androidx.activity.c c = (androidx.activity.c)paramh;
        OnBackPressedDispatcher onBackPressedDispatcher = c.c();
        this.i = onBackPressedDispatcher;
        if (paramFragment != null)
          fragment = paramFragment; 
        onBackPressedDispatcher.a(fragment, this.j);
      } 
      if (paramFragment != null) {
        this.O = paramFragment.u.n0(paramFragment);
      } else if (paramh instanceof u) {
        this.O = l.i(((u)paramh).h());
      } else {
        this.O = new l(false);
      } 
      this.O.n(L0());
      this.e.x(this.O);
      paramh = this.t;
      if (paramh instanceof androidx.activity.result.d) {
        androidx.activity.result.c c = ((androidx.activity.result.d)paramh).f();
        if (paramFragment != null) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append(paramFragment.h);
          stringBuilder1.append(":");
          str = stringBuilder1.toString();
        } else {
          str = "";
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FragmentManager:");
        stringBuilder.append(str);
        String str = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("StartActivityForResult");
        this.B = c.i(stringBuilder.toString(), (androidx.activity.result.e.a)new androidx.activity.result.e.c(), new j(this));
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("StartIntentSenderForResult");
        this.C = c.i(stringBuilder.toString(), new k(), new a(this));
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("RequestPermissions");
        this.D = c.i(stringBuilder.toString(), (androidx.activity.result.e.a)new androidx.activity.result.e.b(), new b(this));
      } 
      return;
    } 
    throw new IllegalStateException("Already attached");
  }
  
  Fragment j0(String paramString) {
    return this.e.i(paramString);
  }
  
  void j1() {
    synchronized (this.c) {
      boolean bool2;
      ArrayList<p> arrayList = this.N;
      boolean bool1 = false;
      if (arrayList != null && !arrayList.isEmpty()) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      if (this.c.size() == 1)
        bool1 = true; 
      if (bool2 || bool1) {
        this.t.l().removeCallbacks(this.P);
        this.t.l().post(this.P);
        r1();
      } 
      return;
    } 
  }
  
  void k(Fragment paramFragment) {
    if (G0(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("attach: ");
      stringBuilder.append(paramFragment);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    if (paramFragment.C) {
      paramFragment.C = false;
      if (!paramFragment.n) {
        this.e.a(paramFragment);
        if (G0(2)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("add from attach: ");
          stringBuilder.append(paramFragment);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        if (H0(paramFragment))
          this.F = true; 
      } 
    } 
  }
  
  void k1(Fragment paramFragment, boolean paramBoolean) {
    ViewGroup viewGroup = q0(paramFragment);
    if (viewGroup != null && viewGroup instanceof FragmentContainerView)
      ((FragmentContainerView)viewGroup).setDrawDisappearingViewsLast(paramBoolean ^ true); 
  }
  
  public s l() {
    return new a(this);
  }
  
  void l1(Fragment paramFragment, Lifecycle.State paramState) {
    if (paramFragment.equals(g0(paramFragment.h)) && (paramFragment.v == null || paramFragment.u == this)) {
      paramFragment.T = paramState;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(paramFragment);
    stringBuilder.append(" is not an active fragment of FragmentManager ");
    stringBuilder.append(this);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public int m0() {
    boolean bool;
    ArrayList<a> arrayList = this.f;
    if (arrayList != null) {
      bool = arrayList.size();
    } else {
      bool = false;
    } 
    return bool;
  }
  
  void m1(Fragment paramFragment) {
    if (paramFragment == null || (paramFragment.equals(g0(paramFragment.h)) && (paramFragment.v == null || paramFragment.u == this))) {
      Fragment fragment = this.w;
      this.w = paramFragment;
      L(fragment);
      L(this.w);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(paramFragment);
    stringBuilder.append(" is not an active fragment of FragmentManager ");
    stringBuilder.append(this);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  boolean n() {
    Iterator<Fragment> iterator = this.e.l().iterator();
    boolean bool = false;
    while (iterator.hasNext()) {
      Fragment fragment = iterator.next();
      boolean bool1 = bool;
      if (fragment != null)
        bool1 = H0(fragment); 
      bool = bool1;
      if (bool1)
        return true; 
    } 
    return false;
  }
  
  e o0() {
    return this.u;
  }
  
  void o1(Fragment paramFragment) {
    if (G0(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("show: ");
      stringBuilder.append(paramFragment);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    if (paramFragment.B) {
      paramFragment.B = false;
      paramFragment.P ^= 0x1;
    } 
  }
  
  public Fragment p0(Bundle paramBundle, String paramString) {
    String str = paramBundle.getString(paramString);
    if (str == null)
      return null; 
    Fragment fragment = g0(str);
    if (fragment == null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Fragment no longer exists for key ");
      stringBuilder.append(paramString);
      stringBuilder.append(": unique id ");
      stringBuilder.append(str);
      q1(new IllegalStateException(stringBuilder.toString()));
    } 
    return fragment;
  }
  
  public final void q(String paramString) {
    this.l.remove(paramString);
  }
  
  public g r0() {
    g g1 = this.x;
    if (g1 != null)
      return g1; 
    Fragment fragment = this.v;
    return (fragment != null) ? fragment.u.r0() : this.y;
  }
  
  r s0() {
    return this.e;
  }
  
  void t(a parama, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    if (paramBoolean1) {
      parama.y(paramBoolean3);
    } else {
      parama.x();
    } 
    ArrayList<a> arrayList = new ArrayList(1);
    ArrayList<Boolean> arrayList1 = new ArrayList(1);
    arrayList.add(parama);
    arrayList1.add(Boolean.valueOf(paramBoolean1));
    if (paramBoolean2 && this.s >= 1)
      t.B(this.t.k(), this.u, arrayList, arrayList1, 0, 1, true, this.p); 
    if (paramBoolean3)
      P0(this.s, true); 
    for (Fragment fragment : this.e.l()) {
      if (fragment != null && fragment.J != null && fragment.O && parama.B(fragment.z)) {
        float f = fragment.Q;
        if (f > 0.0F)
          fragment.J.setAlpha(f); 
        if (paramBoolean3) {
          fragment.Q = 0.0F;
          continue;
        } 
        fragment.Q = -1.0F;
        fragment.O = false;
      } 
    } 
  }
  
  public List<Fragment> t0() {
    return this.e.n();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append("FragmentManager{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" in ");
    Fragment fragment = this.v;
    if (fragment != null) {
      stringBuilder.append(fragment.getClass().getSimpleName());
      stringBuilder.append("{");
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this.v)));
      stringBuilder.append("}");
    } else {
      h<?> h1 = this.t;
      if (h1 != null) {
        stringBuilder.append(h1.getClass().getSimpleName());
        stringBuilder.append("{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this.t)));
        stringBuilder.append("}");
      } else {
        stringBuilder.append("null");
      } 
    } 
    stringBuilder.append("}}");
    return stringBuilder.toString();
  }
  
  h<?> u0() {
    return this.t;
  }
  
  p v(Fragment paramFragment) {
    p p2 = this.e.m(paramFragment.h);
    if (p2 != null)
      return p2; 
    p p1 = new p(this.q, this.e, paramFragment);
    p1.o(this.t.k().getClassLoader());
    p1.u(this.s);
    return p1;
  }
  
  LayoutInflater.Factory2 v0() {
    return this.h;
  }
  
  j w0() {
    return this.q;
  }
  
  void x(Fragment paramFragment) {
    if (G0(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("detach: ");
      stringBuilder.append(paramFragment);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    if (!paramFragment.C) {
      paramFragment.C = true;
      if (paramFragment.n) {
        if (G0(2)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("remove from detach: ");
          stringBuilder.append(paramFragment);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        this.e.s(paramFragment);
        if (H0(paramFragment))
          this.F = true; 
        n1(paramFragment);
      } 
    } 
  }
  
  Fragment x0() {
    return this.v;
  }
  
  void y() {
    this.G = false;
    this.H = false;
    this.O.n(false);
    S(4);
  }
  
  public Fragment y0() {
    return this.w;
  }
  
  void z() {
    this.G = false;
    this.H = false;
    this.O.n(false);
    S(0);
  }
  
  y z0() {
    y y1 = this.z;
    if (y1 != null)
      return y1; 
    Fragment fragment = this.v;
    return (fragment != null) ? fragment.u.z0() : this.A;
  }
  
  @SuppressLint({"BanParcelableUsage"})
  static class LaunchedFragmentInfo implements Parcelable {
    public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();
    
    String b;
    
    int c;
    
    LaunchedFragmentInfo(Parcel param1Parcel) {
      this.b = param1Parcel.readString();
      this.c = param1Parcel.readInt();
    }
    
    LaunchedFragmentInfo(String param1String, int param1Int) {
      this.b = param1String;
      this.c = param1Int;
    }
    
    public int describeContents() {
      return 0;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeString(this.b);
      param1Parcel.writeInt(this.c);
    }
    
    class a implements Parcelable.Creator<LaunchedFragmentInfo> {
      public FragmentManager.LaunchedFragmentInfo a(Parcel param2Parcel) {
        return new FragmentManager.LaunchedFragmentInfo(param2Parcel);
      }
      
      public FragmentManager.LaunchedFragmentInfo[] b(int param2Int) {
        return new FragmentManager.LaunchedFragmentInfo[param2Int];
      }
    }
  }
  
  class a implements Parcelable.Creator<LaunchedFragmentInfo> {
    public FragmentManager.LaunchedFragmentInfo a(Parcel param1Parcel) {
      return new FragmentManager.LaunchedFragmentInfo(param1Parcel);
    }
    
    public FragmentManager.LaunchedFragmentInfo[] b(int param1Int) {
      return new FragmentManager.LaunchedFragmentInfo[param1Int];
    }
  }
  
  class a implements androidx.activity.result.a<ActivityResult> {
    a(FragmentManager this$0) {}
    
    public void b(ActivityResult param1ActivityResult) {
      StringBuilder stringBuilder;
      FragmentManager.LaunchedFragmentInfo launchedFragmentInfo = this.a.E.pollFirst();
      if (launchedFragmentInfo == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("No IntentSenders were started for ");
        stringBuilder.append(this);
        Log.w("FragmentManager", stringBuilder.toString());
        return;
      } 
      String str = launchedFragmentInfo.b;
      int i = launchedFragmentInfo.c;
      Fragment fragment = FragmentManager.c(this.a).i(str);
      if (fragment == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Intent Sender result delivered for unknown Fragment ");
        stringBuilder.append(str);
        Log.w("FragmentManager", stringBuilder.toString());
        return;
      } 
      fragment.n0(i, stringBuilder.b(), stringBuilder.a());
    }
  }
  
  class b implements androidx.activity.result.a<Map<String, Boolean>> {
    b(FragmentManager this$0) {}
    
    @SuppressLint({"SyntheticAccessor"})
    public void b(Map<String, Boolean> param1Map) {
      StringBuilder stringBuilder;
      String[] arrayOfString = (String[])param1Map.keySet().toArray((Object[])new String[0]);
      ArrayList<Boolean> arrayList = new ArrayList(param1Map.values());
      int[] arrayOfInt = new int[arrayList.size()];
      int i;
      for (i = 0; i < arrayList.size(); i++) {
        byte b1;
        if (((Boolean)arrayList.get(i)).booleanValue()) {
          b1 = 0;
        } else {
          b1 = -1;
        } 
        arrayOfInt[i] = b1;
      } 
      FragmentManager.LaunchedFragmentInfo launchedFragmentInfo = this.a.E.pollFirst();
      if (launchedFragmentInfo == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("No permissions were requested for ");
        stringBuilder.append(this);
        Log.w("FragmentManager", stringBuilder.toString());
        return;
      } 
      String str = launchedFragmentInfo.b;
      i = launchedFragmentInfo.c;
      Fragment fragment = FragmentManager.c(this.a).i(str);
      if (fragment == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Permission request result delivered for unknown Fragment ");
        stringBuilder.append(str);
        Log.w("FragmentManager", stringBuilder.toString());
        return;
      } 
      fragment.M0(i, arrayOfString, (int[])stringBuilder);
    }
  }
  
  class c extends androidx.activity.b {
    c(FragmentManager this$0, boolean param1Boolean) {
      super(param1Boolean);
    }
    
    public void b() {
      this.c.C0();
    }
  }
  
  class d implements t.g {
    d(FragmentManager this$0) {}
    
    public void a(Fragment param1Fragment, androidx.core.os.b param1b) {
      if (!param1b.b())
        this.a.b1(param1Fragment, param1b); 
    }
    
    public void b(Fragment param1Fragment, androidx.core.os.b param1b) {
      this.a.f(param1Fragment, param1b);
    }
  }
  
  class e extends g {
    e(FragmentManager this$0) {}
    
    public Fragment a(ClassLoader param1ClassLoader, String param1String) {
      return this.b.u0().d(this.b.u0().k(), param1String, null);
    }
  }
  
  class f implements y {
    f(FragmentManager this$0) {}
    
    public SpecialEffectsController a(ViewGroup param1ViewGroup) {
      return new b(param1ViewGroup);
    }
  }
  
  class g implements Runnable {
    g(FragmentManager this$0) {}
    
    public void run() {
      this.b.a0(true);
    }
  }
  
  class h extends AnimatorListenerAdapter {
    h(FragmentManager this$0, ViewGroup param1ViewGroup, View param1View, Fragment param1Fragment) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      this.a.endViewTransition(this.b);
      param1Animator.removeListener((Animator.AnimatorListener)this);
      Fragment fragment = this.c;
      View view = fragment.J;
      if (view != null && fragment.B)
        view.setVisibility(8); 
    }
  }
  
  class i implements m {
    i(FragmentManager this$0, Fragment param1Fragment) {}
    
    public void b(FragmentManager param1FragmentManager, Fragment param1Fragment) {
      this.b.q0(param1Fragment);
    }
  }
  
  class j implements androidx.activity.result.a<ActivityResult> {
    j(FragmentManager this$0) {}
    
    public void b(ActivityResult param1ActivityResult) {
      StringBuilder stringBuilder;
      FragmentManager.LaunchedFragmentInfo launchedFragmentInfo = this.a.E.pollFirst();
      if (launchedFragmentInfo == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("No Activities were started for result for ");
        stringBuilder.append(this);
        Log.w("FragmentManager", stringBuilder.toString());
        return;
      } 
      String str = launchedFragmentInfo.b;
      int i = launchedFragmentInfo.c;
      Fragment fragment = FragmentManager.c(this.a).i(str);
      if (fragment == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Activity result delivered for unknown Fragment ");
        stringBuilder.append(str);
        Log.w("FragmentManager", stringBuilder.toString());
        return;
      } 
      fragment.n0(i, stringBuilder.b(), stringBuilder.a());
    }
  }
  
  static class k extends androidx.activity.result.e.a<IntentSenderRequest, ActivityResult> {
    public Intent d(Context param1Context, IntentSenderRequest param1IntentSenderRequest) {
      Intent intent1 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
      Intent intent2 = param1IntentSenderRequest.a();
      IntentSenderRequest intentSenderRequest = param1IntentSenderRequest;
      if (intent2 != null) {
        Bundle bundle = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        intentSenderRequest = param1IntentSenderRequest;
        if (bundle != null) {
          intent1.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
          intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
          intentSenderRequest = param1IntentSenderRequest;
          if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false))
            intentSenderRequest = (new IntentSenderRequest.b(param1IntentSenderRequest.d())).b(null).c(param1IntentSenderRequest.c(), param1IntentSenderRequest.b()).a(); 
        } 
      } 
      intent1.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (Parcelable)intentSenderRequest);
      if (FragmentManager.G0(2)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CreateIntent created the following intent: ");
        stringBuilder.append(intent1);
        Log.v("FragmentManager", stringBuilder.toString());
      } 
      return intent1;
    }
    
    public ActivityResult e(int param1Int, Intent param1Intent) {
      return new ActivityResult(param1Int, param1Intent);
    }
  }
  
  public static abstract class l {}
  
  public static interface m {
    void a();
  }
  
  static interface n {
    boolean a(ArrayList<a> param1ArrayList, ArrayList<Boolean> param1ArrayList1);
  }
  
  private class o implements n {
    final String a;
    
    final int b;
    
    final int c;
    
    o(FragmentManager this$0, String param1String, int param1Int1, int param1Int2) {
      this.a = param1String;
      this.b = param1Int1;
      this.c = param1Int2;
    }
    
    public boolean a(ArrayList<a> param1ArrayList, ArrayList<Boolean> param1ArrayList1) {
      Fragment fragment = this.d.w;
      return (fragment != null && this.b < 0 && this.a == null && fragment.s().W0()) ? false : this.d.Y0(param1ArrayList, param1ArrayList1, this.a, this.b, this.c);
    }
  }
  
  static class p implements Fragment.g {
    final boolean a;
    
    final a b;
    
    private int c;
    
    p(a param1a, boolean param1Boolean) {
      this.a = param1Boolean;
      this.b = param1a;
    }
    
    public void a() {
      this.c++;
    }
    
    public void b() {
      int i = this.c - 1;
      this.c = i;
      if (i != 0)
        return; 
      this.b.t.j1();
    }
    
    void c() {
      a a1 = this.b;
      a1.t.t(a1, this.a, false, false);
    }
    
    void d() {
      boolean bool;
      if (this.c > 0) {
        bool = true;
      } else {
        bool = false;
      } 
      for (Fragment fragment : this.b.t.t0()) {
        fragment.H1(null);
        if (bool && fragment.h0())
          fragment.P1(); 
      } 
      a a1 = this.b;
      a1.t.t(a1, this.a, bool ^ true, true);
    }
    
    public boolean e() {
      boolean bool;
      if (this.c == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/FragmentManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */