package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

class b {
  final b a;
  
  final a b;
  
  final List<View> c;
  
  b(b paramb) {
    this.a = paramb;
    this.b = new a();
    this.c = new ArrayList<View>();
  }
  
  private int h(int paramInt) {
    if (paramInt < 0)
      return -1; 
    int i = this.a.c();
    for (int j = paramInt; j < i; j += k) {
      int k = paramInt - j - this.b.b(j);
      if (k == 0) {
        while (this.b.d(j))
          j++; 
        return j;
      } 
    } 
    return -1;
  }
  
  private void l(View paramView) {
    this.c.add(paramView);
    this.a.b(paramView);
  }
  
  private boolean t(View paramView) {
    if (this.c.remove(paramView)) {
      this.a.h(paramView);
      return true;
    } 
    return false;
  }
  
  void a(View paramView, int paramInt, boolean paramBoolean) {
    if (paramInt < 0) {
      paramInt = this.a.c();
    } else {
      paramInt = h(paramInt);
    } 
    this.b.e(paramInt, paramBoolean);
    if (paramBoolean)
      l(paramView); 
    this.a.i(paramView, paramInt);
  }
  
  void b(View paramView, boolean paramBoolean) {
    a(paramView, -1, paramBoolean);
  }
  
  void c(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean) {
    if (paramInt < 0) {
      paramInt = this.a.c();
    } else {
      paramInt = h(paramInt);
    } 
    this.b.e(paramInt, paramBoolean);
    if (paramBoolean)
      l(paramView); 
    this.a.k(paramView, paramInt, paramLayoutParams);
  }
  
  void d(int paramInt) {
    paramInt = h(paramInt);
    this.b.f(paramInt);
    this.a.g(paramInt);
  }
  
  View e(int paramInt) {
    int i = this.c.size();
    for (byte b1 = 0; b1 < i; b1++) {
      View view = this.c.get(b1);
      RecyclerView.b0 b0 = this.a.f(view);
      if (b0.m() == paramInt && !b0.t() && !b0.v())
        return view; 
    } 
    return null;
  }
  
  View f(int paramInt) {
    paramInt = h(paramInt);
    return this.a.a(paramInt);
  }
  
  int g() {
    return this.a.c() - this.c.size();
  }
  
  View i(int paramInt) {
    return this.a.a(paramInt);
  }
  
  int j() {
    return this.a.c();
  }
  
  void k(View paramView) {
    int i = this.a.e(paramView);
    if (i >= 0) {
      this.b.h(i);
      l(paramView);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("view is not a child, cannot hide ");
    stringBuilder.append(paramView);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  int m(View paramView) {
    int i = this.a.e(paramView);
    return (i == -1) ? -1 : (this.b.d(i) ? -1 : (i - this.b.b(i)));
  }
  
  boolean n(View paramView) {
    return this.c.contains(paramView);
  }
  
  void o() {
    this.b.g();
    for (int i = this.c.size() - 1; i >= 0; i--) {
      this.a.h(this.c.get(i));
      this.c.remove(i);
    } 
    this.a.d();
  }
  
  void p(View paramView) {
    int i = this.a.e(paramView);
    if (i < 0)
      return; 
    if (this.b.f(i))
      t(paramView); 
    this.a.j(i);
  }
  
  void q(int paramInt) {
    paramInt = h(paramInt);
    View view = this.a.a(paramInt);
    if (view == null)
      return; 
    if (this.b.f(paramInt))
      t(view); 
    this.a.j(paramInt);
  }
  
  boolean r(View paramView) {
    int i = this.a.e(paramView);
    if (i == -1) {
      t(paramView);
      return true;
    } 
    if (this.b.d(i)) {
      this.b.f(i);
      t(paramView);
      this.a.j(i);
      return true;
    } 
    return false;
  }
  
  void s(View paramView) {
    int i = this.a.e(paramView);
    if (i >= 0) {
      if (this.b.d(i)) {
        this.b.a(i);
        t(paramView);
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("trying to unhide a view that was not hidden");
      stringBuilder1.append(paramView);
      throw new RuntimeException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("view is not a child, cannot hide ");
    stringBuilder.append(paramView);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.b.toString());
    stringBuilder.append(", hidden list:");
    stringBuilder.append(this.c.size());
    return stringBuilder.toString();
  }
  
  static class a {
    long a = 0L;
    
    a b;
    
    private void c() {
      if (this.b == null)
        this.b = new a(); 
    }
    
    void a(int param1Int) {
      if (param1Int >= 64) {
        a a1 = this.b;
        if (a1 != null)
          a1.a(param1Int - 64); 
      } else {
        this.a &= 1L << param1Int ^ 0xFFFFFFFFFFFFFFFFL;
      } 
    }
    
    int b(int param1Int) {
      a a1 = this.b;
      return (a1 == null) ? ((param1Int >= 64) ? Long.bitCount(this.a) : Long.bitCount(this.a & (1L << param1Int) - 1L)) : ((param1Int < 64) ? Long.bitCount(this.a & (1L << param1Int) - 1L) : (a1.b(param1Int - 64) + Long.bitCount(this.a)));
    }
    
    boolean d(int param1Int) {
      boolean bool;
      if (param1Int >= 64) {
        c();
        return this.b.d(param1Int - 64);
      } 
      if ((this.a & 1L << param1Int) != 0L) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    void e(int param1Int, boolean param1Boolean) {
      if (param1Int >= 64) {
        c();
        this.b.e(param1Int - 64, param1Boolean);
      } else {
        boolean bool;
        long l1 = this.a;
        if ((Long.MIN_VALUE & l1) != 0L) {
          bool = true;
        } else {
          bool = false;
        } 
        long l2 = (1L << param1Int) - 1L;
        this.a = (l1 & (l2 ^ 0xFFFFFFFFFFFFFFFFL)) << 1L | l1 & l2;
        if (param1Boolean) {
          h(param1Int);
        } else {
          a(param1Int);
        } 
        if (bool || this.b != null) {
          c();
          this.b.e(0, bool);
        } 
      } 
    }
    
    boolean f(int param1Int) {
      boolean bool;
      if (param1Int >= 64) {
        c();
        return this.b.f(param1Int - 64);
      } 
      long l1 = 1L << param1Int;
      long l2 = this.a;
      if ((l2 & l1) != 0L) {
        bool = true;
      } else {
        bool = false;
      } 
      l2 &= l1 ^ 0xFFFFFFFFFFFFFFFFL;
      this.a = l2;
      l1--;
      this.a = l2 & l1 | Long.rotateRight((l1 ^ 0xFFFFFFFFFFFFFFFFL) & l2, 1);
      a a1 = this.b;
      if (a1 != null) {
        if (a1.d(0))
          h(63); 
        this.b.f(0);
      } 
      return bool;
    }
    
    void g() {
      this.a = 0L;
      a a1 = this.b;
      if (a1 != null)
        a1.g(); 
    }
    
    void h(int param1Int) {
      if (param1Int >= 64) {
        c();
        this.b.h(param1Int - 64);
      } else {
        this.a |= 1L << param1Int;
      } 
    }
    
    public String toString() {
      String str;
      if (this.b == null) {
        str = Long.toBinaryString(this.a);
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.toString());
        stringBuilder.append("xx");
        stringBuilder.append(Long.toBinaryString(this.a));
        str = stringBuilder.toString();
      } 
      return str;
    }
  }
  
  static interface b {
    View a(int param1Int);
    
    void b(View param1View);
    
    int c();
    
    void d();
    
    int e(View param1View);
    
    RecyclerView.b0 f(View param1View);
    
    void g(int param1Int);
    
    void h(View param1View);
    
    void i(View param1View, int param1Int);
    
    void j(int param1Int);
    
    void k(View param1View, int param1Int, ViewGroup.LayoutParams param1LayoutParams);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/recyclerview/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */