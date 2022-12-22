package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class h implements f {
  private static Class<?> b;
  
  private static boolean c;
  
  private static Method d;
  
  private static boolean e;
  
  private static Method f;
  
  private static boolean g;
  
  private final View h;
  
  private h(View paramView) {
    this.h = paramView;
  }
  
  static f b(View paramView, ViewGroup paramViewGroup, Matrix paramMatrix) {
    c();
    Method method = d;
    if (method != null)
      try {
        return new h((View)method.invoke(null, new Object[] { paramView, paramViewGroup, paramMatrix }));
      } catch (IllegalAccessException illegalAccessException) {
      
      } catch (InvocationTargetException invocationTargetException) {
        throw new RuntimeException(invocationTargetException.getCause());
      }  
    return null;
  }
  
  private static void c() {
    if (!e) {
      try {
        d();
        Method method = b.getDeclaredMethod("addGhost", new Class[] { View.class, ViewGroup.class, Matrix.class });
        d = method;
        method.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("GhostViewApi21", "Failed to retrieve addGhost method", noSuchMethodException);
      } 
      e = true;
    } 
  }
  
  private static void d() {
    if (!c) {
      try {
        b = Class.forName("android.view.GhostView");
      } catch (ClassNotFoundException classNotFoundException) {
        Log.i("GhostViewApi21", "Failed to retrieve GhostView class", classNotFoundException);
      } 
      c = true;
    } 
  }
  
  private static void e() {
    if (!g) {
      try {
        d();
        Method method = b.getDeclaredMethod("removeGhost", new Class[] { View.class });
        f = method;
        method.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", noSuchMethodException);
      } 
      g = true;
    } 
  }
  
  static void f(View paramView) {
    e();
    Method method = f;
    if (method != null)
      try {
        method.invoke(null, new Object[] { paramView });
      } catch (IllegalAccessException illegalAccessException) {
      
      } catch (InvocationTargetException invocationTargetException) {
        throw new RuntimeException(invocationTargetException.getCause());
      }  
  }
  
  public void a(ViewGroup paramViewGroup, View paramView) {}
  
  public void setVisibility(int paramInt) {
    this.h.setVisibility(paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */