package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;

final class d extends ViewPager2.i {
  private final LinearLayoutManager a;
  
  private ViewPager2.k b;
  
  d(LinearLayoutManager paramLinearLayoutManager) {
    this.a = paramLinearLayoutManager;
  }
  
  public void a(int paramInt) {}
  
  public void b(int paramInt1, float paramFloat, int paramInt2) {
    if (this.b == null)
      return; 
    float f = -paramFloat;
    paramInt2 = 0;
    while (paramInt2 < this.a.J()) {
      View view = this.a.I(paramInt2);
      if (view != null) {
        paramFloat = (this.a.h0(view) - paramInt1);
        this.b.a(view, paramFloat + f);
        paramInt2++;
        continue;
      } 
      throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(this.a.J()) }));
    } 
  }
  
  public void c(int paramInt) {}
  
  ViewPager2.k d() {
    return this.b;
  }
  
  void e(ViewPager2.k paramk) {
    this.b = paramk;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/viewpager2/widget/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */