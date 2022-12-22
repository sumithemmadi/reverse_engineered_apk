package com.allinone.callerid.util;

import android.graphics.Typeface;
import com.allinone.callerid.main.EZCallApplication;

public class g1 {
  public static Typeface a() {
    try {
      Typeface typeface = Typeface.createFromAsset(EZCallApplication.c().getAssets(), "Roboto-Medium.ttf");
    } catch (Exception exception) {
      exception.printStackTrace();
      exception = null;
    } 
    return (Typeface)exception;
  }
  
  public static Typeface b() {
    try {
      Typeface typeface = Typeface.createFromAsset(EZCallApplication.c().getAssets(), "Roboto-Regular.ttf");
    } catch (Exception exception) {
      exception.printStackTrace();
      exception = null;
    } 
    return (Typeface)exception;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/g1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */