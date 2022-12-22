package b.h.k;

import android.view.View;
import android.view.ViewGroup;

public class p {
  private int a;
  
  private int b;
  
  public p(ViewGroup paramViewGroup) {}
  
  public int a() {
    return this.a | this.b;
  }
  
  public void b(View paramView1, View paramView2, int paramInt) {
    c(paramView1, paramView2, paramInt, 0);
  }
  
  public void c(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    if (paramInt2 == 1) {
      this.b = paramInt1;
    } else {
      this.a = paramInt1;
    } 
  }
  
  public void d(View paramView) {
    e(paramView, 0);
  }
  
  public void e(View paramView, int paramInt) {
    if (paramInt == 1) {
      this.b = 0;
    } else {
      this.a = 0;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */