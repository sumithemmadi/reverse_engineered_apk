package b.h.i;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class b {
  private static Method a;
  
  private static Method b;
  
  static {
    int i = Build.VERSION.SDK_INT;
    if (i < 21) {
      try {
        Class<?> clazz = Class.forName("libcore.icu.ICU");
        a = clazz.getMethod("getScript", new Class[] { String.class });
        b = clazz.getMethod("addLikelySubtags", new Class[] { String.class });
      } catch (Exception exception) {
        a = null;
        b = null;
        Log.w("ICUCompat", exception);
      } 
    } else if (i < 24) {
      try {
        b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[] { Locale.class });
      } catch (Exception exception) {
        throw new IllegalStateException(exception);
      } 
    } 
  }
  
  private static String a(Locale paramLocale) {
    String str = paramLocale.toString();
    try {
      Method method = b;
      if (method != null)
        return (String)method.invoke(null, new Object[] { str }); 
    } catch (IllegalAccessException illegalAccessException) {
      Log.w("ICUCompat", illegalAccessException);
    } catch (InvocationTargetException invocationTargetException) {
      Log.w("ICUCompat", invocationTargetException);
    } 
    return str;
  }
  
  private static String b(String paramString) {
    try {
      Method method = a;
      if (method != null)
        return (String)method.invoke(null, new Object[] { paramString }); 
    } catch (IllegalAccessException illegalAccessException) {
      Log.w("ICUCompat", illegalAccessException);
    } catch (InvocationTargetException invocationTargetException) {
      Log.w("ICUCompat", invocationTargetException);
    } 
    return null;
  }
  
  public static String c(Locale paramLocale) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 24)
      return ULocale.addLikelySubtags(ULocale.forLocale(paramLocale)).getScript(); 
    if (i >= 21) {
      try {
        return ((Locale)b.invoke(null, new Object[] { paramLocale })).getScript();
      } catch (InvocationTargetException invocationTargetException) {
        Log.w("ICUCompat", invocationTargetException);
      } catch (IllegalAccessException illegalAccessException) {
        Log.w("ICUCompat", illegalAccessException);
      } 
      return paramLocale.getScript();
    } 
    String str = a(paramLocale);
    return (str != null) ? b(str) : null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/i/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */