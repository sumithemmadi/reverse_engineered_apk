package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

final class e implements Runnable {
  static final ThreadLocal<e> b = new ThreadLocal<e>();
  
  static Comparator<c> c = new a();
  
  ArrayList<RecyclerView> d = new ArrayList<RecyclerView>();
  
  long e;
  
  long f;
  
  private ArrayList<c> g = new ArrayList<c>();
  
  private void b() {
    int i = this.d.size();
    int j = 0;
    int k;
    for (k = 0; j < i; k = m) {
      RecyclerView recyclerView = this.d.get(j);
      int m = k;
      if (recyclerView.getWindowVisibility() == 0) {
        recyclerView.r0.c(recyclerView, false);
        m = k + recyclerView.r0.d;
      } 
      j++;
    } 
    this.g.ensureCapacity(k);
    k = 0;
    for (j = 0; k < i; j = m) {
      int m;
      RecyclerView recyclerView = this.d.get(k);
      if (recyclerView.getWindowVisibility() != 0) {
        m = j;
      } else {
        b b1 = recyclerView.r0;
        int n = Math.abs(b1.a) + Math.abs(b1.b);
        byte b = 0;
        while (true) {
          m = j;
          if (b < b1.d * 2) {
            c c;
            boolean bool;
            if (j >= this.g.size()) {
              c = new c();
              this.g.add(c);
            } else {
              c = this.g.get(j);
            } 
            int[] arrayOfInt = b1.c;
            m = arrayOfInt[b + 1];
            if (m <= n) {
              bool = true;
            } else {
              bool = false;
            } 
            c.a = bool;
            c.b = n;
            c.c = m;
            c.d = recyclerView;
            c.e = arrayOfInt[b];
            j++;
            b += 2;
            continue;
          } 
          break;
        } 
      } 
      k++;
    } 
    Collections.sort(this.g, c);
  }
  
  private void c(c paramc, long paramLong) {
    long l;
    if (paramc.a) {
      l = Long.MAX_VALUE;
    } else {
      l = paramLong;
    } 
    RecyclerView.b0 b0 = i(paramc.d, paramc.e, l);
    if (b0 != null && b0.c != null && b0.s() && !b0.t())
      h(b0.c.get(), paramLong); 
  }
  
  private void d(long paramLong) {
    for (byte b = 0; b < this.g.size(); b++) {
      c c = this.g.get(b);
      if (c.d == null)
        break; 
      c(c, paramLong);
      c.a();
    } 
  }
  
  static boolean e(RecyclerView paramRecyclerView, int paramInt) {
    int i = paramRecyclerView.o.j();
    for (byte b = 0; b < i; b++) {
      RecyclerView.b0 b0 = RecyclerView.g0(paramRecyclerView.o.i(b));
      if (b0.d == paramInt && !b0.t())
        return true; 
    } 
    return false;
  }
  
  private void h(RecyclerView paramRecyclerView, long paramLong) {
    if (paramRecyclerView == null)
      return; 
    if (paramRecyclerView.O && paramRecyclerView.o.j() != 0)
      paramRecyclerView.V0(); 
    b b = paramRecyclerView.r0;
    b.c(paramRecyclerView, true);
    if (b.d != 0)
      try {
        androidx.core.os.c.a("RV Nested Prefetch");
        paramRecyclerView.s0.f(paramRecyclerView.v);
        for (byte b1 = 0; b1 < b.d * 2; b1 += 2)
          i(paramRecyclerView, b.c[b1], paramLong); 
      } finally {
        androidx.core.os.c.b();
      }  
  }
  
  private RecyclerView.b0 i(RecyclerView paramRecyclerView, int paramInt, long paramLong) {
    if (e(paramRecyclerView, paramInt))
      return null; 
    null = paramRecyclerView.l;
    try {
      paramRecyclerView.H0();
      RecyclerView.b0 b0 = null.I(paramInt, false, paramLong);
      if (b0 != null)
        if (b0.s() && !b0.t()) {
          null.B(b0.b);
        } else {
          null.a(b0, false);
        }  
      return b0;
    } finally {
      paramRecyclerView.J0(false);
    } 
  }
  
  public void a(RecyclerView paramRecyclerView) {
    this.d.add(paramRecyclerView);
  }
  
  void f(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    if (paramRecyclerView.isAttachedToWindow() && this.e == 0L) {
      this.e = paramRecyclerView.getNanoTime();
      paramRecyclerView.post(this);
    } 
    paramRecyclerView.r0.e(paramInt1, paramInt2);
  }
  
  void g(long paramLong) {
    b();
    d(paramLong);
  }
  
  public void j(RecyclerView paramRecyclerView) {
    this.d.remove(paramRecyclerView);
  }
  
  public void run() {
    try {
      androidx.core.os.c.a("RV Prefetch");
      boolean bool = this.d.isEmpty();
      if (!bool) {
        int i = this.d.size();
        byte b = 0;
        long l;
        for (l = 0L; b < i; l = l1) {
          RecyclerView recyclerView = this.d.get(b);
          long l1 = l;
          if (recyclerView.getWindowVisibility() == 0)
            l1 = Math.max(recyclerView.getDrawingTime(), l); 
          b++;
        } 
        if (l != 0L) {
          g(TimeUnit.MILLISECONDS.toNanos(l) + this.f);
          return;
        } 
      } 
      return;
    } finally {
      this.e = 0L;
      androidx.core.os.c.b();
    } 
  }
  
  class a implements Comparator<c> {
    public int a(e.c param1c1, e.c param1c2) {
      byte b2;
      RecyclerView recyclerView = param1c1.d;
      byte b = 1;
      byte b1 = 1;
      if (recyclerView == null) {
        i = 1;
      } else {
        i = 0;
      } 
      if (param1c2.d == null) {
        b2 = 1;
      } else {
        b2 = 0;
      } 
      if (i != b2) {
        if (recyclerView == null) {
          i = b1;
        } else {
          i = -1;
        } 
        return i;
      } 
      boolean bool = param1c1.a;
      if (bool != param1c2.a) {
        i = b;
        if (bool)
          i = -1; 
        return i;
      } 
      int i = param1c2.b - param1c1.b;
      if (i != 0)
        return i; 
      i = param1c1.c - param1c2.c;
      return (i != 0) ? i : 0;
    }
  }
  
  @SuppressLint({"VisibleForTests"})
  static class b implements RecyclerView.o.c {
    int a;
    
    int b;
    
    int[] c;
    
    int d;
    
    public void a(int param1Int1, int param1Int2) {
      if (param1Int1 >= 0) {
        if (param1Int2 >= 0) {
          int i = this.d * 2;
          int[] arrayOfInt = this.c;
          if (arrayOfInt == null) {
            arrayOfInt = new int[4];
            this.c = arrayOfInt;
            Arrays.fill(arrayOfInt, -1);
          } else if (i >= arrayOfInt.length) {
            int[] arrayOfInt1 = new int[i * 2];
            this.c = arrayOfInt1;
            System.arraycopy(arrayOfInt, 0, arrayOfInt1, 0, arrayOfInt.length);
          } 
          arrayOfInt = this.c;
          arrayOfInt[i] = param1Int1;
          arrayOfInt[i + 1] = param1Int2;
          this.d++;
          return;
        } 
        throw new IllegalArgumentException("Pixel distance must be non-negative");
      } 
      throw new IllegalArgumentException("Layout positions must be non-negative");
    }
    
    void b() {
      int[] arrayOfInt = this.c;
      if (arrayOfInt != null)
        Arrays.fill(arrayOfInt, -1); 
      this.d = 0;
    }
    
    void c(RecyclerView param1RecyclerView, boolean param1Boolean) {
      this.d = 0;
      int[] arrayOfInt = this.c;
      if (arrayOfInt != null)
        Arrays.fill(arrayOfInt, -1); 
      RecyclerView.o o = param1RecyclerView.w;
      if (param1RecyclerView.v != null && o != null && o.u0()) {
        if (param1Boolean) {
          if (!param1RecyclerView.n.p())
            o.p(param1RecyclerView.v.d(), this); 
        } else if (!param1RecyclerView.m0()) {
          o.o(this.a, this.b, param1RecyclerView.s0, this);
        } 
        int i = this.d;
        if (i > o.m) {
          o.m = i;
          o.n = param1Boolean;
          param1RecyclerView.l.K();
        } 
      } 
    }
    
    boolean d(int param1Int) {
      if (this.c != null) {
        int i = this.d;
        for (byte b1 = 0; b1 < i * 2; b1 += 2) {
          if (this.c[b1] == param1Int)
            return true; 
        } 
      } 
      return false;
    }
    
    void e(int param1Int1, int param1Int2) {
      this.a = param1Int1;
      this.b = param1Int2;
    }
  }
  
  static class c {
    public boolean a;
    
    public int b;
    
    public int c;
    
    public RecyclerView d;
    
    public int e;
    
    public void a() {
      this.a = false;
      this.b = 0;
      this.c = 0;
      this.d = null;
      this.e = 0;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/recyclerview/widget/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */