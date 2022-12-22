package com.github.jdsjlzx.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.List;

public class a extends RecyclerView.Adapter<RecyclerView.b0> {
  private static List<Integer> d = new ArrayList<Integer>();
  
  private c.b.a.g.b e;
  
  private c.b.a.g.c f;
  
  private c.b.a.g.d g;
  
  private RecyclerView.Adapter h;
  
  private ArrayList<View> i = new ArrayList<View>();
  
  private ArrayList<View> j = new ArrayList<View>();
  
  private d k;
  
  public a(RecyclerView.Adapter paramAdapter) {
    this.h = paramAdapter;
  }
  
  private View G(int paramInt) {
    return !L(paramInt) ? null : this.i.get(paramInt - 10002);
  }
  
  private boolean L(int paramInt) {
    boolean bool;
    if (this.i.size() > 0 && d.contains(Integer.valueOf(paramInt))) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void D(View paramView) {
    if (paramView != null) {
      N();
      this.j.add(paramView);
      return;
    } 
    throw new RuntimeException("footer is null");
  }
  
  public View E() {
    View view;
    if (F() > 0) {
      view = this.j.get(0);
    } else {
      view = null;
    } 
    return view;
  }
  
  public int F() {
    return this.j.size();
  }
  
  public int H() {
    return this.i.size();
  }
  
  public RecyclerView.Adapter I() {
    return this.h;
  }
  
  public boolean J(int paramInt) {
    boolean bool;
    int i = d();
    int j = F();
    if (F() > 0 && paramInt >= i - j) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean K(int paramInt) {
    boolean bool = true;
    if (paramInt < 1 || paramInt >= this.i.size() + 1)
      bool = false; 
    return bool;
  }
  
  public boolean M(int paramInt) {
    boolean bool;
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void N() {
    if (F() > 0) {
      View view = E();
      this.j.remove(view);
      i();
    } 
  }
  
  public void O(c.b.a.g.b paramb) {
    this.e = paramb;
  }
  
  public void P(d paramd) {
    this.k = paramd;
  }
  
  public int d() {
    if (this.h != null) {
      int k = H() + F();
      int m = this.h.d();
      return k + m + 1;
    } 
    int i = H();
    int j = F();
    return i + j + 1;
  }
  
  public long e(int paramInt) {
    if (this.h != null && paramInt >= H()) {
      int i = paramInt - H();
      paramInt = i;
      if (h())
        paramInt = i - 1; 
      if (paramInt < this.h.d())
        return this.h.e(paramInt); 
    } 
    return -1L;
  }
  
  public int f(int paramInt) {
    int i = paramInt - H() + 1;
    if (M(paramInt))
      return 10000; 
    if (K(paramInt))
      return ((Integer)d.get(paramInt - 1)).intValue(); 
    if (J(paramInt))
      return 10001; 
    RecyclerView.Adapter adapter = this.h;
    return (adapter != null && i < adapter.d()) ? this.h.f(i) : 0;
  }
  
  public void o(RecyclerView paramRecyclerView) {
    super.o(paramRecyclerView);
    RecyclerView.o o = paramRecyclerView.getLayoutManager();
    if (o instanceof GridLayoutManager) {
      GridLayoutManager gridLayoutManager = (GridLayoutManager)o;
      gridLayoutManager.d3(new c(this, gridLayoutManager));
    } 
    this.h.o(paramRecyclerView);
  }
  
  public void p(RecyclerView.b0 paramb0, int paramInt) {
    if (!K(paramInt) && !M(paramInt)) {
      paramInt -= H() + 1;
      RecyclerView.Adapter adapter = this.h;
      if (adapter != null && paramInt < adapter.d()) {
        this.h.p(paramb0, paramInt);
        if (this.f != null)
          paramb0.b.setOnClickListener(new a(this, paramb0, paramInt)); 
        if (this.g != null)
          paramb0.b.setOnLongClickListener(new b(this, paramb0, paramInt)); 
      } 
    } 
  }
  
  public void q(RecyclerView.b0 paramb0, int paramInt, List<Object> paramList) {
    if (paramList.isEmpty()) {
      p(paramb0, paramInt);
    } else if (!K(paramInt) && !M(paramInt)) {
      paramInt -= H() + 1;
      RecyclerView.Adapter adapter = this.h;
      if (adapter != null && paramInt < adapter.d())
        this.h.q(paramb0, paramInt, paramList); 
    } 
  }
  
  public RecyclerView.b0 r(ViewGroup paramViewGroup, int paramInt) {
    return (paramInt == 10000) ? new e(this.e.getHeaderView()) : (L(paramInt) ? new e(G(paramInt)) : ((paramInt == 10001) ? new e(this.j.get(0)) : this.h.r(paramViewGroup, paramInt)));
  }
  
  public void s(RecyclerView paramRecyclerView) {
    this.h.s(paramRecyclerView);
  }
  
  public void u(RecyclerView.b0 paramb0) {
    super.u(paramb0);
    ViewGroup.LayoutParams layoutParams = paramb0.b.getLayoutParams();
    if (layoutParams != null && layoutParams instanceof StaggeredGridLayoutManager.LayoutParams && (K(paramb0.m()) || M(paramb0.m()) || J(paramb0.m())))
      ((StaggeredGridLayoutManager.LayoutParams)layoutParams).f(true); 
    this.h.u(paramb0);
  }
  
  public void v(RecyclerView.b0 paramb0) {
    this.h.v(paramb0);
  }
  
  public void w(RecyclerView.b0 paramb0) {
    this.h.w(paramb0);
  }
  
  class a implements View.OnClickListener {
    a(a this$0, RecyclerView.b0 param1b0, int param1Int) {}
    
    public void onClick(View param1View) {
      a.A(this.d).a(this.b.b, this.c);
    }
  }
  
  class b implements View.OnLongClickListener {
    b(a this$0, RecyclerView.b0 param1b0, int param1Int) {}
    
    public boolean onLongClick(View param1View) {
      a.B(this.d).a(this.b.b, this.c);
      return true;
    }
  }
  
  class c extends GridLayoutManager.b {
    c(a this$0, GridLayoutManager param1GridLayoutManager) {}
    
    public int f(int param1Int) {
      a.d d = a.C(this.f);
      int i = 1;
      if (d == null) {
        if (this.f.K(param1Int) || this.f.J(param1Int) || this.f.M(param1Int))
          i = this.e.V2(); 
        return i;
      } 
      return (this.f.K(param1Int) || this.f.J(param1Int) || this.f.M(param1Int)) ? this.e.V2() : a.C(this.f).a(this.e, param1Int - this.f.H() + 1);
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/recyclerview/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */