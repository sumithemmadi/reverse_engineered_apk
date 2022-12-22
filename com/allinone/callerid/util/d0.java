package com.allinone.callerid.util;

import android.content.Context;
import android.util.Log;

public class d0 {
  public static boolean a = true;
  
  public static void a(String paramString1, String paramString2) {
    Log.e(paramString1, paramString2);
  }
  
  public static void b(Context paramContext) {
    a = c(paramContext);
  }
  
  private static boolean c(Context paramContext) {
    boolean bool = false;
    try {
      int i = (paramContext.getApplicationInfo()).flags;
      if ((i & 0x2) != 0)
        bool = true; 
      return bool;
    } catch (Exception exception) {
      exception.printStackTrace();
      return false;
    } 
  }
  
  public static void d(String paramString1, String paramString2) {
    long l1 = paramString2.length();
    long l2 = 2048L;
    if (l1 >= l2) {
      String str = paramString2;
      if (l1 == l2) {
        Log.e(paramString1, paramString2);
        return;
      } 
      while (str.length() > 2048) {
        paramString2 = str.substring(0, 2048);
        str = str.replace(paramString2, "");
        Log.e(paramString1, paramString2);
      } 
      Log.e(paramString1, str);
      return;
    } 
    Log.e(paramString1, paramString2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/d0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */