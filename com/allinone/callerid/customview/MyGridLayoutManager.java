package com.allinone.callerid.customview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;

public class MyGridLayoutManager extends GridLayoutManager {
  private boolean R = true;
  
  public MyGridLayoutManager(Context paramContext, int paramInt) {
    super(paramContext, paramInt);
  }
  
  public MyGridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  public void f3(boolean paramBoolean) {
    this.R = paramBoolean;
  }
  
  public boolean l() {
    boolean bool;
    if (this.R && super.l()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/MyGridLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */