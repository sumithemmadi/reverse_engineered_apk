package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

public abstract class i {
  protected final RecyclerView.o a;
  
  private int b = Integer.MIN_VALUE;
  
  final Rect c = new Rect();
  
  private i(RecyclerView.o paramo) {
    this.a = paramo;
  }
  
  public static i a(RecyclerView.o paramo) {
    return new a(paramo);
  }
  
  public static i b(RecyclerView.o paramo, int paramInt) {
    if (paramInt != 0) {
      if (paramInt == 1)
        return c(paramo); 
      throw new IllegalArgumentException("invalid orientation");
    } 
    return a(paramo);
  }
  
  public static i c(RecyclerView.o paramo) {
    return new b(paramo);
  }
  
  public abstract int d(View paramView);
  
  public abstract int e(View paramView);
  
  public abstract int f(View paramView);
  
  public abstract int g(View paramView);
  
  public abstract int h();
  
  public abstract int i();
  
  public abstract int j();
  
  public abstract int k();
  
  public abstract int l();
  
  public abstract int m();
  
  public abstract int n();
  
  public int o() {
    int j;
    if (Integer.MIN_VALUE == this.b) {
      j = 0;
    } else {
      j = n() - this.b;
    } 
    return j;
  }
  
  public abstract int p(View paramView);
  
  public abstract int q(View paramView);
  
  public abstract void r(int paramInt);
  
  public void s() {
    this.b = n();
  }
  
  class a extends i {
    a(i this$0) {
      super((RecyclerView.o)this$0, null);
    }
    
    public int d(View param1View) {
      RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)param1View.getLayoutParams();
      return this.a.T(param1View) + layoutParams.rightMargin;
    }
    
    public int e(View param1View) {
      RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)param1View.getLayoutParams();
      return this.a.S(param1View) + layoutParams.leftMargin + layoutParams.rightMargin;
    }
    
    public int f(View param1View) {
      RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)param1View.getLayoutParams();
      return this.a.R(param1View) + layoutParams.topMargin + layoutParams.bottomMargin;
    }
    
    public int g(View param1View) {
      RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)param1View.getLayoutParams();
      return this.a.Q(param1View) - layoutParams.leftMargin;
    }
    
    public int h() {
      return this.a.o0();
    }
    
    public int i() {
      return this.a.o0() - this.a.f0();
    }
    
    public int j() {
      return this.a.f0();
    }
    
    public int k() {
      return this.a.p0();
    }
    
    public int l() {
      return this.a.X();
    }
    
    public int m() {
      return this.a.e0();
    }
    
    public int n() {
      return this.a.o0() - this.a.e0() - this.a.f0();
    }
    
    public int p(View param1View) {
      this.a.n0(param1View, true, this.c);
      return this.c.right;
    }
    
    public int q(View param1View) {
      this.a.n0(param1View, true, this.c);
      return this.c.left;
    }
    
    public void r(int param1Int) {
      this.a.C0(param1Int);
    }
  }
  
  class b extends i {
    b(i this$0) {
      super((RecyclerView.o)this$0, null);
    }
    
    public int d(View param1View) {
      RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)param1View.getLayoutParams();
      return this.a.O(param1View) + layoutParams.bottomMargin;
    }
    
    public int e(View param1View) {
      RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)param1View.getLayoutParams();
      return this.a.R(param1View) + layoutParams.topMargin + layoutParams.bottomMargin;
    }
    
    public int f(View param1View) {
      RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)param1View.getLayoutParams();
      return this.a.S(param1View) + layoutParams.leftMargin + layoutParams.rightMargin;
    }
    
    public int g(View param1View) {
      RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)param1View.getLayoutParams();
      return this.a.U(param1View) - layoutParams.topMargin;
    }
    
    public int h() {
      return this.a.W();
    }
    
    public int i() {
      return this.a.W() - this.a.d0();
    }
    
    public int j() {
      return this.a.d0();
    }
    
    public int k() {
      return this.a.X();
    }
    
    public int l() {
      return this.a.p0();
    }
    
    public int m() {
      return this.a.g0();
    }
    
    public int n() {
      return this.a.W() - this.a.g0() - this.a.d0();
    }
    
    public int p(View param1View) {
      this.a.n0(param1View, true, this.c);
      return this.c.bottom;
    }
    
    public int q(View param1View) {
      this.a.n0(param1View, true, this.c);
      return this.c.top;
    }
    
    public void r(int param1Int) {
      this.a.D0(param1Int);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/recyclerview/widget/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */