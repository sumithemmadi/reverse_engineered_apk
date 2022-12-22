package com.github.jdsjlzx.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import c.b.a.g.e;
import c.b.a.g.f;
import c.b.a.g.g;
import com.github.jdsjlzx.view.ArrowRefreshHeader;
import com.github.jdsjlzx.view.LoadingFooter;

public class LRecyclerView extends RecyclerView {
  private boolean M0 = true;
  
  private boolean N0 = true;
  
  private boolean O0 = false;
  
  private boolean P0 = false;
  
  private g Q0;
  
  private e R0;
  
  private d S0;
  
  private c.b.a.g.b T0;
  
  private c.b.a.g.a U0;
  
  private View V0;
  
  private View W0;
  
  private final RecyclerView.i X0 = new c(null);
  
  private float Y0 = -1.0F;
  
  private float Z0;
  
  private int a1 = 10;
  
  private a b1;
  
  private boolean c1 = false;
  
  private boolean d1;
  
  private int e1;
  
  private float f1;
  
  private float g1;
  
  private boolean h1;
  
  protected LayoutManagerType i1;
  
  private int[] j1;
  
  private int k1;
  
  private int l1 = 0;
  
  private int m1 = 0;
  
  private boolean n1 = true;
  
  private int o1 = 0;
  
  private int p1 = 0;
  
  private AppBarStateChangeListener$State q1 = AppBarStateChangeListener$State.b;
  
  public LRecyclerView(Context paramContext) {
    this(paramContext, null);
  }
  
  public LRecyclerView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public LRecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    F1();
  }
  
  private void D1(int paramInt1, int paramInt2) {
    d d1 = this.S0;
    if (d1 != null)
      if (paramInt1 == 0) {
        if (!this.n1) {
          this.n1 = true;
          d1.a();
        } 
      } else {
        paramInt1 = this.m1;
        if (paramInt1 > 20 && this.n1) {
          this.n1 = false;
          d1.d();
          this.m1 = 0;
        } else if (paramInt1 < -20 && !this.n1) {
          this.n1 = true;
          d1.a();
          this.m1 = 0;
        } 
      }  
    boolean bool = this.n1;
    if ((bool && paramInt2 > 0) || (!bool && paramInt2 < 0))
      this.m1 += paramInt2; 
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
    this.e1 = ViewConfiguration.get(getContext().getApplicationContext()).getScaledTouchSlop();
    if (this.M0)
      setRefreshHeader((c.b.a.g.b)new ArrowRefreshHeader(getContext().getApplicationContext())); 
    if (this.N0)
      setLoadMoreFooter((c.b.a.g.a)new LoadingFooter(getContext().getApplicationContext())); 
  }
  
  public boolean G1() {
    boolean bool;
    if (this.M0 && this.T0.getHeaderView().getParent() != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void H1(int paramInt) {
    this.a1 = paramInt;
    if (this.O0) {
      this.c1 = false;
      this.O0 = false;
      this.T0.c();
      if (this.b1.I().d() < paramInt)
        this.W0.setVisibility(8); 
    } else if (this.P0) {
      this.P0 = false;
      this.U0.a();
    } 
  }
  
  public void L0(int paramInt) {
    super.L0(paramInt);
    this.l1 = paramInt;
    d d1 = this.S0;
    if (d1 != null)
      d1.c(paramInt); 
    if (this.R0 != null && this.N0 && this.l1 == 0) {
      RecyclerView.o o = getLayoutManager();
      int j = o.J();
      paramInt = o.Y();
      if (j > 0 && this.k1 >= paramInt - 1 && paramInt > j && !this.c1 && !this.O0) {
        this.W0.setVisibility(0);
        if (this.P0)
          return; 
        this.P0 = true;
        this.U0.c();
        this.R0.a();
      } 
    } 
  }
  
  public void M0(int paramInt1, int paramInt2) {
    GridLayoutManager gridLayoutManager;
    super.M0(paramInt1, paramInt2);
    RecyclerView.o o = getLayoutManager();
    if (this.i1 == null)
      if (o instanceof LinearLayoutManager) {
        this.i1 = LayoutManagerType.b;
      } else if (o instanceof GridLayoutManager) {
        this.i1 = LayoutManagerType.d;
      } else if (o instanceof StaggeredGridLayoutManager) {
        this.i1 = LayoutManagerType.c;
      } else {
        throw new RuntimeException("Unsupported LayoutManager used. Valid ones are LinearLayoutManager, GridLayoutManager and StaggeredGridLayoutManager");
      }  
    int j = b.a[this.i1.ordinal()];
    if (j != 1) {
      StaggeredGridLayoutManager staggeredGridLayoutManager;
      if (j != 2) {
        if (j != 3) {
          j = 0;
        } else {
          staggeredGridLayoutManager = (StaggeredGridLayoutManager)o;
          if (this.j1 == null)
            this.j1 = new int[staggeredGridLayoutManager.t2()]; 
          staggeredGridLayoutManager.j2(this.j1);
          this.k1 = E1(this.j1);
          staggeredGridLayoutManager.d2(this.j1);
          j = E1(this.j1);
        } 
      } else {
        gridLayoutManager = (GridLayoutManager)staggeredGridLayoutManager;
        j = gridLayoutManager.Z1();
        this.k1 = gridLayoutManager.b2();
      } 
    } else {
      LinearLayoutManager linearLayoutManager = (LinearLayoutManager)gridLayoutManager;
      j = linearLayoutManager.Z1();
      this.k1 = linearLayoutManager.b2();
    } 
    D1(j, paramInt2);
    j = this.p1 + paramInt1;
    this.p1 = j;
    int k = this.o1 + paramInt2;
    this.o1 = k;
    paramInt1 = j;
    if (j < 0)
      paramInt1 = 0; 
    this.p1 = paramInt1;
    j = k;
    if (k < 0)
      j = 0; 
    this.o1 = j;
    if (this.n1 && paramInt2 == 0)
      this.o1 = 0; 
    d d1 = this.S0;
    if (d1 != null)
      d1.b(paramInt1, this.o1); 
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    a a1 = this.b1;
    if (a1 != null && this.X0 != null && this.h1) {
      a1.I().z(this.X0);
      this.h1 = false;
    } 
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    int j = paramMotionEvent.getAction();
    if (j != 0) {
      if (j != 1)
        if (j != 2) {
          if (j != 3)
            return super.onInterceptTouchEvent(paramMotionEvent); 
        } else {
          if (this.d1)
            return false; 
          float f1 = paramMotionEvent.getY();
          float f2 = Math.abs(paramMotionEvent.getX() - this.g1);
          f1 = Math.abs(f1 - this.f1);
          if (f2 > this.e1 && f2 > f1) {
            this.d1 = true;
            return false;
          } 
          return super.onInterceptTouchEvent(paramMotionEvent);
        }  
      this.d1 = false;
    } else {
      this.f1 = paramMotionEvent.getY();
      this.g1 = paramMotionEvent.getX();
      this.d1 = false;
    } 
    return super.onInterceptTouchEvent(paramMotionEvent);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    try {
      if (this.Y0 == -1.0F)
        this.Y0 = paramMotionEvent.getRawY(); 
      int j = paramMotionEvent.getAction();
      if (j != 0) {
        if (j != 2) {
          this.Y0 = -1.0F;
          if (G1() && this.M0 && !this.O0 && this.T0.b() && this.Q0 != null) {
            this.O0 = true;
            this.W0.setVisibility(8);
            this.Q0.a();
          } 
        } else {
          float f = (paramMotionEvent.getRawY() - this.Y0) / 2.0F;
          this.Y0 = paramMotionEvent.getRawY();
          this.Z0 += f;
          if (G1() && this.M0 && !this.O0 && this.q1 == AppBarStateChangeListener$State.b) {
            this.T0.a(f, this.Z0);
            if (this.T0.getVisibleHeight() > 0)
              return false; 
          } 
        } 
      } else {
        this.Y0 = paramMotionEvent.getRawY();
        this.Z0 = 0.0F;
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setAdapter(RecyclerView.Adapter paramAdapter) {
    a a1 = this.b1;
    if (a1 != null && this.X0 != null && this.h1)
      a1.I().z(this.X0); 
    paramAdapter = paramAdapter;
    this.b1 = (a)paramAdapter;
    super.setAdapter(paramAdapter);
    this.b1.I().x(this.X0);
    this.X0.a();
    this.h1 = true;
    this.b1.O(this.T0);
    if (this.N0 && this.b1.F() == 0)
      this.b1.D(this.W0); 
  }
  
  public void setArrowImageView(int paramInt) {
    c.b.a.g.b b1 = this.T0;
    if (b1 != null && b1 instanceof ArrowRefreshHeader)
      ((ArrowRefreshHeader)b1).setArrowImageView(paramInt); 
  }
  
  public void setEmptyView(View paramView) {
    this.V0 = paramView;
    this.X0.a();
  }
  
  public void setFooterViewColor(int paramInt1, int paramInt2, int paramInt3) {
    c.b.a.g.a a1 = this.U0;
    if (a1 != null && a1 instanceof LoadingFooter) {
      LoadingFooter loadingFooter = (LoadingFooter)a1;
      loadingFooter.setIndicatorColor(androidx.core.content.a.d(getContext(), paramInt1));
      loadingFooter.setHintTextColor(paramInt2);
      loadingFooter.setViewBackgroundColor(paramInt3);
    } 
  }
  
  public void setFooterViewHint(String paramString1, String paramString2, String paramString3) {
    c.b.a.g.a a1 = this.U0;
    if (a1 != null && a1 instanceof LoadingFooter) {
      LoadingFooter loadingFooter = (LoadingFooter)a1;
      loadingFooter.setLoadingHint(paramString1);
      loadingFooter.setNoMoreHint(paramString2);
      loadingFooter.setNoNetWorkHint(paramString3);
    } 
  }
  
  public void setHeaderViewColor(int paramInt1, int paramInt2, int paramInt3) {
    c.b.a.g.b b1 = this.T0;
    if (b1 != null && b1 instanceof ArrowRefreshHeader) {
      ArrowRefreshHeader arrowRefreshHeader = (ArrowRefreshHeader)b1;
      arrowRefreshHeader.setIndicatorColor(androidx.core.content.a.d(getContext(), paramInt1));
      arrowRefreshHeader.setHintTextColor(paramInt2);
      arrowRefreshHeader.setViewBackgroundColor(paramInt3);
    } 
  }
  
  public void setLScrollListener(d paramd) {
    this.S0 = paramd;
  }
  
  public void setLoadMoreEnabled(boolean paramBoolean) {
    a a1 = this.b1;
    if (a1 != null) {
      this.N0 = paramBoolean;
      if (!paramBoolean)
        if (a1 != null) {
          a1.N();
        } else {
          this.U0.d();
        }  
      return;
    } 
    throw new NullPointerException("LRecyclerViewAdapter cannot be null, please make sure the variable mWrapAdapter have been initialized.");
  }
  
  public void setLoadMoreFooter(c.b.a.g.a parama) {
    this.U0 = parama;
    View view = parama.getFootView();
    this.W0 = view;
    view.setVisibility(8);
    ViewGroup.LayoutParams layoutParams = this.W0.getLayoutParams();
    if (layoutParams != null) {
      this.W0.setLayoutParams((ViewGroup.LayoutParams)new RecyclerView.LayoutParams(layoutParams));
    } else {
      this.W0.setLayoutParams((ViewGroup.LayoutParams)new RecyclerView.LayoutParams(-1, -2));
    } 
  }
  
  public void setLoadingMoreProgressStyle(int paramInt) {
    c.b.a.g.a a1 = this.U0;
    if (a1 != null && a1 instanceof LoadingFooter)
      ((LoadingFooter)a1).setProgressStyle(paramInt); 
  }
  
  public void setNoMore(boolean paramBoolean) {
    this.P0 = false;
    this.c1 = paramBoolean;
    if (paramBoolean) {
      this.U0.b();
    } else {
      this.U0.a();
    } 
  }
  
  public void setOnLoadMoreListener(e parame) {
    this.R0 = parame;
  }
  
  public void setOnNetWorkErrorListener(f paramf) {
    LoadingFooter loadingFooter = (LoadingFooter)this.W0;
    loadingFooter.setState(LoadingFooter.State.e);
    loadingFooter.setOnClickListener(new a(this, paramf));
  }
  
  public void setOnRefreshListener(g paramg) {
    this.Q0 = paramg;
  }
  
  public void setPullRefreshEnabled(boolean paramBoolean) {
    this.M0 = paramBoolean;
  }
  
  public void setRefreshHeader(c.b.a.g.b paramb) {
    if (!this.h1) {
      this.T0 = paramb;
      return;
    } 
    throw new RuntimeException("setRefreshHeader must been invoked before setting the adapter.");
  }
  
  public void setRefreshProgressStyle(int paramInt) {
    c.b.a.g.b b1 = this.T0;
    if (b1 != null && b1 instanceof ArrowRefreshHeader)
      ((ArrowRefreshHeader)b1).setProgressStyle(paramInt); 
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
    a(LRecyclerView this$0, f param1f) {}
    
    public void onClick(View param1View) {
      LRecyclerView.C1(this.c).c();
      this.b.a();
    }
  }
  
  private class c extends RecyclerView.i {
    private c(LRecyclerView this$0) {}
    
    public void a() {
      RecyclerView.Adapter adapter = this.a.getAdapter();
      if (adapter instanceof a) {
        adapter = adapter;
        if (adapter.I() != null && LRecyclerView.y1(this.a) != null)
          if (adapter.I().d() == 0) {
            LRecyclerView.y1(this.a).setVisibility(0);
            this.a.setVisibility(8);
          } else {
            LRecyclerView.y1(this.a).setVisibility(8);
            this.a.setVisibility(0);
          }  
      } else if (adapter != null && LRecyclerView.y1(this.a) != null) {
        if (adapter.d() == 0) {
          LRecyclerView.y1(this.a).setVisibility(0);
          this.a.setVisibility(8);
        } else {
          LRecyclerView.y1(this.a).setVisibility(8);
          this.a.setVisibility(0);
        } 
      } 
      if (LRecyclerView.z1(this.a) != null) {
        LRecyclerView.z1(this.a).i();
        if (LRecyclerView.z1(this.a).I().d() < LRecyclerView.A1(this.a))
          LRecyclerView.B1(this.a).setVisibility(8); 
      } 
    }
    
    public void b(int param1Int1, int param1Int2) {
      LRecyclerView.z1(this.a).k(param1Int1 + LRecyclerView.z1(this.a).H() + 1, param1Int2);
    }
    
    public void d(int param1Int1, int param1Int2) {
      LRecyclerView.z1(this.a).l(param1Int1 + LRecyclerView.z1(this.a).H() + 1, param1Int2);
    }
    
    public void e(int param1Int1, int param1Int2) {
      LRecyclerView.z1(this.a).m(param1Int1 + LRecyclerView.z1(this.a).H() + 1, param1Int2);
      if (LRecyclerView.z1(this.a).I().d() < LRecyclerView.A1(this.a))
        LRecyclerView.B1(this.a).setVisibility(8); 
    }
  }
  
  public static interface d {
    void a();
    
    void b(int param1Int1, int param1Int2);
    
    void c(int param1Int);
    
    void d();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/recyclerview/LRecyclerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */