package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class k {
  private static Map<Class<?>, Integer> a = new HashMap<Class<?>, Integer>();
  
  private static Map<Class<?>, List<Constructor<? extends d>>> b = new HashMap<Class<?>, List<Constructor<? extends d>>>();
  
  private static d a(Constructor<? extends d> paramConstructor, Object paramObject) {
    try {
      return paramConstructor.newInstance(new Object[] { paramObject });
    } catch (IllegalAccessException illegalAccessException) {
      throw new RuntimeException(illegalAccessException);
    } catch (InstantiationException instantiationException) {
      throw new RuntimeException(instantiationException);
    } catch (InvocationTargetException invocationTargetException) {
      throw new RuntimeException(invocationTargetException);
    } 
  }
  
  private static Constructor<? extends d> b(Class<?> paramClass) {
    try {
      String str1;
      Package package_ = paramClass.getPackage();
      String str2 = paramClass.getCanonicalName();
      if (package_ != null) {
        str1 = package_.getName();
      } else {
        str1 = "";
      } 
      if (!str1.isEmpty())
        str2 = str2.substring(str1.length() + 1); 
      str2 = c(str2);
      if (str1.isEmpty()) {
        str1 = str2;
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append(str1);
        stringBuilder.append(".");
        stringBuilder.append(str2);
        str1 = stringBuilder.toString();
      } 
      Constructor<?> constructor = Class.forName(str1).getDeclaredConstructor(new Class[] { paramClass });
      if (!constructor.isAccessible())
        constructor.setAccessible(true); 
      return (Constructor)constructor;
    } catch (ClassNotFoundException classNotFoundException) {
      return null;
    } catch (NoSuchMethodException noSuchMethodException) {
      throw new RuntimeException(noSuchMethodException);
    } 
  }
  
  public static String c(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString.replace(".", "_"));
    stringBuilder.append("_LifecycleAdapter");
    return stringBuilder.toString();
  }
  
  private static int d(Class<?> paramClass) {
    Integer integer = a.get(paramClass);
    if (integer != null)
      return integer.intValue(); 
    int i = g(paramClass);
    a.put(paramClass, Integer.valueOf(i));
    return i;
  }
  
  private static boolean e(Class<?> paramClass) {
    boolean bool;
    if (paramClass != null && g.class.isAssignableFrom(paramClass)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  static f f(Object paramObject) {
    boolean bool1 = paramObject instanceof f;
    boolean bool2 = paramObject instanceof c;
    if (bool1 && bool2)
      return new FullLifecycleObserverAdapter((c)paramObject, (f)paramObject); 
    if (bool2)
      return new FullLifecycleObserverAdapter((c)paramObject, null); 
    if (bool1)
      return (f)paramObject; 
    Class<?> clazz = paramObject.getClass();
    if (d(clazz) == 2) {
      List<Constructor<? extends d>> list = b.get(clazz);
      int i = list.size();
      byte b = 0;
      if (i == 1)
        return new SingleGeneratedAdapterObserver(a(list.get(0), paramObject)); 
      d[] arrayOfD = new d[list.size()];
      while (b < list.size()) {
        arrayOfD[b] = a(list.get(b), paramObject);
        b++;
      } 
      return new CompositeGeneratedAdaptersObserver(arrayOfD);
    } 
    return new ReflectiveGenericLifecycleObserver(paramObject);
  }
  
  private static int g(Class<?> paramClass) {
    if (paramClass.getCanonicalName() == null)
      return 1; 
    Constructor<? extends d> constructor = b(paramClass);
    if (constructor != null) {
      b.put(paramClass, Collections.singletonList(constructor));
      return 2;
    } 
    if (a.a.d(paramClass))
      return 1; 
    Class<?> clazz = paramClass.getSuperclass();
    ArrayList<Constructor<? extends d>> arrayList = null;
    if (e(clazz)) {
      if (d(clazz) == 1)
        return 1; 
      arrayList = new ArrayList(b.get(clazz));
    } 
    Class[] arrayOfClass = paramClass.getInterfaces();
    int i = arrayOfClass.length;
    byte b = 0;
    while (b < i) {
      ArrayList<Constructor<? extends d>> arrayList1;
      Class<?> clazz1 = arrayOfClass[b];
      if (!e(clazz1)) {
        arrayList1 = arrayList;
      } else {
        if (d(clazz1) == 1)
          return 1; 
        arrayList1 = arrayList;
        if (arrayList == null)
          arrayList1 = new ArrayList(); 
        arrayList1.addAll(b.get(clazz1));
      } 
      b++;
      arrayList = arrayList1;
    } 
    if (arrayList != null) {
      b.put(paramClass, arrayList);
      return 2;
    } 
    return 1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/lifecycle/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */