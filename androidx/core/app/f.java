package androidx.core.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class f {
  public static IBinder a(Bundle paramBundle, String paramString) {
    return (Build.VERSION.SDK_INT >= 18) ? paramBundle.getBinder(paramString) : a.a(paramBundle, paramString);
  }
  
  public static void b(Bundle paramBundle, String paramString, IBinder paramIBinder) {
    if (Build.VERSION.SDK_INT >= 18) {
      paramBundle.putBinder(paramString, paramIBinder);
    } else {
      a.b(paramBundle, paramString, paramIBinder);
    } 
  }
  
  static class a {
    private static Method a;
    
    private static boolean b;
    
    private static Method c;
    
    private static boolean d;
    
    public static IBinder a(Bundle param1Bundle, String param1String) {
      if (!b) {
        try {
          Method method1 = Bundle.class.getMethod("getIBinder", new Class[] { String.class });
          a = method1;
          method1.setAccessible(true);
        } catch (NoSuchMethodException noSuchMethodException) {
          Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", noSuchMethodException);
        } 
        b = true;
      } 
      Method method = a;
      if (method != null) {
        try {
          return (IBinder)method.invoke(param1Bundle, new Object[] { param1String });
        } catch (InvocationTargetException invocationTargetException) {
        
        } catch (IllegalAccessException illegalAccessException) {
        
        } catch (IllegalArgumentException illegalArgumentException) {}
        Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", illegalArgumentException);
        a = null;
      } 
      return null;
    }
    
    public static void b(Bundle param1Bundle, String param1String, IBinder param1IBinder) {
      if (!d) {
        try {
          Method method1 = Bundle.class.getMethod("putIBinder", new Class[] { String.class, IBinder.class });
          c = method1;
          method1.setAccessible(true);
        } catch (NoSuchMethodException noSuchMethodException) {
          Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", noSuchMethodException);
        } 
        d = true;
      } 
      Method method = c;
      if (method != null)
        try {
          method.invoke(param1Bundle, new Object[] { param1String, param1IBinder });
        } catch (InvocationTargetException invocationTargetException) {
          Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", invocationTargetException);
          c = null;
        } catch (IllegalAccessException illegalAccessException) {
        
        } catch (IllegalArgumentException illegalArgumentException) {} 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/app/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */