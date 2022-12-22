package com.github.jdsjlzx.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import c.b.a.g.e;
import c.b.a.g.f;
import com.github.jdsjlzx.view.LoadingFooter;

public class LuRecyclerView extends RecyclerView {
  private boolean M0 = true;
  
  private boolean N0 = false;
  
  private boolean O0 = false;
  
  private boolean P0 = false;
  
  private e Q0;
  
  private d R0;
  
  private c.b.a.g.a S0;
  
  private View T0;
  
  private View U0;
  
  private final RecyclerView.i V0 = new c(null);
  
  private int W0 = 10;
  
  private b X0;
  
  private boolean Y0 = false;
  
  protected LayoutManagerType Z0;
  
  private int[] a1;
  
  private int b1;
  
  private int c1 = 0;
  
  private int d1 = 0;
  
  private boolean e1 = true;
  
  private int f1 = 0;
  
  private int g1 = 0;
  
  private AppBarStateChangeListener$State h1 = AppBarStateChangeListener$State.b;
  
  public LuRecyclerView(Context paramContext) {
    this(paramContext, null);
  }
  
  public LuRecyclerView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public LuRecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    F1();
  }
  
  private void D1(int paramInt1, int paramInt2) {
    d d1 = this.R0;
    if (d1 != null)
      if (paramInt1 == 0) {
        if (!this.e1) {
          this.e1 = true;
          d1.a();
        } 
      } else {
        paramInt1 = this.d1;
        if (paramInt1 > 20 && this.e1) {
          this.e1 = false;
          d1.d();
          this.d1 = 0;
        } else if (paramInt1 < -20 && !this.e1) {
          this.e1 = true;
          d1.a();
          this.d1 = 0;
        } 
      }  
    boolean bool = this.e1;
    if ((bool && paramInt2 > 0) || (!bool && paramInt2 < 0))
      this.d1 += paramInt2; 
  }
  
  private int E1(int[] paramArrayOfint) {
    byte b1 = 0;
    int j = paramArrayOfint[0];
    int k = paramArrayOfint.length;
    while (b1 < k) {
      int m = paramArrayOfint[b1];
      int n = j;
      if (m > j)
        n = m; 
      b1++;
      j = n;
    } 
    return j;
  }
  
  private void F1() {
    if (this.M0)
      setLoadMoreFooter((c.b.a.g.a)new LoadingFooter(getContext().getApplicationContext())); 
  }
  
  public void L0(int paramInt) {
    super.L0(paramInt);
    this.c1 = paramInt;
    d d1 = this.R0;
    if (d1 != null)
      d1.c(paramInt); 
    if (this.Q0 != null && this.M0 && this.c1 == 0) {
      RecyclerView.o o = getLayoutManager();
      int j = o.J();
      paramInt = o.Y();
      if (j > 0 && this.b1 >= paramInt - 1 && paramInt > j && !this.Y0 && !this.N0) {
        this.U0.setVisibility(0);
        if (this.O0)
          return; 
        this.O0 = true;
        this.S0.c();
        this.Q0.a();
      } 
    } 
  }
  
  public void M0(int paramInt1, int paramInt2) {
    GridLayoutManager gridLayoutManager;
    super.M0(paramInt1, paramInt2);
    RecyclerView.o o = getLayoutManager();
    if (this.Z0 == null)
      if (o instanceof LinearLayoutManager) {
        this.Z0 = LayoutManagerType.b;
      } else if (o instanceof GridLayoutManager) {
        this.Z0 = LayoutManagerType.d;
      } else if (o instanceof StaggeredGridLayoutManager) {
        this.Z0 = LayoutManagerType.c;
      } else {
        throw new RuntimeException("Unsupported LayoutManager used. Valid ones are LinearLayoutManager, GridLayoutManager and StaggeredGridLayoutManager");
      }  
    int j = b.a[this.Z0.ordinal()];
    if (j != 1) {
      StaggeredGridLayoutManager staggeredGridLayoutManager;
      if (j != 2) {
        if (j != 3) {
          j = 0;
        } else {
          staggeredGridLayoutManager = (StaggeredGridLayoutManager)o;
          if (this.a1 == null)
            this.a1 = new int[staggeredGridLayoutManager.t2()]; 
          staggeredGridLayoutManager.j2(this.a1);
          this.b1 = E1(this.a1);
          staggeredGridLayoutManager.d2(this.a1);
          j = E1(this.a1);
        } 
      } else {
        gridLayoutManager = (GridLayoutManager)staggeredGridLayoutManager;
        j = gridLayoutManager.Z1();
        this.b1 = gridLayoutManager.b2();
      } 
    } else {
      LinearLayoutManager linearLayoutManager = (LinearLayoutManager)gridLayoutManager;
      j = linearLayoutManager.Z1();
      this.b1 = linearLayoutManager.b2();
    } 
    D1(j, paramInt2);
    j = this.g1 + paramInt1;
    this.g1 = j;
    int k = this.f1 + paramInt2;
    this.f1 = k;
    paramInt1 = j;
    if (j < 0)
      paramInt1 = 0; 
    this.g1 = paramInt1;
    j = k;
    if (k < 0)
      j = 0; 
    this.f1 = j;
    if (this.e1 && paramInt2 == 0)
      this.f1 = 0; 
    d d1 = this.R0;
    if (d1 != null)
      d1.b(paramInt1, this.f1); 
  }
  
  public void setAdapter(RecyclerView.Adapter paramAdapter) {
    b b1 = this.X0;
    if (b1 != null && this.V0 != null)
      b1.I().z(this.V0); 
    paramAdapter = paramAdapter;
    this.X0 = (b)paramAdapter;
    super.setAdapter(paramAdapter);
    this.X0.I().x(this.V0);
    this.V0.a();
    if (this.M0 && this.X0.F() == 0)
      this.X0.D(this.U0); 
  }
  
  public void setEmptyView(View paramView) {
    this.T0 = paramView;
    this.V0.a();
  }
  
  public void setFooterViewColor(int paramInt1, int paramInt2, int paramInt3) {
    c.b.a.g.a a1 = this.S0;
    if (a1 != null && a1 instanceof LoadingFooter) {
      LoadingFooter loadingFooter = (LoadingFooter)a1;
      loadingFooter.setIndicatorColor(androidx.core.content.a.d(getContext(), paramInt1));
      loadingFooter.setHintTextColor(paramInt2);
      loadingFooter.setViewBackgroundColor(paramInt3);
    } 
  }
  
  public void setFooterViewHint(String paramString1, String paramString2, String paramString3) {
    c.b.a.g.a a1 = this.S0;
    if (a1 != null && a1 instanceof LoadingFooter) {
      LoadingFooter loadingFooter = (LoadingFooter)a1;
      loadingFooter.setLoadingHint(paramString1);
      loadingFooter.setNoMoreHint(paramString2);
      loadingFooter.setNoNetWorkHint(paramString3);
    } 
  }
  
  public void setLScrollListener(d paramd) {
    this.R0 = paramd;
  }
  
  public void setLoadMoreEnabled(boolean paramBoolean) {
    b b1 = this.X0;
    if (b1 != null) {
      this.M0 = paramBoolean;
      if (!paramBoolean)
        if (b1 != null) {
          b1.M();
        } else {
          this.S0.d();
        }  
      return;
    } 
    throw new NullPointerException("mWrapAdapter cannot be null, please make sure the variable mWrapAdapter have been initialized.");
  }
  
  public void setLoadMoreFooter(c.b.a.g.a parama) {
    this.S0 = parama;
    View view = parama.getFootView();
    this.U0 = view;
    view.setVisibility(8);
  }
  
  public void setLoadingMoreProgressStyle(int paramInt) {
    c.b.a.g.a a1 = this.S0;
    if (a1 != null && a1 instanceof LoadingFooter)
      ((LoadingFooter)a1).setProgressStyle(paramInt); 
  }
  
  public void setNoMore(boolean paramBoolean) {
    this.O0 = false;
    this.Y0 = paramBoolean;
    if (paramBoolean) {
      this.S0.b();
    } else {
      this.S0.a();
    } 
  }
  
  public void setOnLoadMoreListener(e parame) {
    this.Q0 = parame;
  }
  
  public void setOnNetWorkErrorListener(f paramf) {
    LoadingFooter loadingFooter = (LoadingFooter)this.U0;
    loadingFooter.setState(LoadingFooter.State.e);
    loadingFooter.setOnClickListener(new a(this, paramf));
  }
  
  public void setRefreshing(boolean paramBoolean) {
    this.N0 = paramBoolean;
  }
  
  public enum LayoutManagerType {
    b, c, d;
    
    static {
      LayoutManagerType layoutManagerType1 = new LayoutManagerType("LinearLayout", 0);
      b = layoutManagerType1;
      LayoutManagerType layoutManagerType2 = new LayoutManagerType("StaggeredGridLayout", 1);
      c = layoutManagerType2;
      LayoutManagerType layoutManagerType3 = new LayoutManagerType("GridLayout", 2);
      d = layoutManagerType3;
      e = new LayoutManagerType[] { layoutManagerType1, layoutManagerType2, layoutManagerType3 };
    }
  }
  
  class a implements View.OnClickListener {
    a(LuRecyclerView this$0, f param1f) {}
    
    public void onClick(View param1View) {
      LuRecyclerView.C1(this.c).c();
      this.b.a();
    }
  }
  
  private class c extends RecyclerView.i {
    private c(LuRecyclerView this$0) {}
    
    public void a() {
      RecyclerView.Adapter adapter = this.a.getAdapter();
      if (adapter instanceof a) {
        adapter = adapter;
        if (adapter.I() != null && LuRecyclerView.y1(this.a) != null)
          if (adapter.I().d() == 0) {
            LuRecyclerView.y1(this.a).setVisibility(0);
            this.a.setVisibility(8);
          } else {
            LuRecyclerView.y1(this.a).setVisibility(8);
            this.a.setVisibility(0);
          }  
      } else if (adapter != null && LuRecyclerView.y1(this.a) != null) {
        if (adapter.d() == 0) {
          LuRecyclerView.y1(this.a).setVisibility(0);
          this.a.setVisibility(8);
        } else {
          LuRecyclerView.y1(this.a).setVisibility(8);
          this.a.setVisibility(0);
        } 
      } 
      if (LuRecyclerView.z1(this.a) != null) {
        LuRecyclerView.z1(this.a).i();
        if (LuRecyclerView.z1(this.a).I().d() < LuRecyclerView.A1(this.a))
          LuRecyclerView.B1(this.a).setVisibility(8); 
      } 
    }
    
    public void b(int param1Int1, int param1Int2) {
      LuRecyclerView.z1(this.a).k(param1Int1 + LuRecyclerView.z1(this.a).H() + 1, param1Int2);
    }
    
    public void d(int param1Int1, int param1Int2) {
      LuRecyclerView.z1(this.a).l(param1Int1 + LuRecyclerView.z1(this.a).H() + 1, param1Int2);
    }
    
    public void e(int param1Int1, int param1Int2) {
      LuRecyclerView.z1(this.a).m(param1Int1 + LuRecyclerView.z1(this.a).H() + 1, param1Int2);
      if (LuRecyclerView.z1(this.a).I().d() < LuRecyclerView.A1(this.a))
        LuRecyclerView.B1(this.a).setVisibility(8); 
    }
  }
  
  public static interface d {
    void a();
    
    void b(int param1Int1, int param1Int2);
    
    void c(int param1Int);
    
    void d();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/recyclerview/LuRecyclerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */