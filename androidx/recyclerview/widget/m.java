package androidx.recyclerview.widget;

import android.view.View;

public abstract class m extends RecyclerView.l {
  boolean g = true;
  
  public final void A(RecyclerView.b0 paramb0) {
    I(paramb0);
    h(paramb0);
  }
  
  public final void B(RecyclerView.b0 paramb0) {
    J(paramb0);
  }
  
  public final void C(RecyclerView.b0 paramb0, boolean paramBoolean) {
    K(paramb0, paramBoolean);
    h(paramb0);
  }
  
  public final void D(RecyclerView.b0 paramb0, boolean paramBoolean) {
    L(paramb0, paramBoolean);
  }
  
  public final void E(RecyclerView.b0 paramb0) {
    M(paramb0);
    h(paramb0);
  }
  
  public final void F(RecyclerView.b0 paramb0) {
    N(paramb0);
  }
  
  public final void G(RecyclerView.b0 paramb0) {
    O(paramb0);
    h(paramb0);
  }
  
  public final void H(RecyclerView.b0 paramb0) {
    P(paramb0);
  }
  
  public void I(RecyclerView.b0 paramb0) {}
  
  public void J(RecyclerView.b0 paramb0) {}
  
  public void K(RecyclerView.b0 paramb0, boolean paramBoolean) {}
  
  public void L(RecyclerView.b0 paramb0, boolean paramBoolean) {}
  
  public void M(RecyclerView.b0 paramb0) {}
  
  public void N(RecyclerView.b0 paramb0) {}
  
  public void O(RecyclerView.b0 paramb0) {}
  
  public void P(RecyclerView.b0 paramb0) {}
  
  public boolean a(RecyclerView.b0 paramb0, RecyclerView.l.c paramc1, RecyclerView.l.c paramc2) {
    if (paramc1 != null) {
      int i = paramc1.a;
      int j = paramc2.a;
      if (i != j || paramc1.b != paramc2.b)
        return y(paramb0, i, paramc1.b, j, paramc2.b); 
    } 
    return w(paramb0);
  }
  
  public boolean b(RecyclerView.b0 paramb01, RecyclerView.b0 paramb02, RecyclerView.l.c paramc1, RecyclerView.l.c paramc2) {
    int k;
    int n;
    int i = paramc1.a;
    int j = paramc1.b;
    if (paramb02.J()) {
      k = paramc1.a;
      n = paramc1.b;
    } else {
      k = paramc2.a;
      n = paramc2.b;
    } 
    return x(paramb01, paramb02, i, j, k, n);
  }
  
  public boolean c(RecyclerView.b0 paramb0, RecyclerView.l.c paramc1, RecyclerView.l.c paramc2) {
    int k;
    int n;
    int i = paramc1.a;
    int j = paramc1.b;
    View view = paramb0.b;
    if (paramc2 == null) {
      k = view.getLeft();
    } else {
      k = paramc2.a;
    } 
    if (paramc2 == null) {
      n = view.getTop();
    } else {
      n = paramc2.b;
    } 
    if (!paramb0.v() && (i != k || j != n)) {
      view.layout(k, n, view.getWidth() + k, view.getHeight() + n);
      return y(paramb0, i, j, k, n);
    } 
    return z(paramb0);
  }
  
  public boolean d(RecyclerView.b0 paramb0, RecyclerView.l.c paramc1, RecyclerView.l.c paramc2) {
    int i = paramc1.a;
    int j = paramc2.a;
    if (i != j || paramc1.b != paramc2.b)
      return y(paramb0, i, paramc1.b, j, paramc2.b); 
    E(paramb0);
    return false;
  }
  
  public boolean f(RecyclerView.b0 paramb0) {
    return (!this.g || paramb0.t());
  }
  
  public abstract boolean w(RecyclerView.b0 paramb0);
  
  public abstract boolean x(RecyclerView.b0 paramb01, RecyclerView.b0 paramb02, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract boolean y(RecyclerView.b0 paramb0, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract boolean z(RecyclerView.b0 paramb0);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/recyclerview/widget/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */