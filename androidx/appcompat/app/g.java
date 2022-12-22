package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.Map;

class g {
  private static Field a;
  
  private static boolean b;
  
  private static Class<?> c;
  
  private static boolean d;
  
  private static Field e;
  
  private static boolean f;
  
  private static Field g;
  
  private static boolean h;
  
  static void a(Resources paramResources) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 28)
      return; 
    if (i >= 24) {
      d(paramResources);
    } else if (i >= 23) {
      c(paramResources);
    } else if (i >= 21) {
      b(paramResources);
    } 
  }
  
  private static void b(Resources paramResources) {
    if (!b) {
      try {
        Field field1 = Resources.class.getDeclaredField("mDrawableCache");
        a = field1;
        field1.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {
        Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", noSuchFieldException);
      } 
      b = true;
    } 
    Field field = a;
    if (field != null) {
      IllegalAccessException illegalAccessException2 = null;
      try {
        Map map = (Map)field.get(paramResources);
      } catch (IllegalAccessException illegalAccessException1) {
        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", illegalAccessException1);
        illegalAccessException1 = illegalAccessException2;
      } 
      if (illegalAccessException1 != null)
        illegalAccessException1.clear(); 
    } 
  }
  
  private static void c(Resources paramResources) {
    if (!b) {
      try {
        Field field1 = Resources.class.getDeclaredField("mDrawableCache");
        a = field1;
        field1.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {
        Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", noSuchFieldException);
      } 
      b = true;
    } 
    Object object1 = null;
    Field field = a;
    Object object = object1;
    if (field != null)
      try {
        object = field.get(paramResources);
      } catch (IllegalAccessException illegalAccessException) {
        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", illegalAccessException);
        object = object1;
      }  
    if (object == null)
      return; 
    e(object);
  }
  
  private static void d(Resources paramResources) {
    if (!h) {
      try {
        Field field = Resources.class.getDeclaredField("mResourcesImpl");
        g = field;
        field.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {
        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", noSuchFieldException);
      } 
      h = true;
    } 
    Field field1 = g;
    if (field1 == null)
      return; 
    Field field2 = null;
    try {
      object = field1.get(paramResources);
    } catch (IllegalAccessException object) {
      Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", (Throwable)object);
      object = null;
    } 
    if (object == null)
      return; 
    if (!b) {
      try {
        field1 = object.getClass().getDeclaredField("mDrawableCache");
        a = field1;
        field1.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {
        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", noSuchFieldException);
      } 
      b = true;
    } 
    Field field3 = a;
    field1 = field2;
    if (field3 != null)
      try {
        Object object1 = field3.get(object);
      } catch (IllegalAccessException illegalAccessException) {
        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", illegalAccessException);
        field1 = field2;
      }  
    if (field1 != null)
      e(field1); 
  }
  
  private static void e(Object paramObject) {
    Class<?> clazz1;
    if (!d) {
      try {
        c = Class.forName("android.content.res.ThemedResourceCache");
      } catch (ClassNotFoundException classNotFoundException) {
        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", classNotFoundException);
      } 
      d = true;
    } 
    Class<?> clazz2 = c;
    if (clazz2 == null)
      return; 
    if (!f) {
      try {
        Field field1 = clazz2.getDeclaredField("mUnthemedEntries");
        e = field1;
        field1.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {
        Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", noSuchFieldException);
      } 
      f = true;
    } 
    Field field = e;
    if (field == null)
      return; 
    clazz2 = null;
    try {
      paramObject = field.get(paramObject);
    } catch (IllegalAccessException illegalAccessException) {
      Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", illegalAccessException);
      clazz1 = clazz2;
    } 
    if (clazz1 != null)
      clazz1.clear(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/app/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */