package androidx.recyclerview.widget;

import b.h.j.f;
import b.h.j.g;
import java.util.ArrayList;
import java.util.List;

final class a implements h.a {
  private f<b> a = (f<b>)new g(30);
  
  final ArrayList<b> b = new ArrayList<b>();
  
  final ArrayList<b> c = new ArrayList<b>();
  
  final a d;
  
  Runnable e;
  
  final boolean f;
  
  final h g;
  
  private int h = 0;
  
  a(a parama) {
    this(parama, false);
  }
  
  a(a parama, boolean paramBoolean) {
    this.d = parama;
    this.f = paramBoolean;
    this.g = new h(this);
  }
  
  private void c(b paramb) {
    u(paramb);
  }
  
  private void d(b paramb) {
    u(paramb);
  }
  
  private void f(b paramb) {
    int i = paramb.b;
    int j = paramb.d + i;
    byte b1 = -1;
    int k = i;
    int m;
    for (m = 0; k < j; m = n) {
      int n;
      if (this.d.e(k) != null || h(k)) {
        if (b1 == 0) {
          k(b(2, i, m, null));
          n = 1;
        } else {
          n = 0;
        } 
        b1 = 1;
      } else {
        if (b1 == 1) {
          u(b(2, i, m, null));
          b1 = 1;
        } else {
          b1 = 0;
        } 
        boolean bool = false;
        n = b1;
        b1 = bool;
      } 
      if (n != 0) {
        k -= m;
        j -= m;
        n = 1;
      } else {
        n = m + 1;
      } 
      k++;
    } 
    b b2 = paramb;
    if (m != paramb.d) {
      a(paramb);
      b2 = b(2, i, m, null);
    } 
    if (b1 == 0) {
      k(b2);
    } else {
      u(b2);
    } 
  }
  
  private void g(b paramb) {
    int i = paramb.b;
    int j = paramb.d;
    int k = i;
    int m = -1;
    int n = 0;
    int i1 = i;
    while (i1 < j + i) {
      int i2;
      if (this.d.e(i1) != null || h(i1)) {
        int i4 = k;
        i2 = n;
        if (m == 0) {
          k(b(4, k, n, paramb.c));
          i4 = i1;
          i2 = 0;
        } 
        n = 1;
        k = i4;
      } else {
        i2 = k;
        int i4 = n;
        if (m == 1) {
          u(b(4, k, n, paramb.c));
          i2 = i1;
          i4 = 0;
        } 
        n = 0;
        k = i2;
        i2 = i4;
      } 
      int i3 = i2 + 1;
      i1++;
      m = n;
      n = i3;
    } 
    Object object = paramb;
    if (n != paramb.d) {
      object = paramb.c;
      a(paramb);
      object = b(4, k, n, object);
    } 
    if (m == 0) {
      k((b)object);
    } else {
      u((b)object);
    } 
  }
  
  private boolean h(int paramInt) {
    int i = this.c.size();
    for (byte b = 0; b < i; b++) {
      b b1 = this.c.get(b);
      int j = b1.a;
      if (j == 8) {
        if (n(b1.d, b + 1) == paramInt)
          return true; 
      } else if (j == 1) {
        int k = b1.b;
        int m = b1.d;
        for (j = k; j < m + k; j++) {
          if (n(j, b + 1) == paramInt)
            return true; 
        } 
      } 
    } 
    return false;
  }
  
  private void k(b paramb) {
    int i = paramb.a;
    if (i != 1 && i != 8) {
      byte b1;
      int j = y(paramb.b, i);
      i = paramb.b;
      int k = paramb.a;
      if (k != 2) {
        if (k == 4) {
          b1 = 1;
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("op should be remove or update.");
          stringBuilder.append(paramb);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
      } else {
        b1 = 0;
      } 
      byte b2 = 1;
      k = 1;
      while (b2 < paramb.d) {
        int i1;
        int m = y(paramb.b + b1 * b2, paramb.a);
        int n = paramb.a;
        if ((n != 2) ? (n == 4 && m == j + 1) : (m == j)) {
          i1 = 1;
        } else {
          i1 = 0;
        } 
        if (i1) {
          k++;
        } else {
          b b3 = b(n, j, k, paramb.c);
          l(b3, i);
          a(b3);
          j = i;
          if (paramb.a == 4)
            j = i + k; 
          i1 = m;
          k = 1;
          i = j;
          j = i1;
        } 
        b2++;
      } 
      Object object = paramb.c;
      a(paramb);
      if (k > 0) {
        paramb = b(paramb.a, j, k, object);
        l(paramb, i);
        a(paramb);
      } 
      return;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("should not dispatch add or move for pre layout");
    throw illegalArgumentException;
  }
  
  private void u(b paramb) {
    this.c.add(paramb);
    int i = paramb.a;
    if (i != 1) {
      if (i != 2) {
        if (i != 4) {
          if (i == 8) {
            this.d.a(paramb.b, paramb.d);
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown update op type for ");
            stringBuilder.append(paramb);
            throw new IllegalArgumentException(stringBuilder.toString());
          } 
        } else {
          this.d.c(paramb.b, paramb.d, paramb.c);
        } 
      } else {
        this.d.f(paramb.b, paramb.d);
      } 
    } else {
      this.d.g(paramb.b, paramb.d);
    } 
  }
  
  private int y(int paramInt1, int paramInt2) {
    int i = this.c.size() - 1;
    int j;
    for (j = paramInt1; i >= 0; j = paramInt1) {
      b b = this.c.get(i);
      int k = b.a;
      if (k == 8) {
        int n;
        int m = b.b;
        k = b.d;
        if (m < k) {
          n = m;
          paramInt1 = k;
        } else {
          paramInt1 = m;
          n = k;
        } 
        if (j >= n && j <= paramInt1) {
          if (n == m) {
            if (paramInt2 == 1) {
              b.d = k + 1;
            } else if (paramInt2 == 2) {
              b.d = k - 1;
            } 
            paramInt1 = j + 1;
          } else {
            if (paramInt2 == 1) {
              b.b = m + 1;
            } else if (paramInt2 == 2) {
              b.b = m - 1;
            } 
            paramInt1 = j - 1;
          } 
        } else {
          paramInt1 = j;
          if (j < m)
            if (paramInt2 == 1) {
              b.b = m + 1;
              b.d = k + 1;
              paramInt1 = j;
            } else {
              paramInt1 = j;
              if (paramInt2 == 2) {
                b.b = m - 1;
                b.d = k - 1;
                paramInt1 = j;
              } 
            }  
        } 
      } else {
        int m = b.b;
        if (m <= j) {
          if (k == 1) {
            paramInt1 = j - b.d;
          } else {
            paramInt1 = j;
            if (k == 2)
              paramInt1 = j + b.d; 
          } 
        } else if (paramInt2 == 1) {
          b.b = m + 1;
          paramInt1 = j;
        } else {
          paramInt1 = j;
          if (paramInt2 == 2) {
            b.b = m - 1;
            paramInt1 = j;
          } 
        } 
      } 
      i--;
    } 
    for (paramInt1 = this.c.size() - 1; paramInt1 >= 0; paramInt1--) {
      b b = this.c.get(paramInt1);
      if (b.a == 8) {
        paramInt2 = b.d;
        if (paramInt2 == b.b || paramInt2 < 0) {
          this.c.remove(paramInt1);
          a(b);
        } 
      } else if (b.d <= 0) {
        this.c.remove(paramInt1);
        a(b);
      } 
    } 
    return j;
  }
  
  public void a(b paramb) {
    if (!this.f) {
      paramb.c = null;
      this.a.c(paramb);
    } 
  }
  
  public b b(int paramInt1, int paramInt2, int paramInt3, Object paramObject) {
    b b = (b)this.a.b();
    if (b == null) {
      paramObject = new b(paramInt1, paramInt2, paramInt3, paramObject);
    } else {
      b.a = paramInt1;
      b.b = paramInt2;
      b.d = paramInt3;
      b.c = paramObject;
      paramObject = b;
    } 
    return (b)paramObject;
  }
  
  public int e(int paramInt) {
    int i = this.b.size();
    byte b = 0;
    int j;
    for (j = paramInt; b < i; j = paramInt) {
      b b1 = this.b.get(b);
      paramInt = b1.a;
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt != 8) {
            paramInt = j;
          } else {
            paramInt = b1.b;
            if (paramInt == j) {
              paramInt = b1.d;
            } else {
              int k = j;
              if (paramInt < j)
                k = j - 1; 
              paramInt = k;
              if (b1.d <= k)
                paramInt = k + 1; 
            } 
          } 
        } else {
          int k = b1.b;
          paramInt = j;
          if (k <= j) {
            paramInt = b1.d;
            if (k + paramInt > j)
              return -1; 
            paramInt = j - paramInt;
          } 
        } 
      } else {
        paramInt = j;
        if (b1.b <= j)
          paramInt = j + b1.d; 
      } 
      b++;
    } 
    return j;
  }
  
  void i() {
    int i = this.c.size();
    for (byte b = 0; b < i; b++)
      this.d.d(this.c.get(b)); 
    w(this.c);
    this.h = 0;
  }
  
  void j() {
    i();
    int i = this.b.size();
    for (byte b = 0; b < i; b++) {
      b b1 = this.b.get(b);
      int j = b1.a;
      if (j != 1) {
        if (j != 2) {
          if (j != 4) {
            if (j == 8) {
              this.d.d(b1);
              this.d.a(b1.b, b1.d);
            } 
          } else {
            this.d.d(b1);
            this.d.c(b1.b, b1.d, b1.c);
          } 
        } else {
          this.d.d(b1);
          this.d.h(b1.b, b1.d);
        } 
      } else {
        this.d.d(b1);
        this.d.g(b1.b, b1.d);
      } 
      Runnable runnable = this.e;
      if (runnable != null)
        runnable.run(); 
    } 
    w(this.b);
    this.h = 0;
  }
  
  void l(b paramb, int paramInt) {
    this.d.b(paramb);
    int i = paramb.a;
    if (i != 2) {
      if (i == 4) {
        this.d.c(paramInt, paramb.d, paramb.c);
      } else {
        throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
      } 
    } else {
      this.d.h(paramInt, paramb.d);
    } 
  }
  
  int m(int paramInt) {
    return n(paramInt, 0);
  }
  
  int n(int paramInt1, int paramInt2) {
    int i = this.c.size();
    int j = paramInt2;
    for (paramInt2 = paramInt1; j < i; paramInt2 = paramInt1) {
      b b = this.c.get(j);
      int k = b.a;
      if (k == 8) {
        paramInt1 = b.b;
        if (paramInt1 == paramInt2) {
          paramInt1 = b.d;
        } else {
          int m = paramInt2;
          if (paramInt1 < paramInt2)
            m = paramInt2 - 1; 
          paramInt1 = m;
          if (b.d <= m)
            paramInt1 = m + 1; 
        } 
      } else {
        int m = b.b;
        paramInt1 = paramInt2;
        if (m <= paramInt2)
          if (k == 2) {
            paramInt1 = b.d;
            if (paramInt2 < m + paramInt1)
              return -1; 
            paramInt1 = paramInt2 - paramInt1;
          } else {
            paramInt1 = paramInt2;
            if (k == 1)
              paramInt1 = paramInt2 + b.d; 
          }  
      } 
      j++;
    } 
    return paramInt2;
  }
  
  boolean o(int paramInt) {
    boolean bool;
    if ((paramInt & this.h) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  boolean p() {
    boolean bool;
    if (this.b.size() > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  boolean q() {
    boolean bool;
    if (!this.c.isEmpty() && !this.b.isEmpty()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  boolean r(int paramInt1, int paramInt2, Object paramObject) {
    boolean bool = false;
    if (paramInt2 < 1)
      return false; 
    this.b.add(b(4, paramInt1, paramInt2, paramObject));
    this.h |= 0x4;
    if (this.b.size() == 1)
      bool = true; 
    return bool;
  }
  
  boolean s(int paramInt1, int paramInt2) {
    boolean bool = false;
    if (paramInt2 < 1)
      return false; 
    this.b.add(b(1, paramInt1, paramInt2, null));
    this.h |= 0x1;
    if (this.b.size() == 1)
      bool = true; 
    return bool;
  }
  
  boolean t(int paramInt1, int paramInt2) {
    boolean bool = false;
    if (paramInt2 < 1)
      return false; 
    this.b.add(b(2, paramInt1, paramInt2, null));
    this.h |= 0x2;
    if (this.b.size() == 1)
      bool = true; 
    return bool;
  }
  
  void v() {
    this.g.b(this.b);
    int i = this.b.size();
    for (byte b = 0; b < i; b++) {
      b b1 = this.b.get(b);
      int j = b1.a;
      if (j != 1) {
        if (j != 2) {
          if (j != 4) {
            if (j == 8)
              d(b1); 
          } else {
            g(b1);
          } 
        } else {
          f(b1);
        } 
      } else {
        c(b1);
      } 
      Runnable runnable = this.e;
      if (runnable != null)
        runnable.run(); 
    } 
    this.b.clear();
  }
  
  void w(List<b> paramList) {
    int i = paramList.size();
    for (byte b = 0; b < i; b++)
      a(paramList.get(b)); 
    paramList.clear();
  }
  
  void x() {
    w(this.b);
    w(this.c);
    this.h = 0;
  }
  
  static interface a {
    void a(int param1Int1, int param1Int2);
    
    void b(a.b param1b);
    
    void c(int param1Int1, int param1Int2, Object param1Object);
    
    void d(a.b param1b);
    
    RecyclerView.b0 e(int param1Int);
    
    void f(int param1Int1, int param1Int2);
    
    void g(int param1Int1, int param1Int2);
    
    void h(int param1Int1, int param1Int2);
  }
  
  static final class b {
    int a;
    
    int b;
    
    Object c;
    
    int d;
    
    b(int param1Int1, int param1Int2, int param1Int3, Object param1Object) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.d = param1Int3;
      this.c = param1Object;
    }
    
    String a() {
      int i = this.a;
      return (i != 1) ? ((i != 2) ? ((i != 4) ? ((i != 8) ? "??" : "mv") : "up") : "rm") : "add";
    }
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (!(param1Object instanceof b))
        return false; 
      b b1 = (b)param1Object;
      int i = this.a;
      if (i != b1.a)
        return false; 
      if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == b1.b && this.b == b1.d)
        return true; 
      if (this.d != b1.d)
        return false; 
      if (this.b != b1.b)
        return false; 
      param1Object = this.c;
      if (param1Object != null) {
        if (!param1Object.equals(b1.c))
          return false; 
      } else if (b1.c != null) {
        return false;
      } 
      return true;
    }
    
    public int hashCode() {
      return (this.a * 31 + this.b) * 31 + this.d;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append("[");
      stringBuilder.append(a());
      stringBuilder.append(",s:");
      stringBuilder.append(this.b);
      stringBuilder.append("c:");
      stringBuilder.append(this.d);
      stringBuilder.append(",p:");
      stringBuilder.append(this.c);
      stringBuilder.append("]");
      return stringBuilder.toString();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/recyclerview/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */