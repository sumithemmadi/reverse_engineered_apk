package com.allinone.callerid.customview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MyLinearLayoutManager extends LinearLayoutManager {
  public MyLinearLayoutManager(Context paramContext) {
    super(paramContext);
  }
  
  public MyLinearLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  public void X0(RecyclerView.u paramu, RecyclerView.y paramy) {
    try {
      super.X0(paramu, paramy);
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
    
    } finally {
      paramu = null;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/MyLinearLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */