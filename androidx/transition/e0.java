package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.Method;

class e0 {
  private static boolean a = true;
  
  private static Method b;
  
  private static boolean c;
  
  static int a(ViewGroup paramViewGroup, int paramInt) {
    if (Build.VERSION.SDK_INT >= 29)
      return paramViewGroup.getChildDrawingOrder(paramInt); 
    if (!c) {
      try {
        Class<int> clazz = int.class;
        Method method1 = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", new Class[] { clazz, clazz });
        b = method1;
        method1.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {}
      c = true;
    } 
    Method method = b;
    if (method != null)
      try {
        return ((Integer)method.invoke(paramViewGroup, new Object[] { Integer.valueOf(paramViewGroup.getChildCount()), Integer.valueOf(paramInt) })).intValue();
      } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {} 
    return paramInt;
  }
  
  static d0 b(ViewGroup paramViewGroup) {
    return (d0)((Build.VERSION.SDK_INT >= 18) ? new c0(paramViewGroup) : b0.g(paramViewGroup));
  }
  
  @SuppressLint({"NewApi"})
  private static void c(ViewGroup paramViewGroup, boolean paramBoolean) {
    if (a)
      try {
        paramViewGroup.suppressLayout(paramBoolean);
      } catch (NoSuchMethodError noSuchMethodError) {
        a = false;
      }  
  }
  
  static void d(ViewGroup paramViewGroup, boolean paramBoolean) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 29) {
      paramViewGroup.suppressLayout(paramBoolean);
    } else if (i >= 18) {
      c(paramViewGroup, paramBoolean);
    } else {
      f0.b(paramViewGroup, paramBoolean);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */