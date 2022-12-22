package com.allinone.callerid.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

public class e {
  public static int a(Context paramContext) {
    NetworkInfo networkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    byte b = -1;
    if (networkInfo == null)
      return -1; 
    int i = networkInfo.getType();
    if (i == 0) {
      String str1;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("networkInfo.getExtraInfo()is");
      stringBuilder.append(networkInfo.getExtraInfo());
      Log.e("networkInfo.getExtraInf", stringBuilder.toString());
      String str2 = networkInfo.getExtraInfo();
      stringBuilder = null;
      if (str2 != null)
        str1 = str2.toLowerCase(); 
      if (str1 != null && str1.equals("cmnet")) {
        b = 3;
      } else {
        b = 2;
      } 
    } else if (i == 1) {
      b = 1;
    } 
    return b;
  }
  
  public static boolean b(Context paramContext) {
    ConnectivityManager connectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (connectivityManager == null)
      return false; 
    NetworkInfo networkInfo1 = connectivityManager.getNetworkInfo(0);
    NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
    if (networkInfo1 != null && networkInfo1.isConnected()) {
      if (d0.a)
        d0.a("TestNet", "当前为移动连接"); 
      q.b().c("is_connected_mobile");
      return true;
    } 
    if (networkInfo2 != null && networkInfo2.isConnected()) {
      if (d0.a)
        d0.a("TestNet", "当前为WIFI连接"); 
      q.b().c("is_connected_wifi");
      return true;
    } 
    return false;
  }
  
  public static boolean c(Context paramContext) {
    int i = a(paramContext);
    return (i != -1 && i != 1);
  }
  
  public static boolean d(Context paramContext) {
    ConnectivityManager connectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (connectivityManager == null)
      return false; 
    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
    return (networkInfo != null && networkInfo.isConnected());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */