package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class b implements m {
  protected Context b;
  
  protected Context c;
  
  protected g d;
  
  protected LayoutInflater e;
  
  protected LayoutInflater f;
  
  private m.a g;
  
  private int h;
  
  private int i;
  
  protected n j;
  
  private int k;
  
  public b(Context paramContext, int paramInt1, int paramInt2) {
    this.b = paramContext;
    this.e = LayoutInflater.from(paramContext);
    this.h = paramInt1;
    this.i = paramInt2;
  }
  
  public void b(g paramg, boolean paramBoolean) {
    m.a a1 = this.g;
    if (a1 != null)
      a1.b(paramg, paramBoolean); 
  }
  
  public void c(boolean paramBoolean) {
    ViewGroup viewGroup = (ViewGroup)this.j;
    if (viewGroup == null)
      return; 
    g g1 = this.d;
    int i = 0;
    if (g1 != null) {
      g1.t();
      ArrayList<i> arrayList = this.d.G();
      int j = arrayList.size();
      byte b1 = 0;
      for (i = 0; b1 < j; i = k) {
        i i1 = arrayList.get(b1);
        int k = i;
        if (t(i, i1)) {
          View view1 = viewGroup.getChildAt(i);
          if (view1 instanceof n.a) {
            i i2 = ((n.a)view1).getItemData();
          } else {
            g1 = null;
          } 
          View view2 = q(i1, view1, viewGroup);
          if (i1 != g1) {
            view2.setPressed(false);
            view2.jumpDrawablesToCurrentState();
          } 
          if (view2 != view1)
            l(view2, i); 
          k = i + 1;
        } 
        b1++;
      } 
    } 
    while (i < viewGroup.getChildCount()) {
      if (!o(viewGroup, i))
        i++; 
    } 
  }
  
  public boolean e(g paramg, i parami) {
    return false;
  }
  
  public boolean f(g paramg, i parami) {
    return false;
  }
  
  public void g(m.a parama) {
    this.g = parama;
  }
  
  public int getId() {
    return this.k;
  }
  
  public void h(Context paramContext, g paramg) {
    this.c = paramContext;
    this.f = LayoutInflater.from(paramContext);
    this.d = paramg;
  }
  
  public boolean j(r paramr) {
    m.a a1 = this.g;
    if (a1 != null) {
      g g1;
      if (paramr == null)
        g1 = this.d; 
      return a1.c(g1);
    } 
    return false;
  }
  
  protected void l(View paramView, int paramInt) {
    ViewGroup viewGroup = (ViewGroup)paramView.getParent();
    if (viewGroup != null)
      viewGroup.removeView(paramView); 
    ((ViewGroup)this.j).addView(paramView, paramInt);
  }
  
  public abstract void m(i parami, n.a parama);
  
  public n.a n(ViewGroup paramViewGroup) {
    return (n.a)this.e.inflate(this.i, paramViewGroup, false);
  }
  
  protected boolean o(ViewGroup paramViewGroup, int paramInt) {
    paramViewGroup.removeViewAt(paramInt);
    return true;
  }
  
  public m.a p() {
    return this.g;
  }
  
  public View q(i parami, View paramView, ViewGroup paramViewGroup) {
    n.a a1;
    if (paramView instanceof n.a) {
      a1 = (n.a)paramView;
    } else {
      a1 = n(paramViewGroup);
    } 
    m(parami, a1);
    return (View)a1;
  }
  
  public n r(ViewGroup paramViewGroup) {
    if (this.j == null) {
      n n1 = (n)this.e.inflate(this.h, paramViewGroup, false);
      this.j = n1;
      n1.b(this.d);
      c(true);
    } 
    return this.j;
  }
  
  public void s(int paramInt) {
    this.k = paramInt;
  }
  
  public abstract boolean t(int paramInt, i parami);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/view/menu/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */