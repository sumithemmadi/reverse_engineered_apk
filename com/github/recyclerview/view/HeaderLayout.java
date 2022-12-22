package com.github.recyclerview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class HeaderLayout extends RelativeLayout {
  public HeaderLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramInt);
  }
  
  public void a(Context paramContext, int paramInt) {
    RelativeLayout.inflate(paramContext, paramInt, (ViewGroup)this);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/recyclerview/view/HeaderLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */