package com.github.jdsjlzx.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import c.b.a.c;

public class CommonFooter extends RelativeLayout {
  public CommonFooter(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public CommonFooter(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  public void a(Context paramContext) {
    RelativeLayout.inflate(paramContext, c.layout_recyclerview_footer, (ViewGroup)this);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/view/CommonFooter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */