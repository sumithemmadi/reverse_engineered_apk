package com.github.clans.fab;

import android.content.Context;
import android.os.Build;

final class a {
  static int a(Context paramContext, float paramFloat) {
    return Math.round(paramFloat * (paramContext.getResources().getDisplayMetrics()).density);
  }
  
  static boolean b() {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 16) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  static boolean c() {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 21) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/clans/fab/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */