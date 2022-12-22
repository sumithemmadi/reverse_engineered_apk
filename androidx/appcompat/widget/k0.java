package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import b.h.k.w;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class k0 {
  private static Method a;
  
  static {
    if (Build.VERSION.SDK_INT >= 18)
      try {
        Method method = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[] { Rect.class, Rect.class });
        a = method;
        if (!method.isAccessible())
          a.setAccessible(true); 
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
      }  
  }
  
  public static void a(View paramView, Rect paramRect1, Rect paramRect2) {
    Method method = a;
    if (method != null)
      try {
        method.invoke(paramView, new Object[] { paramRect1, paramRect2 });
      } catch (Exception exception) {
        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", exception);
      }  
  }
  
  public static boolean b(View paramView) {
    int i = w.C(paramView);
    boolean bool = true;
    if (i != 1)
      bool = false; 
    return bool;
  }
  
  public static void c(View paramView) {
    if (Build.VERSION.SDK_INT >= 16)
      try {
        Method method = paramView.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
        if (!method.isAccessible())
          method.setAccessible(true); 
        method.invoke(paramView, new Object[0]);
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
      } catch (InvocationTargetException invocationTargetException) {
        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", invocationTargetException);
      } catch (IllegalAccessException illegalAccessException) {
        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", illegalAccessException);
      }  
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/k0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */