package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class a {
  private final DataSetObservable a = new DataSetObservable();
  
  private DataSetObserver b;
  
  @Deprecated
  public void a(View paramView, int paramInt, Object paramObject) {
    throw new UnsupportedOperationException("Required method destroyItem was not overridden");
  }
  
  public void b(ViewGroup paramViewGroup, int paramInt, Object paramObject) {
    a((View)paramViewGroup, paramInt, paramObject);
  }
  
  @Deprecated
  public void c(View paramView) {}
  
  public void d(ViewGroup paramViewGroup) {
    c((View)paramViewGroup);
  }
  
  public abstract int e();
  
  public int f(Object paramObject) {
    return -1;
  }
  
  public CharSequence g(int paramInt) {
    return null;
  }
  
  public float h(int paramInt) {
    return 1.0F;
  }
  
  @Deprecated
  public Object i(View paramView, int paramInt) {
    throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
  }
  
  public Object j(ViewGroup paramViewGroup, int paramInt) {
    return i((View)paramViewGroup, paramInt);
  }
  
  public abstract boolean k(View paramView, Object paramObject);
  
  public void l() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Landroid/database/DataSetObserver;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 15
    //   11: aload_1
    //   12: invokevirtual onChanged : ()V
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_0
    //   18: getfield a : Landroid/database/DataSetObservable;
    //   21: invokevirtual notifyChanged : ()V
    //   24: return
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_1
    //   29: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	25	finally
    //   11	15	25	finally
    //   15	17	25	finally
    //   26	28	25	finally
  }
  
  public void m(DataSetObserver paramDataSetObserver) {
    this.a.registerObserver(paramDataSetObserver);
  }
  
  public void n(Parcelable paramParcelable, ClassLoader paramClassLoader) {}
  
  public Parcelable o() {
    return null;
  }
  
  @Deprecated
  public void p(View paramView, int paramInt, Object paramObject) {}
  
  public void q(ViewGroup paramViewGroup, int paramInt, Object paramObject) {
    p((View)paramViewGroup, paramInt, paramObject);
  }
  
  void r(DataSetObserver paramDataSetObserver) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield b : Landroid/database/DataSetObserver;
    //   7: aload_0
    //   8: monitorexit
    //   9: return
    //   10: astore_1
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_1
    //   14: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	10	finally
    //   11	13	10	finally
  }
  
  @Deprecated
  public void s(View paramView) {}
  
  public void t(ViewGroup paramViewGroup) {
    s((View)paramViewGroup);
  }
  
  public void u(DataSetObserver paramDataSetObserver) {
    this.a.unregisterObserver(paramDataSetObserver);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/viewpager/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */