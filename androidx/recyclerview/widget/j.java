package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Interpolator;

public class j extends n {
  private i d;
  
  private i e;
  
  private int k(View paramView, i parami) {
    return parami.g(paramView) + parami.e(paramView) / 2 - parami.m() + parami.n() / 2;
  }
  
  private View l(RecyclerView.o paramo, i parami) {
    int k = paramo.J();
    View view = null;
    if (k == 0)
      return null; 
    int m = parami.m();
    int i1 = parami.n() / 2;
    int i2 = Integer.MAX_VALUE;
    byte b = 0;
    while (b < k) {
      View view1 = paramo.I(b);
      int i3 = Math.abs(parami.g(view1) + parami.e(view1) / 2 - m + i1);
      int i4 = i2;
      if (i3 < i2) {
        view = view1;
        i4 = i3;
      } 
      b++;
      i2 = i4;
    } 
    return view;
  }
  
  private i m(RecyclerView.o paramo) {
    i i1 = this.e;
    if (i1 == null || i1.a != paramo)
      this.e = i.a(paramo); 
    return this.e;
  }
  
  private i n(RecyclerView.o paramo) {
    return paramo.l() ? o(paramo) : (paramo.k() ? m(paramo) : null);
  }
  
  private i o(RecyclerView.o paramo) {
    i i1 = this.d;
    if (i1 == null || i1.a != paramo)
      this.d = i.c(paramo); 
    return this.d;
  }
  
  private boolean p(RecyclerView.o paramo, int paramInt1, int paramInt2) {
    boolean bool = paramo.k();
    boolean bool1 = true;
    boolean bool2 = true;
    if (bool) {
      if (paramInt1 <= 0)
        bool2 = false; 
      return bool2;
    } 
    if (paramInt2 > 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    } 
    return bool2;
  }
  
  private boolean q(RecyclerView.o paramo) {
    int k = paramo.Y();
    boolean bool = paramo instanceof RecyclerView.x.b;
    boolean bool1 = false;
    null = bool1;
    if (bool) {
      PointF pointF = ((RecyclerView.x.b)paramo).a(k - 1);
      null = bool1;
      if (pointF != null) {
        if (pointF.x >= 0.0F) {
          null = bool1;
          return (pointF.y < 0.0F) ? true : null;
        } 
      } else {
        return null;
      } 
    } else {
      return null;
    } 
    return true;
  }
  
  public int[] c(RecyclerView.o paramo, View paramView) {
    int[] arrayOfInt = new int[2];
    if (paramo.k()) {
      arrayOfInt[0] = k(paramView, m(paramo));
    } else {
      arrayOfInt[0] = 0;
    } 
    if (paramo.l()) {
      arrayOfInt[1] = k(paramView, o(paramo));
    } else {
      arrayOfInt[1] = 0;
    } 
    return arrayOfInt;
  }
  
  protected RecyclerView.x d(RecyclerView.o paramo) {
    return !(paramo instanceof RecyclerView.x.b) ? null : new a(this, this.a.getContext());
  }
  
  public View f(RecyclerView.o paramo) {
    return paramo.l() ? l(paramo, o(paramo)) : (paramo.k() ? l(paramo, m(paramo)) : null);
  }
  
  public int g(RecyclerView.o paramo, int paramInt1, int paramInt2) {
    int k = paramo.Y();
    if (k == 0)
      return -1; 
    i i1 = n(paramo);
    if (i1 == null)
      return -1; 
    int m = Integer.MIN_VALUE;
    int i2 = Integer.MAX_VALUE;
    int i3 = paramo.J();
    byte b = 0;
    View view1 = null;
    View view2 = null;
    while (b < i3) {
      int i4;
      View view4;
      View view3 = paramo.I(b);
      if (view3 == null) {
        i4 = i2;
        view4 = view1;
      } else {
        int i5 = k(view3, i1);
        int i6 = m;
        View view = view2;
        if (i5 <= 0) {
          i6 = m;
          view = view2;
          if (i5 > m) {
            view = view3;
            i6 = i5;
          } 
        } 
        m = i6;
        i4 = i2;
        view4 = view1;
        view2 = view;
        if (i5 >= 0) {
          m = i6;
          i4 = i2;
          view4 = view1;
          view2 = view;
          if (i5 < i2) {
            i4 = i5;
            view2 = view;
            view4 = view3;
            m = i6;
          } 
        } 
      } 
      b++;
      i2 = i4;
      view1 = view4;
    } 
    boolean bool = p(paramo, paramInt1, paramInt2);
    if (bool && view1 != null)
      return paramo.h0(view1); 
    if (!bool && view2 != null)
      return paramo.h0(view2); 
    if (bool)
      view1 = view2; 
    if (view1 == null)
      return -1; 
    paramInt2 = paramo.h0(view1);
    if (q(paramo) == bool) {
      paramInt1 = -1;
    } else {
      paramInt1 = 1;
    } 
    paramInt1 = paramInt2 + paramInt1;
    return (paramInt1 < 0 || paramInt1 >= k) ? -1 : paramInt1;
  }
  
  class a extends g {
    a(j this$0, Context param1Context) {
      super(param1Context);
    }
    
    protected void o(View param1View, RecyclerView.y param1y, RecyclerView.x.a param1a) {
      j j1 = this.q;
      int[] arrayOfInt = j1.c(j1.a.getLayoutManager(), param1View);
      int i = arrayOfInt[0];
      int k = arrayOfInt[1];
      int m = w(Math.max(Math.abs(i), Math.abs(k)));
      if (m > 0)
        param1a.d(i, k, m, (Interpolator)this.j); 
    }
    
    protected float v(DisplayMetrics param1DisplayMetrics) {
      return 100.0F / param1DisplayMetrics.densityDpi;
    }
    
    protected int x(int param1Int) {
      return Math.min(100, super.x(param1Int));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/recyclerview/widget/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */