package com.allinone.callerid.d.a.e;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public abstract class a<T> extends RecyclerView.Adapter {
  protected ArrayList<T> d = new ArrayList<T>();
  
  protected LayoutInflater e;
  
  public a(Context paramContext) {
    this.e = LayoutInflater.from(paramContext);
  }
  
  public void A(ArrayList<T> paramArrayList, boolean paramBoolean) {
    if (paramArrayList != null) {
      if (paramBoolean)
        this.d.clear(); 
      this.d.addAll(paramArrayList);
    } 
  }
  
  public ArrayList<T> B() {
    return this.d;
  }
  
  public int d() {
    ArrayList<T> arrayList = this.d;
    return (arrayList != null) ? arrayList.size() : 0;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/a/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */