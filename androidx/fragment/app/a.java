package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.Lifecycle;
import java.io.PrintWriter;
import java.util.ArrayList;

final class a extends s implements FragmentManager.n {
  final FragmentManager t;
  
  boolean u;
  
  int v;
  
  a(FragmentManager paramFragmentManager) {
    super(g, classLoader);
    ClassLoader classLoader;
    this.v = -1;
    this.t = paramFragmentManager;
  }
  
  private static boolean D(s.a parama) {
    boolean bool;
    Fragment fragment = parama.b;
    if (fragment != null && fragment.n && fragment.J != null && !fragment.C && !fragment.B && fragment.h0()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public String A() {
    return this.k;
  }
  
  boolean B(int paramInt) {
    int i = this.c.size();
    for (byte b = 0; b < i; b++) {
      int j;
      Fragment fragment = ((s.a)this.c.get(b)).b;
      if (fragment != null) {
        j = fragment.z;
      } else {
        j = 0;
      } 
      if (j && j == paramInt)
        return true; 
    } 
    return false;
  }
  
  boolean C(ArrayList<a> paramArrayList, int paramInt1, int paramInt2) {
    if (paramInt2 == paramInt1)
      return false; 
    int i = this.c.size();
    int j = -1;
    byte b = 0;
    while (b < i) {
      int k;
      Fragment fragment = ((s.a)this.c.get(b)).b;
      if (fragment != null) {
        k = fragment.z;
      } else {
        k = 0;
      } 
      int m = j;
      if (k) {
        m = j;
        if (k != j) {
          for (j = paramInt1; j < paramInt2; j++) {
            a a1 = paramArrayList.get(j);
            int i1 = a1.c.size();
            for (m = 0; m < i1; m++) {
              int i2;
              fragment = ((s.a)a1.c.get(m)).b;
              if (fragment != null) {
                i2 = fragment.z;
              } else {
                i2 = 0;
              } 
              if (i2 == k)
                return true; 
            } 
          } 
          m = k;
        } 
      } 
      b++;
      j = m;
    } 
    return false;
  }
  
  boolean E() {
    for (byte b = 0; b < this.c.size(); b++) {
      if (D(this.c.get(b)))
        return true; 
    } 
    return false;
  }
  
  public void F() {
    if (this.s != null) {
      for (byte b = 0; b < this.s.size(); b++)
        ((Runnable)this.s.get(b)).run(); 
      this.s = null;
    } 
  }
  
  void G(Fragment.g paramg) {
    for (byte b = 0; b < this.c.size(); b++) {
      s.a a1 = this.c.get(b);
      if (D(a1))
        a1.b.H1(paramg); 
    } 
  }
  
  Fragment H(ArrayList<Fragment> paramArrayList, Fragment paramFragment) {
    int i = this.c.size() - 1;
    while (i >= 0) {
      s.a a1 = this.c.get(i);
      int j = a1.a;
      if (j != 1)
        if (j != 3) {
          switch (j) {
            case 10:
              a1.h = a1.g;
              break;
            case 9:
              paramFragment = a1.b;
              break;
            case 8:
              paramFragment = null;
              break;
            case 6:
              paramArrayList.add(a1.b);
              break;
            case 7:
              paramArrayList.remove(a1.b);
              break;
          } 
          i--;
        }  
    } 
    return paramFragment;
  }
  
  public boolean a(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1) {
    if (FragmentManager.G0(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Run: ");
      stringBuilder.append(this);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    paramArrayList.add(this);
    paramArrayList1.add(Boolean.FALSE);
    if (this.i)
      this.t.e(this); 
    return true;
  }
  
  public int h() {
    return u(false);
  }
  
  public int i() {
    return u(true);
  }
  
  public void j() {
    m();
    this.t.b0(this, false);
  }
  
  public void k() {
    m();
    this.t.b0(this, true);
  }
  
  public s l(Fragment paramFragment) {
    FragmentManager fragmentManager = paramFragment.u;
    if (fragmentManager == null || fragmentManager == this.t)
      return super.l(paramFragment); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
    stringBuilder.append(paramFragment.toString());
    stringBuilder.append(" is already attached to a FragmentManager.");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  void n(int paramInt1, Fragment paramFragment, String paramString, int paramInt2) {
    super.n(paramInt1, paramFragment, paramString, paramInt2);
    paramFragment.u = this.t;
  }
  
  public s o(Fragment paramFragment) {
    FragmentManager fragmentManager = paramFragment.u;
    if (fragmentManager == null || fragmentManager == this.t)
      return super.o(paramFragment); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
    stringBuilder.append(paramFragment.toString());
    stringBuilder.append(" is already attached to a FragmentManager.");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public s r(Fragment paramFragment, Lifecycle.State paramState) {
    if (paramFragment.u == this.t) {
      if (paramState != Lifecycle.State.c || paramFragment.c <= -1) {
        if (paramState != Lifecycle.State.b)
          return super.r(paramFragment, paramState); 
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Cannot set maximum Lifecycle to ");
        stringBuilder2.append(paramState);
        stringBuilder2.append(". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        throw new IllegalArgumentException(stringBuilder2.toString());
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Cannot set maximum Lifecycle to ");
      stringBuilder1.append(paramState);
      stringBuilder1.append(" after the Fragment has been created");
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
    stringBuilder.append(this.t);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  void t(int paramInt) {
    if (!this.i)
      return; 
    if (FragmentManager.G0(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Bump nesting in ");
      stringBuilder.append(this);
      stringBuilder.append(" by ");
      stringBuilder.append(paramInt);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    int i = this.c.size();
    for (byte b = 0; b < i; b++) {
      s.a a1 = this.c.get(b);
      Fragment fragment = a1.b;
      if (fragment != null) {
        fragment.t += paramInt;
        if (FragmentManager.G0(2)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Bump nesting of ");
          stringBuilder.append(a1.b);
          stringBuilder.append(" to ");
          stringBuilder.append(a1.b.t);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
      } 
    } 
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append("BackStackEntry{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this.v >= 0) {
      stringBuilder.append(" #");
      stringBuilder.append(this.v);
    } 
    if (this.k != null) {
      stringBuilder.append(" ");
      stringBuilder.append(this.k);
    } 
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  int u(boolean paramBoolean) {
    if (!this.u) {
      if (FragmentManager.G0(2)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Commit: ");
        stringBuilder.append(this);
        Log.v("FragmentManager", stringBuilder.toString());
        PrintWriter printWriter = new PrintWriter(new x("FragmentManager"));
        v("  ", printWriter);
        printWriter.close();
      } 
      this.u = true;
      if (this.i) {
        this.v = this.t.i();
      } else {
        this.v = -1;
      } 
      this.t.Y(this, paramBoolean);
      return this.v;
    } 
    throw new IllegalStateException("commit already called");
  }
  
  public void v(String paramString, PrintWriter paramPrintWriter) {
    w(paramString, paramPrintWriter, true);
  }
  
  public void w(String paramString, PrintWriter paramPrintWriter, boolean paramBoolean) {
    if (paramBoolean) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mName=");
      paramPrintWriter.print(this.k);
      paramPrintWriter.print(" mIndex=");
      paramPrintWriter.print(this.v);
      paramPrintWriter.print(" mCommitted=");
      paramPrintWriter.println(this.u);
      if (this.h != 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        paramPrintWriter.print(Integer.toHexString(this.h));
      } 
      if (this.d != 0 || this.e != 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.d));
        paramPrintWriter.print(" mExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.e));
      } 
      if (this.f != 0 || this.g != 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.f));
        paramPrintWriter.print(" mPopExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.g));
      } 
      if (this.l != 0 || this.m != null) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.l));
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        paramPrintWriter.println(this.m);
      } 
      if (this.n != 0 || this.o != null) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.n));
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        paramPrintWriter.println(this.o);
      } 
    } 
    if (!this.c.isEmpty()) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      int i = this.c.size();
      for (byte b = 0; b < i; b++) {
        StringBuilder stringBuilder;
        String str;
        s.a a1 = this.c.get(b);
        switch (a1.a) {
          default:
            stringBuilder = new StringBuilder();
            stringBuilder.append("cmd=");
            stringBuilder.append(a1.a);
            str = stringBuilder.toString();
            break;
          case 10:
            str = "OP_SET_MAX_LIFECYCLE";
            break;
          case 9:
            str = "UNSET_PRIMARY_NAV";
            break;
          case 8:
            str = "SET_PRIMARY_NAV";
            break;
          case 7:
            str = "ATTACH";
            break;
          case 6:
            str = "DETACH";
            break;
          case 5:
            str = "SHOW";
            break;
          case 4:
            str = "HIDE";
            break;
          case 3:
            str = "REMOVE";
            break;
          case 2:
            str = "REPLACE";
            break;
          case 1:
            str = "ADD";
            break;
          case 0:
            str = "NULL";
            break;
        } 
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  Op #");
        paramPrintWriter.print(b);
        paramPrintWriter.print(": ");
        paramPrintWriter.print(str);
        paramPrintWriter.print(" ");
        paramPrintWriter.println(a1.b);
        if (paramBoolean) {
          if (a1.c != 0 || a1.d != 0) {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("enterAnim=#");
            paramPrintWriter.print(Integer.toHexString(a1.c));
            paramPrintWriter.print(" exitAnim=#");
            paramPrintWriter.println(Integer.toHexString(a1.d));
          } 
          if (a1.e != 0 || a1.f != 0) {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("popEnterAnim=#");
            paramPrintWriter.print(Integer.toHexString(a1.e));
            paramPrintWriter.print(" popExitAnim=#");
            paramPrintWriter.println(Integer.toHexString(a1.f));
          } 
        } 
      } 
    } 
  }
  
  void x() {
    int i = this.c.size();
    for (byte b = 0; b < i; b++) {
      StringBuilder stringBuilder;
      s.a a1 = this.c.get(b);
      Fragment fragment = a1.b;
      if (fragment != null) {
        fragment.I1(false);
        fragment.G1(this.h);
        fragment.K1(this.p, this.q);
      } 
      switch (a1.a) {
        default:
          stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown cmd: ");
          stringBuilder.append(a1.a);
          throw new IllegalArgumentException(stringBuilder.toString());
        case 10:
          this.t.l1((Fragment)stringBuilder, a1.h);
          break;
        case 9:
          this.t.m1(null);
          break;
        case 8:
          this.t.m1((Fragment)stringBuilder);
          break;
        case 7:
          stringBuilder.z1(a1.c, a1.d, a1.e, a1.f);
          this.t.k1((Fragment)stringBuilder, false);
          this.t.k((Fragment)stringBuilder);
          break;
        case 6:
          stringBuilder.z1(a1.c, a1.d, a1.e, a1.f);
          this.t.x((Fragment)stringBuilder);
          break;
        case 5:
          stringBuilder.z1(a1.c, a1.d, a1.e, a1.f);
          this.t.k1((Fragment)stringBuilder, false);
          this.t.o1((Fragment)stringBuilder);
          break;
        case 4:
          stringBuilder.z1(a1.c, a1.d, a1.e, a1.f);
          this.t.D0((Fragment)stringBuilder);
          break;
        case 3:
          stringBuilder.z1(a1.c, a1.d, a1.e, a1.f);
          this.t.c1((Fragment)stringBuilder);
          break;
        case 1:
          stringBuilder.z1(a1.c, a1.d, a1.e, a1.f);
          this.t.k1((Fragment)stringBuilder, false);
          this.t.g((Fragment)stringBuilder);
          break;
      } 
      if (!this.r && a1.a != 1 && stringBuilder != null && !FragmentManager.b)
        this.t.O0((Fragment)stringBuilder); 
    } 
    if (!this.r && !FragmentManager.b) {
      FragmentManager fragmentManager = this.t;
      fragmentManager.P0(fragmentManager.s, true);
    } 
  }
  
  void y(boolean paramBoolean) {
    for (int i = this.c.size() - 1; i >= 0; i--) {
      StringBuilder stringBuilder;
      s.a a1 = this.c.get(i);
      Fragment fragment = a1.b;
      if (fragment != null) {
        fragment.I1(true);
        fragment.G1(FragmentManager.g1(this.h));
        fragment.K1(this.q, this.p);
      } 
      switch (a1.a) {
        default:
          stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown cmd: ");
          stringBuilder.append(a1.a);
          throw new IllegalArgumentException(stringBuilder.toString());
        case 10:
          this.t.l1((Fragment)stringBuilder, a1.g);
          break;
        case 9:
          this.t.m1((Fragment)stringBuilder);
          break;
        case 8:
          this.t.m1(null);
          break;
        case 7:
          stringBuilder.z1(a1.c, a1.d, a1.e, a1.f);
          this.t.k1((Fragment)stringBuilder, true);
          this.t.x((Fragment)stringBuilder);
          break;
        case 6:
          stringBuilder.z1(a1.c, a1.d, a1.e, a1.f);
          this.t.k((Fragment)stringBuilder);
          break;
        case 5:
          stringBuilder.z1(a1.c, a1.d, a1.e, a1.f);
          this.t.k1((Fragment)stringBuilder, true);
          this.t.D0((Fragment)stringBuilder);
          break;
        case 4:
          stringBuilder.z1(a1.c, a1.d, a1.e, a1.f);
          this.t.o1((Fragment)stringBuilder);
          break;
        case 3:
          stringBuilder.z1(a1.c, a1.d, a1.e, a1.f);
          this.t.g((Fragment)stringBuilder);
          break;
        case 1:
          stringBuilder.z1(a1.c, a1.d, a1.e, a1.f);
          this.t.k1((Fragment)stringBuilder, true);
          this.t.c1((Fragment)stringBuilder);
          break;
      } 
      if (!this.r && a1.a != 3 && stringBuilder != null && !FragmentManager.b)
        this.t.O0((Fragment)stringBuilder); 
    } 
    if (!this.r && paramBoolean && !FragmentManager.b) {
      FragmentManager fragmentManager = this.t;
      fragmentManager.P0(fragmentManager.s, true);
    } 
  }
  
  Fragment z(ArrayList<Fragment> paramArrayList, Fragment paramFragment) {
    int i = 0;
    Fragment fragment;
    for (fragment = paramFragment; i < this.c.size(); fragment = paramFragment) {
      s.a a1 = this.c.get(i);
      int j = a1.a;
      if (j != 1)
        if (j != 2) {
          if (j != 3 && j != 6) {
            if (j != 7) {
              if (j != 8) {
                paramFragment = fragment;
                j = i;
              } else {
                this.c.add(i, new s.a(9, fragment));
                j = i + 1;
                paramFragment = a1.b;
              } 
              continue;
            } 
          } else {
            paramArrayList.remove(a1.b);
            Fragment fragment1 = a1.b;
            paramFragment = fragment;
            j = i;
            if (fragment1 == fragment) {
              this.c.add(i, new s.a(9, fragment1));
              j = i + 1;
              paramFragment = null;
            } 
            continue;
          } 
        } else {
          Fragment fragment1 = a1.b;
          int k = fragment1.z;
          int m = paramArrayList.size() - 1;
          int i1 = 0;
          j = i;
          paramFragment = fragment;
          while (m >= 0) {
            Fragment fragment2 = paramArrayList.get(m);
            fragment = paramFragment;
            int i2 = j;
            i = i1;
            if (fragment2.z == k)
              if (fragment2 == fragment1) {
                i = 1;
                fragment = paramFragment;
                i2 = j;
              } else {
                fragment = paramFragment;
                i = j;
                if (fragment2 == paramFragment) {
                  this.c.add(j, new s.a(9, fragment2));
                  i = j + 1;
                  fragment = null;
                } 
                s.a a2 = new s.a(3, fragment2);
                a2.c = a1.c;
                a2.e = a1.e;
                a2.d = a1.d;
                a2.f = a1.f;
                this.c.add(i, a2);
                paramArrayList.remove(fragment2);
                i2 = i + 1;
                i = i1;
              }  
            m--;
            paramFragment = fragment;
            j = i2;
            i1 = i;
          } 
          if (i1 != 0) {
            this.c.remove(j);
            j--;
          } else {
            a1.a = 1;
            paramArrayList.add(fragment1);
          } 
          continue;
        }  
      paramArrayList.add(a1.b);
      j = i;
      paramFragment = fragment;
      continue;
      i = SYNTHETIC_LOCAL_VARIABLE_6 + 1;
    } 
    return fragment;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */