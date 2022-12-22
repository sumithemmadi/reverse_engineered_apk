package com.google.android.gms.common.stats;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import java.util.List;

public class c {
  public static String a(PowerManager.WakeLock paramWakeLock, String paramString) {
    String str2 = String.valueOf(String.valueOf(Process.myPid() << 32L | System.identityHashCode(paramWakeLock)));
    String str1 = paramString;
    if (TextUtils.isEmpty(paramString))
      str1 = ""; 
    str1 = String.valueOf(str1);
    return (str1.length() != 0) ? str2.concat(str1) : new String(str2);
  }
  
  static String b(String paramString) {
    String str = paramString;
    if ("com.google.android.gms".equals(paramString))
      str = null; 
    return str;
  }
  
  static List<String> c(List<String> paramList) {
    List<String> list = paramList;
    if (paramList != null) {
      list = paramList;
      if (paramList.size() == 1) {
        list = paramList;
        if ("com.google.android.gms".equals(paramList.get(0)))
          list = null; 
      } 
    } 
    return list;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/stats/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */