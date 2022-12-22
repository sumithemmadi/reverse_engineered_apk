package androidx.viewpager2.widget;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

final class b extends ViewPager2.i {
  private final List<ViewPager2.i> a;
  
  b(int paramInt) {
    this.a = new ArrayList<ViewPager2.i>(paramInt);
  }
  
  private void e(ConcurrentModificationException paramConcurrentModificationException) {
    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", paramConcurrentModificationException);
  }
  
  public void a(int paramInt) {
    try {
      Iterator<ViewPager2.i> iterator = this.a.iterator();
      while (iterator.hasNext())
        ((ViewPager2.i)iterator.next()).a(paramInt); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      e(concurrentModificationException);
    } 
  }
  
  public void b(int paramInt1, float paramFloat, int paramInt2) {
    try {
      Iterator<ViewPager2.i> iterator = this.a.iterator();
      while (iterator.hasNext())
        ((ViewPager2.i)iterator.next()).b(paramInt1, paramFloat, paramInt2); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      e(concurrentModificationException);
    } 
  }
  
  public void c(int paramInt) {
    try {
      Iterator<ViewPager2.i> iterator = this.a.iterator();
      while (iterator.hasNext())
        ((ViewPager2.i)iterator.next()).c(paramInt); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      e(concurrentModificationException);
    } 
  }
  
  void d(ViewPager2.i parami) {
    this.a.add(parami);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/viewpager2/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */