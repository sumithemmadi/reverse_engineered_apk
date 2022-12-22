package com.android.boom;

import android.content.Context;

public class a {
  private static Context a;
  
  public static Context a() {
    return a;
  }
  
  public static void b(Context paramContext) {
    if (a == null)
      a = paramContext.getApplicationContext(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/android/boom/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */