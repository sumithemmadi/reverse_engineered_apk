package com.allinone.callerid.b.z;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public abstract class b<T> extends RecyclerView.Adapter {
  protected ArrayList<T> d = new ArrayList<T>();
  
  protected LayoutInflater e;
  
  public b(Context paramContext) {
    this.e = LayoutInflater.from(paramContext);
  }
  
  public b(Context paramContext, ArrayList<T> paramArrayList) {
    if (paramArrayList == null)
      this.d = new ArrayList<T>(); 
    this.e = LayoutInflater.from(paramContext);
  }
  
  public void A(ArrayList<T> paramArrayList, boolean paramBoolean) {
    if (paramArrayList != null) {
      if (paramBoolean)
        this.d.clear(); 
      this.d.addAll(paramArrayList);
    } 
  }
  
  public void B(T paramT, boolean paramBoolean) {
    if (paramT != null) {
      if (paramBoolean)
        this.d.clear(); 
      this.d.add(0, paramT);
    } 
  }
  
  public ArrayList<T> C() {
    return this.d;
  }
  
  public int d() {
    ArrayList<T> arrayList = this.d;
    return (arrayList != null) ? arrayList.size() : 0;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/z/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */