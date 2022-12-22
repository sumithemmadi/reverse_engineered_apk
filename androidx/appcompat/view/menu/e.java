package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import b.a.g;
import java.util.ArrayList;

public class e implements m, AdapterView.OnItemClickListener {
  Context b;
  
  LayoutInflater c;
  
  g d;
  
  ExpandedMenuView e;
  
  int f;
  
  int g;
  
  int h;
  
  private m.a i;
  
  a j;
  
  private int k;
  
  public e(int paramInt1, int paramInt2) {
    this.h = paramInt1;
    this.g = paramInt2;
  }
  
  public e(Context paramContext, int paramInt) {
    this(paramInt, 0);
    this.b = paramContext;
    this.c = LayoutInflater.from(paramContext);
  }
  
  public ListAdapter a() {
    if (this.j == null)
      this.j = new a(this); 
    return (ListAdapter)this.j;
  }
  
  public void b(g paramg, boolean paramBoolean) {
    m.a a1 = this.i;
    if (a1 != null)
      a1.b(paramg, paramBoolean); 
  }
  
  public void c(boolean paramBoolean) {
    a a1 = this.j;
    if (a1 != null)
      a1.notifyDataSetChanged(); 
  }
  
  public boolean d() {
    return false;
  }
  
  public boolean e(g paramg, i parami) {
    return false;
  }
  
  public boolean f(g paramg, i parami) {
    return false;
  }
  
  public void g(m.a parama) {
    this.i = parama;
  }
  
  public int getId() {
    return this.k;
  }
  
  public void h(Context paramContext, g paramg) {
    ContextThemeWrapper contextThemeWrapper;
    if (this.g != 0) {
      contextThemeWrapper = new ContextThemeWrapper(paramContext, this.g);
      this.b = (Context)contextThemeWrapper;
      this.c = LayoutInflater.from((Context)contextThemeWrapper);
    } else if (this.b != null) {
      this.b = (Context)contextThemeWrapper;
      if (this.c == null)
        this.c = LayoutInflater.from((Context)contextThemeWrapper); 
    } 
    this.d = paramg;
    a a1 = this.j;
    if (a1 != null)
      a1.notifyDataSetChanged(); 
  }
  
  public void i(Parcelable paramParcelable) {
    m((Bundle)paramParcelable);
  }
  
  public boolean j(r paramr) {
    if (!paramr.hasVisibleItems())
      return false; 
    (new h(paramr)).d(null);
    m.a a1 = this.i;
    if (a1 != null)
      a1.c(paramr); 
    return true;
  }
  
  public Parcelable k() {
    if (this.e == null)
      return null; 
    Bundle bundle = new Bundle();
    n(bundle);
    return (Parcelable)bundle;
  }
  
  public n l(ViewGroup paramViewGroup) {
    if (this.e == null) {
      this.e = (ExpandedMenuView)this.c.inflate(g.abc_expanded_menu_layout, paramViewGroup, false);
      if (this.j == null)
        this.j = new a(this); 
      this.e.setAdapter((ListAdapter)this.j);
      this.e.setOnItemClickListener(this);
    } 
    return this.e;
  }
  
  public void m(Bundle paramBundle) {
    SparseArray sparseArray = paramBundle.getSparseParcelableArray("android:menu:list");
    if (sparseArray != null)
      this.e.restoreHierarchyState(sparseArray); 
  }
  
  public void n(Bundle paramBundle) {
    SparseArray sparseArray = new SparseArray();
    ExpandedMenuView expandedMenuView = this.e;
    if (expandedMenuView != null)
      expandedMenuView.saveHierarchyState(sparseArray); 
    paramBundle.putSparseParcelableArray("android:menu:list", sparseArray);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) {
    this.d.O((MenuItem)this.j.b(paramInt), this, 0);
  }
  
  private class a extends BaseAdapter {
    private int b = -1;
    
    public a(e this$0) {
      a();
    }
    
    void a() {
      i i = this.c.d.x();
      if (i != null) {
        ArrayList<i> arrayList = this.c.d.B();
        int j = arrayList.size();
        for (byte b = 0; b < j; b++) {
          if ((i)arrayList.get(b) == i) {
            this.b = b;
            return;
          } 
        } 
      } 
      this.b = -1;
    }
    
    public i b(int param1Int) {
      ArrayList<i> arrayList = this.c.d.B();
      int i = param1Int + this.c.f;
      int j = this.b;
      param1Int = i;
      if (j >= 0) {
        param1Int = i;
        if (i >= j)
          param1Int = i + 1; 
      } 
      return arrayList.get(param1Int);
    }
    
    public int getCount() {
      int i = this.c.d.B().size() - this.c.f;
      return (this.b < 0) ? i : (i - 1);
    }
    
    public long getItemId(int param1Int) {
      return param1Int;
    }
    
    public View getView(int param1Int, View param1View, ViewGroup param1ViewGroup) {
      View view = param1View;
      if (param1View == null) {
        e e1 = this.c;
        view = e1.c.inflate(e1.h, param1ViewGroup, false);
      } 
      ((n.a)view).e(b(param1Int), 0);
      return view;
    }
    
    public void notifyDataSetChanged() {
      a();
      super.notifyDataSetChanged();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/view/menu/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */