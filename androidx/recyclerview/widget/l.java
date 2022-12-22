package androidx.recyclerview.widget;

import android.view.View;

class l {
  static int a(RecyclerView.y paramy, i parami, View paramView1, View paramView2, RecyclerView.o paramo, boolean paramBoolean) {
    if (paramo.J() == 0 || paramy.b() == 0 || paramView1 == null || paramView2 == null)
      return 0; 
    if (!paramBoolean)
      return Math.abs(paramo.h0(paramView1) - paramo.h0(paramView2)) + 1; 
    int j = parami.d(paramView2);
    int k = parami.g(paramView1);
    return Math.min(parami.n(), j - k);
  }
  
  static int b(RecyclerView.y paramy, i parami, View paramView1, View paramView2, RecyclerView.o paramo, boolean paramBoolean1, boolean paramBoolean2) {
    if (paramo.J() == 0 || paramy.b() == 0 || paramView1 == null || paramView2 == null)
      return 0; 
    int j = Math.min(paramo.h0(paramView1), paramo.h0(paramView2));
    int k = Math.max(paramo.h0(paramView1), paramo.h0(paramView2));
    if (paramBoolean2) {
      j = Math.max(0, paramy.b() - k - 1);
    } else {
      j = Math.max(0, j);
    } 
    if (!paramBoolean1)
      return j; 
    int m = Math.abs(parami.d(paramView2) - parami.g(paramView1));
    k = Math.abs(paramo.h0(paramView1) - paramo.h0(paramView2));
    float f = m / (k + 1);
    return Math.round(j * f + (parami.m() - parami.g(paramView1)));
  }
  
  static int c(RecyclerView.y paramy, i parami, View paramView1, View paramView2, RecyclerView.o paramo, boolean paramBoolean) {
    if (paramo.J() == 0 || paramy.b() == 0 || paramView1 == null || paramView2 == null)
      return 0; 
    if (!paramBoolean)
      return paramy.b(); 
    int j = parami.d(paramView2);
    int k = parami.g(paramView1);
    int m = Math.abs(paramo.h0(paramView1) - paramo.h0(paramView2));
    return (int)((j - k) / (m + 1) * paramy.b());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/recyclerview/widget/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */