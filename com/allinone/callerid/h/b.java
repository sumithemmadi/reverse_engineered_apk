package com.allinone.callerid.h;

import android.content.Context;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.e1;
import com.allinone.callerid.util.i1;

public abstract class b {
  public boolean a;
  
  protected final Object b = new Object();
  
  protected ViewGroup a(Context paramContext, int paramInt) {
    try {
      ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper();
      this(paramContext, e1.a());
      ViewGroup viewGroup = (ViewGroup)((LayoutInflater)contextThemeWrapper.getSystemService("layout_inflater")).inflate(paramInt, null);
      if (i1.f0(paramContext).booleanValue() && Build.VERSION.SDK_INT >= 17)
        viewGroup.setLayoutDirection(1); 
      if ((c.A0()).N) {
        (c.A0()).N = false;
        return null;
      } 
      this.a = true;
      return viewGroup;
    } catch (Exception exception) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Exception:");
        stringBuilder.append(exception.getLocalizedMessage());
        d0.a("tony", stringBuilder.toString());
      } 
      exception.printStackTrace();
      return null;
    } 
  }
  
  protected ViewGroup b(Context paramContext, int paramInt, WindowManager.LayoutParams paramLayoutParams) {
    try {
      WindowManager windowManager = (WindowManager)paramContext.getApplicationContext().getSystemService("window");
      ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper();
      this(paramContext, e1.a());
      ViewGroup viewGroup = (ViewGroup)((LayoutInflater)contextThemeWrapper.getSystemService("layout_inflater")).inflate(paramInt, null);
      if (i1.f0(paramContext).booleanValue() && Build.VERSION.SDK_INT >= 17)
        viewGroup.setLayoutDirection(1); 
      windowManager.addView((View)viewGroup, (ViewGroup.LayoutParams)paramLayoutParams);
      this.a = true;
      return viewGroup;
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  protected void c(Context paramContext, ViewGroup paramViewGroup, WindowManager.LayoutParams paramLayoutParams) {
    try {
      ((WindowManager)paramContext.getApplicationContext().getSystemService("window")).addView((View)paramViewGroup, (ViewGroup.LayoutParams)paramLayoutParams);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */