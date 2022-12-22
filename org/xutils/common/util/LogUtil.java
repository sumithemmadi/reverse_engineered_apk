package org.xutils.common.util;

import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import org.xutils.x;

public class LogUtil {
  public static String customTagPrefix = "x_log";
  
  private static String a() {
    StackTraceElement stackTraceElement = (new Throwable()).getStackTrace()[2];
    String str2 = stackTraceElement.getClassName();
    str2 = str2.substring(str2.lastIndexOf(".") + 1);
    String str1 = String.format(Locale.getDefault(), "%s.%s(L:%d)", new Object[] { str2, stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber()) });
    if (!TextUtils.isEmpty(customTagPrefix)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(customTagPrefix);
      stringBuilder.append(":");
      stringBuilder.append(str1);
      str1 = stringBuilder.toString();
    } 
    return str1;
  }
  
  public static void d(String paramString) {
    if (x.isDebug() && !TextUtils.isEmpty(paramString))
      Log.d(a(), paramString); 
  }
  
  public static void d(String paramString, Throwable paramThrowable) {
    if (x.isDebug() && !TextUtils.isEmpty(paramString))
      Log.d(a(), paramString, paramThrowable); 
  }
  
  public static void e(String paramString) {
    if (x.isDebug() && !TextUtils.isEmpty(paramString))
      Log.e(a(), paramString); 
  }
  
  public static void e(String paramString, Throwable paramThrowable) {
    if (x.isDebug() && !TextUtils.isEmpty(paramString))
      Log.e(a(), paramString, paramThrowable); 
  }
  
  public static void i(String paramString) {
    if (x.isDebug() && !TextUtils.isEmpty(paramString))
      Log.i(a(), paramString); 
  }
  
  public static void i(String paramString, Throwable paramThrowable) {
    if (x.isDebug() && !TextUtils.isEmpty(paramString))
      Log.i(a(), paramString, paramThrowable); 
  }
  
  public static void v(String paramString) {
    if (x.isDebug() && !TextUtils.isEmpty(paramString))
      Log.v(a(), paramString); 
  }
  
  public static void v(String paramString, Throwable paramThrowable) {
    if (x.isDebug() && !TextUtils.isEmpty(paramString))
      Log.v(a(), paramString, paramThrowable); 
  }
  
  public static void w(String paramString) {
    if (x.isDebug() && !TextUtils.isEmpty(paramString))
      Log.w(a(), paramString); 
  }
  
  public static void w(String paramString, Throwable paramThrowable) {
    if (x.isDebug() && !TextUtils.isEmpty(paramString))
      Log.w(a(), paramString, paramThrowable); 
  }
  
  public static void w(Throwable paramThrowable) {
    if (!x.isDebug())
      return; 
    Log.w(a(), paramThrowable);
  }
  
  public static void wtf(String paramString) {
    if (x.isDebug() && !TextUtils.isEmpty(paramString))
      Log.wtf(a(), paramString); 
  }
  
  public static void wtf(String paramString, Throwable paramThrowable) {
    if (x.isDebug() && !TextUtils.isEmpty(paramString))
      Log.wtf(a(), paramString, paramThrowable); 
  }
  
  public static void wtf(Throwable paramThrowable) {
    if (!x.isDebug())
      return; 
    Log.wtf(a(), paramThrowable);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/org/xutils/common/util/LogUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */