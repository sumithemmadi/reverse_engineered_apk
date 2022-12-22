package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.Scroller;

public abstract class n extends RecyclerView.q {
  RecyclerView a;
  
  private Scroller b;
  
  private final RecyclerView.s c = new a(this);
  
  private void e() {
    this.a.Z0(this.c);
    this.a.setOnFlingListener(null);
  }
  
  private void h() {
    if (this.a.getOnFlingListener() == null) {
      this.a.l(this.c);
      this.a.setOnFlingListener(this);
      return;
    } 
    throw new IllegalStateException("An instance of OnFlingListener already set.");
  }
  
  private boolean i(RecyclerView.o paramo, int paramInt1, int paramInt2) {
    if (!(paramo instanceof RecyclerView.x.b))
      return false; 
    RecyclerView.x x = d(paramo);
    if (x == null)
      return false; 
    paramInt1 = g(paramo, paramInt1, paramInt2);
    if (paramInt1 == -1)
      return false; 
    x.p(paramInt1);
    paramo.K1(x);
    return true;
  }
  
  public boolean a(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Landroidx/recyclerview/widget/RecyclerView;
    //   4: invokevirtual getLayoutManager : ()Landroidx/recyclerview/widget/RecyclerView$o;
    //   7: astore_3
    //   8: iconst_0
    //   9: istore #4
    //   11: aload_3
    //   12: ifnonnull -> 17
    //   15: iconst_0
    //   16: ireturn
    //   17: aload_0
    //   18: getfield a : Landroidx/recyclerview/widget/RecyclerView;
    //   21: invokevirtual getAdapter : ()Landroidx/recyclerview/widget/RecyclerView$Adapter;
    //   24: ifnonnull -> 29
    //   27: iconst_0
    //   28: ireturn
    //   29: aload_0
    //   30: getfield a : Landroidx/recyclerview/widget/RecyclerView;
    //   33: invokevirtual getMinFlingVelocity : ()I
    //   36: istore #5
    //   38: iload_2
    //   39: invokestatic abs : (I)I
    //   42: iload #5
    //   44: if_icmpgt -> 60
    //   47: iload #4
    //   49: istore #6
    //   51: iload_1
    //   52: invokestatic abs : (I)I
    //   55: iload #5
    //   57: if_icmple -> 77
    //   60: iload #4
    //   62: istore #6
    //   64: aload_0
    //   65: aload_3
    //   66: iload_1
    //   67: iload_2
    //   68: invokespecial i : (Landroidx/recyclerview/widget/RecyclerView$o;II)Z
    //   71: ifeq -> 77
    //   74: iconst_1
    //   75: istore #6
    //   77: iload #6
    //   79: ireturn
  }
  
  public void b(RecyclerView paramRecyclerView) {
    RecyclerView recyclerView = this.a;
    if (recyclerView == paramRecyclerView)
      return; 
    if (recyclerView != null)
      e(); 
    this.a = paramRecyclerView;
    if (paramRecyclerView != null) {
      h();
      this.b = new Scroller(this.a.getContext(), (Interpolator)new DecelerateInterpolator());
      j();
    } 
  }
  
  public abstract int[] c(RecyclerView.o paramo, View paramView);
  
  protected abstract RecyclerView.x d(RecyclerView.o paramo);
  
  public abstract View f(RecyclerView.o paramo);
  
  public abstract int g(RecyclerView.o paramo, int paramInt1, int paramInt2);
  
  void j() {
    RecyclerView recyclerView = this.a;
    if (recyclerView == null)
      return; 
    RecyclerView.o o = recyclerView.getLayoutManager();
    if (o == null)
      return; 
    View view = f(o);
    if (view == null)
      return; 
    int[] arrayOfInt = c(o, view);
    if (arrayOfInt[0] != 0 || arrayOfInt[1] != 0)
      this.a.m1(arrayOfInt[0], arrayOfInt[1]); 
  }
  
  class a extends RecyclerView.s {
    boolean a = false;
    
    a(n this$0) {}
    
    public void a(RecyclerView param1RecyclerView, int param1Int) {
      super.a(param1RecyclerView, param1Int);
      if (param1Int == 0 && this.a) {
        this.a = false;
        this.b.j();
      } 
    }
    
    public void b(RecyclerView param1RecyclerView, int param1Int1, int param1Int2) {
      if (param1Int1 != 0 || param1Int2 != 0)
        this.a = true; 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/recyclerview/widget/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */