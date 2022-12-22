package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.x.b {
  int A = -1;
  
  int B = Integer.MIN_VALUE;
  
  private boolean C;
  
  SavedState D = null;
  
  final a E = new a();
  
  private final b F = new b();
  
  private int G = 2;
  
  private int[] H = new int[2];
  
  int s = 1;
  
  private c t;
  
  i u;
  
  private boolean v;
  
  private boolean w = false;
  
  boolean x = false;
  
  private boolean y = false;
  
  private boolean z = true;
  
  public LinearLayoutManager(Context paramContext) {
    this(paramContext, 1, false);
  }
  
  public LinearLayoutManager(Context paramContext, int paramInt, boolean paramBoolean) {
    z2(paramInt);
    A2(paramBoolean);
  }
  
  public LinearLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    RecyclerView.o.d d = RecyclerView.o.i0(paramContext, paramAttributeSet, paramInt1, paramInt2);
    z2(d.a);
    A2(d.c);
    C2(d.d);
  }
  
  private boolean D2(RecyclerView.u paramu, RecyclerView.y paramy, a parama) {
    int j = J();
    boolean bool = false;
    if (j == 0)
      return false; 
    View view2 = V();
    if (view2 != null && parama.d(view2, paramy)) {
      parama.c(view2, h0(view2));
      return true;
    } 
    boolean bool1 = this.v;
    boolean bool2 = this.y;
    if (bool1 != bool2)
      return false; 
    View view1 = g2(paramu, paramy, parama.d, bool2);
    if (view1 != null) {
      parama.b(view1, h0(view1));
      if (!paramy.e() && M1()) {
        int k = this.u.g(view1);
        int m = this.u.d(view1);
        int n = this.u.m();
        int i1 = this.u.i();
        if (m <= n && k < n) {
          j = 1;
        } else {
          j = 0;
        } 
        boolean bool3 = bool;
        if (k >= i1) {
          bool3 = bool;
          if (m > i1)
            bool3 = true; 
        } 
        if (j != 0 || bool3) {
          j = n;
          if (parama.d)
            j = i1; 
          parama.c = j;
        } 
      } 
      return true;
    } 
    return false;
  }
  
  private boolean E2(RecyclerView.y paramy, a parama) {
    boolean bool = paramy.e();
    boolean bool1 = false;
    if (!bool) {
      int j = this.A;
      if (j != -1) {
        if (j < 0 || j >= paramy.b()) {
          this.A = -1;
          this.B = Integer.MIN_VALUE;
          return false;
        } 
        parama.b = this.A;
        SavedState savedState = this.D;
        if (savedState != null && savedState.a()) {
          bool = this.D.d;
          parama.d = bool;
          if (bool) {
            parama.c = this.u.i() - this.D.c;
          } else {
            parama.c = this.u.m() + this.D.c;
          } 
          return true;
        } 
        if (this.B == Integer.MIN_VALUE) {
          View view = C(this.A);
          if (view != null) {
            if (this.u.e(view) > this.u.n()) {
              parama.a();
              return true;
            } 
            if (this.u.g(view) - this.u.m() < 0) {
              parama.c = this.u.m();
              parama.d = false;
              return true;
            } 
            if (this.u.i() - this.u.d(view) < 0) {
              parama.c = this.u.i();
              parama.d = true;
              return true;
            } 
            if (parama.d) {
              j = this.u.d(view) + this.u.o();
            } else {
              j = this.u.g(view);
            } 
            parama.c = j;
          } else {
            if (J() > 0) {
              j = h0(I(0));
              if (this.A < j) {
                bool = true;
              } else {
                bool = false;
              } 
              if (bool == this.x)
                bool1 = true; 
              parama.d = bool1;
            } 
            parama.a();
          } 
          return true;
        } 
        bool = this.x;
        parama.d = bool;
        if (bool) {
          parama.c = this.u.i() - this.B;
        } else {
          parama.c = this.u.m() + this.B;
        } 
        return true;
      } 
    } 
    return false;
  }
  
  private void F2(RecyclerView.u paramu, RecyclerView.y paramy, a parama) {
    boolean bool;
    if (E2(paramy, parama))
      return; 
    if (D2(paramu, paramy, parama))
      return; 
    parama.a();
    if (this.y) {
      bool = paramy.b() - 1;
    } else {
      bool = false;
    } 
    parama.b = bool;
  }
  
  private void G2(int paramInt1, int paramInt2, boolean paramBoolean, RecyclerView.y paramy) {
    this.t.m = w2();
    this.t.f = paramInt1;
    int[] arrayOfInt = this.H;
    boolean bool1 = false;
    arrayOfInt[0] = 0;
    boolean bool2 = true;
    boolean bool3 = true;
    arrayOfInt[1] = 0;
    N1(paramy, arrayOfInt);
    int j = Math.max(0, this.H[0]);
    int k = Math.max(0, this.H[1]);
    if (paramInt1 == 1)
      bool1 = true; 
    c c1 = this.t;
    if (bool1) {
      paramInt1 = k;
    } else {
      paramInt1 = j;
    } 
    c1.h = paramInt1;
    if (bool1)
      k = j; 
    c1.i = k;
    if (bool1) {
      c1.h = paramInt1 + this.u.j();
      View view = j2();
      c1 = this.t;
      paramInt1 = bool3;
      if (this.x)
        paramInt1 = -1; 
      c1.e = paramInt1;
      paramInt1 = h0(view);
      c c2 = this.t;
      c1.d = paramInt1 + c2.e;
      c2.b = this.u.d(view);
      paramInt1 = this.u.d(view) - this.u.i();
    } else {
      View view = k2();
      c c2 = this.t;
      c2.h += this.u.m();
      c c3 = this.t;
      if (this.x) {
        paramInt1 = bool2;
      } else {
        paramInt1 = -1;
      } 
      c3.e = paramInt1;
      paramInt1 = h0(view);
      c2 = this.t;
      c3.d = paramInt1 + c2.e;
      c2.b = this.u.g(view);
      paramInt1 = -this.u.g(view) + this.u.m();
    } 
    c1 = this.t;
    c1.c = paramInt2;
    if (paramBoolean)
      c1.c = paramInt2 - paramInt1; 
    c1.g = paramInt1;
  }
  
  private void H2(int paramInt1, int paramInt2) {
    boolean bool;
    this.t.c = this.u.i() - paramInt2;
    c c1 = this.t;
    if (this.x) {
      bool = true;
    } else {
      bool = true;
    } 
    c1.e = bool;
    c1.d = paramInt1;
    c1.f = 1;
    c1.b = paramInt2;
    c1.g = Integer.MIN_VALUE;
  }
  
  private void I2(a parama) {
    H2(parama.b, parama.c);
  }
  
  private void J2(int paramInt1, int paramInt2) {
    this.t.c = paramInt2 - this.u.m();
    c c1 = this.t;
    c1.d = paramInt1;
    if (this.x) {
      paramInt1 = 1;
    } else {
      paramInt1 = -1;
    } 
    c1.e = paramInt1;
    c1.f = -1;
    c1.b = paramInt2;
    c1.g = Integer.MIN_VALUE;
  }
  
  private void K2(a parama) {
    J2(parama.b, parama.c);
  }
  
  private int P1(RecyclerView.y paramy) {
    if (J() == 0)
      return 0; 
    U1();
    return l.a(paramy, this.u, Y1(this.z ^ true, true), X1(this.z ^ true, true), this, this.z);
  }
  
  private int Q1(RecyclerView.y paramy) {
    if (J() == 0)
      return 0; 
    U1();
    return l.b(paramy, this.u, Y1(this.z ^ true, true), X1(this.z ^ true, true), this, this.z, this.x);
  }
  
  private int R1(RecyclerView.y paramy) {
    if (J() == 0)
      return 0; 
    U1();
    return l.c(paramy, this.u, Y1(this.z ^ true, true), X1(this.z ^ true, true), this, this.z);
  }
  
  private View W1() {
    return c2(0, J());
  }
  
  private View a2() {
    return c2(J() - 1, -1);
  }
  
  private View e2() {
    View view;
    if (this.x) {
      view = W1();
    } else {
      view = a2();
    } 
    return view;
  }
  
  private View f2() {
    View view;
    if (this.x) {
      view = a2();
    } else {
      view = W1();
    } 
    return view;
  }
  
  private int h2(int paramInt, RecyclerView.u paramu, RecyclerView.y paramy, boolean paramBoolean) {
    int j = this.u.i() - paramInt;
    if (j > 0) {
      j = -y2(-j, paramu, paramy);
      if (paramBoolean) {
        paramInt = this.u.i() - paramInt + j;
        if (paramInt > 0) {
          this.u.r(paramInt);
          return paramInt + j;
        } 
      } 
      return j;
    } 
    return 0;
  }
  
  private int i2(int paramInt, RecyclerView.u paramu, RecyclerView.y paramy, boolean paramBoolean) {
    int j = paramInt - this.u.m();
    if (j > 0) {
      int k = -y2(j, paramu, paramy);
      j = k;
      if (paramBoolean) {
        paramInt = paramInt + k - this.u.m();
        j = k;
        if (paramInt > 0) {
          this.u.r(-paramInt);
          j = k - paramInt;
        } 
      } 
      return j;
    } 
    return 0;
  }
  
  private View j2() {
    int j;
    if (this.x) {
      j = 0;
    } else {
      j = J() - 1;
    } 
    return I(j);
  }
  
  private View k2() {
    boolean bool;
    if (this.x) {
      bool = J() - 1;
    } else {
      bool = false;
    } 
    return I(bool);
  }
  
  private void q2(RecyclerView.u paramu, RecyclerView.y paramy, int paramInt1, int paramInt2) {
    if (paramy.g() && J() != 0 && !paramy.e() && M1()) {
      List<RecyclerView.b0> list = paramu.k();
      int j = list.size();
      int k = h0(I(0));
      byte b1 = 0;
      int m = 0;
      int n = 0;
      while (b1 < j) {
        RecyclerView.b0 b0 = list.get(b1);
        if (!b0.v()) {
          boolean bool;
          int i1 = b0.m();
          byte b2 = 1;
          if (i1 < k) {
            bool = true;
          } else {
            bool = false;
          } 
          if (bool != this.x)
            b2 = -1; 
          if (b2 == -1) {
            m += this.u.e(b0.b);
          } else {
            n += this.u.e(b0.b);
          } 
        } 
        b1++;
      } 
      this.t.l = list;
      if (m > 0) {
        J2(h0(k2()), paramInt1);
        c c1 = this.t;
        c1.h = m;
        c1.c = 0;
        c1.a();
        V1(paramu, this.t, paramy, false);
      } 
      if (n > 0) {
        H2(h0(j2()), paramInt2);
        c c1 = this.t;
        c1.h = n;
        c1.c = 0;
        c1.a();
        V1(paramu, this.t, paramy, false);
      } 
      this.t.l = null;
    } 
  }
  
  private void s2(RecyclerView.u paramu, c paramc) {
    if (paramc.a && !paramc.m) {
      int j = paramc.g;
      int k = paramc.i;
      if (paramc.f == -1) {
        u2(paramu, j, k);
      } else {
        v2(paramu, j, k);
      } 
    } 
  }
  
  private void t2(RecyclerView.u paramu, int paramInt1, int paramInt2) {
    if (paramInt1 == paramInt2)
      return; 
    int j = paramInt1;
    if (paramInt2 > paramInt1) {
      while (--paramInt2 >= paramInt1) {
        n1(paramInt2, paramu);
        paramInt2--;
      } 
    } else {
      while (j > paramInt2) {
        n1(j, paramu);
        j--;
      } 
    } 
  }
  
  private void u2(RecyclerView.u paramu, int paramInt1, int paramInt2) {
    int j = J();
    if (paramInt1 < 0)
      return; 
    int k = this.u.h() - paramInt1 + paramInt2;
    if (this.x) {
      for (paramInt1 = 0; paramInt1 < j; paramInt1++) {
        View view = I(paramInt1);
        if (this.u.g(view) < k || this.u.q(view) < k) {
          t2(paramu, 0, paramInt1);
          return;
        } 
      } 
    } else {
      paramInt2 = j - 1;
      for (paramInt1 = paramInt2; paramInt1 >= 0; paramInt1--) {
        View view = I(paramInt1);
        if (this.u.g(view) < k || this.u.q(view) < k) {
          t2(paramu, paramInt2, paramInt1);
          break;
        } 
      } 
    } 
  }
  
  private void v2(RecyclerView.u paramu, int paramInt1, int paramInt2) {
    if (paramInt1 < 0)
      return; 
    int j = paramInt1 - paramInt2;
    paramInt2 = J();
    if (this.x) {
      for (paramInt1 = --paramInt2; paramInt1 >= 0; paramInt1--) {
        View view = I(paramInt1);
        if (this.u.d(view) > j || this.u.p(view) > j) {
          t2(paramu, paramInt2, paramInt1);
          return;
        } 
      } 
    } else {
      for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
        View view = I(paramInt1);
        if (this.u.d(view) > j || this.u.p(view) > j) {
          t2(paramu, 0, paramInt1);
          break;
        } 
      } 
    } 
  }
  
  private void x2() {
    if (this.s == 1 || !n2()) {
      this.x = this.w;
      return;
    } 
    this.x = this.w ^ true;
  }
  
  public void A2(boolean paramBoolean) {
    g(null);
    if (paramBoolean == this.w)
      return; 
    this.w = paramBoolean;
    t1();
  }
  
  public void B2(boolean paramBoolean) {
    this.z = paramBoolean;
  }
  
  public View C(int paramInt) {
    int j = J();
    if (j == 0)
      return null; 
    int k = paramInt - h0(I(0));
    if (k >= 0 && k < j) {
      View view = I(k);
      if (h0(view) == paramInt)
        return view; 
    } 
    return super.C(paramInt);
  }
  
  public void C2(boolean paramBoolean) {
    g(null);
    if (this.y == paramBoolean)
      return; 
    this.y = paramBoolean;
    t1();
  }
  
  public RecyclerView.LayoutParams D() {
    return new RecyclerView.LayoutParams(-2, -2);
  }
  
  boolean H1() {
    boolean bool;
    if (X() != 1073741824 && p0() != 1073741824 && q0()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void I0(RecyclerView paramRecyclerView, RecyclerView.u paramu) {
    super.I0(paramRecyclerView, paramu);
    if (this.C) {
      k1(paramu);
      paramu.c();
    } 
  }
  
  public View J0(View paramView, int paramInt, RecyclerView.u paramu, RecyclerView.y paramy) {
    View view1;
    View view2;
    x2();
    if (J() == 0)
      return null; 
    paramInt = S1(paramInt);
    if (paramInt == Integer.MIN_VALUE)
      return null; 
    U1();
    G2(paramInt, (int)(this.u.n() * 0.33333334F), false, paramy);
    c c1 = this.t;
    c1.g = Integer.MIN_VALUE;
    c1.a = false;
    V1(paramu, c1, paramy, true);
    if (paramInt == -1) {
      view1 = f2();
    } else {
      view1 = e2();
    } 
    if (paramInt == -1) {
      view2 = k2();
    } else {
      view2 = j2();
    } 
    return view2.hasFocusable() ? ((view1 == null) ? null : view2) : view1;
  }
  
  public void J1(RecyclerView paramRecyclerView, RecyclerView.y paramy, int paramInt) {
    g g = new g(paramRecyclerView.getContext());
    g.p(paramInt);
    K1(g);
  }
  
  public void K0(AccessibilityEvent paramAccessibilityEvent) {
    super.K0(paramAccessibilityEvent);
    if (J() > 0) {
      paramAccessibilityEvent.setFromIndex(Z1());
      paramAccessibilityEvent.setToIndex(b2());
    } 
  }
  
  public boolean M1() {
    boolean bool;
    if (this.D == null && this.v == this.y) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  protected void N1(RecyclerView.y paramy, int[] paramArrayOfint) {
    int k;
    boolean bool;
    int j = l2(paramy);
    if (this.t.f == -1) {
      k = 0;
      bool = j;
    } else {
      bool = false;
      k = j;
    } 
    paramArrayOfint[0] = bool;
    paramArrayOfint[1] = k;
  }
  
  void O1(RecyclerView.y paramy, c paramc, RecyclerView.o.c paramc1) {
    int j = paramc.d;
    if (j >= 0 && j < paramy.b())
      paramc1.a(j, Math.max(0, paramc.g)); 
  }
  
  int S1(int paramInt) {
    int j = -1;
    boolean bool1 = true;
    boolean bool2 = true;
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 17) {
          if (paramInt != 33) {
            if (paramInt != 66) {
              if (paramInt != 130)
                return Integer.MIN_VALUE; 
              if (this.s == 1) {
                paramInt = bool2;
              } else {
                paramInt = Integer.MIN_VALUE;
              } 
              return paramInt;
            } 
            if (this.s == 0) {
              paramInt = bool1;
            } else {
              paramInt = Integer.MIN_VALUE;
            } 
            return paramInt;
          } 
          if (this.s != 1)
            j = Integer.MIN_VALUE; 
          return j;
        } 
        if (this.s != 0)
          j = Integer.MIN_VALUE; 
        return j;
      } 
      return (this.s == 1) ? 1 : (n2() ? -1 : 1);
    } 
    return (this.s == 1) ? -1 : (n2() ? 1 : -1);
  }
  
  c T1() {
    return new c();
  }
  
  void U1() {
    if (this.t == null)
      this.t = T1(); 
  }
  
  int V1(RecyclerView.u paramu, c paramc, RecyclerView.y paramy, boolean paramBoolean) {
    int j = paramc.c;
    int k = paramc.g;
    if (k != Integer.MIN_VALUE) {
      if (j < 0)
        paramc.g = k + j; 
      s2(paramu, paramc);
    } 
    int m = paramc.c + paramc.h;
    b b1 = this.F;
    while (true) {
      while (true)
        break; 
      if (paramBoolean) {
        m = k;
        if (b1.d)
          break; 
      } 
    } 
    return j - paramc.c;
  }
  
  public void X0(RecyclerView.u paramu, RecyclerView.y paramy) {
    c c1;
    SavedState savedState = this.D;
    int j = -1;
    if ((savedState != null || this.A != -1) && paramy.b() == 0) {
      k1(paramu);
      return;
    } 
    savedState = this.D;
    if (savedState != null && savedState.a())
      this.A = this.D.b; 
    U1();
    this.t.a = false;
    x2();
    View view = V();
    a a2 = this.E;
    if (!a2.e || this.A != -1 || this.D != null) {
      a2.e();
      a2 = this.E;
      a2.d = this.x ^ this.y;
      F2(paramu, paramy, a2);
      this.E.e = true;
    } else if (view != null && (this.u.g(view) >= this.u.i() || this.u.d(view) <= this.u.m())) {
      this.E.c(view, h0(view));
    } 
    c c2 = this.t;
    if (c2.k >= 0) {
      k = 1;
    } else {
      k = -1;
    } 
    c2.f = k;
    int[] arrayOfInt = this.H;
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 0;
    N1(paramy, arrayOfInt);
    int m = Math.max(0, this.H[0]) + this.u.m();
    int n = Math.max(0, this.H[1]) + this.u.j();
    int i1 = m;
    int k = n;
    if (paramy.e()) {
      int i2 = this.A;
      i1 = m;
      k = n;
      if (i2 != -1) {
        i1 = m;
        k = n;
        if (this.B != Integer.MIN_VALUE) {
          View view1 = C(i2);
          i1 = m;
          k = n;
          if (view1 != null) {
            if (this.x) {
              k = this.u.i() - this.u.d(view1);
              i1 = this.B;
            } else {
              i1 = this.u.g(view1) - this.u.m();
              k = this.B;
            } 
            k -= i1;
            if (k > 0) {
              i1 = m + k;
              k = n;
            } else {
              k = n - k;
              i1 = m;
            } 
          } 
        } 
      } 
    } 
    a a1 = this.E;
    if (a1.d ? this.x : !this.x)
      j = 1; 
    r2(paramu, paramy, a1, j);
    w(paramu);
    this.t.m = w2();
    this.t.j = paramy.e();
    this.t.i = 0;
    a1 = this.E;
    if (a1.d) {
      K2(a1);
      c1 = this.t;
      c1.h = i1;
      V1(paramu, c1, paramy, false);
      c1 = this.t;
      j = c1.b;
      m = c1.d;
      n = c1.c;
      i1 = k;
      if (n > 0)
        i1 = k + n; 
      I2(this.E);
      c1 = this.t;
      c1.h = i1;
      c1.d += c1.e;
      V1(paramu, c1, paramy, false);
      c1 = this.t;
      n = c1.b;
      int i2 = c1.c;
      i1 = j;
      k = n;
      if (i2 > 0) {
        J2(m, j);
        c1 = this.t;
        c1.h = i2;
        V1(paramu, c1, paramy, false);
        i1 = this.t.b;
        k = n;
      } 
    } else {
      I2((a)c1);
      c1 = this.t;
      c1.h = k;
      V1(paramu, c1, paramy, false);
      c1 = this.t;
      j = c1.b;
      m = c1.d;
      n = c1.c;
      k = i1;
      if (n > 0)
        k = i1 + n; 
      K2(this.E);
      c1 = this.t;
      c1.h = k;
      c1.d += c1.e;
      V1(paramu, c1, paramy, false);
      c1 = this.t;
      n = c1.b;
      int i2 = c1.c;
      i1 = n;
      k = j;
      if (i2 > 0) {
        H2(m, j);
        c1 = this.t;
        c1.h = i2;
        V1(paramu, c1, paramy, false);
        k = this.t.b;
        i1 = n;
      } 
    } 
    n = i1;
    j = k;
    if (J() > 0) {
      if ((this.x ^ this.y) != 0) {
        n = h2(k, paramu, paramy, true);
        j = i1 + n;
        i1 = k + n;
        k = i2(j, paramu, paramy, false);
      } else {
        n = i2(i1, paramu, paramy, true);
        j = i1 + n;
        i1 = k + n;
        k = h2(i1, paramu, paramy, false);
      } 
      n = j + k;
      j = i1 + k;
    } 
    q2(paramu, paramy, n, j);
    if (!paramy.e()) {
      this.u.s();
    } else {
      this.E.e();
    } 
    this.v = this.y;
  }
  
  View X1(boolean paramBoolean1, boolean paramBoolean2) {
    return this.x ? d2(0, J(), paramBoolean1, paramBoolean2) : d2(J() - 1, -1, paramBoolean1, paramBoolean2);
  }
  
  public void Y0(RecyclerView.y paramy) {
    super.Y0(paramy);
    this.D = null;
    this.A = -1;
    this.B = Integer.MIN_VALUE;
    this.E.e();
  }
  
  View Y1(boolean paramBoolean1, boolean paramBoolean2) {
    return this.x ? d2(J() - 1, -1, paramBoolean1, paramBoolean2) : d2(0, J(), paramBoolean1, paramBoolean2);
  }
  
  public int Z1() {
    int j;
    View view = d2(0, J(), false, true);
    if (view == null) {
      j = -1;
    } else {
      j = h0(view);
    } 
    return j;
  }
  
  public PointF a(int paramInt) {
    if (J() == 0)
      return null; 
    boolean bool = false;
    int j = h0(I(0));
    boolean bool1 = true;
    if (paramInt < j)
      bool = true; 
    paramInt = bool1;
    if (bool != this.x)
      paramInt = -1; 
    return (this.s == 0) ? new PointF(paramInt, 0.0F) : new PointF(0.0F, paramInt);
  }
  
  public int b2() {
    int j = J();
    int k = -1;
    View view = d2(j - 1, -1, false, true);
    if (view != null)
      k = h0(view); 
    return k;
  }
  
  public void c1(Parcelable paramParcelable) {
    if (paramParcelable instanceof SavedState) {
      paramParcelable = paramParcelable;
      this.D = (SavedState)paramParcelable;
      if (this.A != -1)
        paramParcelable.b(); 
      t1();
    } 
  }
  
  View c2(int paramInt1, int paramInt2) {
    char c1;
    char c2;
    View view;
    U1();
    if (paramInt2 > paramInt1) {
      c1 = '\001';
    } else if (paramInt2 < paramInt1) {
      c1 = '￿';
    } else {
      c1 = Character.MIN_VALUE;
    } 
    if (!c1)
      return I(paramInt1); 
    if (this.u.g(I(paramInt1)) < this.u.m()) {
      c2 = '䄄';
      c1 = '䀄';
    } else {
      c2 = '၁';
      c1 = 'ခ';
    } 
    if (this.s == 0) {
      view = this.e.a(paramInt1, paramInt2, c2, c1);
    } else {
      view = this.f.a(paramInt1, paramInt2, c2, c1);
    } 
    return view;
  }
  
  public Parcelable d1() {
    if (this.D != null)
      return new SavedState(this.D); 
    SavedState savedState = new SavedState();
    if (J() > 0) {
      U1();
      int j = this.v ^ this.x;
      savedState.d = j;
      if (j != 0) {
        View view = j2();
        savedState.c = this.u.i() - this.u.d(view);
        savedState.b = h0(view);
      } else {
        View view = k2();
        savedState.b = h0(view);
        savedState.c = this.u.g(view) - this.u.m();
      } 
    } else {
      savedState.b();
    } 
    return savedState;
  }
  
  View d2(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    char c2;
    View view;
    U1();
    char c1 = 'ŀ';
    if (paramBoolean1) {
      c2 = '怃';
    } else {
      c2 = 'ŀ';
    } 
    if (!paramBoolean2)
      c1 = Character.MIN_VALUE; 
    if (this.s == 0) {
      view = this.e.a(paramInt1, paramInt2, c2, c1);
    } else {
      view = this.f.a(paramInt1, paramInt2, c2, c1);
    } 
    return view;
  }
  
  public void g(String paramString) {
    if (this.D == null)
      super.g(paramString); 
  }
  
  View g2(RecyclerView.u paramu, RecyclerView.y paramy, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual U1 : ()V
    //   4: aload_0
    //   5: invokevirtual J : ()I
    //   8: istore #5
    //   10: iconst_m1
    //   11: istore #6
    //   13: iload #4
    //   15: ifeq -> 32
    //   18: aload_0
    //   19: invokevirtual J : ()I
    //   22: iconst_1
    //   23: isub
    //   24: istore #5
    //   26: iconst_m1
    //   27: istore #7
    //   29: goto -> 42
    //   32: iload #5
    //   34: istore #6
    //   36: iconst_0
    //   37: istore #5
    //   39: iconst_1
    //   40: istore #7
    //   42: aload_2
    //   43: invokevirtual b : ()I
    //   46: istore #8
    //   48: aload_0
    //   49: getfield u : Landroidx/recyclerview/widget/i;
    //   52: invokevirtual m : ()I
    //   55: istore #9
    //   57: aload_0
    //   58: getfield u : Landroidx/recyclerview/widget/i;
    //   61: invokevirtual i : ()I
    //   64: istore #10
    //   66: aconst_null
    //   67: astore #11
    //   69: aconst_null
    //   70: astore_2
    //   71: aload_2
    //   72: astore_1
    //   73: iload #5
    //   75: iload #6
    //   77: if_icmpeq -> 348
    //   80: aload_0
    //   81: iload #5
    //   83: invokevirtual I : (I)Landroid/view/View;
    //   86: astore #12
    //   88: aload_0
    //   89: aload #12
    //   91: invokevirtual h0 : (Landroid/view/View;)I
    //   94: istore #13
    //   96: aload_0
    //   97: getfield u : Landroidx/recyclerview/widget/i;
    //   100: aload #12
    //   102: invokevirtual g : (Landroid/view/View;)I
    //   105: istore #14
    //   107: aload_0
    //   108: getfield u : Landroidx/recyclerview/widget/i;
    //   111: aload #12
    //   113: invokevirtual d : (Landroid/view/View;)I
    //   116: istore #15
    //   118: aload #11
    //   120: astore #16
    //   122: aload_2
    //   123: astore #17
    //   125: aload_1
    //   126: astore #18
    //   128: iload #13
    //   130: iflt -> 328
    //   133: aload #11
    //   135: astore #16
    //   137: aload_2
    //   138: astore #17
    //   140: aload_1
    //   141: astore #18
    //   143: iload #13
    //   145: iload #8
    //   147: if_icmpge -> 328
    //   150: aload #12
    //   152: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   155: checkcast androidx/recyclerview/widget/RecyclerView$LayoutParams
    //   158: invokevirtual c : ()Z
    //   161: ifeq -> 192
    //   164: aload #11
    //   166: astore #16
    //   168: aload_2
    //   169: astore #17
    //   171: aload_1
    //   172: astore #18
    //   174: aload_1
    //   175: ifnonnull -> 328
    //   178: aload #11
    //   180: astore #16
    //   182: aload_2
    //   183: astore #17
    //   185: aload #12
    //   187: astore #18
    //   189: goto -> 328
    //   192: iload #15
    //   194: iload #9
    //   196: if_icmpgt -> 212
    //   199: iload #14
    //   201: iload #9
    //   203: if_icmpge -> 212
    //   206: iconst_1
    //   207: istore #13
    //   209: goto -> 215
    //   212: iconst_0
    //   213: istore #13
    //   215: iload #14
    //   217: iload #10
    //   219: if_icmplt -> 235
    //   222: iload #15
    //   224: iload #10
    //   226: if_icmple -> 235
    //   229: iconst_1
    //   230: istore #14
    //   232: goto -> 238
    //   235: iconst_0
    //   236: istore #14
    //   238: iload #13
    //   240: ifne -> 254
    //   243: iload #14
    //   245: ifeq -> 251
    //   248: goto -> 254
    //   251: aload #12
    //   253: areturn
    //   254: iload_3
    //   255: ifeq -> 284
    //   258: iload #14
    //   260: ifeq -> 266
    //   263: goto -> 289
    //   266: aload #11
    //   268: astore #16
    //   270: aload_2
    //   271: astore #17
    //   273: aload_1
    //   274: astore #18
    //   276: aload #11
    //   278: ifnonnull -> 328
    //   281: goto -> 318
    //   284: iload #13
    //   286: ifeq -> 303
    //   289: aload #11
    //   291: astore #16
    //   293: aload #12
    //   295: astore #17
    //   297: aload_1
    //   298: astore #18
    //   300: goto -> 328
    //   303: aload #11
    //   305: astore #16
    //   307: aload_2
    //   308: astore #17
    //   310: aload_1
    //   311: astore #18
    //   313: aload #11
    //   315: ifnonnull -> 328
    //   318: aload_1
    //   319: astore #18
    //   321: aload_2
    //   322: astore #17
    //   324: aload #12
    //   326: astore #16
    //   328: iload #5
    //   330: iload #7
    //   332: iadd
    //   333: istore #5
    //   335: aload #16
    //   337: astore #11
    //   339: aload #17
    //   341: astore_2
    //   342: aload #18
    //   344: astore_1
    //   345: goto -> 73
    //   348: aload #11
    //   350: ifnull -> 356
    //   353: goto -> 369
    //   356: aload_2
    //   357: ifnull -> 366
    //   360: aload_2
    //   361: astore #11
    //   363: goto -> 369
    //   366: aload_1
    //   367: astore #11
    //   369: aload #11
    //   371: areturn
  }
  
  public boolean k() {
    boolean bool;
    if (this.s == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean l() {
    int j = this.s;
    boolean bool = true;
    if (j != 1)
      bool = false; 
    return bool;
  }
  
  @Deprecated
  protected int l2(RecyclerView.y paramy) {
    return paramy.d() ? this.u.n() : 0;
  }
  
  public int m2() {
    return this.s;
  }
  
  protected boolean n2() {
    int j = Z();
    boolean bool = true;
    if (j != 1)
      bool = false; 
    return bool;
  }
  
  public void o(int paramInt1, int paramInt2, RecyclerView.y paramy, RecyclerView.o.c paramc) {
    if (this.s != 0)
      paramInt1 = paramInt2; 
    if (J() != 0 && paramInt1 != 0) {
      U1();
      if (paramInt1 > 0) {
        paramInt2 = 1;
      } else {
        paramInt2 = -1;
      } 
      G2(paramInt2, Math.abs(paramInt1), true, paramy);
      O1(paramy, this.t, paramc);
    } 
  }
  
  public boolean o2() {
    return this.z;
  }
  
  public void p(int paramInt, RecyclerView.o.c paramc) {
    boolean bool;
    int j;
    SavedState savedState = this.D;
    byte b1 = -1;
    if (savedState != null && savedState.a()) {
      savedState = this.D;
      bool = savedState.d;
      j = savedState.b;
    } else {
      x2();
      boolean bool1 = this.x;
      int k = this.A;
      j = k;
      bool = bool1;
      if (k == -1)
        if (bool1) {
          j = paramInt - 1;
          bool = bool1;
        } else {
          j = 0;
          bool = bool1;
        }  
    } 
    if (!bool)
      b1 = 1; 
    for (byte b2 = 0; b2 < this.G && j >= 0 && j < paramInt; b2++) {
      paramc.a(j, 0);
      j += b1;
    } 
  }
  
  void p2(RecyclerView.u paramu, RecyclerView.y paramy, c paramc, b paramb) {
    int j;
    int k;
    int m;
    int n;
    View view = paramc.d(paramu);
    if (view == null) {
      paramb.b = true;
      return;
    } 
    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)view.getLayoutParams();
    if (paramc.l == null) {
      boolean bool2;
      boolean bool1 = this.x;
      if (paramc.f == -1) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      if (bool1 == bool2) {
        d(view);
      } else {
        e(view, 0);
      } 
    } else {
      boolean bool2;
      boolean bool1 = this.x;
      if (paramc.f == -1) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      if (bool1 == bool2) {
        b(view);
      } else {
        c(view, 0);
      } 
    } 
    A0(view, 0, 0);
    paramb.a = this.u.e(view);
    if (this.s == 1) {
      if (n2()) {
        j = o0() - f0();
        k = j - this.u.f(view);
      } else {
        k = e0();
        j = this.u.f(view) + k;
      } 
      if (paramc.f == -1) {
        int i1 = paramc.b;
        int i2 = paramb.a;
        m = i1;
        n = j;
        j = i1 - i2;
      } else {
        int i1 = paramc.b;
        int i2 = paramb.a;
        n = i1;
        m = j;
        i1 = i2 + i1;
        j = n;
        n = m;
        m = i1;
      } 
    } else {
      k = g0();
      j = this.u.f(view) + k;
      if (paramc.f == -1) {
        int i2 = paramc.b;
        int i3 = paramb.a;
        n = i2;
        int i1 = k;
        m = j;
        k = i2 - i3;
        j = i1;
      } else {
        int i1 = paramc.b;
        n = paramb.a;
        n += i1;
        m = j;
        j = k;
        k = i1;
      } 
    } 
    z0(view, k, j, n, m);
    if (layoutParams.c() || layoutParams.b())
      paramb.c = true; 
    paramb.d = view.hasFocusable();
  }
  
  public int q(RecyclerView.y paramy) {
    return P1(paramy);
  }
  
  public int r(RecyclerView.y paramy) {
    return Q1(paramy);
  }
  
  void r2(RecyclerView.u paramu, RecyclerView.y paramy, a parama, int paramInt) {}
  
  public int s(RecyclerView.y paramy) {
    return R1(paramy);
  }
  
  public boolean s0() {
    return true;
  }
  
  public int t(RecyclerView.y paramy) {
    return P1(paramy);
  }
  
  public int u(RecyclerView.y paramy) {
    return Q1(paramy);
  }
  
  public int v(RecyclerView.y paramy) {
    return R1(paramy);
  }
  
  public int w1(int paramInt, RecyclerView.u paramu, RecyclerView.y paramy) {
    return (this.s == 1) ? 0 : y2(paramInt, paramu, paramy);
  }
  
  boolean w2() {
    boolean bool;
    if (this.u.k() == 0 && this.u.h() == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void x1(int paramInt) {
    this.A = paramInt;
    this.B = Integer.MIN_VALUE;
    SavedState savedState = this.D;
    if (savedState != null)
      savedState.b(); 
    t1();
  }
  
  public int y1(int paramInt, RecyclerView.u paramu, RecyclerView.y paramy) {
    return (this.s == 0) ? 0 : y2(paramInt, paramu, paramy);
  }
  
  int y2(int paramInt, RecyclerView.u paramu, RecyclerView.y paramy) {
    byte b1;
    if (J() == 0 || paramInt == 0)
      return 0; 
    U1();
    this.t.a = true;
    if (paramInt > 0) {
      b1 = 1;
    } else {
      b1 = -1;
    } 
    int j = Math.abs(paramInt);
    G2(b1, j, true, paramy);
    c c1 = this.t;
    int k = c1.g + V1(paramu, c1, paramy, false);
    if (k < 0)
      return 0; 
    if (j > k)
      paramInt = b1 * k; 
    this.u.r(-paramInt);
    this.t.k = paramInt;
    return paramInt;
  }
  
  public void z2(int paramInt) {
    if (paramInt == 0 || paramInt == 1) {
      g(null);
      if (paramInt != this.s || this.u == null) {
        i i1 = i.b(this, paramInt);
        this.u = i1;
        this.E.a = i1;
        this.s = paramInt;
        t1();
      } 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("invalid orientation:");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  @SuppressLint({"BanParcelableUsage"})
  public static class SavedState implements Parcelable {
    public static final Parcelable.Creator<SavedState> CREATOR = new a();
    
    int b;
    
    int c;
    
    boolean d;
    
    public SavedState() {}
    
    SavedState(Parcel param1Parcel) {
      this.b = param1Parcel.readInt();
      this.c = param1Parcel.readInt();
      int i = param1Parcel.readInt();
      boolean bool = true;
      if (i != 1)
        bool = false; 
      this.d = bool;
    }
    
    public SavedState(SavedState param1SavedState) {
      this.b = param1SavedState.b;
      this.c = param1SavedState.c;
      this.d = param1SavedState.d;
    }
    
    boolean a() {
      boolean bool;
      if (this.b >= 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    void b() {
      this.b = -1;
    }
    
    public int describeContents() {
      return 0;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeInt(this.b);
      param1Parcel.writeInt(this.c);
      param1Parcel.writeInt(this.d);
    }
    
    class a implements Parcelable.Creator<SavedState> {
      public LinearLayoutManager.SavedState a(Parcel param2Parcel) {
        return new LinearLayoutManager.SavedState(param2Parcel);
      }
      
      public LinearLayoutManager.SavedState[] b(int param2Int) {
        return new LinearLayoutManager.SavedState[param2Int];
      }
    }
  }
  
  class a implements Parcelable.Creator<SavedState> {
    public LinearLayoutManager.SavedState a(Parcel param1Parcel) {
      return new LinearLayoutManager.SavedState(param1Parcel);
    }
    
    public LinearLayoutManager.SavedState[] b(int param1Int) {
      return new LinearLayoutManager.SavedState[param1Int];
    }
  }
  
  static class a {
    i a;
    
    int b;
    
    int c;
    
    boolean d;
    
    boolean e;
    
    a() {
      e();
    }
    
    void a() {
      int j;
      if (this.d) {
        j = this.a.i();
      } else {
        j = this.a.m();
      } 
      this.c = j;
    }
    
    public void b(View param1View, int param1Int) {
      if (this.d) {
        this.c = this.a.d(param1View) + this.a.o();
      } else {
        this.c = this.a.g(param1View);
      } 
      this.b = param1Int;
    }
    
    public void c(View param1View, int param1Int) {
      int j = this.a.o();
      if (j >= 0) {
        b(param1View, param1Int);
        return;
      } 
      this.b = param1Int;
      if (this.d) {
        param1Int = this.a.i() - j - this.a.d(param1View);
        this.c = this.a.i() - param1Int;
        if (param1Int > 0) {
          int k = this.a.e(param1View);
          j = this.c;
          int m = this.a.m();
          j = j - k - m + Math.min(this.a.g(param1View) - m, 0);
          if (j < 0)
            this.c += Math.min(param1Int, -j); 
        } 
      } else {
        int k = this.a.g(param1View);
        param1Int = k - this.a.m();
        this.c = k;
        if (param1Int > 0) {
          int m = this.a.e(param1View);
          int n = this.a.i();
          int i1 = this.a.d(param1View);
          j = this.a.i() - Math.min(0, n - j - i1) - k + m;
          if (j < 0)
            this.c -= Math.min(param1Int, -j); 
        } 
      } 
    }
    
    boolean d(View param1View, RecyclerView.y param1y) {
      boolean bool;
      RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)param1View.getLayoutParams();
      if (!layoutParams.c() && layoutParams.a() >= 0 && layoutParams.a() < param1y.b()) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    void e() {
      this.b = -1;
      this.c = Integer.MIN_VALUE;
      this.d = false;
      this.e = false;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("AnchorInfo{mPosition=");
      stringBuilder.append(this.b);
      stringBuilder.append(", mCoordinate=");
      stringBuilder.append(this.c);
      stringBuilder.append(", mLayoutFromEnd=");
      stringBuilder.append(this.d);
      stringBuilder.append(", mValid=");
      stringBuilder.append(this.e);
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
  }
  
  protected static class b {
    public int a;
    
    public boolean b;
    
    public boolean c;
    
    public boolean d;
    
    void a() {
      this.a = 0;
      this.b = false;
      this.c = false;
      this.d = false;
    }
  }
  
  static class c {
    boolean a = true;
    
    int b;
    
    int c;
    
    int d;
    
    int e;
    
    int f;
    
    int g;
    
    int h = 0;
    
    int i = 0;
    
    boolean j = false;
    
    int k;
    
    List<RecyclerView.b0> l = null;
    
    boolean m;
    
    private View e() {
      int i = this.l.size();
      for (byte b = 0; b < i; b++) {
        View view = ((RecyclerView.b0)this.l.get(b)).b;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)view.getLayoutParams();
        if (!layoutParams.c() && this.d == layoutParams.a()) {
          b(view);
          return view;
        } 
      } 
      return null;
    }
    
    public void a() {
      b(null);
    }
    
    public void b(View param1View) {
      param1View = f(param1View);
      if (param1View == null) {
        this.d = -1;
      } else {
        this.d = ((RecyclerView.LayoutParams)param1View.getLayoutParams()).a();
      } 
    }
    
    boolean c(RecyclerView.y param1y) {
      boolean bool;
      int i = this.d;
      if (i >= 0 && i < param1y.b()) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    View d(RecyclerView.u param1u) {
      if (this.l != null)
        return e(); 
      View view = param1u.o(this.d);
      this.d += this.e;
      return view;
    }
    
    public View f(View param1View) {
      View view2;
      int i = this.l.size();
      View view1 = null;
      int j = Integer.MAX_VALUE;
      byte b = 0;
      while (true) {
        view2 = view1;
        if (b < i) {
          View view = ((RecyclerView.b0)this.l.get(b)).b;
          RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)view.getLayoutParams();
          view2 = view1;
          int k = j;
          if (view != param1View)
            if (layoutParams.c()) {
              view2 = view1;
              k = j;
            } else {
              int m = (layoutParams.a() - this.d) * this.e;
              if (m < 0) {
                view2 = view1;
                k = j;
              } else {
                view2 = view1;
                k = j;
                if (m < j) {
                  view1 = view;
                  if (m == 0) {
                    view2 = view1;
                    break;
                  } 
                  k = m;
                  view2 = view1;
                } 
              } 
            }  
          b++;
          view1 = view2;
          j = k;
          continue;
        } 
        break;
      } 
      return view2;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/recyclerview/widget/LinearLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */