package com.allinone.callerid.util;

import android.content.Context;

public class j {
  public static int a(Context paramContext, float paramFloat) {
    return (int)(paramFloat * (paramContext.getResources().getDisplayMetrics()).density + 0.5F);
  }
  
  public static int b(Context paramContext, float paramFloat) {
    return (int)(paramFloat * (paramContext.getResources().getDisplayMetrics()).scaledDensity + 0.5F);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */