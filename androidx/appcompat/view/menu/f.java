package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public class f extends BaseAdapter {
  g b;
  
  private int c = -1;
  
  private boolean d;
  
  private final boolean e;
  
  private final LayoutInflater f;
  
  private final int g;
  
  public f(g paramg, LayoutInflater paramLayoutInflater, boolean paramBoolean, int paramInt) {
    this.e = paramBoolean;
    this.f = paramLayoutInflater;
    this.b = paramg;
    this.g = paramInt;
    a();
  }
  
  void a() {
    i i = this.b.x();
    if (i != null) {
      ArrayList<i> arrayList = this.b.B();
      int j = arrayList.size();
      for (byte b = 0; b < j; b++) {
        if ((i)arrayList.get(b) == i) {
          this.c = b;
          return;
        } 
      } 
    } 
    this.c = -1;
  }
  
  public g b() {
    return this.b;
  }
  
  public i c(int paramInt) {
    ArrayList<i> arrayList;
    if (this.e) {
      arrayList = this.b.B();
    } else {
      arrayList = this.b.G();
    } 
    int i = this.c;
    int j = paramInt;
    if (i >= 0) {
      j = paramInt;
      if (paramInt >= i)
        j = paramInt + 1; 
    } 
    return arrayList.get(j);
  }
  
  public void d(boolean paramBoolean) {
    this.d = paramBoolean;
  }
  
  public int getCount() {
    ArrayList<i> arrayList;
    if (this.e) {
      arrayList = this.b.B();
    } else {
      arrayList = this.b.G();
    } 
    return (this.c < 0) ? arrayList.size() : (arrayList.size() - 1);
  }
  
  public long getItemId(int paramInt) {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    boolean bool;
    View view = paramView;
    if (paramView == null)
      view = this.f.inflate(this.g, paramViewGroup, false); 
    int i = c(paramInt).getGroupId();
    int j = paramInt - 1;
    if (j >= 0) {
      j = c(j).getGroupId();
    } else {
      j = i;
    } 
    ListMenuItemView listMenuItemView = (ListMenuItemView)view;
    if (this.b.H() && i != j) {
      bool = true;
    } else {
      bool = false;
    } 
    listMenuItemView.setGroupDividerEnabled(bool);
    n.a a = (n.a)view;
    if (this.d)
      listMenuItemView.setForceShowIcon(true); 
    a.e(c(paramInt), 0);
    return view;
  }
  
  public void notifyDataSetChanged() {
    a();
    super.notifyDataSetChanged();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/view/menu/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */