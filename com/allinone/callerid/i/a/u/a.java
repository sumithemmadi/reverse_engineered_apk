package com.allinone.callerid.i.a.u;

import android.content.Context;
import androidx.core.content.c;
import com.allinone.callerid.main.EZCallApplication;

public class a {
  static {
  
  }
  
  public static boolean a() {
    boolean bool;
    if (c.b((Context)EZCallApplication.c(), "android.permission.RECORD_AUDIO") == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/u/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */