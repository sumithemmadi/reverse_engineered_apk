package com.allinone.callerid.util;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

public class a {
  public static List<Activity> a = new ArrayList<Activity>();
  
  public static void a(Activity paramActivity) {
    try {
      a.add(paramActivity);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void b() {
    try {
      for (Activity activity : a) {
        if (!activity.isFinishing())
          activity.finish(); 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void c(Activity paramActivity) {
    try {
      a.remove(paramActivity);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */