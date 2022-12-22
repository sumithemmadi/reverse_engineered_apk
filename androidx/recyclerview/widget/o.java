package androidx.recyclerview.widget;

import android.view.View;

class o {
  final b a;
  
  a b;
  
  o(b paramb) {
    this.a = paramb;
    this.b = new a();
  }
  
  View a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    byte b1;
    int i = this.a.c();
    int j = this.a.d();
    if (paramInt2 > paramInt1) {
      b1 = 1;
    } else {
      b1 = -1;
    } 
    View view;
    for (view = null; paramInt1 != paramInt2; view = view2) {
      View view1 = this.a.a(paramInt1);
      int k = this.a.b(view1);
      int m = this.a.e(view1);
      this.b.e(i, j, k, m);
      if (paramInt3 != 0) {
        this.b.d();
        this.b.a(paramInt3);
        if (this.b.b())
          return view1; 
      } 
      View view2 = view;
      if (paramInt4 != 0) {
        this.b.d();
        this.b.a(paramInt4);
        view2 = view;
        if (this.b.b())
          view2 = view1; 
      } 
      paramInt1 += b1;
    } 
    return view;
  }
  
  boolean b(View paramView, int paramInt) {
    this.b.e(this.a.c(), this.a.d(), this.a.b(paramView), this.a.e(paramView));
    if (paramInt != 0) {
      this.b.d();
      this.b.a(paramInt);
      return this.b.b();
    } 
    return false;
  }
  
  static class a {
    int a = 0;
    
    int b;
    
    int c;
    
    int d;
    
    int e;
    
    void a(int param1Int) {
      this.a = param1Int | this.a;
    }
    
    boolean b() {
      int i = this.a;
      if ((i & 0x7) != 0 && (i & c(this.d, this.b) << 0) == 0)
        return false; 
      i = this.a;
      if ((i & 0x70) != 0 && (i & c(this.d, this.c) << 4) == 0)
        return false; 
      i = this.a;
      if ((i & 0x700) != 0 && (i & c(this.e, this.b) << 8) == 0)
        return false; 
      i = this.a;
      return !((i & 0x7000) != 0 && (i & c(this.e, this.c) << 12) == 0);
    }
    
    int c(int param1Int1, int param1Int2) {
      return (param1Int1 > param1Int2) ? 1 : ((param1Int1 == param1Int2) ? 2 : 4);
    }
    
    void d() {
      this.a = 0;
    }
    
    void e(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      this.b = param1Int1;
      this.c = param1Int2;
      this.d = param1Int3;
      this.e = param1Int4;
    }
  }
  
  static interface b {
    View a(int param1Int);
    
    int b(View param1View);
    
    int c();
    
    int d();
    
    int e(View param1View);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/recyclerview/widget/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */