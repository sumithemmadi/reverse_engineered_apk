package com.github.jdsjlzx.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.List;

public class b extends RecyclerView.Adapter<RecyclerView.b0> {
  private static List<Integer> d = new ArrayList<Integer>();
  
  private c.b.a.g.c e;
  
  private c.b.a.g.d f;
  
  private RecyclerView.Adapter g;
  
  private ArrayList<View> h;
  
  private ArrayList<View> i;
  
  private d j;
  
  private View G(int paramInt) {
    return !L(paramInt) ? null : this.h.get(paramInt - 10002);
  }
  
  private boolean L(int paramInt) {
    boolean bool;
    if (this.h.size() > 0 && d.contains(Integer.valueOf(paramInt))) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void D(View paramView) {
    if (paramView != null) {
      if (F() > 0)
        M(); 
      this.i.add(paramView);
      return;
    } 
    throw new RuntimeException("footer is null");
  }
  
  public View E() {
    View view;
    if (F() > 0) {
      view = this.i.get(0);
    } else {
      view = null;
    } 
    return view;
  }
  
  public int F() {
    return this.i.size();
  }
  
  public int H() {
    return this.h.size();
  }
  
  public RecyclerView.Adapter I() {
    return this.g;
  }
  
  public boolean J(int paramInt) {
    int i = d();
    boolean bool = true;
    if (F() <= 0 || paramInt < i - 1)
      bool = false; 
    return bool;
  }
  
  public boolean K(int paramInt) {
    boolean bool;
    if (paramInt >= 0 && paramInt < this.h.size()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void M() {
    if (F() > 0) {
      View view = E();
      this.i.remove(view);
      i();
    } 
  }
  
  public int d() {
    if (this.g != null) {
      int k = H() + F();
      int m = this.g.d();
      return k + m;
    } 
    int i = H();
    int j = F();
    return i + j;
  }
  
  public long e(int paramInt) {
    if (this.g != null && paramInt >= H()) {
      paramInt -= H();
      if (paramInt < this.g.d())
        return this.g.e(paramInt); 
    } 
    return -1L;
  }
  
  public int f(int paramInt) {
    int i = paramInt - H();
    if (K(paramInt))
      return ((Integer)d.get(paramInt)).intValue(); 
    if (J(paramInt))
      return 10001; 
    RecyclerView.Adapter adapter = this.g;
    return (adapter != null && i < adapter.d()) ? this.g.f(i) : 0;
  }
  
  public void o(RecyclerView paramRecyclerView) {
    super.o(paramRecyclerView);
    RecyclerView.o o = paramRecyclerView.getLayoutManager();
    if (o instanceof GridLayoutManager) {
      GridLayoutManager gridLayoutManager = (GridLayoutManager)o;
      gridLayoutManager.d3(new c(this, gridLayoutManager));
    } 
    this.g.o(paramRecyclerView);
  }
  
  public void p(RecyclerView.b0 paramb0, int paramInt) {
    if (K(paramInt))
      return; 
    paramInt -= H();
    RecyclerView.Adapter adapter = this.g;
    if (adapter != null && paramInt < adapter.d()) {
      this.g.p(paramb0, paramInt);
      if (this.e != null)
        paramb0.b.setOnClickListener(new a(this, paramb0, paramInt)); 
      if (this.f != null)
        paramb0.b.setOnLongClickListener(new b(this, paramb0, paramInt)); 
    } 
  }
  
  public void q(RecyclerView.b0 paramb0, int paramInt, List<Object> paramList) {
    if (paramList.isEmpty()) {
      p(paramb0, paramInt);
    } else {
      if (K(paramInt))
        return; 
      paramInt -= H();
      RecyclerView.Adapter adapter = this.g;
      if (adapter != null && paramInt < adapter.d())
        this.g.q(paramb0, paramInt, paramList); 
    } 
  }
  
  public RecyclerView.b0 r(ViewGroup paramViewGroup, int paramInt) {
    return L(paramInt) ? new e(G(paramInt)) : ((paramInt == 10001) ? new e(this.i.get(0)) : this.g.r(paramViewGroup, paramInt));
  }
  
  public void s(RecyclerView paramRecyclerView) {
    this.g.s(paramRecyclerView);
  }
  
  public void u(RecyclerView.b0 paramb0) {
    super.u(paramb0);
    ViewGroup.LayoutParams layoutParams = paramb0.b.getLayoutParams();
    if (layoutParams != null && layoutParams instanceof StaggeredGridLayoutManager.LayoutParams && (K(paramb0.m()) || J(paramb0.m())))
      ((StaggeredGridLayoutManager.LayoutParams)layoutParams).f(true); 
    this.g.u(paramb0);
  }
  
  public void v(RecyclerView.b0 paramb0) {
    this.g.v(paramb0);
  }
  
  public void w(RecyclerView.b0 paramb0) {
    this.g.w(paramb0);
  }
  
  class a implements View.OnClickListener {
    a(b this$0, RecyclerView.b0 param1b0, int param1Int) {}
    
    public void onClick(View param1View) {
      b.A(this.d).a(this.b.b, this.c);
    }
  }
  
  class b implements View.OnLongClickListener {
    b(b this$0, RecyclerView.b0 param1b0, int param1Int) {}
    
    public boolean onLongClick(View param1View) {
      b.B(this.d).a(this.b.b, this.c);
      return true;
    }
  }
  
  class c extends GridLayoutManager.b {
    c(b this$0, GridLayoutManager param1GridLayoutManager) {}
    
    public int f(int param1Int) {
      b.d d = b.C(this.f);
      int i = 1;
      if (d == null) {
        if (this.f.K(param1Int) || this.f.J(param1Int))
          i = this.e.V2(); 
        return i;
      } 
      return (this.f.K(param1Int) || this.f.J(param1Int)) ? this.e.V2() : b.C(this.f).a(this.e, param1Int - this.f.H() + 1);
    }
  }
  
  public static interface d {
    int a(GridLayoutManager param1GridLayoutManager, int param1Int);
  }
  
  public static class e extends RecyclerView.b0 {
    public e(View param1View) {
      super(param1View);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/recyclerview/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */