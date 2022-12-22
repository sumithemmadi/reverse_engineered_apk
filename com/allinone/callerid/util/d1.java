package com.allinone.callerid.util;

import android.content.Context;
import android.util.TypedValue;
import androidx.core.content.a;

public class d1 {
  public static int a(Context paramContext, int paramInt1, int paramInt2) {
    try {
      TypedValue typedValue = new TypedValue();
      this();
      paramContext.getTheme().resolveAttribute(paramInt1, typedValue, true);
      return typedValue.data;
    } catch (Exception exception) {
      exception.printStackTrace();
      return a.d(paramContext, paramInt2);
    } 
  }
  
  public static int b(Context paramContext, int paramInt1, int paramInt2) {
    try {
      TypedValue typedValue = new TypedValue();
      this();
      paramContext.getTheme().resolveAttribute(paramInt1, typedValue, true);
      return typedValue.resourceId;
    } catch (Exception exception) {
      exception.printStackTrace();
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Exception: ");
        stringBuilder.append(exception.getMessage());
        d0.a("wbb", stringBuilder.toString());
      } 
      return paramInt2;
    } 
  }
  
  public static void c(Context paramContext, int paramInt) {
    if (paramContext == null)
      return; 
    paramContext.getApplicationContext().setTheme(paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/d1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */