package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.e0;

public final class ExpandedMenuView extends ListView implements g.b, n, AdapterView.OnItemClickListener {
  private static final int[] b = new int[] { 16842964, 16843049 };
  
  private g c;
  
  private int d;
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 16842868);
  }
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet);
    setOnItemClickListener(this);
    e0 e0 = e0.v(paramContext, paramAttributeSet, b, paramInt, 0);
    if (e0.s(0))
      setBackgroundDrawable(e0.g(0)); 
    if (e0.s(1))
      setDivider(e0.g(1)); 
    e0.w();
  }
  
  public boolean a(i parami) {
    return this.c.N((MenuItem)parami, 0);
  }
  
  public void b(g paramg) {
    this.c = paramg;
  }
  
  public int getWindowAnimations() {
    return this.d;
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    setChildrenDrawingCacheEnabled(false);
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong) {
    a((i)getAdapter().getItem(paramInt));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/view/menu/ExpandedMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */